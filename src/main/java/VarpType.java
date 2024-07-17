import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VGXVBFVC")
public class VarpType {

    @OriginalMember(owner = "VGXVBFVC", name = "b", descriptor = "I")
    private int _flowObfuscator2 = -32357;

    @OriginalMember(owner = "VGXVBFVC", name = "j", descriptor = "Z")
    public boolean field1494 = false;

    @OriginalMember(owner = "VGXVBFVC", name = "k", descriptor = "Z")
    public boolean field1495 = true;

    @OriginalMember(owner = "VGXVBFVC", name = "m", descriptor = "Z")
    public boolean field1497 = false;

    @OriginalMember(owner = "VGXVBFVC", name = "p", descriptor = "Z")
    public boolean field1500 = false;

    @OriginalMember(owner = "VGXVBFVC", name = "q", descriptor = "I")
    public int field1501 = -1;

    @OriginalMember(owner = "VGXVBFVC", name = "a", descriptor = "Z")
    private static boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "VGXVBFVC", name = "l", descriptor = "I")
    public int clientcode;

    @OriginalMember(owner = "VGXVBFVC", name = "c", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "VGXVBFVC", name = "e", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "VGXVBFVC", name = "h", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "VGXVBFVC", name = "i", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "VGXVBFVC", name = "n", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "VGXVBFVC", name = "o", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "VGXVBFVC", name = "g", descriptor = "Ljava/lang/String;")
    public String field1491;

    @OriginalMember(owner = "VGXVBFVC", name = "f", descriptor = "[I")
    public static int[] field1490;

    @OriginalMember(owner = "VGXVBFVC", name = "d", descriptor = "[LVGXVBFVC;")
    public static VarpType[] instances;

    @OriginalMember(owner = "VGXVBFVC", name = "a", descriptor = "(ILXTGLDHGX;)V")
    public static void unpack(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.read("varp.dat", null), 891);
        field1489 = 0;
        count = var2.g2();
        if (instances == null) {
            instances = new VarpType[count];
        }
        if (field1490 == null) {
            field1490 = new int[count];
        }
        for (int var3 = 0; var3 < count; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new VarpType();
            }
            instances[var3].decodeClient(var2, false, var3);
        }
        if (arg0 != 0) {
            _flowObfuscator1 = !_flowObfuscator1;
        }
        if (var2.data.length != var2.pos) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "VGXVBFVC", name = "a", descriptor = "(LMBMGIXGO;ZI)V")
    public void decodeClient(Packet arg0, boolean arg1, int arg2) {
        if (arg1) {
            this._flowObfuscator2 = -91;
        }
        while (true) {
            int var4 = arg0.g1();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1492 = arg0.g1();
            } else if (var4 == 2) {
                this.field1493 = arg0.g1();
            } else if (var4 == 3) {
                this.field1494 = true;
                field1490[field1489++] = arg2;
            } else if (var4 == 4) {
                this.field1495 = false;
            } else if (var4 == 5) {
                this.clientcode = arg0.g2();
            } else if (var4 == 6) {
                this.field1497 = true;
            } else if (var4 == 7) {
                this.field1498 = arg0.g4();
            } else if (var4 == 8) {
                this.field1499 = 1;
                this.field1500 = true;
            } else if (var4 == 10) {
                this.field1491 = arg0.gjstr();
            } else if (var4 == 11) {
                this.field1500 = true;
            } else if (var4 == 12) {
                this.field1501 = arg0.g4();
            } else if (var4 == 13) {
                this.field1499 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
