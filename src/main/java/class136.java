import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class136 extends class739 {

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field1950 = -1;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "Lhg;")
    public static class693 field1948 = new class693(11, 8);

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "Lkg;")
    public static class275 field1952 = new class275(80, 10);

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "F")
    public static float field1951;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "[Lhha;")
    private class522[] field1944;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[II)V")
    private final void method1000(int[][] arg0, int arg1) {
        if (arg1 >= -107) {
            field1950 = 85;
        }
        ++field1945;
        int var3 = class29.field523;
        int var4 = class549.field7672;
        class282.method1669((byte) 63, arg0);
        class69.method628(class346.field4366, 0, class683.field9515, 0, (byte) -5);
        if (this.field1944 != null) {
            for (int var5 = 0; var5 < this.field1944.length; ++var5) {
                class522 var6 = this.field1944[var5];
                int var7 = var6.field7312;
                int var8 = var6.field7318;
                if (~var7 <= -1) {
                    if (~var8 > -1) {
                        var6.method1094(false, var4, var3);
                    } else {
                        var6.method1092(var4, var3, 2048);
                    }
                } else if (~var8 <= -1) {
                    var6.method1093(var3, 1, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field1943;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int var4 = class29.field523;
            int var5 = class549.field7672;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field10312.method2193((byte) -128);
            this.method1000(var6, -119);
            for (int var8 = 0; ~class549.field7672 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class29.field523 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class702.method3949(var15 << 4, 4080);
                    var12[var14] = class702.method3949(var15, 65280) >> 4;
                    var11[var14] = class702.method3949(16711680, var15) >> 12;
                }
            }
        }
        return arg0 <= 26 ? null : var3;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(Z)V")
    public static void method1001(boolean arg0) {
        if (arg0) {
            field1950 = -43;
        }
        field1948 = null;
        field1952 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1002(String arg0, boolean arg1) {
        class722.field10043 = arg0;
        ++field1946;
        if (class64.field900 != null) {
            try {
                String var2 = class64.field900.getParameter("cookieprefix");
                if (arg1) {
                    String var3 = class64.field900.getParameter("cookiehost");
                    String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                    String var5;
                    if (~arg0.length() != -1) {
                        var5 = var4 + "; Expires=" + class733.method4089(class446.method2525(500) - -94608000000L, 23482) + "; Max-Age=" + 94608000L;
                    } else {
                        var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    class568.method3264("document.cookie=\"" + var5 + "\"", (byte) 23, class64.field900);
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        if (arg0 != -23347) {
            this.method1000((int[][]) null, 4);
        }
        ++field1942;
        int[] var3 = super.field10311.method2116(arg1, (byte) 111);
        if (super.field10311.field4728) {
            this.method1000(super.field10311.method2115(-14453), -112);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.method223((byte) -11, 106);
        }
        if (~arg1 == -1) {
            this.field1944 = new class522[arg0.method2600((byte) -124)];
            for (int var4 = 0; ~this.field1944.length < ~var4; ++var4) {
                int var5 = arg0.method2600((byte) -127);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field1944[var4] = class695.method3890(arg0, -1);
                            }
                        } else {
                            this.field1944[var4] = class319.method1879((byte) -119, arg0);
                        }
                    } else {
                        this.field1944[var4] = class731.method4076(0, arg0);
                    }
                } else {
                    this.field1944[var4] = class168.method1174(arg0, false);
                }
            }
        } else if (arg1 == 1) {
            super.field10297 = ~arg0.method2600((byte) -128) == -2;
        }
        ++field1947;
    }
}
