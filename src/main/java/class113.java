import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class113 extends class49 {

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1365 = -1;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lke;")
    public static class276 field1369 = new class276(64);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Ljn;")
    public static class134 field1370 = new class134(62, -2);

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIC)I", line = 7)
    public static final int method815(int arg0, int arg1, char arg2) {
        field1368++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return arg1 <= 119 ? 116 : var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 26)
    public static void method816(int arg0) {
        if (arg0 != 5) {
            method816(-2);
        }
        field1370 = null;
        field1369 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILgga;)Lle;", line = 37)
    public static final class524 method817(int arg0, class511 arg1) {
        field1366++;
        String var2 = arg1.method2993((byte) -98);
        class267 var3 = class278.method1807(4)[arg1.method3013(59)];
        class15 var4 = class282.method1834(0)[arg1.method3013(arg0 ^ 0xFFFFFFBF)];
        int var5 = arg1.method3034(1);
        int var6 = arg1.method3034(1);
        int var7 = arg1.method3013(-100);
        int var8 = arg1.method3013(arg0 ^ 0xFFFFFF92);
        int var9 = arg1.method3013(75);
        int var10 = arg1.method3002(arg0);
        int var11 = arg1.method3002(-1);
        int var12 = arg1.method3008(64);
        int var13 = arg1.method3008(64);
        int var14 = arg1.method3008(64);
        return new class524(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 73)
    public static final void method818(byte arg0) {
        field1367++;
        if (class567.field7992 == 5) {
            class567.field7992 = 6;
            if (arg0 >= -18) {
                method816(-92);
            }
        }
    }
}
