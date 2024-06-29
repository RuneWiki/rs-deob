import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class423 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field6060;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Loe;")
    public static class127 field6066;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
    public static int[] field6058;

    static {
        new class423("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field6066 = new class127(66, 2);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V", line = 15)
    public static final void method2472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6062++;
        int var6 = arg3 - arg2;
        int var7 = arg1 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class213.method1309(arg0, 0, arg2, arg3, arg5);
            }
        } else if (var6 == 0) {
            class15.method79(arg1, arg0, (byte) -4, arg2, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg4 <= 110) {
                method2475(76, 96, -36, 9, 106, 115, 51, 61);
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                int var10 = arg1;
                arg5 = arg2;
                arg1 = arg3;
                arg2 = var9;
                arg3 = var10;
            }
            if (arg5 > arg1) {
                int var11 = arg5;
                int var12 = arg2;
                arg5 = arg1;
                arg2 = arg3;
                arg1 = var11;
                arg3 = var12;
            }
            int var13 = arg2;
            int var14 = arg1 - arg5;
            int var15 = arg3 - arg2;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg3 > arg2 ? 1 : -1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg1; var18++) {
                    class69.field1212[var18][var13] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg1; var19++) {
                    class69.field1212[var13][var19] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Ljava/lang/String;", line = 132)
    public final String method2473(int arg0, int arg1) {
        if (arg1 >= -73) {
            method2477(false, -83, 117, 85, 127);
        }
        field6061++;
        return this.field6060[arg0];
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZILjava/lang/String;B)Z", line = 146)
    public static final boolean method2474(boolean arg0, int arg1, String arg2, byte arg3) {
        field6064++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg3 > -44) {
            return true;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 244)
    public class423(String arg0, String arg1, String arg2, String arg3) {
        this.field6060 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIII)V", line = 257)
    public static final void method2475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6065++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class420.field6037 - class350.field5156) * var8 / 100 + class350.field5156;
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg4 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class195.field3075[var11] * -var10 >> 15;
            var15 = class195.field3077[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class195.field3075[var12] * var15 >> 15;
            var15 = class195.field3077[var12] * var15 >> 15;
        }
        class243.field3655 = arg1 - var13;
        class288.field4373 = arg0 - var14;
        if (arg2 != -46) {
            method2474(false, -83, null, (byte) -34);
        }
        class16.field226 = arg4;
        class290.field4403 = arg3 - var15;
        class211.field3284 = 0;
        class456.field6999 = arg6;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 307)
    public static void method2476(int arg0) {
        field6058 = null;
        field6066 = null;
        if (arg0 != 24978) {
            field6058 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIII)V", line = 332)
    public static final void method2477(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class361.field5337 = 0L;
        field6063++;
        int var5 = class331.method2058(arg1 ^ 0x15C4);
        if (~arg2 == arg1 || var5 == 3) {
            arg0 = true;
        }
        if (!class345.field5116.method1967()) {
            arg0 = true;
        }
        class106.method778(arg0, arg4, var5, arg1 + 4, arg2, arg3);
    }

    @OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;", line = 376)
    public final String toString() {
        field6059++;
        throw new IllegalStateException();
    }
}
