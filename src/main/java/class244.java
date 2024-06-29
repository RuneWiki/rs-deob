import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class244 extends class212 {

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    private int field4228 = 16;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
    private int field4232 = 0;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "I")
    private int field4236 = 0;

    @OriginalMember(owner = "client!ek", name = "eb", descriptor = "I")
    private int field4238 = 4096;

    @OriginalMember(owner = "client!ek", name = "gb", descriptor = "I")
    private int field4240 = 2000;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "Lo;")
    public static class175 field4229 = null;

    @OriginalMember(owner = "client!ek", name = "hb", descriptor = "[[B")
    public static byte[][] field4241 = new byte[250][];

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "Z")
    public static boolean field4237 = false;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ek", name = "fb", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ek", name = "ib", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ek", name = "kb", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "Ljb;")
    public static class11 field4231;

    @OriginalMember(owner = "client!ek", name = "jb", descriptor = "Ljb;")
    public static class11 field4243;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = this.field4238 >> 1;
            int[][] var5 = super.field3640.method734((byte) 117);
            Random var6 = new Random((long) this.field4236);
            for (int var7 = 0; ~this.field4240 < ~var7; ++var7) {
                int var8 = this.field4238 <= 0 ? this.field4232 : this.field4232 + (class136.method879((byte) -125, var6, this.field4238) - var4);
                int var9 = var8 >> 4 & 255;
                int var10 = class136.method879((byte) -127, var6, class26.field452);
                int var11 = class136.method879((byte) -116, var6, class97.field1577);
                int var12 = (class216.field3712[var9] * this.field4228 >> 12) + var10;
                int var13 = (class152.field2534[var9] * this.field4228 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var10;
                        var12 = var13;
                        var10 = var11;
                        var11 = var18;
                        var13 = var17;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var13 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = 2048 / var22;
                    int var24 = -var22 / 2;
                    int var25 = -var11 + var13;
                    int var26 = var11 < var13 ? 1 : -1;
                    if (var25 < 0) {
                        var25 = -var25;
                    }
                    int var27 = -(class136.method879((byte) -124, var6, 4096) >> 2) + 1024;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        var24 += var25;
                        int var29 = (var28 - var10) * var23 + var27 + 1024;
                        int var30 = var28 & class186.field3300;
                        int var31 = var21 & class4.field90;
                        if (~var24 < -1) {
                            var21 += var26;
                            var24 += -var22;
                        }
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        ++field4235;
        if (arg1 < 25) {
            this.field4228 = 25;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static final void method1649(int arg0) {
        class141.field2275.method541(arg0, 49);
        ++class210.field3606;
        ++field4233;
        for (class228 var1 = (class228) class165.field2807.method1418(0); var1 != null; var1 = (class228) class165.field2807.method1421(false)) {
            if (~var1.field3914 == -1) {
                class69.method479(var1, -9050, true);
            }
        }
        if (class210.field3608 != null) {
            class218.method1453((byte) -97, class210.field3608);
            class210.field3608 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILdg;Llg;I)V")
    public static final void method1650(int arg0, class90 arg1, class195 arg2, int arg3) {
        class131 var4 = new class131();
        var4.field2168 = arg2;
        var4.field606 = (long) arg0;
        ++field4230;
        var4.field2161 = arg1;
        var4.field2164 = 1;
        class247 var5 = class194.field3398;
        synchronized (class194.field3398) {
            class194.field3398.method1689(var4, 119);
        }
        if (arg3 != -5978) {
            method1650(-91, (class90) null, (class195) null, -24);
        }
        class227.method1486(true);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        class85.method575(120);
        ++field4242;
        if (!arg0) {
            method1653((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lra;BIII)V")
    public static final void method1651(class148 arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field4234;
        if (arg1 != 47) {
            field4231 = null;
        }
        for (class264 var5 = (class264) class94.field1493.method1686((byte) -83); var5 != null; var5 = (class264) class94.field1493.method1683(140)) {
            if (~var5.field4611 == ~arg3 && arg4 * 128 == var5.field4589 && ~(arg2 * 128) == ~var5.field4596 && var5.field4592.field2431 == arg0.field2431) {
                if (var5.field4606 != null) {
                    class90.field1420.method696(var5.field4606);
                    var5.field4606 = null;
                }
                if (var5.field4604 != null) {
                    class90.field1420.method696(var5.field4604);
                    var5.field4604 = null;
                }
                var5.method290((byte) -48);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            field4231 = null;
        }
        ++field4239;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field4238 = arg0.method1535(~arg2);
                        }
                    } else {
                        this.field4232 = arg0.method1535(2);
                    }
                } else {
                    this.field4228 = arg0.method1516((byte) 82);
                }
            } else {
                this.field4240 = arg0.method1535(2);
            }
        } else {
            this.field4236 = arg0.method1516((byte) 82);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)Loe;")
    public static final class165 method1652(int arg0, int arg1) {
        ++field4244;
        if (arg0 >= -123) {
            field4231 = null;
        }
        class165 var2 = (class165) class69.field1101.method1794(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class116.field1924.method89(class88.method590((byte) -39, arg1), class125.method812(arg1, -65), 116);
            class165 var4 = new class165();
            if (var3 != null) {
                var4.method1098((byte) 23, new class230(var3));
            }
            class69.field1101.method1795(14177, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    public static void method1653(byte arg0) {
        field4241 = null;
        field4229 = null;
        field4243 = null;
        field4231 = null;
        if (arg0 != -89) {
            field4243 = null;
        }
    }
}
