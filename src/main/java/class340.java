import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class340 extends class54 {

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5298 = new String[] { method2833(method2832("0SV\u001fnv")), method2833(method2832("0N[]")), method2833(method2832("%\u0015\u0019\u001fT")), method2833(method2832("0SV\u001fjv")), method2833(method2832("0SV\u001fkv")), method2833(method2832("0SV\u001fav")), method2833(method2832("0SV\u001flv")), method2833(method2832("0SV\u001fov")), method2833(method2832("0SV\u001fmv")), method2833(method2832("0SV\u001fhv")), method2833(method2832("0SV\u001f`v")) };

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!nha", name = "u", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!nha", name = "t", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "[Ltu;")
    public static class367[] field5291;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IILtu;)Z")
    public static final boolean method2827(int arg0, int arg1, class367 arg2) {
        try {
            class440.field6490.method2392(arg2.field5614[arg0], arg2.field5621[arg0], arg2.field5610[arg0], class376.field5724);
            ++field5295;
            int var3 = class376.field5724[2];
            if (var3 < 50) {
                return false;
            } else {
                arg2.field5622[arg0] = (short) (class376.field5724[0] * class301.field4725 / var3 + class690.field9995);
                if (arg1 != 18747) {
                    field5291 = null;
                }
                arg2.field5613[arg0] = (short) (class376.field5724[1] * class240.field3636 / var3 + class253.field3934);
                arg2.field5616[arg0] = (short) var3;
                return true;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5298[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5298[2] : field5298[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(ILhia;)V")
    public class340(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIIIILpda;ILha;II)V")
    public static final void method2828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class655 arg7, int arg8, class66 arg9, int arg10, int arg11) {
        try {
            if (arg2 == -10070) {
                if (arg8 < arg5 && ~arg5 > ~(arg8 + arg10) && ~arg6 < ~(arg1 + -13) && ~arg6 > ~(arg1 - -3)) {
                    arg4 = arg11;
                }
                ++field5292;
                String var12 = class217.method1900(15, arg7);
                class269.field4100.method605(14, var12, class749.field10906, class106.field1221, arg8 + 3, 0, arg1, arg4);
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field5298[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field5298[2] : field5298[1]) + ',' + arg8 + ',' + (arg9 != null ? field5298[2] : field5298[1]) + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            if (arg0 != 0) {
                field5291 = null;
            }
            ++field5293;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5298[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lhia;)V")
    public class340(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            ++field5296;
            if (arg0) {
                this.method109(-41, (byte) 25);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5298[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V")
    public static void method2829(byte arg0) {
        try {
            field5291 = null;
            if (arg0 != 69) {
                field5291 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5298[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            ++field5297;
            if (!arg0) {
                this.method113(-94, 99);
            }
            if (super.field593 != 1 && ~super.field593 != -1) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5298[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lha;IIIII)V")
    public static final void method2830(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field5290;
            class301.field4720 = arg0;
            class80.field901 = class301.field4720.method517();
            class290.field4310 = class301.field4720.method517();
            class497.field7202 = class301.field4720.method517();
            class741.field10765 = arg3;
            class166.field2283 = arg1;
            class555.field8287 = arg2;
            class792.field11524 = null;
            class1.field5 = null;
            class428.method3288(true, arg4, arg5);
            class204.field3165 = -1;
            class647.field9367 = -1;
            class202.field3150 = -1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5298[5] + (arg0 != null ? field5298[2] : field5298[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(Z)I")
    public final int method2831(boolean arg0) {
        try {
            if (arg0) {
                this.method115(true);
            }
            ++field5289;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5298[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 > -106) {
                method2830((class66) null, -2, -10, 46, -120, 69);
            }
            ++field5294;
            return 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5298[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2832(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2833(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
