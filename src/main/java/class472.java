import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class472 extends class651 {

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field6922 = method3639(method3638("_,G\u0015B"));

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    public static int field6916 = -1;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public int field6914;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public int field6915;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public int field6918;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "Ljava/lang/String;")
    public String field6921;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 12)
    public static final void method3637(int arg0) {
        try {
            field6919++;
            if (class572.field8291 != -1) {
                int var1 = class604.field8668.method2881((byte) 121);
                int var2 = class604.field8668.method2879(-237);
                class682 var3 = (class682) class530.field7694.method3977((byte) -95);
                if (var3 != null) {
                    var1 = var3.method1086((byte) -44);
                    var2 = var3.method1088(-6);
                }
                int var4 = 0;
                int var5 = 0;
                if (class212.field3119) {
                    var4 = class784.method5647((byte) 105);
                    var5 = class30.method328(-17233);
                }
                if (arg0 <= 103) {
                    field6916 = -19;
                }
                class756.method5480(class572.field8291, var5, var4, var2, class391.field5700 + var4, var2 + var5, class711.field9998 + var5, (byte) 42, var1, var4, var1 + var4, var5);
                if (class226.field3277 != null) {
                    class367.method2919(var2 + var5, -17591, var1 - -var4);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6922 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3638(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3639(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
