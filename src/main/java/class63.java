import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 extends class381 {

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Ljava/lang/String;")
    public String field959;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "J")
    public long field957;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Ljava/lang/String;")
    public String field960;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lik;")
    public static class410 field963 = new class410(64);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Ljava/lang/String;")
    public static String field965 = "M";

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Ljava/lang/String;")
    public static String field967 = " is already on your ignore list.";

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method558(String arg0, int arg1) {
        field964++;
        if (arg0 == null) {
            return;
        }
        if (!(class123.field1724 < 100 || class176.field2607) || class123.field1724 >= 200) {
            class289.method1838(-754415328, class233.field3204);
            return;
        }
        String var2 = class39.method385(-1, arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 < 20) {
            field965 = null;
        }
        while (class123.field1724 > var3) {
            String var7 = class39.method385(-1, class87.field1294[var3]);
            if (var7 != null && var7.equals(var2)) {
                class289.method1838(-754415328, arg0 + class422.field5908);
                return;
            }
            if (class186.field2695[var3] != null) {
                String var8 = class39.method385(-1, class186.field2695[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class289.method1838(-754415328, arg0 + class422.field5908);
                    return;
                }
            }
            var3++;
        }
        for (int var4 = 0; var4 < class275.field3702; var4++) {
            String var5 = class39.method385(-1, class268.field3607[var4]);
            if (var5 != null && var5.equals(var2)) {
                class289.method1838(-754415328, class336.field4556 + arg0 + class235.field3254);
                return;
            }
            if (class147.field2259[var4] != null) {
                String var6 = class39.method385(-1, class147.field2259[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class289.method1838(-754415328, class336.field4556 + arg0 + class235.field3254);
                    return;
                }
            }
        }
        if (class39.method385(-1, class95.field1379.field4577).equals(var2)) {
            class289.method1838(-754415328, class266.field3578);
        } else {
            class355.field4828.method1801(112, (byte) -98);
            class221.field3047++;
            class355.field4828.method1824(118, class408.method2528(-91, arg0));
            class355.field4828.method1827(0, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lpe;Lhh;III)V")
    public static final void method559(class391 arg0, class184 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class368.field5054) {
            class224 var5 = class118.field1653[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3124 != null && var5.field3124.method537(-95)) {
                arg1.method532(true, 114, var5.field3124, arg0, 0, 128, 0);
            }
        }
        if (arg4 < class368.field5054) {
            class224 var6 = class118.field1653[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3124 != null && var6.field3124.method537(-71)) {
                arg1.method532(true, -105, var6.field3124, arg0, 0, 0, 128);
            }
        }
        if (arg3 < class368.field5054 && arg4 < class16.field190) {
            class224 var7 = class118.field1653[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3124 != null && var7.field3124.method537(-62)) {
                arg1.method532(true, 126, var7.field3124, arg0, 0, 128, 128);
            }
        }
        if (arg3 < class368.field5054 && arg4 > 0) {
            class224 var8 = class118.field1653[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3124 != null && var8.field3124.method537(-93)) {
                arg1.method532(true, 114, var8.field3124, arg0, 0, 128, -128);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method560(byte arg0) {
        field967 = null;
        field963 = null;
        if (arg0 != 26) {
            field963 = null;
        }
        field965 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILrk;Lrk;)V")
    public static final void method561(int arg0, class427 arg1, class427 arg2) {
        class392.field5499 = arg2;
        field956++;
        if (arg0 > 78) {
            class91.field1350 = arg1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLap;)V")
    public static final void method562(byte arg0, class289 arg1) {
        field955++;
        for (int var2 = 0; var2 < class38.field583; var2++) {
            int var3 = arg1.method1821(arg0 ^ 0xFFFFFFE7);
            int var4 = arg1.method1853(arg0 + 87);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class378.field5322[var3] != null) {
                class378.field5322[var3].field1850 = var4;
            }
        }
        if (arg0 != 10) {
            field967 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
    public class63(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field958 = arg6;
        this.field961 = arg5;
        this.field959 = arg1;
        this.field962 = arg2;
        this.field966 = arg3;
        this.field957 = arg4;
        this.field960 = arg0;
    }
}
