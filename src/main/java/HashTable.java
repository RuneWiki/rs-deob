import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class HashTable {

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "[Lg;")
    private Linkable[] field66;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Lv;")
    public static JagString field64 = class1.method2(255, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lv;")
    public static JagString field58 = class1.method2(255, "Scimitar Shop");

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Lv;")
    public static JagString field61 = class1.method2(255, "Requesting");

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "Lv;")
    public static JagString field62 = class1.method2(255, "details)3dat");

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "Lv;")
    public static JagString field69 = class1.method2(255, "underlay)3dat");

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Lv;")
    public static JagString field70 = class1.method2(255, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Lma;")
    public static GameShell field68 = null;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "J")
    private long field65;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "Lg;")
    private Linkable field63;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)Lg;", line = 4)
    public final Linkable method29(byte arg0) {
        if (this.field63 == null) {
            return null;
        }
        int var2 = -45 % ((59 - arg0) / 33);
        Linkable var3 = this.field66[(int) ((long) (this.field60 - 1) & this.field65)];
        while (this.field63 != var3) {
            if (this.field63.key == this.field65) {
                Linkable var4 = this.field63;
                this.field63 = this.field63.next;
                return var4;
            }
            this.field63 = this.field63.next;
        }
        this.field63 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)B", line = 38)
    public static final byte method30(int arg0) {
        if (arg0 != 0) {
            field59 = -90;
        }
        return WorldmapOverlay.field378 == null ? 0 : WorldmapOverlay.field378[JavaKeyboard.field12];
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILo;II)Z", line = 54)
    public static final boolean method31(int arg0, Js5Index arg1, int arg2, int arg3) {
        byte[] var4 = arg1.method133(arg0, -112, arg3);
        if (var4 == null) {
            return false;
        }
        if (arg2 != -1) {
            field61 = null;
        }
        Worldmap.method160(26, var4);
        return true;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 81)
    public static final int method32(KeyEvent arg0, int arg1) {
        if (arg1 != 23571) {
            method30(-70);
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IJ)Lg;", line = 110)
    public final Linkable get(int arg0, long arg1) {
        this.field65 = arg1;
        Linkable var4 = this.field66[(int) (arg1 & (long) (this.field60 + arg0))];
        for (this.field63 = var4.next; this.field63 != var4; this.field63 = this.field63.next) {
            if (this.field63.key == arg1) {
                Linkable var5 = this.field63;
                this.field63 = this.field63.next;
                return var5;
            }
        }
        this.field63 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IJLg;)V", line = 148)
    public final void put(int arg0, long arg1, Linkable arg2) {
        if (arg2.prev != null) {
            arg2.unlink((byte) -106);
        }
        Linkable var5 = this.field66[(int) (arg1 & (long) (this.field60 - 1))];
        if (arg0 != -13735) {
            this.put(84, 123L, null);
        }
        arg2.prev = var5.prev;
        arg2.key = arg1;
        arg2.next = var5;
        arg2.prev.next = arg2;
        arg2.next.prev = arg2;
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(I)V", line = 201)
    public HashTable(int arg0) {
        this.field66 = new Linkable[arg0];
        this.field60 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            Linkable var3 = this.field66[var2] = new Linkable();
            var3.next = var3;
            var3.prev = var3;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)V", line = 233)
    public static void method35(int arg0) {
        field61 = null;
        int var1 = 6 / ((32 - arg0) / 62);
        field69 = null;
        field58 = null;
        field62 = null;
        field70 = null;
        field64 = null;
    }
}
