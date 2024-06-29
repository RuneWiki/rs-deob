import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class129 {

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lqd;")
    public static class40 field2216 = class147.method1106("weiss:", (byte) -81);

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lqd;")
    private static class40 field2217 = class147.method1106("Cancel", (byte) -90);

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lqd;")
    public static class40 field2218 = class147.method1106("m-Ochte mit Ihnen handeln)3", (byte) -54);

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lqd;")
    public static class40 field2219 = class147.method1106(" )2> <col=ffff00>", (byte) -102);

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lqd;")
    public static class40 field2221 = field2217;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 15)
    public static final void method958(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 74) {
            return;
        }
        field2215++;
        for (int var5 = 0; var5 < class83.field1438; var5++) {
            if (class280.field4728[var5] + class197.field3166[var5] > arg2 && (arg2 + arg4) > class197.field3166[var5] && (class181.field2947[var5] + class53.field1036[var5]) > arg0 && class181.field2947[var5] < arg0 + arg1) {
                class229.field3778[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V", line = 41)
    public static final void method959(byte arg0, boolean arg1) {
        if (arg0 > -93) {
            return;
        }
        field2212++;
        for (int var2 = 0; var2 < class177.field2923; var2++) {
            class42 var3 = class91.field1656[class65.field1229[var2]];
            long var4 = (long) class65.field1229[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method386(64) && var3.field796.field2057 == arg1 && var3.field796.method909((byte) -50)) {
                int var6 = var3.field1497 >> 7;
                int var7 = var3.field1531 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.method666(24207) == 1 && (var3.field1531 & 0x7F) == 64 && (var3.field1497 & 0x7F) == 64) {
                        if (class206.field3282[var7][var6] == class55.field1069) {
                            continue;
                        }
                        class206.field3282[var7][var6] = class55.field1069;
                    }
                    if (!var3.field796.field2079) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field1539 = class293.method2012(class160.field2671, var3.field1497, 0, var3.field1531);
                    class208.method1470(class160.field2671, var3.field1531, var3.field1497, var3.field1539, (var3.method666(24207) - 1) * 64 + 60, var3, var3.field1507, var4, var3.field1530);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[B", line = 92)
    public static final synchronized byte[] method960(int arg0, int arg1) {
        field2214++;
        if (arg0 == 100 && class289.field4839 > 0) {
            byte[] var2 = class255.field4260[--class289.field4839];
            class255.field4260[class289.field4839] = null;
            return var2;
        }
        if (arg1 <= 49) {
            method960(102, 67);
        }
        if (arg0 == 5000 && class204.field3248 > 0) {
            byte[] var3 = class123.field2130[--class204.field3248];
            class123.field2130[class204.field3248] = null;
            return var3;
        } else if (arg0 == 30000 && class238.field3923 > 0) {
            byte[] var4 = class308.field5166[--class238.field3923];
            class308.field5166[class238.field3923] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)V", line = 133)
    public static final void method961(boolean arg0, int arg1) {
        field2213++;
        class194.field3133.method1348(0, arg1);
        if (!arg0) {
            method963(false, true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 155)
    public static void method962(int arg0) {
        if (arg0 != 19605) {
            method960(88, 64);
        }
        field2216 = null;
        field2221 = null;
        field2218 = null;
        field2217 = null;
        field2219 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZ)V", line = 175)
    public static final void method963(boolean arg0, boolean arg1) {
        class254.field4211 = arg1;
        if (!arg0) {
            field2220++;
            class62.field1176 = !class118.method893(2);
        }
    }
}
