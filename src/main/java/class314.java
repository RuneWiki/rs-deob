import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class314 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "[I")
    private int[] field4321 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lhm;")
    public static class188 field4331 = new class188();

    @OriginalMember(owner = "client!om", name = "o", descriptor = "[I")
    public static int[] field4332 = new int[2048];

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Lbo;")
    public class623 field4326;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
    private int[] field4323;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "[S")
    private short[] field4325;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "[S")
    private short[] field4328;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "[S")
    private short[] field4329;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "[S")
    private short[] field4333;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLgw;)V", line = 7)
    public final void method1903(byte arg0, class148 arg1) {
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                field4330++;
                if (arg0 >= -119) {
                    this.method1905(false);
                    return;
                }
                return;
            }
            this.method1907(arg1, var3, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Lfd;", line = 38)
    public final class451 method1904(byte arg0) {
        field4324++;
        if (this.field4323 == null) {
            return null;
        }
        int var2 = -37 % ((45 - arg0) / 52);
        class451[] var3 = new class451[this.field4323.length];
        class328 var4 = this.field4326.field9175;
        synchronized (this.field4326.field9175) {
            int var5 = 0;
            while (true) {
                if (var5 >= this.field4323.length) {
                    break;
                }
                var3[var5] = class537.method3254(this.field4323[var5], (byte) 1, this.field4326.field9175, 0);
                var5++;
            }
        }
        for (int var6 = 0; var6 < this.field4323.length; var6++) {
            if (var3[var6].field6378 < 13) {
                var3[var6].method2730(0, 0);
            }
        }
        class451 var7;
        if (var3.length == 1) {
            var7 = var3[0];
        } else {
            var7 = new class451(var3, var3.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field4329 != null) {
            for (int var8 = 0; var8 < this.field4329.length; var8++) {
                var7.method2734(this.field4329[var8], (byte) 52, this.field4333[var8]);
            }
        }
        if (this.field4328 != null) {
            for (int var9 = 0; var9 < this.field4328.length; var9++) {
                var7.method2739(0, this.field4325[var9], this.field4328[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lfd;", line = 111)
    public final class451 method1905(boolean arg0) {
        field4327++;
        class451[] var2 = new class451[5];
        int var3 = 0;
        class328 var4 = this.field4326.field9175;
        synchronized (this.field4326.field9175) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    if (!arg0) {
                        method1908(null, null, 92, (byte) -68);
                    }
                    break;
                }
                if (this.field4321[var5] != -1) {
                    var2[var3++] = class537.method3254(this.field4321[var5], (byte) 1, this.field4326.field9175, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field6378 < 13) {
                var2[var6].method2730(0, 0);
            }
        }
        class451 var7 = new class451(var2, var3);
        if (this.field4329 != null) {
            for (int var8 = 0; var8 < this.field4329.length; var8++) {
                var7.method2734(this.field4329[var8], (byte) -50, this.field4333[var8]);
            }
        }
        if (this.field4328 != null) {
            for (int var9 = 0; var9 < this.field4328.length; var9++) {
                var7.method2739(0, this.field4325[var9], this.field4328[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 183)
    public static void method1906(byte arg0) {
        field4332 = null;
        field4331 = null;
        if (arg0 != 51) {
            method1908(null, null, 83, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lgw;IB)V", line = 196)
    private final void method1907(class148 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            arg0.method1032((byte) -33);
        } else if (arg1 == 2) {
            int var8 = arg0.method1032((byte) -33);
            this.field4323 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4323[var9] = arg0.method1045(true);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg0.method1032((byte) -33);
                this.field4329 = new short[var6];
                this.field4333 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4329[var7] = (short) arg0.method1045(true);
                    this.field4333[var7] = (short) arg0.method1045(true);
                }
            } else if (arg1 == 41) {
                int var4 = arg0.method1032((byte) -33);
                this.field4328 = new short[var4];
                this.field4325 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4328[var5] = (short) arg0.method1045(true);
                    this.field4325[var5] = (short) arg0.method1045(true);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field4321[arg1 - 60] = arg0.method1045(true);
            }
        }
        field4319++;
        if (arg2 <= 121) {
            this.field4328 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;[BIB)I", line = 279)
    public static final int method1908(String arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 < 76) {
            field4331 = null;
        }
        field4320++;
        int var4 = arg0.length();
        int var5 = arg2;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg1[var5++] = (byte) class473.method2847(192, var7 >> 6);
                arg1[var5++] = (byte) class473.method2847(128, class37.method245(63, var7));
            } else {
                arg1[var5++] = (byte) class473.method2847(var7 >> 12, 224);
                arg1[var5++] = (byte) class473.method2847(class37.method245(var7 >> 6, 63), 128);
                arg1[var5++] = (byte) class473.method2847(128, class37.method245(var7, 63));
            }
        }
        return var5 - arg2;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)Z", line = 331)
    public final boolean method1909(byte arg0) {
        field4322++;
        if (this.field4323 == null) {
            return true;
        }
        boolean var2 = true;
        class328 var3 = this.field4326.field9175;
        synchronized (this.field4326.field9175) {
            int var4 = 0;
            while (true) {
                if (this.field4323.length <= var4) {
                    break;
                }
                if (!this.field4326.field9175.method1980(0, this.field4323[var4], (byte) -26)) {
                    var2 = false;
                }
                var4++;
            }
        }
        int var5 = -91 / ((43 - arg0) / 36);
        return var2;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z", line = 358)
    public final boolean method1910(int arg0) {
        field4318++;
        boolean var2 = true;
        class328 var3 = this.field4326.field9175;
        synchronized (this.field4326.field9175) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field4321[var4] != -1 && !this.field4326.field9175.method1980(0, this.field4321[var4], (byte) -18)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
