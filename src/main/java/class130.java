import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class130 extends class23 {

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    private int field2297 = 16;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    private int field2301 = 0;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    private int field2298 = 0;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    private int field2312 = 4096;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    private int field2309 = 2000;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "Llc;")
    public static class143 field2304 = class66.method374("null", -1);

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "[[[Lli;")
    public static class191[][][] field2306 = new class191[4][104][104];

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "Llc;")
    private static class143 field2310 = class66.method374("Choose Option", -1);

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "Llc;")
    public static class143 field2307 = field2310;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "Lgf;")
    public static class7 field2305;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "[S")
    public static short[] field2311;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)I")
    public static final int method784(boolean arg0) {
        ++field2303;
        return arg0 ? 78 : class33.field558;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        int[] var3 = super.field369.method306(arg1, -23179);
        ++field2302;
        if (arg0 >= -13) {
            this.method85((byte) -26);
        }
        if (super.field369.field1005) {
            int var4 = this.field2312 >> 1;
            int[][] var5 = super.field369.method301(-113);
            Random var6 = new Random((long) this.field2301);
            for (int var7 = 0; var7 < this.field2309; ++var7) {
                int var8 = this.field2312 <= 0 ? this.field2298 : this.field2298 - -class139.method834((byte) -54, this.field2312, var6) + -var4;
                int var9 = var8 >> 4 & 255;
                int var10 = class139.method834((byte) -54, class72.field1359, var6);
                int var11 = class139.method834((byte) -54, class9.field179, var6);
                int var12 = (class279.field4922[var9] * this.field2297 >> 12) + var10;
                int var13 = (class51.field1016[var9] * this.field2297 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var13 = var18;
                        var11 = var17;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var10 = var12;
                        var12 = var19;
                    }
                    int var21 = -var10 + var12;
                    int var22 = var11;
                    int var23 = var13 - var11;
                    int var24 = -var21 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var21;
                    int var26 = ~var13 < ~var11 ? 1 : -1;
                    int var27 = 1024 - (class139.method834((byte) -54, 4096, var6) >> 2);
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var24 += var23;
                        int var29 = class172.field3077 & var28;
                        int var30 = (-var10 + var28) * var25 + var27 + 1024;
                        int var31 = var22 & class79.field1426;
                        if (~var24 < -1) {
                            var24 -= var21;
                            var22 += var26;
                        }
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
    public static void method785(int arg0) {
        if (arg0 != 4096) {
            field2306 = null;
        }
        field2306 = null;
        field2307 = null;
        field2305 = null;
        field2304 = null;
        field2310 = null;
        field2311 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field2312 = arg0.method1275(128);
                        }
                    } else {
                        this.field2298 = arg0.method1275(128);
                    }
                } else {
                    this.field2297 = arg0.method1265(116);
                }
            } else {
                this.field2309 = arg0.method1275(128);
            }
        } else {
            this.field2301 = arg0.method1265(121);
        }
        if (!arg2) {
            this.method85((byte) 43);
        }
        ++field2314;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V")
    public static final void method786(int arg0, int arg1) {
        ++field2299;
        class166 var2 = class262.method1746(arg0 ^ 73, arg1, arg0);
        var2.method1098((byte) -117);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[B)Z")
    public static final boolean method787(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field2315;
        class190 var4 = new class190(arg3);
        boolean var5 = true;
        if (arg1 != 63) {
            field2311 = null;
        }
        int var6 = -1;
        label60: while (true) {
            int var7 = var4.method1230(false);
            if (~var7 == -1) {
                return var5;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var4.method1257((byte) 100);
                    if (~var11 == -1) {
                        continue label60;
                    }
                    var9 += var11 + -1;
                    int var12 = var9 & 63;
                    int var13 = var4.method1265(115) >> 2;
                    int var14 = (4092 & var9) >> 6;
                    int var15 = var14 - -arg0;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && ~var15 > -104 && ~var16 > -104) {
                        class209 var17 = class34.method232(arg1 ^ 152, var6);
                        if (var13 != 22 || class225.field4083 || var17.field3835 != 0 || ~var17.field3890 == -2 || var17.field3840) {
                            if (!var17.method1468(arg1 ^ -40)) {
                                var5 = false;
                                ++class75.field1399;
                            }
                            var8 = true;
                        }
                    }
                }
                int var10 = var4.method1257((byte) 65);
                if (~var10 == -1) {
                    break;
                }
                var4.method1265(121);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        int var2 = 4 / ((arg0 - 22) / 60);
        class12.method99(512);
        ++field2300;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V")
    public static final void method788(int arg0) {
        ++field2308;
        try {
            if (class24.field416 == 1) {
                int var1 = class184.field3342.method1408(true);
                if (~var1 < -1 && class184.field3342.method1418(-120)) {
                    int var2 = var1 - class85.field1515;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class184.field3342.method1424(var2, -1421);
                    return;
                }
                class184.field3342.method1414((byte) 112);
                class184.field3342.method1438(811148232);
                class290.field5112 = null;
                if (class7.field121 == null) {
                    class24.field416 = 0;
                } else {
                    class24.field416 = 2;
                }
                class65.field1215 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class184.field3342.method1414((byte) -125);
            class7.field121 = null;
            class24.field416 = 0;
            class290.field5112 = null;
            class65.field1215 = null;
        }
        if (arg0 != -1) {
            method788(-105);
        }
    }
}
