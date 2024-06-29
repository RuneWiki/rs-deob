import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class221 {

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "Z")
    public boolean field3208;

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "S")
    public short field3210;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "S")
    public short field3207;

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "B")
    public byte field3209;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "S")
    public short field3206;

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3211 = new String[] { method1860(method1859("omUxY2")), method1860(method1859("omUx'sd]\"%2")), method1860(method1859("omUxZ2")) };

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "Lmv;")
    public static class125 field3202 = new class125(55, 0);

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V", line = 8)
    public static void method1857(int arg0) {
        try {
            if (arg0 != 0) {
                field3202 = null;
            }
            field3202 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3211[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)I", line = 18)
    public static final int method1858(int arg0, int arg1) {
        try {
            if (arg0 <= 48) {
                method1858(116, 120);
            }
            field3200++;
            return arg1 & 0xFF;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3211[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 42)
    public class221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        try {
            this.field3201 = arg11;
            this.field3203 = arg1;
            this.field3199 = arg2;
            this.field3204 = arg3;
            this.field3205 = arg0;
            this.field3208 = arg10;
            this.field3210 = (short) arg4;
            this.field3207 = (short) arg6;
            this.field3209 = (byte) arg8;
            this.field3206 = (short) arg5;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field3211[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1859(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1860(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
