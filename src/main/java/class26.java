import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class26 extends class160 {

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    private int field344 = 3216;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "[I")
    private int[] field351 = new int[3];

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    private int field349 = 4096;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private int field341 = 3216;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "Ljava/lang/String;")
    public static String field339 = "Please remove ";

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    public static int field353 = 0;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "Lhc;")
    public static class235 field345;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field347;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lai;I)V")
    public static final void method208(class88 arg0, int arg1) {
        ++field346;
        while (true) {
            while (arg0.field1471.length > arg0.field1535) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method633(53) == 1) {
                    var3 = arg0.method633(92);
                    var4 = arg0.method633(arg1 + 89);
                    var2 = true;
                }
                int var5 = arg0.method633(117);
                int var6 = arg0.method633(arg1 + 73);
                int var7 = class191.field2970 - 1 - -class164.field2584 - var6 * 64;
                int var8 = var5 * 64 - class101.field1697;
                if (var8 >= 0 && ~(var7 + -63) <= -1 && var8 + 63 < class85.field1431 && var7 < class191.field2970) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || var11 >= var3 * 8 && ~var11 > ~(var3 * 8 + 8) && var4 * 8 <= var12 && ~var12 > ~(var4 * 8 - -8)) {
                                byte var13 = arg0.method656(arg1 ^ -244);
                                if (~var13 != -1) {
                                    if (class30.field454[var9][var10] == null) {
                                        class30.field454[var9][var10] = new byte[4096];
                                    }
                                    class30.field454[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method656(-252);
                                    if (class48.field690[var9][var10] == null) {
                                        class48.field690[var9][var10] = new byte[4096];
                                    }
                                    class48.field690[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; ~(var2 ? 64 : 4096) < ~var15; ++var15) {
                        byte var16 = arg0.method656(-252);
                        if (var16 != 0) {
                            ++arg0.field1535;
                        }
                    }
                }
            }
            if (arg1 != 8) {
                field347 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    private final void method209(int arg0) {
        double var2 = Math.cos((double) ((float) this.field341 / 4096.0F));
        ++field340;
        this.field351[0] = (int) (var2 * Math.sin((double) ((float) this.field344 / 4096.0F)) * 4096.0D);
        this.field351[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field344 / 4096.0F)));
        this.field351[2] = (int) (Math.sin((double) ((float) this.field341 / 4096.0F)) * 4096.0D);
        int var4 = this.field351[2] * this.field351[2] >> 12;
        int var5 = this.field351[1] * this.field351[1] >> 12;
        int var6 = this.field351[0] * this.field351[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field351[2] = (this.field351[2] << 12) / var7;
            this.field351[0] = (this.field351[0] << 12) / var7;
            this.field351[1] = (this.field351[1] << 12) / var7;
        }
        if (arg0 != 12096) {
            this.method210((byte) 51);
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        this.method209(12096);
        ++field350;
        if (arg0 >= -124) {
            this.method209(-71);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field342;
        if (arg1 >= 11) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field341 = arg0.method645(11596);
                    }
                } else {
                    this.field344 = arg0.method645(11596);
                }
            } else {
                this.field349 = arg0.method645(11596);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(B)V")
    public static void method211(byte arg0) {
        field345 = null;
        field347 = null;
        field339 = null;
        int var1 = -64 / ((31 - arg0) / 56);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        ++field348;
        if (arg1 != 57) {
            method211((byte) 120);
        }
        if (super.field2488.field42) {
            int var4 = class4.field36 * this.field349 >> 12;
            int[] var5 = this.method1085(0, arg0 + -1 & class53.field811, (byte) 53);
            int[] var6 = this.method1085(0, arg0, (byte) 44);
            int[] var7 = this.method1085(0, arg0 - -1 & class53.field811, (byte) 78);
            for (int var8 = 0; var8 < class240.field3896; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class189.field2929] + -var6[var8 - -1 & class189.field2929]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class99.field1666[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field351[2] * var15 >> 12;
                int var18 = this.field351[0] * var14 >> 12;
                int var19 = this.field351[1] * var16 >> 12;
                var3[var8] = var18 - -var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(B)V")
    public static final void method212(byte arg0) {
        ++field352;
        if (class249.field4022 != null) {
            class249.field4022.method899((byte) 118);
            class249.field4022 = null;
        }
        class167.method1129(14280);
        client.method1056();
        for (int var1 = 0; var1 < 4; ++var1) {
            class176.field2765[var1].method346(32);
        }
        class140.method945((byte) -121, false);
        System.gc();
        class208.method1399(29079, 2);
        class148.field2341 = false;
        class167.field2618 = -1;
        class164.method1111(true, 0);
        class260.field4162 = 0;
        class295.field4663 = false;
        class46.field656 = 0;
        class3.field14 = 0;
        class219.field3376 = 0;
        for (int var2 = 0; var2 < class28.field393.length; ++var2) {
            class28.field393[var2] = null;
        }
        class137.field2110 = 0;
        class70.field1119 = 0;
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class210.field3267[var3] = null;
            class132.field2075[var3] = null;
        }
        if (arg0 <= 38) {
            method208((class88) null, 19);
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class255.field4082[var4] = null;
        }
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var6 = 0; var6 < 104; ++var6) {
                for (int var7 = 0; var7 < 104; ++var7) {
                    class222.field3411[var5][var6][var7] = null;
                }
            }
        }
        class203.method1369(-20406);
        class221.field3401 = 0;
        class90.method692(11464);
        class292.method1955(true, true);
        try {
            class215.method1453(class179.field2788.field479, 123, "loggedout");
        } catch (Throwable var8) {
        }
    }
}
