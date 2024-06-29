import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class559 {

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public static int field7963 = 0;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "Lbd;")
    public static class57 field7959 = new class57();

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
    public static int field7966 = 999999;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
    public static int field7965 = 0;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "S")
    public static short field7964 = 256;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "F")
    public static float field7960;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
    public static void method3156(int arg0) {
        field7959 = null;
        if (arg0 < 126) {
            field7961 = 53;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
    public static final void method3157(boolean arg0) {
        field7962++;
        int var1 = class656.field9367 * 512 + 256;
        int var2 = class67.field720 * 512 + 256;
        int var3 = class363.method1995(class353.field4625, var2, -1327568407, var1) - class403.field5376;
        if (class420.field5581 >= 100) {
            class662.field9411 = class67.field720 * 512 + 256;
            class345.field4493 = class656.field9367 * 512 + 256;
            class150.field1707 = class363.method1995(class353.field4625, class662.field9411, -1327568407, class345.field4493) - class403.field5376;
        } else {
            if (var1 > class345.field4493) {
                class345.field4493 += class500.field7204 + ((var1 - class345.field4493) * class420.field5581 / 1000);
                if (var1 < class345.field4493) {
                    class345.field4493 = var1;
                }
            }
            if (class345.field4493 > var1) {
                class345.field4493 -= (class345.field4493 - var1) * class420.field5581 / 1000 + class500.field7204;
                if (class345.field4493 < var1) {
                    class345.field4493 = var1;
                }
            }
            if (var3 > class150.field1707) {
                class150.field1707 += (var3 - class150.field1707) * class420.field5581 / 1000 + class500.field7204;
                if (var3 < class150.field1707) {
                    class150.field1707 = var3;
                }
            }
            if (class150.field1707 > var3) {
                class150.field1707 -= (class150.field1707 - var3) * class420.field5581 / 1000 + class500.field7204;
                if (var3 > class150.field1707) {
                    class150.field1707 = var3;
                }
            }
            if (class662.field9411 < var2) {
                class662.field9411 += (var2 - class662.field9411) * class420.field5581 / 1000 + class500.field7204;
                if (class662.field9411 > var2) {
                    class662.field9411 = var2;
                }
            }
            if (class662.field9411 > var2) {
                class662.field9411 -= (class662.field9411 - var2) * class420.field5581 / 1000 + class500.field7204;
                if (class662.field9411 < var2) {
                    class662.field9411 = var2;
                }
            }
        }
        if (arg0) {
            method3156(19);
        }
        int var4 = class566.field8023 * 512 + 256;
        int var5 = class399.field5335 * 512 + 256;
        int var6 = class363.method1995(class353.field4625, var4, -1327568407, var5) - class422.field5624;
        int var7 = var5 - class345.field4493;
        int var8 = var6 - class150.field1707;
        int var9 = var4 - class662.field9411;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class654.field9344) {
            class654.field9344 += (var11 - class654.field9344 >> 3) * class214.field2600 / 1000 + class19.field167 << 3;
            if (var11 < class654.field9344) {
                class654.field9344 = var11;
            }
        }
        if (var11 < class654.field9344) {
            class654.field9344 -= (class654.field9344 - var11 >> 3) * class214.field2600 / 1000 + class19.field167 << 3;
            if (var11 > class654.field9344) {
                class654.field9344 = var11;
            }
        }
        int var13 = var12 - class587.field8342;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class587.field8342 += class214.field2600 * var14 / 1000 + class19.field167 << 3;
            class587.field8342 &= 0x3FFF;
        }
        if (var14 < 0) {
            class587.field8342 -= -var14 * class214.field2600 / 1000 + class19.field167 << 3;
            class587.field8342 &= 0x3FFF;
        }
        int var15 = var12 - class587.field8342;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class587.field8342 = var12;
        }
        class352.field4616 = 0;
    }
}
