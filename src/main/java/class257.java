import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class257 extends class150 {

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "[Lofa;")
    public static class349[] field3606 = new class349[128];

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "B")
    public byte field3601;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Lfca;")
    public class93 field3602;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)[B")
    public final byte[] method1194(byte arg0) {
        ++field3604;
        if (arg0 != 118) {
            return null;
        } else if (!super.field2489 && this.field3602.field1442 >= this.field3602.field1413.length + -this.field3601) {
            return this.field3602.field1413;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIBII)V")
    public static final void method1678(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg2 > -86) {
            method1680(-29, -87, -62);
        }
        while (class526.field7139 > var5) {
            Rectangle var6 = class713.field9815[var5];
            if (arg1 < var6.x - -var6.width && var6.x < arg0 + arg1 && arg3 < var6.y + var6.height && ~(arg3 + arg4) < ~var6.y) {
                class684.field9516[var5] = true;
            }
            ++var5;
        }
        ++field3605;
        class686.method3861(arg1, arg0 + arg1, 22738, arg3, arg3 + arg4);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[BIII[BI)V")
    public static final void method1679(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        ++field3609;
        int var9 = -(arg2 >> 2);
        int var10 = -(3 & arg2);
        if (arg4 == -1) {
            for (int var11 = -arg8; ~var11 > -1; ++var11) {
                int var10001;
                for (int var12 = var9; var12 < 0; ++var12) {
                    var10001 = arg0++;
                    arg3[var10001] += arg7[arg6++];
                    int var14 = arg0++;
                    arg3[var14] += arg7[arg6++];
                    int var15 = arg0++;
                    arg3[var15] += arg7[arg6++];
                    int var16 = arg0++;
                    arg3[var16] += arg7[arg6++];
                }
                for (int var13 = var10; ~var13 > -1; ++var13) {
                    var10001 = arg0++;
                    arg3[var10001] += arg7[arg6++];
                }
                arg0 += arg5;
                arg6 += arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)Ljo;")
    public static final class355 method1680(int arg0, int arg1, int arg2) {
        ++field3610;
        class355 var3 = new class355();
        var3.field4841 = -1;
        var3.field4843 = -1;
        if (arg2 >= -25) {
            return null;
        } else {
            var3.field4829 = arg1 + 1 + 5;
            var3.field4839 = arg0 + 5 - -1;
            var3.field4830 = new int[var3.field4839][var3.field4829];
            var3.method2189((byte) -100);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
    public static final void method1681(byte arg0) {
        ++field3608;
        if (class556.field7850 != class204.field3075) {
            try {
                int var1 = 96 % ((-52 - arg0) / 52);
                class729.method4044(class594.field8348, 26693, "tbrefresh");
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)V")
    public static void method1682(byte arg0) {
        field3606 = null;
        if (arg0 < 17) {
            method1681((byte) -1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    public final int method1192(int arg0) {
        if (arg0 != 100) {
            method1681((byte) 65);
        }
        ++field3607;
        return this.field3602 == null ? 0 : this.field3602.field1442 * 100 / (this.field3602.field1413.length + -this.field3601);
    }
}
