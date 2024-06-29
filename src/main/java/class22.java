import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HARAZQMH")
public class class22 {

    @OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "Z")
    private boolean field860 = false;

    @OriginalMember(owner = "client!HARAZQMH", name = "d", descriptor = "LIOXDUYYH;")
    private class26 field863 = new class26();

    @OriginalMember(owner = "client!HARAZQMH", name = "h", descriptor = "LABNYIQPF;")
    private class2 field867 = new class2(8);

    @OriginalMember(owner = "client!HARAZQMH", name = "e", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!HARAZQMH", name = "f", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!HARAZQMH", name = "g", descriptor = "LJVZXLCGT;")
    private class33 field866;

    @OriginalMember(owner = "client!HARAZQMH", name = "b", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!HARAZQMH", name = "c", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!HARAZQMH", name = "<init>", descriptor = "(BI)V")
    public class22(byte arg0, int arg1) {
        this.field864 = arg1;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        this.field865 = arg1;
        this.field866 = new class33((byte) 108, 1024);
    }

    @OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "(J)LIOXDUYYH;")
    public class26 method299(long arg0) {
        class26 var3 = (class26) this.field866.method341(arg0);
        if (var3 == null) {
            this.field861++;
        } else {
            this.field867.method2(var3);
            this.field862++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "(BJLIOXDUYYH;)V")
    public void method300(byte arg0, long arg1, class26 arg2) {
        if (arg0 != 24) {
            return;
        }
        if (this.field865 == 0) {
            class26 var5 = this.field867.method3();
            var5.method1();
            var5.method304();
            if (this.field863 == var5) {
                class26 var6 = this.field867.method3();
                var6.method1();
                var6.method304();
            }
        } else {
            this.field865--;
        }
        this.field866.method342(260, arg2, arg1);
        this.field867.method2(arg2);
    }

    @OriginalMember(owner = "client!HARAZQMH", name = "a", descriptor = "()V")
    public void method301() {
        while (true) {
            class26 var1 = this.field867.method3();
            if (var1 == null) {
                this.field865 = this.field864;
                return;
            }
            var1.method1();
            var1.method304();
        }
    }
}
