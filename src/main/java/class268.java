import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class268 extends class117 {

    @OriginalMember(owner = "client!gda", name = "L", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!gda", name = "F", descriptor = "I")
    public int field3799;

    @OriginalMember(owner = "client!gda", name = "O", descriptor = "F")
    public float field3803;

    @OriginalMember(owner = "client!gda", name = "E", descriptor = "F")
    public float field3802;

    @OriginalMember(owner = "client!gda", name = "M", descriptor = "Z")
    public boolean field3800;

    @OriginalMember(owner = "client!gda", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field3805 = new String[] { method2201(method2200("K; Y")), method2201(method2200("B*-\u001b*L %A(\r")), method2201(method2200("^`b\u001bk")), method2201(method2200("B*-\u001b\\\r")), method2201(method2200("B*-\u001b]\r")) };

    @OriginalMember(owner = "client!gda", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3795 = null;

    @OriginalMember(owner = "client!gda", name = "K", descriptor = "Z")
    public static boolean field3801 = false;

    @OriginalMember(owner = "client!gda", name = "I", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!gda", name = "N", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!gda", name = "J", descriptor = "Llga;")
    public static class47 field3796;

    @OriginalMember(owner = "client!gda", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3798;

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIIZ[III)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        try {
            this.field3804 = arg2;
            this.field3799 = arg3;
            if (~super.field6861 != -34038) {
                this.field3802 = this.field3803 = 1.0F;
                this.field3800 = true;
            } else {
                this.field3803 = (float) arg3;
                this.field3802 = (float) arg2;
                this.field3800 = false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3805[2] : field3805[0]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)V")
    public static void method2198(int arg0) {
        try {
            field3795 = null;
            if (arg0 != -34038) {
                field3801 = true;
            }
            field3798 = null;
            field3796 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3805[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIIII)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        try {
            this.field3802 = (float) arg2 / (float) arg4;
            this.field3799 = arg3;
            this.field3804 = arg2;
            this.field3800 = false;
            this.field3803 = (float) arg3 / (float) arg5;
            this.method1065(false, (byte) 106, false);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIIIZ[BI)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        try {
            this.field3804 = arg3;
            this.field3799 = arg4;
            if (super.field6861 == 34037) {
                this.field3800 = false;
                this.field3802 = (float) arg3;
                this.field3803 = (float) arg4;
            } else {
                this.field3800 = true;
                this.field3802 = this.field3803 = 1.0F;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3805[2] : field3805[0]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIIIIZ)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        try {
            this.field3804 = arg4;
            if (~super.field6861 != -34038) {
                this.field3802 = this.field3803 = 1.0F;
                this.field3800 = true;
            } else {
                this.field3800 = false;
                this.field3802 = (float) arg4;
                this.field3803 = (float) arg5;
            }
            this.field3799 = arg5;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIIIIIZ)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        try {
            this.field3803 = (float) arg4 / (float) arg6;
            this.field3804 = arg3;
            this.field3802 = (float) arg3 / (float) arg5;
            this.field3800 = false;
            this.field3799 = arg4;
            this.method1065(false, (byte) 112, false);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "(I)I")
    public static final int method2199(int arg0) {
        try {
            ++field3797;
            if (arg0 != -2982) {
                method2198(110);
            }
            return 16;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3805[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIIII[BI)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        try {
            this.field3799 = arg3;
            this.field3804 = arg2;
            this.method1064(0, arg6, 0, arg7, arg2, true, 0, arg3, (byte) 62, 0);
            this.field3803 = (float) arg3 / (float) arg5;
            this.field3802 = (float) arg2 / (float) arg4;
            this.field3800 = false;
            this.method1065(false, (byte) 106, false);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3805[2] : field3805[0]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIII)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field3804 = arg3;
            if (~super.field6861 == -34038) {
                this.field3802 = (float) arg3;
                this.field3803 = (float) arg4;
                this.field3800 = false;
            } else {
                this.field3800 = true;
                this.field3802 = this.field3803 = 1.0F;
            }
            this.field3799 = arg4;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lml;IIII[I)V")
    public class268(class194 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        try {
            this.field3804 = arg1;
            this.field3799 = arg2;
            this.method1068(arg2, 0, 0, arg5, true, 115, 0, arg1, 0);
            this.field3800 = false;
            this.field3802 = (float) arg1 / (float) arg3;
            this.field3803 = (float) arg2 / (float) arg4;
            this.method1065(false, (byte) 121, false);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3805[1] + (arg0 != null ? field3805[2] : field3805[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3805[2] : field3805[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2200(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2201(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
