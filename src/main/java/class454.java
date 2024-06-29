import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class454 extends class566 {

    @OriginalMember(owner = "client!lda", name = "A", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "[I")
    public static int[] field6191 = new int[1000];

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!lda", name = "B", descriptor = "[I")
    public static int[] field6186;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method2589(int arg0, int arg1, byte arg2) {
        if (arg2 != 62) {
            method2592(-4);
        }
        field6188++;
        return class280.method1744(arg2 - 8463, arg1, arg0) || class252.method1532(arg1, (byte) -85, arg0);
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lrt;Lcp;IIIIIIIIIIIIII)V", line = 15)
    public class454(class212 arg0, class679 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field6185 = arg15;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)I", line = 23)
    public static final int method2590(int arg0, int arg1) {
        return class46.field664 == null ? 0 : class46.field664[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Los;", line = 29)
    public final class412 method193(byte arg0) {
        if (arg0 > -21) {
            this.field6185 = 98;
        }
        field6184++;
        return class515.field6882;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V", line = 42)
    public static void method2591(int arg0) {
        field6186 = null;
        if (arg0 == 14046) {
            field6191 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)[Lge;", line = 55)
    public static final class665[] method2592(int arg0) {
        if (arg0 == 16777215) {
            field6189++;
            return new class665[] { class597.field7916, class597.field7920, class597.field7921, class597.field7922, class597.field7923, class597.field7924, class597.field7925, class597.field7926, class597.field7927, class597.field7928, class597.field7929, class597.field7930, class597.field7931, class597.field7932 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIII)V", line = 66)
    public static final void method2593(int arg0, int arg1, int arg2, int arg3) {
        field6183++;
        int var4 = class473.field6334 + arg0;
        int var5 = class233.field3269 + arg1;
        if (class703.field9899 == null || arg0 < 0 || arg1 < 0 || arg0 >= class34.field530 || arg1 >= class34.field531) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
        class354 var8 = (class354) class262.field3643.method2918(var6, (byte) -126);
        if (var8 == null) {
            class436.method2477(arg3, arg0, arg1);
            return;
        }
        class418 var9 = (class418) var8.field4816.method3257(-9);
        if (var9 == null) {
            class436.method2477(arg3, arg0, arg1);
            return;
        }
        class153 var10 = (class153) class436.method2477(arg3, arg0, arg1);
        if (var10 == null) {
            var10 = new class153();
        } else {
            var10.field2410 = var10.field2408 = -1;
        }
        var10.field2414 = var9.field5720;
        var10.field2416 = var9.field5719;
        label51: while (true) {
            class418 var11 = (class418) var8.field4816.method3263((byte) -122);
            if (var11 == null) {
                break;
            }
            if (var10.field2416 != var11.field5719) {
                var10.field2410 = var11.field5719;
                var10.field2422 = var11.field5720;
                while (true) {
                    class418 var12 = (class418) var8.field4816.method3263((byte) -100);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field2416 != var12.field5719 && var10.field2410 != var12.field5719) {
                        var10.field2415 = var12.field5720;
                        var10.field2408 = var12.field5719;
                    }
                }
            }
        }
        if (arg2 > 81) {
            int var13 = class315.method1878((arg0 << 9) + 256, 2921, arg3, (arg1 << 9) + 256);
            class119.method932(arg3, arg0, arg1, var13, var10);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V", line = 150)
    public static final void method2594(int arg0, int arg1, int arg2) {
        field6190++;
        if (arg2 == 27139) {
            class382 var3 = class396.method2276(-10, 13, arg0);
            var3.method2232(-1);
            var3.field5099 = arg1;
        }
    }
}
