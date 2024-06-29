import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class97 {

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "[Lqn;")
    public static class71[] field1384;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)I", line = 4)
    public static final int method763(int arg0, int arg1, int arg2) {
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != 20222) {
            method764(true);
        }
        field1385++;
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)V", line = 34)
    public static void method764(boolean arg0) {
        field1384 = null;
        if (arg0) {
            field1384 = null;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Ldt;BI)V", line = 44)
    public static final void method765(class254 arg0, byte arg1, int arg2) {
        field1386++;
        if (arg1 < 27 || class351.field5121 == null) {
            return;
        }
        try {
            class351.field5121.method2203(-5442, 0L);
            class351.field5121.method2196(arg0.field3789, (byte) 121, 24, arg2);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V", line = 65)
    public static final void method766(int arg0) {
        field1387++;
        class624.field8416.method3103(-11294);
        if (arg0 >= -78) {
            field1384 = null;
        }
    }
}
