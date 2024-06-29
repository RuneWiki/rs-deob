import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class285 {

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Z")
    public boolean field3983 = true;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    private int field3984 = -1;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Lqo;")
    private class22 field3974;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lmha;")
    private class416 field3973;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    private int field3976;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    private int field3982;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Ltp;")
    private class533 field3972;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lni;")
    private class522 field3975;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Lwv;")
    private class35 field3985;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "[I")
    public static int[] field3988 = new int[1];

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([BIIB)V", line = 5)
    public final void method1864(byte[] arg0, int arg1, int arg2, byte arg3) {
        this.field3985.method448(arg0, arg1, 110, this.field3974.method294(arg1, 4) * arg2);
        field3979++;
        this.method1867(this.field3985, 113, arg2);
        if (arg3 < 8) {
            this.method1869((byte) 82);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 24)
    public final void method1865(byte arg0) {
        if (arg0 > -83) {
            field3980 = -60;
        }
        field3987++;
        this.method1867(this.field3975, 115, this.field3982);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 37)
    public static void method1866(int arg0) {
        if (arg0 >= 35) {
            field3988 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lni;II)V", line = 48)
    private final void method1867(class522 arg0, int arg1, int arg2) {
        field3981++;
        if (arg2 == 0) {
            return;
        }
        this.method1869((byte) 121);
        if (arg1 <= 107) {
            method1868(-124, -86);
        }
        this.field3974.method256((byte) -93, this.field3972);
        this.field3974.method232(arg2, -128, 4, arg0, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V", line = 71)
    public static final void method1868(int arg0, int arg1) {
        if (arg0 != -128) {
            field3988 = null;
        }
        field3986++;
        class594 var2 = class692.method3869(arg1, (byte) 105, 1);
        var2.method3383(-16058);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lqo;Lmha;Led;IIIII)V", line = 97)
    public class285(class22 arg0, class416 arg1, class704 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3974 = arg0;
        this.field3973 = arg1;
        this.field3977 = arg6;
        this.field3976 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3937 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field9524[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3982 = var10;
        if (var10 <= 0) {
            this.field3972 = null;
        } else {
            class215 var14 = new class215(var10 * 2);
            if (this.field3974.field597) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3937 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field9524[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1485((byte) 107, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3937 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field9524[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1545(87, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3975 = this.field3974.method181(5123, -39, var14.field3109, var14.field3066, false);
            this.field3985 = new class35(this.field3974, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 220)
    private final void method1869(byte arg0) {
        field3978++;
        if (!this.field3983) {
            return;
        }
        this.field3983 = false;
        byte[] var2 = this.field3973.field6016;
        byte[] var3 = this.field3974.field701;
        if (arg0 <= 115) {
            return;
        }
        int var4 = 0;
        int var5 = this.field3973.field6023;
        int var6 = this.field3977 + (this.field3973.field6023 * this.field3976);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3972 != null && this.field3984 == var4) {
            this.field3983 = false;
            return;
        }
        this.field3984 = var4;
        int var8 = this.field3977 + (this.field3976 * var5);
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field3973.field6023 - 128;
        }
        if (this.field3972 == null) {
            this.field3972 = new class533(this.field3974, 3553, 6406, 128, 128, false, this.field3974.field701, 6406, false);
            this.field3972.method3067(false, false, 10243);
            this.field3972.method456(9728, true);
        } else {
            this.field3972.method3072(0, 0, 128, false, 0, 128, 6406, -69, this.field3974.field701, 0);
        }
    }
}
