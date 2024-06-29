import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class IntHashTable {

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "[I")
    private int[] tree;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "I")
    public static volatile int field49 = -1;

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "Lv;")
    public static JagString field52 = class1.method2(255, "Potters Wheel");

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Lv;")
    public static JagString field53 = class1.method2(255, "Spice Shop");

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "Lv;")
    public static JagString field51 = class1.method2(255, "map");

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Lv;")
    public static JagString field50 = class1.method2(255, "Loading");

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "Li;")
    public static GZip field55 = new GZip();

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "Lv;")
    public static JagString field56 = class1.method2(255, "Farming patch");

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "Lv;")
    public static JagString field57 = class1.method2(255, "mapscene");

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)[Lf;", line = 25)
    public static final Pix8[] method25(int arg0) {
        Pix8[] var1 = new Pix8[ByteArray.field127];
        if (arg0 != 1) {
            method28(-71);
        }
        for (int var2 = 0; var2 < ByteArray.field127; var2++) {
            Pix8 var3 = var1[var2] = new Pix8();
            var3.field75 = GameShell.field204;
            var3.field76 = StringNode.field88;
            var3.field71 = BZip2State.field506[var2];
            var3.field77 = JagException.field105[var2];
            var3.field78 = JavaKeyboard.field19[var2];
            var3.field72 = class1.field4[var2];
            var3.field73 = Worldmap.field365;
            var3.field74 = JavaMouse.field385[var2];
        }
        MonotonicTime.method77((byte) 103);
        return var1;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(II)I", line = 59)
    public final int get(int arg0, int arg1) {
        if (arg1 != -7553) {
            method27(-41);
        }
        int var3 = this.tree.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.tree[var4];
            if (arg0 == var5) {
                return this.tree[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "([I)V", line = 108)
    public IntHashTable(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.tree = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.tree[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.tree[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.tree[var5 + var5] = arg0[var4];
            this.tree[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(I)V", line = 144)
    public static void method27(int arg0) {
        field53 = null;
        field57 = null;
        field51 = null;
        field50 = null;
        field56 = null;
        field55 = null;
        if (arg0 == 14572) {
            field52 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "(I)I", line = 172)
    public static final int method28(int arg0) {
        if (arg0 > -80) {
            field52 = null;
        }
        return StringNode.field82 == null ? 0 : StringNode.field82[JavaKeyboard.field12];
    }
}
