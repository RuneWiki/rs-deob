import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class209 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lpi;")
    public static class181 field3744;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method1472(int arg0) {
        field3744 = null;
        if (arg0 > -22) {
            field3744 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
    public static final boolean method1473(int arg0, int arg1, int arg2) {
        class236 var3 = class157.method1158(arg2, 122);
        if (arg0 != 4) {
            return false;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        field3742++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method1609(arg1, arg0 ^ 0x4505);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)V")
    public static final void method1474(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class198.field3545; var3++) {
            for (int var4 = 0; var4 < class173.field3076; var4++) {
                for (int var5 = 0; var5 < class128.field2359; var5++) {
                    class201 var6 = class111.field2080[var3][var4][var5];
                    if (var6 != null) {
                        class255 var7 = var6.field3589;
                        if (var7 != null && var7.field4466.method486()) {
                            class150.method1109(var7.field4466, var3, var4, var5, 1, 1);
                            if (var7.field4463 != null && var7.field4463.method486()) {
                                class150.method1109(var7.field4463, var3, var4, var5, 1, 1);
                                var7.field4466.method467(var7.field4463, 0, 0, 0, false);
                                var7.field4463 = var7.field4463.method474(arg0, arg1, arg2);
                            }
                            var7.field4466 = var7.field4466.method474(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3585; var8++) {
                            class197 var10 = var6.field3600[var8];
                            if (var10 != null && var10.field3532.method486()) {
                                class150.method1109(var10.field3532, var3, var4, var5, var10.field3540 + 1 - var10.field3541, var10.field3530 - var10.field3533 + 1);
                                var10.field3532 = var10.field3532.method474(arg0, arg1, arg2);
                            }
                        }
                        class182 var9 = var6.field3607;
                        if (var9 != null && var9.field3269.method486()) {
                            class243.method1668(var9.field3269, var3, var4, var5);
                            var9.field3269 = var9.field3269.method474(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        field3740++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg3;
        } else {
            int var9 = -90 % ((arg5 - 30) / 47);
            return arg4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
    public static final int method1476(int arg0) {
        if (arg0 == 0) {
            field3743++;
            return ((class135.field2452 == 0 ? 0 : 1) << 22) + ((class205.field3685 == 0 ? 0 : 1) << 21) + ((class42.field715 ? 1 : 0) << 19) + ((class24.field396 & 0x3) << 17) + ((class65.field1102 ? 1 : 0) << 15) + ((class70.field1206 ? 1 : 0) << 13) + ((class186.field3326 & 0x3) << 11) + ((class250.field4416 ? 1 : 0) << 10) + ((class264.field4596 ? 1 : 0) << 7) + (((class141.field2586 ? 1 : 0) << 3) + (class65.field1111 & 0x7) + ((class217.field3840 ? 1 : 0) << 4) - -((class268.field4631 ? 1 : 0) << 5)) + ((class46.field809 ? 1 : 0) << 6) + ((class68.field1177 ? 1 : 0) << 8) + ((class111.field2103 ? 1 : 0) << 9) - (-((class31.field588 ? 1 : 0) << 16) - ((class38.field668 == 0 ? 0 : 1) << 20));
        } else {
            return 53;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lda;")
    public static final class186 method1477(int arg0, int arg1) {
        field3741++;
        if (arg0 != 2) {
            method1477(-38, 33);
        }
        class186 var2 = (class186) class58.field972.method1364((long) arg1, arg0 - 21989);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class109.field2044.method1293(arg1, 1, (byte) -90);
        } else {
            var3 = class61.field1015.method1293(arg1 & 0x7FFF, 1, (byte) 52);
        }
        class186 var4 = new class186();
        if (var3 != null) {
            var4.method1355(-128, new class75(var3));
        }
        if (arg1 >= 32768) {
            var4.method1352((byte) 83);
        }
        class58.field972.method1366(true, var4, (long) arg1);
        return var4;
    }
}
