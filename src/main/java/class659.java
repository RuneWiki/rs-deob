import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class659 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Ljb;")
    public class521 field9415 = new class521();

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9419 = new String[] { method4795(method4794("?\u000692H")), method4795(method4794("*]{p")), method4795(method4794("7F9]\u001d")), method4795(method4794("7F9^\u001d")) };

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lhl;")
    public static class556 field9414 = new class556(142, -2);

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "D")
    public static double field9418;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Lgda;")
    public static class58 field9417;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([Lmj;II)V", line = 6)
    public static final void method4792(class683[] arg0, int arg1, int arg2) {
        try {
            field9416++;
            if (arg1 != 25919) {
                field9418 = 0.0713795094601171D;
            }
            for (int var3 = 0; var3 < arg0.length; var3++) {
                class683 var4 = arg0[var3];
                if (var4 != null) {
                    if (var4.field9782 == 0) {
                        if (var4.field9825 != null) {
                            method4792(var4.field9825, arg1, arg2);
                        }
                        class23 var5 = (class23) class632.field9082.method737((byte) -39, (long) var4.field9774);
                        if (var5 != null) {
                            class50.method515(arg1 - 90224339, var5.field219, arg2);
                        }
                    }
                    if (arg2 == 0 && var4.field9880 != null) {
                        class730 var6 = new class730();
                        var6.field10693 = var4;
                        var6.field10692 = var4.field9880;
                        class598.method4378(var6);
                    }
                    if (arg2 == 1 && var4.field9729 != null) {
                        if (var4.field9799 >= 0) {
                            class683 var7 = class200.method1826(true, var4.field9774);
                            if (var7 == null || var7.field9743 == null || var7.field9743.length <= var4.field9799 || var7.field9743[var4.field9799] != var4) {
                                continue;
                            }
                        }
                        class730 var8 = new class730();
                        var8.field10692 = var4.field9729;
                        var8.field10693 = var4;
                        class598.method4378(var8);
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9419[2] + (arg0 == null ? field9419[1] : field9419[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 88)
    public static void method4793(int arg0) {
        try {
            if (arg0 == -2) {
                field9417 = null;
                field9414 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9419[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4794(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4795(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
