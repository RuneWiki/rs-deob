import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class762 extends class454 {

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "[I")
    public static int[] field10563 = new int[8];

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "Lsv;")
    public static class570 field10571 = new class570(58, -1);

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "F")
    public static float field10564;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "J")
    public static long field10560;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "Lgga;")
    public static class513 field10561;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Ljava/lang/String;")
    public String field10574;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "[C")
    public char[] field10567;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "[C")
    public char[] field10568;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "[I")
    public int[] field10569;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "[I")
    public int[] field10572;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "[J")
    public static long[] field10566;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lol;II)V")
    private final void method4212(class431 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.method4216((byte) -76, (char) 65453);
        }
        field10565++;
        if (arg2 == 1) {
            this.field10574 = arg0.method2532((byte) -115);
        } else if (arg2 == 2) {
            int var4 = arg0.method2557(arg1 + 14930);
            this.field10572 = new int[var4];
            this.field10568 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10572[var5] = arg0.method2565((byte) -102);
                byte var6 = arg0.method2529(arg1 ^ 0xFFFFFFA4);
                this.field10568[var5] = var6 == 0 ? 0 : class478.method2834((byte) 116, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method2557(arg1 + 14930);
            this.field10569 = new int[var7];
            this.field10567 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field10569[var8] = arg0.method2565((byte) -115);
                byte var9 = arg0.method2529(arg1 ^ 0xFFFFFFD7);
                this.field10567[var8] = var9 == 0 ? 0 : class478.method2834((byte) 58, var9);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(CI)I")
    public final int method4213(char arg0, int arg1) {
        field10570++;
        if (this.field10569 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field10569.length; var3++) {
            if (this.field10567[var3] == arg0) {
                return this.field10569[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method4214(boolean arg0) {
        if (arg0) {
            field10566 = null;
            field10571 = null;
            field10563 = null;
            field10561 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lol;B)V")
    public final void method4215(class431 arg0, byte arg1) {
        field10562++;
        while (true) {
            int var3 = arg0.method2557(14929);
            if (var3 == 0) {
                if (arg1 == -39) {
                    return;
                } else {
                    this.method4217(-14);
                    return;
                }
            }
            this.method4212(arg0, arg1 + 38, var3);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BC)I")
    public final int method4216(byte arg0, char arg1) {
        field10559++;
        if (this.field10572 == null) {
            return -1;
        }
        int var3 = 0;
        int var4 = 90 % ((-arg0 - 58) / 61);
        while (this.field10572.length > var3) {
            if (this.field10568[var3] == arg1) {
                return this.field10572[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public final void method4217(int arg0) {
        field10573++;
        if (this.field10569 != null) {
            for (int var2 = 0; var2 < this.field10569.length; var2++) {
                this.field10569[var2] = class694.method3895(this.field10569[var2], 32768);
            }
        }
        if (this.field10572 != null) {
            for (int var3 = 0; var3 < this.field10572.length; var3++) {
                this.field10572[var3] = class694.method3895(this.field10572[var3], 32768);
            }
        }
        if (arg0 != -28188) {
            this.method4216((byte) -31, (char) 65477);
        }
    }
}
