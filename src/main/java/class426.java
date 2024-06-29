import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class426 {

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field5715 = 0;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "Ljv;")
    public static class81 field5714 = new class81();

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2444(boolean arg0) {
        field5714 = null;
        if (arg0) {
            method2445(77);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2445(int arg0) {
        if (arg0 != -1) {
            method2446(85, true, true, 28);
        }
        field5716++;
        if (class225.field2991 != class16.field325) {
            try {
                class568.method3263("tbrefresh", class654.field9104, false);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZZI)I", line = 36)
    public static final int method2446(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (arg2) {
            return 18;
        }
        field5717++;
        class515 var4 = class534.method3075(arg1, arg3, -124);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && var4.field7228.length > arg0) {
            return var4.field7228[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILwp;ZI)V", line = 59)
    public static final void method2447(int arg0, int arg1, class182 arg2, boolean arg3, int arg4) {
        field5718++;
        long var5 = (long) (arg4 << 14 | arg1 << 28 | arg0);
        class133 var7 = (class133) class342.field4322.method1160(var5, 126);
        if (var7 == null) {
            class133 var8 = new class133();
            class342.field4322.method1153(var8, var5, -1);
            var8.field1923.method3671(arg2, false);
            return;
        }
        class639 var9 = class21.field381.method1583(119, arg2.field2543);
        int var10 = var9.field8861;
        if (var9.field8873 == 1) {
            var10 = (arg2.field2544 + 1) * var10;
        }
        for (class182 var11 = (class182) var7.field1923.method3672(-1); var11 != null; var11 = (class182) var7.field1923.method3662(-1)) {
            class639 var12 = class21.field381.method1583(-68, var11.field2543);
            int var13 = var12.field8861;
            if (var12.field8873 == 1) {
                var13 = (var11.field2544 + 1) * var13;
            }
            if (var13 < var10) {
                class710.method3971(var11, arg2, 0);
                return;
            }
        }
        var7.field1923.method3671(arg2, arg3);
    }
}
