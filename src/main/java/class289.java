import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class289 extends class58 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "Lsr;")
    private class167 field3797 = new class167();

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "Lsr;")
    private class167 field3810 = new class167();

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "Z")
    private boolean field3817;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "Lao;")
    public static class191 field3800 = new class191(58, 4);

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3809 = "";

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "Ljc;")
    public static class305 field3806 = new class305("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    private int field3796;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    private int field3815;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    private int field3816;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field3818;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V", line = 3)
    private final void method1728(MouseEvent arg0, int arg1) {
        this.field3813 = arg0.getX();
        field3814++;
        this.field3815 = arg0.getY();
        if (arg1 > -28) {
            this.field3810 = null;
        }
        if (this.field3817) {
            this.method1732(-1, arg0.getX(), true, arg0.getY());
        }
    }

    @OriginalMember(owner = "client!nv", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3786++;
        this.method1728(arg0, -66);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I", line = 31)
    private final int method1729(boolean arg0, MouseEvent arg1) {
        field3804++;
        if (arg0) {
            this.method353(7);
        }
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)I", line = 67)
    public final int method349(byte arg0) {
        field3785++;
        int var2 = 80 / ((arg0 - 40) / 40);
        return this.field3790;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V", line = 77)
    private final void method1730(byte arg0) {
        field3801++;
        if (this.field3818 == null) {
            return;
        }
        this.field3818.removeMouseListener(this);
        this.field3818.removeMouseMotionListener(this);
        this.field3797 = null;
        this.field3790 = this.field3803 = this.field3796 = 0;
        this.field3818 = null;
        this.field3810 = null;
        this.field3813 = this.field3815 = this.field3816 = 0;
        int var2 = -83 % ((arg0 + 27) / 44);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)Z", line = 99)
    public final boolean method348(byte arg0) {
        field3802++;
        int var2 = 38 / ((arg0 - 25) / 41);
        return (this.field3796 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!nv", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 109)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3787++;
        this.method1728(arg0, -90);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Lst;", line = 122)
    public final class299 method350(int arg0) {
        field3798++;
        int var2 = 57 % ((47 - arg0) / 51);
        return (class299) this.field3797.method977((byte) 56);
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V", line = 133)
    public final void method351(int arg0) {
        this.method1730((byte) -104);
        int var2 = 76 / ((arg0 + 65) / 59);
        field3805++;
    }

    @OriginalMember(owner = "client!nv", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 146)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3819++;
        int var2 = this.method1729(false, arg0);
        if (var2 == 1) {
            this.method1732(0, arg0.getX(), true, arg0.getY());
        } else if (var2 == 4) {
            this.method1732(2, arg0.getX(), true, arg0.getY());
        } else if (var2 == 2) {
            this.method1732(1, arg0.getX(), true, arg0.getY());
        }
        this.field3816 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 172)
    public static final void method1731(String arg0, int arg1) {
        System.out.println("Error: " + class417.method2582("\n", "%0a", arg0, arg1 ^ 0xFFFFFFFB));
        if (arg1 != 4) {
            method1735((byte) 108, 91, 0.10935725F, -74, -126, 0.72421974F, -87, 0.54477334F);
        }
        field3807++;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZI)V", line = 184)
    private final void method1732(int arg0, int arg1, boolean arg2, int arg3) {
        field3808++;
        class292 var5 = new class292();
        var5.field3859 = arg3;
        var5.field3858 = arg0;
        var5.field3860 = arg1;
        if (!arg2) {
            this.field3790 = 75;
        }
        var5.field3854 = class45.method252((byte) -8);
        this.field3810.method975(0, var5);
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V", line = 202)
    public static void method1733(byte arg0) {
        field3800 = null;
        field3806 = null;
        field3809 = null;
        if (arg0 != 56) {
            field3806 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 214)
    private final void method1734(byte arg0, Component arg1) {
        this.method1730((byte) -101);
        if (arg0 >= 110) {
            field3793++;
            this.field3818 = arg1;
            this.field3818.addMouseListener(this);
            this.field3818.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!nv", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 230)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3812++;
        this.field3815 = -1;
        this.field3813 = -1;
    }

    @OriginalMember(owner = "client!nv", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 243)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3794++;
        this.method1728(arg0, -29);
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V", line = 254)
    public final synchronized void method356(byte arg0) {
        this.field3803 = this.field3815;
        field3791++;
        this.field3796 = this.field3816;
        this.field3790 = this.field3813;
        class167 var2 = this.field3797;
        this.field3797 = this.field3810;
        this.field3810 = var2;
        if (arg0 != -81) {
            this.method347(-124);
        }
        this.field3810.method984(false);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Z", line = 276)
    public final boolean method352(boolean arg0) {
        field3799++;
        if (!arg0) {
            this.field3813 = -85;
        }
        return (this.field3796 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BIFIIFIF)[F", line = 287)
    public static final float[] method1735(byte arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, float arg7) {
        field3811++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[6] = -var11;
        var8[4] = 1.0F;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[8] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg6 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg3 / var19;
                var14 = (float) (-arg4) / var19;
            }
            var13[7] = -var14 * var17;
            var13[4] = var16;
            var13[2] = var14 * var15 * var18;
            var13[8] = var15 * var15 * var18 + var16;
            var13[5] = var14 * var17;
            var13[1] = var15 * var17;
            var13[6] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[3] = -var15 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[2] *= arg2;
        var9[7] *= arg7;
        if (arg0 != -106) {
            method1731(null, -111);
        }
        var9[3] *= arg5;
        var9[4] *= arg5;
        var9[1] *= arg2;
        var9[8] *= arg7;
        var9[6] *= arg7;
        var9[0] *= arg2;
        var9[5] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z", line = 370)
    public final boolean method353(int arg0) {
        field3788++;
        if (arg0 != 4302) {
            field3809 = null;
        }
        return (this.field3796 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!nv", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 386)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field3792++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nv", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 400)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3795++;
        int var2 = this.method1729(false, arg0);
        if ((this.field3816 & var2) == 0) {
            var2 = this.field3816;
        }
        if ((var2 & 0x1) != 0) {
            this.method1732(3, arg0.getX(), true, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method1732(5, arg0.getX(), true, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method1732(4, arg0.getX(), true, arg0.getY());
        }
        this.field3816 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I", line = 427)
    public final int method347(int arg0) {
        if (arg0 > -102) {
            this.mouseEntered(null);
        }
        field3789++;
        return this.field3803;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 459)
    public class289(Component arg0, boolean arg1) {
        this.method1734((byte) 116, arg0);
        this.field3817 = arg1;
    }
}
