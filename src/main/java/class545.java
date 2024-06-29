import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class545 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Ltq;")
    private class536 field6822 = new class536(16);

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lwm;")
    private class30 field6828;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field6826 = -1;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lke;", line = 6)
    public final class376 method2955(int arg0, int arg1) {
        field6827++;
        class536 var3 = this.field6822;
        class376 var4;
        synchronized (this.field6822) {
            var4 = (class376) this.field6822.method2931((long) arg1, (byte) -124);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field6828;
        byte[] var6;
        synchronized (this.field6828) {
            var6 = this.field6828.method139(30, (byte) -94, arg1);
        }
        class376 var7 = new class376();
        if (var6 != null) {
            var7.method2152(true, new class234(var6));
        }
        class536 var8 = this.field6822;
        synchronized (this.field6822) {
            if (arg0 > -95) {
                this.field6828 = null;
            }
            this.field6822.method2918((long) arg1, var7, 99);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 45)
    public final void method2956(boolean arg0) {
        field6829++;
        if (arg0) {
            this.field6828 = null;
        }
        class536 var2 = this.field6822;
        synchronized (this.field6822) {
            this.field6822.method2919(0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 62)
    public final void method2957(int arg0) {
        class536 var2 = this.field6822;
        synchronized (this.field6822) {
            this.field6822.method2932((byte) 80);
            if (arg0 != 16) {
                field6826 = 32;
            }
        }
        field6825++;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lega;ILwm;)V", line = 91)
    public class545(class473 arg0, int arg1, class30 arg2) {
        this.field6828 = arg2;
        this.field6828.method138(0, 30);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V", line = 79)
    public final void method2958(int arg0, int arg1) {
        if (arg1 > -30) {
            return;
        }
        class536 var3 = this.field6822;
        synchronized (this.field6822) {
            this.field6822.method2928(true, arg0);
        }
        field6824++;
    }
}
