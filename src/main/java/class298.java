import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class298 implements Runnable {

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lwc;")
    private class53 field4997 = new class53();

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "Z")
    private boolean field4999 = false;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public int field5001 = 0;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field5000;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lbd;")
    private static class162 field4986 = class17.method142(0, "Connection lost)3");

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field4989 = 100;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "J")
    public static long field4992 = 0L;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lbd;")
    public static class162 field4990 = class17.method142(0, ":assistreq:");

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lbd;")
    public static class162 field4983 = field4986;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "F")
    public static float field4998;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIIII)V", line = 15)
    public static final void method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5002++;
        int var11 = arg2 - arg10;
        int var12 = arg4 - arg3;
        if (arg2 < class304.field5132) {
            var11++;
        }
        if (class9.field114 > arg4) {
            var12++;
        }
        if (arg6 < 117) {
            field4983 = (class162) null;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg1 * var13 + arg0 >> 16;
            int var15 = (var13 + 1) * arg1 + arg0 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg10 + var13 >> 6;
                if (var17 >= 0 && var17 <= (class158.field2780.length - 1)) {
                    int var18 = arg9 + var15;
                    int var19 = arg9 + var14;
                    int[][] var20 = class158.field2780[var17];
                    byte[][] var21 = class190.field3244[var17];
                    byte[][] var22 = class133.field2381[var17];
                    byte[][] var23 = class269.field4503[var17];
                    byte[][] var24 = class209.field3531[var17];
                    byte[][] var25 = class259.field4315[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = (var26 + 1) * arg5 + arg8 >> 16;
                        int var28 = arg5 * var26 + arg8 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = var26 + arg3 >> 6;
                            int var31 = arg7 + var27;
                            int var32 = arg7 + var28;
                            int var33 = arg3 + var26 & 0x3F;
                            int var34 = var13 + arg10 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var30 < 0 || (var20.length - 1) < var30 || var20[var30] == null) {
                                if (class180.field3101.field3025 != -1) {
                                    var36 = class180.field3101.field3025;
                                } else if ((var13 + arg10 & 0x4) == (arg3 + var26 & 0x4)) {
                                    var36 = class222.field3713[class149.field2686 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var30 < 0 || var30 > (var20.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class316.method2174(var19, var32, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var30][var35];
                            }
                            int var37 = var22[var30] == null ? 0 : class222.field3713[var22[var30][var35] & 0xFF];
                            int var38 = var25[var30] == null ? 0 : class222.field3713[var25[var30][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            if (var38 == 0 && var37 == 0) {
                                class316.method2174(var19, var32, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    byte var39 = var24[var30] == null ? 0 : var24[var30][var35];
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class316.method2174(var19, var32, var16, var29, var38);
                                    } else {
                                        class156.method1217(var36, var16, var29, true, var40 >> 2, var32, var39 & 0x3, var38, (byte) -87, class316.field5328, var19);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var21[var30][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class316.method2174(var19, var32, var16, var29, var37);
                                    }
                                    class156.method1217(0, var16, var29, var38 == 0, var42 >> 2, var32, var41 & 0x3, var37, (byte) -87, class316.field5328, var19);
                                }
                            }
                            if (var23[var30] != null) {
                                int var43 = var23[var30][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var32;
                                    } else {
                                        var44 = var31 - 1;
                                    }
                                    int var45;
                                    if (var16 == 1) {
                                        var45 = var19;
                                    } else {
                                        var45 = var18 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var46 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class316.method2162(var19, var32, var29, var46);
                                    } else if (var43 == 2) {
                                        class316.method2153(var19, var32, var16, var46);
                                    } else if (var43 == 3) {
                                        class316.method2162(var45, var32, var29, var46);
                                    } else if (var43 == 4) {
                                        class316.method2153(var19, var44, var16, var46);
                                    } else if (var43 == 9) {
                                        class316.method2162(var19, var32, var29, 16777215);
                                        class316.method2153(var19, var32, var16, var46);
                                    } else if (var43 == 10) {
                                        class316.method2162(var45, var32, var29, 16777215);
                                        class316.method2153(var19, var32, var16, var46);
                                    } else if (var43 == 11) {
                                        class316.method2162(var45, var32, var29, 16777215);
                                        class316.method2153(var19, var44, var16, var46);
                                    } else if (var43 == 12) {
                                        class316.method2162(var19, var32, var29, 16777215);
                                        class316.method2153(var19, var44, var16, var46);
                                    } else if (var43 == 17) {
                                        class316.method2153(var19, var32, 1, var46);
                                    } else if (var43 == 18) {
                                        class316.method2153(var45, var32, 1, var46);
                                    } else if (var43 == 19) {
                                        class316.method2153(var45, var44, 1, var46);
                                    } else if (var43 == 20) {
                                        class316.method2153(var19, var44, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class316.method2153(var19 + var47, -var47 + var44, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class316.method2153(var19 + var48, var32 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg9 + var14;
                    for (int var50 = 0; var50 < var12; var50++) {
                        int var51;
                        if (class180.field3101.field3025 != -1) {
                            var51 = class180.field3101.field3025;
                        } else if ((arg3 + var50 & 0x4) == (arg10 + var13 & 0x4)) {
                            var51 = class222.field3713[class149.field2686 + 1];
                        } else {
                            var51 = 4936552;
                        }
                        if (var51 == 0) {
                            var51 = 1;
                        }
                        int var52 = (arg5 * var50 + arg8 >> 16) + arg7;
                        int var53 = ((var50 + 1) * arg5 + arg8 >> 16) + arg7;
                        int var54 = var53 - var52;
                        class316.method2174(var49, var52, var16, var54, var51);
                    }
                    var10000 = arg9 + var15;
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = arg1 * var56 + arg0 >> 16;
            int var58 = (var56 + 1) * arg1 + arg0 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg9 + var57;
                var10000 = arg9 + var58;
                int var62 = arg10 + var56 >> 6;
                if (var62 >= 0 && class194.field3271.length - 1 >= var62) {
                    short[][] var63 = class194.field3271[var62];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg5 * var64 + arg8 >> 16;
                        int var66 = (var64 + 1) * arg5 + arg8 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg7 + var66;
                            int var69 = arg7 + var65;
                            int var70 = arg3 + var64 >> 6;
                            if (var70 >= 0 && var63.length - 1 >= var70) {
                                int var71 = (arg3 + var64 & 0x3F << 6) + (arg10 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = (var63[var70][var71] & 0xFAC6) >> 14;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var83 = class194.field3272[var72 - 1].field547 * var59 / 4;
                                            int var84 = class194.field3272[var72 - 1].field549 * var67 / 4;
                                            int var85 = class194.field3272[var72 - 1].field557 * var67 / 4;
                                            class194.field3272[var72 - 1].method788(var60, var69 - var85, var83, var84);
                                        } else if (var73 == 1) {
                                            int var80 = class74.field1172[var72 - 1].field549 * var67 / 4;
                                            int var81 = class74.field1172[var72 - 1].field557 * var67 / 4;
                                            int var82 = class74.field1172[var72 - 1].field547 * var59 / 4;
                                            class74.field1172[var72 - 1].method788(var60, var69 - var81, var82, var80);
                                        } else if (var73 == 2) {
                                            int var77 = class39.field638[var72 - 1].field547 * var59 / 4;
                                            int var78 = class39.field638[var72 - 1].field549 * var67 / 4;
                                            int var79 = class39.field638[var72 - 1].field557 * var67 / 4;
                                            class39.field638[var72 - 1].method788(var60, var69 - var79, var77, var78);
                                        } else if (var73 == 3) {
                                            int var74 = class60.field935[var72 - 1].field547 * var59 / 4;
                                            int var75 = class60.field935[var72 - 1].field557 * var67 / 4;
                                            int var76 = class60.field935[var72 - 1].field549 * var67 / 4;
                                            class60.field935[var72 - 1].method788(var60, var69 - var75, var74, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 440)
    public final void method2040(byte arg0) {
        field4984++;
        this.field4999 = true;
        class53 var2 = this.field4997;
        synchronized (this.field4997) {
            this.field4997.notifyAll();
        }
        try {
            this.field5000.join();
        } catch (InterruptedException var5) {
        }
        if (arg0 < 109) {
            this.field4997 = (class53) null;
        }
        this.field5000 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvk;I)V", line = 481)
    private final void method2041(class84 arg0, int arg1) {
        field4996++;
        class53 var3 = this.field4997;
        synchronized (this.field4997) {
            this.field4997.method379(arg0, 255);
            this.field5001++;
            if (arg1 <= 115) {
                method2043((class162) null, -78);
            }
            this.field4997.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I", line = 501)
    public static final int method2042(int arg0, int arg1) {
        field4993++;
        if (arg0 >= -50) {
            method2042(-68, 124);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lbd;I)I", line = 512)
    public static final int method2043(class162 arg0, int arg1) {
        if (arg1 != -1) {
            field4992 = -113L;
        }
        field4982++;
        return arg0.method1249((byte) -118) + 1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILh;[B)Lvk;", line = 523)
    public final class84 method2044(boolean arg0, int arg1, class315 arg2, byte[] arg3) {
        field4991++;
        class84 var5 = new class84();
        var5.field1508 = arg2;
        var5.field2302 = arg0;
        var5.field1515 = arg3;
        var5.field3604 = (long) arg1;
        var5.field1516 = 2;
        this.method2041(var5, 119);
        return var5;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 664)
    public class298() {
        class166 var1 = client.field1903.method241((byte) -98, this, 5);
        while (var1.field2934 == 0) {
            class177.method1342(10L, 1);
        }
        if (var1.field2934 == 2) {
            throw new RuntimeException();
        }
        this.field5000 = (Thread) var1.field2933;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILh;I)Lvk;", line = 544)
    public final class84 method2045(int arg0, class315 arg1, int arg2) {
        field4995++;
        class84 var4 = new class84();
        var4.field1516 = 1;
        class53 var5 = this.field4997;
        synchronized (this.field4997) {
            if (arg0 != 2) {
                this.field5000 = (Thread) null;
            }
            class84 var6 = (class84) this.field4997.method373(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field3604 && var6.field1508 == arg1 && var6.field1516 == 2) {
                    var4.field2311 = false;
                    var4.field1515 = var6.field1515;
                    return var4;
                }
                var6 = (class84) this.field4997.method376(true);
            }
        }
        var4.field1515 = arg1.method2152((byte) 125, arg2);
        var4.field2311 = false;
        var4.field2302 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILh;)Lvk;", line = 583)
    public final class84 method2046(int arg0, int arg1, class315 arg2) {
        class84 var4 = new class84();
        var4.field1508 = arg2;
        field4987++;
        var4.field3604 = (long) arg0;
        var4.field2302 = false;
        var4.field1516 = arg1;
        this.method2041(var4, 118);
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 597)
    public static void method2047(byte arg0) {
        if (arg0 == 88) {
            field4990 = null;
            field4983 = null;
            field4986 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "run", descriptor = "()V", line = 615)
    public final void run() {
        field4994++;
        while (!this.field4999) {
            class53 var1 = this.field4997;
            class84 var2;
            synchronized (this.field4997) {
                var2 = (class84) this.field4997.method374(1348);
                if (var2 == null) {
                    try {
                        this.field4997.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5001--;
            }
            try {
                if (var2.field1516 == 2) {
                    var2.field1508.method2146(var2.field1515, var2.field1515.length, (int) var2.field3604, -121);
                } else if (var2.field1516 == 3) {
                    var2.field1515 = var2.field1508.method2152((byte) 125, (int) var2.field3604);
                }
            } catch (Exception var6) {
                class129.method1039(-8, (String) null, var6);
            }
            var2.field2311 = false;
        }
    }
}
