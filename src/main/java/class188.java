import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class188 {

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3049 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field3053 = 0;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3046 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3060 = " from your ignore list first.";

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3061 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3062 = "Choose Option";

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Ldf;")
    public static class175 field3056;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I", line = 17)
    public static final int method1324(int arg0, int arg1, int arg2) {
        field3045++;
        if (arg2 != 13802) {
            method1325((byte) 46);
        }
        int var3 = class88.method639(arg0 + 45365, 4, arg1 + 91923, (byte) -72) + ((class88.method639(arg0 + 10294, 2, arg1 - -37821, (byte) 125) + -128 >> 1) - -(class88.method639(arg0, 1, arg1, (byte) 125) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 49)
    public static void method1325(byte arg0) {
        field3060 = null;
        field3062 = null;
        field3061 = null;
        field3056 = null;
        if (arg0 != 72) {
            method1324(116, 64, 34);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I", line = 62)
    public static final int method1326(int arg0) {
        field3051++;
        if (arg0 != -1) {
            method1328(26, 2, (byte) -128);
        }
        return class12.field146 && class333.field5177[81] && class126.field1887 > 2 ? class56.field746[class126.field1887 - 2] : class56.field746[class126.field1887 - 1];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BZ)V", line = 79)
    public static final void method1327(byte arg0, boolean arg1) {
        field3047++;
        byte[][] var2;
        byte var3;
        if (class186.field2991 && arg1) {
            var2 = class105.field1596;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class187.field3037;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            int var7 = class327.field5096[var5] >> 8;
            int var8 = class327.field5096[var5] & 0xFF;
            int var9 = var7 * 64 - class181.field2925;
            int var10 = var8 * 64 - class24.field351;
            byte[] var11 = var2[var5];
            if (var11 != null) {
                class40.method279(arg0 + 25262);
                var6 = client.method1914((byte) 109, class181.field2925, arg1, var10, var11, var9, class24.field351, class50.field685);
            }
            if (!arg1 && class31.field437 / 8 == var7 && class336.field5209 / 8 == var8) {
                if (var6 == null) {
                    class294.field4624 = -1;
                } else {
                    class209.field3417 = var6[2];
                    class294.field4624 = var6[0];
                    class93.field1429 = var6[1];
                    class100.field1521 = var6[4];
                    class157.field2423 = var6[3];
                }
            }
        }
        if (arg0 != -3) {
            field3046 = 30;
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class327.field5096[var12] >> 8) * 64 - class181.field2925;
            int var14 = (class327.field5096[var12] & 0xFF) * 64 - class24.field351;
            byte[] var15 = var2[var12];
            if (var15 == null && class336.field5209 < 800) {
                class40.method279(25259);
                for (int var16 = 0; var16 < var3; var16++) {
                    class302.method2113(var14, var13, 64, var16, true, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)V", line = 178)
    public static final void method1328(int arg0, int arg1, byte arg2) {
        if (arg2 < 109) {
            method1325((byte) -22);
        }
        if (arg1 == 8) {
            arg1 = 4;
        }
        if (arg1 == 4 && !class63.field831) {
            arg0 = 2;
            arg1 = 2;
        }
        field3050++;
        if (class263.field4172 != arg1) {
            if (class2.field6) {
                return;
            }
            if (class263.field4172 != 0) {
                class111.field1657[class263.field4172].method303();
            }
            if (arg1 != 0) {
                class220 var3 = class111.field1657[arg1];
                var3.method300();
                var3.method301(arg0);
            }
            class292.field4603 = arg0;
            class263.field4172 = arg1;
        } else if (arg1 != 0 && class292.field4603 != arg0) {
            class111.field1657[arg1].method301(arg0);
            class292.field4603 = arg0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 228)
    public static final boolean method1329(byte arg0, String arg1) {
        field3054++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class198.field3247; var2++) {
            if (arg1.equalsIgnoreCase(class239.field3773[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class13.field159.field5003)) {
            return true;
        } else if (arg0 <= 1) {
            return false;
        } else {
            return false;
        }
    }
}
