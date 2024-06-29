import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class268 extends class211 {

    @OriginalMember(owner = "client!fga", name = "G", descriptor = "Z")
    private boolean field4087 = true;

    @OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
    private int field4093 = 4096;

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field4094 = new String[] { method2229(method2228("\u001eG\u0012c}P")), method2229(method2228("\u001eG\u0012csP")), method2229(method2228("\u0016U\u001f!")), method2229(method2228("\u0003\u000e]cI")), method2229(method2228("\u001eG\u0012cwP")), method2229(method2228("\u001eG\u0012c|P")) };

    @OriginalMember(owner = "client!fga", name = "H", descriptor = "Z")
    public static boolean field4092 = true;

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!fga", name = "E", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!fga", name = "D", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lub;Z)I", line = 8)
    public static final int method2226(class22 arg0, boolean arg1) {
        try {
            ++field4088;
            int var2 = arg0.method156(-10160, 2);
            int var3;
            if (~var2 == -1) {
                var3 = 0;
            } else if (~var2 != -2) {
                if (~var2 == -3) {
                    var3 = arg0.method156(-10160, 8);
                } else {
                    var3 = arg0.method156(-10160, 11);
                }
            } else {
                var3 = arg0.method156(-10160, 5);
            }
            if (arg1) {
                method2227(-19, false);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4094[5] + (arg0 != null ? field4094[3] : field4094[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)[[I", line = 41)
    public final int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 > -38) {
                return null;
            } else {
                ++field4090;
                int[][] var3 = super.field3230.method5463((byte) -8, arg0);
                if (super.field3230.field10931) {
                    int[] var4 = this.method1856(0, arg0 - 1 & class484.field6992, 125);
                    int[] var5 = this.method1856(0, arg0, 120);
                    int[] var6 = this.method1856(0, class484.field6992 & arg0 - -1, 111);
                    int[] var7 = var3[0];
                    int[] var8 = var3[1];
                    int[] var9 = var3[2];
                    for (int var10 = 0; ~class343.field5332 < ~var10; ++var10) {
                        int var11 = (var6[var10] + -var4[var10]) * this.field4093;
                        int var12 = (var5[var10 + 1 & class3.field28] + -var5[var10 + -1 & class3.field28]) * this.field4093;
                        int var13 = var12 >> 12;
                        int var14 = var11 >> 12;
                        int var15 = var13 * var13 >> 12;
                        int var16 = var14 * var14 >> 12;
                        int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)) * 4096.0D);
                        int var18;
                        int var19;
                        int var20;
                        if (var17 == 0) {
                            var18 = 0;
                            var19 = 0;
                            var20 = 0;
                        } else {
                            var20 = var11 / var17;
                            var18 = 16777216 / var17;
                            var19 = var12 / var17;
                        }
                        if (this.field4087) {
                            var19 = 2048 - -(var19 >> 1);
                            var18 = 2048 - -(var18 >> 1);
                            var20 = (var20 >> 1) + 2048;
                        }
                        var7[var10] = var19;
                        var8[var10] = var20;
                        var9[var10] = var18;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field4094[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V", line = 123)
    public class268() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)I", line = 126)
    public static final int method2227(int arg0, boolean arg1) {
        try {
            if (arg0 != 7521) {
                return 3;
            } else {
                ++field4089;
                int var2 = class166.field2283;
                if (~var2 != -1) {
                    if (var2 != 1) {
                        return ~var2 == -3 ? 0 : 0;
                    } else {
                        return class370.field5643;
                    }
                } else {
                    return !arg1 ? class370.field5643 : 0;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4094[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BILib;)V", line = 171)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    this.field4087 = arg2.method1455((byte) 62) == 1;
                }
            } else {
                this.field4093 = arg2.method1445((byte) 107);
            }
            ++field4091;
            if (arg0 <= 67) {
                this.field4087 = false;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4094[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4094[3] : field4094[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2228(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2229(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 120;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
