import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class125 extends class33 {

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    private int field2345 = 16;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    private int field2343 = 4096;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    private int field2359 = 2000;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    private int field2354 = 0;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    private int field2362 = 0;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "[I")
    public static int[] field2351 = new int[1000];

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "Lrd;")
    public static class173 field2349 = class133.method843("null", 62);

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "Lrd;")
    public static class173 field2348 = class133.method843("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 49);

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "Lrd;")
    public static class173 field2357 = class133.method843("::rect_debug", -88);

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "Lqf;")
    public static class165 field2356;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "Ljava/awt/Image;")
    public static Image field2352;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "Z")
    public static boolean field2344;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "[[B")
    public static byte[][] field2342;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field2355;
        if (arg1 >= -99) {
            method803(111, 87);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field2343 = arg2.method755((byte) -95);
                        }
                    } else {
                        this.field2354 = arg2.method755((byte) -91);
                    }
                } else {
                    this.field2345 = arg2.method751((byte) -69);
                }
            } else {
                this.field2359 = arg2.method755((byte) -102);
            }
        } else {
            this.field2362 = arg2.method751((byte) 104);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)Lph;")
    public static final class157 method801(int arg0, int arg1, int arg2, byte arg3) {
        class157 var4 = new class157();
        var4.field2940 = arg1;
        if (arg3 != 35) {
            return null;
        } else {
            ++field2360;
            var4.field2947 = arg0;
            client.field637.method675((long) arg2, var4, false);
            class76.method465(-17005, arg1);
            class221.method1438(-49, arg1);
            class165 var5 = class103.method639(arg2, true);
            if (var5 != null) {
                class209.method1379(1, var5);
            }
            if (class93.field1749 != null) {
                class209.method1379(arg3 + -34, class93.field1749);
                class93.field1749 = null;
            }
            class167.field3223 = false;
            class195.field3792 = 0;
            class100.method616(class215.field4168, 0, class64.field1270, class51.field1047, class30.field619);
            if (~class134.field2539 != 0) {
                class31.method254(28, class134.field2539, 1);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int[] var3 = super.field718.method514(arg0, -83);
        if (super.field718.field1615) {
            int var4 = this.field2343 >> 1;
            int[][] var5 = super.field718.method515(-29296);
            Random var6 = new Random((long) this.field2362);
            for (int var7 = 0; ~this.field2359 < ~var7; ++var7) {
                int var8 = ~this.field2343 >= -1 ? this.field2354 : this.field2354 - (var4 + -class159.method1044(this.field2343, (byte) 110, var6));
                int var9 = (var8 & 4081) >> 4;
                int var10 = class159.method1044(class117.field2173, (byte) 113, var6);
                int var11 = class159.method1044(class99.field1802, (byte) 115, var6);
                int var12 = (class57.field1143[var9] * this.field2345 >> 12) + var11;
                int var13 = var12 - var11;
                int var14 = (class54.field1079[var9] * this.field2345 >> 12) + var10;
                int var15 = var14 - var10;
                if (var15 != 0 || ~var13 != -1) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var13 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var14;
                        var14 = var12;
                        var10 = var11;
                        var12 = var18;
                        var11 = var17;
                    }
                    if (~var14 > ~var10) {
                        int var19 = var10;
                        var10 = var14;
                        int var20 = var11;
                        var14 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var14;
                    int var23 = -var11 + var12;
                    int var24 = -var22 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class159.method1044(4096, (byte) 125, var6) >> 2);
                    int var27 = ~var12 < ~var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var14; ++var28) {
                        var24 += var23;
                        int var29 = field2347 & var28;
                        int var30 = (-var10 + var28) * var25 + var26 + 1024;
                        int var31 = var21 & class26.field545;
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        ++field2353;
        int var32 = 41 % ((arg1 - -65) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method802(boolean arg0) {
        field2351 = null;
        field2342 = null;
        field2349 = null;
        field2356 = null;
        field2352 = null;
        if (arg0) {
            field2356 = null;
        }
        field2348 = null;
        field2357 = null;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 != -1) {
            method802(false);
        }
        class172.method1105(5000);
        ++field2346;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)I")
    public static final int method803(int arg0, int arg1) {
        if (arg1 != 255) {
            method802(false);
        }
        ++field2358;
        return 255 & arg0;
    }
}
