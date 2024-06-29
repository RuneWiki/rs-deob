import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class80 {

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "Lvj;")
    private class422 field821;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "Lmea;")
    private class72 field819;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "[B")
    public byte[] field814;

    @OriginalMember(owner = "client!haa", name = "v", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "Lad;")
    public static class19 field817 = new class19(64);

    @OriginalMember(owner = "client!haa", name = "x", descriptor = "I")
    public static int field833 = -1;

    @OriginalMember(owner = "client!haa", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field832 = new String[100];

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!haa", name = "q", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!haa", name = "r", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!haa", name = "s", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!haa", name = "y", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!haa", name = "u", descriptor = "[[I")
    public static int[][] field830;

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "[[I")
    public static int[][] field835;

    @OriginalMember(owner = "client!haa", name = "t", descriptor = "[[Llh;")
    private class129[][] field829;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V", line = 4)
    public final void method418(int arg0) {
        this.field829 = new class129[this.field831][this.field815];
        field816++;
        int var2 = -90 / ((arg0 + 62) / 47);
        for (int var3 = 0; var3 < this.field815; var3++) {
            for (int var4 = 0; var4 < this.field831; var4++) {
                this.field829[var4][var3] = new class129(this.field821, this, this.field819, var4, var3, this.field825, var4 * 128 + 1, var3 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V", line = 31)
    public static void method419(int arg0) {
        field835 = null;
        field817 = null;
        int var1 = -2 % ((29 - arg0) / 33);
        field832 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILha;I)Z", line = 43)
    public final boolean method420(int arg0, int arg1, class120 arg2, int arg3) {
        field823++;
        class102 var5 = (class102) arg2;
        int var6 = var5.field1097 + arg1 + 1;
        int var7 = var5.field1104 + arg0 + 1;
        int var8 = this.field812 * var6 + var7;
        int var9 = var5.field1101;
        if (arg3 < 117) {
            this.method425(27, 74, null, -32);
        }
        int var10 = var5.field1096;
        int var11 = this.field812 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field812 * var12;
            var9 -= var12;
            var6 = 1;
        }
        if (this.field820 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field820;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var10 -= var14;
            var11 += var14;
            var7 = 1;
        }
        if (this.field812 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field812;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field812 + var11;
            return class385.method2205(var16, this.field814, var17, 23511, var8, var9, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V", line = 118)
    public static final void method421(int arg0) {
        field827++;
        if (class619.field8759 != null) {
            return;
        }
        int var1 = class5.field57;
        int var2 = class434.field6130;
        int var3 = class338.field4245 - class146.field1618 - var1;
        if (arg0 != 0) {
            return;
        }
        int var4 = class533.field7491 - class338.field4244 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class503.field7242 != null) {
                var5 = class503.field7242;
            } else if (class591.field8347 == null) {
                var5 = class188.field2161;
            } else {
                var5 = class591.field8347;
            }
            int var6 = 0;
            int var7 = 0;
            if (class503.field7242 == var5) {
                Insets var8 = class503.field7242.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class533.field7491);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class338.field4245, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class338.field4245 - var3, var7, var3, class533.field7491);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class533.field7491 + var7 - var4, class338.field4245, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZIBII)V", line = 190)
    public static final void method422(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        field810++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class644.field9097 - class461.field6561) * var6 / 100 + class461.field6561;
        if (var7 < class558.field7965) {
            var7 = class558.field7965;
        } else if (var7 > class659.field9246) {
            var7 = class659.field9246;
        }
        int var8 = arg2 * 512 * var7 / (arg5 * 334);
        if (class225.field2782 > var8) {
            short var12 = class225.field2782;
            var7 = arg5 * 334 * var12 / (arg2 * 512);
            if (class659.field9246 < var7) {
                var7 = class659.field9246;
                int var13 = var7 * 512 * arg2 / (var12 * 334);
                int var14 = (arg5 - var13) / 2;
                if (arg1) {
                    class701.field9813.method1050();
                    class701.field9813.method3206(arg2, (byte) 104, arg4, arg0, -16777216, var14);
                    class701.field9813.method3206(arg2, (byte) 109, arg5 + arg4 - var14, arg0, -16777216, var14);
                }
                arg5 -= var14 * 2;
                arg4 += var14;
            }
        } else if (class383.field5171 < var8) {
            short var9 = class383.field5171;
            var7 = arg5 * var9 * 334 / (arg2 * 512);
            if (var7 < class558.field7965) {
                var7 = class558.field7965;
                int var10 = var9 * 334 * arg5 / (var7 * 512);
                int var11 = (arg2 - var10) / 2;
                if (arg1) {
                    class701.field9813.method1050();
                    class701.field9813.method3206(var11, (byte) 98, arg4, arg0, -16777216, arg5);
                    class701.field9813.method3206(var11, (byte) 89, arg4, arg0 + arg2 - var11, -16777216, arg5);
                }
                arg2 -= var11 * 2;
                arg0 += var11;
            }
        }
        class188.field2145 = arg0;
        class412.field5531 = arg2 * var7 / 334;
        if (arg3 == 14) {
            class42.field412 = arg4;
            class83.field858 = (short) arg5;
            class698.field9793 = (short) arg2;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILha;ZI)V", line = 284)
    public final void method423(int arg0, class120 arg1, boolean arg2, int arg3) {
        field822++;
        class102 var5 = (class102) arg1;
        int var6 = var5.field1097 + arg0 + 1;
        int var7 = var5.field1104 + arg3 + 1;
        int var8 = var7 + (this.field812 * var6);
        int var9 = 0;
        int var10 = var5.field1101;
        int var11 = var5.field1096;
        int var12 = this.field812 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field812 * var14;
            var6 = 1;
            var9 += var11 * var14;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field820) {
            int var15 = var6 + var10 + 1 - this.field820;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var13 += var16;
            var8 += var16;
            var7 = 1;
        }
        if (var7 + var11 >= this.field812) {
            int var17 = var7 - (-var11 - (1 - this.field812));
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class630.method3536(var9, var13, var8, var10, arg2, var5.field1095, var12, this.field814, var11);
            this.method428(var7, var6, var11, var10, arg2);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 356)
    public static final int method424(String arg0, int arg1) {
        field811++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 > -85) {
            field835 = null;
        }
        for (int var2 = 0; var2 < class699.field9804; var2++) {
            if (arg0.equalsIgnoreCase(class703.field9867[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(IILha;I)V", line = 384)
    public final void method425(int arg0, int arg1, class120 arg2, int arg3) {
        field824++;
        class102 var5 = (class102) arg2;
        int var6 = var5.field1104 + arg3 + 1;
        int var7 = var5.field1097 + arg0 + 1;
        int var8 = this.field812 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1101;
        if (arg1 <= 4) {
            return;
        }
        int var11 = var5.field1096;
        int var12 = this.field812 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field812 * var13;
            var9 += var11 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field820 <= (var7 + var10)) {
            int var15 = var7 + 1 - (-var10 - -this.field820);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var12 += var16;
            var6 = 1;
            var14 += var16;
            var11 -= var16;
        }
        if ((var6 + var11) >= this.field812) {
            int var17 = var11 + var6 + 1 - this.field812;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class571.method3230(var10, var5.field1095, -1, var14, var9, var8, var12, var11, this.field814);
            this.method428(var6, var7, var11, var10, false);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;I[BI)I", line = 457)
    public static final int method426(String arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 100) {
            field833 = 24;
        }
        field828++;
        int var4 = arg3;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class85.method445(92, arg0.charAt(var6));
            int var8 = (var6 + 1) < var5 ? class85.method445(arg1 - 28, arg0.charAt(var6 - -1)) : -1;
            int var9 = var5 <= (var6 + 2) ? -1 : class85.method445(arg1 - 31, arg0.charAt(var6 + 2));
            int var10 = var6 + 3 >= var5 ? -1 : class85.method445(120, arg0.charAt(var6 + 3));
            arg2[arg3++] = (byte) class422.method2436(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg2[arg3++] = (byte) class422.method2436(class105.method572(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg2[arg3++] = (byte) class422.method2436(class105.method572(3, var9) << 6, var10);
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([[ZZIZII)V", line = 507)
    public final void method427(boolean[][] arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field834++;
        this.field821.method2410(false, -103);
        this.field821.method2358(false, (byte) -64);
        this.field821.method2426(123, -2);
        this.field821.method2421(1, 1);
        this.field821.method2386(123, 1);
        float var7 = 1.0F / (float) (this.field821.field5823 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field815; var8++) {
                int var9 = var8 << this.field825;
                int var10 = var8 + 1 << this.field825;
                label136: for (int var11 = 0; var11 < this.field831; var11++) {
                    int var12 = var11 << this.field825;
                    int var13 = var11 + 1 << this.field825;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (-arg2 <= var14 - arg4 && arg2 >= (var14 - arg4)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg5) >= (-arg2) && (var15 - arg5) <= arg2 && arg0[var14 + arg2 - arg4][arg2 + var15 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field829[var11][var8].method732(-1);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field815; var16++) {
                int var17 = var16 << this.field825;
                int var18 = var16 + 1 << this.field825;
                for (int var19 = 0; var19 < this.field831; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field825;
                    int var22 = var19 + 1 << this.field825;
                    class209 var23 = this.field821.field5965;
                    var23.field1218 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg5 >= -arg2 && var24 - arg5 <= arg2) {
                            int var25 = this.field819.field3428 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((-arg2) <= (var26 - arg4) && arg2 >= var26 - arg4 && arg0[arg2 + var26 - arg4][arg2 + var24 - arg5]) {
                                    short[] var27 = this.field819.field707[var25];
                                    if (var27 != null) {
                                        if (this.field821.field5874) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method645(-672168216, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method667(13224, var27[var28] & 0xFFFF);
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
                        this.field829[var19][var16].method731(var20, var23.field1269, 5123, (byte) -57);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        if (arg3) {
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIZ)V", line = 691)
    private final void method428(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field818++;
        if (arg4) {
            this.field820 = -116;
        }
        if (this.field829 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg2 - 2 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class129[] var11 = this.field829[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1456 = true;
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZLoh;B)V", line = 738)
    public static final void method429(boolean arg0, class600 arg1, byte arg2) {
        field826++;
        if (class661.field9266 >= 400) {
            return;
        }
        class210 var3 = arg1.field8461;
        if (var3.field2492 != null) {
            var3 = var3.method1247((byte) 118, class628.field8859);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field2499) {
            return;
        }
        String var4 = var3.field2528;
        if (var3.field2527 != 0) {
            String var5 = class312.field3886 == class246.field3031 ? class198.field2315.method1195((byte) 62, class504.field7267) : class198.field2313.method1195((byte) 62, class504.field7267);
            var4 = var4 + class260.method1538(var3.field2527, false, class362.field4859.field2935) + " (" + var5 + var3.field2527 + ")";
        }
        if (class348.field4665 && !arg0) {
            class166 var6 = class616.field8673 == -1 ? null : class53.field531.method1562(class616.field8673, (byte) -108);
            if ((class512.field7345 & 0x2) != 0 && (var6 == null || var3.method1248(255, var6.field1859, class616.field8673) != var6.field1859)) {
                class63.field635++;
                class53.method279(-1, 0, class679.field9566 + " -> <col=ffff00>" + var4, (long) arg1.field9434, 121, true, 16, class286.field3580, false, class185.field2084, 0);
            }
        }
        if (!arg0) {
            String[] var7 = var3.field2505;
            if (class72.field747) {
                var7 = class416.method2340(0, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field2494 == 0 || !var7[var8].equalsIgnoreCase(class198.field2308.method1195((byte) 62, class504.field7267)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 20;
                        }
                        int var10 = class329.field4032;
                        if (var8 == 1) {
                            var9 = 18;
                        }
                        if (var8 == 2) {
                            var9 = 48;
                        }
                        if (var8 == 3) {
                            var9 = 13;
                        }
                        if (var3.field2523 == var8) {
                            var10 = var3.field2506;
                        }
                        if (var8 == 4) {
                            var9 = 6;
                        }
                        if (var3.field2474 == var8) {
                            var10 = var3.field2520;
                        }
                        class53.method279(-1, 0, "<col=ffff00>" + var4, (long) arg1.field9434, 112, true, var9, var7[var8], false, var7[var8].equalsIgnoreCase(class198.field2308.method1195((byte) 62, class504.field7267)) ? var3.field2545 : var10, 0);
                        class698.field9796++;
                    }
                }
            }
            if (var3.field2494 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class198.field2308.method1195((byte) 62, class504.field7267))) {
                        short var12 = 0;
                        if (var3.field2527 > class362.field4859.field2935) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 20;
                        }
                        if (var11 == 1) {
                            var13 = 18;
                        }
                        if (var11 == 2) {
                            var13 = 48;
                        }
                        if (var11 == 3) {
                            var13 = 13;
                        }
                        if (var11 == 4) {
                            var13 = 6;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class53.method279(-1, 0, "<col=ffff00>" + var4, (long) arg1.field9434, 112, true, var13, var7[var11], false, var3.field2545, 0);
                        class14.field118++;
                    }
                }
            }
        }
        class61.field630++;
        class53.method279(-1, 0, "<col=ffff00>" + var4, (long) arg1.field9434, 126, true, 1006, class198.field2307.method1195((byte) 62, class504.field7267), arg0, class469.field6707, 0);
        int var14 = 124 % ((89 - arg2) / 36);
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lvj;Lmea;)V", line = 914)
    public class80(class422 arg0, class72 arg1) {
        this.field821 = arg0;
        this.field819 = arg1;
        this.field812 = (this.field819.field3428 * this.field819.field3424 >> this.field821.field5818) + 2;
        this.field820 = (this.field819.field3426 * this.field819.field3424 >> this.field821.field5818) + 2;
        this.field825 = this.field821.field5818 + 7 - this.field819.field3430;
        this.field814 = new byte[this.field820 * this.field812];
        this.field831 = this.field819.field3428 >> this.field825;
        this.field815 = this.field819.field3426 >> this.field825;
    }
}
