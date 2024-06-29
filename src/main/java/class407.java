import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class407 {

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lfa;")
    private class156 field6067 = new class156(64);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lfs;")
    private class387 field6066;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lgk;")
    public static class331 field6064 = new class331("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Z")
    public static boolean field6068 = false;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Z")
    public static boolean field6069 = false;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "F")
    public static float field6070;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
    public final void method2496(byte arg0, int arg1) {
        class156 var3 = this.field6067;
        synchronized (this.field6067) {
            if (arg0 != -51) {
                field6070 = 0.2750447F;
            }
            this.field6067.method1116(arg1, -50);
        }
        field6060++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2497(byte arg0, String arg1) {
        class331.method2032(0, 0, arg1, "", "", true);
        if (arg0 != -99) {
            field6064 = null;
        }
        field6062++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public final void method2498(int arg0) {
        if (arg0 > -22) {
            method2500(-71);
        }
        class156 var2 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method1119(91);
        }
        field6063++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lmp;")
    public final class531 method2499(boolean arg0, int arg1) {
        field6065++;
        class156 var3 = this.field6067;
        class531 var4;
        synchronized (this.field6067) {
            var4 = (class531) this.field6067.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            this.method2499(true, 93);
        }
        byte[] var5 = this.field6066.method2363(arg1, 32, 93);
        class531 var6 = new class531();
        if (var5 != null) {
            var6.method3134(65535, new class65(var5));
        }
        class156 var7 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method1107(1, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static void method2500(int arg0) {
        if (arg0 != -25819) {
            field6064 = null;
        }
        field6064 = null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public final void method2501(int arg0) {
        class156 var2 = this.field6067;
        synchronized (this.field6067) {
            if (arg0 > -51) {
                return;
            }
            this.field6067.method1105(false);
        }
        field6061++;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class407(class446 arg0, int arg1, class387 arg2) {
        this.field6066 = arg2;
        this.field6066.method2367(32, 28724);
    }
}
