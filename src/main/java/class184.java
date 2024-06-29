import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class184 extends class61 {

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lng;")
    public static class139 field3331 = new class139(20);

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Z")
    public static boolean field3341 = false;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field3338 = 0;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field3344 = 0;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Llc;")
    public static class143 field3335 = class66.method374("floorshadows", -1);

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "J")
    public static long field3334 = 0L;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "Lh;")
    public static class190 field3346 = new class190(new byte[5000]);

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "Llc;")
    public static class143 field3350 = class66.method374(")2", -1);

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "[Llc;")
    public static class143[] field3351 = new class143[100];

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "Llc;")
    private static class143 field3353 = class66.method374("Loading title screen )2 ", -1);

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Llc;")
    public static class143 field3348 = field3353;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Llc;")
    public static class143 field3352 = class66.method374(":", -1);

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Lne;")
    public static class206 field3342;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public static final void method1200(int arg0) {
        if (arg0 == 4212) {
            field3340++;
            class39.field667.method824(-123);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
    public final boolean method1201(int arg0, int arg1, int arg2) {
        field3333++;
        if (arg1 < 31) {
            return false;
        } else {
            return arg2 >= this.field3343 && arg2 <= this.field3347 && arg0 >= this.field3345 && this.field3330 >= arg0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3336++;
        if (arg6 < 44) {
            method1200(-1);
        }
        if (arg2 == arg3) {
            class101.method608(arg7, 0, arg4, arg1, arg0, arg2, arg5);
        } else if ((arg5 - arg2) >= class31.field481 && arg2 + arg5 <= class9.field173 && arg1 - arg3 >= class188.field3398 && class239.field4321 >= (arg1 + arg3)) {
            class99.method585(arg3, arg0, arg5, -1, arg7, arg2, arg1, arg4);
        } else {
            class61.method348(arg4, arg2, arg5, arg0, arg7, true, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(III)I")
    public static final int method1203(int arg0, int arg1, int arg2) {
        field3332++;
        int var3 = 99 / ((82 - arg2) / 41);
        int var4 = 0;
        while (arg1 > 0) {
            arg1--;
            var4 = var4 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1204(byte arg0) {
        field3352 = null;
        field3335 = null;
        field3342 = null;
        field3351 = null;
        if (arg0 >= -43) {
            method1202(122, -61, -108, 121, -12, -124, 85, -102);
        }
        field3350 = null;
        field3348 = null;
        field3331 = null;
        field3346 = null;
        field3353 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLlc;)V")
    public static final void method1205(byte arg0, class143 arg1) {
        if (arg0 != -26) {
            return;
        }
        field3337++;
        if (class162.field2914 >= 2) {
            if (arg1.method895((byte) -90, class92.field1648)) {
                class140.method839((byte) 95);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class170.method1119((class143) null, arg0 + 4122, class25.method179(0, new class143[] { class116.field2033, class274.method1806(var4, true), class201.field3674 }), 0);
            }
            if (arg1.method895((byte) -88, class66.field1254)) {
                class287.method1877(0);
            }
            if (arg1.method895((byte) -100, class269.field4822)) {
                class79.field1430.method1858(-54);
            }
            if (arg1.method895((byte) -80, class283.field4997)) {
                class79.field1430.method1857(743142753);
            }
            if (arg1.method895((byte) -115, class221.field4003)) {
                class4.field62.method459((byte) 116);
                class17.field298.method1688(13);
                class79.field1430.method1851(arg0 ^ 0xFFFF9A0D);
            }
            if (arg1.method895((byte) -94, class89.field1626)) {
                class201.field3672 = true;
            }
            if (arg1.method895((byte) -118, class240.field4345)) {
                class43.method271(25, -103);
            }
            if (arg1.method895((byte) -102, class74.field1380)) {
                class194.field3593 = true;
            }
            if (arg1.method895((byte) -81, class59.field1134)) {
                class194.field3593 = false;
            }
            if (arg1.method895((byte) -94, class254.field4554)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class171.field3052[var5].field1868[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method903(class234.field4249, 13544) && class235.field4290 != 0) {
                class116.method720(arg1.method863(6, arg0 ^ 0xB9).method887((byte) 103), (byte) -26);
            }
            if (arg1.method895((byte) -127, class20.field322) && class235.field4290 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method903(class175.field3143, arg0 ^ 0xFFFFCB0E)) {
                class57.field1109 = arg1.method863(12, arg0 - 135).method890(16277).method887((byte) 93);
                class170.method1119((class143) null, 4096, class25.method179(0, new class143[] { class237.field4303, class274.method1806(class57.field1109, true) }), 0);
            }
            if (arg1.method895((byte) -107, class268.field4805)) {
                field3341 = true;
            }
        }
        class285.field5010.method799(103, 144);
        class285.field5010.method1276(844519173, arg1.method913((byte) 45) - 1);
        class37.field656++;
        class285.field5010.method1255(arg1.method863(2, -161), (byte) 0);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIII)V")
    public class184(int arg0, int arg1, int arg2, int arg3) {
        this.field3347 = arg2;
        this.field3343 = arg0;
        this.field3345 = arg1;
        this.field3330 = arg3;
    }
}
