import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class19 extends class200 {

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    public int field325 = 0;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "Ldj;")
    public static class44 field312 = class89.method650(255, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "[J")
    public static long[] field313 = new long[256];

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "Ldj;")
    public static class44 field320 = class89.method650(255, ": ");

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "Ldj;")
    public static class44 field324 = class89.method650(255, "Weiter");

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "Ldj;")
    private static class44 field318 = class89.method650(255, "shake:");

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "I")
    public static int field326 = -1;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "Ldj;")
    public static class44 field319 = field318;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "Ldj;")
    public static class44 field315 = field318;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "Ldj;")
    public static class44 field317 = null;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "Ldj;")
    private static class44 field333;

    @OriginalMember(owner = "client!bg", name = "jb", descriptor = "Ldj;")
    private static class44 field335;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "Ldj;")
    public static class44 field329;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "Ldj;")
    public static class44 field334;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "Ldj;")
    public static class44 field332;

    @OriginalMember(owner = "client!bg", name = "kb", descriptor = "Ldj;")
    private static class44 field336;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "Ldj;")
    public static class44 field330;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "Ldj;")
    public static class44 field331;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "Lqe;")
    public static class176 field323;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZLfj;)V")
    private final void method149(int arg0, boolean arg1, class66 arg2) {
        field328++;
        if (arg1 && arg0 == 2) {
            this.field325 = arg2.method500(54);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I")
    public static final int method150(int arg0, int arg1, int arg2) {
        field314++;
        if (arg1 != 4901) {
            method154(null, (byte) 87, -70);
        }
        int var3 = class123.method842(false, arg2 - 1, arg0 + -1) + class123.method842(false, arg2 - 1, arg0 + 1) + class123.method842(false, arg2 - -1, arg0 + -1) + class123.method842(false, arg2 - -1, arg0 + 1);
        int var4 = class123.method842(false, arg2, arg0 - 1) + class123.method842(false, arg2, arg0 + 1) + class123.method842(false, arg2 - 1, arg0) + class123.method842(false, arg2 + 1, arg0);
        int var5 = class123.method842(false, arg2, arg0);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public static void method151(byte arg0) {
        field318 = null;
        field332 = null;
        field319 = null;
        field324 = null;
        field317 = null;
        field331 = null;
        field335 = null;
        field336 = null;
        field329 = null;
        field312 = null;
        field315 = null;
        if (arg0 != 43) {
            return;
        }
        field313 = null;
        field323 = null;
        field333 = null;
        field320 = null;
        field330 = null;
        field334 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLfj;)V")
    public final void method152(byte arg0, class66 arg1) {
        field327++;
        if (arg0 <= 111) {
            field319 = null;
        }
        while (true) {
            int var3 = arg1.method506(255);
            if (var3 == 0) {
                return;
            }
            this.method149(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILve;Lve;Lve;)V")
    public static final void method153(int arg0, class225 arg1, class225 arg2, class225 arg3) {
        class133.field2379 = arg3;
        if (arg0 != -1) {
            method153(67, null, null, null);
        }
        class218.field3956 = arg1;
        field316++;
        class130.field2328 = arg2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lvc;BI)V")
    public static final void method154(class223[] arg0, byte arg1, int arg2) {
        int var3 = 0;
        if (arg1 <= 38) {
            return;
        }
        while (var3 < arg0.length) {
            class223 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4076 == 0) {
                    if (var4.field4169 != null) {
                        method154(var4.field4169, (byte) 124, arg2);
                    }
                    class104 var5 = (class104) class129.field2294.method828((long) var4.field4040, (byte) -40);
                    if (var5 != null) {
                        class5.method36(var5.field1893, true, arg2);
                    }
                }
                if (arg2 == 0 && var4.field4041 != null) {
                    class140 var6 = new class140();
                    var6.field2507 = var4;
                    var6.field2506 = var4.field4041;
                    class150.method972(var6, (byte) -127);
                }
                if (arg2 == 1 && var4.field4048 != null) {
                    label62: {
                        if (var4.field4085 >= 0) {
                            class223 var7 = class213.method1379(var4.field4040, -10051);
                            if (var7 == null || var7.field4169 == null || var7.field4169.length <= var4.field4085 || var7.field4169[var4.field4085] != var4) {
                                break label62;
                            }
                        }
                        class140 var8 = new class140();
                        var8.field2507 = var4;
                        var8.field2506 = var4.field4048;
                        class150.method972(var8, (byte) -127);
                    }
                }
            }
            var3++;
        }
        field321++;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field313[var0] = var1;
        }
        field333 = class89.method650(255, "Attack");
        field335 = class89.method650(255, "as it was used to break our rules)3");
        field329 = field335;
        field334 = class89.method650(255, "Bitte geben Sie Ihr Passwort ein)3");
        field332 = field333;
        field336 = class89.method650(255, "yellow:");
        field330 = field336;
        field331 = field336;
    }
}
