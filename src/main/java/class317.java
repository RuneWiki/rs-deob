import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class317 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
    public static boolean field4791 = false;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lkl;")
    public static class68 field4795 = null;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLkl;)V", line = 6)
    public static final void method2183(byte arg0, class68 arg1) {
        if (arg0 == -7) {
            field4796++;
            if (class50.field1011 == arg1.field1344) {
                class337.field5220[arg1.field1385] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILbm;Lbm;)V", line = 25)
    public static final void method2184(int arg0, class307 arg1, class307 arg2) {
        if (arg0 != -27015) {
            field4791 = true;
        }
        field4794++;
        class166.field2679 = arg1;
        class128.field2190 = arg2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lhm;I)V", line = 40)
    public static final void method2185(class109 arg0, int arg1) {
        int var2 = arg0.field1924 - class25.field494;
        field4792++;
        int var3 = arg0.field1915 * 128 + (arg0.method710(-1) * 64);
        int var4 = arg0.field1896 * 128 + arg0.method710(-1) * 64;
        arg0.field1930 = 0;
        arg0.field1872 += (var4 - arg0.field1872) / var2;
        arg0.field1869 += (var3 - arg0.field1869) / var2;
        if (arg0.field1922 == 0) {
            arg0.field1886 = 1024;
        }
        if (arg0.field1922 == 1) {
            arg0.field1886 = 1536;
        }
        if (arg0.field1922 == 2) {
            arg0.field1886 = 0;
        }
        if (arg0.field1922 == 3) {
            arg0.field1886 = 512;
        }
        if (arg1 <= 38) {
            method2184(-111, (class307) null, (class307) null);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 71)
    public static void method2186(boolean arg0) {
        field4795 = null;
        if (!arg0) {
            method2185((class109) null, -51);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V", line = 92)
    public static final void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class164 var10 = (class164) class318.field4798.method424(-54);
        field4793++;
        class164 var11 = null;
        while (var10 != null) {
            if (var10.field2643 == arg5 && var10.field2642 == arg1 && var10.field2648 == arg6 && var10.field2655 == arg2) {
                var11 = var10;
                break;
            }
            var10 = (class164) class318.field4798.method425(-32547);
        }
        if (var11 == null) {
            var11 = new class164();
            var11.field2643 = arg5;
            var11.field2655 = arg2;
            var11.field2642 = arg1;
            var11.field2648 = arg6;
            class183.method1147((byte) 35, var11);
            class318.field4798.method427((byte) -93, var11);
        }
        var11.field2649 = arg3;
        var11.field2653 = arg0;
        var11.field2652 = arg4;
        int var12 = 30 % ((arg7 + 53) / 63);
        var11.field2650 = arg8;
        var11.field2651 = arg9;
    }
}
