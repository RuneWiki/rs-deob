import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class291 extends class14 {

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    private final int field4993;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    private final int field4996;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    private final int field5004;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    private final int field5001;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field4995 = 0;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lwa;")
    public static class75 field4999 = class66.method560("Ausw-=hlen", false);

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lwa;")
    public static class75 field4991 = class66.method560("blinken3:", false);

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
    public static int[] field4986 = new int[4096];

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lwa;")
    private static class75 field5002;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lwa;")
    public static class75 field5003;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V", line = 5)
    public static void method2026(byte arg0) {
        field5003 = null;
        if (arg0 < 11) {
            field4986 = (int[]) null;
        }
        field4986 = null;
        field5002 = null;
        field4999 = null;
        field4991 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lre;I)V", line = 23)
    public static final void method2027(class262 arg0, int arg1) {
        field4988++;
        if (class217.field3720 == arg0.field4411) {
            class226.field3815[arg0.field4489] = true;
        }
        if (arg1 != 14580) {
            method2026((byte) -112);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V", line = 42)
    public final void method8(int arg0, int arg1, int arg2) {
        field4984++;
        int var4 = this.field4996 * arg2 >> 12;
        int var5 = this.field4993 * arg1 >> 12;
        int var6 = this.field5004 * arg2 >> 12;
        int var7 = this.field5001 * arg1 >> 12;
        if (arg0 == 100) {
            class34.method225(var6, this.field184, var7, var4, arg0 ^ 0xFFFFFF9B, this.field189, var5, this.field183);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIIII)V", line = 62)
    public static final void method2028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4985++;
        int var11 = arg2 - arg3;
        if (class39.field589 > arg2) {
            var11++;
        }
        int var12 = arg4 - arg5;
        if (class215.field3668 > arg4) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg0 + (arg1 * var13) >> 16;
            int var15 = (var13 + 1) * arg1 + arg0 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg3 + var13 >> 6;
                if (var17 >= 0 && (class153.field2631.length - 1) >= var17) {
                    int[][] var18 = class153.field2631[var17];
                    int var19 = arg7 + var14;
                    byte[][] var20 = class272.field4690[var17];
                    int var21 = arg7 + var15;
                    byte[][] var22 = class297.field5081[var17];
                    byte[][] var23 = class245.field4123[var17];
                    byte[][] var24 = class283.field4875[var17];
                    byte[][] var25 = class89.field1469[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = (var26 + 1) * arg10 + arg8 >> 16;
                        int var28 = arg8 + (arg10 * var26) >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg9 + var27;
                            int var31 = arg5 + var26 >> 6;
                            int var32 = arg5 + var26 & 0x3F;
                            int var33 = arg9 + var28;
                            int var34 = arg3 + var13 & 0x3F;
                            int var35 = (var32 << 6) + var34;
                            int var36;
                            if (var31 < 0 || var31 > (var18.length - 1) || var18[var31] == null) {
                                if (class236.field3981.field2970 != -1) {
                                    var36 = class236.field3981.field2970;
                                } else if ((arg3 + var13 & 0x4) == (arg5 + var26 & 0x4)) {
                                    var36 = class82.field1375[class253.field4242 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || var18.length - 1 < var31) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class44.method291(var19, var33, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var18[var31][var35];
                            }
                            int var37 = var20[var31] == null ? 0 : class82.field1375[var20[var31][var35] & 0xFF];
                            int var38 = var23[var31] == null ? 0 : class82.field1375[var23[var31][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            if (var37 == 0 && var38 == 0) {
                                class44.method291(var19, var33, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var31] == null ? 0 : var22[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class44.method291(var19, var33, var16, var29, var37);
                                    } else {
                                        class164.method1226((byte) -47, var39 & 0x3, var29, var40 >> 2, var37, var16, true, var19, class44.field721, var33, var36);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var25[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class44.method291(var19, var33, var16, var29, var38);
                                    }
                                    class164.method1226((byte) -47, var41 & 0x3, var29, var42 >> 2, var38, var16, var37 == 0, var19, class44.field721, var33, 0);
                                }
                            }
                            if (var24[var31] != null) {
                                int var43 = var24[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var19;
                                    } else {
                                        var44 = var21 - 1;
                                    }
                                    int var45 = 13421772;
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var33;
                                    } else {
                                        var46 = var30 - 1;
                                    }
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class44.method295(var19, var33, var29, var45);
                                    } else if (var43 == 2) {
                                        class44.method293(var19, var33, var16, var45);
                                    } else if (var43 == 3) {
                                        class44.method295(var44, var33, var29, var45);
                                    } else if (var43 == 4) {
                                        class44.method293(var19, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class44.method295(var19, var33, var29, 16777215);
                                        class44.method293(var19, var33, var16, var45);
                                    } else if (var43 == 10) {
                                        class44.method295(var44, var33, var29, 16777215);
                                        class44.method293(var19, var33, var16, var45);
                                    } else if (var43 == 11) {
                                        class44.method295(var44, var33, var29, 16777215);
                                        class44.method293(var19, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class44.method295(var19, var33, var29, 16777215);
                                        class44.method293(var19, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class44.method293(var19, var33, 1, var45);
                                    } else if (var43 == 18) {
                                        class44.method293(var44, var33, 1, var45);
                                    } else if (var43 == 19) {
                                        class44.method293(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class44.method293(var19, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class44.method293(var19 + var48, -var48 + var46, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class44.method293(var19 + var47, var33 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg7 + var14;
                    for (int var50 = 0; var50 < var12; var50++) {
                        int var51;
                        if (class236.field3981.field2970 != -1) {
                            var51 = class236.field3981.field2970;
                        } else if ((arg3 + var13 & 0x4) == (arg5 + var50 & 0x4)) {
                            var51 = class82.field1375[class253.field4242 + 1];
                        } else {
                            var51 = 4936552;
                        }
                        if (var51 == 0) {
                            var51 = 1;
                        }
                        int var52 = (arg10 * var50 + arg8 >> 16) + arg9;
                        int var53 = (arg8 + ((var50 + 1) * arg10) >> 16) + arg9;
                        int var54 = var53 - var52;
                        class44.method291(var49, var52, var16, var54, var51);
                    }
                    var10000 = arg7 + var15;
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg1 * var56 + arg0 >> 16;
            int var58 = (var56 + 1) * arg1 + arg0 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg7 + var57;
                int var61 = arg3 + var56 >> 6;
                var10000 = arg7 + var58;
                if (var61 >= 0 && class54.field887.length - 1 >= var61) {
                    short[][] var63 = class54.field887[var61];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg10 * var64 + arg8 >> 16;
                        int var66 = (var64 + 1) * arg10 + arg8 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg9 + var66;
                            int var69 = arg5 + var64 >> 6;
                            int var70 = arg9 + var65;
                            if (var69 >= 0 && (var63.length - 1) >= var69) {
                                int var71 = ((var64 + arg5 & 0x3F) << 6) + (arg3 + var56 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = var63[var69][var71] & 0x3FFF;
                                    int var73 = var63[var69][var71] >> 14 & 0x3;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class169.field2845[var72 - 1].field3996 * var67 / 4;
                                            int var75 = class169.field2845[var72 - 1].field3999 * var67 / 4;
                                            int var76 = class169.field2845[var72 - 1].field3997 * var59 / 4;
                                            class169.field2845[var72 - 1].method580(var60, var70 - var75, var76, var74);
                                        } else if (var73 == 1) {
                                            int var77 = class28.field356[var72 - 1].field3996 * var67 / 4;
                                            int var78 = class28.field356[var72 - 1].field3999 * var67 / 4;
                                            int var79 = class28.field356[var72 - 1].field3997 * var59 / 4;
                                            class28.field356[var72 - 1].method580(var60, var70 - var78, var79, var77);
                                        } else if (var73 == 2) {
                                            int var83 = class200.field3387[var72 - 1].field3997 * var59 / 4;
                                            int var84 = class200.field3387[var72 - 1].field3996 * var67 / 4;
                                            int var85 = class200.field3387[var72 - 1].field3999 * var67 / 4;
                                            class200.field3387[var72 - 1].method580(var60, var70 - var85, var83, var84);
                                        } else if (var73 == 3) {
                                            int var80 = class246.field4153[var72 - 1].field3996 * var67 / 4;
                                            int var81 = class246.field4153[var72 - 1].field3997 * var59 / 4;
                                            int var82 = class246.field4153[var72 - 1].field3999 * var67 / 4;
                                            class246.field4153[var72 - 1].method580(var60, var70 - var82, var81, var80);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6 != 729619278) {
            field5003 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 492)
    public static final void method2029(int arg0) {
        if (arg0 != 20456) {
            method2032(-97, 24, -14, 92, 8, -122, 42, -27);
        }
        field4990++;
        class66.field1145.method1201(-20111);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IIIIIII)V", line = 504)
    public class291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4993 = arg1;
        this.field4996 = arg0;
        this.field5004 = arg2;
        this.field5001 = arg3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V", line = 518)
    public final void method13(int arg0, int arg1, int arg2) {
        field4989++;
        if (arg2 < 58) {
            return;
        }
        int var4 = this.field4996 * arg0 >> 12;
        int var5 = this.field4993 * arg1 >> 12;
        int var6 = this.field5001 * arg1 >> 12;
        int var7 = this.field5004 * arg0 >> 12;
        class2.method3(this.field184, var4, 0, var6, var5, var7);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4986[var0] = class261.method1863(-1, var0);
        }
        field5002 = class66.method560("Started 3d library", false);
        field5003 = field5002;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;", line = 543)
    public static final String method2030(boolean arg0, Throwable arg1) throws IOException {
        if (!arg0) {
            return (String) null;
        }
        field5000++;
        String var2;
        if ((arg1 instanceof class25)) {
            class25 var3 = (class25) arg1;
            arg1 = var3.field324;
            var2 = var3.field321 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(III)V", line = 620)
    public static final void method2031(int arg0, int arg1, int arg2) {
        field4987++;
        class156 var3 = class206.method1525(arg1, -32701, arg0);
        var3.method1183(true);
        var3.field2665 = arg2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIII)V", line = 634)
    public static final void method2032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4994++;
        if (arg6 >= 0 && arg4 >= 0 && arg6 < 103 && arg4 < 103) {
            if (arg2 == 0) {
                class167 var8 = class134.method1036(arg5, arg6, arg4);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2814 >>> 32);
                    if (arg1 == 2) {
                        var8.field2815 = new class214(var9, 2, arg3 + 4, arg5, arg6, arg4, arg0, false, var8.field2815);
                        var8.field2809 = new class214(var9, 2, arg3 + 1 & 0x3, arg5, arg6, arg4, arg0, false, var8.field2809);
                    } else {
                        var8.field2815 = new class214(var9, arg1, arg3, arg5, arg6, arg4, arg0, false, var8.field2815);
                    }
                }
            }
            if (arg2 == 1) {
                class235 var10 = class153.method1171(arg5, arg6, arg4);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3967 >>> 32);
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field3977 = new class214(var11, 4, arg3, arg5, arg6, arg4, arg0, false, var10.field3977);
                    } else if (arg1 == 6) {
                        var10.field3977 = new class214(var11, 4, arg3 + 4, arg5, arg6, arg4, arg0, false, var10.field3977);
                    } else if (arg1 == 7) {
                        var10.field3977 = new class214(var11, 4, (arg3 + 2 & 0x3) + 4, arg5, arg6, arg4, arg0, false, var10.field3977);
                    } else if (arg1 == 8) {
                        var10.field3977 = new class214(var11, 4, arg3 + 4, arg5, arg6, arg4, arg0, false, var10.field3977);
                        var10.field3963 = new class214(var11, 4, (arg3 + 2 & 0x3) + 4, arg5, arg6, arg4, arg0, false, var10.field3963);
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class285 var12 = class188.method1423(arg5, arg6, arg4);
                if (var12 != null) {
                    var12.field4898 = new class214(Integer.MAX_VALUE & (int) (var12.field4914 >>> 32), arg1, arg3, arg5, arg6, arg4, arg0, false, var12.field4898);
                }
            }
            if (arg2 == 3) {
                class217 var13 = class287.method2021(arg5, arg6, arg4);
                if (var13 != null) {
                    var13.field3707 = new class214((int) (var13.field3704 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg5, arg6, arg4, arg0, false, var13.field3707);
                }
            }
        }
        if (arg7 < 65) {
            field4991 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZI)V", line = 730)
    public final void method4(int arg0, boolean arg1, int arg2) {
        field4998++;
        int var4 = this.field4996 * arg2 >> 12;
        int var5 = this.field4993 * arg0 >> 12;
        int var6 = this.field5004 * arg2 >> 12;
        int var7 = this.field5001 * arg0 >> 12;
        if (arg1) {
            method2029(79);
        }
        class11.method57(this.field189, var5, var7, var4, this.field183, 51, var6);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILcb;I)Lcm;", line = 749)
    public static final class181 method2033(int arg0, int arg1, class267 arg2, int arg3) {
        field4997++;
        if (class281.method1994(arg1, (byte) -7, arg0, arg2)) {
            return arg3 == 4 ? class118.method905(-1) : (class181) null;
        } else {
            return null;
        }
    }
}
