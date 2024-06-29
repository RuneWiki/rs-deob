import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class209 implements class262 {

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Lwm;")
    private class30 field2876;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "Lib;")
    public class1 field2880;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field2883 = -1;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "Lpu;")
    public class772 field2879;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1034(int arg0) {
        field2875++;
        if (arg0 != -32160) {
            this.method1035(7);
        }
        return this.field2876.method130(-2, this.field2880.field1);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZI)V", line = 19)
    public void method835(boolean arg0, int arg1) {
        field2882++;
        if (arg0) {
            int var3 = this.field2880.field7.method4129(0, class719.field9443, this.field2879.method623()) + this.field2880.field12;
            int var4 = this.field2880.field3.method90(class398.field5240, this.field2879.method628(), 118) + this.field2880.field11;
            this.field2879.method4203(var3, var4);
        }
        if (arg1 != 24726) {
            this.field2876 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBI)Z", line = 40)
    public static final boolean method1403(int arg0, byte arg1, int arg2) {
        field2881++;
        int var3 = 95 % ((arg1 + 27) / 61);
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)V", line = 50)
    public static final void method1404(int arg0, int arg1, int arg2) {
        field2877++;
        class614 var3 = class497.method2759(arg0, arg0 + 5961, (long) arg1);
        var3.method3277(639);
        var3.field7742 = arg2;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V", line = 62)
    public final void method1035(int arg0) {
        this.field2879 = class752.method4085(this.field2876, this.field2880.field1, (byte) 36);
        if (arg0 != 27889) {
            field2883 = -109;
        }
        field2878++;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lwm;Lib;)V", line = 79)
    public class209(class30 arg0, class1 arg1) {
        this.field2876 = arg0;
        this.field2880 = arg1;
    }
}
