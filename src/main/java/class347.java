import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class347 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Ljk;")
    private class449 field4454 = new class449(64);

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Lqn;")
    private class47 field4455;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field4458 = 0;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Lvl;")
    public static class11 field4463;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Lqn;")
    public static class47 field4456;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[I")
    public static int[] field4459;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[I")
    public static int[] field4461;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)Lct;", line = 5)
    public final class98 method1985(boolean arg0, int arg1) {
        field4457++;
        class449 var3 = this.field4454;
        class98 var4;
        synchronized (this.field4454) {
            var4 = (class98) this.field4454.method2647(-128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field4455;
        byte[] var7;
        synchronized (this.field4455) {
            if (!arg0) {
                return null;
            }
            var7 = this.field4455.method481(5, arg1, -109);
        }
        class98 var8 = new class98();
        if (var7 != null) {
            var8.method741(35, new class463(var7));
        }
        class449 var9 = this.field4454;
        synchronized (this.field4454) {
            this.field4454.method2635((long) arg1, -26591, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 47)
    public static void method1986(int arg0) {
        if (arg0 == 3349) {
            field4456 = null;
            field4459 = null;
            field4463 = null;
            field4461 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 72)
    public class347(class165 arg0, int arg1, class47 arg2) {
        this.field4455 = arg2;
        this.field4455.method469(30322, 5);
    }
}
