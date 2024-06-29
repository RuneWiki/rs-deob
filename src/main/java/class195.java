import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class195 extends class175 {

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    private int field3243 = 0;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "[S")
    private short[] field3241 = new short[257];

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Lij;")
    public static class50 field3231 = class78.method578(124, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Lij;")
    public static class50 field3230 = class78.method578(122, "(R");

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Z")
    public static boolean field3242 = false;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lij;")
    public static class50 field3244 = class78.method578(124, "<img=0>");

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Lwi;")
    public static class21 field3238;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "[I")
    private int[] field3234;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "[I")
    private int[] field3240;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[[I")
    private int[][] field3245;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field3239;
        if (~arg1 == -1) {
            this.field3243 = arg2.method1487(255);
            this.field3245 = new int[arg2.method1487(255)][2];
            for (int var4 = 0; var4 < this.field3245.length; ++var4) {
                this.field3245[var4][0] = arg2.method1441(-112);
                this.field3245[var4][1] = arg2.method1441(-124);
            }
        }
        if (!arg0) {
            field3238 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)[I")
    private final int[] method1314(int arg0, int arg1) {
        ++field3236;
        if (arg1 < 0) {
            return this.field3234;
        } else if (this.field3245.length <= arg1) {
            return this.field3240;
        } else {
            if (arg0 != 1349967268) {
                this.method1317((byte) 17);
            }
            return this.field3245[arg1];
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class195() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
    private final void method1315(byte arg0) {
        int var2 = 105 % ((arg0 - -43) / 54);
        int var3 = this.field3243;
        if (~var3 != -3) {
            if (~var3 == -2) {
                for (int var4 = 0; ~var4 > -258; ++var4) {
                    int var5 = var4 << 4;
                    int var6;
                    for (var6 = 1; ~(this.field3245.length - 1) < ~var6 && ~this.field3245[var6][0] >= ~var5; ++var6) {
                    }
                    int[] var7 = this.field3245[var6 + -1];
                    int[] var8 = this.field3245[var6];
                    int var9 = (var5 - var7[0] << 12) / (var8[0] + -var7[0]);
                    int var10 = -class241.field4151[(var9 & 8161) >> 5] + 4096 >> 1;
                    int var11 = -var10 + 4096;
                    int var12 = var7[1] * var11 + var8[1] * var10 >> 12;
                    if (~var12 >= 32767) {
                        var12 = -32767;
                    }
                    if (var12 >= 32768) {
                        var12 = 32767;
                    }
                    this.field3241[var4] = (short) var12;
                }
            } else {
                for (int var13 = 0; ~var13 > -258; ++var13) {
                    int var14 = var13 << 4;
                    int var15;
                    for (var15 = 1; ~(this.field3245.length + -1) < ~var15 && ~var14 <= ~this.field3245[var15][0]; ++var15) {
                    }
                    int[] var16 = this.field3245[var15 - 1];
                    int[] var17 = this.field3245[var15];
                    int var18 = (-var16[0] + var14 << 12) / (var17[0] + -var16[0]);
                    int var19 = -var18 + 4096;
                    int var20 = var16[1] * var19 + var17[1] * var18 >> 12;
                    if (~var20 >= 32767) {
                        var20 = -32767;
                    }
                    if (~var20 <= -32769) {
                        var20 = 32767;
                    }
                    this.field3241[var13] = (short) var20;
                }
            }
        } else {
            for (int var21 = 0; var21 < 257; ++var21) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; var23 < this.field3245.length + -1 && ~var22 <= ~this.field3245[var23][0]; ++var23) {
                }
                int[] var24 = this.field3245[var23 + -1];
                int[] var25 = this.field3245[var23];
                int var26 = this.method1314(1349967268, var23 + -2)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method1314(1349967268, var23 + 1)[1];
                int var30 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = -var26 + var29 + var27 - var28;
                int var33 = -var27 + var26 - var32;
                int var35 = -var26 + var28;
                int var36 = var31 * var33 >> 12;
                int var37 = (var30 * var32 >> 12) * var31 >> 12;
                int var38 = var30 * var35 >> 12;
                int var39 = var27 + var36 + var37 + var38;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (~var39 <= -32769) {
                    var39 = 32767;
                }
                this.field3241[var21] = (short) var39;
            }
        }
        ++field3235;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field3233;
        if (arg1 != -27746) {
            field3242 = true;
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(0, arg0, 16745);
            for (int var5 = 0; class211.field3514 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3241[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lda;B)V")
    public static final void method1316(class22 arg0, byte arg1) {
        int var2 = -65 % ((arg1 - -86) / 38);
        class91.field1721 = arg0.method186(48, class54.field975);
        ++field3247;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V")
    private final void method1317(byte arg0) {
        ++field3246;
        if (arg0 > 101) {
            int[] var2 = this.field3245[0];
            int[] var3 = this.field3245[1];
            int[] var4 = this.field3245[this.field3245.length + -1];
            int[] var5 = this.field3245[this.field3245.length + -2];
            this.field3234 = new int[] { var2[0] - -var2[0] + -var3[0], var2[1] + -var3[1] + var2[1] };
            this.field3240 = new int[] { var5[0] + -var4[0] + var5[0], var5[1] - (var4[1] + -var5[1]) };
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)V")
    public static void method1318(byte arg0) {
        if (arg0 <= 6) {
            field3242 = false;
        }
        field3238 = null;
        field3231 = null;
        field3230 = null;
        field3244 = null;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (this.field3245 == null) {
            this.field3245 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 != 0) {
            this.field3240 = null;
        }
        ++field3232;
        if (this.field3245.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3243 == -3) {
                this.method1317((byte) 125);
            }
            class160.method1128((byte) -98);
            this.method1315((byte) 26);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILwd;)V")
    public static final void method1319(int arg0, class217 arg1) {
        ++field3237;
        byte[] var2 = new byte[24];
        if (arg0 == 9157) {
            if (class211.field3506 != null) {
                try {
                    class211.field3506.method562(0L, -103);
                    class211.field3506.method566(var2, false);
                    int var3;
                    for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
                    }
                    if (var3 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var5) {
                    for (int var4 = 0; var4 < 24; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg1.method1491(0, var2, 24, (byte) 113);
        }
    }
}
