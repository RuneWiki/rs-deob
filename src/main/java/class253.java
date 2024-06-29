import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class253 {

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    private int field4565 = 32;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "J")
    private long field4554 = class28.method155((byte) 108);

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    private int field4579 = 0;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    private int field4582 = 0;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "J")
    private long field4583 = 0L;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    private int field4584 = 0;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "J")
    private long field4585 = 0L;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    private int field4581 = 0;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Z")
    private boolean field4587 = true;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "[Lf;")
    private class36[] field4589 = new class36[8];

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "[Lf;")
    private class36[] field4588 = new class36[8];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Lcf;")
    private static class93 field4562 = class147.method1066("Loaded sprites", -48);

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[Lcf;")
    public static class93[] field4550 = new class93[100];

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field4561 = 0;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "[Ljf;")
    public static class64[] field4574 = new class64[4];

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lcf;")
    public static class93 field4566 = field4562;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public int field4576;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    private int field4586;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lhg;")
    public static class177 field4551;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Lf;")
    private class36 field4575;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "[I")
    public int[] field4571;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIIIIII)V")
    public static final void method1713(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4563++;
        if (!arg0) {
            field4560 = -63;
        }
        for (int var9 = 0; var9 < class234.field4165.field2273; var9++) {
            if (class234.field4165.method943(-106, var9)) {
                int var10 = class234.field4165.field2277[var9] - class251.field4518;
                int var11 = class76.field1404 + class183.field3373 - class234.field4165.field2265[var9] - 1;
                int var12 = (var11 - arg4) * (arg5 - arg3) / (arg7 - arg4) + arg3;
                int var13 = (arg1 - arg6) * (var10 - arg8) / (arg2 - arg8) + arg6;
                int var14 = class234.field4165.method940(var9, (byte) -112);
                int var15 = 16777215;
                class27 var16 = null;
                if (var14 == 0) {
                    if ((double) class105.field1823 == 3.0D) {
                        var16 = class168.field2958;
                    }
                    if ((double) class105.field1823 == 4.0D) {
                        var16 = class272.field4843;
                    }
                    if ((double) class105.field1823 == 6.0D) {
                        var16 = class178.field3112;
                    }
                    if ((double) class105.field1823 >= 8.0D) {
                        var16 = class61.field1034;
                    }
                }
                if (var14 == 1) {
                    if ((double) class105.field1823 == 3.0D) {
                        var16 = class178.field3112;
                    }
                    if ((double) class105.field1823 == 4.0D) {
                        var16 = class61.field1034;
                    }
                    if ((double) class105.field1823 == 6.0D) {
                        var16 = class210.field3806;
                    }
                    if ((double) class105.field1823 >= 8.0D) {
                        var16 = class87.field1565;
                    }
                }
                if (var14 == 2) {
                    var15 = 16755200;
                    if ((double) class105.field1823 == 3.0D) {
                        var16 = class210.field3806;
                    }
                    if ((double) class105.field1823 == 4.0D) {
                        var16 = class87.field1565;
                    }
                    if ((double) class105.field1823 == 6.0D) {
                        var16 = class284.field5092;
                    }
                    if ((double) class105.field1823 >= 8.0D) {
                        var16 = class203.field3659;
                    }
                }
                if (class234.field4165.field2276[var9] != -1) {
                    var15 = class234.field4165.field2276[var9];
                }
                if (var16 != null) {
                    int var17 = class63.field1149.method1822(class234.field4165.field2260[var9], (int[]) null, class233.field4150);
                    int var18 = var12 - (var17 - 1) * var16.method153() / 2;
                    int var19 = var18 + var16.method154() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class93 var21 = class233.field4150[var20];
                        if (var20 < var17 - 1) {
                            var21.method638((byte) -42, var21.method666(false) - 4);
                        }
                        var16.method147(var21, var13, var19, var15, true);
                        var19 += var16.method153();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
    public void method703() {
        field4552++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public final void method1714(byte arg0) {
        this.field4587 = true;
        field4577++;
        if (arg0 != 91) {
            this.field4588 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public void method701(int arg0) throws Exception {
        field4555++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public final synchronized void method1715(int arg0) {
        if (class267.field4748 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class267.field4748.field4121[var3] == this) {
                    class267.field4748.field4121[var3] = null;
                }
                if (class267.field4748.field4121[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class267.field4748.field4118 = true;
                while (class267.field4748.field4115) {
                    class53.method290(50L, true);
                }
                class267.field4748 = null;
            }
        }
        this.method703();
        field4573++;
        if (arg0 != -3139) {
            this.field4571 = null;
        }
        this.field4571 = null;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public final synchronized void method1716(int arg0) {
        field4570++;
        if (this.field4571 == null) {
            return;
        }
        long var2 = class28.method155((byte) -38);
        if (arg0 != 16384) {
            return;
        }
        try {
            if (this.field4583 != 0L) {
                if (var2 < this.field4583) {
                    return;
                }
                this.method701(this.field4576);
                this.field4583 = 0L;
                this.field4587 = true;
            }
            int var4 = this.method704();
            int var5 = this.field4586 + this.field4578;
            if (this.field4584 < this.field4582 - var4) {
                this.field4584 = this.field4582 - var4;
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field4576) {
                var4 = 0;
                this.field4576 += 1024;
                if (this.field4576 > 16384) {
                    this.field4576 = 16384;
                }
                this.method703();
                this.method701(this.field4576);
                if (this.field4576 < (var5 + 256)) {
                    var5 = this.field4576 - 256;
                    this.field4586 = var5 - this.field4578;
                }
                this.field4587 = true;
            }
            while (var4 < var5) {
                this.method1719(this.field4571, 256);
                var4 += 256;
                this.method702();
            }
            if (this.field4585 < var2) {
                if (this.field4587) {
                    this.field4587 = false;
                } else if (this.field4584 == 0 && this.field4579 == 0) {
                    this.method703();
                    this.field4583 = var2 + 2000L;
                    return;
                } else {
                    this.field4586 = Math.min(this.field4579, this.field4584);
                    this.field4579 = this.field4584;
                }
                this.field4585 = var2 + 2000L;
                this.field4584 = 0;
            }
            this.field4582 = var4;
        } catch (Exception var7) {
            this.method703();
            this.field4583 = var2 + 2000L;
        }
        try {
            if ((this.field4554 + 500000L) < var2) {
                var2 = this.field4554;
            }
            while ((this.field4554 + 5000L) < var2) {
                this.method1723((byte) 81, 256);
                this.field4554 += (long) (256000 / class140.field2443);
            }
        } catch (Exception var6) {
            this.field4554 = var2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
    public void method706() throws Exception {
        field4567++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lf;II)V")
    private final void method1717(class36 arg0, int arg1, int arg2) {
        field4556++;
        if (arg1 != 0) {
            method1720((byte) 111);
        }
        int var4 = arg2 >> 5;
        class36 var5 = this.field4589[var4];
        if (var5 == null) {
            this.field4588[var4] = arg0;
        } else {
            var5.field555 = arg0;
        }
        this.field4589[var4] = arg0;
        arg0.field554 = arg2;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()I")
    public int method704() throws Exception {
        field4564++;
        return this.field4576;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public static final void method1718(int arg0) {
        if (arg0 == 50) {
            class50.field815.method294(arg0 - 50);
            field4568++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([II)V")
    private final void method1719(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class204.field3687) {
            var3 = arg1 << 1;
        }
        class107.method771(arg0, 0, var3);
        this.field4581 -= arg1;
        if (this.field4575 != null && this.field4581 <= 0) {
            this.field4581 += class140.field2443 >> 4;
            class42.method237(this.field4575, 99);
            this.method1717(this.field4575, 0, this.field4575.method210());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class36 var10 = null;
                        class36 var11 = this.field4588[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class202 var12 = var11.field552;
                                if (var12 == null || var12.field3651 <= var8) {
                                    var11.field553 = true;
                                    int var13 = var11.method214();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3651 += var13;
                                    }
                                    if (var4 >= this.field4565) {
                                        break label107;
                                    }
                                    class36 var14 = var11.method211();
                                    if (var14 != null) {
                                        int var15 = var11.field554;
                                        while (var14 != null) {
                                            this.method1717(var14, 0, var15 * var14.method210() >> 8);
                                            var14 = var11.method215();
                                        }
                                    }
                                    class36 var16 = var11.field555;
                                    var11.field555 = null;
                                    if (var10 == null) {
                                        this.field4588[var7] = var16;
                                    } else {
                                        var10.field555 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4589[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field555;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class36 var18 = this.field4588[var17];
                this.field4588[var17] = this.field4589[var17] = null;
                while (var18 != null) {
                    class36 var19 = var18.field555;
                    var18.field555 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4581 < 0) {
            this.field4581 = 0;
        }
        if (this.field4575 != null) {
            this.field4575.method209(arg0, 0, arg1);
        }
        this.field4554 = class28.method155((byte) 111);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method705(Component arg0) throws Exception {
        field4553++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static void method1720(byte arg0) {
        int var1 = 125 / ((arg0 + 57) / 38);
        field4566 = null;
        field4551 = null;
        field4574 = null;
        field4550 = null;
        field4562 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLf;)V")
    public final synchronized void method1721(byte arg0, class36 arg1) {
        field4580++;
        this.field4575 = arg1;
        if (arg0 <= 7) {
            this.method1716(10);
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public final synchronized void method1722(int arg0) {
        field4557++;
        this.field4587 = true;
        try {
            if (arg0 > -36) {
                field4549 = -63;
            }
            this.method706();
        } catch (Exception var2) {
            this.method703();
            this.field4583 = class28.method155((byte) -68) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
    public void method702() throws Exception {
        field4559++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
    private final void method1723(byte arg0, int arg1) {
        field4569++;
        this.field4581 -= arg1;
        if (arg0 <= 45) {
            return;
        }
        if (this.field4581 < 0) {
            this.field4581 = 0;
        }
        if (this.field4575 != null) {
            this.field4575.method213(arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    public static final void method1724(byte arg0) {
        if (arg0 == 47) {
            field4558++;
            class212.field3887.method300(0);
            class120.field2131.method300(arg0 - 47);
        }
    }
}
