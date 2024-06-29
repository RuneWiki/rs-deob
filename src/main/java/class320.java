import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class320 {

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
    public int field4572 = -1;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "Lkaa;")
    public static class47 field4560 = new class47(14, -1);

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Z")
    public static boolean field4567 = false;

    @OriginalMember(owner = "client!uea", name = "s", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    private int field4564;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "J")
    private long field4559;

    @OriginalMember(owner = "client!uea", name = "w", descriptor = "J")
    private long field4580;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "Z")
    public boolean field4574;

    @OriginalMember(owner = "client!uea", name = "t", descriptor = "[I")
    private int[] field4577;

    @OriginalMember(owner = "client!uea", name = "u", descriptor = "[I")
    public int[] field4578;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lki;IIIIIILla;Lvga;Lha;II)Lka;", line = 6)
    public final class475 method1937(class709 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class456 arg7, class86 arg8, class59 arg9, int arg10, int arg11) {
        field4571++;
        int var13 = arg1;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg7.field6229[arg3];
            var13 = arg1 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class37 var25 = arg8.method661(-61, var23);
            if (var25 != null) {
                var15 |= var25.method296(var24, -76);
                var14 |= var25.method301(1, var24);
                var17 |= var25.method298(1, var24);
                var16 |= arg7.field6228;
            }
            if ((arg7.field6227 || class37.field529) && arg4 != -1 && arg7.field6229.length > arg4) {
                int var26 = arg7.field6229[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class37 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg8.method661(-57, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method296(var28, -121);
                    var14 |= var29.method301(1, var28);
                    var17 |= var29.method298(1, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg6 | (long) arg11 << 32 | (long) (arg10 << 16);
        class65 var32 = class66.field825;
        class475 var33;
        synchronized (class66.field825) {
            var33 = (class475) class66.field825.method552(4, var30);
        }
        if (var33 == null || arg9.method405(var33.method214(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method410(var13, var33.method214());
            }
            class538[] var35 = new class538[3];
            int var36 = 0;
            if (!arg0.method3981(1645, arg6).method1019((byte) -123) || !arg0.method3981(1645, arg10).method1019((byte) -123) || !arg0.method3981(1645, arg11).method1019((byte) -123)) {
                return null;
            }
            class538 var37 = arg0.method3981(1645, arg6).method1015(73);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class538 var38 = arg0.method3981(1645, arg10).method1015(70);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class538 var39 = arg0.method3981(1645, arg11).method1015(118);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class538 var41 = new class538(var35, var36);
            var33 = arg9.method401(var41, var40, class694.field9658, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class445.field6119.length; var43++) {
                    if (this.field4578[var42] < class445.field6119[var43][var42].length) {
                        var33.method206(class434.field5978[var43][var42], class445.field6119[var43][var42][this.field4578[var42]]);
                    }
                }
            }
            var33.method190(var13);
            class65 var44 = class66.field825;
            synchronized (class66.field825) {
                class66.field825.method556((byte) 0, var30, var33);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            int var45 = -15 % ((-arg2 - 66) / 35);
            class475 var46 = var33.method171((byte) 4, var13, true);
            return arg7.method2591(arg1, arg5, arg3, var46, false, arg4);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 163)
    private final void method1938(byte arg0) {
        field4575++;
        this.field4559 = -1L;
        long[] var2 = class534.field7035;
        this.field4559 = this.field4559 >>> 8 ^ var2[(int) ((this.field4559 ^ (long) (this.field4564 >> 8)) & 0xFFL)];
        this.field4559 = var2[(int) (((long) this.field4564 ^ this.field4559) & 0xFFL)] ^ this.field4559 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4559 = this.field4559 >>> 8 ^ var2[(int) (((long) (this.field4577[var3] >> 24) ^ this.field4559) & 0xFFL)];
            this.field4559 = this.field4559 >>> 8 ^ var2[(int) ((this.field4559 ^ (long) (this.field4577[var3] >> 16)) & 0xFFL)];
            this.field4559 = var2[(int) (((long) (this.field4577[var3] >> 8) ^ this.field4559) & 0xFFL)] ^ this.field4559 >>> 8;
            this.field4559 = this.field4559 >>> 8 ^ var2[(int) ((this.field4559 ^ (long) this.field4577[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4559 = var2[(int) (((long) this.field4578[var4] ^ this.field4559) & 0xFFL)] ^ this.field4559 >>> 8;
        }
        this.field4559 = var2[(int) (((long) (this.field4574 ? 1 : 0) ^ this.field4559) & 0xFFL)] ^ this.field4559 >>> 8;
        if (arg0 > -10) {
            this.method1937(null, -3, 57, 125, 107, 73, 51, null, null, null, -37, -70);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILla;Lvga;Lki;IBILha;Lbj;Luq;Lhf;I)Lka;", line = 200)
    public final class475 method1939(int arg0, class456 arg1, class86 arg2, class709 arg3, int arg4, byte arg5, int arg6, class59 arg7, class245 arg8, class163 arg9, class400 arg10, int arg11) {
        field4563++;
        if (this.field4572 != -1) {
            return arg10.method2358(this.field4572, 8881).method1198(arg7, arg11, (byte) -63, arg8, null, arg2, arg6, arg0, arg1, arg4);
        }
        int var13 = arg11;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg11 | 0x20;
            Object var21 = null;
            int var22 = arg1.field6229[arg0];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class37 var25 = arg2.method661(-97, var23);
            if (var25 != null) {
                var15 |= var25.method296(var24, -3);
                var14 |= var25.method301(1, var24);
                var17 |= var25.method298(1, var24);
                var16 |= arg1.field6228;
            }
            if ((arg1.field6227 || class37.field529) && arg6 != -1 && arg6 < arg1.field6229.length) {
                int var26 = arg1.field6229[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class37 var29 = var23 == var27 ? var25 : arg2.method661(-119, var27);
                if (var29 != null) {
                    var15 |= var29.method296(var28, -70);
                    var14 |= var29.method301(1, var28);
                    var17 |= var29.method298(1, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        int var30 = -15 / (-arg5 / 62);
        class65 var31 = class66.field825;
        class475 var32;
        synchronized (class66.field825) {
            var32 = (class475) class66.field825.method552(4, this.field4559);
        }
        if (var32 == null || arg7.method405(var32.method214(), var13) != 0) {
            if (var32 != null) {
                var13 = arg7.method410(var13, var32.method214());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field4577[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((var36 & Integer.MIN_VALUE) != 0 && !arg3.method3981(1645, var36 & 0x3FFFFFFF).method1019((byte) -123)) {
                        var34 = true;
                    }
                } else if (!arg9.method1165((byte) 101, var36 & 0x3FFFFFFF).method3255((byte) 106, this.field4574)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class538[] var37 = new class538[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field4577[var39];
                if ((var40 & 0x40000000) != 0) {
                    class538 var42 = arg9.method1165((byte) 120, var40 & 0x3FFFFFFF).method3252(false, this.field4574);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class538 var41 = arg3.method3981(1645, var40 & 0x3FFFFFFF).method1015(106);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            class538 var43 = new class538(var37, var38);
            int var44 = var13 | 0x4000;
            var32 = arg7.method401(var43, var44, class694.field9658, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                for (int var46 = 0; var46 < class445.field6119.length; var46++) {
                    if (this.field4578[var45] < class445.field6119[var46][var45].length) {
                        var32.method206(class434.field5978[var46][var45], class445.field6119[var46][var45][this.field4578[var45]]);
                    }
                }
            }
            var32.method190(var13);
            class65 var47 = class66.field825;
            synchronized (class66.field825) {
                class66.field825.method556((byte) 0, this.field4559, var32);
            }
        }
        if (arg1 == null) {
            return var32;
        } else {
            var32.method171((byte) 4, var13, true);
            return arg1.method2591(arg11, arg4, arg0, var32, false, arg6);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 403)
    public static final void method1940(int arg0) {
        field4566++;
        if (arg0 != 1) {
            method1940(-99);
        }
        class416.field5742 = true;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIILuq;)V", line = 420)
    public final void method1941(int arg0, int arg1, int arg2, class163 arg3) {
        field4561++;
        if (arg0 == -1) {
            this.field4577[arg1] = 0;
        } else if (arg3.method1165((byte) 66, arg0) == null) {
            return;
        } else {
            this.field4577[arg1] = class446.method2556(1073741824, arg0);
            this.method1938((byte) -119);
        }
        if (arg2 != 15073) {
            field4576 = -27;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 445)
    public static final String method1942(int arg0, String[] arg1, int arg2, int arg3) {
        field4565++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg0 != -30907) {
                field4560 = null;
            }
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZIIIIII)V", line = 514)
    public static final void method1943(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4579++;
        if (!arg0) {
            method1945(15, null);
        }
        int var7 = class586.field7665;
        int[] var8 = class20.field351;
        class43.field565 = 0;
        for (int var9 = 0; var9 < (class306.field4404 + var7); var9++) {
            class166 var37 = null;
            class742 var38;
            if (var9 < var7) {
                var38 = class248.field3438[var8[var9]];
            } else {
                var38 = ((class134) class390.field5470.method2135((long) class628.field8351[var9 - var7], (byte) 31)).field2154;
                var37 = ((class556) var38).field7328;
                if (var37.field2575 != null) {
                    var37 = var37.method1190((byte) 95, class74.field901);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field10223 >= 0 && (class405.field5645 == var38.field10258 || class472.field6475.field3508 == var38.field3508)) {
                class475.method2682(var38, var38.method3091(true), arg3 >> 1, arg4, arg1 >> 1, 0, arg6);
                if (class259.field3621[0] >= 0) {
                    if (var38.field10267 != null && (var7 <= var9 || class719.field10021 == 0 || class719.field10021 == 3 || class719.field10021 == 1 && class385.method2286(((class383) var38).field5334, 116)) && class43.field565 < class163.field2479) {
                        class163.field2470[class43.field565] = class105.field1446.method3001(-1, var38.field10267) / 2;
                        class163.field2469[class43.field565] = class259.field3621[0];
                        class163.field2472[class43.field565] = class259.field3621[1];
                        class163.field2482[class43.field565] = var38.field10271;
                        class163.field2474[class43.field565] = var38.field10275;
                        class163.field2480[class43.field565] = var38.field10294;
                        class163.field2476[class43.field565] = var38.field10267;
                        class43.field565++;
                    }
                    int var39 = class259.field3621[1] + arg5;
                    int var50;
                    if (var38.field10252 || class29.field474 >= var38.field10229) {
                        var50 = var39 - Math.max(class105.field1446.field7147, class250.field3448[0].method1043());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var9 < var7) {
                            class383 var42 = class248.field3438[var8[var9]];
                            var43 = var38.method4141(0).field1216;
                            if (var42.field5349) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field2551;
                            if (var43 == -1) {
                                var43 = var38.method4141(0).field1216;
                            }
                        }
                        class133[] var44 = class250.field3448;
                        if (var43 != -1) {
                            class133[] var45 = (class133[]) class34.field503.method552(4, (long) var43);
                            if (var45 == null) {
                                class720[] var46 = class720.method4047(class84.field1023, var43, 0);
                                if (var46 != null) {
                                    var45 = new class133[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class341.field4807.method415(var46[var47], true);
                                    }
                                    class34.field503.method556((byte) 0, (long) var43, var45);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var44.length <= var41) {
                            var41 = 1;
                        }
                        class133 var48 = var44[0];
                        class133 var49 = var44[var41];
                        var50 = var39 - Math.max(class105.field1446.field7147, var48.method1043());
                        int var51 = class259.field3621[0] + arg2 - (var48.method1042() >> 1);
                        int var52 = var48.method1042() * var38.field10251 / 255;
                        int var53 = var48.method1043();
                        if (var38.field10251 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method1035(var51, var50);
                        class341.field4807.method433(var51, var50, var51 + var52, var50 + var53);
                        var49.method1035(var51, var50);
                        class341.field4807.method419(arg2, arg5, arg1 + arg2, arg3 + arg5);
                        class62.method539(var48.method1036() + var51, var51, (byte) -55, var50 + var53, var50);
                    }
                    var50 -= 2;
                    if (!var38.field10252) {
                        if (var38.field10303 > class29.field474) {
                            class133 var54 = class432.field5948[var38.field10264 ? 2 : 0];
                            class133 var55 = class432.field5948[var38.field10264 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if ((var38 instanceof class556)) {
                                var57 = var37.field2581;
                                if (var57 == -1) {
                                    var57 = var38.method4141(0).field1259;
                                }
                            } else {
                                var57 = var38.method4141(0).field1259;
                            }
                            if (var57 != -1) {
                                class133[] var58 = (class133[]) class384.field5375.method552(4, (long) var57);
                                if (var58 == null) {
                                    class720[] var59 = class720.method4047(class84.field1023, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class133[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class341.field4807.method415(var59[var60], true);
                                        }
                                        class384.field5375.method556((byte) 0, (long) var57, var58);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var55 = var58[var38.field10264 ? 3 : 1];
                                    var54 = var58[var38.field10264 ? 2 : 0];
                                }
                            }
                            int var61 = var38.field10303 - class29.field474;
                            int var64;
                            if (var61 > var38.field10225) {
                                int var62 = var61 - var38.field10225;
                                int var63 = var38.field10262 == 0 ? 0 : (var38.field10253 - var62) / var38.field10262 * var38.field10262;
                                var64 = var54.method1042() * var63 / var38.field10253;
                            } else {
                                var64 = var54.method1042();
                            }
                            int var65 = var54.method1043();
                            var50 -= var65;
                            int var66 = class259.field3621[0] + arg2 - (var54.method1042() >> 1);
                            var54.method1035(var66, var50);
                            class341.field4807.method433(var66, var50, var64 + var66, var50 + var65);
                            var55.method1035(var66, var50);
                            class341.field4807.method419(arg2, arg5, arg1 + arg2, arg3 + arg5);
                            class62.method539(var66 + var54.method1036(), var66, (byte) -61, var50 + var65, var50);
                            var50 -= 2;
                        }
                        if (var7 > var9) {
                            class383 var68 = (class383) var38;
                            if (var68.field5346 != -1) {
                                var50 -= 25;
                                class133 var69 = class630.field8391[var68.field5346];
                                var69.method1035(class259.field3621[0] + arg2 - 12, var50);
                                class62.method539((class259.field3621[0] + arg2 + var69.method1036()) - 12, arg2 - -class259.field3621[0] - 12, (byte) -38, var50 + var69.method1048(), var50);
                                var50 -= 2;
                            }
                            if (var68.field5344 != -1) {
                                var50 -= 25;
                                class133 var70 = class512.field6794[var68.field5344];
                                var70.method1035(class259.field3621[0] + arg2 - 12, var50);
                                class62.method539(class259.field3621[0] + arg2 + var70.method1036() - 12, class259.field3621[0] + arg2 + -12, (byte) -123, var50 + var70.method1048(), var50);
                                var50 -= 2;
                            }
                        } else if (var37.field2542 >= 0 && class512.field6794.length > var37.field2542) {
                            var50 -= 25;
                            class133 var67 = class512.field6794[var37.field2542];
                            var67.method1035(class259.field3621[0] + arg2 - (var67.method1042() >> 1), var50);
                            class62.method539(arg2 + class259.field3621[0] - (var67.method1042() >> 1) + var67.method1036(), class259.field3621[0] + arg2 + -(var67.method1042() >> 1), (byte) -107, var50 + var67.method1048(), var50);
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!var38 instanceof class383) {
                        int var77 = 0;
                        class317[] var78 = class27.field435;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class317 var179 = var78[var79];
                            if (var179 != null && var179.field4526 == 1 && class628.field8351[var9 - var7] == var179.field4521) {
                                class133 var180 = class308.field4434[var179.field4524];
                                if (var77 < var180.method1043()) {
                                    var77 = var180.method1043();
                                }
                                if (class29.field474 % 20 < 10) {
                                    var180.method1035(arg2 + class259.field3621[0] - 12, -var180.method1043() + var50);
                                    class62.method539(arg2 + class259.field3621[0] + var180.method1036() - 12, arg2 + -12 + class259.field3621[0], (byte) -111, var50 - (var180.method1043() - var180.method1048()), var50 - var180.method1043());
                                }
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var71 = 0;
                        class317[] var72 = class27.field435;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class317 var75 = var72[var73];
                            if (var75 != null && var75.field4526 == 10 && var8[var9] == var75.field4521) {
                                class133 var76 = class308.field4434[var75.field4524];
                                if (var76.method1043() > var71) {
                                    var71 = var76.method1043();
                                }
                                var76.method1035(arg2 + class259.field3621[0] - 12, -var76.method1043() + var50);
                                class62.method539(arg2 + (class259.field3621[0] + var76.method1036()) - 12, class259.field3621[0] + arg2 - 12, (byte) -98, -var76.method1043() + (var50 + var76.method1048()), var50 + -var76.method1043());
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    }
                    for (int var81 = 0; var81 < class43.field571; var81++) {
                        int var82 = var38.field10248[var81];
                        int var83 = var38.field10283[var81];
                        class237 var84 = null;
                        int var85 = 0;
                        if (var83 >= 0) {
                            if (var82 <= class29.field474) {
                                continue;
                            }
                            var84 = class468.field6422.method1549(64, var38.field10283[var81]);
                            var85 = var84.field3332;
                        } else if (var82 < 0) {
                            continue;
                        }
                        int var86 = var38.field10246[var81];
                        class237 var87 = null;
                        if (var86 >= 0) {
                            var87 = class468.field6422.method1549(64, var86);
                        }
                        if (class29.field474 >= var82 - var85) {
                            int var88 = var38.field10259[var81];
                            if (var88 >= 0) {
                                var38.field10229 = class29.field474 + 300;
                                var38.field10251 = var88;
                                var38.field10259[var81] = -1;
                            }
                            if (var84 == null) {
                                var38.field10248[var81] = -1;
                            } else {
                                int var89 = var38.method3091(true) / 2;
                                class475.method2682(var38, var89, arg3 >> 1, arg4, arg1 >> 1, 0, arg6);
                                if (class259.field3621[0] > -1) {
                                    class259.field3621[0] += class239.field3374[var81];
                                    class259.field3621[1] += class176.field2656[var81];
                                    Object var90 = null;
                                    Object var91 = null;
                                    Object var92 = null;
                                    Object var93 = null;
                                    int var94 = 0;
                                    int var95 = 0;
                                    int var96 = 0;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    class133 var102 = null;
                                    class133 var103 = null;
                                    class133 var104 = null;
                                    class133 var105 = null;
                                    int var106 = 0;
                                    int var107 = 0;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    class133 var115 = var84.method1490(-1, class341.field4807);
                                    if (var115 != null) {
                                        var94 = var115.method1042();
                                        int var116 = var115.method1043();
                                        var115.method1046(class684.field9558);
                                        if (var116 > var114) {
                                            var114 = var116;
                                        }
                                        var98 = class684.field9558[0];
                                    }
                                    class133 var117 = var84.method1492(true, class341.field4807);
                                    if (var117 != null) {
                                        var95 = var117.method1042();
                                        int var118 = var117.method1043();
                                        if (var118 > var114) {
                                            var114 = var118;
                                        }
                                        var117.method1046(class684.field9558);
                                        var99 = class684.field9558[0];
                                    }
                                    class133 var119 = var84.method1493(-1, class341.field4807);
                                    if (var119 != null) {
                                        var96 = var119.method1042();
                                        int var120 = var119.method1043();
                                        var119.method1046(class684.field9558);
                                        if (var114 < var120) {
                                            var114 = var120;
                                        }
                                        var100 = class684.field9558[0];
                                    }
                                    class133 var121 = var84.method1497(class341.field4807, -74);
                                    if (var121 != null) {
                                        var97 = var121.method1042();
                                        int var122 = var121.method1043();
                                        var121.method1046(class684.field9558);
                                        if (var114 < var122) {
                                            var114 = var122;
                                        }
                                        var101 = class684.field9558[0];
                                    }
                                    if (var87 != null) {
                                        var102 = var87.method1490(-1, class341.field4807);
                                        if (var102 != null) {
                                            var106 = var102.method1042();
                                            int var123 = var102.method1043();
                                            if (var114 < var123) {
                                                var114 = var123;
                                            }
                                            var102.method1046(class684.field9558);
                                            var110 = class684.field9558[0];
                                        }
                                        var103 = var87.method1492(true, class341.field4807);
                                        if (var103 != null) {
                                            var107 = var103.method1042();
                                            int var124 = var103.method1043();
                                            if (var124 > var114) {
                                                var114 = var124;
                                            }
                                            var103.method1046(class684.field9558);
                                            var111 = class684.field9558[0];
                                        }
                                        var104 = var87.method1493(-1, class341.field4807);
                                        if (var104 != null) {
                                            var108 = var104.method1042();
                                            int var125 = var104.method1043();
                                            var104.method1046(class684.field9558);
                                            if (var125 > var114) {
                                                var114 = var125;
                                            }
                                            var112 = class684.field9558[0];
                                        }
                                        var105 = var87.method1497(class341.field4807, -96);
                                        if (var105 != null) {
                                            var109 = var105.method1042();
                                            int var126 = var105.method1043();
                                            if (var126 > var114) {
                                                var114 = var126;
                                            }
                                            var105.method1046(class684.field9558);
                                            var113 = class684.field9558[0];
                                        }
                                    }
                                    class60 var127 = class275.field3832;
                                    class60 var128 = class275.field3832;
                                    class539 var129 = class304.field4337;
                                    int var130 = var84.field3334;
                                    class539 var131 = class304.field4337;
                                    if (var130 >= 0) {
                                        class60 var132 = class382.method2251(var130, class341.field4807, (byte) 58, true);
                                        class539 var133 = class582.method3184(class341.field4807, var130, 27198);
                                        if (var132 != null && var133 != null) {
                                            var127 = var132;
                                            var129 = var133;
                                        }
                                    }
                                    if (var87 != null) {
                                        int var134 = var87.field3334;
                                        if (var134 >= 0) {
                                            class60 var135 = class382.method2251(var134, class341.field4807, (byte) 58, true);
                                            class539 var136 = class582.method3184(class341.field4807, var134, 27198);
                                            if (var135 != null && var136 != null) {
                                                var128 = var135;
                                                var131 = var136;
                                            }
                                        }
                                    }
                                    Object var137 = null;
                                    String var138 = null;
                                    boolean var139 = false;
                                    int var140 = 0;
                                    String var141 = var84.method1496((byte) 43, var38.field10285[var81]);
                                    int var142 = var129.method3001(-1, var141);
                                    if (var87 != null) {
                                        var138 = var87.method1496((byte) 43, var38.field10280[var81]);
                                        var140 = var131.method3001(-1, var138);
                                    }
                                    int var143 = 0;
                                    if (var95 > 0) {
                                        var143 = var142 / var95 + 1;
                                    }
                                    int var144 = 0;
                                    if (var87 != null && var107 > 0) {
                                        var144 = var140 / var107 + 1;
                                    }
                                    int var145 = 0;
                                    int var146 = var145;
                                    if (var94 > 0) {
                                        var145 += var94;
                                    }
                                    var145 += 2;
                                    int var147 = var145;
                                    if (var96 > 0) {
                                        var145 += var96;
                                    }
                                    int var148 = var145;
                                    int var149 = var145;
                                    int var151;
                                    if (var95 > 0) {
                                        int var150 = var95 * var143;
                                        var149 = (var150 - var142) / 2 + var145;
                                        var151 = var145 + var150;
                                    } else {
                                        var151 = var142 + var145;
                                    }
                                    int var152 = var151;
                                    if (var97 > 0) {
                                        var151 += var97;
                                    }
                                    int var153 = 0;
                                    int var154 = 0;
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    if (var87 != null) {
                                        var151 += 2;
                                        var153 = var151;
                                        if (var106 > 0) {
                                            var151 += var106;
                                        }
                                        var151 += 2;
                                        var154 = var151;
                                        if (var108 > 0) {
                                            var151 += var108;
                                        }
                                        var155 = var151;
                                        var157 = var151;
                                        if (var107 > 0) {
                                            int var158 = var107 * var144;
                                            var157 = (var158 - var140) / 2 + var151;
                                            var151 += var158;
                                        } else {
                                            var151 += var140;
                                        }
                                        var156 = var151;
                                        if (var109 > 0) {
                                            var151 += var109;
                                        }
                                    }
                                    int var159 = var38.field10248[var81] - class29.field474;
                                    int var160 = var84.field3339 - (var84.field3339 * var159 / var84.field3332);
                                    int var161 = var84.field3331 * var159 / var84.field3332 - var84.field3331;
                                    int var162 = class259.field3621[0] + arg2 + var160 - (var151 >> 1);
                                    int var163 = class259.field3621[1] + var161 + arg5 - 12;
                                    int var164 = var163;
                                    int var165 = var163 + var114;
                                    int var166 = var163 + var84.field3345 + 15;
                                    int var167 = var166 - var129.field7147;
                                    int var168 = var129.field7145 + var166;
                                    if (var163 > var167) {
                                        var164 = var167;
                                    }
                                    if (var165 < var168) {
                                        var165 = var168;
                                    }
                                    int var169 = 0;
                                    if (var87 != null) {
                                        var169 = var87.field3345 + var163 + 15;
                                        int var170 = var169 - var131.field7147;
                                        int var171 = var169 + var131.field7145;
                                        if (var164 > var170) {
                                            var164 = var170;
                                        }
                                        if (var165 < var171) {
                                            var165 = var171;
                                        }
                                    }
                                    int var172 = 255;
                                    if (var84.field3344 >= 0) {
                                        var172 = (var159 << 8) / (var84.field3332 - var84.field3344);
                                    }
                                    if (var172 >= 0 && var172 < 255) {
                                        int var173 = var172 << 24;
                                        int var174 = var173 | 0xFFFFFF;
                                        if (var115 != null) {
                                            var115.method1045(var162 + var146 - var98, var163, 0, var174, 1);
                                        }
                                        if (var119 != null) {
                                            var119.method1045(var147 + var162 - var100, var163, 0, var174, 1);
                                        }
                                        if (var117 != null) {
                                            for (int var175 = 0; var175 < var143; var175++) {
                                                var117.method1045(var95 * var175 + var148 + var162 - var99, var163, 0, var174, 1);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method1045(var162 + var152 - var101, var163, 0, var174, 1);
                                        }
                                        var127.method527(true, var149 + var162, var141, var166, 0, var173 | var84.field3348);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method1045(var162 - (var110 - var153), var163, 0, var174, 1);
                                            }
                                            if (var104 != null) {
                                                var104.method1045(var154 + var162 - var112, var163, 0, var174, 1);
                                            }
                                            if (var103 != null) {
                                                for (int var176 = 0; var176 < var144; var176++) {
                                                    var103.method1045(var107 * var176 + (var162 + var155) - var111, var163, 0, var174, 1);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method1045(var156 + var162 - var113, var163, 0, var174, 1);
                                            }
                                            var128.method527(true, var157 + var162, var138, var169, 0, var87.field3348 | var173);
                                        }
                                    } else {
                                        if (var115 != null) {
                                            var115.method1035(var162 + var146 - var98, var163);
                                        }
                                        if (var119 != null) {
                                            var119.method1035(var162 + var147 - var100, var163);
                                        }
                                        if (var117 != null) {
                                            for (int var177 = 0; var177 < var143; var177++) {
                                                var117.method1035(var95 * var177 + var162 + var148 - var99, var163);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method1035(var152 + var162 - var101, var163);
                                        }
                                        var127.method527(true, var149 + var162, var141, var166, 0, var84.field3348 | 0xFF000000);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method1035(var153 + var162 - var110, var163);
                                            }
                                            if (var104 != null) {
                                                var104.method1035(var154 + var162 - var112, var163);
                                            }
                                            if (var103 != null) {
                                                for (int var178 = 0; var178 < var144; var178++) {
                                                    var103.method1035(var107 * var178 + var155 + var162 - var111, var163);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method1035(var156 + var162 - var113, var163);
                                            }
                                            var128.method527(arg0, var157 + var162, var138, var169, 0, var87.field3348 | 0xFF000000);
                                        }
                                    }
                                    class62.method539(var151 + var162, var162, (byte) -76, var165 + 1, var164);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class690.field9615; var10++) {
            int var33 = class459.field6265[var10];
            class742 var34;
            if (var33 < 2048) {
                var34 = class248.field3438[var33];
            } else {
                var34 = ((class134) class390.field5470.method2135((long) (var33 - 2048), (byte) 31)).field2154;
            }
            int var35 = class28.field441[var10];
            class742 var36;
            if (var35 < 2048) {
                var36 = class248.field3438[var35];
            } else {
                var36 = ((class134) class390.field5470.method2135((long) (var35 - 2048), (byte) 31)).field2154;
            }
            class43.method315(var36, arg4, arg1, --var34.field10300, arg2, arg5, var34, arg3, !arg0, arg6);
        }
        int var11 = class105.field1446.field7147 + class105.field1446.field7145 + 2;
        for (int var12 = 0; var12 < class43.field565; var12++) {
            int var13 = class163.field2469[var12];
            int var14 = class163.field2472[var12];
            int var15 = class163.field2470[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((var14 + 2) > (class163.field2472[var32] - var11) && (class163.field2472[var32] + 2) > (var14 - var11) && var13 - var15 < class163.field2470[var32] + class163.field2469[var32] && (class163.field2469[var32] - class163.field2470[var32]) < (var13 + var15) && class163.field2472[var32] - var11 < var14) {
                        var14 = class163.field2472[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class163.field2472[var12] = var14;
            String var17 = class163.field2476[var12];
            int var18 = class105.field1446.method3001(-1, var17);
            int var19 = arg2 + var13;
            int var20 = arg5 + var14 - class105.field1446.field7147;
            int var21 = var18 + var19;
            int var22 = arg5 + var14 + class105.field1446.field7145;
            if (class185.field2794 == 0) {
                int var23 = 16776960;
                if (class163.field2482[var12] < 6) {
                    var23 = class601.field7896[class163.field2482[var12]];
                }
                if (class163.field2482[var12] == 6) {
                    var23 = (class405.field5645 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class163.field2482[var12] == 7) {
                    var23 = (class405.field5645 % 20) >= 10 ? 65535 : 255;
                }
                if (class163.field2482[var12] == 8) {
                    var23 = class405.field5645 % 20 < 10 ? 45056 : 8454016;
                }
                if (class163.field2482[var12] == 9) {
                    int var24 = 150 - class163.field2480[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16384000 + 16776960 - (var24 * 327680);
                    } else if (var24 < 150) {
                        var23 = (var24 - 100) * 5 + 65280;
                    }
                }
                if (class163.field2482[var12] == 10) {
                    int var25 = 150 - class163.field2480[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - ((var25 - 50) * 327680);
                    } else if (var25 < 150) {
                        var23 = var25 * 327680 + 255 - (32768000 - -((var25 + -100) * 5));
                    }
                }
                if (class163.field2482[var12] == 11) {
                    int var26 = 150 - class163.field2480[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = (var26 - 50) * 327685 + 65280;
                    } else if (var26 < 150) {
                        var23 = 49545215 - (var26 * 327680);
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class163.field2474[var12] == 0) {
                    class64.field785.method513(arg2 + var13, 86, var17, arg5 + var14, var27, -16777216);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                }
                if (class163.field2474[var12] == 1) {
                    class64.field785.method514(class405.field5645, arg2 + var13, var17, false, -16777216, arg5 + var14, var27);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    var20 -= 5;
                    var22 += 5;
                }
                if (class163.field2474[var12] == 2) {
                    var20 -= 5;
                    class64.field785.method520(arg5 + var14, -16777216, var17, arg2 + var13, var27, class405.field5645, -1750);
                    var21 -= (var18 >> 1) - 5;
                    var22 += 5;
                    var19 -= (var18 >> 1) + 5;
                }
                if (class163.field2474[var12] == 3) {
                    var20 -= 7;
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    class64.field785.method533(arg2 + var13, var27, class405.field5645, -16777216, 150 - class163.field2480[var12], arg5 + var14, var17, (byte) -40);
                    var22 += 7;
                }
                if (class163.field2474[var12] == 4) {
                    int var28 = (150 - class163.field2480[var12]) * (class105.field1446.method3001(-1, var17) + 100) / 150;
                    class341.field4807.method433(arg2 + var13 - 50, arg5, arg2 + var13 + 50, arg3 + arg5);
                    var21 += 50 - var28;
                    var19 += 50 - var28;
                    class64.field785.method527(true, arg2 + var13 + 50 - var28, var17, arg5 + var14, -16777216, var27);
                    class341.field4807.method419(arg2, arg5, arg2 + arg1, arg3 + arg5);
                }
                if (class163.field2474[var12] == 5) {
                    int var29 = 150 - class163.field2480[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class105.field1446.field7147 + class105.field1446.field7145;
                    class341.field4807.method433(arg2, arg5 + var14 - var31 - 1, arg1 + arg2, var14 + arg5 + 5);
                    var21 -= var18 >> 1;
                    var20 += var30;
                    var22 += var30;
                    class64.field785.method513(arg2 + var13, -91, var17, arg5 + var30 + var14, var27, -16777216);
                    var19 -= var18 >> 1;
                    class341.field4807.method419(arg2, arg5, arg1 + arg2, arg3 + arg5);
                }
            } else {
                class64.field785.method513(arg2 + var13, -122, var17, arg5 + var14, -256, -16777216);
                var19 -= var18 >> 1;
                var21 -= var18 >> 1;
            }
            class62.method539(var21 + 1, var19, (byte) -60, var22 + 1, var20);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lvga;IZLuq;ILha;I[ILbj;I[Lrca;Lla;Lhf;IIIILki;Lid;ILla;)Lka;", line = 1681)
    public final class475 method1944(class86 arg0, int arg1, boolean arg2, class163 arg3, int arg4, class59 arg5, int arg6, int[] arg7, class245 arg8, int arg9, class458[] arg10, class456 arg11, class400 arg12, int arg13, int arg14, int arg15, int arg16, class709 arg17, class586 arg18, int arg19, class456 arg20) {
        field4562++;
        if (this.field4572 != -1) {
            return arg12.method2358(this.field4572, 8881).method1191(arg7, arg20, 32, null, arg9, arg18, arg11, arg13, arg6, arg15, arg8, arg14, arg19, arg5, arg1, arg16, arg10, arg0);
        }
        int var22 = arg9;
        long var23 = this.field4559;
        int[] var25 = this.field4577;
        if (arg20 != null && (arg20.field6246 >= 0 || arg20.field6224 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field4577[var26];
            }
            if (arg20.field6246 >= 0) {
                if (arg20.field6246 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class446.method2556(1073741824, arg20.field6246);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg20.field6224 >= 0) {
                if (arg20.field6224 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class446.method2556(arg20.field6224, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg20 != null || arg11 != null;
        int var31 = arg10 == null ? 0 : arg10.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class563.field7377[var32] = null;
            if (arg10[var32] != null) {
                class456 var33 = arg0.method663((byte) -90, arg10[var32].field6262);
                if (var33.field6229 != null) {
                    class447.field6134[var32] = var33;
                    var30 = true;
                    int var34 = arg10[var32].field6257;
                    int var35 = arg10[var32].field6261;
                    int var36 = var33.field6229[var34];
                    class563.field7377[var32] = arg0.method661(-42, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class490.field6651[var32] = var37;
                    if (class563.field7377[var32] != null) {
                        var28 |= class563.field7377[var32].method296(var37, -12);
                        var27 |= class563.field7377[var32].method301(1, var37);
                        var29 |= class563.field7377[var32].method298(1, var37);
                    }
                    if ((var33.field6227 || class37.field529) && var35 != -1 && var33.field6229.length > var35) {
                        class347.field4875[var32] = var33.field6225[var34];
                        class64.field786[var32] = arg10[var32].field6256;
                        int var38 = var33.field6229[var35];
                        class723.field10070[var32] = arg0.method661(-114, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class29.field465[var32] = var39;
                        if (class723.field10070[var32] != null) {
                            var28 |= class723.field10070[var32].method296(var39, -48);
                            var27 |= class723.field10070[var32].method301(1, var39);
                            var29 |= class723.field10070[var32].method298(1, var39);
                        }
                    } else {
                        class347.field4875[var32] = 0;
                        class64.field786[var32] = 0;
                        class723.field10070[var32] = null;
                        class29.field465[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class37 var43 = null;
        class37 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class37 var48 = null;
        class37 var49 = null;
        if (var30) {
            var22 = arg9 | 0x20;
            if (arg20 != null) {
                int var50 = arg20.field6229[arg13];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg0.method661(-51, var51);
                if (var43 != null) {
                    var28 |= var43.method296(var40, -88);
                    var27 |= var43.method301(1, var40);
                    var29 |= var43.method298(1, var40);
                }
                if ((arg20.field6227 || class37.field529) && arg6 != -1 && arg6 < arg20.field6229.length) {
                    var42 = arg20.field6225[arg13];
                    int var52 = arg20.field6229[arg6];
                    int var53 = var52 >>> 16;
                    var41 = var52 & 0xFFFF;
                    var44 = var51 == var53 ? var43 : arg0.method661(-106, var53);
                    if (var44 != null) {
                        var28 |= var44.method296(var41, -89);
                        var27 |= var44.method301(1, var41);
                        var29 |= var44.method298(1, var41);
                    }
                }
            }
            if (arg11 != null) {
                int var54 = arg11.field6229[arg14];
                int var55 = var54 >>> 16;
                var45 = var54 & 0xFFFF;
                var48 = arg0.method661(-105, var55);
                if (var48 != null) {
                    var28 |= var48.method296(var45, -37);
                    var27 |= var48.method301(1, var45);
                    var29 |= var48.method298(1, var45);
                }
                if ((arg11.field6227 || class37.field529) && arg19 != -1 && arg11.field6229.length > arg19) {
                    var47 = arg11.field6225[arg14];
                    int var56 = arg11.field6229[arg19];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg0.method661(-124, var57);
                    if (var49 != null) {
                        var28 |= var49.method296(var46, -33);
                        var27 |= var49.method301(1, var46);
                        var29 |= var49.method298(1, var46);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class65 var58 = class600.field7880;
        class475 var59;
        synchronized (class600.field7880) {
            var59 = (class475) class600.field7880.method552(4, var23);
        }
        class98 var60 = null;
        if (this.field4564 != -1) {
            var60 = arg18.method3205(-20408, this.field4564);
        }
        if (var59 == null || arg5.method405(var59.method214(), var22) != 0) {
            if (var59 != null) {
                var22 = arg5.method410(var22, var59.method214());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var64) != 0 && !arg17.method3981(1645, var64 & 0x3FFFFFFF).method1014((byte) 113)) {
                        var62 = true;
                    }
                } else if (!arg3.method1165((byte) 73, var64 & 0x3FFFFFFF).method3243(true, this.field4574)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field4580 != -1L) {
                    class65 var82 = class600.field7880;
                    synchronized (class600.field7880) {
                        var59 = (class475) class600.field7880.method552(4, this.field4580);
                    }
                }
                if (var59 == null || arg5.method405(var59.method214(), var22) != 0) {
                    return null;
                }
            } else {
                class538[] var65 = new class538[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class538 var68 = arg3.method1165((byte) 112, var67 & 0x3FFFFFFF).method3245(15580, this.field4574);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    } else if ((var67 & Integer.MIN_VALUE) != 0) {
                        class538 var69 = arg17.method3981(1645, var67 & 0x3FFFFFFF).method1018(69);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    }
                }
                if (var60 != null && var60.field1238 != null) {
                    for (int var70 = 0; var70 < var60.field1238.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field1238[var70] != null) {
                                var75 = var60.field1238[var70][4] << 3;
                                var72 = var60.field1238[var70][1];
                                var74 = var60.field1238[var70][3] << 3;
                                var76 = var60.field1238[var70][5] << 3;
                                var71 = var60.field1238[var70][0];
                                var73 = var60.field1238[var70][2];
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method2990(12, var76, var75, var74);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method2981(var71, var72, 0, var73);
                            }
                        }
                    }
                }
                int var77 = var22 | 0x4000;
                class538 var78 = new class538(var65, var65.length);
                var59 = arg5.method401(var78, var77, class694.field9658, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class445.field6119.length; var80++) {
                        if (class445.field6119[var80][var79].length > this.field4578[var79]) {
                            var59.method206(class434.field5978[var80][var79], class445.field6119[var80][var79][this.field4578[var79]]);
                        }
                    }
                }
                if (arg2) {
                    var59.method190(var22);
                    class65 var81 = class600.field7880;
                    synchronized (class600.field7880) {
                        class600.field7880.method556((byte) 0, var23, var59);
                    }
                    this.field4580 = var23;
                }
            }
        }
        class475 var83 = var59.method171((byte) 4, var22, true);
        boolean var84 = false;
        if (arg7 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg7[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class333[] var86 = null;
        if (var60 != null) {
            var86 = var60.method727(arg5, (byte) -123);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method191(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        if (arg4 <= 72) {
            field4560 = null;
        }
        int var89 = 1;
        while (var88 < var31) {
            if (class563.field7377[var88] != null) {
                var83.method2677(0, class64.field786[var88] - 1, class347.field4875[var88], class29.field465[var88], false, class490.field6651[var88], var89, 0, null, class723.field10070[var88], class563.field7377[var88]);
            }
            var88++;
            var89 <<= 0x1;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg7[var90] != -1) {
                    int var91 = arg7[var90] - arg16;
                    int var92 = var91 & 0x3FFF;
                    class333 var93 = arg5.method421();
                    var93.method1713(var92);
                    var83.method191(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method191(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2673(var49, var48, var40, var47, var41, arg15 - 1, var46, false, var44, var45, (byte) 115, arg20.field6245, var43, arg1 - 1, var42);
        } else if (var43 != null) {
            var83.method2675(-86, var43, false, var41, var42, var40, 0, arg15 - 1, var44);
        } else if (var48 != null) {
            var83.method2675(-119, var48, false, var46, var47, var45, 0, arg1 - 1, var49);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class563.field7377[var95] = null;
            class723.field10070[var95] = null;
            class447.field6134[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILkn;)V", line = 2225)
    public static final void method1945(int arg0, class742 arg1) {
        field4573++;
        int var2 = arg1.field10231 - class29.field474;
        int var3 = arg1.field10230 * 512 + (arg1.method2256(-1) * 256);
        if (arg0 != 512) {
            method1945(115, null);
        }
        int var4 = arg1.field10241 * 512 + arg1.method2256(-1) * 256;
        arg1.field3502 += (var4 - arg1.field3502) / var2;
        arg1.field3505 += (var3 - arg1.field3505) / var2;
        arg1.field10313 = 0;
        if (arg1.field10274 == 0) {
            arg1.method4132(false, 8192);
        }
        if (arg1.field10274 == 1) {
            arg1.method4132(false, 12288);
        }
        if (arg1.field10274 == 2) {
            arg1.method4132(false, 0);
        }
        if (arg1.field10274 == 3) {
            arg1.method4132(false, 4096);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z[IIII[I)V", line = 2266)
    public final void method1946(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg2 < 24) {
            this.field4559 = -126L;
        }
        if (this.field4564 != arg4) {
            this.field4564 = arg4;
        }
        field4570++;
        this.field4578 = arg5;
        this.field4577 = arg1;
        this.field4572 = arg3;
        this.field4574 = arg0;
        this.method1938((byte) -100);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V", line = 2286)
    public final void method1947(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4578[arg0] = arg2;
            field4558++;
            this.method1938((byte) -11);
        }
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)V", line = 2300)
    public static void method1948(byte arg0) {
        if (arg0 != -119) {
            field4576 = -96;
        }
        field4560 = null;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IZ)V", line = 2310)
    public final void method1949(int arg0, boolean arg1) {
        field4569++;
        if (arg0 == 0) {
            this.field4574 = arg1;
            this.method1938((byte) -25);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILki;II)V", line = 2322)
    public final void method1950(int arg0, class709 arg1, int arg2, int arg3) {
        field4568++;
        int var5 = class293.field4203[arg2];
        if (arg1.method3981(1645, arg0) == null) {
            return;
        }
        this.field4577[var5] = class446.method2556(arg0, Integer.MIN_VALUE);
        this.method1938((byte) -112);
        if (arg3 <= 35) {
            this.method1939(-80, null, null, null, -80, (byte) -63, -67, null, null, null, null, -60);
        }
    }
}
