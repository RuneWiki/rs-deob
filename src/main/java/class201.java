import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class201 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Leb;")
    public static class230 field3564 = class68.method589(0, "(U2");

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Leb;")
    private static class230 field3566 = class68.method589(0, "Discard");

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Leb;")
    public static class230 field3567 = field3566;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lpk;")
    public static class98 field3563 = new class98();

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3564 = null;
        field3567 = null;
        if (arg0 != -9757) {
            field3566 = null;
        }
        field3563 = null;
        field3566 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method1416(int arg0) {
        class146.method1118(arg0 - 120, 5);
        class47.method398(-60, 5);
        class196.method1395(5, (byte) 125);
        field3568++;
        class113.method910(true, 5);
        class7.method76(5, -26437);
        class178.method1293((byte) -44, 5);
        class177.method1289((byte) 33, arg0);
        class223.method1548(22429, 5);
        class17.method215(5, arg0 ^ 0x5);
        class65.method575(5, 26705);
        class72.method614(34, 5);
        class107.method885(50, -329);
        class182.method1312(5, 39);
        class88.method717(5, (byte) 117);
        class260.field4613.method1121(arg0 ^ 0x5, 5);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZI)I")
    public static final int method1417(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg0 / arg1;
        field3562++;
        int var5 = arg1 - 1 & arg3;
        int var6 = arg3 / arg1;
        int var7 = class138.method1061((byte) -97, var4, var6);
        if (!arg2) {
            field3563 = null;
        }
        int var8 = class138.method1061((byte) -97, var4 + 1, var6);
        int var9 = class138.method1061((byte) -97, var4, var6 + 1);
        int var10 = class138.method1061((byte) -97, var4 + 1, var6 + 1);
        int var11 = arg0 & arg1 - 1;
        int var12 = class12.method129(var8, 0, arg1, var7, var11);
        int var13 = class12.method129(var10, 0, arg1, var9, var11);
        return class12.method129(var13, 0, arg1, var12, var5);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    public static final void method1418(int arg0, int arg1) {
        class197 var2 = class164.method1228(12, arg0, arg1 - 1665858793);
        if (arg1 != -15671) {
            method1420(-63, (class14) null);
        }
        field3565++;
        var2.method1407(-123);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)J")
    public static final synchronized long method1419(int arg0) {
        field3561++;
        long var1 = System.currentTimeMillis();
        if (class78.field1418 > var1) {
            class102.field1869 += class78.field1418 - var1;
        }
        class78.field1418 = var1;
        if (arg0 != 5) {
            field3567 = null;
        }
        return var1 + class102.field1869;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILfk;)Lvj;")
    public static final class113 method1420(int arg0, class14 arg1) {
        if (arg0 < 56) {
            field3567 = null;
        }
        field3569++;
        return new class113(arg1.method178(-1), arg1.method178(-1), arg1.method178(-1), arg1.method178(-1), arg1.method190(-25267), arg1.method190(-25267), arg1.method200(255));
    }
}
