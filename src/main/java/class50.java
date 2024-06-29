import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class50 {

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Lfc;")
    private class262 field522 = new class262(64);

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Lni;")
    private class522 field521;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Z")
    public static boolean field530 = true;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "Lhda;")
    public static class750 field525 = new class750(4, 1);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I[BIZ)I", line = 4)
    public static final int method293(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field527++;
        if (arg3) {
            field530 = true;
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class100.field1320[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V", line = 28)
    public final void method294(int arg0) {
        field523++;
        class262 var2 = this.field522;
        synchronized (this.field522) {
            this.field522.method1563(55);
        }
        int var3 = -50 / ((arg0 - 38) / 62);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILsba;)Lsba;", line = 41)
    public static final class218 method295(int arg0, class218 arg1) {
        field520++;
        class218 var2 = client.method1821(arg1);
        if (var2 == null) {
            var2 = arg1.field2677;
        }
        if (arg0 != 4456) {
            method295(54, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)Lkc;", line = 58)
    public final class135 method296(byte arg0, int arg1) {
        if (arg0 != 31) {
            return null;
        }
        field524++;
        class262 var3 = this.field522;
        class135 var4;
        synchronized (this.field522) {
            var4 = (class135) this.field522.method1571(-128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field521;
        byte[] var6;
        synchronized (this.field521) {
            var6 = this.field521.method2885(arg1, 11, false);
        }
        class135 var7 = new class135();
        if (var6 != null) {
            var7.method841(new class611(var6), -1);
        }
        class262 var8 = this.field522;
        synchronized (this.field522) {
            this.field522.method1574((long) arg1, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lni;Lfl;I)V", line = 90)
    public static final void method297(class522 arg0, class739 arg1, int arg2) {
        field526++;
        class583.field8162 = arg1;
        class538.field7305 = "";
        class598.field8331 = arg0;
        if (class37.field385.startsWith("win")) {
            class538.field7305 = class538.field7305 + "windows/";
        } else if (class37.field385.startsWith("linux")) {
            class538.field7305 = class538.field7305 + "linux/";
        } else if (class37.field385.startsWith("mac")) {
            class538.field7305 = class538.field7305 + "macos/";
        }
        if (arg2 != -1) {
            method293(63, null, -15, false);
        }
        if (class583.field8162.field10283) {
            class538.field7305 = class538.field7305 + "msjava/";
        } else if (class37.field376.startsWith("amd64") || class37.field376.startsWith("x86_64")) {
            class538.field7305 = class538.field7305 + "x86_64/";
        } else if (class37.field376.startsWith("i386") || class37.field376.startsWith("i486") || class37.field376.startsWith("i586") || class37.field376.startsWith("x86")) {
            class538.field7305 = class538.field7305 + "x86/";
        } else if (class37.field376.startsWith("ppc")) {
            class538.field7305 = class538.field7305 + "ppc/";
        } else {
            class538.field7305 = class538.field7305 + "universal/";
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V", line = 142)
    public static void method298(int arg0) {
        int var1 = 38 / ((-arg0 - 74) / 39);
        field525 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)V", line = 152)
    public final void method299(int arg0, boolean arg1) {
        if (arg1) {
            field530 = false;
        }
        class262 var3 = this.field522;
        synchronized (this.field522) {
            this.field522.method1569((byte) 62, arg0);
        }
        field529++;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 192)
    public class50(class242 arg0, int arg1, class522 arg2) {
        this.field521 = arg2;
        if (this.field521 != null) {
            this.field521.method2901(0, 11);
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V", line = 180)
    public final void method300(int arg0) {
        field528++;
        class262 var2 = this.field522;
        synchronized (this.field522) {
            if (arg0 == -1) {
                this.field522.method1575((byte) 48);
            }
        }
    }
}
