import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class101 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lnb;")
    private class137 field1632 = new class137();

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Loe;")
    private class57 field1639 = new class57();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lhb;")
    private class155 field1637;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "C")
    public static char field1628;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[I")
    public static int[] field1633;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        if (arg0 < 3) {
            method690(5, -48, 96, 87, -103, 121, -1);
        }
        field1633 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Lhd;")
    public final class128 method689(boolean arg0) {
        field1640++;
        if (!arg0) {
            this.method692((byte) 75);
        }
        return this.field1637.method1055(18178);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1631++;
        int var7 = class123.method866(class85.field1409, arg1, (byte) 108, class234.field3774);
        int var8 = class123.method866(class85.field1409, arg6, (byte) -75, class234.field3774);
        int var9 = class123.method866(class82.field1374, arg4, (byte) -96, class259.field4188);
        int var10 = class123.method866(class82.field1374, arg0, (byte) 121, class259.field4188);
        int var11 = class123.method866(class85.field1409, arg1 + arg3, (byte) -69, class234.field3774);
        int var12 = class123.method866(class85.field1409, arg6 - arg3, (byte) 106, class234.field3774);
        for (int var13 = var7; var13 < var11; var13++) {
            class73.method494(arg2, class204.field3253[var13], 4028, var10, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class73.method494(arg2, class204.field3253[var14], 4028, var10, var9);
        }
        int var15 = class123.method866(class82.field1374, arg4 + arg3, (byte) -89, class259.field4188);
        int var16 = class123.method866(class82.field1374, arg0 - arg3, (byte) 74, class259.field4188);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class204.field3253[var17];
            class73.method494(arg2, var18, 4028, var15, var9);
            class73.method494(arg2, var18, 4028, var10, var16);
        }
        if (arg5 != 90) {
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)Lhd;")
    public final class128 method691(boolean arg0) {
        field1641++;
        return arg0 ? null : this.field1637.method1063(-117);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public final void method692(byte arg0) {
        this.field1639.method392(1);
        field1629++;
        this.field1637.method1056(-98);
        this.field1632 = new class137();
        if (arg0 >= 122) {
            this.field1636 = this.field1635;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(JILnb;)V")
    public final void method693(long arg0, int arg1, class137 arg2) {
        field1634++;
        if (this.field1636 == 0) {
            class137 var5 = this.field1639.method390(-11);
            var5.method913(-3542);
            var5.method956(256);
            if (this.field1632 == var5) {
                class137 var6 = this.field1639.method390(-82);
                var6.method913(-3542);
                var6.method956(256);
            }
        } else {
            this.field1636--;
        }
        int var7 = -83 % ((arg1 - 49) / 53);
        this.field1637.method1052(arg0, (byte) -65, arg2);
        this.field1639.method395(30985, arg2);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(JZ)Lnb;")
    public final class137 method694(long arg0, boolean arg1) {
        class137 var4 = (class137) this.field1637.method1059(0, arg0);
        field1638++;
        if (arg1) {
            this.method693(12L, -81, (class137) null);
        }
        if (var4 != null) {
            this.field1639.method395(30985, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
    public class101(int arg0) {
        this.field1636 = arg0;
        this.field1635 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1637 = new class155(var2);
    }
}
