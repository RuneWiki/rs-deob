import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class115 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Ljd;")
    public static class85 field2055 = class221.method1499(")3", (byte) 117);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[S")
    public static short[] field2054 = new short[256];

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljd;")
    public static class85 field2061 = class221.method1499("scrollen:", (byte) 94);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2058 = 0;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ljb;")
    public static class255 field2057;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Ljd;")
    public static class85 field2063;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method809(boolean arg0) {
        field2061 = null;
        field2063 = null;
        field2055 = null;
        field2054 = null;
        field2057 = null;
        if (arg0) {
            method813(-82, 97);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lqb;III)V")
    public static final void method810(class56 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class122.field2140) {
            class208 var4 = class99.field1780[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3653 != null && var4.field3653.field1700.method378()) {
                arg0.method373(var4.field3653.field1700, 128, 0, 0, true);
            }
        }
        if (arg3 < class122.field2140) {
            class208 var5 = class99.field1780[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3653 != null && var5.field3653.field1700.method378()) {
                arg0.method373(var5.field3653.field1700, 0, 0, 128, true);
            }
        }
        if (arg2 < class122.field2140 && arg3 < class202.field3521) {
            class208 var6 = class99.field1780[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3653 != null && var6.field3653.field1700.method378()) {
                arg0.method373(var6.field3653.field1700, 128, 0, 128, true);
            }
        }
        if (arg2 < class122.field2140 && arg3 > 0) {
            class208 var7 = class99.field1780[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3653 != null && var7.field3653.field1700.method378()) {
                arg0.method373(var7.field3653.field1700, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method811(int arg0) {
        field2053++;
        int var1 = class74.field1385 * 128 + 64;
        int var2 = class119.field2117 * 128 + 64;
        int var3 = class246.method1660(604124551, var1, class116.field2066, var2) - class83.field1510;
        if (class128.field2256 >= 100) {
            class272.field4809 = class119.field2117 * 128 + 64;
            class267.field4762 = class74.field1385 * 128 + 64;
            class231.field3987 = class246.method1660(604124551, class267.field4762, class116.field2066, class272.field4809) - class83.field1510;
        } else {
            if (class267.field4762 < var1) {
                class267.field4762 += (var1 - class267.field4762) * class128.field2256 / 1000 + class75.field1394;
                if (var1 < class267.field4762) {
                    class267.field4762 = var1;
                }
            }
            if (class272.field4809 < var2) {
                class272.field4809 += (var2 - class272.field4809) * class128.field2256 / 1000 + class75.field1394;
                if (var2 < class272.field4809) {
                    class272.field4809 = var2;
                }
            }
            if (var2 < class272.field4809) {
                class272.field4809 -= (class272.field4809 - var2) * class128.field2256 / 1000 + class75.field1394;
                if (var2 > class272.field4809) {
                    class272.field4809 = var2;
                }
            }
            if (var3 > class231.field3987) {
                class231.field3987 += (var3 - class231.field3987) * class128.field2256 / 1000 + class75.field1394;
                if (class231.field3987 > var3) {
                    class231.field3987 = var3;
                }
            }
            if (class267.field4762 > var1) {
                class267.field4762 -= class75.field1394 + ((class267.field4762 - var1) * class128.field2256 / 1000);
                if (var1 > class267.field4762) {
                    class267.field4762 = var1;
                }
            }
            if (var3 < class231.field3987) {
                class231.field3987 -= (class231.field3987 - var3) * class128.field2256 / 1000 + class75.field1394;
                if (var3 > class231.field3987) {
                    class231.field3987 = var3;
                }
            }
        }
        int var4 = class11.field181 * 128 + 64;
        if (arg0 <= 59) {
            return;
        }
        int var5 = class160.field2750 * 128 + 64;
        int var6 = class246.method1660(604124551, var5, class116.field2066, var4) - class117.field2099;
        int var7 = var4 - class272.field4809;
        int var8 = var6 - class231.field3987;
        int var9 = var5 - class267.field4762;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var9, (double) var7) * -325.949D) & 0x7FF;
        int var13 = var12 - class35.field547;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class252.field4347 < var11) {
            class252.field4347 += (var11 - class252.field4347) * class211.field3706 / 1000 + class249.field4289;
            if (var11 < class252.field4347) {
                class252.field4347 = var11;
            }
        }
        if (var11 < class252.field4347) {
            class252.field4347 -= (class252.field4347 - var11) * class211.field3706 / 1000 + class249.field4289;
            if (class252.field4347 < var11) {
                class252.field4347 = var11;
            }
        }
        if (var13 > 0) {
            class35.field547 += class211.field3706 * var13 / 1000 + class249.field4289;
            class35.field547 &= 0x7FF;
        }
        if (var13 < 0) {
            class35.field547 -= -var13 * class211.field3706 / 1000 + class249.field4289;
            class35.field547 &= 0x7FF;
        }
        int var14 = var12 - class35.field547;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class35.field547 = var12;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
    public static final void method812(int arg0, byte arg1) {
        class15.field217.method1267(arg0, (byte) -31);
        field2062++;
        class68.field1268.method1267(arg0, (byte) -94);
        class74.field1381.method1267(arg0, (byte) -86);
        if (arg1 != 28) {
            field2064 = -5;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    public static final int method813(int arg0, int arg1) {
        field2059++;
        if (arg0 != 1000) {
            field2061 = null;
        }
        return arg1 >>> 8;
    }
}
