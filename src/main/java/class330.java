import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class330 extends class205 {

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lsn;")
    public class158 field4863;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Ltda;")
    public class338 field4866;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
    public static boolean field4867 = false;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "D")
    public static double field4865;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field4868;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method2127(int arg0, boolean arg1) {
        class542.field7734++;
        field4869++;
        class540 var2 = class257.method1732(true, class183.field3092, class655.field9332);
        class756.method4211(var2, 123);
        class520 var3 = (class520) class36.field340.method3508((byte) -98);
        if (arg0 != -1) {
            field4865 = 0.09495743662691164D;
        }
        while (var3 != null) {
            if (!var3.method637((byte) 115)) {
                var3 = (class520) class36.field340.method3508((byte) -35);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field7515 == 0) {
                class197.method1479(true, var3, arg1, (byte) 37);
            }
            var3 = (class520) class36.field340.method3520(arg0);
        }
        if (class139.field2176 != null) {
            class717.method3960(class139.field2176, (byte) 83);
            class139.field2176 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V", line = 50)
    public static final void method2128(boolean arg0, int arg1) {
        if (!arg0) {
            method2127(53, false);
        }
        field4864++;
        class118 var2 = class86.method755(arg0, 12, arg1);
        var2.method936(0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 63)
    public final void method2129(byte arg0) {
        field4873++;
        this.field4871 = this.field4863.field2454;
        this.field4862 = this.field4863.field2448;
        this.field4868 = this.field4863.field2455;
        if (this.field4863.field2449 != null) {
            this.field4863.field2449.method664(this.field4866.field4932, this.field4866.field4943, this.field4866.field4941, class471.field6841);
        }
        if (arg0 >= -90) {
            method2127(-94, false);
        }
        this.field4870 = class471.field6841[0];
        this.field4861 = class471.field6841[2];
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lsn;Lem;)V", line = 92)
    public class330(class158 arg0, class627 arg1) {
        this.field4863 = arg0;
        this.field4866 = this.field4863.method1179(20416);
        this.method2129((byte) -118);
    }
}
