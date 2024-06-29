import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class31 extends class376 implements class185 {

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "Lsi;")
    public class376 field413;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "[[S")
    public static short[][] field400 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "[[B")
    public static byte[][] field407;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method161(int arg0) {
        if (arg0 != 15275) {
            this.method161(-72);
        }
        field409++;
        return false;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lqq;BII)Z", line = 16)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -44) {
            field407 = null;
        }
        field398++;
        return false;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 28)
    public final void method163(int arg0) {
        if (arg0 != 8793) {
            method175(true);
        }
        field405++;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)Z", line = 41)
    public final boolean method164(int arg0) {
        if (arg0 != 0) {
            this.method164(-84);
        }
        field410++;
        return false;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 52)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field408++;
        if (!arg4) {
            this.field413 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILtq;)V", line = 64)
    public static final void method166(int arg0, int arg1, int arg2, class427 arg3) {
        if (class306.field4636) {
            class85 var9 = class392.field5739 == -1 ? null : class76.field1364.method1267((byte) 41, class392.field5739);
            if (client.method1176(arg3).method381(-4551) && (class331.field4966 & 0x20) != 0 && (var9 == null || arg3.method2511(var9.field1423, class392.field5739, -27154) != var9.field1423)) {
                class221.method1345(class200.field3175 + " -> " + arg3.field6136, 48, arg3.field6157, arg3.field6265, class217.field3347, true, class28.field357, arg3.field6274, (byte) -121, 0L, false);
                class51.field774++;
            }
        } else {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class195.method1216(var4, 32768, arg3);
                if (var8 != null) {
                    class365.field5363++;
                    class221.method1345(arg3.field6136, 1007, arg3.field6157, arg3.field6265, class461.method2754(arg3, var4, (byte) -62), true, var8, arg3.field6274, (byte) -121, (long) (var4 + 1), false);
                }
            }
            String var5 = class362.method2202(123, arg3);
            if (var5 != null) {
                class221.method1345(arg3.field6136, 15, arg3.field6157, arg3.field6265, arg3.field6128, true, var5, arg3.field6274, (byte) -121, 0L, false);
                class367.field5391++;
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class195.method1216(var6, 32768, arg3);
                if (var7 != null) {
                    class365.field5363++;
                    class221.method1345(arg3.field6136, 18, arg3.field6157, arg3.field6265, class461.method2754(arg3, var6, (byte) -62), true, var7, arg3.field6274, (byte) -121, (long) (var6 + 1), false);
                }
            }
            if (client.method1176(arg3).method380((byte) -82)) {
                if (arg3.field6250 == null) {
                    class221.method1345("", 3, arg3.field6157, arg3.field6265, -1, true, class336.field5039.method2473(class406.field5898, -113), arg3.field6274, (byte) -121, 0L, false);
                } else {
                    class221.method1345("", 3, arg3.field6157, arg3.field6265, -1, true, arg3.field6250, arg3.field6274, (byte) -121, 0L, false);
                }
                class25.field335++;
            }
        }
        if (arg0 != 0) {
            field400 = null;
        }
        field406++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 145)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return null;
        } else {
            field403++;
            return null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V", line = 156)
    public final void method168(int arg0) {
        int var2 = 39 / ((arg0 + 53) / 62);
        field412++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLqq;)Lkm;", line = 165)
    public final class227 method169(byte arg0, class318 arg1) {
        field402++;
        return arg0 >= -11 ? null : null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)I", line = 176)
    public final int method170(boolean arg0) {
        field399++;
        return arg0 ? 0 : -121;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lqq;I)V", line = 189)
    public final void method171(class318 arg0, int arg1) {
        if (arg1 != 1577) {
            this.field413 = null;
        }
        field401++;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(ZLqq;)V", line = 199)
    public final void method172(boolean arg0, class318 arg1) {
        if (arg0) {
            this.field413 = null;
        }
        field396++;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)I", line = 212)
    public final int method173(int arg0) {
        field404++;
        return arg0 == 1438 ? 0 : 49;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIILsi;)V", line = 228)
    public class31(int arg0, int arg1, int arg2, class376 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field413 = arg3;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I", line = 237)
    public final int method174(byte arg0) {
        field411++;
        if (arg0 <= 113) {
            this.field413 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)V", line = 249)
    public static void method175(boolean arg0) {
        field400 = null;
        field407 = null;
        if (arg0) {
            field400 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLqq;)V", line = 261)
    public final void method176(boolean arg0, class318 arg1) {
        if (!arg0) {
            this.method168(-42);
        }
        field397++;
    }
}
