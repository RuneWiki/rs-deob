import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class504 extends class72 {

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lqe;")
    public static class465 field7206 = null;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[Lbk;")
    public static class374[] field7203;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I")
    public final int method3026(int arg0) {
        if (arg0 != 27669) {
            return -87;
        } else {
            ++field7200;
            return super.field1282;
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public static void method3027(int arg0) {
        field7203 = null;
        if (arg0 != -14536) {
            method3027(-72);
        }
        field7206 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ILcq;)V")
    public class504(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 27865) {
            method3027(38);
        }
        ++field7208;
        if (arg5 != 8 && ~arg5 != -17) {
            class416 var7 = class390.field5454[arg0][arg4][arg6];
            if (var7 == null) {
                var7 = new class416(arg0);
            }
            if (~arg5 != -2) {
                if (~arg5 == -3) {
                    var7.field5837 = (short) arg2;
                    var7.field5836 = (short) arg1;
                }
            } else {
                var7.field5839 = (short) arg2;
                var7.field5833 = (short) arg1;
            }
            if (class257.field3726) {
                class80.method786((byte) 45);
            }
        } else if (arg5 == 8) {
            int var8 = arg4 << class440.field6142;
            int var9 = class546.field7701 + var8;
            int var10 = arg6 << class440.field6142;
            int var11 = class546.field7701 + var10;
            int var12 = class173.field2511[arg0].method1825(arg6, arg3 ^ -27815, arg4);
            int var13 = class173.field2511[arg0].method1825(arg6 - -1, -128, arg4 + 1);
            class27.field380[class650.field9180++] = new class433(arg5, arg0, var8, var9, var9, var8, var12, var13, var13 - arg1, -arg1 + var12, var10, var11, var11, var10);
        } else {
            int var14 = (arg4 << class440.field6142) + class546.field7701;
            int var15 = -class546.field7701 + var14;
            int var16 = arg6 << class440.field6142;
            int var17 = class546.field7701 + var16;
            int var18 = class173.field2511[arg0].method1825(arg6, -128, arg4 + 1);
            int var19 = class173.field2511[arg0].method1825(arg6 + 1, -128, arg4);
            class27.field380[class650.field9180++] = new class433(arg5, arg0, var14, var15, var15, var14, var18, var19, -arg1 + var19, -arg1 + var18, var16, var17, var17, var16);
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Z")
    public final boolean method3029(int arg0) {
        if (arg0 <= 97) {
            return false;
        } else {
            ++field7205;
            if (super.field1286.method2818(true)) {
                return false;
            } else {
                return super.field1286.method2815(-93) == class87.field1576;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lcq;)V")
    public class504(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field7207;
        if (arg0 != -3271) {
            field7203 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (super.field1286.method2815(-119) != class87.field1576) {
            super.field1282 = 1;
        } else if (super.field1286.method2818(true)) {
            super.field1282 = 0;
        }
        ++field7204;
        if (arg0 > 30) {
            if (~super.field1282 != -1 && super.field1282 != 1) {
                super.field1282 = this.method60(-3271);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        ++field7202;
        if (arg1 != 3) {
            field7206 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field7201;
        if (super.field1286.method2818(true)) {
            return 3;
        } else if (super.field1286.method2815(-96) == class87.field1576) {
            return 1;
        } else {
            if (arg1 != 11260) {
                field7203 = null;
            }
            return 3;
        }
    }
}
