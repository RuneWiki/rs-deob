import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class270 extends class194 {

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "[I")
    public static int[] field4784 = new int[2000];

    @OriginalMember(owner = "client!p", name = "ob", descriptor = "Lhj;")
    public static class69 field4789 = class181.method1318("mapdots", (byte) -115);

    @OriginalMember(owner = "client!p", name = "pb", descriptor = "[I")
    public static int[] field4790 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!p", name = "nb", descriptor = "[Z")
    public static boolean[] field4788;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
    public static void method1853(byte arg0) {
        if (arg0 >= 2) {
            field4784 = null;
            field4790 = null;
            field4788 = null;
            field4789 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIBII)V")
    public static final void method1854(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field4786;
        class145.field2687[0].method270(arg1, arg4);
        class145.field2687[1].method270(arg1, arg4 - (-arg0 - -16));
        int var6 = (arg0 + -32) * arg0 / arg2;
        if (~var6 > -9) {
            var6 = 8;
        }
        int var7 = (arg0 - 32 + -var6) * arg5 / (arg2 - arg0);
        class15.method77(arg1, arg4 + 16, 16, arg0 + -32, class108.field2037);
        class15.method77(arg1, arg4 - -var7 + 16, 16, var6, class148.field2746);
        class15.method93(arg1, arg4 + 16 - -var7, var6, class132.field2441);
        class15.method93(arg1 + 1, var7 + 16 + arg4, var6, class132.field2441);
        class15.method94(arg1, arg4 + var7 - -16, 16, class132.field2441);
        if (arg3 > -7) {
            method1854(-35, -82, 60, (byte) 100, 99, -110);
        }
        class15.method94(arg1, arg4 + 17 - -var7, 16, class132.field2441);
        class15.method93(arg1 + 15, arg4 + var7 + 16, var6, class145.field2688);
        class15.method93(arg1 + 14, arg4 - -var7 + 17, var6 + -1, class145.field2688);
        class15.method94(arg1, arg4 + var7 - -15 + var6, 16, class145.field2688);
        class15.method94(arg1 + 1, arg4 + 14 + var6 + var7, 15, class145.field2688);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            field4789 = null;
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -98);
        ++field4783;
        if (super.field3064.field979 && this.method1411(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3548 * super.field3548;
            for (int var8 = 0; var8 < class253.field4565; ++var8) {
                int var9 = super.field3549[var7 - -(var8 % super.field3547)];
                var6[var8] = class69.method443(var9 << 4, 4080);
                var5[var8] = class69.method443(var9, 65280) >> 4;
                var4[var8] = class69.method443(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(B)V")
    public static final void method1855(byte arg0) {
        if (arg0 > -63) {
            field4784 = null;
        }
        if (class93.field1741 < class246.field4502) {
            class93.field1741 = (float) ((double) class93.field1741 / 30.0D + (double) class93.field1741);
            if (class93.field1741 > class246.field4502) {
                class93.field1741 = class246.field4502;
            }
            class69.method456(1);
        } else if (class93.field1741 > class246.field4502) {
            class93.field1741 = (float) ((double) class93.field1741 - (double) class93.field1741 / 30.0D);
            if (class93.field1741 < class246.field4502) {
                class93.field1741 = class246.field4502;
            }
            class69.method456(1);
        }
        ++field4785;
        if (class4.field32 != -1 && ~class109.field2089 != 0) {
            int var1 = -class135.field2528 + class4.field32;
            int var2 = -class102.field1905 + class109.field2089;
            if (~var2 > -3 || ~var2 < -3) {
                var2 >>= 4;
            }
            if (~var1 > -3 || var1 > 2) {
                var1 >>= 4;
            }
            if (var1 == 0 && ~var2 == -1) {
                class4.field32 = -1;
                class109.field2089 = -1;
            }
            class135.field2528 -= -var1;
            class102.field1905 -= -var2;
            class69.method456(1);
        }
    }
}
