import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class465 extends class218 {

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "[Luc;")
    public class121[] field6778;

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6782 = new String[] { method3582(method3581("5\nm-L7\u0002ewNv")), method3582(method3581("0\u0019`o")), method3582(method3581("%B\"-\r")), method3582(method3581("5\nm-5v")), method3582(method3581("5\nm-4v")) };

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Liea;")
    public static class421 field6779 = new class421();

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lvn;")
    public static class328 field6780;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILvo;)V", line = 4)
    public static final void method3579(int arg0, class782 arg1) {
        try {
            field6781++;
            if (class351.field5091 && arg0 == -10474) {
                class425.field6130++;
                if (arg1.field11205 != null) {
                    class782 var2 = class372.method2952(class121.field1535, class671.field9452, 0);
                    if (var2 != null) {
                        class618 var3 = new class618();
                        var3.field8816 = var2;
                        var3.field8805 = arg1;
                        var3.field8812 = arg1.field11205;
                        class158.method1334(var3);
                    }
                }
                class274 var4 = class375.method2969((byte) 1, class415.field5992, class60.field916.field11100);
                var4.field3885.method5138((byte) -99, class108.field1420);
                var4.field3885.method5115(arg1.field11158, arg0 ^ 0xDD0121DE);
                var4.field3885.method5138((byte) -98, arg1.field11206);
                var4.field3885.method5118(arg1.field11276, (byte) -54);
                var4.field3885.method5121(-122, class671.field9452);
                var4.field3885.method5082(-128, class121.field1535);
                class60.field916.method5608(var4, 29867);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6782[4] + arg0 + ',' + (arg1 == null ? field6782[1] : field6782[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V", line = 48)
    public static void method3580(byte arg0) {
        try {
            field6779 = null;
            field6780 = null;
            if (arg0 < 16) {
                field6780 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6782[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "([Luc;)V", line = 62)
    public class465(class121[] arg0) {
        try {
            this.field6778 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6782[0] + (arg0 == null ? field6782[1] : field6782[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3581(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3582(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
