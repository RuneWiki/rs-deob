import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class32 {

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field410 = new String[] { method345(method344("$L\u0018o")), method345(method344(".OZ@b")), method345(method344("1\u0017Z-7")), method345(method344(".OZGb")), method345(method344(".OZBb")), method345(method344(".OZAb")) };

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "C")
    public char field408;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBLjc;)V")
    private final void method340(int arg0, byte arg1, class711 arg2) {
        try {
            if (arg0 == 1) {
                this.field408 = class365.method2901((byte) 97, arg2.method5125((byte) -19));
            } else if (arg0 == 2) {
                this.field404 = arg2.method5116((byte) -126);
                this.field406 = arg2.method5128(arg1 ^ 0xFFFFFF84);
                this.field402 = arg2.method5128(0);
            }
            field409++;
            if (arg1 != -124) {
                method343(90, 103, null, 54);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field410[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field410[0] : field410[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjc;)V")
    public final void method341(int arg0, class711 arg1) {
        try {
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    if (arg0 != 1024) {
                        return;
                    }
                    field401++;
                    return;
                }
                this.method340(var3, (byte) -124, arg1);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field410[4] + arg0 + ',' + (arg1 == null ? field410[0] : field410[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Llga;I)V")
    public static final void method342(class47 arg0, int arg1) {
        try {
            class326.field4466 = 0;
            field403++;
            class723.field10292 = 0;
            class21.field262 = new class470();
            class115.field1478 = new class31[1024];
            class703.field9828 = new class464[class532.field7710[class323.field4403] + 1];
            class550.field8038 = 0;
            class632.field8975 = 0;
            class14.method93((byte) 47, arg0);
            class345.method2768(arg0, 2);
            if (arg1 != -1) {
                method342(null, 12);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field410[1] + (arg0 == null ? field410[0] : field410[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILqp;I)V")
    public static final void method343(int arg0, int arg1, class277 arg2, int arg3) {
        try {
            field405++;
            class387.field5654[arg3][arg1] = arg2;
            if (arg0 >= -32) {
                method342(null, -56);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field410[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field410[0] : field410[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method344(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method345(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
