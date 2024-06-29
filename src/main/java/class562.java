import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class562 extends class42 {

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Leda;")
    public static class116 field8202 = new class116(81, 6);

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIZ)V")
    public final void method342(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8206;
        int var5 = this.method347((byte) 80) * super.field576.field8300 / 10000;
        class637.field9048.method824(arg0, arg1 + 2, var5, super.field576.field8291 + -2, ((class533) super.field576).field7842, 0);
        class637.field9048.method824(arg0 + var5, arg1 + 2, super.field576.field8300 - var5, super.field576.field8291 - 2, arg2, 0);
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public static void method3285(int arg0) {
        if (arg0 < 53) {
            method3287(103, -124);
        }
        field8202 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBIII)V")
    public static final void method3286(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= class627.field8931 && class198.field3084 <= arg3) {
            boolean var6;
            if (~arg1 <= ~class512.field7620) {
                if (arg1 > class94.field1398) {
                    var6 = false;
                    arg1 = class94.field1398;
                } else {
                    var6 = true;
                }
            } else {
                var6 = false;
                arg1 = class512.field7620;
            }
            boolean var7;
            if (class512.field7620 > arg4) {
                var7 = false;
                arg4 = class512.field7620;
            } else if (~class94.field1398 > ~arg4) {
                arg4 = class94.field1398;
                var7 = false;
            } else {
                var7 = true;
            }
            if (~arg5 <= ~class198.field3084) {
                class223.method1484(class657.field9275[arg5++], arg4, -87, arg0, arg1);
            } else {
                arg5 = class198.field3084;
            }
            if (arg3 > class627.field8931) {
                arg3 = class627.field8931;
            } else {
                class223.method1484(class657.field9275[arg3--], arg4, -126, arg0, arg1);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg3; ++var8) {
                    int[] var9 = class657.field9275[var8];
                    var9[arg1] = var9[arg4] = arg0;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg5; var10 <= arg3; ++var10) {
                        class657.field9275[var10][arg4] = arg0;
                    }
                }
            } else {
                for (int var11 = arg5; var11 <= arg3; ++var11) {
                    class657.field9275[var11][arg1] = arg0;
                }
            }
        }
        if (arg2 < 24) {
            method3288((byte) -58, -60, 24);
        }
        ++field8201;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V")
    public static final void method3287(int arg0, int arg1) {
        ++field8205;
        if (arg1 != -4) {
            field8202 = null;
        }
        if (class133.field2155 == 1) {
            class51.field676 = arg0;
        } else {
            if (class133.field2155 == 2 || ~class133.field2155 == -4) {
                class565.field8267 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZI)V")
    public final void method345(int arg0, int arg1, boolean arg2, int arg3) {
        ++field8204;
        class637.field9048.method791(arg3 - 2, arg0, super.field576.field8300 + 4, super.field576.field8291 + 2, ((class533) super.field576).field7845, 0);
        class637.field9048.method791(arg3 + -1, arg0 + 1, super.field576.field8300 + 2, super.field576.field8291, 0, arg1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)Z")
    public static final boolean method3288(byte arg0, int arg1, int arg2) {
        ++field8203;
        int var3 = -97 % ((arg0 - -4) / 53);
        return (arg1 & 32768) != 0;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lvo;Lvo;Lcda;)V")
    public class562(class345 arg0, class345 arg1, class533 arg2) {
        super(arg0, arg1, arg2);
    }
}
