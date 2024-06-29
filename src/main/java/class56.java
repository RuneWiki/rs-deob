import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class56 extends class756 {

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field611 = new String[] { method420(method419("\\v&P\u0007\u0015")), method420(method419("F=iP;")), method420(method419("\\v&P\u0005\u0015")), method420(method419("Sf+\u0012")), method420(method419("\\v&P\u0002\u0015")), method420(method419("\\v&P\u0004\u0015")) };

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lkp;I)V")
    public final void method41(class514 arg0, int arg1) {
        try {
            arg0.method3887(this.field609, this.field605, this.field604, 90, this.field603);
            field608++;
            if (arg1 != 9893) {
                this.field604 = -81;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field611[2] + (arg0 == null ? field611[3] : field611[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)Z")
    public static final boolean method417(int arg0, int arg1, int arg2) {
        try {
            field606++;
            if (arg1 != 1) {
                method418(-13, -59, -81, -31);
            }
            return (arg2 & 0x20) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field611[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)Z")
    public static final boolean method418(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 < 108) {
                method417(50, 70, -92);
            }
            field610++;
            if (!class64.field658 || !class16.field197) {
                return false;
            } else if (class73.field850 < 100) {
                return false;
            } else {
                int var4 = class80.field902[arg1][arg3][arg0];
                if ((-class178.field2481) == var4) {
                    return false;
                } else if (class178.field2481 == var4) {
                    return true;
                } else if (class555.field8261 == class195.field2617) {
                    return false;
                } else {
                    int var5 = arg3 << class602.field8828;
                    int var6 = arg0 << class602.field8828;
                    if (class351.method2882(121, var6 + class358.field5488 - 1, var6 - -1, class555.field8261[arg1].method2407(arg0 + 1, arg3 + 1, 41), var5 + class358.field5488 - 1, var5 + 1, var5 + 1, class555.field8261[arg1].method2407(arg0, arg3, 106), class555.field8261[arg1].method2407(arg0 + 1, arg3, 84), class358.field5488 + var6 - 1) && class351.method2882(116, class358.field5488 + var6 - 1, var6 + 1, class555.field8261[arg1].method2407(arg0, arg3 + 1, -92), var5 - (1 - class358.field5488), var5 - -class358.field5488 + -1, var5 + 1, class555.field8261[arg1].method2407(arg0, arg3, -115), class555.field8261[arg1].method2407(arg0 + 1, arg3 + 1, -116), var6 + 1)) {
                        class673.field9770++;
                        class80.field902[arg1][arg3][arg0] = class178.field2481;
                        return true;
                    } else {
                        class80.field902[arg1][arg3][arg0] = -class178.field2481;
                        return false;
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field611[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BLib;)V")
    public final void method38(byte arg0, class163 arg1) {
        try {
            if (arg0 <= 32) {
                this.field604 = -124;
            }
            field607++;
            this.field603 = arg1.method1453((byte) 88);
            this.field609 = arg1.method1453((byte) 82);
            this.field605 = arg1.method1455((byte) 62);
            this.field604 = arg1.method1455((byte) 62);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field611[5] + arg0 + ',' + (arg1 == null ? field611[3] : field611[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method419(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method420(char[] arg0) {
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
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 71;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
