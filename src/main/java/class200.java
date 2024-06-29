import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class200 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    private int field3190;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field3207;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    private int field3203;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[[I")
    public int[][] field3197;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field3202 = 0;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lod;")
    public static class223 field3200 = new class223(64);

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field3208 = 0;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[[I")
    public static int[][] field3210 = new int[5][5000];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI)V", line = 13)
    public final void method1472(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field3207;
        field3199++;
        int var5 = arg0 - this.field3203;
        this.field3197[var4][var5] = class214.method1562(this.field3197[var4][var5], 2097152);
        if (arg1) {
            field3210 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZIIZIZ)V", line = 29)
    public final void method1473(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field3207;
        field3191++;
        int var9 = 256;
        if (arg1) {
            return;
        }
        int var10 = arg3 - this.field3203;
        if (arg6) {
            var9 |= 0x20000;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < arg5 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field3192) {
                for (int var12 = var10; var12 < arg0 + var10; var12++) {
                    if (var12 >= 0 && this.field3190 > var12) {
                        this.method1477(-126, var12, var9, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIBIZZ)V", line = 73)
    public final void method1474(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, boolean arg7) {
        int var9 = arg1 - this.field3207;
        int var10 = 256;
        int var11 = arg2 - this.field3203;
        field3194++;
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg0;
            arg0 = arg5;
            arg5 = var12;
        }
        if (arg4 < 10) {
            this.field3192 = -86;
        }
        if (arg7) {
            var10 |= 0x20000;
        }
        if (arg6) {
            var10 |= 0x40000000;
        }
        for (int var13 = var9; var13 < (arg0 + var9); var13++) {
            if (var13 >= 0 && var13 < this.field3192) {
                for (int var14 = var11; var14 < (arg5 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field3190) {
                        this.method1483(1, var10, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 128)
    public static final void method1475(int arg0) {
        class139.method1035();
        class33.field492 = -1;
        field3201++;
        class119.field1663 = null;
        class283.method2005(arg0 ^ 0x67B5);
        class88.field1198.method1630(false);
        class136.field2139 = new class120();
        ((class57) class31.field466).method463(false);
        class299.method2077();
        class176.field2891 = new class79[255];
        class176.field2892 = arg0;
        class217.method1582();
        class8.method109();
        class249.method1789(-66);
        class326.method2291(false, 123);
        class52.method379(false);
        class282.method2001(2047);
        for (int var1 = 0; var1 < 2048; var1++) {
            class337 var2 = class284.field4403[var1];
            if (var2 != null) {
                var2.field4666 = null;
            }
        }
        if (class109.field1458) {
            class8.method118(104, 104);
            class14.method138((byte) 11, class163.field2648);
            class151.method1101();
        }
        class128.method940(class18.field285, class256.field4042, arg0 + 20372);
        class202.method1499(class256.field4042, (byte) -15);
        class117.field1637 = null;
        class194.field3104 = null;
        class303.field4702 = null;
        class279.field4302 = null;
        class232.field3626 = null;
        if (class105.field1388 == 5) {
            class291.method2034((byte) -35, class256.field4042);
        }
        if (class105.field1388 == 10) {
            class169.method1271(arg0 - 21431, false);
        }
        if (class105.field1388 == 30) {
            class68.method538(-108, 25);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIIIIZI)V", line = 190)
    public final void method1476(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3205++;
        int var8 = arg6 - this.field3203;
        int var9 = arg1 - this.field3207;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1477(-127, var8, 128, var9);
                this.method1477(64, var8, 8, var9 - 1);
            }
            if (arg2 == 1) {
                this.method1477(62, var8, 2, var9);
                this.method1477(-126, var8 + 1, 32, var9);
            }
            if (arg2 == 2) {
                this.method1477(57, var8, 8, var9);
                this.method1477(-126, var8, 128, var9 + 1);
            }
            if (arg2 == 3) {
                this.method1477(-125, var8, 32, var9);
                this.method1477(-125, var8 - 1, 2, var9);
            }
        }
        if (arg3 == arg4 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1477(45, var8, 1, var9);
                this.method1477(96, var8 + 1, 16, var9 - 1);
            }
            if (arg2 == 1) {
                this.method1477(-127, var8, 4, var9);
                this.method1477(-128, var8 + 1, 64, var9 + 1);
            }
            if (arg2 == 2) {
                this.method1477(54, var8, 16, var9);
                this.method1477(-127, var8 - 1, 1, var9 + 1);
            }
            if (arg2 == 3) {
                this.method1477(42, var8, 64, var9);
                this.method1477(22, var8 - 1, 4, var9 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method1477(115, var8, 130, var9);
                this.method1477(-127, var8, 8, var9 - 1);
                this.method1477(arg4 - 125, var8 + 1, 32, var9);
            }
            if (arg2 == 1) {
                this.method1477(arg4 - 129, var8, 10, var9);
                this.method1477(22, var8 + 1, 32, var9);
                this.method1477(64, var8, 128, var9 + 1);
            }
            if (arg2 == 2) {
                this.method1477(-128, var8, 40, var9);
                this.method1477(-127, var8, 128, var9 + 1);
                this.method1477(arg4 ^ 0xFFFFFF81, var8 - 1, 2, var9);
            }
            if (arg2 == 3) {
                this.method1477(67, var8, 160, var9);
                this.method1477(-124, var8 - 1, 2, var9);
                this.method1477(-124, var8, 8, var9 - 1);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method1477(41, var8, 65536, var9);
                    this.method1477(120, var8, 4096, var9 - 1);
                }
                if (arg2 == 1) {
                    this.method1477(-126, var8, 1024, var9);
                    this.method1477(28, var8 + 1, 16384, var9);
                }
                if (arg2 == 2) {
                    this.method1477(arg4 ^ 0xFFFFFF80, var8, 4096, var9);
                    this.method1477(-126, var8, 65536, var9 + 1);
                }
                if (arg2 == 3) {
                    this.method1477(-125, var8, 16384, var9);
                    this.method1477(35, var8 - 1, 1024, var9);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method1477(77, var8, 512, var9);
                    this.method1477(86, var8 + 1, 8192, var9 - 1);
                }
                if (arg2 == 1) {
                    this.method1477(-125, var8, 2048, var9);
                    this.method1477(106, var8 + 1, 32768, var9 + 1);
                }
                if (arg2 == 2) {
                    this.method1477(arg4 - 127, var8, 8192, var9);
                    this.method1477(-127, var8 - 1, 512, var9 + 1);
                }
                if (arg2 == 3) {
                    this.method1477(-125, var8, 32768, var9);
                    this.method1477(-2, var8 - 1, 2048, var9 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method1477(-10, var8, 66560, var9);
                    this.method1477(-127, var8, 4096, var9 - 1);
                    this.method1477(arg4 ^ 0xFFFFFFF8, var8 + 1, 16384, var9);
                }
                if (arg2 == 1) {
                    this.method1477(4, var8, 5120, var9);
                    this.method1477(13, var8 + 1, 16384, var9);
                    this.method1477(arg4 ^ 0xFFFFFF83, var8, 65536, var9 + 1);
                }
                if (arg2 == 2) {
                    this.method1477(-125, var8, 20480, var9);
                    this.method1477(7, var8, 65536, var9 + 1);
                    this.method1477(arg4 - 128, var8 + -1, 1024, var9);
                }
                if (arg2 == 3) {
                    this.method1477(101, var8, 81920, var9);
                    this.method1477(-127, var8 - 1, 1024, var9);
                    this.method1477(-128, var8, 4096, var9 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1477(-128, var8, 536870912, var9);
                this.method1477(-125, var8, 33554432, var9 - 1);
            }
            if (arg2 == 1) {
                this.method1477(-125, var8, 8388608, var9);
                this.method1477(-124, var8 + 1, 134217728, var9);
            }
            if (arg2 == 2) {
                this.method1477(-125, var8, 33554432, var9);
                this.method1477(127, var8, 536870912, var9 + 1);
            }
            if (arg2 == 3) {
                this.method1477(arg4 - 127, var8, 134217728, var9);
                this.method1477(-125, var8 - 1, 8388608, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1477(-125, var8, 4194304, var9);
                this.method1477(arg4 ^ 0x7E, var8 + 1, 67108864, var9 - 1);
            }
            if (arg2 == 1) {
                this.method1477(-125, var8, 16777216, var9);
                this.method1477(-126, var8 + 1, 268435456, var9 + 1);
            }
            if (arg2 == 2) {
                this.method1477(68, var8, 67108864, var9);
                this.method1477(arg4 - 126, var8 - 1, 4194304, var9 + 1);
            }
            if (arg2 == 3) {
                this.method1477(-125, var8, 268435456, var9);
                this.method1477(-127, var8 - 1, 16777216, var9 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1477(-126, var8, 545259520, var9);
            this.method1477(-124, var8, 33554432, var9 - 1);
            this.method1477(51, var8 + 1, 134217728, var9);
        }
        if (arg2 == 1) {
            this.method1477(28, var8, 41943040, var9);
            this.method1477(-125, var8 + 1, 134217728, var9);
            this.method1477(arg4 - 129, var8, 536870912, var9 + 1);
        }
        if (arg2 == 2) {
            this.method1477(-127, var8, 167772160, var9);
            this.method1477(arg4 - 128, var8, 536870912, var9 + 1);
            this.method1477(-125, var8 - 1, 8388608, var9);
        }
        if (arg2 == 3) {
            this.method1477(16, var8, 671088640, var9);
            this.method1477(-126, var8 - 1, 8388608, var9);
            this.method1477(17, var8, 33554432, var9 - 1);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V", line = 501)
    private final void method1477(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 111 % ((-arg0 - 67) / 57);
        this.field3197[arg3][arg1] = class214.method1562(this.field3197[arg3][arg1], arg2);
        field3193++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 510)
    public final void method1478(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3203;
        field3211++;
        int var5 = arg2 - this.field3207;
        this.field3197[var5][var4] = class333.method2319(this.field3197[var5][var4], -262145);
        if (arg1 != 1) {
            field3202 = 75;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 524)
    public static void method1479(int arg0) {
        if (arg0 != 1) {
            field3208 = -46;
        }
        field3210 = (int[][]) null;
        field3200 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBII)Z", line = 536)
    public final boolean method1480(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3196++;
        if (arg0 == arg1 && arg3 == arg4) {
            return true;
        }
        int var6 = arg4 - this.field3203;
        int var7 = arg1 - this.field3207;
        if (var7 < 0 || var7 >= this.field3192 || var6 < 0 || this.field3190 <= var6) {
            return false;
        }
        int var8 = arg3 - this.field3203;
        if (arg2 != -44) {
            return false;
        }
        int var9 = arg0 - this.field3207;
        int var10;
        if (var8 < var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 >= var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 < var11) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field3197[var9][var8] & 0x2C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field3197[var9][var8] & 0x2C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var6 > var8) {
                        if ((this.field3197[var9][var8] & 0x2C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field3197[var9][var8] & 0x2C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var8) {
                if (var8 < var6) {
                    if ((this.field3197[var9][var8] & 0x2C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field3197[var9][var8] & 0x2C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 < var7) {
                        if ((this.field3197[var9][var8] & 0x2C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field3197[var9][var8] & 0x2C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field3197[var7][var6] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 703)
    public final void method1481(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            field3200 = (class223) null;
        }
        while (this.field3192 > var2) {
            for (int var3 = 0; var3 < this.field3190; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3192 - 5 <= var2 || (this.field3190 - 5) <= var3) {
                    this.field3197[var2][var3] = 16777215;
                } else {
                    this.field3197[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field3206++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I", line = 735)
    public static final int method1482(byte arg0) {
        field3204++;
        if (arg0 == 19) {
            return class191.field3044 && class260.field4093[81] && class78.field1046 > 2 ? class135.field1974[class78.field1046 - 2] : class135.field1974[class78.field1046 - 1];
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIII)V", line = 750)
    private final void method1483(int arg0, int arg1, int arg2, int arg3) {
        this.field3197[arg2][arg3] = class333.method2319(this.field3197[arg2][arg3], ~arg1);
        if (arg0 == 1) {
            field3198++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)V", line = 764)
    public final void method1484(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3203;
        int var5 = arg0 - this.field3207;
        if (arg1 <= 25) {
            field3200 = (class223) null;
        }
        field3209++;
        this.field3197[var5][var4] = class214.method1562(this.field3197[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(II)V", line = 781)
    public class200(int arg0, int arg1) {
        this.field3190 = arg1;
        this.field3207 = 0;
        this.field3203 = 0;
        this.field3192 = arg0;
        this.field3197 = new int[this.field3192][this.field3190];
        this.method1481(true);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZIIZZ)V", line = 800)
    public final void method1485(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg1 - this.field3203;
        field3195++;
        int var9 = arg4 - this.field3207;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1483(1, 128, var9, var8);
                this.method1483(1, 8, var9 - 1, var8);
            }
            if (arg0 == 1) {
                this.method1483(1, 2, var9, var8);
                this.method1483(1, 32, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1483(1, 8, var9, var8);
                this.method1483(1, 128, var9 + 1, var8);
            }
            if (arg0 == 3) {
                this.method1483(1, 32, var9, var8);
                this.method1483(1, 2, var9, var8 - 1);
            }
        }
        if (arg5) {
            this.method1484(-98, -96, 29);
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1483(1, 1, var9, var8);
                this.method1483(1, 16, var9 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1483(1, 4, var9, var8);
                this.method1483(1, 64, var9 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1483(1, 16, var9, var8);
                this.method1483(1, 1, var9 + 1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method1483(1, 64, var9, var8);
                this.method1483(1, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method1483(1, 130, var9, var8);
                this.method1483(1, 8, var9 - 1, var8);
                this.method1483(1, 32, var9, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1483(1, 10, var9, var8);
                this.method1483(1, 32, var9, var8 + 1);
                this.method1483(1, 128, var9 + 1, var8);
            }
            if (arg0 == 2) {
                this.method1483(1, 40, var9, var8);
                this.method1483(1, 128, var9 + 1, var8);
                this.method1483(1, 2, var9, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1483(1, 160, var9, var8);
                this.method1483(1, 2, var9, var8 - 1);
                this.method1483(1, 8, var9 - 1, var8);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method1483(1, 65536, var9, var8);
                    this.method1483(1, 4096, var9 - 1, var8);
                }
                if (arg0 == 1) {
                    this.method1483(1, 1024, var9, var8);
                    this.method1483(1, 16384, var9, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1483(1, 4096, var9, var8);
                    this.method1483(1, 65536, var9 + 1, var8);
                }
                if (arg0 == 3) {
                    this.method1483(1, 16384, var9, var8);
                    this.method1483(1, 1024, var9, var8 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method1483(1, 512, var9, var8);
                    this.method1483(1, 8192, var9 - 1, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1483(1, 2048, var9, var8);
                    this.method1483(1, 32768, var9 + 1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1483(1, 8192, var9, var8);
                    this.method1483(1, 512, var9 + 1, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1483(1, 32768, var9, var8);
                    this.method1483(1, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method1483(1, 66560, var9, var8);
                    this.method1483(1, 4096, var9 - 1, var8);
                    this.method1483(1, 16384, var9, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1483(1, 5120, var9, var8);
                    this.method1483(1, 16384, var9, var8 + 1);
                    this.method1483(1, 65536, var9 + 1, var8);
                }
                if (arg0 == 2) {
                    this.method1483(1, 20480, var9, var8);
                    this.method1483(1, 65536, var9 + 1, var8);
                    this.method1483(1, 1024, var9, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1483(1, 81920, var9, var8);
                    this.method1483(1, 1024, var9, var8 - 1);
                    this.method1483(1, 4096, var9 - 1, var8);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method1483(1, 536870912, var9, var8);
                this.method1483(1, 33554432, var9 - 1, var8);
            }
            if (arg0 == 1) {
                this.method1483(1, 8388608, var9, var8);
                this.method1483(1, 134217728, var9, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1483(1, 33554432, var9, var8);
                this.method1483(1, 536870912, var9 + 1, var8);
            }
            if (arg0 == 3) {
                this.method1483(1, 134217728, var9, var8);
                this.method1483(1, 8388608, var9, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method1483(1, 4194304, var9, var8);
                this.method1483(1, 67108864, var9 - 1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1483(1, 16777216, var9, var8);
                this.method1483(1, 268435456, var9 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1483(1, 67108864, var9, var8);
                this.method1483(1, 4194304, var9 + 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1483(1, 268435456, var9, var8);
                this.method1483(1, 16777216, var9 - 1, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1483(1, 545259520, var9, var8);
            this.method1483(1, 33554432, var9 - 1, var8);
            this.method1483(1, 134217728, var9, var8 + 1);
        }
        if (arg0 == 1) {
            this.method1483(1, 41943040, var9, var8);
            this.method1483(1, 134217728, var9, var8 + 1);
            this.method1483(1, 536870912, var9 + 1, var8);
        }
        if (arg0 == 2) {
            this.method1483(1, 167772160, var9, var8);
            this.method1483(1, 536870912, var9 + 1, var8);
            this.method1483(1, 8388608, var9, var8 - 1);
        }
        if (arg0 == 3) {
            this.method1483(1, 671088640, var9, var8);
            this.method1483(1, 8388608, var9, var8 - 1);
            this.method1483(1, 33554432, var9 - 1, var8);
        }
    }
}
