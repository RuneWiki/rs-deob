import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class183 extends class170 {

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[J")
    private long[] field3612 = new long[10];

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    private int field3606 = 256;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    private int field3620 = 0;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field3617 = 1;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "J")
    private long field3608 = class171.method1146((byte) -24);

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "[J")
    public static long[] field3613 = new long[32];

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lkb;")
    public static class93 field3618 = class76.method390(" )2> <col=00ffff>", 0);

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lh;")
    public static class65 field3611;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[Lig;")
    public static class80[] field3615;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method308(int arg0) {
        field3610++;
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field3612[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lkb;")
    public static final class93 method1190(int arg0, int arg1) {
        if (arg0 == 29659) {
            field3607++;
            return arg1 < 999999999 ? class67.method357((byte) -118, arg1) : class26.field394;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)I")
    public final int method307(byte arg0, int arg1, int arg2) {
        int var4 = this.field3606;
        this.field3606 = 300;
        if (arg0 != -44) {
            this.method308(-28);
        }
        int var5 = this.field3617;
        field3609++;
        this.field3617 = 1;
        this.field3608 = class171.method1146((byte) 115);
        if (this.field3612[this.field3619] == 0L) {
            this.field3617 = var5;
            this.field3606 = var4;
        } else if (this.field3612[this.field3619] < this.field3608) {
            this.field3606 = (int) ((long) (arg2 * 2560) / (this.field3608 - this.field3612[this.field3619]));
        }
        if (this.field3606 < 25) {
            this.field3606 = 25;
        }
        if (this.field3606 > 256) {
            this.field3606 = 256;
            this.field3617 = (int) ((long) arg2 - (this.field3608 - this.field3612[this.field3619]) / 10L);
        }
        if (arg2 < this.field3617) {
            this.field3617 = arg2;
        }
        this.field3612[this.field3619] = this.field3608;
        this.field3619 = (this.field3619 + 1) % 10;
        if (this.field3617 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3612[var6] != 0L) {
                    this.field3612[var6] += this.field3617;
                }
            }
        }
        int var7 = 0;
        if (arg1 > this.field3617) {
            this.field3617 = arg1;
        }
        class39.method212(-117, (long) this.field3617);
        while (this.field3620 < 256) {
            this.field3620 += this.field3606;
            var7++;
        }
        this.field3620 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lob;BIIII)V")
    public static final void method1191(class129 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 61) {
            method1190(88, 80);
        }
        field3616++;
        if (arg0 == null) {
            return;
        }
        int var6 = class93.field1707 + class30.field510 & 0x7FF;
        int var7 = arg2 * arg2 + arg5 * arg5;
        if (var7 > 6400) {
            return;
        }
        int var8 = class150.field2888[var6];
        int var9 = class150.field2896[var6];
        int var10 = var8 * 256 / (class193.field3749 + 256);
        int var11 = var9 * 256 / (class193.field3749 + 256);
        int var12 = arg5 * var10 - arg2 * var11 >> 16;
        int var13 = arg5 * var11 + arg2 * var10 >> 16;
        if (var7 <= 2500) {
            arg0.method737(arg4 + var13 + 4 + 94 - arg0.field2448 / 2, -(arg0.field2447 / 2) + -var12 + -4 + arg3 + 83);
        } else {
            arg0.method733(class64.field1036, arg4 + var13 + 98 - arg0.field2448 / 2, -var12 + arg3 + -(arg0.field2447 / 2) + -4 - -83);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public static void method1192(boolean arg0) {
        field3613 = null;
        field3615 = null;
        field3618 = null;
        field3611 = null;
        if (!arg0) {
            field3611 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class183() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3612[var1] = this.field3608;
        }
    }
}
