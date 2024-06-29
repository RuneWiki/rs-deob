import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class227 extends class200 {

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "Liv;")
    public static class64 field3237 = new class64(21, 6);

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field3240 = 0;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "Lno;")
    public class494 field3230;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "Ljava/lang/String;")
    public String field3231;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "[I")
    public int[] field3228;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "[I")
    public int[] field3229;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "[Lan;")
    public class20[] field3232;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field3234;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V", line = 7)
    public static void method1484(int arg0) {
        field3237 = null;
        if (arg0 != -1) {
            field3240 = -29;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 22)
    public static final void method1485(boolean arg0, String arg1, int arg2) {
        field3227++;
        if (arg1 == null) {
            return;
        }
        if (class1.field9 >= 100) {
            class101.method754(class338.field5084.method2180(client.field2870, arg2 ^ 0x7332), 0);
            return;
        }
        String var3 = class33.method351(arg1, 63);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class1.field9; var4++) {
            String var8 = class33.method351(class156.field2456[var4], -96);
            if (var8 != null && var8.equals(var3)) {
                class101.method754(arg1 + class116.field1923.method2180(client.field2870, 29491), 0);
                return;
            }
            if (class441.field6609[var4] != null) {
                String var9 = class33.method351(class441.field6609[var4], 88);
                if (var9 != null && var9.equals(var3)) {
                    class101.method754(arg1 + class116.field1923.method2180(client.field2870, 29491), 0);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class184.field2756; var5++) {
            String var6 = class33.method351(class436.field6504[var5], arg2 ^ 0x42);
            if (var6 != null && var6.equals(var3)) {
                class101.method754(class60.field1055.method2180(client.field2870, 29491) + arg1 + class477.field7120.method2180(client.field2870, 29491), arg2 - 1);
                return;
            }
            if (class208.field3014[var5] != null) {
                String var7 = class33.method351(class208.field3014[var5], -106);
                if (var7 != null && var7.equals(var3)) {
                    class101.method754(class60.field1055.method2180(client.field2870, 29491) + arg1 + class477.field7120.method2180(client.field2870, arg2 + 29490), 0);
                    return;
                }
            }
        }
        if (class33.method351(class139.field2224.field3684, arg2 + 51).equals(var3)) {
            class101.method754(class308.field4714.method2180(client.field2870, 29491), arg2 ^ 0x1);
            return;
        }
        class397.field5992++;
        class28.method321(class108.field1789, -5001);
        class410.field6141.method1109(false, arg2 + class217.method1444(arg1, arg2 - 121));
        class410.field6141.method1089((byte) -89, arg1);
        class410.field6141.method1109(false, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V", line = 120)
    public static final void method1486(int arg0) {
        field3226++;
        if (!class99.field1638) {
            return;
        }
        class350 var1 = class83.method649((byte) 77, class383.field5790, class347.field5187);
        if (var1 != null && var1.field5245 != null) {
            class207 var2 = new class207();
            var2.field2996 = var1.field5245;
            var2.field2995 = var1;
            class437.method2614(var2);
        }
        if (arg0 != 0) {
            return;
        }
        class99.field1638 = false;
        class245.field3518 = -1;
        class63.field1086 = -1;
        if (var1 != null) {
            class302.method1902((byte) -109, var1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lmq;BI)V", line = 153)
    public static final void method1487(class350[] arg0, byte arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class350 var5 = arg0[var3];
            if (var5 != null) {
                if (var5.field5215 == 0) {
                    if (var5.field5291 != null) {
                        method1487(var5.field5291, (byte) -61, arg2);
                    }
                    class352 var6 = (class352) class162.field2507.method171((byte) -101, (long) var5.field5322);
                    if (var6 != null) {
                        class116.method861(-1, arg2, var6.field5391);
                    }
                }
                if (arg2 == 0 && var5.field5369 != null) {
                    class207 var7 = new class207();
                    var7.field2995 = var5;
                    var7.field2996 = var5.field5369;
                    class437.method2614(var7);
                }
                if (arg2 == 1 && var5.field5325 != null) {
                    if (var5.field5354 >= 0) {
                        class350 var8 = class319.method2075(true, var5.field5322);
                        if (var8 == null || var8.field5291 == null || var8.field5291.length <= var5.field5354 || var8.field5291[var5.field5354] != var5) {
                            continue;
                        }
                    }
                    class207 var9 = new class207();
                    var9.field2996 = var5.field5325;
                    var9.field2995 = var5;
                    class437.method2614(var9);
                }
            }
        }
        int var4 = -23 / ((56 - arg1) / 61);
        field3236++;
    }
}
