import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class242 {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Llc;")
    public static class143 field4351 = class66.method374("Chargement des polices )2 ", -1);

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lbg;")
    public static class177 field4352 = new class177(128);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lll;")
    public static class135 field4350;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "[Lvg;")
    public static class230[] field4349;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1612(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4347++;
        int var8 = arg1 + arg7;
        int var9 = arg4 - arg7;
        int var10 = -66 / ((23 - arg3) / 44);
        int var11 = arg6 + arg7;
        for (int var12 = arg1; var12 < var8; var12++) {
            class289.method1927(class15.field268[var12], arg2, arg6, -93, arg5);
        }
        for (int var13 = arg4; var13 > var9; var13--) {
            class289.method1927(class15.field268[var13], arg2, arg6, -84, arg5);
        }
        int var14 = arg5 - arg7;
        for (int var15 = var8; var15 <= var9; var15++) {
            int[] var16 = class15.field268[var15];
            class289.method1927(var16, arg2, arg6, -61, var11);
            class289.method1927(var16, arg0, var11, -83, var14);
            class289.method1927(var16, arg2, var14, -81, arg5);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLwg;)Lwg;")
    public abstract class254 method1371(byte arg0, class254 arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method1613(byte arg0) {
        int var1 = -120 / ((-arg0 - 51) / 33);
        for (int var2 = 0; var2 < class208.field3828; var2++) {
            class218 var3 = class109.method655(-19850, var2);
            if (var3 != null && var3.field3984 == 0) {
                class145.field2603[var2] = 0;
                class148.field2691[var2] = 0;
            }
        }
        class55.field1062 = new class277(16);
        field4348++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1614(int arg0) {
        field4349 = null;
        field4351 = null;
        if (arg0 != 0) {
            method1614(-3);
        }
        field4350 = null;
        field4352 = null;
    }
}
