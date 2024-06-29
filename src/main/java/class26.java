import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class26 extends class117 {

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    private int field405 = 0;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "[S")
    private short[] field406 = new short[257];

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field410 = 0;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lhh;")
    public static class163 field409 = class137.method1065("Verbindung abgebrochen)3", 17);

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field411 = -1;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "[I")
    private int[] field401;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "[I")
    public static int[] field402;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "[I")
    public static int[] field412;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "[I")
    private int[] field413;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "[[I")
    private int[][] field403;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)V")
    private final void method164(byte arg0) {
        int[] var2 = this.field403[0];
        int[] var3 = this.field403[1];
        if (arg0 == 96) {
            ++field398;
            int[] var4 = this.field403[this.field403.length + -2];
            int[] var5 = this.field403[this.field403.length + -1];
            this.field401 = new int[] { -var5[0] - (-var4[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
            this.field413 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[1] - var3[1] - -var2[1] };
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[I")
    private final int[] method165(int arg0, int arg1) {
        ++field404;
        if (arg0 < 0) {
            return this.field413;
        } else if (arg1 != 1) {
            return null;
        } else {
            return ~this.field403.length >= ~arg0 ? this.field401 : this.field403[arg0];
        }
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public static void method166(int arg0) {
        field409 = null;
        field412 = null;
        field402 = null;
        if (arg0 != -14508) {
            field402 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
    private final void method167(int arg0) {
        if (arg0 == -20962) {
            int var2 = this.field405;
            if (var2 != 2) {
                if (~var2 == -2) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field403.length + -1 && ~this.field403[var5][0] >= ~var4; ++var5) {
                        }
                        int[] var6 = this.field403[var5];
                        int[] var7 = this.field403[var5 + -1];
                        int var8 = (-var7[0] + var4 << 12) / (var6[0] - var7[0]);
                        int var9 = -field412[255 & var8 >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field406[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; var14 < this.field403.length + -1 && ~var13 <= ~this.field403[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field403[var14];
                        int[] var16 = this.field403[var14 + -1];
                        int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field406[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~(this.field403.length - 1) < ~var22 && this.field403[var22][0] <= var21; ++var22) {
                    }
                    int[] var23 = this.field403[var22];
                    int[] var24 = this.field403[var22 + -1];
                    int var25 = this.method165(var22 + -2, 1)[1];
                    int var26 = var24[1];
                    int var27 = var23[1];
                    int var28 = this.method165(var22 + 1, arg0 ^ -20961)[1];
                    int var29 = (-var24[0] + var21 << 12) / (var23[0] - var24[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var27 - -var26 + -var25 + var28;
                    int var32 = -var31 + var25 - var26;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var35 + var36 + var37 + var26;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field406[var20] = (short) var38;
                }
            }
            ++field399;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 == arg1) {
            this.field405 = arg2.method622(true);
            this.field403 = new int[arg2.method622(true)][2];
            for (int var4 = 0; var4 < this.field403.length; ++var4) {
                this.field403[var4][0] = arg2.method658(93);
                this.field403[var4][1] = arg2.method658(class46.method340(arg0, -121));
            }
        }
        ++field400;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            this.field403 = null;
        }
        ++field407;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1, false, 0);
            for (int var5 = 0; ~var5 > ~class143.field2702; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field406[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        ++field414;
        if (arg0 > -92) {
            this.field403 = null;
        }
        if (this.field403 == null) {
            this.field403 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field403.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field405 == -3) {
                this.method164((byte) 96);
            }
            class223.method1578(true);
            this.method167(-20962);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)V")
    public static final void method168(byte arg0, boolean arg1) {
        int var2 = 34 % ((-41 - arg0) / 58);
        ++field408;
        if (class23.field378 != null) {
            try {
                class81 var3 = new class81(4);
                var3.method655(0, !arg1 ? 3 : 2);
                var3.method613(-126, 0);
                class23.field378.method1729(var3.field1562, 4, 0, 5000);
            } catch (IOException var5) {
                try {
                    class23.field378.method1724(true);
                } catch (Exception var4) {
                }
                ++class81.field1532;
                class23.field378 = null;
            }
        }
    }
}
