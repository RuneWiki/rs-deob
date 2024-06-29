import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class166 extends class232 {

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    private int field2692 = 0;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    private int field2693 = 1;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    private int field2696 = 0;

    @OriginalMember(owner = "client!hq", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field2701 = new String[] { method1562(method1561("\n\u0002ES.")), method1562(method1561("\f\u0006\u0007|")), method1562(method1561("\n\u0002EQ.")), method1562(method1561("\u0019]E>{")), method1562(method1561("\n\u0002EV.")), method1562(method1561("\n\u0002E\\.")), method1562(method1561("\n\u0002EU.")), method1562(method1561("\u0006\u0006\u0006`N\u0007\u0012\u001b")), method1562(method1561("\b\u0012\u001dq(\u000e\u0012\u0005w(1\u0007\u0019yh\u0005")), method1562(method1561("*\u0016\n`B\u0017\u001e\u001b0c\u0010\u0001\u0004b<")), method1562(method1561("\n\u0002ET.")), method1562(method1561("\u0001\u001c\u0006>u\u0017\u001dE}g\f\u0012\fuk\u0007\u001d\u001f>N\r\u00078`i\u00167\u0002qa\f\u001c\u0018do\u0001>3Rc\u0003\u001d")) };

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "[I")
    public static int[] field2698 = new int[4];

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    public static int field2699;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hq", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field2700;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "[Lhk;")
    public static class107[] field2694;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1560(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILwq;I)V", line = 3)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 < 96) {
                field2698 = null;
            }
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 3) {
                        this.field2693 = arg1.method1645((byte) -124);
                    }
                } else {
                    this.field2696 = arg1.method1645((byte) -76);
                }
            } else {
                this.field2692 = arg1.method1645((byte) -126);
            }
            ++field2699;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2701[6] + arg0 + ',' + (arg1 != null ? field2701[3] : field2701[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZLwq;)Ljaa;", line = 47)
    public static final class642 method1557(boolean arg0, class176 arg1) {
        try {
            ++field2690;
            String var2 = arg1.method1635((byte) 81);
            class662 var3 = class268.method2315(!arg0)[arg1.method1645((byte) -71)];
            class666 var4 = class395.method3197(false)[arg1.method1645((byte) -92)];
            int var5 = arg1.method1657(90);
            int var6 = arg1.method1657(115);
            int var7 = arg1.method1645((byte) -80);
            int var8 = arg1.method1645((byte) -121);
            int var9 = arg1.method1645((byte) -86);
            int var10 = arg1.method1687((byte) -45);
            int var11 = arg1.method1687((byte) -112);
            if (!arg0) {
                return null;
            } else {
                int var12 = arg1.method1622(-18712);
                int var13 = arg1.method1622(-18712);
                int var14 = arg1.method1622(-18712);
                return new class642(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field2701[2] + arg0 + ',' + (arg1 != null ? field2701[3] : field2701[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 94)
    public class166() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[I", line = 97)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field2697;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                method1558((File) null, false, (byte) -7);
            }
            if (super.field3601.field6907) {
                int var4 = class100.field1467[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~var6 > ~class449.field6969; ++var6) {
                    int var7 = class788.field11518[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var9;
                    if (~this.field2692 == -1) {
                        var9 = (-var4 + var7) * this.field2693;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                        var9 = (int) ((double) (this.field2693 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (var9 & -4096);
                    if (this.field2696 == 0) {
                        var12 = class305.field4919[(var12 & 4085) >> 4] - -4096 >> 1;
                    } else if (this.field2696 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field2701[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/io/File;ZB)V", line = 170)
    public static final void method1558(File arg0, boolean arg1, byte arg2) {
        try {
            if (class346.field5618 == null) {
                class475.method3635(0);
            }
            ++field2695;
            try {
                Class var3 = Class.forName(field2701[11]);
                Method var4 = var3.getDeclaredMethod(field2701[7], field2700 != null ? field2700 : (field2700 = method1560(field2701[8])), Boolean.TYPE);
                var4.invoke(class346.field5618, arg0.getAbsolutePath(), new Boolean(arg1));
                if (arg2 > -3) {
                    method1558((File) null, true, (byte) -83);
                }
            } catch (Exception var7) {
                System.out.println(field2701[9]);
                var7.printStackTrace();
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2701[10] + (arg0 != null ? field2701[3] : field2701[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V", line = 194)
    public static void method1559(byte arg0) {
        try {
            field2694 = null;
            if (arg0 != -15) {
                field2694 = null;
            }
            field2698 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2701[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V", line = 206)
    public final void method67(byte arg0) {
        try {
            class204.method1843((byte) 92);
            int var2 = -32 / ((73 - arg0) / 34);
            ++field2691;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2701[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1561(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1562(char[] arg0) {
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
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
