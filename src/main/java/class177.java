import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class177 extends class285 {

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "[I")
    private int[] field2945 = new int[3];

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    private int field2947 = 3216;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    private int field2949 = 4096;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    private int field2948 = 3216;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static volatile int field2954 = -1;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "F")
    public static float field2955;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)I", line = 8)
    public static final int method1330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg0;
            arg0 = var7;
        }
        if (arg2 != -1455863777) {
            field2955 = -0.47010195F;
        }
        int var8 = arg5 & 0x3;
        field2953++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 - arg4 - (arg1 - 1);
        } else if (var8 == 2) {
            return 1 + 7 - arg6 - arg0;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLjj;I)V", line = 40)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field2952++;
        if (arg2 == 0) {
            this.field2949 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field2948 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field2947 = arg1.method271(21081);
        }
        if (!arg0) {
            field2954 = 70;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)[I", line = 89)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2945 = (int[]) null;
        }
        field2956++;
        int[] var3 = this.field4573.method1116(120, arg1);
        if (this.field4573.field2420) {
            int var4 = class101.field1473 * this.field2949 >> 12;
            int[] var5 = this.method2048(0, (byte) 123, class32.field432 & arg1 - 1);
            int[] var6 = this.method2048(0, (byte) 127, arg1);
            int[] var7 = this.method2048(0, (byte) 126, class32.field432 & arg1 + 1);
            for (int var8 = 0; var8 < class287.field4599; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = (var6[var8 - 1 & class112.field1717] - var6[class112.field1717 & var8 + 1]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class333.field5177[((var10 + 1) * var10 >> 1) + var12] & 0xFF;
                int var14 = var11 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field2945[2] * var15 >> 12;
                int var18 = this.field2945[1] * var16 >> 12;
                int var19 = this.field2945[0] * var14 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 236)
    public class177() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 167)
    private final void method1331(boolean arg0) {
        field2946++;
        double var2 = Math.cos((double) ((float) this.field2947 / 4096.0F));
        this.field2945[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field2948 / 4096.0F)));
        this.field2945[1] = (int) (var2 * Math.cos((double) ((float) this.field2948 / 4096.0F)) * 4096.0D);
        this.field2945[2] = (int) (Math.sin((double) ((float) this.field2947 / 4096.0F)) * 4096.0D);
        int var4 = this.field2945[0] * this.field2945[0] >> 12;
        if (!arg0) {
            this.method60(false, 56);
        }
        int var5 = this.field2945[1] * this.field2945[1] >> 12;
        int var6 = this.field2945[2] * this.field2945[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2945[2] = (this.field2945[2] << 12) / var7;
            this.field2945[1] = (this.field2945[1] << 12) / var7;
            this.field2945[0] = (this.field2945[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBIII)V", line = 204)
    public static final void method1332(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -108) {
            field2954 = -84;
        }
        class193[] var7 = class175.field2895;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class193 var9 = var7[var8];
            if (var9 != null && var9.field3156 == 2) {
                class339.method2360((var9.field3161 - class70.field989 << 7) + var9.field3149, arg5 >> 1, var9.field3151 * 2, arg3 + 236, arg6 >> 1, (var9.field3145 - class205.field3367 << 7) + var9.field3144, arg4, arg2);
                if (class193.field3154 > -1 && (class240.field3818 % 20) < 10) {
                    class147.field2288[var9.field3152].method375(arg0 + class193.field3154 - 12, arg1 - -class78.field1100 + -28);
                }
            }
        }
        field2950++;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V", line = 254)
    public final void method361(int arg0) {
        this.method1331(true);
        int var2 = 119 / ((42 - arg0) / 36);
        field2957++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I", line = 265)
    public static final int method1333(int arg0, int arg1, int arg2) {
        field2944++;
        if (arg0 < 43) {
            return -115;
        } else {
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg2 - var3;
        }
    }
}
