import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class173 extends class227 {

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    private int field2209 = 16;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    private int field2217 = 4096;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field2216 = 0;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    private int field2219 = 2000;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    private int field2210 = 0;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "[Lcc;")
    public static class516[] field2221 = new class516[14];

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Lao;")
    public static class191 field2213 = new class191(59, -2);

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "[I")
    public static int[] field2225 = new int[25];

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "[Z")
    public static boolean[] field2223 = new boolean[8];

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field2226 = -2;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "Ljava/awt/Frame;")
    public static Frame field2224;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 254)
    public class173() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "(I)V", line = 11)
    public static void method1014(int arg0) {
        field2221 = null;
        field2225 = null;
        field2224 = null;
        field2223 = null;
        field2213 = null;
        if (arg0 != 0) {
            field2221 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method62(int arg0, int arg1) {
        ++field2220;
        int[] var3 = super.field3068.method1970(arg1, (byte) 18);
        if (arg0 != 15811) {
            return null;
        } else {
            if (super.field3068.field4480) {
                int var4 = this.field2217 >> 1;
                int[][] var5 = super.field3068.method1973(-87);
                Random var6 = new Random((long) this.field2216);
                for (int var7 = 0; ~this.field2219 < ~var7; ++var7) {
                    int var8 = ~this.field2217 < -1 ? this.field2210 - (var4 + -class477.method2908((byte) 8, var6, this.field2217)) : this.field2210;
                    int var9 = var8 >> 4 & 255;
                    int var10 = class477.method2908((byte) -118, var6, class446.field6486);
                    int var11 = class477.method2908((byte) -120, var6, class305.field4055);
                    int var12 = (class143.field1906[var9] * this.field2209 >> 12) + var10;
                    int var13 = (class169.field2189[var9] * this.field2209 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (var15 != 0 || var14 != 0) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var10;
                            int var18 = var12;
                            var10 = var11;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (~var12 > ~var10) {
                            int var19 = var10;
                            var10 = var12;
                            int var20 = var11;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = var13 - var11;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class477.method2908((byte) -126, var6, 4096) >> 2) + 1024;
                        int var27 = var13 > var11 ? 1 : -1;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        for (int var28 = var10; ~var12 < ~var28; ++var28) {
                            int var29 = (-var10 + var28) * var25 + var26 + 1024;
                            int var30 = class102.field1388 & var28;
                            int var31 = class115.field1508 & var21;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            var24 += var23;
                            if (~var24 < -1) {
                                var21 += var27;
                                var24 += -var22;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 174)
    public static final void method1015(byte arg0) {
        ++field2218;
        if (!class421.field6107) {
            if (arg0 == 40) {
                class421.field6107 = true;
                if (!class319.field4256.field4651) {
                    class249.field3321 += (24.0F - class249.field3321) / 2.0F;
                } else {
                    class143.field1907 = (float) (-128 & (int) class143.field1907 + 191);
                }
                class419.field6089 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)Z", line = 200)
    public static final boolean method1016(byte arg0) {
        if (arg0 <= 80) {
            method1014(81);
        }
        ++field2211;
        if (class14.field147) {
            try {
                class400.method2475(class381.field5518.field1828, -106, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(III)V", line = 223)
    public static final void method1017(int arg0, int arg1, int arg2) {
        ++field2215;
        class184 var3 = class277.method1682(arg0, 6, -83);
        var3.method1069(true);
        if (arg1 > -103) {
            method1016((byte) 20);
        }
        var3.field2393 = arg2;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 241)
    public final void method877(int arg0) {
        class32.method182(arg0 + 121);
        ++field2212;
        if (arg0 != 1) {
            this.method62(-1, -115);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lug;II)V", line = 258)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg1 == 487215116) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (~arg2 == -5) {
                                this.field2217 = arg0.method2386(arg1 + -487238764);
                            }
                        } else {
                            this.field2210 = arg0.method2386(arg1 + -487238764);
                        }
                    } else {
                        this.field2209 = arg0.method2388((byte) -121);
                    }
                } else {
                    this.field2219 = arg0.method2386(-23648);
                }
            } else {
                this.field2216 = arg0.method2388((byte) -117);
            }
            ++field2214;
        }
    }
}
