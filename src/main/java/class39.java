import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class39 {

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field446 = new String[] { method377(method376("-@\u0013ZW")), method377(method376("-@\u0013YW")), method377(method376("\u001ek{")) };

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lwh;")
    public static class155 field443 = new class155(5, 1);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Llt;")
    public static class706 field444 = new class706(10, 19);

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field445 = new Hashtable();

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 11)
    public static void method374(int arg0) {
        try {
            field443 = null;
            field444 = null;
            if (arg0 == -19450) {
                field445 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field446[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Les;", line = 24)
    public static final class404 method375(int arg0) {
        try {
            field441++;
            class527 var1 = null;
            class404 var2 = new class404(class305.field4924, 0);
            try {
                class218 var3 = class393.field6256.method628(-80, "", true);
                while (var3.field3402 == 0) {
                    class524.method3918(arg0 ^ 0x2F27, 1L);
                }
                if (arg0 != -12069) {
                    field443 = null;
                }
                if (var3.field3402 == 1) {
                    var1 = (class527) var3.field3407;
                    byte[] var4 = new byte[(int) var1.method3938(arg0 ^ 0x46CE)];
                    int var6;
                    for (int var5 = 0; var5 < var4.length; var5 += var6) {
                        var6 = var1.method3935(false, var5, var4.length - var5, var4);
                        if (var6 == -1) {
                            throw new IOException(field446[2]);
                        }
                    }
                    var2 = new class404(new class176(var4), class305.field4924, 0);
                }
            } catch (Exception var9) {
            }
            try {
                if (var1 != null) {
                    var1.method3940(1);
                }
            } catch (Exception var8) {
            }
            return var2;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field446[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method376(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method377(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
