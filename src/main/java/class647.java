import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class647 extends class766 {

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "Lgh;")
    public class506 field9191;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "Lsv;")
    public static class570 field9186 = new class570(78, 4);

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "[I")
    public static int[] field9190;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", line = 4)
    public static final void method3660(String arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6, int arg7, int arg8) {
        field9187++;
        class183 var9 = class599.field8550[99];
        for (int var10 = arg8; var10 > 0; var10--) {
            class599.field8550[var10] = class599.field8550[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class183(arg1, arg7, arg0, arg6, arg4, arg2, arg5, arg3);
        } else {
            var9.method1325(arg0, arg2, ~arg8, arg5, arg6, arg7, arg1, arg3, arg4);
        }
        class329.field4685 = class745.field10359;
        class599.field8550[0] = var9;
        class265.field3732++;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 31)
    public static final void method3661(byte arg0) {
        field9188++;
        class131.field2218 = 0;
        class169.field2558 = 0;
        class464.field6304 = 0;
        class711.field9936 = 0;
        if (arg0 != 50) {
            field9190 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V", line = 49)
    public static void method3662(int arg0) {
        if (arg0 != 0) {
            field9186 = null;
        }
        field9186 = null;
        field9190 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "()V", line = 61)
    public static final void method3663() {
        if (class723.field10084 != null) {
            for (int var0 = 0; var0 < class723.field10084.length; var0++) {
                for (int var1 = 0; var1 < class42.field520; var1++) {
                    for (int var2 = 0; var2 < class681.field9665; var2++) {
                        if (class723.field10084[var0][var1][var2] != null) {
                            class723.field10084[var0][var1][var2].method1270(-17104);
                        }
                        class723.field10084[var0][var1][var2] = null;
                    }
                }
            }
        }
        class723.field10084 = null;
        class495.field6799 = null;
        if (class410.field5618 != null) {
            for (int var3 = 0; var3 < class410.field5618.length; var3++) {
                for (int var4 = 0; var4 < class42.field520; var4++) {
                    for (int var5 = 0; var5 < class681.field9665; var5++) {
                        if (class410.field5618[var3][var4][var5] != null) {
                            class410.field5618[var3][var4][var5].method1270(-17104);
                        }
                        class410.field5618[var3][var4][var5] = null;
                    }
                }
            }
        }
        class410.field5618 = null;
        class454.field6207 = null;
        class514.field7096 = null;
        class678.field9594 = null;
        class737.field10233 = null;
        client.field1581 = null;
        class789.field10793 = null;
        class542.field7502 = null;
        class568.field7902 = null;
        class254.method1676((byte) -112);
        if (class316.field4516 != null) {
            for (int var6 = 0; var6 < class401.field5525; var6++) {
                class316.field4516[var6] = null;
            }
            class401.field5525 = 0;
        }
        class5.field74 = null;
        class277.field3997 = null;
        class407.field5602 = null;
        if (class269.field3800 != null) {
            for (int var7 = 0; var7 < class269.field3800.length; var7++) {
                class269.field3800[var7] = null;
            }
            class761.field10539 = 0;
        }
        if (class477.field6498 != null) {
            for (int var8 = 0; var8 < class477.field6498.length; var8++) {
                class477.field6498[var8] = null;
            }
            class502.field6879 = 0;
        }
        if (class208.field3032 != null) {
            for (int var9 = 0; var9 < class774.field10661; var9++) {
                class208.field3032[var9] = null;
            }
            for (int var10 = 0; var10 < class169.field2565; var10++) {
                for (int var11 = 0; var11 < class42.field520; var11++) {
                    for (int var12 = 0; var12 < class681.field9665; var12++) {
                        class293.field4281[var10][var11][var12] = 0L;
                    }
                }
            }
            class774.field10661 = 0;
        }
        class446.method2644(0);
        class316.field4495 = class316.field4508;
        class316.field4495.method4018((byte) 118);
        class97.field1386 = null;
        class510.field7018 = null;
        class722.field10080 = null;
        if (class495.field6792 != null) {
            class577.method3400();
            class29.field307.method499(1);
            class29.field307.method430(0);
        }
        if (class604.field8584 != null) {
            class604.field8584 = null;
        }
        class29.field307 = null;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lgh;)V", line = 231)
    public class647(class506 arg0) {
        this.field9191 = arg0;
    }
}
