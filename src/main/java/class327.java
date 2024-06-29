import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class327 extends Canvas {

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field5366;

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5372 = new String[] { method2784(method2783("\u000elj?")), method2784(method2783("\u000brg}FH")), method2784(method2783("\u001b7(}y")), method2784(method2783("\u000brg}q\u0010}g'aH")), method2784(method2783("\u000brg}GH")), method2784(method2783("\u000brg}EH")), method2784(method2783("\u000brg}t\u0001ph',")), method2784(method2783("\u000brg}8\two':H")) };

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "Leu;")
    public static class507 field5365 = new class507();

    @OriginalMember(owner = "client!kka", name = "f", descriptor = "Z")
    public static boolean field5370 = false;

    @OriginalMember(owner = "client!kka", name = "h", descriptor = "Z")
    public static boolean field5371 = false;

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!kka", name = "c", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!kka", name = "g", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!kka", name = "d", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!kka", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void update(Graphics arg0) {
        try {
            this.field5366.update(arg0);
            field5369++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5372[3] + (arg0 == null ? field5372[0] : field5372[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(ILha;ZI)Lda;", line = 12)
    public static final class64 method2780(int arg0, class63 arg1, boolean arg2, int arg3) {
        try {
            if (arg3 == -1) {
                field5368++;
                class85 var4 = class33.method341(arg1, arg0, arg2, 0);
                return var4 == null ? null : var4.field1276;
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5372[1] + arg0 + ',' + (arg1 == null ? field5372[0] : field5372[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(IZI)Z", line = 29)
    public static final boolean method2781(int arg0, boolean arg1, int arg2) {
        try {
            if (arg1) {
                field5364++;
                return (arg2 & 0x800) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5372[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 50)
    public final void paint(Graphics arg0) {
        try {
            this.field5366.paint(arg0);
            field5367++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5372[6] + (arg0 == null ? field5372[0] : field5372[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 60)
    public class327(Component arg0) {
        try {
            this.field5366 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5372[7] + (arg0 == null ? field5372[0] : field5372[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)V", line = 69)
    public static void method2782(int arg0) {
        try {
            if (arg0 != 2048) {
                method2780(54, null, false, 23);
            }
            field5365 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5372[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2783(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2784(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
