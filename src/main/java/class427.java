import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class427 {

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    private int field6164 = 0;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[Liga;")
    public class425[] field6148;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[I")
    public static int[] field6152 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "Lhga;")
    public static class158 field6163 = new class158();

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "J")
    private long field6162;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Liga;")
    private class425 field6150;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "Liga;")
    private class425 field6165;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method2592(byte arg0) {
        if (arg0 != 49) {
            field6163 = null;
        }
        field6152 = null;
        field6163 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
    public final int method2593(int arg0) {
        if (arg0 == -30681) {
            field6147++;
            return this.field6158;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Liga;")
    public final class425 method2594(byte arg0) {
        field6154++;
        if (arg0 != -122) {
            return null;
        } else if (this.field6164 <= 0 || this.field6148[this.field6164 - 1] == this.field6165) {
            while (this.field6158 > this.field6164) {
                class425 var3 = this.field6148[this.field6164++].field6134;
                if (this.field6148[this.field6164 - 1] != var3) {
                    this.field6165 = var3.field6134;
                    return var3;
                }
            }
            return null;
        } else {
            class425 var2 = this.field6165;
            this.field6165 = var2.field6134;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Liga;")
    public final class425 method2595(int arg0) {
        field6160++;
        if (this.field6150 == null) {
            return null;
        }
        class425 var2 = this.field6148[(int) (this.field6162 & (long) (this.field6158 - 1))];
        while (this.field6150 != var2) {
            if (this.field6150.field6132 == this.field6162) {
                class425 var3 = this.field6150;
                this.field6150 = this.field6150.field6134;
                return var3;
            }
            this.field6150 = this.field6150.field6134;
        }
        if (arg0 == 27126) {
            this.field6150 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(JI)Liga;")
    public final class425 method2596(long arg0, int arg1) {
        field6146++;
        this.field6162 = arg0;
        if (arg1 < 39) {
            this.field6158 = -52;
        }
        class425 var4 = this.field6148[(int) ((long) (this.field6158 - 1) & arg0)];
        for (this.field6150 = var4.field6134; this.field6150 != var4; this.field6150 = this.field6150.field6134) {
            if (this.field6150.field6132 == arg0) {
                class425 var5 = this.field6150;
                this.field6150 = this.field6150.field6134;
                return var5;
            }
        }
        this.field6150 = null;
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)Liga;")
    public final class425 method2597(byte arg0) {
        int var2 = 119 / ((-arg0 - 36) / 53);
        this.field6164 = 0;
        field6159++;
        return this.method2594((byte) -122);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Liga;JB)V")
    public final void method2598(class425 arg0, long arg1, byte arg2) {
        field6149++;
        if (arg0.field6139 != null) {
            arg0.method2588(arg2 ^ 0x124);
        }
        class425 var5 = this.field6148[(int) ((long) (this.field6158 - 1) & arg1)];
        arg0.field6139 = var5.field6139;
        arg0.field6134 = var5;
        if (arg2 != 8) {
            method2602(null, 111, null, 101, -66);
        }
        arg0.field6139.field6134 = arg0;
        arg0.field6132 = arg1;
        arg0.field6134.field6139 = arg0;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[Liga;)I")
    public final int method2599(int arg0, class425[] arg1) {
        field6157++;
        int var3 = 0;
        int var4 = 0;
        if (arg0 > -61) {
            return 24;
        }
        while (var4 < this.field6158) {
            class425 var5 = this.field6148[var4];
            for (class425 var6 = var5.field6134; var6 != var5; var6 = var6.field6134) {
                arg1[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)V")
    public final void method2600(byte arg0) {
        field6145++;
        for (int var2 = 0; var2 < this.field6158; var2++) {
            class425 var3 = this.field6148[var2];
            while (true) {
                class425 var4 = var3.field6134;
                if (var3 == var4) {
                    break;
                }
                var4.method2588(300);
            }
        }
        this.field6150 = null;
        if (arg0 != -114) {
            this.method2600((byte) -68);
        }
        this.field6165 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
    public static final void method2601(int arg0, int arg1, int arg2) {
        field6156++;
        if (arg2 != -5136) {
            method2601(116, 85, 23);
        }
        class19 var3 = class373.method2355(105, arg1, 12);
        var3.method432(52);
        var3.field829 = arg0;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([II[JII)V")
    public static final void method2602(int[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg4 < 76) {
            return;
        }
        if (arg3 > arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg3; var11++) {
                if (arg2[var11] < (long) (var11 & var10) + var7) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method2602(arg0, arg1, arg2, var6 - 1, 123);
            method2602(arg0, var6 + 1, arg2, arg3, 80);
        }
        field6155++;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I")
    public final int method2603(int arg0) {
        field6161++;
        int var2 = 0;
        if (arg0 >= -115) {
            return 44;
        }
        for (int var3 = 0; var3 < this.field6158; var3++) {
            class425 var4 = this.field6148[var3];
            class425 var5 = var4.field6134;
            while (var4 != var5) {
                var5 = var5.field6134;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V")
    public class427(int arg0) {
        this.field6158 = arg0;
        this.field6148 = new class425[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class425 var3 = this.field6148[var2] = new class425();
            var3.field6134 = var3;
            var3.field6139 = var3;
        }
    }
}
