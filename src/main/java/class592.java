import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class592 extends class367 {

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    private int field7829 = -1;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    private int field7832 = -1;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public int field7825;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Ljava/lang/String;")
    public static String field7827 = null;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Ljava/lang/String;")
    public static String field7831 = null;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field7833 = 0;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Lcu;")
    public static class206 field7834 = new class206(61, 8);

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field7836 = 0;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field7835 = 0;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lno;IIZ[[I)V")
    public class592(class658 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field7825 = arg2;
        super.field4971.method3630(this, -2);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field4966, arg2, arg2, 0, 32993, super.field4971.field9243, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class698.method3862(32993, arg4[var7], var7 + 34069, -19250, arg2, super.field4966, arg2, super.field4971.field9243);
            }
        }
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lno;II)V")
    public class592(class658 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field7825 = arg2;
        super.field4971.method3630(this, -2);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field4966, arg2, arg2, 0, class501.method2783(true, super.field4966), 5121, (byte[]) null, 0);
        }
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIZ)I")
    public static final int method3250(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7824;
        if (arg5) {
            field7835 = 72;
        }
        if (class218.field3099 == null) {
            return 0;
        } else {
            if (~arg1 > -4) {
                int var6 = arg3 >> 9;
                int var7 = arg4 >> 9;
                if (arg0 < 0 || ~arg2 > -1 || arg0 > class34.field530 + -1 || arg2 > class34.field531 + -1) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > class34.field530 + -1 || ~(class34.field531 + -1) > ~var7) {
                    return 0;
                }
                boolean var8 = ~(class477.field6362[1][arg3 >> 9][arg4 >> 9] & 2) != -1;
                if (~(511 & arg3) == -1) {
                    boolean var9 = (class477.field6362[1][var6 + -1][arg4 >> 9] & 2) != 0;
                    boolean var10 = (class477.field6362[1][var6][arg4 >> 9] & 2) != 0;
                    if (!var10 == var9) {
                        var8 = (class477.field6362[1][arg0][arg2] & 2) != 0;
                    }
                }
                if (~(arg4 & 511) == -1) {
                    boolean var11 = ~(class477.field6362[1][arg3 >> 9][var7 + -1] & 2) != -1;
                    boolean var12 = (class477.field6362[1][arg3 >> 9][var7] & 2) != 0;
                    if (var11 != var12) {
                        var8 = (2 & class477.field6362[1][arg0][arg2]) != 0;
                    }
                }
                if (var8) {
                    ++arg1;
                }
            }
            return class218.field3099[arg1].method200(arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lno;IIZ[[BI)V")
    public class592(class658 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field7825 = arg2;
        super.field4971.method3630(this, -2);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field4966, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIB)V")
    public final void method3251(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < 104) {
            field7833 = 95;
        }
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg3, super.field4961, arg2);
        ++field7830;
        this.field7832 = arg1;
        this.field7829 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public final void method773(int arg0) {
        ++field7828;
        OpenGL.glFramebufferTexture2DEXT(this.field7829, this.field7832, 3553, 0, 0);
        this.field7829 = -1;
        this.field7832 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Loa;BLgba;)V")
    public static final void method3252(class651 arg0, byte arg1, class625 arg2) {
        ++field7826;
        boolean var3 = class193.field2826.method1043(arg2.field8362, arg2.field8380 ? class199.field2897.field5362 : null, -16777216 | arg2.field8440, arg0, arg2.field8367, arg2.field8409, arg2.field8403, (byte) 83) == null;
        if (arg1 != -112) {
            field7835 = 104;
        }
        if (var3) {
            class94.field1439.method3265(new class674(arg2.field8403, arg2.field8367, arg2.field8362, arg2.field8440 | -16777216, arg2.field8409, arg2.field8380), (byte) -68);
            class463.method2624(false, arg2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method3253(byte arg0) {
        field7831 = null;
        if (arg0 < -20) {
            field7827 = null;
            field7834 = null;
        }
    }
}
