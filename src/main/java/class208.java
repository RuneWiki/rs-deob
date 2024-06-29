import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class208 extends class262 {

    @OriginalMember(owner = "client!js", name = "N", descriptor = "Z")
    public boolean field3256;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "F")
    public float field3254;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "F")
    public float field3252;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "Loe;")
    public static class127 field3257 = new class127(84, 3);

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3259 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!js", name = "U", descriptor = "Lsk;")
    public static class423 field3263 = new class423(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!js", name = "R", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbl;IIIIZ[BI)V")
    public class208(class442 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field3066 != 34037) {
            this.field3256 = true;
            this.field3252 = this.field3254 = 1.0F;
        } else {
            this.field3256 = false;
            this.field3252 = (float) arg3;
            this.field3254 = (float) arg4;
        }
        this.field3258 = arg4;
        this.field3255 = arg3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
    public static final void method1272(boolean arg0) {
        if (class462.field7108 != null) {
            class462.field7108.method1639((byte) 67);
        }
        ++field3253;
        if (class386.field5607 != null) {
            class386.field5607.method1639((byte) -102);
        }
        if (!arg0) {
            method1272(true);
        }
    }

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V")
    public static final void method1273(int arg0) {
        ++field3251;
        class112 var1 = (class112) class91.field1638.method8((byte) -98);
        boolean var2 = class450.field6931 != null || ~class170.field2653 < -1;
        if (arg0 > -81) {
            field3263 = null;
        }
        if (var2) {
            class481.field7350 = 1;
        }
        if (class440.field6454 && class308.field4662.method1650(81, 27365) && ~class330.field4948 < -3) {
            if (!var2) {
                class475.method2857((class2) class329.field4932.field45.field2795.field2795, var1.method802(6), var1.method801(-84), 1);
            } else {
                class451.field6952 = (class2) class329.field4932.field45.field2795.field2795;
            }
        } else if (var2) {
            class451.field6952 = (class2) class329.field4932.field45.field2795;
        } else {
            class475.method2857((class2) class329.field4932.field45.field2795, var1.method802(6), var1.method801(56), 1);
        }
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(I)V")
    public static void method1274(int arg0) {
        field3257 = null;
        field3259 = null;
        if (arg0 == 2) {
            field3263 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbl;IIIIIIZ)V")
    public class208(class442 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3252 = (float) arg3 / (float) arg5;
        this.field3255 = arg3;
        this.field3254 = (float) arg4 / (float) arg6;
        this.field3256 = false;
        this.field3258 = arg4;
        this.method1593(false, false, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lh;III[Z)Z")
    public static final boolean method1275(class452 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class99.field1801 != class262.field3978) {
            int var6 = class201.field3195[arg1].method314(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class343 var8 = class201.field3195[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method314(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method302(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method304(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbl;IIIIIZ)V")
    public class208(class442 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3258 = arg5;
        this.field3255 = arg4;
        if (super.field3066 == 34037) {
            this.field3256 = false;
            this.field3252 = (float) arg4;
            this.field3254 = (float) arg5;
        } else {
            this.field3256 = true;
            this.field3252 = this.field3254 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbl;IIII[I)V")
    public class208(class442 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3255 = arg1;
        this.field3258 = arg2;
        this.method1596(0, arg1, 0, true, arg5, (byte) -110, 0, arg2, 0);
        this.field3256 = false;
        this.field3254 = (float) arg2 / (float) arg4;
        this.field3252 = (float) arg1 / (float) arg3;
        this.method1593(false, false, 0);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbl;IIIZ[I)V")
    public class208(class442 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (super.field3066 == 34037) {
            this.field3252 = (float) arg2;
            this.field3254 = (float) arg3;
            this.field3256 = false;
        } else {
            this.field3256 = true;
            this.field3252 = this.field3254 = 1.0F;
        }
        this.field3255 = arg2;
        this.field3258 = arg3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Color;IZILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;)V")
    public static final void method1276(Color arg0, int arg1, boolean arg2, int arg3, Color arg4, String arg5, Color arg6) {
        ++field3262;
        try {
            Graphics var7 = class257.field3919.getGraphics();
            if (class233.field3532 == null) {
                class233.field3532 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class482.field7368, class147.field2384);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class407.field5901 == null) {
                    class407.field5901 = class257.field3919.createImage(304, 34);
                }
                Graphics var8 = class407.field5901.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg0);
                var8.fillRect(2, 2, arg1 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg1 * 3 + 2, 2, -(arg1 * 3) + 300, 30);
                var8.setFont(class233.field3532);
                var8.setColor(arg4);
                var8.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
                var7.drawImage(class407.field5901, class482.field7368 / 2 + -152, class147.field2384 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class482.field7368 / 2 - 152;
                int var10 = class147.field2384 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var9 - -2, var10 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(var9 - (-(arg1 * 3) + -2), var10 + 2, -(arg1 * 3) + 300, 30);
                var7.setFont(class233.field3532);
                var7.setColor(arg4);
                var7.drawString(arg5, var9 - -((-(6 * arg5.length()) + 304) / 2), var10 + 22);
            }
            if (class30.field393 != null) {
                var7.setFont(class233.field3532);
                var7.setColor(arg4);
                var7.drawString(class30.field393, class482.field7368 / 2 - 6 * class30.field393.length() / 2, class147.field2384 / 2 + -26);
            }
            if (arg3 != 13) {
                method1277(-100, 42, -4);
            }
        } catch (Exception var12) {
            class257.field3919.repaint();
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(III)Z")
    public static final boolean method1277(int arg0, int arg1, int arg2) {
        if (arg1 != 24719) {
            return false;
        } else {
            ++field3260;
            return ~(arg2 & 52) != -1;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbl;IIIII[BI)V")
    public class208(class442 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3258 = arg3;
        this.field3255 = arg2;
        this.method1591(0, 0, true, 0, arg7, arg6, arg2, arg3, true, 0);
        this.field3254 = (float) arg3 / (float) arg5;
        this.field3252 = (float) arg2 / (float) arg4;
        this.field3256 = false;
        this.method1593(false, false, 0);
    }
}
