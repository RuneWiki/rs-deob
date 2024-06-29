import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class182 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3278 = -1;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "[I")
    public static int[] field3284 = new int[4];

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3281 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Z")
    public static boolean field3285 = false;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lvj;")
    public static class115 field3280 = new class115(64);

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lid;")
    public static class149 field3289 = class60.method382(",Mcran)2titre charg-B", (byte) 8);

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
    public static int[] field3290 = new int[256];

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lid;")
    public static class149 field3291 = class60.method382("compass", (byte) 66);

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lid;")
    public static class149 field3292 = class60.method382(":allyreq:", (byte) 41);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 22562) {
            field3292 = null;
        }
        field3287++;
        if (class104.method735(arg7, false)) {
            class211.method1438(arg1, class14.field206[arg7], -1, arg0, arg2, arg5, arg3, arg6, true, arg4);
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class94.field1664[var9] = true;
            }
        } else {
            class94.field1664[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)[Lrh;")
    public static final class46[] method1261(int arg0) {
        if (arg0 != 17100) {
            return null;
        }
        class46[] var1 = new class46[class84.field1528];
        field3279++;
        for (int var2 = 0; var2 < class84.field1528; var2++) {
            byte[] var3 = class73.field1276[var2];
            int var4 = class55.field991[var2] * class283.field5005[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class108.field1865[class136.method953(var3[var6], 255)];
            }
            var1[var2] = new class46(class251.field4406, class286.field5082, class147.field2651[var2], class18.field259[var2], class283.field5005[var2], class55.field991[var2], var5);
        }
        class103.method731(false);
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        if (arg0 != 13548) {
            field3278 = -38;
        }
        if (class288.field5139 != null) {
            class60 var1 = class288.field5139;
            synchronized (class288.field5139) {
                class288.field5139 = null;
            }
        }
        field3286++;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static final void method1263(int arg0) {
        if (arg0 == 1) {
            field3288++;
            class102.field1795.method1290((byte) -116);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method1264(byte arg0) {
        field3280 = null;
        field3289 = null;
        field3291 = null;
        field3290 = null;
        int var1 = 49 % ((arg0 + 11) / 40);
        field3292 = null;
        field3284 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILug;Lug;IIIIJ)V")
    public static final void method1265(int arg0, int arg1, int arg2, int arg3, class199 arg4, class199 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class158 var12 = new class158();
        var12.field2903 = arg10;
        var12.field2906 = arg1 * 128 + 64;
        var12.field2904 = arg2 * 128 + 64;
        var12.field2907 = arg3;
        var12.field2911 = arg4;
        var12.field2913 = arg5;
        var12.field2915 = arg6;
        var12.field2909 = arg7;
        var12.field2910 = arg8;
        var12.field2914 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class261.field4664[var13][arg1][arg2] == null) {
                class261.field4664[var13][arg1][arg2] = new class231(var13, arg1, arg2);
            }
        }
        class261.field4664[arg0][arg1][arg2].field4056 = var12;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public static final void method1266(int arg0) {
        class24.field367.method193((byte) 96);
        field3283++;
        for (int var1 = 0; var1 < 32; var1++) {
            class146.field2632[var1] = 0L;
        }
        if (arg0 != 28028) {
            field3290 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class272.field4890[var2] = 0L;
        }
        class264.field4735 = 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Laj;I)V")
    public static final void method1267(class47 arg0, int arg1) {
        if (class35.field516 == arg0.field737) {
            class94.field1664[arg0.field767] = true;
        }
        field3282++;
        if (arg1 <= 74) {
            method1261(87);
        }
    }
}
