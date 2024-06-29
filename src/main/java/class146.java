import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class146 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
    public static boolean field2236 = false;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method1026(boolean arg0) {
        field2237++;
        if (class214.field3256 == null) {
            return;
        }
        if (class35.field536 < 10) {
            if (!class105.field1628.method962((byte) -70, class214.field3256.field42)) {
                class35.field536 = class162.field2432.method961(0, class214.field3256.field42) / 10;
                return;
            }
            class92.method660(79);
            class35.field536 = 10;
        }
        if (class35.field536 == 10) {
            class333.field5202 = class214.field3256.field26 >> 6 << 6;
            class84.field1311 = class214.field3256.field22 >> 6 << 6;
            class233.field3706 = (class214.field3256.field36 >> 6 << 6) + 64 - class333.field5202;
            class313.field4863 = (class214.field3256.field37 >> 6 << 6) - (class84.field1311 - 64);
            int var1 = -1;
            int var2 = -1;
            int[] var3 = class214.field3256.method8((class98.field1566.field1868 >> 7) + class342.field5328, (byte) 126, class205.field3101, (class98.field1566.field1905 >> 7) + class213.field3249);
            if (var3 != null) {
                var1 = class233.field3706 + class333.field5202 - var3[2] - 1;
                var2 = var3[1] - class84.field1311;
            }
            if (var2 >= 0 && var2 < class313.field4863 && var1 >= 0 && var1 < class233.field3706) {
                int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var2 + ((int) (Math.random() * 10.0D) - 5);
                class128.field2024 = var4;
                class265.field4119 = var5;
            } else if (class2.field29 == -1 || class182.field2747 == -1) {
                int[] var7 = class214.field3256.method10(class214.field3256.field31 >> 14 & 0x3FFF, (byte) 112, class214.field3256.field31 & 0x3FFF);
                class128.field2024 = class333.field5202 + class233.field3706 - var7[2] - 1;
                class265.field4119 = var7[1] - class84.field1311;
            } else {
                int[] var6 = class214.field3256.method10(class2.field29, (byte) 105, class182.field2747);
                if (var6 != null) {
                    class128.field2024 = class333.field5202 + class233.field3706 - var6[2] - 1;
                    class265.field4119 = var6[1] - class84.field1311;
                }
                class182.field2747 = -1;
                class2.field29 = -1;
            }
            if (class214.field3256.field44 == 37) {
                class165.field2472 = 3.0F;
                class229.field3637 = 3.0F;
            } else if (class214.field3256.field44 == 50) {
                class165.field2472 = 4.0F;
                class229.field3637 = 4.0F;
            } else if (class214.field3256.field44 == 75) {
                class165.field2472 = 6.0F;
                class229.field3637 = 6.0F;
            } else if (class214.field3256.field44 == 100) {
                class165.field2472 = 8.0F;
                class229.field3637 = 8.0F;
            } else if (class214.field3256.field44 == 200) {
                class165.field2472 = 16.0F;
                class229.field3637 = 16.0F;
            } else {
                class165.field2472 = 8.0F;
                class229.field3637 = 8.0F;
            }
            class17.method137(-28707);
            int var8 = class233.field3706 >> 6;
            class99.field1576 = new int[class97.field1549 + 1];
            int var9 = class31.field449 >> 2 << 10;
            int var10 = class313.field4863 >> 6;
            class223.field3545 = new int[var10][var8][];
            class150.field2268 = new byte[var10][var8][];
            class19.field260 = new byte[var10][var8][];
            class188.field2808 = new int[var10][var8][];
            class307.field4773 = new byte[var10][var8][];
            class89.field1432 = new byte[var10][var8][];
            class70.field1139 = new byte[var10][var8][];
            class270.field4210 = new int[var10][var8][];
            int var11 = class260.field4067 >> 1;
            class78.method570(var11, -121, var9);
            class35.field536 = 20;
        } else if (class35.field536 == 20) {
            class285.method1975(new class166(class105.field1628.method959((byte) -23, class214.field3256.field42, "underlay")), (byte) 34);
            class35.field536 = 30;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 30) {
            class178.method1269(4096, new class166(class105.field1628.method959((byte) -23, class214.field3256.field42, "overlay")));
            class35.field536 = 40;
            class282.method1931((byte) -51);
        } else if (class35.field536 == 40) {
            class219.method1544(new class166(class105.field1628.method959((byte) -23, class214.field3256.field42, "overlay2")), 4096);
            class35.field536 = 50;
            class282.method1931((byte) -51);
        } else if (class35.field536 == 50) {
            class32.method271((byte) 87, new class166(class105.field1628.method959((byte) -23, class214.field3256.field42, "loc")));
            class35.field536 = 60;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 60) {
            if (class105.field1628.method964(89, class214.field3256.field42 + "_labels")) {
                if (!class105.field1628.method962((byte) -73, class214.field3256.field42 + "_labels")) {
                    return;
                }
                class162.field2445 = class220.method1568(class214.field3256.field42 + "_labels", class105.field1628, 0);
            } else {
                class162.field2445 = new class300(0);
            }
            class35.field536 = 70;
            class282.method1931((byte) -51);
        } else if (class35.field536 == 70) {
            class253.field3987 = new class126(11, true, class238.field3782);
            class35.field536 = 73;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 73) {
            class295.field4565 = new class126(12, true, class238.field3782);
            class35.field536 = 76;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 76) {
            class337.field5273 = new class126(14, true, class238.field3782);
            class35.field536 = 79;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 79) {
            class51.field827 = new class126(17, true, class238.field3782);
            class35.field536 = 82;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 82) {
            class278.field4286 = new class126(19, true, class238.field3782);
            class35.field536 = 85;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 85) {
            class41.field614 = new class126(22, true, class238.field3782);
            class35.field536 = 88;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else if (class35.field536 == 88) {
            class290.field4513 = new class126(26, true, class238.field3782);
            class35.field536 = 91;
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
        } else {
            class265.field4132 = new class126(30, true, class238.field3782);
            class35.field536 = 100;
            if (arg0) {
                field2236 = false;
            }
            class341.method2361((byte) -52, true);
            class282.method1931((byte) -51);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 261)
    public static final void method1027(int arg0) {
        field2239++;
        class30.field438.method2176((byte) -120);
        if (arg0 != -20497) {
            field2238 = 17;
        }
    }
}
