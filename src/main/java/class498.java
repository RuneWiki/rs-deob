import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class498 extends class77 {

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lbl;")
    private class442 field7551;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lsl;")
    private class304 field7559;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Z")
    public static boolean field7560 = false;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lhf;")
    public static class260 field7547;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Z")
    public static final boolean method2990(int arg0, int arg1) {
        field7555++;
        if (arg1 == 28799) {
            return arg0 != 1 && arg0 != 7;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public static final void method2991(byte arg0) {
        for (class2 var1 = (class2) class329.field4932.method8((byte) -98); var1 != null; var1 = (class2) class329.field4932.method17((byte) -96)) {
            if (class195.method1219((byte) 5, var1.field17)) {
                class234.method1410(var1, 25438);
            }
        }
        if (arg0 != -22) {
            field7560 = false;
        }
        field7556++;
        if (class330.field4948 == 1) {
            class381.field5555 = false;
            class323.method2017(class120.field2001, class481.field7344, true, class218.field3358, class170.field2647);
            return;
        }
        class323.method2017(class120.field2001, class481.field7344, true, class218.field3358, class170.field2647);
        int var2 = class512.field7764.method2349(class14.field152.method2473(class406.field5898, -94), 0);
        for (class2 var3 = (class2) class329.field4932.method8((byte) -98); var3 != null; var3 = (class2) class329.field4932.method17((byte) -84)) {
            int var4 = class183.method1146((byte) 48, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class481.field7344 = class330.field4948 * 16 + (class504.field7624 ? 26 : 22);
        class218.field3358 = var2 + 8;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lsl;BLsl;F)Z")
    public final boolean method2992(class304 arg0, byte arg1, class304 arg2, float arg3) {
        field7548++;
        boolean var5 = true;
        class96 var6 = this.field7551.field6742;
        class96 var7 = this.field7551.field6770;
        if (this.field7551.field6731.field3970 != arg0.field4618 || this.field7551.field6731.field3968 != arg0.field4618) {
            this.field7551.field6731 = new class262(this.field7551, 3553, 6408, arg0.field4618, arg0.field4618);
        }
        if (this.field7551.field6752.field3970 != arg2.field4618 || this.field7551.field6752.field3968 != arg2.field4618) {
            this.field7551.field6752 = new class262(this.field7551, 3553, 6408, arg2.field4618, arg2.field4618);
        }
        this.field7551.method1936(class78.field1380);
        this.field7551.method1966();
        this.field7551.method2588((byte) 61);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field7559.field4618, this.field7559.field4618);
        this.field7551.method2609(true, false);
        this.field7551.method2600((byte) -49, false);
        this.field7551.method2602(false, false);
        this.field7551.method2598(30674, false);
        this.field7551.method2650((byte) -101, -2);
        this.field7551.method2582((byte) -10, 1);
        this.field7551.method2636(0.0F, 110, 0.0F, 0.0F, arg3);
        this.field7551.method2624((byte) 107, 34165, 34165);
        this.field7551.method2586(null, false);
        this.field7551.method2582((byte) -34, 0);
        this.field7551.method2610(0, 1);
        this.field7551.method2586(null, false);
        int var8 = 0;
        while (var8 < 6) {
            this.field7551.method2592(var6, 35);
            int var9 = var8 + 34069;
            var6.method734(var9, -1, 0, arg0);
            this.field7551.method2596(var7, -4);
            var7.method724(arg1 - 94, 0, this.field7551.field6731);
            if (var6.method719(-1) && var7.method719(-1)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg0.field4618, arg0.field4618, 0, 0, arg0.field4618, arg0.field4618, 16384, 9728);
                var6.method734(var9, -1, 0, arg2);
                var7.method724(4, 0, this.field7551.field6752);
                if (var6.method719(arg1 - 99) && var7.method719(-1)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg0.field4618, arg0.field4618, 0, 0, arg0.field4618, arg0.field4618, 16384, 9728);
                    var6.method728(false, 0);
                    this.field7551.method2619(var6, 25087);
                    var7.method728(false, 0);
                    this.field7551.method2595(true, var7);
                    this.field7551.method2612(-53, var6);
                    var6.method734(var9, -1, 0, this.field7559);
                    if (!var6.method719(-1)) {
                        var6.method728(false, 0);
                        var5 = false;
                        this.field7551.method2591((byte) 51, var6);
                        break;
                    }
                    this.field7551.method2582((byte) 119, 1);
                    this.field7551.method2586(this.field7551.field6752, false);
                    this.field7551.method2582((byte) 24, 0);
                    this.field7551.method2586(this.field7551.field6731, false);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    this.field7551.method2582((byte) -124, 1);
                    this.field7551.method2586(null, false);
                    this.field7551.method2582((byte) 123, 0);
                    this.field7551.method2586(null, false);
                    var6.method728(false, 0);
                    this.field7551.method2591((byte) 51, var6);
                    var8++;
                    continue;
                }
                var6.method728(false, 0);
                this.field7551.method2619(var6, 25087);
                var7.method728(false, 0);
                var5 = false;
                this.field7551.method2595(true, var7);
                break;
            }
            var6.method728(false, 0);
            this.field7551.method2619(var6, 25087);
            var7.method728(false, 0);
            this.field7551.method2595(true, var7);
            var5 = false;
            break;
        }
        if (arg1 != 98) {
            this.method2992(null, (byte) -45, null, -0.45714644F);
        }
        this.field7551.method2582((byte) 28, 1);
        this.field7551.method2624((byte) 107, 8448, 8448);
        this.field7551.method2582((byte) 125, 0);
        OpenGL.glPopAttrib();
        this.field7551.method1982(class78.field1380[0], class78.field1380[1], class78.field1380[2], class78.field1380[3]);
        if (var5) {
            this.field7559.method1205((byte) 80);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([[BBLq;)V")
    public static final void method2993(byte[][] arg0, byte arg1, class282 arg2) {
        field7550++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg1 != 0) {
            field7547 = null;
        }
        for (int var4 = 0; var4 < arg2.field4299; var4++) {
            class233.method1400(false);
            for (int var5 = 0; var5 < (class150.field2422 >> 3); var5++) {
                for (int var6 = 0; var6 < (class21.field272 >> 3); var6++) {
                    boolean var7 = false;
                    int var8 = class420.field6038[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x350DE6A) >> 24;
                        if (!arg2.field4301 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class61.field1032.length; var14++) {
                                if (class61.field1032[var14] == var13 && arg0[var14] != null) {
                                    class40 var15 = new class40(arg0[var14]);
                                    arg2.method1725(var6 * 8, var15, var12, var10, (byte) 24, var4, var9, var11, var5 * 8, class91.field1641);
                                    var7 = true;
                                    arg2.method1718(var11, var15, var6 * 8, class345.field5116, var3[0] == -1 ? var3 : null, 106, var12, var10, var5 * 8, var4, var9);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg2.method1737(var5 * 8, 8, -14, var4, 8, var6 * 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class96.field1741 = class466.field7155.method2552(var3[3], (byte) 65, class507.field7670, var3[1], var3[2], var3[0]);
            class366.field5378 = var3[4];
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BFFF)F")
    public static final float method2994(byte arg0, float arg1, float arg2, float arg3) {
        if (arg0 > -76) {
            method2993(null, (byte) -103, null);
        }
        field7549++;
        return (arg2 - arg3) * arg1 + arg3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lsl;")
    public final class304 method423(int arg0) {
        if (arg0 == 37) {
            field7552++;
            return this.field7559;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method2995(boolean arg0) {
        field7547 = null;
        if (arg0) {
            method2996(null, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lia;B)V")
    public static final void method2996(class399 arg0, byte arg1) {
        field7557++;
        int var2 = 0;
        arg0.method2367(8);
        if (arg1 != -101) {
            field7547 = null;
        }
        for (int var3 = 0; var3 < class328.field4921; var3++) {
            int var15 = class280.field4247[var3];
            if ((class402.field5850[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class402.field5850[var15] = (byte) class318.method1973(class402.field5850[var15], 2);
                } else {
                    int var16 = arg0.method2364(1, true);
                    if (var16 == 0) {
                        var2 = class434.method2537((byte) 0, arg0);
                        class402.field5850[var15] = (byte) class318.method1973(class402.field5850[var15], 2);
                    } else {
                        class132.method878(arg0, -125, var15);
                    }
                }
            }
        }
        arg0.method2373(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2367(8);
        for (int var4 = 0; var4 < class328.field4921; var4++) {
            int var13 = class280.field4247[var4];
            if ((class402.field5850[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class402.field5850[var13] = (byte) class318.method1973(class402.field5850[var13], 2);
                } else {
                    int var14 = arg0.method2364(1, true);
                    if (var14 == 0) {
                        var2 = class434.method2537((byte) 0, arg0);
                        class402.field5850[var13] = (byte) class318.method1973(class402.field5850[var13], 2);
                    } else {
                        class132.method878(arg0, -124, var13);
                    }
                }
            }
        }
        arg0.method2373(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2367(8);
        for (int var5 = 0; var5 < class18.field246; var5++) {
            int var11 = class56.field938[var5];
            if ((class402.field5850[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class402.field5850[var11] = (byte) class318.method1973(class402.field5850[var11], 2);
                } else {
                    int var12 = arg0.method2364(1, true);
                    if (var12 == 0) {
                        var2 = class434.method2537((byte) 0, arg0);
                        class402.field5850[var11] = (byte) class318.method1973(class402.field5850[var11], 2);
                    } else if (class218.method1336(arg0, 2, var11)) {
                        class402.field5850[var11] = (byte) class318.method1973(class402.field5850[var11], 2);
                    }
                }
            }
        }
        arg0.method2373(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2367(8);
        for (int var6 = 0; var6 < class18.field246; var6++) {
            int var9 = class56.field938[var6];
            if ((class402.field5850[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class402.field5850[var9] = (byte) class318.method1973(class402.field5850[var9], 2);
                } else {
                    int var10 = arg0.method2364(1, true);
                    if (var10 == 0) {
                        var2 = class434.method2537((byte) 0, arg0);
                        class402.field5850[var9] = (byte) class318.method1973(class402.field5850[var9], 2);
                    } else if (class218.method1336(arg0, 2, var9)) {
                        class402.field5850[var9] = (byte) class318.method1973(class402.field5850[var9], 2);
                    }
                }
            }
        }
        arg0.method2373(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class18.field246 = 0;
        class328.field4921 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class402.field5850[var7] = (byte) (class402.field5850[var7] >> 1);
            class47 var8 = class224.field3450[var7];
            if (var8 == null) {
                class56.field938[class18.field246++] = var7;
            } else {
                class280.field4247[class328.field4921++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)I")
    public final int method2997(int arg0) {
        if (arg0 != 8) {
            method2995(true);
        }
        field7553++;
        return this.field7559.field4618;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lbl;I)V")
    public class498(class442 arg0, int arg1) {
        this.field7551 = arg0;
        this.field7559 = new class304(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILbl;IIIB)Ljs;")
    public static final class208 method2998(int arg0, class442 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field7558++;
        int var6 = 53 / ((arg5 + 9) / 51);
        if (!arg1.field6727 && (!class110.method789(arg3, 1135345664) || !class110.method789(arg0, 1135345664))) {
            return arg1.field6713 ? new class208(arg1, 34037, arg4, arg2, arg3, arg0, true) : new class208(arg1, arg4, arg2, arg3, arg0, class99.method749(arg3, -23866), class99.method749(arg0, -23866), true);
        } else {
            return new class208(arg1, 3553, arg4, arg2, arg3, arg0, true);
        }
    }
}
