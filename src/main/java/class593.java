import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class593 {

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lrc;")
    public class504 field7850 = new class504();

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lrc;")
    private class504 field7851;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method3254(byte arg0) {
        if (arg0 != 32) {
            this.method3261((byte) -77);
        }
        field7838++;
        return this.field7850.field6722 == this.field7850;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 16)
    public final void method3255(byte arg0) {
        field7837++;
        if (arg0 >= -70) {
            this.method3258(null, -87);
        }
        while (true) {
            class504 var2 = this.field7850.field6722;
            if (this.field7850 == var2) {
                this.field7851 = null;
                return;
            }
            var2.method2797(112);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lrc;", line = 37)
    public final class504 method3256(int arg0) {
        field7842++;
        class504 var2 = this.field7851;
        int var3 = -39 / ((19 - arg0) / 43);
        if (this.field7850 == var2) {
            this.field7851 = null;
            return null;
        } else {
            this.field7851 = var2.field6723;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Lrc;", line = 58)
    public final class504 method3257(int arg0) {
        if (arg0 > -3) {
            this.field7850 = null;
        }
        field7847++;
        class504 var2 = this.field7850.field6722;
        if (this.field7850 == var2) {
            this.field7851 = null;
            return null;
        } else {
            this.field7851 = var2.field6722;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrc;I)V", line = 79)
    public final void method3258(class504 arg0, int arg1) {
        field7848++;
        if (arg0.field6723 != null) {
            arg0.method2797(102);
        }
        arg0.field6723 = this.field7850;
        arg0.field6722 = this.field7850.field6722;
        arg0.field6723.field6722 = arg0;
        if (arg1 == 0) {
            arg0.field6722.field6723 = arg0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrc;Lgj;B)V", line = 97)
    private final void method3259(class504 arg0, class593 arg1, byte arg2) {
        field7846++;
        class504 var4 = this.field7850.field6723;
        this.field7850.field6723 = arg0.field6723;
        arg0.field6723.field6722 = this.field7850;
        if (arg2 != -94) {
            this.method3266((byte) 79, null);
        }
        if (this.field7850 != arg0) {
            arg0.field6723 = arg1.field7850.field6723;
            arg0.field6723.field6722 = arg0;
            arg1.field7850.field6723 = var4;
            var4.field6722 = arg1.field7850;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)Z", line = 119)
    public static final boolean method3260(byte arg0, int arg1, int arg2) {
        field7843++;
        if (arg0 < 47) {
            return false;
        } else {
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I", line = 140)
    public final int method3261(byte arg0) {
        field7844++;
        int var2 = 0;
        class504 var3 = this.field7850.field6722;
        if (arg0 != -67) {
            return 125;
        }
        while (this.field7850 != var3) {
            var2++;
            var3 = var3.field6722;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lrc;", line = 162)
    public final class504 method3262(int arg0) {
        field7849++;
        class504 var2 = this.field7850.field6722;
        if (arg0 >= -113) {
            method3260((byte) -87, -101, -59);
        }
        if (this.field7850 == var2) {
            return null;
        } else {
            var2.method2797(85);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)Lrc;", line = 180)
    public final class504 method3263(byte arg0) {
        field7841++;
        class504 var2 = this.field7851;
        if (arg0 >= -69) {
            this.field7851 = null;
        }
        if (this.field7850 == var2) {
            this.field7851 = null;
            return null;
        } else {
            this.field7851 = var2.field6722;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)Lrc;", line = 204)
    public final class504 method3264(byte arg0) {
        field7840++;
        class504 var2 = this.field7850.field6723;
        if (this.field7850 == var2) {
            this.field7851 = null;
            return null;
        } else {
            this.field7851 = var2.field6723;
            int var3 = -70 / ((arg0 - 23) / 34);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrc;B)V", line = 225)
    public final void method3265(class504 arg0, byte arg1) {
        field7845++;
        if (arg0.field6723 != null) {
            arg0.method2797(49);
        }
        arg0.field6722 = this.field7850;
        arg0.field6723 = this.field7850.field6723;
        arg0.field6723.field6722 = arg0;
        if (arg1 > -60) {
            this.field7850 = null;
        }
        arg0.field6722.field6723 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLgj;)V", line = 252)
    public final void method3266(byte arg0, class593 arg1) {
        this.method3259(this.field7850.field6722, arg1, (byte) -94);
        if (arg0 >= 78) {
            field7839++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 268)
    public class593() {
        this.field7850.field6723 = this.field7850;
        this.field7850.field6722 = this.field7850;
    }
}
