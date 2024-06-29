import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class124 extends class37 implements class338 {

    @OriginalMember(owner = "client!op", name = "R", descriptor = "Ldm;")
    public class37 field1828;

    @OriginalMember(owner = "client!op", name = "O", descriptor = "[I")
    public static int[] field1825 = new int[1];

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!op", name = "T", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!op", name = "U", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!op", name = "V", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!op", name = "W", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!op", name = "X", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!op", name = "Y", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!op", name = "Z", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "Lpc;")
    public static class473 field1821;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(Z)V")
    public static final void method904(boolean arg0) {
        field1817++;
        if (arg0) {
            method909(-121);
        }
        class378 var1 = (class378) class511.field7294.method1672((byte) -105);
        boolean var2 = class484.field6735 != null || class78.field1175 > 0;
        if (var2) {
            class347.field4686 = 1;
        }
        if (class39.field597 && class32.field523.method305(81, (byte) 59) && class412.field5693 > 2) {
            if (var2) {
                class44.field663 = (class39) class415.field5733.field3684.field630.field630;
            } else {
                class355.method2075(var1.method255(109), 82, var1.method263((byte) -128), (class39) class415.field5733.field3684.field630.field630);
            }
        } else if (var2) {
            class44.field663 = (class39) class415.field5733.field3684.field630;
        } else {
            class355.method2075(var1.method255(105), 82, var1.method263((byte) -124), (class39) class415.field5733.field3684.field630);
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)I")
    public final int method345(int arg0) {
        if (arg0 != -1736) {
            this.field1828 = null;
        }
        field1822++;
        return 0;
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        field1832++;
        return arg0 >= -8 ? false : false;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
    public static final void method905(Object[] arg0, byte arg1, long[] arg2) {
        field1819++;
        if (arg1 != -114) {
            method908(-47);
        }
        class365.method2131(arg2, arg0, 0, arg2.length - 1, 28946);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILqa;)V")
    public final void method337(int arg0, class162 arg1) {
        if (arg0 != -7803) {
            field1821 = null;
        }
        field1814++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II[FIIII)V")
    public static final void method906(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field1830++;
        if (arg1 > 0 && !class227.method1418((byte) 10, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class227.method1418((byte) -121, arg3)) {
            int var7 = class232.method1444(true, arg4);
            int var8 = 0;
            if (arg6 != -1) {
                field1821 = null;
            }
            int var9 = arg3 <= arg1 ? arg3 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var8, arg5, arg1, arg3, 0, arg4, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg3 = var11;
                arg1 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!op", name = "e", descriptor = "(B)V")
    public static void method907(byte arg0) {
        if (arg0 != 68) {
            field1821 = null;
        }
        field1821 = null;
        field1825 = null;
    }

    @OriginalMember(owner = "client!op", name = "g", descriptor = "(I)Lof;")
    public static final class437 method908(int arg0) {
        if (arg0 > -96) {
            method909(5);
        }
        field1812++;
        class437 var1 = (class437) class97.field1466.method1767((byte) -17);
        if (var1 == null) {
            return new class437();
        } else {
            class51.field792--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != 1) {
            this.field1828 = null;
        }
        field1829++;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 != -4534) {
            this.method347((byte) -15);
        }
        field1818++;
        return 0;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        if (arg0 == 9124) {
            field1813++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!op", name = "h", descriptor = "(I)V")
    public static final void method909(int arg0) {
        field1835++;
        if (class297.field3882 != null) {
            return;
        }
        int var1 = class224.field3023;
        int var2 = class269.field3539;
        int var3 = class184.field2617 - (class149.field2132 + var1);
        if (arg0 != 3545) {
            field1825 = null;
        }
        int var4 = class445.field6092 - var2 - class175.field2555;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class273.field3572 == null) {
                var5 = class389.field5281.field2917;
            } else {
                var5 = class273.field3572;
            }
            int var6 = 0;
            int var7 = 0;
            if (class273.field3572 == var5) {
                Insets var8 = class273.field3572.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class445.field6092);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class184.field2617, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class184.field2617 + var6 - var3, var7, var3, class445.field6092);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class445.field6092 + var7 - var4, class184.field2617, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvp;")
    public static final class123 method910(Throwable arg0, String arg1) {
        field1816++;
        class123 var2;
        if (arg0 instanceof class123) {
            var2 = (class123) arg0;
            var2.field1806 = var2.field1806 + ' ' + arg1;
        } else {
            var2 = new class123(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        int var2 = -80 / ((56 - arg0) / 52);
        field1815++;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        field1834++;
        if (arg0 != 54) {
            field1825 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)I")
    public final int method285(byte arg0) {
        field1826++;
        if (arg0 < 113) {
            field1821 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lqa;I)V")
    public final void method340(class162 arg0, int arg1) {
        field1824++;
        if (arg1 != 20203) {
            this.method125(true);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIIIIIIILdm;)V")
    public class124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class37 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class163.method1106(arg1, arg0, 29128));
        this.field1828 = arg10;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        field1823++;
        if (!arg1) {
            this.method344(-50);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        field1820++;
        if (arg0 != -1) {
            this.method285((byte) 43);
        }
        return false;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLqa;I)Lc;")
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 == -102) {
            field1833++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        field1831++;
        if (!arg0) {
            method908(111);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)I")
    public final int method347(byte arg0) {
        field1827++;
        if (arg0 != -87) {
            this.field1828 = null;
        }
        return 0;
    }
}
