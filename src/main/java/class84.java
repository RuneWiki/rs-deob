import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class84 extends class215 {

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field1045 = 0;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Leh;")
    public static class137 field1042;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Leh;")
    public static class137 field1047;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "[Lnl;")
    public static class216[] field1046;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "[[[Ltl;")
    public static class246[][][] field1044;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field1041;
        if (arg1 != 255) {
            field1046 = null;
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 105);
        if (super.field3445.field4163) {
            int var4 = class76.field956[arg0];
            for (int var5 = 0; ~class244.field4015 < ~var5; ++var5) {
                var3[var5] = this.method463((byte) 53, var4, class166.field2657[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZILjava/lang/String;)Z")
    public static final boolean method461(int arg0, boolean arg1, int arg2, String arg3) {
        ++field1048;
        if (arg0 >= 2 && arg0 <= 36) {
            boolean var4 = false;
            int var5 = arg3.length();
            int var6 = 0;
            boolean var7 = false;
            for (int var8 = 0; ~var5 < ~var8; ++var8) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var7 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || ~var9 < -123) {
                        return false;
                    }
                    var11 = var9 - 'W';
                }
                if (~arg0 >= ~var11) {
                    return false;
                }
                if (var7) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if (var10 / arg0 != var6) {
                    return false;
                }
                var4 = true;
                var6 = var10;
            }
            if (arg2 < 4) {
                field1047 = null;
            }
            return var4;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public static void method462(byte arg0) {
        field1047 = null;
        if (arg0 <= 82) {
            field1045 = 42;
        }
        field1046 = null;
        field1044 = null;
        field1042 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(BII)I")
    private final int method463(byte arg0, int arg1, int arg2) {
        if (arg0 != 53) {
            return -125;
        } else {
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 ^ var4 << 1;
            ++field1043;
            return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }
}
