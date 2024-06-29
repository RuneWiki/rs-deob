import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class312 extends class399 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "[Z")
    private boolean[] field4548 = new boolean[112];

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "[F")
    public static float[] field4541 = new float[4];

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[[S")
    public static short[][] field4545 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lgn;")
    public static class475 field4535 = new class475(44, 8);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Lhv;")
    private class343 field4542;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Lhv;")
    private class343 field4543;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Lhv;")
    private class343 field4552;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field4546;

    @OriginalMember(owner = "client!qe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1873(96, arg0, 1);
        field4547++;
    }

    @OriginalMember(owner = "client!qe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4534++;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method1866(int arg0) {
        if (arg0 != 0) {
            method1869(74);
        }
        field4540++;
        try {
            if (class378.field5658 == 1) {
                int var1 = class8.field133.method1489(false);
                if (var1 > 0 && class8.field133.method1513(-107)) {
                    int var2 = var1 - class409.field6002;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class8.field133.method1525(true, var2);
                } else {
                    class8.field133.method1505((byte) -7);
                    class8.field133.method1514(true);
                    class388.field5750 = null;
                    class66.field990 = null;
                    if (class181.field2593 == null) {
                        class378.field5658 = 0;
                    } else {
                        class378.field5658 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class8.field133.method1505((byte) -7);
            class378.field5658 = 0;
            class66.field990 = null;
            class181.field2593 = null;
            class388.field5750 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static void method1867(int arg0) {
        field4535 = null;
        field4541 = null;
        int var1 = -23 / (arg0 / 43);
        field4545 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public final void method1868(byte arg0) {
        if (arg0 >= -117) {
            field4541 = null;
        }
        field4550++;
        this.method1870((byte) 113);
    }

    @OriginalMember(owner = "client!qe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4536++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class501.method3016(255, var2)) {
            this.method1874(-1, (byte) -81, 2, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public static final void method1869(int arg0) {
        if (arg0 != 70) {
            field4535 = null;
        }
        if (class121.field1587 != null) {
            class121.field1587.method1704(arg0 - 68);
        }
        field4533++;
        if (class342.field4970 != null) {
            class342.field4970.method1704(2);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    private final void method1870(byte arg0) {
        field4549++;
        if (this.field4546 == null) {
            return;
        }
        this.field4546.removeKeyListener(this);
        this.field4546.removeFocusListener(this);
        this.field4546 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field4548[var2] = false;
        }
        this.field4543 = null;
        if (arg0 == 113) {
            this.field4542 = null;
            this.field4552 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method1871(Component arg0, int arg1) {
        if (arg1 != -6464) {
            return;
        }
        field4530++;
        this.method1870((byte) 113);
        this.field4546 = arg0;
        Method var3 = class44.field674;
        if (var3 != null) {
            try {
                var3.invoke(this.field4546, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field4546.addKeyListener(this);
        this.field4546.addFocusListener(this);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public final synchronized void method1872(int arg0) {
        if (arg0 <= 90) {
            return;
        }
        field4551++;
        for (class343 var2 = this.field4542; var2 != null; var2 = var2.field4983) {
            if (var2.field4982 == 0) {
                if (var2.field4974 >= 0) {
                    var2.field4980 = !this.field4548[var2.field4974];
                }
                this.field4548[var2.field4974] = true;
            } else if (var2.field4982 == 1) {
                this.field4548[var2.field4974] = false;
            } else if (var2.field4982 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field4548[var3] = false;
                }
            }
        }
        this.field4552 = this.field4542;
        this.field4542 = null;
        this.field4543 = null;
    }

    @OriginalMember(owner = "client!qe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1873(47, arg0, 0);
        field4553++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
    private final void method1873(int arg0, KeyEvent arg1, int arg2) {
        field4544++;
        int var4 = arg1.getKeyCode();
        if (arg0 < 28) {
            return;
        }
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class467.field6752.length) {
            int var5 = class467.field6752[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1874(var6, (byte) -81, arg2, '\u0000');
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!qe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4539++;
        this.method1874(0, (byte) -81, -1, '\u0000');
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBIC)V")
    private final void method1874(int arg0, byte arg1, int arg2, char arg3) {
        field4554++;
        class343 var5 = new class343();
        var5.field4974 = arg0;
        var5.field4978 = arg3;
        var5.field4982 = arg2;
        var5.field4973 = class109.method653(false);
        if (this.field4543 == null) {
            this.field4542 = var5;
        } else {
            this.field4543.field4983 = var5;
        }
        if (arg1 != -81) {
            this.field4548 = null;
        }
        this.field4543 = var5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1875(byte[] arg0, int arg1) {
        field4532++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        if (arg1 < 105) {
            field4541 = null;
        }
        class268.method1638(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Lct;")
    public final class93 method1876(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field4538++;
        class343 var2;
        for (var2 = this.field4552; var2 != null && var2.field4982 == -1; var2 = var2.field4983) {
        }
        if (var2 == null) {
            this.field4552 = null;
        } else {
            this.field4552 = var2.field4983;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Z")
    public final boolean method1877(int arg0, int arg1) {
        field4531++;
        int var3 = 100 % ((arg0 - 68) / 55);
        return arg1 >= 0 && arg1 < 112 ? this.field4548[arg1] : false;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class312(Component arg0) {
        class261.method1617(-31395);
        this.method1871(arg0, -6464);
    }
}
