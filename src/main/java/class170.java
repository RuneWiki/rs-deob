import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class170 {

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lvg;")
    private class49 field2861 = new class49(16);

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "Lri;")
    private class97 field2865;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "Lrl;")
    public static class672 field2859 = new class672(83, 4);

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "[I")
    public static int[] field2864 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIILaga;II)Lpj;", line = 8)
    public final class132 method1401(byte arg0, int arg1, int arg2, class618 arg3, int arg4, int arg5) {
        field2862++;
        int var7 = -122 % ((arg0 - 71) / 53);
        class600[] var8 = null;
        class570 var9 = this.method1404(29, arg4);
        if (var9.field8161 != null) {
            var8 = new class600[var9.field8161.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class603 var11 = arg3.method3590((byte) 121, var9.field8161[var10]);
                var8[var10] = new class600(var11.field8572, var11.field8573, var11.field8578, var11.field8568, var11.field8576, var11.field8577, var11.field8575, var11.field8567);
            }
        }
        return new class132(var9.field8157, var8, var9.field8158, arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V", line = 39)
    public final void method1402(boolean arg0) {
        if (!arg0) {
            this.method1403(67, 41);
        }
        field2866++;
        class49 var2 = this.field2861;
        synchronized (this.field2861) {
            this.field2861.method569(0);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V", line = 56)
    public final void method1403(int arg0, int arg1) {
        class49 var3 = this.field2861;
        synchronized (this.field2861) {
            this.field2861.method573((byte) 119, arg1);
        }
        field2857++;
        if (arg0 != 2) {
            field2859 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)Lte;", line = 77)
    private final class570 method1404(int arg0, int arg1) {
        field2860++;
        class49 var3 = this.field2861;
        class570 var4;
        synchronized (this.field2861) {
            var4 = (class570) this.field2861.method560(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field2865;
        byte[] var6;
        synchronized (this.field2865) {
            var6 = this.field2865.method926(arg0, -126, arg1);
        }
        class570 var7 = new class570();
        if (var6 != null) {
            var7.method3366(new class6(var6), false);
        }
        class49 var8 = this.field2861;
        synchronized (this.field2861) {
            this.field2861.method559(var7, (long) arg1, arg0 - 29);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V", line = 105)
    public final void method1405(byte arg0) {
        class49 var2 = this.field2861;
        synchronized (this.field2861) {
            this.field2861.method563(0);
            int var3 = 65 % ((-arg0 - 6) / 44);
        }
        field2863++;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 117)
    public static void method1406(int arg0) {
        field2864 = null;
        int var1 = 43 / ((2 - arg0) / 57);
        field2859 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lei;ILri;)V", line = 133)
    public class170(class162 arg0, int arg1, class97 arg2) {
        this.field2865 = arg2;
        this.field2865.method949(29, 0);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)I", line = 148)
    public static final int method1407(int arg0) {
        field2858++;
        if ((double) class378.field5884 == 3.0D) {
            return 37;
        } else if ((double) class378.field5884 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 200) {
                field2864 = null;
            }
            if ((double) class378.field5884 == 6.0D) {
                return 75;
            } else if ((double) class378.field5884 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }
}
