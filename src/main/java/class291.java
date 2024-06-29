import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class291 implements Runnable {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[Llj;")
    public volatile class59[] field3771 = new class59[2];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
    public volatile boolean field3773 = false;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    public volatile boolean field3777 = false;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Ldm;")
    public static class368 field3775 = new class368();

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lim;")
    public static class353 field3778 = new class353(62, 0);

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Luv;")
    public static class3 field3779 = new class3(3, -1);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lgaa;")
    public class279 field3774;

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
    public final void run() {
        field3772++;
        this.field3777 = true;
        try {
            while (!this.field3773) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class59 var2 = this.field3771[var1];
                    if (var2 != null) {
                        var2.method339(16384);
                    }
                }
                class353.method2204(10L, 7806);
                class333.method2104(-53, null, this.field3774);
            }
        } catch (Exception var9) {
            class447.method2602(var9, 117, null);
        } finally {
            Object var6 = null;
            this.field3777 = false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1786(int arg0, byte arg1, int arg2) {
        int var3 = 4 % ((arg1 - 60) / 40);
        field3776++;
        return (class310.field3971[1][arg2][arg0] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method1787(boolean arg0) {
        field3779 = null;
        field3775 = null;
        field3778 = null;
        if (arg0) {
            method1787(true);
        }
    }
}
