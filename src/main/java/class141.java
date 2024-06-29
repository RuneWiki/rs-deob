import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class141 {

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Lrq;")
    private class485 field2000;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Ldw;")
    private class664 field2012;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "[B")
    public byte[] field2007;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[[Lhga;")
    private class302[][] field2011;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZZI[[ZI)V", line = 10)
    public final void method926(int arg0, boolean arg1, boolean arg2, int arg3, boolean[][] arg4, int arg5) {
        this.field2012.method3680((byte) 106, arg1);
        field2004++;
        this.field2012.method3684(false, -32);
        this.field2012.method3709((byte) -65, -2);
        this.field2012.method3720(-26014, 1);
        this.field2012.method3737(0, 1);
        float var7 = 1.0F / (float) (this.field2012.field9012 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field1996; var8++) {
                int var9 = var8 << this.field1998;
                int var10 = var8 + 1 << this.field1998;
                label132: for (int var11 = 0; var11 < this.field2008; var11++) {
                    int var12 = var11 << this.field1998;
                    int var13 = var11 + 1 << this.field1998;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg3) <= (var14 - arg0) && arg3 >= (var14 - arg0)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg5) >= (-arg3) && arg3 >= (var15 - arg5) && arg4[var14 + arg3 - arg0][arg3 + var15 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2011[var11][var8].method1987((byte) 25);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field1996; var16++) {
                int var17 = var16 << this.field1998;
                int var18 = var16 + 1 << this.field1998;
                for (int var19 = 0; var19 < this.field2008; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field1998;
                    int var22 = var19 + 1 << this.field1998;
                    class172 var23 = this.field2012.field9117;
                    var23.field956 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg3) <= (var24 - arg5) && var24 - arg5 <= arg3) {
                            int var25 = this.field2000.field4814 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg0 >= -arg3 && var26 - arg0 <= arg3 && arg4[var26 + arg3 - arg0][arg3 + var24 - arg5]) {
                                    short[] var27 = this.field2000.field6752[var25];
                                    if (var27 != null) {
                                        if (this.field2012.field9051) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method492(-2, var27[var28] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method499(-25094, var27[var29] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field2011[var19][var16].method1988(5123, var20, (byte) -19, var23.field954);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lr;BII)V", line = 192)
    public final void method927(class709 arg0, byte arg1, int arg2, int arg3) {
        field2010++;
        class231 var5 = (class231) arg0;
        if (arg1 >= -40) {
            this.field2007 = null;
        }
        int var6 = var5.field3130 + arg3 + 1;
        int var7 = var5.field3129 + arg2 + 1;
        int var8 = this.field1999 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3132;
        int var11 = var5.field3139;
        int var12 = this.field1999 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field1999 * var13;
        }
        int var14 = 0;
        if (this.field2006 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field2006;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var9 += var16;
            var6 = 1;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if ((var6 + var11) >= this.field1999) {
            int var17 = var6 + var11 + 1 - this.field1999;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class647.method3627(var9, var12, this.field2007, var10, var14, -123, var8, var5.field3134, var11);
            this.method928(var11, var7, 1236929127, var10, var6);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V", line = 267)
    private final void method928(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2001++;
        if (this.field2011 == null) {
            return;
        }
        if (arg2 != 1236929127) {
            this.field1999 = 42;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg0 + arg4 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg3 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class302[] var11 = this.field2011[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4269 = true;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILr;BI)V", line = 305)
    public final void method929(int arg0, class709 arg1, byte arg2, int arg3) {
        field2003++;
        class231 var5 = (class231) arg1;
        int var6 = var5.field3129 + arg0 + 1;
        int var7 = var5.field3130 + arg3 + 1;
        int var8 = this.field1999 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3132;
        int var11 = var5.field3139;
        if (arg2 != -19) {
            this.method928(95, -98, -39, 73, 79);
        }
        int var12 = this.field1999 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field1999 * var13;
            var10 -= var13;
            var6 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field2006) {
            int var15 = var6 + var10 + 1 - this.field2006;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
            var14 += var16;
        }
        if (var7 + var11 >= this.field1999) {
            int var17 = var7 - (this.field1999 - var11 - 1);
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class345.method2204(arg2 + 18, this.field2007, var8, var12, var14, var9, var10, var11, var5.field3134);
            this.method928(var11, var6, arg2 ^ 0xB645F58A, var10, var7);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V", line = 377)
    public static final void method930(int arg0, int arg1) {
        field2002++;
        class491.field6905.method3896(1, arg1);
        class717.field9986.method3896(arg0, arg1);
        class744.field10235.method3896(arg0, arg1);
        class545.field7565.method3896(arg0, arg1);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 390)
    public final void method931(byte arg0) {
        if (arg0 != 123) {
            return;
        }
        this.field2011 = new class302[this.field2008][this.field1996];
        field2009++;
        for (int var2 = 0; var2 < this.field1996; var2++) {
            for (int var3 = 0; var3 < this.field2008; var3++) {
                this.field2011[var3][var2] = new class302(this.field2012, this, this.field2000, var3, var2, this.field1998, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIILjava/lang/Class;)Lht;", line = 419)
    public static final class395 method932(int arg0, int arg1, int arg2, Class arg3) {
        class262 var4 = class137.field1948[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class638 var5 = var4.field3846; var5 != null; var5 = var5.field8564) {
            class395 var6 = var5.field8567;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5680 == arg1 && var6.field5673 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILr;II)Z", line = 448)
    public final boolean method933(int arg0, class709 arg1, int arg2, int arg3) {
        field2005++;
        class231 var5 = (class231) arg1;
        int var6 = var5.field3129 + arg0 + 1;
        int var7 = var5.field3130 + arg2 + 1;
        int var8 = this.field1999 * var6 + var7;
        int var9 = var5.field3132;
        int var10 = var5.field3139;
        int var11 = this.field1999 - var10;
        if (var6 <= arg3) {
            int var12 = 1 - var6;
            var6 = 1;
            var8 += this.field1999 * var12;
            var9 -= var12;
        }
        if (var6 + var9 >= this.field2006) {
            int var13 = var6 + var9 + 1 - this.field2006;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var11 += var14;
            var7 = 1;
            var8 += var14;
        }
        if (var7 + var10 >= this.field1999) {
            int var15 = var7 + var10 + 1 - this.field1999;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1999 + var11;
            return class653.method3650(-1, var16, var17, var8, this.field2007, var9, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ldw;Lrq;)V", line = 517)
    public class141(class664 arg0, class485 arg1) {
        this.field2000 = arg1;
        this.field2012 = arg0;
        this.field1999 = (this.field2000.field4818 * this.field2000.field4814 >> this.field2012.field9011) + 2;
        this.field2006 = (this.field2000.field4818 * this.field2000.field4817 >> this.field2012.field9011) + 2;
        this.field1998 = this.field2012.field9011 + 7 - this.field2000.field4822;
        this.field2007 = new byte[this.field2006 * this.field1999];
        this.field2008 = this.field2000.field4814 >> this.field1998;
        this.field1996 = this.field2000.field4817 >> this.field1998;
    }
}
