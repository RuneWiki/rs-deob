import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class575 extends class561 {

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field8126 = 0;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field8122 = 1;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field8125 = 0;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Lcw;")
    public static class21 field8113;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lcw;")
    public class21 field8114;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lcw;")
    private class21 field8115;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lcw;")
    private class21 field8118;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Lcw;")
    private class21 field8119;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Lcw;")
    private class21 field8120;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "Lcw;")
    private class21 field8121;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public final void method682(byte arg0) {
        ++field8117;
        super.method682((byte) 116);
        class555 var2 = (class555) super.field7977;
        this.field8114 = class7.method32(false, var2.field7831, super.field7983);
        this.field8118 = class7.method32(false, var2.field7827, super.field7983);
        this.field8115 = class7.method32(false, var2.field7834, super.field7983);
        this.field8121 = class7.method32(false, var2.field7832, super.field7983);
        this.field8120 = class7.method32(false, var2.field7837, super.field7983);
        if (arg0 < 29) {
            this.field8118 = null;
        }
        this.field8119 = class7.method32(false, var2.field7833, super.field7983);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BZII)V")
    public final void method971(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 != 20) {
            field8126 = -68;
        }
        ++field8128;
        if (arg1) {
            int[] var5 = new int[4];
            class96.field1401.method2163(var5);
            class96.field1401.method2097(arg2, arg3, arg2 - -super.field7977.field9575, super.field7977.field9561 + arg3);
            int var6 = this.field8115.method116();
            int var7 = this.field8115.method108();
            int var8 = this.field8121.method116();
            int var9 = this.field8121.method108();
            this.field8115.method101(arg2, arg3 - -((-var7 + super.field7977.field9561) / 2));
            this.field8121.method101(super.field7977.field9575 + arg2 + -var8, (-var9 + super.field7977.field9561) / 2 + arg3);
            class96.field1401.method2097(arg2, arg3, super.field7977.field9575 + arg2, arg3 + this.field8120.method108());
            this.field8120.method109(arg2 + var6, arg3, super.field7977.field9575 - var6 + -var8, super.field7977.field9561);
            int var10 = this.field8119.method108();
            class96.field1401.method2097(arg2, super.field7977.field9561 + arg3 - var10, super.field7977.field9575 + arg2, super.field7977.field9561 + arg3);
            this.field8119.method109(arg2 - -var6, -var10 + arg3 + super.field7977.field9561, super.field7977.field9575 - var6 - var8, super.field7977.field9561);
            class96.field1401.method2097(var5[0], var5[1], var5[2], var5[3]);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
    public final boolean method680(int arg0) {
        ++field8123;
        if (!super.method680(arg0)) {
            return false;
        } else {
            class555 var2 = (class555) super.field7977;
            if (!super.field7983.method3340(0, var2.field7831)) {
                return false;
            } else if (!super.field7983.method3340(0, var2.field7827)) {
                return false;
            } else if (!super.field7983.method3340(0, var2.field7834)) {
                return false;
            } else if (!super.field7983.method3340(0, var2.field7832)) {
                return false;
            } else if (!super.field7983.method3340(0, var2.field7837)) {
                return false;
            } else {
                return super.field7983.method3340(0, var2.field7833);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BIII)Z")
    public static final boolean method3423(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        ++field8116;
        boolean var6 = true;
        if (arg0 != 4) {
            method3423(14, 50, (byte[]) null, -121, 90, -62);
        }
        class26 var7 = new class26(arg2);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method180(110);
            if (~var9 == -1) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method190(-27226);
                    if (~var13 == -1) {
                        continue label60;
                    }
                    var10 += var13 + -1;
                    int var14 = var10 & 63;
                    int var15 = (var10 & 4033) >> 6;
                    int var16 = var7.method194((byte) 119) >> 2;
                    int var17 = arg4 + var15;
                    int var18 = arg3 + var14;
                    if (~var17 < -1 && var18 > 0 && arg5 + -1 > var17 && var18 < arg1 + -1) {
                        class30 var19 = class264.field3604.method3188(var8, (byte) -57);
                        if (var16 != 22 || ~class674.field9500.field5131.method2840(arg0 ^ 4) != -1 || ~var19.field467 != -1 || var19.field469 == 1 || var19.field461) {
                            if (!var19.method212(-39)) {
                                var6 = false;
                                ++class369.field4722;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method190(arg0 + -27230);
                if (var12 == 0) {
                    break;
                }
                var7.method194((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static void method3424(byte arg0) {
        field8113 = null;
        if (arg0 >= -98) {
            method3424((byte) 109);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lwu;Lwu;Lrg;)V")
    public class575(class557 arg0, class557 arg1, class555 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIII)V")
    public final void method968(boolean arg0, int arg1, int arg2, int arg3) {
        ++field8127;
        int var5 = this.field8115.method116() + arg3;
        int var6 = super.field7977.field9575 + arg3 + -this.field8121.method116();
        int var7 = arg1 + this.field8120.method108();
        int var8 = super.field7977.field9561 + arg1 + -this.field8119.method108();
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        int var11 = var9 * this.method3360(false) / 10000;
        int[] var12 = new int[4];
        class96.field1401.method2163(var12);
        class96.field1401.method2097(var5, var7, var5 - -var11, var8);
        this.method3425(62, var5, var7, var10, var9);
        class96.field1401.method2097(var5 + var11, var7, var6, var8);
        this.field8118.method109(var5, var7, var9, var10);
        if (arg2 == -30264) {
            class96.field1401.method2097(var12[0], var12[1], var12[2], var12[3]);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
    public void method3425(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 22) {
            this.method682((byte) 98);
        }
        this.field8114.method109(arg1, arg2, arg4, arg3);
        ++field8124;
    }
}
