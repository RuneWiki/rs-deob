import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 extends Canvas implements WindowListener {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Ljava/applet/Applet;")
    private Applet field250;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Ljava/awt/Frame;")
    private Frame field269;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lec;")
    public static class28 field256 = class28.method210(-46, "Loaded input handler");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
    public static int[] field264 = new int[5];

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field249 = 1;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lec;")
    public static class28 field262 = class28.method210(-46, "Close");

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Lec;")
    public static class28 field268 = class28.method210(-46, "Error connecting to server)3");

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lwc;")
    public static class128 field253;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lcc;")
    public static class16 field257;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Leb;")
    public static class27 field251;

    @OriginalMember(owner = "client!ca", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.field250.destroy();
        field258++;
    }

    @OriginalMember(owner = "client!ca", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field260++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method79(int arg0, int arg1) {
        field254++;
        if (arg0 != 156) {
            method79(114, -10);
        }
        class40.method318(true, arg1);
    }

    @OriginalMember(owner = "client!ca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field250.paint(arg0);
        field272++;
    }

    @OriginalMember(owner = "client!ca", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field266++;
    }

    @OriginalMember(owner = "client!ca", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field267++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lvb;I)V")
    public static final void method80(class122 arg0, int arg1) {
        class25.field542 = arg0;
        field261++;
        if (arg1 != 96) {
            method82(null, null, -30);
        }
    }

    @OriginalMember(owner = "client!ca", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field270++;
        this.field250.update(arg0);
    }

    @OriginalMember(owner = "client!ca", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field259++;
    }

    @OriginalMember(owner = "client!ca", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field271++;
    }

    @OriginalMember(owner = "client!ca", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field252++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static void method81(boolean arg0) {
        field257 = null;
        if (!arg0) {
            return;
        }
        field253 = null;
        field262 = null;
        field251 = null;
        field256 = null;
        field264 = null;
        field268 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/applet/Applet;II)V")
    public class14(Applet arg0, int arg1, int arg2) {
        this.field250 = arg0;
        this.field269 = new Frame();
        this.field269.setTitle("Jagex");
        this.field269.setResizable(false);
        this.setSize(arg1, arg2);
        this.field269.add(this);
        this.field269.pack();
        this.field269.addWindowListener(this);
        this.field269.setVisible(true);
        this.field269.toFront();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;Lvb;I)V")
    public static final void method82(Component arg0, class122 arg1, int arg2) {
        field265++;
        if (class65.field1468) {
            return;
        }
        class96.field2142 = class34.method292(arg1, class123.field2671, arg2 ^ arg2, class94.field2075);
        class27.field572 = class34.method292(arg1, class42.field901, 0, class94.field2075);
        class45.field1000 = class34.method292(arg1, class76.field1707, 0, class94.field2075);
        class80.field1843 = class34.method292(arg1, class1.field11, 0, class94.field2075);
        class61.field1357 = class34.method292(arg1, class7.field123, 0, class94.field2075);
        class103.field2197 = class34.method292(arg1, class22.field499, arg2 ^ 0x4184, class94.field2075);
        class3.field31 = class21.method152(96, arg0, 8065, 479);
        class27.field572.method977(0, 0);
        class90.field1981 = class21.method152(156, arg0, arg2 ^ 0x5E05, 172);
        class120.method906();
        class45.field1000.method977(0, 0);
        class22.field513 = class21.method152(261, arg0, 8065, 190);
        class96.field2142.method977(0, 0);
        class125.field2707 = class21.method152(334, arg0, arg2 - 8707, 512);
        class120.method906();
        class62.field1379 = class21.method152(50, arg0, arg2 - 8707, 496);
        class11.field180 = class21.method152(37, arg0, 8065, 269);
        class125.field2715 = class21.method152(45, arg0, 8065, 249);
        class26 var3 = class63.method508((byte) 113, class94.field2075, class72.field1611, arg1);
        class5.field94 = class21.method152(var3.field565, arg0, arg2 ^ 0x5E05, var3.field568);
        var3.method185(0, 0);
        class26 var4 = class63.method508((byte) 126, class94.field2075, class65.field1507, arg1);
        class95.field2108 = class21.method152(var4.field565, arg0, arg2 ^ 0x5E05, var4.field568);
        var4.method185(0, 0);
        class26 var5 = class63.method508((byte) 118, class94.field2075, class95.field2086, arg1);
        class40.field866 = class21.method152(var5.field565, arg0, 8065, var5.field568);
        var5.method185(0, 0);
        class26 var6 = class63.method508((byte) 119, class94.field2075, class112.field2395, arg1);
        class47.field1069 = class21.method152(var6.field565, arg0, arg2 - 8707, var6.field568);
        var6.method185(0, 0);
        class26 var7 = class63.method508((byte) 104, class94.field2075, class49.field1153, arg1);
        class31.field664 = class21.method152(var7.field565, arg0, arg2 - 8707, var7.field568);
        var7.method185(0, 0);
        class26 var8 = class63.method508((byte) 124, class94.field2075, class31.field660, arg1);
        class69.field1543 = class21.method152(var8.field565, arg0, 8065, var8.field568);
        var8.method185(0, 0);
        class26 var9 = class63.method508((byte) 126, class94.field2075, class22.field510, arg1);
        class42.field910 = class21.method152(var9.field565, arg0, 8065, var9.field568);
        var9.method185(0, 0);
        class26 var10 = class63.method508((byte) 107, class94.field2075, class4.field63, arg1);
        class32.field684 = class21.method152(var10.field565, arg0, 8065, var10.field568);
        var10.method185(0, 0);
        class26 var11 = class63.method508((byte) 112, class94.field2075, class118.field2512, arg1);
        class28.field636 = class21.method152(var11.field565, arg0, arg2 - 8707, var11.field568);
        var11.method185(0, 0);
        field253 = class34.method292(arg1, class112.field2405, 0, class94.field2075);
        class25.field541 = class34.method292(arg1, class34.field762, 0, class94.field2075);
        class32.field692 = class34.method292(arg1, class4.field62, 0, class94.field2075);
        class8.field141 = field253.method976();
        class8.field141.method973();
        class57.field1312 = class25.field541.method976();
        class57.field1312.method973();
        class15.field292 = field253.method976();
        class15.field292.method975();
        class90.field1976 = class25.field541.method976();
        class90.field1976.method975();
        class7.field117 = class32.field692.method976();
        class7.field117.method975();
        class1.field10 = field253.method976();
        class1.field10.method973();
        class1.field10.method975();
        class57.field1302 = class25.field541.method976();
        class57.field1302.method973();
        class57.field1302.method975();
        class34.field775 = class72.method570((byte) 17, arg1, class94.field2075, class68.field1538);
        class63.field1411 = new int[33];
        class90.field1979 = new int[151];
        class31.field671 = new int[33];
        class34.field769 = new int[151];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class45.field1000.field2754[class45.field1000.field2756 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class63.field1411[var12] = var17;
            class31.field671[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class45.field1000.field2754[class45.field1000.field2756 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class34.field769[var13 - 5] = var14 - 25;
            class90.field1979[var13 - 5] = var15 - var14;
        }
        class65.field1468 = true;
    }
}
