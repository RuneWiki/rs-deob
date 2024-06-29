import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class635 {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Lhm;")
    private class208 field8606 = new class208(64);

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lhm;")
    public class208 field8612 = new class208(2);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lpfa;")
    private class275 field8602;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lpfa;")
    public class275 field8603;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Ldr;")
    public static class675 field8604 = new class675(66, -2);

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "F")
    public static float field8611;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 3)
    public final void method3556(int arg0) {
        class208 var2 = this.field8606;
        synchronized (this.field8606) {
            if (arg0 >= 0) {
                return;
            }
            this.field8606.method1218(97);
        }
        field8607++;
        class208 var3 = this.field8612;
        synchronized (this.field8612) {
            this.field8612.method1218(124);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Luk;", line = 19)
    public final class244 method3557(int arg0, int arg1) {
        field8605++;
        class208 var3 = this.field8606;
        class244 var4;
        synchronized (this.field8606) {
            var4 = (class244) this.field8606.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field8602;
        byte[] var6;
        synchronized (this.field8602) {
            var6 = this.field8602.method1659(120, arg0, 33);
        }
        class244 var7 = new class244();
        var7.field3157 = this;
        if (arg1 != 2017) {
            this.method3556(13);
        }
        if (var6 != null) {
            var7.method1464(new class572(var6), (byte) -67);
        }
        class208 var8 = this.field8606;
        synchronized (this.field8606) {
            this.field8606.method1230((byte) 74, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Z", line = 50)
    public static final boolean method3558(int arg0) {
        if (arg0 != -23418) {
            field8604 = null;
        }
        field8610++;
        return class110.field1374;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 65)
    public final void method3559(byte arg0) {
        class208 var2 = this.field8606;
        synchronized (this.field8606) {
            this.field8606.method1224(false);
        }
        field8609++;
        class208 var3 = this.field8612;
        synchronized (this.field8612) {
            this.field8612.method1224(false);
            if (arg0 != -48) {
                method3561(-24);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V", line = 87)
    public final void method3560(byte arg0, int arg1) {
        class208 var3 = this.field8606;
        synchronized (this.field8606) {
            this.field8606.method1222(14564, arg1);
        }
        field8608++;
        if (arg0 != -47) {
            method3561(36);
        }
        class208 var4 = this.field8612;
        synchronized (this.field8612) {
            this.field8612.method1222(14564, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 104)
    public static void method3561(int arg0) {
        field8604 = null;
        if (arg0 != 66) {
            method3558(34);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lbs;ILpfa;Lpfa;)V", line = 126)
    public class635(class643 arg0, int arg1, class275 arg2, class275 arg3) {
        this.field8602 = arg2;
        this.field8603 = arg3;
        this.field8602.method1655(33, (byte) -82);
    }
}
