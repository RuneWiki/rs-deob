import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class378 extends class568 {

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "J")
    public long field6109;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6113 = new String[] { method3108(method3107("ZQ\u001fjT")), method3108(method3107("ZQ\u001f\u0017\u0015[IE\u0015T")), method3108(method3107("ZQ\u001fiT")) };

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field6110 = 0;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field6108 = 0;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 8)
    public static final void method3105(int arg0) {
        try {
            field6111++;
            class392.field6245.method2962(0);
            class683.field9892.method1544((byte) 43);
            class272.field4380 = 0;
            class683.field9892.field2666 = null;
            if (arg0 > 0) {
                class683.field9892.field2665 = 0;
                class683.field9892.field2667 = null;
                class683.field9892.field2661 = null;
                class683.field9892.field2660.field2799 = 0;
                class785.method5645((byte) -107);
                class570.field8258 = null;
                class712.field10299 = 0;
                class198.field3145 = 0;
                class413.field6573 = 0;
                class566.field8232 = null;
                class133.field1890 = null;
                class318.field5184 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6113[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V", line = 34)
    public static final void method3106(int arg0) {
        try {
            int var1 = 55 / ((45 - arg0) / 58);
            if (class662.field9437 != null) {
                if (class316.field5141) {
                    class164.method1547(false);
                }
                class239.field3687.method1923(0);
                class141.method1315();
                class95.method918((byte) 81);
                class54.method556((byte) -105);
                class782.method5615(-2);
                class688.method5009(true);
                if (class641.field9192 != null) {
                    class641.field9192.method926(false);
                }
                class243.method2095(13437);
                class688.method5007(-62);
                class519.method3890((byte) 115);
                class615.method4480(0);
                class21.method137(8, false);
                for (int var2 = 0; var2 < 2048; var2++) {
                    class738 var3 = class33.field395[var2];
                    if (var3 != null) {
                        for (int var4 = 0; var4 < var3.field1207.length; var4++) {
                            var3.field1207[var4] = null;
                        }
                    }
                }
                for (int var5 = 0; var5 < class421.field6647; var5++) {
                    class426 var6 = class78.field1214[var5].field194;
                    if (var6 != null) {
                        for (int var7 = 0; var7 < var6.field1207.length; var7++) {
                            var6.field1207[var7] = null;
                        }
                    }
                }
                class400.field6321 = null;
                class461.field7105 = null;
                class662.field9437.method668(-4369);
                class662.field9437 = null;
            }
            field6112++;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6113[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V", line = 113)
    public class378() {
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(J)V", line = 118)
    public class378(long arg0) {
        try {
            this.field6109 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6113[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3107(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3108(char[] arg0) {
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
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
