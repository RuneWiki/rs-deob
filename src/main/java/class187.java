import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class187 implements Runnable {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[Lrb;")
    public volatile class66[] field3222 = new class66[2];

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Z")
    public volatile boolean field3224 = false;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
    public volatile boolean field3218 = false;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lbd;")
    public static class162 field3220 = class17.method142(0, "Versteckt");

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lbd;")
    public static class162 field3219 = class17.method142(0, "welle:");

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lbd;")
    private static class162 field3230 = class17.method142(0, "Loading)3)3)3");

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lbd;")
    public static class162 field3225 = field3230;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lk;")
    public static class47 field3229 = new class47(5000);

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lbd;")
    public static class162 field3231 = class17.method142(0, ")2");

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
    public static boolean field3232 = false;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lda;")
    public static class143 field3217;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lda;")
    public static class143 field3233;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lwf;")
    public static class215 field3234;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lib;")
    public class28 field3223;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JB)V", line = 9)
    public static final void method1404(long arg0, byte arg1) {
        field3229.field1653 = 0;
        field3229.method753(254, true);
        if (arg1 <= 14) {
            return;
        }
        field3229.method745(arg0, (byte) -124);
        field3226++;
        class87.field1556 = 1;
        class139.field2488 = 0;
        class92.field1624 = -3;
        class219.field3657 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 27)
    public static void method1405(boolean arg0) {
        field3225 = null;
        field3217 = null;
        field3233 = null;
        field3230 = null;
        field3220 = null;
        if (arg0) {
            method1405(false);
        }
        field3234 = null;
        field3231 = null;
        field3219 = null;
        field3229 = null;
    }

    @OriginalMember(owner = "client!kb", name = "run", descriptor = "()V", line = 49)
    public final void run() {
        this.field3218 = true;
        try {
            while (!this.field3224) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class66 var2 = this.field3222[var1];
                    if (var2 != null) {
                        var2.method459(28968);
                    }
                }
                class177.method1342(10L, 1);
                class128.method1034((Object) null, this.field3223, -51);
            }
        } catch (Exception var7) {
            class129.method1039(-8, (String) null, var7);
        } finally {
            this.field3218 = false;
        }
        field3228++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIII)V", line = 113)
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg7 && arg2 == arg4 && arg5 == arg9 && arg0 == arg6) {
            class139.method1085(arg1, arg3, arg5, arg2, arg0, (byte) -105);
        } else {
            int var10 = arg3;
            int var11 = arg2;
            int var12 = arg3 * 3;
            int var13 = arg2 * 3;
            int var14 = arg4 * 3;
            int var15 = arg7 * 3;
            int var16 = arg6 * 3;
            int var17 = arg9 * 3;
            int var18 = arg5 + var15 - arg3 - var17;
            int var19 = var12 + var17 - var15 - var15;
            int var20 = arg0 + var14 - var16 - arg2;
            int var21 = var15 - var12;
            int var22 = var16 - var14 - (-var13 + var14);
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var26;
                int var29 = var19 * var25;
                int var30 = var21 * var24;
                int var31 = var22 * var25;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var30 >> 12) + arg3;
                int var34 = arg2 + (var31 + var32 + var28 >> 12);
                class139.method1085(arg1, var10, var33, var11, var34, (byte) -115);
                var10 = var33;
                var11 = var34;
            }
        }
        field3227++;
        if (arg8 != 2) {
            method1406(-82, 124, 82, 19, 90, 37, 83, 103, -58, -52);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILda;ILda;I)Llc;", line = 202)
    public static final class189 method1407(int arg0, class143 arg1, int arg2, class143 arg3, int arg4) {
        field3221++;
        if (arg0 != 3) {
            field3231 = (class162) null;
        }
        return class94.method757(arg3, arg2, arg0 ^ 0x8E4197D3, arg4) ? class147.method1169(arg1.method1128(arg2, arg0 - 3, arg4), 2) : null;
    }
}
