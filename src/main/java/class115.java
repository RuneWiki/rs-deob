import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class115 extends class224 {

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Luf;")
    public static class168 field1792 = class148.method1019(-1720, "Ausw-=hlen");

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "[I")
    public static int[] field1790;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "[I")
    public static int[] field1793;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)I", line = 14)
    private final int method837(int arg0, int arg1, int arg2) {
        if (arg1 != 14580) {
            field1793 = (int[]) null;
        }
        field1797++;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V", line = 27)
    public static void method838(int arg0) {
        field1790 = null;
        field1793 = null;
        if (arg0 != 10) {
            field1790 = (int[]) null;
        }
        field1792 = null;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 42)
    public static final void method839(int arg0) {
        field1795++;
        class215.field3510.method1431((byte) 123);
        if (arg0 == 1948326001) {
            class274.field4615.method1431((byte) 126);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[I", line = 60)
    public final int[] method18(byte arg0, int arg1) {
        field1796++;
        int var3 = -119 / ((arg0 - 20) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int var5 = class303.field5103[arg1];
            for (int var6 = 0; var6 < class187.field2961; var6++) {
                var4[var6] = this.method837(var5, 14580, class73.field979[var6]) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)I", line = 90)
    public static final int method840(int arg0) {
        if (arg0 >= -118) {
            field1792 = (class168) null;
        }
        field1788++;
        return ((class72.field968 == 0 ? 0 : 1) << 22) + ((class120.field1865 ? 1 : 0) << 7) + (class69.field913 & 0x7) + ((class155.field2440 ? 1 : 0) << 3) + ((class263.field4460 ? 1 : 0) << 4) + ((class69.field914 ? 1 : 0) << 5) + ((class145.field2250 ? 1 : 0) << 6) + ((class61.field796 ? 1 : 0) << 8) + (((class165.field2654 ? 1 : 0) << 9) - (-((class164.field2631 ? 1 : 0) << 10) + (-((class201.field3310 & 0x3) << 11) - ((class44.field539 ? 1 : 0) << 13) + -((client.field4939 ? 1 : 0) << 15) + -((class164.field2632 ? 1 : 0) << 16) - ((class161.field2599 & 0x3 << 17) + ((class53.field653 ? 1 : 0) << 19) + ((class1.field1 == 0 ? 0 : 1) << 20) - -((class48.field593 == 0 ? 0 : 1) << 21)))));
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V", line = 110)
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class228.method1563(arg3, arg1, arg0 + arg3, arg1 + arg4);
        class228.method1560(arg3, arg1, arg0, arg4, 0);
        if (arg2 != 17414) {
            method841(-55, 19, -13, 44, -49);
        }
        field1798++;
        if (class127.field1978 < 100) {
            return;
        }
        if (class299.field5066 == null || class299.field5066.field4801 != arg0 || class299.field5066.field4808 != arg4) {
            class49 var5 = new class49(arg0, arg4);
            class277.method1914(var5.field598, arg0, arg4);
            class99.method743(0, class140.field2161, 0, (byte) 54, class172.field2801, 0, arg4, arg0, 0);
            class299.field5066 = new class258(var5);
            class277.field4657 = null;
        }
        class299.field5066.method152(arg3, arg1);
        int var6 = class64.field861 * arg0 / class140.field2161 + arg3;
        int var7 = arg1 + (class6.field79 * arg4 / class172.field2801);
        int var8 = class21.field261 * arg0 / class140.field2161;
        int var9 = class281.field4717 * arg4 / class172.field2801;
        class228.method1554(var6, var7, var8, var9, 16711680, 128);
        class228.method1558(var6, var7, var8, var9, 16711680);
        if (class270.field4538 <= 0 || (class270.field4538 % 10) >= 5) {
            return;
        }
        for (class297 var10 = (class297) class113.field1757.method442(65293); var10 != null; var10 = (class297) class113.field1757.method440(3)) {
            if (class248.field4251 == var10.field5034) {
                int var11 = var10.field5015 * arg0 / class140.field2161 + arg3;
                int var12 = var10.field5031 * arg4 / class172.field2801 + arg1;
                class228.method1560(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 199)
    public class115() {
        super(0, true);
    }
}
