import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class222 extends class96 {

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "I")
    private int field2865 = 4096;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "Lhb;")
    public static class250 field2861 = new class250(12, -1);

    @OriginalMember(owner = "client!rv", name = "R", descriptor = "[I")
    public static int[] field2866 = new int[14];

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "I")
    public static int field2868 = 0;

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "Lpi;")
    public static class340 field2869 = new class340(67, 6);

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!rv", name = "P", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!rv", name = "V", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!rv", name = "S", descriptor = "Lum;")
    public static class82 field2867;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIB)V")
    public static final void method1418(int arg0, int arg1, byte arg2) {
        if (arg2 != 42) {
            method1418(-76, -40, (byte) 114);
        }
        ++field2864;
        class436 var3 = class459.method2712(13, arg0, -1759243680);
        var3.method2574((byte) 46);
        var3.field5980 = arg1;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lwk;III)J")
    public static final long method1419(class323 arg0, int arg1, int arg2, int arg3) {
        ++field2863;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class402 var10 = class52.field715.method1164(arg0.method413(-30502), 0);
        long var11 = (long) (arg2 | arg3 << 7 | arg0.method414(17350) << 14 | arg0.method415(-15317) << 20 | 1073741824);
        if (~var10.field5347 == -1) {
            var11 |= var8;
        }
        if (~var10.field5344 == -2) {
            var11 |= var4;
        }
        if (var10.field5415) {
            var11 |= var6;
        }
        if (arg1 > -25) {
            method1422(34);
        }
        return var11 | (long) arg0.method413(-30502) << 32;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
    public class222() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field2870;
        if (arg1 != 255) {
            this.field2865 = -22;
        }
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int[] var4 = this.method657(0, class380.field4948 & arg0 + -1, -1);
            int[] var5 = this.method657(0, arg0, -1);
            int[] var6 = this.method657(0, class380.field4948 & arg0 - -1, -1);
            for (int var7 = 0; class269.field3403 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2865;
                int var9 = (var5[var7 + 1 & class292.field3781] + -var5[class292.field3781 & var7 + -1]) * this.field2865;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)V")
    public static final void method1420(int arg0, int arg1, boolean arg2) {
        ++field2862;
        if (~arg0 == -1) {
            class512.field7538 = class129.method839(class172.field2221, class272.field3454, class202.field2653, class421.field5647.field7728 * 2, arg0, (byte) -89);
        } else {
            if (arg2) {
                class512.field7538 = class129.method839(class172.field2221, class272.field3454, class202.field2653, 0, 0, (byte) -103);
                class512.field7538.method900(0);
                class278 var3 = class293.method1763(32516, class256.field3245, 0, class419.field5576);
                class167 var4 = class512.field7538.method867(var3, class136.method954(class391.field5121, class419.field5576, 0), true);
                class322.method1923(var4, true, class331.field4251.method1127(class379.field4920, false), -118);
                class512.field7538.method856();
                class11.method77(-32);
                class512.field7538.method878((byte) -122);
            }
            try {
                class512.field7538 = class129.method839(class172.field2221, class272.field3454, class202.field2653, class421.field5647.field7728 * 2, arg0, (byte) -67);
                if (class512.field7538.method882()) {
                    class125 var5 = class512.field7538.method849(78643200);
                    class512.field7538.method832(var5);
                }
            } catch (Throwable var7) {
                class512.field7538 = class129.method839(class172.field2221, class272.field3454, class202.field2653, 0, 0, (byte) -114);
                arg0 = 0;
            }
        }
        class520.field7690 = arg0;
        class288.method1745((byte) 91);
        if (!class512.field7538.method897()) {
            class388.field5098 = 1;
        }
        class512.field7538.method914(class388.field5098);
        class512.field7538.method874(0);
        class512.field7538.method922(8);
        class168.field2199 = class512.field7538.method916();
        class340.field4340 = class512.field7538.method916();
        class63.method360((byte) 76);
        class512.field7538.method853(!class421.field5647.field7705);
        if (class512.field7538.method854()) {
            class91.method628((byte) 73, class421.field5647.field7726);
        }
        class143.method994(0, class512.field7538, class118.field1647 >> 3, class200.field2594 >> 3);
        class322.method1922((byte) -24);
        class461.field6449 = false;
        int var6 = 46 / ((12 - arg1) / 48);
    }

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field2861 = null;
        field2867 = null;
        field2869 = null;
        if (arg0 != -2) {
            field2861 = null;
        }
        field2866 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 == arg1) {
            this.field2865 = arg2.method568((byte) 110);
        }
        ++field2859;
    }

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)V")
    public static final void method1422(int arg0) {
        class42.field615 = null;
        class302.field3915 = null;
        if (arg0 != -2) {
            field2867 = null;
        }
        class457.field6377 = null;
        ++field2860;
        class349.field4462 = null;
        class499.field7336 = null;
        class311.field4017 = null;
        class302.field3913 = null;
        class269.field3417 = null;
    }
}
