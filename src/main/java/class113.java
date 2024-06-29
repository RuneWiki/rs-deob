import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class113 extends class362 {

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lkn;")
    public static class737 field1946 = new class737(8, 3);

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Luh;")
    public static class168 field1947 = new class168();

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Lin;")
    public static class91 field1949;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method1000(byte arg0) {
        field1944++;
        if (class693.field9368.field4458.method3022(-32350) == 0 && class534.field7352 != class382.field5551) {
            class432.method2627(class531.field7322, (byte) 123, class59.field1172, 11, false);
            return;
        }
        class410.method2539(class272.field3822, (byte) -121);
        if (arg0 != 33) {
            method1001(-79);
        }
        if (class8.field93 != class382.field5551) {
            class566.method3277((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method1001(int arg0) {
        if (arg0 != -11677) {
            method1000((byte) -80);
        }
        field1946 = null;
        field1949 = null;
        field1947 = null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class113() {
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
    public class113(int arg0) {
        this.field1945 = arg0;
    }
}
