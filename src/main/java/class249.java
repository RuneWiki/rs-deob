import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class249 extends class601 {

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "Lwm;")
    public static class30 field3411;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "Lg;")
    public static class619 field3418;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method638(int arg0, int arg1) {
        if (arg0 != 2017) {
            field3418 = null;
        }
        ++field3416;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[] var4 = this.method3243(arg1, 27123, 2);
            int[][] var5 = this.method3247((byte) -107, 0, arg1);
            int[][] var6 = this.method3247((byte) -91, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class418.field5518; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 83)
    public class249() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)[I", line = 86)
    public final int[] method261(int arg0, byte arg1) {
        ++field3410;
        if (arg1 > -76) {
            return null;
        } else {
            int[] var3 = super.field7643.method2054(arg0, 9986);
            if (super.field7643.field4364) {
                int[] var4 = this.method3243(arg0, 27123, 0);
                int[] var5 = this.method3243(arg0, 27123, 1);
                int[] var6 = this.method3243(arg0, 27123, 2);
                for (int var7 = 0; var7 < class418.field5518; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V", line = 141)
    public static final void method1622(Canvas arg0, boolean arg1) {
        ++field3412;
        Dimension var2 = arg0.getSize();
        if (arg1) {
            method1627(65, -72, 27);
        }
        class203.method1383(var2.width, var2.height, (byte) -91);
        if (~class596.field7567 == -2) {
            class699.field9263.method881(arg0, class669.field8694, class386.field4933);
        } else {
            class699.field9263.method881(arg0, class134.field1779, class524.field6671);
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Ljava/lang/String;", line = 159)
    public static final String method1623(int arg0, int arg1) {
        ++field3413;
        class720 var2 = (class720) class479.field6198.method2616((long) arg1, (byte) -85);
        if (arg0 != -4097) {
            return null;
        } else {
            if (var2 != null) {
                class433 var3 = var2.field9464.method595(true);
                if (var3 != null) {
                    double var4 = var2.field9464.method587(0);
                    if ((double) var3.method2486(-1) <= var4 && (double) var3.method2488((byte) 34) >= var4) {
                        return var3.method2491(-1);
                    }
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)V", line = 190)
    public static void method1624(int arg0) {
        if (arg0 <= -5) {
            field3411 = null;
            field3418 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(II)I", line = 201)
    public static int method1625(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lmc;II)V", line = 208)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field7646 = arg0.method1509(true) == 1;
        }
        ++field3409;
        int var4 = 85 / ((40 - arg2) / 52);
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(III)V", line = 224)
    public static final void method1626(int arg0, int arg1, int arg2) {
        ++field3417;
        class614 var3 = class497.method2759(14, 5977, (long) arg0);
        int var4 = 77 / ((39 - arg1) / 42);
        var3.method3277(639);
        var3.field7742 = arg2;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(III)Z", line = 240)
    public static final boolean method1627(int arg0, int arg1, int arg2) {
        ++field3415;
        if (arg1 > -12) {
            field3418 = null;
        }
        return class558.method3025(arg2, arg0, -15197) | (arg2 & 458752) != 0 || class781.method4286(arg2, arg0, (byte) 3);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZLbaa;)V", line = 253)
    public static final void method1628(int arg0, boolean arg1, class136 arg2) {
        if (!arg2.field1803) {
            if (arg2.field1805 && ~arg2.field1800 <= -2 && arg2.field1799 >= 1 && ~arg2.field1800 >= ~(class240.field3280 - 2) && ~arg2.field1799 >= ~(class276.field3602 + -2) && (arg2.field1804 < 0 || class781.method4279(arg2.field1808, arg2.field1804, 4))) {
                if (arg1) {
                    class325.method1882(arg2.field1809, arg2.field1806, arg2.field1801, arg2.field1800, arg2.field1799, (byte) -77);
                } else {
                    class216.method1422(arg2.field1809, arg2.field1808, arg2.field1804, -1, arg2.field1796, arg2.field1800, 17393, arg2.field1806, arg2.field1799);
                }
                arg2.field1805 = false;
                if (!arg1 && arg2.field1807 == arg2.field1804 && arg2.field1807 == -1) {
                    arg2.method1946(arg0 ^ 10363);
                } else if (!arg1 && arg2.field1807 == arg2.field1804 && arg2.field1796 == arg2.field1795 && ~arg2.field1808 == ~arg2.field1793) {
                    arg2.method1946(-10364);
                }
            }
        } else if (~arg2.field1807 > -1 || class781.method4279(arg2.field1793, arg2.field1807, 4)) {
            if (arg1) {
                class325.method1882(arg2.field1809, arg2.field1806, (class702) null, arg2.field1800, arg2.field1799, (byte) -89);
            } else {
                class216.method1422(arg2.field1809, arg2.field1793, arg2.field1807, -1, arg2.field1795, arg2.field1800, 17393, arg2.field1806, arg2.field1799);
            }
            arg2.method1946(-10364);
        }
        if (arg0 == -1) {
            ++field3414;
        }
    }
}
