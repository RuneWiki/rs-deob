import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class631 extends class288 {

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    private int field9083 = 0;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lpt;")
    private class451 field9071 = new class451(16);

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    private int field9090 = 0;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Lui;")
    private class193 field9092 = new class193();

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "J")
    private long field9098 = 0L;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    private int field9077;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Les;")
    private class320 field9086;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Z")
    private boolean field9095;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Lui;")
    private class193 field9091;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lbj;")
    private class201 field9080;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "[B")
    private byte[] field9079;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Lgq;")
    private class436 field9089;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Z")
    private boolean field9097;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    private int field9072;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Les;")
    private class320 field9066;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    private int field9084;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lrda;")
    private class567 field9070;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lrg;")
    public static class548 field9075 = new class548(57, 6);

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field9087 = 0;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "[I")
    public static int[] field9096 = new int[32];

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lwh;")
    private class127 field9073;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "Z")
    private boolean field9094;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[B")
    private byte[] field9067;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
    public final int method3621(int arg0) {
        if (arg0 > -48) {
            method3628(28, 78, 28, true);
        }
        field9088++;
        return this.field9083;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)I")
    public final int method3622(int arg0) {
        field9069++;
        if (this.field9073 == null) {
            return 0;
        } else if (!this.field9095) {
            return this.field9073.field1557;
        } else if (arg0 > -87) {
            return 82;
        } else {
            class544 var2 = this.field9091.method1050((byte) 73);
            return var2 == null ? 0 : (int) var2.field7967;
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
    public final int method3623(int arg0) {
        if (arg0 != 0) {
            this.field9092 = null;
        }
        field9074++;
        return this.field9073 == null ? 0 : this.field9073.field1557;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
    public final int method1619(int arg0, byte arg1) {
        if (arg1 >= -118) {
            return -116;
        } else {
            field9064++;
            class567 var3 = (class567) this.field9071.method2645((long) arg0, (byte) -106);
            return var3 == null ? 0 : var3.method245(false);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public final void method1617(int arg0, int arg1) {
        field9081++;
        if (arg1 <= 22) {
            this.field9080 = null;
        }
        if (this.field9086 == null) {
            return;
        }
        for (class544 var3 = this.field9092.method1050((byte) 73); var3 != null; var3 = this.field9092.method1047(-7962)) {
            if (((long) arg0) == var3.field7967) {
                return;
            }
        }
        class544 var4 = new class544();
        var4.field7967 = arg0;
        this.field9092.method1040(var4, -116);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method3624(boolean arg0) {
        field9065++;
        if (this.field9091 == null || this.method1623(255) == null) {
            return;
        }
        if (!arg0) {
            this.field9073 = null;
        }
        for (class544 var2 = this.field9092.method1050((byte) 73); var2 != null; var2 = this.field9092.method1047(-7962)) {
            int var3 = (int) var2.field7967;
            if (var3 < 0 || this.field9073.field1555 <= var3 || this.field9073.field1566[var3] == 0) {
                var2.method3187(true);
            } else {
                if (this.field9067[var3] == 0) {
                    this.method3629(1, (byte) 74, var3);
                }
                if (this.field9067[var3] == -1) {
                    this.method3629(2, (byte) 112, var3);
                }
                if (this.field9067[var3] == 1) {
                    var2.method3187(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public final void method3625(int arg0) {
        field9063++;
        if (this.field9086 == null) {
            return;
        }
        this.field9094 = true;
        if (this.field9091 == null) {
            this.field9091 = new class193();
        }
        if (arg0 <= 121) {
            this.field9098 = 92L;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lwh;")
    public final class127 method1623(int arg0) {
        field9093++;
        if (this.field9073 != null) {
            return this.field9073;
        } else if (arg0 == 255) {
            if (this.field9070 == null) {
                if (this.field9089.method2523(0)) {
                    return null;
                }
                this.field9070 = this.field9089.method2519((byte) 0, this.field9077, 255, true, false);
            }
            if (this.field9070.field8322) {
                return null;
            }
            byte[] var2 = this.field9070.method244(123);
            if (this.field9070 instanceof class46) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field9073 = new class127(var2, this.field9084, this.field9079);
                    if (this.field9073.field1552 != this.field9072) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field9073 = null;
                    if (this.field9089.method2523(0)) {
                        this.field9070 = null;
                    } else {
                        this.field9070 = this.field9089.method2519((byte) 0, this.field9077, 255, true, false);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field9073 = new class127(var2, this.field9084, this.field9079);
                } catch (RuntimeException var4) {
                    this.field9089.method2521(-29644);
                    this.field9073 = null;
                    if (this.field9089.method2523(arg0 ^ 0xFF)) {
                        this.field9070 = null;
                    } else {
                        this.field9070 = this.field9089.method2519((byte) 0, this.field9077, 255, true, false);
                    }
                    return null;
                }
                if (this.field9066 != null) {
                    this.field9080.method1083(-21313, var2, this.field9066, this.field9077);
                }
            }
            if (this.field9086 != null) {
                this.field9083 = 0;
                this.field9067 = new byte[this.field9073.field1555];
            }
            this.field9070 = null;
            return this.field9073;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method3626(byte arg0) {
        if (arg0 > -10) {
            field9096 = null;
        }
        field9096 = null;
        field9075 = null;
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)I")
    public final int method3627(int arg0) {
        field9068++;
        if (arg0 <= 65) {
            return -93;
        } else if (this.method1623(255) == null) {
            return this.field9070 == null ? 0 : this.field9070.method245(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIZ)I")
    public static final int method3628(int arg0, int arg1, int arg2, boolean arg3) {
        field9076++;
        class125 var4 = class256.method1445(arg2, (byte) -127, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= ~arg1 && arg1 < var4.field1538.length) {
            return var4.field1538[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBI)Lrda;")
    private final class567 method3629(int arg0, byte arg1, int arg2) {
        field9082++;
        class567 var4 = (class567) this.field9071.method2645((long) arg2, (byte) -87);
        if (var4 != null && arg0 == 0 && !var4.field8321 && var4.field8322) {
            var4.method3187(true);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field9086 == null || this.field9067[arg2] == -1) {
                    if (this.field9089.method2523(0)) {
                        return null;
                    }
                    var4 = this.field9089.method2519((byte) 2, arg2, this.field9077, true, false);
                } else {
                    var4 = this.field9080.method1080(32, arg2, this.field9086);
                }
            } else if (arg0 == 1) {
                if (this.field9086 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field9080.method1082(arg2, 3, this.field9086);
            } else if (arg0 == 2) {
                if (this.field9086 == null) {
                    throw new RuntimeException();
                }
                if (this.field9067[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field9089.method2529(true)) {
                    return null;
                }
                var4 = this.field9089.method2519((byte) 2, arg2, this.field9077, false, false);
            } else {
                throw new RuntimeException();
            }
            this.field9071.method2640(1, (long) arg2, var4);
        }
        if (var4.field8322) {
            return null;
        }
        byte[] var5 = var4.method244(127);
        int var6 = -37 % ((arg1 - 23) / 41);
        if (!(var4 instanceof class46)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class405.field5326.reset();
                class405.field5326.update(var5, 0, var5.length - 2);
                int var7 = (int) class405.field5326.getValue();
                if (this.field9073.field1567[arg2] != var7) {
                    throw new RuntimeException();
                }
                if (this.field9073.field1564 != null && this.field9073.field1564[arg2] != null) {
                    byte[] var8 = this.field9073.field1564[arg2];
                    byte[] var9 = class256.method1443(0, var5.length - 2, var5, 0);
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (var8[var10] != var9[var10]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field9089.field5936 = 0;
                this.field9089.field5935 = 0;
            } catch (RuntimeException var18) {
                this.field9089.method2521(-29644);
                var4.method3187(true);
                if (var4.field8321 && !this.field9089.method2523(0)) {
                    class499 var11 = this.field9089.method2519((byte) 2, arg2, this.field9077, true, false);
                    this.field9071.method2640(1, (long) arg2, var11);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field9073.field1568[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field9073.field1568[arg2];
            if (this.field9086 != null) {
                this.field9080.method1083(-21313, var5, this.field9086, arg2);
                if (this.field9067[arg2] != 1) {
                    this.field9083++;
                    this.field9067[arg2] = 1;
                }
            }
            if (!var4.field8321) {
                var4.method3187(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class405.field5326.reset();
            class405.field5326.update(var5, 0, var5.length - 2);
            int var12 = (int) class405.field5326.getValue();
            if (this.field9073.field1567[arg2] != var12) {
                throw new RuntimeException();
            }
            if (this.field9073.field1564 != null && this.field9073.field1564[arg2] != null) {
                byte[] var13 = this.field9073.field1564[arg2];
                byte[] var14 = class256.method1443(0, var5.length - 2, var5, 0);
                for (int var15 = 0; var15 < 64; var15++) {
                    if (var13[var15] != var14[var15]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var16 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field9073.field1568[arg2] & 0xFFFF) != var16) {
                throw new RuntimeException();
            }
            if (this.field9067[arg2] != 1) {
                this.field9083++;
                this.field9067[arg2] = 1;
            }
            if (!var4.field8321) {
                var4.method3187(true);
            }
            return var4;
        } catch (Exception var19) {
            this.field9067[arg2] = -1;
            var4.method3187(true);
            if (var4.field8321 && !this.field9089.method2523(0)) {
                class499 var17 = this.field9089.method2519((byte) 2, arg2, this.field9077, true, false);
                this.field9071.method2640(1, (long) arg2, var17);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
    public final void method3630(int arg0) {
        field9078++;
        if (arg0 != 29892) {
            this.field9086 = null;
        }
        if (this.field9091 != null) {
            if (this.method1623(255) == null) {
                return;
            }
            if (this.field9095) {
                boolean var6 = true;
                for (class544 var7 = this.field9091.method1050((byte) 73); var7 != null; var7 = this.field9091.method1047(arg0 ^ 0xFFFF9422)) {
                    int var9 = (int) var7.field7967;
                    if (this.field9067[var9] == 0) {
                        this.method3629(1, (byte) 90, var9);
                    }
                    if (this.field9067[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method3187(true);
                    }
                }
                while (this.field9073.field1566.length > this.field9090) {
                    if (this.field9073.field1566[this.field9090] == 0) {
                        this.field9090++;
                    } else {
                        if (this.field9080.field2414 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field9067[this.field9090] == 0) {
                            this.method3629(1, (byte) 65, this.field9090);
                        }
                        if (this.field9067[this.field9090] == 0) {
                            class544 var8 = new class544();
                            var8.field7967 = this.field9090;
                            this.field9091.method1040(var8, arg0 ^ 0xFFFF8B45);
                            var6 = false;
                        }
                        this.field9090++;
                    }
                }
                if (var6) {
                    this.field9095 = false;
                    this.field9090 = 0;
                }
            } else if (this.field9094) {
                boolean var2 = true;
                for (class544 var3 = this.field9091.method1050((byte) 73); var3 != null; var3 = this.field9091.method1047(-7962)) {
                    int var5 = (int) var3.field7967;
                    if (this.field9067[var5] != 1) {
                        this.method3629(2, (byte) 98, var5);
                    }
                    if (this.field9067[var5] == 1) {
                        var3.method3187(true);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field9090 < this.field9073.field1566.length) {
                    if (this.field9073.field1566[this.field9090] == 0) {
                        this.field9090++;
                    } else {
                        if (this.field9089.method2529(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field9067[this.field9090] != 1) {
                            this.method3629(2, (byte) 94, this.field9090);
                        }
                        if (this.field9067[this.field9090] != 1) {
                            class544 var4 = new class544();
                            var4.field7967 = this.field9090;
                            this.field9091.method1040(var4, -110);
                            var2 = false;
                        }
                        this.field9090++;
                    }
                }
                if (var2) {
                    this.field9090 = 0;
                    this.field9094 = false;
                }
            } else {
                this.field9091 = null;
            }
        }
        if (!this.field9097 || this.field9098 > class190.method1030(false)) {
            return;
        }
        for (class567 var10 = (class567) this.field9071.method2638(false); var10 != null; var10 = (class567) this.field9071.method2641(12089)) {
            if (!var10.field8322) {
                if (var10.field8324) {
                    if (!var10.field8321) {
                        throw new RuntimeException();
                    }
                    var10.method3187(true);
                } else {
                    var10.field8324 = true;
                }
            }
        }
        this.field9098 = class190.method1030(false) + 1000L;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)[B")
    public final byte[] method1620(byte arg0, int arg1) {
        if (arg0 != 51) {
            this.method3624(true);
        }
        field9085++;
        class567 var3 = this.method3629(0, (byte) 67, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method244(121);
            var3.method3187(true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILes;Les;Lgq;Lbj;I[BIZ)V")
    public class631(int arg0, class320 arg1, class320 arg2, class436 arg3, class201 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field9077 = arg0;
        this.field9086 = arg1;
        if (this.field9086 == null) {
            this.field9095 = false;
        } else {
            this.field9095 = true;
            this.field9091 = new class193();
        }
        this.field9080 = arg4;
        this.field9079 = arg6;
        this.field9089 = arg3;
        this.field9097 = arg8;
        this.field9072 = arg7;
        this.field9066 = arg2;
        this.field9084 = arg5;
        if (this.field9066 != null) {
            this.field9070 = this.field9080.method1080(32, this.field9077, this.field9066);
        }
    }
}
