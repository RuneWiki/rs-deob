import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class203 extends class27 {

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "[S")
    private short[] field2984 = new short[257];

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    private int field2986 = 0;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "Lad;")
    public static class342 field2978 = new class342();

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field2992 = 0;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "[I")
    private int[] field2977;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "[I")
    private int[] field2985;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "[[I")
    private int[][] field2983;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V", line = 5)
    public final void method22(int arg0) {
        if (this.field2983 == null) {
            this.field2983 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field2980++;
        if (this.field2983.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field2986 == 2) {
            this.method1471((byte) 127);
        }
        if (arg0 > -63) {
            field2978 = (class342) null;
        }
        class172.method1206(28820);
        this.method1470((byte) -83);
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(B)V", line = 30)
    private final void method1470(byte arg0) {
        field2981++;
        int var2 = -127 % ((arg0 + 23) / 55);
        int var3 = this.field2986;
        if (var3 == 2) {
            for (int var21 = 0; var21 < 257; var21++) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; var23 < (this.field2983.length - 1) && var22 >= this.field2983[var23][0]; var23++) {
                }
                int[] var24 = this.field2983[var23];
                int[] var25 = this.field2983[var23 - 1];
                int var26 = this.method1476(var23 - 2, 32767)[1];
                int var27 = var25[1];
                int var28 = var24[1];
                int var29 = this.method1476(var23 + 1, 32767)[1];
                int var30 = (var22 - var25[0] << 12) / (var24[0] - var25[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = var29 + var27 - var28 - var26;
                int var33 = var26 - var27 - var32;
                int var34 = var28 - var26;
                int var36 = (var30 * var32 >> 12) * var31 >> 12;
                int var37 = var30 * var34 >> 12;
                int var38 = var31 * var33 >> 12;
                int var39 = var27 + var37 + var36 + var38;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field2984[var21] = (short) var39;
            }
        } else if (var3 == 1) {
            for (int var4 = 0; var4 < 257; var4++) {
                int var5 = var4 << 4;
                int var6;
                for (var6 = 1; (this.field2983.length - 1) > var6 && var5 >= this.field2983[var6][0]; var6++) {
                }
                int[] var7 = this.field2983[var6 - 1];
                int[] var8 = this.field2983[var6];
                int var9 = (var5 - var7[0] << 12) / (var8[0] - var7[0]);
                int var10 = 4096 - client.field646[(var9 & 0x1FF1) >> 5] >> 1;
                int var11 = 4096 - var10;
                int var12 = var7[1] * var11 + var8[1] * var10 >> 12;
                if (var12 <= -32768) {
                    var12 = -32767;
                }
                if (var12 >= 32768) {
                    var12 = 32767;
                }
                this.field2984[var4] = (short) var12;
            }
        } else {
            for (int var13 = 0; var13 < 257; var13++) {
                int var14 = var13 << 4;
                int var15;
                for (var15 = 1; var15 < this.field2983.length - 1 && this.field2983[var15][0] <= var14; var15++) {
                }
                int[] var16 = this.field2983[var15 - 1];
                int[] var17 = this.field2983[var15];
                int var18 = (var14 - var16[0] << 12) / (var17[0] - var16[0]);
                int var19 = 4096 - var18;
                int var20 = var16[1] * var19 + var17[1] * var18 >> 12;
                if (var20 <= -32768) {
                    var20 = -32767;
                }
                if (var20 >= 32768) {
                    var20 = 32767;
                }
                this.field2984[var13] = (short) var20;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(B)V", line = 213)
    private final void method1471(byte arg0) {
        field2975++;
        int[] var2 = this.field2983[1];
        int var3 = 106 / ((56 - arg0) / 53);
        int[] var4 = this.field2983[0];
        int[] var5 = this.field2983[this.field2983.length - 2];
        int[] var6 = this.field2983[this.field2983.length - 1];
        this.field2977 = new int[] { var4[0] + var4[0] - var2[0], var4[1] + -var2[1] + var4[1] };
        this.field2985 = new int[] { var5[0] + var5[0] - var6[0], var5[1] + -var6[1] + var5[1] };
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZIII)V", line = 237)
    public static final void method1472(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        class329.method2285(arg3 - arg1, class274.field4158[arg5], (byte) -84, arg1 + arg3, arg0);
        int var7 = arg4;
        field2990++;
        if (!arg2) {
            method1474(-116, -104);
        }
        int var8 = arg1 * arg1;
        int var9 = arg4 * arg4;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg4 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = (1 - var12) * var8 + var11;
        int var15 = ((var6 << 1) + 3) * var11;
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((arg4 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg4 - 1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var19;
                    var14 += var15;
                    var19 += var17;
                    var15 += var17;
                    var6++;
                }
            }
            if (var13 < 0) {
                var14 += var15;
                var13 += var19;
                var15 += var17;
                var6++;
                var19 += var17;
            }
            var13 += -var18;
            var7--;
            var18 -= var16;
            int var21 = arg5 - var7;
            var14 += -var20;
            int var22 = arg5 + var7;
            int var23 = arg3 + var6;
            var20 -= var16;
            int var24 = arg3 - var6;
            class329.method2285(var24, class274.field4158[var21], (byte) 112, var23, arg0);
            class329.method2285(var24, class274.field4158[var22], (byte) -53, var23, arg0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lph;ILph;)V", line = 320)
    public static final void method1473(class361 arg0, int arg1, class361 arg2) {
        class36.field530 = arg0;
        class220.field3288 = arg2;
        class220.field3288.method2539(true, 34);
        field2987++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        if (arg1 > -111) {
            field2993 = -108;
        }
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class240.field3577 = var4 + var5;
        class72.field1055 = var3 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        field2994 = var5 + var6;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[F", line = 347)
    public static final float[] method1474(int arg0, int arg1) {
        field2976++;
        float var2 = class222.method1622() + class222.method1627();
        float var3 = 0.58823526F;
        int var4 = class222.method1631();
        float var5 = (float) ((var4 & 0xFFC55E) >> 16) / 255.0F;
        class331.field5034[0] = var2 * (float) class287.method2076(255, arg0 >> 16) / 255.0F * var5 * var3;
        class331.field5034[3] = 1.0F;
        float var6 = (float) (var4 >> 8 & 0xFF) / 255.0F;
        class331.field5034[1] = var2 * (float) (class287.method2076(65330, arg0) >> 8) / 255.0F * var6 * var3;
        float var7 = (float) (var4 & 0xFF) / 255.0F;
        if (arg1 != -20690) {
            field2994 = 67;
        }
        class331.field5034[2] = var7 * ((float) class287.method2076(arg0, 255) / 255.0F) * var3 * var2;
        return class331.field5034;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILbo;)V", line = 374)
    public static final void method1475(int arg0, int arg1, int arg2, class16 arg3) {
        field2982++;
        class49.field727.method95(-30123);
        if (class265.field4054) {
            return;
        }
        class287 var4 = (class287) arg3.method93((byte) -23);
        if (arg2 != -10) {
            return;
        }
        while (var4 != null) {
            class200 var5 = class349.method2447(var4.field4350, (byte) -9);
            if (class276.method2017(-6, var5)) {
                class324.method2245(arg0, arg1, -20841, var4, var5);
                if (var4.field4352) {
                    class361.method2528(var4, (byte) -93, var5);
                }
            }
            var4 = (class287) arg3.method97(arg2 ^ 0x47);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 513)
    public class203() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILsb;I)V", line = 413)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field2988++;
        if (arg2 == 0) {
            this.field2986 = arg1.method1319(255);
            this.field2983 = new int[arg1.method1319(arg0 + 6091)][2];
            for (int var4 = 0; var4 < this.field2983.length; var4++) {
                this.field2983[var4][0] = arg1.method1317((byte) 15);
                this.field2983[var4][1] = arg1.method1317((byte) 3);
            }
        }
        if (arg0 != -5836) {
            this.method1471((byte) 122);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[I", line = 442)
    public final int[] method18(int arg0, byte arg1) {
        field2991++;
        if (arg1 != -62) {
            method1474(112, 17);
        }
        int[] var3 = this.field375.method2087(-57, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, 52, 0);
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2984[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I", line = 490)
    private final int[] method1476(int arg0, int arg1) {
        if (arg1 != 32767) {
            field2995 = 12;
        }
        field2979++;
        if (arg0 < 0) {
            return this.field2977;
        } else if (arg0 >= this.field2983.length) {
            return this.field2985;
        } else {
            return this.field2983[arg0];
        }
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V", line = 517)
    public static void method1477(int arg0) {
        if (arg0 == 32120) {
            field2978 = null;
        }
    }
}
