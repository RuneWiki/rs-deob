import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class120 extends class76 {

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "Lia;")
    private static class257 field2166 = class28.method234(-102, " is already on your friend list)3");

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "Lia;")
    public static class257 field2169 = class28.method234(-49, "rot:");

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lia;")
    public static class257 field2170 = field2166;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "Lth;")
    public static class244 field2171 = new class244();

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;I)V")
    public static final void method844(class178 arg0, class178 arg1, class178 arg2, class178 arg3, int arg4) {
        class137.field2452 = arg2;
        class27.field527 = arg3;
        if (arg4 != 0) {
            field2170 = null;
        }
        ++field2172;
        class186.field3226 = arg0;
        class78.field1515 = arg1;
        class28.field539 = new class44[class78.field1515.method1202(-116)][];
        class255.field4363 = new boolean[class78.field1515.method1202(arg4 + -92)];
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIILib;)V")
    public static final void method845(byte arg0, int arg1, int arg2, class180 arg3) {
        if (~arg3.field4129 == ~arg2 && ~arg2 != 0) {
            class31 var4 = class186.method1263(0, arg2);
            int var5 = var4.field583;
            if (~var5 == -2) {
                arg3.field4120 = 0;
                arg3.field4127 = 0;
                arg3.field4144 = arg1;
                arg3.field4139 = 0;
                class132.method918(arg3.field4143, class137.field2441 == arg3, arg3.field4120, var4, 102, arg3.field4177);
            }
            if (~var5 == -3) {
                arg3.field4127 = 0;
            }
        } else if (~arg2 == 0 || ~arg3.field4129 == 0 || ~class186.method1263(0, arg2).field584 <= ~class186.method1263(0, arg3.field4129).field584) {
            arg3.field4139 = 0;
            arg3.field4129 = arg2;
            arg3.field4144 = arg1;
            arg3.field4120 = 0;
            arg3.field4127 = 0;
            arg3.field4167 = arg3.field4148;
            if (arg3.field4129 != -1) {
                class132.method918(arg3.field4143, class137.field2441 == arg3, arg3.field4120, class186.method1263(0, arg3.field4129), -77, arg3.field4177);
            }
        }
        ++field2168;
        if (arg0 <= 26) {
            field2169 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILib;)I")
    public static final int method846(int arg0, class180 arg1) {
        if (arg0 != 0) {
            method845((byte) 116, 108, 8, (class180) null);
        }
        ++field2165;
        int var2 = arg1.field3114;
        if (~arg1.field4170 == ~arg1.field4165) {
            var2 = arg1.field3113;
        } else if (arg1.field4170 == arg1.field4135) {
            var2 = arg1.field3132;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method847(boolean arg0) {
        field2169 = null;
        if (!arg0) {
            field2166 = null;
            field2170 = null;
            field2171 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field2163;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; class96.field1807 > var7; ++var7) {
                this.method848(arg0, (byte) -34, var7);
                int[][] var8 = this.method565((byte) -20, 0, class186.field3231);
                var5[var7] = var8[0][class90.field1719];
                var4[var7] = var8[1][class90.field1719];
                var6[var7] = var8[2][class90.field1719];
            }
        }
        if (arg1 <= 2) {
            field2170 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        if (arg0 != -9351) {
            this.method169(-58, -122);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        ++field2167;
        if (super.field1467.field2980) {
            for (int var4 = 0; ~class96.field1807 < ~var4; ++var4) {
                this.method848(arg1, (byte) -34, var4);
                int[] var5 = this.method562(class186.field3231, 0, (byte) -104);
                var3[var4] = var5[class90.field1719];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field2161;
        if (arg1 >= -86) {
            field2170 = null;
        }
        if (~arg2 == -1) {
            super.field1477 = ~arg0.method1051((byte) 110) == -2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IBI)V")
    private final void method848(int arg0, byte arg1, int arg2) {
        int var4 = class10.field197[arg0];
        ++field2162;
        if (arg1 == -34) {
            int var5 = class137.field2457[arg2];
            float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class186.field3231 = arg0;
                class90.field1719 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class90.field1719 = arg0;
                class186.field3231 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class90.field1719 = -arg0 + class96.field1807;
                class186.field3231 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class90.field1719 = arg2;
                class186.field3231 = -arg0 + class13.field249;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class90.field1719 = -arg2 + class96.field1807;
                class186.field3231 = class13.field249 - arg0;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class186.field3231 = -arg2 + class13.field249;
                class90.field1719 = -arg0 + class96.field1807;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class90.field1719 = arg0;
                class186.field3231 = -arg2 + class13.field249;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class90.field1719 = -arg2 + class96.field1807;
                class186.field3231 = arg0;
            }
            class90.field1719 &= class157.field2753;
            class186.field3231 &= class105.field1950;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public static final void method849(int arg0, int arg1, int arg2) {
        ++field2164;
        class161 var3 = class80.method603(-128, arg0);
        int var4 = var3.field2826;
        int var5 = var3.field2816;
        int var6 = var3.field2825;
        int var7 = class28.field538[-var5 + var6];
        if (~arg1 > -1 || ~var7 > ~arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class24.method212(-109, var4, ~var8 & class58.field1233[var4] | arg1 << var5 & var8);
        if (arg2 < 32) {
            field2171 = null;
        }
    }
}
