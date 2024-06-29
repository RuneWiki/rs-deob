import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class347 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field5337;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Luv;")
    public static class2 field5336 = new class2(95, 1);

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field5341 = 0;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z[[[Lrr;)V")
    public static final void method2101(boolean arg0, class306[][][] arg1) {
        if (!arg0) {
            field5341 = 13;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class306[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class306 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4577 instanceof class401) {
                            ((class401) var6.field4577).method229(!arg0);
                        }
                        if (var6.field4592 instanceof class401) {
                            ((class401) var6.field4592).method229(!arg0);
                        }
                        if (var6.field4586 instanceof class401) {
                            ((class401) var6.field4586).method229(false);
                        }
                        if (var6.field4596 instanceof class401) {
                            ((class401) var6.field4596).method229(!arg0);
                        }
                        if (var6.field4582 instanceof class401) {
                            ((class401) var6.field4582).method229(false);
                        }
                        for (class17 var7 = var6.field4589; var7 != null; var7 = var7.field281) {
                            class522 var8 = var7.field279;
                            if (var8 instanceof class401) {
                                ((class401) var8).method229(false);
                            }
                        }
                    }
                }
            }
        }
        field5340++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
    public static void method2102(boolean arg0) {
        field5336 = null;
        if (!arg0) {
            field5341 = -9;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method2103(int arg0, byte arg1) {
        field5338++;
        return arg1 == 34 ? this.field5337[arg0] : null;
    }

    @OriginalMember(owner = "client!dp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5339++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class347(String arg0, String arg1, String arg2, String arg3) {
        this.field5337 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
