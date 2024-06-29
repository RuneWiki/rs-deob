import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class621 {

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "B")
    public byte field8846;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8855 = new String[] { method4569(method4568("&Z{ZE!Us\u0000G`")), method4569(method4568("&Z{Z8`")), method4569(method4568("&Z{Z;`")) };

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Lsb;")
    public static class261 field8838 = new class261(109, 10);

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "Lsb;")
    public static class261 field8844 = new class261(74, -2);

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "Lvea;")
    public class122 field8850;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "Lfu;")
    public class219 field8841;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "Ltb;")
    public static class392 field8840;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "Lgb;")
    public class571 field8842;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Lgb;")
    public class571 field8845;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Lnaa;")
    public class621 field8849;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Llg;")
    public class656 field8847;

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "Llg;")
    public class656 field8852;

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "Ljea;")
    public class6 field8848;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "S")
    public short field8843;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "S")
    public short field8851;

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "S")
    public short field8853;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "S")
    public short field8854;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
    public static void method4566(byte arg0) {
        try {
            field8844 = null;
            field8838 = null;
            field8840 = null;
            int var1 = 121 / ((arg0 + 55) / 44);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8855[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public final void method4567(int arg0) {
        try {
            while (this.field8841 != null) {
                class219 var2 = this.field8841.field3190;
                this.field8841.method1849(8744);
                this.field8841 = var2;
            }
            int var3 = -68 / ((arg0 + 76) / 45);
            field8839++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8855[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(I)V")
    public class621(int arg0) {
        try {
            this.field8846 = (byte) arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8855[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4568(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4569(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
