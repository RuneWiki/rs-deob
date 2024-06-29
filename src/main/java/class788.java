import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class788 {

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "Lbt;")
    public class395 field11376 = new class395();

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11378 = new String[] { method5674(method5673("+\u0010>~*h")), method5674(method5673("+\u0010>~)h")) };

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "J")
    public static long field11375 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
    public static int field11372;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "I")
    public static int field11373;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
    public static int field11374;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
    public static int field11377;

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "Llga;")
    public static class47 field11371;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)I", line = 14)
    public static final int method5671(int arg0, int arg1) {
        try {
            field11373++;
            int var4 = arg1 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            if (arg0 != 1282334120) {
                field11375 = 50L;
            }
            return var9 + 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11378[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)V", line = 32)
    public static void method5672(byte arg0) {
        try {
            if (arg0 >= -15) {
                field11375 = -115L;
            }
            field11371 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11378[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5673(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5674(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
