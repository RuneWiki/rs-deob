import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class373 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lad;")
    private class19 field5076 = new class19(64);

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Ltf;")
    private class701 field5083;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
    public static int[] field5077 = new int[2];

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lib;")
    public static class14 field5080 = new class14(6, 1);

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field5085 = 0;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lcq;")
    public static class110 field5086 = new class110(32, -1);

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Lwu;")
    public final class543 method2168(int arg0, int arg1) {
        field5079++;
        class19 var3 = this.field5076;
        class543 var4;
        synchronized (this.field5076) {
            var4 = (class543) this.field5076.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field5083;
        byte[] var6;
        synchronized (this.field5083) {
            var6 = this.field5083.method3854((byte) 76, 32, arg0);
        }
        class543 var7 = new class543();
        if (var6 != null) {
            var7.method3056(new class115(var6), (byte) -115);
        }
        if (arg1 != 24449) {
            this.method2168(79, 113);
        }
        class19 var8 = this.field5076;
        synchronized (this.field5076) {
            this.field5076.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
    public final void method2169(int arg0, boolean arg1) {
        class19 var3 = this.field5076;
        synchronized (this.field5076) {
            this.field5076.method83((byte) -2, arg0);
        }
        field5081++;
        if (arg1) {
            field5085 = -48;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method2170(int arg0) {
        class19 var2 = this.field5076;
        synchronized (this.field5076) {
            this.field5076.method88(96);
            if (arg0 != 1) {
                method2172((byte) 71);
            }
        }
        field5078++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public final void method2171(boolean arg0) {
        field5082++;
        class19 var2 = this.field5076;
        synchronized (this.field5076) {
            this.field5076.method80((byte) 65);
            if (arg0) {
                this.method2171(false);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class373(class320 arg0, int arg1, class701 arg2) {
        this.field5083 = arg2;
        this.field5083.method3883(32, 0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method2172(byte arg0) {
        field5077 = null;
        if (arg0 <= 90) {
            field5086 = null;
        }
        field5086 = null;
        field5080 = null;
    }
}
