import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class255 {

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "[C")
    public static char[] field3795 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field3797;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "[I")
    public static int[] field3794;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILha;I)Lhh;", line = 15)
    public static final class140 method1739(int arg0, class66 arg1, int arg2) {
        field3793++;
        class116 var3 = (class116) class138.field1861.method1248(124, (long) arg2);
        if (var3 != null) {
            class81 var4 = var3.field1570.method2596((byte) -65);
            var3.field1568 = true;
            if (var4 != null) {
                return var4.method648(1, arg1);
            }
        }
        if (arg0 != -129) {
            method1741(11, 72);
        }
        return null;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 40)
    public static void method1740(int arg0) {
        field3794 = null;
        field3795 = null;
        field3797 = null;
        int var1 = 77 % ((arg0 + 19) / 50);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)V", line = 61)
    public static final void method1741(int arg0, int arg1) {
        class159 var2 = class171.field2243.method1249((byte) -119);
        if (arg0 != -32100) {
            method1740(-66);
        }
        while (var2 != null) {
            if ((var2.field2146 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method1102((byte) 106);
            }
            var2 = class171.field2243.method1246(true);
        }
        field3796++;
    }
}
