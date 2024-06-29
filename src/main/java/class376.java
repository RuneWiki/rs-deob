import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class376 {

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
    public boolean field5725 = false;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Lwq;")
    private class178 field5723 = new class178(64);

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lwq;")
    public class178 field5740 = new class178(500);

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lwq;")
    public class178 field5742 = new class178(30);

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "Lwq;")
    public class178 field5743 = new class178(50);

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Lla;")
    public class476 field5727;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "Z")
    public boolean field5736;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Lla;")
    private class476 field5739;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5745 = new String[] { method3036(method3035("210J\t")), method3036(method3035("210A\t")), method3036(method3035(">l0,\\")), method3036(method3035("+7rn")), method3036(method3035("210>H++j<\t")), method3036(method3035("210C\t")), method3036(method3035("210E\t")), method3036(method3035("210D\t")), method3036(method3035("210F\t")), method3036(method3035("210@\t")), method3036(method3035("210K\t")), method3036(method3035("210H\t")) };

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "[I")
    public static int[] field5724 = new int[3];

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "[C")
    private static char[] field5721 = new char[64];

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Z")
    public static boolean field5731;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "Lel;")
    public static class573 field5732;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field5730;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "[Z")
    public static boolean[] field5722;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5721[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5721[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5721[var2] = (char) (var2 + 48 - 52);
        }
        field5721[62] = '+';
        field5721[63] = '/';
        field5731 = false;
        field5732 = new class573(27, 10);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 4)
    public final void method3025(byte arg0) {
        try {
            field5741++;
            class178 var2 = this.field5723;
            synchronized (this.field5723) {
                this.field5723.method1569(10574);
            }
            class178 var3 = this.field5740;
            synchronized (this.field5740) {
                this.field5740.method1569(10574);
            }
            class178 var4 = this.field5742;
            synchronized (this.field5742) {
                this.field5742.method1569(10574);
            }
            class178 var5 = this.field5743;
            synchronized (this.field5743) {
                if (arg0 != 58) {
                    this.method3030(-9, 52);
                }
                this.field5743.method1569(10574);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5745[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V", line = 27)
    public final void method3026(int arg0, boolean arg1) {
        try {
            if (arg0 != 1) {
                this.method3026(92, false);
            }
            field5729++;
            if (arg1 != this.field5736) {
                this.field5736 = arg1;
                this.method3032(false);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5745[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)V", line = 49)
    public final void method3027(int arg0, int arg1) {
        try {
            field5735++;
            class178 var3 = this.field5723;
            synchronized (this.field5723) {
                this.field5723.method1557(arg1, (byte) -110);
            }
            class178 var4 = this.field5740;
            synchronized (this.field5740) {
                this.field5740.method1557(arg1, (byte) -113);
            }
            class178 var5 = this.field5742;
            synchronized (this.field5742) {
                if (arg0 != 13366) {
                    this.field5725 = false;
                }
                this.field5742.method1557(arg1, (byte) -127);
            }
            class178 var6 = this.field5743;
            synchronized (this.field5743) {
                this.field5743.method1557(arg1, (byte) -108);
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field5745[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(ZI)V", line = 72)
    public final void method3028(boolean arg0, int arg1) {
        try {
            field5728++;
            if (!arg0) {
                field5724 = null;
            }
            this.field5723 = new class178(arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5745[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V", line = 86)
    public final void method3029(boolean arg0, int arg1) {
        try {
            this.field5744 = arg1;
            if (arg0) {
                field5734++;
                class178 var3 = this.field5740;
                synchronized (this.field5740) {
                    this.field5740.method1559(0);
                }
                class178 var4 = this.field5742;
                synchronized (this.field5742) {
                    this.field5742.method1559(0);
                }
                class178 var5 = this.field5743;
                synchronized (this.field5743) {
                    this.field5743.method1559(0);
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5745[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Lc;", line = 137)
    public final class198 method3030(int arg0, int arg1) {
        try {
            field5738++;
            class178 var3 = this.field5723;
            class198 var4;
            synchronized (this.field5723) {
                var4 = (class198) this.field5723.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field5739;
            byte[] var7;
            synchronized (this.field5739) {
                if (arg0 != 0) {
                    return null;
                }
                var7 = this.field5739.method3632(class64.method453(arg1, (byte) -69), class477.method3651((byte) 101, arg1), 107);
            }
            class198 var8 = new class198();
            var8.field3090 = this;
            var8.field3014 = arg1;
            if (var7 != null) {
                var8.method1768(new class163(var7), (byte) 102);
            }
            var8.method1771(true);
            if (!this.field5736 && var8.field3007) {
                var8.field3065 = null;
                var8.field3045 = null;
            }
            if (var8.field3018) {
                var8.field3078 = 0;
                var8.field3064 = false;
            }
            class178 var9 = this.field5723;
            synchronized (this.field5723) {
                this.field5723.method1556((long) arg1, var8, 1);
                return var8;
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field5745[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 186)
    public static void method3031(int arg0) {
        try {
            field5722 = null;
            field5732 = null;
            int var1 = -24 % ((-arg0 - 35) / 43);
            field5721 = null;
            field5724 = null;
            field5730 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5745[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 199)
    public final void method3032(boolean arg0) {
        try {
            field5726++;
            class178 var2 = this.field5723;
            synchronized (this.field5723) {
                this.field5723.method1559(0);
                if (arg0) {
                    method3031(-64);
                }
            }
            class178 var3 = this.field5740;
            synchronized (this.field5740) {
                this.field5740.method1559(0);
            }
            class178 var4 = this.field5742;
            synchronized (this.field5742) {
                this.field5742.method1559(0);
            }
            class178 var5 = this.field5743;
            synchronized (this.field5743) {
                this.field5743.method1559(0);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5745[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lto;IZLla;Lla;)V", line = 308)
    public class376(class8 arg0, int arg1, boolean arg2, class476 arg3, class476 arg4) {
        try {
            this.field5727 = arg4;
            this.field5736 = arg2;
            this.field5739 = arg3;
            if (this.field5739 != null) {
                int var6 = this.field5739.method3629((byte) 18) - 1;
                this.field5739.method3646(var6, (byte) -26);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5745[4] + (arg0 == null ? field5745[3] : field5745[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5745[3] : field5745[2]) + ',' + (arg4 == null ? field5745[3] : field5745[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([Ldf;II)V", line = 230)
    public static final void method3033(class420[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class420 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field6208;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field6208 < (var7 & 0x1) + var6) {
                class420 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3033(arg0, arg1, var4 - 1);
        method3033(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(ZI)V", line = 283)
    public final void method3034(boolean arg0, int arg1) {
        try {
            field5733++;
            if (arg1 >= -33) {
                this.method3025((byte) -115);
            }
            if (this.field5725 != arg0) {
                this.field5725 = arg0;
                this.method3032(false);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5745[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3035(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3036(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
