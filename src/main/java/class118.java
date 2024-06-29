import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class118 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1985 = 0;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lph;")
    public static class229 field1984 = class266.method1858("Zugewiesener Speicher)3", 0);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lvm;")
    public static class202 field1982 = new class202(200);

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1987 = 0;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lph;")
    private static class229 field1989 = class266.method1858("You can(Wt add yourself to your own friend list)3", 0);

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lph;")
    public static class229 field1990 = field1989;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lsl;")
    public static class283 field1986;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lsl;")
    public static class283 field1988;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V", line = 16)
    public static final void method890(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class206.field3397; var3++) {
            for (int var4 = 0; var4 < class88.field1504; var4++) {
                for (int var5 = 0; var5 < class129.field2114; var5++) {
                    class72 var6 = class225.field3705[var3][var4][var5];
                    if (var6 != null) {
                        class207 var7 = var6.field1224;
                        if (var7 != null && var7.field3416.method222()) {
                            class290.method1985(var7.field3416, var3, var4, var5, 1, 1);
                            if (var7.field3403 != null && var7.field3403.method222()) {
                                class290.method1985(var7.field3403, var3, var4, var5, 1, 1);
                                var7.field3416.method212(var7.field3403, 0, 0, 0, false);
                                var7.field3403 = var7.field3403.method213(arg0, arg1, arg2);
                            }
                            var7.field3416 = var7.field3416.method213(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1211; var8++) {
                            class152 var9 = var6.field1216[var8];
                            if (var9 != null && var9.field2461.method222()) {
                                class290.method1985(var9.field2461, var3, var4, var5, var9.field2478 + 1 - var9.field2464, var9.field2463 - var9.field2468 + 1);
                                var9.field2461 = var9.field2461.method213(arg0, arg1, arg2);
                            }
                        }
                        class162 var10 = var6.field1225;
                        if (var10 != null && var10.field2607.method222()) {
                            class8.method55(var10.field2607, var3, var4, var5);
                            var10.field2607 = var10.field2607.method213(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 91)
    public static void method891(boolean arg0) {
        field1990 = null;
        field1989 = null;
        field1982 = null;
        field1988 = null;
        field1986 = null;
        if (arg0) {
            method891(true);
        }
        field1984 = null;
    }
}
