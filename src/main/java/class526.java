import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class526 implements class738 {

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "Lkg;")
    public static class271 field7468 = new class271("", 15);

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "[F")
    public static float[] field7470 = new float[16384];

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "[F")
    public static float[] field7471 = new float[16384];

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "Lqaa;")
    public static class27 field7476;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field7477;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lqca;BJ[I)Ljava/lang/String;")
    public final String method3114(class115 arg0, byte arg1, long arg2, int[] arg3) {
        field7467++;
        if (class200.field2871 == arg0) {
            class362 var6 = class723.field10100.method2423(arg3[0], (byte) -114);
            return var6.method2251((int) arg2, -28891);
        } else if (class512.field7309 == arg0 || class434.field6070 == arg0) {
            class253 var7 = class558.field7942.method721(-41, (int) arg2);
            return var7.field3644;
        } else if (class178.field2570 == arg0 || class638.field9095 == arg0 || class419.field5883 == arg0) {
            return class723.field10100.method2423(arg3[0], (byte) -75).method2251((int) arg2, -28891);
        } else {
            if (arg1 < 3) {
                method3115((byte) -3, null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BLvk;)[Lbk;")
    public static final class374[] method3115(byte arg0, class367 arg1) {
        field7473++;
        if (!arg1.method2289((byte) -127)) {
            return new class374[0];
        }
        class637 var2 = arg1.method2282(true);
        while (var2.field9091 == 0) {
            class246.method1639(10L, (byte) -105);
        }
        if (var2.field9091 == 2) {
            return new class374[0];
        }
        int[] var3 = (int[]) var2.field9093;
        class374[] var4 = new class374[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class374 var6 = new class374();
            var4[var5] = var6;
            var6.field5250 = var3[var5 << 2];
            var6.field5244 = var3[(var5 << 2) + 1];
            var6.field5245 = var3[(var5 << 2) + 2];
            var6.field5246 = var3[(var5 << 2) + 3];
        }
        if (arg0 >= -33) {
            field7471 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public static void method3116(int arg0) {
        field7477 = null;
        field7470 = null;
        field7468 = null;
        field7471 = null;
        if (arg0 != -7236) {
            method3118(50, null);
        }
        field7476 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)I")
    public static final int method3117(boolean arg0, int arg1) {
        if (arg1 != -3) {
            return 85;
        }
        field7472++;
        int var2 = class435.field6079;
        if (var2 == 0) {
            return arg0 ? 0 : class269.field3879;
        } else if (var2 == 1) {
            return class269.field3879;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3118(int arg0, String arg1) {
        field7474++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        for (int var4 = arg0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + '\n' - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class123.method977(false, (byte) var11)) {
                    var2.append(class27.method199(16, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7471[var2] = (float) Math.sin((double) var2 * var0);
            field7470[var2] = (float) Math.cos((double) var2 * var0);
        }
        field7475 = 0;
        field7476 = new class27(14, -1);
    }
}
