import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class291 extends class303 {

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static volatile int field4425 = 0;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4429 = "Unable to find ";

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "[I")
    public static int[] field4427;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "[Ljj;")
    private class150[] field4422;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V", line = 9)
    public static void method2035(int arg0) {
        field4429 = null;
        if (arg0 != 2) {
            method2037(-115, (class89) null);
        }
        field4427 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)[I", line = 24)
    public final int[] method67(int arg0, int arg1) {
        field4424++;
        if (arg0 != -3) {
            method2039(-124, -4, 42, -99, (class320) null, (class320) null, -19, -32, 91L);
        }
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            this.method2036(this.field4763.method396(-14579), (byte) -46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([[IB)V", line = 45)
    private final void method2036(int[][] arg0, byte arg1) {
        field4430++;
        int var3 = class70.field1108;
        int var4 = class247.field3815;
        if (arg1 != -46) {
            method2040(20, true, false, -61);
        }
        class75.method560(-15755, arg0);
        class221.method1598(class40.field724, class12.field240, 0, (byte) -100, 0);
        if (this.field4422 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4422.length; var5++) {
            class150 var6 = this.field4422[var5];
            int var7 = var6.field2408;
            int var8 = var6.field2413;
            if (var7 >= 0) {
                if (var8 < 0) {
                    var6.method1061(50, var3, var4);
                } else {
                    var6.method1060(var3, var4, false);
                }
            } else if (var8 >= 0) {
                var6.method1063(var4, 48, var3);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILwl;)V", line = 99)
    public static final void method2037(int arg0, class89 arg1) {
        field4420++;
        if (arg1.field1384 == 0 || arg0 < 91) {
            return;
        }
        class63 var2 = arg1.method640(-7);
        if (arg1.field1366 != -1 && arg1.field1366 < 32768) {
            class305 var3 = class138.field2196[arg1.field1366];
            if (var3 != null) {
                int var4 = arg1.field1442 - var3.field1442;
                int var5 = arg1.field1369 - var3.field1369;
                if (var4 != 0 || var5 != 0) {
                    arg1.field1395 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1366 >= 32768) {
            int var6 = arg1.field1366 - 32768;
            if (class60.field943 == var6) {
                var6 = 2047;
            }
            class30 var7 = class82.field1228[var6];
            if (var7 != null) {
                int var8 = arg1.field1369 - var7.field1369;
                int var9 = arg1.field1442 - var7.field1442;
                if (var9 != 0 || var8 != 0) {
                    arg1.field1395 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1435 != 0 || arg1.field1460 != 0) && (arg1.field1365 == 0 || arg1.field1389 > 0)) {
            int var10 = arg1.field1442 - ((arg1.field1435 - class177.field2780 - class177.field2780) * 64);
            int var11 = arg1.field1369 - (arg1.field1460 - class91.field1485 - class91.field1485) * 64;
            if (var10 != 0 || var11 != 0) {
                arg1.field1395 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field1435 = 0;
            arg1.field1460 = 0;
        }
        int var12 = arg1.field1395 - arg1.field1443 & 0x7FF;
        if (var12 == 0) {
            arg1.field1456 = 0;
            arg1.field1362 = 0;
        } else if (var2.field993 == 0) {
            arg1.field1456++;
            if (var12 <= 1024) {
                arg1.field1443 += arg1.field1384;
                boolean var13 = true;
                if (var12 < arg1.field1384 || 2048 - arg1.field1384 < var12) {
                    arg1.field1443 = arg1.field1395;
                    var13 = false;
                }
                if (arg1.field1453 == var2.field970 && (arg1.field1456 > 25 || var13)) {
                    if (var2.field990 == -1) {
                        arg1.field1453 = var2.field1001;
                    } else {
                        arg1.field1453 = var2.field990;
                    }
                }
            } else {
                arg1.field1443 -= arg1.field1384;
                boolean var14 = true;
                if (arg1.field1384 > var12 || var12 > (2048 - arg1.field1384)) {
                    var14 = false;
                    arg1.field1443 = arg1.field1395;
                }
                if (arg1.field1453 == var2.field970 && (arg1.field1456 > 25 || var14)) {
                    if (var2.field978 == -1) {
                        arg1.field1453 = var2.field1001;
                    } else {
                        arg1.field1453 = var2.field978;
                    }
                }
            }
            arg1.field1443 &= 0x7FF;
        } else {
            if (arg1.field1453 == var2.field970 && arg1.field1456 > 25) {
                if (var2.field990 == -1) {
                    arg1.field1453 = var2.field1001;
                } else {
                    arg1.field1453 = var2.field990;
                }
            }
            int var15 = arg1.field1395 << 5;
            if (arg1.field1397 != var15) {
                arg1.field1397 = var15;
                arg1.field1445 = 0;
                int var16 = var15 - arg1.field1420 & 0xFFFF;
                int var17 = arg1.field1362 * arg1.field1362 / (var2.field993 * 2);
                if (arg1.field1362 > 0 && var16 >= var17 && var16 - var17 < 32768) {
                    arg1.field1459 = var16 / 2;
                    arg1.field1439 = true;
                    int var18 = var2.field969 * var2.field969 / (var2.field993 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg1.field1459 > var18) {
                        arg1.field1459 = var16 - var18;
                    }
                } else if (arg1.field1362 < 0 && var17 <= (65536 - var16) && 65536 - var16 - var17 < 32768) {
                    int var19 = var2.field969 * var2.field969 / (var2.field993 * 2);
                    arg1.field1439 = true;
                    arg1.field1459 = (65536 - var16) / 2;
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field1459) {
                        arg1.field1459 = 65536 - var19 - var16;
                    }
                } else {
                    arg1.field1439 = false;
                }
            }
            if (arg1.field1362 == 0) {
                int var20 = arg1.field1397 - arg1.field1420 & 0xFFFF;
                if (var2.field993 > var20) {
                    arg1.field1420 = arg1.field1397;
                } else {
                    arg1.field1445 = 0;
                    int var21 = var2.field969 * var2.field969 / (var2.field993 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    arg1.field1439 = true;
                    if (var20 >= 32768) {
                        arg1.field1362 = -var2.field993;
                        arg1.field1459 = (65536 - var20) / 2;
                        if (var21 < arg1.field1459) {
                            arg1.field1459 = 65536 - (var20 + var21);
                        }
                    } else {
                        arg1.field1459 = var20 / 2;
                        arg1.field1362 = var2.field993;
                        if (var21 < arg1.field1459) {
                            arg1.field1459 = var20 - var21;
                        }
                    }
                }
            } else if (arg1.field1362 <= 0) {
                if (arg1.field1459 <= arg1.field1445) {
                    arg1.field1439 = false;
                }
                if (!arg1.field1439) {
                    arg1.field1362 += var2.field993;
                    if (arg1.field1362 > 0) {
                        arg1.field1362 = 0;
                    }
                } else if (arg1.field1362 > (-var2.field969)) {
                    arg1.field1362 -= var2.field993;
                }
            } else {
                if (arg1.field1459 <= arg1.field1445) {
                    arg1.field1439 = false;
                }
                if (!arg1.field1439) {
                    arg1.field1362 -= var2.field993;
                    if (arg1.field1362 < 0) {
                        arg1.field1362 = 0;
                    }
                } else if (arg1.field1362 < var2.field969) {
                    arg1.field1362 += var2.field993;
                }
            }
            arg1.field1420 += arg1.field1362;
            arg1.field1420 &= 0xFFFF;
            arg1.field1443 = arg1.field1420 >> 5;
            if (arg1.field1362 > 0) {
                arg1.field1445 += arg1.field1362;
            } else {
                arg1.field1445 -= arg1.field1362;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)V", line = 386)
    public static final void method2038(int arg0, int arg1) {
        field4423++;
        if (arg1 == 64) {
            class4 var2 = class67.method510(1, 10, arg0);
            var2.method6(255);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILpe;I)V", line = 403)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            method2037(-111, (class89) null);
        }
        if (arg2 == 0) {
            this.field4422 = new class150[arg1.method741(45)];
            for (int var4 = 0; var4 < this.field4422.length; var4++) {
                int var5 = arg1.method741(88);
                if (var5 == 0) {
                    this.field4422[var4] = class140.method1069(arg1, 4);
                } else if (var5 == 1) {
                    this.field4422[var4] = class223.method1623(arg1, true);
                } else if (var5 == 2) {
                    this.field4422[var4] = class17.method140(arg1, 0);
                } else if (var5 == 3) {
                    this.field4422[var4] = class10.method81(arg1, class29.method193(arg0, -28765));
                }
            }
        } else if (arg2 == 1) {
            this.field4773 = arg1.method741(arg0 ^ 0xFFFFF020) == 1;
        }
        field4428++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILdg;Ldg;IIJ)V", line = 475)
    public static final void method2039(int arg0, int arg1, int arg2, int arg3, class320 arg4, class320 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class189 var10 = new class189();
        var10.field3008 = arg8;
        var10.field3005 = arg1 * 128 + 64;
        var10.field3002 = arg2 * 128 + 64;
        var10.field3007 = arg3;
        var10.field2996 = arg4;
        var10.field2998 = arg5;
        var10.field2999 = arg6;
        var10.field3009 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class60.field946[var11][arg1][arg2] == null) {
                class60.field946[var11][arg1][arg2] = new class272(var11, arg1, arg2);
            }
        }
        class60.field946[arg0][arg1][arg2].field4236 = var10;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 500)
    public class291() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZZI)V", line = 504)
    public static final void method2040(int arg0, boolean arg1, boolean arg2, int arg3) {
        field4431++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        } else if (!arg1) {
            class140.field2230 = arg0;
            class141.field2238 = arg2;
            class213.field3404 = arg3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[[I", line = 524)
    public final int[][] method74(int arg0, int arg1) {
        field4426++;
        if (arg1 != 82) {
            this.method65(6, (class101) null, 57);
        }
        int[][] var3 = this.field4772.method1175(-54, arg0);
        if (this.field4772.field2488) {
            int var4 = class70.field1108;
            int var5 = class247.field3815;
            int[][][] var6 = this.field4772.method1174(122);
            int[][] var7 = new int[var5][var4];
            this.method2036(var7, (byte) -46);
            for (int var8 = 0; var8 < class247.field3815; var8++) {
                int[][] var9 = var6[var8];
                int[] var10 = var7[var8];
                int[] var11 = var9[0];
                int[] var12 = var9[1];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class70.field1108; var14++) {
                    int var15 = var10[var14];
                    var13[var14] = class280.method2001(4080, var15 << 4);
                    var12[var14] = class280.method2001(4080, var15 >> 4);
                    var11[var14] = class280.method2001(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
