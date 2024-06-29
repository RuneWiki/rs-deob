import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class259 {

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public int field1 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public int field5 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public int field9 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public int field3 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public int field13 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public int field12 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public int field14 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public int field18 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lhf;")
    public class159 field10;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lie;")
    public static class2 field11 = new class2();

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field15 = -1;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field17 = -1;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field16 = 0;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Ljava/lang/String;")
    public static String field21 = "level: ";

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Llc;")
    public static class270 field19;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "Llc;")
    public static class270 field20;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[[I")
    public static int[][] field8;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIILff;IZJ)Z")
    public static final boolean method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class4 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class277.field4486 == class103.field1792;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class159.field2481 || var24 >= class7.field67) {
                    return false;
                }
                class313 var25 = class223.field3286[arg0][var15][var24];
                if (var25 != null && var25.field5022 >= 5) {
                    return false;
                }
            }
        }
        class156 var16 = new class156();
        var16.field2431 = arg11;
        var16.field2430 = arg0;
        var16.field2440 = arg5;
        var16.field2445 = arg6;
        var16.field2437 = arg7;
        var16.field2436 = arg8;
        var16.field2442 = arg9;
        var16.field2443 = arg1;
        var16.field2432 = arg2;
        var16.field2447 = arg1 + arg3 - 1;
        var16.field2441 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class223.field3286[var22][var17][var20] == null) {
                        class223.field3286[var22][var17][var20] = new class313(var22, var17, var20);
                    }
                }
                class313 var23 = class223.field3286[arg0][var17][var20];
                var23.field5037[var23.field5022] = var16;
                var23.field5021[var23.field5022] = var21;
                var23.field5011 |= var21;
                var23.field5022++;
                if (var13 && class263.field4058[var17][var20] != 0) {
                    var14 = class263.field4058[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class263.field4058[var18][var19] == 0) {
                        class263.field4058[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class2.field28[class115.field1914++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method2(int arg0) {
        field8 = null;
        field20 = null;
        field11 = null;
        field21 = null;
        if (arg0 >= -70) {
            field2 = 114;
        }
        field19 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)Z")
    public final boolean method3(int arg0, int arg1, int arg2) {
        if (arg1 != Integer.MIN_VALUE) {
            method1(-30, -34, -65, -97, 13, 14, 19, -87, (class4) null, 76, true, 18L);
        }
        field7++;
        if (arg0 >= this.field3 && arg0 <= this.field1 && arg2 >= this.field13 && this.field14 >= arg2) {
            return true;
        } else {
            return this.field9 <= arg0 && arg0 <= this.field5 && this.field18 <= arg2 && arg2 <= this.field12;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
    public static final void method4(int arg0, int arg1, int arg2, int arg3) {
        field6++;
        class247 var4 = class51.method309(arg1, arg0, arg3, arg2 - 2147418111);
        if (arg2 != Integer.MAX_VALUE) {
            field11 = null;
        }
        if (var4 == null) {
            return;
        }
        class230.field3375 = new String[var4.field3638];
        class245.field3607 = new int[var4.field3644];
        if (var4.field3647 == 15 || var4.field3647 == 17 || var4.field3647 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class73.field1141 != null) {
                var5 = class73.field1141.field4206;
                var6 = class73.field1141.field4140;
            }
            class245.field3607[1] = class44.field584 - var6;
            class245.field3607[0] = class204.field3017 - var5;
        }
        class181.method1281(-44, var4, 200000);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lhf;)V")
    public class1(class159 arg0) {
        this.field10 = arg0;
    }
}
