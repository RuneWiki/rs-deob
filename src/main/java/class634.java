import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class634 extends class518 {

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    private int field8992 = 0;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    private int field8996 = 0;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    private int field8998 = 1;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field9000 = new String[] { method4632(method4631("CB7TW")), method4632(method4631("]\u001979\u0002")), method4632(method4631("V\u0019u\u0016")), method4632(method4631("]\u001970\u0002")), method4632(method4631("]\u001978\u0002")), method4632(method4631("]\u00197=\u0002")) };

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "F")
    public static float field8997;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "Lbca;")
    public static class743 field8994;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "[[[I")
    public static int[][][] field8995;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field8993;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = 60 % ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                int var5 = class568.field8263[arg0];
                int var6 = var5 - 2048 >> 1;
                for (int var7 = 0; ~class110.field1436 < ~var7; ++var7) {
                    int var8 = class393.field5718[var7];
                    int var9 = var8 + -2048 >> 1;
                    int var10;
                    if (~this.field8996 == -1) {
                        var10 = (-var5 + var8) * this.field8998;
                    } else {
                        int var11 = var9 * var9 - -(var6 * var6) >> 12;
                        int var12 = (int) (Math.sqrt((double) ((float) var11 / 4096.0F)) * 4096.0D);
                        var10 = (int) ((double) (this.field8998 * var12) * 3.141592653589793D);
                    }
                    int var13 = var10 - (-4096 & var10);
                    if (~this.field8992 == -1) {
                        var13 = class129.field1608[(var13 & 4093) >> 4] + 4096 >> 1;
                    } else if (~this.field8992 == -3) {
                        var13 -= 2048;
                        if (var13 < 0) {
                            var13 = -var13;
                        }
                        var13 = -var13 + 2048 << 1;
                    }
                    var3[var7] = var13;
                }
            }
            return var3;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field9000[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILjc;I)V", line = 75)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 == -3) {
                if (~arg0 != -1) {
                    if (arg0 != 1) {
                        if (~arg0 == -4) {
                            this.field8998 = arg1.method5128(0);
                        }
                    } else {
                        this.field8992 = arg1.method5128(arg2 ^ -3);
                    }
                } else {
                    this.field8996 = arg1.method5128(arg2 + 3);
                }
                ++field8991;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9000[1] + arg0 + ',' + (arg1 != null ? field9000[0] : field9000[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V", line = 119)
    public final void method12(int arg0) {
        try {
            class119.method1079(1);
            ++field8999;
            if (arg0 <= 38) {
                this.field8992 = -111;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9000[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V", line = 135)
    public class634() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V", line = 144)
    public static void method4630(boolean arg0) {
        try {
            field8995 = null;
            if (!arg0) {
                field8994 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9000[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4631(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4632(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
