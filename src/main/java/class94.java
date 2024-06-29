import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class94 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public int field1685 = 0;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lke;")
    public static class256 field1693 = class316.method2202("brillant2:", 27626);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lke;")
    public static class256 field1690 = class316.method2202("huffman", 27626);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    public static int[] field1692;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[Lrd;")
    public static class135[] field1686;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIII)V", line = 25)
    public static final void method685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -30 / ((arg7 - 34) / 61);
        field1691++;
        int var10 = arg0 - arg2;
        int var11 = arg3 - arg1;
        int var12 = (arg6 - arg4 << 16) / var10;
        int var13 = (arg5 - arg8 << 16) / var11;
        class261.method1830(0, arg1, arg3, 0, var12, arg8, arg0, arg4, var13, arg2, (byte) -114);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIZBZ)Lng;", line = 43)
    public static final class138 method686(boolean arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        class75 var5 = null;
        field1684++;
        if (class292.field5057 != null) {
            var5 = new class75(arg1, class292.field5057, class75.field1432[arg1], 1000000);
        }
        class234.field4006[arg1] = class244.field4157.method1915(arg1, var5, -1, class231.field3978);
        if (arg0) {
            class234.field4006[arg1].method2106((byte) 122);
        }
        if (arg3 >= -40) {
            method686(false, -14, true, (byte) 83, false);
        }
        return new class138(class234.field4006[arg1], arg2, arg4);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 70)
    public static void method687(byte arg0) {
        field1686 = null;
        field1690 = null;
        if (arg0 != 22) {
            field1693 = (class256) null;
        }
        field1692 = null;
        field1693 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILra;)V", line = 89)
    private final void method688(byte arg0, int arg1, class41 arg2) {
        if (arg1 == 5) {
            this.field1685 = arg2.method346(-16);
        }
        if (arg0 > -11) {
            field1693 = (class256) null;
        }
        field1688++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lra;I)V", line = 109)
    public final void method689(class41 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method357(false);
            if (var3 == 0) {
                if (arg1 != 28256) {
                    field1686 = (class135[]) null;
                }
                field1687++;
                return;
            }
            this.method688((byte) -67, var3, arg0);
        }
    }
}
