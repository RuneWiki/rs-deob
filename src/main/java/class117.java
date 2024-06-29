import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class117 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[Z")
    public static boolean[] field2137 = new boolean[100];

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Z")
    public static boolean field2136 = true;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lke;")
    public static class106 field2134 = new class106();

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lcd;")
    public static class64 field2142 = class44.method335((byte) 71, "<col=00ff00>");

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lkh;I)Lsk;", line = 9)
    public static final class119 method829(class13 arg0, int arg1) {
        field2139++;
        class119 var2 = new class119();
        if (arg1 == -15522) {
            var2.field2159 = arg0.method112((byte) 92);
            var2.field2158 = class47.method352(var2.field2159, 32767);
            return var2;
        } else {
            return (class119) null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILa;IJIIII)Z", line = 35)
    public static final boolean method830(int arg0, int arg1, int arg2, int arg3, class262 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class88.method672(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIILkh;IZ)V", line = 44)
    public static final void method831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class13 arg6, int arg7, boolean arg8) {
        field2138++;
        if (arg1 != -19940) {
            field2140 = 106;
        }
        if (arg4 < 0 || arg4 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg6.method152((byte) -86);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg6.method152((byte) -89);
                    break;
                }
                if (var11 <= 49) {
                    arg6.method152((byte) -78);
                }
            }
            return;
        }
        if (!arg8) {
            class82.field1508[arg0][arg4][arg3] = 0;
        }
        while (true) {
            int var9 = arg6.method152((byte) -93);
            if (var9 == 0) {
                if (arg8) {
                    class96.field1764[0][arg4][arg3] = class266.field4571[0][arg4][arg3];
                } else if (arg0 == 0) {
                    class96.field1764[0][arg4][arg3] = -class228.method1649(arg2 + arg3 + 556238, -107, arg4 + arg7 + 932731) * 8;
                } else {
                    class96.field1764[arg0][arg4][arg3] = class96.field1764[arg0 - 1][arg4][arg3] - 240;
                }
                break;
            }
            if (var9 == 1) {
                int var10 = arg6.method152((byte) -99);
                if (arg8) {
                    class96.field1764[0][arg4][arg3] = class266.field4571[0][arg4][arg3] + (var10 * 8);
                } else {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg0 == 0) {
                        class96.field1764[0][arg4][arg3] = -var10 * 8;
                    } else {
                        class96.field1764[arg0][arg4][arg3] = class96.field1764[arg0 - 1][arg4][arg3] - (var10 * 8);
                    }
                }
                break;
            }
            if (var9 <= 49) {
                class71.field1365[arg0][arg4][arg3] = arg6.method150((byte) 121);
                class227.field3858[arg0][arg4][arg3] = (byte) ((var9 - 2) / 4);
                class70.field1359[arg0][arg4][arg3] = (byte) class224.method1614(3, var9 + arg5 - 2);
            } else if (var9 > 81) {
                class30.field511[arg0][arg4][arg3] = (byte) (var9 - 81);
            } else if (!arg8) {
                class82.field1508[arg0][arg4][arg3] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)Lwc;", line = 155)
    public static final class97 method832(byte arg0, int arg1) {
        field2135++;
        class97 var2 = (class97) class29.field475.method329((long) arg1, (byte) -63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class94.field1741.method1580(0, arg1, 26);
        if (arg0 >= -54) {
            method831(65, 89, -57, -111, -98, 11, (class13) null, -122, true);
        }
        class97 var4 = new class97();
        if (var3 != null) {
            var4.method728(new class13(var3), -104);
        }
        class29.field475.method331((long) arg1, var4, (byte) -109);
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 184)
    public static void method833(int arg0) {
        if (arg0 != 0) {
            method831(-125, -64, -113, 59, -11, -58, (class13) null, 53, false);
        }
        field2142 = null;
        field2134 = null;
        field2137 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V", line = 208)
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2143++;
        if (arg4 != -17037) {
            return;
        }
        if (class290.field4976 <= arg6 && class153.field2714 >= arg0 && arg2 >= class180.field3098 && class201.field3444 >= arg5) {
            if (arg1 == 1) {
                class234.method1678(arg0, arg5, arg3, -1, arg6, arg2);
            } else {
                class120.method850(5186, arg5, arg2, arg6, arg1, arg3, arg0);
            }
        } else if (arg1 == 1) {
            class111.method807(arg0, arg5, (byte) -33, arg3, arg2, arg6);
        } else {
            class109.method798(arg5, arg0, arg1, true, arg6, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lsc;", line = 239)
    public static final class249 method835(byte arg0) {
        field2141++;
        if (arg0 < 15) {
            return (class249) null;
        }
        try {
            return (class249) Class.forName("me").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class99();
        }
    }
}
