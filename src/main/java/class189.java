import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class189 extends class233 {

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "[I")
    public static int[] field3343 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Loh;")
    public static class258 field3344 = class153.method1046("name_icons", 87);

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "Loh;")
    public static class258 field3345 = class153.method1046("Lade Konfiguration )2 ", 104);

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Loh;")
    public static class258 field3346 = class153.method1046("blinken1:", 122);

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V", line = 6)
    public static final void method1279(byte arg0) {
        while (true) {
            if (class293.field5036.method889(class241.field4184, -13787) >= 27) {
                int var1 = class293.field5036.method881(15, (byte) -124);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class16.field214[var1] == null) {
                        class16.field214[var1] = new class107();
                        var2 = true;
                    }
                    class107 var3 = class16.field214[var1];
                    class92.field1616[class226.field3895++] = var1;
                    var3.field951 = class202.field3498;
                    if (var3.field1906 != null && var3.field1906.method1030(64)) {
                        class42.method337(-1, var3);
                    }
                    int var4 = class293.field5036.method881(5, (byte) -93);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class74.field1295[class293.field5036.method881(3, (byte) -92)];
                    if (var2) {
                        var3.field961 = var3.field923 = var5;
                    }
                    int var6 = class293.field5036.method881(5, (byte) -98);
                    int var7 = class293.field5036.method881(1, (byte) -110);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var3.field1906 = class88.method632(120, class293.field5036.method881(14, (byte) -124));
                    int var8 = class293.field5036.method881(1, (byte) -107);
                    if (var8 == 1) {
                        class225.field3857[class311.field5289++] = var1;
                    }
                    var3.method449(var3.field1906.field2548, (byte) -103);
                    var3.field926 = var3.field1906.field2560;
                    var3.field979 = var3.field1906.field2541;
                    var3.field915 = var3.field1906.field2592;
                    var3.field973 = var3.field1906.field2565;
                    var3.field967 = var3.field1906.field2552;
                    var3.field957 = var3.field1906.field2575;
                    var3.field927 = var3.field1906.field2589;
                    if (var3.field979 == 0) {
                        var3.field923 = 0;
                    }
                    var3.field929 = var3.field1906.field2561;
                    var3.method448((byte) 9, class152.field2606.field975[0] + var4, var7 == 1, var3.method447(18123), class152.field2606.field959[0] + var6);
                    if (var3.field1906.method1030(64)) {
                        class207.method1366(var3.field959[0], class272.field4704, var3.field975[0], 0, var3, (class231) null, (class101) null, 128);
                    }
                    continue;
                }
            }
            if (arg0 > -97) {
                field3343 = (int[]) null;
            }
            field3342++;
            class293.field5036.method879((byte) 27);
            return;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 131)
    public static void method1280(int arg0) {
        field3346 = null;
        field3345 = null;
        if (arg0 != 0) {
            method1279((byte) -10);
        }
        field3343 = null;
        field3344 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIILrk;Lrk;IIIIJ)V", line = 144)
    public static final void method1281(int arg0, int arg1, int arg2, int arg3, class123 arg4, class123 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class263 var12 = new class263();
        var12.field4584 = arg10;
        var12.field4570 = arg1 * 128 + 64;
        var12.field4581 = arg2 * 128 + 64;
        var12.field4574 = arg3;
        var12.field4566 = arg4;
        var12.field4573 = arg5;
        var12.field4571 = arg6;
        var12.field4585 = arg7;
        var12.field4568 = arg8;
        var12.field4579 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class178.field3180[var13][arg1][arg2] == null) {
                class178.field3180[var13][arg1][arg2] = new class228(var13, arg1, arg2);
            }
        }
        class178.field3180[arg0][arg1][arg2].field3939 = var12;
    }
}
