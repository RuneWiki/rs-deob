import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class756 {

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field70 = -1;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field71 = new String[] { method44(method43("v\u001b\\v~")), method44(method43("v\u001b\\r~")), method44(method43("dP\\\u0019+")), method44(method43("q\u000b\u001e[")), method44(method43("v\u001b\\u~")), method44(method43("v\u001b\\s~")), method44(method43("v\u001b\\t~")) };

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field59 = class54.method410((byte) -60, 1600);

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field69 = 1408;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lel;")
    public static class573 field68;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLib;)V", line = 4)
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field70 = arg1.method1445((byte) 120);
            field63++;
            if (arg0 >= 32) {
                this.field67 = arg1.method1453((byte) 81);
                this.field66 = arg1.method1455((byte) 62);
                this.field62 = arg1.method1455((byte) 62);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field71[4] + arg0 + ',' + (arg1 == null ? field71[3] : field71[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field65++;
            class313 var5 = class196.method1670((long) arg2, arg4, 99);
            var5.method2636((byte) 115);
            var5.field4958 = arg0;
            var5.field4952 = arg3;
            var5.field4951 = arg1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field71[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z", line = 37)
    public static final boolean method40(int arg0, int arg1, int arg2) {
        try {
            if (arg1 < 7) {
                method42(-74);
            }
            field64++;
            return class443.method3404(7275, arg0, arg2) & class94.method802(arg2, arg0, (byte) -115);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field71[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lkp;I)V", line = 48)
    public final void method41(class514 arg0, int arg1) {
        try {
            field61++;
            arg0.method3900(this.field62, this.field67, this.field66, this.field70, arg1 - 9779);
            if (arg1 != 9893) {
                this.field67 = -69;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field71[6] + (arg0 == null ? field71[3] : field71[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 66)
    public static void method42(int arg0) {
        try {
            field68 = null;
            if (arg0 != 4) {
                field68 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field71[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method43(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method44(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
