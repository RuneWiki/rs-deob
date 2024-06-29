import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class281 extends class96 {

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "Z")
    public boolean field4677 = true;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "[I")
    public static int[] field4672 = new int[32];

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lna;")
    public static class26 field4689 = class69.method505(" )2> <col=00ffff>", (byte) -124);

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "Ln;")
    public static class282 field4687 = new class282(64);

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lna;")
    public static class26 field4691 = class69.method505("titlebg", (byte) -118);

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "Lna;")
    public static class26 field4694 = class69.method505(": ", (byte) -120);

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "Lna;")
    private static class26 field4695 = class69.method505("Loaded title screen", (byte) -126);

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lna;")
    public static class26 field4693 = class69.method505("name_icons", (byte) -126);

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Lna;")
    public static class26 field4692 = field4695;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lle;")
    public static class243 field4696;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "[I")
    private int[] field4674;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "[I")
    public int[] field4675;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "[Lna;")
    private class26[] field4684;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "[[I")
    private int[][] field4683;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lwa;[IZ)V", line = 21)
    public final void method1967(class82 arg0, int[] arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field4681++;
        if (this.field4674 == null) {
            return;
        }
        for (int var4 = 0; this.field4674.length > var4 && var4 < arg1.length; var4++) {
            int var5 = class122.field1900[this.method1972(89, var4)];
            if (var5 > 0) {
                arg0.method578(0, var5, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lwa;I)V", line = 47)
    public final void method1968(class82 arg0, int arg1) {
        field4685++;
        while (true) {
            int var3 = arg0.method642((byte) -43);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.field4675 = (int[]) null;
                }
                return;
            }
            this.method1975(arg0, var3, -14637);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 75)
    public static void method1969(int arg0) {
        if (arg0 != -2951) {
            field4693 = (class26) null;
        }
        field4695 = null;
        field4687 = null;
        field4692 = null;
        field4691 = null;
        field4694 = null;
        field4693 = null;
        field4689 = null;
        field4696 = null;
        field4672 = null;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V", line = 96)
    public final void method1970(int arg0) {
        if (this.field4675 != null) {
            for (int var2 = 0; var2 < this.field4675.length; var2++) {
                this.field4675[var2] = class240.method1652(this.field4675[var2], 32768);
            }
        }
        field4686++;
        if (arg0 != 60) {
            this.method1974(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I", line = 115)
    public final int method1971(int arg0, int arg1, int arg2) {
        if (arg0 > -99) {
            field4694 = (class26) null;
        }
        field4690++;
        if (this.field4674 == null || arg2 < 0 || arg2 > this.field4674.length) {
            return -1;
        } else if (this.field4683[arg2] == null || arg1 < 0 || arg1 > this.field4683[arg2].length) {
            return -1;
        } else {
            return this.field4683[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)I", line = 135)
    public final int method1972(int arg0, int arg1) {
        field4678++;
        if (this.field4674 == null || arg1 < 0 || arg1 > this.field4674.length) {
            return -1;
        } else {
            if (arg0 <= 33) {
                field4695 = (class26) null;
            }
            return this.field4674[arg1];
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V", line = 150)
    public static final void method1973(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 4 && !class244.field4012) {
            arg2 = 2;
            arg1 = 2;
        }
        field4673++;
        if (class38.field621 != arg2) {
            if (class74.field1130) {
                return;
            }
            if (class38.field621 != 0) {
                class9.field121[class38.field621].method15();
            }
            if (arg2 != 0) {
                class91 var3 = class9.field121[arg2];
                var3.method17();
                var3.method16(arg1);
            }
            class38.field621 = arg2;
            class135.field2069 = arg1;
        } else if (arg2 != 0 && class135.field2069 != arg1) {
            class9.field121[arg2].method16(arg1);
            class135.field2069 = arg1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I", line = 203)
    public final int method1974(boolean arg0) {
        if (arg0) {
            field4676++;
            return this.field4674 == null ? 0 : this.field4674.length;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lwa;II)V", line = 221)
    private final void method1975(class82 arg0, int arg1, int arg2) {
        if (arg2 != -14637) {
            this.method1970(-20);
        }
        field4680++;
        if (arg1 == 1) {
            this.field4684 = arg0.method615(true).method198(60, (byte) 118);
        } else if (arg1 == 2) {
            int var8 = arg0.method642((byte) -114);
            this.field4675 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4675[var9] = arg0.method576(1);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method642((byte) -34);
            this.field4674 = new int[var4];
            this.field4683 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method576(1);
                this.field4674[var5] = var6;
                this.field4683[var5] = new int[class53.field841[var6]];
                for (int var7 = 0; var7 < class53.field841[var6]; var7++) {
                    this.field4683[var5][var7] = arg0.method576(1);
                }
            }
        } else if (arg1 == 4) {
            this.field4677 = false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Lna;", line = 295)
    public final class26 method1976(int arg0) {
        field4682++;
        if (arg0 != -1) {
            return (class26) null;
        }
        class26 var2 = class5.method26((byte) -118, 80);
        if (this.field4684 == null) {
            return class240.field3878;
        }
        var2.method164(this.field4684[0], true);
        for (int var3 = 1; var3 < this.field4684.length; var3++) {
            var2.method164(class325.field5638, true);
            var2.method164(this.field4684[var3], true);
        }
        return var2.method207((byte) 90);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILwa;)Lna;", line = 323)
    public final class26 method1977(int arg0, class82 arg1) {
        field4688++;
        if (arg0 != 28021) {
            this.field4683 = (int[][]) ((int[][]) null);
        }
        class26 var3 = class5.method26((byte) -125, 80);
        if (this.field4674 != null) {
            for (int var4 = 0; var4 < this.field4674.length; var4++) {
                var3.method164(this.field4684[var4], true);
                var3.method164(class302.method2123(this.field4683[var4], arg1.method611(class327.field5666[this.field4674[var4]], arg0 - 28021), this.field4674[var4], false), true);
            }
        }
        var3.method164(this.field4684[this.field4684.length - 1], true);
        return var3.method207((byte) 90);
    }
}
