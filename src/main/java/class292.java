import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class292 extends class116 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    private int field3780 = 0;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Z")
    private boolean field3781 = false;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    private int field3785 = 0;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field3783 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field3793 = 0;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    private int field3802 = 0;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Luq;")
    private class313 field3804;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lem;")
    private class600 field3782;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lbn;")
    public static class371 field3801 = new class371(10, 2, 2, 0);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lem;")
    private class600 field3784;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lmg;")
    public static class639 field3790;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
    public static final int method1788(byte arg0) {
        if (arg0 < 35) {
            return -10;
        } else {
            field3798++;
            return class315.field4365;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static final void method1789(byte arg0) {
        field3791++;
        if (class562.field7861 != 0) {
            class486.field6792 -= class562.field7861 * 5;
            if (class486.field6792 >= class82.field1115) {
                class486.field6792 = class82.field1115 - 1;
            }
            if (class486.field6792 < 0) {
                class486.field6792 = 0;
            }
            class562.field7861 = 0;
        }
        if (class529.field7397 < 102) {
            class529.field7397 += 6;
        }
        for (int var1 = 0; var1 < class176.field2273; var1++) {
            class129 var2 = class391.field5426[var1];
            int var3 = var2.method693((byte) -108);
            char var4 = var2.method692(true);
            int var5 = var2.method691(89);
            if (var3 == 84) {
                class451.method2623(false, -32567);
            }
            if (var3 == 80) {
                class451.method2623(true, -32567);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class135.field1645 != null) {
                    String var10 = "";
                    for (int var11 = class14.field143.length - 1; var11 >= 0; var11--) {
                        if (class14.field143[var11] != null && class14.field143[var11].length() > 0) {
                            var10 = var10 + class14.field143[var11] + '\n';
                        }
                    }
                    class135.field1645.setContents(new StringSelection(var10), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class135.field1645 != null) {
                    Transferable var6 = class135.field1645.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class455.method2637('\n', (byte) -100, var7);
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class21.field303 = var8[var9];
                                        class451.method2623(false, -32567);
                                    }
                                } else {
                                    class21.field303 = class21.field303 + var7;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class191.field2468 > 0) {
                class21.field303 = class21.field303.substring(0, class191.field2468 - 1) + class21.field303.substring(class191.field2468);
                class191.field2468--;
            } else if (var3 == 101 && class191.field2468 < class21.field303.length()) {
                class21.field303 = class21.field303.substring(0, class191.field2468) + class21.field303.substring(class191.field2468 + 1);
            } else if (var3 == 96 && class191.field2468 > 0) {
                class191.field2468--;
            } else if (var3 == 97 && class191.field2468 < class21.field303.length()) {
                class191.field2468++;
            } else if (var3 == 102) {
                class191.field2468 = 0;
            } else if (var3 == 103) {
                class191.field2468 = class21.field303.length();
            } else if (var3 == 104 && class14.field143.length > class478.field6718) {
                class478.field6718++;
                class564.method3163(24266);
                class191.field2468 = class21.field303.length();
            } else if (var3 == 105 && class478.field6718 > 0) {
                class478.field6718--;
                class564.method3163(24266);
                class191.field2468 = class21.field303.length();
            } else if (class506.method2834(var4, 104) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class21.field303 = class21.field303.substring(0, class191.field2468) + class391.field5426[var1].method692(true) + class21.field303.substring(class191.field2468);
                class191.field2468++;
            }
        }
        class176.field2273 = 0;
        if (arg0 > -99) {
            field3801 = null;
        }
        class145.method794((byte) 126);
    }

    @OriginalMember(owner = "client!ab", name = "ra", descriptor = "(IIIIIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3782.method805(true, -8);
        field3789++;
        this.field3804.method1898(true);
        this.field3804.method1905(3042, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3781) {
            float var8 = (float) arg2 / (float) this.method627();
            float var9 = (float) arg3 / (float) this.method631();
            float var10 = (float) this.field3783 * var8 + (float) arg0;
            float var11 = (float) this.field3793 * var9 + (float) arg1;
            float var12 = (float) this.field3782.field8672 * var8 + var10;
            float var13 = (float) this.field3782.field8669 * var9 + var11;
            if (this.field3784 == null) {
                this.field3804.method1884(this.field3782, -2);
                this.field3804.method1909(-82, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1794(arg4, 2);
                this.field3784.method805(true, 75);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3782.field8671);
                OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3782.field8676, 0.0F);
                OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field3782.field8676, this.field3782.field8671);
                OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1792(-4833);
            }
        } else if (this.field3784 == null) {
            this.field3804.method1884(this.field3782, -2);
            this.field3804.method1909(-101, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1794(arg4, 2);
            this.field3784.method805(true, -124);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3782.field8671);
            OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3782.field8676, 0.0F);
            OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3782.field8676, this.field3782.field8671);
            OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1792(-4833);
        }
    }

    @OriginalMember(owner = "client!ab", name = "DA", descriptor = "(IIIII)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3782.method805(false, -121);
        field3805++;
        this.field3804.method1898(true);
        this.field3804.method1905(3042, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3783 + arg0;
        int var7 = this.field3793 + arg1;
        if (this.field3784 == null) {
            this.field3804.method1884(this.field3782, -2);
            this.field3804.method1909(-78, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field3782.field8669);
            OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
            OpenGL.glVertex2i(this.field3782.field8672 + var6, var7 - -this.field3782.field8669);
            OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
            OpenGL.glVertex2i(this.field3782.field8672 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method1794(arg2, 2);
        this.field3784.method805(false, -84);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3782.field8671);
        OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field3782.field8669 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field3782.field8676, 0.0F);
        OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
        OpenGL.glVertex2i(var6 + this.field3782.field8672, this.field3782.field8669 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field3782.field8676, this.field3782.field8671);
        OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
        OpenGL.glVertex2i(this.field3782.field8672 + var6, var7);
        OpenGL.glEnd();
        this.method1792(-4833);
    }

    @OriginalMember(owner = "client!ab", name = "KA", descriptor = "(IIII)V")
    public final void method623(int arg0, int arg1, int arg2, int arg3) {
        this.field3780 = arg3;
        this.field3793 = arg1;
        this.field3783 = arg0;
        this.field3802 = arg2;
        field3808++;
        this.field3781 = this.field3783 != 0 || this.field3793 != 0 || this.field3802 != 0 || this.field3780 != 0;
    }

    @OriginalMember(owner = "client!ab", name = "la", descriptor = "()I")
    public final int method630() {
        field3786++;
        return this.field3782.field8669;
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "(IIIIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3800++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field3782.method805(false, 32);
        this.field3804.method1898(true);
        this.field3804.method1884(this.field3782, -2);
        this.field3804.method1905(3042, arg6);
        this.field3804.method1909(-79, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3782.field8670 && !this.field3781) {
            float var10 = (float) arg3 * this.field3782.field8671 / (float) this.field3782.field8669;
            float var11 = (float) arg2 * this.field3782.field8676 / (float) this.field3782.field8672;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field3783, (float) this.field3793, 0.0F);
        int var12 = this.method627();
        int var13 = this.method631();
        int var14 = arg1 + this.field3782.field8669;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field3782.field8672 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3782.field8676 / (float) this.field3782.field8672;
                OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3782.field8671);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field3782.field8669 - var9) * this.field3782.field8671 / (float) this.field3782.field8669;
            int var17 = this.field3782.field8672 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3782.field8676, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field3782.field8676 / (float) this.field3782.field8672;
                OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3782.field8671);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)I")
    public static int method1790(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILpa;II)V")
    public final void method634(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        field3797++;
        class54 var6 = (class54) arg2;
        class600 var7 = var6.field727;
        this.field3782.method805(false, -122);
        this.field3804.method1898(true);
        this.field3804.method1884(this.field3782, -2);
        this.field3804.method1909(-120, 1);
        this.field3804.method1966(3000, 1);
        this.field3804.method1884(var7, -2);
        this.field3804.method1887(115, 7681, 8448);
        this.field3804.method1933(-99, 768, 0, 34168);
        this.field3804.method1905(3042, 1);
        int var8 = this.field3793 + arg1;
        int var9 = this.field3783 + arg0;
        int var10 = this.field3782.field8672 + var9;
        int var11 = this.field3782.field8669 + var8;
        float var12 = var7.field8676 / (float) var7.field8672;
        float var13 = var7.field8671 / (float) var7.field8669;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field8671 - (float) (var8 - arg4) * var13;
        float var17 = var7.field8671 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3782.field8671);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field3782.field8669);
        OpenGL.glMultiTexCoord2f(33984, this.field3782.field8676, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field3782.field8672, this.field3782.field8669 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field3782.field8676, this.field3782.field8671);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3782.field8672 + var9, var8);
        OpenGL.glEnd();
        this.field3804.method1933(-95, 768, 0, 5890);
        this.field3804.method1909(-75, 0);
        this.field3804.method1884(null, -2);
        this.field3804.method1966(3000, 0);
    }

    @OriginalMember(owner = "client!ab", name = "BA", descriptor = "(III)V")
    public final void method626(int arg0, int arg1, int arg2) {
        field3799++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3784 = class106.method579(41, arg1, arg0, this.field3782.field8672, this.field3804, this.field3782.field8669);
        this.field3785 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method1791(int arg0) {
        field3790 = null;
        field3801 = null;
        if (arg0 != -268770322) {
            field3790 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    private final void method1792(int arg0) {
        this.field3804.method1966(3000, 1);
        field3809++;
        this.field3804.method1884(null, -2);
        this.field3804.method1887(-126, 8448, 8448);
        this.field3804.method1933(-107, 768, 1, 34168);
        this.field3804.method1947(34162, 5890, 0, 770);
        if (arg0 != -4833) {
            this.field3783 = -36;
        }
        this.field3804.method1966(3000, 0);
        this.field3804.method1933(arg0 ^ 0x12A8, 768, 1, 34168);
    }

    @OriginalMember(owner = "client!ab", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method636(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3781) {
            float var10 = (float) this.method627();
            float var11 = (float) this.method631();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field3793 * var14;
            float var17 = (float) this.field3793 * var15;
            float var18 = (float) this.field3783 * var12;
            float var19 = (float) this.field3783 * var13;
            float var20 = (float) this.field3802 * -var12;
            float var21 = (float) this.field3802 * -var13;
            float var22 = (float) this.field3780 * -var14;
            float var23 = (float) this.field3780 * -var15;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field3788++;
        float var24 = arg2 + arg4 - arg0;
        this.field3782.method805(true, -88);
        float var25 = arg5 + arg3 - arg1;
        this.field3804.method1898(true);
        this.field3804.method1884(this.field3782, -2);
        this.field3804.method1905(3042, arg8);
        this.field3804.method1909(-109, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3782.field8671);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3782.field8676, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field3782.field8676, this.field3782.field8671);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjq;IILpa;Lqa;III)V")
    public static final void method1793(int arg0, class447 arg1, int arg2, int arg3, class594 arg4, class167 arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -24929) {
            method1788((byte) -87);
        }
        field3795++;
        class297 var9 = class494.field6893.method1544(36, arg0);
        if (var9 == null || !var9.field3863 || !var9.method1822((byte) 86, class257.field3191)) {
            return;
        }
        if (var9.field3858 != null) {
            int[] var10 = new int[var9.field3858.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class621.field8952 == 4) {
                    var13 = (int) class521.field7250 & 0x3FFF;
                } else {
                    var13 = (int) class521.field7250 + class374.field5212 & 0x3FFF;
                }
                int var14 = class310.field3966[var13];
                int var15 = class310.field3965[var13];
                if (class621.field8952 != 4) {
                    var14 = var14 * 256 / (class54.field728 + 256);
                    var15 = var15 * 256 / (class54.field728 + 256);
                }
                var10[var11 * 2] = ((var9.field3858[var11 * 2] * 4 + arg2) * var15 + (var9.field3858[var11 * 2 + 1] * 4 + arg8) * var14 >> 14) + arg1.field6330 / 2 + arg7;
                var10[var11 * 2 + 1] = arg1.field6218 / 2 + arg6 - ((var9.field3858[var11 * 2 + 1] * 4 + arg8) * var15 - ((var9.field3858[var11 * 2] * 4 + arg2) * var14) >> 14);
            }
            class156.method849(arg5, var10, var9.field3893, arg1.field6288, arg1.field6216);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg5.method928(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field3883, 1, arg4, arg7, arg6);
            }
            arg5.method928(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3883, 1, arg4, arg7, arg6);
        }
        class116 var16 = null;
        if (var9.field3862 != -1) {
            var16 = var9.method1828(arg5, false, (byte) -128);
            if (var16 != null) {
                class310.method1865(arg6, 127, arg2, arg8, arg4, arg7, var16, arg1);
            }
        }
        if (var9.field3872 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method630();
        }
        class262 var18 = class332.field4584;
        class157 var19 = class389.field5395;
        if (var9.field3857 == 1) {
            var19 = class621.field8953;
            var18 = class522.field7281;
        }
        if (var9.field3857 == 2) {
            var18 = class95.field1282;
            var19 = class627.field9137;
        }
        class60.method347(arg2, var9.field3861, arg4, var19, arg8, var9.field3872, arg6, arg7, var17, false, arg1, var18);
        return;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method628(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        field3807++;
        class600 var10 = ((class54) arg6).field727;
        if (this.field3781) {
            float var11 = (float) this.method627();
            float var12 = (float) this.method631();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3793 * var15;
            float var18 = (float) this.field3793 * var16;
            float var19 = (float) this.field3783 * var13;
            float var20 = (float) this.field3783 * var14;
            float var21 = (float) this.field3802 * -var13;
            float var22 = (float) this.field3802 * -var14;
            float var23 = (float) this.field3780 * -var15;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field3780 * -var16;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field3782.method805(true, -81);
        this.field3804.method1898(true);
        this.field3804.method1884(this.field3782, -2);
        this.field3804.method1909(-128, 1);
        this.field3804.method1966(3000, 1);
        this.field3804.method1884(var10, -2);
        this.field3804.method1887(73, 7681, 8448);
        this.field3804.method1933(-105, 768, 0, 34168);
        this.field3804.method1905(3042, 1);
        float var27 = var10.field8676 / (float) var10.field8672;
        float var28 = var10.field8671 / (float) var10.field8669;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3782.field8671);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field8671 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field8671 - ((float) (-arg8) + arg5) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3782.field8676, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field8671 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field3782.field8676, this.field3782.field8671);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field8671 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3804.method1933(-97, 768, 0, 5890);
        this.field3804.method1909(-123, 0);
        this.field3804.method1884(null, -2);
        this.field3804.method1966(3000, 0);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
    public final int method637() {
        field3787++;
        return this.field3782.field8672;
    }

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "(IIIIII)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3794++;
        this.field3782.method2777(arg0, arg2, arg1, arg5, arg4, 0, arg3);
    }

    @OriginalMember(owner = "client!ab", name = "ma", descriptor = "()I")
    public final int method631() {
        field3806++;
        return this.field3782.field8669 + this.field3793 + this.field3780;
    }

    @OriginalMember(owner = "client!ab", name = "EA", descriptor = "()I")
    public final int method627() {
        field3796++;
        return this.field3782.field8672 - (-this.field3783 - this.field3802);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V")
    private final void method1794(int arg0, int arg1) {
        field3792++;
        this.field3804.method1966(arg1 ^ 0xBBA, 1);
        this.field3804.method1884(this.field3782, arg1 - 4);
        this.field3804.method1887(96, this.field3804.method1920(arg0, 92), 7681);
        this.field3804.method1933(-76, 768, 1, 34167);
        this.field3804.method1947(34162, 34168, 0, 770);
        if (arg1 != 2) {
            this.field3793 = -25;
        }
        this.field3804.method1966(arg1 + 2998, 0);
        this.field3804.method1884(this.field3784, -2);
        this.field3804.method1887(-104, 34479, 7681);
        this.field3804.method1933(-98, 768, 1, 34166);
        if (this.field3785 == 0) {
            this.field3804.method1921(1.0F, 0.5F, 0.0F, 0.5F, 61);
        } else if (this.field3785 == 1) {
            this.field3804.method1921(0.5F, 1.0F, 0.0F, 0.5F, 61);
        } else if (this.field3785 == 2) {
            this.field3804.method1921(0.5F, 0.5F, 0.0F, 1.0F, 61);
            return;
        } else if (this.field3785 == 3) {
            this.field3804.method1921(128.5F, 128.5F, 0.0F, 128.5F, 61);
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ln;Ljava/awt/Canvas;ZI)Lqa;")
    public static final class167 method1795(class473 arg0, Canvas arg1, boolean arg2, int arg3) {
        field3803++;
        if (arg3 == 0) {
            return arg2 ? new class609(arg1, arg0) : new class33(arg1, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Luq;IIII)V")
    public class292(class313 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3804 = arg0;
        this.field3782 = class106.method579(42, arg2, arg1, arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Luq;II[III)V")
    public class292(class313 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3804 = arg0;
        this.field3782 = class33.method191(arg3, true, arg2, false, arg0, arg1);
    }
}
