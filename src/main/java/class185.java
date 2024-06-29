import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class185 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2786 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "Lke;")
    public static class622 field2792 = new class622(44, 0);

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lke;")
    public static class622 field2794 = new class622(80, -1);

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "Ldu;")
    public static class373 field2789;

    @OriginalMember(owner = "client!aba", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field2787++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V", line = 13)
    public static void method1375(int arg0) {
        field2786 = null;
        field2789 = null;
        field2794 = null;
        if (arg0 != 2) {
            field2789 = null;
        }
        field2792 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIII)V", line = 28)
    public static final void method1376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class347.field5087[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class347.field5087[var6][arg4] = arg1;
            }
        }
        if (arg0 == -26825) {
            field2790++;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILrv;)V", line = 69)
    public static final void method1377(int arg0, int arg1, class120 arg2) {
        field2793++;
        if (arg1 >= -28) {
            method1376(0, -71, -93, 43, -66);
        }
        if (class421.field5942 == null) {
            return;
        }
        try {
            class421.field5942.method2316(0L, true);
            class421.field5942.method2318(24, arg2.field1556, (byte) 97, arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BII)I", line = 89)
    public final int method1378(byte arg0, int arg1, int arg2) {
        if (arg0 <= 3) {
            field2792 = null;
        }
        field2791++;
        int var4 = arg1 >= class512.field7325 ? arg1 : class512.field7325;
        if (class402.field5694 == this) {
            return 0;
        } else if (class657.field9269 == this) {
            return var4 - arg2;
        } else if (class713.field10051 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)Z", line = 122)
    public static final boolean method1379(int arg0, int arg1) {
        if (arg1 < 91) {
            field2794 = null;
        }
        field2788++;
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }
}
