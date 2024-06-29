import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class35 extends class147 {

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Lna;")
    public class26 field581;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
    public static int[] field576 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lna;")
    public static class26 field572 = class69.method505("M", (byte) -120);

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Lna;")
    public static class26 field580 = class69.method505("Bitte warten Sie)3)3)3", (byte) -121);

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[[[B")
    public static byte[][][] field578;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lna;I)V", line = 11)
    public static final void method297(class26 arg0, int arg1) {
        class28.method228(arg1 ^ 0x5D, false);
        class222.method1485(arg0, arg1 + arg1);
        field574++;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 28)
    public static final void method298(int arg0) {
        if (arg0 < 63) {
            return;
        }
        field573++;
        class127.field1967.method1987(3);
        class67.field1056.method1987(3);
        class94.field1543.method1987(3);
        class307.field5292.method1987(3);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Z", line = 44)
    public static final boolean method299(int arg0, int arg1) {
        int var2 = -11 / ((-arg1 - 29) / 49);
        field579++;
        return arg0 >= 0 && class146.field2228.length > arg0 ? class146.field2228[arg0] : false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Lck;", line = 58)
    public static final class236 method300(boolean arg0, int arg1) {
        field577++;
        class236 var2 = (class236) class307.field5281.method1989((long) arg1, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class314.field5374.method1889(32, (byte) -122, arg1);
        if (arg0) {
            field578 = (byte[][][]) ((byte[][][]) null);
        }
        class236 var4 = new class236();
        if (var3 != null) {
            var4.method1585(-1, new class82(var3));
        }
        var4.method1583(96);
        class307.field5281.method1978((byte) -96, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 83)
    public static final void method301(boolean arg0) {
        if (!arg0) {
            field578 = (byte[][][]) ((byte[][][]) null);
        }
        class151.field2373.method1987(3);
        field582++;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 96)
    public static void method302(int arg0) {
        field580 = null;
        field576 = null;
        field572 = null;
        if (arg0 <= -16) {
            field578 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 125)
    public class35() {
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lna;I)V", line = 127)
    public class35(class26 arg0, int arg1) {
        this.field581 = arg0;
    }
}
