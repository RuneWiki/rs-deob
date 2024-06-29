import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class324 {

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Z")
    private boolean field4162;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Z")
    private boolean field4164;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    private int field4167;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Lwj;")
    public static class121 field4159 = new class121("stellardawn", 1);

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Lon;")
    public static class504 field4170;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1890(int arg0) {
        field4163++;
        if (arg0 != 30589) {
            this.method1896((byte) -7);
        }
        return this.field4164;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I", line = 14)
    public final int method1891(byte arg0) {
        field4161++;
        int var2 = -1 / ((arg0 + 45) / 59);
        return this.field4167;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;)V", line = 24)
    public static final void method1892(byte arg0, String arg1) {
        field4160++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class53.method357(arg1, 1);
        if (arg0 != -125 || var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class713.field10110; var3++) {
            String var4 = class570.field8079[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class53.method357(var4, 1);
            if (var5 != null && var5.equals(var2)) {
                class713.field10110--;
                for (int var6 = var3; var6 < class713.field10110; var6++) {
                    class570.field8079[var6] = class570.field8079[var6 + 1];
                    class82.field1117[var6] = class82.field1117[var6 + 1];
                    class139.field1905[var6] = class139.field1905[var6 + 1];
                    class370.field4735[var6] = class370.field4735[var6 + 1];
                    class652.field9212[var6] = class652.field9212[var6 + 1];
                    class669.field9419[var6] = class669.field9419[var6 + 1];
                }
                class498.field6983++;
                class666.field9387 = class564.field8023;
                class120 var7 = class292.method1716(class608.field8668, true, class335.field4300);
                var7.field1653.method184(class678.method3882(arg1, (byte) 109), arg0 ^ 0x2D);
                var7.field1653.method187(arg1, (byte) -66);
                class471.method2805(107, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Lfw;", line = 88)
    public static final class217 method1893(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        return var3 == null ? null : var3.field540;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 95)
    public static void method1894(int arg0) {
        field4170 = null;
        if (arg0 == 1) {
            field4159 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I", line = 110)
    public final int method1895(int arg0) {
        if (arg0 == 1) {
            field4168++;
            return this.field4166;
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ZIIZ)V", line = 130)
    public class324(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field4166 = arg1;
        this.field4162 = arg3;
        this.field4164 = arg0;
        this.field4167 = arg2;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)Z", line = 142)
    public final boolean method1896(byte arg0) {
        if (arg0 <= 110) {
            return true;
        } else {
            field4165++;
            return this.field4162;
        }
    }
}
