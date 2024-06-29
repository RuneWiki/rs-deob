import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class790 {

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    private int field11510;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public int field11506;

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11511 = new String[] { method5709(method5708("\u0002aCg\n]")), method5709(method5708("\u0002aCgt\u001cfK=v]")), method5709(method5708("\u0002aCg\u000b]")), method5709(method5708("\u0002aCg\t]")), method5709(method5708("\u0002aCg<\u001a[V;!\u001bo\n")), method5709(method5708("\u0002aCg\f]")) };

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "Z")
    public static volatile boolean field11505 = false;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "I")
    public static int field11503;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "I")
    public static int field11507;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public static int field11508;

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "I")
    public static int field11509;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "[I")
    public static int[] field11504;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)V", line = 3)
    public static final void method5704(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 13) {
                method5705(94);
            }
            class792.method5710(arg1, arg2, (byte) -91);
            field11503++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11511[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        try {
            field11509++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11511[4] + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V", line = 30)
    public static void method5705(int arg0) {
        try {
            if (arg0 == -5882) {
                field11504 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11511[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(III)V", line = 41)
    public static final void method5706(int arg0, int arg1, int arg2) {
        try {
            field11507++;
            class313 var3 = class196.method1670((long) arg0, arg1, arg1 - 84);
            var3.method2636((byte) 87);
            var3.field4951 = arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11511[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)I", line = 58)
    public final int method5707(byte arg0) {
        try {
            if (arg0 > -115) {
                this.field11506 = -116;
            }
            field11508++;
            return this.field11510;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11511[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(II)V", line = 68)
    public class790(int arg0, int arg1) {
        try {
            this.field11510 = arg0;
            this.field11506 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11511[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5708(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5709(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
