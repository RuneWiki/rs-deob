import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class85 extends class23 {

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    private int field1538 = 3216;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "[I")
    private int[] field1542 = new int[3];

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    private int field1543 = 3216;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    private int field1530 = 4096;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field1531 = 0;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "Li;")
    public static class88 field1534 = class208.method1425(105, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "Li;")
    public static class88 field1536 = class208.method1425(105, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "Li;")
    public static class88 field1537 = class208.method1425(105, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "Li;")
    private static class88 field1540 = class208.method1425(105, "Loaded wordpack");

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "Li;")
    public static class88 field1547 = field1540;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "Lnb;")
    public static class144 field1545;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "Lbj;")
    public static class22 field1546;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "[I")
    public static int[] field1541;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
    public static void method575(int arg0) {
        field1534 = null;
        field1540 = null;
        field1541 = null;
        field1546 = null;
        field1536 = null;
        field1545 = null;
        if (arg0 <= -64) {
            field1547 = null;
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
    public static final void method576(boolean arg0, int arg1) {
        byte var2 = 4;
        byte[][] var3 = class45.field774;
        if (arg1 == 22711) {
            for (int var4 = 0; var4 < var2; ++var4) {
                class219.method1481(2);
                for (int var5 = 0; ~var5 > -14; ++var5) {
                    for (int var6 = 0; ~var6 > -14; ++var6) {
                        int var7 = class111.field2026[var4][var5][var6];
                        if (var7 != -1) {
                            int var8 = (59110963 & var7) >> 24;
                            if (!arg0 || ~var8 == -1) {
                                int var9 = 3 & var7 >> 1;
                                int var10 = var7 >> 14 & 1023;
                                int var11 = (var7 & 16376) >> 3;
                                int var12 = (var10 / 8 << 8) - -(var11 / 8);
                                for (int var13 = 0; ~var13 > ~class146.field2733.length; ++var13) {
                                    if (~class146.field2733[var13] == ~var12 && var3[var13] != null) {
                                        class212.method1449(var9, (7 & var10) * 8, class166.field3202, 118, (var11 & 7) * 8, var4, var3[var13], arg0, var8, var6 * 8, var5 * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++field1532;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 == -69) {
            ++field1539;
            this.method578(3668);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            this.method54(19, (byte) 78);
        }
        ++field1535;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int var4 = class43.field738 * this.field1530 >> 12;
            int[] var5 = this.method120(class220.field4160 & arg0 + -1, false, 0);
            int[] var6 = this.method120(arg0, false, 0);
            int[] var7 = this.method120(class220.field4160 & arg0 + 1, false, 0);
            for (int var8 = 0; var8 < class70.field1276; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class45.field789 & var8 + -1] + -var6[var8 + 1 & class45.field789]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class130.field2433[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field1542[2] * var14 >> 12;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field1542[0] * var16 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field1542[1] * var18 >> 12;
                var3[var8] = var17 - -var19 + var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lea;I)Llb;")
    public static final class122 method577(class46 arg0, int arg1) {
        ++field1533;
        return arg1 != 255 ? null : new class122(arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method334((byte) -73), arg0.method304(-29629), arg0.method304(arg1 + -29884), arg0.method347(26119));
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1538 = arg0.method301(35);
                }
            } else {
                this.field1543 = arg0.method301(86);
            }
        } else {
            this.field1530 = arg0.method301(46);
        }
        if (arg1 != -3) {
            field1546 = null;
        }
        ++field1548;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    private final void method578(int arg0) {
        ++field1544;
        double var2 = Math.cos((double) ((float) this.field1538 / 4096.0F));
        this.field1542[0] = (int) (var2 * Math.sin((double) ((float) this.field1543 / 4096.0F)) * 4096.0D);
        this.field1542[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1543 / 4096.0F)) * var2);
        this.field1542[2] = (int) (Math.sin((double) ((float) this.field1538 / 4096.0F)) * 4096.0D);
        int var4 = this.field1542[1] * this.field1542[1] >> 12;
        int var5 = this.field1542[0] * this.field1542[0] >> 12;
        int var6 = this.field1542[2] * this.field1542[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 - -var4 + var6 >> 12)) * 4096.0D);
        if (arg0 != 3668) {
            field1531 = -60;
        }
        if (var7 != 0) {
            this.field1542[0] = (this.field1542[0] << 12) / var7;
            this.field1542[2] = (this.field1542[2] << 12) / var7;
            this.field1542[1] = (this.field1542[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
    public static final void method579() {
        for (int var0 = 0; var0 < class11.field152; ++var0) {
            for (int var5 = 0; var5 < class48.field899; ++var5) {
                for (int var6 = 0; var6 < class66.field1202; ++var6) {
                    class29.field489[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class62.field1147; ++var1) {
            for (int var4 = 0; var4 < class62.field1148[var1]; ++var4) {
                class62.field1149[var1][var4] = null;
            }
            class62.field1148[var1] = 0;
        }
        for (int var2 = 0; var2 < class25.field396; ++var2) {
            class149.field2908[var2] = null;
        }
        class25.field396 = 0;
        for (int var3 = 0; var3 < class239.field4449.length; ++var3) {
            class239.field4449[var3] = null;
        }
    }
}
