import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class149 extends class377 {

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field1963 = new String[100];

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
    public static int field1962 = 0;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "Luu;")
    public static class191 field1964;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)I")
    public static final int method980(int arg0, int arg1, int arg2, int arg3) {
        ++field1966;
        int var4 = arg0 & 3;
        if (arg2 == var4) {
            return arg3;
        } else if (~var4 == -2) {
            return arg1;
        } else {
            return ~var4 == -3 ? -arg3 + 1023 : 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "(I)V")
    public static void method981(int arg0) {
        field1963 = null;
        int var1 = -84 / ((arg0 - -28) / 55);
        field1964 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field1965;
        int[][] var3 = super.field5474.method2414((byte) -86, arg0);
        if (super.field5474.field5870 && this.method2368((byte) -109)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field5766 * super.field5766;
            for (int var8 = 0; class531.field7814 > var8; ++var8) {
                int var9 = super.field5755[var8 % super.field5758 + var7];
                var6[var8] = class519.method3092(255, var9) << 4;
                var5[var8] = class519.method3092(var9 >> 4, 4080);
                var4[var8] = class519.method3092(16711680, var9) >> 12;
            }
        }
        int var10 = 11 % ((arg1 - 48) / 60);
        return var3;
    }
}
