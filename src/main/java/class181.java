import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class181 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field2471 = new int[256];

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2472 = "Created gameworld";

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1326(int arg0) {
        field2476++;
        class296.field4301 = 0;
        class318.field4689 = 0;
        class282.method1922(-2);
        class277.method1874(-16097);
        class92.method666((byte) -54);
        class280.method1891(-12937);
        int var1 = 0;
        int var2 = -20 / ((arg0 - 30) / 44);
        while (class296.field4301 > var1) {
            int var3 = class341.field5322[var1];
            if (class313.field4603 != class311.field4574[var3].field4875) {
                if (class311.field4574[var3].field3459 > 0) {
                    class16.method120(15, class311.field4574[var3]);
                }
                class311.field4574[var3] = null;
            }
            var1++;
        }
        if (class315.field4648 != class240.field3490.field4351) {
            throw new RuntimeException("gpp1 pos:" + class240.field3490.field4351 + " psize:" + class315.field4648);
        }
        for (int var4 = 0; var4 < class112.field1441; var4++) {
            if (class311.field4574[class288.field4157[var4]] == null) {
                throw new RuntimeException("gpp2 pos:" + var4 + " size:" + class112.field1441);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method1327(boolean arg0) {
        class247.field3603.method2258((byte) 86);
        field2470++;
        class30.field344.method2258((byte) 86);
        if (arg0) {
            field2481 = 98;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2471[var0] = var1;
        }
        field2481 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[BZI)Ljava/lang/String;", line = 80)
    public static final String method1328(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field2478++;
        char[] var4 = new char[arg3];
        if (arg2) {
            method1329(true);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg1[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class131.field1785[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V", line = 159)
    public static void method1329(boolean arg0) {
        field2471 = null;
        field2472 = null;
        if (!arg0) {
            method1327(false);
        }
    }
}
