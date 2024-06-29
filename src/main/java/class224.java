import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class224 {

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field3179 = -1;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field3174 = -1;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3182 = new String[100];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Lln;")
    public static class35 field3181;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
    public static int[] field3175;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
    public int[] field3178;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([Ljava/lang/String;IBI)Ljava/lang/String;", line = 5)
    public static final String method1409(String[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 60) {
            field3181 = null;
        }
        field3173++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIII)V", line = 72)
    public static final void method1410(int arg0, int arg1, int arg2, int arg3) {
        field3183++;
        if (arg2 != 0) {
            field3175 = null;
        }
        class205.field2947 = new byte[arg3][arg1][arg0];
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILlk;B)V", line = 86)
    private final void method1411(int arg0, class425 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3179 = arg1.method2508(true);
        } else if (arg0 == 2) {
            this.field3178 = new int[arg1.method2503(true)];
            for (int var4 = 0; var4 < this.field3178.length; var4++) {
                this.field3178[var4] = arg1.method2508(true);
            }
        } else if (arg0 == 3) {
            this.field3174 = arg1.method2503(true);
        }
        if (arg2 != -95) {
            field3184 = -107;
        }
        field3180++;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZBI)Ljava/lang/String;", line = 126)
    public static final String method1412(int arg0, boolean arg1, byte arg2, int arg3) {
        field3176++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var9 = arg3;
                arg3 /= arg0;
                int var10 = var9 - (arg0 * arg3);
                if (var10 < 10) {
                    var6[var7] = (char) (var10 + 48);
                } else {
                    var6[var7] = (char) (var10 + 87);
                }
            }
            int var8 = 49 / ((-arg2 - 78) / 47);
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLlk;)V", line = 181)
    public final void method1413(byte arg0, class425 arg1) {
        int var3 = 81 % ((54 - arg0) / 55);
        field3177++;
        while (true) {
            int var4 = arg1.method2503(true);
            if (var4 == 0) {
                return;
            }
            this.method1411(var4, arg1, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)V", line = 202)
    public static void method1414(boolean arg0) {
        field3175 = null;
        if (!arg0) {
            method1412(-88, true, (byte) 44, 81);
        }
        field3181 = null;
        field3182 = null;
    }
}
