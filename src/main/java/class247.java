import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class247 {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lmq;")
    private class472 field3386 = new class472(64);

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field3388 = 0;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Ljn;")
    private class668 field3384;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Z")
    public static boolean field3383 = true;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lkv;")
    public static class245 field3389;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
    public final void method1498(byte arg0, int arg1) {
        class472 var3 = this.field3386;
        synchronized (this.field3386) {
            this.field3386.method2777(arg1, 49);
        }
        field3392++;
        int var4 = 90 / ((arg0 - 12) / 58);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public final void method1499(byte arg0) {
        class472 var2 = this.field3386;
        synchronized (this.field3386) {
            this.field3386.method2778((byte) 106);
        }
        field3390++;
        int var3 = 38 / ((17 - arg0) / 53);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Lqm;")
    public final class128 method1500(int arg0, byte arg1) {
        field3382++;
        class472 var3 = this.field3386;
        class128 var4;
        synchronized (this.field3386) {
            var4 = (class128) this.field3386.method2766(-127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field3384;
        byte[] var6;
        synchronized (this.field3384) {
            var6 = this.field3384.method3800(arg0, 4, (byte) -92);
        }
        class128 var7 = new class128();
        var7.field1631 = arg0;
        var7.field1628 = this;
        if (var6 != null) {
            var7.method876(new class389(var6), 9200);
        }
        var7.method874(930002824);
        class472 var8 = this.field3386;
        synchronized (this.field3386) {
            if (arg1 == 51) {
                this.field3386.method2772(var7, true, (long) arg0);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ler;ILjn;)V")
    public class247(class90 arg0, int arg1, class668 arg2) {
        this.field3384 = arg2;
        this.field3385 = this.field3384.method3805(4, false);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lwd;Ljn;B)V")
    public static final void method1501(class248 arg0, class668 arg1, byte arg2) {
        class540.field7854 = "";
        class427.field6135 = arg1;
        field3391++;
        if (arg2 <= 29) {
            return;
        }
        class186.field2279 = arg0;
        if (class1.field7.startsWith("win")) {
            class540.field7854 = class540.field7854 + "windows/";
        } else if (class1.field7.startsWith("linux")) {
            class540.field7854 = class540.field7854 + "linux/";
        } else if (class1.field7.startsWith("mac")) {
            class540.field7854 = class540.field7854 + "macos/";
        }
        if (class186.field2279.field3401) {
            class540.field7854 = class540.field7854 + "msjava/";
        } else if (class1.field6.startsWith("amd64") || class1.field6.startsWith("x86_64")) {
            class540.field7854 = class540.field7854 + "x86_64/";
        } else if (class1.field6.startsWith("i386") || class1.field6.startsWith("i486") || class1.field6.startsWith("i586") || class1.field6.startsWith("x86")) {
            class540.field7854 = class540.field7854 + "x86/";
        } else if (class1.field6.startsWith("ppc")) {
            class540.field7854 = class540.field7854 + "ppc/";
        } else {
            class540.field7854 = class540.field7854 + "universal/";
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method1502(int arg0) {
        field3387++;
        class472 var2 = this.field3386;
        synchronized (this.field3386) {
            int var3 = 26 % ((-arg0 - 14) / 54);
            this.field3386.method2776(false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method1503(byte arg0) {
        field3389 = null;
        if (arg0 > -82) {
            method1503((byte) 113);
        }
    }
}
