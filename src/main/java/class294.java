import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class294 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljk;")
    private class449 field3764 = new class449(64);

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ljk;")
    public class449 field3768 = new class449(2);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lqn;")
    private class47 field3765;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lqn;")
    public class47 field3761;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lav;")
    public static class453 field3759;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)Lqs;")
    public final class429 method1723(boolean arg0, int arg1) {
        field3767++;
        class449 var3 = this.field3764;
        class429 var4;
        synchronized (this.field3764) {
            var4 = (class429) this.field3764.method2647(-117, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field3765;
        byte[] var6;
        synchronized (this.field3765) {
            var6 = this.field3765.method481(33, arg1, -63);
            if (arg0) {
                method1726(112);
            }
        }
        class429 var7 = new class429();
        var7.field6089 = this;
        if (var6 != null) {
            var7.method2509(-111, new class463(var6));
        }
        class449 var8 = this.field3764;
        synchronized (this.field3764) {
            this.field3764.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public final void method1724(boolean arg0) {
        field3762++;
        class449 var2 = this.field3764;
        synchronized (this.field3764) {
            this.field3764.method2640(119);
            if (!arg0) {
                this.method1725(-71);
            }
        }
        class449 var3 = this.field3768;
        synchronized (this.field3768) {
            this.field3768.method2640(83);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public final void method1725(int arg0) {
        field3763++;
        class449 var2 = this.field3764;
        synchronized (this.field3764) {
            if (arg0 >= -20) {
                this.method1723(false, 115);
            }
            this.field3764.method2642(0);
        }
        class449 var3 = this.field3768;
        synchronized (this.field3768) {
            this.field3768.method2642(0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method1726(int arg0) {
        if (arg0 == 2) {
            field3759 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
    public final void method1727(byte arg0, int arg1) {
        field3766++;
        class449 var3 = this.field3764;
        synchronized (this.field3764) {
            this.field3764.method2648(false, arg1);
        }
        class449 var4 = this.field3768;
        synchronized (this.field3768) {
            this.field3768.method2648(false, arg1);
        }
        if (arg0 <= 59) {
            this.field3765 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lae;ILqn;Lqn;)V")
    public class294(class165 arg0, int arg1, class47 arg2, class47 arg3) {
        this.field3765 = arg2;
        this.field3761 = arg3;
        this.field3765.method469(30322, 33);
    }
}
