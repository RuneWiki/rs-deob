import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class148 extends class303 {

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    private int field2385 = 2;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    private int field2384 = 5;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    private int field2382 = 0;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    private int field2383 = 2048;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "[S")
    private short[] field2391 = new short[512];

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    private int field2393 = 1;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    private int field2392 = 5;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[B")
    private byte[] field2397 = new byte[512];

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "[I")
    public static int[] field2386;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "[[[I")
    public static int[][][] field2387;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 3)
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V", line = 10)
    public static final void method1145(int arg0) {
        if (arg0 != 81) {
            field2386 = (int[]) null;
        }
        if (class43.field761 == 2) {
            if (class275.field4270 == class147.field2370 && class22.field396 == class138.field2198) {
                class43.field761 = 0;
                if (class277.field4288 && class108.field1795[81] && class65.field1062 > 2) {
                    class132.method1003(class65.field1062 - 2, (byte) -32);
                } else {
                    class132.method1003(class65.field1062 - 1, (byte) -19);
                }
            }
        } else if (class275.field4270 == class223.field3569 && class267.field4136 == class138.field2198) {
            class43.field761 = 0;
            if (class277.field4288 && class108.field1795[81] && class65.field1062 > 2) {
                class132.method1003(class65.field1062 - 2, (byte) 113);
            } else {
                class132.method1003(class65.field1062 - 1, (byte) 124);
            }
        } else {
            class43.field761 = 2;
            class22.field396 = class267.field4136;
            class147.field2370 = class223.field3569;
        }
        field2394++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lja;III)[Lnb;", line = 78)
    public static final class315[] method1146(class64 arg0, int arg1, int arg2, int arg3) {
        field2395++;
        if (class150.method1152(arg0, arg3, 50, arg2)) {
            if (arg1 != 27164) {
                method1147(false);
            }
            return class273.method1969(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 95)
    public static void method1147(boolean arg0) {
        if (!arg0) {
            field2387 = (int[][][]) ((int[][][]) null);
        }
        field2387 = (int[][][]) null;
        field2386 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)[I", line = 113)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            return (int[]) null;
        }
        field2396++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = class36.field591[arg1] * this.field2392 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class70.field1108; var7++) {
                class145.field2269 = Integer.MAX_VALUE;
                class310.field4876 = Integer.MAX_VALUE;
                class324.field5029 = Integer.MAX_VALUE;
                class116.field1895 = Integer.MAX_VALUE;
                int var8 = class291.field4427[var7] * this.field2384 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2397[(var11 < this.field2392 ? var11 : var11 - this.field2392) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2397[var12 + (var13 < this.field2384 ? var13 : var13 - this.field2384) & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field2391[var14];
                        int var16 = -(var11 << 12) - (this.field2391[var27] - var4);
                        int var17 = this.field2393;
                        int var21;
                        if (var17 == 1) {
                            var21 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 >= 0 ? var15 : -var15;
                            var21 = var24 >= var25 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var18 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var19 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var20 = var18 + var19;
                            var21 = var20 * var20 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var15 * var15;
                            int var23 = var16 * var16;
                            var21 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var21 = (var15 < 0 ? -var15 : var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var21 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class116.field1895 > var21) {
                            class145.field2269 = class310.field4876;
                            class310.field4876 = class324.field5029;
                            class324.field5029 = class116.field1895;
                            class116.field1895 = var21;
                        } else if (class324.field5029 > var21) {
                            class145.field2269 = class310.field4876;
                            class310.field4876 = class324.field5029;
                            class324.field5029 = var21;
                        } else if (var21 < class310.field4876) {
                            class145.field2269 = class310.field4876;
                            class310.field4876 = var21;
                        } else if (class145.field2269 > var21) {
                            class145.field2269 = var21;
                        }
                    }
                }
                int var26 = this.field2385;
                if (var26 == 0) {
                    var3[var7] = class116.field1895;
                } else if (var26 == 1) {
                    var3[var7] = class324.field5029;
                } else if (var26 == 3) {
                    var3[var7] = class310.field4876;
                } else if (var26 == 4) {
                    var3[var7] = class145.field2269;
                } else if (var26 == 2) {
                    var3[var7] = class324.field5029 - class116.field1895;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[Ldb;)V", line = 328)
    public static final void method1148(int arg0, class186[] arg1) {
        class300.field4723[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 335)
    public final void method70(int arg0) {
        field2389++;
        this.field2397 = class247.method1757(this.field2382, 511);
        if (arg0 < 13) {
            this.method70(-54);
        }
        this.method1149(-5163);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V", line = 347)
    private final void method1149(int arg0) {
        field2390++;
        Random var2 = new Random((long) this.field2382);
        if (arg0 != -5163) {
            this.field2393 = 119;
        }
        this.field2391 = new short[512];
        if (this.field2383 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2391[var3] = (short) class86.method621((byte) 102, var2, this.field2383);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILpe;I)V", line = 385)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field2388++;
        if (arg0 != -4004) {
            return;
        }
        if (arg2 == 0) {
            this.field2384 = this.field2392 = arg1.method741(12);
        } else if (arg2 == 1) {
            this.field2382 = arg1.method741(54);
        } else if (arg2 == 2) {
            this.field2383 = arg1.method731(false);
        } else if (arg2 == 3) {
            this.field2385 = arg1.method741(8);
        } else if (arg2 == 4) {
            this.field2393 = arg1.method741(arg0 ^ 0xFFFFF04E);
        } else if (arg2 == 5) {
            this.field2384 = arg1.method741(99);
        } else if (arg2 == 6) {
            this.field2392 = arg1.method741(86);
        }
    }
}
