import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class51 extends class228 {

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    private int field845 = 32768;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "[Z")
    public static boolean[] field839 = new boolean[112];

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Loa;")
    public static class99 field843 = class221.method1463(2844, "Atteindre");

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "[I")
    public static int[] field848 = new int[100];

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Lwk;")
    public static class273 field835 = new class273(30);

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field849 = 0;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lac;")
    public static class135 field844;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static void method354(int arg0) {
        field843 = null;
        if (arg0 != 0) {
            field835 = null;
        }
        field839 = null;
        field844 = null;
        field835 = null;
        field848 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIIII)V")
    public static final void method355(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 <= ~arg4) {
            class175.method1174(class124.field2177[arg1], arg3, -7, arg4, arg2);
        } else {
            class175.method1174(class124.field2177[arg1], arg3, -7, arg2, arg4);
        }
        int var5 = -78 % ((3 - arg0) / 55);
        ++field840;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field837;
        class129.method854((byte) -110);
        if (arg0 != -8) {
            field844 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field836;
        if (arg1 != -3) {
            method355((byte) -104, 47, 102, 36, -24);
        }
        int[] var3 = super.field3952.method1262(arg0, arg1 + 7495);
        if (super.field3952.field3276) {
            int[] var4 = this.method1500(arg0, 1, (byte) 109);
            int[] var5 = this.method1500(arg0, 2, (byte) 119);
            for (int var6 = 0; var6 < class234.field4046; ++var6) {
                int var7 = (4083 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field845 >> 12;
                int var9 = class123.field2164[var7] * var8 >> 12;
                int var10 = class217.field3766[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class190.field3345;
                int var12 = class250.field4309 & arg0 - -(var10 >> 12);
                int[] var13 = this.method1500(var12, 0, (byte) 119);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field3943 = ~arg1.method1693((byte) -80) == -2;
            }
        } else {
            this.field845 = arg1.method1740((byte) 107) << 4;
        }
        if (arg2 == -7618) {
            ++field846;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class51() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public static final void method356(int arg0) {
        ++field838;
        if (arg0 < -24) {
            class131.field2277.method966((byte) 49, 73);
            class131.field2277.method1745(class145.field2571, (byte) 5);
            ++class102.field1732;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[I)[I")
    public static final int[] method357(int arg0, int[] arg1) {
        ++field842;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            if (arg0 != 32515) {
                return null;
            } else {
                class241.method1567(arg1, 0, var2, 0, arg1.length);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)I")
    public static final int method358(byte arg0, int arg1) {
        ++field841;
        if (class133.field2322 != null) {
            class133.field2322.method54((byte) 3);
            class133.field2322 = null;
        }
        if (arg0 != 80) {
            return 111;
        } else {
            ++class265.field4691;
            if (~class265.field4691 < -5) {
                class103.field1752 = 0;
                class265.field4691 = 0;
                return arg1;
            } else {
                if (class256.field4424 != class202.field3523) {
                    class202.field3523 = class256.field4424;
                } else {
                    class202.field3523 = class289.field5056;
                }
                class103.field1752 = 0;
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field847;
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[] var4 = this.method1500(arg1, 1, (byte) 125);
            int[] var5 = this.method1500(arg1, 2, (byte) 107);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class234.field4046; ++var9) {
                int var10 = (1046948 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field845 >> 12;
                int var12 = class123.field2164[var10] * var11 >> 12;
                int var13 = class217.field3766[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class190.field3345;
                int var15 = class250.field4309 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1502(arg0 ^ -230, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 != -27) {
            this.method106(127, -81);
        }
        return var3;
    }
}
