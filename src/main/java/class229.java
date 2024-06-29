import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class229 extends class211 {

    @OriginalMember(owner = "client!cha", name = "C", descriptor = "I")
    private int field3487 = 32768;

    @OriginalMember(owner = "client!cha", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field3490 = new String[] { method1968(method1967(";z~a\\")), method1968(method1967("#<1abh")), method1968(method1967(".!<#")), method1968(method1967("#<1ajh")), method1968(method1967("#<1ahh")), method1968(method1967("#<1ach")) };

    @OriginalMember(owner = "client!cha", name = "G", descriptor = "I")
    public static int field3484 = 0;

    @OriginalMember(owner = "client!cha", name = "D", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!cha", name = "E", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!cha", name = "H", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!cha", name = "I", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V", line = 7)
    public final void method437(int arg0) {
        try {
            if (arg0 != 27132) {
                this.method234(25, -3);
            }
            class100.method826(15667);
            ++field3488;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3490[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(II)[I", line = 18)
    public final int[] method197(int arg0, int arg1) {
        try {
            if (arg0 != 8217) {
                this.method201((byte) 106, -17, (class163) null);
            }
            ++field3489;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int[] var4 = this.method1856(1, arg1, 98);
                int[] var5 = this.method1856(2, arg1, 120);
                for (int var6 = 0; var6 < class343.field5332; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field3487 >> 12;
                    int var9 = class713.field10336[var7] * var8 >> 12;
                    int var10 = class100.field1109[var7] * var8 >> 12;
                    int var11 = class3.field28 & var6 - -(var9 >> 12);
                    int var12 = (var10 >> 12) + arg1 & class484.field6992;
                    int[] var13 = this.method1856(0, var12, 80);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field3490[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(II)[[I", line = 71)
    public final int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 >= -38) {
                return null;
            } else {
                ++field3486;
                int[][] var3 = super.field3230.method5463((byte) -8, arg0);
                if (super.field3230.field10931) {
                    int[] var4 = this.method1856(1, arg0, 46);
                    int[] var5 = this.method1856(2, arg0, 25);
                    int[] var6 = var3[0];
                    int[] var7 = var3[1];
                    int[] var8 = var3[2];
                    for (int var9 = 0; ~class343.field5332 < ~var9; ++var9) {
                        int var10 = (var4[var9] * 255 & 1047549) >> 12;
                        int var11 = var5[var9] * this.field3487 >> 12;
                        int var12 = class713.field10336[var10] * var11 >> 12;
                        int var13 = class100.field1109[var10] * var11 >> 12;
                        int var14 = class3.field28 & var9 - -(var12 >> 12);
                        int var15 = class484.field6992 & arg0 - -(var13 >> 12);
                        int[][] var16 = this.method1853(0, 0, var15);
                        var6[var9] = var16[0][var14];
                        var7[var9] = var16[1][var14];
                        var8[var9] = var16[2][var14];
                    }
                }
                return var3;
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field3490[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "()V", line = 127)
    public class229() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BILib;)V", line = 133)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 < 67) {
                this.field3487 = 60;
            }
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    super.field3235 = ~arg2.method1455((byte) 62) == -2;
                }
            } else {
                this.field3487 = arg2.method1445((byte) 115) << 4;
            }
            ++field3485;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3490[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3490[0] : field3490[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1967(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1968(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
