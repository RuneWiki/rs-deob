import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class169 extends class17 {

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!sr", name = "O", descriptor = "I")
    public static int field2466;

    static {
        new class530("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field2464 = 0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)Lki;", line = 3)
    public static final class509 method1060(byte arg0, int arg1) {
        if (arg0 != -65) {
            method1065((class150) null, 91);
        }
        ++field2462;
        class509 var2 = (class509) class207.field3000.method1088((long) arg1, (byte) -123);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class260.field3848.method426(1, (byte) 9, arg1);
            class509 var4 = new class509();
            var4.field7548 = arg1;
            if (var3 != null) {
                var4.method3038((byte) 19, new class403(var3));
            }
            var4.method3043(true);
            if (~var4.field7550 == -3 && class329.field4803.method2405((long) arg1, arg0 ^ 41) == null) {
                class329.field4803.method2413((long) arg1, new class254(class258.field3836), -1);
                class269.field3922[class258.field3836++] = var4;
            }
            class207.field3000.method1097(arg0 ^ -19692, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V", line = 42)
    public class169() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(III)I", line = 46)
    public static final int method1061(int arg0, int arg1, int arg2) {
        ++field2460;
        if (arg2 != -18995) {
            return 28;
        } else {
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 + -var3;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 59)
    public static final int method1062(String arg0, int arg1) {
        ++field2461;
        if (arg1 > -76) {
            method1062((String) null, -1);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            var3 = (var3 << 5) + -var3 - -arg0.charAt(var4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I", line = 81)
    public final int[] method27(int arg0, int arg1) {
        ++field2457;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 <= 53) {
            return null;
        } else {
            if (super.field210.field6442) {
                int[][] var4 = this.method91(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class530.field7763 < ~var8; ++var8) {
                    var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIILza;II)Le;", line = 120)
    public static final class377 method1063(int arg0, int arg1, int arg2, int arg3, class290 arg4, int arg5, int arg6) {
        ++field2466;
        long var7 = (long) arg1;
        if (arg2 >= -111) {
            return null;
        } else {
            class377 var9 = (class377) class335.field4854.method1088(var7, (byte) -110);
            short var10 = 2055;
            if (var9 == null) {
                class117 var11 = class488.method2813(class155.field2251, 0, arg1, -1);
                if (var11 == null) {
                    return null;
                }
                if (~var11.field1605 > -14) {
                    var11.method789(0, 0);
                }
                var9 = arg4.method293(var11, var10, class513.field7573, 64, 768);
                class335.field4854.method1097(19627, var9, var7);
            }
            class377 var12 = var9.method1590((byte) 2, var10, true);
            if (arg3 != 0) {
                var12.method1612(arg3);
            }
            if (arg0 != 0) {
                var12.method1599(arg0);
            }
            if (~arg6 != -1) {
                var12.method1594(arg6);
            }
            if (~arg5 != -1) {
                var12.method1580(0, arg5, 0);
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V", line = 169)
    public static final void method1064(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class273.field4052 == 1) {
            class388.field5453[class476.field6633 / 100].method151(class198.field2815 + -8, class528.field7751 - 8);
        }
        int var5 = 55 / ((arg0 - 57) / 50);
        ++field2458;
        if (~class273.field4052 == -3) {
            class388.field5453[4 - -(class476.field6633 / 100)].method151(class198.field2815 - 8, class528.field7751 - 8);
        }
        class76.method590(321);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lhm;I)V", line = 192)
    public static final void method1065(class150 arg0, int arg1) {
        ++field2459;
        if (arg1 == 0) {
            if (class285.field4183 == arg0.field2006) {
                if (class246.field3587.field256 == null) {
                    arg0.field2018 = 0;
                    arg0.field2120 = 0;
                } else {
                    arg0.field2023 = 150;
                    arg0.field2133 = (int) (256.0D * Math.sin((double) class390.field5481 / 40.0D)) & 2047;
                    arg0.field2053 = 5;
                    arg0.field2018 = class343.field4982;
                    arg0.field2120 = method1062(class246.field3587.field256, -93);
                    arg0.field2140 = class246.field3587.field3325;
                    arg0.field2112 = class246.field3587.field3337;
                    arg0.field2009 = class246.field3587.field3314;
                    arg0.field2060 = 0;
                }
            }
        }
    }
}
