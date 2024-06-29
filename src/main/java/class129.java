import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class129 extends class436 {

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "Z")
    public static boolean field1923 = true;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)V")
    public static final void method942(int arg0) {
        ++field1919;
        int var1 = class83.field1371.length;
        for (int var2 = 0; ~var1 < ~var2; ++var2) {
            if (class83.field1371[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~class355.field5254 < ~var4; ++var4) {
                    if (class283.field4421[var4] == class277.field4348[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class283.field4421[class355.field5254] = class277.field4348[var2];
                    var3 = class355.field5254++;
                }
                class194 var5 = new class194(class83.field1371[var2]);
                int var6 = 0;
                while (~var5.field2982 > ~class83.field1371[var2].length && var6 < 511 && ~class231.field3482 > -1024) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1396(-107);
                    int var9 = var8 >> 14;
                    int var10 = (8173 & var8) >> 7;
                    int var11 = 63 & var8;
                    int var12 = (class277.field4348[var2] >> 8) * 64 - (class422.field6201 - var10);
                    int var13 = (255 & class277.field4348[var2]) * 64 + -class23.field273 + var11;
                    class171 var14 = class462.field6842.method1229(-21382, var5.method1396(-105));
                    class5 var15 = (class5) class366.field5398.method358((byte) 46, (long) var7);
                    if (var15 == null && (var14.field2649 & 1) > 0 && class213.field3236 == var9 && ~var12 <= -1 && var14.field2594 + var12 < class338.field5076 && ~var13 <= -1 && ~class250.field4077 < ~(var13 - -var14.field2594)) {
                        class46 var16 = new class46();
                        var16.field7562 = var7;
                        class5 var17 = new class5(var16);
                        class366.field5398.method357(var17, 1, (long) var7);
                        class166.field2507[class412.field6081++] = var17;
                        class234.field3513[class231.field3482++] = var7;
                        var16.field7610 = class446.field6625;
                        var16.method315(32841, var14);
                        var16.method3095((byte) -88, var16.field718.field2594);
                        var16.field7572 = var16.field718.field2588 << 3;
                        var16.method3100(0, var16.field718.field2580 - -4 << 11 & 14911, true);
                        var16.method306(var9, var13, -9, var16.method3045(0), true, var12);
                    }
                }
            }
        }
        if (arg0 < 19) {
            field1921 = -70;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field1922;
        int[][] var3 = super.field4674.method2206(-100, arg0);
        if (arg1 >= -59) {
            return null;
        } else {
            if (super.field4674.field5110 && this.method2705(113)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field6490 * super.field6490;
                for (int var8 = 0; ~class91.field1471 < ~var8; ++var8) {
                    int var9 = super.field6493[var8 % super.field6491 + var7];
                    var6[var8] = class307.method2028(var9, 255) << 4;
                    var5[var8] = class307.method2028(4080, var9 >> 4);
                    var4[var8] = class307.method2028(4080, var9 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[BZ)[B")
    public static final byte[] method943(int arg0, byte[] arg1, boolean arg2) {
        if (!arg2) {
            method943(-26, (byte[]) null, false);
        }
        ++field1926;
        byte[] var3 = new byte[arg0];
        class325.method2131(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "(I)V")
    public static final void method944(int arg0) {
        ++field1925;
        int var1 = (int) ((double) class338.field5076 * 34.46D);
        int var2 = var1 << arg0;
        if (class376.field5542.method521()) {
            var2 += 128;
        }
        class376.field5542.method514(50, var2);
    }
}
