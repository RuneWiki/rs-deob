import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class393 extends class211 {

    @OriginalMember(owner = "client!mv", name = "H", descriptor = "I")
    private int field5902 = 4;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    private int field5906 = 4;

    @OriginalMember(owner = "client!mv", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field5907 = new String[] { method3119(method3118("[ *;\f")), method3119(method3118("[ *0\f")), method3119(method3118("[ *3\f")), method3119(method3118("Mx*\\Y")), method3119(method3118("X#h\u001e")), method3119(method3118("[ *1\f")) };

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
    public class393() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[[I")
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field5905;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (arg1 > -38) {
                this.method201((byte) -7, -25, (class163) null);
            }
            if (super.field3230.field10931) {
                int var4 = class343.field5332 / this.field5906;
                int var5 = class463.field6744 / this.field5902;
                int[][] var7;
                if (~var5 < -1) {
                    int var6 = arg0 % var5;
                    var7 = this.method1853(0, 0, class463.field6744 * var6 / var5);
                } else {
                    var7 = this.method1853(0, 0, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class343.field5332 < ~var14; ++var14) {
                    int var16;
                    if (var4 > 0) {
                        int var15 = var14 % var4;
                        var16 = class343.field5332 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field5907[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field5901;
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    this.field5902 = arg2.method1455((byte) 62);
                }
            } else {
                this.field5906 = arg2.method1455((byte) 62);
            }
            if (arg0 < 67) {
                this.field5906 = -74;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5907[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5907[3] : field5907[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lcn;III)V")
    public static final void method3117(class541 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field5904;
            class512 var4 = arg0.method4090(-28749, class610.field8913);
            if (arg1 == 17576) {
                if (var4 != null) {
                    class610.field8913.method489(arg3, arg2, arg0.field8029 + arg3, arg2 - -arg0.field8045);
                    if (~class582.field8619 > -4) {
                        class770.field11183.method4349((float) arg0.field8029 / 2.0F + (float) arg3, (float) arg0.field8045 / 2.0F + (float) arg2, 4096, ((int) (-class377.field5748) & 16383) << 2, var4, arg3, arg2);
                    } else {
                        class610.field8913.method567(-16777216, var4, arg3, arg2);
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5907[2] + (arg0 != null ? field5907[3] : field5907[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field5903;
            if (arg0 != 8217) {
                return null;
            } else {
                int[] var3 = super.field3231.method34((byte) -64, arg1);
                if (super.field3231.field57) {
                    int var4 = class343.field5332 / this.field5906;
                    int var5 = class463.field6744 / this.field5902;
                    int[] var6;
                    if (var5 <= 0) {
                        var6 = this.method1856(0, 0, 109);
                    } else {
                        int var7 = arg1 % var5;
                        var6 = this.method1856(0, class463.field6744 * var7 / var5, 104);
                    }
                    for (int var8 = 0; ~var8 > ~class343.field5332; ++var8) {
                        if (~var4 >= -1) {
                            var3[var8] = var6[0];
                        } else {
                            int var9 = var8 % var4;
                            var3[var8] = var6[class343.field5332 * var9 / var4];
                        }
                    }
                }
                return var3;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5907[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3118(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3119(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
