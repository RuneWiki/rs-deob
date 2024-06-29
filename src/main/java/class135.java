import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 extends class286 {

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field2256 = 1;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    private int field2260 = 2048;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    private int field2267 = 5;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    private int field2261 = 2;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "[B")
    private byte[] field2270 = new byte[512];

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    private int field2255 = 0;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "[S")
    private short[] field2275 = new short[512];

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    private int field2266 = 5;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Lbe;")
    public static class283 field2262 = class153.method941(126, "0(U");

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "[I")
    public static int[] field2257 = new int[500];

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "[I")
    public static int[] field2276 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "Lbe;")
    public static class283 field2272 = null;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V", line = 8)
    public static final void method836(int arg0) {
        if (arg0 != -24139) {
            method842(49);
        }
        field2265++;
        class159.field2603 = null;
        class112.field1892 = null;
        class177.field3048 = null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 20)
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 24)
    public final void method276(int arg0) {
        if (arg0 == 3) {
            this.field2270 = class69.method438(arg0 - 122, this.field2255);
            this.method838(arg0 ^ 0xFFFF864A);
            field2271++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILbe;)V", line = 50)
    public static final void method837(int arg0, class283 arg1) {
        field2258++;
        int var2 = class216.method1425(17, arg1);
        if (var2 == -1) {
            return;
        }
        class241.field4074 = class272.field4577.field5059[var2] - class123.field2045;
        int var3 = class241.field4074 - ((int) ((float) class91.field1530.field1069 / class123.field2044));
        int var4 = (int) ((float) class91.field1530.field1069 / class123.field2044) + class241.field4074;
        class237.field3962 = class134.field2254 + arg0 - (class272.field4577.field5054[var2] + -class110.field1865);
        int var5 = class237.field3962 - (int) ((float) class91.field1530.field1085 / class123.field2044);
        if (var3 < 0) {
            class241.field4074 = (int) ((float) class91.field1530.field1069 / class123.field2044);
        }
        int var6 = (int) ((float) class91.field1530.field1085 / class123.field2044) + class237.field3962;
        if (var5 < 0) {
            class237.field3962 = (int) ((float) class91.field1530.field1085 / class123.field2044);
        }
        if (class77.field1345 < var4) {
            class241.field4074 = class77.field1345 - (int) ((float) class91.field1530.field1069 / class123.field2044);
        }
        if (class134.field2254 < var6) {
            class237.field3962 = class134.field2254 - ((int) ((float) class91.field1530.field1085 / class123.field2044));
        }
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V", line = 90)
    private final void method838(int arg0) {
        field2263++;
        Random var2 = new Random((long) this.field2255);
        this.field2275 = new short[512];
        if (this.field2260 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2275[var3] = (short) class47.method275(this.field2260, var2, -1625284640);
            }
        }
        if (arg0 != -31159) {
            method839(78);
        }
    }

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)V", line = 122)
    public static final void method839(int arg0) {
        field2264++;
        if (arg0 != -28537) {
            method839(94);
        }
        class207.field3560 = null;
        class73.method489();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I", line = 137)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 >= -52) {
            return (int[]) null;
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        field2269++;
        if (this.field4863.field3984) {
            int var4 = class153.field2509[arg1] * this.field2267 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class27.field410; var7++) {
                class180.field3100 = Integer.MAX_VALUE;
                class35.field525 = Integer.MAX_VALUE;
                class122.field2033 = Integer.MAX_VALUE;
                class74.field1293 = Integer.MAX_VALUE;
                int var8 = class174.field2978[var7] * this.field2266 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2270[(var11 < this.field2267 ? var11 : var11 - this.field2267) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2270[(var13 >= this.field2266 ? var13 - this.field2266 : var13) + var12 & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 + (-this.field2275[var14] - (var13 << 12));
                        int var16 = var4 - this.field2275[var27] - (var11 << 12);
                        int var17 = this.field2256;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 < 0 ? -var16 : var16;
                            int var19 = var15 >= 0 ? var15 : -var15;
                            var20 = var19 <= var18 ? var18 : var19;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var20 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var15 * var15;
                            int var25 = var16 * var16;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var20 < class74.field1293) {
                            class180.field3100 = class35.field525;
                            class35.field525 = class122.field2033;
                            class122.field2033 = class74.field1293;
                            class74.field1293 = var20;
                        } else if (class122.field2033 > var20) {
                            class180.field3100 = class35.field525;
                            class35.field525 = class122.field2033;
                            class122.field2033 = var20;
                        } else if (var20 < class35.field525) {
                            class180.field3100 = class35.field525;
                            class35.field525 = var20;
                        } else if (class180.field3100 > var20) {
                            class180.field3100 = var20;
                        }
                    }
                }
                int var26 = this.field2261;
                if (var26 == 0) {
                    var3[var7] = class74.field1293;
                } else if (var26 == 1) {
                    var3[var7] = class122.field2033;
                } else if (var26 == 3) {
                    var3[var7] = class35.field525;
                } else if (var26 == 4) {
                    var3[var7] = class180.field3100;
                } else if (var26 == 2) {
                    var3[var7] = class122.field2033 - class74.field1293;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V", line = 360)
    public static void method840(boolean arg0) {
        field2272 = null;
        field2276 = null;
        field2262 = null;
        field2257 = null;
        if (arg0) {
            field2262 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)I", line = 376)
    public static final int method841(int arg0, boolean arg1) {
        if (!arg1) {
            method836(121);
        }
        field2259++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfe;ZI)V", line = 398)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field2268++;
        if (arg1) {
            this.field2256 = -7;
        }
        if (arg2 == 0) {
            this.field2266 = this.field2267 = arg0.method1535((byte) 118);
        } else if (arg2 == 1) {
            this.field2255 = arg0.method1535((byte) 94);
        } else if (arg2 == 2) {
            this.field2260 = arg0.method1496(true);
        } else if (arg2 == 3) {
            this.field2261 = arg0.method1535((byte) 116);
        } else if (arg2 == 4) {
            this.field2256 = arg0.method1535((byte) 86);
        } else if (arg2 == 5) {
            this.field2266 = arg0.method1535((byte) 106);
        } else if (arg2 == 6) {
            this.field2267 = arg0.method1535((byte) 119);
        }
    }

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "(I)V", line = 482)
    public static final void method842(int arg0) {
        if (arg0 != 2) {
            method842(-47);
        }
        field2274++;
        class113.field1898 = new class269();
    }
}
