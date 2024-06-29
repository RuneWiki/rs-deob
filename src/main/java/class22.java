import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class22 {

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Lbj;")
    private class88 field297 = new class88();

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Z")
    public static boolean field291 = false;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field294 = 0;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[Z")
    public static boolean[] field288 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lbj;")
    private class88 field298;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public final void method121(byte arg0) {
        field286++;
        while (true) {
            class88 var2 = this.field297.field1078;
            if (this.field297 == var2) {
                int var3 = 7 / ((58 - arg0) / 32);
                this.field298 = null;
                return;
            }
            var2.method480(123);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Lbj;")
    public final class88 method122(int arg0) {
        field295++;
        class88 var2 = this.field298;
        if (arg0 < 18) {
            field288 = null;
        }
        if (this.field297 == var2) {
            this.field298 = null;
            return null;
        } else {
            this.field298 = var2.field1078;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method123(int arg0) {
        field288 = null;
        int var1 = -37 / ((-arg0 - 51) / 41);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)Lbj;")
    public final class88 method124(int arg0) {
        class88 var2 = this.field297.field1078;
        field292++;
        if (arg0 != 0) {
            return null;
        } else if (this.field297 == var2) {
            this.field298 = null;
            return null;
        } else {
            this.field298 = var2.field1078;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lbj;I)V")
    public final void method125(class88 arg0, int arg1) {
        if (arg1 != -1) {
            this.method125((class88) null, -110);
        }
        if (arg0.field1083 != null) {
            arg0.method480(99);
        }
        field301++;
        arg0.field1078 = this.field297;
        arg0.field1083 = this.field297.field1083;
        arg0.field1083.field1078 = arg0;
        arg0.field1078.field1083 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)Lbj;")
    public final class88 method126(byte arg0) {
        if (arg0 <= 92) {
            field291 = false;
        }
        field290++;
        class88 var2 = this.field297.field1078;
        if (this.field297 == var2) {
            return null;
        } else {
            var2.method480(110);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[Ljava/lang/String;IB[S)V")
    public static final void method127(int arg0, String[] arg1, int arg2, byte arg3, short[] arg4) {
        if (arg0 > arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method127(var6 - 1, arg1, arg2, (byte) -103, arg4);
            method127(arg0, arg1, var6 + 1, (byte) -95, arg4);
        }
        field299++;
        int var12 = 86 % ((18 - arg3) / 57);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BILwb;)I")
    public static final int method128(byte arg0, int arg1, class123 arg2) {
        if (arg0 > -93) {
            field293 = -70;
        }
        field287++;
        if (!client.method735(arg2).method1166(arg1, true) && arg2.field1855 == null) {
            return -1;
        } else if (arg2.field1787 == null || arg2.field1787.length <= arg1) {
            return -1;
        } else {
            return arg2.field1787[arg1];
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)I")
    public final int method129(int arg0) {
        int var2 = arg0;
        field285++;
        for (class88 var3 = this.field297.field1078; var3 != this.field297; var3 = var3.field1078) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lwd;B)V")
    public static final void method130(class104 arg0, byte arg1) {
        field300++;
        int var2 = -78 % ((arg1 + 80) / 38);
        class173.field2743 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class22() {
        this.field297.field1078 = this.field297;
        this.field297.field1083 = this.field297;
    }
}
