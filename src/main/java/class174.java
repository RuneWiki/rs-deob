import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class174 {

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "Lcm;")
    private class726 field2701 = new class726();

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "Lej;")
    public static class124 field2700 = new class124(60, 8);

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "Lcm;")
    private class726 field2702;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILcm;)V", line = 8)
    public final void method1298(int arg0, class726 arg1) {
        if (arg1.field9830 != null) {
            arg1.method4018(false);
        }
        field2693++;
        arg1.field9830 = this.field2701.field9830;
        if (arg0 > -81) {
            this.field2702 = null;
        }
        arg1.field9824 = this.field2701;
        arg1.field9830.field9824 = arg1;
        arg1.field9824.field9830 = arg1;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Lcm;", line = 30)
    public final class726 method1299(int arg0) {
        if (arg0 > -103) {
            this.field2702 = null;
        }
        field2697++;
        class726 var2 = this.field2701.field9830;
        if (this.field2701 == var2) {
            this.field2702 = null;
            return null;
        } else {
            this.field2702 = var2.field9830;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Z", line = 52)
    public final boolean method1300(byte arg0) {
        field2692++;
        if (arg0 <= 98) {
            method1308(true);
        }
        return this.field2701.field9824 == this.field2701;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)Lcm;", line = 63)
    public final class726 method1301(int arg0) {
        field2698++;
        class726 var2 = this.field2701.field9824;
        if (arg0 != 8) {
            this.method1307((byte) 126);
        }
        if (this.field2701 == var2) {
            this.field2702 = null;
            return null;
        } else {
            this.field2702 = var2.field9824;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)V", line = 85)
    public static void method1302(byte arg0) {
        if (arg0 > -111) {
            field2700 = null;
        }
        field2700 = null;
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)I", line = 95)
    public final int method1303(int arg0) {
        field2696++;
        int var2 = arg0;
        for (class726 var3 = this.field2701.field9824; var3 != this.field2701; var3 = var3.field9824) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)Lcm;", line = 113)
    public final class726 method1304(int arg0) {
        field2695++;
        class726 var2 = this.field2701.field9824;
        if (this.field2701 == var2) {
            return null;
        }
        var2.method4018(false);
        if (arg0 != 60) {
            this.method1307((byte) 16);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)V", line = 134)
    public final void method1305(byte arg0) {
        if (arg0 != -45) {
            return;
        }
        field2703++;
        while (true) {
            class726 var2 = this.field2701.field9824;
            if (this.field2701 == var2) {
                this.field2702 = null;
                return;
            }
            var2.method4018(false);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lha;I)V", line = 156)
    public static final void method1306(class59 arg0, int arg1) {
        field2699++;
        if (arg1 >= -20) {
            method1306(null, -112);
        }
        for (class385 var2 = (class385) class286.field3996.method1301(8); var2 != null; var2 = (class385) class286.field3996.method1307((byte) 124)) {
            if (var2.field5594) {
                var2.method2422(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(B)Lcm;", line = 178)
    public final class726 method1307(byte arg0) {
        field2694++;
        class726 var2 = this.field2702;
        int var3 = -59 % ((67 - arg0) / 55);
        if (this.field2701 == var2) {
            this.field2702 = null;
            return null;
        } else {
            this.field2702 = var2.field9824;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)V", line = 207)
    public static final void method1308(boolean arg0) {
        if (arg0) {
            class649.field8928 = class135.field2273;
            class683.field9250 = class344.field4822;
        } else {
            class649.field8928 = class690.field9324;
            class683.field9250 = class465.field6517;
        }
        class510.field7094 = class649.field8928.length;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V", line = 229)
    public class174() {
        this.field2701.field9830 = this.field2701;
        this.field2701.field9824 = this.field2701;
    }
}
