import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class239 {

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "Ldha;")
    private class84 field3216;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    private int field3219;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    private int field3223;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "Lee;")
    private class706 field3229;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "[I")
    public static int[] field3226 = new int[4];

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3224;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 3)
    public final Object method1541(int arg0, long arg1) {
        field3221++;
        class374 var4 = (class374) this.field3229.method3953(arg1, arg0 ^ 0xFFFFFFF8);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2321((byte) 20);
        if (var5 == null) {
            var4.method792((byte) -102);
            var4.method1811(28064);
            this.field3223 += var4.field5407;
            return null;
        }
        if (var4.method2324(14391)) {
            class602 var6 = new class602(var5, var4.field5407);
            this.field3229.method3962(var4.field1409, var6, -122);
            this.field3216.method695(-112, var6);
            var6.field4141 = 0L;
            var4.method792((byte) -108);
            var4.method1811(28064);
        } else {
            this.field3216.method695(-82, var4);
            var4.field4141 = 0L;
        }
        return arg0 == -10 ? var5 : null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V", line = 48)
    public static void method1542(int arg0) {
        if (arg0 != 0) {
            method1542(-63);
        }
        field3226 = null;
        field3224 = null;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 64)
    public final Object method1543(int arg0) {
        if (arg0 > 0) {
            method1542(42);
        }
        field3236++;
        class374 var2 = (class374) this.field3229.method3955((byte) 84);
        while (var2 != null) {
            Object var3 = var2.method2321((byte) 20);
            if (var3 != null) {
                return var3;
            }
            class374 var4 = var2;
            var2 = (class374) this.field3229.method3955((byte) -86);
            var4.method792((byte) -119);
            var4.method1811(28064);
            this.field3223 += var4.field5407;
        }
        return null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZLjava/lang/Object;J)V", line = 95)
    public final void method1544(boolean arg0, Object arg1, long arg2) {
        if (!arg0) {
            method1542(126);
        }
        this.method1548(0, arg1, arg2, 1);
        field3232++;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lrb;Z)V", line = 107)
    private final void method1545(class374 arg0, boolean arg1) {
        if (arg1) {
            method1542(73);
        }
        if (arg0 != null) {
            arg0.method792((byte) -107);
            arg0.method1811(28064);
            this.field3223 += arg0.field5407;
        }
        field3217++;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IB)V", line = 129)
    public final void method1546(int arg0, byte arg1) {
        if (class589.field7951 != null) {
            for (class374 var3 = (class374) this.field3216.method697(0); var3 != null; var3 = (class374) this.field3216.method699(true)) {
                if (var3.method2324(14391)) {
                    if (var3.method2321((byte) 20) == null) {
                        var3.method792((byte) -93);
                        var3.method1811(28064);
                        this.field3223 += var3.field5407;
                    }
                } else if ((++var3.field4141) > ((long) arg0)) {
                    class374 var4 = class589.field7951.method2683(0, var3);
                    this.field3229.method3962(var3.field1409, var4, arg1 - 103);
                    class154.method1129(var3, false, var4);
                    var3.method792((byte) -106);
                    var3.method1811(28064);
                }
            }
        }
        field3233++;
        if (arg1 != -8) {
            field3226 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)I", line = 181)
    public final int method1547(int arg0) {
        if (arg0 == 0) {
            field3230++;
            return this.field3223;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILjava/lang/Object;JI)V", line = 192)
    public final void method1548(int arg0, Object arg1, long arg2, int arg3) {
        field3218++;
        if (this.field3219 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method1550(-122, arg2);
        this.field3223 -= arg3;
        while (this.field3223 < 0) {
            class374 var7 = (class374) this.field3216.method698(arg0 ^ 0x78);
            this.method1545(var7, false);
        }
        class602 var6 = new class602(arg1, arg3);
        this.field3229.method3962(arg2, var6, arg0 ^ 0xFFFFFF96);
        this.field3216.method695(-127, var6);
        var6.field4141 = arg0;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I)V", line = 219)
    public class239(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lha;ILoja;IILrs;ZLdm;I)V", line = 226)
    public static final void method1549(class65 arg0, int arg1, class480 arg2, int arg3, int arg4, class680 arg5, boolean arg6, class57 arg7, int arg8) {
        field3231++;
        int var9 = arg4 - (arg8 / 2) - 5;
        if (!arg6) {
            method1542(71);
        }
        int var10 = arg1 + 2;
        if (arg5.field9543 != 0) {
            arg0.method462(74, arg8 + 10, var10, arg1 + (arg3 * arg2.method2794()) + 1 - var10, var9, arg5.field9543);
        }
        if (arg5.field9538 != 0) {
            arg0.method471(var10, (byte) 40, arg1 + arg2.method2794() * arg3 + 1 - var10, arg5.field9538, var9, arg8 + 10);
        }
        int var11 = arg5.field9537;
        if (arg7.field797 && arg5.field9535 != -1) {
            var11 = arg5.field9535;
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            String var13 = class597.field8134[var12];
            if ((arg3 - 1) > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg2.method2797(arg0, var13, arg4, arg1, var11, true);
            arg1 += arg2.method2794();
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(IJ)V", line = 270)
    private final void method1550(int arg0, long arg1) {
        field3234++;
        class374 var4 = (class374) this.field3229.method3953(arg1, 14);
        this.method1545(var4, false);
        if (arg0 >= -19) {
            this.method1554(false);
        }
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)I", line = 286)
    public final int method1551(int arg0) {
        field3228++;
        int var2 = 0;
        for (class374 var3 = (class374) this.field3216.method697(arg0); var3 != null; var3 = (class374) this.field3216.method699(true)) {
            if (!var3.method2324(14391)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(II)V", line = 380)
    public class239(int arg0, int arg1) {
        this.field3216 = new class84();
        this.field3219 = arg0;
        this.field3223 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && var3 < arg1; var3 += var3) {
        }
        this.field3229 = new class706(var3);
    }

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)V", line = 311)
    public final void method1552(int arg0) {
        int var2 = -123 / ((arg0 + 56) / 62);
        field3227++;
        for (class374 var3 = (class374) this.field3216.method697(0); var3 != null; var3 = (class374) this.field3216.method699(true)) {
            if (var3.method2324(14391)) {
                var3.method792((byte) -108);
                var3.method1811(28064);
                this.field3223 += var3.field5407;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "(I)I", line = 339)
    public final int method1553(int arg0) {
        int var2 = 57 / ((57 - arg0) / 57);
        field3235++;
        return this.field3219;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 350)
    public final Object method1554(boolean arg0) {
        field3225++;
        if (arg0) {
            this.method1551(-14);
        }
        class374 var2 = (class374) this.field3229.method3960(0);
        while (var2 != null) {
            Object var3 = var2.method2321((byte) 20);
            if (var3 != null) {
                return var3;
            }
            class374 var4 = var2;
            var2 = (class374) this.field3229.method3955((byte) 41);
            var4.method792((byte) -127);
            var4.method1811(28064);
            this.field3223 += var4.field5407;
        }
        return null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 395)
    public final void method1555(byte arg0) {
        field3222++;
        this.field3216.method700(99);
        if (arg0 == -3) {
            this.field3229.method3959(0);
            this.field3223 = this.field3219;
        }
    }
}
