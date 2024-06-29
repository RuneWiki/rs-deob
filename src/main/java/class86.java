import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class86 extends class235 {

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field1514 = 0;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "Lwa;")
    public static class219 field1508 = new class219(16);

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "Lsb;")
    private static class98 field1519 = class47.method368(" is already on your friend list)3", 0);

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "Lsb;")
    public static class98 field1520 = field1519;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "B")
    public byte field1511;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Lac;")
    public static class188 field1517;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "Ltg;")
    public static class75 field1518;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "Lsb;")
    public class98 field1509;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "Lsb;")
    public class98 field1515;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "[[[I")
    public static int[][][] field1512;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
    public static final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class74 var7 = new class74();
        var7.field1246 = arg1 / 128;
        var7.field1269 = arg2 / 128;
        var7.field1262 = arg3 / 128;
        var7.field1253 = arg4 / 128;
        var7.field1251 = arg0;
        var7.field1258 = arg1;
        var7.field1263 = arg2;
        var7.field1249 = arg3;
        var7.field1260 = arg4;
        var7.field1254 = arg5;
        var7.field1261 = arg6;
        class131.field2334[class75.field1327++] = var7;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method638(int arg0) {
        class144.field2536.method491(-1);
        field1510++;
        int var1 = class144.field2536.method483(8, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class144.field2536.method483(8, 2);
        if (var2 == 0) {
            class244.field4240[class104.field1855++] = 2047;
        } else if (var2 == 1) {
            int var3 = class144.field2536.method483(8, 3);
            class163.field2943.method1763(var3, false, (byte) 114);
            int var4 = class144.field2536.method483(8, 1);
            if (var4 == 1) {
                class244.field4240[class104.field1855++] = 2047;
            }
        } else if (arg0 == var2) {
            int var5 = class144.field2536.method483(arg0 + 6, 3);
            class163.field2943.method1763(var5, true, (byte) 120);
            int var6 = class144.field2536.method483(8, 3);
            class163.field2943.method1763(var6, true, (byte) 106);
            int var7 = class144.field2536.method483(8, 1);
            if (var7 == 1) {
                class244.field4240[class104.field1855++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class144.field2536.method483(8, 7);
            class265.field4640 = class144.field2536.method483(8, 2);
            int var9 = class144.field2536.method483(8, 1);
            int var10 = class144.field2536.method483(8, 1);
            if (var10 == 1) {
                class244.field4240[class104.field1855++] = 2047;
            }
            int var11 = class144.field2536.method483(8, 7);
            class163.field2943.method1765(var9 == 1, var11, var8, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1520 = null;
        field1512 = null;
        field1517 = null;
        field1518 = null;
        field1508 = null;
        if (arg0 == 0) {
            field1519 = null;
        }
    }
}
