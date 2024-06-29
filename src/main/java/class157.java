import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class157 extends class518 {

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    private int field1993 = -1;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field2005 = new String[] { method1321(method1320("\u001b*_~w")), method1321(method1320("\u001b*_rw")), method1321(method1320("\u001b*_qw")), method1321(method1320("\u001b*_|w")), method1321(method1320("\u000fn_\u0011\"")), method1321(method1320("\u001a5\u001dS")), method1321(method1320("\u001b*_vw")), method1321(method1320("\u001b*_ww")), method1321(method1320("\u001b*_yw")) };

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "[I")
    public static int[] field2004 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "[I")
    public int[] field1999;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static void method1316(boolean arg0) {
        try {
            if (!arg0) {
                field2004 = null;
            }
            field2004 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2005[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;Z)V")
    public static final void method1317(boolean arg0, String arg1, int arg2, String arg3, boolean arg4) {
        try {
            class161.field2066 = arg0;
            ++field2001;
            class304.field4234 = arg1;
            if (!arg0) {
                class466.field6807 = -1;
            }
            class778.field11082 = arg4;
            class337.field4888 = arg3;
            if (class161.field2066 || !class304.field4234.equals("") && !class337.field4888.equals("")) {
                if (~class398.field5797 != -2) {
                    class754.field10787 = -1;
                    class706.field9873 = 0;
                    class649.field9228 = -1;
                }
                class341.field4966.field11101 = false;
                class345.method2766((byte) 109, -3);
                class672.field9460 = 0;
                class561.field8167 = 1;
                class355.field5156 = arg2;
            } else {
                class345.method2766((byte) 109, 3);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2005[6] + arg0 + ',' + (arg1 != null ? field2005[4] : field2005[5]) + ',' + arg2 + ',' + (arg3 != null ? field2005[4] : field2005[5]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public final void method351(int arg0) {
        try {
            ++field1995;
            super.method351(arg0);
            this.field1999 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2005[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class157() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)Z")
    public final boolean method1318(int arg0) {
        try {
            if (arg0 != 8141) {
                this.method1319((byte) 103);
            }
            ++field1994;
            if (this.field1999 != null) {
                return true;
            } else if (~this.field1993 <= -1) {
                class66 var2 = ~class576.field8327 > -1 ? class66.method701(class38.field594, this.field1993) : class66.method704(class38.field594, class576.field8327, this.field1993);
                var2.method705();
                this.field1999 = var2.method703();
                this.field1997 = var2.field981;
                this.field2002 = var2.field977;
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2005[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[[I")
    public int[][] method349(int arg0, int arg1) {
        try {
            ++field1996;
            if (arg0 != 0) {
                field2000 = -40;
            }
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416 && this.method1318(8141)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field1997 * (~class606.field8689 != ~this.field2002 ? this.field2002 * arg1 / class606.field8689 : arg1);
                if (~class110.field1436 == ~this.field1997) {
                    for (int var8 = 0; ~var8 > ~class110.field1436; ++var8) {
                        int var9 = this.field1999[var7++];
                        var6[var8] = class434.method3377(4080, var9 << 4);
                        var5[var8] = class434.method3377(4080, var9 >> 4);
                        var4[var8] = class434.method3377(16711680, var9) >> 12;
                    }
                } else {
                    for (int var10 = 0; ~class110.field1436 < ~var10; ++var10) {
                        int var11 = this.field1997 * var10 / class110.field1436;
                        int var12 = this.field1999[var7 + var11];
                        var6[var10] = class434.method3377(255, var12) << 4;
                        var5[var10] = class434.method3377(var12, 65280) >> 4;
                        var4[var10] = class434.method3377(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field2005[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 != -3) {
                field2004 = null;
            }
            if (~arg0 == -1) {
                this.field1993 = arg1.method5116((byte) -124);
            }
            ++field2003;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2005[3] + arg0 + ',' + (arg1 != null ? field2005[4] : field2005[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
    public final int method1319(byte arg0) {
        try {
            if (arg0 < 34) {
                return -122;
            } else {
                ++field1998;
                return this.field1993;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2005[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1320(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 95);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1321(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
