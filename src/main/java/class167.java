import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class167 {

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field2477 = 0;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "Lik;")
    public static class410 field2487 = new class410(30);

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Lrk;")
    public static class427 field2476;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Lrk;")
    public static class427 field2481;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILap;)V")
    public final void method1257(int arg0, class289 arg1) {
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                if (arg0 != -12541) {
                    return;
                }
                field2484++;
                return;
            }
            this.method1259(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILrk;)I")
    public static final int method1258(int arg0, class427 arg1) {
        field2479++;
        int var2 = arg0;
        if (arg1.method2635(class174.field2565, (byte) 52)) {
            var2 = arg0 + 1;
        }
        if (arg1.method2635(class451.field6518, (byte) 54)) {
            var2++;
        }
        if (arg1.method2635(class90.field1332, (byte) 56)) {
            var2++;
        }
        if (arg1.method2635(class372.field5177, (byte) 109)) {
            var2++;
        }
        if (arg1.method2635(class31.field521, (byte) -124)) {
            var2++;
        }
        if (arg1.method2635(class435.field6200, (byte) 45)) {
            var2++;
        }
        if (arg1.method2635(class323.field4375, (byte) 65)) {
            var2++;
        }
        if (arg1.method2635(class13.field104, (byte) 84)) {
            var2++;
        }
        if (arg1.method2635(class156.field2365, (byte) 75)) {
            var2++;
        }
        if (arg1.method2635(class115.field1614, (byte) 45)) {
            var2++;
        }
        if (arg1.method2635(class169.field2494, (byte) 100)) {
            var2++;
        }
        if (arg1.method2635(class161.field2397, (byte) -94)) {
            var2++;
        }
        if (arg1.method2635(class21.field393, (byte) -76)) {
            var2++;
        }
        if (arg1.method2635(class448.field6494, (byte) -86)) {
            var2++;
        }
        if (arg1.method2635(class352.field4816, (byte) 55)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZLap;)V")
    private final void method1259(int arg0, boolean arg1, class289 arg2) {
        if (!arg1) {
            method1260((byte) 27);
        }
        if (arg0 == 1) {
            this.field2482 = arg2.method1853(-38);
            this.field2483 = arg2.method1861((byte) -72);
            this.field2478 = arg2.method1861((byte) -72);
        }
        field2485++;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        field2487 = null;
        field2476 = null;
        field2481 = null;
        if (arg0 <= 74) {
            field2476 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1261(String arg0, byte arg1, String arg2, String arg3) {
        field2480++;
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, arg2.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg3.length());
        }
        int var5 = -85 % ((33 - arg1) / 63);
        return arg0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lfo;)V")
    public static final void method1262(class228 arg0) {
        for (int var1 = arg0.field3172; var1 <= arg0.field3162; var1++) {
            for (int var2 = arg0.field3161; var2 <= arg0.field3178; var2++) {
                class224 var3 = class118.field1653[arg0.field3170][var1][var2];
                if (var3 != null) {
                    class26 var4 = var3.field3129;
                    class26 var5 = null;
                    while (var4 != null) {
                        if (var4.field460 == arg0) {
                            if (var5 == null) {
                                var3.field3129 = var4.field463;
                            } else {
                                var5.field463 = var4.field463;
                            }
                            var4.method323(0);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field463;
                    }
                    var3.field3119 = 0;
                    for (class26 var6 = var3.field3129; var6 != null; var6 = var6.field463) {
                        var3.field3119 = (byte) (var3.field3119 | var6.field464);
                    }
                }
            }
        }
    }
}
