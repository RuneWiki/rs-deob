import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class122 extends class425 {

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "[I")
    public static int[] field1640 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field1639 = 99;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "[I")
    public static int[] field1637 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Ltj;")
    public static class108 field1636;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)V", line = 4)
    public static final void method738(int arg0, int arg1, int arg2, byte arg3) {
        field1634++;
        if (class385.field5449 == null) {
            return;
        }
        long var4 = (long) (arg0 << 28 | arg2 << 14 | arg1);
        class413 var6 = (class413) class338.field4904.method1373(var4, -23);
        if (var6 == null) {
            class113.method684(arg0, arg1, arg2);
            return;
        }
        class122 var7 = (class122) var6.field5907.method2752(-103);
        int var8 = -45 / ((arg3 + 68) / 41);
        if (var7 == null) {
            class113.method684(arg0, arg1, arg2);
            return;
        }
        class5 var9 = (class5) class113.method684(arg0, arg1, arg2);
        if (var9 == null) {
            var9 = new class5();
        } else {
            var9.field76 = var9.field81 = -1;
        }
        var9.field82 = var7.field1638;
        var9.field70 = var7.field1633;
        label44: while (true) {
            class122 var10 = (class122) var6.field5907.method2754(-1);
            if (var10 == null) {
                break;
            }
            if (var9.field70 != var10.field1633) {
                var9.field75 = var10.field1638;
                var9.field76 = var10.field1633;
                while (true) {
                    class122 var11 = (class122) var6.field5907.method2754(-1);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var9.field70 != var11.field1633 && var9.field76 != var11.field1633) {
                        var9.field81 = var11.field1633;
                        var9.field72 = var11.field1638;
                    }
                }
            }
        }
        int var12 = class452.method2820(arg0, (arg2 << 7) + 64, false, (arg1 << 7) + 64);
        class349.method2288(arg0, arg1, arg2, var12, var9);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 82)
    public static final void method739(int arg0) {
        field1642++;
        int var1 = 0;
        if (arg0 > -54) {
            return;
        }
        while (var1 < class229.field3396) {
            int var2 = class431.field6169[var1];
            class446 var3 = class442.field6317[var2];
            if (var3 != null) {
                class142.method1066(var3.field6375.field5008, 11008, var3);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 112)
    public static void method740(int arg0) {
        field1636 = null;
        field1637 = null;
        if (arg0 != 2) {
            method738(-109, 57, -67, (byte) 6);
        }
        field1640 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lbr;I)V", line = 126)
    public static final void method741(class223 arg0, int arg1) {
        if (arg0.field3208 == 5 && arg0.field3304 != -1) {
            class65.method414(arg0, true, class59.field786);
        }
        if (arg1 != 3) {
            field1640 = null;
        }
        field1635++;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V", line = 150)
    public class122(int arg0, int arg1) {
        this.field1633 = arg0;
        this.field1638 = arg1;
    }
}
