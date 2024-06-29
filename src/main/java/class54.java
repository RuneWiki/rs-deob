import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class54 extends class678 {

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "[I")
    public static int[] field1202 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[I")
    public static int[] field1203;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public static void method637(byte arg0) {
        field1202 = null;
        field1203 = null;
        if (arg0 > -110) {
            method638(-79, -115, 18, -20, -68, 19, 22, null, 94, 73, null, 24);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIILsc;IILia;I)V")
    public static final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class320 arg7, int arg8, int arg9, class547 arg10, int arg11) {
        class335.field5013 = arg4;
        class156.field2666 = arg1;
        class706.field9940 = arg5;
        class512.field7233 = null;
        class629.field9076 = arg3;
        field1204++;
        class454.field6479 = arg8;
        class57.field1328 = arg9;
        class288.field4338 = arg6;
        class297.field4448 = arg0;
        class496.field7072 = null;
        class198.field3075 = arg10;
        class318.field4687 = arg7;
        class338.field5043 = null;
        class122.field2223 = arg2;
        class368.method2324(false);
        if (arg11 != 3500) {
            method637((byte) -19);
        }
        class336.field5025 = true;
    }
}
