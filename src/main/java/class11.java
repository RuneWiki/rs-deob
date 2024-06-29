import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class11 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Z")
    public static boolean field218 = false;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[Lpc;")
    public static class29[] field221 = new class29[50];

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field219 = 0;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[Z")
    public static boolean[] field222 = new boolean[5];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBLub;II)V")
    public static final void method51(int arg0, byte arg1, class227 arg2, int arg3, int arg4) {
        field223++;
        class105 var5 = class255.method1738(arg4, (byte) -63, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field1832 != null) {
            class34 var6 = new class34();
            var6.field580 = arg3;
            var6.field583 = var5;
            var6.field568 = var5.field1832;
            var6.field562 = arg2;
            class218.method1377(var6, false);
        }
        boolean var7 = true;
        if (var5.field1975 > 0) {
            var7 = class186.method1181(205, var5);
        }
        if (!var7 || !class200.method1288(client.method494(var5), 1, arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class176.field2935.method664((byte) -124, 253);
            class250.field4338++;
            class176.field2935.method1427(arg4, (byte) 103);
            class176.field2935.method1451(arg0, (byte) -124);
        }
        if (arg3 == 2) {
            class132.field2296++;
            class176.field2935.method664((byte) -117, 127);
            class176.field2935.method1427(arg4, (byte) 3);
            class176.field2935.method1451(arg0, (byte) -111);
        }
        if (arg3 == 3) {
            class176.field2935.method664((byte) -116, 50);
            class142.field2449++;
            class176.field2935.method1427(arg4, (byte) 0);
            class176.field2935.method1451(arg0, (byte) -126);
        }
        if (arg3 == 4) {
            class156.field2685++;
            class176.field2935.method664((byte) -118, 250);
            class176.field2935.method1427(arg4, (byte) 93);
            class176.field2935.method1451(arg0, (byte) -120);
        }
        if (arg1 != 40) {
            method52(27);
        }
        if (arg3 == 5) {
            class176.field2935.method664((byte) -121, 20);
            class176.field2935.method1427(arg4, (byte) -128);
            class176.field2935.method1451(arg0, (byte) -118);
            class124.field2228++;
        }
        if (arg3 == 6) {
            class176.field2935.method664((byte) -120, 47);
            class123.field2208++;
            class176.field2935.method1427(arg4, (byte) -108);
            class176.field2935.method1451(arg0, (byte) -117);
        }
        if (arg3 == 7) {
            class12.field238++;
            class176.field2935.method664((byte) -120, 3);
            class176.field2935.method1427(arg4, (byte) -20);
            class176.field2935.method1451(arg0, (byte) -123);
        }
        if (arg3 == 8) {
            class81.field1418++;
            class176.field2935.method664((byte) -108, 53);
            class176.field2935.method1427(arg4, (byte) -123);
            class176.field2935.method1451(arg0, (byte) -124);
        }
        if (arg3 == 9) {
            class114.field2093++;
            class176.field2935.method664((byte) -114, 86);
            class176.field2935.method1427(arg4, (byte) -115);
            class176.field2935.method1451(arg0, (byte) -111);
        }
        if (arg3 == 10) {
            class184.field3126++;
            class176.field2935.method664((byte) 47, 223);
            class176.field2935.method1427(arg4, (byte) 6);
            class176.field2935.method1451(arg0, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method52(int arg0) {
        field221 = null;
        field222 = null;
        if (arg0 != 15333) {
            method54(-45);
        }
    }

    @OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field225++;
    }

    @OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field217++;
        if (class134.field2341 != null) {
            int var2 = class208.method1324(123, arg0);
            if (var2 >= 0) {
                int var3 = class31.field501 + 1 & 0x7F;
                if (class60.field1119 != var3) {
                    class118.field2149[class31.field501] = -1;
                    class89.field1538[class31.field501] = var2;
                    class31.field501 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field216++;
        if (class134.field2341 != null) {
            class73.field1278 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class220.field3701.length) {
                var3 = class220.field3701[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class251.field4352 >= 0 && var3 >= 0) {
                class32.field529[class251.field4352] = ~var3;
                class251.field4352 = class251.field4352 + 1 & 0x7F;
                if (class251.field4352 == class156.field2682) {
                    class251.field4352 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field224++;
        if (class134.field2341 != null) {
            class251.field4352 = -1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method53(int arg0, byte[] arg1) {
        class226 var2 = new class226(arg1);
        field226++;
        int var3 = var2.method1471(arg0 ^ 0xFF);
        int var4 = var2.method1478(-32053);
        if (var4 < arg0 || !(class253.field4435 == 0 || var4 <= class253.field4435)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1435(var7, var4, (byte) -13, 0);
            return var7;
        } else {
            int var5 = var2.method1478(arg0 - 32053);
            if (var5 < 0 || class253.field4435 != 0 && class253.field4435 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class154.method967(var6, var5, arg1, var4, 9);
            } else {
                class162.field2747.method631(86, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static final void method54(int arg0) {
        field227++;
        if (class116.field2129 == null) {
            return;
        }
        try {
            byte[] var1 = class116.field2129.method454(126);
            if (var1 != null) {
                class226 var2 = new class226(var1);
                class242.field4202 = var2.method1447(0);
                class182.field3104 = new class139[class242.field4202];
                for (int var3 = 0; var3 < class242.field4202; var3++) {
                    class139 var4 = class182.field3104[var3] = new class139();
                    int var5 = var2.method1447(0);
                    var4.field2408 = (var5 & 0x8000) != 0;
                    var4.field2409 = var5 & 0x7FFF;
                    var4.field2412 = var2.method1480(87);
                    var4.field2410 = var2.method1433(arg0 ^ 0x7077);
                    var4.field2415 = var3;
                    var4.field2414 = class57.method340((byte) -105, var2.method1447(0));
                }
                class28.method145(class182.field3104.length - 1, class182.field3104, 0, (byte) -122);
                class116.field2129 = null;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class116.field2129 = null;
        }
        if (arg0 != 28674) {
            method51(-66, (byte) 6, (class227) null, -103, -87);
        }
    }

    @OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field220++;
        if (class134.field2341 == null) {
            return;
        }
        class73.field1278 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class220.field3701.length) {
            var3 = class220.field3701[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class251.field4352 >= 0 && var3 >= 0) {
            class32.field529[class251.field4352] = var3;
            class251.field4352 = class251.field4352 + 1 & 0x7F;
            if (class251.field4352 == class156.field2682) {
                class251.field4352 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class31.field501 + 1 & 0x7F;
            if (class60.field1119 != var4) {
                class118.field2149[class31.field501] = var3;
                class89.field1538[class31.field501] = -1;
                class31.field501 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
