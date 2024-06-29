import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class93 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Z")
    public boolean field980 = true;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field968 = -1;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lou;")
    private class603 field969;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lnv;")
    private class417 field986;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Ltv;")
    private class558 field982;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lht;")
    private class579 field977;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lwn;")
    private class720 field972;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[C")
    public static char[] field981 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Loj;")
    public static class379 field985;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "[Ltp;")
    public static class532[] field987;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILtv;I)V", line = 5)
    private final void method626(int arg0, class558 arg1, int arg2) {
        field983++;
        if (arg2 == 0) {
            return;
        }
        this.method630(1);
        this.field986.method2621(-2, this.field972);
        this.field986.method2593(4, arg2, arg1, (byte) -9, 0);
        if (arg0 < 16) {
            this.field976 = 126;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ[B)V", line = 24)
    public final void method627(int arg0, int arg1, boolean arg2, byte[] arg3) {
        this.field977.method919(arg3, arg0 * this.field986.method2592((byte) -67, arg1), 6748, arg1);
        if (!arg2) {
            this.field986 = null;
        }
        field975++;
        this.method626(31, this.field977, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 36)
    public static final void method628(int arg0) {
        class382.field5225.method1758(121);
        field971++;
        if (arg0 > -89) {
            field981 = null;
        }
        class655.field9350.method2062(false);
        class348.field4496.method2062(false);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 51)
    public final void method629(int arg0) {
        field970++;
        this.method626(104, this.field982, this.field984);
        int var2 = 67 / ((-arg0 - 15) / 45);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 63)
    private final void method630(int arg0) {
        field973++;
        if (!this.field980) {
            return;
        }
        this.field980 = false;
        byte[] var2 = this.field969.field8576;
        byte[] var3 = this.field986.field6066;
        int var4 = 0;
        int var5 = this.field969.field8584;
        int var6 = this.field969.field8584 * this.field978 + this.field976;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field972 != null && this.field968 == var4) {
            this.field980 = false;
            return;
        }
        this.field968 = var4;
        int var8 = 0;
        int var9 = this.field978 * var5 + this.field976;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field969.field8584 - 128;
        }
        if (arg0 != 1) {
            this.field977 = null;
        }
        if (this.field972 == null) {
            this.field972 = new class720(this.field986, 3553, 6406, 128, 128, false, this.field986.field6066, 6406, false);
            this.field972.method4018(false, false, (byte) 125);
            this.field972.method1742(true, 29646);
        } else {
            this.field972.method4013(0, 128, 7, 128, this.field986.field6066, 0, false, 0, 6406, 0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 176)
    public static void method631(int arg0) {
        field987 = null;
        if (arg0 != 128) {
            field987 = null;
        }
        field981 = null;
        field985 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ld;ILoh;IILjava/awt/Canvas;)Lha;", line = 191)
    public static final class58 method632(class150 arg0, int arg1, class404 arg2, int arg3, int arg4, Canvas arg5) {
        field974++;
        int var6 = 0;
        int var7 = arg3;
        if (arg5 != null) {
            Dimension var8 = arg5.getSize();
            var6 = var8.width;
            var7 = var8.height;
        }
        return class58.method338(arg1, -102, arg2, arg0, var7, arg4, var6, arg5);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lnv;Lou;Leo;IIIII)V", line = 232)
    public class93(class417 arg0, class603 arg1, class296 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field969 = arg1;
        this.field976 = arg6;
        this.field978 = arg7;
        this.field986 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3410 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3671[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field984 = var10;
        if (var10 <= 0) {
            this.field972 = null;
        } else {
            class244 var14 = new class244(var10 * 2);
            if (this.field986.field5992) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3410 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3671[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1446(var18[var19] & 0xFFFF, true);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3410 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3671[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1432(var23[var24] & 0xFFFF, (byte) 111);
                            }
                        }
                    }
                }
            }
            this.field982 = this.field986.method2608(5123, var14.field2903, 2, false, var14.field2912);
            this.field977 = new class579(this.field986, 5123, null, 1);
        }
    }
}
