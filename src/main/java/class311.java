import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class311 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    public static int[] field4465 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "J")
    public static long field4463;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Ljava/lang/String;", line = 3)
    public static final String method1909(int arg0, int arg1) {
        field4466++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class517.field6873.method2877(class713.field9854, (byte) -108) + " (" + var2 + ")</col>";
        } else {
            if (arg1 != 3) {
                field4463 = -43L;
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class517.field6875.method2877(class713.field9854, (byte) -108) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 39)
    public static void method1910(int arg0) {
        if (arg0 != 0) {
            field4465 = null;
        }
        field4465 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I", line = 53)
    public final int method1911(int arg0, int arg1, int arg2) {
        field4464++;
        int var4 = arg2 >= class228.field3251 ? arg2 : class228.field3251;
        if (arg1 != 0) {
            return 63;
        } else if (class211.field3102 == this) {
            return 0;
        } else if (class500.field6725 == this) {
            return var4 - arg0;
        } else if (class13.field201 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "toString", descriptor = "()Ljava/lang/String;", line = 78)
    public final String toString() {
        field4462++;
        throw new IllegalStateException();
    }
}
