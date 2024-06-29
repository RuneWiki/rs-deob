import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class89 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Le;")
    public static class191 field1448 = class54.method368(")1p", 2047);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lji;")
    public static class225 field1446 = new class225(new byte[5000]);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Le;")
    public static class191 field1450 = class54.method368("(U2", 2047);

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "S")
    public static short field1449 = 1;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public abstract void method536(int arg0, int arg1);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)[B")
    public abstract byte[] method537(int arg0, int arg1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3) {
        class70.field1232 = new class199[arg0][arg1][arg2];
        class65.field1136 = new int[arg0][arg1 + 1][arg2 + 1];
        class181.method1221(false);
        class217.field3821 = arg1;
        class85.field1406 = arg2;
        class30.field426 = new int[arg0][arg1 + 1][arg2 + 1];
        class197.method1387();
        class81.field1368 = arg3;
        class66.field1150 = new boolean[class81.field1368 + class81.field1368 + 1][class81.field1368 + class81.field1368 + 1];
        class162.field2750 = new boolean[class81.field1368 + class81.field1368 + 2][class81.field1368 + class81.field1368 + 2];
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)I")
    public abstract int method539(int arg0, int arg1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Llh;")
    public abstract class188 method540(int arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public static final void method541(int arg0, int arg1, int arg2) {
        field1447++;
        class175 var3 = class75.field1281[class261.field4598][arg1][arg2];
        if (var3 == null) {
            class105.method678(class261.field4598, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class222 var5 = null;
        for (class222 var6 = (class222) var3.method1173(28); var6 != null; var6 = (class222) var3.method1175(-1)) {
            class148 var14 = class100.method623(-1, var6.field3966.field2587);
            int var15 = var14.field2498;
            if (var14.field2521 == 1) {
                var15 = (var6.field3966.field2583 + 1) * var15;
            }
            if (var15 > var4) {
                var4 = var15;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class105.method678(class261.field4598, arg1, arg2);
            return;
        }
        var3.method1170(true, var5);
        class222 var7 = (class222) var3.method1173(26);
        class150 var8 = null;
        class150 var9 = null;
        int var10 = 84 / ((28 - arg0) / 54);
        while (var7 != null) {
            class150 var13 = var7.field3966;
            if (var5.field3966.field2587 != var13.field2587) {
                if (var8 == null) {
                    var8 = var13;
                }
                if (var8.field2587 != var13.field2587 && var9 == null) {
                    var9 = var13;
                }
            }
            var7 = (class222) var3.method1175(-1);
        }
        long var11 = (long) (arg1 + (arg2 << 7) + 1610612736);
        class149.method1014(class261.field4598, arg1, arg2, class222.method1546(class261.field4598, arg1 * 128 + 64, arg2 * 128 + 64, 247425607), var5.field3966, var11, var8, var9);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static void method542(int arg0) {
        field1446 = null;
        field1448 = null;
        field1450 = null;
        if (arg0 != 5000) {
            method541(-71, 59, 2);
        }
    }
}
