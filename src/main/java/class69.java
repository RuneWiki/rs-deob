import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class69 extends class626 {

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field1243;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field1245;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[I")
    public int[] field1238;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[I")
    public int[] field1241;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "[I")
    public int[] field1244;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[Lav;")
    public class637[] field1235;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "[Lav;")
    public class637[] field1242;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[[[B")
    public byte[][][] field1237;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method716(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILha;I)Z", line = 6)
    public static final boolean method713(int arg0, class58 arg1, int arg2) {
        field1243++;
        int var3 = (class174.field2540 - 104) / 2;
        int var4 = (class716.field9999 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class328.method2096(var6, (byte) -73, var58, var57, arg0)) {
                        int var59 = var58;
                        if (class634.method3647(-119, var57, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class202.method1410(-1, var6, var57, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class459.field6628 = arg1.method561(512, var7, 0, 512, 58, 512);
        class205.method1430(arg2 - 67);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) - (-((int) (Math.random() * 20.0D)) + -238 - -10) | 0xFF000000;
        int var10 = 238 - (10 - ((int) (Math.random() * 20.0D))) | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class752.field10483 + 3][class752.field10483 + 1 + 2];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class752.field10483) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class752.field10483) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = var13 + class752.field10483;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class752.field10483 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg1.method584(0, 0, var37 + (class752.field10483 * 4), var38 - -(class752.field10483 * 4));
                arg1.method617(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class752.field10483; var50++) {
                        for (int var56 = 0; var56 <= class752.field10483; var56++) {
                            var12[var50][var56] = class328.method2096(var39 + var50, (byte) -73, var43, var40 + var56, arg0);
                        }
                    }
                    class173.field2511[var43].method1091(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class671.field9408) {
                        for (int var51 = -4; var51 < class752.field10483; var51++) {
                            for (int var52 = -4; var52 < class752.field10483; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var4 <= var54 && class328.method2096(var53, (byte) -73, var43, var54, arg0)) {
                                    int var55 = var43;
                                    if (class634.method3647(-42, var54, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class411.method2503(var51 * 4 + var37, var9, var53, var55, var10, (class752.field10483 - var52) * 4 + var38 - 4, var54, arg1, 3);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class671.field9408) {
                    class716 var44 = class630.field9041[arg0];
                    for (int var45 = 0; var45 < class752.field10483; var45++) {
                        for (int var46 = 0; var46 < class752.field10483; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field9991[var47 - var44.field9992][var48 - var44.field10004];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method542(4, 4, 3854, -1713569622, (class752.field10483 - var46) * 4 + (var38 - 4), var45 * 4 + var37);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method525((class752.field10483 - var46) * 4 + var38 - 4, 4, -1713569622, arg2 ^ -3482, var45 * 4 + var37);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method569(false, var45 * 4 + var37 + 3, -1713569622, (class752.field10483 - var46) * 4 + var38 - 4, 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method525((class752.field10483 - var46) * 4 + var38 + 3 - 4, 4, -1713569622, -3482, var45 * 4 + var37);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method569(false, var37 + (var45 * 4), -1713569622, (class752.field10483 - var46) * 4 + var38 - 4, 4);
                            }
                        }
                    }
                }
                arg1.method630(var37, var38, class752.field10483 * 4, class752.field10483 * 4, var11, 2);
                class459.field6628.method88((var13 - var3) * 4 + 48, 464 - class752.field10483 * 4 + -((-var4 + var36) * 4), class752.field10483 * 4, class752.field10483 * 4, var37, var38);
            }
        }
        arg1.method601();
        arg1.method617(-16777215);
        class237.method1608(true);
        class569.field8092 = arg2;
        class175.field2544.method1530((byte) 121);
        if (!class671.field9408) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; var21 <= (arg0 + 1) && var21 <= 3; var21++) {
                        if (class328.method2096(var14, (byte) -73, var21, var20, arg0)) {
                            class141 var22 = (class141) class158.method1202(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class141) class470.method2853(var21, var14, var20, field1245 == null ? (field1245 = method716("wk")) : field1245);
                            }
                            if (var22 == null) {
                                var22 = (class141) class654.method3688(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class141) class140.method1107(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class414 var23 = class66.field1181.method131(2, var22.method1109((byte) -120));
                                if (!var23.field5786 || class399.field5585) {
                                    int var24 = var23.field5712;
                                    if (var23.field5720 != null) {
                                        for (int var25 = 0; var25 < var23.field5720.length; var25++) {
                                            if (var23.field5720[var25] != -1) {
                                                class414 var26 = class66.field1181.method131(2, var23.field5720[var25]);
                                                if (var26.field5712 >= 0) {
                                                    var24 = var26.field5712;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class524 var28 = class399.field5581.method2641(var24, arg2 ^ 0x61);
                                            if (var28 != null && var28.field7441) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class630.field9041[var21].field9991;
                                            int var32 = class630.field9041[var21].field9992;
                                            int var33 = class630.field9041[var21].field10004;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 103 > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class262.field3834[class569.field8092] = var23.field5711;
                                        class78.field1463[class569.field8092] = var29;
                                        class561.field7960[class569.field8092] = var30;
                                        class569.field8092++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class609.field8826 != null) {
                class14.field167.field3022 = 1;
                class399.field5581.method2642(64, 1024, (byte) -50);
                for (int var15 = 0; var15 < class609.field8826.field10481; var15++) {
                    int var16 = class609.field8826.field10479[var15];
                    if ((var16 >> 28) == class468.field6748.field649) {
                        int var17 = ((var16 & 0xFFFD6DF) >> 14) - class115.field1845;
                        int var18 = (var16 & 0x3FFF) - class64.field1160;
                        if (var17 >= 0 && var17 < class174.field2540 && var18 >= 0 && class716.field9999 > var18) {
                            class175.field2544.method1526(new class528(var15), 79);
                        } else {
                            class524 var19 = class399.field5581.method2641(class609.field8826.field10480[var15], arg2 ^ 0x68);
                            if (var19.field7440 != null && var19.field7439 + var17 >= 0 && (var19.field7435 + var17) < class174.field2540 && var19.field7433 + var18 >= 0 && class716.field9999 > var19.field7426 + var18) {
                                class175.field2544.method1526(new class528(var15), arg2 + 112);
                            }
                        }
                    }
                }
                class399.field5581.method2642(64, 128, (byte) -50);
                class14.field167.field3022 = 2;
                class14.field167.method1464((byte) 95);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIIII)I", line = 454)
    public static final int method714(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1236++;
        if (class138.field2153 == null) {
            return 0;
        }
        int var6 = 89 / ((arg0 + 29) / 57);
        if (arg5 < 3) {
            int var7 = arg4 >> 9;
            int var8 = arg2 >> 9;
            if (arg3 < 0 || arg1 < 0 || (class174.field2540 - 1) < arg3 || (class716.field9999 - 1) < arg1) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || var7 > class174.field2540 - 1 || var8 > class716.field9999 - 1) {
                return 0;
            }
            boolean var9 = (class435.field6078[1][arg4 >> 9][arg2 >> 9] & 0x2) != 0;
            if ((arg4 & 0x1FF) == 0) {
                boolean var10 = (class435.field6078[1][var7 - 1][arg2 >> 9] & 0x2) != 0;
                boolean var11 = (class435.field6078[1][var7][arg2 >> 9] & 0x2) != 0;
                if (var11 != var10) {
                    var9 = (class435.field6078[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x1FF) == 0) {
                boolean var12 = (class435.field6078[1][arg4 >> 9][var8 - 1] & 0x2) != 0;
                boolean var13 = (class435.field6078[1][arg4 >> 9][var8] & 0x2) != 0;
                if (var12 != var13) {
                    var9 = (class435.field6078[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if (var9) {
                arg5++;
            }
        }
        return class138.field2153[arg5].method1827(-3458, arg4, arg2);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILs;)V", line = 521)
    public static final void method715(int arg0, class278 arg1) {
        class138.field2153[arg0] = arg1;
    }
}
