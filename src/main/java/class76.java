import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class76 extends class134 {

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1105 = new String[] { method793(method792("9\u001d\u0018\u0003")), method793(method792(",FZA\u0013")), method793(method792("9\t\u0015A-\u007f")), method793(method792("9\t\u0015A*\u007f")), method793(method792("9\t\u0015A/\u007f")) };

    @OriginalMember(owner = "client!naa", name = "r", descriptor = "Z")
    public static boolean field1099 = false;

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client!naa", name = "v", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!naa", name = "u", descriptor = "J")
    private long field1098;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILwq;)V", line = 3)
    public final void method102(int arg0, class176 arg1) {
        try {
            this.field1100 = arg1.method1622(-18712);
            field1101++;
            int var3 = 72 % ((83 - arg0) / 34);
            this.field1098 = arg1.method1658(-24862);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1105[3] + arg0 + ',' + (arg1 == null ? field1105[0] : field1105[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method791(boolean arg0) {
        try {
            class772.field11311 = 0;
            class382.field6139 = new class781[500];
            class50.field603 = class152.field2131;
            if (arg0) {
                class245.field3793 = 0;
                class319.field5200 = new int[class612.field8806][class150.field2096 + 1][class117.field1705 + 1];
                class423.field6674 = false;
                class720.field10543 = class152.field2131;
                field1104++;
                class599.field8686 = 0;
                class568.field8254 = new class781[500];
                class31.field367 = new class781[2000];
                class678.field9643 = 0;
                class134.field1903 = new class781[1000];
                if (class120.field1734 instanceof class725) {
                    class382.field6142 = false;
                } else {
                    class382.field6142 = true;
                }
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1105[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lsca;I)V", line = 63)
    public final void method100(class47 arg0, int arg1) {
        try {
            field1102++;
            if (arg1 <= -81) {
                arg0.method483(-24466, this.field1100, this.field1098);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1105[2] + (arg0 == null ? field1105[0] : field1105[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method792(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method793(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
