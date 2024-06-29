import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class236 extends class381 {

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3259 = -1;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lik;")
    public static class410 field3262 = new class410(128);

    @OriginalMember(owner = "client!w", name = "L", descriptor = "Z")
    public static boolean field3281 = false;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Z")
    public static boolean field3282 = false;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field3276;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lqe;")
    public class148 field3277;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lqn;")
    public class198 field3258;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lkf;")
    public class294 field3257;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lrk;")
    public static class427 field3278;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Lrk;")
    public static class427 field3284;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Ltk;")
    public class79 field3263;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    public static int[] field3273;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "[[[B")
    public static byte[][][] field3283;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "[[[B")
    public static byte[][][] field3287;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static void method1574(int arg0) {
        if (arg0 != -11706) {
            return;
        }
        field3273 = null;
        field3283 = null;
        field3287 = null;
        field3278 = null;
        field3262 = null;
        field3284 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpe;Z)V")
    public static final void method1575(class391 arg0, boolean arg1) {
        arg0.method111(0, 0, class249.field3414, 350);
        field3286++;
        arg0.method95(0, 0, class249.field3414, 350, class135.field1928 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var4 = class323.field4388[var2];
            int var5 = class172.field2522[var2];
            arg0.method95(var4, var5, 2, 2, class88.field1306[var2] << 24 | 0xFFFFFF, 1);
        }
        for (int var3 = 0; var3 < class77.field1161.length; var3++) {
            class22.field414.method1314(10, -1, class77.field1161[var3], 114, 350 - class442.field6362.field4376 - (class53.field860 * var3 + (class74.field1103 - -2)), -16777216);
        }
        if (arg1) {
            field3262 = null;
        }
        arg0.method2411(0, class249.field3414, 350 - class74.field1103, -1, !arg1);
        class96.field1387.method1314(10, -1, "--> " + class421.field5896 + "*", 115, 350 - class19.field375.field4376 - 1, -16777216);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public final void method1576(boolean arg0) {
        this.field3258 = null;
        this.field3277 = null;
        this.field3257 = null;
        field3256++;
        if (!arg0) {
            this.field3258 = null;
        }
        this.field3263 = null;
    }
}
