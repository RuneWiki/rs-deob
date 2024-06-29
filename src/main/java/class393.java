import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class393 extends class269 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "[Z")
    private boolean[] field5426 = new boolean[112];

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field5425 = -1;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Lch;")
    public static class151 field5424 = new class151("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "J")
    public static long field5435;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lpe;")
    private class422 field5419;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lpe;")
    private class422 field5427;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Lpe;")
    private class422 field5431;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field5423;

    @OriginalMember(owner = "client!gi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 3)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5421++;
        this.method2377(0, '\u0000', 119, -1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILae;I)V", line = 12)
    public static final void method2374(int arg0, int arg1, class172 arg2, int arg3) {
        field5432++;
        if (arg3 != 16383) {
            field5425 = 1;
        }
        class405 var4 = arg2.method1253(-14775, class374.field5152);
        if (var4 == null) {
            return;
        }
        class374.field5152.method453(arg0, arg1, arg0 + arg2.field2554, arg2.field2579 + arg1);
        if (class38.field477 >= 3) {
            class374.field5152.method366(-16777216, var4, arg0, arg1);
        } else {
            class454.field6437.method2494((float) arg2.field2554 / 2.0F + (float) arg0, (float) arg2.field2579 / 2.0F + (float) arg1, 4096, ((int) (-class91.field1281) & 0x3FFF) << 2, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 35)
    public final void focusGained(FocusEvent arg0) {
        field5430++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V", line = 42)
    private final void method2375(int arg0, int arg1, KeyEvent arg2) {
        field5429++;
        if (arg1 != 0) {
            this.keyTyped((KeyEvent) null);
        }
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class37.field403.length) {
            int var6 = class37.field403[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2377(var5, '\u0000', arg1 + 125, arg0);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 78)
    private final void method2376(Component arg0, byte arg1) {
        this.method2381(false);
        field5417++;
        this.field5423 = arg0;
        if (arg1 != 1) {
            this.focusGained((FocusEvent) null);
        }
        Method var3 = class65.field964;
        if (var3 != null) {
            try {
                var3.invoke(this.field5423, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field5423.addKeyListener(this);
        this.field5423.addFocusListener(this);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)Z", line = 109)
    public final boolean method1820(byte arg0, int arg1) {
        if (arg0 == -96) {
            field5420++;
            return arg1 >= 0 && arg1 < 112 ? this.field5426[arg1] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ICII)V", line = 128)
    private final void method2377(int arg0, char arg1, int arg2, int arg3) {
        field5422++;
        if (arg2 < 117) {
            this.field5427 = null;
        }
        class422 var5 = new class422();
        var5.field5850 = arg3;
        var5.field5838 = arg0;
        var5.field5843 = arg1;
        var5.field5842 = class10.method51(-3183);
        if (this.field5431 == null) {
            this.field5427 = var5;
        } else {
            this.field5431.field5844 = var5;
        }
        this.field5431 = var5;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;II)V", line = 150)
    public static final void method2378(Color arg0, boolean arg1, Color arg2, Color arg3, String arg4, int arg5, int arg6) {
        field5434++;
        try {
            Graphics var7 = class33.field338.getGraphics();
            if (class317.field4492 == null) {
                class317.field4492 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class364.field5007, class431.field6099);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class111.field1549 == null) {
                    class111.field1549 = class33.field338.createImage(304, 34);
                }
                Graphics var8 = class111.field1549.getGraphics();
                var8.setColor(arg2);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                if (arg6 != -7785) {
                    field5424 = null;
                }
                var8.fillRect(arg5 * 3 + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class317.field4492);
                var8.setColor(arg0);
                var8.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
                var7.drawImage(class111.field1549, class364.field5007 / 2 - 152, class431.field6099 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class364.field5007 / 2 - 152;
                int var10 = class431.field6099 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 - -2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 - -2, 300 - (arg5 * 3), 30);
                var7.setFont(class317.field4492);
                var7.setColor(arg0);
                var7.drawString(arg4, (304 - arg4.length() * 6) / 2 + var9, var10 + 22);
            }
            if (class317.field4477 != null) {
                var7.setFont(class317.field4492);
                var7.setColor(arg0);
                var7.drawString(class317.field4477, class364.field5007 / 2 - (class317.field4477.length() * 6 / 2), class431.field6099 / 2 - 26);
            }
        } catch (Exception var12) {
            class33.field338.repaint();
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 231)
    public final void method1824(int arg0) {
        this.method2381(false);
        if (arg0 != 2545) {
            this.focusLost((FocusEvent) null);
        }
        field5433++;
    }

    @OriginalMember(owner = "client!gi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 247)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5428++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class69.method640((byte) 83, var2)) {
            this.method2377(-1, var2, 127, 2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 262)
    public static void method2379(int arg0) {
        field5424 = null;
        if (arg0 != -2) {
            method2374(-72, -88, (class172) null, 29);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lmq;", line = 274)
    public final class46 method1819(int arg0) {
        if (arg0 != 29626) {
            return null;
        }
        field5414++;
        class422 var2;
        for (var2 = this.field5419; var2 != null && var2.field5850 == -1; var2 = var2.field5844) {
        }
        if (var2 == null) {
            this.field5419 = null;
        } else {
            this.field5419 = var2.field5844;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 468)
    public class393(Component arg0) {
        class238.method1666(-125);
        this.method2376(arg0, (byte) 1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V", line = 298)
    public static final void method2380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5418++;
        int var6 = arg1 - arg0;
        int var7 = arg5 - arg3;
        if (arg4 == var7) {
            if (var6 != 0) {
                class172.method1250((byte) -127, arg0, arg3, arg2, arg1);
            }
        } else if (var6 == 0) {
            class34.method211(arg5, arg2, arg0, arg4 - 13782, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                arg3 = arg0;
                int var10 = arg5;
                arg0 = var9;
                arg5 = arg1;
                arg1 = var10;
            }
            if (arg3 > arg5) {
                int var11 = arg3;
                int var12 = arg0;
                arg3 = arg5;
                arg0 = arg1;
                arg5 = var11;
                arg1 = var12;
            }
            int var13 = arg0;
            int var14 = arg5 - arg3;
            int var15 = arg1 - arg0;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg1 > arg0 ? 1 : -1;
            if (var8) {
                for (int var18 = arg3; var18 <= arg5; var18++) {
                    var16 += var15;
                    class373.field5141[var18][var13] = arg2;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg5; var19++) {
                    class373.field5141[var13][var19] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 411)
    public final synchronized void method1821(int arg0) {
        if (arg0 != -1) {
            this.keyReleased((KeyEvent) null);
        }
        field5412++;
        for (class422 var2 = this.field5427; var2 != null; var2 = var2.field5844) {
            if (var2.field5850 == 0) {
                if (var2.field5838 >= 0) {
                    var2.field5841 = !this.field5426[var2.field5838];
                }
                this.field5426[var2.field5838] = true;
            } else if (var2.field5850 == 1) {
                this.field5426[var2.field5838] = false;
            } else if (var2.field5850 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field5426[var3] = false;
                }
            }
        }
        this.field5419 = this.field5427;
        this.field5431 = null;
        this.field5427 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V", line = 477)
    private final void method2381(boolean arg0) {
        field5415++;
        if (arg0) {
            this.keyTyped((KeyEvent) null);
        }
        if (this.field5423 == null) {
            return;
        }
        this.field5423.removeKeyListener(this);
        this.field5423.removeFocusListener(this);
        this.field5423 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field5426[var2] = false;
        }
        this.field5427 = null;
        this.field5419 = null;
        this.field5431 = null;
    }

    @OriginalMember(owner = "client!gi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 509)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2375(0, 0, arg0);
        field5413++;
    }

    @OriginalMember(owner = "client!gi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 521)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field5416++;
        this.method2375(1, 0, arg0);
    }
}
