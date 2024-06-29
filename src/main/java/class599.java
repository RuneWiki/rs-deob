import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class599 {

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[I")
    private int[] field8349 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lfga;")
    public class258 field8340;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lufa;")
    public static class680 field8344;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[I")
    private int[] field8337;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[S")
    private short[] field8336;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[S")
    private short[] field8339;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[S")
    private short[] field8350;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[S")
    private short[] field8351;

    static {
        new class125("", 76);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Llv;", line = 10)
    public final class446 method3311(int arg0) {
        field8338++;
        if (this.field8337 == null) {
            return null;
        }
        class446[] var2 = new class446[this.field8337.length];
        class522 var3 = this.field8340.field3379;
        synchronized (this.field8340.field3379) {
            if (arg0 != 2) {
                field8344 = null;
            }
            int var4 = 0;
            while (true) {
                if (this.field8337.length <= var4) {
                    break;
                }
                var2[var4] = class317.method1898(0, -9252, this.field8340.field3379, this.field8337[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field8337.length; var5++) {
            if (var2[var5].field6189 < 13) {
                var2[var5].method2502(arg0 ^ 0x35B0, 2);
            }
        }
        class446 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class446(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field8339 != null) {
            for (int var7 = 0; var7 < this.field8339.length; var7++) {
                var6.method2503(0, this.field8339[var7], this.field8336[var7]);
            }
        }
        if (this.field8351 != null) {
            for (int var8 = 0; var8 < this.field8351.length; var8++) {
                var6.method2500(this.field8350[var8], (byte) -114, this.field8351[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z", line = 83)
    public final boolean method3312(int arg0) {
        field8348++;
        boolean var2 = true;
        class522 var3 = this.field8340.field3379;
        synchronized (this.field8340.field3379) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field8349[var4] != -1 && !this.field8340.field3379.method2891(0, this.field8349[var4], -6329)) {
                    var2 = false;
                }
            }
            return arg0 < 105 ? true : var2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z", line = 117)
    public final boolean method3313(int arg0) {
        field8341++;
        if (this.field8337 == null) {
            return true;
        }
        boolean var2 = true;
        class522 var3 = this.field8340.field3379;
        synchronized (this.field8340.field3379) {
            for (int var4 = arg0; var4 < this.field8337.length; var4++) {
                if (!this.field8340.field3379.method2891(0, this.field8337[var4], arg0 - 6329)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Llv;", line = 147)
    public final class446 method3314(byte arg0) {
        field8346++;
        class446[] var2 = new class446[5];
        int var3 = 0;
        class522 var4 = this.field8340.field3379;
        synchronized (this.field8340.field3379) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field8349[var5] != -1) {
                    var2[var3++] = class317.method1898(0, -9252, this.field8340.field3379, this.field8349[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field6189 < 13) {
                var2[var6].method2502(13746, 2);
            }
        }
        int var7 = -9 % ((19 - arg0) / 35);
        class446 var8 = new class446(var2, var3);
        if (this.field8339 != null) {
            for (int var9 = 0; var9 < this.field8339.length; var9++) {
                var8.method2503(0, this.field8339[var9], this.field8336[var9]);
            }
        }
        if (this.field8351 != null) {
            for (int var10 = 0; var10 < this.field8351.length; var10++) {
                var8.method2500(this.field8350[var10], (byte) -93, this.field8351[var10]);
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Ljava/lang/String;", line = 219)
    public static final String method3315(int arg0) {
        field8345++;
        if (class83.field1156 || class736.field10279 == null) {
            return "";
        } else if ((class736.field10279.field2950 == null || class736.field10279.field2950.length() == 0) && class736.field10279.field2943 != null && class736.field10279.field2943.length() > 0) {
            return class736.field10279.field2943;
        } else {
            if (arg0 != 29558) {
                field8344 = null;
            }
            return class736.field10279.field2950;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILmg;III)V", line = 251)
    public static final void method3316(int arg0, int arg1, class150 arg2, int arg3, int arg4, int arg5) {
        if (arg4 > -1) {
            return;
        }
        field8342++;
        class189 var6 = null;
        for (class189 var7 = (class189) class103.field1381.method724(32); var7 != null; var7 = (class189) class103.field1381.method723(106)) {
            if (var7.field2273 == arg5 && var7.field2269 == arg3 && var7.field2270 == arg0 && var7.field2275 == arg1) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class189();
            var6.field2270 = arg0;
            var6.field2275 = arg1;
            var6.field2269 = arg3;
            var6.field2273 = arg5;
            class103.field1381.method725(var6, -20911);
        }
        var6.field2282 = arg2;
        var6.field2281 = false;
        var6.field2280 = true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lji;IB)V", line = 293)
    private final void method3317(class611 arg0, int arg1, byte arg2) {
        int var4 = 6 % ((76 - arg2) / 39);
        if (arg1 == 1) {
            arg0.method3428((byte) -111);
        } else if (arg1 == 2) {
            int var9 = arg0.method3428((byte) 100);
            this.field8337 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field8337[var10] = arg0.method3402((byte) 127);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var5 = arg0.method3428((byte) 107);
                this.field8336 = new short[var5];
                this.field8339 = new short[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field8339[var6] = (short) arg0.method3402((byte) 127);
                    this.field8336[var6] = (short) arg0.method3402((byte) 127);
                }
            } else if (arg1 == 41) {
                int var7 = arg0.method3428((byte) -123);
                this.field8350 = new short[var7];
                this.field8351 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field8351[var8] = (short) arg0.method3402((byte) 127);
                    this.field8350[var8] = (short) arg0.method3402((byte) 127);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field8349[arg1 - 60] = arg0.method3402((byte) 127);
            }
        }
        field8343++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLji;)V", line = 372)
    public final void method3318(boolean arg0, class611 arg1) {
        field8347++;
        while (true) {
            int var3 = arg1.method3428((byte) 95);
            if (var3 == 0) {
                if (arg0) {
                    this.method3313(44);
                    return;
                } else {
                    return;
                }
            }
            this.method3317(arg1, var3, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 396)
    public static void method3319(boolean arg0) {
        if (!arg0) {
            field8344 = null;
        }
    }
}
