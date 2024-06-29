import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class409 extends class208 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "Lsm;")
    private class249 field5679 = new class249();

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "Lsm;")
    private class249 field5682 = new class249();

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "Z")
    private boolean field5685;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "Llm;")
    public static class84 field5675 = new class84("", 17);

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    private int field5654;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    private int field5673;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    private int field5676;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    private int field5680;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    private int field5681;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    private int field5683;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "Ljava/awt/Component;")
    private Component field5684;

    static {
        new class112("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lld;BZ)V", line = 4)
    public static final void method2395(class196 arg0, byte arg1, boolean arg2) {
        field5652++;
        if (class161.field2310 >= 400) {
            return;
        }
        if (arg1 <= 51) {
            method2396(123, (class363) null, -28);
        }
        class127 var3 = arg0.field2789;
        if (var3.field1780 != null) {
            var3 = var3.method767(class320.field4376, (byte) 115);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1764) {
            return;
        }
        String var4 = var3.field1752;
        if (var3.field1812 != 0) {
            String var5 = class307.field4208 == class172.field2553 ? class22.field375.method695(-126, class487.field6867) : class15.field262.method695(-120, class487.field6867);
            var4 = var4 + class417.method2433(class2.field21.field392, var3.field1812, -54) + " (" + var5 + var3.field1812 + ")";
        }
        if (!class184.field2678) {
            if (!arg2) {
                String[] var6 = var3.field1761;
                if (class175.field2577) {
                    var6 = class382.method2288((byte) -110, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (class305.field4173 != class172.field2553 || !var6[var7].equalsIgnoreCase(class115.field1623.method695(-114, class487.field6867)))) {
                            byte var8 = 0;
                            int var9 = class19.field314;
                            if (var7 == 0) {
                                var8 = 5;
                            }
                            if (var7 == 1) {
                                var8 = 3;
                            }
                            if (var7 == 2) {
                                var8 = 18;
                            }
                            if (var7 == 3) {
                                var8 = 44;
                            }
                            if (var3.field1773 == var7) {
                                var9 = var3.field1798;
                            }
                            if (var7 == 4) {
                                var8 = 48;
                            }
                            if (var3.field1771 == var7) {
                                var9 = var3.field1744;
                            }
                            class230.field3243++;
                            class225.method1415(false, 0, "<col=ffff00>" + var4, 0, var8, (long) arg0.field1119, var9, -1, var6[var7], 0, true);
                        }
                    }
                }
                if (class305.field4173 == class172.field2553 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class115.field1623.method695(-113, class487.field6867))) {
                            short var11 = 0;
                            if (class2.field21.field392 < var3.field1812) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 5;
                            }
                            if (var10 == 1) {
                                var12 = 3;
                            }
                            if (var10 == 2) {
                                var12 = 18;
                            }
                            if (var10 == 3) {
                                var12 = 44;
                            }
                            if (var10 == 4) {
                                var12 = 48;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class225.method1415(false, 0, "<col=ffff00>" + var4, 0, var12, (long) arg0.field1119, var3.field1754, -1, var6[var10], 0, true);
                            class71.field1045++;
                        }
                    }
                }
            }
            class225.method1415(arg2, 0, "<col=ffff00>" + var4, 0, 1010, (long) arg0.field1119, class115.field1628, -1, class407.field5636.method695(-119, class487.field6867), 0, true);
            class165.field2438++;
        } else if (!arg2) {
            class307 var13 = class227.field3209 == -1 ? null : class68.field1007.method963(class227.field3209, (byte) 96);
            if ((class416.field5733 & 0x2) != 0) {
                if (var13 == null || var3.method769(var13.field4199, class227.field3209, true) != var13.field4199) {
                    class114.field1601++;
                    class225.method1415(false, 0, class357.field4981 + " -> <col=ffff00>" + var4, 0, 57, (long) arg0.field1119, class90.field1346, -1, class238.field3363, 0, true);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILms;I)I", line = 172)
    public static final int method2396(int arg0, class363 arg1, int arg2) {
        if (arg2 != 32544) {
            method2396(61, (class363) null, 1);
        }
        field5656++;
        if (!client.method2321(arg1).method470(arg0, 3021) && arg1.field5197 == null) {
            return -1;
        } else if (arg1.field5201 == null || arg0 >= arg1.field5201.length) {
            return -1;
        } else {
            return arg1.field5201[arg0];
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)Z", line = 188)
    public final boolean method1308(byte arg0) {
        if (arg0 >= -75) {
            return true;
        } else {
            field5678++;
            return (this.field5676 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)I", line = 199)
    public final int method1301(int arg0) {
        field5663++;
        if (arg0 != 13820) {
            this.method1304((byte) 109);
        }
        return this.field5654;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V", line = 210)
    private final void method2397(MouseEvent arg0, int arg1) {
        field5668++;
        this.field5680 = arg0.getX();
        this.field5683 = arg0.getY();
        if (this.field5685) {
            this.method2402(arg0.getY(), -1, arg0.getX(), 4);
        }
        if (arg1 <= 31) {
            this.field5684 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V", line = 232)
    public static void method2398(byte arg0) {
        field5675 = null;
        if (arg0 != 31) {
            method2395((class196) null, (byte) 119, true);
        }
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V", line = 243)
    private final void method2399(int arg0) {
        field5664++;
        if (this.field5684 == null) {
            return;
        }
        this.field5684.removeMouseListener(this);
        this.field5684.removeMouseMotionListener(this);
        this.field5682 = null;
        this.field5684 = null;
        this.field5680 = this.field5683 = this.field5681 = 0;
        this.field5679 = null;
        this.field5654 = this.field5673 = this.field5676 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Z", line = 266)
    public final boolean method1306(int arg0) {
        field5662++;
        if (arg0 != 255) {
            this.field5682 = null;
        }
        return (this.field5676 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 277)
    private final int method2400(int arg0, MouseEvent arg1) {
        field5659++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (arg0 & var3) != 0;
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

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V", line = 314)
    public static final void method2401(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5672++;
        class265 var5 = class440.method2554(arg4, 2, 10);
        var5.method1675(false);
        if (arg1 == -1338) {
            var5.field3692 = arg3;
            var5.field3689 = arg2;
            var5.field3698 = arg0;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V", line = 333)
    public final synchronized void method1304(byte arg0) {
        this.field5654 = this.field5680;
        field5671++;
        this.field5673 = this.field5683;
        this.field5676 = this.field5681;
        class249 var2 = this.field5679;
        this.field5679 = this.field5682;
        if (arg0 != 81) {
            this.method1306(-80);
        }
        this.field5682 = var2;
        this.field5682.method1552((byte) 117);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)V", line = 357)
    private final void method2402(int arg0, int arg1, int arg2, int arg3) {
        field5655++;
        class489 var5 = new class489();
        var5.field6902 = arg2;
        var5.field6899 = arg1;
        var5.field6894 = arg0;
        var5.field6891 = class193.method1237(-9581);
        if (arg3 != 4) {
            this.mouseMoved((MouseEvent) null);
        }
        this.field5682.method1553((byte) -94, var5);
    }

    @OriginalMember(owner = "client!fo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 374)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field5657++;
        this.method2397(arg0, 63);
    }

    @OriginalMember(owner = "client!fo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 382)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2397(arg0, 86);
        field5661++;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V", line = 395)
    public final void method1311(byte arg0) {
        if (arg0 >= -80) {
            this.field5683 = -9;
        }
        this.method2399(0);
        field5666++;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I", line = 406)
    public final int method1305(int arg0) {
        if (arg0 != 255) {
            this.field5685 = false;
        }
        field5669++;
        return this.field5673;
    }

    @OriginalMember(owner = "client!fo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 423)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field5680 = -1;
        this.field5683 = -1;
        field5667++;
    }

    @OriginalMember(owner = "client!fo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 434)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5658++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 445)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5653++;
        int var2 = this.method2400(4, arg0);
        if (var2 == 1) {
            this.method2402(arg0.getY(), 0, arg0.getX(), 4);
        } else if (var2 == 4) {
            this.method2402(arg0.getY(), 2, arg0.getX(), 4);
        } else if (var2 == 2) {
            this.method2402(arg0.getY(), 1, arg0.getX(), 4);
        }
        this.field5681 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)Lwc;", line = 477)
    public final class161 method1309(int arg0) {
        field5665++;
        return arg0 == 30445 ? (class161) this.field5679.method1548(8779) : null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 488)
    private final void method2403(int arg0, Component arg1) {
        this.method2399(0);
        field5677++;
        this.field5684 = arg1;
        this.field5684.addMouseListener(this);
        if (arg0 != 31304) {
            method2398((byte) -4);
        }
        this.field5684.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!fo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 502)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2397(arg0, 96);
        field5674++;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z", line = 511)
    public final boolean method1303(int arg0) {
        field5670++;
        if (arg0 != 255) {
            this.mouseEntered((MouseEvent) null);
        }
        return (this.field5676 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 563)
    public class409(Component arg0, boolean arg1) {
        this.method2403(31304, arg0);
        this.field5685 = arg1;
    }

    @OriginalMember(owner = "client!fo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 526)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5660++;
        int var2 = this.method2400(4, arg0);
        if ((var2 & this.field5681) == 0) {
            var2 = this.field5681;
        }
        if ((var2 & 0x1) != 0) {
            this.method2402(arg0.getY(), 3, arg0.getX(), 4);
        }
        if ((var2 & 0x4) != 0) {
            this.method2402(arg0.getY(), 5, arg0.getX(), 4);
        }
        if ((var2 & 0x2) != 0) {
            this.method2402(arg0.getY(), 4, arg0.getX(), 4);
        }
        this.field5681 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
