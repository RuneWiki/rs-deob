import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class230 extends class1 {

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "[Lcc;")
    public static class215[] field3466 = new class215[14];

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3472 = "red:";

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static volatile int field3467 = 0;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "[I")
    public static int[] field3469 = new int[14];

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "Lja;")
    public static class60 field3471;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)V")
    public static void method1466(byte arg0) {
        field3466 = null;
        field3472 = null;
        field3471 = null;
        if (arg0 != 42) {
            field3471 = null;
        }
        field3469 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZIII)V")
    public final void method1467(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3468++;
        int var6 = this.field3463 << 3;
        int var7 = this.field3470 << 3;
        int var8 = (arg2 << 4) + (var7 & 0xF);
        if (arg1) {
            this.method1283(105, -125, -31, 119);
        }
        int var9 = (arg4 << 4) + (var6 & 0xF);
        this.method1263(var6, var7, var9, var8, arg0, arg3);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
    public abstract void method1283(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public abstract void method1277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)Lk;")
    public static final class183 method1468(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4073;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public abstract void method1269(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1469(boolean arg0) {
        if (class107.field1656 != -1) {
            class286.method1880(-1, class107.field1656, 1, -1);
            class107.field1656 = -1;
        }
        if (!arg0) {
            field3465++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    public abstract void method1274(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
    public abstract void method1278(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
    public abstract void method1264(int arg0, int arg1);
}
