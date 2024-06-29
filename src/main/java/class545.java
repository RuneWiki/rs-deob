import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class545 {

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8149 = new String[] { method4117(method4116("AZ2}")), method4117(method4116("GG??d\u0007")), method4117(method4116("T\u0001p?X")), method4117(method4116("GG??g\u0007")) };

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "Lwia;")
    public static class790 field8143 = new class790(71, 2);

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    public static int field8147 = 0;

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "[I")
    public static int[] field8146 = new int[250];

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public int field8137;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    public int field8140;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    public int field8141;

    @OriginalMember(owner = "client!hha", name = "l", descriptor = "I")
    public int field8142;

    @OriginalMember(owner = "client!hha", name = "m", descriptor = "I")
    public int field8144;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
    public int field8145;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
    public int field8148;

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "[B")
    public byte[] field8136;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "[B")
    public byte[] field8139;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V", line = 5)
    public static void method4114(byte arg0) {
        try {
            field8146 = null;
            if (arg0 != 94) {
                method4114((byte) -50);
            }
            field8143 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8149[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IZIILmca;I)Ljava/awt/Frame;", line = 18)
    public static final Frame method4115(int arg0, boolean arg1, int arg2, int arg3, class33 arg4, int arg5) {
        try {
            field8138++;
            if (!arg4.method216(0)) {
                return null;
            }
            if (arg2 == 0) {
                class523[] var6 = class116.method1023(arg1, arg4);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; var8++) {
                    if (var6[var8].field7647 == arg5 && var6[var8].field7642 == arg0 && (arg3 == 0 || var6[var8].field7641 == arg3) && (!var7 || var6[var8].field7645 > arg2)) {
                        arg2 = var6[var8].field7645;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class42 var9 = arg4.method230(arg0, arg3, arg2, true, arg5);
            while (var9.field503 == 0) {
                class151.method1269(false, 10L);
            }
            if (arg1) {
                field8146 = null;
            }
            Frame var10 = (Frame) var9.field499;
            if (var10 == null) {
                return null;
            } else if (var9.field503 == 2) {
                class38.method250(arg4, var10, -107);
                return null;
            } else {
                return var10;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field8149[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field8149[0] : field8149[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4116(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4117(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
