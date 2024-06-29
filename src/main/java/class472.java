import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class472 extends class755 {

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    private int field6856 = -1;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6857 = new String[] { method3589(method3588("Ir;-%")), method3589(method3588("\\)yo")), method3589(method3588("C8;Bp")), method3589(method3588("C8;Ap")), method3589(method3588("C8;Gp")), method3589(method3588("C8;Fp")), method3589(method3588("C8;@p")) };

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field6852 = -1;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLha;)V", line = 9)
    public static final void method3585(boolean arg0, class66 arg1) {
        try {
            class613.field8960 = new class12[class151.field1867.length];
            if (arg0) {
                method3585(true, null);
            }
            field6849++;
            for (int var2 = 0; var2 < class151.field1867.length; var2++) {
                int var3 = class151.field1867[var2];
                class578 var4 = class350.method2876(7, var3, class657.field9488);
                class67 var5 = arg1.method563(var4, class481.method3677(class451.field6617, var3), true);
                class613.field8960[var2] = new class12(var5, var4);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6857[5] + arg0 + ',' + (arg1 == null ? field6857[1] : field6857[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLib;)V", line = 35)
    public final void method1992(byte arg0, class163 arg1) {
        try {
            this.field6856 = arg1.method1445((byte) 102);
            int var3 = 68 % ((3 - arg0) / 51);
            field6854++;
            arg1.method1455((byte) 62);
            if (arg1.method1455((byte) 62) != 255) {
                arg1.field2201--;
                arg1.method1435(-126);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6857[2] + arg0 + ',' + (arg1 == null ? field6857[1] : field6857[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 57)
    public static final void method3586(int arg0) {
        try {
            field6851++;
            if (arg0 > -65) {
                method3585(true, null);
            }
            for (class753 var1 = (class753) class195.field2615.method971(347); var1 != null; var1 = (class753) class195.field2615.method973(true)) {
                class744.method5423(63, var1.field10964);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6857[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILwca;)V", line = 82)
    public final void method1990(int arg0, class705 arg1) {
        try {
            if (arg0 == -1) {
                arg1.method5150(this.field6856, 0);
                field6853++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6857[3] + arg0 + ',' + (arg1 == null ? field6857[1] : field6857[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 94)
    public static final void method3587(int arg0) {
        try {
            if (arg0 != 0) {
                field6852 = 77;
            }
            for (class142 var1 = (class142) class743.field10807.method3863((byte) 64); var1 != null; var1 = (class142) class743.field10807.method3862(-353)) {
                if (var1.field1704) {
                    var1.method1211(1733170857);
                }
            }
            field6850++;
            for (class142 var2 = (class142) class278.field4182.method3863((byte) 64); var2 != null; var2 = (class142) class278.field4182.method3862(-353)) {
                if (var2.field1704) {
                    var2.method1211(1733170857);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6857[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3588(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3589(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
