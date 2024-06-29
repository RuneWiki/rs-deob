import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class517 extends class107 {

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "I")
    public static int field7307 = 1405;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "Ljo;")
    private class353 field7309;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
    public final String method3114(byte arg0, String arg1, int arg2) {
        field7308++;
        if (this.field7309 == null) {
            return arg1;
        }
        if (arg0 != -104) {
            this.field7309 = null;
        }
        class68 var4 = (class68) this.field7309.method2242((long) arg2, -1);
        return var4 == null ? arg1 : var4.field825;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZLso;)V")
    public final void method3115(boolean arg0, class494 arg1) {
        field7304++;
        while (true) {
            int var3 = arg1.method2964((byte) 39);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method3115(false, null);
                    return;
                }
            }
            this.method3116(var3, arg1, 73);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILso;I)V")
    private final void method3116(int arg0, class494 arg1, int arg2) {
        if (arg2 < 2) {
            return;
        }
        field7306++;
        if (arg0 != 249) {
            return;
        }
        int var4 = arg1.method2964((byte) 115);
        if (this.field7309 == null) {
            int var5 = class433.method2595(var4, (byte) -82);
            this.field7309 = new class353(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method2964((byte) 90) == 1;
            int var8 = arg1.method2960((byte) 94);
            class577 var9;
            if (var7) {
                var9 = new class68(arg1.method2996(126));
            } else {
                var9 = new class489(arg1.method2976(-127));
            }
            this.field7309.method2241(-83, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZ)I")
    public final int method3117(int arg0, int arg1, boolean arg2) {
        field7305++;
        if (this.field7309 == null) {
            return arg0;
        }
        class489 var4 = (class489) this.field7309.method2242((long) arg1, -1);
        if (!arg2) {
            method3118(null, 42);
        }
        return var4 == null ? arg0 : var4.field6926;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lso;I)Lifa;")
    public static final class449 method3118(class494 arg0, int arg1) {
        field7310++;
        if (arg1 != 1) {
            method3118(null, -37);
        }
        int var2 = arg0.method2964((byte) 120);
        class97 var3 = class391.method2424((byte) -41)[arg0.method2964((byte) 64)];
        class463 var4 = class670.method3807((byte) 94)[arg0.method2964((byte) 116)];
        int var5 = arg0.method2988(-3);
        int var6 = arg0.method2988(arg1 ^ 0xFFFFFFFC);
        int var7 = arg0.method2998(true);
        int var8 = arg0.method2998(true);
        int var9 = arg0.method2976(-125);
        int var10 = arg0.method2976(-124);
        int var11 = arg0.method2976(-125);
        boolean var12 = arg0.method2964((byte) 81) == 1;
        return new class449(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }
}
