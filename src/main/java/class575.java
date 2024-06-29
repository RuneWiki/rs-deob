import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class575 extends class206 {

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field8506 = new String[] { method4291(method4290("#s.\u0014`g")), method4291(method4290("#s.\u0014cg")) };

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "[Lju;")
    public static class137[] field8502 = new class137[4];

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "F")
    public static float field8499;

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "I")
    public int field8482;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "I")
    public int field8484;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public int field8485;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
    public int field8486;

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
    public int field8487;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public int field8488;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
    public int field8489;

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
    public int field8490;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    public int field8491;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    public int field8492;

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
    public int field8493;

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "I")
    public int field8494;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
    public int field8495;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "I")
    public int field8497;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public int field8500;

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
    public int field8503;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "I")
    public int field8505;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "Lps;")
    public class105 field8496;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "Lwfa;")
    public class210 field8481;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Loaa;")
    public class303 field8483;

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "Lhha;")
    public class545 field8504;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 14)
    public static void method4288(int arg0) {
        try {
            field8502 = null;
            if (arg0 != 1171) {
                method4288(-77);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8506[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V", line = 26)
    public final void method4289(int arg0) {
        try {
            this.field8483 = null;
            field8498++;
            if (arg0 == 4) {
                this.field8496 = null;
                this.field8504 = null;
                this.field8481 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8506[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4290(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4291(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
