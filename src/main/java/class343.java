import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class343 extends class326 {

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    public static int field5328 = 0;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "[I")
    public static int[] field5332;

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 5)
    public class343() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)[I", line = 11)
    public final int[] method103(int arg0, int arg1) {
        if (arg0 >= -25) {
            return (int[]) null;
        }
        field5329++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = class34.field508[arg1];
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                var3[var5] = this.method2375((byte) -119, class110.field1527[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V", line = 46)
    public static void method2371(int arg0) {
        if (arg0 != -10875) {
            field5328 = 83;
        }
        field5332 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;", line = 56)
    public static final String method2372(boolean arg0, int arg1, int arg2, long arg3, int arg4) {
        field5333++;
        char var6 = '.';
        if (arg1 <= 78) {
            field5328 = 39;
        }
        char var7 = ',';
        StringBuffer var8 = new StringBuffer(26);
        boolean var9 = false;
        if (arg3 < 0L) {
            arg3 = -arg3;
            var9 = true;
        }
        if (arg2 == 0) {
            var6 = ',';
            var7 = '.';
        }
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var8.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var8.append(var7);
        }
        if (arg2 == 2) {
            var6 = ' ';
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var8.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var9) {
                    var8.append('-');
                }
                return var8.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var8.append(var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)I", line = 136)
    public static final int method2373(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 160) {
            field5328 = -4;
        }
        field5330++;
        int var4 = class31.field461[class53.method393(arg2, arg1)];
        if (arg3 > 0) {
            int var5 = class31.field466.method444(255, arg3 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 <= 127) {
                    var6 = arg1 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class31.field466.method456((byte) 125, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                var4 = (var12 >> 8) + (var10 << 8 & 0xFF00BA) + (var11 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IB)I", line = 206)
    public static final int method2374(int arg0, byte arg1) {
        if (arg1 == 120) {
            field5327++;
            return arg0 & 0xFF;
        } else {
            return 119;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)I", line = 220)
    private final int method2375(byte arg0, int arg1, int arg2) {
        if (arg0 >= -76) {
            field5332 = (int[]) null;
        }
        field5331++;
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return 4096 - ((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144);
    }
}
