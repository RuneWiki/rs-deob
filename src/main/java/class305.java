import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class305 extends class130 {

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
    public boolean field4675;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[Lub;")
    public class305[] field4668;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "F")
    public static float field4672;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "F")
    public static float field4680;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lwn;")
    public static class177 field4670;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Lug;")
    public class334 field4677;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Lls;")
    public class342 field4674;

    static {
        new class179("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field4672 = 0.0F;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 4)
    public void method17(byte arg0) {
        field4664++;
        if (arg0 != -62) {
            field4670 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)[[I", line = 15)
    public int[][] method72(int arg0, byte arg1) {
        field4676++;
        if (arg1 <= -59) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)[[I", line = 28)
    public final int[][] method2015(boolean arg0, int arg1, int arg2) {
        field4669++;
        if (!arg0) {
            return null;
        } else if (this.field4668[arg1].field4675) {
            int[] var4 = this.field4668[arg1].method15(arg2, 4688);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4668[arg1].method72(arg2, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 60)
    public static void method2016(int arg0) {
        field4670 = null;
        if (arg0 > -31) {
            method2016(-79);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I", line = 74)
    public int method2017(int arg0) {
        if (arg0 != -24033) {
            method2016(114);
        }
        field4666++;
        return -1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V", line = 90)
    public void method2018(byte arg0, int arg1, int arg2) {
        field4673++;
        int var4 = this.field4667 == 255 ? arg1 : this.field4667;
        if (arg0 != -26) {
            this.method2020((byte) 98);
        }
        if (this.field4675) {
            this.field4677 = new class334(var4, arg1, arg2);
        } else {
            this.field4674 = new class342(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 113)
    public void method2019(byte arg0) {
        if (this.field4675) {
            this.field4677.method2175(0);
            this.field4677 = null;
        } else {
            this.field4674.method2203(75);
            this.field4674 = null;
        }
        field4678++;
        int var2 = 62 % ((-arg0 - 68) / 32);
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)I", line = 153)
    public int method2020(byte arg0) {
        if (arg0 <= 20) {
            return -54;
        } else {
            field4671++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I", line = 166)
    public int[] method15(int arg0, int arg1) {
        field4679++;
        if (arg1 == 4688) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILfh;B)V", line = 177)
    public void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 < 76) {
            this.method2019((byte) 104);
        }
        field4665++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)[I", line = 187)
    public final int[] method2021(int arg0, int arg1, int arg2) {
        field4663++;
        if (arg2 == 0) {
            return this.field4668[arg0].field4675 ? this.field4668[arg0].method15(arg1, 4688) : this.field4668[arg0].method72(arg1, (byte) -74)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IZ)V", line = 216)
    public class305(int arg0, boolean arg1) {
        this.field4675 = arg1;
        this.field4668 = new class305[arg0];
    }
}
