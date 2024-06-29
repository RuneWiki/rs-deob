import jaclib.memory.Buffer;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class604 extends class671 implements class212 {

    @OriginalMember(owner = "client!sw", name = "G", descriptor = "Lkf;")
    private class720 field8634;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "[I")
    public static int[] field8628 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!sw", name = "F", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!sw", name = "H", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!sw", name = "I", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!sw", name = "J", descriptor = "Lwu;")
    public static class557 field8637;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sw", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field8638;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "[I")
    public static int[] field8630;

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "[Lcw;")
    public static class21[] field8629;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
    public final void method1398(boolean arg0) {
        super.method1398(arg0);
        ++field8633;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(Z)I")
    public final int method1683(boolean arg0) {
        ++field8631;
        if (arg0) {
            this.method1399(0, true);
        }
        return super.method1683(false);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
    public static final void method3541(File arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            field8637 = null;
        }
        class408.field5664.put(arg1, arg0);
        ++field8626;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V")
    public static void method3542(byte arg0) {
        field8630 = null;
        field8629 = null;
        if (arg0 == 29) {
            field8637 = null;
            field8628 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(Z)Z")
    public final boolean method1400(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field8636;
            return super.method3838(super.field9448.field1354, true);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method1401(boolean arg0, int arg1) {
        if (arg1 < 16) {
            return null;
        } else {
            ++field8625;
            return super.method3844(super.field9448.field1354, 102, arg0);
        }
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lsb;Lkf;Z)V")
    public class604(class93 arg0, class720 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field8634 = arg1;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZ)V")
    public final void method1399(int arg0, boolean arg1) {
        super.method1399(this.field8634.field10158 * arg0, arg1);
        ++field8632;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Lkf;")
    public final class720 method1402(int arg0) {
        if (arg0 > -74) {
            return null;
        } else {
            ++field8635;
            return this.field8634;
        }
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
    public static final void method3543(int arg0) {
        ++field8627;
        if (class379.field5339.field8720) {
            class674.field9497 = 96;
        } else {
            try {
                Method var1 = (field8638 != null ? field8638 : (field8638 = method3545("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class674.field9497 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != -20352) {
            method3541((File) null, (String) null, -93);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 69) {
            method3544(40, 97, -34, 19, 46, 75, 25);
        }
        ++field8624;
        if (~arg6 != -9 && ~arg6 != -17) {
            class38 var7 = class352.field4549[arg4][arg3][arg0];
            if (var7 == null) {
                var7 = new class38(arg4);
            }
            if (arg6 != 1) {
                if (~arg6 == -3) {
                    var7.field536 = (short) arg1;
                    var7.field541 = (short) arg5;
                }
            } else {
                var7.field534 = (short) arg5;
                var7.field544 = (short) arg1;
            }
            if (class335.field4302) {
                class463.method2768(false);
                return;
            }
        } else {
            if (arg6 == 8) {
                int var8 = arg3 << class509.field7106;
                int var9 = class96.field1402 + var8;
                int var10 = arg0 << class509.field7106;
                int var11 = class96.field1402 + var10;
                int var12 = class155.field2126[arg4].method1959(127, arg0, arg3);
                int var13 = class155.field2126[arg4].method1959(125, arg0 - -1, arg3 + 1);
                class78.field1059[class290.field3802++] = new class27(arg6, arg4, var8, var9, var9, var8, var12, var13, var13 - arg1, -arg1 + var12, var10, var11, var11, var10);
                return;
            }
            int var14 = (arg3 << class509.field7106) + class96.field1402;
            int var15 = var14 - class96.field1402;
            int var16 = arg0 << class509.field7106;
            int var17 = class96.field1402 + var16;
            int var18 = class155.field2126[arg4].method1959(126, arg0, arg3 + 1);
            int var19 = class155.field2126[arg4].method1959(124, arg0 + 1, arg3);
            class78.field1059[class290.field3802++] = new class27(arg6, arg4, var14, var15, var15, var14, var18, var19, -arg1 + var19, var18 - arg1, var16, var17, var17, var16);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3545(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
