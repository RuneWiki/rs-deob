import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class99 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "La;")
    public static class1 field2432 = class113.method934(-11538, "An");

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static volatile int field2433 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "La;")
    public static class1 field2429 = class113.method934(-11538, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lcb;")
    public static class15 field2431 = new class15(30);

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "La;")
    public static class1 field2435 = class113.method934(-11538, "Empf-=nger:");

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "La;")
    public static class1 field2439 = class113.method934(-11538, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "La;")
    public static class1 field2441 = class113.method934(-11538, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "La;")
    private static class1 field2442 = class113.method934(-11538, "Loading ignore list");

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "La;")
    public static class1 field2434 = field2442;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lbd;")
    public static class11 field2436;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lb;")
    public static class7 field2438;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 0;
        int var10 = 2048 - arg0 & 0x7FF;
        field2430++;
        int var11 = arg6;
        if (~var10 != arg5) {
            int var12 = class91.field2261[var10];
            int var13 = class91.field2259[var10];
            int var14 = var9 * var12 - arg6 * var13 >> 16;
            var11 = var9 * var13 + arg6 * var12 >> 16;
            var9 = var14;
        }
        if (var8 != 0) {
            int var15 = class91.field2261[var8];
            int var16 = class91.field2259[var8];
            int var17 = var7 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var7 * var16 >> 16;
            var7 = var17;
        }
        class4.field185 = arg3;
        class70.field1751 = arg2 - var9;
        class23.field710 = arg1 - var7;
        class53.field1403 = arg0;
        class46.field1202 = arg4 - var11;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 74)
    public static void method852(int arg0) {
        field2439 = null;
        field2431 = null;
        field2438 = null;
        field2441 = null;
        field2435 = null;
        if (arg0 <= 11) {
            return;
        }
        field2434 = null;
        field2432 = null;
        field2429 = null;
        field2442 = null;
        field2436 = null;
    }
}
