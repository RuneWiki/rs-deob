import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 extends class8 {

    @OriginalMember(owner = "client!be", name = "M", descriptor = "[S")
    public static short[] field440 = new short[] { 34, 42, 46, 30, 44, 39, 35, 60 };

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field449 = 0;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "F")
    public static float field445;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "Ljava/lang/String;")
    public static String field437;

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class28() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        ++field438;
        int var3 = -119 / ((arg1 - -48) / 46);
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[][] var5 = this.method60(arg0, 0, 99);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var5[0];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            int[] var11 = var4[0];
            for (int var12 = 0; ~class231.field3798 < ~var12; ++var12) {
                var11[var12] = -var8[var12] + 4096;
                var10[var12] = -var6[var12] + 4096;
                var9[var12] = -var7[var12] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
    public static final void method240(String arg0, int arg1, String arg2, int arg3, String arg4, int arg5) {
        for (int var6 = 99; ~var6 < -1; --var6) {
            class254.field4042[var6] = class254.field4042[var6 + -1];
            class245.field3929[var6] = class245.field3929[var6 - 1];
            class211.field3445[var6] = class211.field3445[var6 + -1];
            class64.field1076[var6] = class64.field1076[var6 - 1];
            class209.field3424[var6] = class209.field3424[var6 + -1];
        }
        class220.field3606 = class66.field1094;
        ++class136.field2245;
        ++field444;
        class254.field4042[0] = arg3;
        class245.field3929[0] = arg0;
        class211.field3445[0] = arg4;
        class64.field1076[0] = arg2;
        if (arg5 >= -30) {
            field443 = -109;
        }
        class209.field3424[0] = arg1;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            field449 = -88;
        }
        ++field451;
        int[] var3 = super.field110.method1585(0, arg1);
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1, -124, 0);
            for (int var5 = 0; ~class231.field3798 < ~var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILqh;)V")
    public static final void method241(int arg0, class201 arg1) {
        class198.field3153 = arg1;
        class183.field2883 = class198.field3153.method1361(arg0, -100);
        ++field442;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lqh;BI)[Lcb;")
    public static final class243[] method242(class201 arg0, byte arg1, int arg2) {
        ++field439;
        if (!class96.method714(arg2, (byte) 94, arg0)) {
            return null;
        } else {
            if (arg1 < 124) {
                method243((byte) 111);
            }
            return class106.method772(true);
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
    public static final void method243(byte arg0) {
        ++field446;
        if (~class7.field89 != 0 && class184.field2898 != -1) {
            int var1 = ((-field449 + class224.field3705) * class48.field856 >> 16) + field449;
            float[] var2 = new float[3];
            class48.field856 += var1;
            int var3 = class156.field2540 * 2;
            if (arg0 >= -82) {
                field449 = -126;
            }
            if (~class48.field856 > -65536) {
                class144.field2312 = false;
                class94.field1542 = false;
            } else {
                if (!class144.field2312) {
                    class94.field1542 = true;
                } else {
                    class94.field1542 = false;
                }
                class144.field2312 = true;
                class48.field856 = 65535;
            }
            float var4 = (float) class48.field856 / 65535.0F;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class289.field4576[class7.field89][var3 + 1][var5] * 3;
                int var22 = class289.field4576[class7.field89][var3][var5];
                int var23 = class289.field4576[class7.field89][var3][var5] * 3;
                int var24 = (class289.field4576[class7.field89][var3 + 2][var5] + class289.field4576[class7.field89][var3 + 2][var5] + -class289.field4576[class7.field89][var3 + 3][var5]) * 3;
                int var25 = -var23 + var21;
                int var26 = var23 - (var21 * 2 - var24);
                int var27 = class289.field4576[class7.field89][var3 - -2][var5] + -var24 + -var22 + var21;
                var2[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var22;
            }
            class99.field1625 = (int) var2[2] + -(class214.field3501 * 128);
            class54.field925 = (int) var2[0] + -(class50.field884 * 128);
            class17.field301 = (int) var2[1] * -1;
            int var6 = class103.field1676 * 2;
            float[] var7 = new float[3];
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class289.field4576[class184.field2898][var6][var8] * 3;
                int var15 = class289.field4576[class184.field2898][var6 + 1][var8] * 3;
                int var16 = class289.field4576[class184.field2898][var6][var8];
                int var17 = (-class289.field4576[class184.field2898][var6 - -3][var8] - (-class289.field4576[class184.field2898][var6 - -2][var8] - class289.field4576[class184.field2898][var6 - -2][var8])) * 3;
                int var18 = var14 - var15 * 2 + var17;
                int var19 = var15 - var14;
                int var20 = class289.field4576[class184.field2898][var6 + 2][var8] - (-var15 + var16) + -var17;
                var7[var8] = (((float) var20 * var4 + (float) var18) * var4 + (float) var19) * var4 + (float) var16;
            }
            float var9 = var7[0] - var2[0];
            float var10 = (var7[1] - var2[1]) * -1.0F;
            float var11 = var7[2] + -var2[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class19.field335 = (float) Math.atan2((double) var10, var12);
            class133.field2126 = -((float) Math.atan2((double) var9, (double) var11));
            class200.field3187 = (int) ((double) class19.field335 * 325.949D) & 2047;
            class202.field3242 = (int) ((double) class133.field2126 * 325.949D) & 2047;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field115 = arg1.method1517((byte) -96) == 1;
        }
        ++field447;
        if (arg0 < 62) {
            method245(38);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method244(String arg0, int arg1, String arg2, int arg3) {
        class219.field3581 = arg0;
        class285.field4513 = arg1;
        ++field441;
        class263.field4207 = arg2;
        if (!class219.field3581.equals("") && !class263.field4207.equals("")) {
            if (~class4.field46 != 0) {
                class259.method1770(arg3 ^ -24840);
            } else {
                class227.field3765 = 0;
                class241.field3903 = 0;
                class33.field515 = -3;
                class224.field3707 = 1;
                class221 var4 = new class221(128);
                var4.method1548(-494964184, 10);
                var4.method1529((byte) 123, (int) (9.9999999E7D * Math.random()));
                var4.method1502((byte) -40, class74.method522((byte) -77, class219.field3581));
                var4.method1529((byte) 117, (int) (Math.random() * 9.9999999E7D));
                var4.method1563(class263.field4207, arg3 ^ -24871);
                var4.method1529((byte) 123, (int) (9.9999999E7D * Math.random()));
                var4.method1530(class247.field3950, arg3 ^ arg3, class60.field984);
                class68.field1113.field3655 = 0;
                class68.field1113.method1548(-494964184, 24);
                class68.field1113.method1548(-494964184, 2 - -var4.field3655);
                class68.field1113.method1554(533, (byte) 89);
                class68.field1113.method1537(var4.field3653, (byte) 20, var4.field3655, 0);
            }
        } else {
            class33.field515 = 3;
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public static final void method245(int arg0) {
        class39.field726 = new class115();
        ++field436;
        if (arg0 != 2) {
            field440 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public static final void method246(int arg0) {
        if (arg0 >= -97) {
            method247((byte) -125);
        }
        class135.field2223.method481(false);
        class278.field4388.method481(false);
        class108.field1777.method481(false);
        ++field450;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
    public static void method247(byte arg0) {
        field440 = null;
        int var1 = 116 / ((arg0 - 3) / 57);
        field437 = null;
    }
}
