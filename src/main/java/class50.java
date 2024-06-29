import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class50 {

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    private int field577 = 0;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lpe;")
    public class435[] field567;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lbu;")
    public static class17 field574 = new class17("WTI", 5);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "J")
    private long field571;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lpe;")
    private class435 field575;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lpe;")
    private class435 field578;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(JLpe;I)V", line = 3)
    public final void method291(long arg0, class435 arg1, int arg2) {
        if (arg2 > -17) {
            return;
        }
        field576++;
        if (arg1.field6345 != null) {
            arg1.method2674(true);
        }
        class435 var5 = this.field567[(int) (arg0 & (long) (this.field572 - 1))];
        arg1.field6345 = var5.field6345;
        arg1.field6344 = var5;
        arg1.field6345.field6344 = arg1;
        arg1.field6348 = arg0;
        arg1.field6344.field6345 = arg1;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 23)
    public static void method292(int arg0) {
        if (arg0 != -31680) {
            method292(124);
        }
        field574 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 33)
    public final void method293(byte arg0) {
        int var2 = 73 % ((arg0 + 45) / 60);
        for (int var3 = 0; var3 < this.field572; var3++) {
            class435 var4 = this.field567[var3];
            while (true) {
                class435 var5 = var4.field6344;
                if (var4 == var5) {
                    break;
                }
                var5.method2674(true);
            }
        }
        field566++;
        this.field578 = null;
        this.field575 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I", line = 65)
    public final int method294(byte arg0) {
        field563++;
        if (arg0 != 0) {
            this.field572 = -126;
        }
        return this.field572;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(JI)Lpe;", line = 88)
    public final class435 method295(long arg0, int arg1) {
        this.field571 = arg0;
        field562++;
        class435 var4 = this.field567[(int) ((long) (this.field572 - 1) & arg0)];
        for (this.field575 = var4.field6344; this.field575 != var4; this.field575 = this.field575.field6344) {
            if (this.field575.field6348 == arg0) {
                class435 var5 = this.field575;
                this.field575 = this.field575.field6344;
                return var5;
            }
        }
        if (arg1 > -85) {
            field574 = null;
        }
        this.field575 = null;
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B[[[BILza;IIIIIIIII)V", line = 119)
    public static final void method296(byte arg0, byte[][][] arg1, int arg2, class287 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field569++;
        if (arg5 == 0 || arg10 == 0) {
            return;
        }
        if (arg5 == 9) {
            arg5 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg5 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg5 = 1;
        }
        if (arg0 != -117) {
            method296((byte) 63, null, -112, null, 86, -78, -55, 9, -80, 100, 107, -116, 53);
        }
        if (arg5 == 11) {
            arg5 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        arg3.method1172(arg4, arg7, arg12, arg11, arg2, arg9, arg1[arg5 - 1][arg8], arg10, arg6);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Lpe;", line = 155)
    public final class435 method297(byte arg0) {
        field568++;
        if (this.field575 == null) {
            return null;
        }
        class435 var2 = this.field567[(int) ((long) (this.field572 - 1) & this.field571)];
        if (arg0 <= 125) {
            this.field572 = 122;
        }
        while (this.field575 != var2) {
            if (this.field575.field6348 == this.field571) {
                class435 var3 = this.field575;
                this.field575 = this.field575.field6344;
                return var3;
            }
            this.field575 = this.field575.field6344;
        }
        this.field575 = null;
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I", line = 188)
    public final int method298(int arg0) {
        field564++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field572; var3++) {
            class435 var4 = this.field567[var3];
            class435 var5 = var4.field6344;
            while (var4 != var5) {
                var5 = var5.field6344;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V", line = 215)
    public class50(int arg0) {
        this.field567 = new class435[arg0];
        this.field572 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class435 var3 = this.field567[var2] = new class435();
            var3.field6345 = var3;
            var3.field6344 = var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[Lpe;)I", line = 236)
    public final int method299(int arg0, class435[] arg1) {
        field565++;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field572; var4++) {
            class435 var5 = this.field567[var4];
            for (class435 var6 = var5.field6344; var6 != var5; var6 = var6.field6344) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)Lpe;", line = 266)
    public final class435 method300(byte arg0) {
        this.field577 = 0;
        if (arg0 >= -84) {
            return null;
        } else {
            field570++;
            return this.method301(-118);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)Lpe;", line = 278)
    public final class435 method301(int arg0) {
        if (arg0 > -111) {
            this.method295(-39L, -108);
        }
        field573++;
        if (this.field577 > 0 && this.field567[this.field577 - 1] != this.field578) {
            class435 var2 = this.field578;
            this.field578 = var2.field6344;
            return var2;
        }
        while (this.field577 < this.field572) {
            class435 var3 = this.field567[this.field577++].field6344;
            if (this.field567[this.field577 - 1] != var3) {
                this.field578 = var3.field6344;
                return var3;
            }
        }
        return null;
    }
}
