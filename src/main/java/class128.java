import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class128 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lkb;")
    private class62 field2755 = new class62();

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Llc;")
    public static class69 field2747 = class69.method470((byte) -107, "null");

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field2748 = 0;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Llc;")
    public static class69 field2751 = class69.method470((byte) -119, "earlier today");

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
    public static int[] field2759 = new int[2000];

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field2757 = 0;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Llc;")
    public static class69 field2760 = class69.method470((byte) -115, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
    public static boolean field2761 = false;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lqd;")
    public static class99 field2750;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILkb;)V")
    public final void method936(int arg0, class62 arg1) {
        field2756++;
        if (arg1.field1281 != null) {
            arg1.method380(-68);
        }
        arg1.field1281 = this.field2755.field1281;
        if (arg0 > 24) {
            arg1.field1276 = this.field2755;
            arg1.field1281.field1276 = arg1;
            arg1.field1276.field1281 = arg1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lkb;I)V")
    public final void method937(class62 arg0, int arg1) {
        field2752++;
        if (arg0.field1281 != null) {
            arg0.method380(-91);
        }
        arg0.field1281 = this.field2755;
        arg0.field1276 = this.field2755.field1276;
        int var3 = 124 % ((arg1 - 65) / 50);
        arg0.field1281.field1276 = arg0;
        arg0.field1276.field1281 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method938(byte arg0) {
        int var1 = 80 % ((arg0 + 8) / 60);
        for (int var2 = 0; var2 < class77.field1746; var2++) {
            int var3 = class108.field2410[var2];
            class72 var4 = class112.field2434[var3];
            int var5 = class3.field22.method703((byte) 118);
            if ((var5 & 0x20) != 0) {
                var4.field1076 = class3.field22.method665(8666);
                if (var4.field1076 == 65535) {
                    var4.field1076 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                int var6 = class3.field22.method694(-86);
                int var7 = class3.field22.method666(3053);
                var4.method326(class62.field1282, 90, var7, var6);
                var4.field1078 = class62.field1282 + 300;
                var4.field1040 = class3.field22.method709(-38);
                var4.field1052 = class3.field22.method694(-128);
            }
            if ((var5 & 0x8) != 0) {
                int var8 = class3.field22.method705(-31);
                int var9 = class3.field22.method703((byte) -77);
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var4.field1070 == var8 && var8 != -1) {
                    int var10 = class67.method435(115, var8).field1648;
                    if (var10 == 1) {
                        var4.field1032 = var9;
                        var4.field1033 = 0;
                        var4.field1025 = 0;
                        var4.field1022 = 0;
                    }
                    if (var10 == 2) {
                        var4.field1025 = 0;
                    }
                } else if (var8 == -1 || var4.field1070 == -1 || class67.method435(86, var8).field1665 >= class67.method435(86, var4.field1070).field1665) {
                    var4.field1022 = 0;
                    var4.field1025 = 0;
                    var4.field1070 = var8;
                    var4.field1032 = var9;
                    var4.field1044 = var4.field1048;
                    var4.field1033 = 0;
                }
            }
            if ((var5 & 0x1) != 0) {
                int var11 = class3.field22.method694(123);
                int var12 = class3.field22.method666(3053);
                var4.method326(class62.field1282, 82, var12, var11);
                var4.field1078 = class62.field1282 + 300;
                var4.field1040 = class3.field22.method703((byte) 82);
                var4.field1052 = class3.field22.method694(-7);
            }
            if ((var5 & 0x80) != 0) {
                var4.field1043 = class3.field22.method671(-118);
                int var13 = class3.field22.method701(3);
                var4.field1091 = var13 >> 16;
                if (var4.field1043 == 65535) {
                    var4.field1043 = -1;
                }
                var4.field1023 = 0;
                var4.field1036 = (var13 & 0xFFFF) + class62.field1282;
                var4.field1028 = 0;
                if (var4.field1036 > class62.field1282) {
                    var4.field1028 = -1;
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field1054 = class3.field22.method708(-23522);
                var4.field1026 = 100;
            }
            if ((var5 & 0x4) != 0) {
                var4.field1616 = class93.method661(9, class3.field22.method665(8666));
                var4.field1029 = var4.field1616.field1456;
                var4.field1042 = var4.field1616.field1471;
                var4.field1053 = var4.field1616.field1455;
                var4.field1060 = var4.field1616.field1478;
                var4.field1087 = var4.field1616.field1477;
                var4.field1079 = var4.field1616.field1442;
                var4.field1099 = var4.field1616.field1441;
            }
            if ((var5 & 0x10) != 0) {
                var4.field1098 = class3.field22.method665(8666);
                var4.field1030 = class3.field22.method670(-128);
            }
        }
        field2749++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lkb;")
    public final class62 method939(int arg0) {
        if (arg0 <= 34) {
            field2750 = null;
        }
        field2754++;
        class62 var2 = this.field2755.field1276;
        return this.field2755 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class128() {
        this.field2755.field1281 = this.field2755;
        this.field2755.field1276 = this.field2755;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Lkb;")
    public final class62 method940(int arg0) {
        class62 var2 = this.field2755.field1276;
        field2758++;
        if (this.field2755 == var2) {
            return null;
        }
        var2.method380(arg0 - 51);
        if (arg0 != -1) {
            this.method937(null, 110);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static void method941(byte arg0) {
        field2759 = null;
        field2751 = null;
        if (arg0 >= -7) {
            field2750 = null;
        }
        field2747 = null;
        field2750 = null;
        field2760 = null;
    }
}
