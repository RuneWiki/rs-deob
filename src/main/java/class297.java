import jaggl.OpenGL;
import java.awt.Canvas;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class297 extends class651 {

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4154 = new String[] { method2389(method2388("w.&_\u000e")), method2389(method2388("w.&Y\u000e")), method2389(method2388("~s&5[")), method2389(method2388("k(dw")), method2389(method2388("w.&X\u000e")), method2389(method2388("o<o|J")), method2389(method2388("w.&Z\u000e")) };

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Z")
    public static boolean field4147 = false;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4152 = new BigInteger(method2389(method2388("4m8+\u0017")), 16);

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Lrfa;")
    public class202 field4150;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Z")
    public boolean field4146;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "[Lwha;")
    public class535[] field4153;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method2384(int arg0) {
        try {
            field4152 = null;
            if (arg0 != -11370) {
                field4147 = true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4154[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZZI)I")
    public static final int method2385(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        try {
            field4148++;
            class375 var5 = class279.method2276(arg2, 0, arg1);
            if (arg4 > -110) {
                field4152 = null;
            }
            if (var5 == null) {
                return 0;
            }
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field5476.length; var7++) {
                if (var5.field5476[var7] >= 0 && class153.field1955.field5971 > var5.field5476[var7]) {
                    class371 var8 = class153.field1955.method3237(var5.field5476[var7], 0);
                    int var9 = var8.method2934(-941655645, arg0, class202.field2972.method611(false, arg0).field8295);
                    if (arg3) {
                        var6 += var5.field5472[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field4154[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method2386(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg3 != 8) {
                return true;
            }
            field4151++;
            int var5 = this.field4150.method1734(13720);
            if (this.field4153 != null) {
                for (int var6 = 0; var6 < this.field4153.length; var6++) {
                    this.field4153[var6].field7765 <<= var5;
                    if (this.field4153[var6].method4059(arg1, arg2) && this.field4150.method580(arg0, arg2, -1, arg1)) {
                        this.field4153[var6].field7765 >>= var5;
                        return true;
                    }
                    this.field4153[var6].field7765 >>= var5;
                }
            }
            return false;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4154[1] + (arg0 == null ? field4154[3] : field4154[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILlga;ILd;Ljava/awt/Canvas;)Lha;")
    public static final class18 method2387(int arg0, class47 arg1, int arg2, class673 arg3, Canvas arg4) {
        try {
            field4149++;
            if (!class640.method4682(arg2 + 745)) {
                throw new RuntimeException("");
            } else if (class743.method5382(field4154[5], true)) {
                OpenGL var5 = new OpenGL();
                long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg0);
                if (var6 == 0L) {
                    throw new RuntimeException("");
                }
                class713 var8 = new class713(var5, arg4, var6, arg3, arg1, arg0);
                if (arg2 != -640) {
                    method2385(-91, -62, true, false, 107);
                }
                var8.method2678(0);
                return var8;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4154[6] + arg0 + ',' + (arg1 == null ? field4154[3] : field4154[2]) + ',' + arg2 + ',' + (arg3 == null ? field4154[3] : field4154[2]) + ',' + (arg4 == null ? field4154[3] : field4154[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2388(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2389(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
