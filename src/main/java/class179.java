import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class179 extends Canvas {

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field2693;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field2698 = 0;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2695 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Lhn;")
    public static class509 field2699 = new class509(91, 6);

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "Lie;")
    public static class6 field2701 = new class6("RC", 1);

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Lhn;")
    public static class509 field2702 = new class509(64, 1);

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "B")
    public static byte field2700;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!kv", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 11)
    public final void update(Graphics arg0) {
        field2694++;
        this.field2693.update(arg0);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 18)
    public class179(Component arg0) {
        this.field2693 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1198(byte arg0) {
        field2696++;
        class51 var1 = null;
        try {
            if (arg0 < 63) {
                return;
            }
            class449 var2 = class360.field5349.method2194("3", false, 0);
            while (var2.field6570 == 0) {
                class434.method2690(10, 1L);
            }
            if (var2.field6570 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class51) var2.field6569;
            byte[] var3 = new byte[(int) var1.method492((byte) -35)];
            if (var3.length == 0) {
                class99.field1419 = "";
                class121.field1829 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method491(var4, -1, var3, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class217 var6 = new class217(var3);
                int var7 = var6.method1515((byte) 123);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field3556 = var7 + 1;
                if (!var6.method1551(-125)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field3556 = 1;
                int var8 = var6.method1515((byte) 122);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class121.field1829 = var6.method1559(true);
                class99.field1419 = var6.method1559(true);
            }
        } catch (Exception var10) {
            class99.field1419 = "";
            class121.field1829 = "";
        }
        try {
            if (var1 != null) {
                var1.method496(-32307);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 103)
    public static void method1199(int arg0) {
        field2702 = null;
        field2699 = null;
        if (arg0 == 0) {
            field2695 = null;
            field2701 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 120)
    public final void paint(Graphics arg0) {
        this.field2693.paint(arg0);
        field2697++;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V", line = 129)
    public static final void method1200(int arg0) {
        field2692++;
        class71.field1020.method1566(true, class203.field3371.method2542(-1));
        class71.field1020.method1566(true, class304.field4590.method2542(-1));
        class71.field1020.method1566(true, class120.field1812.method2542(-1));
        class71.field1020.method1566(true, class525.field7684.method2542(-1));
        class71.field1020.method1566(true, class338.field5040.method2542(-1));
        class71.field1020.method1566(true, class430.field6378.method2542(-1));
        class71.field1020.method1566(true, class313.field4720.method2542(-1));
        class71.field1020.method1566(true, class524.field7677.method2542(-1));
        class71.field1020.method1566(true, class176.field2627.method2542(-1));
        class71.field1020.method1566(true, class431.field6387.method2542(-1));
        class71.field1020.method1566(true, class5.field44.method2542(-1));
        class71.field1020.method1566(true, class103.field1485.method2542(-1));
        class71.field1020.method1566(true, class491.field7054.method2542(-1));
        class71.field1020.method1566(true, class152.field2264.method2542(-1));
        class71.field1020.method1566(true, class409.field6102.method2542(-1));
        class71.field1020.method1566(true, class341.field5069.method2542(-1));
        class71.field1020.method1566(true, class80.field1152.method2542(-1));
        class71.field1020.method1566(true, class282.field4287.method2542(-1));
        class71.field1020.method1566(true, class217.field3527.method2542(-1));
        class71.field1020.method1566(true, class522.field7634.method2542(-1));
        class71.field1020.method1566(true, class293.field4448.method2542(-1));
        class71.field1020.method1566(true, class262.field4020.method2542(-1));
        if (arg0 <= 54) {
            field2701 = null;
        }
        class71.field1020.method1566(true, class180.field2704.method2542(-1));
        class71.field1020.method1566(true, class373.field5555.method2542(-1));
        class71.field1020.method1566(true, class356.field5275.method2542(-1));
        class71.field1020.method1566(true, class178.field2688.method2542(-1));
        class71.field1020.method1566(true, class458.field6666.method2542(-1));
        class71.field1020.method1566(true, class421.field6269.method2542(-1));
        class71.field1020.method1566(true, class358.field5321.method2542(-1));
        class71.field1020.method1566(true, class110.field1539.method2542(-1));
    }
}
