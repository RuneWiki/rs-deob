import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class214 extends class199 {

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "[B")
    private byte[] field3017 = new byte[512];

    @OriginalMember(owner = "client!jj", name = "hb", descriptor = "Z")
    public boolean field3030 = true;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    public int field3022 = 1638;

    @OriginalMember(owner = "client!jj", name = "gb", descriptor = "I")
    public int field3029 = 4;

    @OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
    public int field3033 = 4;

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "I")
    public int field3023 = 0;

    @OriginalMember(owner = "client!jj", name = "nb", descriptor = "I")
    public int field3036 = 4;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field3015 = 0;

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "[Z")
    public static boolean[] field3024 = new boolean[5];

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "[I")
    public static int[] field3020 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!jj", name = "jb", descriptor = "I")
    public static int field3032 = 0;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!jj", name = "fb", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!jj", name = "ib", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!jj", name = "lb", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!jj", name = "mb", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "[S")
    private short[] field3016;

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "[S")
    private short[] field3026;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V", line = 4)
    public static final void method1560(byte arg0) {
        class270.field3870.method2262(false);
        field3025++;
        if (arg0 > -83) {
            method1562(true, -88, -44, -12, 106);
        }
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V", line = 15)
    private final void method1561(byte arg0) {
        if (this.field3022 > 0) {
            this.field3026 = new short[this.field3033];
            this.field3016 = new short[this.field3033];
            for (int var3 = 0; var3 < this.field3033; var3++) {
                this.field3016[var3] = (short) ((int) (Math.pow((double) ((float) this.field3022 / 4096.0F), (double) var3) * 4096.0D));
                this.field3026[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field3016 != null && this.field3016.length == this.field3033) {
            this.field3026 = new short[this.field3033];
            for (int var2 = 0; var2 < this.field3033; var2++) {
                this.field3026[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field3035++;
        if (arg0 <= 34) {
            this.method190(97, -79);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLfd;I)V", line = 56)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            return;
        }
        if (arg2 == 0) {
            this.field3030 = arg1.method2096((byte) -122) == 1;
        } else if (arg2 == 1) {
            this.field3033 = arg1.method2096((byte) -122);
        } else if (arg2 == 2) {
            this.field3022 = arg1.method2043(true);
            if (this.field3022 < 0) {
                this.field3016 = new short[this.field3033];
                for (int var5 = 0; var5 < this.field3033; var5++) {
                    this.field3016[var5] = (short) arg1.method2043(true);
                }
            }
        } else if (arg2 == 3) {
            this.field3036 = this.field3029 = arg1.method2096((byte) -122);
        } else if (arg2 == 4) {
            this.field3023 = arg1.method2096((byte) -122);
        } else if (arg2 == 5) {
            this.field3036 = arg1.method2096((byte) -122);
        } else if (arg2 == 6) {
            this.field3029 = arg1.method2096((byte) -122);
        }
        field3019++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIII)V", line = 145)
    public static final void method1562(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3018++;
        if (arg1 != -6090) {
            method1562(false, -114, 21, 64, -40);
        }
        if (class140.method1081(-116, arg3)) {
            class126.method933(class26.field308[arg3], arg0, arg2, -1, arg4, -105);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)I", line = 162)
    private final int method1563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - 4096;
        field3028++;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 0xFFF;
        int var11 = var9 + 1;
        int var12 = var9 & 0xFF;
        if (var11 >= arg5) {
            var11 = 0;
        }
        int var13 = var10 - 4096;
        int var14 = var11 & 0xFF;
        int var15 = this.field3017[arg4 + var12] & 0x3;
        int var16;
        if (var15 <= 1) {
            var16 = var15 == 0 ? arg6 + var10 : -var10 + arg6;
        } else {
            var16 = var15 == 2 ? var10 - arg6 : -arg6 + -var10;
        }
        int var17 = this.field3017[arg4 + var14] & 0x3;
        int var18 = class360.field5618[var10];
        int var19;
        if (var17 > 1) {
            var19 = var17 == 2 ? var13 - arg6 : -arg6 + -var13;
        } else {
            var19 = var17 == 0 ? arg6 + var13 : arg6 - var13;
        }
        int var20 = this.field3017[var12 + arg1] & 0x3;
        int var21 = var16 + ((var19 - var16) * var18 >> 12);
        int var22;
        if (var20 > arg2) {
            var22 = var20 == 2 ? var10 - var8 : -var10 - var8;
        } else {
            var22 = var20 == 0 ? var8 + var10 : -var10 + var8;
        }
        int var23 = this.field3017[arg1 + var14] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var13 : -var13 + var8;
        } else {
            var24 = var23 == 2 ? var13 - var8 : -var8 + -var13;
        }
        int var25 = ((var24 - var22) * var18 >> 12) + var22;
        return var21 + ((var25 - var21) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(B)V", line = 233)
    public static void method1564(byte arg0) {
        field3024 = null;
        field3020 = null;
        if (arg0 >= -123) {
            field3024 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I", line = 248)
    public final int[] method190(int arg0, int arg1) {
        field3031++;
        if (arg0 != -1735) {
            return (int[]) null;
        }
        int[] var3 = this.field2802.method2502(arg1, 79);
        if (this.field2802.field5637) {
            this.method1565(var3, arg1, -123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 565)
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)V", line = 286)
    public final void method1565(int[] arg0, int arg1, int arg2) {
        field3034++;
        int var4 = 101 % ((-arg2 - 31) / 56);
        int var5 = class274.field3919[arg1] * this.field3029;
        if (this.field3033 == 1) {
            short var6 = this.field3016[0];
            int var7 = this.field3026[0] << 12;
            int var8 = this.field3036 * var7 >> 12;
            int var9 = this.field3029 * var7 >> 12;
            int var10 = var5 * var7 >> 12;
            int var11 = var10 >> 12;
            int var12 = var10 & 0xFFF;
            int var13 = this.field3017[var11 & 0xFF] & 0xFF;
            int var14 = class360.field5618[var12];
            int var15 = var11 + 1;
            if (var9 <= var15) {
                var15 = 0;
            }
            int var16 = this.field3017[var15 & 0xFF] & 0xFF;
            if (this.field3030) {
                for (int var20 = 0; var20 < class95.field1235; var20++) {
                    int var21 = class82.field1062[var20] * this.field3036;
                    int var22 = this.method1563(var7 * var21 >> 12, var16, 1, var14, var13, var8, var12);
                    int var23 = var6 * var22 >> 12;
                    arg0[var20] = (var23 >> 1) + 2048;
                }
            } else {
                for (int var17 = 0; var17 < class95.field1235; var17++) {
                    int var18 = class82.field1062[var17] * this.field3036;
                    int var19 = this.method1563(var7 * var18 >> 12, var16, 1, var14, var13, var8, var12);
                    arg0[var17] = var6 * var19 >> 12;
                }
            }
            return;
        }
        short var24 = this.field3016[0];
        if (var24 > 8 || var24 < -8) {
            int var25 = this.field3026[0] << 12;
            int var26 = var5 * var25 >> 12;
            int var27 = var26 >> 12;
            int var28 = this.field3036 * var25 >> 12;
            int var29 = this.field3029 * var25 >> 12;
            int var30 = var26 & 0xFFF;
            int var31 = this.field3017[var27 & 0xFF] & 0xFF;
            int var32 = class360.field5618[var30];
            int var33 = var27 + 1;
            if (var33 >= var29) {
                var33 = 0;
            }
            int var34 = this.field3017[var33 & 0xFF] & 0xFF;
            for (int var35 = 0; var35 < class95.field1235; var35++) {
                int var36 = class82.field1062[var35] * this.field3036;
                int var37 = this.method1563(var25 * var36 >> 12, var34, 1, var32, var31, var28, var30);
                arg0[var35] = var24 * var37 >> 12;
            }
        }
        for (int var38 = 1; var38 < this.field3033; var38++) {
            short var39 = this.field3016[var38];
            if (var39 > 8 || var39 < -8) {
                int var40 = this.field3026[var38] << 12;
                int var41 = this.field3036 * var40 >> 12;
                int var42 = var5 * var40 >> 12;
                int var43 = this.field3029 * var40 >> 12;
                int var44 = var42 >> 12;
                int var45 = var44 + 1;
                int var46 = var42 & 0xFFF;
                int var47 = this.field3017[var44 & 0xFF] & 0xFF;
                if (var45 >= var43) {
                    var45 = 0;
                }
                int var48 = this.field3017[var45 & 0xFF] & 0xFF;
                int var49 = class360.field5618[var46];
                if (this.field3030 && this.field3033 - 1 == var38) {
                    for (int var50 = 0; var50 < class95.field1235; var50++) {
                        int var51 = class82.field1062[var50] * this.field3036;
                        int var52 = this.method1563(var40 * var51 >> 12, var48, 1, var49, var47, var41, var46);
                        int var53 = arg0[var50] + (var39 * var52 >> 12);
                        arg0[var50] = (var53 >> 1) + 2048;
                    }
                } else {
                    for (int var54 = 0; var54 < class95.field1235; var54++) {
                        int var55 = class82.field1062[var54] * this.field3036;
                        int var56 = this.method1563(var40 * var55 >> 12, var48, 1, var49, var47, var41, var46);
                        arg0[var54] += var39 * var56 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V", line = 443)
    public final void method189(byte arg0) {
        field3027++;
        this.field3017 = class94.method676(this.field3023, -29382);
        this.method1561((byte) 114);
        int var2 = this.field3033 - 1;
        int var3 = -7 / ((36 - arg0) / 44);
        while (var2 >= 1) {
            short var4 = this.field3016[var2];
            if (var4 > 8 || var4 < -8) {
                break;
            }
            this.field3033--;
            var2--;
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 474)
    public static final void method1566(int arg0) {
        if (arg0 <= 69) {
            return;
        }
        field3021++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class66.field853 - 1; var2++) {
                if (class156.field2169[var2] < 1000 && class156.field2169[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class328.field4805[var2];
                    class328.field4805[var2] = class328.field4805[var2 + 1];
                    class328.field4805[var2 + 1] = var3;
                    String var4 = class185.field2524[var2];
                    class185.field2524[var2] = class185.field2524[var2 + 1];
                    class185.field2524[var2 + 1] = var4;
                    int var5 = class95.field1243[var2];
                    class95.field1243[var2] = class95.field1243[var2 + 1];
                    class95.field1243[var2 + 1] = var5;
                    int var6 = class156.field2159[var2];
                    class156.field2159[var2] = class156.field2159[var2 + 1];
                    class156.field2159[var2 + 1] = var6;
                    int var7 = class42.field533[var2];
                    class42.field533[var2] = class42.field533[var2 + 1];
                    class42.field533[var2 + 1] = var7;
                    short var8 = class156.field2169[var2];
                    class156.field2169[var2] = class156.field2169[var2 + 1];
                    class156.field2169[var2 + 1] = var8;
                    long var9 = class199.field2801[var2];
                    class199.field2801[var2] = class199.field2801[var2 + 1];
                    class199.field2801[var2 + 1] = var9;
                }
            }
        }
    }
}
