import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class648 extends class518 {

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    private int field9214 = 0;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    private int field9213 = 1365;

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    private int field9209 = 0;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    private int field9215 = 20;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field9220 = new String[] { method4727(method4726("\u001c;V0")), method4727(method4726("\t`\u0014r\\")), method4727(method4726("\u00018\u0014\u001f\t")), method4727(method4726("\u00018\u0014\u0019\t")), method4727(method4726("\u00018\u0014\u0018\t")), method4727(method4726("\u00018\u0014\u001b\t")), method4727(method4726("\u00018\u0014\u001e\t")), method4727(method4726("\u00018\u0014\u001a\t")) };

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
    public static int field9211 = 0;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
    public static int field9208 = 1;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "Llf;")
    public static class260 field9207 = new class260(3, 4);

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "[F")
    public static float[] field9216 = new float[4];

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            int var3 = -71 % ((-57 - arg1) / 55);
            ++field9217;
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                for (int var5 = 0; var5 < class110.field1436; ++var5) {
                    int var6 = (class393.field5718[var5] << 12) / this.field9213 - -this.field9209;
                    int var7 = (class568.field8263[arg0] << 12) / this.field9213 + this.field9214;
                    int var8 = var6;
                    int var9 = var7;
                    int var10 = var6;
                    int var11 = var7;
                    int var12 = var6 * var6 >> 12;
                    int var13 = var7 * var7 >> 12;
                    int var14 = 0;
                    while (var12 - -var13 < 16384 && this.field9215 > var14) {
                        var11 = (var10 * var11 >> 12) * 2 + var9;
                        var10 = -var13 + var12 - -var8;
                        ++var14;
                        var12 = var10 * var10 >> 12;
                        var13 = var11 * var11 >> 12;
                    }
                    var4[var5] = this.field9215 - 1 > var14 ? (var14 << 12) / this.field9215 : 0;
                }
            }
            return var4;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field9220[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 == 3) {
                            this.field9214 = arg1.method5116((byte) -108);
                        }
                    } else {
                        this.field9209 = arg1.method5116((byte) -116);
                    }
                } else {
                    this.field9215 = arg1.method5116((byte) -108);
                }
            } else {
                this.field9213 = arg1.method5116((byte) -117);
            }
            if (arg2 == -3) {
                ++field9212;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9220[2] + arg0 + ',' + (arg1 != null ? field9220[1] : field9220[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)V")
    public static void method4722(int arg0) {
        try {
            if (arg0 != -17671) {
                field9211 = -92;
            }
            field9216 = null;
            field9207 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9220[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Llga;ILd;)V")
    public static final void method4723(class47 arg0, int arg1, class673 arg2) {
        try {
            class716.field10205 = arg0;
            class62.field946 = arg2;
            ++field9219;
            if (arg1 <= 22) {
                method4722(-70);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9220[7] + (arg0 != null ? field9220[1] : field9220[0]) + ',' + arg1 + ',' + (arg2 != null ? field9220[1] : field9220[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(DI)V")
    public static final void method4724(double arg0, int arg1) {
        try {
            if (class694.field9692 != arg0) {
                for (int var3 = 0; ~var3 > -257; ++var3) {
                    int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                    class777.field11075[var3] = ~var4 >= -256 ? var4 : 255;
                }
                class694.field9692 = arg0;
            }
            if (arg1 >= -113) {
                method4722(53);
            }
            ++field9218;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9220[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBIIZIII)V")
    public static final void method4725(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        try {
            ++field9210;
            if (~(!arg4 ? class451.field6612.field9106.method2498(3) : class451.field6612.field9102.method2498(3)) != -1 && ~arg6 != -1 && class347.field5048 < 50 && ~arg7 != 0) {
                class759.field10834[class347.field5048++] = new class441((byte) (arg4 ? 3 : 2), arg7, arg6, arg2, arg3, arg0, arg5, (class202) null);
            }
            if (arg1 != 2) {
                method4722(21);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9220[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
    public class648() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4726(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4727(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
