import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class123 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lia;")
    public static class257 field2215 = class28.method234(-47, "");

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method856(byte arg0) {
        if (arg0 < -18) {
            field2215 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V")
    public static final void method857(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class75.field1463[arg0][arg1][arg2];
        if (var4 != null) {
            class75.field1463[arg0][arg1][arg2].field3015 = arg3;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([[II)V")
    public static final void method858(int[][] arg0, int arg1) {
        field2208++;
        class185.field3220 = arg0;
        if (arg1 >= -108) {
            field2211 = -26;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method859(int arg0, int arg1) {
        class87.field1678.method831(arg1, -128);
        class81.field1589.method831(arg1, arg0 - 141);
        if (arg0 != 16) {
            method858((int[][]) null, -81);
        }
        field2214++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method860(int arg0) {
        field2213++;
        class258.field4482.method175(120);
        for (int var1 = 0; var1 < 32; var1++) {
            class225.field3786[var1] = 0L;
        }
        if (arg0 != -1) {
            field2215 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class104.field1938[var2] = 0L;
        }
        class138.field2468 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(DI)V")
    public static final void method861(double arg0, int arg1) {
        if (class260.field4507 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class37.field736[var3] = var4 <= 255 ? var4 : 255;
            }
            class260.field4507 = arg0;
        }
        if (arg1 != 256) {
            method859(52, 37);
        }
        field2209++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIIII)V")
    public static final void method862(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2212++;
        class13.field248[0].method673(arg5, arg4);
        class13.field248[1].method673(arg5, arg4 + arg3 - 16);
        int var6 = (arg3 - 32) * arg3 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        if (!arg1) {
            method861(-0.8168529694269181D, 36);
        }
        int var7 = (arg3 - var6 - 32) * arg2 / (arg0 - arg3);
        class23.method198(arg5, arg4 + 16, 16, arg3 - 32, class143.field2517);
        class23.method198(arg5, arg4 + var7 + 16, 16, var6, class156.field2712);
        class23.method202(arg5, arg4 + var7 + 16, var6, class134.field2402);
        class23.method202(arg5 + 1, arg4 + 16 - -var7, var6, class134.field2402);
        class23.method197(arg5, arg4 + var7 + 16, 16, class134.field2402);
        class23.method197(arg5, var7 + arg4 + 17, 16, class134.field2402);
        class23.method202(arg5 + 15, arg4 + var7 - -16, var6, class152.field2648);
        class23.method202(arg5 + 14, var7 + 17 + arg4, var6 - 1, class152.field2648);
        class23.method197(arg5, arg4 + var6 + var7 + 15, 16, class152.field2648);
        class23.method197(arg5 + 1, arg4 + var7 + var6 + 14, 15, class152.field2648);
    }
}
