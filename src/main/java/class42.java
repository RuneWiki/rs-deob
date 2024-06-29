import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class42 extends class64 {

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private final int field775;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    private final int field769;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    private final int field776;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    private final int field781;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private final int field768;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    private final int field771;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    private final int field777;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    private final int field773;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lpe;")
    public static class100 field779 = new class100(500);

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= 0 && ~arg6 <= -1 && arg4 < 103 && arg6 < 103) {
            if (arg7 == 0) {
                class55 var8 = class104.method790(arg1, arg4, arg6);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field982 >>> 32);
                    if (arg2 != 2) {
                        var8.field993 = new class256(var9, arg2, arg3, arg1, arg4, arg6, arg5, false, var8.field993);
                    } else {
                        var8.field993 = new class256(var9, 2, 4 - -arg3, arg1, arg4, arg6, arg5, false, var8.field993);
                        var8.field984 = new class256(var9, 2, arg3 + 1 & 3, arg1, arg4, arg6, arg5, false, var8.field984);
                    }
                }
            }
            if (~arg7 == -2) {
                class139 var10 = class64.method499(arg1, arg4, arg6);
                if (var10 != null) {
                    int var11 = (int) (var10.field2425 >>> 32) & Integer.MAX_VALUE;
                    if (arg2 != 4 && arg2 != 5) {
                        if (~arg2 != -7) {
                            if (arg2 != 7) {
                                if (arg2 == 8) {
                                    var10.field2415 = new class256(var11, 4, arg3 - -4, arg1, arg4, arg6, arg5, false, var10.field2415);
                                    var10.field2424 = new class256(var11, 4, (3 & arg3 + 2) + 4, arg1, arg4, arg6, arg5, false, var10.field2424);
                                }
                            } else {
                                var10.field2415 = new class256(var11, 4, (3 & arg3 + 2) + 4, arg1, arg4, arg6, arg5, false, var10.field2415);
                            }
                        } else {
                            var10.field2415 = new class256(var11, 4, arg3 - -4, arg1, arg4, arg6, arg5, false, var10.field2415);
                        }
                    } else {
                        var10.field2415 = new class256(var11, 4, arg3, arg1, arg4, arg6, arg5, false, var10.field2415);
                    }
                }
            }
            if (arg7 == 2) {
                if (~arg2 == -12) {
                    arg2 = 10;
                }
                class106 var12 = class260.method1749(arg1, arg4, arg6);
                if (var12 != null) {
                    var12.field1901 = new class256(Integer.MAX_VALUE & (int) (var12.field1905 >>> 32), arg2, arg3, arg1, arg4, arg6, arg5, false, var12.field1901);
                }
            }
            if (~arg7 == -4) {
                class102 var13 = class137.method950(arg1, arg4, arg6);
                if (var13 != null) {
                    var13.field1870 = new class256((int) (var13.field1868 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg1, arg4, arg6, arg5, false, var13.field1870);
                }
            }
        }
        int var14 = -3 / ((arg0 - -26) / 46);
        ++field774;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
    public final void method276(int arg0, byte arg1, int arg2) {
        ++field778;
        int var4 = 46 / ((arg1 - -70) / 37);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field775 = arg5;
        this.field769 = arg3;
        this.field776 = arg2;
        this.field781 = arg4;
        this.field768 = arg0;
        this.field771 = arg6;
        this.field777 = arg7;
        this.field773 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        if (arg1 >= 52) {
            ++field772;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method317(int arg0) {
        field779 = null;
        if (arg0 != 1743168352) {
            method317(-97);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        ++field770;
        int var4 = this.field768 * arg1 >> 12;
        int var5 = this.field773 * arg0 >> 12;
        int var6 = this.field769 * arg0 >> 12;
        int var7 = this.field781 * arg1 >> 12;
        int var8 = -80 % ((arg2 - -5) / 54);
        int var9 = this.field776 * arg1 >> 12;
        int var10 = this.field775 * arg0 >> 12;
        int var11 = this.field771 * arg1 >> 12;
        int var12 = this.field777 * arg0 >> 12;
        class164.method1144(var5, var9, var7, var12, var11, 130928, var10, var6, super.field1219, var4);
    }
}
