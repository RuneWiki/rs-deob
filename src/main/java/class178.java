import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class178 {

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    private int field3296 = 0;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lka;")
    private class157 field3294;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lbb;")
    public static class73 field3297 = new class73();

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lsg;")
    public static class30 field3299 = class167.method1221((byte) 33, "::fps ");

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lsg;")
    public static class30 field3304 = class167.method1221((byte) 33, "document)3cookie=(R");

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lmc;")
    public static class151 field3298;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lu;")
    public static class212 field3302;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lcb;")
    private class236 field3291;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1296(byte arg0, Component arg1) {
        if (arg0 != 42) {
            field3304 = null;
        }
        arg1.removeMouseListener(class74.field1659);
        field3303++;
        arg1.removeMouseMotionListener(class74.field1659);
        arg1.removeFocusListener(class74.field1659);
        class28.field517 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Lcb;")
    public final class236 method1297(byte arg0) {
        field3305++;
        if (this.field3296 > 0 && this.field3294.field2966[this.field3296 - 1] != this.field3291) {
            class236 var2 = this.field3291;
            this.field3291 = var2.field4211;
            return var2;
        }
        while (this.field3294.field2964 > this.field3296) {
            class236 var3 = this.field3294.field2966[this.field3296++].field4211;
            if (this.field3294.field2966[this.field3296 - 1] != var3) {
                this.field3291 = var3.field4211;
                return var3;
            }
        }
        if (arg0 != -14) {
            this.method1302(19);
        }
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lqk;")
    public static final class49 method1298(int arg0, int arg1) {
        class49 var2 = (class49) class138.field2700.method174((long) arg1, (byte) -52);
        field3301++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 24177) {
            field3304 = null;
        }
        byte[] var3 = class273.field4777.method1115(arg1, (byte) -118, 5);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method484(new class8(var3), 87);
        }
        class138.field2700.method169(var4, 123, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Z")
    public static final boolean method1299(byte arg0) {
        field3292++;
        if (arg0 != -124) {
            field3304 = null;
        }
        if (class40.field991) {
            try {
                if ((Boolean) class92.field1863.method294(class190.field3452.field1449, 0)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static void method1300(byte arg0) {
        field3298 = null;
        field3304 = null;
        field3302 = null;
        field3297 = null;
        field3299 = null;
        if (arg0 > -79) {
            method1298(-40, 64);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIJLsg;III)V")
    public static final void method1301(int arg0, int arg1, long arg2, class30 arg3, int arg4, int arg5, int arg6) {
        field3300++;
        class8 var8 = new class8(128);
        var8.method76(5305, 10);
        var8.method97((int) (Math.random() * 99999.0D), (byte) -2);
        var8.method97(519, (byte) -2);
        var8.method72(-1033389592, arg2);
        var8.method57((int) (Math.random() * 9.9999999E7D), 82);
        var8.method85(arg3, (byte) 106);
        var8.method57((int) (Math.random() * 9.9999999E7D), 113);
        var8.method97(class197.field3563, (byte) -2);
        var8.method76(5305, arg4);
        var8.method76(5305, arg1);
        var8.method57((int) (Math.random() * 9.9999999E7D), 91);
        var8.method97(arg6, (byte) -2);
        var8.method97(arg5, (byte) -2);
        var8.method57((int) (Math.random() * 9.9999999E7D), 125);
        var8.method75(class266.field4696, 15955, class88.field1800);
        class196.field3553.field146 = 0;
        class196.field3553.method76(5305, 7);
        class196.field3553.method76(5305, var8.field146);
        class196.field3553.method62(var8.field146, 0, var8.field124, 0);
        class227.field4065 = -3;
        class190.field3456 = 0;
        class119.field2322 = 1;
        class254.field4493 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lka;)V")
    public class178(class157 arg0) {
        this.field3294 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lcb;")
    public final class236 method1302(int arg0) {
        this.field3296 = 0;
        field3293++;
        if (arg0 != -26676) {
            this.method1302(79);
        }
        return this.method1297((byte) -14);
    }
}
