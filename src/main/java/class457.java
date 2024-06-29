import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class457 extends class39 {

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public int field6390 = 0;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public int field6410 = -1;

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "[I")
    public int[] field6421 = new int[4];

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public int field6402 = -1;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public int field6401 = 0;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public int field6398 = -1;

    @OriginalMember(owner = "client!va", name = "vb", descriptor = "I")
    public int field6432 = -1;

    @OriginalMember(owner = "client!va", name = "zb", descriptor = "I")
    public int field6436 = -1000;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public int field6391 = -1;

    @OriginalMember(owner = "client!va", name = "mb", descriptor = "I")
    public int field6423 = 0;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
    public int[] field6379 = new int[4];

    @OriginalMember(owner = "client!va", name = "M", descriptor = "[I")
    public int[] field6397 = new int[4];

    @OriginalMember(owner = "client!va", name = "pb", descriptor = "I")
    public int field6426 = 0;

    @OriginalMember(owner = "client!va", name = "Jb", descriptor = "I")
    public int field6446 = 0;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "Ljava/lang/String;")
    public String field6405 = null;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public int field6415 = 0;

    @OriginalMember(owner = "client!va", name = "qb", descriptor = "I")
    public int field6427 = 0;

    @OriginalMember(owner = "client!va", name = "Hb", descriptor = "I")
    public int field6444 = 0;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public int field6394 = 256;

    @OriginalMember(owner = "client!va", name = "Lb", descriptor = "I")
    public int field6448 = 0;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public int field6393 = -1;

    @OriginalMember(owner = "client!va", name = "ob", descriptor = "I")
    public int field6425 = 0;

    @OriginalMember(owner = "client!va", name = "wb", descriptor = "I")
    public int field6433 = 0;

    @OriginalMember(owner = "client!va", name = "Ib", descriptor = "I")
    public int field6445 = 0;

    @OriginalMember(owner = "client!va", name = "yb", descriptor = "B")
    public byte field6435 = 0;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public int field6413 = 0;

    @OriginalMember(owner = "client!va", name = "Db", descriptor = "I")
    public int field6440 = 0;

    @OriginalMember(owner = "client!va", name = "Gb", descriptor = "I")
    public int field6443 = -1;

    @OriginalMember(owner = "client!va", name = "Cb", descriptor = "I")
    public int field6439 = 0;

    @OriginalMember(owner = "client!va", name = "Ab", descriptor = "I")
    public int field6437 = -1;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public int field6392 = -1;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
    public int field6417 = -1;

    @OriginalMember(owner = "client!va", name = "Nb", descriptor = "I")
    public int field6450 = 0;

    @OriginalMember(owner = "client!va", name = "Yb", descriptor = "Z")
    public boolean field6461 = true;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "Z")
    public boolean field6414 = false;

    @OriginalMember(owner = "client!va", name = "ac", descriptor = "I")
    private int field6463 = 1;

    @OriginalMember(owner = "client!va", name = "bc", descriptor = "I")
    public int field6464 = -1;

    @OriginalMember(owner = "client!va", name = "ec", descriptor = "I")
    public int field6467 = -1;

    @OriginalMember(owner = "client!va", name = "sb", descriptor = "I")
    public int field6429 = -32768;

    @OriginalMember(owner = "client!va", name = "dc", descriptor = "I")
    public int field6466 = -1000;

    @OriginalMember(owner = "client!va", name = "Kb", descriptor = "I")
    public int field6447 = 0;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "[Lid;")
    public class535[] field6400 = new class535[12];

    @OriginalMember(owner = "client!va", name = "rb", descriptor = "Z")
    public boolean field6428 = false;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public int field6381 = 0;

    @OriginalMember(owner = "client!va", name = "jc", descriptor = "I")
    public int field6472 = 0;

    @OriginalMember(owner = "client!va", name = "kc", descriptor = "I")
    public int field6473 = 100;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "Lno;")
    public class645 field6395 = new class645();

    @OriginalMember(owner = "client!va", name = "lc", descriptor = "Lno;")
    private class645 field6474 = new class645();

    @OriginalMember(owner = "client!va", name = "mc", descriptor = "Lno;")
    private class645 field6475 = new class645();

    @OriginalMember(owner = "client!va", name = "oc", descriptor = "[I")
    public int[] field6477 = new int[10];

    @OriginalMember(owner = "client!va", name = "nc", descriptor = "Z")
    public boolean field6476 = false;

    @OriginalMember(owner = "client!va", name = "pc", descriptor = "[Lba;")
    public class352[] field6478 = new class352[4];

    @OriginalMember(owner = "client!va", name = "uc", descriptor = "[I")
    public int[] field6483 = new int[10];

    @OriginalMember(owner = "client!va", name = "tc", descriptor = "[B")
    public byte[] field6482 = new byte[10];

    @OriginalMember(owner = "client!va", name = "vc", descriptor = "I")
    public int field6484 = 0;

    @OriginalMember(owner = "client!va", name = "sc", descriptor = "I")
    public int field6481 = 0;

    @OriginalMember(owner = "client!va", name = "qc", descriptor = "I")
    public int field6479 = 0;

    @OriginalMember(owner = "client!va", name = "wc", descriptor = "I")
    public int field6485 = 0;

    @OriginalMember(owner = "client!va", name = "Fb", descriptor = "Lfc;")
    public static class235 field6442 = new class235(77, 7);

    @OriginalMember(owner = "client!va", name = "Sb", descriptor = "Z")
    public static boolean field6455 = false;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "B")
    public byte field6399;

    @OriginalMember(owner = "client!va", name = "Rb", descriptor = "B")
    public byte field6454;

    @OriginalMember(owner = "client!va", name = "Ub", descriptor = "B")
    public byte field6457;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field6380;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public int field6384;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public int field6388;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public int field6404;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public int field6406;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public int field6407;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public int field6408;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public int field6411;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public int field6416;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    public int field6420;

    @OriginalMember(owner = "client!va", name = "lb", descriptor = "I")
    public int field6422;

    @OriginalMember(owner = "client!va", name = "nb", descriptor = "I")
    public int field6424;

    @OriginalMember(owner = "client!va", name = "tb", descriptor = "I")
    public int field6430;

    @OriginalMember(owner = "client!va", name = "ub", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!va", name = "xb", descriptor = "I")
    public int field6434;

    @OriginalMember(owner = "client!va", name = "Bb", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!va", name = "Eb", descriptor = "I")
    public int field6441;

    @OriginalMember(owner = "client!va", name = "Mb", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!va", name = "Ob", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!va", name = "Pb", descriptor = "I")
    public int field6452;

    @OriginalMember(owner = "client!va", name = "Qb", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!va", name = "Tb", descriptor = "I")
    public int field6456;

    @OriginalMember(owner = "client!va", name = "Vb", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!va", name = "Wb", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!va", name = "Xb", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!va", name = "Zb", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!va", name = "cc", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!va", name = "fc", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!va", name = "gc", descriptor = "I")
    public int field6469;

    @OriginalMember(owner = "client!va", name = "hc", descriptor = "I")
    public int field6470;

    @OriginalMember(owner = "client!va", name = "ic", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!va", name = "xc", descriptor = "Lsaa;")
    public class296 field6486;

    @OriginalMember(owner = "client!va", name = "rc", descriptor = "Lio;")
    public class401 field6480;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method2630(boolean arg0, int arg1) {
        if (arg0) {
            method2633(-0.7825365738780596D, 91);
        }
        ++field6389;
        class308 var3 = this.method2636((byte) 127);
        if (var3.field4590 != 0 || this.field6394 != 0) {
            this.field6395.method3590(124);
            int var4 = 16383 & arg1 - this.field6395.field9162;
            if (~var4 < -8193) {
                this.field6469 = this.field6395.field9162 + -16384 - -var4;
            } else {
                this.field6469 = this.field6395.field9162 + var4;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 32)
    public static void method2631(int arg0) {
        field6442 = null;
        if (arg0 != -412617042) {
            method2631(-51);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBII)V", line = 43)
    public final void method2632(int arg0, byte arg1, int arg2, int arg3) {
        ++field6438;
        if (arg1 > 73) {
            for (int var5 = 0; var5 < 4; ++var5) {
                if (~this.field6397[var5] >= ~arg0) {
                    this.field6421[var5] = arg3;
                    this.field6379[var5] = arg2;
                    this.field6397[var5] = arg0 + 70;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(DI)V", line = 71)
    public static final void method2633(double arg0, int arg1) {
        if (class606.field8446 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class579.field7772[var3] = ~var4 < -256 ? 255 : var4;
            }
            class606.field8446 = arg0;
        }
        ++field6459;
        if (arg1 != -256) {
            method2639((byte) -69);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIIII)V", line = 98)
    public final void method2634(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6458;
        int var7 = super.field517 + super.field516 >> 1;
        int var8 = super.field519 + super.field512 >> 1;
        int var9 = class675.field9542[arg0];
        if (arg1 != -61) {
            this.field6432 = 59;
        }
        int var10 = class675.field9541[arg0];
        int var11 = -arg5 / 2;
        int var12 = -arg2 / 2;
        int var13 = var9 * var12 + var10 * var11 >> 14;
        int var14 = var10 * var12 + -(var9 * var11) >> 14;
        int var15 = class556.method3049(super.field520, super.field509 + var13, var7, var8, 2, super.field514 + var14);
        int var16 = arg5 / 2;
        int var17 = -arg2 / 2;
        int var18 = var9 * var17 + var10 * var16 >> 14;
        int var19 = var10 * var17 + -(var9 * var16) >> 14;
        int var20 = class556.method3049(super.field520, super.field509 + var18, var7, var8, 2, super.field514 - -var19);
        int var21 = -arg5 / 2;
        int var22 = arg2 / 2;
        int var23 = var9 * var22 - -(var10 * var21) >> 14;
        int var24 = var10 * var22 + -(var9 * var21) >> 14;
        int var25 = class556.method3049(super.field520, super.field509 + var23, var7, var8, 2, super.field514 + var24);
        int var26 = arg5 / 2;
        int var27 = arg2 / 2;
        int var28 = var9 * var27 + var10 * var26 >> 14;
        int var29 = var10 * var27 - var9 * var26 >> 14;
        int var30 = class556.method3049(super.field520, super.field509 - -var28, var7, var8, 2, super.field514 + var29);
        int var31 = var20 <= var15 ? var20 : var15;
        int var32 = ~var30 >= ~var25 ? var30 : var25;
        int var33 = var30 > var20 ? var20 : var30;
        int var34 = ~var25 < ~var15 ? var15 : var25;
        this.field6456 = 16383 & (int) (Math.atan2((double) (-var32 + var31), (double) arg2) * 2607.5945876176133D);
        this.field6441 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (var34 - var33), (double) arg5));
        if (~this.field6456 != -1 && ~arg3 != -1) {
            int var35 = 16384 - arg3;
            if (this.field6456 <= 8192) {
                if (arg3 < this.field6456) {
                    this.field6456 = arg3;
                }
            } else if (~var35 < ~this.field6456) {
                this.field6456 = var35;
            }
        }
        if (this.field6441 != 0 && ~arg4 != -1) {
            int var36 = 16384 - arg4;
            if (~this.field6441 >= -8193) {
                if (arg4 < this.field6441) {
                    this.field6441 = arg4;
                }
            } else if (~this.field6441 > ~var36) {
                this.field6441 = var36;
            }
        }
        this.field6380 = var15 + var30;
        if (~this.field6380 < ~(var20 + var25)) {
            this.field6380 = var20 - -var25;
        }
        this.field6380 = (this.field6380 >> 1) - super.field518;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 1167)
    public class457() {
        super(0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V", line = 229)
    public final void method178(int arg0) {
        ++field6383;
        int var2 = (this.field6463 + -1 << 8) + 240;
        super.field516 = (short) (super.field509 + var2 >> 9);
        super.field517 = (short) (-var2 + super.field509 >> 9);
        if (arg0 != 12) {
            method2631(-6);
        }
        super.field512 = (short) (-var2 + super.field514 >> 9);
        super.field519 = (short) (super.field514 + var2 >> 9);
        if (~this.field6446 != -1) {
            int var3 = this.method2635(-107);
            if ((var3 & 8) != 0) {
                --super.field517;
            }
            if (~(var3 & 1) != -1) {
                ++super.field519;
            }
            if ((4 & var3) != 0) {
                ++super.field516;
            }
            if ((2 & var3) != 0) {
                --super.field512;
            }
        }
        if (this.field6486 != null) {
            if (~this.field6486.field4431 < ~super.field516) {
                super.field516 = (short) this.field6486.field4431;
            }
            if (~super.field517 < ~this.field6486.field4418) {
                super.field517 = (short) this.field6486.field4418;
            }
            if (~super.field512 < ~this.field6486.field4427) {
                super.field512 = (short) this.field6486.field4427;
            }
            if (~super.field519 > ~this.field6486.field4426) {
                super.field519 = (short) this.field6486.field4426;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I", line = 292)
    public final int method2635(int arg0) {
        ++field6453;
        if (this.field6446 == 0) {
            return 0;
        } else {
            int var2 = this.field6395.method3589(true);
            boolean var3 = false;
            boolean var4 = false;
            boolean var5 = false;
            boolean var6 = false;
            if (~var2 < -5121 && var2 < 11264) {
                if (~(this.field6446 & 1) != -1) {
                    var3 = true;
                }
                if ((this.field6446 & 2) != 0) {
                    var5 = true;
                }
                if (~(this.field6446 & 4) != -1) {
                    var6 = true;
                }
                if (~(8 & this.field6446) != -1) {
                    var4 = true;
                }
            }
            if (var2 > 9216 && ~var2 > -15361) {
                if ((8 & this.field6446) != 0) {
                    var5 = true;
                }
                if (~(this.field6446 & 2) != -1) {
                    var6 = true;
                }
                if ((this.field6446 & 1) != 0) {
                    var4 = true;
                }
                if ((4 & this.field6446) != 0) {
                    var3 = true;
                }
            }
            if (var2 > 13312 || ~var2 > -3073) {
                if (~(8 & this.field6446) != -1) {
                    var6 = true;
                }
                if (~(this.field6446 & 1) != -1) {
                    var5 = true;
                }
                if ((4 & this.field6446) != 0) {
                    var4 = true;
                }
                if ((2 & this.field6446) != 0) {
                    var3 = true;
                }
            }
            if (~var2 < -1025 && ~var2 > -7169) {
                if (~(this.field6446 & 2) != -1) {
                    var4 = true;
                }
                if (~(8 & this.field6446) != -1) {
                    var3 = true;
                }
                if (~(this.field6446 & 1) != -1) {
                    var6 = true;
                }
                if ((this.field6446 & 4) != 0) {
                    var5 = true;
                }
            }
            if (var3) {
                if (class22.field308 + -1 > super.field519) {
                    for (int var7 = super.field517; ~super.field516 <= ~var7 && ~class137.field1931 < ~var7; ++var7) {
                        if (var7 >= 0) {
                            class486 var8 = class80.method635(super.field520, var7, super.field519 - -1);
                            if (var8 != null && (var8.field6750 != null || var8.field6741 != null)) {
                                var3 = false;
                                break;
                            }
                        }
                    }
                } else {
                    var3 = false;
                }
            }
            if (var5) {
                if (~super.field519 >= -1) {
                    var5 = false;
                } else {
                    for (int var9 = super.field517; super.field516 >= var9 && var9 < class137.field1931; ++var9) {
                        if (var9 >= 0) {
                            class486 var10 = class80.method635(super.field520, var9, super.field519 + -1);
                            if (var10 != null && (var10.field6750 != null || var10.field6741 != null)) {
                                var5 = false;
                                break;
                            }
                        }
                    }
                }
            }
            if (var4) {
                if (~super.field516 <= ~(class137.field1931 + -1)) {
                    var4 = false;
                } else {
                    for (int var11 = super.field512; ~super.field519 <= ~var11 && ~class22.field308 < ~var11; ++var11) {
                        if (var11 >= 0) {
                            class486 var12 = class80.method635(super.field520, super.field516 + 1, var11);
                            if (var12 != null && (var12.field6750 != null || var12.field6741 != null)) {
                                var4 = false;
                                break;
                            }
                        }
                    }
                }
            }
            if (var6) {
                if (~super.field516 < -1) {
                    for (int var13 = super.field512; super.field519 >= var13 && ~class22.field308 < ~var13; ++var13) {
                        if (var13 >= 0) {
                            class486 var14 = class80.method635(super.field520, super.field516 + -1, var13);
                            if (var14 != null && (var14.field6750 != null || var14.field6741 != null)) {
                                var6 = false;
                                break;
                            }
                        }
                    }
                } else {
                    var6 = false;
                }
            }
            int var15 = 0;
            if (var3) {
                var15 |= 1;
            }
            if (var5) {
                var15 |= 2;
            }
            if (arg0 >= -102) {
                this.finalize();
            }
            if (var4) {
                var15 |= 4;
            }
            if (var6) {
                var15 |= 8;
            }
            return var15;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)Ljg;", line = 557)
    public final class308 method2636(byte arg0) {
        if (arg0 <= 68) {
            return null;
        } else {
            ++field6462;
            int var2 = this.method1442((byte) 100);
            return ~var2 == 0 ? class586.field8196 : class310.field4615.method3018(var2, 32);
        }
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 575)
    protected final void finalize() {
        ++field6451;
        if (this.field6480 != null) {
            this.field6480.method2291();
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)I", line = 587)
    public final int method2637(byte arg0) {
        ++field6387;
        class308 var2 = this.method2636((byte) 108);
        int var3 = this.field6395.field9162;
        boolean var4;
        if (var2.field4590 != 0) {
            var4 = this.field6395.method3591(var2.field4590, this.field6469, var2.field4596, false);
        } else {
            var4 = this.field6395.method3591(this.field6394, this.field6469, this.field6394, false);
        }
        if (arg0 != 65) {
            this.method2638(86, 24);
        }
        int var5 = -var3 + this.field6395.field9162;
        if (var5 == 0) {
            this.field6439 = 0;
            this.field6395.method3592(this.field6469, 8);
        } else {
            ++this.field6439;
        }
        if (!var4) {
            if (~var2.field4579 != -1) {
                this.field6474.method3591(var2.field4579, 0, var2.field4589, false);
            } else {
                this.field6474.method3592(0, 82);
            }
            if (~var2.field4557 != -1) {
                this.field6475.method3591(var2.field4557, 0, var2.field4556, false);
            } else {
                this.field6475.method3592(0, 69);
            }
        } else {
            if (var2.field4579 != 0) {
                if (var5 <= 0) {
                    this.field6474.method3591(var2.field4579, -var2.field4601, var2.field4589, false);
                } else {
                    this.field6474.method3591(var2.field4579, var2.field4601, var2.field4589, false);
                }
            }
            if (~var2.field4557 != -1) {
                this.field6475.method3591(var2.field4557, var2.field4562, var2.field4556, false);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)I", line = 652)
    public int method1433(boolean arg0) {
        ++field6468;
        class308 var2 = this.method2636((byte) 124);
        if (~var2.field4571 != 0) {
            return var2.field4571;
        } else if (arg0) {
            return 40;
        } else {
            return ~this.field6429 == 32767 ? 200 : -this.field6429;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V", line = 682)
    public final void method2638(int arg0, int arg1) {
        this.field6463 = arg1;
        if (arg0 != 18799) {
            this.field6415 = 73;
        }
        ++field6419;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)I", line = 695)
    public int method1722(byte arg0) {
        ++field6409;
        if (arg0 >= -118) {
            this.method1433(true);
        }
        return this.field6463;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V", line = 706)
    public static final void method2639(byte arg0) {
        ++field6418;
        if (class164.field2504 == null) {
            int var1 = class486.field6753;
            int var2 = class508.field6968;
            if (arg0 < 64) {
                method2639((byte) -90);
            }
            int var3 = -class547.field7412 + -var1 + class43.field650;
            int var4 = -class124.field1711 - var2 + class693.field9716;
            if (var1 > 0 || ~var3 < -1 || var2 > 0 || ~var4 < -1) {
                try {
                    Container var5;
                    if (class166.field2513 != null) {
                        var5 = class166.field2513;
                    } else if (class188.field2779 == null) {
                        var5 = class374.field5299;
                    } else {
                        var5 = class188.field2779;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class166.field2513 == var5) {
                        Insets var8 = class166.field2513.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var1 > 0) {
                        var9.fillRect(var6, var7, var1, class693.field9716);
                    }
                    if (~var2 < -1) {
                        var9.fillRect(var6, var7, class43.field650, var2);
                    }
                    if (var3 > 0) {
                        var9.fillRect(class43.field650 + var6 + -var3, var7, var3, class693.field9716);
                    }
                    if (~var4 < -1) {
                        var9.fillRect(var6, class693.field9716 + var7 + -var4, class43.field650, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLq;ILoa;[Lba;)V", line = 794)
    public final void method2640(boolean arg0, class391 arg1, int arg2, class638 arg3, class352[] arg4) {
        if (arg2 != 21831) {
            method2631(-47);
        }
        ++field6396;
        if (arg0) {
            if (this.field6480 != null) {
                this.field6480.method2280((long) class239.field3440);
            }
        } else {
            class352 var6 = arg4[0];
            class352 var7 = arg4[1];
            class352 var8 = arg4[3];
            if (var6 != null) {
                var6.method211(arg1);
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                int var12 = 0;
                class34[] var13 = var6.method221();
                class171[] var14 = var6.method206();
                if (var13 != null) {
                    var9 += var13.length;
                    ++var10;
                }
                if (var14 != null) {
                    var11 += var14.length;
                    ++var12;
                }
                class34[] var15 = null;
                class171[] var16 = null;
                if (var7 != null) {
                    var7.method211(arg1);
                    var15 = var7.method221();
                    var16 = var7.method206();
                }
                if (var16 != null) {
                    ++var12;
                    var11 += var16.length;
                }
                if (var15 != null) {
                    var9 += var15.length;
                    ++var10;
                }
                class34[] var17 = null;
                class171[] var18 = null;
                if (var8 != null) {
                    var8.method211(arg1);
                    var17 = var8.method221();
                    var18 = var8.method206();
                }
                if (var18 != null) {
                    ++var12;
                    var11 += var18.length;
                }
                if (var17 != null) {
                    var9 += var17.length;
                    ++var10;
                }
                if ((this.field6480 == null || this.field6480.field5570) && (~var10 < -1 || ~var12 < -1)) {
                    this.field6480 = class401.method2277(class239.field3440, true);
                }
                if (this.field6480 != null) {
                    Object var19 = null;
                    class34[] var20;
                    if (var10 == 1) {
                        if (var15 == null) {
                            if (var17 != null) {
                                var20 = var17;
                            } else {
                                var20 = var13;
                            }
                        } else {
                            var20 = var15;
                        }
                    } else {
                        var20 = new class34[var9];
                        int var21 = 0;
                        if (var13 != null) {
                            class282.method1708(var13, 0, var20, var21, var13.length);
                            var21 += var13.length;
                        }
                        if (var15 != null) {
                            class282.method1708(var15, 0, var20, var21, var15.length);
                            var21 += var15.length;
                        }
                        if (var17 != null) {
                            class282.method1708(var17, 0, var20, var21, var17.length);
                        }
                    }
                    Object var22 = null;
                    class171[] var23;
                    if (var12 != 1) {
                        var23 = new class171[var11];
                        int var24 = 0;
                        if (var14 != null) {
                            class282.method1708(var14, 0, var23, var24, var14.length);
                            var24 += var14.length;
                        }
                        if (var16 != null) {
                            class282.method1708(var16, 0, var23, var24, var16.length);
                            var24 += var16.length;
                        }
                        if (var18 != null) {
                            class282.method1708(var18, 0, var23, var24, var18.length);
                        }
                    } else if (var16 == null) {
                        if (var18 != null) {
                            var23 = var18;
                        } else {
                            var23 = var14;
                        }
                    } else {
                        var23 = var16;
                    }
                    this.field6480.method2281(arg3, (long) class239.field3440, var20, var23, false);
                }
                this.field6476 = true;
            }
        }
        if (this.field6480 != null) {
            this.field6480.method2278(super.field520, super.field517, super.field516, super.field512, super.field519);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZIBII)V", line = 1020)
    public final void method2641(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field6431;
        int var6 = arg0 ? this.field6443 : this.field6417;
        if (arg4 != -1 && var6 != -1) {
            if (arg4 != var6) {
                class586 var7 = class569.field7652.method2128(arg4, arg2 ^ 84);
                class586 var8 = class569.field7652.method2128(var6, -1);
                if (~var7.field8185 != 0 && var8.field8185 != -1) {
                    class131 var9 = class301.field4465.method2763(var7.field8185, 31696);
                    class131 var10 = class301.field4465.method2763(var8.field8185, arg2 + 31781);
                    if (~var10.field1799 < ~var9.field1799) {
                        return;
                    }
                }
            } else {
                class586 var11 = class569.field7652.method2128(arg4, -1);
                if (var11.field8178 && var11.field8185 != -1) {
                    class131 var12 = class301.field4465.method2763(var11.field8185, 31696);
                    int var13 = var12.field1801;
                    if (~var13 == -1) {
                        return;
                    }
                    if (var13 == 2) {
                        if (arg0) {
                            this.field6381 = 0;
                            return;
                        }
                        this.field6390 = 0;
                        return;
                    }
                }
            }
        }
        if (arg2 != -85) {
            this.field6484 = -69;
        }
        int var14 = class239.field3440;
        if (!arg0) {
            this.field6417 = arg4;
            this.field6404 = arg1 >> 16;
            this.field6392 = 1;
            this.field6424 = (arg1 & 65535) + var14;
            this.field6416 = arg3;
            this.field6447 = 0;
            this.field6423 = 0;
            if (~this.field6424 < ~var14) {
                this.field6423 = -1;
            }
            if (~this.field6417 != 0 && this.field6424 == var14) {
                int var15 = class569.field7652.method2128(this.field6417, arg2 ^ 84).field8185;
                if (var15 != -1) {
                    class131 var16 = class301.field4465.method2763(var15, arg2 + 31781);
                    if (var16 != null && var16.field1806 != null) {
                        class99.method769(class253.field3576 == this, super.field509, super.field520, var16, super.field514, 50, 0);
                        return;
                    }
                }
            }
        } else {
            this.field6460 = var14 - -(65535 & arg1);
            this.field6448 = 0;
            this.field6443 = arg4;
            this.field6385 = arg1 >> 16;
            this.field6445 = 0;
            this.field6386 = arg3;
            this.field6432 = 1;
            if (~this.field6460 < ~var14) {
                this.field6445 = -1;
            }
            if (this.field6443 != -1 && ~this.field6460 == ~var14) {
                int var17 = class569.field7652.method2128(this.field6443, arg2 + 84).field8185;
                if (~var17 != 0) {
                    class131 var18 = class301.field4465.method2763(var17, arg2 ^ -31621);
                    if (var18 != null && var18.field1806 != null) {
                        class99.method769(class253.field3576 == this, super.field509, super.field520, var18, super.field514, 50, 0);
                        return;
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(B)V", line = 1195)
    public final void method2642(byte arg0) {
        ++field6412;
        this.field6484 = 0;
        int var2 = 63 / ((-18 - arg0) / 63);
        this.field6485 = 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lba;I)V", line = 1297)
    public final void method2643(class352 arg0, int arg1) {
        ++field6403;
        int var3 = this.field6474.field9162;
        int var4 = this.field6475.field9162;
        if (arg1 != var3 || ~var4 != -1) {
            int var5 = arg0.method220() / 2;
            arg0.method224(0, -var5, 0);
            arg0.method223(var3 & 16383);
            arg0.method233(var4 & 16383);
            arg0.method224(0, var5, 0);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZ)V", line = 1325)
    public final void method2644(int arg0, int arg1, boolean arg2) {
        ++field6449;
        class308 var4 = this.method2636((byte) 109);
        if (arg2 || ~var4.field4590 != -1 || ~this.field6394 != -1) {
            this.field6469 = arg1 & 16383;
            this.field6395.method3592(this.field6469, 7);
            if (arg0 > -94) {
                this.field6420 = -73;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)I")
    public abstract int method1438(byte arg0);

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(B)I")
    public abstract int method1442(byte arg0);
}
