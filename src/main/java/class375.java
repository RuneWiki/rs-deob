import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class375 {

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Lfc;")
    public static class262 field5217 = new class262(8);

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "F")
    public static float field5218;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public int field5211;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public int field5213;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public int field5219;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2202(byte arg0) {
        class583.field8166 = null;
        field5210++;
        if (arg0 != -34) {
            method2202((byte) 62);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 14)
    public static void method2203(int arg0) {
        field5217 = null;
        int var1 = 27 / ((arg0 + 47) / 56);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[[BZ[I[[B[I[B)I", line = 23)
    public static final int method2204(int arg0, int arg1, byte[][] arg2, boolean arg3, int[] arg4, byte[][] arg5, int[] arg6, byte[] arg7) {
        field5215++;
        if (arg3) {
            return 25;
        }
        int var8 = arg6[arg1];
        int var9 = arg4[arg1] + var8;
        int var10 = arg6[arg0];
        int var11 = var10 + arg4[arg0];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg7[arg1] & 0xFF;
        if ((arg7[arg0] & 0xFF) < var14) {
            var14 = arg7[arg0] & 0xFF;
        }
        byte[] var15 = arg5[arg1];
        byte[] var16 = arg2[arg0];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BII)Z", line = 84)
    public static final boolean method2205(byte arg0, int arg1, int arg2) {
        field5216++;
        if (arg2 >= 1000 && arg1 < 1000) {
            return true;
        } else if (arg2 < 1000 && arg1 < 1000) {
            if (class538.method2961((byte) -98, arg1)) {
                return true;
            } else {
                return !class538.method2961((byte) 114, arg2);
            }
        } else if (arg2 >= 1000 && arg1 >= 1000) {
            return true;
        } else {
            if (arg0 < 65) {
                method2203(77);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIZI)V", line = 124)
    public static final void method2206(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5214++;
        if (class382.method2244(arg1, 86)) {
            class700.method3955(arg3, class357.field4742[arg1], arg0, true, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 135)
    public static final String method2207(String arg0, int arg1) {
        field5212++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > (var4 + 2)) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 - 87;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class735.method4116(-127, (byte) var11)) {
                    var2.append(class14.method54((byte) var11, (byte) 125));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        if (arg1 != -1) {
            field5218 = -2.4350014F;
        }
        return var2.toString();
    }
}
