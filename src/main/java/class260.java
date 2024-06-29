import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class260 extends class188 {

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    private int field4102;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    private int field4118;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    private int field4121;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[[I")
    public static int[][] field4111 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field4101 = 0;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4110 = null;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "Z")
    public static boolean field4116 = false;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z", line = 4)
    public final boolean method1831(int arg0, int arg1, int arg2) {
        field4107++;
        if (arg0 != 5) {
            method1837(27, 71, 29, 6, (class294) null, (class294) null, -118, 41, -14, -38, 17L);
        }
        return arg1 >= this.field4113 && arg1 <= this.field4106 && arg2 >= this.field4115 && arg2 <= this.field4109;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 19)
    public static void method1832(int arg0) {
        field4110 = null;
        if (arg0 != -8351) {
            method1835(84, -81, -67, 99, false);
        }
        field4111 = (int[][]) null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIBI)V", line = 30)
    public final void method1833(int[] arg0, int arg1, byte arg2, int arg3) {
        arg0[1] = this.field4104 - (this.field4113 - arg3);
        arg0[0] = this.field4118;
        field4112++;
        if (arg2 < 87) {
            this.field4105 = -52;
        }
        arg0[2] = arg1 + this.field4105 - this.field4115;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 44)
    public static final void method1834(int arg0) {
        field4117++;
        class347.field5503.method378(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIZ)V", line = 53)
    public static final void method1835(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4103++;
        if (arg4) {
            method1835(-50, 48, -69, -64, false);
        }
        class279 var5 = class147.method1085(arg1, -19443, 8);
        var5.method1989(0);
        var5.field4397 = arg3;
        var5.field4394 = arg0;
        var5.field4388 = arg2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBII)Z", line = 76)
    public final boolean method1836(int arg0, byte arg1, int arg2, int arg3) {
        field4120++;
        if (arg1 < 90) {
            this.method1833((int[]) null, -50, (byte) -55, -51);
        }
        return this.field4118 == arg0 && this.field4104 <= arg2 && arg2 <= this.field4102 && this.field4105 <= arg3 && this.field4108 >= arg3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIILio;Lio;IIIIJ)V", line = 103)
    public static final void method1837(int arg0, int arg1, int arg2, int arg3, class294 arg4, class294 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class54 var12 = new class54();
        var12.field627 = arg10;
        var12.field624 = arg1 * 128 + 64;
        var12.field622 = arg2 * 128 + 64;
        var12.field625 = arg3;
        var12.field630 = arg4;
        var12.field632 = arg5;
        var12.field620 = arg6;
        var12.field631 = arg7;
        var12.field615 = arg8;
        var12.field634 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class194.field2947[var13][arg1][arg2] == null) {
                class194.field2947[var13][arg1][arg2] = new class196(var13, arg1, arg2);
            }
        }
        class194.field2947[arg0][arg1][arg2].field2994 = var12;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZI)Z", line = 134)
    public final boolean method1838(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field4102 = 87;
        }
        field4119++;
        return this.field4104 <= arg2 && this.field4102 >= arg2 && this.field4105 <= arg0 && this.field4108 >= arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZ[I)V", line = 155)
    public final void method1839(int arg0, int arg1, boolean arg2, int[] arg3) {
        arg3[0] = this.field4121;
        field4114++;
        if (arg2) {
            this.method1831(-128, -80, 127);
        }
        arg3[1] = arg0 - (this.field4104 - this.field4113);
        arg3[2] = arg1 + this.field4115 - this.field4105;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 172)
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4109 = arg9;
        this.field4115 = arg7;
        this.field4105 = arg3;
        this.field4104 = arg2;
        this.field4102 = arg4;
        this.field4118 = arg0;
        this.field4108 = arg5;
        this.field4121 = arg1;
        this.field4113 = arg6;
        this.field4106 = arg8;
    }
}
