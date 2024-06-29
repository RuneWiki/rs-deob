import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class572 extends class755 {

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8465 = new String[] { method4277(method4276(" U2&\u001e")), method4277(method4276(" U2'\u001e")), method4277(method4276("+Ap\u000f")), method4277(method4276(">\u001a2MK")), method4277(method4276(" U2!\u001e")), method4277(method4276(" U2\"\u001e")), method4277(method4276(" U2 \u001e")) };

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lto;")
    public static class8 field8456 = new class8(method4277(method4276("\"Uq\u0006\u0005")), method4277(method4276("\u0002Uq\u0006\u0016v")), 2);

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "B")
    private byte field8462;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "B")
    private byte field8463;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Ljava/lang/String;")
    private String field8457;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
    public static int[] field8459;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 4)
    public static void method4273(int arg0) {
        try {
            field8456 = null;
            field8459 = null;
            if (arg0 > -65) {
                field8456 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8465[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Llq;Ljava/lang/String;Lcn;Lda;IIIIIILaa;I)V", line = 25)
    public static final void method4274(class578 arg0, String arg1, class541 arg2, class67 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class512 arg10, int arg11) {
        try {
            field8464++;
            int var12;
            if (class185.field2559 == 4) {
                var12 = (int) class377.field5748 & 0x3FFF;
            } else {
                var12 = (int) class377.field5748 + class550.field8201 & 0x3FFF;
            }
            int var13 = Math.max(arg2.field8029 / 2, arg2.field8045 / 2) + 10;
            int var14 = arg8 * arg8 + (arg9 * arg9);
            if (var14 <= var13 * var13) {
                int var15 = class298.field4704[var12];
                int var16 = class298.field4703[var12];
                if (class185.field2559 != 4) {
                    var15 = var15 * 256 / (class681.field9866 + 256);
                    var16 = var16 * 256 / (class681.field9866 + 256);
                }
                int var17 = arg9 * var15 + (arg8 * var16) >> 14;
                if (arg6 != -17645) {
                    field8456 = null;
                }
                int var18 = arg9 * var16 - (arg8 * var15) >> 14;
                int var19 = arg0.method4325(100, null, arg1, -16125);
                int var20 = arg0.method4317(null, 100, false, 0, arg1);
                int var21 = var17 - var19 / 2;
                if (var21 >= (-arg2.field8029) && var21 <= arg2.field8029 && var18 >= -arg2.field8045 && arg2.field8045 >= var18) {
                    arg3.method598(0, 0, 50, arg5, 0, (byte) -125, null, var19, arg1, arg4, null, arg2.field8029 / 2 + arg7 + var21, arg7, arg10, arg2.field8045 / 2 + arg4 - (arg11 + var18 + var20), 1);
                }
            }
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field8465[1] + (arg0 == null ? field8465[2] : field8465[3]) + ',' + (arg1 == null ? field8465[2] : field8465[3]) + ',' + (arg2 == null ? field8465[2] : field8465[3]) + ',' + (arg3 == null ? field8465[2] : field8465[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field8465[2] : field8465[3]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLib;)V", line = 74)
    public final void method1992(byte arg0, class163 arg1) {
        try {
            this.field8457 = arg1.method1401(0);
            field8460++;
            int var3 = -122 / ((arg0 - 3) / 51);
            if (this.field8457 != null) {
                arg1.method1455((byte) 62);
                this.field8462 = arg1.method1414(1);
                this.field8463 = arg1.method1414(1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8465[5] + arg0 + ',' + (arg1 == null ? field8465[2] : field8465[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILwca;)V", line = 98)
    public final void method1990(int arg0, class705 arg1) {
        try {
            if (this.field8457 != null) {
                arg1.field10247 = this.field8462;
                arg1.field10245 = this.field8463;
            }
            if (arg0 == -1) {
                field8458++;
                arg1.field10238 = this.field8457;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8465[4] + arg0 + ',' + (arg1 == null ? field8465[2] : field8465[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V", line = 123)
    public static final void method4275(int arg0, byte arg1) {
        try {
            if (arg1 <= -12) {
                class202.field3135 = arg0;
                field8461++;
                class396.field5928.method1559(0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8465[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4276(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4277(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 52;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
