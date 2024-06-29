import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class507 extends class598 {

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Lpm;")
    public class134 field7284;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[I")
    public static int[] field7286 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "[I")
    public static int[] field7285 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "[Z")
    public static boolean[] field7282;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[[[Z")
    public static boolean[][][] field7283;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 5)
    public static void method2900(int arg0) {
        if (arg0 != -18399) {
            field7286 = null;
        }
        field7286 = null;
        field7285 = null;
        field7283 = null;
        field7282 = null;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)Z", line = 24)
    public static final boolean method2901(byte arg0) {
        field7278++;
        if (class381.field5161) {
            try {
                if ((Boolean) class627.method3524("showingVideoAd", class591.field8347, 23421)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 <= 103) {
            method2902(false, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 46)
    public static final String method2902(boolean arg0, String arg1) {
        field7281++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        if (arg0) {
            field7285 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && var3 > (var4 + 2)) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 - 87;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg1.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 + '\n' - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class597.method3351((byte) var11, -97)) {
                    var2.append(class161.method876((byte) 33, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lmj;II[B)V", line = 127)
    public class507(class344 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7284 = arg0.method2046(arg2, arg3, (byte) 69, arg1, class274.field3431, false);
        this.field7284.method759(false, -19314, false);
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lmj;II[I)V", line = 139)
    public class507(class344 arg0, int arg1, int arg2, int[] arg3) {
        this.field7284 = arg0.method1983(false, (byte) 107, arg2, arg1, arg3);
        this.field7284.method759(false, -19314, false);
    }
}
