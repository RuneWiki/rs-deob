import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class204 extends class273 {

    @OriginalMember(owner = "client!el", name = "V", descriptor = "I")
    private int field3083 = 1;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    private int field3080 = 204;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    private int field3071 = 1;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "I")
    public static int field3084 = -1;

    @OriginalMember(owner = "client!el", name = "bb", descriptor = "Z")
    public static boolean field3089 = false;

    @OriginalMember(owner = "client!el", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field3090 = new String[1000];

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!el", name = "X", descriptor = "[S")
    public static short[] field3085;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "[[B")
    public static byte[][] field3079;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(CI)Z", line = 4)
    public static final boolean method1367(char arg0, int arg1) {
        if (arg1 != 1) {
            method1369(true, true, (String) null);
        }
        field3081++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 26)
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[BIII[Lwb;ZIII)V", line = 30)
    public static final void method1368(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class294[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field3082++;
        if (arg9 != -13873) {
            field3088 = 16;
        }
        class303 var11 = new class303(arg2);
        int var12 = -1;
        while (true) {
            int var13 = var11.method2025(773950960);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method2003(126);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method2043((byte) -128);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg1 == var18 && arg5 <= var17 && var17 < arg5 + 8 && var16 >= arg4 && var16 < arg4 + 8) {
                    class17 var22 = class277.method1819((byte) -64, var12);
                    int var23 = class175.method1186(arg0, var22.field212, var16 & 0x7, var22.field187, var17 & 0x7, var20, (byte) -128) + arg8;
                    int var24 = class273.method1791(var22.field212, false, var17 & 0x7, var20, var16 & 0x7, var22.field187, arg0) + arg10;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class294 var25 = null;
                        if (!arg7) {
                            int var26 = arg3;
                            if ((class305.field4784[1][var23][var24] & 0x2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg6[var26];
                            }
                        }
                        class231.method1585(arg0 + var20 & 0x3, arg9 + 13749, arg7, var23, !arg7, var24, arg3, var21, var12, arg3, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZZLjava/lang/String;)V", line = 112)
    public static final void method1369(boolean arg0, boolean arg1, String arg2) {
        field3087++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class179.field2736.method1249(arg2, 250);
        int var7 = class179.field2736.method1229(arg2, 250) * 13;
        if (class333.field5166) {
            class238.method1636(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var3 + var7, 0);
            class238.method1621(var5 - var3, -var3 + var4, var3 + var3 + var6, var3 + var7 - -var3, 16777215);
        } else {
            class57.method375(var5 - var3, -var3 + var4, var3 + var3 + var6, var7 - (-var3 + -var3), 0);
            class57.method388(var5 - var3, -var3 + var4, var3 + var3 + var6, var7 - -var3 + var3, 16777215);
        }
        if (!arg1) {
            method1370(-55);
        }
        class179.field2736.method1236(arg2, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class136.method928(713, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, var4 - var3);
        if (!arg0) {
            class117.method804(var7, var4, 122, var5, var6);
        } else if (class333.field5166) {
            class333.method2319();
        } else {
            try {
                Graphics var8 = class302.field4665.getGraphics();
                class42.field594.method29(0, var8, 0, 30365);
            } catch (Exception var10) {
                class302.field4665.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I", line = 168)
    public final int[] method331(int arg0, int arg1) {
        field3072++;
        if (arg1 != -14650) {
            field3089 = false;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            for (int var4 = 0; var4 < class27.field346; var4++) {
                int var5 = class151.field2384[var4];
                int var6 = class96.field1473[arg0];
                int var7 = this.field3071 * var5 >> 12;
                int var8 = var5 % (4096 / this.field3071) * this.field3071;
                int var9 = this.field3083 * var6 >> 12;
                int var10 = var6 % (4096 / this.field3083) * this.field3083;
                if (var10 < this.field3080) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field3080) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field3080) {
                    int var11;
                    for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 254)
    public static final void method1370(int arg0) {
        int var1 = class230.field3713.method2072(8, false);
        if (var1 < class175.field2678) {
            for (int var2 = var1; var2 < class175.field2678; var2++) {
                class101.field1572[class4.field54++] = class174.field2645[var2];
            }
        }
        field3075++;
        if (class175.field2678 < var1) {
            throw new RuntimeException("gppov1");
        }
        class175.field2678 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class174.field2645[var3];
            class82 var5 = class64.field966[var4];
            int var6 = class230.field3713.method2072(1, false);
            if (var6 == 0) {
                class174.field2645[class175.field2678++] = var4;
                var5.field527 = class343.field5341;
            } else {
                int var7 = class230.field3713.method2072(2, false);
                if (var7 == 0) {
                    class174.field2645[class175.field2678++] = var4;
                    var5.field527 = class343.field5341;
                    class105.field1619[class142.field2248++] = var4;
                } else if (var7 == 1) {
                    class174.field2645[class175.field2678++] = var4;
                    var5.field527 = class343.field5341;
                    int var12 = class230.field3713.method2072(3, false);
                    var5.method276((byte) -111, var12, 1);
                    int var13 = class230.field3713.method2072(1, false);
                    if (var13 == 1) {
                        class105.field1619[class142.field2248++] = var4;
                    }
                } else if (var7 == 2) {
                    class174.field2645[class175.field2678++] = var4;
                    var5.field527 = class343.field5341;
                    if (class230.field3713.method2072(1, false) == 1) {
                        int var8 = class230.field3713.method2072(3, false);
                        var5.method276((byte) -108, var8, 2);
                        int var9 = class230.field3713.method2072(3, false);
                        var5.method276((byte) -66, var9, 2);
                    } else {
                        int var10 = class230.field3713.method2072(3, false);
                        var5.method276((byte) -100, var10, 0);
                    }
                    int var11 = class230.field3713.method2072(1, false);
                    if (var11 == 1) {
                        class105.field1619[class142.field2248++] = var4;
                    }
                } else if (var7 == 3) {
                    class101.field1572[class4.field54++] = var4;
                }
            }
        }
        if (arg0 != 2) {
            field3079 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(III)Luh;", line = 369)
    public static final class75 method1371(int arg0, int arg1, int arg2) {
        if (arg1 != 7) {
            method1373(true);
        }
        field3074++;
        class75 var3 = (class75) class161.field2496.method1558((long) arg2 | (long) arg0 << 32, false);
        if (var3 == null) {
            var3 = new class75(arg0, arg2);
            class161.field2496.method1550(var3, var3.field2852, (byte) 107);
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(Z)V", line = 392)
    public static void method1372(boolean arg0) {
        field3090 = null;
        field3079 = (byte[][]) null;
        if (arg0) {
            field3089 = true;
        }
        field3085 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BILgn;)V", line = 404)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field3078++;
        if (arg0 < 27) {
            return;
        }
        if (arg1 == 0) {
            this.field3071 = arg2.method2043((byte) -113);
        } else if (arg1 == 1) {
            this.field3083 = arg2.method2043((byte) -116);
        } else if (arg1 == 2) {
            this.field3080 = arg2.method1994(false);
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(Z)V", line = 458)
    public static final void method1373(boolean arg0) {
        class78.field1162.method1298((byte) 110);
        field3077++;
        if (arg0) {
            field3090 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V", line = 469)
    public static final void method1374(int arg0, int arg1) {
        class326.method2218(class326.field5068, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        field3073++;
        class326.method2212(-50.0F, -60.0F, -50.0F);
        class326.method2217(class326.field5071, 0, false);
        if (arg1 != 8212) {
            method1372(true);
        }
        class326.method2213();
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)[Lng;", line = 484)
    public static final class245[] method1375(int arg0) {
        field3076++;
        class245[] var1 = new class245[class246.field3862];
        if (arg0 != 255) {
            return (class245[]) null;
        }
        for (int var2 = 0; var2 < class246.field3862; var2++) {
            int var3 = class68.field1011[var2] * class107.field1652[var2];
            byte[] var4 = class46.field644[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class154.field2417[class311.method2135(var4[var6], 255)];
            }
            if (class333.field5166) {
                var1[var2] = new class186(class116.field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], var5);
            } else {
                var1[var2] = new class178(class116.field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], var5);
            }
        }
        class345.method2394((byte) -92);
        return var1;
    }
}
