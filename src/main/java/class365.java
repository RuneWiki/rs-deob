import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class365 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Ltba;")
    public class56 field5173 = null;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Lda;")
    public class423 field5177 = null;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIIII)V")
    public static final void method2249(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5176++;
        if (class709.field9973 != 1) {
            return;
        }
        if (!arg0) {
            field5175 = 31;
        }
        int var5 = arg4 / class112.field1383;
        int var6 = arg3 / class112.field1383;
        int var7 = arg2 / class664.field9087;
        int var8 = arg1 / class664.field9087;
        if (class680.field9231 <= var5 || var6 < 0 || class665.field9109 <= var7 || var8 < 0) {
            return;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var8 >= class665.field9109) {
            var8 = class665.field9109 - 1;
        }
        if (class680.field9231 <= var6) {
            var6 = class680.field9231 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class222.method1440(class665.field9109, class304.field3930 + var9, -31781) * class680.field9231;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class222.method1440(class680.field9231, class117.field1427 + var11, -31781);
                class87.field1109[var12] = class743.field10378;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
    public static final void method2250(boolean arg0, int arg1) {
        field5174++;
        class548 var2 = class696.method3872(arg1, 5, -1633381944);
        if (arg0) {
            field5175 = -113;
        }
        var2.method3127((byte) 122);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lda;)V")
    public class365(class423 arg0) {
        this.field5177 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lda;Ltba;)V")
    public class365(class423 arg0, class56 arg1) {
        this.field5177 = arg0;
        this.field5173 = arg1;
    }
}
