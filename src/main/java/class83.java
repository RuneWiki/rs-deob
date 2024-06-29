import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class83 extends Canvas {

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field1072;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1069 = -1;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lfh;")
    public static class140 field1065;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lkj;")
    public static class252 field1067;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "[I")
    public static int[] field1070;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;IZ)I", line = 4)
    public static final int method614(int arg0, String arg1, int arg2, boolean arg3) {
        field1071++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg1.length();
        int var7 = 0;
        if (arg2 <= 65) {
            field1065 = (class140) null;
        }
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var7 + var11;
            if ((var10 / arg0) != var7) {
                throw new NumberFormatException();
            }
            var5 = true;
            var7 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V", line = 89)
    public static final void method615(String arg0, String arg1, int arg2, byte arg3) {
        class315.field4643 = arg2;
        class89.field1117 = arg1;
        class314.field4635 = arg0;
        field1066++;
        if (class89.field1117.equals("") || class314.field4635.equals("")) {
            class49.field654 = 3;
        } else if (class84.field1085 == -1) {
            class340.field5312 = 0;
            class261.field3778 = 1;
            int var4 = -14 / ((-arg3 - 76) / 39);
            class49.field654 = -3;
            class10.field118 = 0;
            class299 var5 = new class299(128);
            var5.method2048(10, 78);
            var5.method2084(true, (int) (Math.random() * 9.9999999E7D));
            var5.method2049(-19780, class201.method1476(-117, class89.field1117));
            var5.method2084(true, (int) (Math.random() * 9.9999999E7D));
            var5.method2042(class314.field4635, -65);
            var5.method2084(true, (int) (Math.random() * 9.9999999E7D));
            var5.method2095(class71.field926, class312.field4586, 0);
            class251.field3681.field4351 = 0;
            class251.field3681.method2048(24, 107);
            class251.field3681.method2048(var5.field4351 + 2, 73);
            class251.field3681.method2098(-107, 550);
            class251.field3681.method2061(0, var5.field4350, var5.field4351, (byte) -67);
        } else {
            class345.method2394((byte) -120);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 134)
    public static void method616(byte arg0) {
        field1067 = null;
        if (arg0 <= -85) {
            field1065 = null;
            field1070 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 146)
    public final void paint(Graphics arg0) {
        this.field1072.paint(arg0);
        field1068++;
    }

    @OriginalMember(owner = "client!ql", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 155)
    public final void update(Graphics arg0) {
        this.field1072.update(arg0);
        field1073++;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 170)
    public class83(Component arg0) {
        this.field1072 = arg0;
    }
}
