import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class189 {

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lf;")
    public static class329 field2819 = null;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "J")
    public static volatile long field2821 = 0L;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lub;")
    public class11 field2813;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lwi;")
    public static class198 field2818;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Llm;")
    public static class210 field2820;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    public int[] field2808;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lea;", line = 8)
    public static final class235 method1288(int arg0) {
        int var1 = class203.field3051[0] * class160.field2403[0];
        field2814++;
        byte[] var2 = class205.field3083[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class66.field865[class124.method893(255, var2[var4])];
        }
        if (arg0 != 14897) {
            return (class235) null;
        }
        class235 var5;
        if (class117.field1817) {
            var5 = new class303(class12.field136, class132.field2034, class203.field3039[0], class184.field2754[0], class203.field3051[0], class160.field2403[0], var3);
        } else {
            var5 = new class127(class12.field136, class132.field2034, class203.field3039[0], class184.field2754[0], class203.field3051[0], class160.field2403[0], var3);
        }
        class10.method49((byte) 83);
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;I)V", line = 39)
    public static final void method1289(int arg0, String arg1, String arg2, byte arg3, String arg4, int arg5) {
        field2810++;
        for (int var6 = 99; var6 > 0; var6--) {
            class6.field30[var6] = class6.field30[var6 - 1];
            class267.field4108[var6] = class267.field4108[var6 - 1];
            class9.field69[var6] = class9.field69[var6 - 1];
            class122.field1904[var6] = class122.field1904[var6 - 1];
            class225.field3429[var6] = class225.field3429[var6 - 1];
        }
        class267.field4108[0] = arg2;
        class160.field2400++;
        class9.field69[0] = arg1;
        if (arg3 == -95) {
            class122.field1904[0] = arg4;
            class233.field3498 = class225.field3423;
            class6.field30[0] = arg0;
            class225.field3429[0] = arg5;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 69)
    public static void method1290(boolean arg0) {
        if (arg0) {
            field2818 = null;
            field2820 = null;
            field2819 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 82)
    public static final void method1291(byte arg0) {
        class318.field4792 = null;
        class200.field2984 = null;
        field2816++;
        class267.field4107 = null;
        class223.field3399 = null;
        class202.field3029 = null;
        class288.field4351 = null;
        class80.field1130 = null;
        class327.field4921 = null;
        class61.field817 = null;
        class226.field3433 = null;
        class73.field948 = null;
        class247.field3679 = null;
        if (arg0 != 5) {
            field2818 = (class198) null;
        }
        class26.field371 = null;
        class11.field114 = null;
        class217.field3299 = null;
        class84.field1247 = null;
        class230.field3482 = null;
        class142.field2156 = null;
        class287.field4336 = null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 115)
    public static final void method1292(int arg0) {
        int[] var1 = new int[class304.field4633];
        int var2 = 0;
        int var3 = 25 % ((arg0 + 65) / 47);
        for (int var4 = 0; var4 < class304.field4633; var4++) {
            class253 var5 = class325.method2219(var4, -9379);
            if (var5.field3831 >= 0 || var5.field3793 >= 0) {
                var1[var2++] = var4;
            }
        }
        class28.field380 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class28.field380[var6] = var1[var6];
        }
        field2806++;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 149)
    public static final void method1293(byte arg0) {
        field2812++;
        try {
            if (class54.field682 == 1) {
                int var1 = class54.field673.method2027((byte) -67);
                if (var1 > 0 && class54.field673.method2007(120)) {
                    int var2 = var1 - class43.field527;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class54.field673.method2014((byte) 27, var2);
                    return;
                }
                class54.field673.method2029((byte) 77);
                class54.field673.method2003((byte) 120);
                if (class314.field4757 == null) {
                    class54.field682 = 0;
                } else {
                    class54.field682 = 2;
                }
                class7.field47 = null;
                class73.field955 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class54.field673.method2029((byte) 77);
            class7.field47 = null;
            class54.field682 = 0;
            class73.field955 = null;
            class314.field4757 = null;
        }
        if (arg0 != 13) {
            method1290(false);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 200)
    public static final void method1294(byte arg0) {
        int var1 = -29 / ((50 - arg0) / 53);
        field2811++;
        class316.field4772.method2176((byte) -99);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B[Ljava/lang/String;II)Ljava/lang/String;", line = 213)
    public static final String method1295(byte arg0, String[] arg1, int arg2, int arg3) {
        field2809++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var11 = arg1[arg3];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = arg2 + arg3;
            int var5 = 0;
            for (int var6 = arg3; var6 < var4; var6++) {
                String var7 = arg1[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            if (arg0 < 84) {
                return (String) null;
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg3; var9 < var4; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
