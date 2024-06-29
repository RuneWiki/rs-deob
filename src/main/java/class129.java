import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class129 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lfn;")
    public static class52 field1824 = new class52(17, 2);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lcs;")
    public static class351 field1826 = new class351(77, -1);

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lcs;")
    public static class351 field1827 = new class351(73, 3);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
    public static int[] field1822;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method784(int arg0) {
        field1826 = null;
        field1824 = null;
        field1822 = null;
        if (arg0 != 4) {
            field1822 = null;
        }
        field1827 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static final void method785(int arg0) {
        field1823++;
        for (int var1 = arg0; var1 < 5; var1++) {
            class269.field3730[var1] = false;
        }
        class416.field5730 = class106.field1525;
        class383.field5438 = -1;
        class332.field4554 = class356.field4972;
        class287.field3916 = 0;
        class375.field5312 = 5;
        class157.field2258 = class183.field2665;
        class165.field2435 = 0;
        class375.field5307 = class436.field5982;
        class236.field3333 = -1;
        class152.field2145 = class160.field2306;
        class108.field1539 = class200.field2873;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLpf;)V")
    public static final void method786(byte arg0, class133 arg1) {
        for (int var2 = 0; var2 < class318.field4331; var2++) {
            int var4 = class10.field193[var2];
            class23 var5 = class310.field4235[var4];
            int var6 = arg1.method2503(true);
            if ((var6 & 0x8) != 0) {
                var6 += arg1.method2503(true) << 8;
            }
            class240.method1507(-26, var5, var6, arg1, var4);
        }
        field1825++;
        int var3 = -41 / ((13 - arg0) / 34);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 >= -118) {
            field1827 = null;
        }
        class106.field1513 = arg0;
        field1821++;
        class266.field3711 = arg2;
        class19.field322 = arg5;
        class444.field6128 = arg4;
        class51.field857 = arg3;
        if (arg6 && class266.field3711 >= 100) {
            class106.field1525 = class444.field6128 * 128 + 64;
            class436.field5982 = class51.field857 * 128 + 64;
            class183.field2665 = class418.method2441(class106.field1525, class76.field1161, class436.field5982, -16778) - class106.field1513;
        }
        class375.field5312 = 2;
    }
}
