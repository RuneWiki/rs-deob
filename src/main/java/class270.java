import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class270 extends class276 {

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "[S")
    private short[] field4357 = new short[257];

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    private int field4360 = 0;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "Z")
    public static boolean field4344 = false;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    public static int field4358 = 1;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "Ljava/awt/Frame;")
    public static Frame field4349;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "[I")
    private int[] field4351;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "[I")
    private int[] field4356;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "[[I")
    private int[][] field4359;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V")
    private final void method1771(int arg0) {
        int var2 = this.field4360;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field4359.length - 1) < ~var5 && ~var4 <= ~this.field4359[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field4359[var5 + -1];
                    int[] var7 = this.field4359[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class42.field620[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4357[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field4359.length + -1 && var13 >= this.field4359[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field4359[var14 - 1];
                    int[] var16 = this.field4359[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field4357[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field4359.length + -1 && ~var21 <= ~this.field4359[var22][0]; ++var22) {
                }
                int[] var23 = this.field4359[var22 + -1];
                int[] var24 = this.field4359[var22];
                int var25 = this.method1777(var22 + -2, 121)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1777(var22 - -1, 118)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var28 - -var26;
                int var32 = -var26 - var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - (-var36 + -var37) - -var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4357[var20] = (short) var38;
            }
        }
        ++field4350;
        if (arg0 != -16989) {
            method1773((String) null, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)Ljava/lang/String;")
    public static final String method1772(int arg0, int arg1) {
        ++field4355;
        if (arg1 != 24096) {
            return null;
        } else {
            return arg0 < 999999999 ? Integer.toString(arg0) : "*";
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1773(String arg0, byte arg1) {
        if (arg1 != -48) {
            return true;
        } else {
            ++field4354;
            if (arg0 == null) {
                return false;
            } else {
                for (int var2 = 0; class228.field3837 > var2; ++var2) {
                    if (arg0.equalsIgnoreCase(class5.field63[var2])) {
                        return true;
                    }
                }
                return arg0.equalsIgnoreCase(class273.field4378.field4601);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public static void method1774(byte arg0) {
        field4349 = null;
        if (arg0 != -33) {
            field4349 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class270() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
    private final void method1775(int arg0) {
        ++field4352;
        int[] var2 = this.field4359[0];
        int[] var3 = this.field4359[arg0];
        int[] var4 = this.field4359[this.field4359.length + -1];
        int[] var5 = this.field4359[this.field4359.length + -2];
        this.field4351 = new int[] { var5[0] - var4[0] - -var5[0], var5[1] - var4[1] - -var5[1] };
        this.field4356 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        ++field4347;
        if (this.field4359 == null) {
            this.field4359 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field4359.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field4360 == -3) {
                this.method1775(1);
            }
            class76.method465(69);
            if (arg0 <= 66) {
                field4349 = null;
            }
            this.method1771(-16989);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public static final void method1776(byte arg0) {
        ++field4346;
        if (arg0 > 0) {
            method1776((byte) -83);
        }
        for (class194 var1 = (class194) class41.field607.method782(0); var1 != null; var1 = (class194) class41.field607.method788(true)) {
            int var2 = var1.field3128;
            if (class110.method766(-13786, var2)) {
                boolean var3 = true;
                class46[] var4 = class115.field2068[var2];
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field734;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1515;
                    class46 var7 = class108.method760(-29533, var6);
                    if (var7 != null) {
                        class79.method516(-373, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(II)[I")
    private final int[] method1777(int arg0, int arg1) {
        if (arg1 <= 117) {
            this.field4351 = null;
        }
        ++field4353;
        if (~arg0 > -1) {
            return this.field4356;
        } else {
            return this.field4359.length <= arg0 ? this.field4351 : this.field4359[arg0];
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            this.method1775(113);
        }
        ++field4348;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, arg1);
            for (int var5 = 0; var5 < class53.field929; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field4357[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            this.field4357 = null;
        }
        if (~arg0 == -1) {
            this.field4360 = arg1.method669((byte) 36);
            this.field4359 = new int[arg1.method669((byte) 36)][2];
            for (int var4 = 0; this.field4359.length > var4; ++var4) {
                this.field4359[var4][0] = arg1.method677(false);
                this.field4359[var4][1] = arg1.method677(false);
            }
        }
        ++field4345;
    }
}
