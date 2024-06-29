import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class58 {

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Ldc;")
    public static class36 field1253 = new class36();

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lqe;")
    public static class179 field1256 = class206.method1380("Willkommen auf RuneScape", (byte) -127);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqe;IILqe;Lqe;I)V")
    public static final void method394(class179 arg0, int arg1, int arg2, class179 arg3, class179 arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class96.field1813[var6] = class96.field1813[var6 - 1];
            class113.field2122[var6] = class113.field2122[var6 - 1];
            class36.field795[var6] = class36.field795[var6 - 1];
            class13.field327[var6] = class13.field327[var6 - 1];
            class10.field291[var6] = class10.field291[var6 - 1];
        }
        class113.field2122[0] = arg4;
        field1246++;
        class36.field795[arg2] = arg0;
        class241.field4424++;
        class190.field3539 = class32.field693;
        class13.field327[0] = arg3;
        class96.field1813[0] = arg1;
        class10.field291[0] = arg5;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    public abstract void method395(int arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method396(int arg0) {
        int var1 = 12 / ((59 - arg0) / 46);
        field1253 = null;
        field1256 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    public abstract void method397(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)V")
    public static final void method398(int arg0, int arg1, byte arg2) {
        field1251++;
        class36 var3 = class108.field2021[class49.field1038][arg1][arg0];
        if (var3 == null) {
            class183.method1188(class49.field1038, arg1, arg0);
            return;
        }
        class133 var4 = null;
        int var5 = -99999999;
        if (arg2 != -60) {
            method398(-16, -51, (byte) -12);
        }
        for (class133 var6 = (class133) var3.method242(16711680); var6 != null; var6 = (class133) var3.method237(arg2 ^ 0xFFFFFFCE)) {
            class15 var13 = class131.method835((byte) -20, var6.field2410.field3075);
            int var14 = var13.field406;
            if (var13.field430 == 1) {
                var14 = (var6.field2410.field3080 + 1) * var14;
            }
            if (var14 > var5) {
                var4 = var6;
                var5 = var14;
            }
        }
        if (var4 == null) {
            class183.method1188(class49.field1038, arg1, arg0);
            return;
        }
        var3.method233(var4, false);
        class133 var7 = (class133) var3.method242(arg2 + 16711740);
        class172 var8 = null;
        class172 var9 = null;
        while (var7 != null) {
            class172 var12 = var7.field2410;
            if (var4.field2410.field3075 != var12.field3075) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field3075 != var12.field3075 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class133) var3.method237(10);
        }
        long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class141.method897(class49.field1038, arg1, arg0, class202.method1341(-128, arg1 * 128 + 64, class49.field1038, arg0 * 128 + 64), var4.field2410, var10, var8, var9);
    }
}
