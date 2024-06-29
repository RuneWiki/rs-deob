import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class561 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Ljt;")
    public static class106 field8009 = new class106(64);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 8)
    public static void method3277(int arg0) {
        field8009 = null;
        int var1 = 56 / ((-arg0 - 46) / 35);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method3278(int arg0, int arg1, int arg2) {
        field8008++;
        if (!class483.field6967) {
            return false;
        } else if (arg0 == -1004) {
            int var3 = arg2 >> 16;
            int var4 = arg2 & 0xFFFF;
            if (class86.field1229[var3] == null || class86.field1229[var3][var4] == null) {
                return false;
            }
            class46 var5 = class86.field1229[var3][var4];
            if (arg1 == -1 && var5.field577 == 0) {
                for (class342 var6 = (class342) class748.field10459.method1195(0); var6 != null; var6 = (class342) class748.field10459.method1201(arg0 + 1006)) {
                    if (var6.field4972 == 16 || var6.field4972 == 1003 || var6.field4972 == 47 || var6.field4972 == 44 || var6.field4972 == 15) {
                        for (class46 var7 = class405.method2580(var6.field4967, 115); var7 != null; var7 = class178.method1261(95, var7)) {
                            if (var5.field610 == var7.field610) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class342 var8 = (class342) class748.field10459.method1195(0); var8 != null; var8 = (class342) class748.field10459.method1201(2)) {
                    if (var8.field4962 == arg1 && var5.field610 == var8.field4967 && (var8.field4972 == 16 || var8.field4972 == 1003 || var8.field4972 == 47 || var8.field4972 == 44 || var8.field4972 == 15)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
