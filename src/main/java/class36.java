import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 extends class211 {

    @OriginalMember(owner = "client!tfa", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field416 = new String[] { method240(method239("A)l\u000e#\u001d")), method240(method239("A)l\u000e\"\u001d")), method240(method239("A)l\u000e \u001d")), method240(method239("[:aL")), method240(method239("A)l\u000e'\u001d")), method240(method239("Na#\u000e\u001b")), method240(method239("A)l\u000e$\u001d")), method240(method239("A)l\u000e%\u001d")), method240(method239("A)l\u000e/\u001d")) };

    @OriginalMember(owner = "client!tfa", name = "N", descriptor = "Lel;")
    public static class573 field408 = new class573(0, 6);

    @OriginalMember(owner = "client!tfa", name = "F", descriptor = "Lwia;")
    public static class790 field412 = new class790(24, 3);

    @OriginalMember(owner = "client!tfa", name = "G", descriptor = "[[I")
    public static int[][] field415 = new int[128][128];

    @OriginalMember(owner = "client!tfa", name = "L", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!tfa", name = "E", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!tfa", name = "M", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!tfa", name = "J", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!tfa", name = "K", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!tfa", name = "C", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!tfa", name = "D", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!tfa", name = "H", descriptor = "[Ljr;")
    private class122[] field413;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BILib;)V", line = 6)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 > 67) {
                if (~arg1 != -1) {
                    if (arg1 == 1) {
                        super.field3235 = arg2.method1455((byte) 62) == 1;
                    }
                } else {
                    this.field413 = new class122[arg2.method1455((byte) 62)];
                    for (int var4 = 0; var4 < this.field413.length; ++var4) {
                        int var5 = arg2.method1455((byte) 62);
                        if (~var5 != -1) {
                            if (~var5 != -2) {
                                if (var5 != 2) {
                                    if (var5 == 3) {
                                        this.field413[var4] = class353.method2895(-103, arg2);
                                    }
                                } else {
                                    this.field413[var4] = class353.method2893(111, arg2);
                                }
                            } else {
                                this.field413[var4] = class203.method1805(-91, arg2);
                            }
                        } else {
                            this.field413[var4] = class661.method4851(false, arg2);
                        }
                    }
                }
                ++field406;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field416[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field416[5] : field416[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)[[I", line = 82)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field407;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int var4 = class343.field5332;
                int var5 = class463.field6744;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field3230.method5459((byte) -34);
                this.method236(2134, var6);
                for (int var8 = 0; ~var8 > ~class463.field6744; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; var14 < class343.field5332; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class291.method2359(var15 << 4, 4080);
                        var12[var14] = class291.method2359(var15 >> 4, 4080);
                        var11[var14] = class291.method2359(var15, 16711680) >> 12;
                    }
                }
            }
            if (arg1 >= -38) {
                field408 = null;
            }
            return var3;
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field416[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)I", line = 144)
    public static final int method235(int arg0) {
        try {
            ++field414;
            class178 var1 = class514.field7406;
            synchronized (class514.field7406) {
                if (arg0 != 0) {
                    method237((byte) 38);
                }
                return class514.field7406.method1564(true);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field416[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I[[I)V", line = 157)
    private final void method236(int arg0, int[][] arg1) {
        try {
            ++field410;
            int var3 = class343.field5332;
            int var4 = class463.field6744;
            class379.method3050(-11858, arg1);
            class253.method2145((byte) 77, 0, class3.field28, class484.field6992, 0);
            if (arg0 != 2134) {
                field415 = null;
            }
            if (this.field413 != null) {
                for (int var5 = 0; ~this.field413.length < ~var5; ++var5) {
                    class122 var6 = this.field413[var5];
                    int var7 = var6.field1437;
                    int var8 = var6.field1434;
                    if (var7 >= 0) {
                        if (~var8 > -1) {
                            var6.method1061(false, var3, var4);
                        } else {
                            var6.method1062(120, var4, var3);
                        }
                    } else if (var8 >= 0) {
                        var6.method1056(var4, var3, (byte) 83);
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field416[4] + arg0 + ',' + (arg1 != null ? field416[5] : field416[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)V", line = 210)
    public static void method237(byte arg0) {
        try {
            if (arg0 != 101) {
                method235(-128);
            }
            field408 = null;
            field415 = null;
            field412 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field416[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "()V", line = 223)
    public class36() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(III)Z", line = 226)
    public static final boolean method238(int arg0, int arg1, int arg2) {
        try {
            ++field411;
            if (arg1 != -1532432668) {
                return false;
            } else {
                return ~(arg0 & 384) != -1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field416[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)[I", line = 252)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field405;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                this.method236(2134, super.field3231.method32(-13509));
            }
            if (arg0 != 8217) {
                this.field413 = null;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field416[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method239(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 102);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method240(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
