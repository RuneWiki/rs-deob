import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class267 {

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4317 = new String[] { method2313(method2312("\u007f\u0000%s\u0019_\u0011yn\u0018kM")), method2313(method2312("\u007f\u0000%E^")), method2313(method2312("\u007f\u0000%F^")), method2313(method2312("D\u0000gq\u0013x\fhf")), method2313(method2312("b\u0010gk")), method2313(method2312("wK%)\u000b")) };

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lhl;")
    public static class556 field4314 = new class556(88, -2);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 10)
    public static void method2310(int arg0) {
        try {
            field4314 = null;
            if (arg0 > -109) {
                field4314 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4317[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;I)V", line = 25)
    public static final void method2311(Color arg0, String arg1, int arg2, Color arg3, Color arg4, int arg5) {
        try {
            field4316++;
            try {
                Graphics var6 = class442.field6902.getGraphics();
                if (class620.field8951 == null) {
                    class620.field8951 = new Font(field4317[3], 1, 13);
                }
                if (arg0 == null) {
                    arg0 = new Color(140, 17, 17);
                }
                if (arg3 == null) {
                    arg3 = new Color(140, 17, 17);
                }
                if (arg4 == null) {
                    arg4 = new Color(255, 255, 255);
                }
                try {
                    if (class52.field639 == null) {
                        class52.field639 = class442.field6902.createImage(class64.field881, class333.field5444);
                    }
                    Graphics var7 = class52.field639.getGraphics();
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, class64.field881, class333.field5444);
                    int var8 = class64.field881 / 2 - 152;
                    int var9 = class333.field5444 / 2 - 18;
                    var7.setColor(arg3);
                    var7.drawRect(var8, var9, 303, 33);
                    var7.setColor(arg0);
                    var7.fillRect(var8 + 2, var9 - -2, arg5 * 3, 30);
                    var7.setColor(Color.black);
                    if (arg2 < 115) {
                        field4314 = null;
                    }
                    var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                    var7.fillRect(var8 + (arg5 * 3) + 2, var9 + 2, 300 - (arg5 * 3), 30);
                    var7.setFont(class620.field8951);
                    var7.setColor(arg4);
                    var7.drawString(arg1, (304 - arg1.length() * 6) / 2 + var8, var9 - -22);
                    if (class768.field11247 != null) {
                        var7.setFont(class620.field8951);
                        var7.setColor(arg4);
                        var7.drawString(class768.field11247, class64.field881 / 2 - class768.field11247.length() * 6 / 2, class333.field5444 / 2 + -26);
                    }
                    var6.drawImage(class52.field639, 0, 0, null);
                } catch (Exception var13) {
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, class64.field881, class333.field5444);
                    int var10 = class64.field881 / 2 - 152;
                    int var11 = class333.field5444 / 2 - 18;
                    var6.setColor(arg3);
                    var6.drawRect(var10, var11, 303, 33);
                    var6.setColor(arg0);
                    var6.fillRect(var10 + 2, var11 + 2, arg5 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var6.fillRect(arg5 * 3 + (var10 + 2), var11 + 2, 300 - (arg5 * 3), 30);
                    var6.setFont(class620.field8951);
                    var6.setColor(arg4);
                    if (class768.field11247 != null) {
                        var6.setFont(class620.field8951);
                        var6.setColor(arg4);
                        var6.drawString(class768.field11247, class64.field881 / 2 - (class768.field11247.length() * 6 / 2), class333.field5444 / 2 + -26);
                    }
                    var6.drawString(arg1, var10 + ((304 - arg1.length() * 6) / 2), var11 + 22);
                }
            } catch (Exception var14) {
                class442.field6902.repaint();
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field4317[2] + (arg0 == null ? field4317[4] : field4317[5]) + ',' + (arg1 == null ? field4317[4] : field4317[5]) + ',' + arg2 + ',' + (arg3 == null ? field4317[4] : field4317[5]) + ',' + (arg4 == null ? field4317[4] : field4317[5]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "toString", descriptor = "()Ljava/lang/String;", line = 115)
    public final String toString() {
        try {
            field4315++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4317[0] + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2312(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!se", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2313(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
