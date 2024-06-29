import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class758 {

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public int field10443;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "Z")
    public static boolean field10446 = false;

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "Lam;")
    public static class660 field10447 = new class660();

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "I")
    public static int field10450;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public static void method4194(int arg0) {
        if (arg0 == -32248) {
            field10447 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIBII)V")
    public static final void method4195(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (class570 var5 = (class570) class503.field6872.method3589((byte) -128); var5 != null; var5 = (class570) class503.field6872.method3591(0)) {
            class386.method2351(arg4, arg1, var5, arg2 ^ 0x4C, arg3, arg0);
        }
        field10448++;
        if (arg2 != 26) {
            return;
        }
        for (class570 var6 = (class570) class536.field7294.method3589((byte) -127); var6 != null; var6 = (class570) class536.field7294.method3591(0)) {
            byte var12 = 1;
            class540 var13 = var6.field8104.method2347(arg2 + 16357);
            if (var6.field8104.field5249 == -1 || var6.field8104.field5262) {
                var12 = 0;
            } else if (var6.field8104.field5249 == var13.field7368 || var6.field8104.field5249 == var13.field7337 || var6.field8104.field5249 == var13.field7359 || var6.field8104.field5249 == var13.field7357) {
                var12 = 2;
            } else if (var6.field8104.field5249 == var13.field7372 || var6.field8104.field5249 == var13.field7351 || var6.field8104.field5249 == var13.field7366 || var6.field8104.field5249 == var13.field7336) {
                var12 = 3;
            }
            if (var6.field8115 != var12) {
                int var14 = class69.method626(true, var6.field8104);
                class568 var15 = var6.field8104.field9253;
                if (var15.field8023 != null) {
                    var15 = var15.method3283((byte) -113, class694.field9613);
                }
                if (var15 == null || var14 == -1) {
                    var6.field8115 = var12;
                    var6.field8108 = false;
                    var6.field8102 = -1;
                } else if (var6.field8102 == var14 && var6.field8108 == var15.field8050) {
                    var6.field8110 = var15.field8033;
                    var6.field8115 = var12;
                } else {
                    boolean var16 = false;
                    if (var6.field8114 == null) {
                        var16 = true;
                    } else {
                        var6.field8110 -= 512;
                        if (var6.field8110 <= 0) {
                            class456.field6213.method352(var6.field8114);
                            var16 = true;
                            var6.field8114 = null;
                        }
                    }
                    if (var16) {
                        var6.field8102 = var14;
                        var6.field8110 = var15.field8033;
                        var6.field8106 = null;
                        var6.field8108 = var15.field8050;
                        var6.field8115 = var12;
                        var6.field8129 = null;
                    }
                }
            }
            var6.field8112 = var6.field8104.field7396;
            var6.field8109 = var6.field8104.field7396 + (var6.field8104.method2342((byte) 13) << 8);
            var6.field8131 = var6.field8104.field7398;
            var6.field8107 = var6.field8104.field7398 + (var6.field8104.method2342((byte) -64) << 8);
            class386.method2351(arg4, arg1, var6, 88, arg3, arg0);
        }
        for (class570 var7 = (class570) class663.field9213.method335(-29067); var7 != null; var7 = (class570) class663.field9213.method336(120)) {
            byte var8 = 1;
            class540 var9 = var7.field8116.method2347(16383);
            if (var7.field8116.field5249 == -1 || var7.field8116.field5262) {
                var8 = 0;
            } else if (var7.field8116.field5249 == var9.field7368 || var7.field8116.field5249 == var9.field7337 || var7.field8116.field5249 == var9.field7359 || var7.field8116.field5249 == var9.field7357) {
                var8 = 2;
            } else if (var7.field8116.field5249 == var9.field7372 || var7.field8116.field5249 == var9.field7351 || var7.field8116.field5249 == var9.field7366 || var7.field8116.field5249 == var9.field7336) {
                var8 = 3;
            }
            if (var7.field8115 != var8) {
                int var10 = class448.method2602(var7.field8116, (byte) 81);
                if (var7.field8102 == var10 && var7.field8108 == var7.field8116.field10621) {
                    var7.field8110 = var7.field8116.field10651;
                    var7.field8115 = var8;
                } else {
                    boolean var11 = false;
                    if (var7.field8114 == null) {
                        var11 = true;
                    } else {
                        var7.field8110 -= 512;
                        if (var7.field8110 <= 0) {
                            class456.field6213.method352(var7.field8114);
                            var11 = true;
                            var7.field8114 = null;
                        }
                    }
                    if (var11) {
                        var7.field8129 = null;
                        var7.field8108 = var7.field8116.field10621;
                        var7.field8106 = null;
                        var7.field8102 = var10;
                        var7.field8110 = var7.field8116.field10651;
                        var7.field8115 = var8;
                    }
                }
            }
            var7.field8112 = var7.field8116.field7396;
            var7.field8109 = var7.field8116.field7396 + (var7.field8116.method2342((byte) -14) << 8);
            var7.field8131 = var7.field8116.field7398;
            var7.field8107 = var7.field8116.field7398 + (var7.field8116.method2342((byte) 85) << 8);
            class386.method2351(arg4, arg1, var7, 121, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)I")
    public static final int method4196(boolean arg0) {
        field10445++;
        if (class611.field8532) {
            return 6;
        } else if (class603.field8440 == null) {
            return 0;
        } else {
            if (!arg0) {
                field10447 = null;
            }
            int var1 = class603.field8440.field7229;
            if (class37.method229(var1, -7)) {
                return 1;
            } else if (class375.method2273((byte) -119, var1)) {
                return 2;
            } else if (class453.method2619(85, var1)) {
                return 3;
            } else if (class93.method741(-51, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public static final void method4197(int arg0, Canvas arg1) {
        field10444++;
        Dimension var2 = arg1.getSize();
        class544.method3067(arg0 + 19938, var2.width, var2.height);
        if (arg0 != -19937) {
            field10451 = 17;
        }
        if (class278.field3847 == 1) {
            class369.field5000.method574(arg1, class256.field3597, class663.field9209);
        } else {
            class369.field5000.method574(arg1, class547.field7439, class747.field10318);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[Ljava/lang/Object;[JII)V")
    public static final void method4198(int arg0, Object[] arg1, long[] arg2, int arg3, int arg4) {
        field10450++;
        if (arg0 != -24322) {
            method4198(100, null, null, -16, 35);
        }
        if (arg3 >= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        Object var9 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg3; var11 < arg4; var11++) {
            if (((long) (var11 & var10) + var7) > arg2[var11]) {
                long var12 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6] = var12;
                Object var14 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6++] = var14;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var9;
        method4198(arg0, arg1, arg2, arg3, var6 - 1);
        method4198(-24322, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!aca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10449++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(II)V")
    public class758(int arg0, int arg1) {
        this.field10443 = arg1;
    }
}
