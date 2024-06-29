import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class135 {

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
    public boolean field2055 = true;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2048 = 0;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Ljd;")
    public static class95 field2050;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1034(boolean arg0) {
        if (arg0) {
            field2048 = -48;
        }
        field2050 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIBII)V", line = 17)
    public static final void method1035(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2049++;
        int var6 = arg0 - arg1;
        int var7 = arg5 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class97.method726(arg2, arg0, arg4, true, arg1);
            }
        } else if (var6 == 0) {
            class305.method2092(arg2, arg5, arg1, true, arg4);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                arg2 = arg1;
                arg1 = var9;
                int var10 = arg5;
                arg5 = arg0;
                arg0 = var10;
            }
            if (arg5 < arg2) {
                int var11 = arg2;
                arg2 = arg5;
                arg5 = var11;
                int var12 = arg1;
                arg1 = arg0;
                arg0 = var12;
            }
            int var13 = arg1;
            int var14 = arg5 - arg2;
            if (arg3 >= 24) {
                int var15 = arg0 - arg1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var16 = arg1 >= arg0 ? -1 : 1;
                int var17 = -(var14 >> 1);
                if (var8) {
                    for (int var19 = arg2; var19 <= arg5; var19++) {
                        var17 += var15;
                        class79.field1178[var19][var13] = arg4;
                        if (var17 > 0) {
                            var13 += var16;
                            var17 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg2; var18 <= arg5; var18++) {
                        class79.field1178[var13][var18] = arg4;
                        var17 += var15;
                        if (var17 > 0) {
                            var13 += var16;
                            var17 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIZ)V", line = 154)
    public class135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2051 = arg5;
        this.field2047 = arg4;
        this.field2054 = arg2;
        this.field2044 = arg0;
        this.field2046 = arg3;
        this.field2045 = arg1;
        this.field2055 = arg6;
    }
}
