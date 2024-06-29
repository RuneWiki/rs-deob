import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class124 extends class99 {

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    private int field2337 = -1;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "Ljava/util/Random;")
    public static Random field2331 = new Random();

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field2334 = 2;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "Lr;")
    public static class66 field2336 = class93.method641(43, "gleiten:");

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "I")
    public static int field2341 = 0;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ok", name = "hb", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "[I")
    public int[] field2330;

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)[[I")
    public int[][] method37(int arg0, boolean arg1) {
        ++field2343;
        if (!arg1) {
            field2341 = -40;
        }
        int[][] var3 = super.field1946.method823(arg0, (byte) -98);
        if (super.field1946.field2297 && this.method854(0)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = (class16.field223 != this.field2339 ? this.field2339 * arg0 / class16.field223 : arg0) * this.field2340;
            if (class199.field3432 != this.field2340) {
                for (int var8 = 0; ~class199.field3432 < ~var8; ++var8) {
                    int var9 = this.field2340 * var8 / class199.field3432;
                    int var10 = this.field2330[var7 + var9];
                    var5[var8] = class115.method767(var10 << 4, 4080);
                    var4[var8] = class115.method767(var10 >> 4, 4080);
                    var6[var8] = class115.method767(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class199.field3432 > var11; ++var11) {
                    int var12 = this.field2330[var7++];
                    var5[var11] = class115.method767(4080, var12 << 4);
                    var4[var11] = class115.method767(4080, var12 >> 4);
                    var6[var11] = class115.method767(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)I")
    public final int method676(int arg0) {
        if (arg0 != 9485) {
            method855(31, -110);
        }
        ++field2328;
        return this.field2337;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)Z")
    public final boolean method854(int arg0) {
        ++field2342;
        if (this.field2330 != null) {
            return true;
        } else if (this.field2337 >= arg0) {
            class168 var2 = class237.method1562(this.field2337, class79.field1555, 64);
            var2.method1151();
            this.field2340 = var2.field4494;
            this.field2330 = var2.field3011;
            this.field2339 = var2.field4496;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
    public final void method680(int arg0) {
        ++field2344;
        super.method680(arg0);
        this.field2330 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
    public static final void method855(int arg0, int arg1) {
        class85.field1667.method1611(-18767, arg1);
        int var2 = 94 % ((-4 - arg0) / 54);
        ++field2333;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method856(boolean arg0) {
        if (arg0) {
            method855(11, 8);
        }
        field2331 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lsb;I)V")
    public static final void method857(class89 arg0, int arg1) {
        if (arg1 != 127) {
            method857((class89) null, 100);
        }
        class82.field1595 = arg0;
        ++field2332;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
    public static final void method858(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = class110.field2124[arg0][arg1][arg2];
        if (var4 != null) {
            class127 var5 = var4.field212;
            if (var5 != null) {
                var5.field2382 = var5.field2382 * arg3 / 16;
                var5.field2389 = var5.field2389 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method37(0, false);
        }
        if (arg1 == 0) {
            this.field2337 = arg0.method1674(1355769544);
        }
        ++field2329;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lik;BZ)V")
    public static final void method859(class117 arg0, byte arg1, boolean arg2) {
        ++field2335;
        if (arg1 <= -35) {
            if (!arg2) {
                class137 var3 = null;
                class63.field1242 = 3;
                class4.method17(true, 1);
                class51.field901 = 0;
                class15.field200 = true;
                class212.field3647 = true;
                class33.field492 = true;
                class205.field3512 = true;
                class66.field1277 = true;
                class198.field3421 = true;
                class155.field2764 = true;
                class176.field3095 = true;
                class64.field1265 = true;
                class44.field782 = 0;
                class250.field4401 = true;
                field2334 = 2;
                class7.field61 = true;
                class54.field944 = 127;
                class131.field2438 = 0;
                class164.field2936 = 255;
                class43.field760 = true;
                class61.field1030 = 127;
                try {
                    class232 var4 = arg0.method780(true, "runescape");
                    while (var4.field4066 == 0) {
                        class91.method636(-5, 1L);
                    }
                    if (~var4.field4066 == -2) {
                        var3 = (class137) var4.field4069;
                        byte[] var5 = new byte[(int) var3.method940(-1)];
                        int var7;
                        for (int var6 = 0; ~var6 > ~var5.length; var6 += var7) {
                            var7 = var3.method945(var5.length - var6, 0, var6, var5);
                            if (~var7 == 0) {
                                throw new IOException("EOF");
                            }
                        }
                        class52.method360(new class249(var5), (byte) 91);
                    }
                } catch (Exception var9) {
                }
                try {
                    if (var3 != null) {
                        var3.method943(-8143);
                        return;
                    }
                } catch (Exception var8) {
                    return;
                }
            } else {
                class63.field1242 = 3;
                class4.method17(false, 1);
                class164.field2936 = 255;
                class44.field782 = 0;
                class54.field944 = 127;
                class7.field61 = false;
                class51.field901 = 0;
                class198.field3421 = false;
                class176.field3095 = false;
                class15.field200 = false;
                class205.field3512 = false;
                class61.field1030 = 127;
                class43.field760 = false;
                class155.field2764 = false;
                class66.field1277 = false;
                class250.field4401 = false;
                class33.field492 = false;
                class131.field2438 = 0;
                field2334 = 0;
                class212.field3647 = false;
                class64.field1265 = false;
                class256.method1718(true, arg0);
            }
        }
    }
}
