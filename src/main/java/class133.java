import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class133 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lej;")
    public static class51 field1990;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[[[Lpc;")
    public static class22[][][] field1999;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method986(Component arg0, boolean arg1) {
        field1989++;
        arg0.addMouseListener(class240.field3813);
        arg0.addMouseMotionListener(class240.field3813);
        arg0.addFocusListener(class240.field3813);
        if (arg1) {
            method994(50);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != -10531) {
            method994(-98);
        }
        field2002++;
        for (int var9 = 0; var9 < class183.field2895.field4783; var9++) {
            if (class183.field2895.method1991(false, var9)) {
                int[] var10 = class92.field1467.method2033(class183.field2895.field4796[var9] >> 14 & 0x3FFF, 0, class183.field2895.field4796[var9] & 0x3FFF, class183.field2895.field4796[var9] >> 28 & 0x3);
                if (var10 != null) {
                    int var11 = var10[1] - class147.field2165;
                    int var12 = class92.field1475 - (1 - class141.field2107) - var10[2];
                    int var13 = (arg8 - arg3) * (var12 - arg5) / (arg2 - arg5) + arg3;
                    int var14 = (arg6 - arg0) * (var11 - arg4) / (arg7 - arg4) + arg0;
                    int var15 = class183.field2895.method1990((byte) -57, var9);
                    class227 var16 = null;
                    int var17 = 16777215;
                    if (var15 == 0) {
                        if ((double) class247.field3932 == 3.0D) {
                            var16 = class279.field4423;
                        }
                        if ((double) class247.field3932 == 4.0D) {
                            var16 = class142.field2115;
                        }
                        if ((double) class247.field3932 == 6.0D) {
                            var16 = class35.field612;
                        }
                        if ((double) class247.field3932 >= 8.0D) {
                            var16 = class295.field4622;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class247.field3932 == 3.0D) {
                            var16 = class35.field612;
                        }
                        if ((double) class247.field3932 == 4.0D) {
                            var16 = class295.field4622;
                        }
                        if ((double) class247.field3932 == 6.0D) {
                            var16 = class49.field804;
                        }
                        if ((double) class247.field3932 >= 8.0D) {
                            var16 = class298.field4808;
                        }
                    }
                    if (var15 == 2) {
                        if ((double) class247.field3932 == 3.0D) {
                            var16 = class49.field804;
                        }
                        if ((double) class247.field3932 == 4.0D) {
                            var16 = class298.field4808;
                        }
                        if ((double) class247.field3932 == 6.0D) {
                            var16 = class35.field613;
                        }
                        var17 = 16755200;
                        if ((double) class247.field3932 >= 8.0D) {
                            var16 = class112.field1724;
                        }
                    }
                    if (class183.field2895.field4792[var9] != -1) {
                        var17 = class183.field2895.field4792[var9];
                    }
                    if (var16 != null) {
                        int var18 = class117.field1786.method1792(class183.field2895.field4797[var9], (int[]) null, class73.field1116);
                        int var19 = var13 - (var18 - 1) * var16.method1572() / 2;
                        int var20 = var19 + var16.method1575() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class73.field1116[var21];
                            if (var21 < (var18 - 1)) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var16.method1567(var22, var14, var20, var17, true);
                            var20 += var16.method1572();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static final void method988(byte arg0) {
        class185.field2915.method2044(0);
        class182.field2854.method627((byte) 114);
        if (arg0 < -124) {
            class2.field46.method627((byte) 114);
            field1994++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
    public final boolean method989(int arg0) {
        if (arg0 > -91) {
            field1990 = null;
        }
        field1993++;
        return (this.field1997 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Z")
    public final boolean method990(int arg0) {
        if (arg0 == 0) {
            field1991++;
            return (this.field1997 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static final void method991(int arg0) {
        field1996++;
        class152.field2249.method1169(true);
        class134.field2003.method1169(true);
        if (arg0 > -116) {
            method988((byte) 94);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)Z")
    public final boolean method992(boolean arg0) {
        field1995++;
        if (!arg0) {
            this.field1998 = 98;
        }
        return (this.field1997 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Z")
    public final boolean method993(byte arg0) {
        field2001++;
        if (arg0 != 84) {
            this.field2000 = -109;
        }
        return (this.field1997 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
    public static void method994(int arg0) {
        field1990 = null;
        if (arg0 != 0) {
            field1999 = null;
        }
        field1999 = null;
    }
}
