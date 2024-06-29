import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class314 extends class240 {

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    private int field5325 = 4096;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "[Lcd;")
    public static class64[] field5321 = new class64[1000];

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field5324 = 0;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 5)
    public class314() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2172(boolean arg0) {
        if (!arg0) {
            field5321 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I", line = 22)
    public final int[] method12(int arg0, int arg1) {
        field5322++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[] var4 = this.method1745(class74.field1407 & arg1 - 1, 0, (byte) 114);
            int[] var5 = this.method1745(arg1, 0, (byte) 110);
            int[] var6 = this.method1745(arg1 + 1 & class74.field1407, 0, (byte) 121);
            for (int var7 = 0; var7 < class169.field2936; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field5325;
                int var9 = (var5[class132.field2356 & var7 + 1] - var5[class132.field2356 & var7 - 1]) * this.field5325;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg0 != 64) {
            field5326 = -116;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZILcd;)V", line = 88)
    public static final void method2173(boolean arg0, int arg1, class64 arg2) {
        if (arg1 != -7704) {
            method2175(-70, 72, -67, 11, -24);
        }
        field5328++;
        if (!arg0) {
            try {
                class200.field3436.getAppletContext().showDocument(arg2.method493(class200.field3436.getCodeBase(), -21389), "_top");
            } catch (Exception var6) {
            }
            return;
        }
        if (class123.field2216 && class274.field4713) {
            try {
                class90.method683(class228.field3876.field4845, new Object[] { arg2.method493(class200.field3436.getCodeBase(), -21389).toString() }, "openjs", -3189);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class200.field3436.getAppletContext().showDocument(arg2.method493(class200.field3436.getCodeBase(), arg1 - 13685), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILkh;)V", line = 128)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field5323++;
        if (arg1 == 0) {
            this.field5325 = arg2.method112((byte) 92);
        }
        if (arg0 != 2) {
            this.method12(98, -93);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V", line = 143)
    public static final void method2174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5318++;
        class131.field2332[0].method279(arg4, arg0);
        int var6 = (arg5 - 32) * arg5 / arg3;
        class131.field2332[1].method279(arg4, arg0 + arg5 - arg1);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg2 / (arg3 - arg5);
        if (!class123.field2216) {
            class210.method1469(arg4, arg0 + 16, 16, arg5 - 32, class259.field4471);
            class210.method1469(arg4, arg0 + var7 + 16, 16, var6, class280.field4827);
            class210.method1474(arg4, arg0 + var7 + 16, var6, class107.field1985);
            class210.method1474(arg4 + 1, arg0 + 16 - -var7, var6, class107.field1985);
            class210.method1475(arg4, arg0 + var7 + 16, 16, class107.field1985);
            class210.method1475(arg4, arg0 + var7 + 17, 16, class107.field1985);
            class210.method1474(arg4 + 15, var7 + 16 + arg0, var6, class130.field2309);
            class210.method1474(arg4 + 14, arg0 - (-17 - var7), var6 - 1, class130.field2309);
            class210.method1475(arg4, arg0 + var6 + var7 + 15, 16, class130.field2309);
            class210.method1475(arg4 + 1, arg0 + var7 - -14 + var6, 15, class130.field2309);
            return;
        }
        class21.method208(arg4, arg0 + 16, 16, arg5 - 32, class259.field4471);
        class21.method208(arg4, arg0 + var7 + 16, 16, var6, class280.field4827);
        class21.method202(arg4, arg0 - (-var7 - 16), var6, class107.field1985);
        class21.method202(arg4 + 1, arg0 + 16 + var7, var6, class107.field1985);
        class21.method204(arg4, arg0 + var7 + 16, 16, class107.field1985);
        class21.method204(arg4, arg0 + var7 + 17, 16, class107.field1985);
        class21.method202(arg4 + 15, arg0 - -16 - -var7, var6, class130.field2309);
        class21.method202(arg4 + 14, arg0 + 17 + var7, var6 - 1, class130.field2309);
        class21.method204(arg4, arg0 + var7 + var6 + 15, 16, class130.field2309);
        class21.method204(arg4 + 1, arg0 + var7 + var6 + 14, 15, class130.field2309);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)I", line = 188)
    public static final int method2175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5320++;
        int var5 = arg3 - class50.field820[arg4 * 1024 / arg0] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILfk;II)V", line = 206)
    public static final void method2176(int arg0, class41 arg1, int arg2, int arg3) {
        field5319++;
        if ((arg0 & 0x1) != 0) {
            int var4 = class108.field1991.method120(2);
            int var5 = class108.field1991.method133(-128);
            boolean var6 = (var4 & 0x8000) != 0;
            int var7 = class108.field1991.method101(128);
            int var8 = class108.field1991.field281;
            if (arg1.field672 != null && arg1.field639 != null) {
                long var9 = arg1.field672.method509(31492);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var6 && (class41.field642 == 1 || class130.field2308 == 1)) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class61.field1194; var12++) {
                            if (class173.field2981[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class101.field1830 == 0) {
                    class272.field4669.field281 = 0;
                    class108.field1991.method148(class272.field4669.field254, -2, 0, var7);
                    int var13 = -1;
                    class272.field4669.field281 = 0;
                    class64 var15;
                    if (var6) {
                        var4 &= 0x7FFF;
                        class119 var14 = class117.method829(class272.field4669, -15522);
                        var13 = var14.field2159;
                        var15 = var14.field2158.method576(class272.field4669, false);
                    } else {
                        var15 = class179.method1254(class96.method724((byte) -36, class272.field4669).method520(true));
                    }
                    arg1.field1875 = var15.method501((byte) 64);
                    arg1.field1900 = var4 >> 8;
                    arg1.field1878 = 150;
                    arg1.field1879 = var4 & 0xFF;
                    if (var5 == 2) {
                        class104.method767(var13, var15, 32406, var6 ? 17 : 1, (class64) null, class104.method768(new class64[] { class163.field2857, arg1.method323(-1) }, false));
                    } else if (var5 == 1) {
                        class104.method767(var13, var15, 32406, var6 ? 17 : 1, (class64) null, class104.method768(new class64[] { class111.field2067, arg1.method323(-1) }, false));
                    } else {
                        class104.method767(var13, var15, 32406, var6 ? 17 : 2, (class64) null, arg1.method323(-1));
                    }
                }
            }
            class108.field1991.field281 = var7 + var8;
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field1908 = class108.field1991.method152((byte) -121);
            arg1.field1870 = class108.field1991.method152((byte) -91);
            arg1.field1907 = class108.field1991.method133(-128);
            arg1.field1847 = class108.field1991.method133(-128);
            arg1.field1888 = class108.field1991.method120(2) + class29.field482;
            arg1.field1877 = class108.field1991.method118(-114) + class29.field482;
            arg1.field1906 = class108.field1991.method133(-128);
            arg1.field1862 = 1;
            arg1.field1858 = 0;
        }
        if ((arg0 & 0x80) != 0) {
            arg1.field1912 = class108.field1991.method108((byte) 92);
            if (arg1.field1912 == 65535) {
                arg1.field1912 = -1;
            }
        }
        if ((arg0 & 0x100) != 0) {
            int var16 = class108.field1991.method110(12749);
            int var17 = class108.field1991.method110(12749);
            arg1.method764(class29.field482, var16, var17, -128);
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field1903 = class108.field1991.method118(-102);
            int var18 = class108.field1991.method105((byte) 101);
            arg1.field1866 = var18 >> 16;
            arg1.field1851 = (var18 & 0xFFFF) + class29.field482;
            arg1.field1872 = 0;
            if (arg1.field1903 == 65535) {
                arg1.field1903 = -1;
            }
            arg1.field1916 = 0;
            if (class29.field482 < arg1.field1851) {
                arg1.field1916 = -1;
            }
            if (arg1.field1903 != -1 && class29.field482 == arg1.field1851) {
                int var19 = class275.method1908(arg1.field1903, 70).field1647;
                if (var19 != -1) {
                    class199 var20 = class281.method1944(var19, 0);
                    if (var20 != null && var20.field3393 != null) {
                        class10.method89(arg1.field1865, arg1.field1859, 0, var20, true, class139.field2472 == arg1);
                    }
                }
            }
        }
        if ((arg0 & 0x40) != 0) {
            arg1.field1853 = class108.field1991.method120(2);
            arg1.field1867 = class108.field1991.method118(11);
        }
        if ((arg0 & 0x8) != 0) {
            arg1.field1875 = class108.field1991.method104((byte) 105);
            if (arg1.field1875.method495(0, (byte) 116) == 126) {
                arg1.field1875 = arg1.field1875.method508((byte) 99, 1);
                class233.method1670(arg1.field1875, arg1.method323(-1), 2, (byte) -105);
            } else if (class139.field2472 == arg1) {
                class233.method1670(arg1.field1875, arg1.method323(-1), 2, (byte) -109);
            }
            arg1.field1900 = 0;
            arg1.field1878 = 150;
            arg1.field1879 = 0;
        }
        if ((arg0 & 0x10) != 0) {
            int var21 = class108.field1991.method133(-128);
            byte[] var22 = new byte[var21];
            class13 var23 = new class13(var22);
            class108.field1991.method125(var21, 0, var22, 67);
            class181.field3106[arg3] = var23;
            arg1.method316(21089, var23);
        }
        if ((arg0 & 0x4) != 0) {
            int var24 = class108.field1991.method110(12749);
            int var25 = class108.field1991.method101(128);
            arg1.method764(class29.field482, var24, var25, -80);
            arg1.field1915 = class29.field482 + 300;
            arg1.field1881 = class108.field1991.method133(-128);
        }
        int var26 = 18 / ((-arg2 - 78) / 46);
        if ((arg0 & 0x20) == 0) {
            return;
        }
        int var27 = class108.field1991.method120(2);
        if (var27 == 65535) {
            var27 = -1;
        }
        int var28 = class108.field1991.method110(12749);
        class70.method572(var28, var27, 25, arg1);
    }
}
