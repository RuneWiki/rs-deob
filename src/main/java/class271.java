import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class271 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3666 = 0;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lfd;")
    public static class194 field3671;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[[[B")
    public static byte[][][] field3670;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lgs;", line = 5)
    public static final class40 method1501(int arg0) {
        if (arg0 != -1872773629) {
            field3666 = -103;
        }
        field3669++;
        class40 var1 = (class40) class380.field5363.method399(127);
        if (var1 != null) {
            var1.method1967(-1);
            var1.method1009((byte) 122);
            return var1;
        }
        class40 var2;
        do {
            var2 = (class40) class96.field1119.method399(arg0 + 1872773755);
            if (var2 == null) {
                return null;
            }
            if (var2.method191(31520) > class442.method2730(25207)) {
                return null;
            }
            var2.method1967(-1);
            var2.method1009((byte) -19);
        } while ((var2.field2365 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 46)
    public static void method1502(int arg0) {
        field3670 = null;
        if (arg0 == 5055) {
            field3671 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V", line = 63)
    public static final void method1503(int arg0) {
        field3668++;
        int var1 = class324.field4324 * 128 + 64;
        int var2 = class330.field4397 * 128 + 64;
        int var3 = class201.method1098(var1, var2, class263.field3592, (byte) -104) - class296.field4022;
        if (class125.field1610 >= 100) {
            class180.field2272 = class330.field4397 * 128 + 64;
            class127.field1633 = class324.field4324 * 128 + 64;
            class175.field2197 = class201.method1098(class127.field1633, class180.field2272, class263.field3592, (byte) -111) - class296.field4022;
        } else {
            if (class127.field1633 < var1) {
                class127.field1633 += (var1 - class127.field1633) * class125.field1610 / 1000 + class309.field4179;
                if (var1 < class127.field1633) {
                    class127.field1633 = var1;
                }
            }
            if (class127.field1633 > var1) {
                class127.field1633 -= (class127.field1633 - var1) * class125.field1610 / 1000 + class309.field4179;
                if (var1 > class127.field1633) {
                    class127.field1633 = var1;
                }
            }
            if (class175.field2197 < var3) {
                class175.field2197 += class309.field4179 + ((var3 - class175.field2197) * class125.field1610 / 1000);
                if (class175.field2197 > var3) {
                    class175.field2197 = var3;
                }
            }
            if (class175.field2197 > var3) {
                class175.field2197 -= class309.field4179 + ((class175.field2197 - var3) * class125.field1610 / 1000);
                if (class175.field2197 < var3) {
                    class175.field2197 = var3;
                }
            }
            if (class180.field2272 < var2) {
                class180.field2272 += class309.field4179 + ((var2 - class180.field2272) * class125.field1610 / 1000);
                if (var2 < class180.field2272) {
                    class180.field2272 = var2;
                }
            }
            if (class180.field2272 > var2) {
                class180.field2272 -= class309.field4179 + ((class180.field2272 - var2) * class125.field1610 / 1000);
                if (class180.field2272 < var2) {
                    class180.field2272 = var2;
                }
            }
        }
        int var4 = class139.field1781 * 128 + 64;
        int var5 = class128.field1654 * 128 + 64;
        int var6 = class201.method1098(var5, var4, class263.field3592, (byte) 106) - class162.field2074;
        int var7 = var5 - class127.field1633;
        int var8 = var6 - class175.field2197;
        int var9 = var4 - class180.field2272;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (arg0 >= -22) {
            return;
        }
        if (class67.field700 < var11) {
            class67.field700 += class219.field2934 + ((var11 - class67.field700 >> 3) * class168.field2130 / 1000) << 3;
            if (class67.field700 > var11) {
                class67.field700 = var11;
            }
        }
        if (var11 < class67.field700) {
            class67.field700 -= (class67.field700 - var11 >> 3) * class168.field2130 / 1000 + class219.field2934 << 3;
            if (var11 > class67.field700) {
                class67.field700 = var11;
            }
        }
        int var13 = var12 - class308.field4177;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class308.field4177 += class168.field2130 * var14 / 1000 + class219.field2934 << 3;
            class308.field4177 &= 0x3FFF;
        }
        if (var14 < 0) {
            class308.field4177 -= class219.field2934 + (-var14 * class168.field2130 / 1000) << 3;
            class308.field4177 &= 0x3FFF;
        }
        int var15 = var12 - class308.field4177;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class308.field4177 = var12;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIB)V", line = 219)
    public static final void method1504(int arg0, int arg1, int arg2, byte arg3) {
        field3667++;
        int var4 = arg0 << 3;
        int var5 = arg1 << 3;
        int var6 = -107 % ((arg3 + 36) / 48);
        int var7 = arg2 << 3;
        class41.field432 = (float) var4;
        if (class294.field3993 == 2) {
            class308.field4177 = var5;
            class92.field1054 = var7;
            class67.field700 = var4;
        }
        class425.field6241 = (float) var5;
        class203.method1103(0);
        class69.field726 = true;
    }
}
