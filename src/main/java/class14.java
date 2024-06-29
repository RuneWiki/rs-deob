import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class14 extends class627 {

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    private int field185 = -1;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field190 = new String[] { method99(method98(")\r\n`")), method99(method98("<VH\"|")), method99(method98(",\u000eHO)")), method99(method98(",\u000eHI)")), method99(method98(",\u000eHN)")), method99(method98(",\u000eHM)")), method99(method98(",\u000eHH)")) };

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
    public static int field187 = 104;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "Lsb;")
    public static class261 field188 = new class261(9, -2);

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "B")
    private byte field183;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "Ljava/lang/String;")
    private String field180;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BLlga;)V", line = 10)
    public static final void method93(byte arg0, class47 arg1) {
        try {
            if (arg0 == 47) {
                class314.field4307 = arg1;
                field189++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field190[4] + arg0 + ',' + (arg1 == null ? field190[0] : field190[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 24)
    public static void method94(int arg0) {
        try {
            field188 = null;
            if (arg0 > -119) {
                field188 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field190[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V", line = 34)
    public static final void method95(int arg0) {
        try {
            field179++;
            class161.method1363((long) class694.field9700, class236.field3418, 59);
            if (class572.field8291 != -1) {
                class632.method4620(class572.field8291, arg0 ^ 0xFFFFFF84);
            }
            for (int var1 = 0; var1 < class153.field1962; var1++) {
                if (class752.field10742[var1]) {
                    class7.field92[var1] = true;
                }
                class106.field1387[var1] = class752.field10742[var1];
                class752.field10742[var1] = false;
            }
            class355.field5158 = class694.field9700;
            if (class572.field8291 != -1) {
                class153.field1962 = 0;
                class40.method457((byte) 4);
            }
            class236.field3418.method240();
            class637.method4639(class236.field3418, arg0 + arg0);
            int var2 = class375.method2966((byte) 69);
            if (var2 == -1) {
                var2 = class670.field9445;
            }
            if (var2 == -1) {
                var2 = class204.field2993;
            }
            class714.method5172(var2, -1);
            class393.field5721 = 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field190[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lkj;I)V", line = 82)
    public final void method96(class26 arg0, int arg1) {
        try {
            field181++;
            class756 var3 = arg0.field319[this.field185];
            var3.field10808 = this.field180;
            int var4 = -116 % ((44 - arg1) / 34);
            var3.field10814 = this.field183;
            var3.field10815 = this.field184;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field190[2] + (arg0 == null ? field190[0] : field190[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljc;I)V", line = 109)
    public final void method97(class711 arg0, int arg1) {
        try {
            this.field185 = arg0.method5116((byte) -122);
            field178++;
            this.field183 = arg0.method5125((byte) -15);
            this.field184 = arg0.method5116((byte) -107);
            arg0.method5147((byte) 109);
            if (arg1 >= -97) {
                method93((byte) -7, null);
            }
            this.field180 = arg0.method5144(-16414);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field190[6] + (arg0 == null ? field190[0] : field190[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method98(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method99(char[] arg0) {
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
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
