import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class70 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[Lha;")
    public static class78[] field1165 = new class78[100];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lmb;")
    public static class132 field1163 = class166.method1092(" )2> <col=ffffff>", 124);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[I")
    public static int[] field1173 = new int[1000];

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lbb;")
    public static class14 field1164;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method428(int arg0) {
        field1164 = null;
        field1173 = null;
        int var1 = -54 % ((27 - arg0) / 61);
        field1165 = null;
        field1163 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lpb;BLpb;Lca;Lpb;)Z")
    public static final boolean method429(class165 arg0, byte arg1, class165 arg2, class24 arg3, class165 arg4) {
        field1169++;
        class34.field556 = arg3;
        if (arg1 == -100) {
            class88.field1537 = arg4;
            class140.field2624 = arg0;
            class60.field1024 = arg2;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1172++;
        if (class57.field964 != null) {
            class1.field11 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class42.field675.length > var2) {
                var3 = class42.field675[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class216.field3951 >= 0 && var3 >= 0) {
                class149.field2732[class216.field3951] = ~var3;
                class216.field3951 = class216.field3951 + 1 & 0x7F;
                if (class71.field1201 == class216.field3951) {
                    class216.field3951 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!gd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1170++;
        if (class57.field964 != null) {
            int var2 = class144.method969(arg0, -1);
            if (var2 >= 0) {
                int var3 = class66.field1102 + 1 & 0x7F;
                if (field1175 != var3) {
                    class96.field1811[class66.field1102] = -1;
                    class71.field1188[class66.field1102] = var2;
                    class66.field1102 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!gd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class57.field964 != null) {
            class1.field11 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class42.field675.length) {
                var3 = class42.field675[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class216.field3951 >= 0 && var3 >= 0) {
                class149.field2732[class216.field3951] = var3;
                class216.field3951 = class216.field3951 + 1 & 0x7F;
                if (class71.field1201 == class216.field3951) {
                    class216.field3951 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class66.field1102 + 1 & 0x7F;
                if (field1175 != var4) {
                    class96.field1811[class66.field1102] = var3;
                    class71.field1188[class66.field1102] = -1;
                    class66.field1102 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1167++;
    }

    @OriginalMember(owner = "client!gd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class57.field964 != null) {
            class216.field3951 = -1;
        }
        field1174++;
    }

    @OriginalMember(owner = "client!gd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1166++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBI[Lmb;)Lmb;")
    public static final class132 method430(int arg0, byte arg1, int arg2, class132[] arg3) {
        field1168++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class62.field1045;
            }
            var4 += arg3[arg2 + var5].field2479;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        if (arg1 != -14) {
            return null;
        }
        for (int var8 = 0; var8 < arg0; var8++) {
            class132 var10 = arg3[arg2 + var8];
            class80.method495(var10.field2446, 0, var7, var6, var10.field2479);
            var6 += var10.field2479;
        }
        class132 var9 = new class132();
        var9.field2479 = var4;
        var9.field2446 = var7;
        return var9;
    }
}
