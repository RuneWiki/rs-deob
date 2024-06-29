import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class148 extends class107 {

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    private int field2636 = 585;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Lpj;")
    public static class237 field2627 = class33.method353("<img=0>", 77);

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lpj;")
    public static class237 field2637 = class33.method353("Lade Konfiguration )2 ", 91);

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "Lpj;")
    public static class237 field2630 = class33.method353("::replacecanvas", 97);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2632 = Calendar.getInstance();

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "Lpj;")
    public static class237 field2641 = class33.method353("welle:", 123);

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2639;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public static final void method1002(int arg0) {
        class223.field3830.method368(-122, 13);
        ++field2634;
        ++class87.field1597;
        class223.field3830.method292(124, 0L);
        if (arg0 != 29165) {
            field2639 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field2628;
        if (arg2 != -32513) {
            this.method123((byte) -113, -49);
        }
        if (arg1 == 0) {
            this.field2636 = arg0.method339(arg2 + -16744703);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method1003(int arg0, int arg1) {
        ++field2635;
        short var2 = 256;
        if (arg1 >= -2) {
            method1004(62);
        }
        if (~var2 > ~arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class100.field1779 += arg0 * 128;
        if (class100.field1779 > class29.field595.length) {
            class100.field1779 -= class29.field595.length;
            int var3 = (int) (12.0D * Math.random());
            class223.method1478((byte) 1, class3.field34[var3]);
        }
        int var4 = arg0 * 128;
        int var5 = (var2 - arg0) * 128;
        int var6 = 0;
        for (int var7 = 0; ~var7 > ~var5; ++var7) {
            int var26 = class259.field4448[var4 + var6] - class29.field595[class29.field595.length + -1 & var6 - -class100.field1779] * arg0 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class259.field4448[var6++] = var26;
        }
        for (int var8 = -arg0 + var2; var8 < var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (var25 < 50 && var24 > 10 && ~var24 > -119) {
                    class259.field4448[var24 - -var23] = 255;
                } else {
                    class259.field4448[var24 - -var23] = 0;
                }
            }
        }
        for (int var9 = 0; ~(-arg0 + var2) < ~var9; ++var9) {
            class229.field3910[var9] = class229.field3910[arg0 + var9];
        }
        for (int var10 = -arg0 + var2; ~var10 > ~var2; ++var10) {
            class229.field3910[var10] = (int) (16.0D * Math.sin((double) class55.field1136 / 14.0D) + 14.0D * Math.sin((double) class55.field1136 / 15.0D) + 12.0D * Math.sin((double) class55.field1136 / 16.0D));
            ++class55.field1136;
        }
        class239.field4215 += arg0;
        int var11 = ((class241.field4246 & 1) + arg0) / 2;
        if (var11 > 0) {
            for (int var12 = 0; ~var12 > ~class239.field4215; ++var12) {
                int var21 = 2 + (int) (Math.random() * 124.0D);
                int var22 = 128 + (int) (128.0D * Math.random());
                class259.field4448[var21 - -(var22 << 7)] = 192;
            }
            class239.field4215 = 0;
            for (int var13 = 0; var13 < var2; ++var13) {
                int var18 = var13 * 128;
                int var19 = 0;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (~(var20 - -var11) > -129) {
                        var19 += class259.field4448[var20 - -var18 + var11];
                    }
                    if (~(-var11 + -1 + var20) <= -1) {
                        var19 -= class259.field4448[var18 + -1 + -var11 + var20];
                    }
                    if (var20 >= 0) {
                        class238.field4165[var18 + var20] = var19 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; ~var16 > ~var2; ++var16) {
                    int var17 = var16 * 128;
                    if (~var2 < ~(var11 + var16)) {
                        var15 += class238.field4165[var14 - -(var11 * 128) + var17];
                    }
                    if (~(var16 - 1 - var11) <= -1) {
                        var15 -= class238.field4165[-(var11 * 128) + -128 + var17 + var14];
                    }
                    if (~var16 <= -1) {
                        class259.field4448[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field2631;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (arg0 != -17) {
            return null;
        } else {
            if (super.field1921.field3539) {
                int var4 = class185.field3233[arg1];
                for (int var5 = 0; ~class106.field1862 < ~var5; ++var5) {
                    int var6 = class182.field3199[var5];
                    if (~this.field2636 > ~var6 && ~(-this.field2636 + 4096) < ~var6 && 2048 - this.field2636 < var4 && ~var4 > ~(2048 - -this.field2636)) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 <= -1 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field2636 + 2048);
                        var3[var5] = 4096 - var10;
                    } else if (~var6 < ~(2048 - this.field2636) && ~(2048 - -this.field2636) < ~var6) {
                        int var11 = var4 - 2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field2636;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field2636 + 2048);
                    } else if (~this.field2636 >= ~var4 && ~var4 >= ~(-this.field2636 + 4096)) {
                        if (~var6 <= ~this.field2636 && ~(-this.field2636 + 4096) <= ~var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = ~var15 <= -1 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (2048 - this.field2636);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 >= 0 ? var19 : -var19;
                        int var21 = var20 - this.field2636;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field2636 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)V")
    public static void method1004(int arg0) {
        field2639 = null;
        field2637 = null;
        if (arg0 != -27283) {
            method1002(49);
        }
        field2627 = null;
        field2641 = null;
        field2630 = null;
        field2632 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(J[III)Lpj;")
    public static final class237 method1005(long arg0, int[] arg1, int arg2, int arg3) {
        ++field2638;
        if (class90.field1649 != null) {
            class237 var5 = class90.field1649.method1412(-7, arg3, arg1, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (~arg3 == -6) {
            return class146.method995(270, arg0).method1581((byte) -93);
        } else {
            if (arg2 <= 126) {
                field2641 = null;
            }
            return class273.method1822((byte) 83, arg0);
        }
    }
}
