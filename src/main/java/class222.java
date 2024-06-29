import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class222 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Z")
    public boolean field3694 = false;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public int field3704 = -1;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
    private int[] field3693 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
    public static int[] field3701 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
    public static int[] field3698 = new int[32];

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "[[S")
    public static short[][] field3710 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field3708 = 0;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3695 = 0;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
    private int[] field3699;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[Lok;")
    public static class146[] field3696;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[S")
    private short[] field3692;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[S")
    private short[] field3703;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[S")
    private short[] field3706;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "[S")
    private short[] field3713;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILwe;I)V", line = 10)
    private final void method1637(int arg0, class47 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3704 = arg1.method368(-127);
        } else if (arg0 == 2) {
            int var8 = arg1.method368(arg2 ^ 0xFFFFA08E);
            this.field3699 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3699[var9] = arg1.method379(-2);
            }
        } else if (arg0 == 3) {
            this.field3694 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method368(112);
            this.field3706 = new short[var6];
            this.field3713 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3706[var7] = (short) arg1.method379(-2);
                this.field3713[var7] = (short) arg1.method379(-2);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method368(arg2 + 24384);
            this.field3692 = new short[var4];
            this.field3703 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3692[var5] = (short) arg1.method379(-2);
                this.field3703[var5] = (short) arg1.method379(-2);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3693[arg0 - 60] = arg1.method379(-2);
        }
        if (arg2 != -24357) {
            this.field3713 = (short[]) null;
        }
        field3705++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Z", line = 88)
    public final boolean method1638(int arg0) {
        boolean var2 = true;
        field3711++;
        if (arg0 > -69) {
            field3695 = 12;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3693[var3] != -1 && !class258.field4286.method93(0, this.field3693[var3], false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 128)
    public static void method1639(int arg0) {
        field3698 = null;
        field3701 = null;
        field3696 = null;
        field3710 = (short[][]) null;
        if (arg0 != 9104) {
            field3697 = 92;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)Z", line = 146)
    public final boolean method1640(int arg0) {
        field3709++;
        if (this.field3699 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 13965) {
            this.method1640(-61);
        }
        for (int var3 = 0; var3 < this.field3699.length; var3++) {
            if (!class258.field4286.method93(0, this.field3699[var3], false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V", line = 172)
    public static final void method1641(int arg0, boolean arg1) {
        field3712++;
        if (arg1) {
            field3710 = (short[][]) ((short[][]) null);
        }
        class158 var2 = class206.method1564(arg0, 2, -110);
        var2.method1238(126);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Lvd;", line = 197)
    public final class130 method1642(int arg0) {
        field3702++;
        if (arg0 != -9442) {
            this.method1640(58);
        }
        if (this.field3699 == null) {
            return null;
        }
        class130[] var2 = new class130[this.field3699.length];
        for (int var3 = 0; var3 < this.field3699.length; var3++) {
            var2[var3] = class130.method957(class258.field4286, this.field3699[var3], 0);
        }
        class130 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class130(var2, var2.length);
        }
        if (this.field3706 != null) {
            for (int var5 = 0; var5 < this.field3706.length; var5++) {
                var4.method938(this.field3706[var5], this.field3713[var5]);
            }
        }
        if (this.field3692 != null) {
            for (int var6 = 0; var6 < this.field3692.length; var6++) {
                var4.method934(this.field3692[var6], this.field3703[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLwe;)V", line = 266)
    public final void method1643(byte arg0, class47 arg1) {
        field3707++;
        while (true) {
            int var3 = arg1.method368(36);
            if (var3 == 0) {
                if (arg0 <= 120) {
                    this.field3694 = false;
                }
                return;
            }
            this.method1637(var3, arg1, -24357);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Lvd;", line = 288)
    public final class130 method1644(byte arg0) {
        field3700++;
        if (arg0 > -69) {
            field3710 = (short[][]) ((short[][]) null);
        }
        int var2 = 0;
        class130[] var3 = new class130[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3693[var4] != -1) {
                var3[var2++] = class130.method957(class258.field4286, this.field3693[var4], 0);
            }
        }
        class130 var5 = new class130(var3, var2);
        if (this.field3706 != null) {
            for (int var6 = 0; var6 < this.field3706.length; var6++) {
                var5.method938(this.field3706[var6], this.field3713[var6]);
            }
        }
        if (this.field3692 != null) {
            for (int var7 = 0; var7 < this.field3692.length; var7++) {
                var5.method934(this.field3692[var7], this.field3703[var7]);
            }
        }
        return var5;
    }
}
