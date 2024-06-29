import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class621 extends class551 {

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field9066 = -1;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public int field9064;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public int field9068;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public int field9070;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Lclient;")
    public static client field9076;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Ljava/lang/String;")
    public String field9072;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)I")
    public final int method3591(int arg0) {
        ++field9067;
        return arg0 != -20163 ? -105 : (int) (255L & super.field7465 >>> 32);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public final void method3592(byte arg0) {
        ++field9069;
        super.field8204 |= Long.MIN_VALUE;
        if (~this.method3594((byte) -24) == -1L) {
            class218.field3230.method2331(2, this);
        }
        if (arg0 <= 105) {
            this.method3598(14);
        }
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)I")
    public final int method3593(int arg0) {
        ++field9065;
        int var2 = -77 / ((-43 - arg0) / 58);
        return (int) super.field7465;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)J")
    public final long method3594(byte arg0) {
        ++field9075;
        if (arg0 != -24) {
            this.method3591(-55);
        }
        return Long.MAX_VALUE & super.field8204;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method3595(byte arg0) {
        if (arg0 <= -52) {
            field9076 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZZ)V")
    public static final void method3596(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 0) {
            method3596(-85, true, false);
        }
        if (arg1) {
            --class647.field9383;
            if (~class647.field9383 == -1) {
                class150.field1929 = null;
            }
        }
        ++field9071;
        if (arg2) {
            --class165.field2236;
            if (class165.field2236 == 0) {
                class620.field9045 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
    public static final void method3597(byte arg0) {
        ++field9073;
        if (class615.field9012 != -1 && class586.field8709 != -1) {
            int var1 = class426.field6076 - -((-class426.field6076 + class202.field3014) * class566.field8404 >> 16);
            class566.field8404 += var1;
            if (class566.field8404 < 65535) {
                class554.field8233 = false;
                class413.field5885 = false;
            } else {
                class566.field8404 = 65535;
                if (!class413.field5885) {
                    class554.field8233 = true;
                } else {
                    class554.field8233 = false;
                }
                class413.field5885 = true;
            }
            float var2 = (float) class566.field8404 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class417.field6001 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class264.field3926[class615.field9012][var4][var5] * 3;
                int var22 = class264.field3926[class615.field9012][var4 + 1][var5] * 3;
                int var23 = (-class264.field3926[class615.field9012][var4 - -3][var5] - (-class264.field3926[class615.field9012][var4 + 2][var5] - class264.field3926[class615.field9012][var4 - -2][var5])) * 3;
                int var24 = class264.field3926[class615.field9012][var4][var5];
                int var25 = var22 - var21;
                int var26 = var21 - -var23 + -(var22 * 2);
                int var27 = var22 - var23 + class264.field3926[class615.field9012][var4 + 2][var5] + -var24;
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class358.field5200 = (int) var3[0] + -(class584.field8677 * 128);
            class111.field1412 = (int) var3[1] * -1;
            class367.field5319 = (int) var3[2] + -(class424.field6061 * 128);
            float[] var6 = new float[3];
            int var7 = class139.field1824 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class264.field3926[class586.field8709][var7][var8] * 3;
                int var15 = class264.field3926[class586.field8709][var7 + 1][var8] * 3;
                int var16 = (class264.field3926[class586.field8709][var7 + 2][var8] + class264.field3926[class586.field8709][var7 + 2][var8] + -class264.field3926[class586.field8709][var7 - -3][var8]) * 3;
                int var17 = class264.field3926[class586.field8709][var7][var8];
                int var18 = -var14 + var15;
                int var19 = -(var15 * 2) + var14 + var16;
                int var20 = class264.field3926[class586.field8709][var7 + 2][var8] - -var15 + -var16 + -var17;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            if (arg0 != -111) {
                field9076 = null;
            }
            float var9 = var6[0] - var3[0];
            float var10 = (var6[1] - var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class151.field1935 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 16383;
            class543.field8120 = 16383 & (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11));
            class495.field7464 = ((class264.field3926[class615.field9012][var4 + 2][3] + -class264.field3926[class615.field9012][var4][3]) * class566.field8404 >> 16) + class264.field3926[class615.field9012][var4][3];
        }
    }

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "(I)V")
    public final void method3598(int arg0) {
        super.field8204 = class450.method2719((byte) -14) - -500L | super.field8204 & Long.MIN_VALUE;
        ++field9077;
        if (arg0 != 255) {
            this.field9068 = 24;
        }
        class635.field9257.method2331(2, this);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(II)V")
    public class621(int arg0, int arg1) {
        super.field7465 = (long) arg1 | (long) arg0 << 32;
    }
}
