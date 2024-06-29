import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class40 extends class101 {

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[I")
    public static int[] field483 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "[I")
    public static int[] field478 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Ljava/lang/String;")
    public static String field492 = null;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field491;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "[[I")
    public static int[][] field488;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 4)
    public static void method268(byte arg0) {
        field491 = null;
        field492 = null;
        if (arg0 > 41) {
            field488 = (int[][]) null;
            field483 = null;
            field478 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIILna;IIII)V", line = 18)
    public static final void method269(int arg0, int arg1, int arg2, int arg3, class22 arg4, int arg5, int arg6, int arg7, int arg8) {
        field486++;
        int var9 = arg0 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg4.field330;
            var10 = arg4.field293;
        } else {
            var10 = arg4.field330;
            var11 = arg4.field293;
        }
        if (arg8 <= 25) {
            method268((byte) 71);
        }
        int var12;
        int var13;
        if ((arg7 + var10) <= 104) {
            var12 = (var10 + 1 >> 1) + arg7;
            var13 = (var10 >> 1) + arg7;
        } else {
            var12 = arg7 + 1;
            var13 = arg7;
        }
        int var14 = (arg7 << 7) + (var10 << 6);
        int[][] var15 = class294.field4502[arg5];
        int var16 = (arg6 << 7) + (var11 << 6);
        int var17;
        int var18;
        if ((arg6 + var11) <= 104) {
            var17 = (var11 + 1 >> 1) + arg6;
            var18 = arg6 + (var11 >> 1);
        } else {
            var17 = arg6 + 1;
            var18 = arg6;
        }
        int var19 = var15[var13][var17] + var15[var13][var18] - (-var15[var12][var17] + -var15[var12][var18]) >> 2;
        int var20 = 0;
        if (arg5 != 0) {
            int[][] var21 = class294.field4502[0];
            var20 = var19 - (var21[var13][var18] + var21[var12][var18] + var21[var12][var17] + var21[var13][var17] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg5 < 3) {
            var22 = class294.field4502[arg5 + 1];
        }
        class245 var23 = arg4.method145(arg1, false, var14, -9367, var22, (class59) null, var19, var15, arg0, true, var16);
        class32.method234(var23.field3655, var14 - arg2, var20, var16 - arg3);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V", line = 97)
    public static final void method270(byte arg0) {
        if (arg0 <= -101) {
            for (int var1 = 0; var1 < 100; var1++) {
                class22.field298[var1] = true;
            }
            field479++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 120)
    public static final void method271(int arg0) {
        field487++;
        class249.method1679();
        if (arg0 <= 43) {
            field483 = (int[]) null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class325.field4896[var1].method1303((byte) -75);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 145)
    public static final void method272(boolean arg0) {
        if (!arg0) {
            field483 = (int[]) null;
        }
        class87.field1295 = null;
        class3.field8 = (byte[][][]) null;
        class93.field1396 = null;
        class240.field3574 = null;
        field489++;
        class326.field4912 = (byte[][][]) null;
        class144.field2178 = (byte[][][]) null;
        class22.field337 = (int[][][]) null;
        class250.field3730 = (byte[][][]) null;
        class212.field3225 = (byte[][][]) null;
        class182.field2716 = null;
        class246.field3662 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)Z", line = 168)
    public final boolean method273(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            field482++;
            return this.field493 <= arg0 && arg0 <= this.field485 && this.field490 <= arg1 && this.field484 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIII)V", line = 191)
    public class40(int arg0, int arg1, int arg2, int arg3) {
        this.field493 = arg0;
        this.field490 = arg1;
        this.field484 = arg3;
        this.field485 = arg2;
    }
}
