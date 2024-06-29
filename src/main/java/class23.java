import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class23 extends class262 {

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "[J")
    private long[] field325 = new long[10];

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    private int field316 = 1;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    private int field317 = 256;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    private int field331 = 0;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "J")
    private long field337 = class261.method1765(16299);

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field318 = -1;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Lce;")
    public static class126 field320 = class206.method1445(-7923, "Angreifen");

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Lce;")
    public static class126 field322 = class206.method1445(-7923, "<br>");

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "Lce;")
    private static class126 field328 = class206.method1445(-7923, "green:");

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "Lce;")
    public static class126 field334 = field328;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "Z")
    public static boolean field327 = false;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field335 = 0;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "Lce;")
    public static class126 field336 = class206.method1445(-7923, "loc");

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "Lce;")
    public static class126 field321 = null;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "Lce;")
    public static class126 field339 = field328;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 30)
    public static void method111(boolean arg0) {
        field320 = null;
        field339 = null;
        field328 = null;
        field322 = null;
        field334 = null;
        field321 = null;
        field336 = null;
        if (arg0) {
            method114((class112) null, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 188)
    public class23() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field325[var1] = this.field337;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)I", line = 76)
    public final int method112(int arg0, int arg1, int arg2) {
        int var4 = this.field317;
        int var5 = this.field316;
        this.field316 = 1;
        this.field317 = 300;
        this.field337 = class261.method1765(16299);
        if (this.field325[this.field326] == 0L) {
            this.field316 = var5;
            this.field317 = var4;
        } else if (this.field325[this.field326] < this.field337) {
            this.field317 = (int) ((long) (arg0 * 2560) / (this.field337 - this.field325[this.field326]));
        }
        field319++;
        if (this.field317 < 25) {
            this.field317 = 25;
        }
        if (this.field317 > 256) {
            this.field317 = 256;
            this.field316 = (int) ((long) arg0 - ((this.field337 - this.field325[this.field326]) / 10L));
        }
        if (arg2 > -122) {
            this.method113(-126);
        }
        if (arg0 < this.field316) {
            this.field316 = arg0;
        }
        this.field325[this.field326] = this.field337;
        this.field326 = (this.field326 + 1) % 10;
        if (this.field316 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field325[var6] != 0L) {
                    this.field325[var6] += (long) this.field316;
                }
            }
        }
        int var7 = 0;
        if (arg1 > this.field316) {
            this.field316 = arg1;
        }
        class313.method2158((long) this.field316, true);
        while (this.field331 < 256) {
            this.field331 += this.field317;
            var7++;
        }
        this.field331 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 170)
    public final void method113(int arg0) {
        if (arg0 != -12725) {
            this.field331 = -62;
        }
        field330++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field325[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lwd;B)V", line = 209)
    public static final void method114(class112 arg0, byte arg1) {
        if (arg1 != 94) {
            field334 = (class126) null;
        }
        if (class163.field2924 == arg0.field1921) {
            class220.field3698[arg0.field1805] = true;
        }
        field332++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V", line = 225)
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -1142) {
            method111(true);
        }
        field324++;
        int var6 = arg0 - arg2;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class143.method1040(-16532, arg5, arg2, arg4, arg1);
            }
        } else if (var7 == 0) {
            class111.method735(arg0, false, arg5, arg1, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class321.field5489) {
                var10 = class321.field5489;
                var11 = var9 + (class321.field5489 * var8 >> 12);
            } else if (arg2 <= class52.field795) {
                var11 = arg1;
                var10 = arg2;
            } else {
                var11 = var9 + (class52.field795 * var8 >> 12);
                var10 = class52.field795;
            }
            int var12;
            int var13;
            if (class321.field5489 > arg0) {
                var12 = (class321.field5489 * var8 >> 12) + var9;
                var13 = class321.field5489;
            } else if (class52.field795 < arg0) {
                var12 = (class52.field795 * var8 >> 12) + var9;
                var13 = class52.field795;
            } else {
                var13 = arg0;
                var12 = arg4;
            }
            if (class197.field3372 > var12) {
                var13 = (class197.field3372 - var9 << 12) / var8;
                var12 = class197.field3372;
            } else if (var12 > class194.field3302) {
                var13 = (class194.field3302 - var9 << 12) / var8;
                var12 = class194.field3302;
            }
            if (var11 < class197.field3372) {
                var10 = (class197.field3372 - var9 << 12) / var8;
                var11 = class197.field3372;
            } else if (var11 > class194.field3302) {
                var10 = (class194.field3302 - var9 << 12) / var8;
                var11 = class194.field3302;
            }
            class110.method718(arg5, var12, var11, var10, var13, false);
        }
    }
}
