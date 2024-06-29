import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class668 extends class608 {

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    private int field9411 = 0;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Loj;")
    private class346 field9404 = new class346(16);

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    private int field9429 = 0;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "Lsu;")
    private class192 field9427 = new class192();

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "J")
    private long field9432 = 0L;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Lfo;")
    private class476 field9402;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    private int field9413;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "Z")
    private boolean field9428;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "Lsu;")
    private class192 field9426;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    private int field9409;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Llba;")
    private class504 field9403;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    private int field9420;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "Z")
    private boolean field9431;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[B")
    private byte[] field9399;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lfo;")
    private class476 field9405;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Lnp;")
    private class451 field9406;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "Led;")
    private class648 field9410;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field9401 = 0;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "Lta;")
    public static class194 field9418;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "Lofa;")
    private class298 field9421;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "Z")
    private boolean field9430;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "[B")
    private byte[] field9425;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(BI)I")
    public final int method3364(byte arg0, int arg1) {
        field9408++;
        if (arg0 <= 86) {
            this.method3705((byte) 37, -47, 40);
        }
        class648 var3 = (class648) this.field9404.method2061(-17305, (long) arg1);
        return var3 == null ? 0 : var3.method2241(100);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lofa;")
    public final class298 method3360(int arg0) {
        field9415++;
        if (this.field9421 != null) {
            return this.field9421;
        }
        if (this.field9410 == null) {
            if (this.field9403.method2810(126)) {
                return null;
            }
            this.field9410 = this.field9403.method2811(this.field9413, true, true, 255, (byte) 0);
        }
        if (this.field9410.field9187) {
            return null;
        }
        byte[] var2 = this.field9410.method2239(true);
        if (this.field9410 instanceof class390) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field9421 = new class298(var2, this.field9409, this.field9399);
                if (this.field9421.field4444 != this.field9420) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field9421 = null;
                if (this.field9403.method2810(127)) {
                    this.field9410 = null;
                } else {
                    this.field9410 = this.field9403.method2811(this.field9413, true, true, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field9421 = new class298(var2, this.field9409, this.field9399);
            } catch (RuntimeException var4) {
                this.field9403.method2808((byte) 127);
                this.field9421 = null;
                if (this.field9403.method2810(124)) {
                    this.field9410 = null;
                } else {
                    this.field9410 = this.field9403.method2811(this.field9413, true, true, 255, (byte) 0);
                }
                return null;
            }
            if (this.field9405 != null) {
                this.field9406.method2585(this.field9413, this.field9405, var2, -128);
            }
        }
        if (this.field9402 != null) {
            this.field9425 = new byte[this.field9421.field4447];
            this.field9411 = 0;
        }
        this.field9410 = null;
        if (arg0 > -110) {
            this.method3360(-44);
        }
        return this.field9421;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)[B")
    public final byte[] method3358(byte arg0, int arg1) {
        if (arg0 > -15) {
            this.field9405 = null;
        }
        field9400++;
        class648 var3 = this.method3705((byte) 126, arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method2239(true);
            var3.method2971(1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method3699(byte arg0) {
        field9418 = null;
        if (arg0 != 1) {
            field9418 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
    public final int method3700(int arg0) {
        field9417++;
        return arg0 <= 104 ? -20 : this.field9411;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
    public final int method3701(int arg0) {
        field9407++;
        if (this.method3360(-116) == null) {
            return this.field9410 == null ? 0 : this.field9410.method2241(100);
        } else {
            if (arg0 >= -90) {
                this.method3707(false);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)I")
    public final int method3702(boolean arg0) {
        field9423++;
        if (arg0) {
            return this.field9421 == null ? 0 : this.field9421.field4457;
        } else {
            return -106;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
    public final void method3703(byte arg0) {
        field9416++;
        if (this.field9426 == null || this.method3360(-116) == null) {
            return;
        }
        class539 var2 = this.field9427.method1270((byte) -25);
        if (arg0 > -55) {
            return;
        }
        while (var2 != null) {
            int var3 = (int) var2.field7311;
            if (var3 < 0 || var3 >= this.field9421.field4447 || this.field9421.field4441[var3] == 0) {
                var2.method2971(1);
            } else {
                if (this.field9425[var3] == 0) {
                    this.method3705((byte) 123, var3, 1);
                }
                if (this.field9425[var3] == -1) {
                    this.method3705((byte) 116, var3, 2);
                }
                if (this.field9425[var3] == 1) {
                    var2.method2971(1);
                }
            }
            var2 = this.field9427.method1282(0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
    public final void method3704(int arg0) {
        field9422++;
        if (this.field9426 != null) {
            if (this.method3360(-128) == null) {
                return;
            }
            if (this.field9428) {
                boolean var6 = true;
                for (class539 var7 = this.field9426.method1270((byte) -25); var7 != null; var7 = this.field9426.method1282(0)) {
                    int var9 = (int) var7.field7311;
                    if (this.field9425[var9] == 0) {
                        this.method3705((byte) 123, var9, 1);
                    }
                    if (this.field9425[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2971(1);
                    }
                }
                while (this.field9421.field4441.length > this.field9429) {
                    if (this.field9421.field4441[this.field9429] == 0) {
                        this.field9429++;
                    } else {
                        if (this.field9406.field6304 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field9425[this.field9429] == 0) {
                            this.method3705((byte) 109, this.field9429, 1);
                        }
                        if (this.field9425[this.field9429] == 0) {
                            class539 var8 = new class539();
                            var8.field7311 = this.field9429;
                            var6 = false;
                            this.field9426.method1273(var8, (byte) 122);
                        }
                        this.field9429++;
                    }
                }
                if (var6) {
                    this.field9429 = 0;
                    this.field9428 = false;
                }
            } else if (this.field9430) {
                boolean var2 = true;
                for (class539 var3 = this.field9426.method1270((byte) -25); var3 != null; var3 = this.field9426.method1282(arg0 ^ 0x540D)) {
                    int var5 = (int) var3.field7311;
                    if (this.field9425[var5] != 1) {
                        this.method3705((byte) 119, var5, 2);
                    }
                    if (this.field9425[var5] == 1) {
                        var3.method2971(arg0 - 21516);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field9429 < this.field9421.field4441.length) {
                    if (this.field9421.field4441[this.field9429] == 0) {
                        this.field9429++;
                    } else {
                        if (this.field9403.method2801(-31)) {
                            var2 = false;
                            break;
                        }
                        if (this.field9425[this.field9429] != 1) {
                            this.method3705((byte) 126, this.field9429, 2);
                        }
                        if (this.field9425[this.field9429] != 1) {
                            class539 var4 = new class539();
                            var4.field7311 = this.field9429;
                            var2 = false;
                            this.field9426.method1273(var4, (byte) 122);
                        }
                        this.field9429++;
                    }
                }
                if (var2) {
                    this.field9430 = false;
                    this.field9429 = 0;
                }
            } else {
                this.field9426 = null;
            }
        }
        if (arg0 != 21517) {
            this.field9403 = null;
        }
        if (!this.field9431 || this.field9432 > class680.method3756(arg0 - 21620)) {
            return;
        }
        for (class648 var10 = (class648) this.field9404.method2066(false); var10 != null; var10 = (class648) this.field9404.method2062(-19704)) {
            if (!var10.field9187) {
                if (var10.field9192) {
                    if (!var10.field9188) {
                        throw new RuntimeException();
                    }
                    var10.method2971(1);
                } else {
                    var10.field9192 = true;
                }
            }
        }
        this.field9432 = class680.method3756(-96) + 1000L;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)Led;")
    private final class648 method3705(byte arg0, int arg1, int arg2) {
        field9419++;
        class648 var4 = (class648) this.field9404.method2061(-17305, (long) arg1);
        if (arg0 <= 107) {
            this.method3360(-70);
        }
        if (var4 != null && arg2 == 0 && !var4.field9188 && var4.field9187) {
            var4.method2971(1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field9402 == null || this.field9425[arg1] == -1) {
                    if (this.field9403.method2810(125)) {
                        return null;
                    }
                    var4 = this.field9403.method2811(arg1, true, true, this.field9413, (byte) 2);
                } else {
                    var4 = this.field9406.method2590(this.field9402, arg1, (byte) 117);
                }
            } else if (arg2 == 1) {
                if (this.field9402 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field9406.method2588(arg1, (byte) 3, this.field9402);
            } else if (arg2 == 2) {
                if (this.field9402 == null) {
                    throw new RuntimeException();
                }
                if (this.field9425[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field9403.method2801(-26)) {
                    return null;
                }
                var4 = this.field9403.method2811(arg1, true, false, this.field9413, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field9404.method2063((long) arg1, 1, var4);
        }
        if (var4.field9187) {
            return null;
        }
        byte[] var5 = var4.method2239(true);
        if (!var4 instanceof class390) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class312.field4636.reset();
                        class312.field4636.update(var5, 0, var5.length - 2);
                        int var12 = (int) class312.field4636.getValue();
                        if (this.field9421.field4440[arg1] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field9421.field4448 == null || this.field9421.field4448[arg1] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field9421.field4448[arg1];
                        byte[] var14 = class424.method2405(var5.length - 2, var5, 0, -81);
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
                this.field9403.field6907 = 0;
                this.field9403.field6909 = 0;
            } catch (RuntimeException var18) {
                this.field9403.method2808((byte) 127);
                var4.method2971(1);
                if (var4.field9188 && !this.field9403.method2810(123)) {
                    class458 var16 = this.field9403.method2811(arg1, true, true, this.field9413, (byte) 2);
                    this.field9404.method2063((long) arg1, 1, var16);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field9421.field4451[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field9421.field4451[arg1];
            if (this.field9402 != null) {
                this.field9406.method2585(arg1, this.field9402, var5, -128);
                if (this.field9425[arg1] != 1) {
                    this.field9411++;
                    this.field9425[arg1] = 1;
                }
            }
            if (!var4.field9188) {
                var4.method2971(1);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class312.field4636.reset();
            class312.field4636.update(var5, 0, var5.length - 2);
            int var6 = (int) class312.field4636.getValue();
            if (this.field9421.field4440[arg1] != var6) {
                throw new RuntimeException();
            }
            if (this.field9421.field4448 != null && this.field9421.field4448[arg1] != null) {
                byte[] var7 = this.field9421.field4448[arg1];
                byte[] var8 = class424.method2405(var5.length - 2, var5, 0, -100);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field9421.field4451[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field9425[arg1] != 1) {
                this.field9411++;
                this.field9425[arg1] = 1;
            }
            if (!var4.field9188) {
                var4.method2971(1);
            }
            return var4;
        } catch (Exception var17) {
            this.field9425[arg1] = -1;
            var4.method2971(1);
            if (var4.field9188 && !this.field9403.method2810(127)) {
                class458 var11 = this.field9403.method2811(arg1, true, true, this.field9413, (byte) 2);
                this.field9404.method2063((long) arg1, 1, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
    public final void method3365(int arg0, byte arg1) {
        field9412++;
        if (this.field9402 == null) {
            return;
        }
        for (class539 var3 = this.field9427.method1270((byte) -25); var3 != null; var3 = this.field9427.method1282(0)) {
            if ((long) arg0 == var3.field7311) {
                return;
            }
        }
        class539 var4 = new class539();
        var4.field7311 = arg0;
        if (arg1 < -112) {
            this.field9427.method1273(var4, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)I")
    public final int method3706(int arg0) {
        if (arg0 > -112) {
            this.method3358((byte) 15, -120);
        }
        field9414++;
        if (this.field9421 == null) {
            return 0;
        } else if (this.field9428) {
            class539 var2 = this.field9426.method1270((byte) -25);
            return var2 == null ? 0 : (int) var2.field7311;
        } else {
            return this.field9421.field4457;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Z)V")
    public final void method3707(boolean arg0) {
        field9424++;
        if (this.field9402 != null) {
            this.field9430 = arg0;
            if (this.field9426 == null) {
                this.field9426 = new class192();
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(ILfo;Lfo;Llba;Lnp;I[BIZ)V")
    public class668(int arg0, class476 arg1, class476 arg2, class504 arg3, class451 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field9402 = arg1;
        this.field9413 = arg0;
        if (this.field9402 == null) {
            this.field9428 = false;
        } else {
            this.field9428 = true;
            this.field9426 = new class192();
        }
        this.field9409 = arg5;
        this.field9403 = arg3;
        this.field9420 = arg7;
        this.field9431 = arg8;
        this.field9399 = arg6;
        this.field9405 = arg2;
        this.field9406 = arg4;
        if (this.field9405 != null) {
            this.field9410 = this.field9406.method2590(this.field9405, this.field9413, (byte) -82);
        }
    }
}
