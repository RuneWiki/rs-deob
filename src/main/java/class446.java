import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class446 {

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6547 = new String[] { method3430(method3429("K*}\u0011{")), method3430(method3429("^q?S")), method3430(method3429("Q`}{.")), method3430(method3429("Q`}}.")), method3430(method3429("Q`}z.")), method3430(method3429("Q`}|.")), method3430(method3429("Q`}~.")) };

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field6544 = 0;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field6537;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    private int field6543;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field6545;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Luia;")
    public class381 field6541;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Liu;", line = 8)
    public static final class604 method3424(int arg0) {
        try {
            class765.field11064 = 0;
            int var1 = -119 % ((arg0 + 64) / 58);
            field6540++;
            return class104.method920((byte) 81);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6547[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLib;I)V", line = 19)
    private final void method3425(byte arg0, class163 arg1, int arg2) {
        try {
            if (arg0 != 16) {
                this.method3427((byte) -52, null);
            }
            field6542++;
            if (arg2 == 1) {
                this.field6543 = arg1.method1445((byte) 126);
            } else if (arg2 == 2) {
                this.field6537 = arg1.method1455((byte) 62);
                this.field6545 = arg1.method1455((byte) 62);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6547[2] + arg0 + ',' + (arg1 == null ? field6547[1] : field6547[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Liga;", line = 42)
    public final synchronized class481 method3426(byte arg0) {
        try {
            field6546++;
            class481 var2 = (class481) this.field6541.field5785.method1558((byte) 96, (long) this.field6543);
            if (var2 != null) {
                return var2;
            }
            class481 var3 = class481.method3675(this.field6541.field5781, this.field6543, 0);
            if (arg0 != 54) {
                method3428(65, 27, -125, true, 34, 1.7548627F, -83, -90);
            }
            if (var3 != null) {
                this.field6541.field5785.method1556((long) this.field6543, var3, arg0 - 53);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6547[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLib;)V", line = 69)
    public final void method3427(byte arg0, class163 arg1) {
        try {
            field6538++;
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    if (arg0 == 12) {
                        return;
                    } else {
                        this.field6537 = -24;
                        return;
                    }
                }
                this.method3425((byte) 16, arg1, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6547[6] + arg0 + ',' + (arg1 == null ? field6547[1] : field6547[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIZIFII)[I", line = 99)
    public static final int[] method3428(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, int arg6, int arg7) {
        try {
            field6539++;
            int[] var8 = new int[arg2];
            class424 var9 = new class424();
            var9.field6246 = (int) ((float) arg6 * arg5);
            var9.field6260 = arg0;
            var9.field6262 = arg7;
            var9.field6254 = arg1;
            var9.field6251 = arg3;
            var9.field6249 = arg4;
            var9.method437(27132);
            class383.method3069(1, 126, arg2);
            var9.method3273(0, true, var8);
            return var8;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6547[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3429(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3430(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
