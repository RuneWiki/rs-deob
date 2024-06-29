import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class323 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field4515 = 0;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lci;")
    public static class442 field4519;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2041(int arg0) {
        class52.field760.method2109(-1);
        if (arg0 == 4135) {
            field4516++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 22)
    public static void method2042(byte arg0) {
        field4519 = null;
        int var1 = 82 / ((arg0 + 16) / 54);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvc;BLtq;)V", line = 31)
    public static final void method2043(class89 arg0, byte arg1, class248 arg2) {
        field4520++;
        if (class330.field4570 == null) {
            return;
        }
        if (class4.field33 < 10) {
            if (!class330.field4562.method2640(class330.field4570.field984, 0)) {
                class4.field33 = class261.field3750.method2625(class330.field4570.field984, false) / 10;
                return;
            }
            class22.method161((byte) 34);
            class4.field33 = 10;
        }
        if (class4.field33 == 10) {
            class330.field4602 = class330.field4570.field982 >> 6 << 6;
            class330.field4596 = class330.field4570.field991 >> 6 << 6;
            class330.field4600 = (class330.field4570.field976 >> 6 << 6) + 64 - class330.field4596;
            class330.field4581 = (class330.field4570.field980 >> 6 << 6) + 64 - class330.field4602;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class330.field4570.method628(-19313, (class262.field3781.field4530 >> 7) + class189.field2810, class262.field3781.field4531, class279.field4012 + (class262.field3781.field4537 >> 7), var3)) {
                var5 = var3[2] - class330.field4602;
                var4 = var3[1] - class330.field4596;
            }
            if (!class477.field6786 && var4 >= 0 && var4 < class330.field4600 && var5 >= 0 && var5 < class330.field4581) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class25.field267 = var6;
                class309.field4388 = var7;
            } else if (class342.field4722 == -1 || class257.field3681 == -1) {
                class330.field4570.method631(var3, (byte) -84, class330.field4570.field992 & 0x3FFF, (class330.field4570.field992 & 0xFFFC80C) >> 14);
                class309.field4388 = var3[1] - class330.field4596;
                class25.field267 = var3[2] - class330.field4602;
            } else {
                class330.field4570.method631(var3, (byte) -84, class257.field3681, class342.field4722);
                if (var3 != null) {
                    class25.field267 = var3[2] - class330.field4602;
                    class309.field4388 = var3[1] - class330.field4596;
                }
                class477.field6786 = false;
                class257.field3681 = -1;
                class342.field4722 = -1;
            }
            if (class330.field4570.field969 == 37) {
                class330.field4577 = 3.0F;
                class330.field4574 = 3.0F;
            } else if (class330.field4570.field969 == 50) {
                class330.field4577 = 4.0F;
                class330.field4574 = 4.0F;
            } else if (class330.field4570.field969 == 75) {
                class330.field4577 = 6.0F;
                class330.field4574 = 6.0F;
            } else if (class330.field4570.field969 == 100) {
                class330.field4577 = 8.0F;
                class330.field4574 = 8.0F;
            } else if (class330.field4570.field969 == 200) {
                class330.field4577 = 16.0F;
                class330.field4574 = 16.0F;
            } else {
                class330.field4577 = 8.0F;
                class330.field4574 = 8.0F;
            }
            class330.field4579 = (int) class330.field4577 >> 1;
            class330.field4576 = class255.method1734(class330.field4579, 3);
            class57.method521((byte) 72);
            class330.method2069();
            class135.field1887 = new class92();
            class330.field4580 += (int) (Math.random() * 5.0D) - 2;
            if (class330.field4580 < -8) {
                class330.field4580 = -8;
            }
            if (class330.field4580 > 8) {
                class330.field4580 = 8;
            }
            class330.field4573 += (int) (Math.random() * 5.0D) - 2;
            if (class330.field4573 < -16) {
                class330.field4573 = -16;
            }
            if (class330.field4573 > 16) {
                class330.field4573 = 16;
            }
            class330.method2065(arg2, class330.field4580 >> 2 << 10, class330.field4573 >> 1);
            class330.field4569.method2320(1024, -75, 256);
            class330.field4568.method848(256, false, 256);
            class330.field4567.method505(4096, 98);
            class97.field1365.method2328(12623, 256);
            class4.field33 = 20;
        } else if (class4.field33 == 20) {
            class161.method1192(8, true);
            class330.method2082(arg0, class330.field4580, class330.field4573);
            class4.field33 = 60;
            class161.method1192(8, true);
            class442.method2687((byte) 62);
        } else if (class4.field33 == 60) {
            if (class330.field4562.method2639(class330.field4570.field984 + "_staticelements", -120)) {
                if (!class330.field4562.method2640(class330.field4570.field984 + "_staticelements", 0)) {
                    return;
                }
                class330.field4571 = class421.method2515(class330.field4570.field984 + "_staticelements", class330.field4562, -1, class205.field2999);
            } else {
                class330.field4571 = new class481(0);
            }
            class330.method2063();
            class4.field33 = 70;
            class161.method1192(8, true);
            class442.method2687((byte) 86);
        } else if (class4.field33 == 70) {
            class76.field1134 = new class226(arg0, 11, true, class33.field338);
            class4.field33 = 73;
            class161.method1192(8, true);
            class442.method2687((byte) 126);
        } else if (class4.field33 == 73) {
            class382.field5241 = new class226(arg0, 12, true, class33.field338);
            class4.field33 = 76;
            class161.method1192(8, true);
            class442.method2687((byte) -86);
        } else if (class4.field33 == 76) {
            class145.field2005 = new class226(arg0, 14, true, class33.field338);
            class4.field33 = 79;
            class161.method1192(8, true);
            class442.method2687((byte) 127);
        } else if (class4.field33 == 79) {
            class333.field4634 = new class226(arg0, 17, true, class33.field338);
            class4.field33 = 82;
            class161.method1192(8, true);
            class442.method2687((byte) -125);
        } else if (class4.field33 == 82) {
            class475.field6709 = new class226(arg0, 19, true, class33.field338);
            class4.field33 = 85;
            class161.method1192(8, true);
            class442.method2687((byte) -126);
        } else if (class4.field33 == 85) {
            class205.field3001 = new class226(arg0, 22, true, class33.field338);
            class4.field33 = 88;
            class161.method1192(8, true);
            class442.method2687((byte) 71);
        } else if (class4.field33 == 88) {
            class56.field828 = new class226(arg0, 26, true, class33.field338);
            class4.field33 = 91;
            class161.method1192(8, true);
            class442.method2687((byte) 88);
        } else {
            class314.field4429 = new class226(arg0, 30, true, class33.field338);
            class4.field33 = 100;
            int var8 = -56 % ((53 - arg1) / 45);
            class161.method1192(8, true);
            class442.method2687((byte) 76);
            System.gc();
        }
    }
}
