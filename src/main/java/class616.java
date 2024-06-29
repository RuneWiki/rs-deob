import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class616 {

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "Ldh;")
    public static class320 field8833 = new class320(25, -1);

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)V", line = 12)
    public static void method3493(boolean arg0) {
        field8833 = null;
        if (arg0) {
            method3493(true);
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IBLei;I)V", line = 22)
    public static final void method3494(int arg0, byte arg1, class177 arg2, int arg3) {
        field8834++;
        if (!class149.field1652) {
            return;
        }
        int var4 = 0;
        for (class649 var5 = (class649) arg2.field2081.method2067(22462); var5 != null; var5 = (class649) arg2.field2081.method2066(0)) {
            int var10 = class74.method539(var5, 595681774);
            if (var4 < var10) {
                var4 = var10;
            }
        }
        if (arg1 > -86) {
            field8833 = null;
        }
        var4 += 8;
        int var6 = arg2.field2078 * 16 + 21;
        class134.field1515 = arg2.field2078 * 16 + (class644.field9214 ? 26 : 22);
        int var7 = class655.field9351 + class236.field2806;
        if (class705.field9926 < (var7 + var4)) {
            var7 = class655.field9351 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class644.field9214 ? 33 : 31;
        int var9 = arg0 + 13 - var8;
        if ((var6 + var9) > class476.field6777) {
            var9 = class476.field6777 - var6;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class330.field4283 = var7;
        class336.field4322 = arg2;
        class210.field2484 = var9;
        class750.field10484 = var4;
    }
}
