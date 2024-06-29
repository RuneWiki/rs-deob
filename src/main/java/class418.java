import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class418 {

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Lui;")
    private class251 field6025 = new class251(64);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Llga;")
    private class47 field6022;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Llga;")
    private class47 field6021;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6029 = new String[] { method3263(method3262("{\b\u0019}")), method3263(method3262("nS[?J")), method3263(method3262("w\u000b[-^{\u0014\u0001/\u001f")), method3263(method3262("w\u000b[R\u001f")), method3263(method3262("w\u000b[S\u001f")), method3263(method3262("w\u000b[P\u001f")) };

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "B")
    public static byte field6024 = -6;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "Z")
    public static boolean field6028 = false;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V")
    public static final void method3259(byte arg0) {
        try {
            field6023++;
            if (arg0 == -6) {
                class87.field1225 = new class524();
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6029[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static final void method3260(byte arg0) {
        try {
            field6026++;
            if (arg0 != -40) {
                field6028 = true;
            }
            if (class561.field8167 == 10) {
                class561.field8167 = 11;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6029[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lqga;")
    public final class658 method3261(int arg0, int arg1) {
        try {
            field6027++;
            class658 var3 = (class658) this.field6025.method2053(0, (long) arg0);
            if (var3 != null) {
                return var3;
            }
            byte[] var4;
            if (arg0 < 32768) {
                var4 = this.field6021.method512(arg0, 0, (byte) -34);
            } else {
                var4 = this.field6022.method512(arg0 & 0x7FFF, 0, (byte) -123);
            }
            class658 var5 = new class658();
            if (var4 != null) {
                var5.method4775(new class711(var4), 4);
            }
            if (arg1 <= arg0) {
                var5.method4771(false);
            }
            this.field6025.method2051((long) arg0, var5, 93);
            return var5;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6029[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(ILlga;Llga;)V")
    public class418(int arg0, class47 arg1, class47 arg2) {
        try {
            this.field6022 = arg2;
            this.field6021 = arg1;
            if (this.field6021 != null) {
                this.field6021.method509(true, 0);
            }
            if (this.field6022 != null) {
                this.field6022.method509(true, 0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6029[2] + arg0 + ',' + (arg1 == null ? field6029[0] : field6029[1]) + ',' + (arg2 == null ? field6029[0] : field6029[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3262(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3263(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
