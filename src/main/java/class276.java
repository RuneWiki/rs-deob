import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class276 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lmo;")
    private class336 field3986 = new class336(64);

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lmo;")
    private class336 field3993 = new class336(100);

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lnl;")
    private class435 field3992;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3985 = new String[100];

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field3990 = 0;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lnc;")
    public final class135 method1855(int arg0, int arg1) {
        int var3 = -50 / ((-arg0 - 61) / 49);
        field3991++;
        class336 var4 = this.field3993;
        class135 var5;
        synchronized (this.field3993) {
            var5 = (class135) this.field3993.method2113(0, (long) arg1);
            if (var5 == null) {
                var5 = new class135(arg1);
                this.field3993.method2116((long) arg1, (byte) -23, var5);
            }
        }
        synchronized (var5) {
            return var5.method1002(94) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)Lqp;")
    public final class303 method1856(int arg0, int arg1) {
        if (arg0 <= 9) {
            return null;
        }
        field3987++;
        class336 var3 = this.field3986;
        class303 var4;
        synchronized (this.field3986) {
            var4 = (class303) this.field3986.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3992.method2633(class84.method721(86, arg1), class21.method153((byte) 106, arg1), -73);
        class303 var6 = new class303();
        var6.field4288 = arg1;
        var6.field4299 = this;
        if (var5 != null) {
            var6.method1952(new class161(var5), 124);
        }
        var6.method1946(true);
        class336 var7 = this.field3986;
        synchronized (this.field3986) {
            this.field3986.method2116((long) arg1, (byte) -91, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public final void method1857(boolean arg0) {
        field3988++;
        class336 var2 = this.field3986;
        synchronized (this.field3986) {
            this.field3986.method2109(-1);
        }
        class336 var3 = this.field3993;
        synchronized (this.field3993) {
            this.field3993.method2109(-1);
            if (!arg0) {
                field3985 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field3985 = null;
        if (arg0 != 100) {
            field3990 = 52;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)V")
    public final void method1859(boolean arg0) {
        if (arg0) {
            this.method1859(false);
        }
        class336 var2 = this.field3986;
        synchronized (this.field3986) {
            this.field3986.method2119(0);
        }
        field3994++;
        class336 var3 = this.field3993;
        synchronized (this.field3993) {
            this.field3993.method2119(0);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
    public final void method1860(int arg0, byte arg1) {
        class336 var3 = this.field3986;
        synchronized (this.field3986) {
            this.field3986.method2120((byte) -120, arg0);
        }
        if (arg1 != 127) {
            this.field3992 = null;
        }
        field3989++;
        class336 var4 = this.field3993;
        synchronized (this.field3993) {
            this.field3993.method2120((byte) 85, arg0);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Llo;ILnl;Lnl;Lnl;)V")
    public class276(class280 arg0, int arg1, class435 arg2, class435 arg3, class435 arg4) {
        this.field3992 = arg2;
        if (this.field3992 != null) {
            int var6 = this.field3992.method2658(-1) - 1;
            this.field3992.method2638(1, var6);
        }
        class48.method483(arg4, arg3, -1);
    }

    static {
        new class151("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
