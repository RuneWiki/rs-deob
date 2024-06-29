import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class705 extends class206 {

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "Ljava/lang/String;")
    public String field10238 = null;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "Z")
    private boolean field10242 = true;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public int field10244 = 0;

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field10250 = new String[] { method5159(method5158("s;<{,,")), method5159(method5158("\u007fvs{\u0015")), method5159(method5158("s;<{+,")), method5159(method5158("j-19")), method5159(method5158("s;<{ ,")), method5159(method5158("s;<{*,")), method5159(method5158("s;<{-,")), method5159(method5158("s;<{/,")), method5159(method5158("s;<{Tm64!V,")), method5159(method5158("s;<{.,")), method5159(method5158("s;<{),")) };

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "Lwia;")
    public static class790 field10243 = new class790(53, 5);

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "B")
    public byte field10245;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "B")
    public byte field10247;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "F")
    public static float field10235;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field10246;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "J")
    public long field10239;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "Z")
    private boolean field10249;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "[I")
    private int[] field10234;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "[Lqt;")
    public class662[] field10240;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)V", line = 3)
    public final void method5150(int arg0, int arg1) {
        try {
            --this.field10244;
            ++field10233;
            if (this.field10244 == arg1) {
                this.field10240 = null;
            } else {
                class467.method3554(this.field10240, arg0 + 1, this.field10240, arg0, -arg0 + this.field10244);
            }
            this.field10234 = null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10250[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)V", line = 17)
    private final void method5151(int arg0, int arg1) {
        try {
            ++field10246;
            if (arg0 == 0) {
                if (this.field10240 != null) {
                    class467.method3554(this.field10240, 0, this.field10240 = new class662[arg1], 0, this.field10244);
                } else {
                    this.field10240 = new class662[arg1];
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10250[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V", line = 37)
    public static void method5152(byte arg0) {
        try {
            field10243 = null;
            if (arg0 >= -6) {
                field10243 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10250[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILqt;)V", line = 52)
    public final void method5153(int arg0, class662 arg1) {
        try {
            ++field10237;
            if (this.field10240 == null || this.field10244 >= this.field10240.length) {
                this.method5151(0, this.field10244 + 5);
            }
            this.field10240[this.field10244++] = arg1;
            int var3 = 30 % ((arg0 - -45) / 32);
            this.field10234 = null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10250[6] + arg0 + ',' + (arg1 != null ? field10250[1] : field10250[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)[B", line = 68)
    public static final byte[] method5154(int arg0, byte arg1) {
        try {
            ++field10248;
            if (arg1 <= 62) {
                method5154(-46, (byte) 120);
            }
            class272 var2 = (class272) class473.field6860.method637((byte) -120, (long) arg0);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg0);
                for (int var5 = 0; var5 < 255; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; ~var6 > -256; ++var6) {
                    int var7 = -var6 + 255;
                    int var8 = class656.method4817(var7, var4, (byte) -70);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class272(var3);
                class473.field6860.method636(var2, 0, (long) arg0);
            }
            return var2.field4125;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10250[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lib;)V", line = 255)
    public class705(class163 arg0) {
        try {
            this.method5156(arg0, 125);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10250[8] + (arg0 != null ? field10250[1] : field10250[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)[I", line = 126)
    public final int[] method5155(int arg0) {
        try {
            if (arg0 != -256) {
                field10235 = 0.39983374F;
            }
            if (this.field10234 == null) {
                String[] var2 = new String[this.field10244];
                this.field10234 = new int[this.field10244];
                int var3 = 0;
                while (this.field10244 > var3) {
                    var2[var3] = this.field10240[var3].field9571;
                    this.field10234[var3] = var3++;
                }
                class461.method3511(-17211, var2, this.field10234);
            }
            ++field10241;
            return this.field10234;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10250[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lib;I)V", line = 161)
    private final void method5156(class163 arg0, int arg1) {
        try {
            ++field10232;
            int var3 = arg0.method1455((byte) 62);
            if ((var3 & 1) != 0) {
                this.field10249 = true;
            }
            if ((var3 & 2) != 0) {
                this.field10242 = true;
            }
            int var4 = -70 / ((arg1 - 71) / 44);
            super.field3177 = arg0.method1435(-128);
            this.field10239 = arg0.method1435(-128);
            this.field10238 = arg0.method1423(82);
            arg0.method1455((byte) 62);
            this.field10245 = arg0.method1414(1);
            this.field10247 = arg0.method1414(1);
            this.field10244 = arg0.method1445((byte) 109);
            if (~this.field10244 < -1) {
                this.field10240 = new class662[this.field10244];
                for (int var5 = 0; this.field10244 > var5; ++var5) {
                    class662 var6 = new class662();
                    if (this.field10249) {
                        arg0.method1435(-127);
                    }
                    if (this.field10242) {
                        var6.field9571 = arg0.method1423(82);
                    }
                    var6.field9568 = arg0.method1414(1);
                    var6.field9569 = arg0.method1445((byte) 108);
                    this.field10240[var5] = var6;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10250[7] + (arg0 != null ? field10250[1] : field10250[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 222)
    public final int method5157(String arg0, boolean arg1) {
        try {
            ++field10236;
            int var3 = 0;
            if (!arg1) {
                this.method5153(-1, (class662) null);
            }
            while (~var3 > ~this.field10244) {
                if (this.field10240[var3].field9571.equalsIgnoreCase(arg0)) {
                    return var3;
                }
                ++var3;
            }
            return -1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10250[2] + (arg0 != null ? field10250[1] : field10250[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5158(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 104);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5159(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
