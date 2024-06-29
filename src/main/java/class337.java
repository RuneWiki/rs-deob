import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class class337 extends class431 {

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "[Leu;")
    public class337[] field5015;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "Z")
    public boolean field5019;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "Lhn;")
    public static class509 field5008 = new class509(10, 7);

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "Lca;")
    public class201 field5011;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "Law;")
    public class55 field5007;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BILhp;)V")
    public void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -21 % ((82 - arg0) / 40);
        field5009++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public void method174(byte arg0) {
        if (arg0 > 1) {
            field5020++;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)[[I")
    public int[][] method673(int arg0, int arg1) {
        field5016++;
        int var3 = -47 % ((-arg1 - 41) / 49);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)I")
    public int method1123(byte arg0) {
        field5013++;
        if (arg0 != -101) {
            this.field5012 = 36;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public void method1124(int arg0) {
        if (arg0 != 17165) {
            this.method179(25, (byte) -6);
        }
        field5017++;
        if (this.field5019) {
            this.field5007.method509(-6730);
            this.field5007 = null;
        } else {
            this.field5011.method1409((byte) 87);
            this.field5011 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
    public void method1121(int arg0, int arg1, int arg2) {
        field5004++;
        int var4 = this.field5012 == 255 ? arg0 : this.field5012;
        if (arg1 != 7) {
            this.method2123(-110, -71, 98);
        }
        if (this.field5019) {
            this.field5007 = new class55(var4, arg0, arg2);
        } else {
            this.field5011 = new class201(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "(I)I")
    public int method2122(int arg0) {
        if (arg0 != 0) {
            this.field5007 = null;
        }
        field5014++;
        return -1;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(III)[[I")
    public final int[][] method2123(int arg0, int arg1, int arg2) {
        field5005++;
        if (arg2 > -49) {
            return null;
        } else if (this.field5015[arg1].field5019) {
            int[] var4 = this.field5015[arg1].method179(arg0, (byte) -11);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5015[arg1].method673(arg0, -128);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)[I")
    public int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            this.method673(33, -97);
        }
        field5018++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(III)[I")
    public final int[] method2124(int arg0, int arg1, int arg2) {
        field5006++;
        if (arg2 >= -39) {
            return null;
        } else if (this.field5015[arg1].field5019) {
            return this.field5015[arg1].method179(arg0, (byte) -11);
        } else {
            return this.field5015[arg1].method673(arg0, -105)[0];
        }
    }

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "(I)V")
    public static void method2125(int arg0) {
        if (arg0 == 1) {
            field5008 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(III)Z")
    public static final boolean method2126(int arg0, int arg1, int arg2) {
        field5010++;
        if (arg0 == 2) {
            return class266.method1773(arg2, (byte) -128, arg1) | (arg1 & 0x70000) != 0 || class281.method1830(arg2, -16385, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(IZ)V")
    public class337(int arg0, boolean arg1) {
        this.field5015 = new class337[arg0];
        this.field5019 = arg1;
    }
}
