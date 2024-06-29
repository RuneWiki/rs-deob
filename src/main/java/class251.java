import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class251 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lpia;")
    public static class94 field3028 = new class94(78, 0);

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Ljl;")
    public static class270 field3036 = new class270(128);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lkda;")
    public static class388 field3037;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Loh;")
    public static class404 field3038;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[B")
    public byte[] field3031;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[S")
    public short[] field3030;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[S")
    public short[] field3033;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[S")
    public short[] field3034;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1501(byte arg0) {
        field3028 = null;
        if (arg0 < 62) {
            field3036 = null;
        }
        field3036 = null;
        field3038 = null;
        field3037 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z")
    public static final boolean method1502(int arg0) {
        if (arg0 >= -46) {
            method1501((byte) 89);
        }
        field3032++;
        boolean var1 = true;
        if (class707.field9976 == null) {
            if (class394.field5410.method2463((byte) 115, class620.field8868)) {
                class707.field9976 = class155.method960(class394.field5410, class620.field8868);
            } else {
                var1 = false;
            }
        }
        if (class304.field3797 == null) {
            if (class394.field5410.method2463((byte) 108, class732.field10255)) {
                class304.field3797 = class155.method960(class394.field5410, class732.field10255);
            } else {
                var1 = false;
            }
        }
        if (class512.field7303 == null) {
            if (class394.field5410.method2463((byte) 100, class114.field1199)) {
                class512.field7303 = class155.method960(class394.field5410, class114.field1199);
            } else {
                var1 = false;
            }
        }
        if (class448.field6465 == null) {
            if (class330.field4275.method2463((byte) 114, class167.field1858)) {
                class448.field6465 = class618.method3528(class330.field4275, (byte) 101, class167.field1858);
            } else {
                var1 = false;
            }
        }
        if (class215.field2498 == null) {
            if (class394.field5410.method2463((byte) 103, class167.field1858)) {
                class215.field2498 = class155.method959(class394.field5410, class167.field1858);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static final void method1503(byte arg0) {
        field3035++;
        if (!class568.field8075) {
            return;
        }
        class532 var1 = class689.method3895((byte) 126, class283.field3449, class620.field8886);
        if (var1 != null && var1.field7708 != null) {
            class622 var2 = new class622();
            var2.field8904 = var1.field7708;
            var2.field8908 = var1;
            class133.method859(var2);
        }
        class61.field627 = -1;
        if (arg0 <= 91) {
            return;
        }
        class568.field8075 = false;
        class421.field6093 = -1;
        if (var1 != null) {
            class11.method50(var1, (byte) -122);
        }
    }
}
