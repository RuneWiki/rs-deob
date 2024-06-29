import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class198 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Ljd;")
    private static class85 field3396 = class221.method1499("Take", (byte) -62);

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static volatile int field3395 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Ljd;")
    public static class85 field3394 = field3396;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lve;")
    public static class184 field3392 = new class184(4);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Ljd;")
    private static class85 field3398 = class221.method1499("Checking for updates )2 ", (byte) 125);

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Ljd;")
    public static class85 field3399 = field3398;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lna;")
    public static class31 field3390;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method1349(boolean arg0) {
        if (!arg0) {
            field3398 = null;
        }
        field3391++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class8.method37(true, var3, var2, class99.field1780, var1, -108)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)[B")
    public abstract byte[] method106(byte arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILge;)Lfg;")
    public static final class12 method1350(int arg0, int arg1, int arg2, class68 arg3) {
        field3393++;
        int var4 = -126 / ((66 - arg1) / 60);
        return class253.method1750(arg2, arg3, (byte) 122, arg0) ? class30.method205(0) : null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BIIIII)V")
    public static final void method1351(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3397++;
        int var6 = arg3 - arg2;
        int var7 = arg5 - arg1;
        int var8 = -48 % ((arg0 - 17) / 40);
        if (var7 == 0) {
            if (var6 != 0) {
                class148.method964(arg4, true, arg1, arg2, arg3);
            }
        } else if (var6 == 0) {
            class153.method1009(arg2, 0, arg5, arg4, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var9 = var7 < var6;
            if (var9) {
                int var10 = arg5;
                int var11 = arg1;
                arg1 = arg2;
                arg5 = arg3;
                arg2 = var11;
                arg3 = var10;
            }
            if (arg5 < arg1) {
                int var12 = arg1;
                arg1 = arg5;
                int var13 = arg2;
                arg5 = var12;
                arg2 = arg3;
                arg3 = var13;
            }
            int var14 = arg2;
            int var15 = arg3 - arg2;
            int var16 = arg5 - arg1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = -(var16 >> 1);
            int var18 = arg2 >= arg3 ? -1 : 1;
            if (var9) {
                for (int var20 = arg1; var20 <= arg5; var20++) {
                    var17 += var15;
                    class146.field2488[var20][var14] = arg4;
                    if (var17 > 0) {
                        var17 -= var16;
                        var14 += var18;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg5; var19++) {
                    var17 += var15;
                    class146.field2488[var14][var19] = arg4;
                    if (var17 > 0) {
                        var14 += var18;
                        var17 -= var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1352(int arg0) {
        field3398 = null;
        field3399 = null;
        if (arg0 != -1) {
            field3390 = null;
        }
        field3394 = null;
        field3396 = null;
        field3390 = null;
        field3392 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B[B)V")
    public abstract void method107(byte arg0, byte[] arg1);
}
