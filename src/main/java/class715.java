import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class715 extends class127 {

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10346 = new String[] { method5207(method5206("u,;=>")), method5207(method5206("u,;?>")), method5207(method5206("lq;Pk")), method5207(method5206("y*y\u0012")), method5207(method5206("u,;<>")) };

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
    public static int[] field10343 = new int[1];

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "[Lfs;")
    public static class581[] field10345;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
    public static void method5203(byte arg0) {
        try {
            field10345 = null;
            field10343 = null;
            if (arg0 > -41) {
                method5203((byte) 97);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10346[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLvv;)Lpb;")
    public static final class681 method5204(byte arg0, class343 arg1) {
        try {
            field10342++;
            if (arg0 <= 104) {
                method5205(null, false);
            }
            class681 var2;
            if (class206.field3178 == null) {
                var2 = new class681();
            } else {
                var2 = class206.field3178;
                class206.field3178 = class206.field3178.field9865;
                class379.field5769--;
                var2.field9865 = null;
            }
            var2.field9867 = arg1;
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10346[1] + arg0 + ',' + (arg1 == null ? field10346[3] : field10346[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lla;Z)V")
    public static final void method5205(class476 arg0, boolean arg1) {
        try {
            class274.field4146 = arg0;
            field10344++;
            if (arg1) {
                method5204((byte) -8, null);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10346[4] + (arg0 == null ? field10346[3] : field10346[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5206(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5207(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
