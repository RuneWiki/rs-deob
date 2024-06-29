import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class8 extends class99 {

    @OriginalMember(owner = "client!j", name = "T", descriptor = "[I")
    public static int[] field75 = new int[5];

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lr;")
    public static class66 field72 = class93.method641(43, "cookiehost");

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Lnj;")
    public static class230 field80 = new class230(128);

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "Z")
    public static boolean field87 = false;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "[[[B")
    public static byte[][][] field88;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIB)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 > -58) {
            field75 = null;
        }
        class261.field4604[0].method162(arg3, arg0);
        ++field79;
        class261.field4604[1].method162(arg3, arg0 - (-arg4 + 16));
        int var6 = (arg4 - 32) * arg4 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (-var6 + arg4 + -32) * arg1 / (-arg4 + arg2);
        class235.method1558(arg3, arg0 + 16, 16, arg4 - 32, class201.field3461);
        class235.method1558(arg3, arg0 + 16 + var7, 16, var6, class47.field859);
        class235.method1550(arg3, 16 - -var7 + arg0, var6, class241.field4207);
        class235.method1550(arg3 + 1, var7 + 16 + arg0, var6, class241.field4207);
        class235.method1547(arg3, arg0 + var7 + 16, 16, class241.field4207);
        class235.method1547(arg3, arg0 + 17 - -var7, 16, class241.field4207);
        class235.method1550(arg3 - -15, arg0 + 16 + var7, var6, class195.field3367);
        class235.method1550(arg3 + 14, arg0 - -var7 + 17, var6 + -1, class195.field3367);
        class235.method1547(arg3, arg0 + 15 + var7 + var6, 16, class195.field3367);
        class235.method1547(arg3 + 1, arg0 + 14 + var6 + var7, 15, class195.field3367);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(BI)V")
    private final void method30(byte arg0, int arg1) {
        ++field81;
        this.field77 = arg1 >> 4 & 4080;
        this.field86 = (16711680 & arg1) >> 12;
        this.field74 = 4080 & arg1 << 4;
        if (arg0 > -45) {
            this.method37(64, true);
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static void method31(int arg0) {
        field88 = null;
        field72 = null;
        field75 = null;
        field80 = null;
        if (arg0 >= -58) {
            field87 = false;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class8() {
        this(0);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(III)V")
    public static final void method32(int arg0, int arg1, int arg2) {
        class249.field4374 = true;
        class26.field331 = arg0;
        class131.field2434 = arg1;
        class184.field3220 = arg2;
        class54.field945 = -1;
        class64.field1267 = -1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lcj;IIB)[Ljb;")
    public static final class256[] method33(class28 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 13) {
            field87 = true;
        }
        ++field76;
        return !class31.method174(-29381, arg2, arg0, arg1) ? null : class68.method497(-21477);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V")
    private class8(int arg0) {
        super(0, false);
        this.method30((byte) -79, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lwj;I)V")
    public static final void method34(class237 arg0, int arg1) {
        class43.method311(arg0, (byte) 124, 200000);
        if (arg1 != 16) {
            field87 = true;
        }
        ++field85;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)Z")
    public static final boolean method35(int arg0, int arg1, int arg2, int arg3) {
        if (!class28.method158(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class230.method1504(var4 + 1, class30.field453[arg0][arg1][arg2] + arg3, var5 + 1) && class230.method1504(var4 + 128 - 1, class30.field453[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class230.method1504(var4 + 128 - 1, class30.field453[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class230.method1504(var4 + 1, class30.field453[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lna;IIIIIIZ)V")
    public static final void method36(class213 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3666.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field3666[var9] - class171.field3036;
            int var23 = arg0.field3657[var9] - class142.field2603;
            int var24 = arg0.field3663[var9] - class30.field455;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3650 != null) {
                class213.field3662[var9] = var25;
                class213.field3652[var9] = var28;
                class213.field3653[var9] = var29;
            }
            class213.field3660[var9] = (var25 << 9) / var29 + class123.field2323;
            class213.field3659[var9] = (var28 << 9) / var29 + class123.field2319;
        }
        class123.field2312 = 0;
        int var10 = arg0.field3655.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field3655[var11];
            int var13 = arg0.field3651[var11];
            int var14 = arg0.field3667[var11];
            int var15 = class213.field3660[var12];
            int var16 = class213.field3660[var13];
            int var17 = class213.field3660[var14];
            int var18 = class213.field3659[var12];
            int var19 = class213.field3659[var13];
            int var20 = class213.field3659[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class249.field4374 && class154.method1052(class131.field2434 + class123.field2323, class184.field3220 + class123.field2319, var18, var19, var20, var15, var16, var17)) {
                    class54.field945 = arg5;
                    class64.field1267 = arg6;
                }
                if (!arg7) {
                    class123.field2316 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class123.field2327 || var16 > class123.field2327 || var17 > class123.field2327) {
                        class123.field2316 = true;
                    }
                    if (arg0.field3650 != null && arg0.field3650[var11] != -1) {
                        if (class15.field200) {
                            if (arg0.field3665) {
                                class123.method833(var18, var19, var20, var15, var16, var17, arg0.field3671[var11], arg0.field3670[var11], arg0.field3664[var11], class213.field3662[0], class213.field3662[1], class213.field3662[3], class213.field3652[0], class213.field3652[1], class213.field3652[3], class213.field3653[0], class213.field3653[1], class213.field3653[3], arg0.field3650[var11]);
                            } else {
                                class123.method833(var18, var19, var20, var15, var16, var17, arg0.field3671[var11], arg0.field3670[var11], arg0.field3664[var11], class213.field3662[var12], class213.field3662[var13], class213.field3662[var14], class213.field3652[var12], class213.field3652[var13], class213.field3652[var14], class213.field3653[var12], class213.field3653[var13], class213.field3653[var14], arg0.field3650[var11]);
                            }
                        } else {
                            int var21 = class123.field2318.method411(arg0.field3650[var11], 6);
                            class123.method850(var18, var19, var20, var15, var16, var17, class163.method1098(var21, arg0.field3671[var11]), class163.method1098(var21, arg0.field3670[var11]), class163.method1098(var21, arg0.field3664[var11]));
                        }
                    } else if (arg0.field3671[var11] != 12345678) {
                        class123.method850(var18, var19, var20, var15, var16, var17, arg0.field3671[var11], arg0.field3670[var11], arg0.field3664[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field84;
        if (~arg1 == -1) {
            this.method30((byte) -84, arg0.method1648((byte) -52));
        }
        if (arg2 != -1) {
            field87 = true;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            field80 = null;
        }
        ++field82;
        int[][] var3 = super.field1946.method823(arg0, (byte) -20);
        if (super.field1946.field2297) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class199.field3432; ++var7) {
                var4[var7] = this.field86;
                var5[var7] = this.field77;
                var6[var7] = this.field74;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/awt/Color;Lr;ZI)V")
    public static final void method38(int arg0, Color arg1, class66 arg2, boolean arg3, int arg4) {
        ++field78;
        try {
            Graphics var5 = class131.field2452.getGraphics();
            if (class198.field3423 == null) {
                class198.field3423 = new Font("Helvetica", 1, 13);
                class143.field2609 = class131.field2452.getFontMetrics(class198.field3423);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class19.field257, class12.field143);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class86.field1691 == null) {
                    class86.field1691 = class131.field2452.createImage(304, 34);
                }
                if (arg4 != 23189) {
                    method35(125, -44, -120, -27);
                }
                Graphics var6 = class86.field1691.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var6.setFont(class198.field3423);
                var6.setColor(Color.white);
                arg2.method453((-arg2.method461((byte) 101, class143.field2609) + 304) / 2, 22, var6, -42);
                var5.drawImage(class86.field1691, class19.field257 / 2 + -152, class12.field143 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class19.field257 / 2 + -152;
                int var8 = class12.field143 / 2 + -18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 - -2, var8 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 + 2, -(arg0 * 3) + 300, 30);
                var5.setFont(class198.field3423);
                var5.setColor(Color.white);
                arg2.method453((-arg2.method461((byte) 117, class143.field2609) + 304) / 2 + var7, var8 + 22, var5, -85);
            }
            if (class17.field237 != null) {
                var5.setFont(class198.field3423);
                var5.setColor(Color.white);
                class17.field237.method453(class19.field257 / 2 - class17.field237.method461((byte) 91, class143.field2609) / 2, class12.field143 / 2 + -26, var5, arg4 ^ -23214);
            }
        } catch (Exception var10) {
            class131.field2452.repaint();
        }
    }
}
