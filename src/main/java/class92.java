import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class92 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lkh;")
    public static class117 field1689 = class224.method1450((byte) 24, " GMT");

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1695 = -1;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lkh;")
    public static class117 field1694 = class224.method1450((byte) 17, ":assistreq:");

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
    public static int[] field1688 = new int[1000];

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1697 = -1;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lkh;")
    public static class117 field1699 = class224.method1450((byte) -2, "l");

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[Lch;")
    public static class31[] field1696;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1694 = null;
        if (arg0 <= 12) {
            method634((byte) 39, null);
        }
        field1696 = null;
        field1689 = null;
        field1699 = null;
        field1688 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLve;)V")
    public static final void method634(byte arg0, class234 arg1) {
        field1690++;
        if (arg1.field4262 == 0) {
            return;
        }
        if (arg1.field4280 != -1 && arg1.field4280 < 32768) {
            class207 var2 = class1.field18[arg1.field4280];
            if (var2 != null) {
                int var3 = arg1.field4221 - var2.field4221;
                int var4 = arg1.field4244 - var2.field4244;
                if (var4 != 0 || var3 != 0) {
                    arg1.field4249 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field4280 >= 32768) {
            int var5 = arg1.field4280 - 32768;
            if (class72.field1387 == var5) {
                var5 = 2047;
            }
            class56 var6 = class43.field950[var5];
            if (var6 != null) {
                int var7 = arg1.field4221 - var6.field4221;
                int var8 = arg1.field4244 - var6.field4244;
                if (var8 != 0 || var7 != 0) {
                    arg1.field4249 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 != 30) {
            method635(-42);
        }
        if ((arg1.field4245 != 0 || arg1.field4237 != 0) && (arg1.field4272 == 0 || arg1.field4260 > 0)) {
            int var9 = (arg1.field4256 - 1) * 64 + arg1.field4244 - (arg1.field4245 - class143.field2591 - class143.field2591) * 64;
            int var10 = (arg1.field4256 - 1) * 64 + arg1.field4221 - (-class184.field3319 + arg1.field4237 - class184.field3319) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field4249 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field4245 = 0;
            arg1.field4237 = 0;
        }
        int var11 = arg1.field4249 - arg1.field4232 & 0x7FF;
        if (var11 == 0) {
            arg1.field4277 = 0;
            return;
        }
        arg1.field4277++;
        if (var11 > 1024) {
            arg1.field4232 -= arg1.field4262;
            boolean var12 = true;
            if (var11 < arg1.field4262 || var11 > 2048 - arg1.field4262) {
                var12 = false;
                arg1.field4232 = arg1.field4249;
            }
            if (arg1.field4251 == arg1.field4224 && (arg1.field4277 > 25 || var12)) {
                if (arg1.field4273 == -1) {
                    arg1.field4224 = arg1.field4257;
                } else {
                    arg1.field4224 = arg1.field4273;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field4232 += arg1.field4262;
            if (arg1.field4262 > var11 || 2048 - arg1.field4262 < var11) {
                arg1.field4232 = arg1.field4249;
                var13 = false;
            }
            if (arg1.field4251 == arg1.field4224 && (arg1.field4277 > 25 || var13)) {
                if (arg1.field4250 == -1) {
                    arg1.field4224 = arg1.field4257;
                } else {
                    arg1.field4224 = arg1.field4250;
                }
            }
        }
        arg1.field4232 &= 0x7FF;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method635(int arg0) {
        field1693++;
        class104.field1895.method503(10);
        if (arg0 != 0) {
            field1691 = 27;
        }
    }
}
