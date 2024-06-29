import java.awt.Image;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class328 {

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Lpw;")
    private class649 field4858;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    private int field4860;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    private int field4845;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Loj;")
    private class346 field4849;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lpj;")
    public static class132 field4846;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field4851;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I", line = 3)
    public final int method1983(int arg0) {
        if (arg0 == 40000) {
            field4856++;
            return this.field4860;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)V", line = 17)
    private final void method1984(long arg0, int arg1) {
        if (arg1 == 0) {
            field4847++;
            class482 var4 = (class482) this.field4849.method2061(-17305, arg0);
            this.method1995((byte) 123, var4);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 30)
    public final void method1985(Object arg0, long arg1, byte arg2) {
        if (arg2 != -102) {
            this.method1992(-127);
        }
        field4853++;
        this.method1999((byte) 28, 1, arg1, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 45)
    public final Object method1986(byte arg0, long arg1) {
        field4852++;
        class482 var4 = (class482) this.field4849.method2061(-17305, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2244((byte) 118);
        if (arg0 > -86) {
            field4846 = null;
        }
        if (var5 == null) {
            var4.method2971(1);
            var4.method3691((byte) -119);
            this.field4845 += var4.field6708;
            return null;
        }
        if (var4.method2245((byte) -28)) {
            class622 var6 = new class622(var5, var4.field6708);
            this.field4849.method2063(var4.field7311, 1, var6);
            this.field4858.method3615(-31531, var6);
            var6.field9371 = 0L;
            var4.method2971(1);
            var4.method3691((byte) -119);
        } else {
            this.field4858.method3615(-31531, var4);
            var4.field9371 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 89)
    public final void method1987(int arg0) {
        if (arg0 != -31085) {
            field4846 = null;
        }
        for (class482 var2 = (class482) this.field4858.method3611(255); var2 != null; var2 = (class482) this.field4858.method3610(-30295)) {
            if (var2.method2245((byte) -28)) {
                var2.method2971(1);
                var2.method3691((byte) -119);
                this.field4845 += var2.field6708;
            }
        }
        field4840++;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)I", line = 114)
    public final int method1988(int arg0) {
        if (arg0 != -8662) {
            this.method1990(34);
        }
        field4857++;
        return this.field4845;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)V", line = 128)
    public final void method1989(int arg0, byte arg1) {
        if (arg1 <= 80) {
            return;
        }
        field4850++;
        if (class561.field7574 == null) {
            return;
        }
        for (class482 var3 = (class482) this.field4858.method3611(255); var3 != null; var3 = (class482) this.field4858.method3610(-30295)) {
            if (var3.method2245((byte) -28)) {
                if (var3.method2244((byte) 88) == null) {
                    var3.method2971(1);
                    var3.method3691((byte) -119);
                    this.field4845++;
                }
            } else if (++var3.field9371 > (long) arg0) {
                class482 var4 = class561.field7574.method20(118, var3);
                this.field4849.method2063(var3.field7311, 1, var4);
                class545.method3000(5, var4, var3);
                var3.method2971(1);
                var3.method3691((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 177)
    public final Object method1990(int arg0) {
        if (arg0 != 1) {
            this.field4849 = null;
        }
        field4841++;
        class482 var2 = (class482) this.field4849.method2066(false);
        while (var2 != null) {
            Object var3 = var2.method2244((byte) 109);
            if (var3 != null) {
                return var3;
            }
            class482 var4 = var2;
            var2 = (class482) this.field4849.method2062(-19704);
            var4.method2971(arg0);
            var4.method3691((byte) -119);
            this.field4845 += var4.field6708;
        }
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 211)
    public static void method1991(byte arg0) {
        field4851 = null;
        field4846 = null;
        if (arg0 != -101) {
            field4846 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I", line = 222)
    public final int method1992(int arg0) {
        field4844++;
        int var2 = 0;
        if (arg0 > -83) {
            field4846 = null;
        }
        for (class482 var3 = (class482) this.field4858.method3611(255); var3 != null; var3 = (class482) this.field4858.method3610(-30295)) {
            if (!var3.method2245((byte) -28)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V", line = 247)
    public static final void method1993(byte arg0) {
        if (arg0 != -10) {
            field4851 = null;
        }
        field4848++;
        int var1 = 0;
        if (class274.field3872 != null) {
            var1 = class274.field3872.method2435(true, class429.field6020);
        }
        if (var1 == 2) {
            int var4 = class43.field650 <= 800 ? class43.field650 : 800;
            int var5 = class693.field9716 <= 600 ? class693.field9716 : 600;
            class547.field7412 = var4;
            class486.field6753 = (class43.field650 - var4) / 2;
            class124.field1711 = var5;
            class508.field6968 = 0;
        } else if (var1 == 1) {
            int var2 = class43.field650 <= 1024 ? class43.field650 : 1024;
            class486.field6753 = (class43.field650 - var2) / 2;
            class547.field7412 = var2;
            int var3 = class693.field9716 > 768 ? 768 : class693.field9716;
            class508.field6968 = 0;
            class124.field1711 = var3;
        } else {
            class124.field1711 = class693.field9716;
            class508.field6968 = 0;
            class547.field7412 = class43.field650;
            class486.field6753 = 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V", line = 295)
    public class328(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BILjava/lang/String;)Z", line = 299)
    public static final boolean method1994(byte arg0, int arg1, String arg2) {
        if (arg0 != -104) {
            return false;
        }
        field4843++;
        if (class503.field6878.field1084) {
            class195.field2887 = new class397();
            class195.field2887.field5516 = arg2;
            class195.field2887.field5522 = arg1;
            if (class500.field6862 != class112.field1530) {
                class195.field2887.field5515 = class195.field2887.field5522 + 50000;
                class195.field2887.field5521 = class195.field2887.field5522 + 40000;
            }
            if (class182.field2690.length > arg1 && class182.field2690[arg1] != null) {
                class677.field9552 = class182.field2690[arg1].field1952;
            }
            return true;
        }
        String var3 = "";
        if (class500.field6862 != class112.field1530) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class240.field3454 != null) {
            var4 = "/p=" + class240.field3454;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class666.field9377 + "/a=" + class287.field3995 + var4 + "/j" + (class413.field5848 ? "1" : "0") + ",o" + (class80.field1106 ? "1" : "0") + ",a2";
        try {
            class258.field3685.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLum;)V", line = 348)
    private final void method1995(byte arg0, class482 arg1) {
        if (arg1 != null) {
            arg1.method2971(1);
            arg1.method3691((byte) -119);
            this.field4845 += arg1.field6708;
        }
        int var3 = -69 % ((arg0 - 6) / 61);
        field4842++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjr;)Leca;", line = 369)
    public static final class694 method1996(int arg0, class96 arg1) {
        arg1.method718(arg0 ^ 0x4CCE);
        field4839++;
        int var2 = arg1.method718(arg0 ^ 0x4CE9);
        class694 var3 = class645.method3594(var2, (byte) 82);
        var3.field9738 = arg1.method718(98);
        int var4 = arg1.method718(-77);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method718(arg0 + 19741);
            var3.method19(var6, arg1, (byte) 127);
        }
        if (arg0 != -19644) {
            field4846 = null;
        }
        var3.method40(22);
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V", line = 405)
    public final void method1997(int arg0) {
        if (arg0 != 1) {
            this.method1997(-57);
        }
        field4859++;
        this.field4858.method3616(-129);
        this.field4849.method2060(0);
        this.field4845 = this.field4860;
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 418)
    public final Object method1998(int arg0) {
        field4854++;
        class482 var2 = (class482) this.field4849.method2062(-19704);
        while (var2 != null) {
            Object var3 = var2.method2244((byte) 86);
            if (var3 != null) {
                return var3;
            }
            class482 var4 = var2;
            var2 = (class482) this.field4849.method2062(arg0 ^ 0xFFFFB309);
            var4.method2971(1);
            var4.method3691((byte) -119);
            this.field4845 += var4.field6708;
        }
        return arg0 == 1 ? null : null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIJLjava/lang/Object;)V", line = 450)
    public final void method1999(byte arg0, int arg1, long arg2, Object arg3) {
        field4855++;
        if (this.field4860 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method1984(arg2, 0);
        this.field4845 -= arg1;
        while (this.field4845 < 0) {
            class482 var8 = (class482) this.field4858.method3613(-127);
            this.method1995((byte) -101, var8);
        }
        int var6 = -86 / ((arg0 - 75) / 35);
        class622 var7 = new class622(arg3, arg1);
        this.field4849.method2063(arg2, 1, var7);
        this.field4858.method3615(-31531, var7);
        var7.field9371 = 0L;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V", line = 483)
    private class328(int arg0, int arg1) {
        this.field4858 = new class649();
        this.field4860 = arg0;
        this.field4845 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field4849 = new class346(var3);
    }
}
