import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class744 implements class716 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lnd;")
    private class547 field10369;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lgq;")
    public class517 field10375;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Z")
    public static boolean field10374 = false;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Liea;")
    public static class481 field10371;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Liea;")
    public class481 field10372;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method4140(boolean arg0) {
        field10371 = null;
        if (arg0) {
            method4140(false);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZB)V")
    public void method368(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = this.field10375.field7249.method735(0, this.field10372.method142(), class482.field6548) + this.field10375.field7250;
            int var4 = this.field10375.field7239.method3397(this.field10372.method149(), class478.field6509, -89) + this.field10375.field7247;
            this.field10372.method2759(var3, var4);
        }
        field10376++;
        if (arg1 > -57) {
            this.method366(13);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public final void method366(int arg0) {
        if (arg0 == 18295) {
            field10373++;
            this.field10372 = class533.method3062(-66, this.field10375.field7242, this.field10369);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        field10370++;
        if (arg0 != 11107) {
            field10374 = false;
        }
        return this.field10369.method3154(this.field10375.field7242, (byte) 98);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lnd;Lgq;)V")
    public class744(class547 arg0, class517 arg1) {
        this.field10369 = arg0;
        this.field10375 = arg1;
    }
}
