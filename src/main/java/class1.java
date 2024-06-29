import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class132 {

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Z")
    public static boolean field3 = false;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Ltg;")
    public static class184 field26 = class135.method812("<)4col> x", 3);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "Ltg;")
    public static class184 field29 = class135.method812("p11_full", 3);

    @OriginalMember(owner = "client!a", name = "S", descriptor = "Ltg;")
    private static class184 field33 = class135.method812("Loaded textures", 3);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Ltg;")
    public static class184 field32 = class135.method812("hitmarks", 3);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Ltg;")
    public static class184 field30 = field33;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Lrf;")
    public class165 field14;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Luc;")
    public class189 field10;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Lw;")
    public class204 field21;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "Ldc;")
    public class33 field25;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method1(int arg0) {
        field29 = null;
        field33 = null;
        field26 = null;
        if (arg0 >= -122) {
            field3 = false;
        }
        field32 = null;
        field30 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILrh;IIII)V")
    public static final void method2(int arg0, int arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6) {
        field22++;
        int var7 = Math.min(arg2.field3045 / 2, arg2.field3089 / arg6);
        int var8 = arg3 * arg3 + arg5 * arg5;
        if (var7 * var7 >= var8 || var8 >= 90000) {
            class191.method1224(arg2, class39.field735[arg1], arg5, arg4, arg3, 128, arg0);
            return;
        }
        int var9 = class38.field716 + class2.field39 & 0x7FF;
        int var10 = class23.field422[var9];
        int var11 = class23.field434[var9];
        int var12 = var11 * 256 / (class182.field3491 + 256);
        var7 -= 10;
        int var13 = var10 * 256 / (class182.field3491 + 256);
        int var14 = arg3 * var12 + arg5 * var13 >> 16;
        int var15 = arg5 * var12 - arg3 * var13 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var7);
        int var19 = (int) ((double) var7 * Math.cos(var16));
        class206.field3952[arg1].method833(arg2.field3045 / 2 + arg0 + var18 - 10, -var19 + arg4 - (-(arg2.field3089 / 2) + 10), 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Z")
    public static final boolean method3(byte arg0, int arg1) {
        field11++;
        if (arg0 != -16) {
            method1(-79);
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)V")
    public static final void method4(byte arg0, int arg1) {
        field6++;
        for (class20 var2 = (class20) class205.field3948.method57(-19654); var2 != null; var2 = (class20) class205.field3948.method49(1)) {
            if ((var2.field2393 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method797((byte) -125);
            }
        }
        if (arg0 != 41) {
            method2(-74, 61, null, 106, 3, 42, 74);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public final void method5(int arg0) {
        this.field14 = null;
        this.field10 = null;
        this.field25 = null;
        field4++;
        if (arg0 != -29447) {
            method4((byte) -14, -71);
        }
        this.field21 = null;
    }
}
