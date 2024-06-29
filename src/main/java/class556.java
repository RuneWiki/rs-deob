import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class556 {

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "Lvl;")
    private class15 field7497 = new class15();

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "Ljava/lang/String;")
    public String field7495;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field7493 = 2;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "I")
    private volatile int field7501;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "Lwfa;")
    private class211 field7503;

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "Ldga;")
    public static class219 field7502;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "[I")
    public static int[] field7498;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7494;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lwfa;B)V", line = 14)
    public final void method3133(class211 arg0, byte arg1) {
        field7492++;
        if (arg1 >= 57) {
            this.field7503 = arg0;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)Lgk;", line = 25)
    public final class503 method3134(byte arg0) {
        if (arg0 < 50) {
            return null;
        }
        field7496++;
        Object var2 = null;
        class15 var3 = this.field7497;
        synchronized (this.field7497) {
            class503 var4 = this.field7497.method109(0);
            var4.method2922((byte) -113);
            this.field7501--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lwea;B)V", line = 43)
    public final void method3135(class167 arg0, byte arg1) {
        arg0.field2243 = false;
        field7500++;
        class15 var3 = this.field7497;
        synchronized (this.field7497) {
            this.field7497.method106(arg0, (byte) 119);
            this.field7501++;
        }
        if (arg1 != 109) {
            this.field7497 = null;
        }
        if (this.field7503 != null) {
            class211 var4 = this.field7503;
            synchronized (this.field7503) {
                this.field7503.notify();
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lov;I)V", line = 66)
    public final void method3136(class200 arg0, int arg1) {
        field7490++;
        class15 var3 = this.field7497;
        synchronized (this.field7497) {
            this.field7497.method106(arg0, (byte) 119);
            if (arg1 != 22951) {
                this.method3138(-52, null);
            }
            this.field7501++;
        }
        if (this.field7503 != null) {
            class211 var4 = this.field7503;
            synchronized (this.field7503) {
                this.field7503.notify();
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)Z", line = 87)
    public final boolean method3137(int arg0) {
        field7499++;
        if (arg0 != -1) {
            field7498 = null;
        }
        return this.field7501 == 0;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILwea;)V", line = 100)
    public final void method3138(int arg0, class167 arg1) {
        arg1.field2243 = true;
        if (arg0 != -4194) {
            this.method3135(null, (byte) -30);
        }
        field7491++;
        class15 var3 = this.field7497;
        synchronized (this.field7497) {
            this.field7497.method106(arg1, (byte) 119);
            this.field7501++;
        }
        if (this.field7503 != null) {
            class211 var4 = this.field7503;
            synchronized (this.field7503) {
                this.field7503.notify();
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 144)
    public class556(String arg0) {
        this.field7495 = arg0;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)V", line = 132)
    public static void method3139(byte arg0) {
        field7498 = null;
        if (arg0 >= -68) {
            field7493 = 72;
        }
        field7494 = null;
        field7502 = null;
    }
}
