import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class539 extends class687 {

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field7928 = new String[] { method4091(method4090("$\bWw")), method4091(method4090("#\u0017\u0015Zr")), method4091(method4090("1S\u00155'")), method4091(method4090("#\u0017\u0015]r")), method4091(method4090("#\u0017\u0015^r")), method4091(method4090("#\u0017\u0015Xr")), method4091(method4090("#\u0017\u0015_r")), method4091(method4090("#\u0017\u0015Yr")) };

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Ltka;")
    public static class599 field7920 = new class599();

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "[I")
    public static int[] field7926 = new int[32];

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "Lsb;")
    public static class261 field7923 = new class261(88, -2);

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Ldfa;")
    private class477 field7924;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljc;I)V")
    public final void method4084(class711 arg0, int arg1) {
        try {
            if (arg1 == -1) {
                field7927++;
                while (true) {
                    int var3 = arg0.method5128(0);
                    if (var3 == 0) {
                        return;
                    }
                    this.method4086(arg0, var3, -250);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7928[1] + (arg0 == null ? field7928[0] : field7928[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
    public final String method4085(String arg0, int arg1, byte arg2) {
        try {
            field7925++;
            if (this.field7924 == null) {
                return arg0;
            } else {
                int var4 = 41 / ((19 - arg2) / 53);
                class482 var5 = (class482) this.field7924.method3693(false, (long) arg1);
                return var5 == null ? arg0 : var5.field7096;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7928[5] + (arg0 == null ? field7928[0] : field7928[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljc;II)V")
    private final void method4086(class711 arg0, int arg1, int arg2) {
        try {
            field7921++;
            if (~arg1 == arg2) {
                int var4 = arg0.method5128(0);
                if (this.field7924 == null) {
                    int var5 = class788.method5671(1282334120, var4);
                    this.field7924 = new class477(var5);
                }
                for (int var6 = 0; var6 < var4; var6++) {
                    boolean var7 = arg0.method5128(0) == 1;
                    int var8 = arg0.method5085(true);
                    class578 var9;
                    if (var7) {
                        var9 = new class482(arg0.method5144(-16414));
                    } else {
                        var9 = new class529(arg0.method5113(18443));
                    }
                    this.field7924.method3691(var9, (long) var8, -1);
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field7928[7] + (arg0 == null ? field7928[0] : field7928[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method4087(byte arg0) {
        try {
            field7920 = null;
            field7926 = null;
            field7923 = null;
            if (arg0 <= 89) {
                field7920 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7928[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([BI)Z")
    public static final boolean method4088(byte[] arg0, int arg1) {
        try {
            field7919++;
            class711 var2 = new class711(arg0);
            int var3 = var2.method5128(0);
            if (arg1 != 985) {
                return false;
            } else if (var3 == 2) {
                boolean var4 = var2.method5128(0) == 1;
                if (var4) {
                    class367.method2918(var2, (byte) -86);
                }
                class264.method2179(var2, arg1 ^ 0xFFFFFC57);
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7928[6] + (arg0 == null ? field7928[0] : field7928[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
    public final int method4089(int arg0, int arg1, int arg2) {
        try {
            field7922++;
            if (this.field7924 == null) {
                return arg1;
            }
            class529 var4 = (class529) this.field7924.method3693(false, (long) arg2);
            if (var4 == null) {
                return arg1;
            } else {
                if (arg0 != 1829) {
                    this.field7924 = null;
                }
                return var4.field7679;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7928[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4090(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4091(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
