import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class46 extends class325 {

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    private int field691 = 0;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "[S")
    private short[] field695 = new short[257];

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field696 = new BigInteger("c1007f013d1a958876a3c66e838e9843469d41646ba10112ab6a280bab25374f9d72b994183a7996d5e2c3ec645c265eb522881a9f6b6d223637643fb474870d", 16);

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "[I")
    private int[] field690;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "[I")
    private int[] field699;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "[[I")
    private int[][] field697;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Ltg;")
    public static final class244 method350(int arg0, int arg1) {
        ++field694;
        class244 var2 = (class244) class120.field1754.method713((long) arg0, 67);
        if (arg1 != 23899) {
            field696 = null;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class383.field5606.method2095(0, arg0, 1);
            if (var3 != null && var3.length > 1) {
                class244 var4;
                try {
                    var4 = class304.method1915(var3, -1);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg0);
                }
                class120.field1754.method717(var4, arg1 ^ 23843, (long) arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field692;
        if (arg0 < 21) {
            method352((class333) null, -123);
        }
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(arg1, 0, (byte) 33);
            for (int var5 = 0; ~class261.field3874 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field695[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        if (this.field697 == null) {
            this.field697 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field686;
        if (~this.field697.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field691 == -3) {
                this.method351((byte) 76);
            }
            class38.method266(arg0);
            this.method356((byte) -81);
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(B)V")
    private final void method351(byte arg0) {
        ++field689;
        int[] var2 = this.field697[0];
        int[] var3 = this.field697[1];
        int[] var4 = this.field697[this.field697.length - 2];
        int[] var5 = this.field697[this.field697.length + -1];
        this.field690 = new int[] { var2[0] + var2[0] - var3[0], var2[1] - (-var2[1] - -var3[1]) };
        this.field699 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + var4[1] - var5[1] };
        if (arg0 <= 27) {
            this.field695 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Laj;I)V")
    public static final void method352(class333 arg0, int arg1) {
        ++field693;
        class407.field5894 = arg0.method2092("hitmarks", false);
        class446.field6260 = arg0.method2092("hitbar_default", false);
        class453.field6296 = arg0.method2092("timerbar_default", false);
        if (arg1 != 0) {
            method350(117, -93);
        }
        class62.field893 = arg0.method2092("headicons_pk", false);
        class683.field9621 = arg0.method2092("headicons_prayer", false);
        class359.field5245 = arg0.method2092("hint_headicons", false);
        class352.field5162 = arg0.method2092("hint_mapmarkers", false);
        class441.field6218 = arg0.method2092("mapflag", false);
        class24.field380 = arg0.method2092("cross", false);
        class163.field2212 = arg0.method2092("mapdots", false);
        class170.field2265 = arg0.method2092("scrollbar", false);
        class560.field7530 = arg0.method2092("name_icons", false);
        class54.field768 = arg0.method2092("floorshadows", false);
        class714.field9981 = arg0.method2092("compass", false);
        class475.field6611 = arg0.method2092("otherlevel", false);
        class330.field4774 = arg0.method2092("hint_mapedge", false);
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "(B)V")
    public static void method353(byte arg0) {
        if (arg0 <= -123) {
            field696 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field691 = arg0.method2398(-1372747256);
            this.field697 = new int[arg0.method2398(-1372747256)][2];
            for (int var4 = 0; var4 < this.field697.length; ++var4) {
                this.field697[var4][0] = arg0.method2359(-1);
                this.field697[var4][1] = arg0.method2359(-1);
            }
        }
        if (arg2 >= -41) {
            this.field691 = 121;
        }
        ++field688;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)I")
    public static final int method354(int arg0) {
        ++field700;
        class239 var1 = class332.field4802;
        synchronized (class332.field4802) {
            return arg0 != 30245 ? 3 : class332.field4802.method1551(arg0 ^ 30245);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
    public static final String[] method355(String arg0, int arg1, char arg2) {
        ++field687;
        int var3 = class12.method93((byte) 119, arg2, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = arg1;
        int var6 = 0;
        for (int var7 = 0; var3 > var7; ++var7) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; ++var8) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "(B)V")
    private final void method356(byte arg0) {
        ++field701;
        int var2 = this.field691;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field697.length + -1 && ~this.field697[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field697[var5 - 1];
                    int[] var7 = this.field697[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class224.field3075[(var8 & 8185) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field695[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field697.length + -1) && var13 >= this.field697[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field697[var14 + -1];
                    int[] var16 = this.field697[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field695[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field697.length + -1 && this.field697[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field697[var22 - 1];
                int[] var24 = this.field697[var22];
                int var25 = this.method357(var22 + -2, arg0 ^ 80)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method357(var22 - -1, arg0 + 80)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 + var26;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var37 - -var26 + var35 + var36;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field695[var20] = (short) var38;
            }
        }
        if (arg0 != -81) {
            this.field699 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
    public class46() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)[I")
    private final int[] method357(int arg0, int arg1) {
        ++field698;
        if (arg1 < ~arg0) {
            return this.field690;
        } else {
            return arg0 >= this.field697.length ? this.field699 : this.field697[arg0];
        }
    }
}
