import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class206 extends class12 {

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    private int field3965 = -1;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
    public static boolean field3951 = true;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Ltg;")
    public static class184 field3955 = class135.method812("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 3);

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Ltg;")
    public static class184 field3964 = class135.method812("leuchten1:", 3);

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field3963 = 0;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "Ltg;")
    public static class184 field3966 = class135.method812("Bitte geben Sie Ihr Passwort ein)3", 3);

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "Ltg;")
    public static class184 field3961 = class135.method812("::fpson", 3);

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Lvb;")
    public static class197 field3959;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "[I")
    private int[] field3949;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[Loe;")
    public static class137[] field3952;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field3955 = null;
        if (arg0 < 105) {
            field3964 = null;
        }
        field3966 = null;
        field3961 = null;
        field3964 = null;
        field3959 = null;
        field3952 = null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
    public static final int method1302(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field3950;
        int[][] var3 = super.field232.method673(arg0, -11);
        int var4 = 41 % ((arg1 - -58) / 34);
        if (super.field232.field1962 && this.method1303(110)) {
            int[] var5 = var3[0];
            int var6 = this.field3962 * (~class114.field2074 == ~this.field3953 ? arg0 : this.field3953 * arg0 / class114.field2074);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            if (class201.field3889 == this.field3962) {
                for (int var9 = 0; ~var9 > ~class201.field3889; ++var9) {
                    int var10 = this.field3949[var6++];
                    var7[var9] = class10.method61(var10, 255) << 4;
                    var8[var9] = class10.method61(65280, var10) >> 4;
                    var5[var9] = class10.method61(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class201.field3889 < ~var11; ++var11) {
                    int var12 = this.field3962 * var11 / class201.field3889;
                    int var13 = this.field3949[var6 + var12];
                    var7[var11] = class10.method61(var13, 255) << 4;
                    var8[var11] = class10.method61(var13, 65280) >> 4;
                    var5[var11] = class10.method61(16711680, var13) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != -1) {
            method1305(-50);
        }
        ++field3968;
        return this.field3965;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)Z")
    private final boolean method1303(int arg0) {
        ++field3957;
        if (this.field3949 != null) {
            return true;
        } else if (arg0 <= 76) {
            return true;
        } else if (this.field3965 >= 0) {
            int var2 = class15.field291.method364(this.field3965, false) ? 64 : 128;
            this.field3949 = class15.field291.method361(this.field3965, -3892);
            this.field3953 = var2;
            this.field3962 = var2;
            return this.field3949 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([Ltg;III)Ltg;")
    public static final class184 method1304(class184[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        if (arg2 != -22629) {
            field3955 = null;
        }
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 - -var5] = class35.field645;
            }
            var4 += arg0[arg3 + var5].field3555;
        }
        byte[] var6 = new byte[var4];
        ++field3960;
        int var7 = 0;
        for (int var8 = 0; ~arg1 < ~var8; ++var8) {
            class184 var10 = arg0[arg3 + var8];
            class93.method539(var10.field3527, 0, var6, var7, var10.field3555);
            var7 += var10.field3555;
        }
        class184 var9 = new class184();
        var9.field3527 = var6;
        var9.field3555 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)Z")
    public static final boolean method1305(int arg0) {
        ++field3954;
        try {
            if (class101.field1875 == 2) {
                if (class88.field1654 == null) {
                    class88.field1654 = class163.method978(class122.field2177, class111.field2011, class209.field4006);
                    if (class88.field1654 == null) {
                        return false;
                    }
                }
                if (class21.field406 == null) {
                    class21.field406 = new class8(class198.field3863, class14.field276);
                }
                if (class130.field2362.method499(22050, class88.field1654, false, class21.field406, class110.field1983)) {
                    class130.field2362.method476((byte) 112);
                    class130.field2362.method484(-157, class175.field3325);
                    class130.field2362.method488(class149.field2678, false, class88.field1654);
                    class88.field1654 = null;
                    class122.field2177 = null;
                    class101.field1875 = 0;
                    class21.field406 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class130.field2362.method486(true);
            class101.field1875 = 0;
            class122.field2177 = null;
            class21.field406 = null;
            class88.field1654 = null;
        }
        int var2 = -99 / ((-56 - arg0) / 34);
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            this.field3965 = arg0.method611(false);
        }
        if (arg2) {
            method1305(-121);
        }
        ++field3958;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public static final void method1306(int arg0) {
        ++field3967;
        if (arg0 > 59) {
            while (class21.field394.method104(false, class111.field2014) >= 11) {
                int var1 = class21.field394.method115(11, 104);
                if (var1 == 2047) {
                    break;
                }
                boolean var2 = false;
                if (class57.field1024[var1] == null) {
                    class57.field1024[var1] = new class67();
                    var2 = true;
                    if (class21.field390[var1] != null) {
                        class57.field1024[var1].method394((byte) 3, class21.field390[var1]);
                    }
                }
                class200.field3880[class26.field466++] = var1;
                class67 var3 = class57.field1024[var1];
                var3.field609 = class161.field2903;
                int var4 = class21.field394.method115(1, 104);
                if (var4 == 1) {
                    class103.field1881[class87.field1610++] = var1;
                }
                int var5 = class21.field394.method115(1, 104);
                int var6 = class21.field394.method115(5, 104);
                if (~var6 < -16) {
                    var6 -= 32;
                }
                int var7 = class153.field2740[class21.field394.method115(3, 104)];
                if (var2) {
                    var3.field649 = var3.field647 = var7;
                }
                int var8 = class21.field394.method115(5, 104);
                if (~var8 < -16) {
                    var8 -= 32;
                }
                var3.method212(-9740, class46.field872.field615[0] + var8, class46.field872.field644[0] + var6, ~var5 == -2);
            }
            class21.field394.method107((byte) -78);
        }
    }
}
