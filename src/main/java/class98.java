import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class128 {

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lid;")
    private static class60 field2395 = class11.method72("RuneScape is loading )2 please wait)3)3)3", (byte) 97);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lid;")
    public static class60 field2398 = field2395;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lid;")
    public static class60 field2396 = class11.method72("::fpsoff", (byte) 95);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Lid;")
    public static class60 field2401 = class11.method72(" weitere Optionen", (byte) -90);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lid;")
    public static class60 field2405 = class11.method72("(Z", (byte) 93);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lid;")
    private static class60 field2408 = class11.method72("wishes to trade with you)3", (byte) -45);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lid;")
    public static class60 field2403 = field2408;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lpa;")
    public class105 field2394;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Lic;")
    public class59 field2407;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[B")
    public byte[] field2397;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILee;)V")
    public static final void method771(int arg0, class34 arg1) {
        class109.field2662 = arg1;
        if (arg0 != 1) {
            method776(-110);
        }
        field2392++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lid;BZILid;Lie;)V")
    public static final void method772(class60 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, class61 arg5) {
        if (arg1 <= -32) {
            field2400++;
            int var6 = arg5.method482(13975, arg0);
            int var7 = arg5.method464((byte) -113, arg4, var6);
            class100.method786(var6, (byte) 72, arg2, var7, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static final void method773(int arg0) {
        class9.field139++;
        class22.field519.method1214(85, 0);
        field2404++;
        class22.field519.method830(0L, 114);
        if (arg0 != -2) {
            field2403 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)Lid;")
    public static final class60 method774(byte arg0, int arg1) {
        field2402++;
        return arg0 == -121 ? class31.method237(false, 10, arg1, arg0 ^ 0x79) : null;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public static final void method775(int arg0) {
        field2393++;
        if (class125.field2872 > 0) {
            class154.method1170((byte) -55);
            return;
        }
        class45.method348((byte) -101, 40);
        class153.field3447 = class4.field73;
        if (arg0 < 47) {
            field2408 = null;
        }
        class4.field73 = null;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public static final void method776(int arg0) {
        if (arg0 != 1) {
            field2408 = null;
        }
        for (class12 var1 = (class12) class53.field1340.method496(10153); var1 != null; var1 = (class12) class53.field1340.method500(arg0 - 2)) {
            if (var1.field220 > 0) {
                var1.field220--;
            }
            if (var1.field220 != 0) {
                if (var1.field203 > 0) {
                    var1.field203--;
                }
                if (var1.field203 == 0 && var1.field201 >= 1 && var1.field225 >= 1 && var1.field201 <= 102 && var1.field225 <= 102 && (var1.field199 < 0 || class124.method982(var1.field222, 5, var1.field199))) {
                    class155.method1184(var1.field225, var1.field199, var1.field207, var1.field223, -15165, var1.field222, var1.field201, var1.field218);
                    var1.field203 = -1;
                    if (var1.field206 == var1.field199 && var1.field206 == -1) {
                        var1.method1009((byte) 86);
                    } else if (var1.field206 == var1.field199 && var1.field218 == var1.field213 && var1.field222 == var1.field211) {
                        var1.method1009((byte) 72);
                    }
                }
            } else if (var1.field206 < 0 || class124.method982(var1.field211, arg0 + 4, var1.field206)) {
                class155.method1184(var1.field225, var1.field206, var1.field207, var1.field223, -15165, var1.field211, var1.field201, var1.field213);
                var1.method1009((byte) 73);
            }
        }
        field2391++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method777(boolean arg0, int arg1, byte[] arg2) {
        field2390++;
        if (arg1 != 20052) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class11.field193) {
                try {
                    class129 var3 = (class129) Class.forName("qf").getDeclaredConstructor().newInstance();
                    var3.method925((byte) 77, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class11.field193 = true;
                }
            }
            return arg0 ? class30.method228(arg2, (byte) -124) : arg2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static final void method778(byte arg0) {
        class56.field1409.method148((byte) -10);
        field2406++;
        for (int var1 = 0; var1 < 32; var1++) {
            class34.field801[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class55.field1384[var2] = 0L;
        }
        if (arg0 > -108) {
            field2398 = null;
        }
        class33.field767 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static void method779(boolean arg0) {
        field2398 = null;
        field2395 = null;
        field2408 = null;
        field2401 = null;
        field2405 = null;
        field2396 = null;
        field2403 = null;
        if (arg0) {
            method773(10);
        }
    }
}
