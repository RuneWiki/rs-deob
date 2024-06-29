import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class142 extends class179 {

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    private int field2487 = 1;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    private int field2490 = 204;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    private int field2498 = 1;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Lng;")
    public static class138 field2488;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "(I)V", line = 4)
    public static void method1037(int arg0) {
        field2488 = null;
        if (arg0 != 0) {
            method1043(-10, 68, -92, 44, -27);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)V", line = 19)
    public static final void method1038(int arg0, boolean arg1, int arg2) {
        field2497++;
        class77 var3 = class156.method1158(7, arg1, arg2);
        var3.method584(22992);
        var3.field1455 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V", line = 32)
    public static final void method1039(int arg0, boolean arg1) {
        class185 var2 = (class185) class254.field4355.method1744((byte) 126, (long) arg0);
        field2489++;
        if (arg1) {
            field2495 = -29;
        }
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3254.length; var3++) {
                var2.field3254[var3] = -1;
                var2.field3256[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 171)
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZ)V", line = 63)
    public static final void method1040(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class129.field2264 = arg1;
        class57.field1051 = arg2;
        class195.field3553 = arg3;
        class114.field2015 = new class271[arg0][class129.field2264][class57.field1051];
        class72.field1329 = new int[arg0][class129.field2264 + 1][class57.field1051 + 1];
        if (class253.field4323) {
            class86.field1565 = new class113[4][];
        }
        if (arg4) {
            class1.field4 = new class271[1][class129.field2264][class57.field1051];
            class11.field167 = new int[class129.field2264][class57.field1051];
            class222.field3884 = new int[1][class129.field2264 + 1][class57.field1051 + 1];
            if (class253.field4323) {
                class237.field4041 = new class113[1][];
            }
        } else {
            class1.field4 = (class271[][][]) null;
            class11.field167 = (int[][]) null;
            class222.field3884 = (int[][][]) null;
            class237.field4041 = (class113[][]) null;
        }
        class49.method394(false);
        class143.field2502 = new class171[500];
        class112.field1955 = 0;
        class204.field3708 = new class171[500];
        class237.field4040 = 0;
        class305.field5275 = new int[arg0][class129.field2264 + 1][class57.field1051 + 1];
        class174.field3091 = new class269[5000];
        class243.field4127 = 0;
        class134.field2332 = new class269[100];
        class53.field978 = new boolean[class195.field3553 + class195.field3553 + 1][class195.field3553 + class195.field3553 + 1];
        class25.field326 = new boolean[class195.field3553 + class195.field3553 + 2][class195.field3553 + class195.field3553 + 2];
        class189.field3488 = new byte[arg0][class129.field2264][class57.field1051];
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)I", line = 108)
    public static final int method1041(int arg0, int arg1) {
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (arg1 != 31247) {
            method1042(true);
        }
        field2491++;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Lqh;", line = 161)
    public static final class31 method1042(boolean arg0) {
        if (arg0) {
            field2488 = (class138) null;
        }
        field2496++;
        return class231.field3950;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IIIII)V", line = 175)
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2492++;
        if (arg1 > -38) {
            return;
        }
        class73.method550(-29903, class308.field5329[arg3], arg2 + arg4, -arg4 + arg2, arg0);
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class308.field5329[arg3 + var6];
                int[] var10 = class308.field5329[arg3 - var6];
                var7 -= var6 << 1;
                int var11 = arg2 - var5;
                int var12 = arg2 + var5;
                class73.method550(-29903, var9, var12, var11, arg0);
                class73.method550(-29903, var10, var12, var11, arg0);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class308.field5329[arg3 + var5];
            int[] var16 = class308.field5329[arg3 - var5];
            class73.method550(-29903, var15, var13, var14, arg0);
            class73.method550(-29903, var16, var13, var14, arg0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILra;I)V", line = 238)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2487 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field2498 = arg1.method357(false);
        } else if (arg2 == 2) {
            this.field2490 = arg1.method346(-16);
        }
        if (arg0 < 108) {
            method1043(27, 20, 79, -25, 0);
        }
        field2494++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I", line = 273)
    public final int[] method41(int arg0, int arg1) {
        field2493++;
        if (arg1 != -31598) {
            this.field2490 = 125;
        }
        int[] var3 = this.field3157.method1258(arg1 + 31562, arg0);
        if (this.field3157.field3081) {
            for (int var4 = 0; var4 < class161.field2858; var4++) {
                int var5 = class290.field5017[var4];
                int var6 = class292.field5049[arg0];
                int var7 = this.field2487 * var5 >> 12;
                int var8 = var5 % (4096 / this.field2487) * this.field2487;
                int var9 = var6 % (4096 / this.field2498) * this.field2498;
                int var10 = this.field2498 * var6 >> 12;
                if (this.field2490 > var9) {
                    for (var7 -= var10; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field2490) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field2490) {
                    int var11;
                    for (var11 = var7 - var10; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
