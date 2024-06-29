import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class87 {

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "[I")
    public static int[] field1109;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)I")
    public static final int method606(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class86.field1097 - 1; var2++) {
            if (arg0 < class529.field7463[var2] + class237.field3063[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class86.field1097 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ldfa;I)V")
    public static final void method607(class757 arg0, int arg1) {
        arg0.method4212((byte) -125);
        field1110++;
        int var2 = class456.field6387;
        class546 var3 = class339.field4374 = class447.field6287[var2] = new class546();
        var3.field354 = var2;
        int var4 = arg0.method4206(30, 115);
        byte var5 = (byte) (var4 >> 28);
        if (arg1 != 28960) {
            method611(-7, true);
        }
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field435[0] = var6 - class63.field851;
        int var7 = var4 & 0x3FFF;
        var3.field5790 = (var3.field435[0] << 9) + (var3.method253((byte) -27) << 8);
        var3.field426[0] = var7 - class753.field10509;
        var3.field5784 = (var3.field426[0] << 9) + (var3.method253((byte) -27) << 8);
        class223.field2946 = var3.field5779 = var3.field5792 = var5;
        if (class739.method4140((byte) 57, var3.field426[0], var3.field435[0])) {
            var3.field5792++;
        }
        if (class576.field8042[var2] != null) {
            var3.method3098((byte) -121, class576.field8042[var2]);
        }
        class627.field8745 = 0;
        class274.field3465[class627.field8745++] = var2;
        class220.field2792[var2] = 0;
        class625.field8728 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method4206(18, -108);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class53 var13 = class16.field225[var8] = new class53();
                var13.field778 = false;
                var13.field774 = -1;
                var13.field776 = 0;
                var13.field777 = (var10 << 28) + var12 + (var11 << 14);
                class261.field3311[class625.field8728++] = var8;
                class220.field2792[var8] = 0;
            }
        }
        arg0.method4214(false);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIIII)I")
    public static final int method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1111++;
        int var7 = arg0 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        if (~var7 == arg2) {
            return arg6;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg6 - arg4;
        } else {
            return 1 + 7 - arg3 - arg1;
        }
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
    public static void method609(int arg0) {
        field1109 = null;
        if (arg0 != -1) {
            method609(-7);
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lie;I)V")
    public static final void method610(class607 arg0, int arg1) {
        arg0.field8417 = null;
        field1108++;
        int var2 = arg0.field8425.length;
        for (int var3 = arg1; var3 < var2; var3++) {
            arg0.field8425[var3].field9208 = false;
        }
        class314[] var4 = class162.field2075;
        synchronized (class162.field2075) {
            if (class162.field2075.length > var2 && class217.field2738[var2] < 200) {
                class162.field2075[var2].method1840(18, arg0);
                int var10002 = class217.field2738[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IZ)I")
    public static final int method611(int arg0, boolean arg1) {
        field1106++;
        if (class447.field6289 == null) {
            return 0;
        } else if (arg1 || class449.field6312 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class447.field6289.length; var3++) {
                int var4 = class447.field6289[var3];
                if (class88.field1123.method3827(var4, (byte) 87)) {
                    var2++;
                }
                if (class457.field6396.method3827(var4, (byte) 94)) {
                    var2++;
                }
            }
            if (arg0 != -30366) {
                method609(114);
            }
            return var2;
        } else {
            return class447.field6289.length * 2;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Lmaa;")
    public static final class440 method612(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class440 var4 = var3.field965;
            var3.field965 = null;
            class142.method877(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)V")
    public static final void method613(int arg0) {
        if (class401.field5559 <= 1) {
            class223.field2944.method346(class223.field2944.field606, 2, false);
        } else {
            class223.field2944.method346(class223.field2944.field606, 4, false);
        }
        field1107++;
        if (arg0 != -18535) {
            method611(-57, false);
        }
    }
}
