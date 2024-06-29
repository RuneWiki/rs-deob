import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class92 extends class51 {

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    private int field2077 = 4096;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    private int field2078 = 2000;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
    private int field2081 = 16;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    private int field2082 = 0;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    private int field2076 = 0;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lea;")
    public static class38 field2085 = class9.method46((byte) 103, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lea;")
    public static class38 field2089 = class9.method46((byte) 102, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "Z")
    public static boolean field2083;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
    public static int[] field2079;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field2077 = arg0.method511(-122);
                        }
                    } else {
                        this.field2076 = arg0.method511(125);
                    }
                } else {
                    this.field2081 = arg0.method509(127);
                }
            } else {
                this.field2078 = arg0.method511(112);
            }
        } else {
            this.field2082 = arg0.method509(117);
        }
        if (!arg2) {
            this.method51((class66) null, -18, false);
        }
        ++field2090;
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
    public static final void method768(int arg0) {
        for (int var1 = -1; ~var1 > ~class50.field1247; ++var1) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class65.field1556[var1];
            }
            class144 var6 = class175.field3550[var5];
            if (var6 != null && ~var6.field402 < -1) {
                --var6.field402;
                if (var6.field402 == 0) {
                    var6.field434 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class177.field3593; ++var2) {
            int var3 = class170.field3488[var2];
            class102 var4 = class105.field2343[var3];
            if (var4 != null && ~var4.field402 < -1) {
                --var4.field402;
                if (~var4.field402 == -1) {
                    var4.field434 = null;
                }
            }
        }
        ++field2086;
        if (arg0 != 4096) {
            field2083 = false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static void method769(byte arg0) {
        field2089 = null;
        field2079 = null;
        field2085 = null;
        int var1 = 34 % ((-30 - arg0) / 33);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        if (arg0 == -2) {
            class165.method1177(-109);
            ++field2088;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int[] var3 = super.field1312.method827(arg1, true);
        if (arg0 > -125) {
            return null;
        } else {
            if (super.field1312.field2271) {
                int var4 = this.field2077 >> 1;
                int[][] var5 = super.field1312.method831(89);
                Random var6 = new Random((long) this.field2082);
                for (int var7 = 0; ~var7 > ~this.field2078; ++var7) {
                    int var8 = ~this.field2077 >= -1 ? this.field2076 : this.field2076 - -class54.method393(this.field2077, var6, (byte) -76) - var4;
                    int var9 = (var8 & 4084) >> 4;
                    int var10 = class54.method393(class86.field2008, var6, (byte) -101);
                    int var11 = class54.method393(class114.field2528, var6, (byte) -90);
                    int var12 = (class29.field581[var9] * this.field2081 >> 12) + var11;
                    int var13 = (class33.field673[var9] * this.field2081 >> 12) + var10;
                    int var14 = var12 - var11;
                    int var15 = -var10 + var13;
                    if (var15 != 0 || ~var14 != -1) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = ~var15 > ~var14;
                        if (var16) {
                            int var17 = var13;
                            int var18 = var10;
                            var10 = var11;
                            var11 = var18;
                            var13 = var12;
                            var12 = var17;
                        }
                        if (~var10 < ~var13) {
                            int var19 = var10;
                            var10 = var13;
                            var13 = var19;
                            int var20 = var11;
                            var11 = var12;
                            var12 = var20;
                        }
                        int var21 = var13 - var10;
                        int var22 = var11;
                        int var23 = -var11 + var12;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var24 = 2048 / var21;
                        int var25 = -var21 / 2;
                        int var26 = 1024 + -(class54.method393(4096, var6, (byte) -91) >> 2);
                        int var27 = var11 < var12 ? 1 : -1;
                        for (int var28 = var10; ~var28 > ~var13; ++var28) {
                            int var29 = class39.field850 & var28;
                            int var30 = class144.field3018 & var22;
                            int var31 = (-var10 + var28) * var24 + var26 + 1024;
                            if (!var16) {
                                var5[var29][var30] = var31;
                            } else {
                                var5[var30][var29] = var31;
                            }
                            var25 += var23;
                            if (var25 > 0) {
                                var22 += var27;
                                var25 -= var21;
                            }
                        }
                    }
                }
            }
            ++field2084;
            return var3;
        }
    }
}
