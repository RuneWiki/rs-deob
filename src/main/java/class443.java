import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class443 extends class270 {

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    private int field6429 = 0;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    private int field6425 = 1;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    private int field6434 = 5;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    private int field6439 = 2;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    private int field6428 = 2048;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "[B")
    private byte[] field6448 = new byte[512];

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    private int field6437 = 5;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "[S")
    private short[] field6444 = new short[512];

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field6443 = 0;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field6446 = 50;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "[I")
    public static int[] field6445 = new int[field6446];

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "[I")
    public static int[] field6431 = new int[field6446];

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "[I")
    public static int[] field6432 = new int[field6446];

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "[I")
    public static int[] field6427 = new int[field6446];

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "[I")
    public static int[] field6442 = new int[field6446];

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field6438 = new String[100];

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "[I")
    public static int[] field6436 = new int[32];

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "[I")
    public static int[] field6433 = new int[field6446];

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field6440 = new String[field6446];

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Ldp;")
    public static class174 field6441;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Lof;")
    public static class421 field6423;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "[[[Lsk;")
    public static class168[][][] field6447;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        ++field6450;
        if (!arg0) {
            method2771(41, 80);
        }
        this.field6448 = class105.method937(-63, this.field6429);
        this.method2770((byte) 101);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field6434 = arg1.method271((byte) 112);
                                }
                            } else {
                                this.field6437 = arg1.method271((byte) 101);
                            }
                        } else {
                            this.field6425 = arg1.method271((byte) 111);
                        }
                    } else {
                        this.field6439 = arg1.method271((byte) 125);
                    }
                } else {
                    this.field6428 = arg1.method320((byte) -87);
                }
            } else {
                this.field6429 = arg1.method271((byte) 102);
            }
        } else {
            this.field6437 = this.field6434 = arg1.method271((byte) 126);
        }
        if (arg0 != 108) {
            method2768(-50);
        }
        ++field6435;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class443() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static void method2768(int arg0) {
        if (arg0 != -1) {
            field6431 = null;
        }
        field6445 = null;
        field6438 = null;
        field6436 = null;
        field6440 = null;
        field6432 = null;
        field6423 = null;
        field6441 = null;
        field6433 = null;
        field6427 = null;
        field6442 = null;
        field6431 = null;
        field6447 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2769(int arg0, byte[] arg1) {
        ++field6426;
        int var2 = 105 % ((12 - arg0) / 52);
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class82.method637(arg1, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        if (arg0 <= 26) {
            return null;
        } else {
            ++field6424;
            int[] var3 = super.field4053.method396(arg1, -75);
            if (super.field4053.field815) {
                int var4 = class364.field5185[arg1] * this.field6434 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class161.field2445; ++var7) {
                    class355.field5048 = Integer.MAX_VALUE;
                    class389.field5595 = Integer.MAX_VALUE;
                    class205.field3005 = Integer.MAX_VALUE;
                    class255.field3691 = Integer.MAX_VALUE;
                    int var8 = 2048 - -(class136.field2168[var7] * this.field6437);
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                        int var13 = this.field6448[(var11 >= this.field6434 ? -this.field6434 + var11 : var11) & 255] & 255;
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = 2 * (255 & this.field6448[255 & var13 + (~var14 > ~this.field6437 ? var14 : -this.field6437 + var14)]);
                            int var10000 = var8 - (var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field6444[var15];
                            int var17 = -this.field6444[var27] - (var11 << 12) + var4;
                            int var18 = this.field6425;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (~var17 <= -1 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 < 0 ? -var17 : var17;
                                    int var26 = var16 < 0 ? -var16 : var16;
                                    var19 = var26 > var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (~class255.field3691 < ~var19) {
                                class355.field5048 = class389.field5595;
                                class389.field5595 = class205.field3005;
                                class205.field3005 = class255.field3691;
                                class255.field3691 = var19;
                            } else if (~var19 > ~class205.field3005) {
                                class355.field5048 = class389.field5595;
                                class389.field5595 = class205.field3005;
                                class205.field3005 = var19;
                            } else if (var19 >= class389.field5595) {
                                if (var19 < class355.field5048) {
                                    class355.field5048 = var19;
                                }
                            } else {
                                class355.field5048 = class389.field5595;
                                class389.field5595 = var19;
                            }
                        }
                    }
                    int var12 = this.field6439;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class255.field3691 + class205.field3005;
                                    }
                                } else {
                                    var3[var7] = class355.field5048;
                                }
                            } else {
                                var3[var7] = class389.field5595;
                            }
                        } else {
                            var3[var7] = class205.field3005;
                        }
                    } else {
                        var3[var7] = class255.field3691;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
    private final void method2770(byte arg0) {
        ++field6430;
        Random var2 = new Random((long) this.field6429);
        if (arg0 <= 42) {
            field6446 = -61;
        }
        this.field6444 = new short[512];
        if (~this.field6428 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field6444[var3] = (short) class11.method74(this.field6428, 16384, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lcg;")
    public static final class269 method2771(int arg0, int arg1) {
        ++field6449;
        class269 var2 = (class269) class132.field2134.method2228(-1, (long) arg1);
        if (arg0 != 2048) {
            return null;
        } else if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class280.field4199.method1355(class198.method1509(arg1, 121), -12607, class358.method2301(arg1, 1751284680));
            class269 var4 = new class269();
            if (var3 != null) {
                var4.method1916(arg0 ^ -2049, new class37(var3));
            }
            class132.field2134.method2226((long) arg1, var4, (byte) -108);
            return var4;
        }
    }
}
