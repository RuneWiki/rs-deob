import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class533 extends class459 {

    @OriginalMember(owner = "client!bda", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field7831 = new String[] { method3980(method3979("`=)#-*")), method3980(method3979("l,$a")), method3980(method3979("ywf#\u0016")), method3980(method3979("`=)#/*")), method3980(method3979("`=)#(*")), method3980(method3979("`=)#.*")), method3980(method3979("`=)#)*")), method3980(method3979("`=)#**")) };

    @OriginalMember(owner = "client!bda", name = "J", descriptor = "Ljk;")
    public static class662 field7816 = new class662();

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "[I")
    public static int[] field7821 = new int[1000];

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "[I")
    public static int[] field7822 = new int[4];

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "Lvn;")
    public static class330 field7823 = new class330(77, 16);

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "Leu;")
    public static class507 field7828 = new class507();

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!bda", name = "I", descriptor = "Ljava/lang/String;")
    public String field7820;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "[C")
    public char[] field7824;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "[C")
    public char[] field7825;

    @OriginalMember(owner = "client!bda", name = "K", descriptor = "[I")
    public int[] field7818;

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "[I")
    public int[] field7826;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(CB)I")
    public final int method3973(char arg0, byte arg1) {
        try {
            field7829++;
            int var3 = 39 % ((-arg1 - 68) / 42);
            if (this.field7818 == null) {
                return -1;
            }
            for (int var4 = 0; var4 < this.field7818.length; var4++) {
                if (this.field7825[var4] == arg0) {
                    return this.field7818[var4];
                }
            }
            return -1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7831[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
    public final void method3974(int arg0) {
        try {
            if (this.field7818 != null) {
                for (int var2 = 0; var2 < this.field7818.length; var2++) {
                    this.field7818[var2] = class553.method4099(this.field7818[var2], 32768);
                }
            }
            field7819++;
            if (arg0 > -25) {
                field7821 = null;
            }
            if (this.field7826 != null) {
                for (int var3 = 0; var3 < this.field7826.length; var3++) {
                    this.field7826[var3] = class553.method4099(this.field7826[var3], 32768);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7831[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILwq;Z)V")
    private final void method3975(int arg0, class176 arg1, boolean arg2) {
        try {
            if (arg2) {
                field7827++;
                if (arg0 == 1) {
                    this.field7820 = arg1.method1635((byte) 96);
                } else if (arg0 == 2) {
                    int var7 = arg1.method1645((byte) -105);
                    this.field7826 = new int[var7];
                    this.field7824 = new char[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field7826[var8] = arg1.method1687((byte) -98);
                        byte var9 = arg1.method1672(-115);
                        this.field7824[var8] = var9 == 0 ? 0 : class423.method3359(-6826, var9);
                    }
                } else if (arg0 == 3) {
                    int var4 = arg1.method1645((byte) -78);
                    this.field7818 = new int[var4];
                    this.field7825 = new char[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field7818[var5] = arg1.method1687((byte) -51);
                        byte var6 = arg1.method1672(110);
                        this.field7825[var5] = var6 == 0 ? 0 : class423.method3359(-6826, var6);
                    }
                    return;
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7831[3] + arg0 + ',' + (arg1 == null ? field7831[1] : field7831[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static void method3976(int arg0) {
        try {
            field7821 = null;
            field7822 = null;
            field7816 = null;
            field7828 = null;
            if (arg0 == -1) {
                field7823 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7831[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(CB)I")
    public final int method3977(char arg0, byte arg1) {
        try {
            field7815++;
            if (this.field7826 == null) {
                return -1;
            }
            if (arg1 != 56) {
                field7828 = null;
            }
            for (int var3 = 0; var3 < this.field7826.length; var3++) {
                if (this.field7824[var3] == arg0) {
                    return this.field7826[var3];
                }
            }
            return -1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7831[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILwq;)V")
    public final void method3978(int arg0, class176 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1645((byte) -128);
                if (var3 == 0) {
                    if (arg0 != -1) {
                        field7823 = null;
                    }
                    field7830++;
                    return;
                }
                this.method3975(var3, arg1, true);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7831[0] + arg0 + ',' + (arg1 == null ? field7831[1] : field7831[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3979(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3980(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
