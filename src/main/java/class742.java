import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class742 implements class245 {

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field10543;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public int field10541;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public int field10548;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field10547;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public int field10544;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public int field10542;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field10545;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "Lmq;")
    public class657 field10539;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Lrj;")
    public class252 field10540;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10553 = new String[] { method5380(method5379("\u0005]=\t%")), method5380(method5379("\u0005]=sd\u0018Egq%")), method5380(method5379("\r\u0002=ap")), method5380(method5379("\u0018Y\u007f#")), method5380(method5379("\u0005]=\u000b%")), method5380(method5379("\u0005]=\n%")), method5380(method5379("\u0005]=\f%")), method5380(method5379("\u0005]=\b%")) };

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
    public static int[] field10546 = new int[2];

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Lqa;")
    public static class104 field10549;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public static void method5375(int arg0) {
        try {
            if (arg0 == 0) {
                field10546 = null;
                field10549 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10553[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;Ljc;B)I")
    public static final int method5376(String arg0, class711 arg1, byte arg2) {
        try {
            if (arg2 != -13) {
                field10550 = -127;
            }
            field10552++;
            int var3 = arg1.field9945;
            byte[] var4 = class141.method1223(5779, arg0);
            arg1.method5094(127, var4.length);
            arg1.field9945 += class142.field1840.method4474(0, arg1.field9996, var4, arg1.field9945, var4.length, (byte) 82);
            return arg1.field9945 - var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10553[5] + (arg0 == null ? field10553[3] : field10553[2]) + ',' + (arg1 == null ? field10553[3] : field10553[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILvo;BLha;)V")
    public static final void method5377(int arg0, int arg1, class782 arg2, byte arg3, class18 arg4) {
        try {
            field10537++;
            if (arg3 < -98) {
                byte var5 = 63;
                byte var6 = 7;
                for (int var7 = 63; var7 >= 0; var7--) {
                    int var8 = var5 & 0x7F | (var7 & 0x3F) << 10 | var6 & 0x7 << 7;
                    class445.method3458(true, (byte) 124, false);
                    int var9 = class360.field5233[var8];
                    class485.method3742(false, true, -18448);
                    arg4.method237(arg0, arg1 + ((63 - var7) * arg2.field11244 >> 6), arg2.field11295, (arg2.field11244 >> 6) + 1, var9, 0);
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10553[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10553[3] : field10553[2]) + ',' + arg3 + ',' + (arg4 == null ? field10553[3] : field10553[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Luu;")
    public class240 method482(int arg0) {
        try {
            field10538++;
            if (arg0 != 0) {
                this.field10541 = 6;
            }
            return null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10553[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lrj;Lmq;IIIIIII)V")
    public class742(class252 arg0, class657 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            this.field10543 = arg4;
            this.field10541 = arg5;
            this.field10548 = arg8;
            this.field10547 = arg3;
            this.field10544 = arg6;
            this.field10542 = arg2;
            this.field10545 = arg7;
            this.field10539 = arg1;
            this.field10540 = arg0;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10553[1] + (arg0 == null ? field10553[3] : field10553[2]) + ',' + (arg1 == null ? field10553[3] : field10553[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZII)V")
    public static final void method5378(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            if (arg1 != 19806) {
                field10546 = null;
            }
            field10551++;
            if (class451.field6612.field9134.method4717(3) == 0) {
                class63.method672(false, 64);
            } else {
                class467.field6819 = class451.field6612.field9134.method4717(3);
                class279.method2271(arg1 ^ 0x4D59, true, 0);
            }
            class71.field1040 = arg4;
            class415.field5987 = arg2;
            class223.field3234 = arg3;
            class534.method4042(arg0);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10553[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5379(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5380(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
