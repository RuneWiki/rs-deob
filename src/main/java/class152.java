import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class152 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method1042(int arg0) {
        field2372++;
        int var1 = class50.field853 * 128 + 64;
        int var2 = class170.field2762 * 128 + 64;
        int var3 = class155.method1060((byte) -12, class56.field941, var2, var1) - class229.field3713;
        if (class306.field4887 < 100) {
            if (class46.field776 < var3) {
                class46.field776 += (var3 - class46.field776) * class306.field4887 / 1000 + class215.field3555;
                if (class46.field776 > var3) {
                    class46.field776 = var3;
                }
            }
            if (class46.field776 > var3) {
                class46.field776 -= (class46.field776 - var3) * class306.field4887 / 1000 + class215.field3555;
                if (class46.field776 < var3) {
                    class46.field776 = var3;
                }
            }
            if (class104.field1666 < var2) {
                class104.field1666 += (var2 - class104.field1666) * class306.field4887 / 1000 + class215.field3555;
                if (class104.field1666 > var2) {
                    class104.field1666 = var2;
                }
            }
            if (var1 > class148.field2314) {
                class148.field2314 += (var1 - class148.field2314) * class306.field4887 / 1000 + class215.field3555;
                if (var1 < class148.field2314) {
                    class148.field2314 = var1;
                }
            }
            if (class148.field2314 > var1) {
                class148.field2314 -= (class148.field2314 - var1) * class306.field4887 / 1000 + class215.field3555;
                if (class148.field2314 < var1) {
                    class148.field2314 = var1;
                }
            }
            if (var2 < class104.field1666) {
                class104.field1666 -= class215.field3555 + ((class104.field1666 - var2) * class306.field4887 / 1000);
                if (var2 > class104.field1666) {
                    class104.field1666 = var2;
                }
            }
        } else {
            class148.field2314 = class50.field853 * 128 + 64;
            class104.field1666 = class170.field2762 * 128 + 64;
            class46.field776 = class155.method1060((byte) -12, class56.field941, class104.field1666, class148.field2314) - class229.field3713;
        }
        int var4 = class276.field4442 * 128 + 64;
        int var5 = class132.field2081 * 128 + 64;
        int var6 = class155.method1060((byte) -12, class56.field941, var4, var5) - class247.field3930;
        if (arg0 != -14769) {
            method1043(-101);
        }
        int var7 = var6 - class46.field776;
        int var8 = var5 - class148.field2314;
        int var9 = var4 - class104.field1666;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class71.field1207;
        if (class264.field4245 < var11) {
            class264.field4245 += (var11 - class264.field4245) * class299.field4796 / 1000 + class161.field2551;
            if (var11 < class264.field4245) {
                class264.field4245 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class264.field4245 > var11) {
            class264.field4245 -= (class264.field4245 - var11) * class299.field4796 / 1000 + class161.field2551;
            if (var11 > class264.field4245) {
                class264.field4245 = var11;
            }
        }
        if (var13 > 0) {
            class71.field1207 += class299.field4796 * var13 / 1000 + class161.field2551;
            class71.field1207 &= 0x7FF;
        }
        if (var13 < 0) {
            class71.field1207 -= -var13 * class299.field4796 / 1000 + class161.field2551;
            class71.field1207 &= 0x7FF;
        }
        int var14 = var12 - class71.field1207;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class71.field1207 = var12;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)I")
    public static final int method1043(int arg0) {
        field2373++;
        try {
            if (class227.field3668 == 0) {
                if ((class191.method1350((byte) -74) - 5000L) < class1.field18) {
                    return 0;
                }
                class230.field3720 = class268.field4323.method326(true, class272.field4368, class55.field915);
                class14.field152 = class191.method1350((byte) 88);
                class227.field3668 = 1;
            }
            if (arg0 != -26313) {
                method1042(-12);
            }
            if (class191.method1350((byte) 3) > (class14.field152 + 30000L)) {
                return class161.method1105(1000, 8);
            }
            if (class227.field3668 == 1) {
                if (class230.field3720.field2814 == 2) {
                    return class161.method1105(1001, 8);
                }
                if (class230.field3720.field2814 != 1) {
                    return -1;
                }
                class208.field3298 = new class139((Socket) class230.field3720.field2817, class268.field4323);
                class230.field3720 = null;
                int var1 = 0;
                if (class111.field1754) {
                    var1 = class30.field366;
                }
                class314.field5061.field2568 = 0;
                class314.field5061.method1108(23, true);
                class314.field5061.method1125(var1, 255);
                class208.field3298.method977(class314.field5061.field2573, class314.field5061.field2568, 0, arg0 ^ 0xCA0);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(arg0 + 26413);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(-112);
                }
                int var2 = class208.field3298.method978(-103);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(109);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(-102);
                }
                if (var2 != 0) {
                    return class161.method1105(var2, 8);
                }
                class227.field3668 = 2;
            }
            if (class227.field3668 == 2) {
                if (class208.field3298.method972(0) < 2) {
                    return -1;
                }
                class199.field3204 = class208.field3298.method978(-105);
                class199.field3204 <<= 0x8;
                class199.field3204 += class208.field3298.method978(-96);
                class227.field3668 = 3;
                class261.field4199 = new byte[class199.field3204];
                class196.field3178 = 0;
            }
            if (class227.field3668 != 3) {
                return -1;
            }
            int var3 = class208.field3298.method972(0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class199.field3204 - class196.field3178) {
                var3 = class199.field3204 - class196.field3178;
            }
            class208.field3298.method979(class261.field4199, arg0 ^ 0x66C8, class196.field3178, var3);
            class196.field3178 += var3;
            if (class196.field3178 < class199.field3204) {
                return -1;
            } else if (class311.method2080(class261.field4199, arg0 ^ 0x66B5)) {
                class188.field3049 = new class203[class181.field2958];
                int var4 = 0;
                for (int var5 = class180.field2942; var5 <= class77.field1287; var5++) {
                    class203 var6 = class298.method1969(var5, (byte) -127);
                    if (var6 != null) {
                        class188.field3049[var4++] = var6;
                    }
                }
                class208.field3298.method974((byte) 110);
                class261.field4199 = null;
                class227.field3668 = 0;
                class256.field4147 = 0;
                class208.field3298 = null;
                class1.field18 = class191.method1350((byte) -59);
                return 0;
            } else {
                return class161.method1105(1002, 8);
            }
        } catch (IOException var7) {
            return class161.method1105(1003, 8);
        }
    }
}
