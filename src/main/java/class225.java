import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class225 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3887 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3886 = -1;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lp;")
    public static class280 field3889 = class18.method140((byte) -128, "runes");

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lp;")
    public static class280 field3892 = class18.method140((byte) -125, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field3888 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lp;")
    public static class280 field3890 = class18.method140((byte) -123, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3891++;
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = arg3;
        int var11 = 0;
        int var12 = 0;
        if (var8 != 0) {
            int var13 = class146.field2545[var8];
            var12 = -arg3 * var13 >> 16;
            int var14 = class146.field2541[var8];
            var10 = arg3 * var14 >> 16;
        }
        if (arg5 != 27593) {
            return;
        }
        if (var9 != 0) {
            int var15 = class146.field2545[var9];
            var11 = var10 * var15 >> 16;
            int var16 = class146.field2541[var9];
            var10 = var10 * var16 >> 16;
        }
        class22.field406 = arg6 - var12;
        class78.field1273 = arg0 - var10;
        class220.field3827 = arg4;
        client.field2695 = arg7 - var11;
        class8.field170 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
    public static final void method1516(byte arg0, int arg1, int arg2) {
        field3893++;
        class248 var3 = class59.method422((byte) -63, arg2);
        if (arg0 != -27) {
            method1516((byte) -4, -68, 69);
        }
        int var4 = var3.field4342;
        int var5 = var3.field4341;
        int var6 = var3.field4338;
        int var7 = class150.field2607[var5 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class58.method414(var4, 7, class17.field314[var4] & ~var8 | var8 & arg1 << var6);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1517(int arg0) {
        field3890 = null;
        if (arg0 != 0) {
            field3887 = 118;
        }
        field3892 = null;
        field3889 = null;
    }
}
