import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class567 {

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8261 = new String[] { method4236(method4235("R5\u0018@yT5\u0000Fy{8\u000fR$")), method4236(method4235("p1\u000fQ\u0013M9\u001e\u0001$] \u001bQw]&\u001cN%\u0002")), method4236(method4235("V1\u0019q;Y \bN%U\u00196c2Y:>S8@-")), method4236(method4235("O5\u000f\u000f\u0016\u0010")), method4236(method4235("_1\u001aq;Y \bN%U\u0019,D6V\u0007\u000bS!]&")), method4236(method4235("R5\u0018@/\u00169\u000fO6_1\u0003D9Lz#c2Y:=D%N1\u001cb8V:\u000bB#Q;\u0000")), method4236(method4235("R5\u0018@yT5\u0000FyU5\u0000@0]9\u000bO#\u0016\u0019\u000fO6_1\u0003D9L\u0012\u000fB#W&\u0017")), method4236(method4235("[;\u0003\u000f$M:@L6V5\tD:]:\u001a\u001b#A$\u000b\u001c\u001fW =Q8L\u0010\u0007@0V;\u001dU>[")), method4236(method4235("[;\u0003\u000f$M:@L6V5\tD:]:\u001a\u000f\u001fW =Q8L\u0010\u0007@0V;\u001dU>[\u00196c2Y:")), method4236(method4235("R5\u0018@yT5\u0000Fyk \u001cH9_")) };

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field8258;

    // $FF: synthetic field
    @OriginalMember(owner = "client!waa", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field8259;

    // $FF: synthetic field
    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field8260;

    // $FF: synthetic method
    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4234(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 5)
    public static final synchronized void method4233(int arg0) {
        try {
            field8257++;
            if (class218.field3185 == null) {
                try {
                    Class var1 = Class.forName(field8261[6]);
                    int var2 = -80 / ((arg0 + 36) / 60);
                    Method var3 = var1.getDeclaredMethod(field8261[4], null);
                    Object var4 = var3.invoke(null, (Object[]) null);
                    Method var5 = var1.getMethod(field8261[2], Class.forName(field8261[5]), field8259 == null ? (field8259 = method4234(field8261[9])) : field8259, field8260 == null ? (field8260 = method4234(field8261[0])) : field8260);
                    class218.field3185 = var5.invoke(null, var4, field8261[7], Class.forName(field8261[8]));
                } catch (Exception var8) {
                    System.out.println(field8261[1]);
                    var8.printStackTrace();
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8261[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4235(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4236(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
