import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class138 extends class89 {

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    private int field2479 = -1;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Lbl;")
    public static class128 field2477;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "[I")
    public int[] field2486;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "[Lvi;")
    public static class249[] field2480;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Llc;")
    public static final class272 method1054(int arg0, int arg1) {
        class272 var2 = (class272) class207.field3713.method86(7961, (long) arg1);
        ++field2478;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class181.field3252.method1293(class113.method917(arg1, -122), class64.method447((byte) 96, arg1), (byte) -118);
            class272 var4 = new class272();
            var4.field4748 = arg1;
            if (var3 != null) {
                var4.method1837(new class75(var3), (byte) -19);
            }
            if (arg0 != -22225) {
                return null;
            } else {
                class207.field3713.method80(var4, (long) arg1, (byte) 67);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public static void method1055(boolean arg0) {
        if (!arg0) {
            field2477 = null;
        }
        field2480 = null;
        field2477 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class173.field3076 * 128) {
            arg0 = class173.field3076 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class128.field2359 * 128) {
            arg2 = class128.field2359 * 128 - 1;
        }
        class254.field4454 = class62.field1042[arg3];
        class261.field4554 = class62.field1049[arg3];
        class169.field3009 = class62.field1042[arg4];
        class171.field3049 = class62.field1049[arg4];
        class93.field1751 = arg0;
        class200.field3577 = arg1;
        class118.field2224 = arg2;
        class258.field4503 = arg0 / 128;
        class267.field4623 = arg2 / 128;
        class127.field2323 = class258.field4503 - class81.field1538;
        if (class127.field2323 < 0) {
            class127.field2323 = 0;
        }
        class53.field923 = class267.field4623 - class81.field1538;
        if (class53.field923 < 0) {
            class53.field923 = 0;
        }
        class42.field716 = class81.field1538 + class258.field4503;
        if (class42.field716 > class173.field3076) {
            class42.field716 = class173.field3076;
        }
        class113.field2141 = class81.field1538 + class267.field4623;
        if (class113.field2141 > class128.field2359) {
            class113.field2141 = class128.field2359;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class81.field1538 + class81.field1538 + 2; ++var16) {
            for (int var19 = 0; var19 < class81.field1538 + class81.field1538 + 2; ++var19) {
                int var20 = (var16 - class81.field1538 << 7) - (class93.field1751 & 127);
                int var21 = (var19 - class81.field1538 << 7) - (class118.field2224 & 127);
                int var22 = class258.field4503 - class81.field1538 + var16;
                int var23 = class267.field4623 - class81.field1538 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class173.field3076 && var23 < class128.field2359) {
                    int var24;
                    if (class258.field4491 != null) {
                        var24 = class258.field4491[0][var22][var23] - class200.field3577 + 128;
                    } else {
                        var24 = class2.field33[0][var22][var23] - class200.field3577 + 128;
                    }
                    int var25 = class2.field33[3][var22][var23] - class200.field3577 - 1000;
                    class33.field620[var16][var19] = class28.method195(var20, var25, var24, var21, var15);
                } else {
                    class33.field620[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class81.field1538 + class81.field1538 + 1; ++var17) {
            for (int var18 = 0; var18 < class81.field1538 + class81.field1538 + 1; ++var18) {
                class122.field2276[var17][var18] = class33.field620[var17][var18] || class33.field620[var17 + 1][var18] || class33.field620[var17][var18 + 1] || class33.field620[var17 + 1][var18 + 1];
            }
        }
        class107.field1993 = arg6;
        class169.field2999 = arg7;
        class10.field167 = arg8;
        class84.field1604 = arg9;
        class257.field4483 = arg10;
        class173.method1242();
        if (class212.field3772 != null) {
            class149.method1101(true);
            class73.method526(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class149.method1101(false);
        }
        class73.method526(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        ++field2481;
        if (arg1 != -641641492) {
            field2484 = -7;
        }
        if (~arg2 == -1) {
            this.field2479 = arg0.method545((byte) 64);
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
    public final boolean method1057(int arg0) {
        ++field2489;
        if (this.field2486 != null) {
            return true;
        } else {
            if (arg0 != 27767) {
                this.field2485 = -63;
            }
            if (this.field2479 >= 0) {
                class21 var2 = class90.method700(this.field2479, (byte) 46, client.field4698);
                var2.method128();
                this.field2485 = var2.field4581;
                this.field2487 = var2.field4578;
                this.field2486 = var2.field277;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[[I")
    public int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028 && this.method1057(27767)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (~class113.field2149 != ~this.field2485 ? this.field2485 * arg0 / class113.field2149 : arg0) * this.field2487;
            int[] var7 = var3[1];
            if (~class241.field4284 != ~this.field2487) {
                for (int var8 = 0; class241.field4284 > var8; ++var8) {
                    int var9 = this.field2487 * var8 / class241.field4284;
                    int var10 = this.field2486[var6 + var9];
                    var5[var8] = class50.method369(255, var10) << 4;
                    var7[var8] = class50.method369(65280, var10) >> 4;
                    var4[var8] = class50.method369(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class241.field4284; ++var11) {
                    int var12 = this.field2486[var6++];
                    var5[var11] = class50.method369(4080, var12 << 4);
                    var7[var11] = class50.method369(var12, 65280) >> 4;
                    var4[var11] = class50.method369(var12, 16711680) >> 12;
                }
            }
        }
        ++field2488;
        if (arg1 != 25) {
            this.method688(44);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public final void method695(int arg0) {
        ++field2483;
        super.method695(79);
        if (arg0 < 6) {
            field2480 = null;
        }
        this.field2486 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
    public final int method688(int arg0) {
        ++field2482;
        if (arg0 != -27946) {
            this.method14((class75) null, 38, -23);
        }
        return this.field2479;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class138() {
        super(0, false);
    }
}
