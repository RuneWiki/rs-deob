import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class63 {

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
    private int[] field1544;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lgd;")
    public static class40 field1538 = class14.method90(false, "redstone2");

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lgd;")
    public static class40 field1545 = class14.method90(false, "Sprites geladen)3");

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lgd;")
    public static class40 field1543 = class14.method90(false, "Empf-=nger:");

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lhd;")
    public static class46 field1548;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "[I")
    public static int[] field1550;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I", line = 12)
    public final int method456(int arg0, int arg1) {
        field1549++;
        int var3 = this.field1544.length + arg0;
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field1544[var4];
            if (arg1 == var5) {
                return this.field1544[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 43)
    public static final void method457(byte arg0) {
        field1547++;
        if (class64.field1571) {
            class64.field1571 = false;
            class136.method1073(arg0 ^ 0xFFFFFF53);
            class90.field2030 = true;
            class79.field1820 = true;
            class122.field2880 = true;
            class45.field1124 = true;
        }
        class79.method527(true);
        if (class90.field2040 && class113.field2742 == 1) {
            class45.field1124 = true;
        }
        if (class18.field440 != -1) {
            boolean var1 = class44.method305(arg0 ^ 0x33A04D6E, class18.field440);
            if (var1) {
                class45.field1124 = true;
            }
        }
        if (class35.field892 == 2) {
            class45.field1124 = true;
        }
        if (class43.field1090 == 2) {
            class45.field1124 = true;
        }
        if (arg0 != -98) {
            method457((byte) 2);
        }
        if (class45.field1124) {
            class45.field1124 = false;
            class77.method518(33);
        }
        if (class108.field2624 == -1) {
            class31.field783.field697 = class83.field1877 - class130.field3134 - 77;
            if (class40.field1001 > 448 && class40.field1001 < 560 && class135.field3282 > 332) {
                class58.method434(class135.field3282 - 357, class40.field1001 + -17, 0, class83.field1877, -1, class31.field783, 77, 463, (byte) -127);
            }
            int var2 = class83.field1877 - class31.field783.field697 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class83.field1877 - 77) {
                var2 = class83.field1877 - 77;
            }
            if (class130.field3134 != var2) {
                class130.field3134 = var2;
                class122.field2880 = true;
            }
        }
        if (class108.field2624 == -1 && class53.field1347 == 3) {
            class31.field783.field697 = class69.field1664;
            int var3 = class94.field2174 * 14 + 7;
            if (class40.field1001 > 448 && class40.field1001 < 560 && class135.field3282 > 332) {
                class58.method434(class135.field3282 - 357, class40.field1001 + -17, 0, var3, -1, class31.field783, 77, 463, (byte) 63);
            }
            int var4 = class31.field783.field697;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class69.field1664 != var4) {
                class122.field2880 = true;
                class69.field1664 = var4;
            }
        }
        if (class108.field2624 != -1) {
            boolean var5 = class44.method305(-866143504, class108.field2624);
            if (var5) {
                class122.field2880 = true;
            }
        }
        if (class35.field892 == 3) {
            class122.field2880 = true;
        }
        if (class43.field1090 == 3) {
            class122.field2880 = true;
        }
        if (class135.field3285 != null) {
            class122.field2880 = true;
        }
        if (class90.field2040 && class113.field2742 == 2) {
            class122.field2880 = true;
        }
        if (class122.field2880) {
            class122.field2880 = false;
            class42.method284((byte) 81);
        }
        class104.method784(0);
        if (class112.field2705 != -1) {
            class79.field1820 = true;
        }
        if (class79.field1820) {
            if (class112.field2705 != -1 && class126.field3014 == class112.field2705) {
                class112.field2705 = -1;
                class94.field2177++;
                class92.field2094.method290((byte) 0, 164);
                class92.field2094.method756(class126.field3014, 1);
            }
            class79.field1820 = false;
            class114.field2748 = true;
            class48.method371(class10.field242 % 20 >= 10 ? class112.field2705 : -1, class107.field2604, class18.field440 == -1, (byte) -126, class126.field3014);
        }
        if (class90.field2030) {
            class114.field2748 = true;
            class90.field2030 = false;
            class87.method573(true, class76.field1765, class1.field23, class133.field3238, class94.field2163);
        }
        class1.method6((byte) 94, class13.field332.field792, class86.field1919, class99.field2361, class13.field332.field838);
        class86.field1919 = 0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 208)
    public static void method458(int arg0) {
        field1545 = null;
        field1543 = null;
        field1548 = null;
        field1538 = null;
        if (arg0 != -11) {
            method457((byte) 110);
        }
        field1550 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([I)V", line = 251)
    public class63(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1544 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1544[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1544[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1544[var5 + var5] = arg0[var4];
            this.field1544[var5 + var5 + 1] = var4++;
        }
    }
}
