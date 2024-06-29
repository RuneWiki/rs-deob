import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class89 implements Runnable {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Z")
    public boolean field1687 = true;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field1688 = new Object();

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[I")
    public int[] field1698 = new int[500];

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public int field1697 = 0;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
    public int[] field1701 = new int[500];

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lhj;")
    public static class69 field1692 = class181.method1318("Spieler kann nicht gefunden werden: ", (byte) -110);

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lhj;")
    public static class69 field1689 = class181.method1318("<col=ff7000>", (byte) -106);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static volatile int field1696 = -1;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lka;")
    public static class243 field1694 = new class243();

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[I")
    public static int[] field1699 = new int[32];

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field1700 = 0;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[I")
    public static int[] field1690;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
    public static int[] field1691;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lfg;IIII)V")
    public static final void method635(class12 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1693++;
        for (class175 var5 = (class175) class59.field1067.method1724(255); var5 != null; var5 = (class175) class59.field1067.method1726(94)) {
            if (var5.field3186 == arg2 && (arg3 * 128) == var5.field3206 && (arg1 * 128) == var5.field3182 && var5.field3193.field179 == arg0.field179) {
                if (var5.field3197 != null) {
                    class54.field959.method1788(var5.field3197);
                    var5.field3197 = null;
                }
                if (var5.field3203 != null) {
                    class54.field959.method1788(var5.field3203);
                    var5.field3203 = null;
                }
                var5.method632(-8296);
                return;
            }
        }
        if (arg4 != 20271) {
            field1699 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class53 var20 = new class53(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class158.field2935[var21][arg1][arg2] == null) {
                    class158.field2935[var21][arg1][arg2] = new class217(var21, arg1, arg2);
                }
            }
            class158.field2935[arg0][arg1][arg2].field3938 = var20;
        } else if (arg3 == 1) {
            class53 var22 = new class53(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class158.field2935[var23][arg1][arg2] == null) {
                    class158.field2935[var23][arg1][arg2] = new class217(var23, arg1, arg2);
                }
            }
            class158.field2935[arg0][arg1][arg2].field3938 = var22;
        } else {
            class267 var24 = new class267(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class158.field2935[var25][arg1][arg2] == null) {
                    class158.field2935[var25][arg1][arg2] = new class217(var25, arg1, arg2);
                }
            }
            class158.field2935[arg0][arg1][arg2].field3942 = var24;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method637(byte arg0) {
        field1690 = null;
        field1692 = null;
        field1694 = null;
        int var1 = 70 / ((74 - arg0) / 51);
        field1699 = null;
        field1691 = null;
        field1689 = null;
    }

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
    public final void run() {
        field1695++;
        while (this.field1687) {
            Object var1 = this.field1688;
            synchronized (this.field1688) {
                if (this.field1697 < 500) {
                    this.field1701[this.field1697] = class205.field3681;
                    this.field1698[this.field1697] = class72.field1398;
                    this.field1697++;
                }
            }
            class59.method356(false, 50L);
        }
    }
}
