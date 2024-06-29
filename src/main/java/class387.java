import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class387 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lff;")
    private class9 field5433 = new class9(64);

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lff;")
    public class9 field5444 = new class9(30);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lvh;")
    private class240 field5436;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lvh;")
    public class240 field5434;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "La;")
    public static class436 field5435 = new class436(5000);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field5442 = 0;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 3)
    public final void method2225(int arg0) {
        class9 var2 = this.field5433;
        synchronized (this.field5433) {
            int var3 = 94 % ((arg0 + 55) / 43);
            this.field5433.method67(61);
        }
        field5438++;
        class9 var4 = this.field5444;
        synchronized (this.field5444) {
            this.field5444.method67(-95);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 20)
    public final void method2226(int arg0, int arg1) {
        class9 var3 = this.field5433;
        synchronized (this.field5433) {
            this.field5433.method61((byte) -67, arg1);
        }
        field5437++;
        class9 var4 = this.field5444;
        synchronized (this.field5444) {
            if (arg0 != 14453) {
                this.method2226(-50, 104);
            }
            this.field5444.method61((byte) -67, arg1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V", line = 38)
    public final void method2227(int arg0, int arg1) {
        if (arg0 != 614) {
            this.method2228(-121);
        }
        this.field5445 = arg1;
        field5440++;
        class9 var3 = this.field5444;
        synchronized (this.field5444) {
            this.field5444.method67(35);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 57)
    public final void method2228(int arg0) {
        field5441++;
        class9 var2 = this.field5433;
        synchronized (this.field5433) {
            this.field5433.method65(false);
        }
        class9 var3 = this.field5444;
        synchronized (this.field5444) {
            if (arg0 > -116) {
                this.field5444 = null;
            }
            this.field5444.method65(false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 74)
    public static void method2229(int arg0) {
        field5435 = null;
        if (arg0 != -1) {
            method2230(3);
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Z", line = 84)
    public static final boolean method2230(int arg0) {
        field5443++;
        return arg0 == 2674 ? class366.field5141 : false;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)Lcw;", line = 98)
    public final class119 method2231(int arg0, int arg1) {
        field5439++;
        class9 var3 = this.field5433;
        class119 var4;
        synchronized (this.field5433) {
            var4 = (class119) this.field5433.method56((long) arg0, arg1 + 21);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5436.method1411(true, class132.method858(arg0, arg1 + 15538), class335.method1854(arg0, (byte) 7));
        class119 var6 = new class119();
        var6.field1612 = this;
        var6.field1627 = arg0;
        if (var5 != null) {
            var6.method754(10758, new class365(var5));
        }
        class9 var7 = this.field5433;
        synchronized (this.field5433) {
            this.field5433.method73((long) arg0, var6, 26425);
            if (arg1 != 64) {
                field5442 = -127;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Llf;ILvh;Lvh;)V", line = 144)
    public class387(class157 arg0, int arg1, class240 arg2, class240 arg3) {
        this.field5436 = arg2;
        this.field5434 = arg3;
        int var5 = this.field5436.method1410(0) - 1;
        this.field5436.method1397((byte) 96, var5);
    }
}
