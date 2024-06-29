import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class129 {

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1852 = new String[] { method1236(method1235("+L,gb")), method1236(method1235("+L,db")) };

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "[I")
    public static int[] field1848 = new int[8];

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "[I")
    public static int[] field1847 = new int[200];

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1846 = new String[200];

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "J")
    public static long field1849;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Lpea;")
    public static class758 field1850;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)[B")
    public abstract byte[] method37(byte arg0);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[B)V")
    public abstract void method36(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(IBI)[B")
    public abstract byte[] method38(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method1233(int arg0) {
        try {
            field1850 = null;
            field1846 = null;
            field1847 = null;
            if (arg0 > -45) {
                field1850 = null;
            }
            field1848 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1852[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBI)I")
    public static final int method1234(int arg0, byte arg1, int arg2) {
        try {
            field1851++;
            if (arg0 == 1 || arg0 == 3) {
                return class731.field10708[arg2 & 0x3];
            } else {
                if (arg1 != 66) {
                    method1233(-28);
                }
                return class164.field2656[arg2 & 0x3];
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1852[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1235(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1236(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
