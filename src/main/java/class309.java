import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class309 extends class406 {

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Ljava/lang/String;")
    public String field4381;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Ltq;")
    public static class376 field4378;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
    public static final void method2044(byte arg0) {
        class300.field4197.method1626((byte) 106);
        field4380++;
        if (arg0 == -107) {
            class444.field6373.method1626((byte) 106);
            class435.field6251.method1626((byte) 106);
            class86.field974.method1626((byte) 106);
            class87.field985.method1626((byte) 106);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method2045(int arg0) {
        field4378 = null;
        if (arg0 != 0) {
            method2046(45, false, false, -46);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZZI)Ljava/lang/String;")
    public static final String method2046(int arg0, boolean arg1, boolean arg2, int arg3) {
        field4379++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg1 && arg0 >= 0) {
            int var4 = 2;
            for (int var5 = arg0 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg2) {
                field4378 = null;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg3;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method2047(int arg0, int[] arg1) {
        field4382++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class347.field4919;
        for (int var4 = arg0; var4 < arg1.length; var4++) {
            class106 var5 = class313.method2061(arg1[var4], (byte) -24);
            if (var5.field1278 != -1) {
                class381 var6 = (class381) class118.field1442.method1625((long) var5.field1278, arg0);
                if (var6 == null) {
                    class375 var7 = class375.method2402(class298.field4178, var5.field1278, 0);
                    if (var7 != null) {
                        var6 = class151.field1873.method596(var7, true);
                        class118.field1442.method1622((byte) 13, var6, (long) var5.field1278);
                    }
                }
                if (var6 != null) {
                    class170.field2351[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class309() {
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class309(String arg0, int arg1) {
        this.field4381 = arg0;
    }
}
