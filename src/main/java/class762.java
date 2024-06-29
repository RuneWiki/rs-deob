import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class762 extends class54 {

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11043 = new String[] { method5522(method5521("\u0012\u0007m\u0002\u0011")), method5522(method5521("\u0012\u0007m\b\u0011")), method5522(method5521("\u0012\u0007m\u0007\u0011")), method5522(method5521("\u0012\u0007m\r\u0011")), method5522(method5521("\u0012\u0007m\u0004\u0011")), method5522(method5521("\u0012\u0007m\u0003\u0011")), method5522(method5521("\u0012\u0007m\u0000\u0011")), method5522(method5521("\u0012\u0007m\f\u0011")), method5522(method5521("\u0012\u0007m\u0001\u0011")), method5522(method5521("\u0012\u0007m\u000f\u0011")), method5522(method5521("\u0012\u0007m\u0006\u0011")) };

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[S")
    public static short[] field11038 = new short[] { 8, 4, 23, 59, 2, 53, 19, 45 };

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "[S")
    public static short[] field11041 = new short[256];

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field11031;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field11032;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field11033;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field11034;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field11035;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field11036;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field11037;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field11039;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field11040;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field11042;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)Z", line = 4)
    public final boolean method5514(int arg0) {
        try {
            ++field11040;
            if (arg0 != -10243) {
                return false;
            } else if (super.field589.method656(true)) {
                return false;
            } else {
                return super.field589.method653(24915) == class243.field3725;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11043[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 23)
    public final void method115(boolean arg0) {
        try {
            ++field11036;
            if (super.field589.method653(24915) == class243.field3725) {
                if (super.field589.method656(true)) {
                    super.field593 = 0;
                }
            } else {
                super.field593 = 1;
            }
            if (super.field593 != 0 && ~super.field593 != -2) {
                super.field593 = this.method111(false);
            }
            if (!arg0) {
                method5519((byte) 40);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11043[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V", line = 43)
    public static void method5515(boolean arg0) {
        try {
            if (arg0) {
                field11041 = null;
            }
            field11041 = null;
            field11038 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11043[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)I", line = 54)
    public final int method111(boolean arg0) {
        try {
            ++field11032;
            if (arg0) {
                this.method111(true);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11043[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lhia;)V", line = 68)
    public class762(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(Z)I", line = 71)
    public final int method5516(boolean arg0) {
        try {
            if (arg0) {
                this.method5516(true);
            }
            ++field11039;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11043[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 83)
    public static final void method5517(byte arg0) {
        try {
            ++field11042;
            if (arg0 != -17) {
                method5519((byte) 121);
            }
            if (class768.field11101 != null) {
                class768.field11101.method5220((byte) -126);
            }
            if (class663.field9581 != null) {
                while (true) {
                    try {
                        class663.field9581.join();
                        return;
                    } catch (InterruptedException var2) {
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11043[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V", line = 109)
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            if (arg0 != 0) {
                field11038 = null;
            }
            ++field11037;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11043[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)I", line = 122)
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 > -106) {
                return 118;
            } else {
                ++field11035;
                if (super.field589.method656(true)) {
                    return 3;
                } else if (super.field589.method653(24915) == class243.field3725) {
                    if (arg0 == 0) {
                        if (~super.field589.field827.method3572(false) == -2) {
                            return 2;
                        }
                        if (~super.field589.field835.method1184(false) == -2) {
                            return 2;
                        }
                        if (super.field589.field799.method3608(false) > 0) {
                            return 2;
                        }
                    }
                    return 1;
                } else {
                    return 3;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11043[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IC)Z", line = 158)
    public static final boolean method5518(int arg0, char arg1) {
        try {
            if (arg0 != 8) {
                method5515(false);
            }
            ++field11034;
            return ~arg1 == -161 || ~arg1 == -33 || ~arg1 == -96 || ~arg1 == -46;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11043[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILhia;)V", line = 175)
    public class762(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 178)
    public static final void method5519(byte arg0) {
        try {
            if (class643.field9331 != null) {
                try {
                    class643.field9331.close();
                } catch (IOException var2) {
                }
            }
            ++field11031;
            if (arg0 <= 3) {
                method5518(-46, '\u000f');
            }
            class643.field9331 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11043[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 199)
    public static final String method5520(boolean arg0, long arg1) {
        try {
            ++field11033;
            if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
                if (arg0) {
                    method5515(true);
                }
                if (arg1 % 37L == 0L) {
                    return null;
                } else {
                    int var3 = 0;
                    for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                        ++var3;
                    }
                    StringBuffer var6 = new StringBuffer(var3);
                    while (~arg1 != -1L) {
                        long var7 = arg1;
                        arg1 /= 37L;
                        var6.append(class364.field5574[(int) (var7 - arg1 * 37L)]);
                    }
                    return var6.reverse().toString();
                }
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field11043[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5521(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5522(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
