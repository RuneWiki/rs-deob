import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class285 {

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    private int field4355;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field4352 = -1;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Lui;")
    public static class451 field4350;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "[I")
    public static int[] field4349;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "[I")
    public static int[] field4359;

    static {
        new class332("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZI)V", line = 4)
    public static final void method1820(int arg0, boolean arg1, int arg2) {
        field4356++;
        class186 var3 = class275.method1789(arg0, (byte) 123, 7);
        var3.method1285(0);
        var3.field2829 = arg2;
        if (!arg1) {
            field4359 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I", line = 18)
    public final int method1821(boolean arg0) {
        if (!arg0) {
            field4359 = null;
        }
        field4353++;
        return this.field4355;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1822(byte arg0) {
        field4354++;
        if (arg0 != 44) {
            field4359 = null;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class379.field5642; var2++) {
            for (int var3 = 0; var3 < class456.field6477; var3++) {
                if (class387.method2341(class170.field2427, true, var2, var3, arg0 + 18480, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "toString", descriptor = "()Ljava/lang/String;", line = 71)
    public final String toString() {
        field4357++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)I", line = 79)
    public static final int method1823(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 14277) {
            return -63;
        }
        field4360++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 103)
    public static void method1824(int arg0) {
        field4349 = null;
        if (arg0 == -16385) {
            field4350 = null;
            field4359 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BILjava/awt/Component;ILng;)Ln;", line = 121)
    public static final class362 method1825(byte arg0, int arg1, Component arg2, int arg3, class153 arg4) {
        field4358++;
        if (class144.field2047 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                if (arg0 < 61) {
                    return null;
                }
                class362 var5 = (class362) Class.forName("ao").getDeclaredConstructor().newInstance();
                var5.field5483 = new int[(class436.field6165 ? 2 : 1) * 256];
                var5.field5501 = arg1;
                var5.method278(arg2);
                var5.field5492 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field5492 > 16384) {
                    var5.field5492 = 16384;
                }
                var5.method275(var5.field5492);
                if (class462.field6518 > 0 && class322.field4847 == null) {
                    class322.field4847 = new class423();
                    class322.field4847.field6054 = arg4;
                    arg4.method1040(2, class462.field6518, class322.field4847);
                }
                if (class322.field4847 != null) {
                    if (class322.field4847.field6059[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class322.field4847.field6059[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class34 var6 = new class34(arg4, arg3);
                    var6.field5501 = arg1;
                    var6.field5483 = new int[(class436.field6165 ? 2 : 1) * 256];
                    var6.method278(arg2);
                    var6.field5492 = 16384;
                    var6.method275(var6.field5492);
                    if (class462.field6518 > 0 && class322.field4847 == null) {
                        class322.field4847 = new class423();
                        class322.field4847.field6054 = arg4;
                        arg4.method1040(2, class462.field6518, class322.field4847);
                    }
                    if (class322.field4847 != null) {
                        if (class322.field4847.field6059[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class322.field4847.field6059[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class362();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(II)V", line = 211)
    public class285(int arg0, int arg1) {
        this.field4355 = arg0;
    }
}
