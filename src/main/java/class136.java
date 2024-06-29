import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class136 extends OutputStream {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lra;")
    public static class361 field1791 = new class361(43, -1);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lnj;")
    public static class415 field1792 = new class415(20, 16);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILfd;)V", line = 3)
    public static final void method989(int arg0, int arg1, class418 arg2) {
        if (class355.field4593 != null) {
            try {
                class355.field4593.method1563(0L, (byte) 54);
                class355.field4593.method1567(arg2.field5393, arg0, -1, 24);
            } catch (Exception var3) {
            }
        }
        field1788++;
        if (arg1 != 16) {
            field1791 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 24)
    public static final void method990(int arg0) {
        field1790++;
        class218 var1 = null;
        try {
            var1 = class140.method1062(-7585, "2");
            class418 var2 = new class418(class143.field1878 * 6 + 3);
            var2.method2352(true, 1);
            var2.method2386(class143.field1878, 1103587288);
            for (int var3 = 0; var3 < class311.field4040.length; var3++) {
                if (class564.field7369[var3]) {
                    var2.method2386(var3, 1103587288);
                    var2.method2353(class311.field4040[var3], (byte) -56);
                }
            }
            var1.method1393(var2.field5367, var2.field5393, (byte) 109, arg0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method1397(true);
            }
        } catch (Exception var4) {
        }
        class541.field7037 = class584.method3191(1);
        class653.field9086 = false;
    }

    @OriginalMember(owner = "client!bi", name = "write", descriptor = "(I)V", line = 68)
    public final void write(int arg0) throws IOException {
        field1789++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 76)
    public static void method991(int arg0) {
        field1792 = null;
        if (arg0 >= -14) {
            field1791 = null;
        }
        field1791 = null;
    }
}
