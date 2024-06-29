import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class51 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public int field817 = 2;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
    public boolean field819 = false;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Z")
    public boolean field818 = false;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Z")
    public boolean field828 = false;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "Z")
    public boolean field825 = false;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public int field838 = -1;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public int field840 = 5;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public int field841 = 99;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public int field834 = -1;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public int field839 = -1;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public int field848 = -1;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public int field849 = -1;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
    public static int[] field821 = new int[200];

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "[I")
    public int[] field835;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "[I")
    private int[] field836;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "[I")
    public int[] field845;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "[Z")
    public boolean[] field830;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "[[I")
    public int[][] field831;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLrc;IIIIII)Lrc;", line = 4)
    public final class100 method403(byte arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field832++;
        int var9 = this.field845[arg5];
        int var10 = this.field835[arg5];
        class293 var11 = class132.method1099(false, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method518((byte) 1, arg6, true);
        }
        class293 var13 = null;
        if ((this.field818 || class221.field3301) && arg2 != -1 && this.field835.length > arg2) {
            int var14 = this.field835[arg2];
            var13 = class132.method1099(false, var14 >> 16);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field828) {
            arg6 |= 0x200;
        }
        if (var11.method2049(-121, var12)) {
            arg6 |= 0x80;
        }
        if (var11.method2047(var12, arg4 ^ 0x19399C42)) {
            arg6 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2049(-104, arg2)) {
                arg6 |= 0x80;
            }
            if (var13.method2047(arg2, -423207056)) {
                arg6 |= 0x100;
            }
        }
        int var15 = arg6 | 0x20;
        class100 var16 = arg1.method518(arg0, var15, true);
        var16.method829(var11, arg2, var9, this.field828, -81, var13, arg7, arg3 - 1, var12);
        return arg4 == -15566 ? var16 : null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)V", line = 63)
    public static final void method404(boolean arg0, int arg1) {
        field829++;
        if (arg0 && class272.field4070 != null) {
            class45.field708 = class272.field4070.field4365;
        } else {
            class45.field708 = -1;
        }
        class356.field5064 = null;
        class331.field4759 = null;
        class272.field4070 = null;
        class358.field5117 = 0;
        class272.method1941();
        class272.field4075.method147(35);
        class200.field2925 = null;
        class14.field224 = null;
        class286.field4284 = null;
        class273.field4112 = null;
        class119.field1865 = null;
        class218.field3232 = null;
        class283.field4235 = null;
        class19.field280 = null;
        class270.field4049 = -1;
        class243.field3541 = -1;
        class272.field4074 = null;
        class21.field321 = null;
        class221.method1695(-1);
        class349.field4960 = null;
        class199.method1515(128, arg1, -78);
        class417.method2616(64, (byte) 97, 64);
        class397.method2537((byte) -27, 64);
        class373.method2374((byte) -57, 64);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 99)
    public final void method405(int arg0) {
        if (this.field848 == -1) {
            if (this.field830 == null) {
                this.field848 = 0;
            } else {
                this.field848 = 2;
            }
        }
        field847++;
        int var2 = -107 / ((24 - arg0) / 46);
        if (this.field839 != -1) {
            return;
        }
        if (this.field830 == null) {
            this.field839 = 0;
        } else {
            this.field839 = 2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)Lis;", line = 128)
    public static final class39 method406(boolean arg0) {
        field843++;
        if (!arg0) {
            field837 = -33;
        }
        class39 var1 = (class39) class230.field3362.method2488(2);
        if (var1 == null) {
            return new class39();
        } else {
            class164.field2470--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Z", line = 148)
    public static final boolean method407(int arg0, int arg1) {
        field833++;
        if (class297.field4392[arg0]) {
            return true;
        } else if (class311.field4535.method1357(arg0, (byte) 17)) {
            int var2 = class311.field4535.method1333(arg1 ^ arg1, arg0);
            if (var2 == 0) {
                class297.field4392[arg0] = true;
                return true;
            }
            if (class45.field710[arg0] == null) {
                class45.field710[arg0] = new class258[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class45.field710[arg0][var3] == null) {
                    byte[] var4 = class311.field4535.method1355(var3, -12607, arg0);
                    if (var4 != null) {
                        class258 var5 = class45.field710[arg0][var3] = new class258();
                        var5.field3854 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1863((byte) -111, new class37(var4));
                        } else {
                            var5.method1860(arg1 - 69, new class37(var4));
                        }
                    }
                }
            }
            class297.field4392[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lec;II)V", line = 215)
    private final void method408(class37 arg0, int arg1, int arg2) {
        field846++;
        int var4 = -73 % ((arg1 + 15) / 59);
        if (arg2 == 1) {
            int var14 = arg0.method320((byte) -87);
            this.field845 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field845[var15] = arg0.method320((byte) -87);
            }
            this.field835 = new int[var14];
            for (int var16 = 0; var16 < var14; var16++) {
                this.field835[var16] = arg0.method320((byte) -87);
            }
            for (int var17 = 0; var17 < var14; var17++) {
                this.field835[var17] += arg0.method320((byte) -87) << 16;
            }
        } else if (arg2 == 2) {
            this.field838 = arg0.method320((byte) -87);
        } else if (arg2 == 3) {
            this.field830 = new boolean[256];
            int var12 = arg0.method271((byte) 114);
            for (int var13 = 0; var13 < var12; var13++) {
                this.field830[arg0.method271((byte) 104)] = true;
            }
        } else if (arg2 == 4) {
            this.field825 = true;
        } else if (arg2 == 5) {
            this.field840 = arg0.method271((byte) 121);
        } else if (arg2 == 6) {
            this.field849 = arg0.method320((byte) -87);
        } else if (arg2 == 7) {
            this.field834 = arg0.method320((byte) -87);
        } else if (arg2 == 8) {
            this.field841 = arg0.method271((byte) 127);
        } else if (arg2 == 9) {
            this.field848 = arg0.method271((byte) 123);
        } else if (arg2 == 10) {
            this.field839 = arg0.method271((byte) 107);
        } else if (arg2 == 11) {
            this.field817 = arg0.method271((byte) 126);
        } else if (arg2 == 12) {
            int var5 = arg0.method271((byte) 106);
            this.field836 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field836[var6] = arg0.method320((byte) -87);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                this.field836[var7] += arg0.method320((byte) -87) << 16;
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method320((byte) -87);
            this.field831 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method271((byte) 115);
                if (var10 > 0) {
                    this.field831[var9] = new int[var10];
                    this.field831[var9][0] = arg0.method295(true);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field831[var9][var11] = arg0.method320((byte) -87);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field828 = true;
        } else if (arg2 == 15) {
            this.field818 = true;
            return;
        } else if (arg2 == 16) {
            this.field819 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lec;I)V", line = 383)
    public final void method409(class37 arg0, int arg1) {
        field822++;
        if (arg1 >= -4) {
            this.field849 = -7;
        }
        while (true) {
            int var3 = arg0.method271((byte) 111);
            if (var3 == 0) {
                return;
            }
            this.method408(arg0, -75, var3);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZIZ)I", line = 407)
    public final int method410(int arg0, boolean arg1, int arg2, boolean arg3) {
        field827++;
        if (arg1) {
            return 3;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field835[arg2];
        class293 var8 = null;
        class293 var9 = class132.method1099(arg1, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field818 || class221.field3301) && arg0 != -1 && this.field835.length > arg0) {
            int var11 = this.field835[arg0];
            var8 = class132.method1099(false, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field828) {
            var5 |= 0x200;
        }
        if (var9.method2049(-121, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2047(var10, -423207056)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method2049(-84, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2047(var6, -423207056)) {
                var5 |= 0x100;
            }
        }
        if (this.field836 != null && arg3) {
            if (arg2 < this.field836.length) {
                int var12 = this.field836[arg2];
                if (var12 != 65535) {
                    class293 var13 = class132.method1099(false, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2049(-81, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2047(var14, -423207056)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field818 || class221.field3301) && arg0 != -1 && this.field836.length > arg0) {
                int var15 = this.field836[arg0];
                if (var15 != 65535) {
                    class293 var16 = class132.method1099(false, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2049(-84, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2047(var17, -423207056)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V", line = 545)
    public static void method411(int arg0) {
        if (arg0 == 26848) {
            field821 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIILrc;)Lrc;", line = 557)
    public final class100 method412(int arg0, int arg1, int arg2, int arg3, int arg4, class100 arg5) {
        field842++;
        int var7 = this.field845[arg3];
        int var8 = this.field835[arg3];
        class293 var9 = class132.method1099(false, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method518((byte) 1, arg4, true);
        }
        class293 var11 = null;
        if ((this.field818 || class221.field3301) && arg2 != -1 && this.field835.length > arg2) {
            int var12 = this.field835[arg2];
            var11 = class132.method1099(false, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class293 var13 = null;
        class293 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field836 != null) {
            if (arg3 < this.field836.length) {
                var15 = this.field836[arg3];
                if (var15 != 65535) {
                    var13 = class132.method1099(false, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field818 || class221.field3301) && arg2 != -1 && arg2 < this.field836.length) {
                var16 = this.field836[arg2];
                if (var16 != 65535) {
                    var14 = class132.method1099(false, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field828) {
            arg4 |= 0x200;
        }
        if (var9.method2049(-70, var10)) {
            arg4 |= 0x80;
        }
        if (var9.method2047(var10, -423207056)) {
            arg4 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2049(-65, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method2047(var15, -423207056)) {
                arg4 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method2049(-114, arg2)) {
                arg4 |= 0x80;
            }
            if (var11.method2047(arg2, -423207056)) {
                arg4 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method2049(-73, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method2047(var16, -423207056)) {
                arg4 |= 0x100;
            }
        }
        int var17 = -92 % ((arg0 + 57) / 33);
        int var18 = arg4 | 0x20;
        class100 var19 = arg5.method518((byte) 1, var18, true);
        var19.method829(var9, arg2, var7, this.field828, -65, var11, 0, arg1 - 1, var10);
        if (var13 != null) {
            var19.method829(var13, var16, var7, this.field828, -85, var14, 0, arg1 - 1, var15);
        }
        return var19;
    }
}
