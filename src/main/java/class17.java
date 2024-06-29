import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "[I")
    private int[] field251 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "Lao;")
    public static class188 field269 = new class188(107, 10);

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "Lao;")
    public static class188 field270 = new class188(44, -1);

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "Lmm;")
    public static class182 field267;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "Lio;")
    public class300 field264;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "Ltn;")
    public static class58 field271;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "[I")
    private int[] field253;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "[S")
    private short[] field254;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "[S")
    private short[] field256;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "[S")
    private short[] field258;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "[S")
    private short[] field263;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Llo;", line = 4)
    public final class527 method155(byte arg0) {
        field262++;
        class527[] var2 = new class527[5];
        if (arg0 != -33) {
            return null;
        }
        int var3 = 0;
        class84 var4 = this.field264.field4279;
        synchronized (this.field264.field4279) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field251[var5] != -1) {
                    var2[var3++] = class388.method2439(this.field251[var5], this.field264.field4279, 0, 2481);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7767 < 13) {
                var2[var6].method3124(0, (byte) -69);
            }
        }
        class527 var7 = new class527(var2, var3);
        if (this.field263 != null) {
            for (int var8 = 0; var8 < this.field263.length; var8++) {
                var7.method3121(this.field258[var8], this.field263[var8], arg0 ^ 0xFFFFFFDF);
            }
        }
        if (this.field254 != null) {
            for (int var9 = 0; var9 < this.field254.length; var9++) {
                var7.method3108(this.field254[var9], 1, this.field256[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILti;I)V", line = 77)
    private final void method156(int arg0, class303 arg1, int arg2) {
        field265++;
        if (arg2 != 41) {
            return;
        }
        if (arg0 == 1) {
            arg1.method1918((byte) 72);
        } else if (arg0 == 2) {
            int var8 = arg1.method1918((byte) 86);
            this.field253 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field253[var9] = arg1.method1868(0);
            }
        } else if (arg0 != 3) {
            if (arg0 != 40) {
                if (arg0 == 41) {
                    int var4 = arg1.method1918((byte) -48);
                    this.field254 = new short[var4];
                    this.field256 = new short[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field254[var5] = (short) arg1.method1868(0);
                        this.field256[var5] = (short) arg1.method1868(arg2 - 41);
                    }
                } else if (arg0 >= 60 && arg0 < 70) {
                    this.field251[arg0 - 60] = arg1.method1868(0);
                    return;
                }
                return;
            }
            int var6 = arg1.method1918((byte) 99);
            this.field258 = new short[var6];
            this.field263 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field263[var7] = (short) arg1.method1868(class113.method838(arg2, 41));
                this.field258[var7] = (short) arg1.method1868(0);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Z", line = 157)
    public final boolean method157(int arg0) {
        field261++;
        if (this.field253 == null) {
            return true;
        }
        boolean var2 = true;
        class84 var3 = this.field264.field4279;
        synchronized (this.field264.field4279) {
            int var4 = 0;
            if (arg0 != -1118) {
                field259 = 122;
            }
            while (var4 < this.field253.length) {
                if (!this.field264.field4279.method688((byte) 78, this.field253[var4], 0)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Z", line = 190)
    public final boolean method158(int arg0) {
        field268++;
        boolean var2 = true;
        class84 var3 = this.field264.field4279;
        synchronized (this.field264.field4279) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field251[var4] != -1 && !this.field264.field4279.method688((byte) 78, this.field251[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)Llo;", line = 213)
    public final class527 method159(byte arg0) {
        field252++;
        if (this.field253 == null) {
            return null;
        }
        class527[] var2 = new class527[this.field253.length];
        class84 var3 = this.field264.field4279;
        synchronized (this.field264.field4279) {
            if (arg0 != 42) {
                return null;
            }
            int var5 = 0;
            while (true) {
                if (var5 >= this.field253.length) {
                    break;
                }
                var2[var5] = class388.method2439(this.field253[var5], this.field264.field4279, 0, 2481);
                var5++;
            }
        }
        for (int var6 = 0; var6 < this.field253.length; var6++) {
            if (var2[var6].field7767 < 13) {
                var2[var6].method3124(0, (byte) -69);
            }
        }
        class527 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class527(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field263 != null) {
            for (int var8 = 0; var8 < this.field263.length; var8++) {
                var7.method3121(this.field258[var8], this.field263[var8], arg0 - 42);
            }
        }
        if (this.field254 != null) {
            for (int var9 = 0; var9 < this.field254.length; var9++) {
                var7.method3108(this.field254[var9], 1, this.field256[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lti;I)V", line = 289)
    public final void method160(class303 arg0, int arg1) {
        field257++;
        if (arg1 >= -51) {
            return;
        }
        while (true) {
            int var3 = arg0.method1918((byte) -86);
            if (var3 == 0) {
                return;
            }
            this.method156(var3, arg0, 41);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIBIIIIIII)V", line = 325)
    public static final void method161(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field255++;
        if (arg2 < 25) {
            field271 = null;
        }
        if (class322.field4945 <= arg6 && arg6 <= class145.field2134 && class322.field4945 <= arg1 && arg1 <= class145.field2134 && arg4 >= class322.field4945 && class145.field2134 >= arg4 && arg0 >= class322.field4945 && arg0 <= class145.field2134 && arg3 >= class229.field3347 && arg3 <= class156.field2366 && arg7 >= class229.field3347 && arg7 <= class156.field2366 && class229.field3347 <= arg9 && arg9 <= class156.field2366 && arg5 >= class229.field3347 && class156.field2366 >= arg5) {
            class6.method45(arg6, arg0, arg4, arg8, arg3, arg9, arg5, arg1, 11989, arg7);
        } else {
            class46.method351(arg9, arg6, arg1, arg4, arg5, arg7, arg0, arg3, (byte) -39, arg8);
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V", line = 342)
    public static void method162(int arg0) {
        field270 = null;
        field269 = null;
        field271 = null;
        field267 = null;
        if (arg0 != 5) {
            method162(-104);
        }
    }
}
