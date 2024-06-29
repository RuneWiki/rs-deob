import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class351 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Leh;")
    private class360 field4966 = new class360();

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/lang/String;")
    public String field4962;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    private volatile int field4971;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lu;")
    private class73 field4972;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Lvfa;", line = 3)
    public final class670 method2263(boolean arg0) {
        field4970++;
        if (!arg0) {
            this.field4966 = null;
        }
        Object var2 = null;
        class360 var3 = this.field4966;
        synchronized (this.field4966) {
            class670 var4 = this.field4966.method2301(-31182);
            var4.method3646((byte) -121);
            this.field4971--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lns;I)V", line = 26)
    public final void method2264(class403 arg0, int arg1) {
        class360 var3 = this.field4966;
        synchronized (this.field4966) {
            this.field4966.method2307(0, arg0);
            this.field4971++;
        }
        field4963++;
        if (arg1 != -20613) {
            this.method2266(null, -5);
        }
        if (this.field4972 != null) {
            class73 var4 = this.field4972;
            synchronized (this.field4972) {
                this.field4972.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)Z", line = 47)
    public static final boolean method2265(int arg0, byte arg1, int arg2) {
        if (arg1 == -44) {
            field4961++;
            return (class461.method2738(arg1 + 144, arg0, arg2) | (arg2 & 0x2000) != 0 | class273.method1778(127, arg0, arg2)) & class398.method2485(arg2, arg0, arg1 + 44);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lkba;I)V", line = 59)
    public final void method2266(class105 arg0, int arg1) {
        field4965++;
        arg0.field1262 = true;
        class360 var3 = this.field4966;
        synchronized (this.field4966) {
            if (arg1 != 8192) {
                return;
            }
            this.field4966.method2307(0, arg0);
            this.field4971++;
        }
        if (this.field4972 != null) {
            class73 var4 = this.field4972;
            synchronized (this.field4972) {
                this.field4972.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Z", line = 85)
    public final boolean method2267(int arg0) {
        field4967++;
        if (arg0 <= 59) {
            return false;
        } else {
            return this.field4971 == 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lu;Z)V", line = 96)
    public final void method2268(class73 arg0, boolean arg1) {
        if (!arg1) {
            this.field4972 = arg0;
            field4960++;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILkba;)V", line = 107)
    public final void method2269(int arg0, class105 arg1) {
        arg1.field1262 = false;
        field4964++;
        if (arg0 != -1) {
            this.field4971 = 13;
        }
        class360 var3 = this.field4966;
        synchronized (this.field4966) {
            this.field4966.method2307(0, arg1);
            this.field4971++;
        }
        if (this.field4972 != null) {
            class73 var4 = this.field4972;
            synchronized (this.field4972) {
                this.field4972.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 137)
    public class351(String arg0) {
        this.field4962 = arg0;
    }
}
