import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class227 {

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lcba;")
    public static class471 field3249 = new class471(2, 6);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3249 = null;
        if (arg0 != 14516) {
            method1450(-40, null, null, -36, -66);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ldaa;I)V")
    public final void method1447(class11 arg0, int arg1) {
        if (arg1 != 28033) {
            this.method1447(null, 123);
        }
        while (true) {
            int var3 = arg0.method110((byte) 73);
            if (var3 == 0) {
                field3243++;
                return;
            }
            this.method1449(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILdaa;)V")
    public static final void method1448(int arg0, class11 arg1) {
        field3250++;
        if ((arg1.field138.length - arg1.field165) < 1) {
            return;
        }
        int var2 = arg1.method110((byte) 95);
        if (var2 < 0 || var2 > 1 || arg1.field138.length - arg1.field165 < 2) {
            return;
        }
        int var3 = arg1.method93((byte) 116);
        int var4 = -33 % ((arg0 - 60) / 40);
        if (arg1.field138.length - arg1.field165 < var3 * 6) {
            return;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1.method93((byte) 85);
            int var7 = arg1.method119(-74);
            if (class77.field1259.length > var6 && class552.field7627[var6] && (class481.field6786.method3691(19, var6).field7984 != '1' || var7 >= -1 && var7 <= 1)) {
                class77.field1259[var6] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ldaa;ZI)V")
    private final void method1449(class11 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1449(null, true, 62);
        }
        field3247++;
        if (arg2 == 1) {
            this.field3246 = arg0.method93((byte) 83);
            this.field3245 = arg0.method110((byte) 100);
            this.field3248 = arg0.method110((byte) 96);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILdm;Lqa;II)V")
    public static final void method1450(int arg0, class46 arg1, class207 arg2, int arg3, int arg4) {
        class317.field4305.method465(true);
        field3244++;
        if (class485.field6822) {
            return;
        }
        int var5 = 86 / ((arg4 - 44) / 40);
        for (class299 var6 = (class299) arg1.method456((byte) -69); var6 != null; var6 = (class299) arg1.method460((byte) -96)) {
            class463 var7 = class413.field5809.method2136(-112, var6.field4088);
            if (class236.method1479((byte) -113, var7)) {
                boolean var8 = class26.method296((byte) 81, arg0, var7, arg3, var6, arg2);
                if (var8) {
                    class483.method2812(0, arg2, var7, var6);
                }
            }
        }
    }
}
