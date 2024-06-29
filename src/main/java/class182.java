import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class182 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lbf;")
    public static class372 field2578 = new class372(4, -1);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field2580 = Boolean.FALSE;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB[BI)I")
    public static final int method1286(int arg0, byte arg1, byte[] arg2, int arg3) {
        field2576++;
        int var4 = -1;
        int var5 = arg0;
        int var6 = 95 / ((14 - arg1) / 58);
        while (var5 < arg3) {
            var4 = class155.field2203[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method1287(int arg0) {
        if (arg0 != 0) {
            method1289(null, 9);
        }
        field2578 = null;
        field2580 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZLjava/lang/String;ZZIIJLjava/lang/String;I)V")
    public static final void method1288(int arg0, int arg1, boolean arg2, String arg3, boolean arg4, boolean arg5, int arg6, int arg7, long arg8, String arg9, int arg10) {
        field2577++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class65 var14 = new class65(128);
        var14.method638(255, 10);
        var14.method611((byte) 67, (arg4 ? 4 : 0) | (arg2 ? 2 : 0) | (arg5 ? 1 : 0));
        var14.method591(arg8, (byte) -48);
        var14.method618(var12[0], (byte) 84);
        var14.method605(111, arg3);
        var14.method618(var12[1], (byte) 116);
        var14.method611((byte) 67, class401.field5950);
        var14.method638(arg0 ^ 0xFD, arg10);
        var14.method638(arg0 ^ 0xFD, arg1);
        var14.method618(var12[arg0], (byte) 82);
        var14.method611((byte) 67, arg6);
        var14.method611((byte) 67, arg7);
        var14.method618(var12[3], (byte) 84);
        var14.method609(class496.field7276, (byte) -107, class523.field7684);
        class65 var15 = new class65(350);
        var15.method605(arg0 + 99, arg9);
        int var16 = 8 - class494.method2962(arg9, (byte) -101) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method638(255, (int) (Math.random() * 255.0D));
        }
        var15.method627(var12, 1207900229);
        class472.field6970.field827 = 0;
        class472.field6970.method638(arg0 + 253, class215.field3091.field3575);
        class472.field6970.method611((byte) 67, var15.field827 + var14.field827 + 2);
        class472.field6970.method611((byte) 67, 592);
        class472.field6970.method606(0, true, var14.field783, var14.field827);
        class472.field6970.method606(0, true, var15.field783, var15.field827);
        class175.field2485 = 0;
        class72.field989 = 1;
        class4.field62 = 0;
        class247.field3669 = -3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lr;I)V")
    public static final void method1289(class121 arg0, int arg1) {
        field2579++;
        boolean var2 = false;
        if (class263.field3867 == arg0.field1698 || arg0.field1696 == -1 || arg0.field1729 != 0) {
            var2 = true;
        } else {
            class267 var3 = class153.field2169.method1585(3, arg0.field1696);
            if (var3.field3927 || var3.field3940[arg0.field1745] < (arg0.field1758 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1698 - arg0.field1692;
            int var5 = class263.field3867 - arg0.field1692;
            int var6 = arg0.field1726 * 128 + arg0.method963((byte) 127) * 64;
            int var7 = arg0.field1735 * 128 + (arg0.method963((byte) 127) * 64);
            int var8 = arg0.field1727 * 128 + (arg0.method963((byte) 127) * 64);
            int var9 = arg0.field1759 * 128 + (arg0.method963((byte) 127) * 64);
            arg0.field6335 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field6334 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
        }
        arg0.field1775 = 0;
        if (arg0.field1724 == 0) {
            arg0.method957(112, 8192);
        }
        if (arg0.field1724 == 1) {
            arg0.method957(121, 12288);
        }
        if (arg0.field1724 == 2) {
            arg0.method957(107, 0);
        }
        if (arg0.field1724 == 3) {
            arg0.method957(111, 4096);
        }
        if (arg1 != 128) {
            method1287(99);
        }
    }
}
