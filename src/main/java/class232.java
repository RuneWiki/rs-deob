import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class232 extends class76 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field3275 = 0;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Z")
    public static boolean field3279 = false;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "F")
    public static float field3282;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[[[B")
    public static byte[][][] field3277;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1603(byte arg0) {
        field3276++;
        if (class135.field1864 == null) {
            return;
        }
        if (class125.field1700 < 10) {
            if (!class217.field3110.method951(class135.field1864.field4406, 2)) {
                class125.field1700 = class307.field4595.method968((byte) 121, class135.field1864.field4406) / 10;
                return;
            }
            class250.method1705((byte) -126);
            class125.field1700 = 10;
        }
        if (class125.field1700 == 10) {
            class174.field2374 = class135.field1864.field4415 >> 6 << 6;
            class42.field481 = class135.field1864.field4405 >> 6 << 6;
            class56.field765 = (class135.field1864.field4408 >> 6 << 6) + 64 - class42.field481;
            int var1 = -1;
            class20.field258 = (class135.field1864.field4413 >> 6 << 6) + 64 - class174.field2374;
            int var2 = -1;
            int[] var3 = class135.field1864.method2024((class173.field2356.field3745 >> 7) + class132.field1809, (byte) 93, (class173.field2356.field3679 >> 7) + class296.field4394, class251.field3603);
            if (var3 != null) {
                var1 = var3[1] - class174.field2374;
                var2 = class42.field481 + class56.field765 - var3[2] - 1;
            }
            if (var1 >= 0 && class20.field258 > var1 && var2 >= 0 && var2 < class56.field765) {
                int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class170.field2315 = var5;
                class312.field4712 = var4;
            } else if (class22.field290 == -1 || class334.field5048 == -1) {
                int[] var7 = class135.field1864.method2023((byte) 110, class135.field1864.field4402 & 0x3FFF, (class135.field1864.field4402 & 0xFFFD28A) >> 14);
                class170.field2315 = class56.field765 + class42.field481 - var7[2] - 1;
                class312.field4712 = var7[1] - class174.field2374;
            } else {
                int[] var6 = class135.field1864.method2023((byte) 111, class334.field5048, class22.field290);
                if (var6 != null) {
                    class170.field2315 = class42.field481 + class56.field765 - (var6[2] + 1);
                    class312.field4712 = var6[1] - class174.field2374;
                }
                class334.field5048 = -1;
                class22.field290 = -1;
            }
            if (class135.field1864.field4414 == 37) {
                class273.field4084 = 3.0F;
                class343.field5137 = 3.0F;
            } else if (class135.field1864.field4414 == 50) {
                class273.field4084 = 4.0F;
                class343.field5137 = 4.0F;
            } else if (class135.field1864.field4414 == 75) {
                class273.field4084 = 6.0F;
                class343.field5137 = 6.0F;
            } else if (class135.field1864.field4414 == 100) {
                class273.field4084 = 8.0F;
                class343.field5137 = 8.0F;
            } else if (class135.field1864.field4414 == 200) {
                class273.field4084 = 16.0F;
                class343.field5137 = 16.0F;
            } else {
                class273.field4084 = 8.0F;
                class343.field5137 = 8.0F;
            }
            class93.method699(104);
            class301.field4447 = new int[class326.field4930 + 1];
            int var8 = class327.field4947 >> 2 << 10;
            int var9 = class201.field2863 >> 1;
            int var10 = class20.field258 >> 6;
            int var11 = class56.field765 >> 6;
            class21.field279 = new int[var10][var11][];
            class21.field266 = new int[var10][var11][];
            class172.field2347 = new int[var10][var11][];
            class294.field4370 = new byte[var10][var11][];
            class256.field3703 = new byte[var10][var11][];
            class194.field2704 = new byte[var10][var11][];
            class271.field4053 = new byte[var10][var11][];
            class249.field3583 = new byte[var10][var11][];
            client.method822(-104, var9, var8);
            class125.field1700 = 20;
        } else if (class125.field1700 == 20) {
            class254.method1738(new class316(class217.field3110.method971("underlay", class135.field1864.field4406, 121)), 1);
            class125.field1700 = 30;
            class343.method2361(false, true);
            class276.method1896((byte) -124);
        } else if (class125.field1700 == 30) {
            class17.method112((byte) -68, new class316(class217.field3110.method971("overlay", class135.field1864.field4406, 91)));
            class125.field1700 = 40;
            class276.method1896((byte) 85);
        } else if (class125.field1700 == 40) {
            class23.method138(new class316(class217.field3110.method971("overlay2", class135.field1864.field4406, 57)), (byte) -61);
            class125.field1700 = 50;
            class276.method1896((byte) 17);
        } else if (class125.field1700 == 50) {
            class211.method1481(new class316(class217.field3110.method971("loc", class135.field1864.field4406, 70)), 82);
            class125.field1700 = 60;
            class343.method2361(false, true);
            class276.method1896((byte) -92);
        } else if (class125.field1700 == 60) {
            if (class217.field3110.method965((byte) -60, class135.field1864.field4406 + "_labels")) {
                if (!class217.field3110.method951(class135.field1864.field4406 + "_labels", 2)) {
                    return;
                }
                class132.field1811 = class326.method2281(class135.field1864.field4406 + "_labels", class217.field3110, 78);
            } else {
                class132.field1811 = new class176(0);
            }
            class125.field1700 = 70;
            class276.method1896((byte) -120);
        } else if (class125.field1700 == 70) {
            class28.field357 = new class283(11, true, class150.field2079);
            class125.field1700 = 73;
            class343.method2361(false, true);
            class276.method1896((byte) -112);
        } else if (class125.field1700 == 73) {
            class98.field1327 = new class283(12, true, class150.field2079);
            class125.field1700 = 76;
            class343.method2361(false, true);
            class276.method1896((byte) 31);
        } else if (class125.field1700 == 76) {
            class198.field2765 = new class283(14, true, class150.field2079);
            class125.field1700 = 79;
            class343.method2361(false, true);
            class276.method1896((byte) 52);
        } else if (class125.field1700 == 79) {
            class235.field3328 = new class283(17, true, class150.field2079);
            class125.field1700 = 82;
            class343.method2361(false, true);
            class276.method1896((byte) 80);
        } else if (class125.field1700 == 82) {
            class235.field3332 = new class283(19, true, class150.field2079);
            class125.field1700 = 85;
            class343.method2361(false, true);
            class276.method1896((byte) 121);
        } else if (class125.field1700 == 85) {
            class315.field4753 = new class283(22, true, class150.field2079);
            class125.field1700 = 88;
            class343.method2361(false, true);
            class276.method1896((byte) 33);
        } else if (class125.field1700 == 88) {
            class323.field4897 = new class283(26, true, class150.field2079);
            class125.field1700 = 91;
            class343.method2361(false, true);
            class276.method1896((byte) 39);
        } else {
            class111.field1508 = new class283(30, true, class150.field2079);
            class125.field1700 = 100;
            class343.method2361(false, true);
            if (arg0 <= 39) {
                method1605((byte) -126);
            }
            class276.method1896((byte) -113);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIBI)V", line = 253)
    public static final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3278++;
        if (arg4 < 128 || arg3 < 128 || arg4 > 13056 || arg3 > 13056) {
            class208.field3001 = -1;
            class330.field4982 = -1;
            return;
        }
        int var8 = class135.method985(arg3, class251.field3603, arg4, (byte) -97) - arg1;
        int var9 = arg3 - class275.field4123;
        int var10 = arg4 - class198.field2820;
        int var11 = var8 - class101.field1394;
        int var12 = class184.field2538[class204.field2944];
        int var13 = class184.field2538[class236.field3347];
        int var14 = class184.field2532[class204.field2944];
        int var15 = class184.field2532[class236.field3347];
        int var16 = var9 * var13 + (var10 * var15) >> 16;
        int var17 = var9 * var15 - (var10 * var13) >> 16;
        if (arg6 > -74) {
            field3281 = -34;
        }
        int var19 = var11 * var14 - var12 * var17 >> 16;
        int var20 = var11 * var12 + var14 * var17 >> 16;
        if (var20 < 50) {
            class330.field4982 = -1;
            class208.field3001 = -1;
        } else if (class67.field908) {
            int var22 = arg7 * 512 >> 8;
            class330.field4982 = var19 * var22 / var20 + arg5;
            int var23 = arg0 * 512 >> 8;
            class208.field3001 = arg2 + (var16 * var23 / var20);
        } else {
            class208.field3001 = arg2 + ((var16 << 9) / var20);
            class330.field4982 = (var19 << 9) / var20 + arg5;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 323)
    public static void method1605(byte arg0) {
        field3277 = (byte[][][]) null;
        if (arg0 > -27) {
            method1605((byte) -72);
        }
    }
}
