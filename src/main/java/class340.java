import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class340 {

    @OriginalMember(owner = "client!us", name = "l", descriptor = "[I")
    private int[] field4929 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!us", name = "g", descriptor = "[Lqm;")
    public static class485[] field4924 = null;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Lfg;")
    public class436 field4922;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "[I")
    private int[] field4918;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "[S")
    private short[] field4923;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "[S")
    private short[] field4927;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "[S")
    private short[] field4928;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "[S")
    private short[] field4930;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method2151(int arg0) {
        field4931++;
        boolean var2 = true;
        class283 var3 = this.field4922.field6048;
        synchronized (this.field4922.field6048) {
            if (arg0 != 17704) {
                method2159(true, (byte) -26);
            }
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field4929[var4] != -1 && !this.field4922.field6048.method1862(122, 0, this.field4929[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V", line = 31)
    public static final void method2152(int arg0, int arg1, int arg2) {
        field4932++;
        class17 var3 = class245.method1634(arg1 - 15, (long) arg2, arg1);
        var3.method66((byte) 95);
        var3.field107 = arg0;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 42)
    public static final void method2153(byte arg0) {
        field4919++;
        if (!class201.field2824) {
            return;
        }
        if (arg0 != -65) {
            field4924 = null;
        }
        while (true) {
            while (class254.field3765.length > class712.field9917) {
                class138 var1 = class254.field3765[class712.field9917];
                if (var1 != null && var1.field1763 == -1) {
                    if (class694.field9682 == null) {
                        class694.field9682 = class791.field10838.method2047((byte) -51, var1.field1768);
                    }
                    int var2 = class694.field9682.field6582;
                    if (var2 == -1) {
                        return;
                    }
                    class712.field9917++;
                    class694.field9682 = null;
                    var1.field1763 = var2;
                } else {
                    class712.field9917++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Lao;", line = 88)
    public final class534 method2154(int arg0) {
        field4934++;
        class534[] var2 = new class534[5];
        int var3 = 0;
        class283 var4 = this.field4922.field6048;
        synchronized (this.field4922.field6048) {
            int var5 = arg0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field4929[var5] != -1) {
                    var2[var3++] = class93.method674(this.field4929[var5], 4, 0, this.field4922.field6048);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7366 < 13) {
                var2[var6].method3166(2, (byte) -16);
            }
        }
        class534 var7 = new class534(var2, var3);
        if (this.field4930 != null) {
            for (int var8 = 0; var8 < this.field4930.length; var8++) {
                var7.method3174(this.field4923[var8], true, this.field4930[var8]);
            }
        }
        if (this.field4927 != null) {
            for (int var9 = 0; var9 < this.field4927.length; var9++) {
                var7.method3170(1, this.field4928[var9], this.field4927[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)Z", line = 157)
    public final boolean method2155(byte arg0) {
        field4926++;
        if (this.field4918 == null) {
            return true;
        }
        if (arg0 != -30) {
            this.field4930 = null;
        }
        boolean var2 = true;
        class283 var3 = this.field4922.field6048;
        synchronized (this.field4922.field6048) {
            for (int var4 = 0; var4 < this.field4918.length; var4++) {
                if (!this.field4922.field6048.method1862(112, 0, this.field4918[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZLgga;)V", line = 192)
    private final void method2156(int arg0, boolean arg1, class511 arg2) {
        if (!arg1) {
            this.method2151(1);
        }
        if (arg0 == 1) {
            arg2.method3013(-94);
        } else if (arg0 == 2) {
            int var8 = arg2.method3013(-116);
            this.field4918 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4918[var9] = arg2.method3002(-1);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var4 = arg2.method3013(79);
                this.field4923 = new short[var4];
                this.field4930 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4930[var5] = (short) arg2.method3002(-1);
                    this.field4923[var5] = (short) arg2.method3002(-1);
                }
            } else if (arg0 == 41) {
                int var6 = arg2.method3013(-97);
                this.field4928 = new short[var6];
                this.field4927 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4927[var7] = (short) arg2.method3002(-1);
                    this.field4928[var7] = (short) arg2.method3002(-1);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field4929[arg0 - 60] = arg2.method3002(-1);
            }
        }
        field4925++;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Lao;", line = 279)
    public final class534 method2157(int arg0) {
        field4921++;
        if (this.field4918 == null) {
            return null;
        }
        class534[] var2 = new class534[this.field4918.length];
        class283 var3 = this.field4922.field6048;
        synchronized (this.field4922.field6048) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field4918.length) {
                    break;
                }
                var2[var4] = class93.method674(this.field4918[var4], 4, 0, this.field4922.field6048);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field4918.length; var5++) {
            if (var2[var5].field7366 < 13) {
                var2[var5].method3166(2, (byte) -16);
            }
        }
        class534 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class534(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field4930 != null) {
            for (int var7 = 0; var7 < this.field4930.length; var7++) {
                var6.method3174(this.field4923[var7], true, this.field4930[var7]);
            }
        }
        if (this.field4927 != null) {
            for (int var8 = 0; var8 < this.field4927.length; var8++) {
                var6.method3170(arg0 ^ 0x1, this.field4928[var8], this.field4927[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V", line = 350)
    public static void method2158(byte arg0) {
        field4924 = null;
        if (arg0 != -9) {
            field4924 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V", line = 365)
    public static final void method2159(boolean arg0, byte arg1) {
        field4920++;
        class221.field3034.method49(class377.field5424.method187());
        int[] var2 = class377.field5424.method238();
        if (arg1 < 100) {
            field4924 = null;
        }
        class602.field8447 = var2[1];
        class391.field5565 = var2[3];
        class1.field8 = var2[0];
        class535.field7398 = var2[2];
        if (arg0) {
            class377.field5424.method242(class661.field9304, class654.field9176, class120.field1597, class524.field7221);
            class363.method2284(class226.field3435, (byte) -115);
        } else {
            class377.field5424.method242(class384.field5501, class588.field8291, class338.field4863, class689.field9613);
            class363.method2284(class604.field8481, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lgga;Z)V", line = 397)
    public final void method2160(class511 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method3013(-117);
            if (var3 == 0) {
                field4933++;
                if (arg1) {
                    this.method2156(23, false, null);
                    return;
                }
                return;
            }
            this.method2156(var3, true, arg0);
        }
    }
}
