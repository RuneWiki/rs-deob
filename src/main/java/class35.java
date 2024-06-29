import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lef;")
    private class205 field650;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Lsi;")
    private class192 field663;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Luh;")
    private class99 field660;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field668 = -1;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[[I")
    public static int[][] field664 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "Leb;")
    public static class230 field667 = class68.method589(0, "cross");

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lfk;")
    private class14 field665;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "[Lqb;")
    private class57[] field656;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
    public static final boolean method318(int arg0, int arg1, int arg2) {
        int var3 = class16.field359[arg0][arg1][arg2];
        if (-class168.field2968 == var3) {
            return false;
        } else if (class168.field2968 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class177.method1286(var4 + 1, class106.field1912[arg0][arg1][arg2], var5 + 1) && class177.method1286(var4 + 128 - 1, class106.field1912[arg0][arg1 + 1][arg2], var5 + 1) && class177.method1286(var4 + 128 - 1, class106.field1912[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class177.method1286(var4 + 1, class106.field1912[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class16.field359[arg0][arg1][arg2] = class168.field2968;
                return true;
            } else {
                class16.field359[arg0][arg1][arg2] = -class168.field2968;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Llh;Llh;IIZ)Lqb;")
    private final class57 method319(class274 arg0, class274 arg1, int arg2, int arg3, boolean arg4) {
        field661++;
        if (this.field665 == null) {
            throw new RuntimeException();
        }
        int var6 = 56 % ((19 - arg3) / 49);
        this.field665.field318 = arg2 * 8 + 5;
        if (this.field665.field269.length <= this.field665.field318) {
            throw new RuntimeException();
        } else if (this.field656[arg2] == null) {
            int var7 = this.field665.method187((byte) 61);
            int var8 = this.field665.method187((byte) 61);
            class57 var9 = new class57(arg2, arg0, arg1, this.field663, this.field650, var7, var8, arg4);
            this.field656[arg2] = var9;
            return var9;
        } else {
            return this.field656[arg2];
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Llh;Llh;II)Lqb;")
    public final class57 method320(class274 arg0, class274 arg1, int arg2, int arg3) {
        field653++;
        if (arg3 != -21877) {
            this.method319((class274) null, (class274) null, 118, -124, true);
        }
        return this.method319(arg1, arg0, arg2, -86, true);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILkk;Lkk;IB)Lsf;")
    public static final class93 method321(int arg0, class223 arg1, class223 arg2, int arg3, byte arg4) {
        field666++;
        if (arg4 <= 63) {
            field667 = null;
        }
        return class205.method1440(arg3, arg0, 2, arg2) ? class194.method1391(arg1.method1546(arg3, (byte) -100, arg0), -29038) : null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method322(int arg0) {
        field652++;
        if (arg0 != -11135) {
            method321(103, (class223) null, (class223) null, -26, (byte) 27);
        }
        for (class191 var1 = (class191) class222.field3806.method839(128); var1 != null; var1 = (class191) class222.field3806.method834((byte) 82)) {
            if (var1.field3368 == -1) {
                var1.field3366 = 0;
                class48.method400(1261384544, var1);
            } else {
                var1.method518(86);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public final void method323(boolean arg0) {
        field658++;
        if (this.field656 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field656.length; var2++) {
            if (this.field656[var2] != null) {
                this.field656[var2].method478(-20270);
            }
        }
        for (int var3 = 0; var3 < this.field656.length; var3++) {
            if (this.field656[var3] != null) {
                this.field656[var3].method476(false);
            }
        }
        if (!arg0) {
            this.method319((class274) null, (class274) null, 93, -99, false);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
    public static final void method324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field657++;
        for (int var5 = arg0; var5 < class72.field1318; var5++) {
            if (arg1 < class76.field1375[var5] + class177.field3115[var5] && class76.field1375[var5] < arg1 + arg3 && class172.field3039[var5] + class153.field2731[var5] > arg2 && class153.field2731[var5] < arg2 + arg4) {
                class125.field2198[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static void method325(int arg0) {
        field664 = null;
        field667 = null;
        if (arg0 != 28757) {
            method327(124, (class223) null);
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Z")
    public final boolean method326(int arg0) {
        if (arg0 != 1) {
            method324(-30, -12, 96, 125, -81);
        }
        field654++;
        if (this.field665 != null) {
            return true;
        }
        if (this.field660 == null) {
            if (this.field663.method1368(11358)) {
                return false;
            }
            this.field660 = this.field663.method1375((byte) 104, (byte) 0, true, 255, 255);
        }
        if (this.field660.field2050) {
            return false;
        } else {
            this.field665 = new class14(this.field660.method811((byte) -85));
            this.field656 = new class57[(this.field665.field269.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILkk;)V")
    public static final void method327(int arg0, class223 arg1) {
        field651++;
        if (class158.field2817) {
            return;
        }
        class87.method696();
        class213.field3688 = class166.method1232(class60.field1144, (byte) 84, arg1);
        int var2 = class135.field2434;
        int var3 = var2 * 956 / 503;
        class213.field3688.method113((class180.field3155 - var3) / 2, 0, var3, var2);
        class260.field4625 = class189.method1353(arg1, 0, class259.field4576);
        class260.field4625.method405(class180.field3155 / 2 - (class260.field4625.field861 / 2), 18);
        class158.field2817 = true;
        int var4 = -6 / ((arg0 + 74) / 45);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lsi;Lef;)V")
    public class35(class192 arg0, class205 arg1) {
        this.field650 = arg1;
        this.field663 = arg0;
        if (!this.field663.method1368(11358)) {
            this.field660 = this.field663.method1375((byte) 123, (byte) 0, true, 255, 255);
        }
    }
}
