import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class77 {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Ljd;")
    public static class85 field1428 = class221.method1499("(U3", (byte) -69);

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Ljd;")
    private static class85 field1432 = class221.method1499("Use", (byte) -43);

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljd;")
    public static class85 field1425 = field1432;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1430 = -1;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[B")
    public byte[] field1421;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[B")
    public byte[] field1433;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
    public static int[] field1434;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method536(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field1429++;
        int var9 = 14 / ((-arg4 - 80) / 44);
        for (int var10 = 0; var10 < class177.field3025.field3862; var10++) {
            int var11 = class177.field3025.field3847[var10] - class21.field303;
            int var12 = class79.field1458 + class196.field3371 - class177.field3025.field3845[var10] - 1;
            int var13 = (var11 - arg0) * (arg3 - arg6) / (arg5 - arg0) + arg6;
            int var14 = (arg2 - arg1) * (var12 - arg7) / (arg8 - arg7) + arg1;
            int var15 = class177.field3025.method1496(var10, 1);
            class62 var16 = null;
            int var17 = 16777215;
            if (var15 == 0) {
                if ((double) class99.field1779 == 3.0D) {
                    var16 = class261.field4618;
                }
                if ((double) class99.field1779 == 4.0D) {
                    var16 = class38.field579;
                }
                if ((double) class99.field1779 == 6.0D) {
                    var16 = class129.field2262;
                }
                if ((double) class99.field1779 == 8.0D) {
                    var16 = class113.field1966;
                }
            }
            if (var15 == 1) {
                if ((double) class99.field1779 == 3.0D) {
                    var16 = class129.field2262;
                }
                if ((double) class99.field1779 == 4.0D) {
                    var16 = class113.field1966;
                }
                if ((double) class99.field1779 == 6.0D) {
                    var16 = class129.field2265;
                }
                if ((double) class99.field1779 == 8.0D) {
                    var16 = class194.field3311;
                }
            }
            if (var15 == 2) {
                if ((double) class99.field1779 == 3.0D) {
                    var16 = class129.field2265;
                }
                if ((double) class99.field1779 == 4.0D) {
                    var16 = class194.field3311;
                }
                if ((double) class99.field1779 == 6.0D) {
                    var16 = class111.field1947;
                }
                var17 = 16755200;
                if ((double) class99.field1779 == 8.0D) {
                    var16 = class253.field4367;
                }
            }
            if (class177.field3025.field3842[var10] != -1) {
                var17 = class177.field3025.field3842[var10];
            }
            if (var16 != null) {
                class85[] var18 = new class85[class177.field3025.field3851[var10].method605(60, (byte) 62) + 1];
                class130.field2280.method77(class177.field3025.field3851[var10], (int[]) null, var18);
                int var19 = var18.length;
                int var20 = var14 - var16.method419() * (var19 - 1) / 2;
                int var21 = var20 + var16.method421() / 2;
                for (int var22 = 0; var22 < var19; var22++) {
                    class85 var23 = var19 - 1 == var22 ? var18[var22] : var18[var22].method636(var18[var22].method586(true) - 4, 0, true);
                    var16.method424(var23, var13, var21, var17, true);
                    var21 += var16.method419();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method537(int arg0) {
        if (arg0 != 2) {
            method536(39, -121, 101, 101, (byte) 38, -63, -65, 4, 82);
        }
        field1434 = null;
        field1428 = null;
        field1432 = null;
        field1425 = null;
    }
}
