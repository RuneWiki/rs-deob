import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class205 {

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lsb;")
    public static class98 field3498 = class47.method368("Hidden)2", 0);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Llj;")
    public static class216 field3503 = new class216(new byte[5000]);

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[I")
    public static int[] field3508 = new int[4096];

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field3511 = -1;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field3504;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "J")
    public long field3510;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lsc;")
    public class119 field3495;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lsc;")
    public class119 field3497;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lsc;")
    public class119 field3499;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lac;")
    public static class188 field3507;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "[I")
    public static int[] field3512;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[S")
    public static short[] field3506;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[[[B")
    public static byte[][][] field3493;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILda;Lnd;ILne;IZI)V")
    public static final void method1382(int arg0, class21 arg1, class192 arg2, int arg3, class108 arg4, int arg5, boolean arg6, int arg7) {
        class60 var8 = new class60();
        var8.field994 = arg0 * 128;
        if (!arg6) {
            field3493 = null;
        }
        field3500++;
        var8.field1003 = arg3 * 128;
        var8.field988 = arg7;
        if (arg1 != null) {
            var8.field989 = arg1.field416;
            var8.field993 = arg1;
            var8.field987 = arg1.field405;
            var8.field1007 = arg1.field389;
            var8.field982 = arg1.field439 * 128;
            int var10 = arg1.field398;
            var8.field1000 = arg1.field418;
            int var11 = arg1.field397;
            if (arg5 == 1 || arg5 == 3) {
                var11 = arg1.field398;
                var10 = arg1.field397;
            }
            var8.field1001 = (arg0 + var10) * 128;
            var8.field1005 = (arg3 + var11) * 128;
            if (arg1.field393 != null) {
                var8.field996 = true;
                var8.method435(128);
            }
            if (var8.field989 != null) {
                var8.field1006 = (int) (Math.random() * (double) (var8.field1000 - var8.field987)) + var8.field987;
            }
            class82.field1448.method376((byte) 13, var8);
        } else if (arg4 != null) {
            class120 var9 = arg4.field1928;
            var8.field978 = arg4;
            if (var9.field2189 != null) {
                var8.field996 = true;
                var9 = var9.method895(-1);
            }
            if (var9 != null) {
                var8.field1001 = (arg0 + var9.field2165) * 128;
                var8.field1005 = (var9.field2165 + arg3) * 128;
                var8.field1007 = class233.method1594(arg4, -1);
                var8.field982 = var9.field2170 * 128;
            }
            class2.field38.method376((byte) 13, var8);
        } else if (arg2 != null) {
            var8.field1001 = (arg0 + arg2.field4486) * 128;
            var8.field995 = arg2;
            var8.field1005 = (arg2.field4486 + arg3) * 128;
            var8.field1007 = class115.method859(arg2, -11492);
            var8.field982 = arg2.field3360 * 128;
            class34.field594.method1513(arg2.field3323.method727((byte) 36), var8, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILhd;)V")
    public static final void method1383(int arg0, class262 arg1) {
        field3501++;
        long var2 = 0L;
        if (arg1.field4598 == 0) {
            var2 = class129.method984(arg1.field4589, arg1.field4593, arg1.field4595);
        }
        int var4 = -1;
        if (arg1.field4598 == 1) {
            var2 = class181.method1247(arg1.field4589, arg1.field4593, arg1.field4595);
        }
        if (arg1.field4598 == 2) {
            var2 = class48.method379(arg1.field4589, arg1.field4593, arg1.field4595);
        }
        if (arg1.field4598 == 3) {
            var2 = class221.method1527(arg1.field4589, arg1.field4593, arg1.field4595);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7C053) >> 14;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field4603 = var6;
        arg1.field4590 = var4;
        if (arg0 != 1115) {
            field3493 = null;
        }
        arg1.field4596 = var5;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1384(byte arg0) {
        field3493 = null;
        field3507 = null;
        field3506 = null;
        if (arg0 <= -28) {
            field3503 = null;
            field3508 = null;
            field3512 = null;
            field3498 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lid;")
    public static final class207 method1385(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class207 var4 = var3.field1157;
            var3.field1157 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)Z")
    public static final boolean method1386(byte arg0) {
        field3494++;
        class85 var1 = class197.field3394;
        synchronized (class197.field3394) {
            if (arg0 > -119) {
                method1387((byte) 60, (class255) null);
            }
            if (class200.field3428 == class147.field2573) {
                return false;
            } else {
                class45.field760 = class32.field567[class147.field2573];
                class52.field839 = class142.field2516[class147.field2573];
                class147.field2573 = class147.field2573 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLki;)V")
    public static final void method1387(byte arg0, class255 arg1) {
        arg1.field4468 = false;
        if (arg1.field4479 != -1) {
            class138 var2 = class16.method144(1, arg1.field4479);
            if (var2 == null || var2.field2454 == null) {
                arg1.field4479 = -1;
            } else {
                arg1.field4523++;
                if (arg1.field4518 < var2.field2454.length && arg1.field4523 > var2.field2439[arg1.field4518]) {
                    arg1.field4518++;
                    arg1.field4523 = 1;
                    class114.method850(class163.field2943 == arg1, arg1.field4492, arg1.field4466, arg1.field4518, var2, 4096);
                }
                if (arg1.field4518 >= var2.field2454.length) {
                    arg1.field4518 = 0;
                    arg1.field4523 = 0;
                    class114.method850(class163.field2943 == arg1, arg1.field4492, arg1.field4466, arg1.field4518, var2, 4096);
                }
            }
        }
        if (arg1.field4461 != -1 && class236.field4071 >= arg1.field4465) {
            int var3 = class49.method385(arg1.field4461, 0).field3464;
            if (var3 == -1) {
                arg1.field4461 = -1;
            } else {
                class138 var4 = class16.method144(1, var3);
                if (var4 == null || var4.field2454 == null) {
                    arg1.field4461 = -1;
                } else {
                    if (arg1.field4485 < 0) {
                        arg1.field4485 = 0;
                        class114.method850(class163.field2943 == arg1, arg1.field4492, arg1.field4466, 0, var4, 4096);
                    }
                    arg1.field4520++;
                    if (arg1.field4485 < var4.field2454.length && var4.field2439[arg1.field4485] < arg1.field4520) {
                        arg1.field4520 = 1;
                        arg1.field4485++;
                        class114.method850(class163.field2943 == arg1, arg1.field4492, arg1.field4466, arg1.field4485, var4, 4096);
                    }
                    if (var4.field2454.length <= arg1.field4485) {
                        arg1.field4461 = -1;
                    }
                }
            }
        }
        if (arg0 < 44) {
            field3506 = null;
        }
        field3509++;
        if (arg1.field4503 != -1 && arg1.field4474 <= 1) {
            class138 var5 = class16.method144(1, arg1.field4503);
            if (var5.field2452 == 1 && arg1.field4482 > 0 && arg1.field4476 <= class236.field4071 && class236.field4071 > arg1.field4515) {
                arg1.field4474 = 1;
                return;
            }
        }
        if (arg1.field4503 != -1 && arg1.field4474 == 0) {
            class138 var6 = class16.method144(1, arg1.field4503);
            if (var6 == null || var6.field2454 == null) {
                arg1.field4503 = -1;
            } else {
                arg1.field4483++;
                if (arg1.field4502 < var6.field2454.length && var6.field2439[arg1.field4502] < arg1.field4483) {
                    arg1.field4483 = 1;
                    arg1.field4502++;
                    class114.method850(class163.field2943 == arg1, arg1.field4492, arg1.field4466, arg1.field4502, var6, 4096);
                }
                if (var6.field2454.length <= arg1.field4502) {
                    arg1.field4502 -= var6.field2458;
                    arg1.field4478++;
                    if (arg1.field4478 >= var6.field2455) {
                        arg1.field4503 = -1;
                    } else if (arg1.field4502 >= 0 && arg1.field4502 < var6.field2454.length) {
                        class114.method850(class163.field2943 == arg1, arg1.field4492, arg1.field4466, arg1.field4502, var6, 4096);
                    } else {
                        arg1.field4503 = -1;
                    }
                }
                arg1.field4468 = var6.field2434;
            }
        }
        if (arg1.field4474 > 0) {
            arg1.field4474--;
        }
    }
}
