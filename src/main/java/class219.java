import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class219 extends class211 {

    @OriginalMember(owner = "client!rea", name = "K", descriptor = "I")
    private int field3389 = 0;

    @OriginalMember(owner = "client!rea", name = "L", descriptor = "I")
    private int field3391 = 1365;

    @OriginalMember(owner = "client!rea", name = "G", descriptor = "I")
    private int field3390 = 20;

    @OriginalMember(owner = "client!rea", name = "C", descriptor = "I")
    private int field3388 = 0;

    @OriginalMember(owner = "client!rea", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field3395 = new String[] { method1918(method1917("\u0004\u007fd\u0012")), method1918(method1917("\u0011$&Ph")), method1918(method1917("\u0001b")), method1918(method1917("\u0018oiPQB")), method1918(method1917("\u0018oiPTB")), method1918(method1917("\u0018oiPVB")), method1918(method1917("\u0018oiPWB")) };

    @OriginalMember(owner = "client!rea", name = "I", descriptor = "Z")
    public static boolean field3387 = false;

    @OriginalMember(owner = "client!rea", name = "J", descriptor = "I")
    public static int field3392 = -1;

    @OriginalMember(owner = "client!rea", name = "F", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!rea", name = "M", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!rea", name = "H", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!rea", name = "D", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V", line = 23)
    public class219() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILmca;ZLjava/awt/Component;)Ljq;", line = 26)
    public static final class537 method1915(int arg0, int arg1, class33 arg2, boolean arg3, Component arg4) {
        try {
            ++field3393;
            if (class598.field8803 == 0) {
                throw new IllegalStateException();
            } else if (~arg1 <= -1 && ~arg1 > -3) {
                if (~arg0 > -257) {
                    arg0 = 256;
                }
                try {
                    class537 var5 = (class537) Class.forName(field3395[2]).newInstance();
                    var5.field7878 = arg0;
                    var5.field7861 = new int[(class247.field3844 ? 2 : 1) * 256];
                    var5.method119(arg4);
                    var5.field7873 = (arg0 & -1024) - -1024;
                    if (!arg3) {
                        field3392 = 95;
                    }
                    if (~var5.field7873 < -16385) {
                        var5.field7873 = 16384;
                    }
                    var5.method122(var5.field7873);
                    if (~class686.field9950 < -1 && class267.field4085 == null) {
                        class267.field4085 = new class365();
                        class267.field4085.field5586 = arg2;
                        arg2.method227(false, class267.field4085, class686.field9950);
                    }
                    if (class267.field4085 != null) {
                        if (class267.field4085.field5583[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class267.field4085.field5583[arg1] = var5;
                    }
                    return var5;
                } catch (Throwable var9) {
                    try {
                        class221 var6 = new class221(arg2, arg1);
                        var6.field7878 = arg0;
                        var6.field7861 = new int[(class247.field3844 ? 2 : 1) * 256];
                        var6.method119(arg4);
                        var6.field7873 = 16384;
                        var6.method122(var6.field7873);
                        if (class686.field9950 > 0 && class267.field4085 == null) {
                            class267.field4085 = new class365();
                            class267.field4085.field5586 = arg2;
                            arg2.method227(false, class267.field4085, class686.field9950);
                        }
                        if (class267.field4085 != null) {
                            if (class267.field4085.field5583[arg1] != null) {
                                throw new IllegalArgumentException();
                            }
                            class267.field4085.field5583[arg1] = var6;
                        }
                        return var6;
                    } catch (Throwable var8) {
                        return new class537();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3395[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3395[1] : field3395[0]) + ',' + arg3 + ',' + (arg4 != null ? field3395[1] : field3395[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BILib;)V", line = 110)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field3385;
            if (arg0 <= 67) {
                this.method197(85, 106);
            }
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 == -4) {
                            this.field3389 = arg2.method1445((byte) 123);
                        }
                    } else {
                        this.field3388 = arg2.method1445((byte) 101);
                    }
                } else {
                    this.field3390 = arg2.method1445((byte) 127);
                }
            } else {
                this.field3391 = arg2.method1445((byte) 103);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3395[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3395[1] : field3395[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)[I", line = 163)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field3394;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                this.method197(-38, -83);
            }
            if (super.field3231.field57) {
                for (int var4 = 0; ~var4 > ~class343.field5332; ++var4) {
                    int var5 = (class88.field997[var4] << 12) / this.field3391 + this.field3388;
                    int var6 = (class302.field4735[arg1] << 12) / this.field3391 + this.field3389;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 - -var12 < 16384 && var13 < this.field3390) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var7 + var11;
                        var12 = var10 * var10 >> 12;
                        ++var13;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = ~(this.field3390 - 1) < ~var13 ? (var13 << 12) / this.field3390 : 0;
                }
            }
            return var3;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field3395[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(II)I", line = 227)
    public static int method1916(int arg0, int arg1) {
        try {
            return arg0 ^ arg1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3395[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1917(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1918(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
