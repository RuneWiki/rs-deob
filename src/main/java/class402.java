import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class402 {

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public int field5569 = 0;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field5553 = 0;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public int field5562 = 0;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "B")
    public byte field5565 = 0;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public int field5555 = 0;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "[S")
    public short[] field5554;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "[I")
    public int[] field5580;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[I")
    public int[] field5546;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "[B")
    public byte[] field5588;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "[B")
    public byte[] field5583;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[I")
    public int[] field5550;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "[S")
    public short[] field5589;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "[I")
    public int[] field5590;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "[B")
    public byte[] field5577;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "[B")
    public byte[] field5551;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[S")
    public short[] field5544;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "[S")
    public short[] field5584;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "[S")
    public short[] field5559;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[B")
    public byte[] field5552;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[S")
    public short[] field5561;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "[S")
    public short[] field5572;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "[B")
    public byte[] field5573;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "[B")
    public byte[] field5576;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "[B")
    public byte[] field5558;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "[S")
    public short[] field5585;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "[S")
    public short[] field5574;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[B")
    public byte[] field5539;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "[B")
    public byte[] field5579;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "[S")
    public short[] field5557;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "[S")
    public short[] field5568;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "[I")
    public int[] field5581;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[S")
    public short[] field5542;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[Lkh;")
    public class345[] field5545;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "[Lun;")
    public class103[] field5570;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[S")
    public short[] field5547;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "[[I")
    public static int[][] field5587 = new int[128][128];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lwo;")
    public static class285 field5560;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(SSI)V")
    public final void method2500(short arg0, short arg1, int arg2) {
        int var4 = 40 / ((arg2 + 15) / 42);
        for (int var5 = 0; var5 < this.field5553; var5++) {
            if (this.field5589[var5] == arg0) {
                this.field5589[var5] = arg1;
            }
        }
        field5586++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
    public final void method2501(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            int var5 = class363.field4927[arg1];
            int var6 = class363.field4917[arg1];
            for (int var7 = 0; var7 < this.field5562; var7++) {
                int var8 = this.field5580[var7] * var6 + this.field5550[var7] * var5 >> 15;
                this.field5550[var7] = this.field5550[var7] * var6 - (this.field5580[var7] * var5) >> 15;
                this.field5580[var7] = var8;
            }
        }
        field5538++;
        if (arg3 != 20863) {
            method2510((String) null, (Throwable) null, -10);
        }
        if (arg2 != 0) {
            int var9 = class363.field4927[arg2];
            int var10 = class363.field4917[arg2];
            for (int var11 = 0; var11 < this.field5562; var11++) {
                int var12 = this.field5550[var11] * var10 - this.field5581[var11] * var9 >> 15;
                this.field5581[var11] = this.field5581[var11] * var10 + this.field5550[var11] * var9 >> 15;
                this.field5550[var11] = var12;
            }
        }
        if (arg0 == 0) {
            return;
        }
        int var13 = class363.field4927[arg0];
        int var14 = class363.field4917[arg0];
        for (int var15 = 0; var15 < this.field5562; var15++) {
            int var16 = this.field5581[var15] * var13 + (this.field5580[var15] * var14) >> 15;
            this.field5581[var15] = this.field5581[var15] * var14 - (this.field5580[var15] * var13) >> 15;
            this.field5580[var15] = var16;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BB)V")
    private final void method2502(byte[] arg0, byte arg1) {
        field5556++;
        boolean var3 = false;
        boolean var4 = false;
        class242 var5 = new class242(arg0);
        class242 var6 = new class242(arg0);
        class242 var7 = new class242(arg0);
        class242 var8 = new class242(arg0);
        class242 var9 = new class242(arg0);
        var5.field3211 = arg0.length - 18;
        this.field5562 = var5.method1587((byte) -102);
        this.field5553 = var5.method1587((byte) -102);
        this.field5569 = var5.method1563(-128);
        int var10 = var5.method1563(-128);
        int var11 = var5.method1563(-128);
        int var12 = var5.method1563(-128);
        int var13 = var5.method1563(-128);
        int var14 = var5.method1563(-128);
        int var15 = var5.method1587((byte) -102);
        int var16 = var5.method1587((byte) -102);
        int var17 = var5.method1587((byte) -102);
        int var18 = var5.method1587((byte) -102);
        byte var19 = 0;
        int var21 = this.field5562 + var19;
        int var23 = this.field5553 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field5553;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field5553;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field5553;
        }
        int var27 = var23;
        if (var14 == 1) {
            var23 += this.field5562;
        }
        int var28 = var23;
        if (var12 == 1) {
            var23 += this.field5553;
        }
        int var30 = var18 + var23;
        int var32 = this.field5553 * 2 + var30;
        int var34 = this.field5569 * 6 + var32;
        int var36 = var15 + var34;
        int var38 = var16 + var36;
        if (var12 == 1) {
            this.field5577 = new byte[this.field5553];
        }
        int var40 = 47 % ((-arg1 - 55) / 60);
        this.field5544 = new short[this.field5553];
        if (var11 == 255) {
            this.field5551 = new byte[this.field5553];
        } else {
            this.field5565 = (byte) var11;
        }
        this.field5580 = new int[this.field5562];
        var5.field3211 = var19;
        if (this.field5569 > 0) {
            this.field5552 = new byte[this.field5569];
            this.field5584 = new short[this.field5569];
            this.field5574 = new short[this.field5569];
            this.field5572 = new short[this.field5569];
        }
        if (var10 == 1) {
            this.field5554 = new short[this.field5553];
            this.field5588 = new byte[this.field5553];
            this.field5583 = new byte[this.field5553];
        }
        this.field5581 = new int[this.field5562];
        if (var13 == 1) {
            this.field5590 = new int[this.field5553];
        }
        int var10000 = var17 + var38;
        if (var14 == 1) {
            this.field5546 = new int[this.field5562];
        }
        this.field5550 = new int[this.field5562];
        this.field5589 = new short[this.field5553];
        this.field5568 = new short[this.field5553];
        this.field5557 = new short[this.field5553];
        var6.field3211 = var34;
        var7.field3211 = var36;
        var8.field3211 = var38;
        var9.field3211 = var27;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        for (int var45 = 0; var45 < this.field5562; var45++) {
            int var61 = var5.method1563(-128);
            int var62 = 0;
            if ((var61 & 0x1) != 0) {
                var62 = var6.method1553(false);
            }
            int var63 = 0;
            if ((var61 & 0x2) != 0) {
                var63 = var7.method1553(false);
            }
            int var64 = 0;
            if ((var61 & 0x4) != 0) {
                var64 = var8.method1553(false);
            }
            this.field5580[var45] = var42 + var62;
            this.field5550[var45] = var43 + var63;
            this.field5581[var45] = var44 + var64;
            var42 = this.field5580[var45];
            var43 = this.field5550[var45];
            var44 = this.field5581[var45];
            if (var14 == 1) {
                this.field5546[var45] = var9.method1563(-128);
            }
        }
        var5.field3211 = var30;
        var6.field3211 = var26;
        var7.field3211 = var24;
        var8.field3211 = var28;
        var9.field3211 = var25;
        for (int var46 = 0; var46 < this.field5553; var46++) {
            this.field5589[var46] = (short) var5.method1587((byte) -102);
            if (var10 == 1) {
                int var60 = var6.method1563(-128);
                if ((var60 & 0x1) == 1) {
                    var3 = true;
                    this.field5583[var46] = 1;
                } else {
                    this.field5583[var46] = 0;
                }
                if ((var60 & 0x2) == 2) {
                    this.field5588[var46] = (byte) (var60 >> 2);
                    this.field5554[var46] = this.field5589[var46];
                    this.field5589[var46] = 127;
                    if (this.field5554[var46] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field5588[var46] = -1;
                    this.field5554[var46] = -1;
                }
            }
            if (var11 == 255) {
                this.field5551[var46] = var7.method1589(false);
            }
            if (var12 == 1) {
                this.field5577[var46] = var8.method1589(false);
            }
            if (var13 == 1) {
                this.field5590[var46] = var9.method1563(-128);
            }
        }
        this.field5555 = -1;
        var5.field3211 = var23;
        var6.field3211 = var21;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        short var50 = 0;
        for (int var51 = 0; var51 < this.field5553; var51++) {
            int var56 = var6.method1563(-128);
            if (var56 == 1) {
                var47 = (short) (var50 + var5.method1553(false));
                var48 = (short) (var47 + var5.method1553(false));
                var49 = (short) (var48 + var5.method1553(false));
                var50 = var49;
                this.field5544[var51] = var47;
                this.field5568[var51] = var48;
                this.field5557[var51] = var49;
                if (var47 > this.field5555) {
                    this.field5555 = var47;
                }
                if (var48 > this.field5555) {
                    this.field5555 = var48;
                }
                if (var49 > this.field5555) {
                    this.field5555 = var49;
                }
            }
            if (var56 == 2) {
                var48 = var49;
                var49 = (short) (var5.method1553(false) + var50);
                this.field5544[var51] = var47;
                var50 = var49;
                this.field5568[var51] = var48;
                this.field5557[var51] = var49;
                if (this.field5555 < var49) {
                    this.field5555 = var49;
                }
            }
            if (var56 == 3) {
                var47 = var49;
                var49 = (short) (var50 + var5.method1553(false));
                var50 = var49;
                this.field5544[var51] = var47;
                this.field5568[var51] = var48;
                this.field5557[var51] = var49;
                if (var49 > this.field5555) {
                    this.field5555 = var49;
                }
            }
            if (var56 == 4) {
                short var59 = var47;
                var47 = var48;
                var49 = (short) (var50 + var5.method1553(false));
                var48 = var59;
                this.field5544[var51] = var47;
                var50 = var49;
                this.field5568[var51] = var59;
                this.field5557[var51] = var49;
                if (var49 > this.field5555) {
                    this.field5555 = var49;
                }
            }
        }
        this.field5555++;
        var5.field3211 = var32;
        for (int var52 = 0; var52 < this.field5569; var52++) {
            this.field5552[var52] = 0;
            this.field5574[var52] = (short) var5.method1587((byte) -102);
            this.field5584[var52] = (short) var5.method1587((byte) -102);
            this.field5572[var52] = (short) var5.method1587((byte) -102);
        }
        if (this.field5588 != null) {
            boolean var53 = false;
            for (int var54 = 0; var54 < this.field5553; var54++) {
                int var55 = this.field5588[var54] & 0xFF;
                if (var55 != 255) {
                    if ((this.field5574[var55] & 0xFFFF) == this.field5544[var54] && (this.field5584[var55] & 0xFFFF) == this.field5568[var54] && (this.field5572[var55] & 0xFFFF) == this.field5557[var54]) {
                        this.field5588[var54] = -1;
                    } else {
                        var53 = true;
                    }
                }
            }
            if (!var53) {
                this.field5588 = null;
            }
        }
        if (!var4) {
            this.field5554 = null;
        }
        if (!var3) {
            this.field5583 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BSBSSSSBSB)B")
    public final byte method2503(byte arg0, short arg1, byte arg2, short arg3, short arg4, short arg5, short arg6, byte arg7, short arg8, byte arg9) {
        if (arg2 != -119) {
            this.field5588 = null;
        }
        field5575++;
        if (this.field5569 >= 255) {
            throw new IllegalStateException();
        }
        this.field5552[this.field5569] = 3;
        this.field5574[this.field5569] = arg3;
        this.field5584[this.field5569] = arg6;
        this.field5572[this.field5569] = arg5;
        this.field5585[this.field5569] = arg4;
        this.field5559[this.field5569] = arg8;
        this.field5561[this.field5569] = arg1;
        this.field5576[this.field5569] = arg9;
        this.field5558[this.field5569] = arg7;
        this.field5539[this.field5569] = arg0;
        return (byte) (this.field5569++);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z[B)V")
    private final void method2504(boolean arg0, byte[] arg1) {
        field5578++;
        class242 var3 = new class242(arg1);
        class242 var4 = new class242(arg1);
        class242 var5 = new class242(arg1);
        class242 var6 = new class242(arg1);
        class242 var7 = new class242(arg1);
        class242 var8 = new class242(arg1);
        class242 var9 = new class242(arg1);
        var3.field3211 = arg1.length - 23;
        this.field5562 = var3.method1587((byte) -102);
        this.field5553 = var3.method1587((byte) -102);
        this.field5569 = var3.method1563(-128);
        int var10 = var3.method1563(-128);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        int var13 = var3.method1563(-128);
        int var14 = var3.method1563(-128);
        int var15 = var3.method1563(-128);
        int var16 = var3.method1563(-128);
        int var17 = var3.method1563(-128);
        int var18 = var3.method1587((byte) -102);
        int var19 = var3.method1587((byte) -102);
        int var20 = var3.method1587((byte) -102);
        int var21 = var3.method1587((byte) -102);
        int var22 = var3.method1587((byte) -102);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (this.field5569 > 0) {
            this.field5552 = new byte[this.field5569];
            var3.field3211 = 0;
            for (int var26 = 0; var26 < this.field5569; var26++) {
                byte var27 = this.field5552[var26] = var3.method1589(false);
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 0) {
                    var23++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var28 = this.field5569;
        int var30 = this.field5562 + var28;
        int var31 = var30;
        if (var11) {
            var30 += this.field5553;
        }
        int var33 = this.field5553 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += this.field5553;
        }
        if (!arg0) {
            this.method2508((short) 94, (byte) 92, (short) 60);
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += this.field5553;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += this.field5562;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += this.field5553;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += this.field5553 * 2;
        }
        int var42 = var22 + var39;
        int var44 = this.field5553 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var24 + (var25 * 2) + var60;
        this.field5550 = new int[this.field5562];
        this.field5544 = new short[this.field5553];
        this.field5589 = new short[this.field5553];
        if (var17 == 1) {
            this.field5546 = new int[this.field5562];
        }
        if (var13 == 255) {
            this.field5551 = new byte[this.field5553];
        } else {
            this.field5565 = (byte) var13;
        }
        this.field5580 = new int[this.field5562];
        if (var14 == 1) {
            this.field5577 = new byte[this.field5553];
        }
        if (var16 == 1 && this.field5569 > 0) {
            this.field5588 = new byte[this.field5553];
        }
        if (var16 == 1) {
            this.field5554 = new short[this.field5553];
        }
        this.field5568 = new short[this.field5553];
        var3.field3211 = var28;
        this.field5581 = new int[this.field5562];
        if (var15 == 1) {
            this.field5590 = new int[this.field5553];
        }
        if (var11) {
            this.field5583 = new byte[this.field5553];
        }
        this.field5557 = new short[this.field5553];
        if (this.field5569 > 0) {
            if (var24 > 0) {
                this.field5558 = new byte[var24];
                this.field5576 = new byte[var24];
                this.field5561 = new short[var24];
                this.field5585 = new short[var24];
                this.field5539 = new byte[var24];
                this.field5559 = new short[var24];
            }
            this.field5572 = new short[this.field5569];
            if (var25 > 0) {
                this.field5579 = new byte[var25];
                this.field5573 = new byte[var25];
            }
            this.field5584 = new short[this.field5569];
            this.field5574 = new short[this.field5569];
        }
        var4.field3211 = var44;
        var5.field3211 = var46;
        var6.field3211 = var48;
        var7.field3211 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < this.field5562; var67++) {
            int var87 = var3.method1563(-128);
            int var88 = 0;
            if ((var87 & 0x1) != 0) {
                var88 = var4.method1553(!arg0);
            }
            int var89 = 0;
            if ((var87 & 0x2) != 0) {
                var89 = var5.method1553(!arg0);
            }
            int var90 = 0;
            if ((var87 & 0x4) != 0) {
                var90 = var6.method1553(!arg0);
            }
            this.field5580[var67] = var64 + var88;
            this.field5550[var67] = var65 + var89;
            this.field5581[var67] = var66 + var90;
            var66 = this.field5581[var67];
            var64 = this.field5580[var67];
            var65 = this.field5550[var67];
            if (var17 == 1) {
                this.field5546[var67] = var7.method1563(-128);
            }
        }
        var3.field3211 = var42;
        var4.field3211 = var31;
        var5.field3211 = var34;
        var6.field3211 = var37;
        var7.field3211 = var35;
        var8.field3211 = var40;
        var9.field3211 = var39;
        for (int var68 = 0; var68 < this.field5553; var68++) {
            this.field5589[var68] = (short) var3.method1587((byte) -102);
            if (var11) {
                this.field5583[var68] = var4.method1589(false);
            }
            if (var13 == 255) {
                this.field5551[var68] = var5.method1589(false);
            }
            if (var14 == 1) {
                this.field5577[var68] = var6.method1589(false);
            }
            if (var15 == 1) {
                this.field5590[var68] = var7.method1563(-128);
            }
            if (var16 == 1) {
                this.field5554[var68] = (short) (var8.method1587((byte) -102) - 1);
            }
            if (this.field5588 != null) {
                if (this.field5554[var68] == -1) {
                    this.field5588[var68] = -1;
                } else {
                    this.field5588[var68] = (byte) (var9.method1563(-128) - 1);
                }
            }
        }
        var3.field3211 = var33;
        this.field5555 = -1;
        var4.field3211 = var30;
        short var69 = 0;
        short var70 = 0;
        short var71 = 0;
        short var72 = 0;
        for (int var73 = 0; var73 < this.field5553; var73++) {
            int var83 = var4.method1563(-128);
            if (var83 == 1) {
                var69 = (short) (var72 + var3.method1553(false));
                var70 = (short) (var3.method1553(false) + var69);
                var71 = (short) (var3.method1553(false) + var70);
                var72 = var71;
                this.field5544[var73] = var69;
                this.field5568[var73] = var70;
                this.field5557[var73] = var71;
                if (var69 > this.field5555) {
                    this.field5555 = var69;
                }
                if (this.field5555 < var70) {
                    this.field5555 = var70;
                }
                if (this.field5555 < var71) {
                    this.field5555 = var71;
                }
            }
            if (var83 == 2) {
                var70 = var71;
                var71 = (short) (var72 + var3.method1553(false));
                var72 = var71;
                this.field5544[var73] = var69;
                this.field5568[var73] = var70;
                this.field5557[var73] = var71;
                if (var71 > this.field5555) {
                    this.field5555 = var71;
                }
            }
            if (var83 == 3) {
                var69 = var71;
                var71 = (short) (var72 + var3.method1553(!arg0));
                this.field5544[var73] = var69;
                var72 = var71;
                this.field5568[var73] = var70;
                this.field5557[var73] = var71;
                if (this.field5555 < var71) {
                    this.field5555 = var71;
                }
            }
            if (var83 == 4) {
                short var86 = var69;
                var69 = var70;
                var70 = var86;
                var71 = (short) (var3.method1553(false) + var72);
                var72 = var71;
                this.field5544[var73] = var69;
                this.field5568[var73] = var86;
                this.field5557[var73] = var71;
                if (this.field5555 < var71) {
                    this.field5555 = var71;
                }
            }
        }
        this.field5555++;
        var3.field3211 = var50;
        var4.field3211 = var52;
        var5.field3211 = var54;
        var6.field3211 = var56;
        var7.field3211 = var58;
        var8.field3211 = var60;
        for (int var74 = 0; var74 < this.field5569; var74++) {
            int var82 = this.field5552[var74] & 0xFF;
            if (var82 == 0) {
                this.field5574[var74] = (short) var3.method1587((byte) -102);
                this.field5584[var74] = (short) var3.method1587((byte) -102);
                this.field5572[var74] = (short) var3.method1587((byte) -102);
            }
            if (var82 == 1) {
                this.field5574[var74] = (short) var4.method1587((byte) -102);
                this.field5584[var74] = (short) var4.method1587((byte) -102);
                this.field5572[var74] = (short) var4.method1587((byte) -102);
                this.field5585[var74] = (short) var5.method1587((byte) -102);
                this.field5559[var74] = (short) var5.method1587((byte) -102);
                this.field5561[var74] = (short) var5.method1587((byte) -102);
                this.field5576[var74] = var6.method1589(false);
                this.field5558[var74] = var7.method1589(false);
                this.field5539[var74] = var8.method1589(false);
            }
            if (var82 == 2) {
                this.field5574[var74] = (short) var4.method1587((byte) -102);
                this.field5584[var74] = (short) var4.method1587((byte) -102);
                this.field5572[var74] = (short) var4.method1587((byte) -102);
                this.field5585[var74] = (short) var5.method1587((byte) -102);
                this.field5559[var74] = (short) var5.method1587((byte) -102);
                this.field5561[var74] = (short) var5.method1587((byte) -102);
                this.field5576[var74] = var6.method1589(!arg0);
                this.field5558[var74] = var7.method1589(false);
                this.field5539[var74] = var8.method1589(false);
                this.field5573[var74] = var8.method1589(false);
                this.field5579[var74] = var8.method1589(false);
            }
            if (var82 == 3) {
                this.field5574[var74] = (short) var4.method1587((byte) -102);
                this.field5584[var74] = (short) var4.method1587((byte) -102);
                this.field5572[var74] = (short) var4.method1587((byte) -102);
                this.field5585[var74] = (short) var5.method1587((byte) -102);
                this.field5559[var74] = (short) var5.method1587((byte) -102);
                this.field5561[var74] = (short) var5.method1587((byte) -102);
                this.field5576[var74] = var6.method1589(false);
                this.field5558[var74] = var7.method1589(false);
                this.field5539[var74] = var8.method1589(false);
            }
        }
        if (!var12) {
            return;
        }
        var3.field3211 = var62;
        int var75 = var3.method1563(-128);
        if (var75 > 0) {
            this.field5570 = new class103[var75];
            for (int var76 = 0; var76 < var75; var76++) {
                int var77 = var3.method1587((byte) -102);
                int var78 = var3.method1587((byte) -102);
                byte var79;
                if (var13 == 255) {
                    var79 = this.field5551[var78];
                } else {
                    var79 = (byte) var13;
                }
                this.field5570[var76] = new class103(var77, this.field5544[var78], this.field5568[var78], this.field5557[var78], var79);
            }
        }
        int var80 = var3.method1563(-128);
        if (var80 <= 0) {
            return;
        }
        this.field5545 = new class345[var80];
        for (int var81 = 0; var81 < var80; var81++) {
            this.field5545[var81] = new class345(var3.method1587((byte) -102), var3.method1587((byte) -102));
        }
        return;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)[[I")
    public final int[][] method2505(int arg0) {
        field5548++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5553; var4++) {
            int var9 = this.field5590[var4];
            if (var9 >= 0) {
                if (var9 > var3) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = arg0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field5553; var7++) {
            int var8 = this.field5590[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILhf;SB)I")
    private final int method2506(int arg0, class402 arg1, short arg2, byte arg3) {
        field5564++;
        int var5 = arg1.field5580[arg0];
        int var6 = arg1.field5550[arg0];
        int var7 = arg1.field5581[arg0];
        if (arg3 > -51) {
            return -119;
        }
        for (int var8 = 0; var8 < this.field5562; var8++) {
            if (this.field5580[var8] == var5 && this.field5550[var8] == var6 && this.field5581[var8] == var7) {
                this.field5542[var8] = (short) class213.method1307(this.field5542[var8], arg2);
                return var8;
            }
        }
        this.field5580[this.field5562] = var5;
        this.field5550[this.field5562] = var6;
        this.field5581[this.field5562] = var7;
        this.field5542[this.field5562] = arg2;
        this.field5546[this.field5562] = arg1.field5546 == null ? -1 : arg1.field5546[arg0];
        return this.field5562++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([I[ILpi;Z[I)V")
    public static final void method2507(int[] arg0, int[] arg1, class298 arg2, boolean arg3, int[] arg4) {
        field5549++;
        if (arg3) {
            method2509(103);
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field2435.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field2435[var9] = null;
                    } else {
                        class156 var10 = class430.method2621((byte) -107, var6);
                        int var11 = var10.field1804;
                        class265 var12 = arg2.field2435[var9];
                        if (var12 != null) {
                            if (var12.field3407 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field2435[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3411 = 0;
                                    var12.field3412 = 0;
                                    var12.field3409 = 1;
                                    var12.field3415 = var8;
                                    var12.field3413 = 0;
                                    class325.method2038(arg2.field1516, arg2.field1514, false, var10, 0, (byte) -100);
                                } else if (var11 == 2) {
                                    var12.field3413 = 0;
                                }
                            } else if (var10.field1827 >= class430.method2621((byte) -87, var12.field3407).field1827) {
                                var12 = arg2.field2435[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class265 var13 = arg2.field2435[var9] = new class265();
                            var13.field3412 = 0;
                            var13.field3415 = var8;
                            var13.field3413 = 0;
                            var13.field3409 = 1;
                            var13.field3407 = var6;
                            var13.field3411 = 0;
                            class325.method2038(arg2.field1516, arg2.field1514, false, var10, 0, (byte) -100);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(SBS)V")
    public final void method2508(short arg0, byte arg1, short arg2) {
        field5567++;
        if (this.field5554 == null) {
            return;
        }
        int var4 = 111 % ((arg1 - 70) / 43);
        for (int var5 = 0; var5 < this.field5553; var5++) {
            if (this.field5554[var5] == arg0) {
                this.field5554[var5] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method2509(int arg0) {
        if (arg0 == -6740) {
            field5587 = null;
            field5560 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method2510(String arg0, Throwable arg1, int arg2) {
        field5540++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class284.method1787(arg1, false);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class184.method1143(var3, -27893);
            if (arg2 != -29832) {
                field5587 = null;
            }
            String var4 = class134.method875(var3, "%3a", false, ":");
            String var5 = class134.method875(var4, "%40", false, "@");
            String var6 = class134.method875(var5, "%26", false, "&");
            String var7 = class134.method875(var6, "%23", false, "#");
            if (class431.field5880.field6077 != null) {
                class315 var8 = class431.field5880.method2719((byte) -53, new URL(class431.field5880.field6077.getCodeBase(), "clienterror.ws?c=" + class52.field613 + "&u=" + class278.field3606 + "&v1=" + class441.field6076 + "&v2=" + class441.field6078 + "&e=" + var7));
                while (var8.field4244 == 0) {
                    class219.method1330(1L, true);
                }
                if (var8.field4244 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4243;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[[I")
    public final int[][] method2511(boolean arg0) {
        field5563++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5555; var4++) {
            int var9 = this.field5546[var4];
            if (var9 >= 0) {
                if (var9 > var3) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        if (arg0) {
            this.method2500((short) -52, (short) 51, 19);
        }
        for (int var7 = 0; var7 < this.field5555; var7++) {
            int var8 = this.field5546[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBILpi;)V")
    public static final void method2512(int arg0, byte arg1, int arg2, class298 arg3) {
        field5571++;
        if (arg1 != -118) {
            field5560 = null;
        }
        if (arg3.field2400 == arg0 && arg0 != -1) {
            class156 var4 = class430.method2621((byte) -95, arg0);
            int var5 = var4.field1804;
            if (var5 == 1) {
                arg3.field2441 = 0;
                arg3.field2398 = 0;
                arg3.field2411 = 0;
                arg3.field2429 = 1;
                arg3.field2432 = arg2;
                class325.method2038(arg3.field1516, arg3.field1514, false, var4, arg3.field2441, (byte) -100);
            }
            if (var5 == 2) {
                arg3.field2398 = 0;
                return;
            }
        } else if (arg0 == -1 || arg3.field2400 == -1 || class430.method2621((byte) -117, arg0).field1827 >= class430.method2621((byte) -102, arg3.field2400).field1827) {
            arg3.field2441 = 0;
            arg3.field2398 = 0;
            arg3.field2400 = arg0;
            arg3.field2429 = 1;
            arg3.field2411 = 0;
            arg3.field2432 = arg2;
            arg3.field2491 = arg3.field2486;
            if (arg3.field2400 == -1) {
                return;
            }
            class325.method2038(arg3.field1516, arg3.field1514, false, class430.method2621((byte) -29, arg3.field2400), arg3.field2441, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BBIIBSISI)I")
    public final int method2513(byte arg0, byte arg1, int arg2, int arg3, byte arg4, short arg5, int arg6, short arg7, int arg8) {
        this.field5544[this.field5553] = (short) arg3;
        if (arg2 < 56) {
            this.field5550 = null;
        }
        field5582++;
        this.field5568[this.field5553] = (short) arg8;
        this.field5557[this.field5553] = (short) arg6;
        this.field5583[this.field5553] = arg1;
        this.field5588[this.field5553] = arg4;
        this.field5589[this.field5553] = arg7;
        this.field5577[this.field5553] = arg0;
        this.field5554[this.field5553] = arg5;
        return this.field5553++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
    public static final void method2514(boolean arg0, int arg1) {
        if (arg0) {
            method2509(-111);
        }
        if (class212.field2593 == null || arg1 > class212.field2593.length) {
            class212.field2593 = new int[arg1];
        }
        field5541++;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)I")
    public final int method2515(int arg0, int arg1, int arg2, int arg3) {
        field5543++;
        for (int var5 = 0; var5 < this.field5562; var5++) {
            if (this.field5580[var5] == arg1 && this.field5550[var5] == arg3 && this.field5581[var5] == arg0) {
                return var5;
            }
        }
        int var6 = -63 % ((arg2 - 31) / 40);
        this.field5580[this.field5562] = arg1;
        this.field5550[this.field5562] = arg3;
        this.field5581[this.field5562] = arg0;
        this.field5555 = this.field5562 + 1;
        return this.field5562++;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIII)V")
    public final void method2516(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg0; var5 < this.field5562; var5++) {
            this.field5580[var5] += arg1;
            this.field5550[var5] += arg2;
            this.field5581[var5] += arg3;
        }
        field5566++;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([B)V")
    public class402(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2504(true, arg0);
        } else {
            this.method2502(arg0, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(III)V")
    public class402(int arg0, int arg1, int arg2) {
        this.field5554 = new short[arg1];
        this.field5580 = new int[arg0];
        this.field5546 = new int[arg0];
        this.field5588 = new byte[arg1];
        this.field5583 = new byte[arg1];
        this.field5550 = new int[arg0];
        this.field5589 = new short[arg1];
        this.field5590 = new int[arg1];
        this.field5577 = new byte[arg1];
        this.field5551 = new byte[arg1];
        this.field5544 = new short[arg1];
        if (arg2 > 0) {
            this.field5584 = new short[arg2];
            this.field5559 = new short[arg2];
            this.field5552 = new byte[arg2];
            this.field5561 = new short[arg2];
            this.field5572 = new short[arg2];
            this.field5573 = new byte[arg2];
            this.field5576 = new byte[arg2];
            this.field5558 = new byte[arg2];
            this.field5585 = new short[arg2];
            this.field5574 = new short[arg2];
            this.field5539 = new byte[arg2];
            this.field5579 = new byte[arg2];
        }
        this.field5557 = new short[arg1];
        this.field5568 = new short[arg1];
        this.field5581 = new int[arg0];
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([Lhf;I)V")
    public class402(class402[] arg0, int arg1) {
        this.field5569 = 0;
        this.field5553 = 0;
        this.field5562 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field5565 = -1;
        boolean var10 = false;
        for (int var11 = 0; var11 < arg1; var11++) {
            class402 var31 = arg0[var11];
            if (var31 != null) {
                this.field5553 += var31.field5553;
                this.field5562 += var31.field5562;
                this.field5569 += var31.field5569;
                var5 |= var31.field5583 != null;
                if (var31.field5545 != null) {
                    var4 += var31.field5545.length;
                }
                if (var31.field5570 != null) {
                    var3 += var31.field5570.length;
                }
                var7 |= var31.field5577 != null;
                var10 |= var31.field5590 != null;
                if (var31.field5551 == null) {
                    if (this.field5565 == -1) {
                        this.field5565 = var31.field5565;
                    }
                    if (this.field5565 != var31.field5565) {
                        var6 = true;
                    }
                } else {
                    var6 = true;
                }
                var8 |= var31.field5588 != null;
                var9 |= var31.field5554 != null;
            }
        }
        this.field5544 = new short[this.field5553];
        if (var6) {
            this.field5551 = new byte[this.field5553];
        }
        if (var9) {
            this.field5554 = new short[this.field5553];
        }
        this.field5580 = new int[this.field5562];
        this.field5542 = new short[this.field5562];
        if (var10) {
            this.field5590 = new int[this.field5553];
        }
        if (var4 > 0) {
            this.field5545 = new class345[var4];
        }
        if (var3 > 0) {
            this.field5570 = new class103[var3];
        }
        if (var7) {
            this.field5577 = new byte[this.field5553];
        }
        this.field5550 = new int[this.field5562];
        this.field5581 = new int[this.field5562];
        if (var5) {
            this.field5583 = new byte[this.field5553];
        }
        if (var8) {
            this.field5588 = new byte[this.field5553];
        }
        this.field5589 = new short[this.field5553];
        this.field5557 = new short[this.field5553];
        this.field5547 = new short[this.field5553];
        this.field5546 = new int[this.field5562];
        this.field5568 = new short[this.field5553];
        if (this.field5569 > 0) {
            this.field5558 = new byte[this.field5569];
            this.field5539 = new byte[this.field5569];
            this.field5579 = new byte[this.field5569];
            this.field5552 = new byte[this.field5569];
            this.field5584 = new short[this.field5569];
            this.field5561 = new short[this.field5569];
            this.field5572 = new short[this.field5569];
            this.field5576 = new byte[this.field5569];
            this.field5585 = new short[this.field5569];
            this.field5559 = new short[this.field5569];
            this.field5574 = new short[this.field5569];
            this.field5573 = new byte[this.field5569];
        }
        this.field5569 = 0;
        int var12 = 0;
        this.field5553 = 0;
        this.field5562 = 0;
        int var13 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class402 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field5553; var24++) {
                    if (var5 && var23.field5583 != null) {
                        this.field5583[this.field5553] = var23.field5583[var24];
                    }
                    if (var6) {
                        if (var23.field5551 == null) {
                            this.field5551[this.field5553] = var23.field5565;
                        } else {
                            this.field5551[this.field5553] = var23.field5551[var24];
                        }
                    }
                    if (var7 && var23.field5577 != null) {
                        this.field5577[this.field5553] = var23.field5577[var24];
                    }
                    if (var9) {
                        if (var23.field5554 == null) {
                            this.field5554[this.field5553] = -1;
                        } else {
                            this.field5554[this.field5553] = var23.field5554[var24];
                        }
                    }
                    if (var10) {
                        if (var23.field5590 == null) {
                            this.field5590[this.field5553] = -1;
                        } else {
                            this.field5590[this.field5553] = var23.field5590[var24];
                        }
                    }
                    this.field5544[this.field5553] = (short) this.method2506(var23.field5544[var24], var23, var22, (byte) -68);
                    this.field5568[this.field5553] = (short) this.method2506(var23.field5568[var24], var23, var22, (byte) -114);
                    this.field5557[this.field5553] = (short) this.method2506(var23.field5557[var24], var23, var22, (byte) -100);
                    this.field5547[this.field5553] = var22;
                    this.field5589[this.field5553] = var23.field5589[var24];
                    this.field5553++;
                }
                if (var23.field5570 != null) {
                    for (int var25 = 0; var25 < var23.field5570.length; var25++) {
                        int var26 = this.method2506(var23.field5570[var25].field1199, var23, var22, (byte) -83);
                        int var27 = this.method2506(var23.field5570[var25].field1197, var23, var22, (byte) -84);
                        int var28 = this.method2506(var23.field5570[var25].field1202, var23, var22, (byte) -112);
                        this.field5570[var13] = new class103(var23.field5570[var25].field1206, var26, var27, var28, var23.field5570[var25].field1201);
                        var13++;
                    }
                }
                if (var23.field5545 != null) {
                    for (int var29 = 0; var29 < var23.field5545.length; var29++) {
                        int var30 = this.method2506(var23.field5545[var29].field4683, var23, var22, (byte) -102);
                        this.field5545[var12] = new class345(var23.field5545[var29].field4692, var30);
                        var12++;
                    }
                }
            }
        }
        int var15 = 0;
        this.field5555 = this.field5562;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var17 = (short) (0x1 << var16);
            class402 var18 = arg0[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < var18.field5553; var19++) {
                    if (var8) {
                        this.field5588[var15++] = (byte) (var18.field5588 == null || var18.field5588[var19] == -1 ? -1 : var18.field5588[var19] + this.field5569);
                    }
                }
                for (int var20 = 0; var20 < var18.field5569; var20++) {
                    byte var21 = this.field5552[this.field5569] = var18.field5552[var20];
                    if (var21 == 0) {
                        this.field5574[this.field5569] = (short) this.method2506(var18.field5574[var20], var18, var17, (byte) -75);
                        this.field5584[this.field5569] = (short) this.method2506(var18.field5584[var20], var18, var17, (byte) -115);
                        this.field5572[this.field5569] = (short) this.method2506(var18.field5572[var20], var18, var17, (byte) -64);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field5574[this.field5569] = var18.field5574[var20];
                        this.field5584[this.field5569] = var18.field5584[var20];
                        this.field5572[this.field5569] = var18.field5572[var20];
                        this.field5585[this.field5569] = var18.field5585[var20];
                        this.field5559[this.field5569] = var18.field5559[var20];
                        this.field5561[this.field5569] = var18.field5561[var20];
                        this.field5576[this.field5569] = var18.field5576[var20];
                        this.field5558[this.field5569] = var18.field5558[var20];
                        this.field5539[this.field5569] = var18.field5539[var20];
                    }
                    if (var21 == 2) {
                        this.field5573[this.field5569] = var18.field5573[var20];
                        this.field5579[this.field5569] = var18.field5579[var20];
                    }
                    this.field5569++;
                }
            }
        }
    }
}
