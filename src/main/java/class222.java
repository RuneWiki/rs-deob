import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class class222 {

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "[I")
    public static int[] field3219 = new int[200];

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "S")
    public static short field3215 = 256;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lvp;")
    public static class123 field3208 = new class123(33, -1);

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "Lvp;")
    public static class123 field3221 = new class123(13, -1);

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "Ldq;")
    public static class489 field3222 = new class489(3, 14);

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "[[B")
    public static byte[][] field3218;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static final void method1464(byte arg0) {
        field3214++;
        if (class378.field5635) {
            return;
        }
        if (class397.field5830.field150) {
            class66.field1161 = ((int) class66.field1161 - 65 & 0xFFFFFF80);
        } else {
            class278.field4008 += (-class278.field4008 - 24.0F) / 2.0F;
        }
        class163.field2465 = true;
        class378.field5635 = true;
        if (arg0 != 90) {
            method1470(-78, false, 79, 101, -23, 74, 55, -113, 48, 94);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V")
    public abstract void method51(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(III)V")
    public abstract void method44(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)V")
    public abstract void method48(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3208 = null;
        field3222 = null;
        field3219 = null;
        if (arg0 != -1) {
            field3218 = null;
        }
        field3221 = null;
        field3218 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)V")
    public static final void method1466(byte arg0, int arg1) {
        field3211++;
        int var2 = 83 / ((38 - arg0) / 44);
        class25.field437 = new int[arg1];
        class354.field5355 = new int[arg1];
        class490.field7156 = new int[arg1];
        class366.field5496 = new int[arg1];
        class348.field5281 = new int[arg1];
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
    public static final void method1467(int arg0) {
        field3212++;
        class322.field4942 = null;
        if (arg0 != 0) {
            field3222 = null;
        }
        class307.field4379 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1468(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3213++;
        if (arg6 < 128 || arg8 < 128 || (class237.field3436 * 128 - 256) < arg6 || (class83.field1366 - 2) * 128 < arg8) {
            class387.field5746[0] = class387.field5746[1] = -1;
        } else if (arg1 == -128) {
            int var10 = class259.method1646(arg8, arg6, 851701031, arg7) - arg0;
            class81.field1351.method1004(arg9, 0, 0);
            class394.field5821.method497(class81.field1351);
            class394.field5821.method463(arg6, var10, arg8, class387.field5746);
            class81.field1351.method1004(-arg9, 0, 0);
            class394.field5821.method497(class81.field1351);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)I")
    public static final int method1469(int arg0, int arg1, int arg2, int arg3) {
        field3209++;
        if (class73.field1229 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = 46 % ((arg0 - 73) / 37);
        int var6 = Integer.MAX_VALUE;
        int var7 = arg1 - class2.field44;
        int var8 = arg3 - class2.field40;
        for (class42 var9 = (class42) class2.field23.method2257((byte) 125); var9 != null; var9 = (class42) class2.field23.method2256(-84)) {
            if (var9.field649 == arg2) {
                int var10 = var9.field644;
                int var11 = var9.field641;
                int var12 = class2.field40 + var11 | class2.field44 + var10 << 14;
                int var13 = (var7 - var10) * (var7 - var10) + ((var8 - var11) * (var8 - var11));
                if (var4 < 0 || var6 > var13) {
                    var6 = var13;
                    var4 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method1470(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3217++;
        class64 var10 = null;
        for (class64 var11 = (class64) class516.field7581.method2257((byte) 115); var11 != null; var11 = (class64) class516.field7581.method2256(-57)) {
            if (var11.field1134 == arg2 && var11.field1122 == arg7 && var11.field1121 == arg9 && var11.field1129 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class64();
            var10.field1122 = arg7;
            var10.field1134 = arg2;
            var10.field1129 = arg5;
            var10.field1121 = arg9;
            if (arg7 >= 0 && arg9 >= 0 && arg7 < class237.field3436 && arg9 < class83.field1366) {
                class481.method2878(10845, var10);
            }
            class516.field7581.method2270(0, var10);
        }
        if (arg1) {
            field3220 = 27;
        }
        var10.field1130 = arg0;
        var10.field1132 = arg3;
        var10.field1138 = arg6;
        var10.field1123 = arg8;
        var10.field1125 = arg4;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(III)V")
    public class222(int arg0, int arg1, int arg2) {
        this.field3216 = arg2;
        this.field3207 = arg0;
        this.field3210 = arg1;
    }
}
