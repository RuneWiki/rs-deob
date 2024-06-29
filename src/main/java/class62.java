import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class62 implements Runnable {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[Lnb;")
    public volatile class331[] field905 = new class331[2];

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Z")
    public volatile boolean field906 = false;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Z")
    public volatile boolean field901 = false;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lwn;")
    public static class30 field908 = new class30();

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[Lbl;")
    public static class327[] field912 = new class327[8];

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field909 = 0;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "[I")
    public static int[] field913 = new int[8];

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lpe;")
    public static class109 field903;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lpk;")
    public static class120 field910;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lbk;")
    public class69 field899;

    @OriginalMember(owner = "client!sj", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        this.field901 = true;
        field900++;
        try {
            while (!this.field906) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class331 var2 = this.field905[var1];
                    if (var2 != null) {
                        var2.method2330(56);
                    }
                }
                class245.method1729(123, 10L);
                class182.method1329(this.field899, 1001, (Object) null);
            }
        } catch (Exception var7) {
            class79.method622((String) null, var7, -652852820);
        } finally {
            this.field901 = false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z[[I)V", line = 40)
    public static final void method498(boolean arg0, int[][] arg1) {
        if (!arg0) {
            class221.field3443 = arg1;
            field907++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 56)
    public static void method499(boolean arg0) {
        field903 = null;
        field908 = null;
        field910 = null;
        field913 = null;
        if (arg0) {
            field912 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZ)V", line = 79)
    public static final void method500(boolean arg0, boolean arg1) {
        field904++;
        class261.method1816(class141.field2281, class95.field1536, class191.field2992, class326.field5091);
        class261.method1809(class311.field4914, class198.field3044, arg1);
        class261.method1813((float) class323.field5059, (float) class151.field2473, (float) class56.field855);
        class261.method1814();
        class240.field3597 = class41.field632;
        class240.field3599 = class241.field3606;
        if (arg0) {
            class240.field3596 = class74.field1143;
            class37.field558 = class204.field3172;
        }
    }
}
