import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class285 implements Runnable {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "[Ljd;")
    public volatile class156[] field4321 = new class156[2];

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Z")
    public volatile boolean field4330 = false;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "Z")
    public volatile boolean field4323 = false;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[I")
    public static int[] field4325 = new int[3];

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field4328 = 104;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Ltr;")
    public static class195 field4327 = new class195(7, 4);

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "Lod;")
    public class352 field4332;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "[Ll;")
    public static class16[] field4326;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "[Llr;")
    public static class531[] field4333;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1842(int arg0) {
        field4331++;
        class305[] var1 = class153.field2278;
        synchronized (class153.field2278) {
            for (int var2 = arg0; var2 < class153.field2278.length; var2++) {
                class153.field2278[var2] = new class305();
                class116.field1761[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method1843(boolean arg0) {
        field4329++;
        if (arg0) {
            return;
        }
        for (class101 var1 = (class101) class251.field3891.method1004((byte) -113); var1 != null; var1 = (class101) class251.field3891.method996(1)) {
            if (var1.field1439) {
                var1.method809(115);
            }
        }
        for (class101 var2 = (class101) class360.field5347.method1004((byte) -88); var2 != null; var2 = (class101) class360.field5347.method996(1)) {
            if (var2.field1439) {
                var2.method809(120);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V", line = 67)
    public static final void method1844(byte arg0, int arg1) {
        class255.field3909 = new int[arg1];
        class488.field7034 = new int[arg1];
        class520.field7618 = new int[arg1];
        class220.field3617 = new int[arg1];
        class233.field3770 = new int[arg1];
        if (arg0 != 126) {
            field4326 = null;
        }
        field4322++;
    }

    @OriginalMember(owner = "client!fr", name = "run", descriptor = "()V", line = 82)
    public final void run() {
        this.field4323 = true;
        field4324++;
        try {
            while (!this.field4330) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class156 var2 = this.field4321[var1];
                    if (var2 != null) {
                        var2.method1073((byte) 104);
                    }
                }
                class434.method2690(10, 10L);
                class519.method3091(this.field4332, null, (byte) -62);
            }
        } catch (Exception var9) {
            class88.method727(var9, -24, null);
        } finally {
            Object var6 = null;
            this.field4323 = false;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V", line = 116)
    public static void method1845(boolean arg0) {
        field4333 = null;
        field4326 = null;
        if (arg0) {
            field4325 = null;
            field4327 = null;
        }
    }
}
