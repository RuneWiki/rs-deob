import jaggl.OpenGL;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class120 {

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lrl;")
    private class487 field1558;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lgb;")
    private class136 field1553;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[B")
    public byte[] field1564;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lgm;")
    public static class75 field1566 = class327.method1962((byte) -80);

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[[Lfb;")
    private class457[][] field1563;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z[[ZIIII)V", line = 9)
    public final void method680(boolean arg0, boolean[][] arg1, int arg2, int arg3, int arg4, int arg5) {
        field1560++;
        this.field1558.method2884(false, (byte) -93);
        this.field1558.method2908(false, (byte) 36);
        this.field1558.method2867(0, -2);
        this.field1558.method2914(127, 1);
        this.field1558.method2852(0, 1);
        float var7 = 1.0F / (float) (this.field1558.field7322 * 128);
        if (arg0) {
            for (int var22 = 0; var22 < this.field1555; var22++) {
                int var23 = var22 << this.field1565;
                int var24 = var22 + 1 << this.field1565;
                label89: for (int var25 = 0; var25 < this.field1562; var25++) {
                    int var26 = var25 << this.field1565;
                    int var27 = var25 + 1 << this.field1565;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg2) <= (var28 - arg5) && arg2 >= var28 - arg5) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((var29 - arg4) >= (-arg2) && var29 - arg4 <= arg2 && arg1[arg2 + var28 - arg5][arg2 + var29 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1563[var25][var22].method2665((byte) 68);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field1555; var8++) {
                int var9 = var8 << this.field1565;
                int var10 = var8 + 1 << this.field1565;
                for (int var11 = 0; var11 < this.field1562; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field1565;
                    int var14 = var11 + 1 << this.field1565;
                    class156 var15 = class227.field3201;
                    var15.field2018 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg4 >= -arg2 && (var16 - arg4) <= arg2) {
                            int var17 = this.field1553.field6434 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg5 >= -arg2 && var18 - arg5 <= arg2 && arg1[arg2 + var18 - arg5][var16 + arg2 - arg4]) {
                                    short[] var19 = this.field1553.field1743[var17];
                                    if (var19 != null) {
                                        if (this.field1558.field7350) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method961(var19[var21] & 0xFFFF, 1608339368);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method988(var19[var20] & 0xFFFF, -461070776);
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
                        this.field1563[var11][var8].method2664(var12, var15.field2041, 5123, true);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (arg3 <= 21) {
            method683(-64, -72);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIILss;)V", line = 192)
    public final void method681(boolean arg0, int arg1, int arg2, class283 arg3) {
        field1550++;
        class245 var5 = (class245) arg3;
        int var6 = var5.field3524 + arg1 + 1;
        int var7 = var5.field3518 + arg2 + 1;
        int var8 = this.field1561 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3527;
        int var11 = var5.field3515;
        int var12 = this.field1561 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var9 += var11 * var13;
            var6 = 1;
            var8 += this.field1561 * var13;
        }
        if (arg0) {
            this.method680(true, null, -39, -98, -39, 53);
        }
        int var14 = 0;
        if (var6 + var10 >= this.field1548) {
            int var15 = var6 - (this.field1548 - var10 - 1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var14 += var16;
            var7 = 1;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
        }
        if (this.field1561 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field1561;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class388.method2335(var11, var5.field3520, this.field1564, var9, var10, var12, var14, 2, var8);
            this.method687(var10, (byte) 120, var6, var11, var7);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 263)
    public final void method682(int arg0) {
        field1554++;
        this.field1563 = new class457[this.field1562][this.field1555];
        for (int var2 = arg0; var2 < this.field1555; var2++) {
            for (int var3 = 0; var3 < this.field1562; var3++) {
                this.field1563[var3][var2] = new class457(this.field1558, this, this.field1553, var3, var2, this.field1565, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 289)
    public static final void method683(int arg0, int arg1) {
        if (!class118.field1533.field6897) {
            arg1 = -1;
        }
        field1551++;
        if (class386.field5723 == arg1) {
            return;
        }
        if (arg0 != arg1) {
            class290 var2 = class337.field4911.method1588((byte) -101, arg1);
            class328 var3 = var2.method1757(arg0 + 21513);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class86.field1182.method329(var3.method1973(), var3.method1974(), arg0 ^ 0xFFFFFF8D, class498.field7590, var3.method1981(), new Point(var2.field4147, var2.field4145));
                class386.field5723 = arg1;
            }
        }
        if (arg1 == -1 && class386.field5723 != -1) {
            class86.field1182.method329(-1, null, arg0 ^ 0x4B, class498.field7590, -1, new Point());
            class386.field5723 = -1;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 331)
    public static void method684(int arg0) {
        field1566 = null;
        if (arg0 != -18135) {
            method683(82, -79);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lss;III)Z", line = 341)
    public final boolean method685(class283 arg0, int arg1, int arg2, int arg3) {
        field1552++;
        class245 var5 = (class245) arg0;
        int var6 = var5.field3524 + arg3 + 1;
        int var7 = var5.field3518 + arg2 + 1;
        int var8 = this.field1561 * var6 + var7;
        int var9 = var5.field3527;
        if (arg1 != 17192) {
            return false;
        }
        int var10 = var5.field3515;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var8 += this.field1561 * var11;
            var9 -= var11;
        }
        int var12 = this.field1561 - var10;
        if (this.field1548 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field1548;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
            var7 = 1;
        }
        if ((var7 + var10) >= this.field1561) {
            int var15 = var7 + var10 + 1 - this.field1561;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1561 + var12;
            return class309.method1858(var16, var10, arg1 ^ 0x4356, var8, var17, var9, this.field1564);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLss;II)V", line = 418)
    public final void method686(boolean arg0, class283 arg1, int arg2, int arg3) {
        field1557++;
        class245 var5 = (class245) arg1;
        int var6 = var5.field3518 + arg3 + 1;
        int var7 = var5.field3524 + arg2 + 1;
        int var8 = this.field1561 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3527;
        int var11 = var5.field3515;
        int var12 = this.field1561 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var8 += this.field1561 * var14;
            var7 = 1;
            var10 -= var14;
        }
        if (this.field1548 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field1548;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var13 += var16;
            var8 += var16;
        }
        if (this.field1561 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field1561;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class318.method1917(var13, var12, var8, (byte) 64, var11, this.field1564, var9, var10, var5.field3520);
        this.method687(var10, (byte) -48, var7, var11, var6);
        if (!arg0) {
            this.method682(-12);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBIII)V", line = 492)
    private final void method687(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1549++;
        if (this.field1563 == null) {
            return;
        }
        int var6 = -28 % ((arg1 - 52) / 62);
        int var7 = arg4 - 1 >> 7;
        int var8 = arg3 + arg4 - 1 - 1 >> 7;
        int var9 = arg2 - 1 >> 7;
        int var10 = arg0 + arg2 - 1 - 1 >> 7;
        for (int var11 = var7; var11 <= var8; var11++) {
            class457[] var12 = this.field1563[var11];
            for (int var13 = var9; var13 <= var10; var13++) {
                var12[var13].field6655 = true;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I", line = 530)
    public static final int method688(int arg0, int arg1, int arg2) {
        field1559++;
        if (arg2 == 1 || arg2 == 3) {
            return class75.field1072[arg1 & 0x3];
        } else {
            int var3 = 72 % ((arg0 + 24) / 36);
            return class489.field7490[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lrl;Lgb;)V", line = 553)
    public class120(class487 arg0, class136 arg1) {
        this.field1558 = arg0;
        this.field1553 = arg1;
        this.field1561 = (this.field1553.field6438 * this.field1553.field6434 >> this.field1558.field7319) + 2;
        this.field1548 = (this.field1553.field6438 * this.field1553.field6436 >> this.field1558.field7319) + 2;
        this.field1565 = this.field1558.field7319 + 7 - this.field1553.field6441;
        this.field1564 = new byte[this.field1561 * this.field1548];
        this.field1562 = this.field1553.field6434 >> this.field1565;
        this.field1555 = this.field1553.field6436 >> this.field1565;
    }
}
