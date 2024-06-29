import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class109 {

    @OriginalMember(owner = "client!al", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1271 = new String[] { method961(method960("\u001fVS0g")), method961(method960("\u0010O\u0011\u001d")), method961(method960("\u001fVS5g")), method961(method960("\u0005\u0014S_2")), method961(method960("\u001fVS3g")), method961(method960("\u001fVS2g")) };

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[I")
    public static int[] field1269;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method956(int arg0, int arg1, int arg2) {
        try {
            field1268++;
            if (arg0 > -7) {
                method957(71);
            }
            return (arg1 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1271[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 20)
    public static void method957(int arg0) {
        try {
            field1269 = null;
            int var1 = 20 / ((-arg0 - 35) / 50);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1271[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLcca;)Z", line = 30)
    public static final boolean method958(byte arg0, class260 arg1) {
        try {
            field1263++;
            if (arg1 == null) {
                return false;
            } else {
                int var2 = -80 / ((12 - arg0) / 44);
                return class546.method4118(-125, arg1.field4014, arg1.field4005 - arg1.field4014, arg1.field4010, arg1.field4019, arg1.field4009 - arg1.field4010, -arg1.field4019 + arg1.field4011);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1271[2] + arg0 + ',' + (arg1 == null ? field1271[1] : field1271[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lcja;Lcja;B)V", line = 45)
    public static final void method959(class46 arg0, class46 arg1, byte arg2) {
        try {
            field1270++;
            if (arg1.field527 != null) {
                arg1.method362((byte) 72);
            }
            if (arg2 > 61) {
                arg1.field527 = arg0.field527;
                arg1.field529 = arg0;
                arg1.field527.field529 = arg1;
                arg1.field529.field527 = arg1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1271[5] + (arg0 == null ? field1271[1] : field1271[3]) + ',' + (arg1 == null ? field1271[1] : field1271[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method960(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!al", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method961(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
