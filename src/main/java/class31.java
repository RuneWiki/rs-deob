import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class31 extends class12 {

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lgb;")
    public class149 field489 = new class149();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lbb;")
    public class91 field504 = new class91();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lfe;")
    private class261 field490;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Ljava/lang/String;")
    public static String field496 = "flash1:";

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Z")
    public static boolean field503 = false;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILpd;I)V")
    private final void method247(int arg0, class58 arg1, int arg2) {
        if ((this.field490.field4013[arg1.field913] & 0x4) != 0 && arg1.field912 < 0) {
            int var4 = this.field490.field4004[arg1.field913] / class234.field3622;
            int var5 = (var4 + 1048575 - arg1.field895) / var4;
            arg1.field895 = arg0 * var4 + arg1.field895 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field490.field4064[arg1.field913] == 0) {
                    arg1.field899 = class82.method656(arg1.field921, arg1.field899.method644(), arg1.field899.method663(), arg1.field899.method645());
                } else {
                    arg1.field899 = class82.method656(arg1.field921, arg1.field899.method644(), 0, arg1.field899.method645());
                    this.field490.method1742(true, arg1, arg1.field897.field696[arg1.field907] < 0);
                }
                if (arg1.field897.field696[arg1.field907] < 0) {
                    arg1.field899.method667(-1);
                }
                arg0 = arg1.field895 / var4;
            }
        }
        arg1.field899.method124(arg0);
        field501++;
        int var6 = 15 / ((arg2 + 4) / 37);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method248(byte arg0) {
        field498++;
        if (class87.field1422 == null) {
            return;
        }
        if (class122.field1874 < 10) {
            if (!class44.field706.method1158(27772, class87.field1422.field4689)) {
                class122.field1874 = class211.field3271.method1155(class87.field1422.field4689, 21089) / 10;
                return;
            }
            class65.method511(false);
            class122.field1874 = 10;
        }
        if (class122.field1874 == 10) {
            class197.field3093 = class87.field1422.field4696 >> 6 << 6;
            class221.field3453 = (class87.field1422.field4693 >> 6 << 6) + 64 - class197.field3093;
            class76.field1275 = class87.field1422.field4691 >> 6 << 6;
            class188.field3010 = (class87.field1422.field4678 >> 6 << 6) + 64 - class76.field1275;
            int var1 = -1;
            int[] var2 = class87.field1422.method1991(class118.field1828 + (class261.field4058.field4176 >> 7), (class261.field4058.field4123 >> 7) + class129.field2008, 0, class274.field4318);
            int var3 = -1;
            if (var2 != null) {
                var1 = var2[1] - class76.field1275;
                var3 = class197.field3093 + class221.field3453 - var2[2] - 1;
            }
            if (var1 >= 0 && var1 < class188.field3010 && var3 >= 0 && var3 < class221.field3453) {
                int var4 = var1 + ((int) (Math.random() * 10.0D) - 5);
                class140.field2155 = var4;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class250.field3848 = var5;
            } else if (class136.field2122 == -1 || class157.field2422 == -1) {
                int[] var7 = class87.field1422.method1995(class87.field1422.field4677 & 0x3FFF, 0, class87.field1422.field4677 >> 14 & 0x3FFF);
                class250.field3848 = class221.field3453 + class197.field3093 - var7[2] - 1;
                class140.field2155 = var7[1] - class76.field1275;
            } else {
                int[] var6 = class87.field1422.method1995(class157.field2422, 0, class136.field2122);
                if (var6 != null) {
                    class250.field3848 = class221.field3453 + class197.field3093 - var6[2] - 1;
                    class140.field2155 = var6[1] - class76.field1275;
                }
                class157.field2422 = -1;
                class136.field2122 = -1;
            }
            if (class87.field1422.field4685 == 37) {
                class134.field2075 = 3.0F;
                class62.field1003 = 3.0F;
            } else if (class87.field1422.field4685 == 50) {
                class134.field2075 = 4.0F;
                class62.field1003 = 4.0F;
            } else if (class87.field1422.field4685 == 75) {
                class134.field2075 = 6.0F;
                class62.field1003 = 6.0F;
            } else if (class87.field1422.field4685 == 100) {
                class134.field2075 = 8.0F;
                class62.field1003 = 8.0F;
            } else if (class87.field1422.field4685 == 200) {
                class134.field2075 = 16.0F;
                class62.field1003 = 16.0F;
            } else {
                class134.field2075 = 8.0F;
                class62.field1003 = 8.0F;
            }
            class273.method1840((byte) -88);
            class237.field3666 = new int[class17.field273 + 1];
            int var8 = class188.field3010 >> 6;
            int var9 = class221.field3453 >> 6;
            int var10 = class164.field2494 >> 2 << 10;
            class157.field2413 = new byte[var8][var9][];
            class50.field799 = new byte[var8][var9][];
            class18.field285 = new int[var8][var9][];
            class222.field3467 = new byte[var8][var9][];
            int var11 = class102.field1633 >> 1;
            class273.field4310 = new int[var8][var9][];
            class216.field3334 = new byte[var8][var9][];
            class39.field654 = new int[var8][var9][];
            class288.field4530 = new byte[var8][var9][];
            class270.method1826(var11, 96, var10);
            class122.field1874 = 20;
        } else if (class122.field1874 == 20) {
            class231.method1524(200, new class37(class44.field706.method1160("underlay", true, class87.field1422.field4689)));
            class122.field1874 = 30;
            class293.method1968(true, (byte) 97);
            class151.method1022((byte) 113);
        } else if (class122.field1874 == 30) {
            class68.method534(29, new class37(class44.field706.method1160("overlay", true, class87.field1422.field4689)));
            class122.field1874 = 40;
            class151.method1022((byte) 110);
        } else if (class122.field1874 == 40) {
            class256.method1705(new class37(class44.field706.method1160("overlay2", true, class87.field1422.field4689)), true);
            class122.field1874 = 50;
            class151.method1022((byte) 104);
        } else if (class122.field1874 == 50) {
            class189.method1279(new class37(class44.field706.method1160("loc", true, class87.field1422.field4689)), 4096);
            class122.field1874 = 60;
            class293.method1968(true, (byte) 97);
            class151.method1022((byte) 94);
        } else if (class122.field1874 == 60) {
            if (class44.field706.method1170(0, class87.field1422.field4689 + "_labels")) {
                if (!class44.field706.method1158(27772, class87.field1422.field4689 + "_labels")) {
                    return;
                }
                class293.field4615 = class25.method204(class87.field1422.field4689 + "_labels", 59, class44.field706);
            } else {
                class293.field4615 = new class288(0);
            }
            class122.field1874 = 70;
            class151.method1022((byte) 90);
        } else if (class122.field1874 == 70) {
            class140.field2169 = new class52(11, true, class189.field3021);
            class122.field1874 = 73;
            class293.method1968(true, (byte) 97);
            class151.method1022((byte) 121);
        } else {
            if (arg0 > -33) {
                field503 = true;
            }
            if (class122.field1874 == 73) {
                class141.field2180 = new class52(12, true, class189.field3021);
                class122.field1874 = 76;
                class293.method1968(true, (byte) 97);
                class151.method1022((byte) 117);
            } else if (class122.field1874 == 76) {
                class120.field1856 = new class52(14, true, class189.field3021);
                class122.field1874 = 79;
                class293.method1968(true, (byte) 97);
                class151.method1022((byte) 79);
            } else if (class122.field1874 == 79) {
                class263.field4121 = new class52(17, true, class189.field3021);
                class122.field1874 = 82;
                class293.method1968(true, (byte) 97);
                class151.method1022((byte) 93);
            } else if (class122.field1874 == 82) {
                class108.field1718 = new class52(19, true, class189.field3021);
                class122.field1874 = 85;
                class293.method1968(true, (byte) 97);
                class151.method1022((byte) 79);
            } else if (class122.field1874 == 85) {
                class69.field1102 = new class52(22, true, class189.field3021);
                class122.field1874 = 88;
                class293.method1968(true, (byte) 97);
                class151.method1022((byte) 117);
            } else if (class122.field1874 == 88) {
                class277.field4358 = new class52(26, true, class189.field3021);
                class122.field1874 = 91;
                class293.method1968(true, (byte) 97);
                class151.method1022((byte) 121);
            } else {
                class181.field2698 = new class52(30, true, class189.field3021);
                class122.field1874 = 100;
                class293.method1968(true, (byte) 97);
                class151.method1022((byte) 70);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lfg;")
    public final class12 method125() {
        field495++;
        class58 var1;
        do {
            var1 = (class58) this.field489.method1008((byte) 88);
            if (var1 == null) {
                return null;
            }
        } while (var1.field899 == null);
        return var1.field899;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public static final void method249(int arg0) {
        class262.field4088 = null;
        class245.field3803 = null;
        if (arg0 == 18336) {
            class86.field1416 = null;
            class18.field289 = null;
            field507++;
            class158.field2433 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field504.method124(arg0);
        field500++;
        for (class58 var2 = (class58) this.field489.method1010(109); var2 != null; var2 = (class58) this.field489.method1008((byte) 88)) {
            if (!this.field490.method1765((byte) -128, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field911 >= var3) {
                        this.method247(var3, var2, 89);
                        var2.field911 -= var3;
                        break;
                    }
                    this.method247(var2.field911, var2, -102);
                    var3 -= var2.field911;
                } while (!this.field490.method1754((int[]) null, 0, var3, var2, 8742));
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
    public final int method127() {
        field499++;
        return 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lrf;")
    public static final class289 method250(int arg0, int arg1) {
        class289 var2 = (class289) class144.field2231.method1701(false, (long) arg0);
        field494++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == -89) {
            byte[] var3 = class148.field2281.method1163(11, arg0, 48);
            class289 var4 = new class289();
            if (var3 != null) {
                var4.method1949((byte) 83, new class37(var3));
            }
            class144.field2231.method1704((long) arg0, var4, true);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Lfg;")
    public final class12 method123() {
        field502++;
        class58 var1 = (class58) this.field489.method1010(122);
        if (var1 == null) {
            return null;
        } else if (var1.field899 == null) {
            return this.method125();
        } else {
            return var1.field899;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 <= 28) {
            field493 = 123;
        }
        field492++;
        if (class103.method784(-1, arg3)) {
            class7.method88(arg0, arg2, 0, class261.field4006[arg3], arg7, -1, arg6, arg8, arg5, arg4);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class37.field632[var9] = true;
            }
        } else {
            class37.field632[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII[ILpd;)V")
    private final void method252(int arg0, int arg1, int arg2, int arg3, int[] arg4, class58 arg5) {
        if ((this.field490.field4013[arg5.field913] & 0x4) != 0 && arg5.field912 < 0) {
            int var7 = this.field490.field4004[arg5.field913] / class234.field3622;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field895) / var7;
                if (var8 > arg3) {
                    arg5.field895 += arg3 * var7;
                    break;
                }
                int var9 = 262144 / var7;
                arg5.field899.method126(arg4, arg0, var8);
                int var10 = class234.field3622 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                arg0 += var8;
                arg5.field895 += var7 * var8 - 1048576;
                arg3 -= var8;
                class82 var11 = arg5.field899;
                if (this.field490.field4064[arg5.field913] == 0) {
                    arg5.field899 = class82.method656(arg5.field921, var11.method644(), var11.method663(), var11.method645());
                } else {
                    arg5.field899 = class82.method656(arg5.field921, var11.method644(), 0, var11.method645());
                    this.field490.method1742(true, arg5, arg5.field897.field696[arg5.field907] < 0);
                    arg5.field899.method639(var10, var11.method663());
                }
                if (arg5.field897.field696[arg5.field907] < 0) {
                    arg5.field899.method667(-1);
                }
                var11.method661(var10);
                var11.method126(arg4, arg0, arg2 - arg0);
                if (var11.method649()) {
                    this.field504.method722(var11);
                }
            }
        }
        arg5.field899.method126(arg4, arg0, arg3);
        int var12 = 48 % ((arg1 + 42) / 40);
        field497++;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public static void method253(int arg0) {
        if (arg0 == 1048575) {
            field496 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lfe;)V")
    public class31(class261 arg0) {
        this.field490 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([III)V")
    public final void method126(int[] arg0, int arg1, int arg2) {
        field491++;
        this.field504.method126(arg0, arg1, arg2);
        for (class58 var4 = (class58) this.field489.method1010(118); var4 != null; var4 = (class58) this.field489.method1008((byte) 88)) {
            if (!this.field490.method1765((byte) -110, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field911 >= var6) {
                        this.method252(var5, -100, var5 + var6, var6, arg0, var4);
                        var4.field911 -= var6;
                        break;
                    }
                    this.method252(var5, -113, var5 + var6, var4.field911, arg0, var4);
                    var6 -= var4.field911;
                    var5 += var4.field911;
                } while (!this.field490.method1754(arg0, var5, var6, var4, 8742));
            }
        }
    }
}
