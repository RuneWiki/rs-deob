import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class260 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lok;")
    public static class41 field4144 = class137.method956("leuchten3:", 45);

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Lok;")
    public static class41 field4145 = class137.method956(")4j", 45);

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lee;")
    public static class75 field4149 = new class75(64);

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Lok;")
    public static class41 field4151 = class137.method956("mapfunction", 45);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "F")
    public static float field4140;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Lji;")
    public static class154 field4148;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lbc;")
    public static class302 field4147;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lmh;")
    public static class65 field4146;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 8)
    public static void method1830(int arg0) {
        if (arg0 != 5) {
            method1834((class302) null, (byte) -41);
        }
        field4144 = null;
        field4145 = null;
        field4149 = null;
        field4147 = null;
        field4151 = null;
        field4146 = null;
        field4148 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I", line = 24)
    public static final int method1831(int arg0, int arg1) {
        field4141++;
        if (arg1 != 11526) {
            return 107;
        }
        class85 var2 = class14.method63(17511, arg0);
        int var3 = var2.field1244;
        int var4 = var2.field1237;
        int var5 = class306.field5120[var4 - var3];
        int var6 = var2.field1227;
        return var5 & class60.field885[var6] >> var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lqa;IZILqa;)I", line = 52)
    public static final int method1832(class79 arg0, int arg1, boolean arg2, int arg3, class79 arg4) {
        field4150++;
        if (arg3 == 1) {
            int var5 = arg0.field3116;
            int var6 = arg4.field3116;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return arg0.method570(0).field2470.method286(arg4.method570(0).field2470, (byte) -110);
        } else if (arg3 == 3) {
            if (arg0.field1160.method268(class16.field214, 1631)) {
                if (arg4.field1160.method268(class16.field214, 1631)) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field1160.method268(class16.field214, 1631)) {
                return arg2 ? 1 : -1;
            } else {
                return arg0.field1160.method286(arg4.field1160, (byte) -77);
            }
        } else if (arg3 == 4) {
            return arg0.method1383(100) ? (arg4.method1383(122) ? 0 : 1) : (arg4.method1383(103) ? -1 : 0);
        } else if (arg3 == 5) {
            return arg0.method1386(-1) ? (arg4.method1386(-1) ? 0 : 1) : (arg4.method1386(-1) ? -1 : 0);
        } else if (arg3 == 6) {
            return arg0.method1385(4) ? (arg4.method1385(4) ? 0 : 1) : (arg4.method1385(4) ? -1 : 0);
        } else if (arg3 == 7) {
            return arg0.method1381((byte) -86) ? (arg4.method1381((byte) -71) ? 0 : 1) : (arg4.method1381((byte) -53) ? -1 : 0);
        } else {
            int var7 = 6 % ((arg1 - 56) / 63);
            return arg0.field1168 - arg4.field1168;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILtc;)V", line = 121)
    public static final void method1833(int arg0, class268 arg1) {
        field4142++;
        int var2 = arg1.field4303 - class18.field234;
        int var3 = -70 % ((-arg0 - 14) / 39);
        int var4 = arg1.field4326 * 128 + arg1.method1753((byte) -15) * 64;
        int var5 = arg1.field4285 * 128 + (arg1.method1753((byte) -15) * 64);
        if (arg1.field4296 == 0) {
            arg1.field4332 = 1024;
        }
        arg1.field4302 = 0;
        if (arg1.field4296 == 1) {
            arg1.field4332 = 1536;
        }
        arg1.field4311 += (var5 - arg1.field4311) / var2;
        if (arg1.field4296 == 2) {
            arg1.field4332 = 0;
        }
        if (arg1.field4296 == 3) {
            arg1.field4332 = 512;
        }
        arg1.field4280 += (var4 - arg1.field4280) / var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lbc;B)V", line = 156)
    public static final void method1834(class302 arg0, byte arg1) {
        int var2 = arg0.field4924;
        field4143++;
        if (var2 == 324) {
            if (class228.field3638 == -1) {
                class228.field3638 = arg0.field4905;
                class222.field3544 = arg0.field5050;
            }
            if (class203.field3259.field1031) {
                arg0.field4905 = class228.field3638;
            } else {
                arg0.field4905 = class222.field3544;
            }
        } else if (var2 == 325) {
            if (class228.field3638 == -1) {
                class228.field3638 = arg0.field4905;
                class222.field3544 = arg0.field5050;
            }
            if (class203.field3259.field1031) {
                arg0.field4905 = class222.field3544;
            } else {
                arg0.field4905 = class228.field3638;
            }
        } else if (var2 == 327) {
            arg0.field4889 = 150;
            arg0.field5009 = (int) (Math.sin((double) class18.field234 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4968 = -1;
            arg0.field4909 = 5;
        } else if (var2 != 328) {
            int var3 = 116 % ((arg1 - 18) / 42);
        } else if (class62.field913.field3933 == null) {
            arg0.field4968 = 0;
        } else {
            arg0.field4889 = 150;
            arg0.field5009 = (int) (Math.sin((double) class18.field234 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4909 = 5;
            arg0.field4968 = ((int) class62.field913.field3933.method291((byte) 65) << 11) + 2047;
            arg0.field4915 = class62.field913.field4333;
            arg0.field4994 = class62.field913.field4334;
        }
    }
}
