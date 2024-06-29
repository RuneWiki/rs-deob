import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class208 extends class23 {

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "Li;")
    private static class88 field3944 = method1425(105, "Type");

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "Li;")
    public static class88 field3949 = method1425(105, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "[I")
    public static int[] field3951 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "[S")
    public static short[] field3957 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3954 = 0;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "Li;")
    public static class88 field3952 = field3944;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "Llj;")
    public static class130 field3948;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "[[[B")
    public static byte[][][] field3953;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;)Li;")
    public static final class88 method1425(int arg0, String arg1) {
        ++field3947;
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class88 var5 = new class88();
        var5.field1643 = new byte[var4];
        if (arg0 != 105) {
            field3948 = null;
        }
        while (~var4 < ~var3) {
            int var6 = 255 & var2[var3++];
            if (var6 <= 45 && ~var6 <= -41) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 255;
                var5.field1643[var5.field1660++] = (byte) ((var6 - 40) * 43 + -48 + var7);
            } else if (~var6 != -1) {
                var5.field1643[var5.field1660++] = (byte) var6;
            }
        }
        var5.method629((byte) -36);
        return var5.method601(-35);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public static void method1426(byte arg0) {
        field3957 = null;
        field3949 = null;
        int var1 = 6 % ((-72 - arg0) / 45);
        field3944 = null;
        field3951 = null;
        field3952 = null;
        field3948 = null;
        field3953 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V")
    public static final void method1427(int arg0, boolean arg1) {
        class151.field2942 = new int[104];
        ++field3956;
        class28.field468 = 99;
        class85.field1541 = new int[104];
        class221.field4175 = new int[104];
        class156.field3014 = new int[104];
        class221.field4176 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class111.field2022 = new byte[var2][105][105];
        class109.field1964 = new byte[var2][104][104];
        class164.field3144 = new byte[var2][104][104];
        class234.field4379 = new byte[var2][104][104];
        class135.field2513 = new int[var2][105][105];
        class8.field115 = new byte[var2][104][104];
        if (arg0 != 1) {
            method1426((byte) 99);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field3955;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int var4 = class111.field2023[arg0];
            for (int var5 = 0; ~class70.field1276 < ~var5; ++var5) {
                var3[var5] = this.method1428(var4, class22.field351[var5], (byte) 116) % 4096;
            }
        }
        if (arg1 < 19) {
            field3949 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)I")
    private final int method1428(int arg0, int arg1, byte arg2) {
        if (arg2 < 59) {
            field3949 = null;
        }
        ++field3950;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return 4096 - ((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
    }
}
