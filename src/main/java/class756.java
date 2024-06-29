import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class756 {

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Leda;")
    private class14 field10525 = new class14(16);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "Lla;")
    private class422 field10524;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Lwk;")
    public static class430 field10533 = new class430(3, 2);

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "Ltm;")
    public static class334 field10534 = new class334(57, -2);

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field10527;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field10531;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public static int field10532;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public static void method4205(int arg0) {
        if (arg0 != -16517) {
            method4210('b', -55);
        }
        field10533 = null;
        field10534 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)Ltt;")
    public final class490 method4206(byte arg0, int arg1) {
        field10529++;
        class14 var3 = this.field10525;
        class490 var4;
        synchronized (this.field10525) {
            var4 = (class490) this.field10525.method80((byte) -98, (long) arg1);
            int var5 = 56 % ((-arg0 - 7) / 49);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var6 = this.field10524;
        byte[] var7;
        synchronized (this.field10524) {
            var7 = this.field10524.method2624(0, 30, arg1);
        }
        class490 var8 = new class490();
        if (var7 != null) {
            var8.method2975(new class301(var7), 14497);
        }
        class14 var9 = this.field10525;
        synchronized (this.field10525) {
            this.field10525.method67((long) arg1, var8, -6772);
            return var8;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)V")
    public final void method4207(int arg0, byte arg1) {
        class14 var3 = this.field10525;
        synchronized (this.field10525) {
            this.field10525.method68(-16878, arg0);
        }
        field10530++;
        if (arg1 > -117) {
            this.method4208((byte) 43);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
    public final void method4208(byte arg0) {
        field10528++;
        class14 var2 = this.field10525;
        synchronized (this.field10525) {
            if (arg0 != 123) {
                this.field10525 = null;
            }
            this.field10525.method76(arg0 - 16);
        }
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V")
    public final void method4209(byte arg0) {
        int var2 = -45 / ((arg0 - 23) / 53);
        class14 var3 = this.field10525;
        synchronized (this.field10525) {
            this.field10525.method71((byte) 44);
        }
        field10527++;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(CI)Z")
    public static final boolean method4210(char arg0, int arg1) {
        if (arg1 > -84) {
            field10533 = null;
        }
        field10531++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lsr;I)V")
    public static final void method4211(class540 arg0, int arg1) {
        field10526++;
        class702.field9935.method3472(116, arg0);
        arg0.field7711 = arg0.field7707.field4534;
        class97.field1436 += arg0.field7711;
        if (arg1 < 107) {
            method4211(null, 125);
        }
        arg0.field7707.field4534 = 0;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BLofa;)Lji;")
    public static final class80 method4212(byte arg0, class301 arg1) {
        field10532++;
        if (arg0 != -24) {
            field10534 = null;
        }
        class268 var2 = class559.method3245(arg1, arg0 ^ 0x4D);
        int var3 = arg1.method1947((byte) -125);
        return new class80(var2.field4138, var2.field4133, var2.field4141, var2.field4134, var2.field4142, var3);
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lcr;ILla;)V")
    public class756(class292 arg0, int arg1, class422 arg2) {
        this.field10524 = arg2;
        this.field10524.method2615(0, 30);
    }
}
