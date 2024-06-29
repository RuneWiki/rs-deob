import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class147 extends class190 {

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "Lqe;")
    public static class168 field2565 = class66.method448(": ", -121);

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Lqe;")
    public static class168 field2563 = class66.method448("mapflag", -115);

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field2555 = 0;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "[S")
    public static short[] field2564 = new short[256];

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Z")
    public static boolean field2574 = false;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Lqe;")
    private static class168 field2569 = class66.method448("Examine", -113);

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "Lqe;")
    private static class168 field2556 = class66.method448("Loading config )2 ", 78);

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "Lqe;")
    public static class168 field2561 = field2556;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Lqe;")
    public static class168 field2554 = field2569;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Lui;")
    public static class236 field2567 = new class236(16);

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lmj;")
    public class129 field2552;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "Lmj;")
    public class129 field2571;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Lqe;")
    public class168 field2559;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Z")
    public boolean field2560;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "[Lfe;")
    public static class15[] field2562;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "[Ljava/lang/Object;")
    public Object[] field2566;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[[S")
    public static short[][] field2551;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Luc;")
    public static final class169 method987(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3115; var4++) {
            class169 var5 = var3.field3090[var4];
            if ((var5.field2937 >> 29 & 0x3L) == 2L && var5.field2939 == arg1 && var5.field2923 == arg2) {
                class9.method36(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static void method988(boolean arg0) {
        field2561 = null;
        field2564 = null;
        field2551 = null;
        field2556 = null;
        field2562 = null;
        field2554 = null;
        field2563 = null;
        field2565 = null;
        if (arg0) {
            field2551 = null;
        }
        field2567 = null;
        field2569 = null;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static final void method989(int arg0) {
        if (arg0 != 3) {
            method987(20, -36, 115);
        }
        class93.field1461.method14(false);
        class197.field3414.method14(false);
        field2570++;
    }
}
