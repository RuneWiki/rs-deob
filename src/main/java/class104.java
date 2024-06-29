import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class104 extends class219 {

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    private int field1873 = 32768;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "F")
    public static float field1879;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "[Lob;")
    public static class78[] field1880;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[[I", line = 12)
    public final int[][] method219(int arg0, byte arg1) {
        if (arg1 != 83) {
            return (int[][]) ((int[][]) null);
        }
        field1875++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[] var4 = this.method1585(1, arg0, arg1 - 6689);
            int[] var5 = this.method1585(2, arg0, -6606);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class128.field2326; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF7A4) >> 12;
                int var11 = var5[var9] * this.field1873 >> 12;
                int var12 = class31.field518[var10] * var11 >> 12;
                int var13 = class293.field4927[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class252.field4208;
                int var15 = class60.field927 & arg0 + (var13 >> 12);
                int[][] var16 = this.method1583(var15, true, 0);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[F", line = 65)
    public static final float[] method841(byte arg0, int arg1) {
        field1878++;
        float var2 = class108.method875() + class108.method871();
        int var3 = class108.method874();
        if (arg0 != -91) {
            field1879 = -1.1513861F;
        }
        class258.field4301[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFF40F1) >> 16) / 255.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class258.field4301[0] = var2 * var7 * (float) (class92.method695(16741448, arg1) >> 16) / 255.0F * var4;
        class258.field4301[1] = (float) (class92.method695(65283, arg1) >> 8) / 255.0F * var5 * var7 * var2;
        class258.field4301[2] = var2 * (float) class92.method695(255, arg1) / 255.0F * var6 * var7;
        return class258.field4301;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIJ)Z", line = 98)
    public static final boolean method842(int arg0, int arg1, int arg2, long arg3) {
        class225 var5 = class288.field4856[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3753 != null && var5.field3753.field4526 == arg3) {
            return true;
        } else if (var5.field3775 != null && var5.field3775.field2461 == arg3) {
            return true;
        } else if (var5.field3763 != null && var5.field3763.field2656 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3756; var6++) {
                if (var5.field3765[var6].field697 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 125)
    public class104() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V", line = 137)
    public final void method39(byte arg0) {
        class165.method1302(arg0 - 3);
        if (arg0 != 22) {
            this.field1873 = 31;
        }
        field1881++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI[I[I)V", line = 149)
    public static final void method843(int arg0, byte arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 > -26) {
            return;
        }
        field1877++;
        if (arg2 >= arg0) {
            return;
        }
        int var5 = (arg2 + arg0) / 2;
        int var6 = arg2;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var7;
        int var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg2; var9 < arg0; var9++) {
            if ((var9 & 0x1) + var7 < arg4[var9]) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                int var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg4[arg0] = arg4[var6];
        arg4[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method843(var6 - 1, (byte) -84, arg2, arg3, arg4);
        method843(arg0, (byte) -81, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lda;Lda;Lda;Lda;I)V", line = 205)
    public static final void method844(class143 arg0, class143 arg1, class143 arg2, class143 arg3, int arg4) {
        class231.field3865 = arg2;
        class111.field2008 = arg3;
        class42.field686 = arg0;
        class84.field1517 = arg1;
        if (arg4 != 1) {
            field1880 = (class78[]) null;
        }
        field1874++;
        class95.field1739 = new class78[class231.field3865.method1140(-1)][];
        class46.field730 = new boolean[class231.field3865.method1140(-1)];
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V", line = 222)
    public static final void method845(int arg0) {
        int var1 = 91 % ((arg0 + 29) / 42);
        while (class63.field975.method346(class244.field4045, 8) >= 27) {
            int var2 = class63.field975.method344(2, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class204.field3446[var2] == null) {
                class204.field3446[var2] = new class60();
                var3 = true;
            }
            class60 var4 = class204.field3446[var2];
            class278.field4674[class31.field520++] = var2;
            var4.field5051 = class90.field1598;
            if (var4.field926 != null && var4.field926.method640(5782)) {
                class22.method182(false, var4);
            }
            int var5 = class63.field975.method344(2, 1);
            var4.field926 = class223.method1613(class63.field975.method344(2, 14), false);
            int var6 = class63.field975.method344(2, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class63.field975.method344(2, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class63.field975.method344(2, 1);
            if (var8 == 1) {
                class181.field3118[class267.field4446++] = var2;
            }
            int var9 = class270.field4521[class63.field975.method344(2, 3)];
            if (var3) {
                var4.field5025 = var4.field5018 = var9;
            }
            var4.method2051(var4.field926.field1485, 7);
            var4.field5068 = var4.field926.field1444;
            var4.field5072 = var4.field926.field1457;
            var4.field5030 = var4.field926.field1474;
            var4.field5053 = var4.field926.field1452;
            if (var4.field5030 == 0) {
                var4.field5018 = 0;
            }
            var4.field5042 = var4.field926.field1477;
            var4.field5037 = var4.field926.field1437;
            var4.field5043 = var4.field926.field1466;
            var4.field5066 = var4.field926.field1481;
            var4.method2049(var4.method293((byte) 25), class122.field2215.field5050[0] + var7, var5 == 1, (byte) 125, class122.field2215.field5034[0] + var6);
            if (var4.field926.method640(5782)) {
                class68.method486(var4.field5034[0], 109, 0, (class311) null, (class39) null, class157.field2765, var4, var4.field5050[0]);
            }
        }
        class63.field975.method339(false);
        field1882++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)[I", line = 306)
    public final int[] method41(boolean arg0, int arg1) {
        field1876++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(1, arg1, -6606);
            int[] var5 = this.method1585(2, arg1, -6606);
            for (int var6 = 0; var6 < class128.field2326; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field1873 >> 12;
                int var9 = class31.field518[var7] * var8 >> 12;
                int var10 = class252.field4208 & (var9 >> 12) + var6;
                int var11 = class293.field4927[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg1 & class60.field927;
                int[] var13 = this.method1585(0, var12, -6606);
                var3[var6] = var13[var10];
            }
        }
        if (!arg0) {
            this.method219(-45, (byte) -37);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILb;)V", line = 362)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            method844((class143) null, (class143) null, (class143) null, (class143) null, -108);
        }
        if (arg0 == 0) {
            this.field1873 = arg2.method761((byte) 108) << 4;
        } else if (arg0 == 1) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        field1871++;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)J", line = 397)
    public static final long method846(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3756; var4++) {
            class43 var5 = var3.field3765[var4];
            if ((var5.field697 >> 29 & 0x3L) == 2L && var5.field711 == arg1 && var5.field699 == arg2) {
                return var5.field697;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V", line = 421)
    public static void method847(byte arg0) {
        int var1 = 45 % ((arg0 + 44) / 33);
        field1880 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)V", line = 431)
    public static final void method848(int arg0, int arg1, int arg2, int arg3) {
        field1872++;
        if (arg2 > 3) {
            class162 var4 = class135.method1062(new class162[] { class3.field22, class156.method1212(10, arg0), class278.field4686, class156.method1212(10, arg3 >> 6), class278.field4686, class156.method1212(10, arg1 >> 6), class278.field4686, class156.method1212(10, arg3 & 0x3F), class278.field4686, class156.method1212(10, arg1 & 0x3F) }, true);
            var4.method1260(false);
            class158.method1223((byte) 5, var4);
        }
    }
}
