import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class236 extends class154 {

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field4135 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Ldk;")
    public static class281 field4127;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "[I")
    public int[] field4124;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[I")
    public int[] field4125;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "[I")
    public int[] field4134;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[Lke;")
    public class116[] field4121;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "[Lke;")
    public class116[] field4122;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[[[B")
    public byte[][][] field4133;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V", line = 5)
    public static final void method1623(byte arg0) {
        class311.field5289 = 0;
        class307.field5217 = 0;
        field4131++;
        if (arg0 <= 73) {
            return;
        }
        class291.method2048(-12806);
        class201.method1337(true);
        class155.method1058((byte) -101);
        class191.method1293(-15228);
        for (int var1 = 0; var1 < class307.field5217; var1++) {
            int var2 = class152.field2615[var1];
            if (class202.field3498 != class38.field527[var2].field951) {
                if (class38.field527[var2].field3979 > 0) {
                    class185.method1250(class38.field527[var2], false);
                }
                class38.field527[var2] = null;
            }
        }
        if (class241.field4184 != class293.field5036.field4051) {
            throw new RuntimeException("gpp1 pos:" + class293.field5036.field4051 + " psize:" + class241.field4184);
        }
        for (int var3 = 0; var3 < class14.field177; var3++) {
            if (class38.field527[class140.field2390[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class14.field177);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V", line = 60)
    public static void method1624(byte arg0) {
        field4127 = null;
        if (arg0 > -61) {
            field4127 = (class281) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V", line = 76)
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class250.field4311[0].method378(arg1, arg2);
        class250.field4311[1].method378(arg1, arg2 + arg5 - 16);
        field4128++;
        int var6 = (arg5 - 32) * arg5 / arg4;
        if (arg3 != 5349) {
            method1626(65);
        }
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg0 / (arg4 - arg5);
        if (!class257.field4390) {
            class211.method1398(arg1, arg2 + 16, 16, arg5 - 32, class253.field4362);
            class211.method1398(arg1, arg2 + var7 + 16, 16, var6, class297.field5100);
            class211.method1399(arg1, arg2 + var7 + 16, var6, class7.field98);
            class211.method1399(arg1 + 1, arg2 + 16 + var7, var6, class7.field98);
            class211.method1410(arg1, var7 + arg2 + 16, 16, class7.field98);
            class211.method1410(arg1, arg2 + var7 + 17, 16, class7.field98);
            class211.method1399(arg1 + 15, arg2 + var7 + 16, var6, class249.field4295);
            class211.method1399(arg1 + 14, arg2 - -var7 + 17, var6 - 1, class249.field4295);
            class211.method1410(arg1, var7 + var6 + arg2 + 15, 16, class249.field4295);
            class211.method1410(arg1 + 1, arg2 + var6 + 14 + var7, 15, class249.field4295);
            return;
        }
        class296.method2096(arg1, arg2 + 16, 16, arg5 - 32, class253.field4362);
        class296.method2096(arg1, arg2 + var7 + 16, 16, var6, class297.field5100);
        class296.method2092(arg1, arg2 + var7 + 16, var6, class7.field98);
        class296.method2092(arg1 + 1, arg2 - -var7 + 16, var6, class7.field98);
        class296.method2087(arg1, var7 + arg2 + 16, 16, class7.field98);
        class296.method2087(arg1, var7 + arg2 + 17, 16, class7.field98);
        class296.method2092(arg1 + 15, arg2 + 16 - -var7, var6, class249.field4295);
        class296.method2092(arg1 + 14, arg2 + var7 + 17, var6 - 1, class249.field4295);
        class296.method2087(arg1, arg2 + var7 + var6 + 15, 16, class249.field4295);
        class296.method2087(arg1 + 1, arg2 + 14 + var7 + var6, 15, class249.field4295);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 143)
    public static final void method1626(int arg0) {
        field4136++;
        class38.field504.method1161(124);
        if (arg0 != 14) {
            method1626(-72);
        }
    }
}
