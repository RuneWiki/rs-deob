import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class236 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Ljt;")
    private class106 field3429 = new class106(64);

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljt;")
    public class106 field3431 = new class106(2);

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lvd;")
    private class39 field3428;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lvd;")
    public class39 field3426;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lqe;")
    public static class469 field3423 = new class469(92, 3);

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lde;")
    public static class533 field3430 = new class533();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient;")
    public static client field3433;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[Lpga;")
    public static class536[] field3432;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lvb;", line = 3)
    public final class196 method1564(int arg0, int arg1) {
        field3424++;
        class106 var3 = this.field3429;
        class196 var4;
        synchronized (this.field3429) {
            var4 = (class196) this.field3429.method803(arg0 + 76, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field3428;
        byte[] var6;
        synchronized (this.field3428) {
            var6 = this.field3428.method211(true, arg0, arg1);
        }
        class196 var7 = new class196();
        var7.field2981 = this;
        if (var6 != null) {
            var7.method1364((byte) 77, new class645(var6));
        }
        class106 var8 = this.field3429;
        synchronized (this.field3429) {
            this.field3429.method801(1, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V", line = 31)
    public final void method1565(byte arg0, int arg1) {
        field3425++;
        class106 var3 = this.field3429;
        synchronized (this.field3429) {
            if (arg0 >= -40) {
                return;
            }
            this.field3429.method807(arg1, -1);
        }
        class106 var4 = this.field3431;
        synchronized (this.field3431) {
            this.field3431.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 53)
    public final void method1566(boolean arg0) {
        class106 var2 = this.field3429;
        synchronized (this.field3429) {
            this.field3429.method809(true);
        }
        field3420++;
        if (!arg0) {
            class106 var3 = this.field3431;
            synchronized (this.field3431) {
                this.field3431.method809(true);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V", line = 69)
    public static final void method1567(int arg0, byte arg1) {
        class348.field5103 = arg0;
        field3421++;
        class106 var2 = class391.field5893;
        synchronized (class391.field5893) {
            class391.field5893.method809(true);
            if (arg1 >= -22) {
                method1567(38, (byte) -22);
            }
        }
        class106 var3 = class671.field9364;
        synchronized (class671.field9364) {
            class671.field9364.method809(true);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 92)
    public static void method1568(byte arg0) {
        field3430 = null;
        field3433 = null;
        field3423 = null;
        field3432 = null;
        if (arg0 >= -25) {
            method1567(-44, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 111)
    public final void method1569(boolean arg0) {
        field3427++;
        class106 var2 = this.field3429;
        synchronized (this.field3429) {
            this.field3429.method800(109);
        }
        class106 var3 = this.field3431;
        synchronized (this.field3431) {
            if (!arg0) {
                this.method1565((byte) 33, 30);
            }
            this.field3431.method800(106);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lqg;ILvd;Lvd;)V", line = 139)
    public class236(class464 arg0, int arg1, class39 arg2, class39 arg3) {
        this.field3428 = arg2;
        this.field3426 = arg3;
        this.field3428.method229(33, 0);
    }
}
