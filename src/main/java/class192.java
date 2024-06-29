import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class192 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3090 = "scroll:";

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1325(int arg0) {
        field3086++;
        if (arg0 != 16710) {
            field3090 = null;
        }
        for (int var1 = -1; var1 < class77.field970; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class27.field385[var1];
            }
            class259 var6 = class89.field1113[var5];
            if (var6 != null && var6.field3773 > 0) {
                var6.field3773--;
                if (var6.field3773 == 0) {
                    var6.field3822 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class134.field2122; var2++) {
            int var3 = class11.field121[var2];
            class200 var4 = class265.field4273[var3];
            if (var4 != null && var4.field3773 > 0) {
                var4.field3773--;
                if (var4.field3773 == 0) {
                    var4.field3822 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
    public static final int method1326(byte arg0) {
        field3088++;
        if (arg0 != -89) {
            method1326((byte) 114);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1327(int arg0) {
        field3090 = null;
        if (arg0 != 8) {
            method1328(-34, -82, -88);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Lgd;")
    public static final class128 method1328(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class128 var4 = var3.field4054;
            var3.field4054 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIZIZZLpd;)V")
    public static final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7, boolean arg8, class96 arg9) {
        field3089++;
        byte var10 = 0;
        if (arg8) {
            method1327(-75);
        }
        byte var11 = 0;
        if (arg2 == 1) {
            var10 = 1;
        } else if (arg2 == 2) {
            var11 = 1;
            var10 = 1;
        } else if (arg2 == 3) {
            var11 = 1;
        }
        if (arg6 < 0 || arg6 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var14 = arg9.method584(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg9.method584(255);
                    return;
                }
                if (var14 <= 49) {
                    arg9.method584(255);
                }
            }
        }
        if (!arg5 && !arg7) {
            class117.field1664[arg4][arg6][arg0] = 0;
        }
        while (true) {
            int var12 = arg9.method584(255);
            if (var12 == 0) {
                if (arg5) {
                    class17.field209[0][arg6 + var11][arg0 + var10] = class25.field348[0][arg6 + var11][arg0 + var10];
                    return;
                } else if (arg4 == 0) {
                    class17.field209[0][arg6 + var11][arg0 + var10] = -class282.method1881(-116, arg1 + 932731, arg3 + 556238) * 8;
                    return;
                } else {
                    class17.field209[arg4][arg6 + var11][arg0 + var10] = class17.field209[arg4 - 1][arg6 + var11][arg0 + var10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg9.method584(255);
                if (arg5) {
                    class17.field209[0][arg6 + var11][arg0 + var10] = var13 * 8 + class25.field348[0][arg6 + var11][arg0 + var10];
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg4 == 0) {
                    class17.field209[0][arg6 + var11][arg0 + var10] = -var13 * 8;
                    return;
                }
                class17.field209[arg4][arg6 + var11][arg0 + var10] = class17.field209[arg4 - 1][arg6 + var11][arg0 + var10] - (var13 * 8);
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg9.method584(255);
                } else {
                    class50.field646[arg4][arg6][arg0] = arg9.method587(106);
                    class161.field2569[arg4][arg6][arg0] = (byte) ((var12 - 2) / 4);
                    class143.field2260[arg4][arg6][arg0] = (byte) class173.method1186(3, arg2 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg5 && !arg7) {
                    class117.field1664[arg4][arg6][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                class107.field1441[arg4][arg6][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
    public static final int method1330(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -4745) {
            return -2;
        }
        field3087++;
        if ((class117.field1664[arg3][arg2][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (class117.field1664[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }
}
