import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class311 {

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5106 = new String[] { method2675(method2674("E\r915\u001d")), method2675(method2674("Y\u0004?x\u0011Q\u0004-k")) };

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZZ)V")
    public static final void method2673(boolean arg0, boolean arg1) {
        try {
            field5105++;
            class164[] var2 = class185.field2949;
            for (int var3 = 0; var3 < var2.length; var3++) {
                class164 var4 = var2[var3];
                var4.method1540(-84);
            }
            class697.method5067(19653);
            class688.method5007(-56);
            class141.method1315();
            for (int var5 = 0; var5 < 4; var5++) {
                class297.field4841[var5].method4251(true);
            }
            class21.method137(8, false);
            System.gc();
            class525.method3924(2, -1);
            class588.field8526 = -1;
            class127.field1835 = arg1;
            class201.method1831((byte) -126);
            class361.method2982(true, -114);
            class543.method4038((byte) 104);
            class547.method4060(0);
            class645.method4670((byte) -96);
            if (arg0) {
                class302.method2598(13, -3);
            } else {
                class302.method2598(3, -3);
                try {
                    class470.method3617((byte) -121, class476.field7255, field5106[1]);
                } catch (Throwable var7) {
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5106[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2674(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2675(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
