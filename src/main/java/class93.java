import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class93 extends class139 {

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "Z")
    private boolean field2015 = true;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "Z")
    private boolean field2022 = true;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field2010 = 0;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field2013 = 0;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "Lrf;")
    public static class163 field2021 = class53.method392(106, "(U3");

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Lu;")
    public static class184 field2011;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(II)Lwf;")
    public static final class208 method650(int arg0, int arg1) {
        ++field2017;
        class208 var2 = (class208) class135.field2787.method401((long) arg1, (byte) 93);
        if (var2 != null) {
            return var2;
        } else if (arg0 != 15575) {
            return null;
        } else {
            byte[] var3 = class185.field3702.method1235(arg1, (byte) -64, 13);
            class208 var4 = new class208();
            var4.field4062 = arg1;
            if (var3 != null) {
                var4.method1356((byte) 63, new class52(var3));
            }
            class135.field2787.method398(var4, (long) arg1, (byte) 80);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
    public static void method651(int arg0) {
        field2011 = null;
        int var1 = -68 % ((arg0 - 1) / 48);
        field2021 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field2023;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[][] var4 = this.method910((byte) -32, !this.field2022 ? arg1 : -arg1 + class15.field260, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            if (this.field2015) {
                for (int var11 = 0; ~class23.field402 < ~var11; ++var11) {
                    var7[var11] = var5[-var11 + class29.field542];
                    var8[var11] = var9[-var11 + class29.field542];
                    var10[var11] = var6[-var11 + class29.field542];
                }
            } else {
                for (int var12 = 0; ~class23.field402 < ~var12; ++var12) {
                    var7[var12] = var5[var12];
                    var8[var12] = var9[var12];
                    var10[var12] = var6[var12];
                }
            }
        }
        if (arg0 < 53) {
            field2021 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field2016;
        if (arg1 != 7451) {
            this.field2022 = false;
        }
        int[] var3 = super.field2859.method1319(-128, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(this.field2022 ? -arg0 + class15.field260 : arg0, 0, true);
            if (!this.field2015) {
                class123.method828(var4, 0, var3, 0, class23.field402);
            } else {
                for (int var5 = 0; ~class23.field402 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class29.field542];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class93() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZI)V")
    public static final void method652(int arg0, boolean arg1, int arg2) {
        int[] var3 = new int[4];
        ++field2018;
        var3[0] = arg0;
        int[] var4 = new int[4];
        var4[0] = arg2;
        if (!arg1) {
            method651(126);
        }
        int var5 = 1;
        for (int var6 = 0; ~var6 > -5; ++var6) {
            if (~class134.field2780[var6] != ~arg0) {
                var3[var5] = class134.field2780[var6];
                var4[var5] = class23.field399[var6];
                ++var5;
            }
        }
        class134.field2780 = var3;
        class23.field399 = var4;
        class208.method1355(class134.field2780, -15230, class25.field454, class23.field399, 0, class25.field454.length + -1);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lhd;")
    public static final class73 method653(byte arg0, int arg1) {
        ++field2020;
        class73 var2 = (class73) class162.field3264.method401((long) arg1, (byte) -18);
        if (var2 != null) {
            return var2;
        } else if (arg0 != 123) {
            return null;
        } else {
            byte[] var3 = class61.field1280.method1235(arg1, (byte) -64, 16);
            class73 var4 = new class73();
            if (var3 != null) {
                var4.method518(new class52(var3), -1);
            }
            class162.field3264.method398(var4, (long) arg1, (byte) 120);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 != 21) {
            method650(14, 10);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2872 = ~arg2.method344(255) == -2;
                }
            } else {
                this.field2022 = ~arg2.method344(255) == -2;
            }
        } else {
            this.field2015 = ~arg2.method344(255) == -2;
        }
        ++field2019;
    }
}
