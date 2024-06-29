import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class633 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public int field8507;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lcu;")
    public static class206 field8511 = new class206(63, 4);

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lst;II[I)V")
    public static final void method3495(class403 arg0, int arg1, int arg2, int[] arg3) {
        if (arg0.field5576 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field5576.length; var5++) {
                if (arg0.field5576[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field5575 != -1) {
                class616 var6 = class636.field8570.method231(arg0.field5575, -11764);
                int var7 = var6.field8162;
                if (var7 == 1) {
                    arg0.field5623 = 0;
                    arg0.field5629 = 0;
                    arg0.field5606 = 1;
                    arg0.field5554 = 0;
                    arg0.field5611 = arg1;
                    class373.method2199(arg0.field8609, arg0.field8620, (byte) 94, arg0.field8612, arg0.field5623, var6, class199.field2897 == arg0);
                }
                if (var7 == 2) {
                    arg0.field5629 = 0;
                }
            }
        }
        field8510++;
        boolean var8 = true;
        int var9 = 0;
        if (arg2 != -1) {
            field8511 = null;
        }
        while (var9 < arg3.length) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg0.field5576 == null || arg0.field5576[var9] == -1 || class636.field8570.method231(arg3[var9], arg2 - 11763).field8155 >= class636.field8570.method231(arg0.field5576[var9], -11764).field8155) {
                arg0.field5576 = arg3;
                arg0.field5611 = arg1;
                break;
            }
            var9++;
        }
        if (var8) {
            arg0.field5576 = arg3;
            arg0.field5611 = arg1;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public static void method3496(byte arg0) {
        if (arg0 < 5) {
            field8511 = null;
        }
        field8511 = null;
    }

    @OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8508++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)I")
    public final int method3497(int arg0) {
        if (arg0 != 0) {
            method3495(null, -34, -56, null);
        }
        field8509++;
        return this.field8507;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class633(String arg0, int arg1) {
        this.field8507 = arg1;
    }
}
