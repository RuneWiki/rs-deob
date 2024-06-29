import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class799 extends class391 implements class719 {

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field11617 = new String[] { method5768(method5767("k\"\u0003\u0015I")), method5768(method5767("k\"\u0003\u0019I")), method5768(method5767("wd\u0003s\u001c")), method5768(method5767("b?A1")), method5768(method5767("k\"\u0003\u001eI")), method5768(method5767("k\"\u0003\u001fI")), method5768(method5767("k\"\u0003\u001bI")), method5768(method5767("k\"\u0003\u001cI")), method5768(method5767("k\"\u0003\u0018I")), method5768(method5767("k\"\u0003\u001aI")) };

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "Ljava/util/Random;")
    public static Random field11609 = new Random();

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Ljava/lang/String;")
    public static String field11615 = null;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "B")
    private byte field11613;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field11606;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field11607;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field11608;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field11610;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field11612;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field11614;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field11616;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Laca;")
    public static class27 field11611;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)I", line = 6)
    public final int method5765(int arg0) {
        try {
            ++field11607;
            return arg0 != 26270 ? 21 : this.field11613;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11617[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjaclib/memory/Source;II)Z", line = 17)
    public final boolean method2404(byte arg0, Source arg1, int arg2, int arg3) {
        try {
            this.field11613 = (byte) arg2;
            if (arg0 != 32) {
                field11615 = null;
            }
            ++field11610;
            super.method3058(arg3, arg1, (byte) 39);
            return true;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field11617[1] + arg0 + ',' + (arg1 != null ? field11617[2] : field11617[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 32)
    public final void method2342(boolean arg0) {
        try {
            ++field11612;
            super.method2342(arg0);
            if (!arg0) {
                this.method2401(true, false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11617[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ldga;Z)V", line = 45)
    public class799(class713 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 48)
    public final Buffer method2401(boolean arg0, boolean arg1) {
        try {
            if (!arg1) {
                this.method2346(86);
            }
            ++field11614;
            return super.method3063(super.field5711.field10125, (byte) -85, arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11617[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z", line = 64)
    public final boolean method2402(int arg0, int arg1, int arg2) {
        try {
            ++field11616;
            this.field11613 = (byte) arg2;
            super.method2344(arg1, 51);
            if (arg0 != 13179) {
                method5766(-73);
            }
            return true;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11617[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V", line = 80)
    public static void method5766(int arg0) {
        try {
            field11609 = null;
            if (arg0 <= 98) {
                method5766(74);
            }
            field11611 = null;
            field11615 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11617[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I", line = 93)
    public final int method2346(int arg0) {
        try {
            if (arg0 != 34962) {
                field11615 = null;
            }
            ++field11606;
            return super.method2346(34962);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11617[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Z", line = 108)
    public final boolean method2405(int arg0) {
        try {
            ++field11608;
            if (arg0 != -9200) {
                this.method2401(true, false);
            }
            return super.method3062(super.field5711.field10125, -4014);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11617[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5767(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 97);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5768(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
