import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class62 extends class161 {

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "F")
    public float field806;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "F")
    public static float field811;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "[I")
    public static int[] field814;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I", line = 5)
    public static final int method403(int arg0, int arg1, int arg2) {
        if (arg0 != 8897) {
            field807 = -124;
        }
        field817++;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method404(int arg0, byte arg1) {
        int var2 = -114 / ((-arg1 - 15) / 44);
        field813++;
        class211 var3 = class281.method1921(8, arg0, (byte) -105);
        var3.method1489((byte) -100);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 36)
    public static void method405(byte arg0) {
        field814 = null;
        if (arg0 != 24) {
            method404(-68, (byte) -3);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZ)V", line = 60)
    public static final void method406(boolean arg0, int arg1, boolean arg2) {
        field815++;
        if (arg1 == 0) {
            class284.field4547 = class312.method2084(class35.field434, class63.field822, -1, class86.field1073, class418.field6198 * 2, arg1);
        } else {
            if (arg0) {
                class284.field4547 = class312.method2084(class35.field434, class63.field822, -1, class86.field1073, 0, 0);
                class284.field4547.method635(0);
                class325 var3 = class107.method807(class187.field3082, 77, 0, class33.field407);
                class452 var4 = class284.field4547.method612(var3, class100.method750(class223.field3727, class187.field3082, 0), true);
                class136.method996(class330.field5168, true, (byte) -102, var4);
                class284.field4547.method591();
                class403.method2537(-12029);
                class284.field4547.method2091(-15001);
            }
            try {
                class284.field4547 = class312.method2084(class35.field434, class63.field822, -1, class86.field1073, class418.field6198 * 2, arg1);
            } catch (Throwable var7) {
                arg1 = 0;
                class284.field4547 = class312.method2084(class35.field434, class63.field822, -1, class86.field1073, 0, 0);
            }
        }
        if (class284.field4547.method676()) {
            class275 var5 = class284.field4547.method696(134217728);
            class284.field4547.method578(var5);
        }
        class128.field2035 = arg1;
        class288.method1947(87);
        if (!class284.field4547.method615()) {
            class447.field6501 = 1;
        }
        class284.field4547.method636(class447.field6501);
        class284.field4547.method674(0);
        class286.field4594 = class284.field4547.method704();
        class173.field2878 = class284.field4547.method704();
        int var6 = (int) ((double) class80.field1003 * 34.46D);
        if (class284.field4547.method594()) {
            var6 += 128;
        }
        class284.field4547.method582(50, var6);
        class284.field4547.method596(!class311.field4905);
        if (class284.field4547.method710()) {
            class348.method2270(class99.field1381, -61);
        }
        class392.field5881 = !class117.method852(true);
        class133.method976((byte) -123, class284.field4547, class80.field1003 >> 3, class380.field5751 >> 3);
        class410.method2574(-1);
        class444.field6477 = arg2;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZIIIIII)Z", line = 126)
    public static final boolean method407(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg2) {
            return true;
        }
        field816++;
        if (arg5 < arg8 + arg6 && (arg5 + arg0) > arg8) {
            return arg4 + arg7 > arg3 && arg4 < arg3 + arg1;
        } else {
            return false;
        }
    }
}
