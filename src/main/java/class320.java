import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class320 extends class130 {

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    private int field4700 = 0;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Lvk;")
    private class56 field4694 = new class56(16);

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    private int field4706 = 0;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "Lar;")
    private class47 field4703 = new class47();

    @OriginalMember(owner = "client!si", name = "O", descriptor = "J")
    private long field4709 = 0L;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Lv;")
    private class241 field4692;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    private int field4691;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "Z")
    private boolean field4707;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "Lar;")
    private class47 field4708;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    private int field4684;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "Z")
    private boolean field4710;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field4686;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Lv;")
    private class241 field4695;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lro;")
    private class248 field4688;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lp;")
    private class445 field4680;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lvd;")
    private class4 field4678;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Z")
    public static boolean field4689 = false;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "F")
    public static float field4690;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Log;")
    private class356 field4682;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Z")
    private boolean field4704;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "[B")
    private byte[] field4702;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I")
    public final int method2152(boolean arg0) {
        if (!arg0) {
            this.method2153(-69);
        }
        field4683++;
        return this.field4682 == null ? 0 : this.field4682.field5159;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[B")
    public final byte[] method825(int arg0, int arg1) {
        int var3 = -103 % ((-arg1 - 69) / 45);
        field4697++;
        class4 var4 = this.method2156(0, 18852, arg0);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method25(25539);
            var4.method322(11);
            return var5;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
    public final int method2153(int arg0) {
        field4705++;
        int var2 = 96 / ((-arg0 - 39) / 38);
        if (this.method820((byte) -1) == null) {
            return this.field4678 == null ? 0 : this.field4678.method27((byte) -29);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public final void method2154(int arg0) {
        if (arg0 != 0) {
            this.field4707 = false;
        }
        field4693++;
        if (this.field4692 != null) {
            this.field4704 = true;
            if (this.field4708 == null) {
                this.field4708 = new class47();
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)I")
    public final int method2155(int arg0) {
        field4687++;
        if (arg0 != 0) {
            this.method822(true, -55);
        }
        return this.field4700;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Lvd;")
    private final class4 method2156(int arg0, int arg1, int arg2) {
        field4681++;
        class4 var4 = (class4) this.field4694.method384((long) arg2, true);
        if (var4 != null && arg0 == 0 && !var4.field49 && var4.field50) {
            var4.method322(11);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4692 == null || this.field4702[arg2] == -1) {
                    if (this.field4680.method2800(-21)) {
                        return null;
                    }
                    var4 = this.field4680.method2799(arg1 ^ 0x49CB, arg2, (byte) 2, true, this.field4691);
                } else {
                    var4 = this.field4688.method1500((byte) -35, arg2, this.field4692);
                }
            } else if (arg0 == 1) {
                if (this.field4692 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4688.method1495(false, arg2, this.field4692);
            } else if (arg0 == 2) {
                if (this.field4692 == null) {
                    throw new RuntimeException();
                }
                if (this.field4702[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4680.method2797(20)) {
                    return null;
                }
                var4 = this.field4680.method2799(125, arg2, (byte) 2, false, this.field4691);
            } else {
                throw new RuntimeException();
            }
            this.field4694.method381(true, var4, (long) arg2);
        }
        if (var4.field50) {
            return null;
        }
        byte[] var5 = var4.method25(arg1 ^ 0x2A67);
        if (arg1 != 18852) {
            field4689 = true;
        }
        if (!var4 instanceof class78) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class120.field1673.reset();
                class120.field1673.update(var5, 0, var5.length - 2);
                int var6 = (int) class120.field1673.getValue();
                if (this.field4682.field5144[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field4680.field6537 = 0;
                this.field4680.field6540 = 0;
            } catch (RuntimeException var12) {
                this.field4680.method2806(-21947);
                var4.method322(11);
                if (var4.field49 && !this.field4680.method2800(-21)) {
                    class142 var7 = this.field4680.method2799(-46, arg2, (byte) 2, true, this.field4691);
                    this.field4694.method381(true, var7, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4682.field5148[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field4682.field5148[arg2];
            if (this.field4692 != null) {
                this.field4688.method1492(this.field4692, 62, arg2, var5);
                if (this.field4702[arg2] != 1) {
                    this.field4700++;
                    this.field4702[arg2] = 1;
                }
            }
            if (!var4.field49) {
                var4.method322(11);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class120.field1673.reset();
            class120.field1673.update(var5, 0, var5.length - 2);
            int var8 = (int) class120.field1673.getValue();
            if (this.field4682.field5144[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4682.field5148[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4702[arg2] != 1) {
                this.field4700++;
                this.field4702[arg2] = 1;
            }
            if (!var4.field49) {
                var4.method322(arg1 - 18841);
            }
            return var4;
        } catch (Exception var11) {
            this.field4702[arg2] = -1;
            var4.method322(11);
            if (var4.field49 && !this.field4680.method2800(-21)) {
                class142 var10 = this.field4680.method2799(-57, arg2, (byte) 2, true, this.field4691);
                this.field4694.method381(true, var10, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
    public final void method2157(boolean arg0) {
        if (arg0) {
            field4690 = -0.007673747F;
        }
        field4701++;
        if (this.field4708 != null) {
            if (this.method820((byte) -1) == null) {
                return;
            }
            if (this.field4707) {
                boolean var2 = true;
                for (class45 var3 = this.field4708.method332(-2130841184); var3 != null; var3 = this.field4708.method343((byte) -84)) {
                    int var5 = (int) var3.field640;
                    if (this.field4702[var5] == 0) {
                        this.method2156(1, 18852, var5);
                    }
                    if (this.field4702[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method322(11);
                    }
                }
                while (this.field4706 < this.field4682.field5142.length) {
                    if (this.field4682.field5142[this.field4706] == 0) {
                        this.field4706++;
                    } else {
                        if (this.field4688.field3351 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4702[this.field4706] == 0) {
                            this.method2156(1, 18852, this.field4706);
                        }
                        if (this.field4702[this.field4706] == 0) {
                            class45 var4 = new class45();
                            var4.field640 = (long) this.field4706;
                            this.field4708.method330(var4, -2130841184);
                            var2 = false;
                        }
                        this.field4706++;
                    }
                }
                if (var2) {
                    this.field4707 = false;
                    this.field4706 = 0;
                }
            } else if (this.field4704) {
                boolean var6 = true;
                for (class45 var7 = this.field4708.method332(-2130841184); var7 != null; var7 = this.field4708.method343((byte) -88)) {
                    int var9 = (int) var7.field640;
                    if (this.field4702[var9] != 1) {
                        this.method2156(2, 18852, var9);
                    }
                    if (this.field4702[var9] == 1) {
                        var7.method322(11);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4682.field5142.length > this.field4706) {
                    if (this.field4682.field5142[this.field4706] == 0) {
                        this.field4706++;
                    } else {
                        if (this.field4680.method2797(20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4702[this.field4706] != 1) {
                            this.method2156(2, 18852, this.field4706);
                        }
                        if (this.field4702[this.field4706] != 1) {
                            class45 var8 = new class45();
                            var8.field640 = (long) this.field4706;
                            var6 = false;
                            this.field4708.method330(var8, -2130841184);
                        }
                        this.field4706++;
                    }
                }
                if (var6) {
                    this.field4704 = false;
                    this.field4706 = 0;
                }
            } else {
                this.field4708 = null;
            }
        }
        if (!this.field4710 || this.field4709 > class114.method735(127)) {
            return;
        }
        for (class4 var10 = (class4) this.field4694.method389(0); var10 != null; var10 = (class4) this.field4694.method388(0)) {
            if (!var10.field50) {
                if (var10.field40) {
                    if (!var10.field49) {
                        throw new RuntimeException();
                    }
                    var10.method322(11);
                } else {
                    var10.field40 = true;
                }
            }
        }
        this.field4709 = class114.method735(124) + 1000L;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Log;")
    public final class356 method820(byte arg0) {
        field4679++;
        if (this.field4682 != null) {
            return this.field4682;
        }
        if (arg0 != -1) {
            this.field4695 = null;
        }
        if (this.field4678 == null) {
            if (this.field4680.method2800(-21)) {
                return null;
            }
            this.field4678 = this.field4680.method2799(-113, this.field4691, (byte) 0, true, 255);
        }
        if (this.field4678.field50) {
            return null;
        }
        byte[] var2 = this.field4678.method25(25539);
        if (this.field4678 instanceof class78) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4682 = new class356(var2, this.field4686);
                if (this.field4682.field5150 != this.field4684) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4682 = null;
                if (this.field4680.method2800(-21)) {
                    this.field4678 = null;
                } else {
                    this.field4678 = this.field4680.method2799(arg0 ^ 0xFFFFFF94, this.field4691, (byte) 0, true, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4682 = new class356(var2, this.field4686);
            } catch (RuntimeException var4) {
                this.field4680.method2806(arg0 ^ 0x55BA);
                this.field4682 = null;
                if (this.field4680.method2800(-21)) {
                    this.field4678 = null;
                } else {
                    this.field4678 = this.field4680.method2799(-90, this.field4691, (byte) 0, true, 255);
                }
                return null;
            }
            if (this.field4695 != null) {
                this.field4688.method1492(this.field4695, 107, this.field4691, var2);
            }
        }
        this.field4678 = null;
        if (this.field4692 != null) {
            this.field4700 = 0;
            this.field4702 = new byte[this.field4682.field5154];
        }
        return this.field4682;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
    public final void method2158(int arg0) {
        field4699++;
        if (this.field4708 == null || this.method820((byte) -1) == null) {
            return;
        }
        for (class45 var2 = this.field4703.method332(-2130841184); var2 != null; var2 = this.field4703.method343((byte) -105)) {
            int var3 = (int) var2.field640;
            if (var3 < 0 || this.field4682.field5154 <= var3 || this.field4682.field5142[var3] == 0) {
                var2.method322(11);
            } else {
                if (this.field4702[var3] == 0) {
                    this.method2156(1, 18852, var3);
                }
                if (this.field4702[var3] == -1) {
                    this.method2156(2, 18852, var3);
                }
                if (this.field4702[var3] == 1) {
                    var2.method322(11);
                }
            }
        }
        if (arg0 <= 37) {
            this.method2159(84);
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)I")
    public final int method2159(int arg0) {
        field4698++;
        if (this.field4682 == null) {
            return 0;
        } else if (this.field4707) {
            class45 var2 = this.field4708.method332(-2130841184);
            if (arg0 != 0) {
                this.method820((byte) -107);
            }
            return var2 == null ? 0 : (int) var2.field640;
        } else {
            return this.field4682.field5159;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I")
    public final int method818(byte arg0, int arg1) {
        if (arg0 >= -40) {
            return 105;
        } else {
            field4685++;
            class4 var3 = (class4) this.field4694.method384((long) arg1, true);
            return var3 == null ? 0 : var3.method27((byte) -29);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)V")
    public final void method822(boolean arg0, int arg1) {
        field4696++;
        if (this.field4692 == null) {
            return;
        }
        if (!arg0) {
            this.method822(false, 76);
        }
        for (class45 var3 = this.field4703.method332(-2130841184); var3 != null; var3 = this.field4703.method343((byte) -103)) {
            if (((long) arg1) == var3.field640) {
                return;
            }
        }
        class45 var4 = new class45();
        var4.field640 = (long) arg1;
        this.field4703.method330(var4, -2130841184);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(ILv;Lv;Lp;Lro;IIZ)V")
    public class320(int arg0, class241 arg1, class241 arg2, class445 arg3, class248 arg4, int arg5, int arg6, boolean arg7) {
        this.field4692 = arg1;
        this.field4691 = arg0;
        if (this.field4692 == null) {
            this.field4707 = false;
        } else {
            this.field4707 = true;
            this.field4708 = new class47();
        }
        this.field4684 = arg6;
        this.field4710 = arg7;
        this.field4686 = arg5;
        this.field4695 = arg2;
        this.field4688 = arg4;
        this.field4680 = arg3;
        if (this.field4695 != null) {
            this.field4678 = this.field4688.method1500((byte) -35, this.field4691, this.field4695);
        }
    }
}
