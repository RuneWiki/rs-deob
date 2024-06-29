import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class457 extends class34 {

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    private int field6661 = 32768;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field6666 = 0;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Lrb;")
    public static class283 field6663 = new class283(91, -1);

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Ldk;")
    public static class421 field6656;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field6660;
        int[] var3 = super.field537.method1780(arg0, (byte) 51);
        int var4 = 58 % (-arg1 / 50);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, arg0, 1);
            int[] var6 = this.method252(false, arg0, 2);
            for (int var7 = 0; ~var7 > ~class383.field5502; ++var7) {
                int var8 = var5[var7] >> 4 & 255;
                int var9 = var6[var7] * this.field6661 >> 12;
                int var10 = class135.field2057[var8] * var9 >> 12;
                int var11 = class38.field574[var8] * var9 >> 12;
                int var12 = class120.field1872 & (var10 >> 12) + var7;
                int var13 = class343.field4968 & (var11 >> 12) + arg0;
                int[] var14 = this.method252(false, var13, 0);
                var3[var7] = var14[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public static void method2669(int arg0) {
        if (arg0 > -111) {
            method2669(41);
        }
        field6663 = null;
        field6656 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field533 = ~arg0.method1869(-99) == -2;
            }
        } else {
            this.field6661 = arg0.method1844(-111) << 4;
        }
        if (arg1 > 16) {
            ++field6657;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public final void method146(byte arg0) {
        class114.method856(-123);
        ++field6658;
        if (arg0 > -84) {
            field6656 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class457() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IFIFF)F")
    public static final float method2670(int arg0, float arg1, int arg2, float arg3, float arg4) {
        ++field6664;
        int var5 = 16 / ((-60 - arg0) / 63);
        float[] var6 = class92.field1517[arg2];
        return var6[2] * arg1 + var6[1] * arg4 + var6[0] * arg3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        ++field6662;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int[] var4 = this.method252(false, arg1, 1);
            int[] var5 = this.method252(false, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class383.field5502 < ~var9; ++var9) {
                int var10 = (1044881 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field6661 >> 12;
                int var12 = class135.field2057[var10] * var11 >> 12;
                int var13 = class38.field574[var10] * var11 >> 12;
                int var14 = class120.field1872 & var9 - -(var12 >> 12);
                int var15 = class343.field4968 & arg1 - -(var13 >> 12);
                int[][] var16 = this.method254(0, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 != -11) {
            method2669(-99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public static final void method2671(int arg0) {
        class133.field2022.method2764(-769);
        ++field6655;
        class445.field6549.method2764(arg0 + -27718);
        if (arg0 != 26949) {
            field6663 = null;
        }
        class121.field1882.method2764(-769);
        class399.field5721.method2764(arg0 + -27718);
        class365.field5248.method2764(arg0 + -27718);
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
    public static final void method2672(int arg0) {
        if (class141.field2104 >= 0) {
            long var1 = class254.method1522((byte) -51);
            class141.field2104 = (int) ((long) class141.field2104 - (-class166.field2545 + var1));
            if (~class141.field2104 < -1) {
                int var3 = (class141.field2104 << 8) / class461.field6677;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = -var5 + 1.0F;
                class528.field7706 = ((65280 & class197.field2896) * var3 - -((65280 & class465.field6718.field5468) * var4) & 16711680) + (-16711936 & (16711935 & class197.field2896) * var3 + (class465.field6718.field5468 & 16711935) * var4) >>> 8;
                class42.field625 = (16711680 & (field6659 & 65280) * var3 + (class465.field6718.field5471 & 65280) * var4) + ((field6659 & 16711935) * var3 + (class465.field6718.field5471 & 16711935) * var4 & -16711936) >>> 8;
                class193.field2813 = class497.field7278 * var3 - -(class465.field6718.field5476 * var4) >> 8;
                class391.field5641 = (-class237.field3283 + class465.field6718.field5477) * var6 + class237.field3283;
                class189.field2780 = (class465.field6718.field5478 - class180.field2683) * var6 + class180.field2683;
                class270.field3642 = (-class350.field5081 + class465.field6718.field5470) * var6 + class350.field5081;
                class257.field3497 = (-class403.field5761 + class465.field6718.field5480) * var6 + class403.field5761;
                class136.field2060 = (-class167.field2549 + class465.field6718.field5473) * var6 + class167.field2549;
                class315.field4275 = (-class188.field2767 + class465.field6718.field5481) * var6 + class188.field2767;
                if (class44.field635 != class465.field6718.field5472) {
                    class419.field6072 = class228.field3204.method465(class44.field635, class465.field6718.field5472, var6, class419.field6072);
                }
            } else {
                class189.field2780 = class465.field6718.field5478;
                class141.field2104 = -1;
                class528.field7706 = class465.field6718.field5468;
                class270.field3642 = class465.field6718.field5470;
                class315.field4275 = class465.field6718.field5481;
                class193.field2813 = class465.field6718.field5476;
                class391.field5641 = class465.field6718.field5477;
                class42.field625 = class465.field6718.field5471;
                class136.field2060 = class465.field6718.field5473;
                class419.field6072 = class465.field6718.field5472;
                class257.field3497 = class465.field6718.field5480;
            }
            class166.field2545 = var1;
        }
        if (arg0 == 1) {
            ++field6665;
        }
    }
}
