import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class362 {

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "[I")
    public static int[] field5147 = new int[5];

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!pca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5144++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(JJ)J")
    public static long method2185(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
    public static final void method2186(boolean arg0) {
        class392.method2369((long) class310.field4553, class159.field2378, 0);
        field5142++;
        if (class609.field8659 != -1) {
            class537.method3025(!arg0, class609.field8659);
        }
        for (int var1 = 0; var1 < class562.field8052; var1++) {
            if (class509.field7067[var1]) {
                class301.field4347[var1] = true;
            }
            class141.field2208[var1] = class509.field7067[var1];
            class509.field7067[var1] = false;
        }
        if (!arg0) {
            field5147 = null;
        }
        class133.field2154 = class310.field4553;
        if (class159.field2378.method407()) {
            class57.field810 = true;
        }
        if (class609.field8659 != -1) {
            class562.field8052 = 0;
            class122.method979(-20);
        }
        class159.field2378.method657();
        class210.method1345(class159.field2378, 34962);
        int var2 = class191.method1263(11131);
        if (var2 == -1) {
            var2 = class185.field2692;
        }
        if (var2 == -1) {
            var2 = class354.field5063;
        }
        class549.method3085(false, var2);
        class303.field4378 = 0;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public static void method2187(int arg0) {
        field5147 = null;
        if (arg0 != 0) {
            field5147 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
    public static final int method2188(String arg0, int arg1, boolean arg2, int arg3) {
        field5143++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg1 <= 32) {
            return -85;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
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
                throw new NumberFormatException();
            }
            if (var11 >= arg3) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZ)Li;")
    public static final class251 method2189(int arg0, boolean arg1) {
        field5148++;
        class251 var2 = (class251) class111.field1837.method2407(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class547.field7609.method3175(arg0, (byte) -53, 1);
        class251 var4 = new class251();
        var4.field3665 = arg0;
        if (var3 != null) {
            var4.method1590(new class268(var3), false);
        }
        var4.method1591((byte) -98);
        if (var4.field3664 == 2 && class277.field4041.method740(0, (long) arg0) == null) {
            class277.field4041.method737((long) arg0, (byte) 92, new class264(class93.field1641));
            class602.field8567[class93.field1641++] = var4;
        }
        if (!arg1) {
            method2189(43, true);
        }
        class111.field1837.method2408(var4, (long) arg0, -123);
        return var4;
    }
}
