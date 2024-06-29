import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class89 extends class30 {

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lia;")
    private static class257 field1702 = class28.method234(93, "Cancel");

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "[J")
    public static long[] field1708 = new long[256];

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "Lia;")
    public static class257 field1710 = field1702;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Lia;")
    public static class257 field1713;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "Lia;")
    private static class257 field1715;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Lia;")
    public static class257 field1717;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Lia;")
    public static class257 field1714;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "Lia;")
    public static class257 field1716;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "Lme;")
    public static class44 field1712;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)I")
    public static final int method661(int arg0, int arg1) {
        field1704++;
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == arg1) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lpb;")
    public static final class154 method662(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3012; var4++) {
            class154 var5 = var3.field3017[var4];
            if ((var5.field2702 >> 29 & 0x3L) == 2L && var5.field2693 == arg1 && var5.field2688 == arg2) {
                class50.method390(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILme;)V")
    public static final void method663(int arg0, class44 arg1) {
        int var2 = arg1.field949;
        field1718++;
        if (var2 == 324) {
            if (class108.field2011 == -1) {
                class180.field3107 = arg1.field976;
                class108.field2011 = arg1.field956;
            }
            if (class120.field2171.field4226) {
                arg1.field956 = class108.field2011;
            } else {
                arg1.field956 = class180.field3107;
            }
        } else if (var2 == 325) {
            if (class108.field2011 == -1) {
                class108.field2011 = arg1.field956;
                class180.field3107 = arg1.field976;
            }
            if (class120.field2171.field4226) {
                arg1.field956 = class180.field3107;
            } else {
                arg1.field956 = class108.field2011;
            }
        } else if (var2 == 327) {
            arg1.field870 = 150;
            arg1.field966 = (int) (Math.sin((double) class7.field153 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field930 = -1;
            arg1.field959 = 5;
        } else if (var2 == 328) {
            if (class137.field2441.field3140 == null) {
                arg1.field930 = 0;
            } else {
                arg1.field870 = 150;
                arg1.field966 = (int) (Math.sin((double) class7.field153 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field959 = 5;
                arg1.field930 = ((int) class137.field2441.field3140.method1668(-69) << 11) + 2047;
                arg1.field903 = class137.field2441.field4187;
                arg1.field878 = class137.field2441.field4170;
            }
        } else if (arg0 != -66) {
            field1702 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static final void method664(byte arg0) {
        int var1 = 23 / ((40 - arg0) / 33);
        class158.field2761.method833(0);
        field1709++;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public static void method665(int arg0) {
        field1708 = null;
        field1710 = null;
        field1714 = null;
        field1717 = null;
        field1702 = null;
        field1713 = null;
        if (arg0 != 1) {
            method666((class152) null, 88);
        }
        field1712 = null;
        field1715 = null;
        field1716 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lk;I)Lka;")
    public static final class46 method666(class152 arg0, int arg1) {
        if (arg1 == 8) {
            field1699++;
            return new class46(arg0.method1075(-7903), arg0.method1075(arg1 ^ 0xFFFFE129), arg0.method1075(-7903), arg0.method1075(-7903), arg0.method1064((byte) -108), arg0.method1064((byte) -119), arg0.method1051((byte) -68));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(II)V")
    public class89(int arg0, int arg1) {
        this.field1705 = arg1;
        this.field1700 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILvb;)V")
    public static final void method667(int arg0, int arg1, class226 arg2) {
        field1701++;
        if (class50.field1112 != null) {
            class50.field1112.field2677 = arg0 * 8 + 5;
            int var3 = class50.field1112.method1042(113);
            int var4 = class50.field1112.method1042(120);
            arg2.method1481(var4, -74, var3);
            return;
        }
        class250.method1635(true, 255, (byte) 0, false, (class226) null, 255, 0);
        if (arg1 <= 7) {
            method661(13, -76);
        }
        class80.field1563[arg0] = arg2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1708[var0] = var1;
        }
        field1713 = class28.method234(107, "titlebg");
        field1715 = class28.method234(94, "wishes to trade with you)3");
        field1717 = class28.method234(101, "null");
        field1714 = field1715;
        field1716 = class28.method234(79, "");
    }
}
