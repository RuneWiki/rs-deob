import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class501 {

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    public int field7094;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field7093 = 0;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7097 = new BigInteger("8f7feb37295d518ee1a9d54b127e20c29e573fbc44c899df33c6f5f76f7f5e16301f172a5ecf621b4d28b3b162fe99c52072240cee10ec780db5e58f61d0146d", 16);

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)Lria;", line = 3)
    public static final class288 method2936(int arg0, int arg1) {
        field7096++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class218.field2938[var2] == null || class218.field2938[var2][var3] == null) {
            boolean var4 = class525.method3039(4, var2);
            if (!var4) {
                return null;
            }
        }
        return arg0 > -47 ? null : class218.field2938[var2][var3];
    }

    @OriginalMember(owner = "client!bia", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field7098++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)V", line = 38)
    public static void method2937(boolean arg0) {
        field7097 = null;
        if (arg0) {
            field7097 = null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lrba;)V", line = 48)
    public static final void method2938(class435 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class435 var2 = null;
            for (class435 var3 = class730.field10164[var1]; var3 != null; var3 = var3.field5791) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class730.field10164[var1] = var3.field5791;
                    } else {
                        var2.field5791 = var3.field5791;
                    }
                    class563.field7924 = true;
                    return;
                }
                var2 = var3;
            }
            class435 var4 = null;
            for (class435 var5 = class72.field1005[var1]; var5 != null; var5 = var5.field5791) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class72.field1005[var1] = var5.field5791;
                    } else {
                        var4.field5791 = var5.field5791;
                    }
                    class563.field7924 = true;
                    return;
                }
                var4 = var5;
            }
            class435 var6 = null;
            for (class435 var7 = class259.field3278[var1]; var7 != null; var7 = var7.field5791) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class259.field3278[var1] = var7.field5791;
                    } else {
                        var6.field5791 = var7.field5791;
                    }
                    class563.field7924 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(I)V", line = 131)
    public class501(int arg0) {
        this.field7094 = arg0;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V", line = 142)
    public static final void method2939(byte arg0, int arg1, Color arg2, String arg3, Color arg4, Color arg5) {
        try {
            Graphics var6 = class262.field3311.getGraphics();
            if (class80.field1109 == null) {
                class80.field1109 = new Font("Helvetica", 1, 13);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class595.field8306 == null) {
                    class595.field8306 = class262.field3311.createImage(class356.field4586, class466.field6263);
                }
                Graphics var7 = class595.field8306.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class356.field4586, class466.field6263);
                int var8 = class356.field4586 / 2 - 152;
                int var9 = class466.field6263 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - (arg1 * 3), 30);
                var7.setFont(class80.field1109);
                var7.setColor(arg5);
                var7.drawString(arg3, (304 - arg3.length() * 6) / 2 + var8, var9 + 22);
                if (class367.field4736 != null) {
                    var7.setFont(class80.field1109);
                    var7.setColor(arg5);
                    var7.drawString(class367.field4736, class356.field4586 / 2 - (class367.field4736.length() * 6 / 2), class466.field6263 / 2 + -26);
                }
                if (arg0 >= -7) {
                    field7093 = 45;
                }
                var6.drawImage(class595.field8306, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class356.field4586, class466.field6263);
                int var10 = class356.field4586 / 2 - 152;
                int var11 = class466.field6263 / 2 - 18;
                var6.setColor(arg2);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg4);
                var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(arg1 * 3 + var10 + 2, var11 - -2, 300 - (arg1 * 3), 30);
                var6.setFont(class80.field1109);
                var6.setColor(arg5);
                if (class367.field4736 != null) {
                    var6.setFont(class80.field1109);
                    var6.setColor(arg5);
                    var6.drawString(class367.field4736, class356.field4586 / 2 - class367.field4736.length() * 6 / 2, class466.field6263 / 2 + -26);
                }
                var6.drawString(arg3, var10 + ((304 - (arg3.length() * 6)) / 2), var11 - -22);
            }
        } catch (Exception var13) {
            class262.field3311.repaint();
        }
        field7095++;
    }
}
