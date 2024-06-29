import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class652 extends class518 {

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    private int field9262 = 4;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    private int field9257 = 4;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field9268 = new String[] { method4745(method4744("$kk\u0014`")), method4745(method4744("$kk\u0017`")), method4745(method4744(",z)?")), method4745(method4744("9!k}5")), method4745(method4744("$kk\u0010`")), method4745(method4744("$kk\u0012`")), method4745(method4744("$kk\u0011`")) };

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "[S")
    private static short[] field9256 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "[S")
    private static short[] field9258 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "[S")
    private static short[] field9259 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "[[S")
    public static short[][] field9263 = new short[][] { field9258, field9256, field9259 };

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field9266 = -1;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field9265;
            int var3 = 65 / ((-57 - arg1) / 55);
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int var5 = class110.field1436 / this.field9262;
                int var6 = class606.field8689 / this.field9257;
                int[] var8;
                if (~var6 < -1) {
                    int var7 = arg0 % var6;
                    var8 = this.method3944(class606.field8689 * var7 / var6, 0, (byte) 73);
                } else {
                    var8 = this.method3944(0, 0, (byte) 73);
                }
                for (int var9 = 0; var9 < class110.field1436; ++var9) {
                    if (~var5 >= -1) {
                        var4[var9] = var8[0];
                    } else {
                        int var10 = var9 % var5;
                        var4[var9] = var8[class110.field1436 * var10 / var5];
                    }
                }
            }
            return var4;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field9268[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static void method4742(boolean arg0) {
        try {
            if (arg0) {
                field9256 = null;
            }
            field9259 = null;
            field9263 = null;
            field9256 = null;
            field9258 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9268[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILvo;II)V")
    public static final void method4743(int arg0, class782 arg1, int arg2, int arg3) {
        try {
            ++field9267;
            if (arg1 != null) {
                if (arg1.field11270 != null) {
                    class618 var4 = new class618();
                    var4.field8812 = arg1.field11270;
                    var4.field8805 = arg1;
                    class158.method1334(var4);
                }
                class140.field1826 = arg0;
                if (arg2 != 13022) {
                    field9259 = null;
                }
                class671.field9452 = arg1.field11158;
                class351.field5091 = true;
                class108.field1420 = arg1.field11276;
                class670.field9445 = arg1.field11224;
                class121.field1535 = arg1.field11206;
                class121.field1534 = arg1.field11131;
                class760.field10845 = arg3;
                class97.method959(arg1, -1);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9268[1] + arg0 + ',' + (arg1 != null ? field9268[3] : field9268[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class652() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field9264;
            if (arg2 != -3) {
                method4743(-113, (class782) null, -120, 100);
            }
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field9257 = arg1.method5128(0);
                }
            } else {
                this.field9262 = arg1.method5128(0);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9268[4] + arg0 + ',' + (arg1 != null ? field9268[3] : field9268[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field9260;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416) {
                int var4 = class110.field1436 / this.field9262;
                int var5 = class606.field8689 / this.field9257;
                int[][] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method3943(0, class606.field8689 * var6 / var5, -23583);
                } else {
                    var7 = this.method3943(0, 0, -23583);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class110.field1436 < ~var14; ++var14) {
                    int var15;
                    if (~var4 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class110.field1436 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            return arg0 != 0 ? null : var3;
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field9268[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4744(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4745(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
