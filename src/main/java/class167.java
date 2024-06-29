import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class167 extends class259 {

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    private int field3060 = 2;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
    private int field3073 = 1;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    private int field3065 = 0;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
    private int field3069 = 5;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    private int field3061 = 2048;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    private int field3067 = 5;

    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "[S")
    private short[] field3077 = new short[512];

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "[B")
    private byte[] field3071 = new byte[512];

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field3064 = 100;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "J")
    public static long field3063 = 0L;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "Lsg;")
    public static class30 field3068 = method1221((byte) 33, "Benutzen");

    @OriginalMember(owner = "client!ea", name = "mb", descriptor = "[Lsg;")
    public static class30[] field3078 = new class30[500];

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "Lsg;")
    public static class30 field3075 = method1221((byte) 33, "headicons_prayer");

    @OriginalMember(owner = "client!ea", name = "ob", descriptor = "Lsg;")
    public static class30 field3080 = method1221((byte) 33, " x ");

    @OriginalMember(owner = "client!ea", name = "rb", descriptor = "Lsg;")
    public static class30 field3083 = method1221((byte) 33, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ea", name = "tb", descriptor = "Lsg;")
    public static class30 field3085 = method1221((byte) 33, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ea", name = "sb", descriptor = "Lb;")
    public static class48 field3084 = new class48();

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ea", name = "nb", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ea", name = "pb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ea", name = "qb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ea", name = "vb", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "Lmc;")
    public static class151 field3072;

    @OriginalMember(owner = "client!ea", name = "ub", descriptor = "[Lnb;")
    public static class265[] field3086;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLjava/lang/String;)Lsg;")
    public static final class30 method1221(byte arg0, String arg1) {
        ++field3070;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        if (arg0 != 33) {
            field3085 = null;
        }
        class30 var4 = new class30();
        var4.field618 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 255;
            if (var6 <= 45 && ~var6 <= -41) {
                if (~var5 <= ~var3) {
                    break;
                }
                int var7 = 255 & var2[var5++];
                var4.field618[var4.field576++] = (byte) ((var6 + -40) * 43 + (var7 - 48));
            } else if (~var6 != -1) {
                var4.field618[var4.field576++] = (byte) var6;
            }
        }
        var4.method263((byte) -116);
        return var4.method281((byte) -99);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    private final void method1222(boolean arg0) {
        ++field3079;
        if (!arg0) {
            Random var2 = new Random((long) this.field3065);
            this.field3077 = new short[512];
            if (this.field3061 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field3077[var3] = (short) class256.method1779(126, var2, this.field3061);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public static final void method1223(boolean arg0, int arg1) {
        ++field3062;
        byte[][] var2 = class159.field2992;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            int var12 = (class208.field3746[var5] >> 8) * 64 + -class22.field421;
            int var13 = (255 & class208.field3746[var5]) * 64 + -class196.field3547;
            byte[] var14 = var2[var5];
            if (var14 != null) {
                class67.method603((byte) -59);
                class212.method1513((class202.field3611 + -6) * 8, class100.field2054 * 8 + -48, var13, arg0, var12, 69, class100.field2032, var14);
            }
        }
        for (int var6 = 0; ~var6 > ~var4; ++var6) {
            int var8 = (class208.field3746[var6] >> 8) * 64 + -class22.field421;
            int var9 = (class208.field3746[var6] & 255) * 64 + -class196.field3547;
            byte[] var10 = var2[var6];
            if (var10 == null && class202.field3611 < 800) {
                class67.method603((byte) -59);
                for (int var11 = 0; var3 > var11; ++var11) {
                    class249.method1747(27522, 64, var8, var9, var11, 64);
                }
            }
        }
        int var7 = 14 % ((arg1 - 90) / 34);
    }

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field3083 = null;
        field3085 = null;
        field3084 = null;
        field3072 = null;
        if (arg0 >= -6) {
            method1223(false, 9);
        }
        field3078 = null;
        field3068 = null;
        field3086 = null;
        field3075 = null;
        field3080 = null;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field3087;
        this.field3071 = class117.method903(512, this.field3065);
        if (arg0 < 11) {
            method1225((byte) -68);
        }
        this.method1222(false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field3082;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (arg1) {
            this.method17(-51, false);
        }
        if (super.field4581.field4729) {
            int var4 = class154.field2910[arg0] * this.field3067 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~var7 > ~class223.field3999; ++var7) {
                class160.field3014 = Integer.MAX_VALUE;
                class208.field3747 = Integer.MAX_VALUE;
                class110.field2216 = Integer.MAX_VALUE;
                class120.field2356 = Integer.MAX_VALUE;
                int var8 = class29.field558[var7] * this.field3069 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field3071[255 & (var11 < this.field3067 ? var11 : -this.field3067 + var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = (this.field3071[(this.field3069 <= var14 ? -this.field3069 + var14 : var14) + var13 & 255] & 255) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field3077[var15] + var8;
                        int var17 = var4 - (this.field3077[var27] - -(var11 << 12));
                        int var18 = this.field3073;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class120.field2356) {
                            class160.field3014 = class208.field3747;
                            class208.field3747 = class110.field2216;
                            class110.field2216 = class120.field2356;
                            class120.field2356 = var19;
                        } else if (~var19 > ~class110.field2216) {
                            class160.field3014 = class208.field3747;
                            class208.field3747 = class110.field2216;
                            class110.field2216 = var19;
                        } else if (var19 < class208.field3747) {
                            class160.field3014 = class208.field3747;
                            class208.field3747 = var19;
                        } else if (~class160.field3014 < ~var19) {
                            class160.field3014 = var19;
                        }
                    }
                }
                int var12 = this.field3060;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class120.field2356 + class110.field2216;
                                }
                            } else {
                                var3[var7] = class160.field3014;
                            }
                        } else {
                            var3[var7] = class208.field3747;
                        }
                    } else {
                        var3[var7] = class110.field2216;
                    }
                } else {
                    var3[var7] = class120.field2356;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field3067 = arg2.method63((byte) 115);
                                }
                            } else {
                                this.field3069 = arg2.method63((byte) 66);
                            }
                        } else {
                            this.field3073 = arg2.method63((byte) 112);
                        }
                    } else {
                        this.field3060 = arg2.method63((byte) 83);
                    }
                } else {
                    this.field3061 = arg2.method65((byte) 117);
                }
            } else {
                this.field3065 = arg2.method63((byte) 90);
            }
        } else {
            this.field3069 = this.field3067 = arg2.method63((byte) 60);
        }
        ++field3081;
        if (arg1 != -1586849108) {
            method1225((byte) 13);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)[Lbj;")
    public static final class44[] method1225(byte arg0) {
        ++field3066;
        class44[] var1 = new class44[class23.field435];
        if (arg0 != 21) {
            return null;
        } else {
            for (int var2 = 0; class23.field435 > var2; ++var2) {
                int var3 = class62.field1329[var2] * class2.field33[var2];
                byte[] var4 = class222.field3992[var2];
                if (!class250.field4423[var2]) {
                    int[] var5 = new int[var3];
                    for (int var6 = 0; var3 > var6; ++var6) {
                        var5[var6] = class191.field3475[class68.method612(255, var4[var6])];
                    }
                    var1[var2] = new class152(class190.field3464, class273.field4774, class142.field2752[var2], class37.field895[var2], class62.field1329[var2], class2.field33[var2], var5);
                } else {
                    int[] var7 = new int[var3];
                    byte[] var8 = class197.field3559[var2];
                    for (int var9 = 0; var9 < var3; ++var9) {
                        var7[var9] = class182.method1314(class191.field3475[class68.method612(255, var4[var9])], class68.method612(255, var8[var9]) << 24);
                    }
                    var1[var2] = new class248(class190.field3464, class273.field4774, class142.field2752[var2], class37.field895[var2], class62.field1329[var2], class2.field33[var2], var7);
                }
            }
            class175.method1285((byte) 53);
            return var1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class167() {
        super(0, true);
    }
}
