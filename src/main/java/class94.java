import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class94 {

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "Loea;")
    private class594 field1641;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "Luea;")
    private class315 field1644;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "[B")
    public byte[] field1643;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "[Z")
    public static boolean[] field1642 = new boolean[8];

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "[[Ljr;")
    private class110[][] field1636;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lr;III)V", line = 4)
    public final void method857(class181 arg0, int arg1, int arg2, int arg3) {
        field1639++;
        class429 var5 = (class429) arg0;
        int var6 = var5.field5999 + arg1 + 1;
        int var7 = var5.field6004 + arg3 + 1;
        if (arg2 != 5888) {
            return;
        }
        int var8 = var7 + (this.field1634 * var6);
        int var9 = 0;
        int var10 = var5.field6001;
        int var11 = var5.field6005;
        int var12 = this.field1634 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var6 = 1;
            var8 += this.field1634 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field1648) {
            int var15 = var6 + var10 + 1 - this.field1648;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var11 -= var16;
            var14 += var16;
            var7 = 1;
            var9 += var16;
            var12 += var16;
        }
        if (this.field1634 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field1634;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class268.method1790(var14, this.field1643, var12, var8, var11, var9, var5.field6007, var10, arg2 - 1259008990);
            this.method860(arg2 ^ 0xFFFFE8FF, var7, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V", line = 77)
    public final void method858(boolean arg0) {
        this.field1636 = new class110[this.field1640][this.field1635];
        field1649++;
        int var2 = 0;
        if (arg0) {
            this.field1636 = null;
        }
        while (this.field1635 > var2) {
            for (int var3 = 0; var3 < this.field1640; var3++) {
                this.field1636[var3][var2] = new class110(this.field1641, this, this.field1644, var3, var2, this.field1646, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V", line = 105)
    public static void method859(byte arg0) {
        field1642 = null;
        if (arg0 <= 102) {
            field1642 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIII)V", line = 118)
    private final void method860(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1637++;
        if (this.field1636 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg2 - 1 - 1 >> 7;
        int var8 = arg0 + arg3 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class110[] var11 = this.field1636[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1785 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(Lr;III)V", line = 155)
    public final void method861(class181 arg0, int arg1, int arg2, int arg3) {
        field1638++;
        class429 var5 = (class429) arg0;
        int var6 = var5.field5999 + arg2 + 1;
        int var7 = var5.field6004 + arg1 + 1;
        int var8 = var7 + (this.field1634 * var6);
        int var9 = 0;
        if (arg3 != -12720) {
            this.method860(-24, -68, 34, -74, -4);
        }
        int var10 = var5.field6001;
        int var11 = var5.field6005;
        int var12 = this.field1634 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var10 -= var13;
            var6 = 1;
            var8 += this.field1634 * var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field1648) {
            int var15 = var6 + var10 + 1 - this.field1648;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var9 += var16;
            var14 += var16;
            var11 -= var16;
            var8 += var16;
            var7 = 1;
        }
        if (this.field1634 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field1634;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class281.method1838((byte) 127, var9, this.field1643, var5.field6007, var11, var14, var10, var8, var12);
            this.method860(-1, var7, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Loea;Luea;)V", line = 234)
    public class94(class594 arg0, class315 arg1) {
        this.field1641 = arg0;
        this.field1644 = arg1;
        this.field1634 = (this.field1644.field3924 * this.field1644.field3920 >> this.field1641.field8545) + 2;
        this.field1648 = (this.field1644.field3920 * this.field1644.field3914 >> this.field1641.field8545) + 2;
        this.field1643 = new byte[this.field1648 * this.field1634];
        this.field1646 = this.field1641.field8545 + 7 - this.field1644.field3915;
        this.field1640 = this.field1644.field3924 >> this.field1646;
        this.field1635 = this.field1644.field3914 >> this.field1646;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIZI[[Z)V", line = 249)
    public final void method862(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean[][] arg5) {
        this.field1641.method3463(false, (byte) 3);
        field1647++;
        this.field1641.method3483(102, false);
        this.field1641.method3486((byte) -82, -2);
        this.field1641.method3417(1, 0);
        int var7 = 84 / ((arg4 + 50) / 32);
        this.field1641.method3454(1, 102);
        float var8 = 1.0F / (float) (this.field1641.field8546 * 128);
        if (arg3) {
            for (int var23 = 0; var23 < this.field1635; var23++) {
                int var24 = var23 << this.field1646;
                int var25 = var23 + 1 << this.field1646;
                label85: for (int var26 = 0; var26 < this.field1640; var26++) {
                    int var27 = var26 << this.field1646;
                    int var28 = var26 + 1 << this.field1646;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg2) >= (-arg1) && arg1 >= var29 - arg2) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((-arg1) <= (var30 - arg0) && arg1 >= var30 - arg0 && arg5[arg1 + var29 - arg2][var30 + arg1 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var8, var8, 1.0F);
                                    OpenGL.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1636[var26][var23].method936(-11053);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field1635; var9++) {
                int var10 = var9 << this.field1646;
                int var11 = var9 + 1 << this.field1646;
                for (int var12 = 0; var12 < this.field1640; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field1646;
                    int var15 = var12 + 1 << this.field1646;
                    class427 var16 = this.field1641.field8688;
                    var16.field469 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((-arg1) <= (var17 - arg0) && arg1 >= var17 - arg0) {
                            int var18 = this.field1644.field3924 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (var19 - arg2 >= -arg1 && arg1 >= var19 - arg2 && arg5[var19 + arg1 - arg2][var17 + arg1 - arg0]) {
                                    short[] var20 = this.field1644.field4439[var18];
                                    if (var20 != null) {
                                        if (this.field1641.field8682) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method223(1493807496, var20[var21] & 0xFFFF);
                                                var13++;
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var16.method237(false, var20[var22] & 0xFFFF);
                                                var13++;
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var8, var8, 1.0F);
                        OpenGL.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1636[var12][var9].method933(var13, var16.field483, true, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILr;)Z", line = 433)
    public final boolean method863(int arg0, int arg1, int arg2, class181 arg3) {
        field1645++;
        class429 var5 = (class429) arg3;
        int var6 = var5.field5999 + arg1 + 1;
        int var7 = var5.field6004 + arg0 + 1;
        int var8 = this.field1634 * var6 + var7;
        if (arg2 != -27635) {
            return true;
        }
        int var9 = var5.field6001;
        int var10 = var5.field6005;
        int var11 = this.field1634 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field1634 * var12;
        }
        if (var6 + var9 >= this.field1648) {
            int var13 = var6 + var9 + 1 - this.field1648;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var11 += var14;
            var8 += var14;
            var7 = 1;
        }
        if (var7 + var10 >= this.field1634) {
            int var15 = var7 + var10 + 1 - this.field1634;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1634 + var11;
            return class147.method1142(var8, var16, this.field1643, true, var17, var9, var10);
        } else {
            return false;
        }
    }
}
