import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class604 {

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lsw;")
    private class641 field8717 = new class641(256);

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Ldn;")
    private class438 field8716;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "Lvj;")
    public static class373 field8718 = new class373(109, 4);

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "Lvj;")
    public static class373 field8723 = new class373(105, 12);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 6)
    public static void method3471(int arg0) {
        if (arg0 > -17) {
            method3475((byte) -55);
        }
        field8723 = null;
        field8718 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZLdi;)Z", line = 18)
    public static final boolean method3472(boolean arg0, class107 arg1) {
        field8720++;
        if (arg1 == null) {
            return false;
        }
        if (arg0) {
            method3472(true, null);
        }
        if (!arg1.field1320) {
            return false;
        } else if (!arg1.method621(arg0, class353.field4594)) {
            return false;
        } else if (class528.field7394.method2645((long) arg1.field1336, (byte) -107) == null) {
            return class69.field660.method2645((long) arg1.field1333, (byte) -102) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V", line = 46)
    public final void method3473(boolean arg0) {
        field8719++;
        if (arg0) {
            class641 var2 = this.field8717;
            synchronized (this.field8717) {
                this.field8717.method3694(0);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)Liba;", line = 59)
    public final class450 method3474(int arg0, int arg1) {
        field8721++;
        class641 var3 = this.field8717;
        class450 var4;
        synchronized (this.field8717) {
            var4 = (class450) this.field8717.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field8716;
        byte[] var6;
        synchronized (this.field8716) {
            var6 = this.field8716.method2558(100, arg1, 26);
        }
        if (arg0 <= 72) {
            field8718 = null;
        }
        class450 var7 = new class450();
        if (var6 != null) {
            var7.method2637((byte) 110, new class374(var6));
        }
        class641 var8 = this.field8717;
        synchronized (this.field8717) {
            this.field8717.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 90)
    public static final void method3475(byte arg0) {
        class60.field588 = null;
        field8722++;
        class367.field4831 = null;
        if (arg0 < 6) {
            method3471(-72);
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)V", line = 102)
    public final void method3476(int arg0, int arg1) {
        if (arg1 != 4) {
            this.field8717 = null;
        }
        field8714++;
        class641 var3 = this.field8717;
        synchronized (this.field8717) {
            this.field8717.method3686((byte) 53, arg0);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 129)
    public class604(class515 arg0, int arg1, class438 arg2) {
        this.field8716 = arg2;
        this.field8716.method2554(26, 126);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 145)
    public final void method3477(int arg0) {
        class641 var2 = this.field8717;
        synchronized (this.field8717) {
            this.field8717.method3687(1402);
        }
        field8715++;
        if (arg0 != 26) {
            field8723 = null;
        }
    }
}
