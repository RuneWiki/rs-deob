import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class215 extends class460 {

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Z")
    private boolean field2515 = false;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lqda;")
    private class93 field2524;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2516 = 0;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lws;")
    public static class333 field2525 = new class333();

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lhca;")
    public static class457 field2513;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        if (arg0 != 0) {
            field2513 = null;
        }
        ++field2526;
        if (!this.field2515) {
            super.field5744.method3127(0, 770, 5890, 17111);
        } else {
            this.field2524.method688((byte) 67, '\u0001');
            super.field5744.method3126(1, -68);
            super.field5744.method3194((byte) 75, (class185) null);
            super.field5744.method3126(0, arg0 ^ -70);
        }
        super.field5744.method3185(8448, 8448, (byte) -86);
        this.field2515 = false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        ++field2522;
        if (arg0 > 100) {
            super.field5744.method3185(8448, 7681, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILbt;III)V")
    public static final void method1249(int arg0, class40 arg1, int arg2, int arg3, int arg4) {
        ++field2521;
        long var5 = (long) (arg0 << 28 | arg3 << 14 | arg4);
        class62 var7 = (class62) class370.field4774.method3828(var5, (byte) -91);
        if (arg2 != 28469) {
            method1249(-121, (class40) null, -99, 4, 24);
        }
        if (var7 == null) {
            class62 var8 = new class62();
            class370.field4774.method3832(var8, var5, 57);
            var8.field766.method1904(arg1, arg2 ^ -28529);
        } else {
            class68 var9 = class504.field6287.method1628(arg1.field580, (byte) -126);
            int var10 = var9.field864;
            if (~var9.field843 == -2) {
                var10 = (arg1.field578 + 1) * var10;
            }
            for (class40 var11 = (class40) var7.field766.method1909(true); var11 != null; var11 = (class40) var7.field766.method1916((byte) 120)) {
                class68 var12 = class504.field6287.method1628(var11.field580, (byte) -82);
                int var13 = var12.field864;
                if (var12.field843 == 1) {
                    var13 = (var11.field578 + 1) * var13;
                }
                if (var13 < var10) {
                    class628.method3510(-110, arg1, var11);
                    return;
                }
            }
            var7.field766.method1904(arg1, -85);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[II[JI)V")
    public static final void method1250(int arg0, int[] arg1, int arg2, long[] arg3, int arg4) {
        if (arg2 < arg4) {
            int var5 = (arg2 - -arg4) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            int var10 = var7 != Long.MAX_VALUE ? 1 : 0;
            for (int var11 = arg2; ~var11 > ~arg4; ++var11) {
                if (~arg3[var11] > ~((long) (var11 & var10) + var7)) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method1250(-105, arg1, arg2, arg3, var6 + -1);
            method1250(-120, arg1, var6 + 1, arg3, arg4);
        }
        ++field2519;
        if (arg0 > -82) {
            method1252(-23);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljaa;)V")
    public class215(class576 arg0) {
        super(arg0);
        if (arg0.field7628) {
            this.field2524 = new class93(arg0, 2);
            this.field2524.method684(0, (byte) -126);
            super.field5744.method3126(1, -45);
            super.field5744.method3185(34165, 7681, (byte) -45);
            super.field5744.method3175(34168, 1, 2, 770);
            super.field5744.method3127(0, 770, 34167, 17111);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5744.method3126(0, -76);
            this.field2524.method690(true);
            this.field2524.method684(1, (byte) -125);
            super.field5744.method3126(1, -31);
            super.field5744.method3185(8448, 8448, (byte) 51);
            super.field5744.method3175(34166, 1, 2, 770);
            super.field5744.method3127(0, 770, 5890, 17111);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5744.method3126(0, -49);
            this.field2524.method690(true);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        super.field5744.method3194((byte) 75, arg2);
        ++field2523;
        super.field5744.method3134(122, arg0);
        int var4 = 94 % ((arg1 - 25) / 59);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1251(int arg0) {
        ++field2514;
        if (class90.field1174 == null) {
            int var1 = class151.field1799;
            int var2 = class398.field5063;
            if (arg0 >= 62) {
                int var3 = -var1 + class578.field7765 + -class309.field3890;
                int var4 = -class491.field6129 + class200.field2327 + -var2;
                if (var1 > 0 || ~var3 < -1 || ~var2 < -1 || ~var4 < -1) {
                    try {
                        Container var5;
                        if (class338.field4326 == null) {
                            if (class95.field1241 == null) {
                                var5 = class699.field9680;
                            } else {
                                var5 = class95.field1241;
                            }
                        } else {
                            var5 = class338.field4326;
                        }
                        int var6 = 0;
                        int var7 = 0;
                        if (class338.field4326 == var5) {
                            Insets var8 = class338.field4326.getInsets();
                            var7 = var8.top;
                            var6 = var8.left;
                        }
                        Graphics var9 = var5.getGraphics();
                        var9.setColor(Color.black);
                        if (var1 > 0) {
                            var9.fillRect(var6, var7, var1, class200.field2327);
                        }
                        if (var2 > 0) {
                            var9.fillRect(var6, var7, class578.field7765, var2);
                        }
                        if (var3 > 0) {
                            var9.fillRect(-var3 + class578.field7765 + var6, var7, var3, class200.field2327);
                        }
                        if (var4 > 0) {
                            var9.fillRect(var6, var7 - (-class200.field2327 + var4), class578.field7765, var4);
                            return;
                        }
                    } catch (Exception var10) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public static void method1252(int arg0) {
        field2525 = null;
        field2513 = null;
        if (arg0 != 4658) {
            method1252(-41);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        ++field2518;
        if (arg0 != -24566) {
            this.method13(false, -117);
        }
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        ++field2517;
        class51 var3 = super.field5744.method3187((byte) -32);
        if (this.field2524 != null && var3 != null && arg0) {
            this.field2524.method688((byte) 70, '\u0000');
            super.field5744.method3126(1, -51);
            super.field5744.method3194((byte) 75, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5744.field7670.method585(arg1 + 32461), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5744.method3126(0, -44);
            this.field2515 = true;
        } else {
            super.field5744.method3127(0, 770, 34168, 17111);
        }
        if (arg1 != -32460) {
            method1251(-93);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (arg2 < -110) {
            ++field2520;
        }
    }
}
