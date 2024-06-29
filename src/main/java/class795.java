import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class795 extends class237 {

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field11626 = new String[] { method5713(method5712(")0\u001aq\u000f")), method5713(method5712(")0\u001az\u000f")), method5713(method5712(")0\u001ax\u000f")), method5713(method5712(")0\u001a}\u000f")), method5713(method5712(")0\u001a~\u000f")), method5713(method5712(")0\u001ar\u000f")), method5713(method5712("*6XW")), method5713(method5712("7&@ON*$G\u0006")), method5713(method5712(")0\u001as\u000f")), method5713(method5712("',[PN!3F^A-;")), method5713(method5712("\u007fcqCW-1QH\u001a\u0010+A\u0017\u0007tr\u0019qF*n\u0005\u0002\u0010tc\u0004\u000b\u001dts\u000e\u000b\u0017d\u0004yo\u001cd\u000eUC\n\u0005$Q\u0006\u0017")), method5713(method5712("',[PN!+[HS")), method5713(method5712("\u007fcqCW-1QH\u001a")), method5713(method5712(" ,WNJ!-@\u0015D+,_RBya")), method5713(method5712("\u007fcB^U7*[U\u001aux\u0014KF0+\t\u0014\u001cd'[VF--\t")), method5713(method5712("?m\u001a\u0015Z")), method5713(method5712("\u007fcyZ_i\u0002S^\u001a")) };

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "Lhd;")
    public static class776 field11617 = new class776();

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
    public static int field11622 = 0;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field11624 = 0;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    public static int field11610;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
    public static int field11612;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field11614;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field11619;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
    public static int field11620;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field11621;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "Lhk;")
    private class107 field11611;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "Lhk;")
    private class107 field11613;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "Lhk;")
    private class107 field11615;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "Lhk;")
    public class107 field11616;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "Lhk;")
    private class107 field11618;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lhk;")
    private class107 field11625;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "Ltda;")
    public static class666 field11623;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V", line = 3)
    public final void method459(byte arg0) {
        try {
            ++field11620;
            super.method459(arg0);
            class282 var2 = (class282) super.field3648;
            this.field11616 = class326.method2770(32428, super.field3645, var2.field4587);
            this.field11615 = class326.method2770(32428, super.field3645, var2.field4580);
            this.field11611 = class326.method2770(32428, super.field3645, var2.field4585);
            this.field11613 = class326.method2770(32428, super.field3645, var2.field4584);
            this.field11625 = class326.method2770(32428, super.field3645, var2.field4581);
            this.field11618 = class326.method2770(arg0 + 32441, super.field3645, var2.field4586);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11626[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/lang/String;)V", line = 19)
    public static final void method5710(byte arg0, String arg1) {
        try {
            class431.field6777 = arg1;
            ++field11612;
            if (arg0 != -35) {
                method5711(32);
            }
            if (class476.field7255 != null) {
                try {
                    String var2 = class476.field7255.getParameter(field11626[9]);
                    String var3 = class476.field7255.getParameter(field11626[11]);
                    String var4 = var2 + field11626[7] + arg1 + field11626[14] + var3;
                    String var5;
                    if (arg1.length() == 0) {
                        var5 = var4 + field11626[10];
                    } else {
                        var5 = var4 + field11626[12] + class187.method1752(arg0 ^ -96, 94608000000L + class712.method5167(-2334)) + field11626[16] + 94608000L;
                    }
                    class470.method3618(field11626[13] + var5 + "\"", arg0 + 14903, class476.field7255);
                } catch (Throwable var7) {
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11626[8] + arg0 + ',' + (arg1 != null ? field11626[15] : field11626[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIZ)V", line = 53)
    public final void method460(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            if (arg2 < -7) {
                if (arg3) {
                    int[] var5 = new int[4];
                    class662.field9437.method201(var5);
                    class662.field9437.method221(arg0, arg1, arg0 - -super.field3648.field1869, super.field3648.field1862 + arg1);
                    int var6 = this.field11611.method26();
                    int var7 = this.field11611.method12();
                    int var8 = this.field11613.method26();
                    int var9 = this.field11613.method12();
                    this.field11611.method1001(arg0, (-var7 + super.field3648.field1862) / 2 + arg1);
                    this.field11613.method1001(-var8 + arg0 + super.field3648.field1869, (super.field3648.field1862 - var9) / 2 + arg1);
                    class662.field9437.method221(arg0, arg1, super.field3648.field1869 + arg0, this.field11625.method12() + arg1);
                    this.field11625.method1002(arg0 + var6, arg1, -var6 + -var8 + super.field3648.field1869, super.field3648.field1862);
                    int var10 = this.field11618.method12();
                    class662.field9437.method221(arg0, -var10 + arg1 + super.field3648.field1862, super.field3648.field1869 + arg0, arg1 - -super.field3648.field1862);
                    this.field11618.method1002(arg0 + var6, -var10 + arg1 + super.field3648.field1862, -var6 + super.field3648.field1869 + -var8, super.field3648.field1862);
                    class662.field9437.method221(var5[0], var5[1], var5[2], var5[3]);
                }
                ++field11621;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field11626[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZII)V", line = 92)
    public final void method458(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            ++field11619;
            int var5 = this.field11611.method26() + arg3;
            int var6 = super.field3648.field1869 + arg3 - this.field11613.method26();
            int var7 = this.field11625.method12() + arg0;
            int var8 = super.field3648.field1862 + arg0 - this.field11618.method12();
            int var9 = var6 - var5;
            int var10 = var8 - var7;
            int var11 = var9 * this.method2048(114) / 10000;
            int[] var12 = new int[4];
            class662.field9437.method201(var12);
            class662.field9437.method221(var5, var7, var5 + var11, var8);
            this.method986(var9, var10, var7, var5, (byte) -7);
            class662.field9437.method221(var5 + var11, var7, var6, var8);
            this.field11615.method1002(var5, var7, var9, var10);
            class662.field9437.method221(var12[0], var12[1], var12[arg2], var12[3]);
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field11626[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lgda;Lgda;Lgia;)V", line = 124)
    public class795(class58 arg0, class58 arg1, class282 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 127)
    public static void method5711(int arg0) {
        try {
            field11617 = null;
            if (arg0 == 0) {
                field11623 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11626[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIB)V", line = 139)
    public void method986(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            if (arg4 == -7) {
                this.field11616.method1002(arg3, arg2, arg0, arg1);
                ++field11610;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11626[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)Z", line = 163)
    public final boolean method457(byte arg0) {
        try {
            ++field11614;
            if (!super.method457((byte) 37)) {
                return false;
            } else {
                class282 var2 = (class282) super.field3648;
                if (arg0 < 9) {
                    this.method458(-87, false, -91, 61);
                }
                if (!super.field3645.method595(-2, var2.field4587)) {
                    return false;
                } else if (!super.field3645.method595(-2, var2.field4580)) {
                    return false;
                } else if (!super.field3645.method595(-2, var2.field4585)) {
                    return false;
                } else if (!super.field3645.method595(-2, var2.field4584)) {
                    return false;
                } else if (!super.field3645.method595(-2, var2.field4581)) {
                    return false;
                } else {
                    return super.field3645.method595(-2, var2.field4586);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11626[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5712(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5713(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
