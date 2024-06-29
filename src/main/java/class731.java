import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class731 extends class568 {

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    private int field10705;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field10712;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    private int field10701;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public int field10709;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public int field10706;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "F")
    public float field10714;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field10716 = new String[] { method5303(method5302("Y@(hL")), method5303(method5302("Y@(nL")), method5303(method5302("Y@(oL")), method5303(method5302("Y@(iL")), method5303(method5302("Y@(\u0016\r^Ar\u0014L")), method5303(method5302("Y@(bL")), method5303(method5302("Y@(kL")), method5303(method5302("Y@(lL")), method5303(method5302("Y@(mL")) };

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "[I")
    public static int[] field10708 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field10700;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field10702;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field10703;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field10704;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field10707;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field10710;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field10713;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field10715;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
    public abstract void method1254(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)I")
    public final int method5294(boolean arg0) {
        try {
            field10715++;
            if (!arg0) {
                this.method5295(-34);
            }
            return this.field10701;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10716[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)I")
    public final int method5295(int arg0) {
        try {
            if (arg0 != 32) {
                field10713 = 104;
            }
            field10707++;
            return this.field10705;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10716[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method5296(byte arg0) {
        try {
            field10708 = null;
            if (arg0 != 107) {
                field10703 = 54;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10716[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)I")
    public final int method5297(boolean arg0) {
        try {
            if (arg0) {
                this.method5299(-124);
            }
            field10711++;
            return this.field10706;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10716[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)I")
    public final int method5298(int arg0) {
        try {
            field10704++;
            if (arg0 != -4) {
                this.method5294(false);
            }
            return this.field10712;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10716[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BF)V")
    public abstract void method1257(byte arg0, float arg1);

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)F")
    public final float method5299(int arg0) {
        try {
            field10702++;
            if (arg0 != 31541) {
                this.field10709 = -53;
            }
            return this.field10714;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10716[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I")
    public final int method5300(int arg0) {
        try {
            if (arg0 != 32) {
                this.method1257((byte) -63, -0.508264F);
            }
            field10710++;
            return this.field10709;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10716[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
    public static final String method5301(int arg0, int arg1, long arg2) {
        try {
            class310.method2659(arg2, (byte) 101);
            field10700++;
            int var4 = class679.field9664.get(5);
            int var5 = class679.field9664.get(2);
            int var6 = class679.field9664.get(1);
            if (arg1 >= -24) {
                method5296((byte) 109);
            }
            return arg0 == 3 ? class729.method5287(10, arg2, arg0) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class263.field4276[arg0][var5] + "-" + var6;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10716[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIF)V")
    public class731(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            this.field10705 = arg3;
            this.field10712 = arg2;
            this.field10701 = arg4;
            this.field10709 = arg0;
            this.field10706 = arg1;
            this.field10714 = arg5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10716[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5302(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5303(char[] arg0) {
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
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
