import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class270 {

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    private int field3646 = 0;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "[Luj;")
    public class476[] field3629;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Lvr;")
    public static class187 field3637 = new class187("WTWIP", 3);

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "F")
    public static float field3642;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "J")
    private long field3639;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "Luj;")
    private class476 field3645;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "Luj;")
    private class476 field3647;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Luj;")
    public final class476 method1582(int arg0) {
        field3640++;
        if (this.field3646 > 0 && this.field3629[this.field3646 - 1] != this.field3647) {
            class476 var2 = this.field3647;
            this.field3647 = var2.field6884;
            return var2;
        }
        while (this.field3633 > this.field3646) {
            class476 var3 = this.field3629[this.field3646++].field6884;
            if (this.field3629[this.field3646 - 1] != var3) {
                this.field3647 = var3.field6884;
                return var3;
            }
        }
        if (arg0 >= -100) {
            this.field3646 = -90;
        }
        return null;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
    public final void method1583(int arg0) {
        if (arg0 <= 28) {
            method1591((byte) 58, null, null);
        }
        for (int var2 = 0; var2 < this.field3633; var2++) {
            class476 var3 = this.field3629[var2];
            while (true) {
                class476 var4 = var3.field6884;
                if (var3 == var4) {
                    break;
                }
                var4.method2791((byte) 112);
            }
        }
        field3643++;
        this.field3647 = null;
        this.field3645 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static void method1584(byte arg0) {
        field3637 = null;
        if (arg0 != 119) {
            field3644 = -42;
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)I")
    public final int method1585(byte arg0) {
        field3631++;
        int var2 = 0;
        if (arg0 < 71) {
            this.field3645 = null;
        }
        for (int var3 = 0; var3 < this.field3633; var3++) {
            class476 var4 = this.field3629[var3];
            class476 var5 = var4.field6884;
            while (var4 != var5) {
                var5 = var5.field6884;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Luj;JI)V")
    public final void method1586(class476 arg0, long arg1, int arg2) {
        field3630++;
        if (arg0.field6879 != null) {
            arg0.method2791((byte) 112);
        }
        class476 var5 = this.field3629[(int) (arg1 & (long) (this.field3633 - arg2))];
        arg0.field6884 = var5;
        arg0.field6879 = var5.field6879;
        arg0.field6879.field6884 = arg0;
        arg0.field6883 = arg1;
        arg0.field6884.field6879 = arg0;
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(B)I")
    public final int method1587(byte arg0) {
        field3636++;
        if (arg0 > -83) {
            this.field3646 = 75;
        }
        return this.field3633;
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)Luj;")
    public final class476 method1588(int arg0) {
        this.field3646 = 0;
        field3634++;
        if (arg0 <= 6) {
            field3644 = -88;
        }
        return this.method1582(-106);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "([Luj;B)I")
    public final int method1589(class476[] arg0, byte arg1) {
        field3635++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3633; var4++) {
            class476 var5 = this.field3629[var4];
            for (class476 var6 = var5.field6884; var6 != var5; var6 = var6.field6884) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 < 75) {
            this.field3629 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(B)Luj;")
    public final class476 method1590(byte arg0) {
        field3632++;
        if (this.field3645 == null) {
            return null;
        }
        if (arg0 <= 19) {
            this.method1592((byte) 66, -119L);
        }
        class476 var2 = this.field3629[(int) (this.field3639 & (long) (this.field3633 - 1))];
        while (this.field3645 != var2) {
            if (this.field3645.field6883 == this.field3639) {
                class476 var3 = this.field3645;
                this.field3645 = this.field3645.field6884;
                return var3;
            }
            this.field3645 = this.field3645.field6884;
        }
        this.field3645 = null;
        return null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
    public static final void method1591(byte arg0, Object[] arg1, int[] arg2) {
        field3641++;
        int var3 = -111 / ((arg0 + 43) / 33);
        class84.method658(arg2.length - 1, 0, (byte) -3, arg2, arg1);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BJ)Luj;")
    public final class476 method1592(byte arg0, long arg1) {
        field3638++;
        this.field3639 = arg1;
        if (arg0 != -25) {
            method1591((byte) -98, null, null);
        }
        class476 var4 = this.field3629[(int) (arg1 & (long) (this.field3633 - 1))];
        for (this.field3645 = var4.field6884; this.field3645 != var4; this.field3645 = this.field3645.field6884) {
            if (this.field3645.field6883 == arg1) {
                class476 var5 = this.field3645;
                this.field3645 = this.field3645.field6884;
                return var5;
            }
        }
        this.field3645 = null;
        return null;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(I)V")
    public class270(int arg0) {
        this.field3629 = new class476[arg0];
        this.field3633 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class476 var3 = this.field3629[var2] = new class476();
            var3.field6884 = var3;
            var3.field6879 = var3;
        }
    }
}
