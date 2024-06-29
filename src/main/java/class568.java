import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class568 {

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8257 = new String[] { method4177(method4176("y{D9 0")), method4177(method4176("y{D< 0")), method4177(method4176("y{D8 0")), method4177(method4176("c6DF\u001e")), method4177(method4176("vm\u0006\u0004")), method4177(method4176("y{D: 0")), method4177(method4176("y{D; 0")), method4177(method4176("y{D= 0")) };

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lvn;")
    public static class330 field8253 = new class330(64, 7);

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "J")
    public long field8252;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lac;")
    public class568 field8246;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lac;")
    public class568 field8249;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lgda;")
    public static class58 field8251;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[Lnh;")
    public static class781[] field8254;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)Z")
    public final boolean method4170(int arg0) {
        try {
            if (arg0 >= -91) {
                return false;
            } else {
                field8248++;
                return this.field8246 != null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8257[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)I")
    public static final int method4171(int arg0) {
        try {
            field8247++;
            if (class184.field2931 == 1) {
                return class633.field9093;
            } else if (arg0 == 0) {
                return 0;
            } else {
                return -44;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8257[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z")
    public static final boolean method4172(int arg0, int arg1) {
        try {
            if (arg1 == 2) {
                field8250++;
                return arg0 == 0 || arg0 == 2;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8257[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public final void method4173(int arg0) {
        try {
            field8256++;
            if (this.field8246 != null) {
                this.field8246.field8249 = this.field8249;
                if (arg0 != -1) {
                    field8254 = null;
                }
                this.field8249.field8246 = this.field8246;
                this.field8249 = null;
                this.field8246 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8257[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V")
    public static void method4174(int arg0) {
        try {
            field8251 = null;
            field8254 = null;
            field8253 = null;
            if (arg0 <= 75) {
                field8253 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8257[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;[BZ)I")
    public static final int method4175(int arg0, String arg1, byte[] arg2, boolean arg3) {
        try {
            field8255++;
            int var4 = arg0;
            int var5 = arg1.length();
            if (!arg3) {
                method4175(-122, null, null, true);
            }
            for (int var6 = 0; var6 < var5; var6 += 4) {
                int var7 = class373.method3076((byte) 122, arg1.charAt(var6));
                int var8 = var5 > (var6 + 1) ? class373.method3076((byte) -113, arg1.charAt(var6 + 1)) : -1;
                int var9 = (var6 + 2) < var5 ? class373.method3076((byte) 74, arg1.charAt(var6 + 2)) : -1;
                int var10 = var6 + 3 < var5 ? class373.method3076((byte) -110, arg1.charAt(var6 + 3)) : -1;
                arg2[arg0++] = (byte) class553.method4099(var8 >>> 4, var7 << 2);
                if (var9 == -1) {
                    break;
                }
                arg2[arg0++] = (byte) class553.method4099(var9 >>> 2, class292.method2485(240, var8 << 4));
                if (var10 == -1) {
                    break;
                }
                arg2[arg0++] = (byte) class553.method4099(class292.method2485(var9, 3) << 6, var10);
            }
            return arg0 - var4;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field8257[2] + arg0 + ',' + (arg1 == null ? field8257[4] : field8257[3]) + ',' + (arg2 == null ? field8257[4] : field8257[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4176(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4177(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
