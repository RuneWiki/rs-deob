import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class154 extends class304 {

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    private int field2334 = 3072;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    private int field2335 = 2048;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    private int field2339 = 1024;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "[I")
    public static int[] field2330 = new int[2500];

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "F")
    public static float field2338;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Lb;")
    public static class144 field2333;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 5)
    public static void method1158(int arg0) {
        field2330 = null;
        field2333 = null;
        if (arg0 != 128) {
            field2330 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 18)
    public final void method100(boolean arg0) {
        field2340++;
        this.field2335 = this.field2334 - this.field2339;
        if (!arg0) {
            method1159(-102, -102, -123, 49);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)Z", line = 31)
    public static final boolean method1159(int arg0, int arg1, int arg2, int arg3) {
        if (!class257.method1812(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class203.field3111[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class336.field5227) {
                    if (!class120.method909(var4, var6, var5)) {
                        return false;
                    }
                    if (!class120.method909(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method909(var4, var7, var5)) {
                        return false;
                    }
                    if (!class120.method909(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method909(var4, var8, var5)) {
                    return false;
                }
                if (!class120.method909(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class262.field4035) {
                    if (!class120.method909(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class120.method909(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method909(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class120.method909(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method909(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class120.method909(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class336.field5227) {
                    if (!class120.method909(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class120.method909(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method909(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class120.method909(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method909(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class120.method909(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class262.field4035) {
                    if (!class120.method909(var4, var6, var5)) {
                        return false;
                    }
                    if (!class120.method909(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method909(var4, var7, var5)) {
                        return false;
                    }
                    if (!class120.method909(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class120.method909(var4, var8, var5)) {
                    return false;
                }
                if (!class120.method909(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class120.method909(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class120.method909(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class120.method909(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class120.method909(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class120.method909(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 319)
    public class154() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I", line = 221)
    public final int[] method71(int arg0, int arg1) {
        field2331++;
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 0, (byte) 112);
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                var3[var5] = (var4[var5] * this.field2335 >> 12) + this.field2339;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V", line = 257)
    public static final void method1160(byte arg0, int arg1) {
        field2341++;
        if (arg1 >= 0 && class258.field3951.length > arg1) {
            class258.field3951[arg1] = !class258.field3951[arg1];
            if (arg0 < 39) {
                method1161(-17, 61);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I", line = 274)
    public final int[][] method75(int arg0, int arg1) {
        if (arg1 != 0) {
            method1161(-15, 53);
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        field2336++;
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -101, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class218.field3333; var11++) {
                var8[var11] = this.field2339 + (var5[var11] * this.field2335 >> 12);
                var9[var11] = (var6[var11] * this.field2335 >> 12) + this.field2339;
                var10[var11] = this.field2339 + (var7[var11] * this.field2335 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwm;II)V", line = 337)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2339 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field2334 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field4652 = arg0.method1774((byte) 0) == 1;
        }
        if (arg2 != -2828) {
            this.method75(-49, 5);
        }
        field2332++;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)Z", line = 373)
    public static final boolean method1161(int arg0, int arg1) {
        field2337++;
        if (class95.field1361[arg0]) {
            return true;
        } else if (class223.field3398.method697(arg0, (byte) -8)) {
            if (arg1 <= 40) {
                method1162(-59, -6, -73, 1, (class110) null, 63, -89L, 2, -49, 68, 63);
            }
            int var2 = class223.field3398.method685((byte) 15, arg0);
            if (var2 == 0) {
                class95.field1361[arg0] = true;
                return true;
            }
            if (class8.field128[arg0] == null) {
                class8.field128[arg0] = new class161[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class8.field128[arg0][var3] == null) {
                    byte[] var4 = class223.field3398.method696(var3, (byte) 120, arg0);
                    if (var4 != null) {
                        class161 var5 = class8.field128[arg0][var3] = new class161();
                        var5.field2615 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1203((byte) -109, new class254(var4));
                        } else {
                            var5.method1213(6, new class254(var4));
                        }
                    }
                }
            }
            class95.field1361[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILfc;IJIIII)Z", line = 437)
    public static final boolean method1162(int arg0, int arg1, int arg2, int arg3, class110 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class279.method1934(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
