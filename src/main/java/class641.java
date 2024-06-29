import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class641 extends class438 {

    @OriginalMember(owner = "client!te", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field8755 = new String[100];

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIB)I", line = 7)
    public static final int method3592(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -74) {
            field8758 = -78;
        }
        ++field8757;
        if (class121.field1557 < 100) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class9.field176 + arg2;
            int var7 = -class9.field178 + arg0;
            for (class625 var8 = (class625) class9.field156.method2725(arg3 ^ -109); var8 != null; var8 = (class625) class9.field156.method2726(-123)) {
                if (~var8.field8567 == ~arg1) {
                    int var9 = var8.field8574;
                    int var10 = var8.field8572;
                    int var11 = var10 - -class9.field178 | class9.field176 + var9 << 14;
                    int var12 = (var6 - var9) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (~var4 > -1 || ~var5 < ~var12) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[[I", line = 56)
    public final int[][] method187(byte arg0, int arg1) {
        ++field8756;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (arg0 <= 35) {
            return null;
        } else {
            if (super.field759.field341 && this.method2587(true)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field5777 * super.field5777;
                for (int var8 = 0; ~var8 > ~class642.field8759; ++var8) {
                    int var9 = super.field5768[var8 % super.field5776 + var7];
                    var6[var8] = class296.method1733(4080, var9 << 4);
                    var5[var8] = class296.method1733(65280, var9) >> 4;
                    var4[var8] = class296.method1733(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V", line = 105)
    public static void method3593(byte arg0) {
        field8755 = null;
        int var1 = -47 / ((arg0 - -24) / 53);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 122)
    public static final boolean method3594(String arg0, int arg1) {
        if (arg1 != -2) {
            field8755 = null;
        }
        ++field8754;
        return class670.field9189.containsKey(arg0);
    }
}
