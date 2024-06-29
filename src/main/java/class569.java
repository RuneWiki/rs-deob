import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class569 extends class619 {

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
    public int field7936;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
    public int field7939;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    public int field7934;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
    public int field7938;

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
    public int field7940;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    public int field7935;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "Lmq;")
    public static class78 field7937 = new class78(2, 6);

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "Lmq;")
    public static class78 field7942 = new class78(19, -1);

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "()V", line = 4)
    public static final void method3202() {
        if (class93.field1177 != null) {
            for (int var0 = 0; var0 < class93.field1177.length; var0++) {
                for (int var1 = 0; var1 < class90.field1142; var1++) {
                    for (int var2 = 0; var2 < class665.field9107; var2++) {
                        if (class93.field1177[var0][var1][var2] != null) {
                            class93.field1177[var0][var1][var2].method537(7);
                        }
                        class93.field1177[var0][var1][var2] = null;
                    }
                }
            }
        }
        class93.field1177 = null;
        class716.field10106 = null;
        if (class618.field8658 != null) {
            for (int var3 = 0; var3 < class618.field8658.length; var3++) {
                for (int var4 = 0; var4 < class90.field1142; var4++) {
                    for (int var5 = 0; var5 < class665.field9107; var5++) {
                        if (class618.field8658[var3][var4][var5] != null) {
                            class618.field8658[var3][var4][var5].method537(9);
                        }
                        class618.field8658[var3][var4][var5] = null;
                    }
                }
            }
        }
        class618.field8658 = null;
        class109.field1341 = null;
        class495.field7002 = null;
        class517.field7282 = null;
        class376.field5266 = null;
        class160.field2047 = null;
        class582.field8081 = null;
        class228.field2986 = null;
        class49.field722 = null;
        class177.method1089(-109);
        if (class102.field1257 != null) {
            for (int var6 = 0; var6 < class618.field8661; var6++) {
                class102.field1257[var6] = null;
            }
            class618.field8661 = 0;
        }
        class684.field9445 = null;
        class466.field6722 = null;
        class293.field3797 = null;
        if (class357.field4782 != null) {
            for (int var7 = 0; var7 < class357.field4782.length; var7++) {
                class357.field4782[var7] = null;
            }
            class141.field1675 = 0;
        }
        if (class303.field3902 != null) {
            for (int var8 = 0; var8 < class303.field3902.length; var8++) {
                class303.field3902[var8] = null;
            }
            class400.field5553 = 0;
        }
        if (class708.field9968 != null) {
            for (int var9 = 0; var9 < class150.field1824; var9++) {
                class708.field9968[var9] = null;
            }
            for (int var10 = 0; var10 < class126.field1511; var10++) {
                for (int var11 = 0; var11 < class90.field1142; var11++) {
                    for (int var12 = 0; var12 < class665.field9107; var12++) {
                        class374.field5261[var10][var11][var12] = 0L;
                    }
                }
            }
            class150.field1824 = 0;
        }
        class49.method398(2);
        class469.field6740 = class469.field6743;
        class469.field6740.method3381(2);
        class84.field1088 = null;
        class224.field2949 = null;
        class340.field4391 = null;
        if (class573.field7997 != null) {
            class395.method2357();
            class618.field8660.method124(1);
            class618.field8660.method112(0);
        }
        if (class317.field4078 != null) {
            class317.field4078 = null;
        }
        class618.field8660 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)Lqi;", line = 179)
    public class669 method271(boolean arg0) {
        field7941++;
        return arg0 ? null : class567.field7916;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 194)
    public static void method3203(int arg0) {
        field7942 = null;
        if (arg0 <= 47) {
            field7942 = null;
        }
        field7937 = null;
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lgq;Lkfa;IIIIIIIIIIIII)V", line = 205)
    public class569(class761 arg0, class407 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7936 = arg13;
        this.field7939 = arg9;
        this.field7934 = arg11;
        this.field7938 = arg14;
        this.field7940 = arg12;
        this.field7935 = arg10;
    }
}
