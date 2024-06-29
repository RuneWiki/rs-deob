import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class81 extends class79 {

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Lir;")
    public static class19 field942;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "Ltq;")
    public static class376 field945;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "[Lqg;")
    public static class269[] field943;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V")
    public static void method455(boolean arg0) {
        field943 = null;
        if (arg0) {
            method456(-128, 103, (class184[]) null);
        }
        field945 = null;
        field942 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[Lon;)V")
    public static final void method456(int arg0, int arg1, class184[] arg2) {
        if (arg0 > -116) {
            field943 = null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class184 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2524 == 0) {
                    if (var4.field2603 != null) {
                        method456(-126, arg1, var4.field2603);
                    }
                    class167 var5 = (class167) class22.field280.method1888((long) var4.field2584, (byte) -30);
                    if (var5 != null) {
                        class94.method524(arg1, 0, var5.field2332);
                    }
                }
                if (arg1 == 0 && var4.field2517 != null) {
                    class272 var6 = new class272();
                    var6.field3848 = var4.field2517;
                    var6.field3851 = var4;
                    class201.method1332(var6);
                }
                if (arg1 == 1 && var4.field2570 != null) {
                    if (var4.field2668 >= 0) {
                        class184 var7 = class282.method1863(var4.field2584, -25835);
                        if (var7 == null || var7.field2603 == null || var7.field2603.length <= var4.field2668 || var7.field2603[var4.field2668] != var4) {
                            continue;
                        }
                    }
                    class272 var8 = new class272();
                    var8.field3848 = var4.field2570;
                    var8.field3851 = var4;
                    class201.method1332(var8);
                }
            }
        }
        field947++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method457(String arg0, byte arg1) {
        if (arg1 == -49) {
            field944++;
            return arg0.length() + 1;
        } else {
            return 91;
        }
    }
}
