import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class564 extends class545 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "Lws;")
    private class333 field7049 = new class333();

    @OriginalMember(owner = "client!kfa", name = "E", descriptor = "Lws;")
    private class333 field7061 = new class333();

    @OriginalMember(owner = "client!kfa", name = "M", descriptor = "Z")
    private boolean field7069;

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "Lcga;")
    public static class449 field7045 = new class449(48, 11);

    @OriginalMember(owner = "client!kfa", name = "J", descriptor = "I")
    public static int field7066 = 1;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
    private int field7039;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
    private int field7052;

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
    private int field7054;

    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!kfa", name = "A", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!kfa", name = "B", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!kfa", name = "C", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!kfa", name = "D", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!kfa", name = "F", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!kfa", name = "G", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!kfa", name = "H", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!kfa", name = "I", descriptor = "I")
    private int field7065;

    @OriginalMember(owner = "client!kfa", name = "K", descriptor = "I")
    private int field7067;

    @OriginalMember(owner = "client!kfa", name = "L", descriptor = "I")
    private int field7068;

    @OriginalMember(owner = "client!kfa", name = "N", descriptor = "Ljava/awt/Component;")
    private Component field7070;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2993(int arg0, boolean arg1, int arg2) {
        field7062++;
        if (!arg1) {
            method2998();
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!kfa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field7060++;
        this.method2999(arg0.getX(), 116, arg0.getY());
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)Z")
    public final boolean method1068(int arg0) {
        if (arg0 != 14057) {
            this.field7070 = null;
        }
        field7037++;
        return (this.field7039 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kfa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field7043++;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
    public final void method1070(int arg0) {
        if (arg0 == -20355) {
            field7064++;
            this.method3001(false);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method2994(byte arg0, String arg1, Throwable arg2) {
        field7056++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class362.method2098(arg2, (byte) 109);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class518.method2811(var3, arg0 + 90);
            String var4 = class445.method2441(var3, ":", -1, "%3a");
            String var5 = class445.method2441(var4, "@", arg0 - 35, "%40");
            String var6 = class445.method2441(var5, "&", -1, "%26");
            String var7 = class445.method2441(var6, "#", -1, "%23");
            if (class152.field1827 != null) {
                class218 var8 = class112.field1400.method2599(new URL(class152.field1827.getCodeBase(), "clienterror.ws?c=" + class292.field3702 + "&u=" + class269.field3413 + "&v1=" + class476.field5923 + "&v2=" + class476.field5918 + "&e=" + var7), (byte) -72);
                while (var8.field2546 == 0) {
                    class700.method3867(arg0 ^ 0x727D, 1L);
                }
                if (arg0 != 34) {
                    field7045 = null;
                }
                if (var8.field2546 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2547;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)Z")
    public final boolean method1076(byte arg0) {
        field7058++;
        if (arg0 >= -71) {
            return false;
        } else {
            return (this.field7039 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
    public final synchronized void method1069(int arg0) {
        field7046++;
        this.field7039 = this.field7065;
        int var2 = 9 % ((72 - arg0) / 52);
        this.field7054 = this.field7068;
        this.field7052 = this.field7067;
        class333 var3 = this.field7049;
        this.field7049 = this.field7061;
        this.field7061 = var3;
        this.field7061.method1913((byte) 56);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2995(int arg0, MouseEvent arg1) {
        field7036++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (arg0 <= 19) {
            this.field7039 = -63;
        }
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

    @OriginalMember(owner = "client!kfa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2999(arg0.getX(), 119, arg0.getY());
        field7051++;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILji;BLqj;)V")
    public static final void method2996(int arg0, class572 arg1, byte arg2, class476 arg3) {
        field7057++;
        class432 var4 = new class432();
        var4.field5446 = arg1.method3097((byte) 12);
        var4.field5445 = arg1.method3064(-2031091464);
        var4.field5444 = new class218[var4.field5446];
        var4.field5452 = new int[var4.field5446];
        if (arg2 >= -102) {
            method2993(24, true, 96);
        }
        var4.field5448 = new class218[var4.field5446];
        var4.field5447 = new int[var4.field5446];
        var4.field5451 = new byte[var4.field5446][][];
        var4.field5450 = new int[var4.field5446];
        for (int var5 = 0; var5 < var4.field5446; var5++) {
            try {
                int var6 = arg1.method3097((byte) 12);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method3072(255);
                    String var8 = arg1.method3072(255);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method3064(-2031091464);
                    }
                    var4.field5452[var5] = var6;
                    var4.field5450[var5] = var9;
                    var4.field5444[var5] = arg3.method2601(0, class263.method1567((byte) -103, var7), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method3072(255);
                    String var11 = arg1.method3072(255);
                    int var12 = arg1.method3097((byte) 12);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method3072(255);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method3064(-2031091464);
                            var15[var16] = new byte[var17];
                            arg1.method3081(var17, -24643, var15[var16], 0);
                        }
                    }
                    var4.field5452[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class263.method1567((byte) -9, var13[var19]);
                    }
                    var4.field5448[var5] = arg3.method2594(var18, var11, (byte) 126, class263.method1567((byte) 112, var10));
                    var4.field5451[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5447[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5447[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5447[var5] = -3;
            } catch (Exception var23) {
                var4.field5447[var5] = -4;
            } catch (Throwable var24) {
                var4.field5447[var5] = -5;
            }
        }
        class539.field6796.method1904(var4, -55);
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)Z")
    public final boolean method1072(int arg0) {
        if (arg0 == -51) {
            field7047++;
            return (this.field7039 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2997(int arg0, Component arg1) {
        this.method3001(false);
        field7050++;
        if (arg0 != 0) {
            this.field7052 = -19;
        }
        this.field7070 = arg1;
        this.field7070.addMouseListener(this);
        this.field7070.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "()V")
    public static final void method2998() {
        if (class126.field1539 != null) {
            for (int var0 = 0; var0 < class126.field1539.length; var0++) {
                for (int var1 = 0; var1 < class546.field6871; var1++) {
                    for (int var2 = 0; var2 < class36.field538; var2++) {
                        if (class126.field1539[var0][var1][var2] != null) {
                            class126.field1539[var0][var1][var2].method3003(124);
                        }
                        class126.field1539[var0][var1][var2] = null;
                    }
                }
            }
        }
        class126.field1539 = null;
        class252.field3250 = null;
        if (class19.field205 != null) {
            for (int var3 = 0; var3 < class19.field205.length; var3++) {
                for (int var4 = 0; var4 < class546.field6871; var4++) {
                    for (int var5 = 0; var5 < class36.field538; var5++) {
                        if (class19.field205[var3][var4][var5] != null) {
                            class19.field205[var3][var4][var5].method3003(53);
                        }
                        class19.field205[var3][var4][var5] = null;
                    }
                }
            }
        }
        class19.field205 = null;
        class286.field3633 = null;
        class407.field5237 = null;
        class299.field3801 = null;
        class370.field4782 = 0;
        if (class290.field3670 != null) {
            for (int var6 = 0; var6 < class370.field4782; var6++) {
                class290.field3670[var6] = null;
            }
        }
        if (class469.field5797 != null) {
            for (int var7 = 0; var7 < class459.field5722; var7++) {
                class469.field5797[var7] = null;
            }
            class459.field5722 = 0;
        }
        if (class370.field4785 != null) {
            for (int var8 = 0; var8 < class303.field3838; var8++) {
                class370.field4785[var8] = null;
            }
            for (int var9 = 0; var9 < class709.field9904; var9++) {
                for (int var10 = 0; var10 < class546.field6871; var10++) {
                    for (int var11 = 0; var11 < class36.field538; var11++) {
                        class189.field2250[var9][var10][var11] = 0L;
                    }
                }
            }
            class303.field3838 = 0;
        }
        class188.field2224 = null;
        class482.method2627(false);
        class14.field136.method1716(3);
        class29.field349 = null;
        class612.field8321 = null;
        class493.field6143 = null;
        class489.field6114 = null;
        class5.field39 = null;
        class687.field9409 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field7042++;
        int var2 = this.method2995(118, arg0);
        if ((var2 & this.field7065) == 0) {
            var2 = this.field7065;
        }
        if ((var2 & 0x1) != 0) {
            this.method3000(3, arg0.getY(), arg0.getX(), true);
        }
        if ((var2 & 0x4) != 0) {
            this.method3000(5, arg0.getY(), arg0.getX(), true);
        }
        if ((var2 & 0x2) != 0) {
            this.method3000(4, arg0.getY(), arg0.getX(), true);
        }
        this.field7065 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(B)I")
    public final int method1078(byte arg0) {
        field7048++;
        if (arg0 <= 111) {
            this.mouseReleased(null);
        }
        return this.field7052;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
    private final void method2999(int arg0, int arg1, int arg2) {
        this.field7068 = arg0;
        this.field7067 = arg2;
        field7059++;
        if (this.field7069) {
            this.method3000(-1, arg2, arg0, true);
        }
        if (arg1 < 108) {
            this.method1074((byte) 91);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIZ)V")
    private final void method3000(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field7039 = 121;
        }
        field7040++;
        class598 var5 = new class598();
        var5.field8030 = arg2;
        var5.field8027 = arg0;
        var5.field8031 = arg1;
        var5.field8029 = class321.method1854(-55);
        this.field7061.method1904(var5, -27);
    }

    @OriginalMember(owner = "client!kfa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field7044++;
        int var2 = this.method2995(23, arg0);
        if (var2 == 1) {
            this.method3000(0, arg0.getY(), arg0.getX(), true);
        } else if (var2 == 4) {
            this.method3000(2, arg0.getY(), arg0.getX(), true);
        } else if (var2 == 2) {
            this.method3000(1, arg0.getY(), arg0.getX(), true);
        }
        this.field7065 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field7038++;
        this.method2999(arg0.getX(), 123, arg0.getY());
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Z)V")
    private final void method3001(boolean arg0) {
        field7053++;
        if (this.field7070 == null) {
            return;
        }
        if (arg0) {
            this.field7061 = null;
        }
        this.field7070.removeMouseMotionListener(this);
        this.field7070.removeMouseListener(this);
        this.field7068 = this.field7067 = this.field7065 = 0;
        this.field7061 = null;
        this.field7054 = this.field7052 = this.field7039 = 0;
        this.field7070 = null;
        this.field7049 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)Lwk;")
    public final class132 method1079(int arg0) {
        field7063++;
        if (arg0 != 20193) {
            this.mousePressed(null);
        }
        return (class132) this.field7049.method1906(58);
    }

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "(I)V")
    public static void method3002(int arg0) {
        field7045 = null;
        if (arg0 < 78) {
            method2993(72, true, -111);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field7055++;
        this.method2999(arg0.getX(), 114, arg0.getY());
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)I")
    public final int method1074(byte arg0) {
        int var2 = -40 % ((arg0 - 65) / 54);
        field7041++;
        return this.field7054;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class564(Component arg0, boolean arg1) {
        this.method2997(0, arg0);
        this.field7069 = arg1;
    }
}
