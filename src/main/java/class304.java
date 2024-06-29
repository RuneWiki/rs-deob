import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class304 {

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field4918 = new String[] { method2614(method2613("iG~\u001f")), method2614(method2613("|\u001c<]2")), method2614(method2613("eC<2g")), method2614(method2613("eC<7g")), method2614(method2613("eC<1g")), method2614(method2613("eC<0g")), method2614(method2613("eC<6g")) };

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "Lhl;")
    public static class556 field4908 = new class556(76, 0);

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field4914 = 2;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4915 = null;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "B")
    public byte field4893;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "B")
    public byte field4899;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "B")
    public byte field4901;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "B")
    public byte field4902;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "B")
    public byte field4904;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "B")
    public byte field4905;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "B")
    public byte field4913;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public int field4892;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "S")
    public short field4894;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "Z")
    public boolean field4890;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Z")
    public boolean field4898;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Z")
    public boolean field4900;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "Z")
    public boolean field4906;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "Z")
    public boolean field4909;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "Z")
    public boolean field4910;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Z")
    public boolean field4911;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "Z")
    public boolean field4912;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V", line = 3)
    public static void method2608(int arg0) {
        try {
            field4908 = null;
            if (arg0 != -21170) {
                field4914 = -104;
            }
            field4915 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4918[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 20)
    public static final void method2609(int arg0) {
        try {
            class289.field4640.method304(1);
            if (arg0 != 2) {
                method2608(-73);
            }
            field4897++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4918[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lha;I)V", line = 35)
    public static final void method2610(class63 arg0, int arg1) {
        try {
            if (class793.field11597) {
                class150.method1365(arg0, 5395);
            } else {
                class269.method2328(41, arg0);
            }
            if (arg1 != 0) {
                field4916 = 89;
            }
            field4903++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4918[2] + (arg0 == null ? field4918[0] : field4918[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILuo;)I", line = 52)
    public static final int method2611(int arg0, class603 arg1) {
        try {
            field4891++;
            if (arg0 != 3246) {
                field4908 = null;
            }
            String var2 = class558.method4112(arg1, 256);
            return client.field5163.method500(0, class475.field7238, var2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4918[5] + arg0 + ',' + (arg1 == null ? field4918[0] : field4918[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lwq;B)V", line = 70)
    public static final void method2612(class176 arg0, byte arg1) {
        try {
            field4895++;
            int var2 = arg0.method1660(false);
            class788.field11516 = new class180[var2];
            for (int var3 = 0; var3 < var2; var3++) {
                class788.field11516[var3] = new class180();
                class788.field11516[var3].field2879 = arg0.method1660(false);
                class788.field11516[var3].field2882 = arg0.method1629(0);
            }
            class697.field10041 = arg0.method1660(false);
            class737.field10792 = arg0.method1660(false);
            class31.field366 = arg0.method1660(false);
            class663.field9452 = new class139[class737.field10792 + 1 - class697.field10041];
            int var4 = 90 % ((arg1 - 5) / 59);
            for (int var5 = 0; var5 < class31.field366; var5++) {
                int var6 = arg0.method1660(false);
                class139 var7 = class663.field9452[var6] = new class139();
                var7.field5437 = arg0.method1645((byte) -100);
                var7.field5435 = arg0.method1622(-18712);
                var7.field1949 = class697.field10041 + var6;
                var7.field1945 = arg0.method1629(0);
                var7.field1948 = arg0.method1629(0);
            }
            class771.field11309 = arg0.method1622(-18712);
            class392.field6247 = true;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4918[4] + (arg0 == null ? field4918[0] : field4918[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2613(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2614(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
