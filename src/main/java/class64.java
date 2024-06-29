import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class64 extends class12 {

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "Lkb;")
    public static class93 field1016 = class76.method390("blinken2:", 0);

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Lkb;")
    public static class93 field1019 = class76.method390("swe", 0);

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "[[B")
    public static byte[][] field1018 = new byte[250][];

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Lkb;")
    public static class93 field1020 = class76.method390("(U3", 0);

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Lkb;")
    public static class93 field1012 = class76.method390("Diese Betatest)2Welt ist nur f-Ur eingeladene", 0);

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lkb;")
    public static class93 field1026 = class76.method390("<col=ff9040>", 0);

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "Lkb;")
    public static class93 field1028 = class76.method390("(Y<)4col>", 0);

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "[I")
    public static int[] field1024 = new int[100];

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field1023 = -1;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "Lna;")
    public static class119 field1036;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "Ltb;")
    public static class174 field1014;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "Lkb;")
    public class93 field1035;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[I")
    public static int[] field1010;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "[I")
    public int[] field1015;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "[I")
    public static int[] field1029;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "[I")
    public int[] field1033;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "[Lkb;")
    public class93[] field1034;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lme;Lge;II)V")
    public static final void method325(class114 arg0, class61 arg1, int arg2, int arg3) {
        field1027++;
        class155 var4 = new class155();
        var4.field3047 = 1;
        var4.field3057 = arg0;
        var4.field718 = arg2;
        var4.field3053 = arg1;
        class122 var5 = class182.field3590;
        synchronized (class182.field3590) {
            class182.field3590.method691(var4, (byte) 51);
        }
        int var6 = -4 % ((-arg3 - 40) / 40);
        class24.method137((byte) -67);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V")
    public static final void method326(byte arg0) {
        field1025++;
        if (!class101.field1853) {
            return;
        }
        class186.field3666 = null;
        class73.field1350 = null;
        class76.field1378 = null;
        class97.field1794 = null;
        field1029 = null;
        class114.field2127 = null;
        class139.field2707 = null;
        class155.field3051 = null;
        class2.field30 = null;
        class34.field544 = null;
        class113.field2105 = null;
        class192.field3742 = null;
        class1.field27 = null;
        class47.field759 = null;
        class148.field2844 = null;
        class166.field3320 = null;
        class141.field2758 = null;
        class145.field2825 = null;
        class89.field1611 = null;
        class102.field1881 = null;
        class174.field3450 = null;
        class9.field155 = null;
        class117.method650(2, (byte) 119);
        class102.method570(true, 255);
        class101.field1853 = false;
        if (arg0 != 54) {
            field1019 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method327(int arg0, Random arg1, int arg2) {
        field1031++;
        if (arg2 != 10093) {
            field1019 = null;
        }
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class3.method13(arg0, 121)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class103.method573(arg0, 98, var4);
        }
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(B)V")
    public static final void method328(byte arg0) {
        class138.field2674++;
        field1022++;
        class151.field2908.method47(86, 8);
        if (arg0 < 60) {
            method329(-62, 64, -26, 0, -75, 110, 52);
        }
        class151.field2908.method1064(0L, -1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1011++;
        if (arg0 >= -100) {
            return;
        }
        int var7 = 2048 - arg6 & 0x7FF;
        int var8 = 2048 - arg1 & 0x7FF;
        int var9 = 0;
        int var10 = arg3;
        int var11 = 0;
        if (var8 != 0) {
            int var12 = class150.field2888[var8];
            int var13 = class150.field2896[var8];
            int var14 = var11 * var12 - arg3 * var13 >> 16;
            var10 = var11 * var13 + arg3 * var12 >> 16;
            var11 = var14;
        }
        if (var7 != 0) {
            int var15 = class150.field2896[var7];
            int var16 = class150.field2888[var7];
            int var17 = var9 * var16 + var10 * var15 >> 16;
            var10 = var10 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class108.field1965 = arg5 - var11;
        class81.field1497 = arg2 - var10;
        class141.field2763 = arg6;
        class152.field2939 = arg4 - var9;
        class184.field3629 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V")
    public static void method330(boolean arg0) {
        field1014 = null;
        if (arg0) {
            method329(-51, -90, 96, 33, -67, 27, -71);
        }
        field1020 = null;
        field1016 = null;
        field1018 = null;
        field1029 = null;
        field1024 = null;
        field1010 = null;
        field1028 = null;
        field1012 = null;
        field1019 = null;
        field1036 = null;
        field1026 = null;
    }
}
