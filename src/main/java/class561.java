import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class561 extends class321 {

    @OriginalMember(owner = "client!si", name = "U", descriptor = "Z")
    public static boolean field7908 = false;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field7907;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922 && this.method1887(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field4143 * super.field4143;
            for (int var8 = 0; class29.field523 > var8; ++var8) {
                int var9 = super.field4139[var8 % super.field4147 + var7];
                var6[var8] = class702.method3949(var9 << 4, 4080);
                var5[var8] = class702.method3949(var9 >> 4, 4080);
                var4[var8] = class702.method3949(16711680, var9) >> 12;
            }
        }
        return arg0 <= 26 ? null : var3;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(III)B")
    public static final byte method3241(int arg0, int arg1, int arg2) {
        ++field7909;
        if (~arg1 != -10) {
            return 0;
        } else {
            if (arg2 != 2) {
                field7908 = false;
            }
            return (byte) (~(1 & arg0) != -1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3242(int arg0, String arg1) {
        ++field7910;
        for (int var2 = arg0; class575.field8087.length > var2; ++var2) {
            if (class575.field8087[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
