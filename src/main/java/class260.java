import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class260 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lsg;")
    public static class30 field4596 = class167.method1221((byte) 33, "Konfig geladen)3");

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4599 = 0;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[Lce;")
    public static class205[] field4600 = new class205[0];

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lsg;")
    public static class30 field4601 = class167.method1221((byte) 33, ":duelfriend:");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lmc;")
    public static class151 field4602;

    @OriginalMember(owner = "client!gd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class81.field1737 != null) {
            class170.field3202 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class58.field1265.length > var2) {
                var3 = class58.field1265[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class98.field1985 >= 0 && var3 >= 0) {
                class20.field371[class98.field1985] = var3;
                class98.field1985 = class98.field1985 + 1 & 0x7F;
                if (class98.field1985 == class69.field1570) {
                    class98.field1985 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class104.field2105 + 1 & 0x7F;
                if (class76.field1680 != var4) {
                    class226.field4049[class104.field2105] = var3;
                    class275.field4806[class104.field2105] = -1;
                    class104.field2105 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4598++;
    }

    @OriginalMember(owner = "client!gd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4605++;
        if (class81.field1737 != null) {
            class170.field3202 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class58.field1265.length) {
                var3 = class58.field1265[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class98.field1985 >= 0 && var3 >= 0) {
                class20.field371[class98.field1985] = ~var3;
                class98.field1985 = class98.field1985 + 1 & 0x7F;
                if (class98.field1985 == class69.field1570) {
                    class98.field1985 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method1800(int arg0, int arg1) {
        field4594++;
        if (!class1.method9(arg1, (byte) -13)) {
            return;
        }
        class31[] var2 = class259.field4572[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class31 var5 = var2[var3];
            if (var5 != null) {
                var5.field738 = 0;
                var5.field769 = 0;
            }
        }
        int var4 = -101 % ((arg0 - 14) / 32);
    }

    @OriginalMember(owner = "client!gd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4597++;
        if (class81.field1737 != null) {
            class98.field1985 = -1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class81.field1737 != null) {
            int var2 = class41.method434(arg0, (byte) 117);
            if (var2 >= 0) {
                int var3 = class104.field2105 + 1 & 0x7F;
                if (class76.field1680 != var3) {
                    class226.field4049[class104.field2105] = -1;
                    class275.field4806[class104.field2105] = var2;
                    class104.field2105 = var3;
                }
            }
        }
        arg0.consume();
        field4604++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4603++;
        if (arg0 != -29121) {
            method1800(35, -93);
        }
        int var7 = class68.method609(class275.field4804, 22050, class167.field3064, arg6);
        int var8 = class68.method609(class275.field4804, 22050, class167.field3064, arg4);
        int var9 = class68.method609(class48.field1096, arg0 ^ 0xFFFFD81D, class252.field4458, arg5);
        int var10 = class68.method609(class48.field1096, 22050, class252.field4458, arg3);
        int var11 = class68.method609(class275.field4804, 22050, class167.field3064, arg2 + arg6);
        int var12 = class68.method609(class275.field4804, arg0 ^ 0xFFFFD81D, class167.field3064, arg4 - arg2);
        for (int var13 = var7; var13 < var11; var13++) {
            class194.method1405(true, class121.field2390[var13], var10, var9, arg1);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class194.method1405(true, class121.field2390[var14], var10, var9, arg1);
        }
        int var15 = class68.method609(class48.field1096, 22050, class252.field4458, arg2 + arg5);
        int var16 = class68.method609(class48.field1096, arg0 ^ 0xFFFFD81D, class252.field4458, arg3 - arg2);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class121.field2390[var17];
            class194.method1405(true, var18, var15, var9, arg1);
            class194.method1405(true, var18, var10, var16, arg1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1802(int arg0) {
        field4596 = null;
        field4600 = null;
        field4601 = null;
        field4602 = null;
        int var1 = -79 % ((25 - arg0) / 37);
    }

    @OriginalMember(owner = "client!gd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4595++;
    }
}
