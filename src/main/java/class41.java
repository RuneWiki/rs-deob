import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class41 extends class170 {

    @OriginalMember(owner = "client!r", name = "W", descriptor = "Lqk;")
    public static class207 field811 = class24.method212(255, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field822 = 7759444;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "Lqk;")
    public static class207 field825 = class24.method212(255, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "[I")
    public static int[] field824 = new int[128];

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "Lmd;")
    public static class220 field816;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "Lpk;")
    public static class99 field827;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
    public static void method309(int arg0) {
        if (arg0 > -110) {
            method313(-41, false, 116);
        }
        field824 = null;
        field816 = null;
        field811 = null;
        field827 = null;
        field825 = null;
    }

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)V")
    public static final void method310(int arg0) {
        ++field812;
        if (~class256.field4587 != 0 && ~class25.field532 != 0) {
            int var1 = ((-class6.field89 + class212.field3768) * class179.field3226 >> 16) + class6.field89;
            class179.field3226 += var1;
            if (class179.field3226 < 65535) {
                class268.field4750 = false;
                class199.field3481 = false;
            } else {
                class179.field3226 = 65535;
                if (class268.field4750) {
                    class199.field3481 = false;
                } else {
                    class199.field3481 = true;
                }
                class268.field4750 = true;
            }
            float var2 = (float) class179.field3226 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class129.field2261 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class212.field3767[class256.field4587][var4][var5] * 3;
                int var22 = class212.field3767[class256.field4587][var4 + 1][var5] * 3;
                int var23 = (class212.field3767[class256.field4587][var4 + 2][var5] + class212.field3767[class256.field4587][var4 + 2][var5] + -class212.field3767[class256.field4587][var4 + 3][var5]) * 3;
                int var24 = class212.field3767[class256.field4587][var4][var5];
                int var25 = var22 - var21;
                int var26 = var22 - var23 + class212.field3767[class256.field4587][var4 + 2][var5] + -var24;
                int var27 = -(var22 * 2) + var21 + var23;
                var3[var5] = (((float) var26 * var2 + (float) var27) * var2 + (float) var25) * var2 + (float) var24;
            }
            class209.field3702 = (int) var3[0] + -(class21.field349 * 128);
            class196.field3443 = (int) var3[1] * -1;
            int var6 = class86.field1563 * 2;
            float[] var7 = new float[3];
            class111.field1939 = (int) var3[2] - class180.field3231 * 128;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class212.field3767[class25.field532][var6][var8] * 3;
                int var15 = class212.field3767[class25.field532][var6 - -1][var8] * 3;
                int var16 = (class212.field3767[class25.field532][var6 + 2][var8] + -class212.field3767[class25.field532][var6 - -3][var8] + class212.field3767[class25.field532][var6 - -2][var8]) * 3;
                int var17 = class212.field3767[class25.field532][var6][var8];
                int var18 = -(var15 * 2) + var14 - -var16;
                int var19 = -var14 + var15;
                int var20 = class212.field3767[class25.field532][var6 + 2][var8] - var17 + -var16 + var15;
                var7[var8] = (((float) var20 * var2 + (float) var18) * var2 + (float) var19) * var2 + (float) var17;
            }
            float var9 = var7[0] + -var3[0];
            float var10 = (var7[arg0] - var3[1]) * -1.0F;
            float var11 = var7[2] + -var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class75.field1390 = (float) Math.atan2((double) var10, var12);
            class120.field2088 = -((float) Math.atan2((double) var9, (double) var11));
            class101.field1819 = (int) ((double) class120.field2088 * 325.949D) & 2047;
            class228.field4186 = 2047 & (int) ((double) class75.field1390 * 325.949D);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field823;
        if (arg1 == 5877) {
            if (~arg2 == -1) {
                this.method311(arg0.method1065((byte) 61), 1);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    private final void method311(int arg0, int arg1) {
        this.field820 = (arg0 & 255) << 4;
        ++field819;
        if (arg1 == 1) {
            this.field813 = (65280 & arg0) >> 4;
            this.field815 = arg0 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZB)I")
    public static final int method312(boolean arg0, byte arg1) {
        ++field821;
        long var2 = class53.method405(112);
        int var4 = -18 % ((-57 - arg1) / 60);
        for (class59 var5 = arg0 ? (class59) class157.field2763.method1873((byte) 25) : (class59) class157.field2763.method1866((byte) -57); var5 != null; var5 = (class59) class157.field2763.method1866((byte) -120)) {
            if (~var2 < ~(var5.field1078 & 4611686018427387903L)) {
                if (~(4611686018427387904L & var5.field1078) != -1L) {
                    int var6 = (int) var5.field3407;
                    class83.field1535[var6] = class85.field1543[var6];
                    var5.method1346((byte) -16);
                    return var6;
                }
                var5.method1346((byte) -16);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class41() {
        this(0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZI)V")
    public static final void method313(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method312(true, (byte) -75);
        }
        ++field818;
        if (class98.method697(arg2, 4401)) {
            class281.method1909(-101, class227.field4162[arg2], arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
    private class41(int arg0) {
        super(0, false);
        this.method311(arg0, 1);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field826;
            int[][] var3 = super.field3002.method427(arg0, 239);
            if (super.field3002.field1077) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class88.field1595; ++var7) {
                    var4[var7] = this.field815;
                    var5[var7] = this.field813;
                    var6[var7] = this.field820;
                }
            }
            return var3;
        }
    }
}
