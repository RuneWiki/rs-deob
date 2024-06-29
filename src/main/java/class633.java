import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class633 extends class515 {

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Lat;")
    public class398 field9094 = new class398();

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "Lao;")
    public class301 field9102 = new class301();

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Leg;")
    private class114 field9095;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field9103 = new String[] { method4598(method4597("S`\u0000\u0019")), method4598(method4597("TdB73")), method4598(method4597("F;B[f")), method4598(method4597("TdB63")), method4598(method4597("TdB43")), method4598(method4597("TdB13")), method4598(method4597("TdBIrS|\u0018K3")), method4598(method4597("TdB33")), method4598(method4597("TdB=3")), method4598(method4597("TdB23")), method4598(method4597("TdB03")) };

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIILup;[I)V", line = 3)
    private final void method4594(int arg0, int arg1, int arg2, int arg3, class289 arg4, int[] arg5) {
        try {
            if ((this.field9095.field1645[arg4.field4637] & 0x4) != 0 && arg4.field4661 < 0) {
                int var7 = this.field9095.field1668[arg4.field4637] / class210.field3321;
                while (true) {
                    int var8 = (var7 + 1048575 - arg4.field4649) / var7;
                    if (arg0 < var8) {
                        arg4.field4649 += arg0 * var7;
                        break;
                    }
                    arg4.field4657.method1097(arg5, arg3, var8);
                    arg3 += var8;
                    arg4.field4649 += var7 * var8 - 1048576;
                    arg0 -= var8;
                    int var9 = class210.field3321 / 100;
                    int var10 = 262144 / var7;
                    if (var9 > var10) {
                        var9 = var10;
                    }
                    class675 var11 = arg4.field4657;
                    if (this.field9095.field1617[arg4.field4637] == 0) {
                        arg4.field4657 = class675.method4913(arg4.field4645, var11.method4894(), var11.method4915(), var11.method4895());
                    } else {
                        arg4.field4657 = class675.method4913(arg4.field4645, var11.method4894(), 0, var11.method4895());
                        this.field9095.method1121(28237, arg4, arg4.field4648.field6055[arg4.field4658] < 0);
                        arg4.field4657.method4883(var9, var11.method4915());
                    }
                    if (arg4.field4648.field6055[arg4.field4658] < 0) {
                        arg4.field4657.method4909(-1);
                    }
                    var11.method4896(var9);
                    var11.method1097(arg5, arg3, arg1 - arg3);
                    if (var11.method4890()) {
                        this.field9102.method2596(var11);
                    }
                }
            }
            field9096++;
            arg4.field4657.method1097(arg5, arg3, arg0);
            if (arg2 != -1) {
                this.method1136();
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field9103[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field9103[0] : field9103[2]) + ',' + (arg5 == null ? field9103[0] : field9103[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "()I", line = 67)
    public final int method1108() {
        try {
            field9100++;
            return 0;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9103[9] + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()Lef;", line = 75)
    public final class515 method1136() {
        try {
            field9092++;
            class289 var1;
            do {
                var1 = (class289) this.field9094.method3216(true);
                if (var1 == null) {
                    return null;
                }
            } while (var1.field4657 == null);
            return var1.field4657;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9103[4] + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 97)
    public final void method1116(int arg0) {
        try {
            this.field9102.method1116(arg0);
            field9099++;
            for (class289 var2 = (class289) this.field9094.method3228(11); var2 != null; var2 = (class289) this.field9094.method3216(true)) {
                if (!this.field9095.method1114(var2, 64)) {
                    int var3 = arg0;
                    do {
                        if (var2.field4650 >= var3) {
                            this.method4596(var3, var2, -78);
                            var2.field4650 -= var3;
                            break;
                        }
                        this.method4596(var2.field4650, var2, -64);
                        var3 -= var2.field4650;
                    } while (!this.field9095.method1112(null, var2, 3567, var3, 0));
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9103[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Leg;)V", line = 251)
    public class633(class114 arg0) {
        try {
            this.field9095 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9103[6] + (arg0 == null ? field9103[0] : field9103[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BII)V", line = 139)
    public static final void method4595(byte arg0, int arg1, int arg2) {
        try {
            field9091++;
            int var3 = 66 % ((arg0 + 27) / 40);
            class551 var4 = class380.method3113(42, (long) arg1, 12);
            var4.method4086(-89);
            var4.field8076 = arg2;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9103[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILup;I)V", line = 152)
    private final void method4596(int arg0, class289 arg1, int arg2) {
        try {
            field9101++;
            if ((this.field9095.field1645[arg1.field4637] & 0x4) != 0 && arg1.field4661 < 0) {
                int var4 = this.field9095.field1668[arg1.field4637] / class210.field3321;
                int var5 = (var4 + 1048575 - arg1.field4649) / var4;
                arg1.field4649 = arg0 * var4 + arg1.field4649 & 0xFFFFF;
                if (var5 <= arg0) {
                    if (this.field9095.field1617[arg1.field4637] == 0) {
                        arg1.field4657 = class675.method4913(arg1.field4645, arg1.field4657.method4894(), arg1.field4657.method4915(), arg1.field4657.method4895());
                    } else {
                        arg1.field4657 = class675.method4913(arg1.field4645, arg1.field4657.method4894(), 0, arg1.field4657.method4895());
                        this.field9095.method1121(28237, arg1, arg1.field4648.field6055[arg1.field4658] < 0);
                    }
                    if (arg1.field4648.field6055[arg1.field4658] < 0) {
                        arg1.field4657.method4909(-1);
                    }
                    arg0 = arg1.field4649 / var4;
                }
            }
            if (arg2 < -57) {
                arg1.field4657.method1116(arg0);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9103[1] + arg0 + ',' + (arg1 == null ? field9103[0] : field9103[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "()Lef;", line = 190)
    public final class515 method1134() {
        try {
            field9098++;
            class289 var1 = (class289) this.field9094.method3228(11);
            if (var1 == null) {
                return null;
            } else if (var1.field4657 == null) {
                return this.method1136();
            } else {
                return var1.field4657;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9103[10] + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "([III)V", line = 209)
    public final void method1097(int[] arg0, int arg1, int arg2) {
        try {
            field9097++;
            this.field9102.method1097(arg0, arg1, arg2);
            for (class289 var4 = (class289) this.field9094.method3228(11); var4 != null; var4 = (class289) this.field9094.method3216(true)) {
                if (!this.field9095.method1114(var4, 64)) {
                    int var5 = arg2;
                    int var6 = arg1;
                    do {
                        if (var5 <= var4.field4650) {
                            this.method4594(var5, var5 + var6, -1, var6, var4, arg0);
                            var4.field4650 -= var5;
                            break;
                        }
                        this.method4594(var4.field4650, var6 + var5, -1, var6, var4, arg0);
                        var6 += var4.field4650;
                        var5 -= var4.field4650;
                    } while (!this.field9095.method1112(arg0, var4, 3567, var5, var6));
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9103[7] + (arg0 == null ? field9103[0] : field9103[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4597(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4598(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
