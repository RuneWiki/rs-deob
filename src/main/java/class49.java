import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class49 extends class93 {

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field1057 = 0;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "[I")
    public static int[] field1058 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "Ljd;")
    public static class92 field1059 = class202.method1325((byte) 90, "<col=ffffff>");

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "Ljd;")
    private static class92 field1064 = class202.method1325((byte) 90, "Invalid username or password)3");

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "Ljd;")
    private static class92 field1060 = class202.method1325((byte) 90, "This world is full)3");

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "Ljd;")
    public static class92 field1062 = class202.method1325((byte) 90, "Mem:");

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Ljd;")
    public static class92 field1061 = class202.method1325((byte) 90, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Ljd;")
    public static class92 field1063 = field1060;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "Ljd;")
    public static class92 field1073 = class202.method1325((byte) 90, "Freie Welt");

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "Ljd;")
    public static class92 field1076 = field1064;

    @OriginalMember(owner = "client!eh", name = "mb", descriptor = "Ljd;")
    public static class92 field1077 = class202.method1325((byte) 90, "hint_mapedge");

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "Loe;")
    public static class139 field1070 = new class139(64);

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!eh", name = "nb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "La;")
    public static class1 field1075;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "[I")
    public static int[] field1072;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([La;BI)V")
    public static final void method300(class1[] arg0, byte arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; ++var3) {
            class1 var5 = arg0[var3];
            if (var5 != null && var5.field36 == arg2 && (!var5.field94 || !class103.method709(0, var5))) {
                if (~var5.field10 == -1) {
                    if (!var5.field94 && class103.method709(0, var5) && class114.field2299 != var5) {
                        continue;
                    }
                    method300(arg0, (byte) 127, var5.field100);
                    if (var5.field55 != null) {
                        method300(var5.field55, (byte) -43, var5.field100);
                    }
                    class105 var6 = (class105) class118.field2394.method216(-100, (long) var5.field100);
                    if (var6 != null) {
                        class188.method1212(var6.field2155, 127);
                    }
                }
                if (~var5.field10 == -7) {
                    if (~var5.field27 != 0 || ~var5.field13 != 0) {
                        boolean var7 = class58.method356(-122, var5);
                        int var8;
                        if (var7) {
                            var8 = var5.field13;
                        } else {
                            var8 = var5.field27;
                        }
                        if (var8 != -1) {
                            class22 var9 = class153.method978(var8, -102);
                            if (var9 != null) {
                                var5.field140 += class76.field1588;
                                while (var5.field140 > var9.field515[var5.field130]) {
                                    var5.field140 -= var9.field515[var5.field130];
                                    ++var5.field130;
                                    if (~var9.field530.length >= ~var5.field130) {
                                        var5.field130 -= var9.field529;
                                        if (var5.field130 < 0 || ~var9.field530.length >= ~var5.field130) {
                                            var5.field130 = 0;
                                        }
                                    }
                                    class3.method21(26702, var5);
                                }
                            }
                        }
                    }
                    if (var5.field34 != 0 && !var5.field94) {
                        int var10 = var5.field34 >> 16;
                        int var11 = var5.field34 << 16 >> 16;
                        int var12 = class76.field1588 * var11;
                        int var13 = class76.field1588 * var10;
                        var5.field106 = var5.field106 + var12 & 2047;
                        var5.field56 = var5.field56 + var13 & 2047;
                        class3.method21(26702, var5);
                    }
                }
            }
        }
        int var4 = 49 / ((arg1 - 76) / 34);
        ++field1071;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class49() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lac;BI)V")
    public static final void method301(class4 arg0, byte arg1, int arg2) {
        if (arg1 > -111) {
            method303(true);
        }
        ++field1065;
        if (class158.field3150 < arg0.field249) {
            class117.method787(512, arg0);
        } else if (~arg0.field232 <= ~class158.field3150) {
            class127.method849(11580, arg0);
        } else {
            class1.method13(-49, arg0);
        }
        if (~arg0.field246 > -129 || ~arg0.field208 > -129 || ~arg0.field246 <= -13185 || ~arg0.field208 <= -13185) {
            arg0.field208 = arg0.field198[0] * 128 + arg0.field211 * 64;
            arg0.field215 = -1;
            arg0.field246 = arg0.field233[0] * 128 + arg0.field211 * 64;
            arg0.field238 = -1;
            arg0.field232 = 0;
            arg0.field249 = 0;
            arg0.method27(0);
        }
        if (class15.field423 == arg0 && (~arg0.field246 > -1537 || arg0.field208 < 1536 || ~arg0.field246 <= -11777 || ~arg0.field208 <= -11777)) {
            arg0.field249 = 0;
            arg0.field208 = arg0.field198[0] * 128 + arg0.field211 * 64;
            arg0.field232 = 0;
            arg0.field246 = arg0.field233[0] * 128 - -(arg0.field211 * 64);
            arg0.field238 = -1;
            arg0.field215 = -1;
            arg0.method27(0);
        }
        class185.method1203((byte) -69, arg0);
        class76.method523(false, arg0);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int[] var3 = super.field1887.method916(arg0, -126);
        if (super.field1887.field2757) {
            class11.method77(var3, 0, class150.field2985, class166.field3271[arg0]);
        }
        int var4 = 31 % ((arg1 - 67) / 42);
        ++field1067;
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        class20.field480.method923(-118);
        if (arg0 == 5) {
            ++field1069;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public static final void method303(boolean arg0) {
        class72.field1535 = null;
        class43.field968 = null;
        if (arg0) {
            ++field1078;
            class124.field2516 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static void method304(int arg0) {
        field1070 = null;
        field1072 = null;
        field1076 = null;
        field1061 = null;
        field1073 = null;
        field1077 = null;
        field1059 = null;
        field1062 = null;
        field1058 = null;
        if (arg0 == 1895496720) {
            field1063 = null;
            field1075 = null;
            field1064 = null;
            field1060 = null;
        }
    }
}
