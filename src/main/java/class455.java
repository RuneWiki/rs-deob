import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class455 extends class275 {

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    private int field5935 = 0;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "Lbc;")
    private class9 field5947 = new class9(16);

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    private int field5961 = 0;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "Lki;")
    private class364 field5959 = new class364();

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "J")
    private long field5963 = 0L;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    private int field5939;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "Lsd;")
    private class264 field5953;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "Z")
    private boolean field5960;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "Lki;")
    private class364 field5957;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Z")
    private boolean field5962;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "Lrs;")
    private class653 field5946;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    private int field5944;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "Lsd;")
    private class264 field5952;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lwb;")
    private class518 field5936;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[B")
    private byte[] field5932;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    private int field5956;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "Lel;")
    private class3 field5945;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Lra;")
    public static class361 field5941;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Ltb;")
    private class453 field5943;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Z")
    private boolean field5958;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "[B")
    private byte[] field5950;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)I", line = 8)
    public final int method2560(int arg0) {
        if (arg0 != -1) {
            this.method1669(-1, (byte) -99);
        }
        field5951++;
        return this.field5935;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)I", line = 20)
    public final int method2561(int arg0) {
        field5955++;
        if (this.field5943 == null) {
            return 0;
        } else if (this.field5960) {
            if (arg0 != 0) {
                this.field5959 = null;
            }
            class424 var2 = this.field5957.method2090(true);
            return var2 == null ? 0 : (int) var2.field5499;
        } else {
            return this.field5943.field5897;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(ILsd;Lsd;Lrs;Lwb;I[BIZ)V", line = 813)
    public class455(int arg0, class264 arg1, class264 arg2, class653 arg3, class518 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field5939 = arg0;
        this.field5953 = arg1;
        if (this.field5953 == null) {
            this.field5960 = false;
        } else {
            this.field5960 = true;
            this.field5957 = new class364();
        }
        this.field5962 = arg8;
        this.field5946 = arg3;
        this.field5944 = arg7;
        this.field5952 = arg2;
        this.field5936 = arg4;
        this.field5932 = arg6;
        this.field5956 = arg5;
        if (this.field5952 != null) {
            this.field5945 = this.field5936.method2784(this.field5952, this.field5939, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lel;", line = 51)
    private final class3 method2562(int arg0, int arg1, int arg2) {
        field5933++;
        class3 var4 = (class3) this.field5947.method39((long) arg1, 31750);
        if (var4 != null && arg0 == 0 && !var4.field19 && var4.field20) {
            var4.method2438((byte) 110);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field5953 == null || this.field5950[arg1] == -1) {
                    if (this.field5946.method3595(10230)) {
                        return null;
                    }
                    var4 = this.field5946.method3586((byte) -10, true, arg1, this.field5939, (byte) 2);
                } else {
                    var4 = this.field5936.method2784(this.field5953, arg1, (byte) 79);
                }
            } else if (arg0 == 1) {
                if (this.field5953 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5936.method2786(this.field5953, arg1, (byte) -24);
            } else if (arg0 == 2) {
                if (this.field5953 == null) {
                    throw new RuntimeException();
                }
                if (this.field5950[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5946.method3588((byte) -11)) {
                    return null;
                }
                var4 = this.field5946.method3586((byte) -10, false, arg1, this.field5939, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field5947.method38(var4, 30, (long) arg1);
        }
        if (var4.field20) {
            return null;
        }
        byte[] var5 = var4.method8((byte) 2);
        if (arg2 != -2) {
            return null;
        } else if (var4 instanceof class628) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class326.field4243.reset();
                class326.field4243.update(var5, 0, var5.length - 2);
                int var6 = (int) class326.field4243.getValue();
                if (this.field5943.field5903[arg1] != var6) {
                    throw new RuntimeException();
                }
                if (this.field5943.field5898 != null && this.field5943.field5898[arg1] != null) {
                    byte[] var7 = this.field5943.field5898[arg1];
                    byte[] var8 = class422.method2431(true, var5.length - 2, var5, 0);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field5943.field5911[arg1] & 0xFFFF) != var10) {
                    throw new RuntimeException();
                }
                if (this.field5950[arg1] != 1) {
                    this.field5935++;
                    this.field5950[arg1] = 1;
                }
                if (!var4.field19) {
                    var4.method2438((byte) 110);
                }
                return var4;
            } catch (Exception var17) {
                this.field5950[arg1] = -1;
                var4.method2438((byte) -90);
                if (var4.field19 && !this.field5946.method3595(10230)) {
                    class220 var11 = this.field5946.method3586((byte) -10, true, arg1, this.field5939, (byte) 2);
                    this.field5947.method38(var11, -96, (long) arg1);
                }
                return null;
            }
        } else {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class326.field4243.reset();
                        class326.field4243.update(var5, 0, var5.length - 2);
                        int var12 = (int) class326.field4243.getValue();
                        if (this.field5943.field5903[arg1] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field5943.field5898 == null || this.field5943.field5898[arg1] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field5943.field5898[arg1];
                        byte[] var14 = class422.method2431(true, var5.length - 2, var5, 0);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field5946.field9101 = 0;
                this.field5946.field9099 = 0;
            } catch (RuntimeException var18) {
                this.field5946.method3590((byte) -112);
                var4.method2438((byte) -39);
                if (var4.field19 && !this.field5946.method3595(10230)) {
                    class220 var16 = this.field5946.method3586((byte) -10, true, arg1, this.field5939, (byte) 2);
                    this.field5947.method38(var16, -121, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5943.field5911[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field5943.field5911[arg1];
            if (this.field5953 != null) {
                this.field5936.method2787(arg1, this.field5953, var5, 2);
                if (this.field5950[arg1] != 1) {
                    this.field5935++;
                    this.field5950[arg1] = 1;
                }
            }
            if (!var4.field19) {
                var4.method2438((byte) -53);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Ltb;", line = 315)
    public final class453 method1671(byte arg0) {
        if (arg0 != -22) {
            this.field5950 = null;
        }
        field5948++;
        if (this.field5943 != null) {
            return this.field5943;
        }
        if (this.field5945 == null) {
            if (this.field5946.method3595(10230)) {
                return null;
            }
            this.field5945 = this.field5946.method3586((byte) -10, true, this.field5939, 255, (byte) 0);
        }
        if (this.field5945.field20) {
            return null;
        }
        byte[] var2 = this.field5945.method8((byte) 2);
        if (this.field5945 instanceof class628) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5943 = new class453(var2, this.field5956, this.field5932);
                if (this.field5943.field5914 != this.field5944) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5943 = null;
                if (this.field5946.method3595(10230)) {
                    this.field5945 = null;
                } else {
                    this.field5945 = this.field5946.method3586((byte) -10, true, this.field5939, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5943 = new class453(var2, this.field5956, this.field5932);
            } catch (RuntimeException var4) {
                this.field5946.method3590((byte) -112);
                this.field5943 = null;
                if (this.field5946.method3595(10230)) {
                    this.field5945 = null;
                } else {
                    this.field5945 = this.field5946.method3586((byte) -10, true, this.field5939, 255, (byte) 0);
                }
                return null;
            }
            if (this.field5952 != null) {
                this.field5936.method2787(this.field5939, this.field5952, var2, 2);
            }
        }
        this.field5945 = null;
        if (this.field5953 != null) {
            this.field5935 = 0;
            this.field5950 = new byte[this.field5943.field5899];
        }
        return this.field5943;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 411)
    public static void method2563(byte arg0) {
        if (arg0 >= 126) {
            field5941 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 421)
    public final int method1665(int arg0, int arg1) {
        field5930++;
        class3 var3 = (class3) this.field5947.method39((long) arg1, 31750);
        int var4 = 109 % ((arg0 - 1) / 36);
        return var3 == null ? 0 : var3.method11(-115);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)I", line = 437)
    public final int method2564(byte arg0) {
        field5954++;
        if (arg0 == -5) {
            return this.field5943 == null ? 0 : this.field5943.field5897;
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V", line = 456)
    public final void method1664(byte arg0, int arg1) {
        field5940++;
        if (this.field5953 == null) {
            return;
        }
        for (class424 var3 = this.field5959.method2090(true); var3 != null; var3 = this.field5959.method2088(-152)) {
            if (((long) arg1) == var3.field5499) {
                return;
            }
        }
        int var4 = 67 / ((19 - arg0) / 46);
        class424 var5 = new class424();
        var5.field5499 = arg1;
        this.field5959.method2087(var5, -115);
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)I", line = 484)
    public final int method2565(int arg0) {
        int var2 = -89 / ((-arg0 - 8) / 41);
        field5931++;
        if (this.method1671((byte) -22) == null) {
            return this.field5945 == null ? 0 : this.field5945.method11(-127);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V", line = 508)
    public final void method2566(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field5934++;
        if (this.field5957 != null) {
            if (this.method1671((byte) -22) == null) {
                return;
            }
            if (this.field5960) {
                boolean var6 = true;
                for (class424 var7 = this.field5957.method2090(true); var7 != null; var7 = this.field5957.method2088(arg0 ^ 0x96)) {
                    int var9 = (int) var7.field5499;
                    if (this.field5950[var9] == 0) {
                        this.method2562(1, var9, -2);
                    }
                    if (this.field5950[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2438((byte) 117);
                    }
                }
                while (this.field5961 < this.field5943.field5900.length) {
                    if (this.field5943.field5900[this.field5961] == 0) {
                        this.field5961++;
                    } else {
                        if (this.field5936.field6786 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field5950[this.field5961] == 0) {
                            this.method2562(1, this.field5961, -2);
                        }
                        if (this.field5950[this.field5961] == 0) {
                            class424 var8 = new class424();
                            var8.field5499 = this.field5961;
                            this.field5957.method2087(var8, 62);
                            var6 = false;
                        }
                        this.field5961++;
                    }
                }
                if (var6) {
                    this.field5961 = 0;
                    this.field5960 = false;
                }
            } else if (this.field5958) {
                boolean var2 = true;
                for (class424 var3 = this.field5957.method2090(true); var3 != null; var3 = this.field5957.method2088(-152)) {
                    int var5 = (int) var3.field5499;
                    if (this.field5950[var5] != 1) {
                        this.method2562(2, var5, -2);
                    }
                    if (this.field5950[var5] == 1) {
                        var3.method2438((byte) -15);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field5961 < this.field5943.field5900.length) {
                    if (this.field5943.field5900[this.field5961] == 0) {
                        this.field5961++;
                    } else {
                        if (this.field5946.method3588((byte) -11)) {
                            var2 = false;
                            break;
                        }
                        if (this.field5950[this.field5961] != 1) {
                            this.method2562(2, this.field5961, -2);
                        }
                        if (this.field5950[this.field5961] != 1) {
                            class424 var4 = new class424();
                            var4.field5499 = this.field5961;
                            this.field5957.method2087(var4, -124);
                            var2 = false;
                        }
                        this.field5961++;
                    }
                }
                if (var2) {
                    this.field5958 = false;
                    this.field5961 = 0;
                }
            } else {
                this.field5957 = null;
            }
        }
        if (!this.field5962 || class584.method3191(1) < this.field5963) {
            return;
        }
        for (class3 var10 = (class3) this.field5947.method42((byte) 79); var10 != null; var10 = (class3) this.field5947.method40(false)) {
            if (!var10.field20) {
                if (var10.field18) {
                    if (!var10.field19) {
                        throw new RuntimeException();
                    }
                    var10.method2438((byte) 117);
                } else {
                    var10.field18 = true;
                }
            }
        }
        this.field5963 = class584.method3191(1) + 1000L;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V", line = 686)
    public final void method2567(byte arg0) {
        field5949++;
        if (this.field5957 == null || this.method1671((byte) -22) == null) {
            return;
        }
        if (arg0 > -24) {
            this.method1669(70, (byte) -102);
        }
        for (class424 var2 = this.field5959.method2090(true); var2 != null; var2 = this.field5959.method2088(-152)) {
            int var3 = (int) var2.field5499;
            if (var3 < 0 || this.field5943.field5899 <= var3 || this.field5943.field5900[var3] == 0) {
                var2.method2438((byte) 115);
            } else {
                if (this.field5950[var3] == 0) {
                    this.method2562(1, var3, -2);
                }
                if (this.field5950[var3] == -1) {
                    this.method2562(2, var3, -2);
                }
                if (this.field5950[var3] == 1) {
                    var2.method2438((byte) 110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)[B", line = 730)
    public final byte[] method1669(int arg0, byte arg1) {
        field5938++;
        class3 var3 = this.method2562(0, arg0, -2);
        if (var3 == null) {
            return null;
        }
        if (arg1 != 64) {
            this.field5950 = null;
        }
        byte[] var4 = var3.method8((byte) 2);
        var3.method2438((byte) -77);
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V", line = 753)
    public final void method2568(byte arg0) {
        field5937++;
        if (this.field5953 == null) {
            return;
        }
        if (arg0 != -41) {
            this.field5952 = null;
        }
        this.field5958 = true;
        if (this.field5957 == null) {
            this.field5957 = new class364();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)Z", line = 781)
    public static final boolean method2569(byte arg0, int arg1, int arg2) {
        if (arg0 < 65) {
            field5941 = null;
        }
        field5942++;
        return (arg2 & 0x180) != 0;
    }
}
