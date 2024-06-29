import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class244 extends class222 {

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    private int field4227 = 2;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "I")
    private int field4232 = 0;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "[B")
    private byte[] field4235 = new byte[512];

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
    private int field4236 = 2048;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "[S")
    private short[] field4228 = new short[512];

    @OriginalMember(owner = "client!gi", name = "qb", descriptor = "I")
    private int field4243 = 5;

    @OriginalMember(owner = "client!gi", name = "lb", descriptor = "I")
    private int field4238 = 5;

    @OriginalMember(owner = "client!gi", name = "rb", descriptor = "I")
    private int field4244 = 1;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "Lsb;")
    public static class98 field4224 = class47.method368("Gegenstand f-Ur Mitglieder", 0);

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "J")
    public static volatile long field4230 = 0L;

    @OriginalMember(owner = "client!gi", name = "kb", descriptor = "Lsb;")
    public static class98 field4237 = class47.method368(":duelstake:", 0);

    @OriginalMember(owner = "client!gi", name = "mb", descriptor = "Z")
    public static boolean field4239 = false;

    @OriginalMember(owner = "client!gi", name = "nb", descriptor = "[I")
    public static int[] field4240 = new int[2048];

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "Lfj;")
    public static class236 field4225 = new class236();

    @OriginalMember(owner = "client!gi", name = "sb", descriptor = "Lsb;")
    public static class98 field4245 = class47.method368("<col=80ff00>", 0);

    @OriginalMember(owner = "client!gi", name = "ub", descriptor = "Lsb;")
    public static class98 field4247 = class47.method368("<col=ffffff>", 0);

    @OriginalMember(owner = "client!gi", name = "tb", descriptor = "J")
    public static long field4246 = 0L;

    @OriginalMember(owner = "client!gi", name = "wb", descriptor = "Lsb;")
    public static class98 field4249 = class47.method368(":", 0);

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!gi", name = "pb", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!gi", name = "ob", descriptor = "J")
    public static long field4241;

    @OriginalMember(owner = "client!gi", name = "vb", descriptor = "[[[I")
    public static int[][][] field4248;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public static void method1680(int arg0) {
        field4240 = null;
        int var1 = -109 % ((arg0 - -21) / 59);
        field4248 = null;
        field4245 = null;
        field4249 = null;
        field4247 = null;
        field4237 = null;
        field4225 = null;
        field4224 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1681(Component arg0, byte arg1) {
        arg0.addMouseListener(class71.field1129);
        arg0.addMouseMotionListener(class71.field1129);
        int var2 = -56 % ((arg1 - -41) / 54);
        arg0.addFocusListener(class71.field1129);
        ++field4234;
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    public static final void method1682(int arg0) {
        class144.field2536.method491(-1);
        if (arg0 == 21862) {
            int var1 = class144.field2536.method483(arg0 + -21854, 8);
            if (~class222.field3837 < ~var1) {
                for (int var2 = var1; ~var2 > ~class222.field3837; ++var2) {
                    class115.field2071[class31.field557++] = class87.field1546[var2];
                }
            }
            ++field4229;
            if (~class222.field3837 > ~var1) {
                throw new RuntimeException("gnpov1");
            } else {
                class222.field3837 = 0;
                for (int var3 = 0; var3 < var1; ++var3) {
                    int var4 = class87.field1546[var3];
                    class108 var5 = class180.field3109[var4];
                    int var6 = class144.field2536.method483(8, 1);
                    if (~var6 == -1) {
                        class87.field1546[class222.field3837++] = var4;
                        var5.field4456 = class236.field4071;
                    } else {
                        int var7 = class144.field2536.method483(8, 2);
                        if (var7 == 0) {
                            class87.field1546[class222.field3837++] = var4;
                            var5.field4456 = class236.field4071;
                            field4240[class104.field1855++] = var4;
                        } else if (~var7 == -2) {
                            class87.field1546[class222.field3837++] = var4;
                            var5.field4456 = class236.field4071;
                            int var8 = class144.field2536.method483(8, 3);
                            var5.method1763(var8, false, (byte) 108);
                            int var9 = class144.field2536.method483(8, 1);
                            if (~var9 == -2) {
                                field4240[class104.field1855++] = var4;
                            }
                        } else if (var7 == 2) {
                            class87.field1546[class222.field3837++] = var4;
                            var5.field4456 = class236.field4071;
                            int var10 = class144.field2536.method483(8, 3);
                            var5.method1763(var10, true, (byte) 114);
                            int var11 = class144.field2536.method483(arg0 ^ 21870, 3);
                            var5.method1763(var11, true, (byte) 92);
                            int var12 = class144.field2536.method483(arg0 + -21854, 1);
                            if (var12 == 1) {
                                field4240[class104.field1855++] = var4;
                            }
                        } else if (var7 == 3) {
                            class115.field2071[class31.field557++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
    private final void method1683(int arg0) {
        Random var2 = new Random((long) this.field4232);
        this.field4228 = new short[512];
        if (arg0 < this.field4236) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4228[var3] = (short) class124.method926(arg0 + -118, this.field4236, var2);
            }
        }
        ++field4242;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field4226;
        int var2 = -41 % ((arg0 - 57) / 51);
        this.field4235 = class256.method1771(12371, this.field4232);
        this.method1683(0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILsb;)V")
    public static final void method1684(int arg0, int arg1, class98 arg2) {
        if (arg1 != 12452) {
            method1681((Component) null, (byte) -92);
        }
        ++field4233;
        class134 var3 = class115.method861(2, (byte) 32, arg0);
        var3.method1011(true);
        var3.field2377 = arg2;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field4238 = arg0.method1446(5350);
                                }
                            } else {
                                this.field4243 = arg0.method1446(5350);
                            }
                        } else {
                            this.field4244 = arg0.method1446(5350);
                        }
                    } else {
                        this.field4227 = arg0.method1446(5350);
                    }
                } else {
                    this.field4236 = arg0.method1487(16);
                }
            } else {
                this.field4232 = arg0.method1446(5350);
            }
        } else {
            this.field4243 = this.field4238 = arg0.method1446(5350);
        }
        if (arg1) {
            this.method1683(-81);
        }
        ++field4231;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field4223;
        if (arg0 <= 35) {
            return null;
        } else {
            int[] var3 = super.field3844.method22(0, arg1);
            if (super.field3844.field61) {
                int var4 = class214.field3639[arg1] * this.field4238 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 - -1;
                for (int var7 = 0; class13.field253 > var7; ++var7) {
                    class87.field1536 = Integer.MAX_VALUE;
                    class71.field1145 = Integer.MAX_VALUE;
                    class84.field1481 = Integer.MAX_VALUE;
                    class93.field1637 = Integer.MAX_VALUE;
                    int var8 = class261.field4577[var7] * this.field4243 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 - -1;
                    for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                        int var13 = 255 & this.field4235[255 & (~var11 > ~this.field4238 ? var11 : -this.field4238 + var11)];
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = (this.field4235[255 & var13 - -(~var14 > ~this.field4243 ? var14 : -this.field4243 + var14)] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = var8 + (-this.field4228[var15] - (var14 << 12));
                            int var17 = var4 - (var11 << 12) - this.field4228[var27];
                            int var18 = this.field4244;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (var17 >= 0 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 - -var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 < 0 ? -var16 : var16;
                                    int var26 = ~var17 > -1 ? -var17 : var17;
                                    var19 = ~var25 < ~var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~var19 <= ~class93.field1637) {
                                if (var19 < class84.field1481) {
                                    class87.field1536 = class71.field1145;
                                    class71.field1145 = class84.field1481;
                                    class84.field1481 = var19;
                                } else if (var19 < class71.field1145) {
                                    class87.field1536 = class71.field1145;
                                    class71.field1145 = var19;
                                } else if (~class87.field1536 < ~var19) {
                                    class87.field1536 = var19;
                                }
                            } else {
                                class87.field1536 = class71.field1145;
                                class71.field1145 = class84.field1481;
                                class84.field1481 = class93.field1637;
                                class93.field1637 = var19;
                            }
                        }
                    }
                    int var12 = this.field4227;
                    if (var12 != 0) {
                        if (~var12 != -2) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = -class93.field1637 + class84.field1481;
                                    }
                                } else {
                                    var3[var7] = class87.field1536;
                                }
                            } else {
                                var3[var7] = class71.field1145;
                            }
                        } else {
                            var3[var7] = class84.field1481;
                        }
                    } else {
                        var3[var7] = class93.field1637;
                    }
                }
            }
            return var3;
        }
    }
}
