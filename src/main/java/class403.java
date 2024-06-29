import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class403 extends class508 {

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    public static int field5052 = 0;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "Lwp;")
    public static class453 field5057 = new class453(48, 12);

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    public static int field5060 = 0;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "Lae;")
    public static class40 field5058 = new class40();

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "F")
    public static float field5061;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "Ljava/lang/String;")
    public String field5050;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "[C")
    public char[] field5046;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "[C")
    public char[] field5054;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "[I")
    public int[] field5047;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "[I")
    public int[] field5051;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(CI)I")
    public final int method2143(char arg0, int arg1) {
        if (arg1 != 3766) {
            return 65;
        }
        field5048++;
        if (this.field5051 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5051.length; var3++) {
            if (this.field5046[var3] == arg0) {
                return this.field5051[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILww;Loj;Lr;IILvb;I)V")
    public static final void method2144(int arg0, class647 arg1, class543 arg2, class566 arg3, int arg4, int arg5, class316 arg6, int arg7) {
        field5059++;
        int var8 = arg6.field4058 - (arg5 / 2) - 5;
        int var9 = arg4 + 2;
        if (arg1.field9105 != 0) {
            arg3.method3118(arg1.field9105, var8, var9, arg7 + 1, -var9 + arg4 - -(arg0 * arg2.method2932()) + 1, arg5 + 10);
        }
        if (arg1.field9112 != 0) {
            arg3.method3110(arg5 + 10, var9, arg4 + (arg0 * arg2.method2932()) - (var9 + -1), var8, 20822, arg1.field9112);
        }
        int var10 = arg1.field9120;
        if (arg6.field4054 && arg1.field9115 != -1) {
            var10 = arg1.field9115;
        }
        for (int var11 = arg7; var11 < arg0; var11++) {
            String var12 = class497.field6554[var11];
            if (arg0 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg2.method2931(arg3, var12, arg6.field4058, arg4, var10, true);
            arg4 += arg2.method2932();
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)V")
    public static void method2145(byte arg0) {
        field5058 = null;
        field5057 = null;
        if (arg0 >= -58) {
            field5061 = 0.3833629F;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public final void method2146(int arg0) {
        if (arg0 > -23) {
            field5060 = -12;
        }
        field5056++;
        if (this.field5047 != null) {
            for (int var2 = 0; var2 < this.field5047.length; var2++) {
                this.field5047[var2] = class444.method2376(this.field5047[var2], 32768);
            }
        }
        if (this.field5051 != null) {
            for (int var3 = 0; var3 < this.field5051.length; var3++) {
                this.field5051[var3] = class444.method2376(this.field5051[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BC)I")
    public final int method2147(byte arg0, char arg1) {
        field5053++;
        if (this.field5047 == null) {
            return -1;
        }
        if (arg0 <= 28) {
            this.method2147((byte) -121, (char) 65488);
        }
        for (int var3 = 0; var3 < this.field5047.length; var3++) {
            if (this.field5054[var3] == arg1) {
                return this.field5047[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILes;)V")
    private final void method2148(int arg0, int arg1, class630 arg2) {
        if (arg0 != -1) {
            return;
        }
        if (arg1 == 1) {
            this.field5050 = arg2.method3500((byte) 117);
        } else if (arg1 == 2) {
            int var4 = arg2.method3501(-9268);
            this.field5051 = new int[var4];
            this.field5046 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5051[var5] = arg2.method3470(arg0 + 13112);
                byte var6 = arg2.method3480(-20933);
                this.field5046[var5] = var6 == 0 ? 0 : class670.method3763((byte) 115, var6);
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method3501(-9268);
            this.field5054 = new char[var7];
            this.field5047 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5047[var8] = arg2.method3470(arg0 + 13112);
                byte var9 = arg2.method3480(-20933);
                this.field5054[var8] = var9 == 0 ? 0 : class670.method3763((byte) 67, var9);
            }
        }
        field5055++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Les;I)V")
    public final void method2149(class630 arg0, int arg1) {
        field5049++;
        if (arg1 <= 36) {
            this.field5054 = null;
        }
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            this.method2148(-1, var3, arg0);
        }
    }
}
