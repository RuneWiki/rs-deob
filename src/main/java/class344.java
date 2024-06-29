import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class344 extends class5 {

    @OriginalMember(owner = "client!np", name = "m", descriptor = "Ljava/lang/String;")
    public String field5312;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Lof;")
    public static class446 field5309 = new class446("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 4)
    public static void method2228(byte arg0) {
        if (arg0 >= 103) {
            field5309 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB)Lcl;", line = 20)
    public static final class177 method2229(int arg0, int arg1, byte arg2) {
        if (arg2 < 84) {
            method2230(116, 96L);
        }
        field5313++;
        class177 var3 = (class177) class72.field1002.method1747((long) arg0 << 32 | (long) arg1, false);
        if (var3 == null) {
            var3 = new class177(arg0, arg1);
            class72.field1002.method1751(var3.field35, -126, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 41)
    public static final String method2230(int arg0, long arg1) {
        field5310++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                char var10 = class225.field3117[(int) (var8 - (arg1 * 37L))];
                if (var10 == '_') {
                    int var11 = var6.length() - 1;
                    var6.setCharAt(var11, Character.toUpperCase(var6.charAt(var11)));
                    var10 = ' ';
                }
                var6.append(var10);
            }
            var6.reverse();
            int var7 = -59 / ((18 - arg0) / 59);
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V", line = 92)
    public class344() {
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILqa;)V", line = 95)
    public static final void method2231(int arg0, class165 arg1) {
        field5311++;
        int var2 = class194.field2594;
        int var3 = class54.field756;
        if (arg0 != -32603) {
            field5309 = null;
        }
        int var4 = class428.field6504;
        int var5 = class392.field5988;
        int var6 = -10660793;
        arg1.method1117(var5, var3, var6, var2, var4, (byte) 73);
        arg1.method1117(16, var3 + 1, -16777216, var2 + 1, var4 - 2, (byte) 73);
        arg1.method1128(var2 + 1, var5 + -19, -16777216, -4, var4 - 2, var3 + 18);
        class199.field2653.method1712((byte) 66, class251.field3498.method2705((byte) 69, class257.field3556), var6, -1, var2 + 3, var3 + 14);
        int var7 = class502.field7404.method2323((byte) -105);
        int var8 = class502.field7404.method2325(-111);
        int var9 = 0;
        for (class54 var10 = (class54) class131.field1769.method445(arg0 ^ 0xFFFF8084); var10 != null; var10 = (class54) class131.field1769.method451(false)) {
            int var11 = var3 + ((class367.field5621 - var9 - 1) * 16) + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var8 > (var11 - 13) && (var11 + 3) > var8 && var10.field759) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class362.method2307(var10.field764, 22116)) {
                var13 = class103.field1489.method1603((byte) -99, (int) var10.field758).field1036;
            } else if (var10.field753 != -1) {
                var13 = class103.field1489.method1603((byte) -99, var10.field753).field1036;
            } else if (class296.method1894(var10.field764, 62)) {
                class24 var16 = (class24) class406.field6158.method1747((long) ((int) var10.field758), false);
                if (var16 != null) {
                    class17 var17 = var16.field348;
                    class258 var18 = var17.field274;
                    if (var18.field3627 != null) {
                        var18 = var18.method1660(class288.field4208, (byte) 74);
                    }
                    if (var18 != null) {
                        var13 = var18.field3632;
                    }
                }
            } else if (class270.method1737((byte) -36, var10.field764)) {
                Object var14 = null;
                class209 var15;
                if (var10.field764 == 1007) {
                    var15 = class432.field6575.method1872((int) var10.field758, false);
                } else {
                    var15 = class432.field6575.method1872((int) (var10.field758 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var15.field2934 != null) {
                    var15 = var15.method1435(arg0 ^ 0x7F5A, class288.field4208);
                }
                if (var15 != null) {
                    var13 = var15.field2931;
                }
            }
            String var19 = class400.method2476(var10, 32);
            if (var13 != null) {
                var19 = var19 + class200.method1359(var13, (byte) 116);
            }
            class199.field2653.method1707(var11, var12, var2 + 3, 78, class311.field4548, 0, var19, class203.field2718);
            if (var10.field755) {
                class507.field7463.method2201(class175.field2338.method564(65, var19) + var2 + 5, var11 + -12);
            }
            var9++;
        }
        class284.method1825((byte) 17, class54.field756, class428.field6504, class194.field2594, class392.field5988);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 202)
    public class344(String arg0) {
        this.field5312 = arg0;
    }
}
