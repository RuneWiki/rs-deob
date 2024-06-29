import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class79 extends class64 {

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    private int field1733 = 585;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "Lcd;")
    public static class23 field1729 = class54.method414("Lade)3)3)3", -1);

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "[I")
    public static int[] field1728;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B[B)Lcg;")
    public static final class26 method539(byte arg0, byte[] arg1) {
        ++field1732;
        if (arg0 > -35) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            class26 var2 = new class26(arg1, class107.field2287, class15.field329, class72.field1652, class109.field2311, class133.field2756, class129.field2698);
            class175.method1101(-106);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method540(int arg0) {
        field1729 = null;
        field1728 = null;
        if (arg0 >= -123) {
            method539((byte) 6, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class79() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1731;
        int[] var3 = super.field1513.method1033(-88, arg0);
        if (arg1 != -9421) {
            return null;
        } else {
            if (super.field1513.field3368) {
                int var4 = class95.field1995[arg0];
                for (int var5 = 0; ~class168.field3367 < ~var5; ++var5) {
                    int var6 = class174.field3475[var5];
                    if (~var6 < ~this.field1733 && -this.field1733 + 4096 > var6 && ~(-this.field1733 + 2048) > ~var4 && this.field1733 + 2048 > var4) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field1733 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~var6 < ~(-this.field1733 + 2048) && this.field1733 + 2048 > var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 <= -1 ? var11 : -var11;
                        int var13 = var12 - this.field1733;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field1733);
                    } else if (~var4 <= ~this.field1733 && var4 <= -this.field1733 + 4096) {
                        if (~var6 <= ~this.field1733 && var6 <= -this.field1733 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field1733 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 <= -1 ? var19 : -var19;
                        int var21 = var20 - this.field1733;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field1733 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field1727;
        int var4 = -97 / ((7 - arg0) / 43);
        if (arg1 == 0) {
            this.field1733 = arg2.method1197(-1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public static final void method541(int arg0) {
        class104.field2207 = new int[151];
        if (arg0 != 4491) {
            field1729 = null;
        }
        ++field1726;
        class35.field709 = new int[33];
        field1728 = new int[151];
        class34.field701 = new int[33];
        for (int var1 = 0; ~var1 > -34; ++var1) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; ++var8) {
                if (class168.field3357.field2702[class168.field3357.field2706 * var1 + var8] != 0) {
                    if (~var6 != -1000) {
                        var7 = var8;
                        break;
                    }
                } else if (~var6 == -1000) {
                    var6 = var8;
                }
            }
            class35.field709[var1] = var6;
            class34.field701[var1] = -var6 + var7;
        }
        for (int var2 = 5; ~var2 > -157; ++var2) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; ~var5 > -173; ++var5) {
                if (~class168.field3357.field2702[class168.field3357.field2706 * var2 + var5] != -1 || ~var5 >= -35 && ~var2 >= -35) {
                    if (var3 != 999) {
                        var4 = var5;
                        break;
                    }
                } else if (~var3 == -1000) {
                    var3 = var5;
                }
            }
            field1728[var2 - 5] = var3 - 25;
            class104.field2207[var2 + -5] = -var3 + var4;
        }
    }
}
