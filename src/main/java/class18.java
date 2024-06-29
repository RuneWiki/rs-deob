import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class18 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Z")
    private static boolean field174 = false;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private static int field175 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lfca;")
    private static class661 field173 = new class661();

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILe;)V")
    public static final synchronized void method80(int arg0, class2 arg1) {
        if (field174) {
            return;
        }
        if (arg0 <= ~field175) {
            arg1.method5(false);
        } else {
            class8 var2 = new class8();
            var2.field73 = arg1;
            field173.method3593(var2, arg0 ^ 0xFFFFFFF0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final synchronized void method81(byte arg0) {
        field175++;
        if (arg0 != 25) {
            method83(-33);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static final synchronized void method82(byte arg0) {
        if (arg0 != 115) {
            field173 = null;
        }
        field175--;
        if (field175 == 0) {
            method83(8797);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final synchronized void method83(int arg0) {
        while (true) {
            class8 var1 = (class8) field173.method3599(-119);
            if (var1 == null) {
                if (arg0 != 8797) {
                    field173 = null;
                    return;
                }
                return;
            }
            var1.field73.method5(true);
            var1.method1946(-10364);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method84(int arg0, boolean arg1) {
        if (arg0 < -52) {
            field174 = arg1;
        }
    }
}
