import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class104 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lsu;")
    public static class192 field1399 = new class192();

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lvh;")
    public static class328 field1403 = new class328(20);

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[B")
    public byte[] field1402;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    public static int[] field1406;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[S")
    public short[] field1400;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[S")
    public short[] field1401;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[S")
    public short[] field1404;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method795(int arg0) {
        field1403 = null;
        if (arg0 == 25044) {
            field1399 = null;
            field1406 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Loa;I)V")
    public static final void method796(class638 arg0, int arg1) {
        field1405++;
        int var2 = -28 / ((11 - arg1) / 57);
        if (class539.field7307.method1276(64) == 0) {
            return;
        }
        if (class429.field6020 == 0) {
            for (class284 var5 = (class284) class539.field7307.method1270((byte) -25); var5 != null; var5 = (class284) class539.field7307.method1282(0)) {
                class648.field9184.method3056(class229.field3276, var5.field3936, var5.field3939, var5.field3938, var5.field3937, var5.field3942 ? class253.field3576.field3989 : null, arg0, var5.field3941, arg0, false, false, false);
                var5.method2971(1);
            }
            class336.method2026(100);
            return;
        }
        if (class531.field7242 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class531.field7242 = class638.method3556(0, (byte) -48, var3, 0, class657.field9259, class139.field1950);
            class556.field7520 = class531.field7242.method405(class205.method1362(22121, 0, class328.field4846, class459.field6499), class543.method2982(class460.field6517, class459.field6499, 0), true);
        }
        for (class284 var4 = (class284) class539.field7307.method1270((byte) -25); var4 != null; var4 = (class284) class539.field7307.method1282(0)) {
            class648.field9184.method3056(class556.field7520, var4.field3936, var4.field3939, var4.field3938, var4.field3937, var4.field3942 ? class253.field3576.field3989 : null, arg0, var4.field3941, class531.field7242, false, false, false);
            var4.method2971(1);
        }
    }
}
