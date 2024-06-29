import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class83 {

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Z")
    public boolean field1286 = true;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Llt;")
    public static class475 field1282 = new class475("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1288 = 0;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1289 = -1;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "C")
    private char field1278;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Ljava/lang/String;")
    public String field1283;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLdh;)V")
    public final void method489(byte arg0, class209 arg1) {
        field1281++;
        if (arg0 > -125) {
            this.field1278 = (char) 65409;
        }
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                return;
            }
            this.method490(arg1, -104, var3);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ldh;II)V")
    private final void method490(class209 arg0, int arg1, int arg2) {
        field1277++;
        if (arg2 == 1) {
            this.field1278 = class417.method2501(arg0.method1417(false), (byte) -107);
        } else if (arg2 == 2) {
            this.field1284 = arg0.method1452(65280);
        } else if (arg2 == 4) {
            this.field1286 = false;
        } else if (arg2 == 5) {
            this.field1283 = arg0.method1449(85);
        }
        if (arg1 >= -89) {
            this.method489((byte) 7, null);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Z")
    public final boolean method491(int arg0) {
        field1279++;
        if (arg0 >= -85) {
            return true;
        } else {
            return this.field1278 == 's';
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIILvg;)V")
    public static final void method492(boolean arg0, int arg1, int arg2, class38 arg3) {
        if (arg0) {
            method494(false);
        }
        if (class61.field932) {
            class83 var4 = class515.field7518 == -1 ? null : class381.field5778.method506(true, class515.field7518);
            if (client.method1328(arg3).method2362(1894923638) && (class217.field3177 & 0x20) != 0 && (var4 == null || arg3.method228(var4.field1284, false, class515.field7518) != var4.field1284)) {
                class79.field1189++;
                class496.method2976(false, arg3.field547, 0L, class187.field2779 + " -> " + arg3.field499, class213.field3114, true, class509.field7432, arg3.field535, -112, arg3.field467, 30);
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class269.method1777(var5, (byte) -71, arg3);
                if (var9 != null) {
                    class84.field1293++;
                    class496.method2976(false, arg3.field547, (long) (var5 + 1), arg3.field499, class114.method762(var5, arg3, -1), true, var9, arg3.field535, -124, arg3.field467, 1007);
                }
            }
            String var6 = class487.method2889(3644, arg3);
            if (var6 != null) {
                class94.field1393++;
                class496.method2976(false, arg3.field547, 0L, arg3.field499, arg3.field402, true, var6, arg3.field535, -119, arg3.field467, 51);
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class269.method1777(var7, (byte) -71, arg3);
                if (var8 != null) {
                    class84.field1293++;
                    class496.method2976(false, arg3.field547, (long) (var7 + 1), arg3.field499, class114.method762(var7, arg3, -1), true, var8, arg3.field535, -119, arg3.field467, 15);
                }
            }
            if (client.method1328(arg3).method2365(125)) {
                class377.field5755++;
                if (arg3.field527 == null) {
                    class496.method2976(false, arg3.field547, 0L, "", -1, true, class490.field7236.method2838(arg0, class143.field2137), arg3.field535, -112, arg3.field467, 46);
                } else {
                    class496.method2976(false, arg3.field547, 0L, "", -1, true, arg3.field527, arg3.field535, -127, arg3.field467, 46);
                }
            }
        }
        field1280++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIIII)V")
    public static final void method493(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1287++;
        int var5 = 0;
        int var6 = -40 / ((13 - arg0) / 45);
        while (class446.field6641 > var5) {
            Rectangle var7 = class125.field1885[var5];
            if (arg1 < (var7.x + var7.width) && var7.x < arg1 + arg4 && arg3 < (var7.y + var7.height) && (arg2 + arg3) > var7.y) {
                class315.field4503[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static void method494(boolean arg0) {
        field1282 = null;
        if (arg0) {
            method494(false);
        }
    }
}
