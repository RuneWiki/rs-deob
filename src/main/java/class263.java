import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class263 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Luq;")
    private class111 field3776 = new class111();

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Luq;")
    private class111 field3789 = new class111();

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Luq;")
    private class111 field3791 = new class111();

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Luq;")
    private class111 field3794 = new class111();

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Lti;")
    private class303 field3797 = new class303(4);

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public volatile int field3799 = 0;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "B")
    private byte field3802 = 0;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public volatile int field3801 = 0;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Lti;")
    private class303 field3800 = new class303(8);

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Luj;")
    public static class259 field3780 = new class259();

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    private int field3795;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "J")
    private long field3798;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lwd;")
    private class178 field3803;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Lhu;")
    private class85 field3796;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Z")
    public final boolean method1671(int arg0) {
        if (this.field3796 != null) {
            long var2 = class464.method2773((byte) 103);
            int var4 = (int) (var2 - this.field3798);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3798 = var2;
            this.field3795 += var4;
            if (this.field3795 > 30000) {
                try {
                    this.field3796.method694(false);
                } catch (Exception var27) {
                }
                this.field3796 = null;
            }
        }
        field3792++;
        if (this.field3796 == null) {
            return this.method1681(true) == 0 && this.method1682(0) == 0;
        }
        try {
            this.field3796.method696(30);
            for (class178 var5 = (class178) this.field3776.method820(true); var5 != null; var5 = (class178) this.field3776.method816(126)) {
                this.field3797.field4333 = 0;
                this.field3797.method1923((byte) 62, 1);
                this.field3797.method1886((int) var5.field1844, arg0);
                this.field3796.method695(4, 0, this.field3797.field4326, (byte) 116);
                this.field3789.method819(var5, 1431655765);
            }
            for (class178 var6 = (class178) this.field3791.method820(true); var6 != null; var6 = (class178) this.field3791.method816(120)) {
                this.field3797.field4333 = 0;
                this.field3797.method1923((byte) 62, 0);
                this.field3797.method1886((int) var6.field1844, arg0);
                this.field3796.method695(4, 0, this.field3797.field4326, (byte) 127);
                this.field3794.method819(var6, arg0 + 1431655765);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field3796.method693((byte) -119);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3795 = 0;
                byte var9 = 0;
                if (this.field3803 == null) {
                    var9 = 8;
                } else if (this.field3803.field2698 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3803.field2697.field4326.length - this.field3803.field2696;
                    int var11 = 512 - this.field3803.field2698;
                    if (var11 > var10 - this.field3803.field2697.field4333) {
                        var11 = var10 - this.field3803.field2697.field4333;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field3796.method691(this.field3803.field2697.field4333, this.field3803.field2697.field4326, 116, var11);
                    if (this.field3802 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3803.field2697.field4326[this.field3803.field2697.field4333 + var12] = (byte) class113.method838(this.field3803.field2697.field4326[this.field3803.field2697.field4333 + var12], this.field3802);
                        }
                    }
                    this.field3803.field2697.field4333 += var11;
                    this.field3803.field2698 += var11;
                    if (this.field3803.field2697.field4333 == var10) {
                        this.field3803.method855(51);
                        this.field3803.field6915 = false;
                        this.field3803 = null;
                    } else if (this.field3803.field2698 == 512) {
                        this.field3803.field2698 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3800.field4333;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field3796.method691(this.field3800.field4333, this.field3800.field4326, 117, var13);
                    if (this.field3802 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3800.field4326[this.field3800.field4333 + var14] = (byte) class113.method838(this.field3800.field4326[this.field3800.field4333 + var14], this.field3802);
                        }
                    }
                    this.field3800.field4333 += var13;
                    if (this.field3800.field4333 >= var9) {
                        if (this.field3803 == null) {
                            this.field3800.field4333 = 0;
                            int var15 = this.field3800.method1918((byte) -85);
                            int var16 = this.field3800.method1868(arg0);
                            int var17 = this.field3800.method1918((byte) -52);
                            int var18 = this.field3800.method1870(-1945262512);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class178 var24;
                            if (var20) {
                                for (var24 = (class178) this.field3794.method820(true); var24 != null && var24.field1844 != var21; var24 = (class178) this.field3794.method816(arg0 + 122)) {
                                }
                            } else {
                                for (var24 = (class178) this.field3789.method820(true); var24 != null && var24.field1844 != var21; var24 = (class178) this.field3789.method816(119)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3803 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3803.field2697 = new class303(this.field3803.field2696 + var25 + var18);
                            this.field3803.field2697.method1923((byte) 62, var19);
                            this.field3803.field2697.method1892(arg0 ^ 0x17B655E8, var18);
                            this.field3800.field4333 = 0;
                            this.field3803.field2698 = 8;
                        } else if (this.field3803.field2698 != 0) {
                            throw new IOException();
                        } else if (this.field3800.field4326[0] == -1) {
                            this.field3803.field2698 = 1;
                            this.field3800.field4333 = 0;
                        } else {
                            this.field3803 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3796.method694(false);
            } catch (Exception var26) {
            }
            this.field3801 = -2;
            this.field3796 = null;
            this.field3799++;
            return this.method1681(true) == 0 && this.method1682(0) == 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
    public static final void method1672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3790++;
        int var9 = arg2 + 1;
        class217.method1448(class436.field6332[arg2], arg1, arg5, 4, arg0);
        int var10 = arg4 - 1;
        class217.method1448(class436.field6332[arg4], arg1, arg5, 4, arg0);
        int var6 = 1 / ((arg3 - 28) / 48);
        for (int var7 = var9; var7 <= var10; var7++) {
            int[] var8 = class436.field6332[var7];
            var8[arg1] = var8[arg0] = arg5;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public final void method1673(int arg0) {
        field3793++;
        if (this.field3796 == null) {
            return;
        }
        try {
            this.field3797.field4333 = 0;
            this.field3797.method1923((byte) 62, 7);
            if (arg0 > 96) {
                this.field3797.method1886(0, 0);
                this.field3796.method695(4, 0, this.field3797.field4326, (byte) 121);
            }
        } catch (IOException var3) {
            try {
                this.field3796.method694(false);
            } catch (Exception var2) {
            }
            this.field3799++;
            this.field3796 = null;
            this.field3801 = -2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ltp;)V")
    public static final void method1674(class370 arg0) {
        for (int var1 = arg0.field5532; var1 <= arg0.field5542; var1++) {
            for (int var2 = arg0.field5535; var2 <= arg0.field5540; var2++) {
                class165 var3 = class36.field545[arg0.field5538][var1][var2];
                if (var3 != null) {
                    class525 var4 = var3.field2490;
                    class525 var5 = null;
                    while (var4 != null) {
                        if (var4.field7711 == arg0) {
                            if (var5 == null) {
                                var3.field2490 = var4.field7716;
                            } else {
                                var5.field7716 = var4.field7716;
                            }
                            var4.method3105((byte) -69);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field7716;
                    }
                    var3.field2485 = 0;
                    for (class525 var6 = var3.field2490; var6 != null; var6 = var6.field7716) {
                        var3.field2485 = (byte) (var3.field2485 | var6.field7712);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Z")
    public final boolean method1675(byte arg0) {
        int var2 = 72 / ((22 - arg0) / 58);
        field3777++;
        return this.method1681(true) >= 20;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public final void method1676(int arg0) {
        if (this.field3796 != null) {
            this.field3796.method690(-125);
        }
        if (arg0 != 0) {
            this.method1673(26);
        }
        field3778++;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public final void method1677(int arg0) {
        field3783++;
        try {
            this.field3796.method694(false);
        } catch (Exception var2) {
        }
        this.field3802 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3801 = -1;
        this.field3799++;
        this.field3796 = null;
        if (arg0 < 108) {
            this.field3797 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Z")
    public final boolean method1678(int arg0) {
        if (arg0 < 109) {
            this.method1681(false);
        }
        field3779++;
        return this.method1682(0) >= 20;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
    private final void method1679(int arg0) {
        field3785++;
        if (this.field3796 == null) {
            return;
        }
        try {
            this.field3797.field4333 = 0;
            this.field3797.method1923((byte) 62, 6);
            if (arg0 <= 87) {
                this.method1684(false, null, -37);
            }
            this.field3797.method1886(3, 0);
            this.field3796.method695(4, 0, this.field3797.field4326, (byte) 127);
        } catch (IOException var3) {
            try {
                this.field3796.method694(false);
            } catch (Exception var2) {
            }
            this.field3801 = -2;
            this.field3796 = null;
            this.field3799++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static void method1680(byte arg0) {
        field3780 = null;
        if (arg0 != -50) {
            method1683(-31, (byte) 60, -83);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)I")
    public final int method1681(boolean arg0) {
        if (arg0) {
            field3782++;
            return this.field3776.method825(0) + this.field3789.method825(0);
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)I")
    private final int method1682(int arg0) {
        field3787++;
        return arg0 == 0 ? this.field3791.method825(arg0) + this.field3794.method825(arg0) : 63;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)V")
    public static final void method1683(int arg0, byte arg1, int arg2) {
        field3786++;
        class151 var3 = class526.field7726[arg0][arg2];
        if (var3 != null) {
            class122.field1910 = var3.field2319;
            class440.field6419 = var3.field2315;
            class508.field7425 = var3.field2312;
        }
        class310.method1943(1);
        if (arg1 < 31) {
            field3780 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLhu;I)V")
    public final void method1684(boolean arg0, class85 arg1, int arg2) {
        if (arg2 != -27749) {
            this.field3795 = -95;
        }
        if (this.field3796 != null) {
            try {
                this.field3796.method694(false);
            } catch (Exception var8) {
            }
            this.field3796 = null;
        }
        field3788++;
        this.field3796 = arg1;
        this.method1679(117);
        this.method1687(false, arg0);
        this.field3800.field4333 = 0;
        this.field3803 = null;
        while (true) {
            class178 var4 = (class178) this.field3789.method814(0);
            if (var4 == null) {
                while (true) {
                    class178 var5 = (class178) this.field3794.method814(0);
                    if (var5 == null) {
                        if (this.field3802 != 0) {
                            try {
                                this.field3797.field4333 = 0;
                                this.field3797.method1923((byte) 62, 4);
                                this.field3797.method1923((byte) 62, this.field3802);
                                this.field3797.method1874(0, (byte) -110);
                                this.field3796.method695(4, 0, this.field3797.field4326, (byte) 123);
                            } catch (IOException var7) {
                                try {
                                    this.field3796.method694(false);
                                } catch (Exception var6) {
                                }
                                this.field3796 = null;
                                this.field3799++;
                                this.field3801 = -2;
                            }
                        }
                        this.field3795 = 0;
                        this.field3798 = class464.method2773((byte) 103);
                        return;
                    }
                    this.field3791.method819(var5, 1431655765);
                }
            }
            this.field3776.method819(var4, arg2 + 1431683514);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBBZI)Lwd;")
    public final class178 method1685(int arg0, byte arg1, byte arg2, boolean arg3, int arg4) {
        if (arg1 != -25) {
            this.field3798 = 20L;
        }
        field3781++;
        long var6 = (long) ((arg0 << 16) + arg4);
        class178 var8 = new class178();
        var8.field6916 = arg3;
        var8.field2696 = arg2;
        var8.field1844 = var6;
        if (arg3) {
            if (this.method1681(true) >= 20) {
                throw new RuntimeException();
            }
            this.field3776.method819(var8, 1431655765);
        } else if (this.method1682(0) < 20) {
            this.field3791.method819(var8, 1431655765);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
    public final void method1686(boolean arg0) {
        field3784++;
        if (this.field3796 != null) {
            this.field3796.method694(arg0);
        }
        if (arg0) {
            this.method1687(true, true);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V")
    public final void method1687(boolean arg0, boolean arg1) {
        field3775++;
        if (this.field3796 == null) {
            return;
        }
        if (arg0) {
            this.method1679(-6);
        }
        try {
            this.field3797.field4333 = 0;
            this.field3797.method1923((byte) 62, arg1 ? 2 : 3);
            this.field3797.method1886(0, 0);
            this.field3796.method695(4, 0, this.field3797.field4326, (byte) 111);
        } catch (IOException var4) {
            try {
                this.field3796.method694(false);
            } catch (Exception var3) {
            }
            this.field3801 = -2;
            this.field3799++;
            this.field3796 = null;
        }
    }

    static {
        new class180("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }
}
