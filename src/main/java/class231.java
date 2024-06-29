import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class231 {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Llc;")
    private class86 field3675 = new class86();

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Llc;")
    private class86 field3683 = new class86();

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Llc;")
    private class86 field3684 = new class86();

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Llc;")
    private class86 field3685 = new class86();

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Lai;")
    private class88 field3689 = new class88(4);

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "B")
    private byte field3690 = 0;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public volatile int field3693 = 0;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public volatile int field3691 = 0;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Lai;")
    private class88 field3692 = new class88(8);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Loh;")
    public static class281 field3670 = new class281(5);

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    private int field3686;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "J")
    private long field3688;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lnk;")
    private class130 field3687;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Lqk;")
    private class213 field3694;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "[I")
    public static int[] field3682;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
    public final boolean method1538(int arg0) {
        field3671++;
        if (arg0 >= -39) {
            return false;
        } else {
            return this.method1547((byte) 78) >= 20;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    private final void method1539(int arg0) {
        field3666++;
        if (this.field3687 == null) {
            return;
        }
        try {
            this.field3689.field1535 = 0;
            this.field3689.method654((byte) -121, 6);
            if (arg0 >= -13) {
                this.method1546(16);
            }
            this.field3689.method660(3, 113);
            this.field3687.method897(4, this.field3689.field1471, 0, 5000);
        } catch (IOException var3) {
            try {
                this.field3687.method899((byte) 42);
            } catch (Exception var2) {
            }
            this.field3687 = null;
            this.field3693++;
            this.field3691 = -2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BIIIZ)Lqk;")
    public final class213 method1540(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3669++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class213 var8 = new class213();
        var8.field2387 = arg4;
        var8.field273 = var6;
        if (arg1 != 0) {
            field3682 = null;
        }
        var8.field3313 = arg0;
        if (arg4) {
            if (this.method1552((byte) 103) >= 20) {
                throw new RuntimeException();
            }
            this.field3675.method604(var8, -105);
        } else if (this.method1547((byte) 97) < 20) {
            this.field3684.method604(var8, -105);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method1541(byte arg0) {
        if (arg0 != 116) {
            this.field3690 = 90;
        }
        field3668++;
        if (this.field3687 != null) {
            this.field3687.method904(arg0 - 243);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public final void method1542(int arg0) {
        if (this.field3687 != null) {
            this.field3687.method899((byte) 121);
        }
        if (arg0 != -1) {
            field3677 = 65;
        }
        field3667++;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public final void method1543(int arg0) {
        field3672++;
        try {
            this.field3687.method899((byte) -58);
        } catch (Exception var2) {
        }
        if (arg0 != 0) {
            this.method1542(48);
        }
        this.field3691 = -1;
        this.field3693++;
        this.field3687 = null;
        this.field3690 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lhc;Lhc;Z)V")
    public static final void method1544(class235 arg0, class235 arg1, boolean arg2) {
        if (!arg2) {
            class87.field1461 = arg1;
            class265.field4241 = arg0;
            field3664++;
            class141.field2148 = class87.field1461.method1616(3, -12772);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public static void method1545(int arg0) {
        field3682 = null;
        field3670 = null;
        if (arg0 != -1) {
            field3679 = -91;
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public final void method1546(int arg0) {
        field3665++;
        int var2 = -120 / ((arg0 - 11) / 59);
        if (this.field3687 == null) {
            return;
        }
        try {
            this.field3689.field1535 = 0;
            this.field3689.method654((byte) -116, 7);
            this.field3689.method660(0, 126);
            this.field3687.method897(4, this.field3689.field1471, 0, 5000);
        } catch (IOException var4) {
            try {
                this.field3687.method899((byte) 117);
            } catch (Exception var3) {
            }
            this.field3693++;
            this.field3687 = null;
            this.field3691 = -2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)I")
    private final int method1547(byte arg0) {
        if (arg0 <= 9) {
            this.method1548(true);
        }
        field3676++;
        return this.field3684.method610(-11971) + this.field3685.method610(-11971);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
    public final boolean method1548(boolean arg0) {
        field3673++;
        if (arg0) {
            return this.method1552((byte) 121) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
    public final void method1549(boolean arg0, int arg1) {
        field3681++;
        if (this.field3687 == null) {
            return;
        }
        try {
            this.field3689.field1535 = 0;
            this.field3689.method654((byte) -102, arg0 ? 2 : 3);
            this.field3689.method660(0, 115);
            this.field3687.method897(4, this.field3689.field1471, 0, 5000);
        } catch (IOException var4) {
            try {
                this.field3687.method899((byte) -14);
            } catch (Exception var3) {
            }
            this.field3687 = null;
            this.field3693++;
            this.field3691 = -2;
        }
        if (arg1 != 2) {
            this.method1550((class130) null, true, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lnk;ZB)V")
    public final void method1550(class130 arg0, boolean arg1, byte arg2) {
        field3680++;
        if (this.field3687 != null) {
            try {
                this.field3687.method899((byte) 21);
            } catch (Exception var9) {
            }
            this.field3687 = null;
        }
        int var4 = -8 % ((-arg2 - 59) / 57);
        this.field3687 = arg0;
        this.method1539(-91);
        this.method1549(arg1, 2);
        this.field3692.field1535 = 0;
        this.field3694 = null;
        while (true) {
            class213 var5 = (class213) this.field3683.method605(0);
            if (var5 == null) {
                while (true) {
                    class213 var6 = (class213) this.field3685.method605(0);
                    if (var6 == null) {
                        if (this.field3690 != 0) {
                            try {
                                this.field3689.field1535 = 0;
                                this.field3689.method654((byte) -126, 4);
                                this.field3689.method654((byte) -124, this.field3690);
                                this.field3689.method634(0, 17);
                                this.field3687.method897(4, this.field3689.field1471, 0, 5000);
                            } catch (IOException var8) {
                                try {
                                    this.field3687.method899((byte) 113);
                                } catch (Exception var7) {
                                }
                                this.field3691 = -2;
                                this.field3693++;
                                this.field3687 = null;
                            }
                        }
                        this.field3686 = 0;
                        this.field3688 = class134.method924(false);
                        return;
                    }
                    this.field3684.method604(var6, -105);
                }
            }
            this.field3675.method604(var5, -105);
        }
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)Z")
    public final boolean method1551(int arg0) {
        field3663++;
        if (this.field3687 != null) {
            long var2 = class134.method924(false);
            int var4 = (int) (var2 - this.field3688);
            this.field3688 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3686 += var4;
            if (this.field3686 > 30000) {
                try {
                    this.field3687.method899((byte) 17);
                } catch (Exception var27) {
                }
                this.field3687 = null;
            }
        }
        if (this.field3687 == null) {
            return this.method1552((byte) 113) == 0 && this.method1547((byte) 22) == 0;
        }
        try {
            this.field3687.method901((byte) 60);
            for (class213 var5 = (class213) this.field3675.method607((byte) 82); var5 != null; var5 = (class213) this.field3675.method611((byte) -2)) {
                this.field3689.field1535 = 0;
                this.field3689.method654((byte) -122, 1);
                this.field3689.method660((int) var5.field273, 124);
                this.field3687.method897(4, this.field3689.field1471, 0, arg0 ^ 0x1188);
                this.field3683.method604(var5, -105);
            }
            if (arg0 != 512) {
                return true;
            }
            for (class213 var6 = (class213) this.field3684.method607((byte) 97); var6 != null; var6 = (class213) this.field3684.method611((byte) -2)) {
                this.field3689.field1535 = 0;
                this.field3689.method654((byte) -93, 0);
                this.field3689.method660((int) var6.field273, 115);
                this.field3687.method897(4, this.field3689.field1471, 0, 5000);
                this.field3685.method604(var6, -105);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3687.method898(37);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3686 = 0;
                byte var9 = 0;
                if (this.field3694 == null) {
                    var9 = 8;
                } else if (this.field3694.field3311 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3692.field1535;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field3687.method907((byte) 118, var10, this.field3692.field1471, this.field3692.field1535);
                    if (this.field3690 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3692.field1471[this.field3692.field1535 + var11] = (byte) class87.method619(this.field3692.field1471[this.field3692.field1535 + var11], this.field3690);
                        }
                    }
                    this.field3692.field1535 += var10;
                    if (var9 <= this.field3692.field1535) {
                        if (this.field3694 == null) {
                            this.field3692.field1535 = 0;
                            int var12 = this.field3692.method633(65);
                            int var13 = this.field3692.method645(arg0 + 11084);
                            Object var14 = null;
                            long var15 = (long) ((var12 << 16) + var13);
                            int var17 = this.field3692.method633(72);
                            int var18 = this.field3692.method641(-1);
                            boolean var19 = (var17 & 0x80) != 0;
                            int var20 = var17 & 0x7F;
                            class213 var21;
                            if (var19) {
                                for (var21 = (class213) this.field3685.method607((byte) 80); var21 != null && var21.field273 != var15; var21 = (class213) this.field3685.method611((byte) -2)) {
                                }
                            } else {
                                for (var21 = (class213) this.field3683.method607((byte) 57); var21 != null && var21.field273 != var15; var21 = (class213) this.field3683.method611((byte) -2)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var20 == 0 ? 5 : 9;
                            this.field3694 = var21;
                            this.field3694.field3308 = new class88(var18 + var22 + this.field3694.field3313);
                            this.field3694.field3308.method654((byte) -116, var20);
                            this.field3694.field3308.method639(var18, (byte) -104);
                            this.field3692.field1535 = 0;
                            this.field3694.field3311 = 8;
                        } else if (this.field3694.field3311 != 0) {
                            throw new IOException();
                        } else if (this.field3692.field1471[0] == -1) {
                            this.field3692.field1535 = 0;
                            this.field3694.field3311 = 1;
                        } else {
                            this.field3694 = null;
                        }
                    }
                } else {
                    int var23 = this.field3694.field3308.field1471.length - this.field3694.field3313;
                    int var24 = 512 - this.field3694.field3311;
                    if ((var23 - this.field3694.field3308.field1535) < var24) {
                        var24 = var23 - this.field3694.field3308.field1535;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field3687.method907((byte) 124, var24, this.field3694.field3308.field1471, this.field3694.field3308.field1535);
                    if (this.field3690 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3694.field3308.field1471[this.field3694.field3308.field1535 + var25] = (byte) class87.method619(this.field3694.field3308.field1471[this.field3694.field3308.field1535 + var25], this.field3690);
                        }
                    }
                    this.field3694.field3311 += var24;
                    this.field3694.field3308.field1535 += var24;
                    if (this.field3694.field3308.field1535 == var23) {
                        this.field3694.method174(31388);
                        this.field3694.field2377 = false;
                        this.field3694 = null;
                    } else if (this.field3694.field3311 == 512) {
                        this.field3694.field3311 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3687.method899((byte) 121);
            } catch (Exception var26) {
            }
            this.field3693++;
            this.field3691 = -2;
            this.field3687 = null;
            return this.method1552((byte) 108) == 0 && this.method1547((byte) 42) == 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I")
    public final int method1552(byte arg0) {
        if (arg0 <= 101) {
            field3682 = null;
        }
        field3674++;
        return this.field3675.method610(-11971) + this.field3683.method610(-11971);
    }
}
