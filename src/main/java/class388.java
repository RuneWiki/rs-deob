import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class388 extends class568 {

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public int field6194 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public int field6201 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public int field6198 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public int field6202 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public int field6195 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public int field6197 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public int field6205 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public int field6206 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Lsg;")
    public class420 field6204;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6207 = new String[] { method3161(method3160("\u0018{9`<")), method3161(method3160("\u0018{9g<")), method3161(method3160("\u0000e{O")), method3161(method3160("\u0018{9\u001f}\u0000yc\u001d<")), method3161(method3160("\u0015>9\ri")), method3161(method3160("\u0018{9a<")), method3161(method3160("\u0018{9b<")) };

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public static int field6192 = 0;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[F")
    public static float[] field6200 = new float[4];

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Llt;")
    public static class706 field6199 = new class706(4, 5);

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z", line = 5)
    public final boolean method3156(int arg0, int arg1, int arg2) {
        try {
            field6196++;
            if (arg1 != 4) {
                this.method3156(-73, 35, -30);
            }
            if (arg0 >= this.field6197 && this.field6198 >= arg0 && arg2 >= this.field6201 && this.field6195 >= arg2) {
                return true;
            } else {
                return this.field6194 <= arg0 && this.field6205 >= arg0 && arg2 >= this.field6206 && this.field6202 >= arg2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6207[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 23)
    public static void method3157(boolean arg0) {
        try {
            field6199 = null;
            if (!arg0) {
                method3159((byte) -5, -79);
            }
            field6200 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6207[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I", line = 44)
    public static final int method3158(int arg0) {
        try {
            field6193++;
            if (arg0 != Integer.MIN_VALUE) {
                field6199 = null;
            }
            return class106.field1531;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6207[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lsg;)V", line = 112)
    public class388(class420 arg0) {
        try {
            this.field6204 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6207[3] + (arg0 == null ? field6207[2] : field6207[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)V", line = 61)
    public static final void method3159(byte arg0, int arg1) {
        try {
            field6203++;
            if (class305.method2622(true)) {
                if (class222.field3490 != arg1) {
                    class748.field11039 = "";
                }
                class222.field3490 = arg1;
                class185.field2943.method1540(-75);
                int var2 = 116 / ((-arg0 - 21) / 62);
                class302.method2598(5, -3);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6207[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3160(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3161(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
