import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class299 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lgh;")
    public static class388 field4518 = null;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "[J")
    public static long[] field4522 = new long[100];

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "Los;")
    public static class309 field4528;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Lsv;")
    public static class473 field4519;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "[[B")
    public static byte[][] field4526;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILph;II)Lpn;")
    public static final class528 method1926(int arg0, class459 arg1, int arg2, int arg3) {
        field4525++;
        if (arg2 == 0) {
            byte[] var4 = arg1.method2757(arg3, arg0, (byte) -123);
            return var4 == null ? null : new class528(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZIII)V")
    public static final void method1927(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class372.field5455 <= arg3 && arg3 <= class216.field3415) {
            int var5 = class73.method640(class43.field600, (byte) -115, class467.field6940, arg2);
            int var6 = class73.method640(class43.field600, (byte) -87, class467.field6940, arg0);
            class503.method3026(28319, var5, var6, arg4, arg3);
        }
        if (!arg1) {
            field4520++;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1928(String arg0, byte arg1) {
        field4523++;
        if (arg1 != -62) {
            method1927(-1, false, -108, 60, -125);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class260.method1671(7763, arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIILph;)Lfj;")
    public static final class470 method1929(int arg0, int arg1, int arg2, class459 arg3) {
        field4521++;
        byte[] var4 = arg3.method2757(arg1, arg0, (byte) -127);
        if (var4 == null) {
            return null;
        } else if (arg2 < 68) {
            return null;
        } else {
            return new class470(var4);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method1930(int arg0) {
        field4519 = null;
        field4518 = null;
        field4522 = null;
        field4528 = null;
        if (arg0 == 0) {
            field4526 = null;
        }
    }

    static {
        new class309(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field4527 = 0;
        field4528 = new class309("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
    }
}
