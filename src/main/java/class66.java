import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class66 extends class64 {

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    private int field1547 = 0;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    private int field1550 = 20;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    private int field1563 = 1365;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    private int field1567 = 0;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Lcd;")
    private static class23 field1549 = class54.method414("M", -1);

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "Lcd;")
    public static class23 field1548 = field1549;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lcd;")
    private static class23 field1561 = class54.method414("Password: ", -1);

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "Lcd;")
    public static class23 field1565 = field1549;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lcd;")
    public static class23 field1566 = class54.method414("", -1);

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Lcd;")
    public static class23 field1553 = field1566;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "Lcd;")
    public static class23 field1568 = field1561;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static final void method487(byte arg0) {
        ++field1559;
        while (class81.field1769.method627(class199.field3900, 105) >= 11) {
            int var1 = class81.field1769.method626(16789, 11);
            if (~var1 == -2048) {
                break;
            }
            boolean var2 = false;
            if (class95.field2007[var1] == null) {
                var2 = true;
                class95.field2007[var1] = new class57();
                if (class151.field3013[var1] != null) {
                    class95.field2007[var1].method437(class151.field3013[var1], arg0 ^ -57);
                }
            }
            class69.field1622[class57.field1348++] = var1;
            class57 var3 = class95.field2007[var1];
            var3.field266 = class15.field339;
            int var4 = class81.field1769.method626(16789, 1);
            int var5 = class81.field1769.method626(arg0 + 16881, 1);
            if (~var5 == -2) {
                class160.field3202[class108.field2307++] = var1;
            }
            int var6 = class81.field1769.method626(16789, 5);
            if (~var6 < -16) {
                var6 -= 32;
            }
            int var7 = class81.field1769.method626(16789, 5);
            int var8 = class25.field550[class81.field1769.method626(16789, 3)];
            if (var2) {
                var3.field227 = var3.field264 = var8;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method70(class134.field2790.field219[0] - -var7, (byte) 124, var4 == 1, class134.field2790.field230[0] - -var6);
        }
        class81.field1769.method630(-118);
        if (arg0 != -92) {
            method490((class47) null, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
    public static void method488(boolean arg0) {
        if (arg0) {
            method488(false);
        }
        field1561 = null;
        field1568 = null;
        field1548 = null;
        field1565 = null;
        field1553 = null;
        field1566 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        int[] var3 = super.field1513.method1033(-116, arg0);
        ++field1564;
        if (super.field1513.field3368) {
            for (int var4 = 0; var4 < class168.field3367; ++var4) {
                int var5 = (class95.field1995[arg0] << 12) / this.field1563 - -this.field1567;
                int var6 = (class174.field3475[var4] << 12) / this.field1563 + this.field1547;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6 * var6 >> 12;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                int var13 = var5;
                while (var10 + var11 < 16384 && ~this.field1550 < ~var12) {
                    ++var12;
                    var13 = (var9 * var13 >> 12) * 2 + var8;
                    var9 = var7 + var10 + -var11;
                    var10 = var9 * var9 >> 12;
                    var11 = var13 * var13 >> 12;
                }
                var3[var4] = this.field1550 + -1 <= var12 ? 0 : (var12 << 12) / this.field1550;
            }
        }
        if (arg1 != -9421) {
            field1548 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILkh;IIIZ)V")
    public static final void method489(int arg0, class97 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class58.field1371 = arg0;
        class190.field3775 = 1;
        int var6 = 64 / ((arg3 - -64) / 44);
        class91.field1951 = arg4;
        class124.field2540 = arg1;
        class74.field1683 = arg2;
        class138.field2854 = 10000;
        ++field1552;
        class102.field2185 = arg5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lfa;B)Lcd;")
    public static final class23 method490(class47 arg0, byte arg1) {
        if (arg1 > -48) {
            field1565 = null;
        }
        ++field1558;
        if (~class67.method492(class141.method909(arg0, -121), -1425314293) == -1) {
            return null;
        } else if (arg0.field1028 != null && ~arg0.field1028.method139(-13).method143(-41) != -1) {
            return arg0.field1028;
        } else {
            return class57.field1338 ? class7.field139 : null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 41 % ((arg0 - 7) / 43);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field1567 = arg2.method1197(-1);
                    }
                } else {
                    this.field1547 = arg2.method1197(-1);
                }
            } else {
                this.field1550 = arg2.method1197(-1);
            }
        } else {
            this.field1563 = arg2.method1197(-1);
        }
        ++field1562;
    }
}
