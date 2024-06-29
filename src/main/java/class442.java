import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class442 extends class324 {

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public int field6590 = 0;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lha;")
    private class53 field6594;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public int field6605;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public int field6604;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "[I")
    private int[] field6602;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Ltu;")
    private class294 field6589;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public int field6596;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public int field6587;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "F")
    public float field6592;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field6600 = null;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "Ldb;")
    public static class272 field6598 = new class272(4, 1, 1, 1);

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "Lcca;")
    private class209 field6601;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6607;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6585;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)[Lcc;")
    public static final class633[] method2746(int arg0) {
        if (arg0 != 3) {
            method2750((byte) -121);
        }
        field6586++;
        return new class633[] { class129.field1593, class129.field1600, class129.field1604, class129.field1605, class129.field1606, class129.field1607, class129.field1608, class129.field1609, class129.field1610, class129.field1611, class129.field1612, class129.field1613, class129.field1614, class129.field1615 };
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
    public final void method2747(int arg0, byte arg1) {
        int var3 = -45 % ((arg1 - 61) / 50);
        this.field6585 = this.field6589.method1974((byte) 56, true, arg0 * 4);
        field6599++;
        this.field6607 = new Stream(this.field6585, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)V")
    public final void method2748(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 100) {
            this.method2753(118, false);
        }
        field6591++;
        this.field6602[this.field6594.field1656 * arg0 + arg3] = class283.method1834(this.field6602[this.field6594.field1656 * arg0 + arg3], 0x1 << arg1);
        this.field6590++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
    public static final int method2749(byte arg0) {
        field6603++;
        int var1 = 74 % ((arg0 - 62) / 55);
        return class411.field6255++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static void method2750(byte arg0) {
        field6598 = null;
        int var1 = -109 / ((-arg0 - 46) / 40);
        field6600 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIFII)V")
    public final void method2751(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field6604 != -1) {
            class614 var6 = this.field6589.field8852.method438(53, this.field6604);
            int var7 = var6.field8926 & 0xFF;
            if (var7 != 0 && var6.field8935 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field8939 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + ((var12 & 0xB200FF00) << 8) + (var13 & 0xFF00);
            }
        }
        field6597++;
        int var15 = 11 / ((-arg0 - 53) / 45);
        if (arg2 != 1.0F) {
            int var16 = (arg4 & 0xFFC075) >> 16;
            int var17 = (arg4 & 0xFFDA) >> 8;
            int var18 = arg4 & 0xFF;
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            int var21 = (int) ((float) var18 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            arg4 = var21 | var19 << 16 | var20 << 8;
        }
        this.field6607.method3421(arg3 * 4);
        if (this.field6589.field4261 == 0) {
            this.field6607.method3412((byte) arg4);
            this.field6607.method3412((byte) (arg4 >> 8));
            this.field6607.method3412((byte) (arg4 >> 16));
        } else {
            this.field6607.method3412((byte) (arg4 >> 16));
            this.field6607.method3412((byte) (arg4 >> 8));
            this.field6607.method3412((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)V")
    public final void method2752(int arg0, byte arg1) {
        this.field6607.method3411();
        field6606++;
        this.field6601 = this.field6589.method1548((byte) 112, false);
        this.field6601.method1070(this.field6585, -80, 4, arg0 * 4);
        this.field6585 = null;
        if (arg1 == 102) {
            this.field6607 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
    public final void method2753(int arg0, boolean arg1) {
        this.field6607.method3421(arg0 * 4 + 3);
        field6584++;
        this.field6607.method3412(-1);
        if (!arg1) {
            this.field6601 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[FIIIIFIIIFFI)V")
    public static final void method2754(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9, float arg10, float arg11, int arg12) {
        field6588++;
        int var13 = arg8 - arg7;
        int var14 = arg4 - arg9;
        int var15 = arg12 - arg3;
        float var16 = arg1[2] * (float) var15 + arg1[1] * (float) var13 + arg1[0] * (float) var14;
        float var17 = arg1[5] * (float) var15 + arg1[3] * (float) var14 + arg1[4] * (float) var13;
        float var18 = arg1[8] * (float) var15 + arg1[6] * (float) var14 + arg1[7] * (float) var13;
        float var19;
        float var20;
        if (arg0 == 0) {
            var19 = arg6 + 0.5F - var18;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg0 == 1) {
            var19 = arg6 + var18 + 0.5F;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg0 == 2) {
            var20 = arg11 + 0.5F - var16;
            var19 = arg10 + 0.5F - var17;
        } else if (arg0 == 3) {
            var19 = arg10 + 0.5F - var17;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg0 == 4) {
            var20 = arg6 + var18 + 0.5F;
            var19 = arg10 + 0.5F - var17;
        } else {
            var19 = arg10 + 0.5F - var17;
            var20 = arg6 + 0.5F - var18;
        }
        if (arg5 != -21794) {
            method2746(-31);
        }
        if (arg2 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg2 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg2 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class67.field737 = var19;
        class11.field94 = var20;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[I)V")
    public final void method2755(int arg0, int arg1, int[] arg2) {
        field6595++;
        class396 var4 = this.field6589.method1924(-9248, this.field6590 * 3);
        Buffer var5 = var4.method652(true, 31983);
        if (var5 == null) {
            return;
        }
        int var6 = -58 / ((arg0 - 30) / 42);
        Stream var7 = this.field6589.method1932(var5, (byte) -82);
        int var8 = 0;
        int var9 = 32767;
        int var10 = -32768;
        if (Stream.method3423()) {
            label96: for (int var19 = 0; var19 < arg1; var19++) {
                int var21 = arg2[var19];
                short[] var22 = this.field6594.field550[var21];
                int var23 = this.field6602[var21];
                if (var23 != 0 && var22 != null) {
                    int var24 = 0;
                    int var25 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var25) {
                                continue label96;
                            }
                            if ((0x1 << var24++ & var23) == 0) {
                                var25 += 3;
                            } else {
                                var8++;
                                for (int var26 = 0; var26 < 3; var26++) {
                                    int var27 = var22[var25++] & 0xFFFF;
                                    if (var27 < var9) {
                                        var9 = var27;
                                    }
                                    if (var10 < var27) {
                                        var10 = var27;
                                    }
                                    var7.method3414(var27);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label122: for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = arg2[var11];
                int var13 = this.field6602[var12];
                short[] var14 = this.field6594.field550[var12];
                if (var13 != 0 && var14 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (true) {
                        while (true) {
                            if (var14.length <= var16) {
                                continue label122;
                            }
                            if ((0x1 << var15++ & var13) == 0) {
                                var16 += 3;
                            } else {
                                for (int var17 = 0; var17 < 3; var17++) {
                                    int var18 = var14[var16++] & 0xFFFF;
                                    if (var18 < var9) {
                                        var9 = var18;
                                    }
                                    if (var10 < var18) {
                                        var10 = var18;
                                    }
                                    var7.method3413(var18);
                                }
                                var8++;
                            }
                        }
                    }
                }
            }
        }
        var7.method3411();
        if (!var4.method651(-15045) || var8 <= 0) {
            return;
        }
        this.field6589.method1899((this.field6594.field552 & 0x7) != 0, this.field6604, (this.field6594.field552 & 0x8) != 0, 0);
        if (this.field6589.field4293) {
            this.field6589.method319(Integer.MAX_VALUE, this.field6605, this.field6587, this.field6596);
        }
        class646 var20 = this.field6589.method1930(1);
        var20.method3705(1.0F, 1.0F / this.field6592, -1, 1.0F / this.field6592);
        this.field6589.method1935(class199.field2681, true);
        this.field6589.method1558(this.field6601, 120, 1);
        this.field6589.method1562(76, this.field6594.field590);
        this.field6589.method1508(-28296, var9, var8, var10 + 1 - var9, 0, class256.field3658, var4);
        this.field6589.method1950(7869);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lkp;I)I")
    public static final int method2756(class421 arg0, int arg1) {
        field6593++;
        if (arg1 < 99) {
            return -79;
        } else if (class602.field8784 == arg0) {
            return 6407;
        } else if (class538.field7742 == arg0) {
            return 6408;
        } else if (class562.field8019 == arg0) {
            return 6406;
        } else if (class339.field4850 == arg0) {
            return 6409;
        } else if (class162.field1982 == arg0) {
            return 6410;
        } else if (class547.field7824 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lha;IIIII)V")
    public class442(class53 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6594 = arg0;
        this.field6605 = arg3;
        this.field6604 = arg1;
        this.field6602 = new int[this.field6594.field1660 * this.field6594.field1656];
        this.field6589 = this.field6594.field570;
        this.field6596 = arg5;
        this.field6587 = arg4;
        this.field6592 = arg2;
    }
}
