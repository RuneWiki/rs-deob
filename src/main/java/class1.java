import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class273 {

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
    public boolean field1 = true;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    private int field15 = 0;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "Z")
    public boolean field29 = false;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "Lnc;")
    public final class125 field16;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "Lkf;")
    public final class195 field25;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "Lel;")
    public class101 field26;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "J")
    private long field27;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "Lqh;")
    public final class263 field18;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Llc;")
    public static class143 field3 = class66.method374(")1 ", -1);

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "[I")
    public static int[] field28 = new int[4096];

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field24 = -1;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Llc;")
    public static class143 field10 = class66.method374("<col=ffff00>", -1);

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lng;")
    public static class139 field13 = new class139(64);

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    private int field14;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BII)I")
    public static final int method1(byte arg0, int arg1, int arg2) {
        if (arg0 > -11) {
            field10 = null;
        }
        field31++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field33 = arg6;
        this.field22 = arg3;
        this.field17 = arg8;
        this.field30 = arg2;
        field19++;
        this.field12 = arg7;
        this.field34 = arg9;
        this.field36 = arg4;
        this.field8 = arg5;
        int var11 = (this.field36 + this.field22 + this.field12) / 3 + this.field16.field2218;
        this.field11 = arg0;
        int var12 = (this.field8 + this.field34 + this.field33) / 3 + this.field16.field2214;
        int var13 = (this.field11 + this.field17 + this.field30) / 3 + this.field16.field2215;
        if (this.field23 != var11 || this.field37 != var12 || this.field2 != var13) {
            this.field23 = var11;
            this.field37 = var12;
            this.field1 = true;
            this.field2 = var13;
        }
        if (arg1 >= -82) {
            this.method2(-58, -47, -11, 53, 100, -32, 23, 40, -25, -67);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public static void method3(int arg0) {
        field3 = null;
        field10 = null;
        field28 = null;
        field13 = null;
        if (arg0 != 614264688) {
            method1((byte) 90, 118, 88);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BJIIZI)V")
    public final void method4(byte arg0, long arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field21++;
        if (this.field29) {
            arg4 = false;
        } else if (class125.field2210 < this.field18.field4686) {
            arg4 = false;
        } else if (this.field36 == this.field22 && this.field22 == this.field12 && this.field34 == this.field33 && this.field8 == this.field33 && this.field30 == this.field11 && this.field30 == this.field17) {
            arg4 = false;
        } else if (this.field18.field4699 != -1) {
            int var8 = (int) (arg1 - this.field27);
            if (this.field18.field4744 || var8 <= this.field18.field4699) {
                var8 %= this.field18.field4699;
            } else {
                arg4 = false;
            }
            if (!this.field18.field4718 && var8 < this.field18.field4728) {
                arg4 = false;
            }
            if (this.field18.field4718 && this.field18.field4728 <= var8) {
                arg4 = false;
            }
        }
        if (arg0 != -89) {
            method5((class100[]) null, (class7) null, (class160[]) null, (class100[]) null, (class100[]) null, (class100[]) null, 86);
        }
        if (arg4) {
            this.field15 += (int) ((double) arg5 * ((double) this.field18.field4717 + (double) (this.field18.field4724 - this.field18.field4717) * Math.random()));
            if (this.field15 > 63) {
                int var9 = this.field15 >> 6;
                this.field15 &= 0x3F;
                if (this.field1) {
                    int var10 = this.field22 - this.field36;
                    int var11 = this.field30 - this.field11;
                    int var12 = this.field8 - this.field34;
                    int var13 = this.field12 - this.field36;
                    int var14 = this.field17 - this.field11;
                    this.field20 = var11 * var13 - (var10 * var14);
                    int var15 = this.field33 - this.field34;
                    this.field6 = var14 * var15 - var11 * var12;
                    this.field38 = var10 * var12 - var13 * var15;
                    while (true) {
                        if (this.field6 <= 32767 && this.field20 <= 32767 && this.field38 <= 32767 && this.field6 >= -32767 && this.field20 >= -32767 && this.field38 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field6 * this.field6 + this.field38 * this.field38 + this.field20 * this.field20));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field20 = this.field20 * 32767 / var16;
                            this.field38 = this.field38 * 32767 / var16;
                            this.field6 = this.field6 * 32767 / var16;
                            if (this.field18.field4747 > 0 || this.field18.field4711 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field38, (double) this.field6) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) (this.field6 * this.field6 + this.field38 * this.field38), (double) this.field20) * 2047.0D / 6.283185307179586D);
                                this.field14 = this.field18.field4711 - this.field18.field4698;
                                this.field35 = var19 + this.field18.field4698 - (this.field14 / 2);
                                this.field5 = this.field18.field4747 - this.field18.field4734;
                                int var20 = var18 - this.field16.field2212;
                                this.field4 = var20 + this.field18.field4734 - (this.field5 / 2);
                            } else if (this.field16.field2212 != 0) {
                                int var17 = this.field6 * arg2 + this.field38 * arg3 >> 16;
                                this.field38 = this.field38 * arg2 - (this.field6 * arg3) >> 16;
                                this.field6 = var17;
                            }
                            this.field1 = false;
                            break;
                        }
                        this.field38 >>= 0x1;
                        this.field20 >>= 0x1;
                        this.field6 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22 = this.field6;
                    int var23 = this.field20;
                    int var24 = this.field38;
                    if (this.field18.field4747 > 0 || this.field18.field4711 > 0) {
                        int var25 = this.field4 + (int) ((double) this.field5 * Math.random());
                        int var26 = var25 & 0x7FF;
                        int var27 = class196.field3635[var26] >> 1;
                        int var28 = class196.field3630[var26] >> 1;
                        int var29 = this.field35 + (int) (Math.random() * (double) this.field14);
                        int var30 = var29 & 0x3FF;
                        int var31 = class196.field3630[var30] >> 1;
                        var23 = var31 * -1;
                        int var32 = class196.field3635[var30] >> 1;
                        var24 = var27 * var32 >> 16;
                        var22 = var28 * var32 >> 16;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var35 - var33;
                    int var37 = this.field34 * var33 - (-(this.field8 * var36) - (this.field33 * var35)) >> 8;
                    int var38 = this.field36 * var33 - (-(this.field22 * var35) - this.field12 * var36) >> 8;
                    int var39 = this.field17 * var36 + this.field11 * var33 + (this.field30 * var35) >> 8;
                    if (this.field16.field2212 != 0) {
                        int var40 = arg2 * var38 + arg3 * var39 >> 16;
                        var39 = arg2 * var39 - (arg3 * var38) >> 16;
                        var38 = var40;
                    }
                    int var41 = this.field18.field4742 + (int) (Math.random() * (double) (this.field18.field4726 - this.field18.field4742));
                    int var42 = this.field18.field4733 + ((int) (Math.random() * (double) (this.field18.field4680 - this.field18.field4733)));
                    int var45;
                    if (this.field18.field4702) {
                        double var43 = Math.random();
                        var45 = (int) ((double) this.field18.field4694 * var43 + (double) this.field18.field4712) | (int) ((double) this.field18.field4706 * var43 + (double) this.field18.field4700) << 16 | (int) ((double) this.field18.field4722 * var43 + (double) this.field18.field4735) << 8 | (int) ((double) this.field18.field4746 * var43 + (double) this.field18.field4707) << 24;
                    } else {
                        var45 = (int) ((double) this.field18.field4707 + Math.random() * (double) this.field18.field4746) << 24 | (int) (Math.random() * (double) this.field18.field4706 + (double) this.field18.field4700) << 16 | (int) ((double) this.field18.field4735 + Math.random() * (double) this.field18.field4722) << 8 | (int) ((double) this.field18.field4712 + (double) this.field18.field4694 * Math.random());
                    }
                    if (class125.field2204 == class125.field2203) {
                        new class286(this, this.field16.field2218 + var38, this.field16.field2214 - -var37, this.field16.field2215 + var39, var22, var23, var24, var42, var41, var45);
                    } else {
                        class286 var47 = class125.field2198[class125.field2204];
                        class125.field2204 = class125.field2204 + 1 & 0x3FF;
                        var47.method1874(this, this.field16.field2218 + var38, this.field16.field2214 + var37, this.field16.field2215 + var39, var22, var23, var24, var42, var41, var45);
                    }
                }
            }
        }
        this.field32 = 0;
        for (class286 var48 = (class286) this.field26.method599(0); var48 != null; var48 = (class286) this.field26.method607((byte) 123)) {
            var48.method1875(arg1, arg5);
            this.field32++;
        }
        class125.field2200 += this.field32;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([Lbc;Lgf;[Lek;[Lbc;[Lbc;[Lbc;I)V")
    public static final void method5(class100[] arg0, class7 arg1, class160[] arg2, class100[] arg3, class100[] arg4, class100[] arg5, int arg6) {
        class187.field3394 = arg4;
        class179.field3205 = arg0;
        field9++;
        class127.field2248 = arg2;
        class187.field3387 = arg3;
        class16.field282 = arg5;
        class23.field385 = arg1;
        class268.field4799.method1293(false);
        int var7 = class23.field385.method55(arg6 - 1, class157.field2834);
        int[] var8 = class23.field385.method43(var7, (byte) -110);
        for (int var9 = arg6; var9 < var8.length; var9++) {
            class268.field4799.method1290((byte) -44, class259.method1711(21184, new class190(class23.field385.method41(arg6 - 18328, var7, var8[var9]))));
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lkf;Lnc;J)V")
    public class1(class195 arg0, class125 arg1, long arg2) {
        this.field16 = arg1;
        this.field25 = arg0;
        this.field26 = new class101();
        this.field27 = arg2;
        this.field18 = this.field25.field3626;
        this.field15 = (int) ((double) this.field15 + Math.random() * 64.0D);
    }
}
