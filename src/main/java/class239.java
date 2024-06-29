import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class239 extends class29 {

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public int field3547 = 0;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "Z")
    public boolean field3542 = true;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public int field3550 = 12800;

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
    public int field3555 = 0;

    @OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
    public int field3554 = -1;

    @OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
    public int field3556 = -1;

    @OriginalMember(owner = "client!jr", name = "V", descriptor = "I")
    public int field3557 = 12800;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "Ljava/lang/String;")
    public String field3544;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "Ljava/lang/String;")
    public String field3543;

    @OriginalMember(owner = "client!jr", name = "Z", descriptor = "Leb;")
    public class395 field3561;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!jr", name = "W", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!jr", name = "X", descriptor = "Lct;")
    public static class104 field3559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jr", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field3562;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1613(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class409("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BII)Z", line = 7)
    public final boolean method1602(byte arg0, int arg1, int arg2) {
        field3549++;
        if (arg0 != -84) {
            this.field3561 = null;
        }
        for (class212 var4 = (class212) this.field3561.method2478(arg0 + 1687); var4 != null; var4 = (class212) this.field3561.method2486((byte) -82)) {
            if (var4.method1456(arg2, false, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(B)V", line = 30)
    public final void method1603(byte arg0) {
        this.field3557 = 12800;
        field3545++;
        this.field3550 = 12800;
        this.field3555 = 0;
        if (arg0 != -91) {
            this.method1602((byte) -24, 81, 103);
        }
        this.field3547 = 0;
        for (class212 var2 = (class212) this.field3561.method2478(1603); var2 != null; var2 = (class212) this.field3561.method2486((byte) -82)) {
            if (var2.field2978 > this.field3555) {
                this.field3555 = var2.field2978;
            }
            if (this.field3550 > var2.field2984) {
                this.field3550 = var2.field2984;
            }
            if (this.field3547 < var2.field2988) {
                this.field3547 = var2.field2988;
            }
            if (var2.field2989 < this.field3557) {
                this.field3557 = var2.field2989;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)V", line = 65)
    public static void method1604(byte arg0) {
        int var1 = -87 / ((arg0 - 24) / 41);
        field3559 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V", line = 78)
    public static final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        if (arg2 != 0) {
            method1606(-123L, (byte) -54);
        }
        field3551++;
        class28 var8 = new class28();
        var8.field394 = arg6;
        var8.field400 = arg7;
        var8.field391 = arg4;
        var8.field397 = arg5;
        var8.field389 = class388.field5665 + arg1;
        var8.field392 = arg0;
        var8.field403 = arg3;
        class134.field1839.method2024(10, var8);
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 410)
    public class239(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3552 = arg3;
        this.field3556 = arg6;
        this.field3544 = arg2;
        this.field3542 = arg5;
        this.field3541 = arg0;
        this.field3543 = arg1;
        this.field3554 = arg4;
        if (this.field3556 == 255) {
            this.field3556 = 0;
        }
        this.field3561 = new class395();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 110)
    public static final String method1606(long arg0, byte arg1) {
        field3539++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            if (arg1 > -69) {
                return null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class247.field3644[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[I)Z", line = 162)
    public final boolean method1607(int arg0, int arg1, int arg2, int[] arg3) {
        field3558++;
        class212 var5 = (class212) this.field3561.method2478(1603);
        if (arg0 != 4006) {
            this.field3557 = -27;
        }
        while (var5 != null) {
            if (var5.method1456(arg2, false, arg1)) {
                var5.method1453(arg2, arg3, -19671, arg1);
                return true;
            }
            var5 = (class212) this.field3561.method2486((byte) -82);
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I", line = 187)
    public static final int method1608(int arg0, int arg1) {
        field3540++;
        if (arg1 != 218943466) {
            method1605(-69, 88, -107, 51, 64, -125, (String) null, -81);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lfp;IIIILth;IB)V", line = 206)
    public static final void method1609(class9 arg0, int arg1, int arg2, int arg3, int arg4, class175 arg5, int arg6, byte arg7) {
        field3546++;
        if (arg7 <= 32) {
            return;
        }
        class438 var8 = null;
        if (arg2 == 0) {
            var8 = (class438) class319.method2098(arg1, arg4, arg6);
        }
        if (arg2 == 1) {
            var8 = (class438) class77.method538(arg1, arg4, arg6);
        }
        if (arg2 == 2) {
            var8 = (class438) class188.method1287(arg1, arg4, arg6, field3562 == null ? (field3562 = method1613("jb")) : field3562);
        }
        if (arg2 == 3) {
            var8 = (class438) class137.method913(arg1, arg4, arg6);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method6(-20839);
        int var10 = var8.method1(-123);
        class178 var11 = class450.method2785(var8.method9((byte) 121), (byte) 103);
        if (var11.method1235((byte) 115)) {
            class465.method2869(var11, (byte) 127, arg1, arg6, arg4);
        }
        if (var8.method15(true)) {
            var8.method10(arg0, false);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                class422.method2603(arg1, arg4, arg6);
                return;
            }
            if (arg2 == 2) {
                class307.method2050(arg1, arg4, arg6, field3562 == null ? (field3562 = method1613("jb")) : field3562);
                if (var11.field2510 != 0 && class195.field2745 > arg4 + var11.field2533 && arg6 + var11.field2533 < class78.field984 && class195.field2745 > (var11.field2476 + arg4) && (var11.field2476 + arg6) < class78.field984) {
                    arg5.method1220(var11.field2476, var10, var11.field2514, var11.field2533, arg6, true, !var11.field2534, arg4);
                    return;
                }
                return;
            }
            if (arg2 == 3) {
                class370.method2353(arg1, arg4, arg6);
                if (var11.field2510 == 1) {
                    arg5.method1205(arg6, arg4, -262145);
                    return;
                }
            }
            return;
        }
        class67.method501(arg1, arg4, arg6);
        if (var11.field2510 != 0) {
            arg5.method1222(var9, 33554432, var11.field2514, !var11.field2534, arg4, var10, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BII[II)Z", line = 297)
    public final boolean method1610(byte arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field3538++;
        if (arg0 != -127) {
            this.method1611(-10, -28, 113, (int[]) null);
        }
        for (class212 var6 = (class212) this.field3561.method2478(1603); var6 != null; var6 = (class212) this.field3561.method2486((byte) -82)) {
            if (var6.method1452(arg1, arg2, true, arg4)) {
                var6.method1453(arg1, arg3, -19671, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(III[I)Z", line = 326)
    public final boolean method1611(int arg0, int arg1, int arg2, int[] arg3) {
        field3553++;
        if (arg2 != 0) {
            this.method1611(102, -8, -6, (int[]) null);
        }
        for (class212 var5 = (class212) this.field3561.method2478(arg2 + 1603); var5 != null; var5 = (class212) this.field3561.method2486((byte) -82)) {
            if (var5.method1450(arg2 ^ 0x369C, arg1, arg0)) {
                var5.method1454(arg0, arg3, arg1, (byte) -95);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lat;I)V", line = 353)
    public static final void method1612(class256 arg0, int arg1) {
        field3548++;
        if (arg1 != -9565) {
            method1608(22, 108);
        }
        byte[] var2 = new byte[24];
        if (class106.field1434 != null) {
            try {
                class106.field1434.method2853(0L, false);
                class106.field1434.method2847(var2, 2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1739(24, 0, var2, (byte) 98);
    }
}
