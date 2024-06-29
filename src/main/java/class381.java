import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class381 {

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[I")
    private int[] field5408 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field5402 = -1;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lfn;")
    public static class52 field5404 = new class52(60, 6);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lcr;")
    public class195 field5403;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Ljg;")
    public static class456 field5410;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
    private int[] field5401;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[S")
    private short[] field5406;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[S")
    private short[] field5409;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[S")
    private short[] field5411;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[S")
    private short[] field5412;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method2281(int arg0) {
        field5413++;
        boolean var2 = true;
        if (arg0 != 70) {
            this.method2282(-23);
        }
        class343 var3 = this.field5403.field2767;
        synchronized (this.field5403.field2767) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field5408[var4] != -1 && !this.field5403.field2767.method2035(this.field5408[var4], 0, -5657)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lgr;", line = 49)
    public final class85 method2282(int arg0) {
        field5407++;
        class85[] var2 = new class85[5];
        int var3 = 0;
        class343 var4 = this.field5403.field2767;
        synchronized (this.field5403.field2767) {
            if (arg0 != -1) {
                return null;
            }
            for (int var6 = 0; var6 < 5; var6++) {
                if (this.field5408[var6] != -1) {
                    var2[var3++] = class59.method440(0, this.field5408[var6], this.field5403.field2767, class382.method2292(arg0, -4));
                }
            }
        }
        class85 var7 = new class85(var2, var3);
        if (this.field5406 != null) {
            for (int var8 = 0; var8 < this.field5406.length; var8++) {
                var7.method594(this.field5406[var8], this.field5412[var8], true);
            }
        }
        if (this.field5409 != null) {
            for (int var9 = 0; var9 < this.field5409.length; var9++) {
                var7.method596(this.field5409[var9], this.field5411[var9], 72);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z", line = 111)
    public final boolean method2283(byte arg0) {
        field5405++;
        if (this.field5401 == null) {
            return true;
        }
        if (arg0 != 87) {
            this.method2283((byte) 83);
        }
        boolean var2 = true;
        class343 var3 = this.field5403.field2767;
        synchronized (this.field5403.field2767) {
            for (int var4 = 0; var4 < this.field5401.length; var4++) {
                if (!this.field5403.field2767.method2035(this.field5401[var4], 0, arg0 - 5744)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Llk;B)V", line = 147)
    public final void method2284(class425 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                if (arg1 != 12) {
                    field5410 = null;
                }
                field5397++;
                return;
            }
            this.method2285(arg0, var3, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Llk;IB)V", line = 169)
    private final void method2285(class425 arg0, int arg1, byte arg2) {
        field5414++;
        if (arg2 < 6) {
            this.field5403 = null;
        }
        if (arg1 == 1) {
            arg0.method2503(true);
        } else if (arg1 == 2) {
            int var4 = arg0.method2503(true);
            this.field5401 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5401[var5] = arg0.method2508(true);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var8 = arg0.method2503(true);
                this.field5412 = new short[var8];
                this.field5406 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5406[var9] = (short) arg0.method2508(true);
                    this.field5412[var9] = (short) arg0.method2508(true);
                }
            } else if (arg1 == 41) {
                int var6 = arg0.method2503(true);
                this.field5409 = new short[var6];
                this.field5411 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5409[var7] = (short) arg0.method2508(true);
                    this.field5411[var7] = (short) arg0.method2508(true);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field5408[arg1 - 60] = arg0.method2508(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 250)
    public static void method2286(byte arg0) {
        int var1 = -39 / ((-arg0 - 17) / 32);
        field5410 = null;
        field5404 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)Lgr;", line = 267)
    public final class85 method2287(byte arg0) {
        field5399++;
        if (this.field5401 == null) {
            return null;
        }
        class85[] var2 = new class85[this.field5401.length];
        class343 var3 = this.field5403.field2767;
        synchronized (this.field5403.field2767) {
            int var4 = 0;
            if (arg0 != -66) {
                this.method2282(5);
            }
            while (true) {
                if (var4 >= this.field5401.length) {
                    break;
                }
                var2[var4] = class59.method440(0, this.field5401[var4], this.field5403.field2767, 3);
                var4++;
            }
        }
        class85 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class85(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field5406 != null) {
            for (int var6 = 0; var6 < this.field5406.length; var6++) {
                var5.method594(this.field5406[var6], this.field5412[var6], true);
            }
        }
        if (this.field5409 != null) {
            for (int var7 = 0; var7 < this.field5409.length; var7++) {
                var5.method596(this.field5409[var7], this.field5411[var7], arg0 + 130);
            }
        }
        return var5;
    }
}
