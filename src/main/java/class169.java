import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class169 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2535 = "Continue";

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
    public static int[] field2539 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Luf;")
    public static class176 field2533;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "[Loa;")
    public static class100[] field2540;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lf;ILjava/lang/String;)I")
    public static final int method1124(class37 arg0, int arg1, String arg2) {
        field2537++;
        int var3 = arg0.field588;
        int var4 = -107 / ((51 - arg1) / 44);
        byte[] var5 = class13.method134(arg2, (byte) 97);
        arg0.method320((byte) 62, var5.length);
        arg0.field588 += class257.field3943.method1090(var5.length, var5, arg0.field583, arg0.field588, 0, true);
        return arg0.field588 - var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1125(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBLjava/lang/String;IILjava/lang/String;IJZZZ)V")
    public static final void method1126(int arg0, byte arg1, String arg2, int arg3, int arg4, String arg5, int arg6, long arg7, boolean arg8, boolean arg9, boolean arg10) {
        field2536++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class37 var14 = new class37(128);
        var14.method287(440742616, 10);
        var14.method312(1489253544, (arg8 ? 2 : 0) | (arg9 ? 1 : 0) | (arg10 ? 4 : 0));
        var14.method337(2103219728, arg7);
        var14.method289(var12[0], -127);
        var14.method321(120, arg2);
        var14.method289(var12[1], -126);
        var14.method312(1489253544, class274.field4315);
        var14.method287(440742616, arg3);
        var14.method287(440742616, arg4);
        var14.method289(var12[2], 8);
        int var15 = -118 / ((arg1 - 37) / 39);
        var14.method312(1489253544, arg6);
        var14.method312(1489253544, arg0);
        var14.method289(var12[3], 50);
        var14.method340(class186.field2806, -3350, class76.field1281);
        class37 var16 = new class37(350);
        var16.method321(122, arg5);
        int var17 = 8 - class39.method343(arg5, 5509) % 8;
        for (int var18 = 0; var18 < var17; var18++) {
            var16.method287(440742616, (int) (Math.random() * 255.0D));
        }
        var16.method323(var12, -128);
        class292.field4607.field588 = 0;
        class292.field4607.method287(440742616, 22);
        class292.field4607.method312(1489253544, var14.field588 + var16.field588 + 2);
        class292.field4607.method312(1489253544, 542);
        class292.field4607.method296(0, var14.field583, var14.field588, -20484);
        class292.field4607.method296(0, var16.field583, var16.field588, -20484);
        class137.field2132 = 1;
        class6.field102 = 0;
        class255.field3911 = 0;
        class259.field3978 = -3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1127(int arg0, Component arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        field2533 = null;
        field2540 = null;
        if (arg0 == 100) {
            field2539 = null;
            field2535 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I")
    public static final int method1129(int arg0, byte arg1) {
        field2532++;
        if (arg0 > 0) {
            return 1;
        } else {
            if (arg1 != 83) {
                field2539 = null;
            }
            return arg0 < 0 ? -1 : 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I")
    public abstract int method1130(int arg0);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method1131(int arg0) {
        field2534++;
        int var1 = class239.field3692.method1253((byte) -118, 8);
        if (class5.field78 > var1) {
            for (int var2 = var1; var2 < class5.field78; var2++) {
                class296.field4675[class214.field3305++] = class166.field2510[var2];
            }
        }
        if (var1 > class5.field78) {
            throw new RuntimeException("gppov1");
        }
        class5.field78 = 0;
        int var3 = 108 / ((arg0 - 30) / 59);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class166.field2510[var4];
            class28 var6 = class41.field675[var5];
            int var7 = class239.field3692.method1253((byte) -83, 1);
            if (var7 == 0) {
                class166.field2510[class5.field78++] = var5;
                var6.field4161 = class267.field4256;
            } else {
                int var8 = class239.field3692.method1253((byte) -85, 2);
                if (var8 == 0) {
                    class166.field2510[class5.field78++] = var5;
                    var6.field4161 = class267.field4256;
                    class36.field576[class17.field269++] = var5;
                } else if (var8 == 1) {
                    class166.field2510[class5.field78++] = var5;
                    var6.field4161 = class267.field4256;
                    int var9 = class239.field3692.method1253((byte) -115, 3);
                    var6.method1796(var9, (byte) 107, 1);
                    int var10 = class239.field3692.method1253((byte) -113, 1);
                    if (var10 == 1) {
                        class36.field576[class17.field269++] = var5;
                    }
                } else if (var8 == 2) {
                    class166.field2510[class5.field78++] = var5;
                    var6.field4161 = class267.field4256;
                    if (class239.field3692.method1253((byte) -92, 1) == 1) {
                        int var11 = class239.field3692.method1253((byte) -113, 3);
                        var6.method1796(var11, (byte) 123, 2);
                        int var12 = class239.field3692.method1253((byte) -112, 3);
                        var6.method1796(var12, (byte) 107, 2);
                    } else {
                        int var13 = class239.field3692.method1253((byte) -81, 3);
                        var6.method1796(var13, (byte) 111, 0);
                    }
                    int var14 = class239.field3692.method1253((byte) -126, 1);
                    if (var14 == 1) {
                        class36.field576[class17.field269++] = var5;
                    }
                } else if (var8 == 3) {
                    class296.field4675[class214.field3305++] = var5;
                }
            }
        }
    }
}
