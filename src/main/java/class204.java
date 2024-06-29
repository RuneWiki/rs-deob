import java.applet.Applet;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class204 {

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "Lcv;")
    private class631 field2743 = new class631();

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "Ljw;")
    public static class259 field2737 = new class259(14, -1);

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2746 = new String[100];

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "Lcv;")
    private class631 field2745;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "Ljava/applet/Applet;")
    public static Applet field2738;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Lcv;", line = 3)
    public final class631 method1298(byte arg0) {
        field2734++;
        class631 var2 = this.field2743.field8733;
        if (this.field2743 == var2) {
            this.field2745 = null;
            return null;
        }
        if (arg0 != 40) {
            this.method1303(8);
        }
        this.field2745 = var2.field8733;
        return var2;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)I", line = 26)
    public final int method1299(int arg0) {
        field2741++;
        int var2 = 0;
        if (arg0 >= -80) {
            field2740 = -51;
        }
        for (class631 var3 = this.field2743.field8733; var3 != this.field2743; var3 = var3.field8733) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lcv;I)V", line = 49)
    public final void method1300(class631 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field2742++;
        if (arg0.field8734 != null) {
            arg0.method3499(12151);
        }
        arg0.field8733 = this.field2743;
        arg0.field8734 = this.field2743.field8734;
        arg0.field8734.field8733 = arg0;
        arg0.field8733.field8734 = arg0;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)Z", line = 66)
    public final boolean method1301(byte arg0) {
        field2735++;
        int var2 = -120 % ((-arg0 - 40) / 41);
        return this.field2743.field8733 == this.field2743;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V", line = 77)
    public static void method1302(int arg0) {
        field2746 = null;
        if (arg0 == -1) {
            field2738 = null;
            field2737 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Lcv;", line = 89)
    public final class631 method1303(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field2730++;
        class631 var2 = this.field2743.field8733;
        if (this.field2743 == var2) {
            return null;
        } else {
            var2.method3499(arg0 ^ 0x2F77);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)Lcv;", line = 108)
    public final class631 method1304(byte arg0) {
        field2732++;
        if (arg0 != -45) {
            return null;
        }
        class631 var2 = this.field2743.field8734;
        if (this.field2743 == var2) {
            this.field2745 = null;
            return null;
        } else {
            this.field2745 = var2.field8734;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(B)Lcv;", line = 131)
    public final class631 method1305(byte arg0) {
        if (arg0 > -101) {
            field2738 = null;
        }
        field2733++;
        class631 var2 = this.field2745;
        if (this.field2743 == var2) {
            this.field2745 = null;
            return null;
        } else {
            this.field2745 = var2.field8733;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "(B)V", line = 161)
    public final void method1306(byte arg0) {
        while (true) {
            class631 var2 = this.field2743.field8733;
            if (this.field2743 == var2) {
                field2739++;
                this.field2745 = null;
                if (arg0 >= -127) {
                    field2740 = -32;
                    return;
                }
                return;
            }
            var2.method3499(12151);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)I", line = 191)
    public static final int method1307(int arg0, byte arg1) {
        if (arg1 == 33) {
            field2731++;
            return arg0 >> 11 & 0x7F;
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Z", line = 202)
    public static final boolean method1308(boolean arg0) {
        field2736++;
        if (!arg0) {
            method1308(false);
        }
        try {
            return class512.method2901(-54);
        } catch (IOException var4) {
            class284.method1685(0);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class213.field2817 == null ? -1 : class213.field2817.method3079(-115)) + "," + (class315.field4223 == null ? -1 : class315.field4223.method3079(52)) + "," + (class630.field8724 == null ? -1 : class630.field8724.method3079(117)) + " - " + class151.field2070 + "," + (class408.field5369.field3088[0] + class125.field1745) + "," + (class408.field5369.field3086[0] + class4.field23) + " - ";
            for (int var3 = 0; class151.field2070 > var3 && var3 < 50; var3++) {
                var2 = var2 + class289.field3807.field2199[var3] + ",";
            }
            class91.method499(var2, var5, (byte) 117);
            class669.method3801((byte) 123, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V", line = 246)
    public class204() {
        this.field2743.field8733 = this.field2743;
        this.field2743.field8734 = this.field2743;
    }
}
