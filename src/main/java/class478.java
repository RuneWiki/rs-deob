import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class478 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Lof;")
    private class620 field6825 = new class620(64);

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Loh;")
    private class404 field6823;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Lpfa;")
    public static class295 field6827 = new class295(512);

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field6828 = 1400;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V", line = 9)
    public static void method2874(byte arg0) {
        if (arg0 != 127) {
            field6828 = -116;
        }
        field6827 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method2875(int arg0, int arg1, int arg2) {
        if (arg0 != 2048) {
            field6828 = -13;
        }
        field6826++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)Lqga;", line = 33)
    public final class184 method2876(byte arg0, int arg1) {
        field6822++;
        class620 var3 = this.field6825;
        class184 var4;
        synchronized (this.field6825) {
            var4 = (class184) this.field6825.method3538((long) arg1, 0);
            if (arg0 != -54) {
                this.method2876((byte) -19, 30);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field6823;
        byte[] var6;
        synchronized (this.field6823) {
            var6 = this.field6823.method2481(5, arg1, (byte) 116);
        }
        class184 var7 = new class184();
        if (var6 != null) {
            var7.method1142((byte) -102, new class244(var6));
        }
        class620 var8 = this.field6825;
        synchronized (this.field6825) {
            this.field6825.method3537(98, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 67)
    public static final int method2877(String arg0, byte arg1) {
        field6824++;
        int var2 = arg0.length();
        if (arg1 != -17) {
            field6828 = -40;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 98)
    public class478(class301 arg0, int arg1, class404 arg2) {
        this.field6823 = arg2;
        this.field6823.method2482(0, 5);
    }
}
