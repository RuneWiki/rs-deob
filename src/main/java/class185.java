import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class185 {

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2404 = new String[] { method1530(method1529("<8#BY")), method1530(method1529("3{#(\f")), method1530(method1529("& aj")), method1530(method1529("<8#DY")), method1530(method1529("<8#EY")), method1530(method1529("<8#GY")) };

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Lhj;")
    public static class671 field2395 = new class671(11, 0, 1, 2);

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "S")
    public static short field2402 = 256;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 7)
    public static void method1524(int arg0) {
        try {
            int var1 = 6 / ((-arg0 - 27) / 51);
            field2395 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2404[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V", line = 20)
    public static final void method1525(int arg0, int arg1) {
        try {
            field2391++;
            if (arg0 == -8011 && class351.field5087 != arg1) {
                class625.field8929 = class14.field187 = class126.field1586[arg1];
                class502.method3843(true);
                class613.field8771 = new int[class625.field8929][class14.field187];
                class674.field9463 = new int[class625.field8929][class14.field187];
                class634.field8995 = new int[4][class625.field8929 >> 3][class14.field187 >> 3];
                for (int var2 = 0; var2 < 4; var2++) {
                    class195.field2919[var2] = class623.method4579(class14.field187, class52.method560(arg0, -8012), class625.field8929);
                }
                class247.field3547 = new byte[4][class625.field8929][class14.field187];
                class143.method1240(arg0 + 8010, class625.field8929, 4, class14.field187);
                class111.method1041((byte) 117, class14.field187 >> 3, class236.field3418, class625.field8929 >> 3);
                class351.field5087 = arg1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2404[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)Lgb;", line = 51)
    public static final class571 method1526(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8842;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ltm;I)Z", line = 65)
    public final boolean method1527(class185 arg0, int arg1) {
        try {
            if (arg1 != 1) {
                method1525(-74, 63);
            }
            field2389++;
            return this.field2403 == arg0.field2403 && this.field2386 == arg0.field2386 && this.field2387 == arg0.field2387;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2404[3] + (arg0 == null ? field2404[2] : field2404[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V", line = 80)
    public static final void method1528(int arg0, int arg1) {
        try {
            field2397++;
            if (arg0 <= 24) {
                method1528(-14, 102);
            }
            class294 var2 = class146.method1261((long) arg1, 100, 6);
            var2.method2376(-88);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2404[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1529(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1530(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
