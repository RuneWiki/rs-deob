import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class465 {

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    private int field6547 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "[Lkp;")
    public class417[] field6543;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field6529;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
    public static int[] field6531 = new int[2];

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field6534 = -1;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "J")
    private long field6545;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lkp;")
    private class417 field6530;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lkp;")
    private class417 field6548;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lra;")
    public static class92 field6539;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
    public static boolean field6546;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILkp;J)V")
    public final void method2797(int arg0, class417 arg1, long arg2) {
        if (arg0 != -4234) {
            this.field6530 = null;
        }
        if (arg1.field5648 != null) {
            arg1.method2457(arg0 ^ 0x306C);
        }
        field6542++;
        class417 var5 = this.field6543[(int) ((long) (this.field6529 - 1) & arg2)];
        arg1.field5645 = var5;
        arg1.field5648 = var5.field5648;
        arg1.field5648.field5645 = arg1;
        arg1.field5645.field5648 = arg1;
        arg1.field5651 = arg2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Lkp;")
    public final class417 method2798(byte arg0) {
        this.field6547 = 0;
        if (arg0 >= -16) {
            this.field6545 = 89L;
        }
        field6541++;
        return this.method2806(true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)Lkp;")
    public final class417 method2799(long arg0, boolean arg1) {
        this.field6545 = arg0;
        field6532++;
        class417 var4 = this.field6543[(int) (arg0 & (long) (this.field6529 - 1))];
        for (this.field6530 = var4.field5645; this.field6530 != var4; this.field6530 = this.field6530.field5645) {
            if (this.field6530.field5651 == arg0) {
                class417 var5 = this.field6530;
                this.field6530 = this.field6530.field5645;
                return var5;
            }
        }
        this.field6530 = null;
        if (!arg1) {
            this.method2801(121);
        }
        return null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public final void method2800(int arg0) {
        field6540++;
        for (int var2 = arg0; var2 < this.field6529; var2++) {
            class417 var3 = this.field6543[var2];
            while (true) {
                class417 var4 = var3.field5645;
                if (var3 == var4) {
                    break;
                }
                var4.method2457(-8422);
            }
        }
        this.field6530 = null;
        this.field6548 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Lkp;")
    public final class417 method2801(int arg0) {
        field6535++;
        if (this.field6530 == null) {
            return null;
        }
        int var2 = 92 % ((3 - arg0) / 62);
        class417 var3 = this.field6543[(int) (this.field6545 & (long) (this.field6529 - 1))];
        while (this.field6530 != var3) {
            if (this.field6530.field5651 == this.field6545) {
                class417 var4 = this.field6530;
                this.field6530 = this.field6530.field5645;
                return var4;
            }
            this.field6530 = this.field6530.field5645;
        }
        this.field6530 = null;
        return null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static void method2802(int arg0) {
        field6531 = null;
        if (arg0 < 12) {
            field6539 = null;
        }
        field6539 = null;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
    public final int method2803(int arg0) {
        field6536++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field6529; var3++) {
            class417 var4 = this.field6543[var3];
            for (class417 var5 = var4.field5645; var5 != var4; var5 = var5.field5645) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z[Lkp;)I")
    public final int method2804(boolean arg0, class417[] arg1) {
        field6538++;
        int var3 = 0;
        int var4 = 0;
        if (arg0) {
            this.field6548 = null;
        }
        while (var4 < this.field6529) {
            class417 var5 = this.field6543[var4];
            for (class417 var6 = var5.field5645; var6 != var5; var6 = var6.field5645) {
                arg1[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)I")
    public final int method2805(int arg0) {
        field6533++;
        if (arg0 != 0) {
            field6531 = null;
        }
        return this.field6529;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
    public class465(int arg0) {
        this.field6543 = new class417[arg0];
        this.field6529 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class417 var3 = this.field6543[var2] = new class417();
            var3.field5645 = var3;
            var3.field5648 = var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Lkp;")
    public final class417 method2806(boolean arg0) {
        field6544++;
        if (this.field6547 > 0 && this.field6543[this.field6547 - 1] != this.field6548) {
            class417 var2 = this.field6548;
            this.field6548 = var2.field5645;
            return var2;
        }
        while (this.field6547 < this.field6529) {
            class417 var3 = this.field6543[this.field6547++].field5645;
            if (this.field6543[this.field6547 - 1] != var3) {
                this.field6548 = var3.field5645;
                return var3;
            }
        }
        return arg0 ? null : null;
    }
}
