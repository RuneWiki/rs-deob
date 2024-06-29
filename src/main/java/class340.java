import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class340 extends class397 {

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
    private int field4944 = 4096;

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "Z")
    private boolean field4951 = true;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!cn", name = "T", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(CBLjava/lang/String;)I", line = 3)
    public static final int method2061(char arg0, byte arg1, String arg2) {
        ++field4946;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; ++var5) {
            if (arg2.charAt(var5) == arg0) {
                ++var3;
            }
        }
        if (arg1 > -66) {
            method2065(56, 27L);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)Z", line = 30)
    public static final boolean method2062(int arg0, int arg1, int arg2, int arg3) {
        if (!class76.method505(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class41.field628;
            int var5 = arg2 << class41.field628;
            int var6 = class311.field4527[arg0].method848(arg1, arg2) - 1;
            int var7 = var6 - (120 << class41.field628 - 7);
            int var8 = var6 - (230 << class41.field628 - 7);
            int var9 = var6 - (238 << class41.field628 - 7);
            if (arg3 == 1) {
                if (var4 > class67.field1003) {
                    if (!class3.method18(var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method18(var4, var6, class170.field2281 + var5)) {
                        return false;
                    }
                    if (!class3.method18(var4, var6, class153.field1965 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method18(var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method18(var4, var7, class170.field2281 + var5)) {
                        return false;
                    }
                    if (!class3.method18(var4, var7, class153.field1965 + var5)) {
                        return false;
                    }
                }
                if (!class3.method18(var4, var8, var5)) {
                    return false;
                } else if (!class3.method18(var4, var8, class170.field2281 + var5)) {
                    return false;
                } else {
                    return class3.method18(var4, var8, class153.field1965 + var5);
                }
            } else if (arg3 == 2) {
                if (var5 < class95.field1278) {
                    if (!class3.method18(var4, var6, class153.field1965 + var5)) {
                        return false;
                    }
                    if (!class3.method18(class170.field2281 + var4, var6, class153.field1965 + var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var6, class153.field1965 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method18(var4, var7, class153.field1965 + var5)) {
                        return false;
                    }
                    if (!class3.method18(class170.field2281 + var4, var7, class153.field1965 + var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var7, class153.field1965 + var5)) {
                        return false;
                    }
                }
                if (!class3.method18(var4, var8, class153.field1965 + var5)) {
                    return false;
                } else if (!class3.method18(class170.field2281 + var4, var8, class153.field1965 + var5)) {
                    return false;
                } else {
                    return class3.method18(class153.field1965 + var4, var8, class153.field1965 + var5);
                }
            } else if (arg3 == 4) {
                if (var4 < class67.field1003) {
                    if (!class3.method18(class153.field1965 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var6, class170.field2281 + var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var6, class153.field1965 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method18(class153.field1965 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var7, class170.field2281 + var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var7, class153.field1965 + var5)) {
                        return false;
                    }
                }
                if (!class3.method18(class153.field1965 + var4, var8, var5)) {
                    return false;
                } else if (!class3.method18(class153.field1965 + var4, var8, class170.field2281 + var5)) {
                    return false;
                } else {
                    return class3.method18(class153.field1965 + var4, var8, class153.field1965 + var5);
                }
            } else if (arg3 == 8) {
                if (var5 > class95.field1278) {
                    if (!class3.method18(var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method18(class170.field2281 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method18(var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method18(class170.field2281 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method18(class153.field1965 + var4, var7, var5)) {
                        return false;
                    }
                }
                if (!class3.method18(var4, var8, var5)) {
                    return false;
                } else if (!class3.method18(class170.field2281 + var4, var8, var5)) {
                    return false;
                } else {
                    return class3.method18(class153.field1965 + var4, var8, var5);
                }
            } else if (!class3.method18(class170.field2281 + var4, var9, class170.field2281 + var5)) {
                return false;
            } else if (arg3 == 16) {
                return class3.method18(var4, var8, class153.field1965 + var5);
            } else if (arg3 == 32) {
                return class3.method18(class153.field1965 + var4, var8, class153.field1965 + var5);
            } else if (arg3 == 64) {
                return class3.method18(class153.field1965 + var4, var8, var5);
            } else if (arg3 == 128) {
                return class3.method18(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)[[I", line = 246)
    public final int[][] method486(byte arg0, int arg1) {
        ++field4947;
        int[][] var3 = super.field5848.method1692(arg1, 116);
        if (arg0 <= 81) {
            method2062(88, 32, 107, 80);
        }
        if (super.field5848.field3939) {
            int[] var4 = this.method2376(77, 0, arg1 + -1 & field4948);
            int[] var5 = this.method2376(59, 0, arg1);
            int[] var6 = this.method2376(123, 0, arg1 + 1 & field4948);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class164.field2152 < ~var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field4944;
                int var12 = (var5[var10 + 1 & class107.field1429] + -var5[var10 + -1 & class107.field1429]) * this.field4944;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                    var18 = var11 / var17;
                }
                if (this.field4951) {
                    var18 = 2048 - -(var18 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 364)
    public class340() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIZI)V", line = 332)
    public static final void method2063(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class445.field6492 = arg2;
        class45.field677 = arg3;
        if (arg5) {
            method2062(-75, 12, 123, 104);
        }
        class260.field3721 = arg6;
        class246.field3537 = arg4;
        class139.field1826 = arg1;
        ++field4945;
        class391.field5798 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)I", line = 348)
    public static final int method2064(int arg0, int arg1) {
        ++field4950;
        int var8 = arg1 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        int var7 = 7 % ((arg0 - -29) / 57);
        return var6 + 1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 367)
    public static final String method2065(int arg0, long arg1) {
        ++field4949;
        if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == (long) arg0) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class486.field7056[(int) (-(arg1 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = -1 + var6.length();
                        var9 = 160;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBLae;)V", line = 419)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field4952;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field4951 = arg2.method941((byte) 125) == 1;
            }
        } else {
            this.field4944 = arg2.method993((byte) -127);
        }
        if (arg1 != 80) {
            method2063(-103, -125, -71, -81, 58, false, 67);
        }
    }
}
