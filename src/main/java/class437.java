import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class437 extends class651 {

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Z")
    private boolean field5976;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Z")
    private boolean field5978;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Ljw;")
    public class520 field5980;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    private int field5981;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public int field5985;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    private int field5983;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public int field5982;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    private int field5993;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Z")
    public boolean field5994;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public int field5987;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public int field6010;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public int field5992;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    private int field6002;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public int field6012;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public int field6006;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public int field6017;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "Z")
    private boolean field6011;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public int field6009;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public int field6020;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
    public int field6021;

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lmga;")
    public class666 field6022;

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "I")
    public int field6024;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "Lmga;")
    private class666 field5991;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Lpt;")
    public class496 field5984;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "F")
    private float field5988;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "F")
    private float field6019;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    private int field5977;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public int field5990;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public int field5995;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public int field5996;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public int field6000;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public int field6004;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public int field6007;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public int field6013;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public int field6015;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public int field6018;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lmg;")
    public class137 field5979;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "Lxa;")
    public class468 field5997;

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "Lxa;")
    public class468 field6023;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5975;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "Z")
    public boolean field5998;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
    public int[] field5986;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "[Leo;")
    public class274[] field6016;

    @OriginalMember(owner = "client!qe", name = "FA", descriptor = "(IIIIII)Z", line = 4)
    public final boolean method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field5984.field6665 * arg2 + this.field5984.field6667 * arg0 + this.field5984.field6666 * arg1 >> 14) + this.field5984.field6662;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field5984.field6665 * arg5 + this.field5984.field6667 * arg3 + this.field5984.field6666 * arg4 >> 14) + this.field5984.field6662;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field5982 || var8 >= this.field5982) && (var7 <= this.field5981 || var8 <= this.field5981)) {
            int var9 = ((this.field5984.field6668 * arg2 + this.field5984.field6661 * arg0 + this.field5984.field6657 * arg1 >> 14) + this.field5984.field6664) * this.field6017 / var7;
            int var10 = ((this.field5984.field6668 * arg5 + this.field5984.field6661 * arg3 + this.field5984.field6657 * arg4 >> 14) + this.field5984.field6664) * this.field6017 / var8;
            if (var9 < this.field6000 && var10 < this.field6000 || var9 > this.field6008 && var10 > this.field6008) {
                return false;
            } else {
                int var11 = ((this.field5984.field6658 * arg2 + this.field5984.field6663 * arg0 + this.field5984.field6659 * arg1 >> 14) + this.field5984.field6660) * this.field6009 / var7;
                int var12 = ((this.field5984.field6658 * arg5 + this.field5984.field6663 * arg3 + this.field5984.field6659 * arg4 >> 14) + this.field5984.field6660) * this.field6009 / var8;
                return (var11 >= this.field6018 || var12 >= this.field6018) && (var11 <= this.field5989 || var12 <= this.field5989);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 33)
    public class437(Canvas arg0, class498 arg1) {
        this(arg1);
        this.method375(arg0);
        this.method370(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 42)
    public final void method86(Rectangle[] arg0, int arg1) throws class26 {
        if (this.field5975 != null && this.field5979 != null) {
            try {
                Graphics var3 = this.field5975.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5995 && var5.y <= this.field5996 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5979.method1014(var5.height, var5.y, var5.width, var5.x, 11, var3);
                    }
                }
            } catch (Exception var6) {
                this.field5975.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "()V", line = 70)
    public void method38() {
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V", line = 73)
    public final void method76() {
    }

    @OriginalMember(owner = "client!qe", name = "ya", descriptor = "(IIIII)V", line = 76)
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5999 && arg0 < this.field6014) {
            if (arg1 < this.field5985) {
                arg2 -= this.field5985 - arg1;
                arg1 = this.field5985;
            }
            if (arg1 + arg2 > this.field6001) {
                arg2 = this.field6001 - arg1;
            }
            int var6 = this.field5995 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5995 * var10 + var6;
                        int var12 = this.field5986[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5986[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5995 * var14 + var6;
                        int var16 = this.field5986[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5986[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5986[this.field5995 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(IIIII)V", line = 152)
    public final void method379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5985 && arg1 < this.field6001) {
            if (arg0 < this.field5999) {
                arg2 -= this.field5999 - arg0;
                arg0 = this.field5999;
            }
            if (arg0 + arg2 > this.field6014) {
                arg2 = this.field6014 - arg0;
            }
            int var6 = this.field5995 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5986[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5986[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5986[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5986[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5986[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(FFF)V", line = 224)
    public final void method70(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(IIIIII)V", line = 228)
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method379(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method379(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method446(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method446(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field5999) {
                    var10 += (this.field5999 - arg0) * var12;
                    arg0 = this.field5999;
                }
                if (var13 >= this.field6014) {
                    var13 = this.field6014 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5985 && var17 < this.field6001) {
                                int var18 = this.field5995 * var17 + arg0;
                                int var19 = this.field5986[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5986[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5985 && var21 < this.field6001) {
                                int var22 = this.field5995 * var21 + arg0;
                                int var23 = this.field5986[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5986[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field5985 && var27 < this.field6001) {
                            this.field5986[this.field5995 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field5985) {
                    var29 += (this.field5985 - arg1) * var31;
                    arg1 = this.field5985;
                }
                if (var32 >= this.field6001) {
                    var32 = this.field6001 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5999 && var46 < this.field6014) {
                            this.field5986[this.field5995 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5999 && var36 < this.field6014) {
                            int var37 = this.field5995 * arg1 + var36;
                            int var38 = this.field5986[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5986[this.field5995 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5999 && var40 < this.field6014) {
                            int var41 = this.field5995 * arg1 + var40;
                            int var42 = this.field5986[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5986[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lc;)V", line = 442)
    public final void method465(class174 arg0) {
        class444 var2 = arg0.field2679.field4804;
        for (class444 var3 = var2.field6079; var2 != var3; var3 = var3.field6079) {
            class115 var4 = (class115) var3;
            int var5 = var4.field1973 >> 12;
            int var6 = var4.field1976 >> 12;
            int var7 = var4.field1972 >> 12;
            int var8 = (this.field5984.field6665 * var7 + this.field5984.field6667 * var5 + this.field5984.field6666 * var6 >> 14) + this.field5984.field6662;
            if (var8 >= this.field5982 && var8 <= this.field6006) {
                int var9 = ((this.field5984.field6668 * var7 + this.field5984.field6661 * var5 + this.field5984.field6657 * var6 >> 14) + this.field5984.field6664) * this.field6017 / var8 + this.field6015;
                int var10 = ((this.field5984.field6658 * var7 + this.field5984.field6663 * var5 + this.field5984.field6659 * var6 >> 14) + this.field5984.field6660) * this.field6009 / var8 + this.field6007;
                if (var9 >= this.field5999 && var9 <= this.field6014 && var10 >= this.field5985 && var10 <= this.field6001) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2481(var4, var9, var10, var8, (this.field6017 * var4.field1983 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "()Z", line = 479)
    public final boolean method428() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 482)
    public void method425(int arg0) {
        this.field6016[arg0].method1661(Thread.currentThread(), 10);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Le;)V", line = 485)
    private class437(class498 arg0) {
        super(arg0);
        this.field5976 = false;
        this.field5978 = false;
        this.field5980 = new class520(4);
        this.field5981 = 3500;
        this.field5985 = 0;
        this.field5983 = 0;
        this.field5982 = 50;
        this.field5993 = 0;
        this.field5994 = false;
        this.field5987 = 0;
        this.field5999 = 0;
        this.field6014 = 0;
        this.field6010 = 3500;
        this.field5992 = 0;
        this.field6002 = 0;
        this.field6012 = 75518;
        this.field6006 = this.field5981 - 255;
        this.field6017 = 512;
        this.field6005 = 78642;
        this.field6001 = 0;
        this.field6011 = false;
        this.field6009 = 512;
        this.field6020 = 45823;
        this.field6021 = 0;
        this.field6022 = new class666(16);
        this.field6024 = -1;
        this.field5991 = new class666(256);
        this.field5984 = new class496();
        this.method409(1);
        this.method425(0);
        class312.method1865(true, false, (byte) -128);
        this.field5978 = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 495)
    public final void method382(boolean arg0) {
        this.field6011 = arg0;
        this.field5991.method3739(0);
    }

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "()Z", line = 499)
    public final boolean method93() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "()V", line = 504)
    public final void method100() {
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(IIIII)V", line = 507)
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5985) {
            var6 = this.field5985;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field6001) {
            var7 = this.field6001;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field5999) {
                    var64 = this.field5999;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field6014) {
                    var65 = this.field6014;
                }
                int var66 = this.field5995 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5986[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field5999) {
                    var60 = this.field5999;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field6014 - 1) {
                    var61 = this.field6014 - 1;
                }
                int var62 = this.field5995 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5986[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field5999) {
                    var28 = this.field5999;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field6014) {
                    var29 = this.field6014;
                }
                int var30 = this.field5995 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5986[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5986[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field5999) {
                    var22 = this.field5999;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field6014 - 1) {
                    var23 = this.field6014 - 1;
                }
                int var24 = this.field5995 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5986[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5986[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field5999) {
                    var47 = this.field5999;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field6014) {
                    var48 = this.field6014;
                }
                int var49 = this.field5995 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5986[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5986[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field5999) {
                    var39 = this.field5999;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field6014 - 1) {
                    var40 = this.field6014 - 1;
                }
                int var41 = this.field5995 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5986[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5986[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 793)
    public final int method460(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 797)
    public final void method375(Canvas arg0) {
        class137 var2 = (class137) this.field5980.method2918((long) arg0.hashCode(), (byte) -125);
        if (var2 == null) {
            class137 var3 = class116.method919(0, arg0);
            this.field5980.method2911((long) arg0.hashCode(), var3, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 808)
    public final void method420(Canvas arg0) {
        if (this.field5975 == arg0) {
            this.method370((Canvas) null);
        }
        class137 var2 = (class137) this.field5980.method2918((long) arg0.hashCode(), (byte) 60);
        if (var2 != null) {
            var2.method2797(99);
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V", line = 819)
    public final void method52(int arg0) {
        int var2 = arg0 - this.field5977;
        for (Object var3 = this.field5991.method3738(-6); var3 != null; var3 = this.field5991.method3749(5144)) {
            class182 var4 = (class182) var3;
            if (var4.field2759) {
                var4.field2757 += var2;
                int var5 = var4.field2757 / 20;
                if (var5 > 0) {
                    class364 var6 = super.field8808.method2760(var4.field2761, 21351);
                    var4.method1209(var6.field4919 * var2 * 50 / 1000, var6.field4932 * var2 * 50 / 1000);
                    var4.field2757 -= var5 * 20;
                }
                var4.field2759 = false;
            }
        }
        this.field5977 = arg0;
        this.field6022.method3740((byte) 60, 5);
        this.field5991.method3740((byte) 60, 5);
    }

    @OriginalMember(owner = "client!qe", name = "SA", descriptor = "()I", line = 852)
    public final int method104() {
        int var1 = this.field5993;
        this.field5993 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "()Z", line = 857)
    public final boolean method452() {
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[Lpv;)V", line = 859)
    public final void method400(int arg0, class65[] arg1) {
    }

    @OriginalMember(owner = "client!qe", name = "ma", descriptor = "(IIIIII[BII)V", line = 863)
    public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5995 * arg1 + arg0;
            int var15 = this.field5995 - arg2;
            if (arg1 + arg3 > this.field6001) {
                arg3 -= arg1 + arg3 - this.field6001;
            }
            if (arg1 < this.field5985) {
                int var16 = this.field5985 - arg1;
                arg3 -= var16;
                var14 += this.field5995 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field6014) {
                int var17 = arg0 + arg2 - this.field6014;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5999) {
                int var18 = this.field5999 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field5986[var14];
                            this.field5986[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field5986[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5986[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field5986[var14++] = arg5;
                        } else {
                            this.field5986[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)Z", line = 1039)
    public final boolean method2480(int arg0) {
        return this.field6011 || super.field8808.method2760(arg0, 21351).field4933;
    }

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "()V", line = 1045)
    public final void method97() throws class26 {
        if (this.field5975 != null && this.field5979 != null) {
            try {
                Graphics var1 = this.field5975.getGraphics();
                this.field5979.method1015(0, 0, var1, 27644);
            } catch (Exception var2) {
                this.field5975.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "()Z", line = 1061)
    public final boolean method388() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIILfa;II)V", line = 1067)
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, int arg7, int arg8) {
        class106 var10 = (class106) arg6;
        int[] var11 = var10.field1575;
        int[] var12 = var10.field1574;
        int var13 = this.field5985 > arg8 ? this.field5985 : arg8;
        int var14 = this.field6001 < var11.length + arg8 ? this.field6001 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field5999) {
                var18 += (this.field5999 - arg0) * var20;
                arg0 = this.field5999;
            }
            if (var21 >= this.field6014) {
                var21 = this.field6014 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field5995 * var25 + arg0;
                                int var29 = this.field5986[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5986[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field5995 * var31 + arg0;
                                int var35 = this.field5986[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5986[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field5986[this.field5995 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field5999 && var64 < this.field6014 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5986[this.field5995 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field5999 && var50 < this.field6014 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5995 * arg1 + var50;
                        int var54 = this.field5986[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5986[this.field5995 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5999 && var56 < this.field6014 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5995 * arg1 + var56;
                        int var60 = this.field5986[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5986[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "aa", descriptor = "()I", line = 1306)
    public final int method412() {
        int var1 = this.field6002;
        this.field6002 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qe", name = "AA", descriptor = "(IIII)V", line = 1311)
    public final void method387(int arg0, int arg1, int arg2, int arg3) {
        this.field5983 = this.field5987;
        this.field5992 = arg0;
        this.field5987 = arg1;
        this.field6021 = arg2;
        this.field5994 = true;
    }

    @OriginalMember(owner = "client!qe", name = "ca", descriptor = "(IIII)V", line = 1320)
    public final void method421(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5995) {
            arg2 = this.field5995;
        }
        if (arg3 > this.field5996) {
            arg3 = this.field5996;
        }
        this.field5999 = arg0;
        this.field6014 = arg2;
        this.field5985 = arg1;
        this.field6001 = arg3;
        this.method2479();
    }

    @OriginalMember(owner = "client!qe", name = "na", descriptor = "(III[I)V", line = 1340)
    public final void method438(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field5984.field6665 * arg2 + this.field5984.field6667 * arg0 + this.field5984.field6666 * arg1 >> 14) + this.field5984.field6662;
        if (var5 >= this.field5982 && var5 <= this.field5981) {
            int var6 = ((this.field5984.field6668 * arg2 + this.field5984.field6661 * arg0 + this.field5984.field6657 * arg1 >> 14) + this.field5984.field6664) * this.field6017 / var5;
            int var7 = ((this.field5984.field6658 * arg2 + this.field5984.field6663 * arg0 + this.field5984.field6659 * arg1 >> 14) + this.field5984.field6660) * this.field6009 / var5;
            if (var6 >= this.field6000 && var6 <= this.field6008 && var7 >= this.field6018 && var7 <= this.field5989) {
                arg3[0] = var6 - this.field6000;
                arg3[1] = var7 - this.field6018;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "(IIII)V", line = 1364)
    public final void method459(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5999 < arg0) {
            this.field5999 = arg0;
        }
        if (this.field5985 < arg1) {
            this.field5985 = arg1;
        }
        if (this.field6014 > arg2) {
            this.field6014 = arg2;
        }
        if (this.field6001 > arg3) {
            this.field6001 = arg3;
        }
        this.method2479();
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()Z", line = 1380)
    public final boolean method456() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "()Lq;", line = 1384)
    public final class397 method455() {
        class274 var1 = this.method2478(Thread.currentThread());
        return var1.field3803;
    }

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "()Z", line = 1388)
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "JA", descriptor = "(I)V", line = 1391)
    public final void method377(int arg0) {
    }

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "()Z", line = 1394)
    public final boolean method424() {
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "()Z", line = 1398)
    public final boolean method458() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I", line = 1401)
    public final int method376(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "()I", line = 1405)
    public final int method403() {
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "()Z", line = 1408)
    public final boolean method2482() {
        return this.field5976;
    }

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "(ILfa;II)V", line = 1412)
    public final void method397(int arg0, class217 arg1, int arg2, int arg3) {
        class106 var5 = (class106) arg1;
        int[] var6 = var5.field1575;
        int[] var7 = var5.field1574;
        int var8;
        if (this.field6001 < var6.length + arg3) {
            var8 = this.field6001 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5985 > arg3) {
            var9 = this.field5985 - arg3;
            arg3 = this.field5985;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5995 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5999 > var12) {
                    var13 -= this.field5999 - var12;
                    var12 = this.field5999;
                }
                if (this.field6014 < var12 + var13) {
                    var13 = this.field6014 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5986[var14++] = arg0;
                }
                var10 += this.field5995;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "()V", line = 1469)
    public final void method56() {
        if (this.field5978) {
            class340.method2063(0, true, false);
            this.field5978 = false;
        }
        this.field5979 = null;
        this.field5975 = null;
        this.field5980 = null;
        this.field5976 = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ldn;)V", line = 1481)
    public final void method432(class483 arg0) {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZ)Lxa;", line = 1485)
    public final class468 method426(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5995 * arg1 + arg0;
        int var8 = this.field5995 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5986[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class35(this, var6, arg2, arg3);
        } else {
            return new class622(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()V", line = 1517)
    public final void method444() {
        this.field5991.method3739(0);
        this.field6022.method3739(0);
    }

    @OriginalMember(owner = "client!qe", name = "KA", descriptor = "(IIII)[I", line = 1522)
    public final int[] method106(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5995 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5986[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)Z", line = 1547)
    public final boolean method2483(int arg0) {
        return super.field8808.method2759(32700, arg0);
    }

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "(IIII)V", line = 1551)
    public final void method373(int arg0, int arg1, int arg2, int arg3) {
        this.field6015 = arg0;
        this.field6007 = arg1;
        this.field6017 = arg2;
        this.field6009 = arg3;
        this.method2479();
    }

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "(III)V", line = 1558)
    public final void method422(int arg0, int arg1, int arg2) {
        this.field5987 = arg0 & 16777215;
        int var4 = this.field5987 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field5987 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field5987 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field5987 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field5998 = false;
        } else {
            this.field5998 = true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "()Z", line = 1582)
    public final boolean method380() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;", line = 1588)
    public final class483 method49(class483 arg0, class483 arg1, float arg2, class483 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "()Z", line = 1592)
    public final boolean method96() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "()V", line = 1596)
    public final void method29() {
    }

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "(I)[I", line = 1601)
    public final int[] method2484(int arg0) {
        class666 var2 = this.field5991;
        class182 var3;
        synchronized (this.field5991) {
            var3 = (class182) this.field5991.method3750((long) arg0, false);
            if (var3 == null) {
                if (!super.field8808.method2759(32700, arg0)) {
                    return null;
                }
                class364 var5 = super.field8808.method2760(arg0, 21351);
                int var6 = !var5.field4933 && !this.field6011 ? 128 : 64;
                var3 = new class182(arg0, var6, super.field8808.method2761((byte) 49, var6, true, arg0, 0.7F, var6), var5.field4941);
                this.field5991.method3745(1, (long) arg0, var3);
            }
        }
        var3.field2759 = true;
        return var3.method1210();
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIIII)Ldn;", line = 1621)
    public final class483 method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Li;)V", line = 1623)
    public final void method439(class37 arg0) {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([IIIII)Lxa;", line = 1629)
    public final class468 method374(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class35(this, arg0, arg1, arg2, arg3, arg4) : new class622(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class35(this, arg0, arg1, arg2, arg3, arg4) : new class622(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lkga;[Lpga;Z)Lta;", line = 1666)
    public final class200 method389(class511 arg0, class500[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6698;
            var5[var7] = arg1[var7].field6700;
            if (arg1[var7].field6696 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class424(this, arg0, arg1, var4, var5);
            } else {
                return new class539(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class165(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "(I)Z", line = 1703)
    public final boolean method2485(int arg0) {
        return super.field8808.method2760(arg0, 21351).field4924;
    }

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "()V", line = 1708)
    public final void method2486() {
        for (int var1 = 0; var1 < this.field6013; ++var1) {
            this.field6016[var1].method1334((byte) -111);
        }
        this.method435();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIII)V", line = 1718)
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method379(arg0, arg1, arg2, arg4, arg5);
        this.method379(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method446(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method446(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!qe", name = "sa", descriptor = "(II)V", line = 1724)
    public final void method450(int arg0, int arg1) {
        this.field5982 = arg0;
        this.field5981 = arg1;
        this.field6006 = this.field5981 - 255;
        this.method2487();
    }

    @OriginalMember(owner = "client!qe", name = "IA", descriptor = "()I", line = 1731)
    public final int method411() {
        return this.field5981;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V", line = 1733)
    public final void method51(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lq;)V", line = 1736)
    public final void method405(class397 arg0) {
        this.field5984 = (class496) arg0;
    }

    @OriginalMember(owner = "client!qe", name = "ka", descriptor = "(FF)V", line = 1739)
    public final void method385(float arg0, float arg1) {
        this.field6019 = arg0;
        this.field5988 = arg1;
        this.method2487();
    }

    @OriginalMember(owner = "client!qe", name = "LA", descriptor = "(IIII)V", line = 1744)
    public final void method445(int arg0, int arg1, int arg2, int arg3) {
        this.field5992 = arg0;
        this.field5987 = arg1;
        this.field6021 = arg2;
    }

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "()Lffa;", line = 1750)
    public final class173 method55() {
        return new class173(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "()V", line = 1752)
    public final void method30() {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZ)Lxa;", line = 1756)
    public final class468 method398(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class35(this, arg0, arg1) : new class622(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "()I", line = 1762)
    public final int method454() {
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "()V", line = 1765)
    public final void method414() {
        this.field5987 = this.field5983;
        this.field5994 = false;
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "()Z", line = 1769)
    public final boolean method404() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "()V", line = 1772)
    private final void method2487() {
        if (this.field5988 != 0.0F) {
            float var1 = (float) this.field5981;
            float var2 = (float) this.field5982;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field6019 / (this.field6019 + this.field5988);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field5988;
            this.field6010 = (int) (((float) this.field5981 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field6010 = this.field5981;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)V", line = 1793)
    public void method407(boolean arg0) {
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Li;", line = 1796)
    public final class37 method406(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "(IIIIII)V", line = 1799)
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5999) {
            arg2 -= this.field5999 - arg0;
            arg0 = this.field5999;
        }
        if (arg1 < this.field5985) {
            arg3 -= this.field5985 - arg1;
            arg1 = this.field5985;
        }
        if (arg0 + arg2 > this.field6014) {
            arg2 = this.field6014 - arg0;
        }
        if (arg1 + arg3 > this.field6001) {
            arg3 = this.field6001 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field6014 && arg1 <= this.field6001) {
            int var7 = this.field5995 - arg2;
            int var8 = this.field5995 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field5986[var24] = arg4;
                            ++var24;
                            this.field5986[var24] = arg4;
                            ++var24;
                            this.field5986[var24] = arg4;
                            ++var24;
                            this.field5986[var24] = arg4;
                            ++var24;
                            this.field5986[var24] = arg4;
                            ++var24;
                            this.field5986[var24] = arg4;
                            ++var24;
                            this.field5986[var24] = arg4;
                            ++var24;
                            this.field5986[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5986[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field5986[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field5986[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5986[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5986[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "()Lq;", line = 1934)
    public final class397 method466() {
        return new class496();
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V", line = 1936)
    public final void method457(int arg0) {
    }

    @OriginalMember(owner = "client!qe", name = "YA", descriptor = "(IFFFFF)V", line = 1940)
    public final void method371(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field6020 = (int) (arg1 * 65535.0F);
        this.field6005 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field6003 = (int) (arg3 * 65535.0F / var7);
        this.field5990 = (int) (arg4 * 65535.0F / var7);
        this.field6004 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lpga;Z)Lxa;", line = 1950)
    public final class468 method440(class500 arg0, boolean arg1) {
        int[] var3 = arg0.field6702;
        byte[] var4 = arg0.field6697;
        int var5 = arg0.field6698;
        int var6 = arg0.field6700;
        class289 var11;
        if (arg1 && arg0.field6696 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class387(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field6696;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class35(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class622(this, var14, var5, var6);
            }
        }
        var11.method1029(arg0.field6695, arg0.field6699, arg0.field6694, arg0.field6701);
        return var11;
    }

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "(I)I", line = 2055)
    public final int method2488(int arg0) {
        return super.field8808.method2760(arg0, 21351).field4920 & 65535;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[I[I)Lfa;", line = 2059)
    public final class217 method413(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class106(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "([I)V", line = 2062)
    public final void method433(int[] arg0) {
        arg0[0] = this.field5999;
        arg0[1] = this.field5985;
        arg0[2] = this.field6014;
        arg0[3] = this.field6001;
    }

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "()Z", line = 2068)
    public final boolean method430() {
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "ha", descriptor = "(F)V", line = 2074)
    public final void method442(float arg0) {
        this.field6012 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "()I", line = 2078)
    public final int method464() {
        return this.field5982;
    }

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "(I)V", line = 2081)
    public final void method87(int arg0) {
        this.method415(0, 0, this.field5995, this.field5996, arg0, 0);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V", line = 2084)
    public final void method33(boolean arg0) {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()Z", line = 2087)
    public final boolean method390() {
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIF)Lpv;", line = 2091)
    public final class65 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "()Z", line = 2103)
    public final boolean method416() {
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "()V", line = 2152)
    public final void method435() {
        this.field5999 = 0;
        this.field5985 = 0;
        this.field6014 = this.field5995;
        this.field6001 = this.field5996;
        this.method2479();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lba;Lc;Lq;Lot;I)V", line = 2175)
    public final void method392(class358 arg0, class174 arg1, class397 arg2, class552 arg3, int arg4) {
        ((class321) arg0).method1944(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "(I)[I", line = 2212)
    public final int[] method2490(int arg0) {
        class666 var2 = this.field5991;
        class182 var3;
        synchronized (this.field5991) {
            var3 = (class182) this.field5991.method3750((long) arg0, false);
            if (var3 == null) {
                if (!super.field8808.method2759(32700, arg0)) {
                    return null;
                }
                class364 var5 = super.field8808.method2760(arg0, 21351);
                int var6 = !var5.field4933 && !this.field6011 ? 128 : 64;
                var3 = new class182(arg0, var6, super.field8808.method2762(0.7F, var6, true, arg0, 7814, var6), var5.field4941);
                this.field5991.method3745(1, (long) arg0, var3);
            }
        }
        var3.field2759 = true;
        return var3.method1210();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public abstract void method378(int arg0);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Runnable;)Leo;")
    public abstract class274 method2478(Runnable arg0);

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "()V")
    public abstract void method2479();

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([Lba;Lc;Lq;[Lot;I)V")
    public abstract void method429(class358[] arg0, class174 arg1, class397 arg2, class552[] arg3, int arg4);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()V")
    public abstract void method107();

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
    public abstract void method409(int arg0);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ldi;IIII)V")
    public abstract void method2481(class115 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([Lba;Lq;[Lot;I)V")
    public abstract void method418(class358[] arg0, class397 arg1, class552[] arg2, int arg3);

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "()Z")
    public abstract boolean method396();

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lpf;IIII)Lba;")
    public abstract class358 method443(class545 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lxa;Z)V")
    public abstract void method80(class468 arg0, boolean arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class139 method402(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method447(Canvas arg0);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIIIIIIII)V")
    public abstract void method2489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method370(Canvas arg0);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
