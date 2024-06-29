import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class399 extends class578 {

    @OriginalMember(owner = "client!tia", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field5824 = new String[] { method3126(method3125("bDc<\u001a>")), method3126(method3125("bDc<\u0019>")) };

    @OriginalMember(owner = "client!tia", name = "G", descriptor = "Z")
    public static boolean field5812 = false;

    @OriginalMember(owner = "client!tia", name = "C", descriptor = "I")
    public static int field5822 = 0;

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
    public int field5799;

    @OriginalMember(owner = "client!tia", name = "t", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "I")
    public int field5801;

    @OriginalMember(owner = "client!tia", name = "y", descriptor = "I")
    public int field5803;

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!tia", name = "A", descriptor = "I")
    public int field5805;

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!tia", name = "u", descriptor = "I")
    public int field5807;

    @OriginalMember(owner = "client!tia", name = "F", descriptor = "I")
    public int field5808;

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "I")
    public int field5809;

    @OriginalMember(owner = "client!tia", name = "E", descriptor = "I")
    public int field5810;

    @OriginalMember(owner = "client!tia", name = "B", descriptor = "I")
    public int field5813;

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "I")
    public int field5814;

    @OriginalMember(owner = "client!tia", name = "D", descriptor = "I")
    public int field5815;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "I")
    public int field5816;

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "I")
    public int field5818;

    @OriginalMember(owner = "client!tia", name = "v", descriptor = "I")
    public int field5820;

    @OriginalMember(owner = "client!tia", name = "x", descriptor = "I")
    public int field5821;

    @OriginalMember(owner = "client!tia", name = "p", descriptor = "I")
    public int field5823;

    @OriginalMember(owner = "client!tia", name = "r", descriptor = "Lq;")
    public class235 field5817;

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "Lvfa;")
    public class313 field5811;

    @OriginalMember(owner = "client!tia", name = "w", descriptor = "Lhea;")
    public class317 field5802;

    @OriginalMember(owner = "client!tia", name = "q", descriptor = "Lhba;")
    public class93 field5819;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIIZ)I", line = 12)
    public static final int method3123(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            field5800++;
            class375 var4 = class279.method2276(arg3, 0, arg0);
            if (var4 == null) {
                return 0;
            } else if (arg1 == -1) {
                return 0;
            } else {
                if (arg2 <= 113) {
                    field5822 = 30;
                }
                int var5 = 0;
                for (int var6 = 0; var6 < var4.field5472.length; var6++) {
                    if (var4.field5476[var6] == arg1) {
                        var5 += var4.field5472[var6];
                    }
                }
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5824[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 69)
    public final void method3124(int arg0) {
        try {
            this.field5817 = null;
            this.field5819 = null;
            field5806++;
            if (arg0 == 0) {
                this.field5802 = null;
                this.field5811 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5824[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3125(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3126(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
