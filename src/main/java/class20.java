import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public int field366 = 0;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lp;")
    public static class280 field370 = class18.method140((byte) -122, "<br>");

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lgd;")
    public static class74 field367 = new class74(5000);

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lp;")
    public static class280 field374 = class18.method140((byte) -123, "null");

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Ltg;")
    public static class180 field372;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Ltg;")
    public static class180 field376;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[Lde;")
    public static class108[] field375;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
    public static final void method156() {
        if (class30.field563 != null) {
            for (int var0 = 0; var0 < class30.field563.length; var0++) {
                for (int var1 = 0; var1 < class57.field928; var1++) {
                    for (int var2 = 0; var2 < class86.field1411; var2++) {
                        class30.field563[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class25.field473 != null) {
            for (int var3 = 0; var3 < class25.field473.length; var3++) {
                for (int var4 = 0; var4 < class57.field928; var4++) {
                    for (int var5 = 0; var5 < class86.field1411; var5++) {
                        class25.field473[var3][var4][var5] = null;
                    }
                }
            }
        }
        class237.field4120 = 0;
        if (class191.field3350 != null) {
            for (int var6 = 0; var6 < class237.field4120; var6++) {
                class191.field3350[var6] = null;
            }
        }
        if (class232.field4050 != null) {
            for (int var7 = 0; var7 < class230.field4012; var7++) {
                class232.field4050[var7] = null;
            }
            class230.field4012 = 0;
        }
        if (class189.field3320 != null) {
            for (int var8 = 0; var8 < class189.field3320.length; var8++) {
                class189.field3320[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Llj;I)Ljl;")
    public static final class242 method157(class25 arg0, int arg1) {
        arg0.method189((byte) -103);
        int var2 = arg0.method189((byte) -103);
        field369++;
        class242 var3 = class271.method1814(1, var2);
        var3.field4255 = arg0.method189((byte) -103);
        int var4 = arg0.method189((byte) -103);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method189((byte) -103);
            var3.method49(-126, var6, arg0);
        }
        if (arg1 != -22973) {
            field372 = null;
        }
        var3.method111(123);
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method158(int arg0) {
        field375 = null;
        field367 = null;
        field376 = null;
        if (arg0 != 0) {
            method156();
        }
        field374 = null;
        field370 = null;
        field372 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILlj;)V")
    private final void method159(int arg0, int arg1, class25 arg2) {
        field368++;
        if (arg0 != -31046) {
            field372 = null;
        }
        if (arg1 == 5) {
            this.field366 = arg2.method193((byte) 77);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILlj;)V")
    public final void method160(int arg0, class25 arg1) {
        field371++;
        if (arg0 != -7979) {
            field376 = null;
        }
        while (true) {
            int var3 = arg1.method189((byte) -103);
            if (var3 == 0) {
                return;
            }
            this.method159(arg0 ^ 0x666F, var3, arg1);
        }
    }
}
