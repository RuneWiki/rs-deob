import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class235 extends class216 implements Runnable {

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Z")
    private boolean field3325 = true;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field3320 = -1;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Ldn;")
    private class349 field3319;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Lms;")
    public static class363 field3315 = null;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lsq;")
    public static class454 field3314 = new class454(32);

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field3323 = -1;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Lcs;")
    public static class351 field3324 = new class351(30, 11);

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Z")
    public static boolean field3328 = false;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Lmq;")
    public static class104 field3326 = new class104(4);

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field3329 = 0;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public final void method1476(byte arg0) {
        if (arg0 != -12) {
            this.run();
        }
        (new Thread(this, "a")).start();
        field3316++;
    }

    @OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
    public final void run() {
        field3321++;
        while (this.field3325) {
            this.field3319.method2090(this, true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIII)V")
    public static final void method1477(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3318++;
        if (class53.field874 <= arg2 && arg2 <= class8.field174) {
            int var5 = class229.method1443(class299.field4121, arg3, class248.field3487, (byte) -68);
            int var6 = class229.method1443(class299.field4121, arg4, class248.field3487, (byte) -68);
            class306.method1855(arg1, arg2, var6, false, var5);
        }
        if (!arg0) {
            field3314 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public final void method1478(int arg0) {
        if (arg0 == -1) {
            field3322++;
            this.field3325 = false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static void method1479(byte arg0) {
        if (arg0 != -59) {
            field3326 = null;
        }
        field3314 = null;
        field3315 = null;
        field3326 = null;
        field3324 = null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Ldn;)V")
    public class235(class349 arg0) {
        this.field3319 = arg0;
    }
}
