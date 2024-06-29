import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class219 {

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "B")
    private byte field3559;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "J")
    public static volatile long field3561 = 0L;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Z")
    public static boolean field3556 = false;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[I")
    public static int[] field3568 = new int[50];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lma;")
    public static class263 field3557;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lme;")
    public static class295 field3560;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1517(boolean arg0) {
        field3560 = null;
        field3557 = null;
        field3568 = null;
        if (!arg0) {
            method1517(false);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ltl;B)Ltl;", line = 25)
    public static final class59 method1518(class59 arg0, byte arg1) {
        field3563++;
        int var2 = class40.method259(arg0, true);
        if (var2 == -1) {
            return class286.field4927;
        } else if (arg1 == -112) {
            return class23.field310.field114[var2].method469(class64.field975, class265.field4582, 25600);
        } else {
            return (class59) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZJII)Ltl;", line = 40)
    public static final class59 method1519(boolean arg0, long arg1, int arg2, int arg3) {
        field3571++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        long var5 = arg1 / (long) arg2;
        int var7 = 1;
        while (var5 != 0L) {
            var7++;
            var5 /= (long) arg2;
        }
        int var8 = var7;
        if (arg1 < 0L || arg0) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        if (arg3 != -26661) {
            field3568 = (int[]) null;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var11 = (int) (arg1 % (long) arg2);
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
            arg1 /= (long) arg2;
        }
        class59 var12 = new class59();
        var12.field889 = var9;
        var12.field863 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[Ltl;[S)V", line = 118)
    public static final void method1520(int arg0, class59[] arg1, short[] arg2) {
        field3553++;
        class46.method328(arg2, 0, arg1, -340990552, arg1.length + arg0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I", line = 143)
    public final int method1521(int arg0) {
        field3558++;
        return arg0 < 96 ? 95 : this.field3559 & 0x7;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 163)
    public static final void method1522(int arg0) {
        if (class236.field3916 != null) {
            class306 var1 = class236.field3916;
            synchronized (class236.field3916) {
                class236.field3916 = null;
            }
        }
        if (arg0 > 14) {
            field3570++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)I", line = 185)
    public final int method1523(byte arg0) {
        if (arg0 != 17) {
            method1518((class59) null, (byte) -126);
        }
        field3569++;
        return (this.field3559 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 203)
    public class219() {
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ls;)V", line = 205)
    public class219(class170 arg0) {
        this.field3559 = arg0.method1205(-1);
        this.field3567 = arg0.method1214(-18254);
        this.field3564 = arg0.method1233((byte) -77);
        this.field3572 = arg0.method1233((byte) -77);
        this.field3562 = arg0.method1233((byte) -77);
        this.field3565 = arg0.method1233((byte) -77);
    }
}
