import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class319 {

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field4054 = 12;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZBLjava/lang/String;I)Z")
    public static final boolean method1878(boolean arg0, byte arg1, String arg2, int arg3) {
        field4053++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg1 <= 25) {
            return true;
        } else {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg0) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg3) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 + var11;
                if ((var10 / arg3) != var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static final void method1879(int arg0) {
        if (arg0 != -5689) {
            return;
        }
        class462.field6611 = 0;
        class277.field3502 = 0;
        class490.field7139 = 0;
        class147.field1867 = 0;
        field4056++;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public static final void method1880(int arg0) {
        field4052++;
        int[] var1 = new int[class376.field4949.field903];
        int var2 = 0;
        for (int var3 = 0; var3 < class376.field4949.field903; var3++) {
            class9 var5 = class376.field4949.method624((byte) -119, var3);
            if (var5.field133 >= 0 || var5.field147 >= 0) {
                var1[var2++] = var3;
            }
        }
        class199.field2595 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class199.field2595[var4] = var1[var4];
        }
        if (arg0 != 48) {
            method1879(-97);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lhd;IZ)V")
    public static final void method1881(class523 arg0, int arg1, boolean arg2) {
        field4055++;
        int var3 = arg0.field7644 == 0 ? arg0.field7617 : arg0.field7644;
        int var4 = arg0.field7585 == 0 ? arg0.field7574 : arg0.field7585;
        class126.method888(var3, class293.field3725[arg0.field7723 >> 16], var4, 0, arg2, arg0.field7723);
        if (arg0.field7717 != null) {
            class126.method888(var3, arg0.field7717, var4, 0, arg2, arg0.field7723);
        }
        class175 var5 = (class175) class397.field5684.method2022(-1, (long) arg0.field7723);
        int var6 = -106 % ((arg1 - 22) / 58);
        if (var5 != null) {
            class91.method712(var3, var5.field2279, false, var4, arg2);
        }
    }
}
