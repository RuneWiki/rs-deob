import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class220 extends class261 {

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    private int field3711 = 1024;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    private int field3714 = 2048;

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    private int field3717 = 3072;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "[Z")
    public static boolean[] field3713 = new boolean[200];

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "Lve;")
    private static class255 field3718 = class87.method607(30, "green:");

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "Lve;")
    public static class255 field3705 = field3718;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "Lve;")
    public static class255 field3702 = field3718;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "Lrg;")
    public static class88 field3707;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "[I")
    public static int[] field3716;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "[[[B")
    public static byte[][][] field3704;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIBI)V", line = 8)
    public static final void method1547(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 23) {
            method1549(91, (short[]) null, (class255[]) null);
        }
        field3708++;
        if (arg1 == arg5) {
            class249.method1718(arg2, arg0, arg4 ^ 0x6B, arg3, arg5);
        } else if (class125.field2082 <= arg3 - arg5 && arg3 + arg5 <= class30.field473 && class261.field4427 <= arg0 - arg1 && class11.field156 >= arg0 + arg1) {
            class104.method801((byte) -44, arg0, arg1, arg5, arg3, arg2);
        } else {
            class305.method2117(arg2, arg5, arg0, arg3, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(B)V", line = 34)
    public final void method111(byte arg0) {
        if (arg0 != -57) {
            this.method111((byte) -68);
        }
        field3709++;
        this.field3714 = this.field3717 - this.field3711;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 48)
    public class220() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lpb;BI)V", line = 53)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 > -115) {
            this.method13(true, 13);
        }
        if (arg2 == 0) {
            this.field3711 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field3717 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field4434 = arg0.method481(0) == 1;
        }
        field3706++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)[I", line = 104)
    public final int[] method21(byte arg0, int arg1) {
        field3712++;
        int var3 = 88 / ((-arg0 - 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var5 = this.method1822(0, 11, arg1);
            for (int var6 = 0; var6 < class92.field1576; var6++) {
                var4[var6] = (var5[var6] * this.field3714 >> 12) + this.field3711;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "(B)V", line = 139)
    public static void method1548(byte arg0) {
        field3702 = null;
        field3707 = null;
        field3705 = null;
        field3704 = (byte[][][]) null;
        if (arg0 <= -48) {
            field3716 = null;
            field3718 = null;
            field3713 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[S[Lve;)V", line = 159)
    public static final void method1549(int arg0, short[] arg1, class255[] arg2) {
        class166.method1211(arg1, arg2, arg2.length - 1, arg0, 6);
        field3703++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)[[I", line = 170)
    public final int[][] method13(boolean arg0, int arg1) {
        int[][] var3 = this.field4418.method35(arg1, 91);
        if (!arg0) {
            this.field3714 = 106;
        }
        if (this.field4418.field94) {
            int[][] var4 = this.method1819(-124, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class92.field1576; var11++) {
                var7[var11] = this.field3711 + (var10[var11] * this.field3714 >> 12);
                var8[var11] = this.field3711 + (var5[var11] * this.field3714 >> 12);
                var9[var11] = (var6[var11] * this.field3714 >> 12) + this.field3711;
            }
        }
        field3710++;
        return var3;
    }
}
