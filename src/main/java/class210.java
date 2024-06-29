import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class210 extends class77 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lsf;")
    private class398 field3163 = new class398();

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Lsf;")
    private class398 field3169 = new class398();

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "Z")
    private boolean field3171;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
    public static int[] field3137 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Lnn;")
    public static class151 field3149 = new class151("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Lik;")
    public static class463 field3157 = new class463("", 14);

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "Z")
    public static boolean field3160 = false;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field3162 = 1337;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    private int field3168;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "J")
    public static long field3159;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "Ljava/awt/Component;")
    private Component field3170;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3166;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "[[[B")
    public static byte[][][] field3161;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1231(byte arg0, int arg1, int arg2, String[] arg3) {
        field3141++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg0 != 45) {
                return null;
            }
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)I")
    public final int method505(byte arg0) {
        if (arg0 > -103) {
            this.field3140 = 64;
        }
        field3158++;
        return this.field3140;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method1232(Component arg0, int arg1) {
        field3150++;
        if (arg1 <= -57) {
            this.method1238(2);
            this.field3170 = arg0;
            this.field3170.addMouseListener(this);
            this.field3170.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)V")
    public final synchronized void method508(byte arg0) {
        this.field3135 = this.field3168;
        field3147++;
        this.field3154 = this.field3164;
        this.field3140 = this.field3167;
        class398 var2 = this.field3163;
        int var3 = 88 / ((-arg0 - 63) / 54);
        this.field3163 = this.field3169;
        this.field3169 = var2;
        this.field3169.method2512((byte) 4);
    }

    @OriginalMember(owner = "client!hl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field3164 = -1;
        field3134++;
        this.field3167 = -1;
    }

    @OriginalMember(owner = "client!hl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1236(false, arg0);
        field3136++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method1233(int arg0, MouseEvent arg1) {
        field3138++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (arg0 != -27345) {
            this.field3168 = -114;
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

    @OriginalMember(owner = "client!hl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3151++;
        int var2 = this.method1233(-27345, arg0);
        if (var2 == 1) {
            this.method1235(arg0.getY(), true, 0, arg0.getX());
        } else if (var2 == 4) {
            this.method1235(arg0.getY(), true, 2, arg0.getX());
        } else if (var2 == 2) {
            this.method1235(arg0.getY(), true, 1, arg0.getX());
        }
        this.field3168 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3143++;
        int var2 = this.method1233(-27345, arg0);
        if ((var2 & this.field3168) == 0) {
            var2 = this.field3168;
        }
        if ((var2 & 0x1) != 0) {
            this.method1235(arg0.getY(), true, 3, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1235(arg0.getY(), true, 5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1235(arg0.getY(), true, 4, arg0.getX());
        }
        this.field3168 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Ltl;")
    public static final class376 method1234(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class376 var4 = var3.field165;
            var3.field165 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z")
    public final boolean method503(int arg0) {
        if (arg0 != 0) {
            field3160 = false;
        }
        field3156++;
        return (this.field3135 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZII)V")
    private final void method1235(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return;
        }
        field3133++;
        class68 var5 = new class68();
        var5.field883 = arg0;
        var5.field878 = arg2;
        var5.field889 = arg3;
        var5.field887 = class445.method2750(-27580);
        this.field3169.method2504(42, var5);
    }

    @OriginalMember(owner = "client!hl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3145++;
        this.method1236(false, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)Lhc;")
    public final class281 method502(byte arg0) {
        field3146++;
        if (arg0 >= -7) {
            this.field3140 = 14;
        }
        return (class281) this.field3163.method2509(false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V")
    private final void method1236(boolean arg0, MouseEvent arg1) {
        field3165++;
        this.field3167 = arg1.getX();
        this.field3164 = arg1.getY();
        if (this.field3171) {
            this.method1235(arg1.getY(), true, -1, arg1.getX());
        }
        if (arg0) {
            method1231((byte) 85, -21, -63, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Z")
    public final boolean method497(byte arg0) {
        field3142++;
        if (arg0 < 35) {
            this.field3140 = 117;
        }
        return (this.field3135 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)V")
    public static void method1237(byte arg0) {
        field3137 = null;
        field3157 = null;
        field3161 = null;
        field3166 = null;
        field3149 = null;
        if (arg0 != 4) {
            field3162 = 86;
        }
    }

    @OriginalMember(owner = "client!hl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3155++;
        this.method1236(false, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V")
    private final void method1238(int arg0) {
        field3153++;
        if (this.field3170 == null) {
            return;
        }
        this.field3170.removeMouseListener(this);
        this.field3170.removeMouseMotionListener(this);
        this.field3170 = null;
        this.field3169 = null;
        this.field3163 = null;
        this.field3140 = this.field3154 = this.field3135 = 0;
        if (arg0 != 2) {
            this.mouseClicked((MouseEvent) null);
        }
        this.field3167 = this.field3164 = this.field3168 = 0;
    }

    @OriginalMember(owner = "client!hl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3152++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)I")
    public static final int method1239(boolean arg0, int arg1) {
        field3144++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return arg0 ? var2 * var4 >> 12 : -43;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)Z")
    public final boolean method507(int arg0) {
        if (arg0 != 32768) {
            field3159 = 124L;
        }
        field3132++;
        return (this.field3135 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I")
    public final int method501(int arg0) {
        if (arg0 <= 45) {
            this.field3169 = null;
        }
        field3139++;
        return this.field3154;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V")
    public final void method510(boolean arg0) {
        if (!arg0) {
            this.field3167 = -60;
        }
        this.method1238(2);
        field3148++;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class210(Component arg0, boolean arg1) {
        this.method1232(arg0, -83);
        this.field3171 = arg1;
    }
}
