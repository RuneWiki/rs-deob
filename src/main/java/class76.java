import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class76 extends class211 {

    @OriginalMember(owner = "client!sga", name = "G", descriptor = "I")
    private int field883 = -1;

    @OriginalMember(owner = "client!sga", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field885 = new String[] { method683(method682("\u0010]7JVK")), method683(method682("\u0010]7JNK")), method683(method682("\u0010]7JAK")), method683(method682("\rO:\b")), method683(method682("\u0018\u0014xJz")), method683(method682("\u0010]7JDK")), method683(method682("\u0010]7JD\"\u0012")), method683(method682("\u0010]7J@K")) };

    @OriginalMember(owner = "client!sga", name = "E", descriptor = "Z")
    public static boolean field874 = false;

    @OriginalMember(owner = "client!sga", name = "N", descriptor = "Ljava/lang/String;")
    public static String field872 = "";

    @OriginalMember(owner = "client!sga", name = "D", descriptor = "Lel;")
    public static class573 field884 = new class573(102, 6);

    @OriginalMember(owner = "client!sga", name = "Q", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!sga", name = "I", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!sga", name = "P", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!sga", name = "L", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!sga", name = "C", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!sga", name = "M", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!sga", name = "O", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!sga", name = "H", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!sga", name = "J", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!sga", name = "F", descriptor = "[I")
    public int[] field875;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)Z", line = 6)
    public final boolean method678(byte arg0) {
        try {
            ++field871;
            if (this.field875 != null) {
                return true;
            } else {
                if (arg0 != -4) {
                    this.field883 = 2;
                }
                if (~this.field883 <= -1) {
                    class481 var2 = class671.field9744 >= 0 ? class481.method3675(class214.field3266, class671.field9744, this.field883) : class481.method3669(class214.field3266, this.field883);
                    var2.method3666();
                    this.field875 = var2.method3678();
                    this.field881 = var2.field6970;
                    this.field876 = var2.field6977;
                    return true;
                } else {
                    return false;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field885[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V", line = 32)
    public final void method679(byte arg0) {
        try {
            ++field877;
            super.method679(arg0);
            this.field875 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field885[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)V", line = 41)
    public static void method680(int arg0) {
        try {
            field872 = null;
            if (arg0 >= 91) {
                field884 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field885[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)[[I", line = 53)
    public int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 > -38) {
                this.field875 = null;
            }
            ++field873;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931 && this.method678((byte) -4)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field881 * (class463.field6744 != this.field876 ? this.field876 * arg0 / class463.field6744 : arg0);
                if (~class343.field5332 == ~this.field881) {
                    for (int var8 = 0; class343.field5332 > var8; ++var8) {
                        int var9 = this.field875[var7++];
                        var6[var8] = class291.method2359(var9, 255) << 4;
                        var5[var8] = class291.method2359(65280, var9) >> 4;
                        var4[var8] = class291.method2359(var9 >> 12, 4080);
                    }
                } else {
                    for (int var10 = 0; class343.field5332 > var10; ++var10) {
                        int var11 = this.field881 * var10 / class343.field5332;
                        int var12 = this.field875[var7 + var11];
                        var6[var10] = class291.method2359(var12 << 4, 4080);
                        var5[var10] = class291.method2359(var12, 65280) >> 4;
                        var4[var10] = class291.method2359(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field885[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BILib;)V", line = 126)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field878;
            if (arg0 >= 67) {
                if (~arg1 == -1) {
                    this.field883 = arg2.method1445((byte) 108);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field885[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field885[4] : field885[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "()V", line = 144)
    public class76() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)I", line = 148)
    public final int method681(byte arg0) {
        try {
            if (arg0 != -36) {
                this.method201((byte) -61, -32, (class163) null);
            }
            ++field882;
            return this.field883;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field885[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method682(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method683(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
