import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class207 extends class93 {

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    private int field3974 = 3216;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    private int field3982 = 4096;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    private int field3981 = 3216;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "[I")
    private int[] field3988 = new int[3];

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "Ljd;")
    public static class92 field3973 = class202.method1325((byte) 90, "<col=ff0000>");

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "[Lbb;")
    public static class13[] field3980 = new class13[500];

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "Ljd;")
    public static class92 field3986 = class202.method1325((byte) 90, "Starte 3D)2Softwarebibliothek");

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "Ljd;")
    public static class92 field3975 = class202.method1325((byte) 90, "Spieler");

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field3989 = 0;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "Z")
    public static boolean field3976;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "[[S")
    public static short[][] field3985;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field3977;
        int var3 = 62 % ((67 - arg1) / 42);
        int[] var4 = super.field1887.method916(arg0, -80);
        if (super.field1887.field2757) {
            int var5 = class101.field2073 * this.field3982 >> 12;
            int[] var6 = this.method648((byte) 61, arg0 - 1 & class5.field279, 0);
            int[] var7 = this.method648((byte) 79, arg0, 0);
            int[] var8 = this.method648((byte) 39, arg0 + 1 & class5.field279, 0);
            for (int var9 = 0; class150.field2985 > var9; ++var9) {
                int var10 = (var7[class2.field163 & var9 + 1] + -var7[var9 + -1 & class2.field163]) * var5;
                int var11 = (var8[var9] + -var6[var9]) * var5;
                int var12 = var10 >> 12;
                int var13 = var11 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var12 * var12 >> 12;
                int var16 = (int) (Math.sqrt((double) ((var14 + var15 + 4096) / 4096)) * 4096.0D);
                int var17;
                int var18;
                int var19;
                if (~var16 != -1) {
                    var17 = var10 / var16;
                    var18 = 16777216 / var16;
                    var19 = var11 / var16;
                } else {
                    var19 = 0;
                    var17 = 0;
                    var18 = 0;
                }
                int var20 = this.field3988[2] * var18 >> 12;
                int var21 = this.field3988[0] * var17 >> 12;
                int var22 = this.field3988[1] * var19 >> 12;
                var4[var9] = var21 - (-var22 - var20);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "(B)V")
    private final void method1346(byte arg0) {
        double var2 = Math.cos((double) (this.field3981 / 4096));
        ++field3979;
        this.field3988[0] = (int) (4096.0D * var2 * Math.sin((double) (this.field3974 / 4096)));
        this.field3988[1] = (int) (Math.cos((double) (this.field3974 / 4096)) * var2 * 4096.0D);
        this.field3988[2] = (int) (Math.sin((double) (this.field3981 / 4096)) * 4096.0D);
        int var4 = this.field3988[0] * this.field3988[0] >> 12;
        int var5 = this.field3988[2] * this.field3988[2] >> 12;
        int var6 = this.field3988[1] * this.field3988[1] >> 12;
        if (arg0 >= 73) {
            int var7 = (int) (Math.sqrt((double) (var4 + var5 - -var6 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field3988[1] = (this.field3988[1] << 12) / var7;
                this.field3988[0] = (this.field3988[0] << 12) / var7;
                this.field3988[2] = (this.field3988[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field3978;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3981 = arg1.method442(-21351);
                }
            } else {
                this.field3974 = arg1.method442(-21351);
            }
        } else {
            this.field3982 = arg1.method442(-21351);
        }
        if (arg2 != 0) {
            field3989 = 54;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class207() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field3980 = null;
        field3973 = null;
        field3986 = null;
        field3985 = null;
        field3975 = null;
        if (arg0 != -26593) {
            method1349((byte) 35, -120, -63, -60);
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field3984;
        this.method1346((byte) 123);
        if (arg0 != -85) {
            method1349((byte) 34, -117, -77, 118);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljd;ZI)V")
    public static final void method1348(class92 arg0, boolean arg1, int arg2) {
        ++field3987;
        class92 var3 = arg0.method632(true);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class104.field2144; ++var6) {
            class107 var9 = class92.method626((byte) 59, var6);
            if ((!arg1 || var9.field2192) && var9.field2162.method632(true).method615(var3, true) != -1) {
                if (var5 >= 250) {
                    class68.field1383 = -1;
                    class31.field712 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var11 > ~var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class22.field523 = 0;
        class31.field712 = var4;
        class68.field1383 = var5;
        class92[] var7 = new class92[class68.field1383];
        for (int var8 = 0; ~var8 > ~class68.field1383; ++var8) {
            var7[var8] = class92.method626((byte) 59, var4[var8]).field2162;
        }
        if (arg2 != -30937) {
            field3985 = null;
        }
        class205.method1337(var7, true, class31.field712);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BIII)V")
    public static final void method1349(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -87) {
            field3973 = null;
        }
        for (int var4 = 0; ~var4 > -9; ++var4) {
            for (int var7 = 0; var7 < 8; ++var7) {
                class125.field2538[arg1][arg3 - -var4][arg2 - -var7] = 0;
            }
        }
        ++field3983;
        if (~arg3 < -1) {
            for (int var5 = 1; ~var5 > -9; ++var5) {
                class125.field2538[arg1][arg3][arg2 + var5] = class125.field2538[arg1][arg3 + -1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; ~var6 > -9; ++var6) {
                class125.field2538[arg1][arg3 - -var6][arg2] = class125.field2538[arg1][arg3 + var6][arg2 + -1];
            }
        }
        if (~arg3 < -1 && class125.field2538[arg1][arg3 + -1][arg2] != 0) {
            class125.field2538[arg1][arg3][arg2] = class125.field2538[arg1][arg3 + -1][arg2];
        } else if (~arg2 < -1 && ~class125.field2538[arg1][arg3][arg2 + -1] != -1) {
            class125.field2538[arg1][arg3][arg2] = class125.field2538[arg1][arg3][arg2 - 1];
        } else if (~arg3 < -1 && ~arg2 < -1 && class125.field2538[arg1][arg3 - 1][arg2 - 1] != 0) {
            class125.field2538[arg1][arg3][arg2] = class125.field2538[arg1][arg3 + -1][arg2 + -1];
        }
    }
}
