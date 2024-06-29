import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class270 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Lws;")
    private class333 field3420;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "Lkd;")
    private class263 field3427;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Lkd;")
    public final class263 method1604(int arg0) {
        field3423++;
        if (arg0 <= 53) {
            return null;
        }
        class263 var2 = this.field3427;
        if (this.field3420.field4121 == var2) {
            this.field3427 = null;
            return null;
        } else {
            this.field3427 = var2.field3320;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)V")
    public static final void method1605(int arg0, int arg1, int arg2, int arg3) {
        field3422++;
        if (arg1 != 1) {
            field3419 = -98;
        }
        class243 var4 = class546.method2926(arg3, 11, true);
        var4.method1457(19);
        var4.field3135 = arg0;
        var4.field3132 = arg2;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)I")
    public static final int method1606(int arg0, int arg1, int arg2) {
        field3424++;
        if (arg1 == 1 || arg1 == 3) {
            return class192.field2273[arg2 & 0x3];
        } else {
            if (arg0 != 3) {
                method1605(-41, 28, -3, -123);
            }
            return class40.field579[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lws;B)V")
    public final void method1607(class333 arg0, byte arg1) {
        this.field3420 = arg0;
        if (arg1 != 121) {
            method1606(-50, -68, -16);
        }
        field3425++;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Lkd;")
    public final class263 method1608(int arg0) {
        field3426++;
        class263 var2 = this.field3420.field4121.field3320;
        if (this.field3420.field4121 == var2) {
            this.field3427 = null;
            return null;
        }
        this.field3427 = var2.field3320;
        if (arg0 != 3) {
            this.field3420 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
    public class270() {
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lws;)V")
    public class270(class333 arg0) {
        this.field3420 = arg0;
    }
}
