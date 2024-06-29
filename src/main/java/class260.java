import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class260 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;IIZ)I")
    public static final int method1608(String arg0, int arg1, int arg2, boolean arg3) {
        field3620++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        int var8 = -116 % ((-arg1 - 22) / 38);
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = arg0.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg3) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var6 + var12;
            if ((var11 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var11;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLpf;)V")
    public static final void method1609(int arg0, byte arg1, class133 arg2) {
        field3619++;
        boolean var3 = arg2.method801((byte) -87, 1) == 1;
        if (var3) {
            class10.field193[class318.field4331++] = arg0;
        }
        int var4 = arg2.method801((byte) -87, 2);
        class23 var5 = class310.field4235[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field396 = -1;
            } else if (class327.field4523 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class10.field194[arg0] = (var5.field1140[0] + class325.field4472 >> 6) + (class153.field2204 + var5.field1144[0] >> 6 << 14) + (var5.field6766 << 28);
                if (var5.field388 == -1) {
                    class84.field1266[arg0] = var5.field1076.method493((byte) 120);
                } else {
                    class84.field1266[arg0] = var5.field388;
                }
                class189.field2713[arg0] = var5.field1096;
                if (var5.field423 > 0) {
                    class159.method967(arg1 ^ 0x2E5, var5);
                }
                class310.field4235[arg0] = null;
                if (arg2.method801((byte) -87, 1) != 0) {
                    class456.method2636(arg2, arg0, (byte) -19);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg2.method801((byte) -87, 3);
            int var7 = var5.field1144[0];
            int var8 = var5.field1140[0];
            if (var6 == 0) {
                var8--;
                var7--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var7++;
                var8--;
            } else if (var6 == 3) {
                var7--;
            } else if (var6 == 4) {
                var7++;
            } else if (var6 == 5) {
                var8++;
                var7--;
            } else if (var6 == 6) {
                var8++;
            } else if (var6 == 7) {
                var7++;
                var8++;
            }
            if (var3) {
                var5.field396 = var7;
                var5.field425 = var8;
            } else {
                var5.field396 = -1;
                var5.method196(var8, var7, (byte) -126, class238.field3357[arg0]);
            }
        } else if (var4 == 2) {
            int var9 = arg2.method801((byte) -87, 4);
            int var10 = var5.field1144[0];
            int var11 = var5.field1140[0];
            if (var9 == 0) {
                var10 -= 2;
                var11 -= 2;
            } else if (var9 == 1) {
                var10--;
                var11 -= 2;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var10++;
                var11 -= 2;
            } else if (var9 == 4) {
                var10 += 2;
                var11 -= 2;
            } else if (var9 == 5) {
                var11--;
                var10 -= 2;
            } else if (var9 == 6) {
                var11--;
                var10 += 2;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var11++;
                var10 -= 2;
            } else if (var9 == 10) {
                var10 += 2;
                var11++;
            } else if (var9 == 11) {
                var11 += 2;
                var10 -= 2;
            } else if (var9 == 12) {
                var10--;
                var11 += 2;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var11 += 2;
                var10++;
            } else if (var9 == 15) {
                var11 += 2;
                var10 += 2;
            }
            if (var3) {
                var5.field396 = var10;
                var5.field425 = var11;
            } else {
                var5.field396 = -1;
                var5.method196(var11, var10, (byte) -127, class238.field3357[arg0]);
            }
        } else {
            int var12 = arg2.method801((byte) -87, 1);
            if (var12 == 0) {
                int var13 = arg2.method801((byte) -87, 12);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field1144[0] + var15;
                int var18 = var5.field1140[0] + var16;
                if (var3) {
                    var5.field396 = var17;
                    var5.field425 = var18;
                } else {
                    var5.field396 = -1;
                    var5.method196(var18, var17, (byte) -119, class238.field3357[arg0]);
                }
                var5.field6766 = (byte) (var5.field6766 + var14 & 0x3);
                if (class327.field4523 == arg0) {
                    class76.field1161 = var5.field6766;
                }
            } else {
                int var19 = arg2.method801((byte) -87, 30);
                int var20 = var19 >> 28;
                if (arg1 == -16) {
                    int var21 = (var19 & 0xFFFCD77) >> 14;
                    int var22 = var19 & 0x3FFF;
                    int var23 = (class153.field2204 + var21 + var5.field1144[0] & 0x3FFF) - class153.field2204;
                    int var24 = (class325.field4472 + var22 + var5.field1140[0] & 0x3FFF) - class325.field4472;
                    if (var3) {
                        var5.field396 = var23;
                        var5.field425 = var24;
                    } else {
                        var5.field396 = -1;
                        var5.method196(var24, var23, (byte) -126, class238.field3357[arg0]);
                    }
                    var5.field6766 = (byte) (var5.field6766 + var20 & 0x3);
                    if (class327.field4523 == arg0) {
                        class76.field1161 = var5.field6766;
                    }
                }
            }
        }
    }

    static {
        new class112("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }
}
