import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class108 extends class582 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Lrk;")
    private class419 field1345 = new class419();

    @OriginalMember(owner = "client!um", name = "G", descriptor = "Lrk;")
    private class419 field1367 = new class419();

    @OriginalMember(owner = "client!um", name = "N", descriptor = "Z")
    private boolean field1374;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Lqu;")
    public static class364 field1346 = new class364(11, 7);

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "Lnp;")
    public static class111 field1371;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "Ljava/awt/Component;")
    private Component field1370;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(B)V")
    public static void method631(byte arg0) {
        if (arg0 == -62) {
            field1371 = null;
            field1346 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Lwi;")
    public final class497 method632(byte arg0) {
        field1344++;
        if (arg0 != 104) {
            this.field1366 = 40;
        }
        return (class497) this.field1345.method2498((byte) 10);
    }

    @OriginalMember(owner = "client!um", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method639(arg0.getX(), arg0.getY(), 25844);
        field1347++;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)I")
    public final int method633(byte arg0) {
        field1376++;
        if (arg0 != 29) {
            this.method633((byte) -118);
        }
        return this.field1352;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z")
    public final boolean method634(int arg0) {
        field1354++;
        if (arg0 < 111) {
            this.field1366 = 70;
        }
        return (this.field1356 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
    public final int method635(int arg0) {
        field1355++;
        if (arg0 != -192) {
            this.method642(null, (byte) 69);
        }
        return this.field1364;
    }

    @OriginalMember(owner = "client!um", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method639(arg0.getX(), arg0.getY(), 25844);
        field1348++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method636(Component arg0, int arg1) {
        if (arg1 != 4) {
            return;
        }
        field1351++;
        this.method644((byte) 0);
        this.field1370 = arg0;
        this.field1370.addMouseListener(this);
        this.field1370.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(B)V")
    public final void method637(byte arg0) {
        if (arg0 != 90) {
            this.mouseClicked(null);
        }
        this.method644((byte) -43);
        field1365++;
    }

    @OriginalMember(owner = "client!um", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1350++;
        this.method639(arg0.getX(), arg0.getY(), 25844);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Z")
    public final boolean method638(byte arg0) {
        field1360++;
        int var2 = -76 % ((-arg0 - 28) / 39);
        return (this.field1356 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
    private final void method639(int arg0, int arg1, int arg2) {
        this.field1368 = arg0;
        if (arg2 != 25844) {
            return;
        }
        this.field1366 = arg1;
        field1363++;
        if (this.field1374) {
            this.method640((byte) -44, arg1, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BIII)V")
    private final void method640(byte arg0, int arg1, int arg2, int arg3) {
        field1343++;
        class556 var5 = new class556();
        var5.field8249 = arg1;
        var5.field8255 = arg3;
        var5.field8250 = arg2;
        var5.field8254 = class450.method2719((byte) 122);
        this.field1367.method2492(var5, (byte) -97);
        if (arg0 >= -2) {
            field1371 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
    public final synchronized void method641(int arg0) {
        this.field1364 = this.field1368;
        field1353++;
        this.field1356 = this.field1369;
        this.field1352 = this.field1366;
        int var2 = 69 / ((-arg0 - 5) / 33);
        class419 var3 = this.field1345;
        this.field1345 = this.field1367;
        this.field1367 = var3;
        this.field1367.method2499(0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method642(MouseEvent arg0, byte arg1) {
        field1358++;
        int var3 = arg0.getModifiers();
        if (arg1 != 86) {
            this.field1374 = true;
        }
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

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([[BBLvc;)V")
    public static final void method643(byte[][] arg0, byte arg1, class359 arg2) {
        field1362++;
        for (int var3 = 0; var3 < arg2.field9132; var3++) {
            class171.method1090(-13787);
            for (int var4 = 0; var4 < class35.field399 >> 3; var4++) {
                for (int var5 = 0; var5 < (class382.field5586 >> 3); var5++) {
                    int var6 = class497.field7475[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field9135 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class256.field3741.length; var12++) {
                                if (class256.field3741[var12] == var11 && arg0[var12] != null) {
                                    arg2.method2202(var7, arg0[var12], class67.field772, (var9 & 0x7) * 8, var3, class379.field5558, var8, var5 * 8, (var10 & 0x7) * 8, var4 * 8, 57);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -22) {
            field1371 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1349++;
        int var2 = this.method642(arg0, (byte) 86);
        if ((this.field1369 & var2) == 0) {
            var2 = this.field1369;
        }
        if ((var2 & 0x1) != 0) {
            this.method640((byte) -20, arg0.getY(), 3, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method640((byte) -58, arg0.getY(), 5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method640((byte) -56, arg0.getY(), 4, arg0.getX());
        }
        this.field1369 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!um", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1373++;
    }

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(B)V")
    private final void method644(byte arg0) {
        field1372++;
        int var2 = -12 / ((arg0 - 62) / 52);
        if (this.field1370 == null) {
            return;
        }
        this.field1370.removeMouseMotionListener(this);
        this.field1370.removeMouseListener(this);
        this.field1364 = this.field1352 = this.field1356 = 0;
        this.field1368 = this.field1366 = this.field1369 = 0;
        this.field1345 = null;
        this.field1367 = null;
        this.field1370 = null;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(B)Z")
    public final boolean method645(byte arg0) {
        int var2 = -63 / ((arg0 + 31) / 50);
        field1359++;
        return (this.field1356 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!um", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1357++;
        int var2 = this.method642(arg0, (byte) 86);
        if (var2 == 1) {
            this.method640((byte) -86, arg0.getY(), 0, arg0.getX());
        } else if (var2 == 4) {
            this.method640((byte) -84, arg0.getY(), 2, arg0.getX());
        } else if (var2 == 2) {
            this.method640((byte) -23, arg0.getY(), 1, arg0.getX());
        }
        this.field1369 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!um", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method639(arg0.getX(), arg0.getY(), 25844);
        field1361++;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class108(Component arg0, boolean arg1) {
        this.method636(arg0, 4);
        this.field1374 = arg1;
    }

    static {
        new class487("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field1375 = 0;
        field1371 = class492.method2981(64);
    }
}
