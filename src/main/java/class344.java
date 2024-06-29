import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class344 implements class296 {

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Led;")
    private class59 field5008;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "[I")
    public int[] field5002;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public int field5007;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Lhc;")
    private class597 field5009;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "[F")
    public float[] field5000;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5015 = new String[] { method2765(method2764("j %G[")), method2765(method2764("j %D[")), method2765(method2764("ta%/\u000e")), method2765(method2764("a:gm")), method2765(method2764("j %C[")), method2765(method2764("j %=\u001aa&\u007f?[")), method2765(method2764("j %E[")), method2765(method2764("j %B[")), method2765(method2764("j %@[")) };

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Lsb;")
    public static class261 field4999 = new class261(66, 6);

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field5010 = 0;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field5012 = 0;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "[I")
    public static int[] field5014 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method2760(byte arg0, int arg1, int arg2) {
        try {
            field5004++;
            if (arg0 >= -5) {
                return true;
            } else {
                return class398.method3116((byte) -33, arg2, arg1) || class145.method1256(0, arg2, arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5015[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 17)
    public static void method2761(byte arg0) {
        try {
            if (arg0 != 10) {
                method2763(true);
            }
            field4999 = null;
            field5014 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5015[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIZZ)V", line = 36)
    public final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        try {
            class21.method258(this.field5008.field821.field6616, arg7 ? this.field5008.field828 : null, this.field5002, arg2, arg7 ? this.field5000 : null, (byte) -72, arg5, this.field5007, arg4, arg6 ? this.field5008.field821.field6611 : null, arg0, arg3, arg1);
            field5005++;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5015[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(IIIIIIZZ)V", line = 48)
    public final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        try {
            class21.method258(this.field5007, arg7 ? this.field5000 : null, this.field5008.field821.field6611, arg2, arg7 ? this.field5008.field828 : null, (byte) -72, arg5, this.field5008.field821.field6616, arg4, arg6 ? this.field5002 : null, arg0, arg3, arg1);
            field5006++;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5015[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILbo;IIIILha;BII)V", line = 64)
    public static final void method2762(int arg0, int arg1, int arg2, class801 arg3, int arg4, int arg5, int arg6, int arg7, class18 arg8, byte arg9, int arg10, int arg11) {
        try {
            field5003++;
            if (arg0 > arg5 && arg5 + arg7 > arg0 && arg2 - 13 < arg4 && arg4 < arg2 + 3) {
                arg6 = arg11;
            }
            String var12 = class24.method284(-1, arg3);
            if (arg9 == 40) {
                class200.field2954.method1834(arg6, -48, arg2, arg5 + 3, class342.field4978, var12, class776.field11071, 0);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5015[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5015[3] : field5015[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field5015[3] : field5015[2]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 82)
    public static final void method2763(boolean arg0) {
        try {
            field5011++;
            class251 var1 = class699.field9789;
            synchronized (class699.field9789) {
                if (!arg0) {
                    method2760((byte) -93, -3, 95);
                }
                class699.field9789.method2043(false);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5015[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Led;Ltb;Lhc;)V", line = 99)
    public class344(class59 arg0, class392 arg1, class597 arg2) {
        try {
            this.field5008 = arg0;
            if ((arg1 instanceof class498)) {
                class498 var5 = (class498) arg1;
                this.field5001 = var5.field3775;
                this.field5007 = var5.field3777;
                this.field5002 = var5.field7295;
            } else if ((arg1 instanceof class88)) {
                class88 var4 = (class88) arg1;
                this.field5001 = var4.field3775;
                this.field5002 = var4.field1232;
                this.field5007 = var4.field3777;
            } else {
                throw new RuntimeException();
            }
            if (arg2 != null) {
                this.field5009 = arg2;
                if (this.field5009.field8585 != this.field5007 || this.field5009.field8582 != this.field5001) {
                    throw new RuntimeException();
                }
                this.field5000 = this.field5009.field8583;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5015[5] + (arg0 == null ? field5015[3] : field5015[2]) + ',' + (arg1 == null ? field5015[3] : field5015[2]) + ',' + (arg2 == null ? field5015[3] : field5015[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2764(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2765(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
