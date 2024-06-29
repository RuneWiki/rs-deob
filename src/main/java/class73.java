import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class73 extends class101 {

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lnd;")
    public static class127 field1367 = new class127(30);

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Ltg;")
    public static class184 field1368 = class135.method812("Registrierter Benutzer", 3);

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "[I")
    public static int[] field1369 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field1371 = -1;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Ltg;")
    public static class184 field1372 = class135.method812("Ung-Ultiges Anmelde)2Paket)3", 3);

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Ltg;")
    public static class184 field1374 = class135.method812("Fertigkeit)2", 3);

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field1370 = 0;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Ltg;")
    public class184 field1357;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "[I")
    public int[] field1360;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "[I")
    public int[] field1365;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "[Ltg;")
    public class184[] field1364;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILvb;II)Loe;")
    public static final class137 method426(int arg0, class197 arg1, int arg2, int arg3) {
        field1362++;
        if (arg2 != 1) {
            method431(23);
        }
        return class94.method542(arg1, 37, arg0, arg3) ? class82.method460(false) : null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIII)I")
    public static final int method427(byte arg0, int arg1, int arg2, int arg3) {
        field1366++;
        int var4 = arg1 / arg3;
        if (arg0 < 45) {
            return 37;
        }
        int var5 = arg1 & arg3 - 1;
        int var6 = arg2 & arg3 - 1;
        int var7 = arg2 / arg3;
        int var8 = class112.method693(true, var4, var7);
        int var9 = class112.method693(true, var4 + 1, var7);
        int var10 = class112.method693(true, var4, var7 + 1);
        int var11 = class112.method693(true, var4 + 1, var7 + 1);
        int var12 = class109.method677(var5, var8, var9, arg3, -40021268);
        int var13 = class109.method677(var5, var10, var11, arg3, -40021268);
        return class109.method677(var6, var12, var13, arg3, -40021268);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lvb;ILvb;)I")
    public static final int method428(class197 arg0, int arg1, class197 arg2) {
        field1363++;
        if (arg1 != 634) {
            field1368 = null;
        }
        int var3 = 0;
        if (arg2.method1271(class69.field1321, -6039)) {
            var3++;
        }
        if (arg0.method1271(class14.field261, -6039)) {
            var3++;
        }
        if (arg0.method1271(class120.field2158, -6039)) {
            var3++;
        }
        if (arg0.method1271(class19.field359, -6039)) {
            var3++;
        }
        if (arg0.method1271(class34.field594, -6039)) {
            var3++;
        }
        if (arg0.method1271(class138.field2501, arg1 - 6673)) {
            var3++;
        }
        arg0.method1271(class36.field683, -6039);
        arg0.method1271(class82.field1470, -6039);
        arg0.method1271(class18.field332, -6039);
        arg0.method1271(class97.field1783, arg1 - 6673);
        arg0.method1271(class182.field3509, -6039);
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIILfb;IJIIII)Z")
    public static final boolean method429(int arg0, int arg1, int arg2, int arg3, class52 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class138.method856(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static final void method430(int arg0) {
        field1375++;
        class182 var1 = (class182) class51.field936.method404(false);
        if (arg0 > -77) {
            return;
        }
        while (var1 != null) {
            if (class47.field892 != var1.field3506 || var1.field3498) {
                var1.method797((byte) -124);
            } else if (var1.field3508 <= class161.field2903) {
                var1.method1128(true, class170.field3231);
                if (var1.field3498) {
                    var1.method797((byte) -104);
                } else {
                    class125.method760(var1.field3506, var1.field3494, var1.field3501, var1.field3512, 60, var1, 0, -1L, false);
                }
            }
            var1 = (class182) class51.field936.method414(-128);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static void method431(int arg0) {
        field1368 = null;
        field1372 = null;
        field1374 = null;
        if (arg0 != 1) {
            field1367 = null;
        }
        field1367 = null;
        field1369 = null;
    }
}
