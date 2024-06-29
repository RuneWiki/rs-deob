import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class562 {

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "Lli;")
    private class392 field7913 = new class392();

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "Ljava/lang/String;")
    public String field7909;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field7912 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    private volatile int field7914;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "Lht;")
    private class538 field7915;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lum;B)V", line = 6)
    public final void method3205(class484 arg0, byte arg1) {
        field7908++;
        class392 var3 = this.field7913;
        synchronized (this.field7913) {
            this.field7913.method2413(arg0, (byte) 118);
            if (arg1 > -8) {
                this.field7914 = -91;
            }
            this.field7914++;
        }
        if (this.field7915 != null) {
            class538 var4 = this.field7915;
            synchronized (this.field7915) {
                this.field7915.notify();
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lrga;I)V", line = 29)
    public final void method3206(class215 arg0, int arg1) {
        field7906++;
        arg0.field3030 = false;
        if (arg1 != -1) {
            this.method3212(-54, null);
        }
        class392 var3 = this.field7913;
        synchronized (this.field7913) {
            this.field7913.method2413(arg0, (byte) 96);
            this.field7914++;
        }
        if (this.field7915 != null) {
            class538 var4 = this.field7915;
            synchronized (this.field7915) {
                this.field7915.notify();
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILht;)V", line = 52)
    public final void method3207(int arg0, class538 arg1) {
        if (arg0 <= 126) {
            this.field7913 = null;
        }
        field7904++;
        this.field7915 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Lqp;", line = 65)
    public final class609 method3208(int arg0) {
        field7905++;
        Object var2 = null;
        class392 var3 = this.field7913;
        synchronized (this.field7913) {
            class609 var4 = this.field7913.method2417(false);
            int var5 = -61 / ((17 - arg0) / 55);
            var4.method3414(0);
            this.field7914--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 82)
    public static void method3209(int arg0) {
        if (arg0 != -1) {
            field7912 = null;
        }
        field7912 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZZ)Z", line = 94)
    public static boolean method3210(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z", line = 105)
    public final boolean method3211(int arg0) {
        field7907++;
        if (arg0 <= 99) {
            this.field7915 = null;
        }
        return this.field7914 == 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILrga;)V", line = 119)
    public final void method3212(int arg0, class215 arg1) {
        arg1.field3030 = true;
        if (arg0 != -1) {
            this.field7914 = 35;
        }
        field7911++;
        class392 var3 = this.field7913;
        synchronized (this.field7913) {
            this.field7913.method2413(arg1, (byte) 115);
            this.field7914++;
        }
        if (this.field7915 != null) {
            class538 var4 = this.field7915;
            synchronized (this.field7915) {
                this.field7915.notify();
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 147)
    public class562(String arg0) {
        this.field7909 = arg0;
    }
}
