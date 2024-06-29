import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class453 extends class232 {

    @OriginalMember(owner = "client!q", name = "V", descriptor = "[Ljava/lang/String;")
    private static final String[] field7009 = new String[] { method3522(method3521("0#k,")), method3522(method3521("0#l,")), method3522(method3521(":#\u0007*x")), method3522(method3521("/xEh")), method3522(method3521("0#\u0015mk(y\u0017,")), method3522(method3521("0#c,")), method3522(method3521("0#h,")), method3522(method3521("0#d,")), method3522(method3521("0#m,")), method3522(method3521("0#o,")), method3522(method3521("0#b,")) };

    @OriginalMember(owner = "client!q", name = "N", descriptor = "[S")
    public static short[] field7005 = new short[256];

    @OriginalMember(owner = "client!q", name = "L", descriptor = "Lhl;")
    public static class556 field7000 = new class556(21, 0);

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public static int field7006 = 0;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    private int field6995;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    private int field6999;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "Lgda;")
    public static class58 field6996;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "Lgda;")
    public static class58 field7008;

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 3)
    public class453() {
        this(0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILwq;I)V", line = 8)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (~arg2 == -1) {
                this.method3518(-6306, arg1.method1685(false));
            }
            ++field7007;
            if (arg0 <= 96) {
                this.method63(127, (class176) null, 61);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7009[1] + arg0 + ',' + (arg1 != null ? field7009[2] : field7009[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)Z", line = 37)
    public static final boolean method3515(int arg0) {
        try {
            ++field7004;
            return ~class516.field7614 != arg0 ? true : class350.field5661.method1132(-120);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7009[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V", line = 48)
    public static void method3516(byte arg0) {
        try {
            field7000 = null;
            field6996 = null;
            field7008 = null;
            field7005 = null;
            if (arg0 <= 72) {
                field7008 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7009[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[[I", line = 62)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field6997;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -51);
            if (arg0 != -3093) {
                this.field6995 = -35;
            }
            if (super.field3599.field2743) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class449.field6969 < ~var7; ++var7) {
                    var4[var7] = this.field6994;
                    var5[var7] = this.field6995;
                    var6[var7] = this.field6999;
                }
            }
            return var3;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7009[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)Lcaa;", line = 102)
    public static final class318 method3517(int arg0) {
        try {
            if (arg0 > -116) {
                field7000 = null;
            }
            ++field7002;
            class318 var1 = (class318) class108.field1547.method744(32);
            if (var1 != null) {
                --class324.field5262;
                return var1;
            } else {
                return new class318();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7009[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V", line = 124)
    private class453(int arg0) {
        super(0, false);
        try {
            this.method3518(-6306, arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7009[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(II)V", line = 132)
    private final void method3518(int arg0, int arg1) {
        try {
            this.field6995 = 4080 & arg1 >> 4;
            if (arg0 != -6306) {
                this.method3518(-57, -51);
            }
            this.field6994 = (arg1 & 16711680) >> 12;
            this.field6999 = (arg1 & 255) << 4;
            ++field6998;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7009[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)Z", line = 148)
    public static final boolean method3519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg2 != -4129) {
                field7008 = null;
            }
            ++field7001;
            for (int var6 = arg5; ~arg4 <= ~var6; ++var6) {
                for (int var7 = arg3; ~var7 >= ~arg1; ++var7) {
                    if (class688.field9932[var6][var7] == arg0 && ~class132.field1881[var6][var7] >= -2) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7009[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIIZ)V", line = 183)
    public static final void method3520(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        try {
            class44.method452(1);
            if (arg1 == 52) {
                ++field7003;
                class437.field6832 = 0L;
                int var5 = class466.method3598(1);
                if (~arg0 == -4 || var5 == 3) {
                    arg4 = true;
                }
                if (!class662.field9437.method238()) {
                    arg4 = true;
                }
                class614.method4464(arg4, var5, arg2, arg3, arg0, (byte) 102);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7009[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3521(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!q", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3522(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
