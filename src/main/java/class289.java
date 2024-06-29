import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class289 extends class568 {

    @OriginalMember(owner = "client!up", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field4662 = new String[] { method2441(method2440("J4[\"\u000b")), method2441(method2440("J4[ \u000b")), method2441(method2440("J4['\u000b")), method2441(method2440("J4[!\u000b")) };

    @OriginalMember(owner = "client!up", name = "G", descriptor = "Liha;")
    public static class29 field4640 = new class29(10);

    @OriginalMember(owner = "client!up", name = "K", descriptor = "[[B")
    public static byte[][] field4656 = new byte[250][];

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public int field4647;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "Lvl;")
    public static class13 field4655;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "Ljg;")
    public class357 field4645;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "Lkm;")
    public class373 field4648;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "Lgda;")
    public static class58 field4651;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "Lgu;")
    public class607 field4641;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "Lit;")
    public class675 field4657;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)Z", line = 6)
    public static final boolean method2436(byte arg0, int arg1) {
        try {
            field4654++;
            if (arg0 <= 80) {
                return true;
            } else {
                return arg1 >= 12 && arg1 <= 17;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4662[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V", line = 18)
    public final void method2437(int arg0) {
        try {
            field4642++;
            this.field4641 = null;
            this.field4648 = null;
            if (arg0 != 10150) {
                method2438(119);
            }
            this.field4657 = null;
            this.field4645 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4662[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 37)
    public static final void method2438(int arg0) {
        try {
            field4644++;
            class617.field8910.method166(((float) class623.field8996.field6368.method1690(true) * 0.1F + 0.7F) * class127.field1830);
            class617.field8910.method243(class778.field11347, class653.field9356, class101.field1479, (float) (class159.field2342 << 2), (float) (class332.field5430 << 2), (float) (class225.field3534 << 2));
            class617.field8910.method253(class214.field3370);
            if (arg0 != -398200286) {
                field4656 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4662[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 53)
    public static void method2439(byte arg0) {
        try {
            field4655 = null;
            field4656 = null;
            if (arg0 < 109) {
                field4655 = null;
            }
            field4651 = null;
            field4640 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4662[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2440(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!up", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2441(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
