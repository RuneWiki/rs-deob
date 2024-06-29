import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class150 extends class154 {

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "Leg;")
    public static class37 field2519 = class174.method1167("<img=0>", 86);

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "Leg;")
    public static class37 field2523 = null;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "Leg;")
    private static class37 field2521 = class174.method1167("Loaded title screen", -101);

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "Leg;")
    public static class37 field2527 = field2521;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "[I")
    public static int[] field2526;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Leg;")
    public static final class37 method1025(int arg0, int arg1) {
        if (arg1 != 15722) {
            field2521 = null;
        }
        ++field2522;
        return class156.method1061((byte) -75, new class37[] { class163.method1096(arg0 >> 24 & 255, (byte) -35), class201.field3414, class163.method1096((arg0 & 16738187) >> 16, (byte) -35), class201.field3414, class163.method1096(255 & arg0 >> 8, (byte) -35), class201.field3414, class163.method1096(arg0 & 255, (byte) -35) });
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field2524;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (arg1 != 1075962732) {
            return null;
        } else {
            if (super.field2574.field536) {
                int var4 = class62.field1029[arg0];
                for (int var5 = 0; class227.field3898 > var5; ++var5) {
                    var3[var5] = this.method1027(var4, arg1 + -640674044, class239.field4263[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field2527 = null;
        if (arg0 != -28971) {
            method1026(-38);
        }
        field2519 = null;
        field2521 = null;
        field2523 = null;
        field2526 = null;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(III)I")
    private final int method1027(int arg0, int arg1, int arg2) {
        if (arg1 != 435288688) {
            return -101;
        } else {
            ++field2525;
            int var4 = arg2 - -(arg0 * 57);
            int var5 = var4 << 1 ^ var4;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)I")
    public static final int method1028(byte arg0, int arg1, int arg2) {
        int var3 = arg1 - -(arg2 * 57);
        int var4 = var3 << 13 ^ var3;
        ++field2518;
        if (arg0 <= 21) {
            method1029(false, (byte) -54);
        }
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 255;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZB)V")
    public static final void method1029(boolean arg0, byte arg1) {
        ++field2520;
        byte[][] var2 = class47.field740;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; ++var4) {
            class126.method898((byte) 83);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    boolean var7 = false;
                    int var8 = class238.field4238[var4][var5][var6];
                    if (~var8 != 0) {
                        int var9 = 3 & var8 >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (16765267 & var8) >> 14;
                            int var11 = (var8 & 16376) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            int var13 = var8 >> 1 & 3;
                            for (int var14 = 0; class210.field3615.length > var14; ++var14) {
                                if (class210.field3615[var14] == var12 && var2[var14] != null) {
                                    var7 = true;
                                    class196.method1361((var10 & 7) * 8, var5 * 8, class215.field3719, arg0, (7 & var11) * 8, var6 * 8, var2[var14], (byte) 112, var9, var13, var4);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class289.method1941(8, 8, var5 * 8, var4, 8571, var6 * 8);
                    }
                }
            }
        }
        if (arg1 < 32) {
            field2521 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }
}
