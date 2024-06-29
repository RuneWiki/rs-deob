import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class284 extends class264 {

    @OriginalMember(owner = "client!p", name = "U", descriptor = "[J")
    public static long[] field5095 = new long[200];

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lmb;")
    public static class160 field5093 = new class160();

    @OriginalMember(owner = "client!p", name = "V", descriptor = "Ltg;")
    public static class181 field5096 = null;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "Lcf;")
    public static class93 field5097 = class147.method1066("::gc", -48);

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field5098 = 0;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "Lhg;")
    public static class177 field5089;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Lcd;")
    public static class27 field5092;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            method1947((class177) null, (class177) null, false);
        }
        int[][] var3 = super.field4705.method1089(arg0, 32);
        if (super.field4705.field2670) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class176.field3060; ++var7) {
                this.method1944(var7, 2048, arg0);
                int[][] var8 = this.method1773(-125, 0, class93.field1688);
                var6[var7] = var8[0][class206.field3702];
                var4[var7] = var8[1][class206.field3702];
                var5[var7] = var8[2][class206.field3702];
            }
        }
        ++field5084;
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class284() {
        super(1, false);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IB)V")
    public static final void method1943(int arg0, byte arg1) {
        ++field5090;
        int var2 = 82 / ((arg1 - -23) / 39);
        class212 var3 = class123.method905(-1205364448, 12, arg0);
        var3.method1502(255);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(III)V")
    private final void method1944(int arg0, int arg1, int arg2) {
        ++field5086;
        int var4 = class144.field2497[arg0];
        int var5 = class67.field1220[arg2];
        float var6 = (float) Math.atan2((double) (var4 - arg1), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class206.field3702 = arg0;
            class93.field1688 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class93.field1688 = arg0;
            class206.field3702 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class93.field1688 = arg0;
            class206.field3702 = -arg2 + class176.field3060;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class206.field3702 = arg0;
            class93.field1688 = -arg2 + class67.field1231;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class93.field1688 = -arg2 + class67.field1231;
            class206.field3702 = -arg0 + class176.field3060;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class93.field1688 = -arg0 + class67.field1231;
            class206.field3702 = -arg2 + class176.field3060;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class206.field3702 = arg2;
            class93.field1688 = -arg0 + class67.field1231;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class206.field3702 = -arg0 + class176.field3060;
            class93.field1688 = arg2;
        }
        class93.field1688 &= class53.field881;
        class206.field3702 &= class55.field910;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 < 11) {
            field5093 = null;
        }
        ++field5088;
        if (~arg1 == -1) {
            super.field4698 = ~arg2.method1907(16832) == -2;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public static void method1945(byte arg0) {
        field5089 = null;
        field5093 = null;
        field5092 = null;
        field5095 = null;
        field5096 = null;
        field5097 = null;
        if (arg0 >= -103) {
            field5093 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILle;I)V")
    public static final void method1946(int arg0, int arg1, int arg2, int arg3, class43 arg4, int arg5) {
        ++field5094;
        if (~arg4.field687 != 0 || arg4.field675 != null) {
            int var6 = 0;
            if (arg4.field679 < arg0) {
                var6 += -arg4.field679 + arg0;
            } else if (arg4.field680 > arg0) {
                var6 += -arg0 + arg4.field680;
            }
            if (arg4.field682 < arg3) {
                var6 += arg3 - arg4.field682;
            } else if (~arg4.field674 < ~arg3) {
                var6 += -arg3 + arg4.field674;
            }
            if (arg4.field693 != 0 && ~(var6 + -64) >= ~arg4.field693 && ~class143.field2480 != -1 && arg4.field692 == arg1) {
                var6 -= 64;
                if (~var6 > arg2) {
                    var6 = 0;
                }
                int var7 = (-var6 + arg4.field693) * class143.field2480 / arg4.field693;
                if (arg4.field671 == null) {
                    if (~arg4.field687 <= -1) {
                        class215 var8 = class215.method1515(class144.field2487, arg4.field687, 0);
                        if (var8 != null) {
                            class194 var9 = var8.method1517().method1388(class209.field3766);
                            class59 var10 = class59.method344(var9, 100, var7);
                            var10.method361(-1);
                            class35.field543.method1658(var10);
                            arg4.field671 = var10;
                        }
                    }
                } else {
                    arg4.field671.method353(var7);
                }
                if (arg4.field690 != null) {
                    arg4.field690.method353(var7);
                    if (!arg4.field690.method1543((byte) 41)) {
                        arg4.field690 = null;
                        return;
                    }
                } else {
                    if (arg4.field675 == null || (arg4.field689 -= arg5) > 0) {
                        return;
                    }
                    int var11 = (int) (Math.random() * (double) arg4.field675.length);
                    class215 var12 = class215.method1515(class144.field2487, arg4.field675[var11], 0);
                    if (var12 == null) {
                        return;
                    }
                    class194 var13 = var12.method1517().method1388(class209.field3766);
                    class59 var14 = class59.method344(var13, 100, var7);
                    var14.method361(0);
                    class35.field543.method1658(var14);
                    arg4.field690 = var14;
                    arg4.field689 = (int) (Math.random() * (double) (-arg4.field681 + arg4.field672)) + arg4.field681;
                }
            } else {
                if (arg4.field671 != null) {
                    class35.field543.method1657(arg4.field671);
                    arg4.field671 = null;
                }
                if (arg4.field690 != null) {
                    class35.field543.method1657(arg4.field690);
                    arg4.field690 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lhg;Lhg;Z)V")
    public static final void method1947(class177 arg0, class177 arg1, boolean arg2) {
        if (!arg2) {
            ++field5091;
            class257.field4636 = arg1;
            class80.field1493 = arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 > -83) {
            return null;
        } else {
            int[] var3 = super.field4716.method532((byte) 95, arg0);
            ++field5085;
            if (super.field4716.field1424) {
                for (int var4 = 0; var4 < class176.field3060; ++var4) {
                    this.method1944(var4, 2048, arg0);
                    int[] var5 = this.method1767(0, class93.field1688, 21654);
                    var3[var4] = var5[class206.field3702];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public static final void method1948(int arg0) {
        class137.field2395.method294(0);
        ++field5087;
        class157.field2774.method294(0);
        class76.field1402.method294(0);
        class252.field4538.method294(arg0);
    }
}
