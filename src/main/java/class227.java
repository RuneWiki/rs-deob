import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class227 extends class232 {

    @OriginalMember(owner = "client!cha", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field3553 = new String[] { method1993(method1992("/|G@td")), method1993(method1992("/|G@~d")), method1993(method1992("/|G@vd")), method1993(method1992("/|G@sd")) };

    @OriginalMember(owner = "client!cha", name = "L", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!cha", name = "K", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!cha", name = "J", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!cha", name = "I", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!cha", name = "M", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!cha", name = "H", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!cha", name = "G", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "(I)V")
    public static final void method1989(int arg0) {
        try {
            ++field3548;
            class527 var1 = null;
            try {
                var1 = class61.method631("2", arg0 + -492929200);
                class176 var2 = new class176(class240.field3704 * 6 + 3);
                var2.method1678(1, arg0 ^ 65280);
                var2.method1650((byte) -95, class240.field3704);
                for (int var3 = arg0; ~var3 > ~class380.field6121.length; ++var3) {
                    if (class335.field5467[var3]) {
                        var2.method1650((byte) -95, var3);
                        var2.method1641((byte) -108, class380.field6121[var3]);
                    }
                }
                var1.method3941(-1, var2.field2799, 0, var2.field2805);
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method3940(1);
                }
            } catch (Exception var5) {
            }
            class691.field9961 = class712.method5167(-2334);
            class542.field7987 = false;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3553[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(CB)Z")
    public static final boolean method1990(char arg0, byte arg1) {
        try {
            if (arg1 < 91) {
                field3551 = -37;
            }
            ++field3547;
            if (Character.isISOControl(arg0)) {
                return false;
            } else if (class789.method5668((byte) 118, arg0)) {
                return true;
            } else {
                char[] var2 = class120.field1733;
                for (int var3 = 0; var2.length > var3; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
                char[] var5 = class745.field10965;
                for (int var6 = 0; ~var6 > ~var5.length; ++var6) {
                    char var7 = var5[var6];
                    if (arg0 == var7) {
                        return true;
                    }
                }
                return false;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3553[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BI)V")
    public static final void method1991(byte arg0, int arg1) {
        try {
            if (arg0 > -103) {
                field3551 = -61;
            }
            ++field3549;
            if (!class79.field1220 || class690.field9953.length < arg1) {
                class690.field9953 = new class356[arg1];
                class734.field10758 = new int[arg1];
                class231.field3583 = new int[arg1];
                class15.field165 = new class356[arg1];
                class154.field2141 = new class210[arg1];
                class395.field6275 = new int[arg1];
                class152.field2130 = new int[arg1];
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3553[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field3552;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int[][] var4 = this.method2023((byte) 95, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class449.field6969 > var8; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
                }
            }
            if (arg1 != 123) {
                field3551 = 62;
            }
            return var3;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3553[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1992(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1993(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
