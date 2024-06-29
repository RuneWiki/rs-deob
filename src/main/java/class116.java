import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class116 extends class82 {

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "Ldj;")
    public static class44 field2069 = class89.method650(255, "hint_mapmarkers");

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "[I")
    public static int[] field2073 = new int[256];

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "Ll;")
    public static class120 field2072 = new class120(4096);

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field2079 = 0;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "[I")
    public static int[] field2070;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lve;B)V")
    public static final void method812(class225 arg0, byte arg1) {
        class220.field3994 = arg0;
        ++field2077;
        if (arg1 != 54) {
            method813((byte) -18);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public static void method813(byte arg0) {
        field2070 = null;
        if (arg0 <= -125) {
            field2072 = null;
            field2073 = null;
            field2069 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZII)I")
    private final int method814(boolean arg0, int arg1, int arg2) {
        ++field2076;
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 << 1 ^ var4;
        return !arg0 ? 23 : 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(JLdj;SIBLdj;I)V")
    public static final void method815(long arg0, class44 arg1, short arg2, int arg3, byte arg4, class44 arg5, int arg6) {
        ++field2078;
        if (arg4 != -115) {
            method818((byte) -108, (class223) null);
        }
        if (!class58.field1086) {
            if (class179.field3071 < 500) {
                class30.field525[class179.field3071] = arg1;
                class73.field1380[class179.field3071] = arg5;
                class108.field1990[class179.field3071] = arg2;
                class223.field4126[class179.field3071] = arg0;
                class237.field4402[class179.field3071] = arg3;
                class20.field346[class179.field3071] = arg6;
                ++class179.field3071;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Z")
    public static final boolean method816(byte arg0, int arg1) {
        if (arg0 > -87) {
            return true;
        } else {
            ++field2068;
            return (arg1 & 465918451) >> 28 != 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        int[] var3 = super.field1595.method603(true, arg1);
        ++field2071;
        if (arg0 != 25238) {
            return null;
        } else {
            if (super.field1595.field1538) {
                int var4 = class212.field3809[arg1];
                for (int var5 = 0; var5 < class129.field2287; ++var5) {
                    var3[var5] = this.method814(true, class49.field912[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V")
    public static final void method817(byte arg0) {
        ++field2075;
        if (arg0 != 48) {
            method813((byte) 70);
        }
        ++class90.field1699;
        class200.field3542.method1170(252, (byte) -91);
        class200.field3542.method536(0L, arg0 ^ 9);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLvc;)V")
    public static final void method818(byte arg0, class223 arg1) {
        int var2 = ~arg1.field4067 != -1 ? arg1.field4067 : arg1.field4130;
        int var3 = ~arg1.field4025 != -1 ? arg1.field4025 : arg1.field4134;
        if (arg0 <= 34) {
            field2073 = null;
        }
        class9.method85(var3, class4.field52[arg1.field4040 >> 16], arg1.field4040, (byte) -124, var2);
        if (arg1.field4169 != null) {
            class9.method85(var3, arg1.field4169, arg1.field4040, (byte) -124, var2);
        }
        ++field2074;
        class104 var4 = (class104) class129.field2294.method828((long) arg1.field4040, (byte) -40);
        if (var4 != null) {
            class24.method174((byte) 125, var2, var3, var4.field1893);
        }
    }
}
