import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class613 {

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8814 = new String[] { method4463(method4462("$fAZf")), method4463(method4462("$fAXf")), method4463(method4462("$fA]f")), method4463(method4462("$fA[f")) };

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "[I")
    public static int[] field8810;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIZ)I", line = 5)
    public static final int method4458(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            field8812++;
            class454 var4 = class173.method1596(arg3, arg1 - 13364, arg2);
            if (var4 == null) {
                return -1;
            } else if (arg1 == 26874) {
                return arg0 >= 0 && var4.field7018.length > arg0 ? var4.field7018[arg0] : -1;
            } else {
                return 27;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8814[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V", line = 25)
    public static final void method4459(byte arg0) {
        try {
            class65.field895++;
            field8811++;
            class487 var1 = class618.method4519(95, client.field5157, class185.field2948.field2659);
            var1.field7362.method1641((byte) -108, class765.field11213);
            if (arg0 == -107) {
                class185.field2948.method1546(var1, 1);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8814[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V", line = 41)
    public static final void method4460(int arg0, boolean arg1) {
        try {
            field8813++;
            if (arg1) {
                class551 var2 = class380.method3113(-126, (long) arg0, 11);
                var2.method4089(63);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8814[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V", line = 55)
    public static void method4461(int arg0) {
        try {
            if (arg0 != -1) {
                method4459((byte) 100);
            }
            field8810 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8814[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4462(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4463(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
