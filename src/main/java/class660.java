import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class660 extends class525 {

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    private int field9211 = 0;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "Lwr;")
    private class459 field9203 = new class459(16);

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    private int field9230 = 0;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "Lkba;")
    private class108 field9232 = new class108();

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "J")
    private long field9234 = 0L;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "Lbg;")
    private class465 field9215;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    private int field9210;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "Z")
    private boolean field9231;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "Lkba;")
    private class108 field9229;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "Ljd;")
    private class232 field9223;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "Lbg;")
    private class465 field9227;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "Z")
    private boolean field9235;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    private int field9209;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "Lpt;")
    private class531 field9212;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    private int field9228;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "[B")
    private byte[] field9225;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "Lhia;")
    private class67 field9200;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "F")
    public static float field9219;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "Luaa;")
    public static class119 field9208;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "Luaa;")
    public static class119 field9216;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "Lte;")
    private class615 field9214;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "Z")
    private boolean field9233;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "[B")
    private byte[] field9221;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)I", line = 8)
    public final int method3730(byte arg0) {
        field9226++;
        if (arg0 > -33) {
            return 42;
        } else if (this.field9214 == null) {
            return 0;
        } else if (this.field9231) {
            class55 var2 = this.field9229.method724(32);
            return var2 == null ? 0 : (int) var2.field556;
        } else {
            return this.field9214.field8617;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Lhia;", line = 32)
    private final class67 method3731(int arg0, int arg1, int arg2) {
        field9201++;
        class67 var4 = (class67) this.field9203.method2552((long) arg1, arg0 ^ 0x1);
        if (var4 != null && arg2 == 0 && !var4.field739 && var4.field741) {
            var4.method315(71);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field9215 == null || this.field9221[arg1] == -1) {
                    if (this.field9223.method1375(69)) {
                        return null;
                    }
                    var4 = this.field9223.method1374(this.field9210, (byte) 2, arg1, 119, true);
                } else {
                    var4 = this.field9212.method2943(1, this.field9215, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field9215 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field9212.method2935((byte) -38, arg1, this.field9215);
            } else if (arg2 == 2) {
                if (this.field9215 == null) {
                    throw new RuntimeException();
                }
                if (this.field9221[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field9223.method1385(20)) {
                    return null;
                }
                var4 = this.field9223.method1374(this.field9210, (byte) 2, arg1, 108, false);
            } else {
                throw new RuntimeException();
            }
            this.field9203.method2558(var4, (long) arg1, -1);
        }
        if (var4.field741) {
            return null;
        }
        byte[] var5 = var4.method511(90);
        if (arg0 != -2) {
            this.method2911((byte) -125);
        }
        if (!var4 instanceof class435) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class242.field3143.reset();
                        class242.field3143.update(var5, 0, var5.length - 2);
                        int var12 = (int) class242.field3143.getValue();
                        if (this.field9214.field8628[arg1] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field9214.field8630 == null || this.field9214.field8630[arg1] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field9214.field8630[arg1];
                        byte[] var14 = class721.method4054(0, (byte) -124, var5, var5.length - 2);
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
                this.field9223.field3009 = 0;
                this.field9223.field3010 = 0;
            } catch (RuntimeException var18) {
                this.field9223.method1379(67);
                var4.method315(76);
                if (var4.field739 && !this.field9223.method1375(88)) {
                    class216 var16 = this.field9223.method1374(this.field9210, (byte) 2, arg1, 127, true);
                    this.field9203.method2558(var16, (long) arg1, arg0 ^ 0x1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field9214.field8620[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field9214.field8620[arg1];
            if (this.field9215 != null) {
                this.field9212.method2938(var5, (byte) 61, this.field9215, arg1);
                if (this.field9221[arg1] != 1) {
                    this.field9211++;
                    this.field9221[arg1] = 1;
                }
            }
            if (!var4.field739) {
                var4.method315(102);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class242.field3143.reset();
            class242.field3143.update(var5, 0, var5.length - 2);
            int var6 = (int) class242.field3143.getValue();
            if (this.field9214.field8628[arg1] != var6) {
                throw new RuntimeException();
            }
            if (this.field9214.field8630 != null && this.field9214.field8630[arg1] != null) {
                byte[] var7 = this.field9214.field8630[arg1];
                byte[] var8 = class721.method4054(0, (byte) -122, var5, var5.length - 2);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field9214.field8620[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field9221[arg1] != 1) {
                this.field9211++;
                this.field9221[arg1] = 1;
            }
            if (!var4.field739) {
                var4.method315(arg0 + 74);
            }
            return var4;
        } catch (Exception var17) {
            this.field9221[arg1] = -1;
            var4.method315(52);
            if (var4.field739 && !this.field9223.method1375(100)) {
                class216 var11 = this.field9223.method1374(this.field9210, (byte) 2, arg1, 122, true);
                this.field9203.method2558(var11, (long) arg1, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)[B", line = 297)
    public final byte[] method2913(int arg0, int arg1) {
        field9205++;
        class67 var3 = this.method3731(arg1 - 2, arg0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method511(arg1 + 113);
            var3.method315(52);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Lte;", line = 316)
    public final class615 method2911(byte arg0) {
        field9222++;
        if (this.field9214 != null) {
            return this.field9214;
        }
        if (arg0 > -102) {
            this.method3739(-6);
        }
        if (this.field9200 == null) {
            if (this.field9223.method1375(70)) {
                return null;
            }
            this.field9200 = this.field9223.method1374(255, (byte) 0, this.field9210, 126, true);
        }
        if (this.field9200.field741) {
            return null;
        }
        byte[] var2 = this.field9200.method511(25);
        if (this.field9200 instanceof class435) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field9214 = new class615(var2, this.field9209, this.field9225);
                if (this.field9214.field8631 != this.field9228) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field9214 = null;
                if (this.field9223.method1375(51)) {
                    this.field9200 = null;
                } else {
                    this.field9200 = this.field9223.method1374(255, (byte) 0, this.field9210, 117, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field9214 = new class615(var2, this.field9209, this.field9225);
            } catch (RuntimeException var4) {
                this.field9223.method1379(89);
                this.field9214 = null;
                if (this.field9223.method1375(92)) {
                    this.field9200 = null;
                } else {
                    this.field9200 = this.field9223.method1374(255, (byte) 0, this.field9210, 111, true);
                }
                return null;
            }
            if (this.field9227 != null) {
                this.field9212.method2938(var2, (byte) 21, this.field9227, this.field9210);
            }
        }
        this.field9200 = null;
        if (this.field9215 != null) {
            this.field9221 = new byte[this.field9214.field8621];
            this.field9211 = 0;
        }
        return this.field9214;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)I", line = 414)
    public final int method2917(int arg0, byte arg1) {
        field9220++;
        if (arg1 >= -10) {
            field9216 = null;
        }
        class67 var3 = (class67) this.field9203.method2552((long) arg0, -1);
        return var3 == null ? 0 : var3.method510(100);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V", line = 432)
    public final void method3732(int arg0) {
        field9206++;
        int var2 = 125 / ((14 - arg0) / 54);
        if (this.field9215 != null) {
            this.field9233 = true;
            if (this.field9229 == null) {
                this.field9229 = new class108();
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V", line = 449)
    public static void method3733(byte arg0) {
        if (arg0 == -101) {
            field9208 = null;
            field9216 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)I", line = 460)
    public final int method3734(int arg0) {
        if (arg0 > -24) {
            this.method3731(104, -12, -110);
        }
        field9204++;
        if (this.method2911((byte) -116) == null) {
            return this.field9200 == null ? 0 : this.field9200.method510(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V", line = 481)
    public final void method2912(int arg0, boolean arg1) {
        field9213++;
        if (this.field9215 == null) {
            return;
        }
        if (arg1) {
            this.method3732(51);
        }
        for (class55 var3 = this.field9232.method724(32); var3 != null; var3 = this.field9232.method723(97)) {
            if ((long) arg0 == var3.field556) {
                return;
            }
        }
        class55 var4 = new class55();
        var4.field556 = arg0;
        this.field9232.method725(var4, -20911);
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)V", line = 510)
    public final void method3735(int arg0) {
        field9202++;
        if (arg0 != 7899) {
            return;
        }
        if (this.field9229 != null) {
            if (this.method2911((byte) -128) == null) {
                return;
            }
            if (this.field9231) {
                boolean var2 = true;
                for (class55 var3 = this.field9229.method724(32); var3 != null; var3 = this.field9229.method723(123)) {
                    int var5 = (int) var3.field556;
                    if (this.field9221[var5] == 0) {
                        this.method3731(-2, var5, 1);
                    }
                    if (this.field9221[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method315(90);
                    }
                }
                while (this.field9214.field8623.length > this.field9230) {
                    if (this.field9214.field8623[this.field9230] == 0) {
                        this.field9230++;
                    } else {
                        if (this.field9212.field7221 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field9221[this.field9230] == 0) {
                            this.method3731(-2, this.field9230, 1);
                        }
                        if (this.field9221[this.field9230] == 0) {
                            class55 var4 = new class55();
                            var4.field556 = this.field9230;
                            var2 = false;
                            this.field9229.method725(var4, -20911);
                        }
                        this.field9230++;
                    }
                }
                if (var2) {
                    this.field9230 = 0;
                    this.field9231 = false;
                }
            } else if (this.field9233) {
                boolean var6 = true;
                for (class55 var7 = this.field9229.method724(32); var7 != null; var7 = this.field9229.method723(112)) {
                    int var9 = (int) var7.field556;
                    if (this.field9221[var9] != 1) {
                        this.method3731(-2, var9, 2);
                    }
                    if (this.field9221[var9] == 1) {
                        var7.method315(arg0 ^ 0x1E9F);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field9230 < this.field9214.field8623.length) {
                    if (this.field9214.field8623[this.field9230] == 0) {
                        this.field9230++;
                    } else {
                        if (this.field9223.method1385(arg0 ^ 0x1ECF)) {
                            var6 = false;
                            break;
                        }
                        if (this.field9221[this.field9230] != 1) {
                            this.method3731(-2, this.field9230, 2);
                        }
                        if (this.field9221[this.field9230] != 1) {
                            class55 var8 = new class55();
                            var8.field556 = this.field9230;
                            this.field9229.method725(var8, -20911);
                            var6 = false;
                        }
                        this.field9230++;
                    }
                }
                if (var6) {
                    this.field9230 = 0;
                    this.field9233 = false;
                }
            } else {
                this.field9229 = null;
            }
        }
        if (!this.field9235 || this.field9234 > class538.method2963(-47)) {
            return;
        }
        for (class67 var10 = (class67) this.field9203.method2560(122); var10 != null; var10 = (class67) this.field9203.method2557(-1)) {
            if (!var10.field741) {
                if (var10.field738) {
                    if (!var10.field739) {
                        throw new RuntimeException();
                    }
                    var10.method315(51);
                } else {
                    var10.field738 = true;
                }
            }
        }
        this.field9234 = class538.method2963(-47) + 1000L;
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)V", line = 690)
    public final void method3736(int arg0) {
        field9217++;
        if (this.field9229 == null || this.method2911((byte) -110) == null) {
            return;
        }
        if (arg0 != -1) {
            this.method2917(29, (byte) -69);
        }
        for (class55 var2 = this.field9232.method724(arg0 + 33); var2 != null; var2 = this.field9232.method723(117)) {
            int var3 = (int) var2.field556;
            if (var3 < 0 || this.field9214.field8621 <= var3 || this.field9214.field8623[var3] == 0) {
                var2.method315(84);
            } else {
                if (this.field9221[var3] == 0) {
                    this.method3731(arg0 - 1, var3, 1);
                }
                if (this.field9221[var3] == -1) {
                    this.method3731(arg0 ^ 0x1, var3, 2);
                }
                if (this.field9221[var3] == 1) {
                    var2.method315(113);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "(I)I", line = 755)
    public final int method3737(int arg0) {
        field9207++;
        return arg0 <= 35 ? -57 : this.field9211;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(ILbg;Lbg;Ljd;Lpt;I[BIZ)V", line = 823)
    public class660(int arg0, class465 arg1, class465 arg2, class232 arg3, class531 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field9215 = arg1;
        this.field9210 = arg0;
        if (this.field9215 == null) {
            this.field9231 = false;
        } else {
            this.field9231 = true;
            this.field9229 = new class108();
        }
        this.field9223 = arg3;
        this.field9227 = arg2;
        this.field9235 = arg8;
        this.field9209 = arg5;
        this.field9212 = arg4;
        this.field9228 = arg7;
        this.field9225 = arg6;
        if (this.field9227 != null) {
            this.field9200 = this.field9212.method2943(1, this.field9227, this.field9210);
        }
    }

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "(I)V", line = 773)
    public static final void method3738(int arg0) {
        field9218++;
        class546.field7711++;
        class103 var1 = class752.method4186(arg0 + 260, class617.field8650, class449.field6285);
        var1.field1379.method3393(arg0, 121);
        class27.method104(false, var1);
    }

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)I", line = 785)
    public final int method3739(int arg0) {
        field9224++;
        if (arg0 != 0) {
            method3733((byte) 48);
        }
        return this.field9214 == null ? 0 : this.field9214.field8617;
    }
}
