import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class353 extends class578 {

    @OriginalMember(owner = "client!iga", name = "u", descriptor = "I")
    public int field5108 = -1;

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "Z")
    public boolean field5111 = false;

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5122 = new String[] { method2824(method2823(".x\u0014b\u001do")), method2824(method2823(".x\u0014b`.q\u001c8bo")), method2824(method2823(".x\u0014b\u001fo")), method2824(method2823(".x\u0014b\u001eo")) };

    @OriginalMember(owner = "client!iga", name = "q", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5107 = new Rectangle[100];

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!iga", name = "x", descriptor = "[J")
    public static long[] field5112;

    @OriginalMember(owner = "client!iga", name = "t", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!iga", name = "w", descriptor = "I")
    public int field5110;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
    public int field5115;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!iga", name = "v", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!iga", name = "s", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!iga", name = "r", descriptor = "Llga;")
    public static class47 field5121;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(B)V")
    public static void method2820(byte arg0) {
        try {
            field5107 = null;
            if (arg0 != 33) {
                method2821((byte) 86);
            }
            field5112 = null;
            field5121 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5122[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
    public static final void method2821(byte arg0) {
        try {
            field5116++;
            if (class201.field2963 != null) {
                if (arg0 > -37) {
                    method2822(104);
                }
                class298.field4155 = new class272();
                class298.field4155.method2235((byte) 51, class201.field2963, class201.field2963.field10585, class389.field5666, class201.field2963.field10586.method4068((byte) -102, class405.field5883));
                class28.field356 = new Thread(class298.field4155, "");
                class28.field356.start();
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5122[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
    public static final void method2822(int arg0) {
        try {
            for (class500 var1 = (class500) class687.field9624.method3696(arg0 ^ arg0); var1 != null; var1 = (class500) class687.field9624.method3697(-81)) {
                class531.method4019(var1.field7305, arg0 - 13);
            }
            field5106++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5122[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(I)V")
    public class353(int arg0) {
        try {
            this.field5108 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5122[1] + arg0 + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field5107[var0] = new Rectangle();
        }
        field5114 = -50;
        field5112 = new long[100];
    }

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2823(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2824(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
