import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class591 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public int field8571;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
    public int[] field8570;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
    public int[] field8568;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8572 = new String[] { method4341(method4340(":CuU0")), method4341(method4340(":Cu(q#G/*0")) };

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static final void method4339(byte arg0) {
        try {
            if (arg0 != 114) {
                method4339((byte) 96);
            }
            class617.field8910.method166(((float) class623.field8996.field6368.method1690(true) * 0.1F + 0.7F) * 1.1523438F);
            field8569++;
            class617.field8910.method243(class762.field11191, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
            class617.field8910.method237(class100.field1460, -1, 0);
            class617.field8910.method253(class628.field9042);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8572[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
    public class591(int arg0) {
        try {
            this.field8571 = arg0;
            this.field8570 = new int[this.field8571];
            this.field8568 = new int[this.field8571];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8572[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4340(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4341(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
