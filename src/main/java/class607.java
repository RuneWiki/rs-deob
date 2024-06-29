import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class607 {

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8754 = new String[] { method4437(method4436("u)va\n")), method4437(method4436("irv\f_")), method4437(method4436("|)4N")), method4437(method4436("u)v`\n")), method4437(method4436("u)vc\n")) };

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Lvn;")
    public static class330 field8748 = new class330(92, 3);

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "Lhl;")
    public static class556 field8751 = new class556(129, 4);

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "Liha;")
    public static class29 field8753 = new class29(8);

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public int field8740;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public int field8741;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public int field8742;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public int field8745;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field8746;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public int field8747;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public int field8750;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "[B")
    public byte[] field8744;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "[B")
    public byte[] field8752;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 4)
    public static void method4433(byte arg0) {
        try {
            field8751 = null;
            field8748 = null;
            field8753 = null;
            int var1 = -43 % ((-arg0 - 23) / 35);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8754[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z", line = 19)
    public static final boolean method4434(int arg0, int arg1) {
        try {
            field8743++;
            if (arg1 != 190) {
                field8751 = null;
            }
            return arg0 == 3 || arg0 == 4;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8754[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIILuo;)V", line = 32)
    public static final void method4435(int arg0, int arg1, int arg2, class603 arg3) {
        try {
            field8749++;
            if (class16.field177) {
                int var4 = 0;
                for (class59 var5 = (class59) arg3.field8713.method5147((byte) -68); var5 != null; var5 = (class59) arg3.field8713.method5144(256)) {
                    int var6 = class343.method2883(-1002, var5);
                    if (var4 < var6) {
                        var4 = var6;
                    }
                }
                var4 += 8;
                int var7 = arg3.field8711 * 16 + 21;
                if (arg2 != 7129) {
                    method4434(22, -81);
                }
                class541.field7977 = (class793.field11597 ? 26 : 22) + arg3.field8711 * 16;
                int var8 = class65.field897 + class489.field7379;
                if ((var8 + var4) > class64.field881) {
                    var8 = class65.field897 - var4;
                }
                if (var8 < 0) {
                    var8 = 0;
                }
                int var9 = class793.field11597 ? 33 : 31;
                int var10 = arg0 + 13 - var9;
                if (var7 + var10 > class333.field5444) {
                    var10 = class333.field5444 - var7;
                }
                class452.field6990 = var8;
                if (var10 < 0) {
                    var10 = 0;
                }
                class116.field1694 = arg3;
                class270.field4346 = var10;
                class630.field9060 = var4;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field8754[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8754[2] : field8754[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4436(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4437(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
