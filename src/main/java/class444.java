import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class444 {

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Laj;")
    public class400 field6446 = new class400();

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "[[Z")
    public static boolean[][] field6445 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Lvg;")
    public static class622 field6450 = new class622(7, 3);

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lnw;")
    public static class619 field6451 = new class619();

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "[I")
    public static int[] field6452 = new int[2];

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Laj;")
    private class400 field6447;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Laj;")
    public final class400 method2620(int arg0) {
        int var2 = 40 / ((-arg0 - 15) / 53);
        field6455++;
        class400 var3 = this.field6447;
        if (this.field6446 == var3) {
            this.field6447 = null;
            return null;
        } else {
            this.field6447 = var3.field6020;
            return var3;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Laj;")
    public final class400 method2621(int arg0) {
        field6454++;
        class400 var2 = this.field6446.field6020;
        if (arg0 != 0) {
            method2623(-76, null);
        }
        if (this.field6446 == var2) {
            this.field6447 = null;
            return null;
        } else {
            this.field6447 = var2.field6020;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public final void method2622(byte arg0) {
        while (true) {
            class400 var2 = this.field6446.field6020;
            if (this.field6446 == var2) {
                field6444++;
                if (arg0 != 28) {
                    method2623(66, null);
                }
                this.field6447 = null;
                return;
            }
            var2.method2481(arg0 - 27);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILoda;)V")
    public static final void method2623(int arg0, class654 arg1) {
        field6443++;
        if (arg0 < 114) {
            field6445 = null;
        }
        class474.field6805.method1909(arg1, (byte) -81);
        arg1.field9360 = arg1.field9358.field7956;
        class267.field3485 += arg1.field9360;
        arg1.field9358.field7956 = 0;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V")
    public static void method2624(byte arg0) {
        field6445 = null;
        field6451 = null;
        field6450 = null;
        if (arg0 <= 55) {
            method2626(96, -77L);
        }
        field6452 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILaj;)V")
    public final void method2625(int arg0, class400 arg1) {
        field6453++;
        if (arg1.field6027 != null) {
            arg1.method2481(1);
        }
        arg1.field6027 = this.field6446.field6027;
        arg1.field6020 = this.field6446;
        if (arg0 <= 41) {
            field6451 = null;
        }
        arg1.field6027.field6020 = arg1;
        arg1.field6020.field6027 = arg1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2626(int arg0, long arg1) {
        field6449++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0 != -4943) {
                field6445 = null;
            }
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class204.field2786[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
    public class444() {
        this.field6446.field6020 = this.field6446;
        this.field6446.field6027 = this.field6446;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)I")
    public final int method2627(int arg0) {
        field6448++;
        int var2 = 0;
        int var3 = -101 / ((62 - arg0) / 46);
        for (class400 var4 = this.field6446.field6020; var4 != this.field6446; var4 = var4.field6020) {
            var2++;
        }
        return var2;
    }
}
