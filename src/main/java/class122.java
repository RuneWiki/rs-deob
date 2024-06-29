import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class122 {

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public int field1579 = 128;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public int field1581 = 128;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "[I")
    public static int[] field1575 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "Lao;")
    public static class191 field1586 = new class191(29, 0);

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "[Z")
    public static boolean[] field1589 = new boolean[200];

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1583++;
        int var8 = class406.method2491(class169.field2184, false, class386.field5620, arg5);
        int var9 = class406.method2491(class169.field2184, false, class386.field5620, arg0);
        int var10 = class406.method2491(class307.field4111, false, class91.field1086, arg2);
        int var11 = class406.method2491(class307.field4111, false, class91.field1086, arg1);
        int var12 = class406.method2491(class169.field2184, false, class386.field5620, arg3 + arg5);
        int var13 = class406.method2491(class169.field2184, false, class386.field5620, arg0 - arg3);
        int var14 = var8;
        if (arg6 != 8) {
            method728(-26, -34, 40, 37, -71, 64, 25, -67);
        }
        while (var14 < var12) {
            class476.method2907(var11, 93, arg7, class5.field54[var14], var10);
            var14++;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class476.method2907(var11, arg6 ^ 0x63, arg7, class5.field54[var15], var10);
        }
        int var16 = class406.method2491(class307.field4111, false, class91.field1086, arg2 + arg3);
        int var17 = class406.method2491(class307.field4111, false, class91.field1086, arg1 - arg3);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class5.field54[var18];
            class476.method2907(var16, 121, arg7, var19, var10);
            class476.method2907(var17, arg6 + 105, arg4, var19, var16);
            class476.method2907(var11, 120, arg7, var19, var17);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V", line = 58)
    public static void method729(byte arg0) {
        int var1 = 61 / ((arg0 - 55) / 34);
        field1589 = null;
        field1575 = null;
        field1586 = null;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V", line = 127)
    public class122(int arg0) {
        this.field1585 = arg0;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(IIIIII)V", line = 138)
    private class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1582 = arg5;
        this.field1587 = arg4;
        this.field1579 = arg1;
        this.field1585 = arg0;
        this.field1588 = arg3;
        this.field1581 = arg2;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lcw;I)V", line = 83)
    public final void method730(class122 arg0, int arg1) {
        this.field1587 = arg0.field1587;
        this.field1585 = arg0.field1585;
        this.field1579 = arg0.field1579;
        this.field1588 = arg0.field1588;
        field1572++;
        this.field1581 = arg0.field1581;
        if (arg1 != 8) {
            this.method731(-36);
        }
        this.field1582 = arg0.field1582;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Lcw;", line = 106)
    public final class122 method731(int arg0) {
        field1578++;
        return arg0 == 29 ? new class122(this.field1585, this.field1579, this.field1581, this.field1588, this.field1587, this.field1582) : null;
    }
}
