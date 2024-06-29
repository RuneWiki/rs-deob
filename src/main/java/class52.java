import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class52 extends class325 {

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "B")
    public byte field676 = 5;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "Z")
    public static boolean field681 = false;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "[I")
    public static int[] field682 = new int[2];

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "Llc;")
    public static class135 field677 = new class135("", 11);

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "[I")
    public static int[] field685 = new int[13];

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "Lfc;")
    public static class209 field686;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(Z)V", line = 9)
    public static void method280(boolean arg0) {
        field682 = null;
        field677 = null;
        field685 = null;
        if (!arg0) {
            field686 = null;
        }
        field686 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILvt;)V", line = 24)
    public static final void method281(int arg0, class179 arg1) {
        field683++;
        int var2 = arg1.method885(true);
        class188.field2540 = new class69[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class188.field2540[var3] = new class69();
            class188.field2540[var3].field853 = arg1.method885(true);
            class188.field2540[var3].field852 = arg1.method920(0);
        }
        class345.field4935 = arg1.method885(true);
        class148.field1792 = arg1.method885(true);
        class362.field5219 = arg1.method885(true);
        class427.field6158 = new class239[class148.field1792 + 1 - class345.field4935];
        for (int var4 = 0; var4 < class362.field5219; var4++) {
            int var5 = arg1.method885(true);
            class239 var6 = class427.field6158[var5] = new class239();
            var6.field5330 = arg1.method895((byte) -87);
            var6.field5327 = arg1.method939((byte) 103);
            var6.field3299 = class345.field4935 + var5;
            var6.field3291 = arg1.method920(arg0);
            var6.field3294 = arg1.method920(0);
        }
        class486.field6893 = arg1.method939((byte) -102);
        class470.field6631 = true;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lrs;IIII)V", line = 71)
    public static final void method282(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class168.method823(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class176.field2122) {
            class168.method823(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class168.method823(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class225.field3116) {
            class168.method823(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class225.field3116) {
            class168.method823(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class176.field2122 && arg4 <= class225.field3116) {
            class168.method823(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class168.method823(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class176.field2122 && arg4 > 0) {
            class168.method823(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)S", line = 134)
    public static final short method283(int arg0, int arg1) {
        field680++;
        int var2 = (arg0 & 0xFE68) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return arg1 == 4 ? (short) (var2 << 10 | var7 >> 4 << 7 | var6) : 26;
    }
}
