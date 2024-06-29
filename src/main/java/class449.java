import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class449 {

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public int field6160 = 128;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public int field6162 = 128;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public int field6154;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public int field6156;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "Lem;")
    public static class206 field6165 = new class206(37, -2);

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    public static int field6164;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lda", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6166;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2559(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILsea;)V", line = 3)
    public static final void method2553(int arg0, class648 arg1) {
        field6164++;
        class636.field8791 = arg1;
        if (arg0 != 2) {
            method2558(-112);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Llda;I)V", line = 15)
    public final void method2554(class449 arg0, int arg1) {
        field6161++;
        this.field6156 = arg0.field6156;
        this.field6158 = arg0.field6158;
        if (arg1 != -238) {
            method2555(-59, null, (byte) -114);
        }
        this.field6155 = arg0.field6155;
        this.field6160 = arg0.field6160;
        this.field6154 = arg0.field6154;
        this.field6162 = arg0.field6162;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILr;B)Z", line = 32)
    public static final boolean method2555(int arg0, class166 arg1, byte arg2) {
        field6157++;
        int var3 = (class401.field5620 - 104) / 2;
        int var4 = (class257.field3508 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class659.method3701(arg0, var58, var6, (byte) -51, var57)) {
                        int var59 = var58;
                        if (class467.method2640(var6, var57, (byte) 127)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class650.method3660(var57, var59, -110, var6);
                        }
                    }
                }
            }
        }
        if (arg2 != 106) {
            method2555(-82, null, (byte) -36);
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class265.field3585 = arg1.method175(var7, 0, 512, 512, 512);
        class486.method2762(0);
        int var9 = (int) (Math.random() * 20.0D) + 238 - (10 - (((int) (Math.random() * 20.0D) + -10 + 238 << 16) - -(238 - (-((int) (Math.random() * 20.0D)) - -10) << 8))) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x2F03FF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class624.field8652 + 1 + 2][class624.field8652 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class624.field8652) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class624.field8652) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class624.field8652 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class624.field8652 + var36;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg1.method200(0, 0, class624.field8652 * 4 + var37, class624.field8652 * 4 + var38);
                arg1.method101(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class624.field8652; var50++) {
                        for (int var56 = 0; var56 <= class624.field8652; var56++) {
                            var12[var50][var56] = class659.method3701(arg0, var43, var39 + var50, (byte) -51, var40 + var56);
                        }
                    }
                    class497.field6766[var43].method322(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class593.field8303) {
                        for (int var51 = -4; var51 < class624.field8652; var51++) {
                            for (int var52 = -4; var52 < class624.field8652; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class659.method3701(arg0, var43, var53, (byte) -51, var54)) {
                                    int var55 = var43;
                                    if (class467.method2640(var53, var54, (byte) -20)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class89.method653(var51 * 4 + var37, arg1, var55, var10, true, (class624.field8652 - var52) * 4 + var38 - 4, var54, var53, var9);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class593.field8303) {
                    class380 var44 = class151.field2218[arg0];
                    for (int var45 = 0; var45 < class624.field8652; var45++) {
                        for (int var46 = 0; var46 < class624.field8652; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field5064[var47 - var44.field5069][var48 - var44.field5070];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method1170(-1713569622, 4, var45 * 4 + var37, 4, (class624.field8652 - var46) * 4 + var38 - 4, -28207);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method1172(4, 66, (class624.field8652 - var46) * 4 + var38 - 4, var37 - -(var45 * 4), -1713569622);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method1171(var45 * 4 + var37 + 3, 4, true, (class624.field8652 - var46) * 4 + var38 - 4, -1713569622);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method1172(4, arg2 - 17, (-var46 + class624.field8652) * 4 + var38 + 3 + -4, var37 + (var45 * 4), -1713569622);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method1171(var45 * 4 + var37, 4, true, var38 + ((class624.field8652 - var46) * 4) - 4, -1713569622);
                            }
                        }
                    }
                }
                arg1.method110(var37, var38, class624.field8652 * 4, class624.field8652 * 4, var11, 2);
                class265.field3585.method936((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class624.field8652 * 4), class624.field8652 * 4, class624.field8652 * 4, var37, var38);
            }
        }
        arg1.method193();
        arg1.method101(-16777215);
        class314.method1905(-101);
        class65.field855 = 0;
        class342.field4590.method1444(-27547);
        if (!class593.field8303) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; var21 <= arg0 + 1 && var21 <= 3; var21++) {
                        if (class659.method3701(arg0, var21, var14, (byte) -51, var20)) {
                            class526 var22 = (class526) class423.method2445(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class526) class610.method3421(var21, var14, var20, field6166 == null ? (field6166 = method2559("kj")) : field6166);
                            }
                            if (var22 == null) {
                                var22 = (class526) class119.method848(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class526) class41.method365(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class301 var23 = class475.field6543.method2685(var22.method211((byte) 127), arg2 - 160);
                                if (!var23.field4097 || class21.field239) {
                                    int var24 = var23.field4136;
                                    if (var23.field4113 != null) {
                                        for (int var25 = 0; var25 < var23.field4113.length; var25++) {
                                            if (var23.field4113[var25] != -1) {
                                                class301 var26 = class475.field6543.method2685(var23.field4113[var25], -72);
                                                if (var26.field4136 >= 0) {
                                                    var24 = var26.field4136;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class165 var28 = class123.field1685.method3709((byte) 95, var24);
                                            if (var28 != null && var28.field2391) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class151.field2218[var21].field5064;
                                            int var32 = class151.field2218[var21].field5069;
                                            int var33 = class151.field2218[var21].field5070;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 104 - 1) && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class531.field7179[class65.field855] = var23.field4131;
                                        class584.field8242[class65.field855] = var29;
                                        class527.field7146[class65.field855] = var30;
                                        class65.field855++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class451.field6190 != null) {
                class565.field7749.field8990 = 1;
                class123.field1685.method3707((byte) -121, 64, 1024);
                for (int var15 = 0; var15 < class451.field6190.field6742; var15++) {
                    int var16 = class451.field6190.field6741[var15];
                    if (var16 >> 28 == class143.field2063.field4053) {
                        int var17 = ((var16 & 0xFFFFBB6) >> 14) - class498.field6774;
                        int var18 = (var16 & 0x3FFF) - class613.field8555;
                        if (var17 >= 0 && class401.field5620 > var17 && var18 >= 0 && var18 < class257.field3508) {
                            class342.field4590.method1441(new class72(var15), 0);
                        } else {
                            class165 var19 = class123.field1685.method3709((byte) 97, class451.field6190.field6747[var15]);
                            if (var19.field2366 != null && (var19.field2411 + var17) >= 0 && class401.field5620 > (var19.field2380 + var17) && var19.field2388 + var18 >= 0 && class257.field3508 > var18 + var19.field2403) {
                                class342.field4590.method1441(new class72(var15), 0);
                            }
                        }
                    }
                }
                class123.field1685.method3707((byte) -28, 64, 128);
                class565.field7749.field8990 = 2;
                class565.field7749.method3628((byte) -14);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Llda;", line = 480)
    public final class449 method2556(byte arg0) {
        if (arg0 == 100) {
            field6163++;
            return new class449(this.field6158, this.field6160, this.field6162, this.field6156, this.field6154, this.field6155);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 494)
    public static final String method2557(Throwable arg0, byte arg1) throws IOException {
        field6159++;
        String var3;
        if (arg0 instanceof class287) {
            class287 var2 = (class287) arg0;
            var3 = var2.field3956 + " | ";
            arg0 = var2.field3954;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != 125) {
            return null;
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V", line = 565)
    public static void method2558(int arg0) {
        field6165 = null;
        if (arg0 != 0) {
            method2555(77, null, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(I)V", line = 585)
    public class449(int arg0) {
        this.field6158 = arg0;
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(IIIIII)V", line = 595)
    private class449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6154 = arg4;
        this.field6155 = arg5;
        this.field6156 = arg3;
        this.field6162 = arg2;
        this.field6158 = arg0;
        this.field6160 = arg1;
    }
}
