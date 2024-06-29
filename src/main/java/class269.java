import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class269 {

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Lrb;")
    private class196 field4672 = new class196();

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Lrb;")
    private class196 field4676 = new class196();

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Lrb;")
    private class196 field4677 = new class196();

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lrb;")
    private class196 field4679 = new class196();

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "Lij;")
    private class85 field4683 = new class85(4);

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "B")
    private byte field4685 = 0;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public volatile int field4687 = 0;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public volatile int field4684 = 0;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "Lij;")
    private class85 field4686 = new class85(8);

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lda;")
    private static class275 field4664 = class255.method1672(115, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "[I")
    public static int[] field4667 = new int[128];

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Lda;")
    public static class275 field4674 = field4664;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Lid;")
    public static class232 field4675 = new class232();

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "J")
    private long field4680;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Lma;")
    public static class105 field4678;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Le;")
    private class201 field4688;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lmg;")
    private class219 field4681;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
    public final void method1761(int arg0, boolean arg1) {
        field4656++;
        if (this.field4681 == null) {
            return;
        }
        try {
            this.field4683.field1392 = 0;
            this.field4683.method575((byte) 126, arg1 ? 2 : 3);
            if (arg0 != 5238) {
                this.method1766(-63);
            }
            this.field4683.method572((byte) 87, 0);
            this.field4681.method1400(this.field4683.field1381, 0, 5000, 4);
        } catch (IOException var4) {
            try {
                this.field4681.method1402(arg0 ^ 0x1477);
            } catch (Exception var3) {
            }
            this.field4681 = null;
            this.field4687++;
            this.field4684 = -2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method1762(int arg0) {
        if (this.field4681 != null) {
            this.field4681.method1402(1);
        }
        field4670++;
        if (arg0 > -61) {
            method1775(true, -68, 17);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    private final void method1763(byte arg0) {
        if (arg0 != -102) {
            return;
        }
        field4654++;
        if (this.field4681 == null) {
            return;
        }
        try {
            this.field4683.field1392 = 0;
            this.field4683.method575((byte) 125, 6);
            this.field4683.method572((byte) 93, 3);
            this.field4681.method1400(this.field4683.field1381, 0, 5000, 4);
        } catch (IOException var3) {
            try {
                this.field4681.method1402(arg0 + 103);
            } catch (Exception var2) {
            }
            this.field4681 = null;
            this.field4687++;
            this.field4684 = -2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lda;BILda;)V")
    public static final void method1764(class275 arg0, byte arg1, int arg2, class275 arg3) {
        class79.field1296 = arg0;
        field4657++;
        class79.field1299 = arg3;
        class273.field4726 = arg2;
        if (class79.field1299.method1828(true, class79.field1301) || class79.field1296.method1828(true, class79.field1301)) {
            class119.field2140 = 3;
        } else if (class108.field1880 == -1) {
            class93.field1597 = 0;
            class137.field2407 = 1;
            class119.field2140 = -3;
            class85 var4 = new class85(128);
            var4.method575((byte) 124, 10);
            var4.method600((int) (Math.random() * 99999.0D), (byte) 74);
            var4.method600(517, (byte) 60);
            var4.method560(class79.field1299.method1833(0), -87);
            var4.method586(-85, (int) (Math.random() * 9.9999999E7D));
            var4.method584((byte) 125, class79.field1296);
            var4.method586(101, (int) (Math.random() * 9.9999999E7D));
            if (arg1 >= -97) {
                method1764((class275) null, (byte) 73, -38, (class275) null);
            }
            var4.method612(class106.field1836, -45, class185.field3168);
            class149.field2597.field1392 = 0;
            class149.field2597.method575((byte) 126, 0);
            class149.field2597.method575((byte) 127, var4.field1392);
            class149.field2597.method563(var4.field1392, (byte) 124, var4.field1381, 0);
        } else {
            class81.method528(true);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBZII)Le;")
    public final class201 method1765(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field4673++;
        class201 var6 = new class201();
        if (arg4 != 1) {
            return null;
        }
        var6.field3441 = arg1;
        long var7 = (long) ((arg3 << 16) + arg0);
        var6.field2057 = var7;
        var6.field741 = arg2;
        if (arg2) {
            if (this.method1766(-1) >= 20) {
                throw new RuntimeException();
            }
            this.field4672.method1282(var6, (byte) 15);
        } else if (this.method1770(false) < 20) {
            this.field4677.method1282(var6, (byte) 15);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
    public final int method1766(int arg0) {
        if (arg0 == -1) {
            field4661++;
            return this.field4672.method1277(50000) + this.field4676.method1277(50000);
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Z")
    public final boolean method1767(int arg0) {
        field4669++;
        if (arg0 > -76) {
            this.method1766(-86);
        }
        return this.method1770(false) >= 20;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public final void method1768(boolean arg0) {
        if (!arg0) {
            field4658++;
            if (this.field4681 != null) {
                this.field4681.method1410((byte) 52);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLmg;B)V")
    public final void method1769(boolean arg0, class219 arg1, byte arg2) {
        field4668++;
        if (this.field4681 != null) {
            try {
                this.field4681.method1402(1);
            } catch (Exception var9) {
            }
            this.field4681 = null;
        }
        this.field4681 = arg1;
        this.method1763((byte) -102);
        this.method1761(5238, arg0);
        this.field4686.field1392 = 0;
        this.field4688 = null;
        int var4 = 113 / ((-arg2 - 52) / 58);
        while (true) {
            class201 var5 = (class201) this.field4676.method1273((byte) -116);
            if (var5 == null) {
                while (true) {
                    class201 var6 = (class201) this.field4679.method1273((byte) -30);
                    if (var6 == null) {
                        if (this.field4685 != 0) {
                            try {
                                this.field4683.field1392 = 0;
                                this.field4683.method575((byte) 126, 4);
                                this.field4683.method575((byte) 127, this.field4685);
                                this.field4683.method600(0, (byte) 111);
                                this.field4681.method1400(this.field4683.field1381, 0, 5000, 4);
                            } catch (IOException var8) {
                                try {
                                    this.field4681.method1402(1);
                                } catch (Exception var7) {
                                }
                                this.field4687++;
                                this.field4684 = -2;
                                this.field4681 = null;
                            }
                        }
                        this.field4682 = 0;
                        this.field4680 = class121.method888((byte) -119);
                        return;
                    }
                    this.field4677.method1282(var6, (byte) 15);
                }
            }
            this.field4672.method1282(var5, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)I")
    private final int method1770(boolean arg0) {
        field4653++;
        if (arg0) {
            field4678 = null;
        }
        return this.field4677.method1277(50000) + this.field4679.method1277(50000);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static void method1771(int arg0) {
        field4678 = null;
        if (arg0 != -1) {
            field4664 = null;
        }
        field4667 = null;
        field4674 = null;
        field4675 = null;
        field4664 = null;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public final void method1772(int arg0) {
        if (arg0 != 0) {
            field4678 = null;
        }
        try {
            this.field4681.method1402(1);
        } catch (Exception var2) {
        }
        field4665++;
        this.field4681 = null;
        this.field4684 = -1;
        this.field4685 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4687++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Z")
    public final boolean method1773(byte arg0) {
        field4655++;
        if (this.field4681 != null) {
            long var2 = class121.method888((byte) -119);
            int var4 = (int) (var2 - this.field4680);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4682 += var4;
            this.field4680 = var2;
            if (this.field4682 > 30000) {
                try {
                    this.field4681.method1402(1);
                } catch (Exception var27) {
                }
                this.field4681 = null;
            }
        }
        if (this.field4681 == null) {
            return this.method1766(-1) == 0 && this.method1770(false) == 0;
        }
        try {
            this.field4681.method1405(-81);
            if (arg0 < 45) {
                return false;
            }
            for (class201 var5 = (class201) this.field4672.method1281(false); var5 != null; var5 = (class201) this.field4672.method1280(-117)) {
                this.field4683.field1392 = 0;
                this.field4683.method575((byte) 127, 1);
                this.field4683.method572((byte) -120, (int) var5.field2057);
                this.field4681.method1400(this.field4683.field1381, 0, 5000, 4);
                this.field4676.method1282(var5, (byte) 15);
            }
            for (class201 var6 = (class201) this.field4677.method1281(false); var6 != null; var6 = (class201) this.field4677.method1280(-127)) {
                this.field4683.field1392 = 0;
                this.field4683.method575((byte) 125, 0);
                this.field4683.method572((byte) 78, (int) var6.field2057);
                this.field4681.method1400(this.field4683.field1381, 0, 5000, 4);
                this.field4679.method1282(var6, (byte) 15);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4681.method1404(-1048);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4682 = 0;
                byte var9 = 0;
                if (this.field4688 == null) {
                    var9 = 8;
                } else if (this.field4688.field3437 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4688.field3435.field1381.length - this.field4688.field3441;
                    int var11 = 512 - this.field4688.field3437;
                    if (var11 > var10 - this.field4688.field3435.field1392) {
                        var11 = var10 - this.field4688.field3435.field1392;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field4681.method1406(this.field4688.field3435.field1392, this.field4688.field3435.field1381, var11, -121);
                    if (this.field4685 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4688.field3435.field1381[this.field4688.field3435.field1392 + var12] = (byte) class261.method1705(this.field4688.field3435.field1381[this.field4688.field3435.field1392 + var12], this.field4685);
                        }
                    }
                    this.field4688.field3435.field1392 += var11;
                    this.field4688.field3437 += var11;
                    if (this.field4688.field3435.field1392 == var10) {
                        this.field4688.method843(22610);
                        this.field4688.field748 = false;
                        this.field4688 = null;
                    } else if (this.field4688.field3437 == 512) {
                        this.field4688.field3437 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4686.field1392;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field4681.method1406(this.field4686.field1392, this.field4686.field1381, var13, -108);
                    if (this.field4685 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4686.field1381[this.field4686.field1392 + var14] = (byte) class261.method1705(this.field4686.field1381[this.field4686.field1392 + var14], this.field4685);
                        }
                    }
                    this.field4686.field1392 += var13;
                    if (var9 <= this.field4686.field1392) {
                        if (this.field4688 == null) {
                            this.field4686.field1392 = 0;
                            int var15 = this.field4686.method564((byte) 117);
                            int var16 = this.field4686.method608(17);
                            int var17 = this.field4686.method564((byte) 77);
                            int var18 = this.field4686.method568(19845);
                            long var19 = (long) ((var15 << 16) + var16);
                            boolean var21 = (var17 & 0x80) != 0;
                            int var22 = var17 & 0x7F;
                            Object var23 = null;
                            class201 var24;
                            if (var21) {
                                for (var24 = (class201) this.field4679.method1281(false); var24 != null && var24.field2057 != var19; var24 = (class201) this.field4679.method1280(-127)) {
                                }
                            } else {
                                for (var24 = (class201) this.field4676.method1281(false); var24 != null && var24.field2057 != var19; var24 = (class201) this.field4676.method1280(-123)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var22 == 0 ? 5 : 9;
                            this.field4688 = var24;
                            this.field4688.field3435 = new class85(var25 + this.field4688.field3441 + var18);
                            this.field4688.field3435.method575((byte) 124, var22);
                            this.field4688.field3435.method586(-126, var18);
                            this.field4688.field3437 = 8;
                            this.field4686.field1392 = 0;
                        } else if (this.field4688.field3437 != 0) {
                            throw new IOException();
                        } else if (this.field4686.field1381[0] == -1) {
                            this.field4688.field3437 = 1;
                            this.field4686.field1392 = 0;
                        } else {
                            this.field4688 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4681.method1402(1);
            } catch (Exception var26) {
            }
            this.field4687++;
            this.field4684 = -2;
            this.field4681 = null;
            return this.method1766(-1) == 0 && this.method1770(false) == 0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)Lda;")
    public static final class275 method1774(int arg0, byte arg1) {
        int var2 = 12 / ((arg1 + 70) / 54);
        field4666++;
        return class201.field3446[arg0].method1838(3) > 0 ? class197.method1291(new class275[] { class174.field3015[arg0], class116.field2073, class201.field3446[arg0] }, -30025) : class174.field3015[arg0];
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII)V")
    public static final void method1775(boolean arg0, int arg1, int arg2) {
        field4662++;
        if (!arg0) {
            method1771(21);
        }
        if (class90.field1531 != 0 && arg2 != -1) {
            class112.method820(0, arg2, 10000, false, class90.field1531, class213.field3621);
            class243.field4243 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
    public final void method1776(int arg0) {
        field4671++;
        if (this.field4681 == null) {
            return;
        }
        try {
            this.field4683.field1392 = 0;
            this.field4683.method575((byte) 126, 7);
            this.field4683.method572((byte) -74, 0);
            this.field4681.method1400(this.field4683.field1381, arg0, 5000, 4);
        } catch (IOException var3) {
            try {
                this.field4681.method1402(arg0 + 1);
            } catch (Exception var2) {
            }
            this.field4684 = -2;
            this.field4687++;
            this.field4681 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)Z")
    public final boolean method1777(boolean arg0) {
        if (!arg0) {
            this.field4672 = null;
        }
        field4663++;
        return this.method1766(-1) >= 20;
    }
}
