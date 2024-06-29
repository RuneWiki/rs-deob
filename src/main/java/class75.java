import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class75 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lsc;")
    public static class56 field1453 = new class56(16);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Z")
    public static boolean[] field1464 = new boolean[100];

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lie;")
    public static class117 field1462 = new class117(64);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lfa;")
    public static class176 field1455;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[[[Lea;")
    public static class177[][][] field1463;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static final void method551(boolean arg0) {
        field1456++;
        if (!arg0) {
            method553(-57);
        }
        int var1 = class182.field3152;
        int var2 = class213.field3644;
        int var3 = class207.field3547;
        int var4 = class169.field2920;
        int var5 = 6116423;
        class23.method198(var2, var3, var1, var4, var5);
        class23.method198(var2 + 1, var3 + 1, var1 - 2, 16, 0);
        class23.method208(var2 + 1, var3 + 18, var1 - 2, var4 + -19, 0);
        class71.field1399.method790(class34.field657, var2 + 3, var3 - -14, var5, -1);
        int var6 = class102.field1904;
        int var7 = class245.field4253;
        for (int var8 = 0; var8 < class199.field3407; var8++) {
            int var9 = 16777215;
            int var10 = var3 + ((class199.field3407 + -1 + -var8) * 15) + 31;
            if (var7 > var2 && var7 < var1 + var2 && (var10 - 13) < var6 && var6 < var10 + 3) {
                var9 = 16776960;
            }
            class71.field1399.method790(class233.method1541((byte) 122, var8), var2 + 3, var10, var9, 0);
        }
        class246.method1617(class182.field3152, 0, class207.field3547, class213.field3644, class169.field2920);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Lve;")
    public static final class115 method552(int arg0, int arg1, int arg2) {
        class177 var3 = field1463[arg0][arg1][arg2];
        return var3 == null || var3.field3016 == null ? null : var3.field3016;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1453 = null;
        field1464 = null;
        field1463 = null;
        field1462 = null;
        field1455 = null;
        if (arg0 != 6116423) {
            method551(false);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method554(int arg0) {
        field1460++;
        if (arg0 == -2) {
            class59.field1243.method833(0);
            class183.field3176.method833(0);
            class140.field2482.method833(0);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method555(int arg0) {
        field1457++;
        if (arg0 == 10853 && class17.field380 != null) {
            class17.field380.method1421((byte) 117);
        }
    }
}
