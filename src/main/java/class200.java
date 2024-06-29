import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class200 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lkh;")
    private class5 field3571 = new class5();

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lkh;")
    private class5 field3585 = new class5();

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    private int field3586 = 0;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lkh;")
    private class5 field3587 = new class5();

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lkh;")
    private class5 field3589 = new class5();

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    private int field3594 = 0;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lji;")
    private class225 field3591 = new class225(4);

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public volatile int field3595 = 0;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "B")
    private byte field3596 = 0;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public volatile int field3598 = 0;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Lji;")
    private class225 field3597 = new class225(8);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lkh;")
    public static class5 field3577 = new class5();

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Z")
    public static boolean field3588 = false;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "J")
    private long field3590;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Luc;")
    private class11 field3599;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lng;")
    public static class121 field3581;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lac;")
    public static class195 field3583;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Lbd;")
    private class24 field3593;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[[S")
    public static short[][] field3582;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method1395(int arg0) {
        if (this.field3593 != null) {
            this.field3593.method174(126);
        }
        field3573++;
        if (arg0 != 0) {
            this.method1399((byte) -87);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIBZ)Luc;")
    public final class11 method1396(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (arg4) {
            this.method1405(-92);
        }
        field3569++;
        long var6 = (long) ((arg2 << 16) + arg1);
        class11 var8 = new class11();
        var8.field4178 = arg0;
        var8.field126 = arg3;
        var8.field2825 = var6;
        if (arg0) {
            if (this.field3586 >= 20) {
                throw new RuntimeException();
            }
            this.field3571.method22(104, var8);
            this.field3586++;
        } else if (this.field3594 < 20) {
            this.field3587.method22(77, var8);
            this.field3594++;
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method1397(byte arg0) {
        field3568++;
        for (class213 var1 = (class213) class129.field2154.method1173(37); var1 != null; var1 = (class213) class129.field2154.method1175(-1)) {
            if (var1.field3775 == -1) {
                var1.field3756 = 0;
                class126.method853(var1, (byte) 122);
            } else {
                var1.method655(63);
            }
        }
        if (arg0 < 114) {
            method1398(-44);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method1398(int arg0) {
        field3583 = null;
        field3577 = null;
        field3581 = null;
        if (arg0 >= -104) {
            field3581 = null;
        }
        field3582 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public final void method1399(byte arg0) {
        this.field3595++;
        if (arg0 != -105) {
            method1398(97);
        }
        this.field3596 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field3578++;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    private final void method1400(int arg0) {
        field3572++;
        if (this.field3593 == null) {
            return;
        }
        try {
            this.field3591.field3996 = 0;
            if (arg0 <= 123) {
                this.field3594 = -22;
            }
            this.field3591.method1613(6, 21);
            this.field3591.method1584(34, 3);
            this.field3593.method173((byte) -104, 4, this.field3591.field3995, 0);
        } catch (IOException var3) {
            try {
                this.field3593.method174(102);
            } catch (Exception var2) {
            }
            this.field3598++;
            this.field3593 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLbd;I)V")
    public final void method1401(boolean arg0, class24 arg1, int arg2) {
        field3566++;
        if (arg2 != 5) {
            this.method1401(true, (class24) null, 92);
        }
        if (this.field3593 != null) {
            try {
                this.field3593.method174(arg2 + 72);
            } catch (Exception var8) {
            }
            this.field3593 = null;
        }
        this.field3593 = arg1;
        this.method1400(126);
        this.method1404(true, arg0);
        this.field3597.field3996 = 0;
        this.field3599 = null;
        while (true) {
            class11 var4 = (class11) this.field3585.method17(arg2 ^ 0x5);
            if (var4 == null) {
                while (true) {
                    class11 var5 = (class11) this.field3589.method17(0);
                    if (var5 == null) {
                        if (this.field3596 != 0) {
                            try {
                                this.field3591.field3996 = 0;
                                this.field3591.method1613(4, arg2 ^ 0x10);
                                this.field3591.method1613(this.field3596, 21);
                                this.field3591.method1608(0, false);
                                this.field3593.method173((byte) -29, 4, this.field3591.field3995, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field3593.method174(85);
                                } catch (Exception var6) {
                                }
                                this.field3593 = null;
                                this.field3598++;
                            }
                        }
                        this.field3592 = 0;
                        this.field3590 = class27.method198((byte) -127);
                        return;
                    }
                    this.field3587.method22(77, var5);
                }
            }
            this.field3571.method22(59, var4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Z")
    public final boolean method1402(boolean arg0) {
        if (this.field3593 != null) {
            long var2 = class27.method198((byte) -127);
            int var4 = (int) (var2 - this.field3590);
            this.field3590 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3592 += var4;
            if (this.field3592 > 30000) {
                try {
                    this.field3593.method174(75);
                } catch (Exception var28) {
                }
                this.field3593 = null;
            }
        }
        if (!arg0) {
            this.method1395(-48);
        }
        field3575++;
        if (this.field3593 == null) {
            return this.field3586 == 0 && this.field3594 == 0;
        }
        boolean var5 = false;
        try {
            for (class11 var6 = (class11) this.field3571.method19(-1); var6 != null; var6 = (class11) this.field3571.method18(-8001)) {
                this.field3591.field3996 = 0;
                this.field3591.method1613(1, 21);
                this.field3591.method1584(108, (int) var6.field2825);
                this.field3593.method173((byte) -57, 4, this.field3591.field3995, 0);
                this.field3585.method22(85, var6);
            }
            for (class11 var7 = (class11) this.field3587.method19(-1); var7 != null; var7 = (class11) this.field3587.method18(-8001)) {
                this.field3591.field3996 = 0;
                this.field3591.method1613(0, 21);
                this.field3591.method1584(86, (int) var7.field2825);
                this.field3593.method173((byte) 15, 4, this.field3591.field3995, 0);
                this.field3589.method22(43, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3593.method177((byte) 123);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3592 = 0;
                byte var10 = 0;
                if (this.field3599 == null) {
                    var10 = 8;
                } else if (this.field3599.field130 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field3599.field120.field3995.length - this.field3599.field126;
                    int var12 = 512 - this.field3599.field130;
                    if (var11 - this.field3599.field120.field3996 < var12) {
                        var12 = var11 - this.field3599.field120.field3996;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field3593.method175(var12, this.field3599.field120.field3995, (byte) -122, this.field3599.field120.field3996);
                    if (this.field3596 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field3599.field120.field3995[this.field3599.field120.field3996 + var13] = (byte) class62.method416(this.field3599.field120.field3995[this.field3599.field120.field3996 + var13], this.field3596);
                        }
                    }
                    this.field3599.field130 += var12;
                    this.field3599.field120.field3996 += var12;
                    if (this.field3599.field120.field3996 == var11) {
                        this.field3599.method1124(0);
                        if (this.field3599.field4178) {
                            this.field3586--;
                        } else {
                            this.field3594--;
                        }
                        this.field3599.field4183 = false;
                        this.field3599 = null;
                    } else if (this.field3599.field130 == 512) {
                        this.field3599.field130 = 0;
                    }
                } else {
                    int var14 = var10 - this.field3597.field3996;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field3593.method175(var14, this.field3597.field3995, (byte) -12, this.field3597.field3996);
                    if (this.field3596 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field3597.field3995[this.field3597.field3996 + var15] = (byte) class62.method416(this.field3597.field3995[this.field3597.field3996 + var15], this.field3596);
                        }
                    }
                    this.field3597.field3996 += var14;
                    if (this.field3597.field3996 >= var10) {
                        if (this.field3599 == null) {
                            this.field3597.field3996 = 0;
                            if (this.field3597.method1605(-2033532384) == -72057594037927937L) {
                                this.field3597.field3996 = 0;
                                var5 = true;
                            } else {
                                this.field3597.field3996 = 0;
                                int var16 = this.field3597.method1580(-11);
                                int var17 = this.field3597.method1593(arg0);
                                int var18 = this.field3597.method1580(-123);
                                int var19 = this.field3597.method1562(21705);
                                int var20 = var18 & 0x7F;
                                boolean var21 = (var18 & 0x80) != 0;
                                Object var22 = null;
                                long var23 = (long) ((var16 << 16) + var17);
                                class11 var25;
                                if (var21) {
                                    for (var25 = (class11) this.field3589.method19(-1); var25 != null && var25.field2825 != var23; var25 = (class11) this.field3589.method18(-8001)) {
                                    }
                                } else {
                                    for (var25 = (class11) this.field3585.method19(-1); var25 != null && var25.field2825 != var23; var25 = (class11) this.field3585.method18(-8001)) {
                                    }
                                }
                                if (var25 == null) {
                                    throw new IOException();
                                }
                                this.field3599 = var25;
                                int var26 = var20 == 0 ? 5 : 9;
                                this.field3599.field120 = new class225(var19 + var26 + this.field3599.field126);
                                this.field3599.field120.method1613(var20, 21);
                                this.field3599.field120.method1576(30289, var19);
                                this.field3597.field3996 = 0;
                                this.field3599.field130 = 8;
                            }
                        } else if (this.field3599.field130 != 0) {
                            throw new IOException();
                        } else if (this.field3597.field3995[0] == -1) {
                            this.field3597.field3996 = 0;
                            this.field3599.field130 = 1;
                        } else {
                            this.field3599 = null;
                        }
                    }
                }
            }
            if (var5) {
                this.field3591.field3996 = 0;
                this.field3591.method1613(5, 21);
                this.field3593.method173((byte) 118, 4, this.field3591.field3995, 0);
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field3593.method174(119);
            } catch (Exception var27) {
            }
            this.field3593 = null;
            this.field3598++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)Z")
    public final boolean method1403(byte arg0) {
        field3576++;
        if (arg0 > -78) {
            this.method1399((byte) 9);
        }
        return this.field3594 >= 20;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZZ)V")
    public final void method1404(boolean arg0, boolean arg1) {
        if (!arg0) {
            field3584 = 114;
        }
        field3579++;
        if (this.field3593 == null) {
            return;
        }
        try {
            this.field3591.field3996 = 0;
            this.field3591.method1613(arg1 ? 2 : 3, 21);
            this.field3591.method1584(107, 0);
            this.field3593.method173((byte) 115, 4, this.field3591.field3995, 0);
        } catch (IOException var4) {
            try {
                this.field3593.method174(121);
            } catch (Exception var3) {
            }
            this.field3598++;
            this.field3593 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Z")
    public final boolean method1405(int arg0) {
        if (arg0 >= -57) {
            this.method1404(true, true);
        }
        field3570++;
        return this.field3586 >= 20;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)I")
    public final int method1406(byte arg0) {
        field3580++;
        return arg0 <= 57 ? -45 : this.field3586;
    }
}
