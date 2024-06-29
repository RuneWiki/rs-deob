import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class34 {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
    public static boolean field390 = false;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
    public static final void method212(int arg0, int arg1) {
        class152 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class327 var4 = class98.field1191[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class299.field4190; var5++) {
                    for (int var6 = 0; var6 < class415.field5953; var6++) {
                        var2 = var4.method329(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class327 var10 = class98.field1191[var9];
                                if (var10 != null) {
                                    int var11 = var4.method328(var6, var5) - var10.method328(var6, var5);
                                    int var12 = var4.method328(var6 + 1, var5) - var10.method328(var6 + 1, var5);
                                    int var13 = var4.method328(var6 + 1, var5 + 1) - var10.method328(var6 + 1, var5 + 1);
                                    int var14 = var4.method328(var6, var5 + 1) - var10.method328(var6, var5 + 1);
                                    var10.method330(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBIIIII)V")
    public static final void method213(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -43) {
            method212(-6, 6);
        }
        field389++;
        if (class81.field946 <= (arg3 - arg0) && class235.field3295 >= arg0 + arg3 && arg6 - arg0 >= class388.field5464 && (arg0 + arg6) <= class219.field3080) {
            class144.method882(arg4, arg6, arg2, arg5, arg3, arg0, (byte) -102);
        } else {
            class275.method1819(arg2, arg4, arg0, false, arg3, arg5, arg6);
        }
    }

    static {
        new class362("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field391 = 0;
        field392 = 0;
    }
}
