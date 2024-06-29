import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class660 {

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Lvh;")
    private class328 field9276 = new class328(64);

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Lpj;")
    private class132 field9278;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public int field9279;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "[I")
    public static int[] field9273 = new int[25];

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Lpk;")
    public static class180 field9275;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public final void method3647(int arg0) {
        field9269++;
        class328 var2 = this.field9276;
        synchronized (this.field9276) {
            if (arg0 != 0) {
                this.field9279 = 114;
            }
            this.field9276.method1997(1);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static void method3648(byte arg0) {
        if (arg0 <= -26) {
            field9275 = null;
            field9273 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
    public final void method3649(byte arg0) {
        if (arg0 >= -72) {
            return;
        }
        class328 var2 = this.field9276;
        synchronized (this.field9276) {
            this.field9276.method1987(-31085);
        }
        field9271++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
    public final void method3650(int arg0, int arg1) {
        class328 var3 = this.field9276;
        synchronized (this.field9276) {
            this.field9276.method1989(arg1, (byte) 113);
        }
        if (arg0 == 64) {
            field9277++;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)Lfp;")
    public final class293 method3651(int arg0, int arg1) {
        if (arg1 >= -63) {
            field9273 = null;
        }
        field9272++;
        class328 var3 = this.field9276;
        class293 var4;
        synchronized (this.field9276) {
            var4 = (class293) this.field9276.method1986((byte) -108, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field9278;
        byte[] var6;
        synchronized (this.field9278) {
            var6 = this.field9278.method940(16, arg0, 0);
        }
        class293 var7 = new class293();
        if (var6 != null) {
            var7.method1836(new class96(var6), (byte) 121);
        }
        class328 var8 = this.field9276;
        synchronized (this.field9276) {
            this.field9276.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
    public static final void method3652(int arg0, int arg1, int arg2) {
        field9270++;
        if (class569.field7653 == 1) {
            class21.method107(arg0, false, arg1, class466.field6559);
        } else if (class569.field7653 == 2) {
            class340.method2036(arg1, arg0, 22);
        }
        class569.field7653 = 0;
        class466.field6559 = null;
        if (arg2 >= -20) {
            field9275 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)V")
    public static final void method3653(byte arg0) {
        field9274++;
        class586.field8201 = new class345(class9.field91.method42(class666.field9377, 19572), "", class130.field1787, 1002, -1, 0L, 0, 0, true, false);
        if (arg0 > -122) {
            method3652(-47, 117, 105);
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class660(class647 arg0, int arg1, class132 arg2) {
        this.field9278 = arg2;
        if (this.field9278 == null) {
            this.field9279 = 0;
        } else {
            this.field9279 = this.field9278.method936(16, -110);
        }
    }
}
