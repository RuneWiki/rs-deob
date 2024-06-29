import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class136 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lqg;")
    public static class256 field2049 = new class256();

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[F")
    public static float[] field2057 = new float[4];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)I", line = 6)
    public static final int method921(int arg0, byte arg1) {
        field2055++;
        if (arg1 != 83) {
            method924(101);
        }
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 22)
    public static void method922(byte arg0) {
        field2057 = null;
        field2049 = null;
        if (arg0 != -6) {
            field2049 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBIII)V", line = 33)
    public static final void method923(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class235.field3735 = arg3;
        class224.field3575 = arg4;
        field2053++;
        if (arg1 <= -106) {
            class231.field3697 = arg2;
            class233.field3721 = arg0;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 47)
    public static final void method924(int arg0) {
        field2050++;
        if (arg0 == 14591) {
            class202.field3301.method1615(127);
            class3.field21.method1615(56);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V", line = 62)
    public static final void method925(int arg0) {
        int var1 = 13 / ((arg0 + 77) / 47);
        int var2 = 0;
        field2056++;
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class271.method1934(var3, var4, true, (byte) -84, var2, class251.field3996)) {
                    var2++;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 102)
    public static final void method926(byte arg0) {
        class253.field4006 = null;
        if (arg0 != 74) {
            method926((byte) -62);
        }
        field2052++;
        class281.field4419 = null;
        class314.field4897 = null;
        class55.field726 = null;
        class151.field2318 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V", line = 122)
    public static final void method927(int arg0, int arg1) {
        class206.field3363 = -1;
        class206.field3363 = -1;
        if (arg1 == 37) {
            class71.field918 = 3.0F;
        } else if (arg1 == 50) {
            class71.field918 = 4.0F;
        } else if (arg1 == 75) {
            class71.field918 = 6.0F;
        } else if (arg1 == 100) {
            class71.field918 = 8.0F;
        } else if (arg1 == 200) {
            class71.field918 = 16.0F;
        }
        if (arg0 < 16) {
            field2049 = (class256) null;
        }
        field2051++;
    }
}
