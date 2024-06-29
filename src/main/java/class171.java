import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class171 extends class601 {

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Lkca;")
    public static class73 field2103 = new class73(41, 8);

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Lqb;")
    public class191 field2109;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 9)
    public static final void method983(int arg0) {
        field2106++;
        if (arg0 >= -123) {
            return;
        }
        for (int var1 = 0; var1 < class316.field4605.length; var1++) {
            for (int var2 = 0; var2 < class316.field4605[var1].length; var2++) {
                class316.field4605[var1][var2] = class158.field1958;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 39)
    public static void method984(byte arg0) {
        field2103 = null;
        if (arg0 > -89) {
            field2103 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIII)V", line = 49)
    public static final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2105++;
        class360[] var7 = class13.field117;
        for (int var8 = arg2; var8 < var7.length; var8++) {
            class360 var9 = var7[var8];
            if (var9 != null && var9.field5102 == 2) {
                class109.method679(var9.field5101, var9.field5106 * 2, arg2, arg0, arg4 >> 1, var9.field5097, arg5 >> 1, var9.field5096, arg3);
                if (class547.field7831[0] > -1 && class287.field3982 % 20 < 10) {
                    class633.field9109[var9.field5107].method2706(arg6 + class547.field7831[0] - 12, arg1 + -28 - -class547.field7831[1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V", line = 77)
    public static final void method986(byte arg0) {
        field2107++;
        if (class421.field6299 < 0) {
            class212.field2909 = -1;
            class421.field6299 = 0;
            class59.field682 = -1;
        }
        if (arg0 != 31) {
            field2103 = null;
        }
        if (class182.field2261 < class421.field6299) {
            class59.field682 = -1;
            class212.field2909 = -1;
            class421.field6299 = class182.field2261;
        }
        if (class75.field814 < 0) {
            class75.field814 = 0;
            class59.field682 = -1;
            class212.field2909 = -1;
        }
        if (class75.field814 > class182.field2279) {
            class212.field2909 = -1;
            class59.field682 = -1;
            class75.field814 = class182.field2279;
        }
    }
}
