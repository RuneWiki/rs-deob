import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class149 {

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2505 = -1;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lkg;")
    public static class70 field2504;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "[Lcm;")
    public static class185[] field2502;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 16)
    public static void method1117(byte arg0) {
        field2502 = null;
        if (arg0 >= 48) {
            field2504 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I", line = 41)
    public static final int method1118(int arg0, int arg1, int arg2) {
        field2500++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        if (arg2 >= -11) {
            field2502 = (class185[]) null;
        }
        return (var5 & 0x7FB8E4F) >> 19;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 63)
    public static final void method1119(int arg0) {
        field2501++;
        class53 var1 = class288.field4828;
        synchronized (class288.field4828) {
            class51.field982++;
            class244.field4030 = class76.field1310;
            class48.field936 = class51.field978;
            class46.field893 = class44.field826;
            class288.field4833 = class52.field1009;
            class128.field2208 = class101.field1771;
            class62.field1171 = class14.field212;
            class85.field1469 = class243.field4008;
            class52.field1009 = arg0;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 103)
    public static final void method1120(int arg0, int arg1) {
        class177 var2 = class177.method1310(102, 1, arg0);
        field2506++;
        var2.method1303((byte) 126);
        if (arg1 <= 83) {
            field2502 = (class185[]) null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I", line = 130)
    public static final int method1121(int arg0) {
        field2503++;
        if (class314.field5309) {
            return 0;
        } else if (class118.method893(arg0 + arg0)) {
            return class194.field3131 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
