import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class556 {

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Ljn;")
    private class117 field8140 = new class117(16);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lvo;")
    private class345 field8127;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Ltw;")
    public static class233 field8136 = new class233();

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "Lau;")
    public static class692 field8137 = new class692();

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Ljb;")
    public static class666 field8138 = new class666(3);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "[[B")
    public static byte[][] field8139;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIZZB)V")
    public static final void method3252(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, byte arg6) {
        if (arg0 < arg2) {
            int var7 = (arg0 + arg2) / 2;
            int var8 = arg0;
            class613 var9 = class432.field6219[var7];
            class432.field6219[var7] = class432.field6219[arg2];
            class432.field6219[arg2] = var9;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (class661.method3717(200, class432.field6219[var10], arg4, arg1, var9, arg3, arg5) <= 0) {
                    class613 var11 = class432.field6219[var10];
                    class432.field6219[var10] = class432.field6219[var8];
                    class432.field6219[var8++] = var11;
                }
            }
            class432.field6219[arg2] = class432.field6219[var8];
            class432.field6219[var8] = var9;
            method3252(arg0, arg1, var8 - 1, arg3, arg4, arg5, (byte) 52);
            method3252(var8 + 1, arg1, arg2, arg3, arg4, arg5, (byte) 73);
        }
        int var12 = -109 / ((-arg6 - 34) / 38);
        field8133++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
    public final void method3253(int arg0, int arg1) {
        class117 var3 = this.field8140;
        synchronized (this.field8140) {
            if (arg1 > -60) {
                this.method3258(-54, 35);
            }
            this.field8140.method939(28093, arg0);
        }
        field8129++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
    public static void method3254(boolean arg0) {
        field8137 = null;
        field8136 = null;
        if (arg0) {
            field8137 = null;
        }
        field8139 = null;
        field8138 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIILkc;I)Lpfa;")
    public final class222 method3255(int arg0, int arg1, int arg2, int arg3, class59 arg4, int arg5) {
        field8135++;
        class478[] var7 = null;
        class273 var8 = this.method3258(arg3 ^ 0xFFFFC351, arg1);
        if (var8.field3905 != null) {
            var7 = new class478[var8.field3905.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class455 var10 = arg4.method505(var8.field3905[var9], 30);
                var7[var9] = new class478(var10.field6537, var10.field6544, var10.field6533, var10.field6532, var10.field6534, var10.field6540, var10.field6545, var10.field6546);
            }
        }
        if (arg3 != -15540) {
            this.method3260(false);
        }
        return new class222(var8.field3907, var7, var8.field3903, arg5, arg0, arg2);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public final void method3256(int arg0) {
        field8131++;
        class117 var2 = this.field8140;
        synchronized (this.field8140) {
            if (arg0 != 3) {
                this.method3253(-46, -127);
            }
            this.field8140.method936(-128);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IFIZIIIB)[I")
    public static final int[] method3257(int arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, byte arg7) {
        field8128++;
        int var8 = 78 / ((-arg7 - 50) / 56);
        int[] var9 = new int[arg0];
        class334 var10 = new class334();
        var10.field4651 = arg3;
        var10.field4647 = arg5;
        var10.field4650 = arg2;
        var10.field4657 = (int) (arg1 * 4096.0F);
        var10.field4655 = arg6;
        var10.field4646 = arg4;
        var10.method422(-1);
        class550.method3227(-63, arg0, 1);
        var10.method1990(255, var9, 0);
        return var9;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Lna;")
    private final class273 method3258(int arg0, int arg1) {
        field8132++;
        class117 var3 = this.field8140;
        class273 var4;
        synchronized (this.field8140) {
            var4 = (class273) this.field8140.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field8127;
        byte[] var6;
        synchronized (this.field8127) {
            var6 = this.field8127.method2081(25, arg1, arg0);
        }
        class273 var7 = new class273();
        if (var6 != null) {
            var7.method1717(new class465(var6), -30666);
        }
        class117 var8 = this.field8140;
        synchronized (this.field8140) {
            this.field8140.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjava/lang/String;ZZLjava/lang/String;)V")
    public static final void method3259(int arg0, String arg1, boolean arg2, boolean arg3, String arg4) {
        class49.method386(-1, arg4, arg1, arg2, -13808, true, arg0);
        if (arg3) {
            method3252(-39, 74, -8, 81, true, false, (byte) -37);
        }
        field8130++;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)V")
    public final void method3260(boolean arg0) {
        field8134++;
        class117 var2 = this.field8140;
        synchronized (this.field8140) {
            this.field8140.method950((byte) -124);
        }
        if (!arg0) {
            this.method3258(1, -9);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class556(class529 arg0, int arg1, class345 arg2) {
        this.field8127 = arg2;
        this.field8127.method2098(0, 29);
    }
}
