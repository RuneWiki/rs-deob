import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class201 extends class461 {

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "Loe;")
    public class183 field2435 = new class183();

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "Lbb;")
    public class304 field2437 = new class304();

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "Lmt;")
    private class364 field2434;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[F")
    public static float[] field2423 = new float[16384];

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "[F")
    public static float[] field2429 = new float[16384];

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "Ljava/lang/Object;")
    public static Object field2430;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2423[var2] = (float) Math.sin((double) var2 * var0);
            field2429[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()Lmi;", line = 4)
    public final class461 method1221() {
        field2426++;
        class700 var1;
        do {
            var1 = (class700) this.field2435.method1134(8446);
            if (var1 == null) {
                return null;
            }
        } while (var1.field9894 == null);
        return var1.field9894;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lsw;II)V", line = 24)
    private final void method1222(class700 arg0, int arg1, int arg2) {
        field2433++;
        if (arg2 != 1259) {
            return;
        }
        if ((this.field2434.field4889[arg0.field9893] & 0x4) != 0 && arg0.field9905 < 0) {
            int var4 = this.field2434.field4866[arg0.field9893] / class73.field1105;
            int var5 = (var4 + 1048575 - arg0.field9911) / var4;
            arg0.field9911 = arg1 * var4 + arg0.field9911 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field2434.field4887[arg0.field9893] == 0) {
                    arg0.field9894 = class360.method2044(arg0.field9889, arg0.field9894.method2020(), arg0.field9894.method2040(), arg0.field9894.method2045());
                } else {
                    arg0.field9894 = class360.method2044(arg0.field9889, arg0.field9894.method2020(), 0, arg0.field9894.method2045());
                    this.field2434.method2087(-33, arg0.field9886.field2815[arg0.field9906] < 0, arg0);
                }
                if (arg0.field9886.field2815[arg0.field9906] < 0) {
                    arg0.field9894.method2036(-1);
                }
                arg1 = arg0.field9911 / var4;
            }
        }
        arg0.field9894.method1225(arg1);
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "()I", line = 70)
    public final int method1223() {
        field2432++;
        return 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([IIBIILsw;)V", line = 80)
    private final void method1224(int[] arg0, int arg1, byte arg2, int arg3, int arg4, class700 arg5) {
        if (arg2 != 114) {
            this.method1225(-40);
        }
        if ((this.field2434.field4889[arg5.field9893] & 0x4) != 0 && arg5.field9905 < 0) {
            int var7 = this.field2434.field4866[arg5.field9893] / class73.field1105;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field9911) / var7;
                if (arg3 < var8) {
                    arg5.field9911 += arg3 * var7;
                    break;
                }
                arg5.field9894.method1228(arg0, arg1, var8);
                arg3 -= var8;
                arg5.field9911 += var7 * var8 - 1048576;
                arg1 += var8;
                int var9 = class73.field1105 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class360 var11 = arg5.field9894;
                if (this.field2434.field4887[arg5.field9893] == 0) {
                    arg5.field9894 = class360.method2044(arg5.field9889, var11.method2020(), var11.method2040(), var11.method2045());
                } else {
                    arg5.field9894 = class360.method2044(arg5.field9889, var11.method2020(), 0, var11.method2045());
                    this.field2434.method2087(-33, arg5.field9886.field2815[arg5.field9906] < 0, arg5);
                    arg5.field9894.method2048(var9, var11.method2040());
                }
                if (arg5.field9886.field2815[arg5.field9906] < 0) {
                    arg5.field9894.method2036(-1);
                }
                var11.method2021(var9);
                var11.method1228(arg0, arg1, arg4 - arg1);
                if (var11.method2027()) {
                    this.field2437.method1802(var11);
                }
            }
        }
        field2424++;
        arg5.field9894.method1228(arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 141)
    public final void method1225(int arg0) {
        this.field2437.method1225(arg0);
        field2425++;
        for (class700 var2 = (class700) this.field2435.method1132((byte) -113); var2 != null; var2 = (class700) this.field2435.method1134(8446)) {
            if (!this.field2434.method2099(var2, 62)) {
                int var3 = arg0;
                do {
                    if (var2.field9904 >= var3) {
                        this.method1222(var2, var3, 1259);
                        var2.field9904 -= var3;
                        break;
                    }
                    this.method1222(var2, var2.field9904, 1259);
                    var3 -= var2.field9904;
                } while (!this.field2434.method2078(0, var2, null, var3, false));
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 180)
    public static void method1226(boolean arg0) {
        field2429 = null;
        if (arg0) {
            field2429 = null;
        }
        field2423 = null;
        field2430 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIIII)Z", line = 192)
    public static final boolean method1227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2422++;
        if (!class586.method3400(arg8, arg3, arg6, true)) {
            return false;
        }
        int var10 = class78.field1151[0];
        int var11 = class78.field1151[1];
        int var12 = class78.field1151[2];
        if (!class586.method3400(arg2, arg9, arg1, true)) {
            return false;
        }
        int var13 = class78.field1151[1];
        int var14 = class78.field1151[2];
        int var15 = class78.field1151[0];
        if (!class586.method3400(arg4, arg7, arg0, true)) {
            return false;
        }
        int var16 = class78.field1151[2];
        int var17 = class78.field1151[1];
        int var18 = class78.field1151[0];
        if (arg5 != 4637) {
            method1226(true);
        }
        return class19.method330(var13, false, var18, var14, var10, var15, var11, var16, var12, var17);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([III)V", line = 223)
    public final void method1228(int[] arg0, int arg1, int arg2) {
        field2428++;
        this.field2437.method1228(arg0, arg1, arg2);
        for (class700 var4 = (class700) this.field2435.method1132((byte) -123); var4 != null; var4 = (class700) this.field2435.method1134(8446)) {
            if (!this.field2434.method2099(var4, -123)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field9904 >= var6) {
                        this.method1224(arg0, var5, (byte) 114, var6, var5 + var6, var4);
                        var4.field9904 -= var6;
                        break;
                    }
                    this.method1224(arg0, var5, (byte) 114, var4.field9904, var5 + var6, var4);
                    var5 += var4.field9904;
                    var6 -= var4.field9904;
                } while (!this.field2434.method2078(var5, var4, arg0, var6, false));
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()Lmi;", line = 261)
    public final class461 method1229() {
        field2427++;
        class700 var1 = (class700) this.field2435.method1132((byte) 63);
        if (var1 == null) {
            return null;
        } else if (var1.field9894 == null) {
            return this.method1221();
        } else {
            return var1.field9894;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIB)I", line = 277)
    public static final int method1230(int arg0, int arg1, int arg2, byte arg3) {
        field2436++;
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        if (arg3 != 60) {
            field2423 = null;
        }
        return ((arg2 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lmt;)V", line = 334)
    public class201(class364 arg0) {
        this.field2434 = arg0;
    }
}
