import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class741 {

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "[I")
    public int[] field10256;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "[I")
    public int[] field10257;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "[[F")
    public float[][] field10258;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "[I")
    public int[] field10262;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Llo;")
    public static class451 field10255 = new class451();

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
    public static int[] field10259 = new int[4096];

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Luf;")
    public static class519 field10261;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field10260;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method4077(byte arg0) {
        field10259 = null;
        field10261 = null;
        field10255 = null;
        if (arg0 < 2) {
            field10261 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method4078(int arg0, String arg1) {
        field10260++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class147.method1160(72, arg1);
        if (var2 == null) {
            return;
        }
        int var3 = 70 % ((arg0 - 7) / 37);
        for (int var4 = 0; var4 < class458.field6267; var4++) {
            String var5 = class263.field3721[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class147.method1160(-107, var5);
            if (var6 != null && var6.equals(var2)) {
                class458.field6267--;
                for (int var7 = var4; var7 < class458.field6267; var7++) {
                    class263.field3721[var7] = class263.field3721[var7 + 1];
                    class460.field6286[var7] = class460.field6286[var7 + 1];
                    class581.field8364[var7] = class581.field8364[var7 + 1];
                    class482.field6621[var7] = class482.field6621[var7 + 1];
                    class217.field3164[var7] = class217.field3164[var7 + 1];
                }
                class732.field10182 = class745.field10359;
                class302.field4340++;
                class302 var8 = class582.method3419(class148.field2369, (byte) 125, class626.field8901);
                var8.field4341.method2524(false, class389.method2339(arg1, true));
                var8.field4341.method2566(-2, arg1);
                class501.method2928(0, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class741(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field10256 = arg0;
        this.field10257 = arg1;
        this.field10258 = arg3;
        this.field10262 = arg2;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field10259[var0] = class432.method2587(var0, -21311);
        }
        field10261 = null;
    }
}
