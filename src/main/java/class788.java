import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class788 extends class640 {

    @OriginalMember(owner = "client!nca", name = "Y", descriptor = "[Ljava/lang/String;")
    private static final String[] field11524 = new String[] { method5665(method5664("sIt\nt5")), method5665(method5664("s_yH")), method5665(method5664("sIt\nq5")), method5665(method5664("f\u0004;\nH")), method5665(method5664("sIt\nr5")), method5665(method5664("sIt\ns5")) };

    @OriginalMember(owner = "client!nca", name = "X", descriptor = "I")
    public static int field11520 = -1;

    @OriginalMember(owner = "client!nca", name = "R", descriptor = "[I")
    public static int[] field11521 = new int[13];

    @OriginalMember(owner = "client!nca", name = "U", descriptor = "I")
    public static int field11517;

    @OriginalMember(owner = "client!nca", name = "S", descriptor = "I")
    public static int field11519;

    @OriginalMember(owner = "client!nca", name = "T", descriptor = "I")
    public static int field11523;

    @OriginalMember(owner = "client!nca", name = "V", descriptor = "[B")
    private byte[] field11522;

    @OriginalMember(owner = "client!nca", name = "Q", descriptor = "[I")
    public static int[] field11518;

    @OriginalMember(owner = "client!nca", name = "W", descriptor = "[Lcda;")
    public static class180[] field11516;

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
    public class788() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIB)V")
    public final void method2724(int arg0, int arg1, byte arg2) {
        try {
            field11517++;
            int var4 = arg1 * 2;
            int var5 = arg2 & 0xFF;
            int var10001 = var4;
            int var9 = var4 + 1;
            this.field11522[var10001] = -1;
            this.field11522[var9] = (byte) (var5 * 3 >> 5);
            int var6 = -104 % ((-arg0 - 21) / 40);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11524[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)[B")
    public final byte[] method5661(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field11522 = new byte[arg1 * 2 * arg2 * arg3];
            field11519++;
            this.method521(arg3, (byte) 126, arg2, arg1);
            return arg0 == -1 ? this.field11522 : null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11524[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method5662(byte arg0, String arg1) {
        try {
            field11523++;
            if (arg1 == null) {
                return null;
            } else if (arg0 <= 84) {
                return null;
            } else {
                int var2 = 0;
                int var3 = arg1.length();
                while (var2 < var3 && class100.method949(arg1.charAt(var2), (byte) -64)) {
                    var2++;
                }
                while (var2 < var3 && class100.method949(arg1.charAt(var3 - 1), (byte) -64)) {
                    var3--;
                }
                int var4 = var3 - var2;
                if (var4 < 1 || var4 > 12) {
                    return null;
                }
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var6 < var3; var6++) {
                    char var7 = arg1.charAt(var6);
                    if (class227.method1990(var7, (byte) 120)) {
                        char var8 = class742.method5406((byte) 114, var7);
                        if (var8 != '\u0000') {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11524[2] + arg0 + ',' + (arg1 == null ? field11524[1] : field11524[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)V")
    public static void method5663(int arg0) {
        try {
            field11521 = null;
            int var1 = -24 % ((arg0 + 49) / 55);
            field11518 = null;
            field11516 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11524[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5664(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5665(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
