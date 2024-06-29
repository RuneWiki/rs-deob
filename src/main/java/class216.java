import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class216 extends Canvas {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field3309;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)I")
    public static final int method1406(boolean arg0, int arg1) {
        int var7 = arg1 - 1;
        field3305++;
        if (!arg0) {
            method1407(88);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method1407(int arg0) {
        field3310++;
        if (arg0 <= 21) {
            method1408((class52) null, (byte) -45);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class72.field1040[var1] = false;
        }
        class105.field1513 = 0;
        class80.field1107 = -1;
        class300.field4766 = -1;
        class292.field4670 = 0;
        class12.field203 = 5;
    }

    @OriginalMember(owner = "client!ph", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3313++;
        this.field3309.paint(arg0);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lfk;B)V")
    public static final void method1408(class52 arg0, byte arg1) {
        if (arg1 < 27) {
            method1406(true, 104);
        }
        field3307++;
        class270.field4310 = 3;
        class125 var2 = null;
        class150.method949((byte) 91, true);
        class116.field1677 = true;
        class221.field3440 = 127;
        class181.field2741 = 0;
        class314.field5048 = true;
        class108.field1548 = true;
        class288.field4598 = true;
        class71.field1033 = 0;
        class78.field1087 = true;
        class68.field959 = true;
        class179.field2716 = 0;
        class209.field3110 = 127;
        class37.field570 = true;
        class281.field4464 = true;
        class51.field716 = 255;
        class59.field818 = 0;
        class202.field3054 = true;
        class103.field1483 = true;
        class56.field782 = 2;
        class38.field583 = true;
        if (class42.field632 >= 96) {
            class220.method1445(2);
        } else {
            class220.method1445(0);
        }
        class221.field3441 = 0;
        class288.field4610 = 0;
        class71.field1028 = 0;
        class175.field2470 = true;
        class78.field1085 = false;
        class223.field3483 = false;
        class139.field1929 = false;
        try {
            class286 var3 = arg0.method331("runescape", -72);
            while (var3.field4570 == 0) {
                class17.method116(-71, 1L);
            }
            if (var3.field4570 == 1) {
                var2 = (class125) var3.field4567;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method799(-20975)];
                while (var4 < var5.length) {
                    int var6 = var2.method801(var4, var5, (byte) 83, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class32.method201(new class215(var5), (byte) -14);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method802(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class216(Component arg0) {
        this.field3309 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3311++;
        this.field3309.update(arg0);
    }
}
