import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class512 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    private int field7476 = -1;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    private int field7481 = -1;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    private int field7492 = -1;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    private int field7500 = 0;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Z")
    private boolean field7489 = false;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "Z")
    private boolean field7515 = false;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    private int field7498 = 0;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lub;")
    private class20 field7488;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public int field7502;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "B")
    private byte field7479;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public int field7483;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public int field7499;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "B")
    private byte field7513;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
    private boolean field7487;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "Lfw;")
    public static class52 field7495 = new class52();

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field7510 = 0;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    public static int field7507 = 0;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "Lwaa;")
    public static class652 field7516 = new class652(512);

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field7517 = -1;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    private int field7482;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    private int field7490;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    private int field7491;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    private int field7514;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lwt;")
    private class282 field7478;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Lha;")
    private class54 field7477;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "Lda;")
    private class55 field7501;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "Ljn;")
    public static class668 field7503;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "Lau;")
    public class684 field7505;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "Lqc;")
    public static class689 field7508;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "[Z")
    private boolean[] field7512;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V", line = 5)
    private final void method3031(byte arg0, int arg1) {
        field7484++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class232 var5 = class37.field703.method807(0, this.field7502);
            class232 var6 = var5;
            if (var5.field3094 != null) {
                var5 = var5.method1412(107, class410.field5804);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3051 != null) {
                if (this.field7478 != null && var5.method1402(this.field7478.field3817, arg0 - 69)) {
                    return;
                }
                var3 = var5.method1408((byte) 37);
                if (this.field7492 != var5.field3056) {
                    var4 = var5.field3075;
                }
            } else if (var5.field3090 == -1) {
                if (var6 != null && var6.field3051 != null) {
                    if (this.field7478 != null && var6.method1402(this.field7478.field3817, 0)) {
                        return;
                    }
                    var3 = var6.method1408((byte) 37);
                    if (this.field7492 != var6.field3056) {
                        var4 = var6.field3075;
                    }
                } else if (var6 != null && var6.field3090 != -1 && this.field7492 != var6.field3056) {
                    var3 = var6.field3090;
                    var4 = var6.field3075;
                }
            } else if (this.field7492 != var5.field3056) {
                var3 = var5.field3090;
                var4 = var5.field3075;
            }
        }
        if (var3 == -1) {
            this.field7478 = null;
            return;
        }
        this.field7501 = null;
        if (this.field7478 == null || this.field7478.field3817 != var3) {
            this.field7478 = class195.field2367.method3273(var3, 0);
        } else if (this.field7478.field3828 == 0) {
            return;
        }
        if (arg0 != 69) {
            this.method3042(null, 58);
        }
        if (this.field7478.field3827 == null) {
            this.field7478 = null;
            return;
        }
        if (var4) {
            this.field7482 = (int) (Math.random() * (double) this.field7478.field3827.length);
            this.field7491 = (int) (Math.random() * (double) this.field7478.field3840[this.field7482]) + 1;
        } else {
            this.field7491 = 1;
            this.field7482 = 0;
        }
        this.field7490 = this.field7482 + 1;
        if (this.field7490 < 0 || this.field7490 >= this.field7478.field3827.length) {
            this.field7490 = -1;
        }
        this.field7514 = class543.field7882 - this.field7491;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 127)
    public static void method3032(int arg0) {
        field7508 = null;
        field7495 = null;
        if (arg0 != -16445) {
            method3037((byte) -10, null);
        }
        field7503 = null;
        field7516 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lr;Lfga;IIIILub;ZI)V", line = 616)
    public class512(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, class20 arg6, boolean arg7, int arg8) {
        this.field7489 = arg7;
        this.field7488 = arg6;
        this.field7502 = arg1.field3056;
        this.field7479 = (byte) arg5;
        this.field7483 = arg2;
        this.field7499 = arg3;
        this.field7513 = (byte) arg4;
        this.field7487 = arg0.method215() && arg1.field3097 && !this.field7489;
        if (arg8 != -1) {
            this.field7515 = true;
        }
        this.method3031((byte) 69, arg8);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I", line = 151)
    public final int method3033(byte arg0) {
        field7506++;
        if (arg0 >= -3) {
            this.field7479 = 36;
        }
        return this.field7500;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I", line = 165)
    public final int method3034(int arg0) {
        if (arg0 != 16) {
            this.method3040(-83, 73);
        }
        field7485++;
        return this.field7498;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Z", line = 177)
    public final boolean method3035(byte arg0) {
        field7496++;
        if (arg0 > -57) {
            this.field7501 = null;
        }
        return this.field7487;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILub;)V", line = 195)
    private final void method3036(int arg0, class20 arg1) {
        if (arg0 != 12565) {
            this.method3041(null, (byte) -51);
        }
        field7480++;
        label92: while (true) {
            if (this.field7478 == null) {
                if (this.field7515) {
                    return;
                }
                this.method3031((byte) 69, -1);
                if (this.field7478 == null) {
                    return;
                }
            }
            int var3 = class543.field7882 - this.field7514;
            if (var3 > 100 && this.field7478.field3821 > 0) {
                int var4 = this.field7478.field3827.length - this.field7478.field3821;
                while (var4 > this.field7482 && this.field7478.field3840[this.field7482] < var3) {
                    var3 -= this.field7478.field3840[this.field7482];
                    this.field7482++;
                }
                if (var4 <= this.field7482) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field7478.field3827.length; var6++) {
                        var5 += this.field7478.field3840[var6];
                    }
                    var3 %= var5;
                }
                this.field7490 = this.field7482 + 1;
                if (this.field7478.field3827.length <= this.field7490) {
                    this.field7490 -= this.field7478.field3821;
                    if (this.field7490 < 0 || this.field7478.field3827.length <= this.field7490) {
                        this.field7490 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field7478.field3840[this.field7482]) {
                            this.field7514 = class543.field7882 - var3;
                            this.field7491 = var3;
                            return;
                        }
                        class563.method3294((byte) 82, this.field7478, arg1, this.field7482);
                        var3 -= this.field7478.field3840[this.field7482];
                        this.field7482++;
                        if (this.field7482 >= this.field7478.field3827.length) {
                            this.field7482 -= this.field7478.field3821;
                            if (this.field7482 < 0 || this.field7478.field3827.length <= this.field7482) {
                                this.field7478 = null;
                                continue label92;
                            }
                        }
                        this.field7490 = this.field7482 + 1;
                    } while (this.field7478.field3827.length > this.field7490);
                    this.field7490 -= this.field7478.field3821;
                } while (this.field7490 >= 0 && this.field7490 < this.field7478.field3827.length);
                this.field7490 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "finalize", descriptor = "()V", line = 292)
    protected final void finalize() {
        field7486++;
        if (this.field7505 != null) {
            this.field7505.method3877();
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLkga;)V", line = 302)
    public static final void method3037(byte arg0, class506 arg1) {
        if (arg0 < 11) {
            method3032(-30);
        }
        if (class188.field2291 == null) {
            class637 var2 = new class637();
            byte[] var3 = var2.method3633(128, 128, 16, 0);
            class188.field2291 = class699.method3918(false, var3, true);
        }
        field7493++;
        if (class124.field1597 == null) {
            class36 var4 = new class36();
            byte[] var5 = var4.method417(128, 128, (byte) -118, 16);
            class124.field1597 = class699.method3918(false, var5, true);
        }
        class592 var6 = arg1.field7263;
        if (var6.method3432(28261) && class226.field2927 == null) {
            byte[] var7 = class345.method1976(0.5F, 4.0F, 16.0F, 4.0F, 0.6F, 128, 0, new class112(419684), 8, 16, 128);
            class226.field2927 = class699.method3918(false, var7, true);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILq;IIIIZLda;Lr;)V", line = 344)
    public final void method3038(int arg0, class394 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class55 arg7, class165 arg8) {
        field7475++;
        if (arg3 > -57) {
            this.field7505 = null;
        }
        class271[] var10 = arg7.method95();
        class604[] var11 = arg7.method85();
        if ((this.field7505 == null || this.field7505.field9772) && (var10 != null || var11 != null)) {
            class232 var12 = class37.field703.method807(0, this.field7502);
            if (var12.field3094 != null) {
                var12 = var12.method1412(125, class410.field5804);
            }
            if (var12 != null) {
                this.field7505 = class684.method3879(class543.field7882, true);
            }
        }
        if (this.field7505 == null) {
            return;
        }
        arg7.method104(arg1);
        if (arg6) {
            this.field7505.method3873(arg8, (long) class543.field7882, var10, var11, false);
        } else {
            this.field7505.method3875((long) class543.field7882);
        }
        this.field7505.method3878(this.field7513, arg2, arg4, arg5, arg0);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZZIZLr;)Lda;", line = 384)
    public final class55 method3039(boolean arg0, boolean arg1, int arg2, boolean arg3, class165 arg4) {
        field7494++;
        class232 var6 = class37.field703.method807(0, this.field7502);
        if (var6.field3094 != null) {
            var6 = var6.method1412(107, class410.field5804);
        }
        if (var6 == null) {
            this.method3041(arg4, (byte) 126);
            this.field7481 = -1;
            this.field7492 = -1;
            this.field7476 = -1;
            return null;
        }
        if (!this.field7515 && this.field7492 != var6.field3056) {
            this.field7501 = null;
            this.method3031((byte) 69, -1);
        }
        if (arg3) {
            this.field7514 = 73;
        }
        this.method3036(12565, this.field7488);
        if (arg0) {
            boolean var7 = arg0 & this.field7487 & class221.field2851.method1844(class375.field5039, true) != 0;
            arg0 = var7 & (this.field7481 != var6.field3056 || this.field7478 != null && class221.field2851.method1844(class375.field5039, true) >= 2 && (this.field7482 != this.field7476 || (this.field7478.field3833 || class331.field4406) && this.field7490 != this.field7482));
        }
        if (arg1 && !arg0) {
            this.field7492 = var6.field3056;
            return null;
        }
        if (arg0) {
            class122.method855(this.field7477, this.field7479, this.field7488.field530, this.field7488.field531, this.field7512);
            this.field7476 = -1;
            this.field7481 = -1;
        }
        class37 var8 = class155.field1899[this.field7479];
        class37 var9;
        if (this.field7489) {
            var9 = class399.field5631[0];
        } else {
            var9 = this.field7479 < 3 ? class155.field1899[this.field7479 + 1] : null;
        }
        class55 var10 = null;
        if (this.field7478 != null) {
            if (arg0) {
                arg2 |= 0x40000;
            }
            var10 = var6.method1403(-76, this.field7488.field530, this.field7482, arg4, this.field7491, this.field7478, var8, var8.method428(true, this.field7488.field530, this.field7488.field531), this.field7490, var9, this.field7488.field531, this.field7483 == 11 ? this.field7499 + 4 : this.field7499, this.field7483 == 11 ? 10 : this.field7483, arg2);
            if (var10 == null) {
                this.field7500 = 0;
                this.field7477 = null;
                this.field7498 = 0;
                this.field7512 = null;
            } else {
                if (arg0) {
                    if (this.field7512 == null) {
                        this.field7512 = new boolean[4];
                    }
                    this.field7477 = var10.method133(this.field7477);
                    class30.method389(this.field7477, this.field7479, this.field7488.field530, this.field7488.field531, this.field7512);
                    this.field7481 = var6.field3056;
                    this.field7476 = this.field7482;
                }
                this.field7500 = var10.method65();
                this.field7498 = var10.method72();
            }
            this.field7501 = null;
        } else if (this.field7501 != null && (this.field7501.method118() & arg2) == arg2 && this.field7492 == var6.field3056) {
            var10 = this.field7501;
        } else {
            if (this.field7501 != null) {
                arg2 |= this.field7501.method118();
            }
            class528 var11 = var6.method1417(false, this.field7488.field531, arg4, this.field7483 == 11 ? 10 : this.field7483, var9, arg2, arg0, this.field7488.field530, var8.method428(true, this.field7488.field530, this.field7488.field531), this.field7483 == 11 ? this.field7499 + 4 : this.field7499, var8);
            if (var11 == null) {
                this.field7500 = 0;
                this.field7477 = null;
                this.field7512 = null;
                this.field7501 = null;
                this.field7498 = 0;
            } else {
                var10 = var11.field7718;
                this.field7501 = var11.field7718;
                if (arg0) {
                    this.field7477 = var11.field7717;
                    this.field7512 = null;
                    class30.method389(this.field7477, this.field7479, this.field7488.field530, this.field7488.field531, null);
                    this.field7481 = var6.field3056;
                    this.field7476 = -1;
                }
                this.field7500 = var10.method65();
                this.field7498 = var10.method72();
            }
        }
        this.field7492 = var6.field3056;
        return var10;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 538)
    public final void method3040(int arg0, int arg1) {
        field7518++;
        int var3 = 81 % ((-arg0 - 47) / 48);
        this.field7515 = true;
        this.method3031((byte) 69, arg1);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;B)V", line = 558)
    public final void method3041(class165 arg0, byte arg1) {
        int var3 = -13 / ((64 - arg1) / 57);
        if (this.field7477 != null) {
            class122.method855(this.field7477, this.field7479, this.field7488.field530, this.field7488.field531, this.field7512);
            this.field7512 = null;
            this.field7477 = null;
        }
        field7504++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;I)V", line = 578)
    public final void method3042(class165 arg0, int arg1) {
        this.method3039(true, true, 262144, false, arg0);
        if (arg1 >= -76) {
            this.method3040(0, -73);
        }
        field7497++;
    }
}
