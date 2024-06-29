import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class216 extends class170 {

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "Lwm;")
    private static class152 field3506 = class157.method1048("Checking for updates )2 ", 100);

    @OriginalMember(owner = "client!wj", name = "gb", descriptor = "Lwm;")
    public static class152 field3508 = class157.method1048("titlebg", 126);

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Lwm;")
    public static class152 field3505 = class157.method1048("; Expires=", 121);

    @OriginalMember(owner = "client!wj", name = "ib", descriptor = "I")
    public static int field3510 = 0;

    @OriginalMember(owner = "client!wj", name = "jb", descriptor = "Lwm;")
    public static class152 field3511 = field3506;

    @OriginalMember(owner = "client!wj", name = "nb", descriptor = "[Z")
    public static boolean[] field3515 = new boolean[112];

    @OriginalMember(owner = "client!wj", name = "fb", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!wj", name = "hb", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!wj", name = "lb", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!wj", name = "mb", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!wj", name = "kb", descriptor = "Lhh;")
    public static class209 field3512;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lah;BII)Ldc;", line = 4)
    public static final class109 method1448(class205 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -127) {
            method1449(-75);
        }
        field3509++;
        return class86.method566(arg2, arg0, arg3, 1) ? class277.method1894((byte) 31) : null;
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V", line = 26)
    public static void method1449(int arg0) {
        field3515 = null;
        field3511 = null;
        field3508 = null;
        field3505 = null;
        if (arg0 == 34) {
            field3506 = null;
            field3512 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)Lgb;", line = 41)
    public static final class169 method1450(int arg0, int arg1) {
        field3507++;
        class169 var2 = (class169) class306.field5254.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1015.method1381(arg1, arg0, 0);
        class169 var4 = new class169();
        if (var3 != null) {
            var4.method1116(2386, arg0, new class291(var3));
        }
        class306.field5254.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)[[I", line = 78)
    public final int[][] method55(int arg0, boolean arg1) {
        field3513++;
        if (arg1) {
            field3506 = (class152) null;
        }
        int[][] var3 = this.field1594.method656((byte) -116, arg0);
        if (this.field1594.field1402 && this.method1117(18)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % this.field2661 * this.field2661;
            for (int var8 = 0; var8 < class58.field889; var8++) {
                int var9 = this.field2669[var8 % this.field2670 + var7];
                var5[var8] = class34.method251(var9 << 4, 4080);
                var6[var8] = class34.method251(65280, var9) >> 4;
                var4[var8] = class34.method251(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIZ)Lwm;", line = 142)
    public static final class152 method1451(int arg0, int arg1, int arg2, boolean arg3) {
        field3514++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 > -47) {
            return (class152) null;
        } else {
            int var4 = 1;
            int var5 = arg2 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            int var6 = var4;
            if (arg2 < 0 || arg3) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg2 < 0) {
                var7[0] = 45;
            } else if (arg3) {
                var7[0] = 43;
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = arg2 % arg1;
                arg2 /= arg1;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > 9) {
                    var9 += 39;
                }
                var7[var6 - var8 - 1] = (byte) (var9 + 48);
            }
            class152 var10 = new class152();
            var10.field2371 = var6;
            var10.field2389 = var7;
            return var10;
        }
    }
}
