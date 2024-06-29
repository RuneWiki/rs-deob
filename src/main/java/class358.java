import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class358 {

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lvi;")
    private class476 field4614 = new class476();

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lvi;")
    private class476 field4619 = new class476();

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lvi;")
    private class476 field4621 = new class476();

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lvi;")
    private class476 field4623 = new class476();

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Lbt;")
    private class88 field4625 = new class88(4);

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "B")
    private byte field4629 = 0;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public volatile int field4628 = 0;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public volatile int field4630 = 0;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "Lbt;")
    private class88 field4631 = new class88(8);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field4604 = 2;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    private int field4626;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "J")
    private long field4624;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Lbr;")
    private class144 field4627;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Lbc;")
    private class503 field4632;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public final void method2098(int arg0) {
        field4615++;
        if (arg0 > 97 && this.field4627 != null) {
            this.field4627.method1007((byte) 31);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public final void method2099(boolean arg0, int arg1) {
        field4603++;
        if (this.field4627 == null) {
            return;
        }
        try {
            this.field4625.field1176 = 0;
            this.field4625.method565(-61, arg0 ? 2 : 3);
            this.field4625.method618(arg1, (byte) -105);
            this.field4627.method1001(0, (byte) -104, this.field4625.field1223, 4);
        } catch (IOException var4) {
            try {
                this.field4627.method1003(1);
            } catch (Exception var3) {
            }
            this.field4627 = null;
            this.field4630 = -2;
            this.field4628++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZBLbr;)V")
    public final void method2100(boolean arg0, byte arg1, class144 arg2) {
        if (this.field4627 != null) {
            try {
                this.field4627.method1003(1);
            } catch (Exception var9) {
            }
            this.field4627 = null;
        }
        field4620++;
        this.field4627 = arg2;
        int var4 = -16 / ((arg1 - 73) / 43);
        this.method2110(false);
        this.method2099(arg0, 0);
        this.field4631.field1176 = 0;
        this.field4632 = null;
        while (true) {
            class503 var5 = (class503) this.field4619.method2861((byte) -124);
            if (var5 == null) {
                while (true) {
                    class503 var6 = (class503) this.field4623.method2861((byte) -124);
                    if (var6 == null) {
                        if (this.field4629 != 0) {
                            try {
                                this.field4625.field1176 = 0;
                                this.field4625.method565(-124, 4);
                                this.field4625.method565(91, this.field4629);
                                this.field4625.method609(0, -104);
                                this.field4627.method1001(0, (byte) 83, this.field4625.field1223, 4);
                            } catch (IOException var8) {
                                try {
                                    this.field4627.method1003(1);
                                } catch (Exception var7) {
                                }
                                this.field4627 = null;
                                this.field4630 = -2;
                                this.field4628++;
                            }
                        }
                        this.field4626 = 0;
                        this.field4624 = class173.method1134(true);
                        return;
                    }
                    this.field4621.method2858(15, var6);
                }
            }
            this.field4614.method2858(15, var5);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    public final int method2101(int arg0) {
        field4611++;
        if (arg0 != -24034) {
            this.method2112(false);
        }
        return this.field4614.method2863(20168) + this.field4619.method2863(20168);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public final void method2102(int arg0) {
        field4610++;
        if (this.field4627 == null) {
            return;
        }
        try {
            this.field4625.field1176 = arg0;
            this.field4625.method565(74, 7);
            this.field4625.method618(0, (byte) -105);
            this.field4627.method1001(0, (byte) -125, this.field4625.field1223, 4);
        } catch (IOException var3) {
            try {
                this.field4627.method1003(1);
            } catch (Exception var2) {
            }
            this.field4628++;
            this.field4627 = null;
            this.field4630 = -2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public final void method2103(int arg0) {
        if (arg0 == 0) {
            field4622++;
            if (this.field4627 != null) {
                this.field4627.method1003(1);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z")
    public final boolean method2104(int arg0) {
        if (this.field4627 != null) {
            long var2 = class173.method1134(true);
            int var4 = (int) (var2 - this.field4624);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4624 = var2;
            this.field4626 += var4;
            if (this.field4626 > 30000) {
                try {
                    this.field4627.method1003(1);
                } catch (Exception var27) {
                }
                this.field4627 = null;
            }
        }
        field4616++;
        if (this.field4627 == null) {
            return this.method2101(-24034) == 0 && this.method2105((byte) -86) == 0;
        }
        try {
            this.field4627.method1002(6260);
            for (class503 var5 = (class503) this.field4614.method2860(0); var5 != null; var5 = (class503) this.field4614.method2856(false)) {
                this.field4625.field1176 = 0;
                this.field4625.method565(-60, 1);
                this.field4625.method618((int) var5.field1143, (byte) -105);
                this.field4627.method1001(0, (byte) -119, this.field4625.field1223, 4);
                this.field4619.method2858(15, var5);
            }
            class503 var6 = (class503) this.field4621.method2860(0);
            if (arg0 < 89) {
                return true;
            }
            while (var6 != null) {
                this.field4625.field1176 = 0;
                this.field4625.method565(-73, 0);
                this.field4625.method618((int) var6.field1143, (byte) -105);
                this.field4627.method1001(0, (byte) 4, this.field4625.field1223, 4);
                this.field4623.method2858(15, var6);
                var6 = (class503) this.field4621.method2856(false);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4627.method1004(3);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4626 = 0;
                byte var9 = 0;
                if (this.field4632 == null) {
                    var9 = 8;
                } else if (this.field4632.field7400 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4632.field7394.field1223.length - this.field4632.field7398;
                    int var11 = 512 - this.field4632.field7400;
                    if ((var10 - this.field4632.field7394.field1176) < var11) {
                        var11 = var10 - this.field4632.field7394.field1176;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field4627.method1006(this.field4632.field7394.field1223, var11, -67, this.field4632.field7394.field1176);
                    if (this.field4629 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4632.field7394.field1223[this.field4632.field7394.field1176 + var12] = (byte) class10.method73(this.field4632.field7394.field1223[this.field4632.field7394.field1176 + var12], this.field4629);
                        }
                    }
                    this.field4632.field7394.field1176 += var11;
                    this.field4632.field7400 += var11;
                    if (this.field4632.field7394.field1176 == var10) {
                        this.field4632.method540((byte) 115);
                        this.field4632.field5569 = false;
                        this.field4632 = null;
                    } else if (this.field4632.field7400 == 512) {
                        this.field4632.field7400 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4631.field1176;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field4627.method1006(this.field4631.field1223, var13, 117, this.field4631.field1176);
                    if (this.field4629 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4631.field1223[this.field4631.field1176 + var14] = (byte) class10.method73(this.field4631.field1223[this.field4631.field1176 + var14], this.field4629);
                        }
                    }
                    this.field4631.field1176 += var13;
                    if (var9 <= this.field4631.field1176) {
                        if (this.field4632 == null) {
                            this.field4631.field1176 = 0;
                            int var15 = this.field4631.method617(2);
                            int var16 = this.field4631.method568((byte) 110);
                            int var17 = this.field4631.method617(2);
                            int var18 = this.field4631.method578(115);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class503 var24;
                            if (var20) {
                                for (var24 = (class503) this.field4623.method2860(0); var24 != null && var24.field1143 != var21; var24 = (class503) this.field4623.method2856(false)) {
                                }
                            } else {
                                for (var24 = (class503) this.field4619.method2860(0); var24 != null && var24.field1143 != var21; var24 = (class503) this.field4619.method2856(false)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field4632 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field4632.field7394 = new class88(var18 - (-var25 - this.field4632.field7398));
                            this.field4632.field7394.method565(-118, var19);
                            this.field4632.field7394.method572(-118, var18);
                            this.field4631.field1176 = 0;
                            this.field4632.field7400 = 8;
                        } else if (this.field4632.field7400 != 0) {
                            throw new IOException();
                        } else if (this.field4631.field1223[0] == -1) {
                            this.field4631.field1176 = 0;
                            this.field4632.field7400 = 1;
                        } else {
                            this.field4632 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4627.method1003(1);
            } catch (Exception var26) {
            }
            this.field4627 = null;
            this.field4630 = -2;
            this.field4628++;
            return this.method2101(-24034) == 0 && this.method2105((byte) -86) == 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
    private final int method2105(byte arg0) {
        field4612++;
        if (arg0 != -86) {
            method2108(-3, null, null);
        }
        return this.field4621.method2863(20168) + this.field4623.method2863(20168);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBIZ)Lbc;")
    public final class503 method2106(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        if (arg3 != 100) {
            this.method2106(21, 82, (byte) -101, -7, true);
        }
        field4608++;
        long var6 = (long) ((arg0 << 16) + arg1);
        class503 var8 = new class503();
        var8.field5570 = arg4;
        var8.field7398 = arg2;
        var8.field1143 = var6;
        if (arg4) {
            if (this.method2101(-24034) >= 20) {
                throw new RuntimeException();
            }
            this.field4614.method2858(arg3 ^ 0x6B, var8);
        } else if (this.method2105((byte) -86) < 20) {
            this.field4621.method2858(15, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z")
    public static final boolean method2107(int arg0, int arg1, int arg2) {
        field4607++;
        if (arg0 != 0) {
            field4613 = 49;
        }
        return class46.method292(arg1, (byte) -123, arg2) | (arg1 & 0x60000) != 0 || class386.method2304(arg2, arg1, -1) || class236.method1502(-5701, arg2, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;Lbt;)I")
    public static final int method2108(int arg0, String arg1, class88 arg2) {
        field4605++;
        int var3 = arg2.field1176;
        byte[] var4 = class432.method2557(arg1, (byte) 5);
        if (arg0 >= 0) {
            field4613 = 78;
        }
        arg2.method580((byte) 41, var4.length);
        arg2.field1176 += class188.field2463.method2060(arg2.field1223, var4.length, 0, var4, arg2.field1176, 0);
        return arg2.field1176 - var3;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)Z")
    public final boolean method2109(byte arg0) {
        field4606++;
        if (arg0 >= -103) {
            method2108(99, null, null);
        }
        return this.method2105((byte) -86) >= 20;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    private final void method2110(boolean arg0) {
        if (arg0) {
            return;
        }
        field4609++;
        if (this.field4627 == null) {
            return;
        }
        try {
            this.field4625.field1176 = 0;
            this.field4625.method565(-68, 6);
            this.field4625.method618(3, (byte) -105);
            this.field4627.method1001(0, (byte) 109, this.field4625.field1223, 4);
        } catch (IOException var3) {
            try {
                this.field4627.method1003(1);
            } catch (Exception var2) {
            }
            this.field4627 = null;
            this.field4630 = -2;
            this.field4628++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)Z")
    public final boolean method2111(int arg0) {
        field4618++;
        int var2 = 55 / ((arg0 - 25) / 50);
        return this.method2101(-24034) >= 20;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
    public final void method2112(boolean arg0) {
        field4617++;
        try {
            this.field4627.method1003(1);
        } catch (Exception var2) {
        }
        if (!arg0) {
            this.field4630 = -1;
            this.field4629 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field4627 = null;
            this.field4628++;
        }
    }
}
