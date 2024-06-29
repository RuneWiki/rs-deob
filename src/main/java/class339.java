import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class339 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lh;")
    private class571 field4572 = new class571(64);

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lan;")
    private class21 field4573;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lfj;")
    public static class564 field4575 = new class564();

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method2057(byte arg0) {
        if (arg0 >= -41) {
            return;
        }
        field4570++;
        if (!class493.field6904) {
            return;
        }
        class114 var1 = class512.method2969(class608.field8768, class103.field1566, (byte) 91);
        if (var1 != null && var1.field1908 != null) {
            class224 var2 = new class224();
            var2.field3207 = var1.field1908;
            var2.field3210 = var1;
            class123.method862(var2);
        }
        class461.field6472 = -1;
        class493.field6904 = false;
        class575.field7926 = -1;
        if (var1 != null) {
            class403.method2407(var1, -9130);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lbn;")
    public final class376 method2058(int arg0, int arg1) {
        field4574++;
        class571 var3 = this.field4572;
        class376 var4;
        synchronized (this.field4572) {
            var4 = (class376) this.field4572.method3252((long) arg0, (byte) -82);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field4573;
        byte[] var6;
        synchronized (this.field4573) {
            var6 = this.field4573.method240(arg1, arg0, (byte) -124);
        }
        class376 var7 = new class376();
        if (var6 != null) {
            var7.method2226(arg1 - 31, new class11(var6));
        }
        class571 var8 = this.field4572;
        synchronized (this.field4572) {
            this.field4572.method3243(var7, (long) arg0, arg1 + 28);
            return var7;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public final void method2059(boolean arg0) {
        class571 var2 = this.field4572;
        synchronized (this.field4572) {
            this.field4572.method3246(arg0);
        }
        field4571++;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static void method2060(byte arg0) {
        if (arg0 == 3) {
            field4575 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class339(class111 arg0, int arg1, class21 arg2) {
        this.field4573 = arg2;
        this.field4573.method231(31, -126);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
    public final void method2061(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field4569++;
        class571 var3 = this.field4572;
        synchronized (this.field4572) {
            this.field4572.method3253(arg0, -123);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
    public final void method2062(byte arg0) {
        field4568++;
        class571 var2 = this.field4572;
        synchronized (this.field4572) {
            if (arg0 == 69) {
                this.field4572.method3248(arg0 ^ 0x45);
            }
        }
    }
}
