import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class322 {

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Lhv;")
    private class151 field3993 = new class151();

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "Ljava/lang/String;")
    public String field3991;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
    private volatile int field3995;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "Lkv;")
    private class710 field3994;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)Lmq;", line = 5)
    public final class618 method1868(int arg0) {
        field3985++;
        Object var2 = null;
        class151 var3 = this.field3993;
        synchronized (this.field3993) {
            class618 var4 = this.field3993.method857(arg0 ^ 0xFFFFFF8C);
            var4.method3306(false);
            if (arg0 != 0) {
                this.method1873((byte) -84, null);
            }
            this.field3995--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lkv;I)V", line = 23)
    public final void method1869(class710 arg0, int arg1) {
        this.field3994 = arg0;
        if (arg1 == 12843) {
            field3986++;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Llq;B)V", line = 36)
    public final void method1870(class210 arg0, byte arg1) {
        arg0.field2899 = true;
        field3988++;
        class151 var3 = this.field3993;
        synchronized (this.field3993) {
            this.field3993.method855(0, arg0);
            this.field3995++;
            int var4 = 82 / ((arg1 - 53) / 48);
        }
        if (this.field3994 != null) {
            class710 var5 = this.field3994;
            synchronized (this.field3994) {
                this.field3994.notify();
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Z", line = 67)
    public final boolean method1871(int arg0) {
        if (arg0 != 0) {
            this.method1872(false, null);
        }
        field3992++;
        return this.field3995 == 0;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZLeh;)V", line = 80)
    public final void method1872(boolean arg0, class273 arg1) {
        class151 var3 = this.field3993;
        synchronized (this.field3993) {
            if (arg0) {
                this.field3991 = null;
            }
            this.field3993.method855(0, arg1);
            this.field3995++;
        }
        field3989++;
        if (this.field3994 != null) {
            class710 var4 = this.field3994;
            synchronized (this.field3994) {
                this.field3994.notify();
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 129)
    public class322(String arg0) {
        this.field3991 = arg0;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(BLlq;)V", line = 106)
    public final void method1873(byte arg0, class210 arg1) {
        field3990++;
        arg1.field2899 = false;
        if (arg0 < 73) {
            this.field3993 = null;
        }
        class151 var3 = this.field3993;
        synchronized (this.field3993) {
            this.field3993.method855(0, arg1);
            this.field3995++;
        }
        if (this.field3994 != null) {
            class710 var4 = this.field3994;
            synchronized (this.field3994) {
                this.field3994.notify();
            }
        }
    }
}
