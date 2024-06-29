import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class223 extends class266 {

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field4094 = -1;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field4088 = -1;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "Lli;")
    private static class185 field4095 = class245.method1649("RuneScape is loading )2 please wait)3)3)3", -94);

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Lli;")
    public static class185 field4087 = field4095;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "B")
    public byte field4092;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public int field4093;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "Ljd;")
    public class118 field4098;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Lhi;")
    public static class250 field4091;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    public static final void method1545(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class42.field641; ++var3) {
            for (int var4 = 0; var4 < class264.field4685; ++var4) {
                for (int var5 = 0; var5 < class122.field2214; ++var5) {
                    class198 var6 = class153.field2896[var3][var4][var5];
                    if (var6 != null) {
                        class206 var7 = var6.field3640;
                        if (var7 != null && var7.field3787.method65()) {
                            class1.method4(var7.field3787, var3, var4, var5, 1, 1);
                            if (var7.field3780 != null && var7.field3780.method65()) {
                                class1.method4(var7.field3780, var3, var4, var5, 1, 1);
                                var7.field3787.method70(var7.field3780, 0, 0, 0, false);
                                var7.field3780 = var7.field3780.method51(arg0, arg1, arg2);
                            }
                            var7.field3787 = var7.field3787.method51(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3627; ++var8) {
                            class49 var10 = var6.field3646[var8];
                            if (var10 != null && var10.field800.method65()) {
                                class1.method4(var10.field800, var3, var4, var5, var10.field812 - var10.field816 + 1, var10.field793 - var10.field796 + 1);
                                var10.field800 = var10.field800.method51(arg0, arg1, arg2);
                            }
                        }
                        class251 var9 = var6.field3631;
                        if (var9 != null && var9.field4467.method65()) {
                            class260.method1759(var9.field4467, var3, var4, var5);
                            var9.field4467 = var9.field4467.method51(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZB)V")
    public static final void method1546(boolean arg0, byte arg1) {
        ++field4090;
        byte[][] var2 = class87.field1713;
        byte var3 = 4;
        int var4 = -24 / ((73 - arg1) / 37);
        for (int var5 = 0; var3 > var5; ++var5) {
            class125.method907((byte) -21);
            for (int var6 = 0; ~var6 > -14; ++var6) {
                for (int var7 = 0; var7 < 13; ++var7) {
                    int var8 = class145.field2760[var5][var6][var7];
                    if (~var8 != 0) {
                        int var9 = (var8 & 64287822) >> 24;
                        if (!arg0 || ~var9 == -1) {
                            int var10 = var8 >> 1 & 3;
                            int var11 = var8 >> 14 & 1023;
                            int var12 = (var8 & 16382) >> 3;
                            int var13 = (var11 / 8 << 8) - -(var12 / 8);
                            for (int var14 = 0; var14 < class141.field2640.length; ++var14) {
                                if (class141.field2640[var14] == var13 && var2[var14] != null) {
                                    class127.method913(var2[var14], (7 & var11) * 8, var10, var6 * 8, arg0, class165.field3090, var7 * 8, (7 & var12) * 8, true, var9, var5);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V")
    public static final void method1547(int arg0, boolean arg1) {
        class149.field2824 = -1;
        ++field4099;
        class149.field2824 = -1;
        if (!arg1) {
            field4095 = null;
        }
        class212.field3884 = arg0;
        class268.method1820(-13248);
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public static final void method1548(int arg0) {
        class179.field3296 = 0;
        if (arg0 != 8) {
            method1548(-94);
        }
        class195.field3588 = -3;
        ++field4097;
        class212.field3899 = 0;
        class154.field2927 = -1;
        class106.field1912 = 1;
        class80.field1403 = false;
        class90.field1752 = 0;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static void method1549(int arg0) {
        if (arg0 == 3) {
            field4091 = null;
            field4095 = null;
            field4087 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)I")
    public final int method1060(byte arg0) {
        ++field4100;
        if (this.field4098 == null) {
            return 0;
        } else {
            if (arg0 >= -59) {
                this.field4092 = 97;
            }
            return this.field4098.field2155 * 100 / (this.field4098.field2115.length - this.field4092);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)[B")
    public final byte[] method1059(int arg0) {
        int var2 = -108 / ((arg0 - 4) / 52);
        ++field4089;
        if (!super.field4709 && this.field4098.field2155 >= this.field4098.field2115.length + -this.field4092) {
            return this.field4098.field2115;
        } else {
            throw new RuntimeException();
        }
    }
}
