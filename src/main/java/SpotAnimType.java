import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MUDLUUBC")
public class SpotAnimType {

    @OriginalMember(owner = "MUDLUUBC", name = "a", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "MUDLUUBC", name = "g", descriptor = "I")
    public int anim = -1;

    @OriginalMember(owner = "MUDLUUBC", name = "i", descriptor = "[I")
    public int[] recol_s = new int[6];

    @OriginalMember(owner = "MUDLUUBC", name = "j", descriptor = "[I")
    public int[] recol_d = new int[6];

    @OriginalMember(owner = "MUDLUUBC", name = "k", descriptor = "I")
    public int resizeh = 128;

    @OriginalMember(owner = "MUDLUUBC", name = "l", descriptor = "I")
    public int resizev = 128;

    @OriginalMember(owner = "MUDLUUBC", name = "b", descriptor = "Z")
    private static boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "MUDLUUBC", name = "p", descriptor = "LGCPOSBWX;")
    public static LruCache modelCache = new LruCache(false, 30);

    @OriginalMember(owner = "MUDLUUBC", name = "n", descriptor = "I")
    public int ambient;

    @OriginalMember(owner = "MUDLUUBC", name = "m", descriptor = "I")
    public int angle;

    @OriginalMember(owner = "MUDLUUBC", name = "o", descriptor = "I")
    public int contrast;

    @OriginalMember(owner = "MUDLUUBC", name = "c", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "MUDLUUBC", name = "f", descriptor = "I")
    public int model;

    @OriginalMember(owner = "MUDLUUBC", name = "e", descriptor = "I")
    public int type;

    @OriginalMember(owner = "MUDLUUBC", name = "h", descriptor = "LLKGEGIEW;")
    public SeqType seq;

    @OriginalMember(owner = "MUDLUUBC", name = "d", descriptor = "[LMUDLUUBC;")
    public static SpotAnimType[] instances;

    @OriginalMember(owner = "MUDLUUBC", name = "a", descriptor = "(ILXTGLDHGX;)V")
    public static void unpack(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.read("spotanim.dat", null), 891);
        if (arg0 != 0) {
            _flowObfuscator2 = !_flowObfuscator2;
        }
        count = var2.g2();
        if (instances == null) {
            instances = new SpotAnimType[count];
        }
        for (int var3 = 0; var3 < count; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new SpotAnimType();
            }
            instances[var3].type = var3;
            instances[var3].decodeClient(true, var2);
        }
    }

    @OriginalMember(owner = "MUDLUUBC", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public void decodeClient(boolean arg0, Packet arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.g1();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.model = arg1.g2();
                } else if (var3 == 2) {
                    this.anim = arg1.g2();
                    if (SeqType.instances != null) {
                        this.seq = SeqType.instances[this.anim];
                    }
                } else if (var3 == 4) {
                    this.resizeh = arg1.g2();
                } else if (var3 == 5) {
                    this.resizev = arg1.g2();
                } else if (var3 == 6) {
                    this.angle = arg1.g2();
                } else if (var3 == 7) {
                    this.ambient = arg1.g1();
                } else if (var3 == 8) {
                    this.contrast = arg1.g1();
                } else if (var3 >= 40 && var3 < 50) {
                    this.recol_s[var3 - 40] = arg1.g2();
                } else if (var3 >= 50 && var3 < 60) {
                    this.recol_d[var3 - 50] = arg1.g2();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "MUDLUUBC", name = "a", descriptor = "()LZKARKDQW;")
    public Model getModel() {
        Model var1 = (Model) modelCache.get((long) this.type);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.tryGet(this._flowObfuscator1, this.model);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.recol_s[0] != 0) {
                var2.recolour(this.recol_s[var3], this.recol_d[var3]);
            }
        }
        modelCache.put(var2, (long) this.type, (byte) 2);
        return var2;
    }
}
