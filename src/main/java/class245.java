import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class245 extends class175 {

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    private int field4251 = 0;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    private int field4249 = 0;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
    private int field4256 = 1;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "Ldf;")
    public static class146 field4257 = new class146(16);

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "I")
    public static int field4260 = -1;

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "Lmb;")
    private static class96 field4262 = class243.method1708("RuneScape is loading )2 please wait)3)3)3", (byte) 126);

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "Lmb;")
    public static class96 field4261 = field4262;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "Ljava/awt/Image;")
    public static Image field4259;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILmb;I)V")
    public static final void method1718(int arg0, class96 arg1, int arg2) {
        ++field4245;
        if (arg2 != -12858) {
            method1721(-15, -98, 119, -51, 13, (byte) 40);
        }
        class140.field2505.method1012((byte) -120, 30);
        ++class132.field2372;
        class140.field2505.method1657(arg2 + -12668, arg1.method685((byte) -109));
        class140.field2505.method1667((byte) 102, arg0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 3) {
                    this.field4256 = arg2.method1651(4139);
                }
            } else {
                this.field4251 = arg2.method1651(4139);
            }
        } else {
            this.field4249 = arg2.method1651(4139);
        }
        ++field4248;
        int var5 = -17 % ((arg0 - -22) / 58);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field4252;
        class29.method189(4096);
        if (arg0 != 2) {
            method1722(25);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
    public static void method1719(int arg0) {
        field4257 = null;
        field4261 = null;
        field4262 = null;
        field4259 = null;
        if (arg0 != -1010) {
            method1720((byte) -33, -71);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(BI)V")
    public static final void method1720(byte arg0, int arg1) {
        ++field4250;
        if (arg0 == -125) {
            for (class46 var2 = (class46) class26.field441.method1074(false); var2 != null; var2 = (class46) class26.field441.method1087((byte) 112)) {
                if ((var2.field4304 >> 48 & 65535L) == (long) arg1) {
                    var2.method1743((byte) 123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field4255;
        int[] var3 = super.field3044.method904((byte) -99, arg1);
        int var4 = -116 / ((62 - arg0) / 54);
        if (super.field3044.field2150) {
            int var5 = class23.field395[arg1];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; var7 < class1.field11; ++var7) {
                int var8 = class244.field4240[var7];
                int var9 = var8 + -2048 >> 1;
                int var10;
                if (this.field4249 == 0) {
                    var10 = (-var5 + var8) * this.field4256;
                } else {
                    int var11 = var6 * var6 + var9 * var9 >> 12;
                    int var12 = (int) (4096.0D * Math.sqrt((double) ((float) var11 / 4096.0F)));
                    var10 = (int) ((double) (this.field4256 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (-4096 & var10);
                if (this.field4251 == 0) {
                    var13 = class153.field2681[var13 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field4251 == -3) {
                    var13 -= 2048;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    var13 = -var13 + 2048 << 1;
                }
                var3[var7] = var13;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1721(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 0;
        ++field4253;
        int var7 = arg0;
        int var8 = arg0 * arg0;
        int var9 = arg2 * arg2;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var9 + var10;
        int var14 = -((var12 - 1) * var11) + var8;
        int var15 = var9 << 2;
        int var16 = ((arg0 << 1) + -3) * var11;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = var8 << 2;
        if (~arg4 <= ~client.field1994 && ~class9.field149 <= ~arg4) {
            int var19 = class268.method1841(class162.field2884, class9.field145, 0, arg2 + arg3);
            int var20 = class268.method1841(class162.field2884, class9.field145, 0, arg3 - arg2);
            class36.method283(var20, class229.field3939[arg4], var19, (byte) -123, arg1);
        }
        int var21 = (arg0 - 1) * var15;
        int var22 = (var6 + 1) * var18;
        while (var7 > 0) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    var14 += var22;
                    var22 += var18;
                    var13 += var17;
                    var17 += var18;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var14 += var22;
                var13 += var17;
                ++var6;
                var17 += var18;
                var22 += var18;
            }
            var13 += -var21;
            var21 -= var15;
            --var7;
            var14 += -var16;
            int var23 = arg4 + var7;
            var16 -= var15;
            int var24 = arg4 - var7;
            if (client.field1994 <= var23 && ~class9.field149 <= ~var24) {
                int var25 = class268.method1841(class162.field2884, class9.field145, 0, arg3 + var6);
                int var26 = class268.method1841(class162.field2884, class9.field145, 0, arg3 - var6);
                if (client.field1994 <= var24) {
                    class36.method283(var26, class229.field3939[var24], var25, (byte) -120, arg1);
                }
                if (~class9.field149 <= ~var23) {
                    class36.method283(var26, class229.field3939[var23], var25, (byte) -119, arg1);
                }
            }
        }
        if (arg5 < 97) {
            method1718(-84, (class96) null, 58);
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static final void method1722(int arg0) {
        class58.field1023 = arg0;
        for (int var1 = 0; var1 < class264.field4614; ++var1) {
            for (int var2 = 0; var2 < class17.field254; ++var2) {
                if (class259.field4487[arg0][var1][var2] == null) {
                    class259.field4487[arg0][var1][var2] = new class187(arg0, var1, var2);
                }
            }
        }
    }
}
