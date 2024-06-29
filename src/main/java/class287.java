import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class287 extends class688 {

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!vea", name = "q", descriptor = "Ljava/lang/String;")
    public String field4624;

    @OriginalMember(owner = "client!vea", name = "r", descriptor = "S")
    public short field4627;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4631 = new String[] { method2432(method2431("\u001e]9.")), method2432(method2431("\u0006M4l.\u0019F<6,X")), method2432(method2431("\u000b\u0006{lo")), method2432(method2431("\u0006M4lSX")), method2432(method2431("\u0006M4lPX")) };

    @OriginalMember(owner = "client!vea", name = "o", descriptor = "Lvn;")
    public static class330 field4626 = new class330(7, 6);

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "J")
    public static long field4630 = 1L;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)V", line = 6)
    public static void method2429(int arg0) {
        try {
            field4626 = null;
            if (arg0 < 68) {
                field4626 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4631[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BII)I", line = 17)
    public static final int method2430(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != 71) {
                return -82;
            }
            field4625++;
            double var3 = Math.log((double) arg2) / Math.log(2.0D);
            double var5 = Math.log((double) arg1) / Math.log(2.0D);
            double var7 = (var3 - var5) * Math.random() + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4631[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 41)
    public class287(String arg0, int arg1) {
        try {
            this.field4628 = (int) (class712.method5167(-2334) / 1000L);
            this.field4624 = arg0;
            this.field4627 = (short) arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4631[1] + (arg0 == null ? field4631[0] : field4631[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2431(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2432(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
