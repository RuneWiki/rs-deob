import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class143 extends class154 {

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "I")
    private int field2432 = 32768;

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "[Leg;")
    public static class37[] field2435 = new class37[100];

    @OriginalMember(owner = "client!oj", name = "gb", descriptor = "Leg;")
    public static class37 field2438 = class174.method1167("voudrait faire un -Bchange avec vous)3", 85);

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "Leg;")
    public static class37 field2434 = class174.method1167(")3", -121);

    @OriginalMember(owner = "client!oj", name = "fb", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "Leg;")
    public static class37 field2433 = class174.method1167("vert:", 108);

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!oj", name = "hb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!oj", name = "eb", descriptor = "Ljl;")
    public static class101 field2436;

    @OriginalMember(owner = "client!oj", name = "ib", descriptor = "[I")
    public static int[] field2440;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 != -9) {
            field2440 = null;
        }
        class77.method527((byte) -71);
        ++field2430;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 == -14015) {
            ++field2439;
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    super.field2579 = ~arg0.method1268(255) == -2;
                }
            } else {
                this.field2432 = arg0.method1244(false) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class143() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
    public static void method1001(int arg0) {
        field2435 = null;
        field2438 = null;
        field2440 = null;
        field2433 = null;
        field2436 = null;
        if (arg0 >= 14) {
            field2434 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field2431;
        int[][] var3 = super.field2585.method1532(arg1, arg0 ^ -110);
        if (super.field2585.field3761) {
            int[] var4 = this.method1052(1, arg1, (byte) -26);
            int[] var5 = this.method1052(2, arg1, (byte) -74);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class227.field3898; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field2432 >> 12;
                int var12 = class43.field676[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class109.field1786;
                int var14 = class111.field1854[var10] * var11 >> 12;
                int var15 = class239.field4260 & (var14 >> 12) + arg1;
                int[][] var16 = this.method1054(arg0 ^ 115, 0, var15);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return arg0 != 115 ? null : var3;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field2429;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int[] var4 = this.method1052(1, arg0, (byte) -107);
            int[] var5 = this.method1052(2, arg0, (byte) -92);
            for (int var6 = 0; ~var6 > ~class227.field3898; ++var6) {
                int var7 = (var4[var6] & 4081) >> 4;
                int var8 = var5[var6] * this.field2432 >> 12;
                int var9 = class43.field676[var7] * var8 >> 12;
                int var10 = class109.field1786 & (var9 >> 12) + var6;
                int var11 = class111.field1854[var7] * var8 >> 12;
                int var12 = arg0 - -(var11 >> 12) & class239.field4260;
                int[] var13 = this.method1052(0, var12, (byte) -72);
                var3[var6] = var13[var10];
            }
        }
        return arg1 != 1075962732 ? null : var3;
    }
}
