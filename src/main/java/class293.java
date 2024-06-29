import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class293 extends class190 {

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Z")
    public static boolean field4106 = false;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lk;")
    public static class337 field4104;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Ljava/lang/String;")
    public String field4107;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static void method1894(byte arg0) {
        if (arg0 >= -120) {
            method1895(-44);
        }
        field4104 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method1895(int arg0) {
        field4102++;
        int var1 = class389.field5585 * 128 + 64;
        int var2 = class89.field1239 * 128 + 64;
        int var3 = class285.method1858(var1, class142.field2034, var2, -123) - class100.field1382;
        if (class275.field3829 < 100) {
            if (var1 > class106.field1447) {
                class106.field1447 += (var1 - class106.field1447) * class275.field3829 / 1000 + class42.field615;
                if (var1 < class106.field1447) {
                    class106.field1447 = var1;
                }
            }
            if (var3 > class7.field107) {
                class7.field107 += class42.field615 + ((var3 - class7.field107) * class275.field3829 / 1000);
                if (class7.field107 > var3) {
                    class7.field107 = var3;
                }
            }
            if (class106.field1447 > var1) {
                class106.field1447 -= (class106.field1447 - var1) * class275.field3829 / 1000 + class42.field615;
                if (class106.field1447 < var1) {
                    class106.field1447 = var1;
                }
            }
            if (var2 > class20.field376) {
                class20.field376 += (var2 - class20.field376) * class275.field3829 / 1000 + class42.field615;
                if (class20.field376 > var2) {
                    class20.field376 = var2;
                }
            }
            if (class7.field107 > var3) {
                class7.field107 -= (class7.field107 - var3) * class275.field3829 / 1000 + class42.field615;
                if (class7.field107 < var3) {
                    class7.field107 = var3;
                }
            }
            if (class20.field376 > var2) {
                class20.field376 -= (class20.field376 - var2) * class275.field3829 / 1000 + class42.field615;
                if (class20.field376 < var2) {
                    class20.field376 = var2;
                }
            }
        } else {
            class106.field1447 = class389.field5585 * 128 + 64;
            class20.field376 = class89.field1239 * 128 + 64;
            class7.field107 = class285.method1858(class106.field1447, class142.field2034, class20.field376, -76) - class100.field1382;
        }
        int var4 = class94.field1302 * 128 + 64;
        int var5 = class197.field2711 * 128 + 64;
        int var6 = class285.method1858(var4, class142.field2034, var5, -49) - class403.field5715;
        int var7 = var4 - class106.field1447;
        int var8 = var6 - class7.field107;
        int var9 = var5 - class20.field376;
        if (arg0 < 53) {
            method1895(-105);
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class329.field4568 < var11) {
            class329.field4568 += (var11 - class329.field4568 >> 3) * class335.field4609 / 1000 + class211.field2955 << 3;
            if (class329.field4568 > var11) {
                class329.field4568 = var11;
            }
        }
        if (class329.field4568 > var11) {
            class329.field4568 -= (class329.field4568 - var11 >> 3) * class335.field4609 / 1000 + class211.field2955 << 3;
            if (var11 > class329.field4568) {
                class329.field4568 = var11;
            }
        }
        int var13 = var12 - class369.field5199;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class369.field5199 += class211.field2955 + (class335.field4609 * var14 / 1000) << 3;
            class369.field5199 &= 0x3FFF;
        }
        if (var14 < 0) {
            class369.field5199 -= class211.field2955 + (-var14 * class335.field4609 / 1000) << 3;
            class369.field5199 &= 0x3FFF;
        }
        int var15 = var12 - class369.field5199;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class155.field2192 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class369.field5199 = var12;
        }
    }
}
