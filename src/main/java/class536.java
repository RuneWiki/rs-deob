import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class536 extends class640 {

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7848 = new String[] { method4044(method4043("hP\u0016\r\u0016")), method4044(method4043("w\u0015\u0016gC")), method4044(method4043("hP\u0016\b\u0016")), method4044(method4043("DR\\-[b\u0016")), method4044(method4043("bNT%")), method4044(method4043("hP\u0016\u000b\u0016")), method4044(method4043("hP\u0016\n\u0016")) };

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "[I")
    public static int[] field7839 = new int[2];

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public int field7840;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public int field7841;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public int field7845;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public int field7846;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Lec;")
    public class247 field7847;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lni;", line = 3)
    public static final class547 method4039(int arg0, int arg1) {
        try {
            field7844++;
            class547[] var2 = class136.method1159(-1);
            for (int var3 = 0; var3 < var2.length; var3++) {
                class547 var4 = var2[var3];
                if (var4.field8169 == arg0) {
                    return var4;
                }
            }
            int var5 = -22 % ((arg1 + 15) / 56);
            return null;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7848[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 31)
    public static void method4040(byte arg0) {
        try {
            field7839 = null;
            if (arg0 != -89) {
                field7839 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7848[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 43)
    public static final void method4041(int arg0, String arg1, int arg2) {
        try {
            if (arg2 <= 94) {
                method4041(-104, null, -79);
            }
            field7843++;
            class150.method1265("", arg1, -1, "", 0, arg0, "");
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7848[6] + arg0 + ',' + (arg1 == null ? field7848[4] : field7848[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lcn;II)Ljava/lang/String;", line = 65)
    public static final String method4042(class541 arg0, int arg1, int arg2) {
        try {
            field7842++;
            if (!client.method2670(arg0).method3558(true, arg1) && arg0.field8095 == null) {
                return null;
            }
            if (arg2 != -1) {
                method4039(-39, -63);
            }
            if (arg0.field8101 == null || arg0.field8101.length <= arg1 || arg0.field8101[arg1] == null || arg0.field8101[arg1].trim().length() == 0) {
                return class90.field1028 ? field7848[3] + arg1 : null;
            } else {
                return arg0.field8101[arg1];
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7848[2] + (arg0 == null ? field7848[4] : field7848[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4043(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4044(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
