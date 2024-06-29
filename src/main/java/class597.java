import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class597 implements class34 {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljava/lang/String;")
    private String field8639;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8645 = new String[] { method4374(method4373("Cf(\u000f")), method4374(method4373("V=jM5")), method4374(method4373("Kvj `")), method4374(method4373("Kvj!`")), method4374(method4373("Kvj&`")), method4374(method4373("Kvj'`")), method4374(method4373("Kvj\"`")), method4374(method4373("Kvj_!Cz0]`")), method4374(method4373("Kvj%`")) };

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lhl;")
    public static class556 field8644 = new class556(114, 1);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Z")
    private boolean field8641;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Lil;")
    public final class7 method345(int arg0) {
        try {
            int var2 = 21 % ((-arg0 - 55) / 60);
            field8637++;
            return class7.field80;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8645[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)I")
    public final int method346(byte arg0) {
        try {
            if (arg0 < 31) {
                return 31;
            }
            field8636++;
            int var2 = class621.method4537(this.field8639, (byte) 67);
            if (var2 >= 0 && var2 <= 100) {
                return var2;
            } else {
                this.field8641 = true;
                return 100;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8645[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public static final void method4369(String arg0, String arg1, boolean arg2) {
        try {
            field8640++;
            if (arg0.length() <= 320 && class305.method2622(!arg2)) {
                class185.field2943.method1540(-65);
                class140.method1297(arg2);
                class442.field6893 = arg1;
                class89.field1328 = arg0;
                class302.method2598(5, -3);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8645[2] + (arg0 == null ? field8645[0] : field8645[1]) + ',' + (arg1 == null ? field8645[0] : field8645[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public static final void method4370(int arg0, int arg1) {
        try {
            class363.field5940.method294(arg0, arg1 - 30643);
            if (arg1 == 30013) {
                field8638++;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8645[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)Z")
    public final boolean method4371(int arg0) {
        try {
            int var2 = 5 / ((-arg0 - 23) / 52);
            field8643++;
            return this.field8641;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8645[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method4372(boolean arg0) {
        try {
            field8644 = null;
            if (arg0) {
                method4370(-91, -49);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8645[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class597(String arg0) {
        try {
            this.field8639 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8645[7] + (arg0 == null ? field8645[0] : field8645[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4373(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4374(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
