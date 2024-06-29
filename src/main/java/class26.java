import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class26 extends class212 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lkr;")
    private class486 field349 = new class486();

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lkr;")
    private class486 field356 = new class486();

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Z")
    private boolean field358;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field334 = new String[200];

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Ltr;")
    public static class176 field346;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lb;")
    public static class201 field338;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field357;

    @OriginalMember(owner = "client!ud", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field344++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
    public final int method175(int arg0) {
        if (arg0 > -33) {
            this.field350 = -121;
        }
        field347++;
        return this.field350;
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Z")
    public final boolean method176(int arg0) {
        field327++;
        if (arg0 != 0) {
            this.method177(-118);
        }
        return (this.field337 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I")
    public final int method177(int arg0) {
        field329++;
        int var2 = 121 / ((-arg0 - 15) / 44);
        return this.field345;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZILbd;ZLbd;I)I")
    public static final int method178(boolean arg0, boolean arg1, int arg2, class42 arg3, boolean arg4, class42 arg5, int arg6) {
        field320++;
        int var7 = class344.method2161(126, arg2, arg3, arg5, arg4);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            if (arg1) {
                field334 = null;
            }
            int var8 = class344.method2161(116, arg6, arg3, arg5, arg0);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)Z")
    public final boolean method179(boolean arg0) {
        field343++;
        if (arg0) {
            return (this.field337 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BIILjava/lang/String;)I")
    public static final int method180(int arg0, int arg1, byte[] arg2, int arg3, int arg4, String arg5) {
        field324++;
        if (arg1 != 11877) {
            field346 = null;
        }
        int var6 = arg0 - arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg4 + var7] = -97;
            } else {
                arg2[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ud", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method193(arg0, (byte) 121);
        field335++;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public static final void method181(byte arg0) {
        field330++;
        class201.field2962.method2771(-5);
        class28.field380.method2771(-5);
        int var1 = -114 % ((56 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public final void method182(int arg0) {
        if (arg0 != 16) {
            field339 = 57;
        }
        field323++;
        this.method185(arg0 - 143);
    }

    @OriginalMember(owner = "client!ud", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field355++;
        int var2 = this.method184(-118, arg0);
        if (var2 == 1) {
            this.method183(-85, 0, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method183(-65, 2, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method183(-72, 1, arg0.getX(), arg0.getY());
        }
        this.field354 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
    private final void method183(int arg0, int arg1, int arg2, int arg3) {
        field342++;
        class344 var5 = new class344();
        var5.field4998 = arg2;
        if (arg0 > -28) {
            this.method182(72);
        }
        var5.field5000 = arg3;
        var5.field4997 = arg1;
        var5.field5008 = class433.method2562(-2039);
        this.field356.method2845(var5, (byte) 37);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method184(int arg0, MouseEvent arg1) {
        field340++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        int var7 = 70 / ((arg0 - 15) / 40);
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

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
    private final void method185(int arg0) {
        field341++;
        if (this.field357 == null) {
            return;
        }
        this.field357.removeMouseListener(this);
        this.field357.removeMouseMotionListener(this);
        this.field353 = this.field352 = this.field354 = 0;
        this.field350 = this.field345 = this.field337 = 0;
        this.field357 = null;
        int var2 = 68 / ((arg0 - 10) / 55);
        this.field349 = null;
        this.field356 = null;
    }

    @OriginalMember(owner = "client!ud", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field351++;
        int var2 = this.method184(-116, arg0);
        if ((this.field354 & var2) == 0) {
            var2 = this.field354;
        }
        if ((var2 & 0x1) != 0) {
            this.method183(-72, 3, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method183(-71, 5, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method183(-105, 4, arg0.getX(), arg0.getY());
        }
        this.field354 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public final synchronized void method186(int arg0) {
        this.field345 = this.field352;
        this.field350 = this.field353;
        field333++;
        this.field337 = this.field354;
        class486 var2 = this.field349;
        this.field349 = this.field356;
        this.field356 = var2;
        this.field356.method2838((byte) 90);
        if (arg0 != 2) {
            this.method183(41, -125, -55, -57);
        }
    }

    @OriginalMember(owner = "client!ud", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method193(arg0, (byte) 123);
        field328++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method187(byte arg0, Component arg1) {
        this.method185(-120);
        field331++;
        this.field357 = arg1;
        this.field357.addMouseListener(this);
        this.field357.addMouseMotionListener(this);
        int var3 = 72 / ((-arg0 - 65) / 48);
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)Ljava/lang/String;")
    public static final String method188(int arg0) {
        field325++;
        String var1 = "www";
        if (arg0 > -97) {
            return null;
        }
        if (class394.field5599 == class144.field1912) {
            var1 = "www-wtrc";
        } else if (class394.field5599 == class365.field5251) {
            var1 = "www-wtqa";
        } else if (class394.field5599 == class193.field2853) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class347.field5028 != null) {
            var2 = "/p=" + class347.field5028;
        }
        return "http://" + var1 + "." + class456.field6416.field5095 + ".com/l=" + class326.field4711 + "/a=" + class36.field466 + var2 + "/";
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lph;")
    public final class421 method189(int arg0) {
        field332++;
        return arg0 == 0 ? (class421) this.field349.method2839(-31216) : null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lnp;Lin;III)V")
    public static final void method190(class313 arg0, class54 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class287.field4186) {
            class88 var5 = class330.field4786[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field1070 != null && var5.field1070.method249(-116)) {
                arg1.method247(0, var5.field1070, 0, arg0, (byte) 95, true, class418.field5845);
            }
        }
        if (arg4 < class287.field4186) {
            class88 var6 = class330.field4786[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field1070 != null && var6.field1070.method249(-127)) {
                arg1.method247(class418.field5845, var6.field1070, 0, arg0, (byte) 59, true, 0);
            }
        }
        if (arg3 < class287.field4186 && arg4 < class360.field5188) {
            class88 var7 = class330.field4786[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field1070 != null && var7.field1070.method249(-117)) {
                arg1.method247(class418.field5845, var7.field1070, 0, arg0, (byte) 121, true, class418.field5845);
            }
        }
        if (arg3 < class287.field4186 && arg4 > 0) {
            class88 var8 = class330.field4786[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field1070 != null && var8.field1070.method249(-110)) {
                arg1.method247(-class418.field5845, var8.field1070, 0, arg0, (byte) -97, true, class418.field5845);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field348++;
        this.method193(arg0, (byte) 116);
    }

    @OriginalMember(owner = "client!ud", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field352 = -1;
        this.field353 = -1;
        field336++;
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)V")
    public static void method191(int arg0) {
        if (arg0 != 17701) {
            field338 = null;
        }
        field334 = null;
        field338 = null;
        field346 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        int var2 = 93 / ((arg0 + 60) / 55);
        field321++;
        return (this.field337 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
    private final void method193(MouseEvent arg0, byte arg1) {
        this.field353 = arg0.getX();
        field322++;
        this.field352 = arg0.getY();
        if (this.field358) {
            this.method183(-56, -1, arg0.getX(), arg0.getY());
        }
        if (arg1 <= 107) {
            this.method192((byte) 89);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class26(Component arg0, boolean arg1) {
        this.method187((byte) 10, arg0);
        this.field358 = arg1;
    }
}
