import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class467 extends class337 {

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field6744 = -1;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "Lob;")
    public static class521 field6750;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "Lob;")
    public static class521 field6753;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "[Lbo;")
    public static class515[] field6758;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public int field6743;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public int field6752;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[I")
    public int[] field6746;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public final void method1124(int arg0) {
        super.method1124(arg0);
        if (arg0 != 17165) {
            this.field6744 = -86;
        }
        ++field6757;
        this.field6746 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -82 % ((arg0 - 82) / 40);
        if (arg1 == 0) {
            this.field6744 = arg2.method1511(-96);
        }
        ++field6745;
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public static final void method2817(int arg0) {
        ++field6751;
        class211 var1 = class452.method2749(15, -45, arg0);
        var1.method1460(true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BB)C")
    public static final char method2818(byte arg0, byte arg1) {
        ++field6754;
        int var2 = 255 & arg0;
        int var3 = -21 % ((38 - arg1) / 56);
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && ~var2 > -161) {
                char var4 = class190.field3210[var2 - 128];
                if (~var4 == -1) {
                    var4 = '?';
                }
                var2 = var4;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)Z")
    public final boolean method2819(int arg0) {
        if (arg0 < 0) {
            this.method2819(-116);
        }
        ++field6742;
        if (this.field6746 != null) {
            return true;
        } else if (this.field6744 >= 0) {
            class84 var2 = ~class213.field3477 <= -1 ? class84.method702(class172.field2557, class213.field3477, this.field6744) : class84.method694(class172.field2557, this.field6744);
            var2.method706();
            this.field6746 = var2.method701();
            this.field6752 = var2.field1207;
            this.field6743 = var2.field1204;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZ)V")
    public static final void method2820(boolean arg0, boolean arg1) {
        while (true) {
            if (~class238.field3819.method1753(arg1, class142.field2164) <= -16) {
                int var2 = class238.field3819.method1760(15, true);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (class153.field2265[var2] == null) {
                        class153.field2265[var2] = new class116();
                        class153.field2265[var2].field1881 = var2;
                        var3 = true;
                    }
                    class116 var4 = class153.field2265[var2];
                    class470.field6797[class167.field2471++] = var2;
                    var4.field1882 = class475.field6854;
                    if (var4.field1763 != null && var4.field1763.method253((byte) -100)) {
                        class134.method979((byte) -115, var4);
                    }
                    var4.method877(class175.field2605.method2782(class238.field3819.method1760(14, !arg1), (byte) -87), 28766);
                    int var5 = class238.field3819.method1760(2, !arg1);
                    int var6;
                    if (!arg0) {
                        var6 = class238.field3819.method1760(5, true);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    } else {
                        var6 = class238.field3819.method1760(8, !arg1);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    }
                    int var7;
                    if (!arg0) {
                        var7 = class238.field3819.method1760(5, !arg1);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    } else {
                        var7 = class238.field3819.method1760(8, true);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    }
                    int var8 = class238.field3819.method1760(1, true);
                    int var9 = 15334 & class238.field3819.method1760(3, true) - -4 << 11;
                    int var10 = class238.field3819.method1760(1, true);
                    if (~var10 == -2) {
                        class10.field140[class121.field1827++] = var2;
                    }
                    var4.method945(-30749, var4.field1763.field494);
                    var4.field1934 = var4.field1763.field490 << 3;
                    if (~var4.field1934 != -1) {
                        if (var3) {
                            var4.method952(-443277064, var9);
                        }
                    } else {
                        var4.method952(-443277064, 0);
                    }
                    var4.method876(~var8 == -2, var4.method953(-128), var5, class398.field5947.field1978[0] + var7, 0, class398.field5947.field1976[0] + var6);
                    if (var4.field1763.method253((byte) -100)) {
                        class471.method2842(var4.field1976[0], (class69) null, (byte) 117, var4.field5826, var4, 0, var4.field1978[0], (class177) null);
                    }
                    continue;
                }
            }
            ++field6756;
            class238.field3819.method1757(-111);
            if (arg1) {
                method2820(true, true);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)V")
    public static void method2821(int arg0) {
        field6753 = null;
        field6750 = null;
        field6758 = null;
        if (arg0 != 16) {
            method2817(-27);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class467() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[[I")
    public int[][] method673(int arg0, int arg1) {
        ++field6747;
        int var3 = -84 % ((arg1 - -41) / 49);
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346 && this.method2819(111)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = this.field6743 * (~class329.field4952 == ~this.field6752 ? arg0 : this.field6752 * arg0 / class329.field4952);
            if (~class402.field5977 == ~this.field6743) {
                for (int var9 = 0; ~var9 > ~class402.field5977; ++var9) {
                    int var10 = this.field6746[var8++];
                    var7[var9] = class74.method644(4080, var10 << 4);
                    var6[var9] = class74.method644(65280, var10) >> 4;
                    var5[var9] = class74.method644(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class402.field5977; ++var11) {
                    int var12 = this.field6743 * var11 / class402.field5977;
                    int var13 = this.field6746[var8 + var12];
                    var7[var11] = class74.method644(var13 << 4, 4080);
                    var6[var11] = class74.method644(4080, var13 >> 4);
                    var5[var11] = class74.method644(var13 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lya;ZLul;Lul;)V")
    public static final void method2822(class38 arg0, boolean arg1, class406 arg2, class406 arg3) {
        ++field6749;
        class431.field6391 = class33.method230(21108, class299.field4546, arg2, 0);
        class45.field585 = arg0.method366(class431.field6391, class84.method698(arg3, class299.field4546, 0), true);
        class401.field5963 = class33.method230(21108, class309.field4661, arg2, 0);
        class313.field4722 = arg0.method366(class401.field5963, class84.method698(arg3, class309.field4661, 0), true);
        class380.field5735 = class33.method230(21108, class460.field6695, arg2, 0);
        class185.field2805 = arg0.method366(class380.field5735, class84.method698(arg3, class460.field6695, 0), arg1);
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)V")
    public static final void method2823(int arg0) {
        ++field6755;
        int var1 = class199.field3323 * 128 + 64;
        int var2 = class273.field4188 * 128 + 64;
        int var3 = class172.method1153(class154.field2286, -4, var1, var2) - class347.field5126;
        if (class480.field6915 < 100) {
            if (var1 > class412.field6180) {
                class412.field6180 += (-class412.field6180 + var1) * class480.field6915 / 1000 + class55.field684;
                if (~class412.field6180 < ~var1) {
                    class412.field6180 = var1;
                }
            }
            if (class473.field6831 < var3) {
                class473.field6831 += (-class473.field6831 + var3) * class480.field6915 / 1000 + class55.field684;
                if (~class473.field6831 < ~var3) {
                    class473.field6831 = var3;
                }
            }
            if (var1 < class412.field6180) {
                class412.field6180 -= (-var1 + class412.field6180) * class480.field6915 / 1000 + class55.field684;
                if (~var1 < ~class412.field6180) {
                    class412.field6180 = var1;
                }
            }
            if (class473.field6831 > var3) {
                class473.field6831 -= (class473.field6831 - var3) * class480.field6915 / 1000 + class55.field684;
                if (class473.field6831 < var3) {
                    class473.field6831 = var3;
                }
            }
            if (var2 > class71.field1024) {
                class71.field1024 += (var2 - class71.field1024) * class480.field6915 / 1000 + class55.field684;
                if (~var2 > ~class71.field1024) {
                    class71.field1024 = var2;
                }
            }
            if (~var2 > ~class71.field1024) {
                class71.field1024 -= (-var2 + class71.field1024) * class480.field6915 / 1000 + class55.field684;
                if (~class71.field1024 > ~var2) {
                    class71.field1024 = var2;
                }
            }
        } else {
            class71.field1024 = class273.field4188 * 128 - -64;
            class412.field6180 = class199.field3323 * 128 + 64;
            class473.field6831 = class172.method1153(class154.field2286, -4, class412.field6180, class71.field1024) + -class347.field5126;
        }
        int var4 = class299.field4545 * 128 + 64;
        int var5 = class121.field1828 * 128 - -64;
        int var6 = class172.method1153(class154.field2286, arg0 + -1028, var5, var4) + -class398.field5952;
        int var7 = -class412.field6180 + var5;
        int var8 = -class473.field6831 + var6;
        int var9 = var4 - class71.field1024;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 16383;
        if (var11 < arg0) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 16383;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (~class419.field6263 > ~var11) {
            class419.field6263 += (-class419.field6263 + var11 >> 3) * class412.field6175 / 1000 + class197.field3290 << 3;
            if (var11 < class419.field6263) {
                class419.field6263 = var11;
            }
        }
        if (~var11 > ~class419.field6263) {
            class419.field6263 -= (class419.field6263 - var11 >> 3) * class412.field6175 / 1000 + class197.field3290 << 3;
            if (var11 > class419.field6263) {
                class419.field6263 = var11;
            }
        }
        int var13 = -class396.field5932 + var12;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (~var14 < -1) {
            class396.field5932 += class412.field6175 * var14 / 1000 + class197.field3290 << 3;
            class396.field5932 &= 16383;
        }
        if (~var14 > -1) {
            class396.field5932 -= class197.field3290 - -(-var14 * class412.field6175 / 1000) << 3;
            class396.field5932 &= 16383;
        }
        int var15 = -class396.field5932 + var12;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (~var15 > 8191) {
            var15 += 16384;
        }
        if (var15 < 0 && ~var14 < -1 || var15 > 0 && var14 < 0) {
            class396.field5932 = var12;
        }
        class364.field5380 = 0;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)I")
    public final int method2122(int arg0) {
        ++field6748;
        if (arg0 != 0) {
            this.method2122(104);
        }
        return this.field6744;
    }

    static {
        new class234((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field6750 = new class521(58, 3);
        field6753 = new class521(2, 6);
        field6758 = new class515[30];
    }
}
