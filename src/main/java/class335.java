import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class335 extends class321 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "Lat;")
    private class412 field5021 = new class412();

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "Lat;")
    private class412 field5028 = new class412();

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "Z")
    private boolean field5029;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field5012 = new String[100];

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lo;")
    public static class332 field5001 = new class332("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field5024 = -1;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    private int field4995;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    private int field5005;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    private int field5025;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    private int field5026;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    private int field5027;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "Ljava/awt/Component;")
    private Component field5030;

    @OriginalMember(owner = "client!ph", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field5026 = -1;
        this.field5025 = -1;
        field5004++;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V", line = 15)
    public final synchronized void method1983(int arg0) {
        field5006++;
        this.field4995 = this.field5025;
        this.field5005 = this.field5027;
        this.field4994 = this.field5026;
        class412 var2 = this.field5021;
        this.field5021 = this.field5028;
        this.field5028 = var2;
        this.field5028.method2459(300);
        if (arg0 > -90) {
            this.field5030 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 37)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5009++;
        int var2 = this.method2056(126, arg0);
        if ((this.field5027 & var2) == 0) {
            var2 = this.field5027;
        }
        if ((var2 & 0x1) != 0) {
            this.method2057(58, 3, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2057(70, 5, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2057(93, 4, arg0.getY(), arg0.getX());
        }
        this.field5027 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Z", line = 69)
    public final boolean method1972(int arg0) {
        field4999++;
        if (arg0 != 6) {
            this.mouseEntered((MouseEvent) null);
        }
        return (this.field5005 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lui;Lui;Lui;ILui;)V", line = 83)
    public static final void method2052(class451 arg0, class451 arg1, class451 arg2, int arg3, class451 arg4) {
        class427.field6103 = arg2;
        field5008++;
        if (arg3 != 1279658478) {
            return;
        }
        class138.field1984 = arg0;
        class345.field5260 = arg4;
        class134.field1945 = arg1;
        class467.field6572 = new class178[class134.field1945.method2675(false)][];
        class225.field3265 = new boolean[class134.field1945.method2675(false)];
    }

    @OriginalMember(owner = "client!ph", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 102)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2058(100, arg0);
        field5023++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 111)
    private final void method2053(int arg0, Component arg1) {
        field5007++;
        if (arg0 <= 114) {
            this.method2056(34, (MouseEvent) null);
        }
        this.method2061(false);
        this.field5030 = arg1;
        this.field5030.addMouseListener(this);
        this.field5030.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z", line = 126)
    public final boolean method1978(int arg0) {
        if (arg0 == 2) {
            field5016++;
            return (this.field5005 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(B)I", line = 142)
    public final int method1984(byte arg0) {
        field5017++;
        return arg0 > -33 ? -13 : this.field4994;
    }

    @OriginalMember(owner = "client!ph", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 156)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5002++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILvg;)Z", line = 167)
    public static final boolean method2054(int arg0, int arg1, class51 arg2) {
        field5019++;
        int var3 = arg2.method369((byte) 126, 2);
        if (var3 == 0) {
            if (arg2.method369((byte) 126, 1) != 0) {
                method2054(5, arg1, arg2);
            }
            int var4 = arg2.method369((byte) 126, 6);
            int var5 = arg2.method369((byte) 126, 6);
            boolean var6 = arg2.method369((byte) 126, 1) == 1;
            if (var6) {
                class392.field5789[class270.field3998++] = arg1;
            }
            if (class40.field565[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class257 var7 = class40.field565[arg1] = new class257();
            var7.field4609 = arg1;
            if (class98.field1400[arg1] != null) {
                var7.method1704(class98.field1400[arg1], (byte) -128);
            }
            var7.method1926(class236.field3440[arg1], 125);
            var7.field4635 = class69.field942[arg1];
            int var8 = class492.field6923[arg1];
            int var9 = var8 >> 28;
            int var10 = (var8 & 0x3FE301) >> 14;
            int var11 = var8 & 0xFF;
            var7.field4672[0] = class317.field4765[arg1];
            var7.field4545 = (byte) var9;
            var7.method1700((var11 << 6) + (var5 - class468.field6588), 27348, (var10 << 6) + var4 - class68.field922);
            var7.field3828 = -1;
            return true;
        } else if (var3 == 1) {
            int var12 = arg2.method369((byte) 126, 2);
            int var13 = class492.field6923[arg1];
            class492.field6923[arg1] = class412.method2463(805306368, (var13 >> 28) + var12 << 28) + class412.method2463(268435455, var13);
            return false;
        } else if (var3 == 2) {
            int var14 = arg2.method369((byte) 126, 5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class492.field6923[arg1];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = var17 >> 14 & 0xFF;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var20--;
                var19--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var20--;
                var19++;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var19--;
                var20++;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var19++;
                var20++;
            }
            class492.field6923[arg1] = (var19 << 14) + (var18 << 28) + var20;
            return false;
        } else {
            int var21 = arg2.method369((byte) 126, 18);
            int var22 = var21 >> 16;
            int var23 = (var21 & 0xFF26) >> 8;
            if (arg0 != 5) {
                method2055(35);
            }
            int var24 = var21 & 0xFF;
            int var25 = class492.field6923[arg1];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            class492.field6923[arg1] = (var26 << 28) + (var27 << 14) + var28;
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V", line = 327)
    public static final void method2055(int arg0) {
        field5015++;
        if (class46.field664) {
            return;
        }
        if (class337.field5038.field3942) {
            class412.field5953 = (float) ((int) class412.field5953 - 17 & 0xFFFFFFF0);
        } else {
            class83.field1182 += (-class83.field1182 - 12.0F) / 2.0F;
        }
        if (arg0 != -17) {
            method2059(7);
        }
        class46.field664 = true;
        class380.field5645 = true;
    }

    @OriginalMember(owner = "client!ph", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 352)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5000++;
        int var2 = this.method2056(-70, arg0);
        if (var2 == 1) {
            this.method2057(73, 0, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method2057(83, 2, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method2057(60, 1, arg0.getY(), arg0.getX());
        }
        this.field5027 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 377)
    private final int method2056(int arg0, MouseEvent arg1) {
        field5003++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        int var5 = 115 / ((arg0 - 83) / 42);
        boolean var6 = (var3 & 0x8) != 0;
        boolean var7 = (var3 & 0x4) != 0;
        if (var6 && (var4 || var7)) {
            var6 = false;
        }
        if (var4 && var7) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var6) {
            return 2;
        } else if (var7) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V", line = 414)
    private final void method2057(int arg0, int arg1, int arg2, int arg3) {
        field5011++;
        class235 var5 = new class235();
        var5.field3422 = arg2;
        var5.field3425 = arg3;
        var5.field3428 = arg1;
        var5.field3426 = class435.method2539(-10659);
        if (arg0 >= 37) {
            this.field5028.method2453((byte) -94, var5);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 433)
    private final void method2058(int arg0, MouseEvent arg1) {
        if (arg0 != 100) {
            return;
        }
        field5010++;
        this.field5025 = arg1.getX();
        this.field5026 = arg1.getY();
        if (this.field5029) {
            this.method2057(arg0 ^ 0x3D, -1, arg1.getY(), arg1.getX());
        }
    }

    @OriginalMember(owner = "client!ph", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 453)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2058(100, arg0);
        field5014++;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Lfl;", line = 463)
    public final class131 method1976(int arg0) {
        field5022++;
        if (arg0 != 6) {
            this.field5030 = null;
        }
        return (class131) this.field5021.method2457((byte) 75);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I", line = 474)
    public final int method1975(int arg0) {
        field5020++;
        if (arg0 < 36) {
            this.mouseDragged((MouseEvent) null);
        }
        return this.field4995;
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "(I)V", line = 485)
    public static void method2059(int arg0) {
        field5001 = null;
        field5012 = null;
        if (arg0 != -1187920932) {
            field5024 = 97;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)Z", line = 497)
    public final boolean method1982(byte arg0) {
        if (arg0 >= -39) {
            this.mouseReleased((MouseEvent) null);
        }
        field4996++;
        return (this.field5005 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ph", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 508)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2058(100, arg0);
        field5013++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIZIZ)I", line = 516)
    public static final int method2060(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field4997++;
        class341 var5 = class271.method1763(arg4, arg1, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field5108.length; var7++) {
            if (var5.field5108[var7] >= 0 && class23.field309.field5781 > var5.field5108[var7]) {
                class184 var8 = class23.field309.method2364((byte) 118, var5.field5108[var7]);
                int var9 = var8.method1268((byte) 79, class237.field3463.method1398(-94, arg3).field2419, arg3);
                if (arg0) {
                    var6 += var5.field5110[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 553)
    private final void method2061(boolean arg0) {
        field4998++;
        if (this.field5030 == null) {
            return;
        }
        this.field5030.removeMouseListener(this);
        this.field5030.removeMouseMotionListener(this);
        this.field5030 = null;
        this.field5025 = this.field5026 = this.field5027 = 0;
        this.field5021 = null;
        this.field4995 = this.field4994 = this.field5005 = 0;
        this.field5028 = null;
        if (arg0) {
            this.method2053(-4, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 578)
    public final void method1974(int arg0) {
        field5018++;
        this.method2061(false);
        if (arg0 != 0) {
            this.field5029 = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 613)
    public class335(Component arg0, boolean arg1) {
        this.method2053(115, arg0);
        this.field5029 = arg1;
    }
}
