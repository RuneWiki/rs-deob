import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class59 extends class30 {

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "Lrd;")
    private static class173 field1160 = class133.method843("Invalid loginserver requested)3", -120);

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "Lrd;")
    public static class173 field1163 = field1160;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lrd;")
    public static class173 field1164 = class133.method843(" ", 113);

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field1159 = 0;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "[I")
    public static int[] field1158 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Lrd;")
    public static class173 field1166 = null;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "Lmb;")
    public static class121 field1162 = new class121(new byte[5000]);

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "Ldd;")
    public class35 field1167;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
    public static void method376(int arg0) {
        field1164 = null;
        field1160 = null;
        field1166 = null;
        if (arg0 != 0) {
            method378(-89, -70, 17, -55, -39, -75, 22, 85);
        }
        field1162 = null;
        field1158 = null;
        field1163 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V")
    public static final void method377(int arg0, int arg1, byte arg2) {
        field1165++;
        if (arg2 > -109) {
            return;
        }
        class67[] var3 = class105.field1971;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class67 var5 = var3[var4];
            if (var5 != null && var5.field1310 == 2) {
                class182.method1236((var5.field1302 - class43.field874 << 7) + var5.field1295, var5.field1298 * 2, (var5.field1299 - class108.field2024 << 7) + var5.field1294, -1);
                if (class189.field3678 > -1 && class217.field4203 % 20 < 10) {
                    class203.field3954[var5.field1309].method1222(arg1 + class189.field3678 - 12, arg0 + -28 - -class15.field352);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class126 var8 = new class126();
        var8.field2389 = arg2 / 128;
        var8.field2376 = arg3 / 128;
        var8.field2378 = arg4 / 128;
        var8.field2386 = arg5 / 128;
        var8.field2388 = arg1;
        var8.field2382 = arg2;
        var8.field2367 = arg3;
        var8.field2381 = arg4;
        var8.field2372 = arg5;
        var8.field2377 = arg6;
        var8.field2371 = arg7;
        class208.field4056[arg0][class208.field4044[arg0]++] = var8;
    }
}
