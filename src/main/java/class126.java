import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class126 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lok;")
    public static class41 field1869 = class137.method956("Null", 45);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lok;")
    public static class41 field1873 = class137.method956("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 45);

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lok;")
    public static class41 field1871 = null;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[[[B")
    public static byte[][][] field1879 = new byte[4][104][104];

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Z")
    public static boolean field1881 = false;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[Z")
    public static boolean[] field1872;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 5)
    public static void method883(int arg0) {
        field1873 = null;
        if (arg0 != 150) {
            method883(17);
        }
        field1879 = (byte[][][]) null;
        field1871 = null;
        field1869 = null;
        field1872 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V", line = 19)
    public static final void method884(int arg0, boolean arg1) {
        field1877++;
        class234.method1685(arg0 - 20902);
        if (class94.field1377 != 30 && class94.field1377 != 25) {
            return;
        }
        if (arg0 != 119) {
            field1881 = false;
        }
        class118.field1734++;
        if (class118.field1734 < 50 && !arg1) {
            return;
        }
        class118.field1734 = 0;
        if (!class35.field519 && class118.field1724 != null) {
            class285.field4642.method844(arg0 ^ 0xFFFFFF8B, 119);
            class264.field4178++;
            try {
                class118.field1724.method1572(-111, class285.field4642.field1640, 0, class285.field4642.field1607);
                class285.field4642.field1640 = 0;
            } catch (IOException var3) {
                class35.field519 = true;
            }
        }
        class234.method1685(arg0 ^ 0xFFFFAEA6);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lth;IIIZ)V", line = 56)
    public void method885(class126 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1876++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIII)V", line = 66)
    public void method886(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1875++;
        if (arg0 < 52) {
            field1872 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[BI[Lue;IZ)V", line = 98)
    public static final void method887(int arg0, byte[] arg1, int arg2, class223[] arg3, int arg4, boolean arg5) {
        if (arg2 != 32410) {
            field1879 = (byte[][][]) ((byte[][][]) null);
        }
        field1870++;
        class112 var6 = new class112(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method801(-128);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method756(arg2 ^ 0x7EC4);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFDB) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method792(2);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg0 + var12;
                int var18 = arg4 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class223 var19 = null;
                    if (!arg5) {
                        int var20 = var13;
                        if ((field1879[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class181.method1295(var18, var15, var19, var13, var17, var13, (byte) -120, arg5, !arg5, var16, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Lth;", line = 173)
    public class126 method888(int arg0, int arg1, int arg2) {
        field1874++;
        return this;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()Z", line = 190)
    public boolean method889() {
        field1880++;
        return false;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIII)V", line = 198)
    public static final void method890(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class107.field1517 < 100) {
            class116.method825(10773);
        }
        if (class166.field2625) {
            class190.method1369(arg2, arg4, arg2 + arg3, arg0 + arg4);
        } else {
            class54.method375(arg2, arg4, arg2 + arg3, arg0 + arg4);
        }
        field1878++;
        if (class107.field1517 < 100) {
            int var5 = arg3 / 2 + arg2;
            byte var6 = 20;
            int var7 = arg0 / 2 + (arg4 - var6 - 18);
            if (class166.field2625) {
                class190.method1363(arg2, arg4, arg3, arg0, 0);
                class190.method1361(var5 - 152, var7, 304, 34, 9179409);
                class190.method1361(var5 - 151, var7 + 1, 302, 32, 0);
                class190.method1363(var5 - 150, var7 + 2, class107.field1517 * 3, 30, 9179409);
                class190.method1363(class107.field1517 * 3 + (var5 - 150), var7 + 2, 300 - (class107.field1517 * 3), 30, 0);
            } else {
                class54.method383(arg2, arg4, arg3, arg0, 0);
                class54.method378(var5 - 152, var7, 304, 34, 9179409);
                class54.method378(var5 - 151, var7 + 1, 302, 32, 0);
                class54.method383(var5 - 150, var7 - -2, class107.field1517 * 3, 30, 9179409);
                class54.method383(var5 + (class107.field1517 * 3) - 150, var7 - -2, 300 - (class107.field1517 * 3), 30, 0);
            }
            class140.field2165.method1785(class1.field2, var5, var6 + var7, 16777215, -1);
            return;
        }
        class59.field850 = class45.field707 - (int) ((float) arg3 / class178.field2886);
        class187.field3045 = class110.field1565 - (int) ((float) arg0 / class178.field2886);
        class252.field4008 = (int) ((float) (arg0 * 2) / class178.field2886);
        int var8 = class45.field707 - ((int) ((float) arg3 / class178.field2886));
        int var9 = class110.field1565 - ((int) ((float) arg0 / class178.field2886));
        class44.field689 = (int) ((float) (arg3 * 2) / class178.field2886);
        if (!arg1) {
            method890(-16, true, -82, 72, -80);
        }
        int var10 = (int) ((float) arg3 / class178.field2886) + class45.field707;
        int var11 = (int) ((float) arg0 / class178.field2886) + class110.field1565;
        if (class166.field2625) {
            if (class2.field28 == null || class2.field28.field3200 != arg3 || class2.field28.field3189 != arg0) {
                class2.field28 = null;
                class2.field28 = new class108(arg3, arg0);
            }
            class54.method381(class2.field28.field1070, arg3, arg0);
            class22.method154((byte) 41, 0, arg0, arg3, 0, var9, var11, var10, var8);
            class206.method1460(arg0, 0, var8, 0, arg3, var9, (byte) 89, var10, var11);
            class149.method1032(arg0, var11, 0, 0, 0, arg3, var9, var10, var8);
            class2.field28.method77(arg2, arg4);
        } else {
            class22.method154((byte) 41, arg4, arg0 + arg4, arg2 + arg3, arg2, var9, var11, var10, var8);
            class206.method1460(arg0 + arg4, arg4, var8, arg2, arg2 + arg3, var9, (byte) -104, var10, var11);
            class149.method1032(arg4 + arg0, var11, arg4, 0, arg2, arg2 + arg3, var9, var10, var8);
        }
        if (class265.field4208 > 0) {
            class265.field4208--;
        }
        if (!class46.field728) {
            return;
        }
        int var12 = arg2 + arg3 - 5;
        int var13 = arg4 + arg0 - 8;
        class244.field3898.method1789(class187.method1346(new class41[] { class316.field5350, class1.method4(class186.field3043, (byte) 41) }, 0), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var17 = var13 - 15;
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class244.field3898.method1789(class187.method1346(new class41[] { class32.field476, class1.method4(var16, (byte) 44), class15.field199 }, 0), var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
    public abstract int method125();

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
