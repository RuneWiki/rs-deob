import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class275 extends class426 {

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "Lms;")
    public class74 field4201;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "Lpf;")
    public static class425 field4204 = new class425(12, 6);

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "Lnn;")
    public static class151 field4205 = new class151("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4202++;
        class451.field6652 = arg2;
        class363.field5337 = arg1;
        class176.field2674 = arg4;
        class407.field6067 = arg0;
        class174.field2666 = arg5;
        if (class176.field2674 >= 100) {
            int var6 = class174.field2666 * 128 + 64;
            int var7 = class407.field6067 * 128 + 64;
            int var8 = class437.method2686(class143.field1911, 0, var7, var6) - class363.field5337;
            int var9 = var6 - class185.field2790;
            int var10 = var8 - class127.field1626;
            int var11 = var7 - class196.field2967;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class350.field5204 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class201.field3037 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class363.field5344 = 0;
            if (class350.field5204 < 1024) {
                class350.field5204 = 1024;
            }
            if (class350.field5204 > 3072) {
                class350.field5204 = 3072;
            }
        }
        if (arg3 != -21223) {
            method1707(-59, 72, 71, -99, 120, 109);
        }
        class80.field1054 = 2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)I")
    public static final int method1708(int arg0, boolean arg1) {
        field4203++;
        if (!arg1) {
            field4207 = -71;
        }
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lms;)V")
    public class275(class74 arg0) {
        this.field4201 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
    public static void method1709(int arg0) {
        field4204 = null;
        field4205 = null;
        if (arg0 != 0) {
            method1707(-76, 80, -4, 16, -22, -83);
        }
    }
}
