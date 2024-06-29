import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class78 {

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Liv;")
    public static class64 field1307 = new class64(30, 0);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lmq;")
    public static class350 field1310 = null;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lwu;")
    public static class250 field1308 = new class250(0, -1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZI)Lbr;", line = 5)
    public static final class268 method615(int arg0, boolean arg1, int arg2) {
        field1311++;
        class268 var3 = new class268();
        if (arg1) {
            return null;
        }
        var3.field3869 = -1;
        var3.field3856 = arg0 + 6;
        var3.field3852 = arg2 + 5 + 1;
        var3.field3862 = -1;
        var3.field3853 = new int[var3.field3856][var3.field3852];
        var3.method1726(-101);
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V", line = 24)
    public static final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1305++;
        int var6 = class9.method50(class70.field1213, arg2, class389.field5859, true);
        int var7 = class9.method50(class70.field1213, arg1, class389.field5859, true);
        int var8 = class9.method50(class315.field4754, arg5, class156.field2455, true);
        int var9 = class9.method50(class315.field4754, arg3, class156.field2455, true);
        int var10 = var6;
        int var11 = -118 / ((arg4 + 57) / 32);
        while (var10 <= var7) {
            class179.method1269(class21.field430[var10], arg0, var8, var9, 26985);
            var10++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 51)
    public static void method617(int arg0) {
        field1310 = null;
        if (arg0 <= 47) {
            method616(73, 19, 89, 0, -97, 76);
        }
        field1307 = null;
        field1308 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 63)
    public static final void method618(int arg0) {
        class266.method1708();
        if (arg0 != 64) {
            field1308 = null;
        }
        field1309++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BILob;)V", line = 76)
    public static final void method619(byte arg0, int arg1, class517 arg2) {
        field1304++;
        int var3 = -1;
        if (arg0 > -89) {
            field1307 = null;
        }
        int var4 = 0;
        if (class531.field7821 < arg2.field7611) {
            class103.method775((byte) 117, arg2);
        } else if (class531.field7821 > arg2.field7677) {
            class23.method188(arg2, 0, false);
            var3 = class465.field6947;
            var4 = class213.field3073;
        } else {
            class363.method2277(arg2, false);
        }
        if (arg2.field6228 < 128 || arg2.field6233 < 128 || class33.field662 * 128 - 128 <= arg2.field6228 || arg2.field6233 >= (class121.field1966 - 1) * 128) {
            arg2.field7621 = -1;
            arg2.field7677 = 0;
            arg2.field7642 = -1;
            arg2.field7617 = -1;
            var3 = -1;
            arg2.field7611 = 0;
            var4 = 0;
            arg2.field6228 = arg2.field7692[0] * 128 + (arg2.method1654(119) * 64);
            arg2.field6233 = arg2.field7694[0] * 128 + arg2.method1654(104) * 64;
            arg2.method3086((byte) 69);
        }
        if (class139.field2224 == arg2 && (arg2.field6228 < 1536 || arg2.field6233 < 1536 || class33.field662 * 128 - 1536 <= arg2.field6228 || arg2.field6233 >= (class121.field1966 * 128 - 1536))) {
            var3 = -1;
            arg2.field7621 = -1;
            arg2.field7611 = 0;
            arg2.field7642 = -1;
            var4 = 0;
            arg2.field7677 = 0;
            arg2.field7617 = -1;
            arg2.field6228 = arg2.field7692[0] * 128 + arg2.method1654(76) * 64;
            arg2.field6233 = arg2.field7694[0] * 128 + (arg2.method1654(80) * 64);
            arg2.method3086((byte) 69);
        }
        int var5 = class48.method452(arg2, 97);
        class277.method1764(-1, var3, arg2, var5, var4);
        class83.method648(arg2, 98);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZILng;I)V", line = 140)
    public static final void method620(boolean arg0, int arg1, class226 arg2, int arg3) {
        class237.field3431[arg3][arg1] = arg2;
        field1306++;
        if (arg0) {
            method615(13, true, 13);
        }
    }
}
