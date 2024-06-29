import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class46 extends class151 {

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field789 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lmb;")
    private static class132 field793 = class166.method1092("Checking for updates )2 ", 112);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lmb;")
    public static class132 field787 = field793;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lea;")
    public class46 field786;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Lea;")
    public class46 field794;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public final void method306(byte arg0) {
        int var2 = -1 % ((arg0 + 3) / 63);
        field788++;
        if (this.field794 != null) {
            this.field794.field786 = this.field786;
            this.field786.field794 = this.field794;
            this.field786 = null;
            this.field794 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
    public static final void method307(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class70.field1171 < 100) {
            class36.method257((byte) 75);
        }
        class239.method1517(arg0, arg2, arg0 + arg3, arg1 + arg2);
        class50.method336();
        class239.method1525(arg0, arg2, arg3, arg1, 0);
        field791++;
        if (class70.field1171 < 100) {
            byte var5 = 20;
            int var6 = arg0 + arg3 / 2;
            int var7 = arg1 / 2 + arg2 - var5 - 18;
            class239.method1528(var6 - 152, var7, 304, 34, 9179409);
            class239.method1528(var6 - 151, var7 + 1, 302, 32, 0);
            class239.method1525(var6 - 150, var7 + 2, class70.field1171 * 3, 30, 9179409);
            class239.method1525(var6 + class70.field1171 * 3 - 150, var7 + 2, 300 - class70.field1171 * 3, 30, 0);
            class53.field895.method674(class189.field3490, var6, var5 + var7, 16777215, -1);
            return;
        }
        class243.field4408 = class157.field2858 - (int) ((double) arg3 / class151.field2765);
        class4.field48 = (int) ((double) (arg1 * 2) / class151.field2765);
        class54.field907 = class56.field953 - (int) ((double) arg1 / class151.field2765);
        int var8 = class157.field2858 - (int) ((double) arg3 / class151.field2765);
        int var9 = (int) ((double) arg3 / class151.field2765) + class157.field2858;
        int var10 = class56.field953 - (int) ((double) arg1 / class151.field2765);
        if (arg4 < 76) {
            field790 = -80;
        }
        int var11 = class56.field953 + (int) ((double) arg1 / class151.field2765);
        class136.field2561 = (int) ((double) (arg3 * 2) / class151.field2765);
        class180.method1157(var10, arg0, arg2, var9, (byte) -127, var8, arg1 + arg2, var11, arg0 + arg3);
        class200.method1260(var10, (byte) 19, arg1 + arg2, arg0, var11, var9, arg0 + arg3, var8, arg2);
        if (class185.field3438 > 0) {
            class185.field3438--;
        }
        if (!class152.field2782) {
            return;
        }
        int var12 = arg2 + arg1 - 8;
        int var13 = 16776960;
        int var14 = arg0 + arg3 - 5;
        class15.field222.method678(class187.method1197(new class132[] { class210.field3859, class132.method889(class183.field3377, (byte) 123) }, -89), var14, var12, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var17 = var12 - 15;
        if (var16 > 32768 && class66.field1096) {
            var13 = 16711680;
        }
        if (var16 > 65536 && !class66.field1096) {
            var13 = 16711680;
        }
        class15.field222.method678(class187.method1197(new class132[] { class1.field5, class132.method889(var16, (byte) 105), class16.field233 }, -107), var14, var17, var13, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
    public static void method308(byte arg0) {
        if (arg0 >= -69) {
            field790 = 112;
        }
        field787 = null;
        field793 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Ldi;")
    public static final class43 method309(int arg0, int arg1) {
        if (arg0 <= 42) {
            return null;
        }
        field796++;
        if (arg1 == 0) {
            return new class135();
        } else if (arg1 == 1) {
            return new class27();
        } else if (arg1 == 2) {
            return new class131();
        } else if (arg1 == 3) {
            return new class147();
        } else if (arg1 == 4) {
            return new class190();
        } else if (arg1 == 5) {
            return new class184();
        } else if (arg1 == 6) {
            return new class222();
        } else if (arg1 == 7) {
            return new class205();
        } else if (arg1 == 8) {
            return new class95();
        } else if (arg1 == 9) {
            return new class93();
        } else if (arg1 == 10) {
            return new class173();
        } else if (arg1 == 11) {
            return new class104();
        } else if (arg1 == 12) {
            return new class33();
        } else if (arg1 == 13) {
            return new class13();
        } else if (arg1 == 14) {
            return new class237();
        } else if (arg1 == 15) {
            return new class154();
        } else if (arg1 == 16) {
            return new class139();
        } else if (arg1 == 17) {
            return new class168();
        } else if (arg1 == 18) {
            return new class241();
        } else if (arg1 == 19) {
            return new class138();
        } else if (arg1 == 20) {
            return new class127();
        } else if (arg1 == 21) {
            return new class72();
        } else if (arg1 == 22) {
            return new class166();
        } else if (arg1 == 23) {
            return new class225();
        } else if (arg1 == 24) {
            return new class86();
        } else if (arg1 == 25) {
            return new class130();
        } else if (arg1 == 26) {
            return new class38();
        } else if (arg1 == 27) {
            return new class213();
        } else if (arg1 == 28) {
            return new class232();
        } else if (arg1 == 29) {
            return new class69();
        } else if (arg1 == 30) {
            return new class189();
        } else if (arg1 == 31) {
            return new class230();
        } else if (arg1 == 32) {
            return new class66();
        } else if (arg1 == 33) {
            return new class116();
        } else if (arg1 == 34) {
            return new class36();
        } else if (arg1 == 35) {
            return new class41();
        } else if (arg1 == 36) {
            return new class235();
        } else if (arg1 == 37) {
            return new class103();
        } else if (arg1 == 38) {
            return new class88();
        } else if (arg1 == 39) {
            return new class89();
        } else {
            return null;
        }
    }
}
