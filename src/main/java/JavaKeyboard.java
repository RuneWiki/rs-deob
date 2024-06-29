import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class JavaKeyboard implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Lv;")
    public static JagString field15 = class1.method2(255, "Quest Start");

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Lv;")
    public static JagString field13 = class1.method2(255, "Brewery");

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Lv;")
    public static JagString field18 = class1.method2(255, "Dungeon");

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "Lv;")
    public static JagString field20 = class1.method2(255, "Shield Shop");

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "Lv;")
    public static JagString field21 = class1.method2(255, "Axe Shop");

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "Lv;")
    public static JagString field17;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "[B")
    public static byte[] field16;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "[I")
    public static int[] field19;

    @OriginalMember(owner = "mapview!aa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 19)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (StringNode.field81 != null) {
            mapview.field269 = -1;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 54)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (StringNode.field81 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < ByteArrayPool.field178.length) {
                var3 = ByteArrayPool.field178[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (mapview.field269 >= 0 && var3 >= 0) {
                class1.field5[mapview.field269] = ~var3;
                mapview.field269 = mapview.field269 + 1 & 0x7F;
                if (mapview.field269 == Timer.field397) {
                    mapview.field269 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!aa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 131)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)[Lb;", line = 157)
    public static final Pix24[] method5(byte arg0) {
        if (arg0 > -22) {
            field19 = null;
        }
        Pix24[] var1 = new Pix24[ByteArray.field127];
        for (int var2 = 0; var2 < ByteArray.field127; var2++) {
            Pix24 var3 = var1[var2] = new Pix24();
            var3.field23 = BZip2State.field506[var2];
            var3.field25 = JagException.field105[var2];
            var3.field22 = field19[var2];
            var3.field24 = class1.field4[var2];
            int var4 = var3.field24 * var3.field22;
            byte[] var5 = JavaMouse.field385[var2];
            var3.field26 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field26[var6] = Worldmap.field365[Timer.method189(var5[var6], 255)];
            }
        }
        MonotonicTime.method77((byte) 121);
        return var1;
    }

    @OriginalMember(owner = "mapview!aa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 199)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (StringNode.field81 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < ByteArrayPool.field178.length) {
            var3 = ByteArrayPool.field178[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (mapview.field269 >= 0 && var3 >= 0) {
            class1.field5[mapview.field269] = var3;
            mapview.field269 = mapview.field269 + 1 & 0x7F;
            if (mapview.field269 == Timer.field397) {
                mapview.field269 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = GZip.field122 + 1 & 0x7F;
            if (Packet.field342 != var4) {
                Worldmap.field355[GZip.field122] = var3;
                Packet.field343[GZip.field122] = -1;
                GZip.field122 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 259)
    public final void keyTyped(KeyEvent arg0) {
        int var2 = HashTable.method32(arg0, 23571);
        if (var2 >= 0) {
            int var3 = GZip.field122 + 1 & 0x7F;
            if (Packet.field342 != var3) {
                Worldmap.field355[GZip.field122] = -1;
                Packet.field343[GZip.field122] = var2;
                GZip.field122 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)Ls;", line = 303)
    public static final PixFont method6(int arg0) {
        if (arg0 != 128) {
            field15 = null;
        }
        PixFont var1 = new PixFont(JagException.field105, field19, class1.field4, Worldmap.field365, JavaMouse.field385);
        MonotonicTime.method77((byte) 101);
        return var1;
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(I)V", line = 317)
    public static void method7(int arg0) {
        field20 = null;
        if (arg0 <= 60) {
            method6(105);
        }
        field19 = null;
        field17 = null;
        field13 = null;
        field16 = null;
        field15 = null;
        field21 = null;
        field18 = null;
    }
}
