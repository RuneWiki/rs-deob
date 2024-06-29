import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class177 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
    public static int[] field2886 = new int[100];

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2896 = Calendar.getInstance();

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2901 = null;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[Z")
    public static boolean[] field2902 = new boolean[100];

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "[Ljava/lang/String;")
    private static String[] field2903 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Ldb;")
    public static class68 field2899 = new class68();

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "[I")
    public static int[] field2904 = new int[500];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static final void method1291(byte arg0) {
        field2894++;
        if (arg0 > -32) {
            field2896 = null;
        }
        class6.field63.method1255(-83);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field2899 = null;
        field2903 = null;
        field2886 = null;
        field2902 = null;
        field2904 = null;
        field2901 = null;
        field2896 = null;
        if (arg0 != 28074) {
            field2900 = -103;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static final void method1293(int arg0) {
        field2883++;
        if (arg0 <= -37) {
            class206.field3273.method1257(-121);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
    public static final void method1294(int arg0, byte arg1) {
        class115.field1845.method1262(arg0, 2736);
        class49.field811.method1262(arg0, 2736);
        field2897++;
        if (arg1 <= 102) {
            field2900 = 94;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1295(long arg0, byte arg1) {
        field2892++;
        class163.field2638.setTime(new Date(arg0));
        int var3 = class163.field2638.get(7);
        int var4 = class163.field2638.get(5);
        int var5 = class163.field2638.get(2);
        int var6 = class163.field2638.get(1);
        int var7 = class163.field2638.get(11);
        int var8 = class163.field2638.get(12);
        if (arg1 > -8) {
            return null;
        } else {
            int var9 = class163.field2638.get(13);
            return class53.field898[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + field2903[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    @OriginalMember(owner = "client!uf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2895++;
        if (class34.field516 == null) {
            return;
        }
        class14.field151 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class268.field4310.length > var2) {
            var3 = class268.field4310[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class41.field603 >= 0 && var3 >= 0) {
            class109.field1741[class41.field603] = var3;
            class41.field603 = class41.field603 + 1 & 0x7F;
            if (class41.field603 == class256.field4143) {
                class41.field603 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class99.field1594 + 1 & 0x7F;
            if (class68.field1134 != var4) {
                class115.field1828[class99.field1594] = var3;
                class125.field1975[class99.field1594] = '\u0000';
                class99.field1594 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1296(int arg0, Throwable arg1) throws IOException {
        field2884++;
        String var3;
        if (arg1 instanceof class238) {
            class238 var2 = (class238) arg1;
            arg1 = var2.field3811;
            var3 = var2.field3813 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg0 != 5) {
            return null;
        }
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)V")
    public static final void method1297(int arg0, byte arg1) {
        field2898++;
        if (class67.method473(arg0, (byte) -109)) {
            int var2 = -7 % ((31 - arg1) / 62);
            class158.method1082(-1, class34.field519[arg0], -6436);
        }
    }

    @OriginalMember(owner = "client!uf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class34.field516 != null) {
            class41.field603 = -1;
        }
        field2891++;
    }

    @OriginalMember(owner = "client!uf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class34.field516 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class52.method362(var2, 160)) {
                int var3 = class99.field1594 + 1 & 0x7F;
                if (class68.field1134 != var3) {
                    class115.field1828[class99.field1594] = -1;
                    class125.field1975[class99.field1594] = var2;
                    class99.field1594 = var3;
                }
            }
        }
        arg0.consume();
        field2885++;
    }

    @OriginalMember(owner = "client!uf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2888++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLwd;)V")
    public static final void method1298(byte arg0, class162 arg1) {
        field2887++;
        for (int var2 = 0; var2 < class181.field2958; var2++) {
            int var3 = arg1.method1114((byte) -13);
            int var4 = arg1.method1142(-18970);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class160.field2542[var3] != null) {
                class160.field2542[var3].field4158 = var4;
            }
        }
        if (arg0 != 35) {
            field2903 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Lqi;")
    public static final class232 method1299(int arg0) {
        byte[] var1 = class70.field1192[0];
        int var2 = class60.field976[0] * class246.field3916[0];
        field2890++;
        int[] var3 = new int[var2];
        int var4 = 0;
        if (arg0 != -19995) {
            return null;
        }
        while (var2 > var4) {
            var3[var4] = class243.field3870[class51.method359(255, var1[var4])];
            var4++;
        }
        class232 var5 = new class232(class255.field4128, class111.field1749, class273.field4380[0], class314.field5058[0], class246.field3916[0], class60.field976[0], var3);
        class28.method156(-27424);
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILdk;I)Lqi;")
    public static final class232 method1300(int arg0, int arg1, class251 arg2, int arg3) {
        field2889++;
        if (arg0 == -28957) {
            return class290.method1932(arg0 ^ 0xFFFF8E9D, arg1, arg3, arg2) ? class190.method1348(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2893++;
        if (class34.field516 != null) {
            class14.field151 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class268.field4310.length) {
                var3 = class268.field4310[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class41.field603 >= 0 && var3 >= 0) {
                class109.field1741[class41.field603] = ~var3;
                class41.field603 = class41.field603 + 1 & 0x7F;
                if (class41.field603 == class256.field4143) {
                    class41.field603 = -1;
                }
            }
        }
        arg0.consume();
    }
}
