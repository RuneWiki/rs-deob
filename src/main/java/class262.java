import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class262 extends class377 {

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "Z")
    public static boolean field3315 = false;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!vca", name = "F", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1563(int arg0, String arg1) {
        ++field3312;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (~var5 >= -128) {
                ++var3;
            } else if (~var5 >= -2048) {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        if (arg0 < 50) {
            method1563(55, (String) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field3316;
        int[] var3 = super.field4842.method2772(arg0, (byte) -116);
        if (super.field4842.field6354) {
            int var4 = class596.field8003[arg0];
            for (int var5 = 0; class528.field6661 > var5; ++var5) {
                var3[var5] = this.method1564((byte) -107, var4, class136.field1654[var5]) % 4096;
            }
        }
        int var6 = 126 % ((arg1 - 5) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
    public class262() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BII)I")
    private final int method1564(byte arg0, int arg1, int arg2) {
        ++field3313;
        int var4 = 72 % ((-69 - arg0) / 33);
        int var5 = arg1 * 57 + arg2;
        int var6 = var5 << 1 ^ var5;
        return -(((var6 * var6 * 15731 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
