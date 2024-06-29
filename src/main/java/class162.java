import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class162 extends class54 {

    @OriginalMember(owner = "client!as", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2195 = new String[] { method1398(method1397("\r6\b\u0013\u000f")), method1398(method1397("\r6\b\u0012\u000f")), method1398(method1397("\r6\b\u0011\u000f")), method1398(method1397("\r6\b\u0010\u000f")), method1398(method1397("\r6\b\u0016\u000f")), method1398(method1397("\r6\b\u0015\u000f")), method1398(method1397("\u0017k\bzZ")), method1398(method1397("\u00020J8")) };

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                return 93;
            } else {
                ++field2188;
                return 3;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2195[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            ++field2190;
            if (arg0 != 0) {
                field2192 = -60;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2195[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                return -5;
            } else {
                ++field2194;
                return !super.field589.method656(!arg0) ? 0 : 1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2195[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (!arg0) {
                this.method109(81, (byte) 114);
            }
            super.field593 = this.method111(false);
            ++field2191;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2195[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lhia;)V")
    public class162(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(Z)I")
    public final int method1395(boolean arg0) {
        try {
            if (arg0) {
                this.method109(-2, (byte) -122);
            }
            ++field2189;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2195[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILcn;Lfs;ZILaa;II)V")
    public static final void method1396(int arg0, class541 arg1, class581 arg2, boolean arg3, int arg4, class512 arg5, int arg6, int arg7) {
        try {
            ++field2193;
            if (arg2 != null) {
                int var8;
                if (class185.field2559 != 4) {
                    var8 = 16383 & (int) class377.field5748 + class550.field8201;
                } else {
                    var8 = 16383 & (int) class377.field5748;
                }
                int var9 = Math.max(arg1.field8029 / 2, arg1.field8045 / 2) - -10;
                int var10 = arg6 * arg6 + arg7 * arg7;
                if (~var10 >= ~(var9 * var9)) {
                    int var11 = class298.field4704[var8];
                    if (!arg3) {
                        int var12 = class298.field4703[var8];
                        if (class185.field2559 != 4) {
                            var11 = var11 * 256 / (class681.field9866 + 256);
                            var12 = var12 * 256 / (class681.field9866 + 256);
                        }
                        int var13 = arg6 * var11 + arg7 * var12 >> 14;
                        int var14 = arg6 * var12 + -(arg7 * var11) >> 14;
                        arg2.method989(arg4 + var13 + arg1.field8029 / 2 + -(arg2.method988() / 2), -var14 + (arg0 - -(arg1.field8045 / 2) - arg2.method997() / 2), arg5, arg4, arg0);
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field2195[5] + arg0 + ',' + (arg1 != null ? field2195[6] : field2195[7]) + ',' + (arg2 != null ? field2195[6] : field2195[7]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2195[6] : field2195[7]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILhia;)V")
    public class162(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!as", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1397(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!as", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1398(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
