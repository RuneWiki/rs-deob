import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class512 {

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "Laf;")
    private class39 field7026 = new class39(64);

    @OriginalMember(owner = "client!gia", name = "r", descriptor = "Laf;")
    public class39 field7029 = new class39(50);

    @OriginalMember(owner = "client!gia", name = "s", descriptor = "Lmga;")
    public class377 field7030 = new class377(250);

    @OriginalMember(owner = "client!gia", name = "t", descriptor = "Lpg;")
    private class742 field7031 = new class742();

    @OriginalMember(owner = "client!gia", name = "h", descriptor = "Z")
    private boolean field7019;

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "Lae;")
    private class283 field7016;

    @OriginalMember(owner = "client!gia", name = "k", descriptor = "Lae;")
    public class283 field7022;

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "I")
    public int field7027;

    @OriginalMember(owner = "client!gia", name = "w", descriptor = "Lud;")
    private class99 field7034;

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
    public int field7024;

    @OriginalMember(owner = "client!gia", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field7035;

    @OriginalMember(owner = "client!gia", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field7033;

    @OriginalMember(owner = "client!gia", name = "i", descriptor = "I")
    public static int field7020 = -1;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!gia", name = "f", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!gia", name = "g", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!gia", name = "j", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!gia", name = "l", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!gia", name = "q", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!gia", name = "u", descriptor = "I")
    public int field7032;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
    public final void method3045(int arg0) {
        field7018++;
        class377 var2 = this.field7030;
        synchronized (this.field7030) {
            this.field7030.method2357((byte) 86);
            if (arg0 != 64) {
                this.method3046(true, -63);
            }
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZI)V")
    public final void method3046(boolean arg0, int arg1) {
        if (arg1 != 36) {
            this.field7035 = null;
        }
        field7015++;
        if (arg0 != this.field7019) {
            this.field7019 = arg0;
            this.method3049(arg1 - 37);
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)V")
    public final void method3047(int arg0, int arg1) {
        class39 var3 = this.field7026;
        synchronized (this.field7026) {
            this.field7026.method308(arg1 ^ 0xFFFFFFFE, arg0);
            if (arg1 != 1) {
                this.field7030 = null;
            }
        }
        field7013++;
        class39 var4 = this.field7029;
        synchronized (this.field7029) {
            this.field7029.method308(arg1 - 2, arg0);
        }
        class377 var5 = this.field7030;
        synchronized (this.field7030) {
            this.field7030.method2360(arg0, false);
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)V")
    public final void method3048(int arg0) {
        class39 var2 = this.field7029;
        synchronized (this.field7029) {
            this.field7029.method314(-2);
            if (arg0 != -31816) {
                this.method3054((byte) -97);
            }
        }
        field7017++;
    }

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V")
    public final void method3049(int arg0) {
        field7023++;
        class39 var2 = this.field7026;
        synchronized (this.field7026) {
            this.field7026.method314(-2);
        }
        class39 var3 = this.field7029;
        synchronized (this.field7029) {
            this.field7029.method314(-2);
        }
        class377 var4 = this.field7030;
        synchronized (this.field7030) {
            if (arg0 != -1) {
                this.method3047(-101, 10);
            }
            this.field7030.method2357((byte) 64);
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILpfa;IIIILha;I)Lho;")
    public final class318 method3050(int arg0, class247 arg1, int arg2, int arg3, int arg4, int arg5, class473 arg6, int arg7) {
        this.field7031.field10231 = arg3;
        this.field7031.field10228 = arg1 != null;
        this.field7031.field10220 = arg2;
        this.field7031.field10227 = arg5;
        int var9 = -57 / ((-arg7 - 89) / 37);
        this.field7031.field10218 = arg0;
        this.field7031.field10224 = arg6.field6555;
        this.field7031.field10230 = arg4;
        field7012++;
        return (class318) this.field7030.method2364(-19800, this.field7031);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)Llv;")
    public final class581 method3051(byte arg0, int arg1) {
        field7028++;
        if (arg0 != -20) {
            this.field7024 = 103;
        }
        class39 var3 = this.field7026;
        class581 var4;
        synchronized (this.field7026) {
            var4 = (class581) this.field7026.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field7016;
        byte[] var6;
        synchronized (this.field7016) {
            var6 = this.field7016.method1849(class592.method3459((byte) 126, arg1), (byte) 56, class403.method2474(arg1, 1899037992));
        }
        class581 var7 = new class581();
        var7.field8177 = this;
        var7.field8188 = arg1;
        var7.field8191 = new String[] { null, null, class712.field9861.method3999(this.field7027, (byte) -108), null, null };
        var7.field8198 = new String[] { null, null, null, null, class712.field9862.method3999(this.field7027, (byte) -109) };
        if (var6 != null) {
            var7.method3423(new class511(var6), true);
        }
        var7.method3422(22260);
        if (var7.field8215 != -1) {
            var7.method3413(-30204, this.method3051((byte) -20, var7.field8215), this.method3051((byte) -20, var7.field8161));
        }
        if (var7.field8167 != -1) {
            var7.method3415((byte) -5, this.method3051((byte) -20, var7.field8174), this.method3051((byte) -20, var7.field8167));
        }
        if (var7.field8214 != -1) {
            var7.method3410((byte) 93, this.method3051((byte) -20, var7.field8214), this.method3051((byte) -20, var7.field8236));
        }
        if (!this.field7019 && var7.field8207) {
            var7.field8230 = class712.field9858.method3999(this.field7027, (byte) -50);
            var7.field8187 = 0;
            var7.field8200 = false;
            var7.field8191 = this.field7035;
            var7.field8198 = this.field7033;
            var7.field8162 = null;
            if (var7.field8232 != null) {
                boolean var8 = false;
                for (class69 var9 = var7.field8232.method3668(arg0 ^ 0x40); var9 != null; var9 = var7.field8232.method3667((byte) 110)) {
                    class771 var10 = this.field7034.method709((byte) 99, (int) var9.field762);
                    if (var10.field10603) {
                        var9.method527(-11229);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field8232 = null;
                }
            }
        }
        class39 var11 = this.field7026;
        synchronized (this.field7026) {
            this.field7026.method305(var7, (long) arg1, arg0 ^ 0xFFFFB87C);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZZ)Z")
    public static boolean method3052(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lha;ZIBIILha;ZLda;Lpfa;II)Lho;")
    public final class318 method3053(class473 arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, class473 arg6, boolean arg7, class442 arg8, class247 arg9, int arg10, int arg11) {
        field7025++;
        class318 var13 = this.method3050(arg2, arg9, arg11, arg4, arg5, arg10, arg0, 20);
        if (var13 != null) {
            return var13;
        }
        if (arg3 <= 22) {
            this.field7026 = null;
        }
        class581 var14 = this.method3051((byte) -20, arg11);
        if (arg4 > 1 && var14.field8179 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg4 >= var14.field8175[var16] && var14.field8175[var16] != 0) {
                    var15 = var14.field8179[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3051((byte) -20, var15);
            }
        }
        int[] var17 = var14.method3409(arg6, arg2, arg8, arg9, -127, arg0, arg5, arg10, arg4, arg1);
        if (var17 == null) {
            return null;
        }
        class318 var18;
        if (arg7) {
            var18 = arg6.method2815(var17, (byte) -39, 36, 32, 36, 0);
        } else {
            var18 = arg0.method2815(var17, (byte) -39, 36, 32, 36, 0);
        }
        if (!arg7) {
            class742 var19 = new class742();
            var19.field10231 = arg4;
            var19.field10220 = arg11;
            var19.field10230 = arg5;
            var19.field10227 = arg10;
            var19.field10224 = arg0.field6555;
            var19.field10228 = arg9 != null;
            var19.field10218 = arg2;
            this.field7030.method2355(var18, 23, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V")
    public final void method3054(byte arg0) {
        class39 var2 = this.field7026;
        synchronized (this.field7026) {
            this.field7026.method319(-117);
            if (arg0 < 103) {
                this.field7029 = null;
            }
        }
        field7014++;
        class39 var3 = this.field7029;
        synchronized (this.field7029) {
            this.field7029.method319(-15);
        }
        class377 var4 = this.field7030;
        synchronized (this.field7030) {
            this.field7030.method2358(48);
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(II)V")
    public final void method3055(int arg0, int arg1) {
        int var3 = 111 % ((63 - arg0) / 55);
        this.field7032 = arg1;
        field7021++;
        class39 var4 = this.field7029;
        synchronized (this.field7029) {
            this.field7029.method314(-2);
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljk;IZLud;Lae;Lae;)V")
    public class512(class788 arg0, int arg1, boolean arg2, class99 arg3, class283 arg4, class283 arg5) {
        this.field7019 = arg2;
        this.field7016 = arg4;
        this.field7022 = arg5;
        this.field7027 = arg1;
        this.field7034 = arg3;
        if (this.field7016 == null) {
            this.field7024 = 0;
        } else {
            int var7 = this.field7016.method1866((byte) 86) - 1;
            this.field7024 = this.field7016.method1867(var7, (byte) 49) + var7 * 256;
        }
        this.field7035 = new String[] { null, null, class712.field9861.method3999(this.field7027, (byte) -101), null, null };
        this.field7033 = new String[] { null, null, null, null, class712.field9862.method3999(this.field7027, (byte) -97) };
    }
}
