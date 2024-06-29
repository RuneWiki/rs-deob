import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class651 {

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9255 = new String[] { method4741(method4740("\rip\t6S")), method4741(method4740("\u0000,pq\n")), method4741(method4740("\u0015w23")), method4741(method4740("\rip\b6S")), method4741(method4740("\rip\n6S")), method4741(method4740("\rip\u001e5S")) };

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "J")
    public static long field9252 = 20000000L;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lft;")
    public static class188 field9249;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lvk;")
    public class651 field9248;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lvk;")
    public class651 field9253;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
    public final void method4736(int arg0) {
        try {
            field9246++;
            if (arg0 == 0 && this.field9253 != null) {
                this.field9253.field9248 = this.field9248;
                this.field9248.field9253 = this.field9253;
                this.field9253 = null;
                this.field9248 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9255[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BZI)I")
    public static final int method4737(byte[] arg0, boolean arg1, int arg2) {
        try {
            field9254++;
            if (!arg1) {
                method4737(null, false, -33);
            }
            return class222.method1862((byte) 108, arg2, arg0, 0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9255[5] + (arg0 == null ? field9255[2] : field9255[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
    public static void method4738(int arg0) {
        try {
            if (arg0 == 3) {
                field9249 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9255[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(ILha;)V")
    public static final void method4739(int arg0, class18 arg1) {
        try {
            field9250++;
            int var2 = 0;
            int var3 = 0;
            if (class212.field3119) {
                var2 = class784.method5647((byte) 105);
                var3 = class30.method328(-17233);
            }
            int var4 = class637.field9012 + var2;
            int var5 = class433.field6281 + var3;
            int var6 = class525.field7646;
            int var7 = class118.field1499 - 3;
            byte var8 = 20;
            class360.method2875(class537.field7854.method4068((byte) -102, class405.field5883), class525.field7646, class433.field6281 + var3, var8, arg1, class637.field9012 + var2, (byte) -35, class118.field1499);
            int var9 = var2 + class604.field8668.method2881((byte) 121);
            if (arg0 == 16) {
                int var10 = var3 + class604.field8668.method2879(-237);
                if (class493.field7252) {
                    int var11 = 0;
                    for (class801 var12 = (class801) class520.field7588.method3932((byte) -112); var12 != null; var12 = (class801) class520.field7588.method3939((byte) -75)) {
                        int var13 = var5 + var8 + var11 * 16 + 13;
                        if (class637.field9012 + var2 < var9 && var9 < (class525.field7646 + var2 + class637.field9012) && (var13 - 13) < var10 && var10 < (var13 + 4) && (var12.field11653 > 1 || ((class228) var12.field11651.field7555.field9626).field3295)) {
                            arg1.method237(class637.field9012 + var2, var13 + -12, class525.field7646, 16, 255 - class751.field10696 << 24 | class72.field1050, 1);
                        }
                        var11++;
                    }
                    if (class582.field8406 != null) {
                        class360.method2875(class582.field8406.field11650, class435.field6411, class238.field3444, var8, arg1, class647.field9199, (byte) -35, class707.field9883);
                        int var14 = 0;
                        for (class228 var15 = (class228) class582.field8406.field11651.method3932((byte) -28); var15 != null; var15 = (class228) class582.field8406.field11651.method3939((byte) -75)) {
                            int var16 = var14 * 16 + class238.field3444 + var8 + 13;
                            var14++;
                            if (var9 > class647.field9199 && class647.field9199 + class435.field6411 > var9 && var10 > (var16 - 13) && var16 + 4 > var10 && var15.field3295) {
                                arg1.method237(class647.field9199, var16 - 12, class435.field6411, 16, class72.field1050 | 255 - class751.field10696 << 24, 1);
                            }
                        }
                        class398.method3117(class435.field6411, class647.field9199, arg1, var8, class707.field9883, class238.field3444, (byte) -114);
                    }
                } else {
                    int var17 = 0;
                    for (class228 var18 = (class228) class45.field644.method3977((byte) -128); var18 != null; var18 = (class228) class45.field644.method3987(arg0 - 16)) {
                        int var19 = (class72.field1049 - var17 - 1) * 16 + (var5 + var8 + 13);
                        var17++;
                        if ((class637.field9012 + var2) < var9 && var9 < class525.field7646 + var2 + class637.field9012 && var10 > (var19 - 13) && var10 < var19 + 4 && var18.field3295) {
                            arg1.method237(class637.field9012 + var2, var19 + -12, class525.field7646, 16, 255 - class751.field10696 << 24 | class72.field1050, 1);
                        }
                    }
                }
                class398.method3117(class525.field7646, class637.field9012 + var2, arg1, var8, class118.field1499, class433.field6281 + var3, (byte) 5);
                if (class493.field7252) {
                    int var23 = 0;
                    for (class801 var24 = (class801) class520.field7588.method3932((byte) -115); var24 != null; var24 = (class801) class520.field7588.method3939((byte) -75)) {
                        int var25 = var23 * 16 + class433.field6281 + var8 + var3 + 13;
                        var23++;
                        if (var24.field11653 == 1) {
                            class278.method2266(var25, var10, class433.field6281 + var3, class118.field1499, var9, (class228) var24.field11651.field7555.field9626, class581.field8396 | 0xFF000000, 0, class210.field3061 | 0xFF000000, class525.field7646, arg1, class637.field9012 + var2);
                        } else {
                            class344.method2762(var9, class118.field1499, var25, var24, var10, class637.field9012 + var2, class581.field8396 | 0xFF000000, class525.field7646, arg1, (byte) 40, class433.field6281 + var3, class210.field3061 | 0xFF000000);
                        }
                    }
                    if (class582.field8406 != null) {
                        int var26 = 0;
                        for (class228 var27 = (class228) class582.field8406.field11651.method3932((byte) -21); var27 != null; var27 = (class228) class582.field8406.field11651.method3939((byte) -75)) {
                            int var28 = class238.field3444 + var8 + (13 - -(var26 * 16));
                            var26++;
                            class278.method2266(var28, var10, class238.field3444, class707.field9883, var9, var27, class581.field8396 | 0xFF000000, 0, class210.field3061 | 0xFF000000, class435.field6411, arg1, class647.field9199);
                        }
                        class26.method299(arg0 - 14625, class435.field6411, class238.field3444, class707.field9883, class647.field9199);
                    }
                } else {
                    int var20 = 0;
                    for (class228 var21 = (class228) class45.field644.method3977((byte) -52); var21 != null; var21 = (class228) class45.field644.method3987(arg0 ^ 0x10)) {
                        int var22 = (class72.field1049 - var20 - 1) * 16 + var8 + var5 + 13;
                        class278.method2266(var22, var10, var5, var7, var9, var21, class581.field8396 | 0xFF000000, 0, class210.field3061 | 0xFF000000, var6, arg1, var4);
                        var20++;
                    }
                }
                class26.method299(-14609, class525.field7646, class433.field6281 + var3, class118.field1499, class637.field9012 + var2);
            }
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field9255[3] + arg0 + ',' + (arg1 == null ? field9255[2] : field9255[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4740(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4741(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
