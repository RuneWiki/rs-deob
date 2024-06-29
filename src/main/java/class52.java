import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class52 extends class502 {

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field644 = new String[] { method544(method543("\u000eY\r!\u0013Q")), method544(method543("\u000eY\r!\u0011Q")), method544(method543("\u0002\u0015B!-")), method544(method543("\u0017N\u0000c")), method544(method543("\u000eY\r!\u0012Q")) };

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "[I")
    public static int[] field642 = new int[4];

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field639;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field640;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public static void method540(int arg0) {
        try {
            if (arg0 != 4096) {
                method541(true, null, true, (byte) 96);
            }
            field639 = null;
            field642 = null;
            field640 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field644[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZLnc;ZB)V")
    public static final void method541(boolean arg0, class23 arg1, boolean arg2, byte arg3) {
        try {
            if (arg3 == -55) {
                field643++;
                int var4 = arg1.field219;
                int var5 = (int) arg1.field8252;
                arg1.method4173(-1);
                if (arg2) {
                    class309.method2650((byte) -98, var4);
                }
                class141.method1313((byte) -99, var4);
                class683 var6 = class200.method1826(true, var5);
                if (var6 != null) {
                    class454.method3525((byte) 27, var6);
                }
                class295.method2540(-21);
                if (!arg0 && class317.field5175 != -1) {
                    class50.method515(-90198420, class317.field5175, 1);
                }
                class346 var7 = new class346(class632.field9082);
                for (class23 var8 = (class23) var7.method2893(-20631); var8 != null; var8 = (class23) var7.method2895(false)) {
                    if (!var8.method4170(-93)) {
                        var8 = (class23) var7.method2893(-20631);
                        if (var8 == null) {
                            return;
                        }
                    }
                    if (var8.field220 == 3) {
                        int var9 = (int) var8.field8252;
                        if (var9 >>> 16 == var4) {
                            method541(arg0, var8, true, (byte) -55);
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field644[4] + arg0 + ',' + (arg1 == null ? field644[3] : field644[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V")
    public static final void method542(int arg0, int arg1) {
        try {
            if (class30.field329 == null || arg1 > class30.field329.length) {
                class30.field329 = new int[arg1];
            }
            if (arg0 != 0) {
                field642 = null;
            }
            field641++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field644[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method543(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method544(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
