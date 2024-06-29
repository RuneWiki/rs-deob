import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class183 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lcc;")
    public static class209 field3308 = class95.method669(101, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3310 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1249(byte arg0) {
        field3308 = null;
        if (arg0 <= 77) {
            field3312 = -4;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLw;)V")
    public static final void method1250(byte arg0, class143 arg1) {
        class41 var2 = null;
        field3307++;
        if (arg0 != 49) {
            return;
        }
        try {
            class203 var3 = arg1.method995("runescape", 0);
            while (var3.field3646 == 0) {
                class174.method1196((byte) 109, 1L);
            }
            if (var3.field3646 == 1) {
                var2 = (class41) var3.field3642;
                class106 var4 = class50.method383(7570);
                var2.method305((byte) -36, var4.field2085, 0, var4.field2108);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method307(-31335);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1251(byte[] arg0, byte arg1) {
        field3309++;
        if (arg1 <= 56) {
            field3312 = -105;
        }
        class106 var2 = new class106(arg0);
        int var3 = var2.method774((byte) 127);
        int var4 = var2.method746((byte) -100);
        if (var4 < 0 || class11.field220 != 0 && var4 > class11.field220) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method759(0, var7, var4, false);
            return var7;
        } else {
            int var5 = var2.method746((byte) -100);
            if (var5 < 0 || !(class11.field220 == 0 || class11.field220 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class24.method207(var6, var5, arg0, var4, 9);
            } else {
                class82.field1594.method1092(var2, var6, -119);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Component;ILw;II)Lwj;")
    public static final class6 method1252(Component arg0, int arg1, class143 arg2, int arg3, int arg4) {
        field3311++;
        if (class192.field3479 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class6 var5 = (class6) Class.forName("rf").getDeclaredConstructor().newInstance();
                var5.field80 = new int[(class32.field577 ? 2 : 1) * 256];
                var5.field127 = arg4;
                var5.method51(arg0);
                var5.field117 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field117 > 16384) {
                    var5.field117 = 16384;
                }
                var5.method50(var5.field117);
                if (class132.field2538 > 0 && class115.field2318 == null) {
                    class115.field2318 = new class261();
                    class115.field2318.field4694 = arg2;
                    arg2.method996(class115.field2318, class132.field2538, false);
                }
                if (class115.field2318 != null) {
                    if (class115.field2318.field4691[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class115.field2318.field4691[arg3] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class96 var6 = new class96(arg2, arg3);
                    var6.field127 = arg4;
                    var6.field80 = new int[(class32.field577 ? 2 : 1) * 256];
                    int var7 = 67 % ((66 - arg1) / 34);
                    var6.method51(arg0);
                    var6.field117 = 16384;
                    var6.method50(var6.field117);
                    if (class132.field2538 > 0 && class115.field2318 == null) {
                        class115.field2318 = new class261();
                        class115.field2318.field4694 = arg2;
                        arg2.method996(class115.field2318, class132.field2538, false);
                    }
                    if (class115.field2318 != null) {
                        if (class115.field2318.field4691[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class115.field2318.field4691[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class6();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
