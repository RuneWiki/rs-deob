import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class281 {

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lag;")
    private class469 field3701;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "Lal;")
    private class303 field3713;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    private int field3696;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "[B")
    public byte[] field3714;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    private int field3695;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "J")
    public static long field3698 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "[[Lad;")
    private class19[][] field3712;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public final void method1668(int arg0) {
        if (arg0 != 5123) {
            this.method1669((byte) -111, -61, -27, null);
        }
        field3699++;
        this.field3712 = new class19[this.field3695][this.field3710];
        for (int var2 = 0; var2 < this.field3710; var2++) {
            for (int var3 = 0; var3 < this.field3695; var3++) {
                this.field3712[var3][var2] = new class19(this.field3701, this, this.field3713, var3, var2, this.field3709, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIILha;)V")
    public final void method1669(byte arg0, int arg1, int arg2, class117 arg3) {
        field3700++;
        class187 var5 = (class187) arg3;
        int var6 = var5.field2602 + arg2 + 1;
        int var7 = var5.field2605 + arg1 + 1;
        int var8 = this.field3707 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2596;
        int var11 = var5.field2608;
        int var12 = this.field3707 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field3707 * var13;
        }
        int var14 = 0;
        if (arg0 != 68) {
            return;
        }
        if (this.field3696 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field3696;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var8 += var16;
            var14 += var16;
            var11 -= var16;
            var7 = 1;
            var9 += var16;
        }
        if (var7 + var11 >= this.field3707) {
            int var17 = var7 + var11 + 1 - this.field3707;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class307.method1800((byte) 126, this.field3714, var9, var12, var5.field2598, var10, var14, var11, var8);
            this.method1676(var11, -1752679993, var10, var6, var7);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1670(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3702 = -81;
        }
        field3697++;
        return class216.method1376((byte) 81, arg1, arg2) | (arg1 & 0x800) != 0 || class229.method1421(arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([[ZIIZBI)V")
    public final void method1671(boolean[][] arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field3704++;
        this.field3701.method2703(false, 87);
        this.field3701.method2653(-95, false);
        this.field3701.method2693(-2, 15210);
        this.field3701.method2650((byte) -67, 1);
        this.field3701.method2644(1, (byte) 79);
        float var7 = 1.0F / (float) (this.field3701.field6395 * 128);
        if (arg3) {
            for (int var22 = 0; var22 < this.field3710; var22++) {
                int var23 = var22 << this.field3709;
                int var24 = var22 + 1 << this.field3709;
                label89: for (int var25 = 0; var25 < this.field3695; var25++) {
                    int var26 = var25 << this.field3709;
                    int var27 = var25 + 1 << this.field3709;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (-arg5 <= var28 - arg2 && arg5 >= (var28 - arg2)) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg1 >= -arg5 && arg5 >= (var29 - arg1) && arg0[var28 - (arg2 - arg5)][var29 + arg5 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field3712[var25][var22].method114(-127);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3710; var8++) {
                int var9 = var8 << this.field3709;
                int var10 = var8 + 1 << this.field3709;
                for (int var11 = 0; var11 < this.field3695; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field3709;
                    int var14 = var11 + 1 << this.field3709;
                    class210 var15 = this.field3701.field6523;
                    var15.field2219 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((var16 - arg1) >= (-arg5) && arg5 >= var16 - arg1) {
                            int var17 = this.field3713.field3524 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg2 >= -arg5 && (var18 - arg2) <= arg5 && arg0[var18 + arg5 - arg2][arg5 + var16 - arg1]) {
                                    short[] var19 = this.field3713.field4004[var17];
                                    if (var19 != null) {
                                        if (this.field3701.field6466) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method918(24551, var19[var20] & 0xFFFF);
                                                var12++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method913(var19[var21] & 0xFFFF, true);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field3712[var11][var8].method113(var12, (byte) 123, 5123, var15.field2199);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg4 < -78) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILha;I)V")
    public final void method1672(int arg0, int arg1, class117 arg2, int arg3) {
        field3706++;
        class187 var5 = (class187) arg2;
        int var6 = var5.field2605 + arg1 + 1;
        int var7 = var5.field2602 + arg0 + 1;
        int var8 = var6 + (this.field3707 * var7);
        int var9 = 0;
        int var10 = var5.field2596;
        int var11 = var5.field2608;
        int var12 = this.field3707 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field3707 * var14;
        }
        if (this.field3696 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field3696;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var12 += var16;
            var8 += var16;
            var11 -= var16;
            var13 += var16;
            var9 += var16;
        }
        if (var6 + var11 >= this.field3707) {
            int var17 = var11 + var6 + 1 - this.field3707;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class305.method1787(var13, var8, (byte) -92, var12, var9, this.field3714, var10, var5.field2598, var11);
        this.method1676(var11, -1752679993, var10, var7, var6);
        if (arg3 != -20128) {
            this.field3695 = -7;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)Z")
    public static final boolean method1673(byte arg0, int arg1, int arg2) {
        field3708++;
        if (arg0 <= 102) {
            return true;
        } else {
            return (arg2 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static final void method1674(byte arg0) {
        field3711++;
        class611 var1 = null;
        try {
            class661 var2 = class312.field4206.method2236("2", (byte) -106, true);
            while (var2.field9420 == 0) {
                class588.method3253(arg0 + 122, 1L);
            }
            if (var2.field9420 == 1) {
                var1 = (class611) var2.field9421;
                byte[] var3 = new byte[(int) var1.method3387(-102)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3386(var3.length - var4, arg0 ^ 0xFFFFFF86, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class693.method3908(-123, new class157(var3));
            }
            if (arg0 != -122) {
                field3702 = 112;
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3390(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(IILha;I)Z")
    public final boolean method1675(int arg0, int arg1, class117 arg2, int arg3) {
        field3705++;
        class187 var5 = (class187) arg2;
        int var6 = var5.field2605 + arg3 + 1;
        int var7 = var5.field2602 + arg1 + 1;
        int var8 = var6 + (this.field3707 * var7);
        if (arg0 != 11937) {
            return false;
        }
        int var9 = var5.field2596;
        int var10 = var5.field2608;
        int var11 = this.field3707 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var8 += this.field3707 * var12;
            var9 -= var12;
        }
        if ((var7 + var9) >= this.field3696) {
            int var13 = var7 + var9 + 1 - this.field3696;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var6 = 1;
            var11 += var14;
            var10 -= var14;
        }
        if (this.field3707 <= var6 + var10) {
            int var15 = var6 + 1 - (-var10 - -this.field3707);
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3707 + var11;
            return class271.method1613((byte) -68, this.field3714, var10, var9, var8, var17, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
    private final void method1676(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3694++;
        if (this.field3712 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg4 + arg0 - 1 - 1 >> 7;
        if (arg1 != -1752679993) {
            method1673((byte) -8, 109, -42);
        }
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class19[] var11 = this.field3712[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field246 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lag;Lal;)V")
    public class281(class469 arg0, class303 arg1) {
        this.field3701 = arg0;
        this.field3713 = arg1;
        this.field3707 = (this.field3713.field3527 * this.field3713.field3524 >> this.field3701.field6396) + 2;
        this.field3696 = (this.field3713.field3527 * this.field3713.field3525 >> this.field3701.field6396) + 2;
        this.field3709 = this.field3701.field6396 + 7 - this.field3713.field3530;
        this.field3714 = new byte[this.field3707 * this.field3696];
        this.field3695 = this.field3713.field3524 >> this.field3709;
        this.field3710 = this.field3713.field3525 >> this.field3709;
    }
}
