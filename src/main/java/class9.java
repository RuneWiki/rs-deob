import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lnc;")
    private class26 field80 = new class26();

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lnc;")
    private class26 field83 = new class26();

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Lnc;")
    private class26 field96 = new class26();

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Lnc;")
    private class26 field97 = new class26();

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Ldt;")
    private class254 field99 = new class254(4);

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public volatile int field103 = 0;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "B")
    private byte field102 = 0;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public volatile int field105 = 0;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Ldt;")
    private class254 field104 = new class254(8);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Ltca;")
    public static class184 field77 = new class184(8);

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lfga;")
    public static class269 field88 = new class269();

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "J")
    private long field98;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "Lqga;")
    private class197 field106;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Lij;")
    private class443 field100;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 3)
    public final void method49(int arg0) {
        field90++;
        if (arg0 != 5 || this.field100 == null) {
            return;
        }
        try {
            this.field99.field3725 = 0;
            this.field99.method1725(7, 99);
            this.field99.method1682(0, (byte) 71);
            this.field100.method2649(false, 4, this.field99.field3789, 0);
        } catch (IOException var3) {
            try {
                this.field100.method2646(-1);
            } catch (Exception var2) {
            }
            this.field103++;
            this.field105 = -2;
            this.field100 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)Lpha;", line = 33)
    public static final class175 method50(int arg0, byte arg1) {
        field76++;
        int var2 = 1 / ((33 - arg1) / 32);
        if (arg0 == 0) {
            return new class281();
        } else if (arg0 == 1) {
            return new class632();
        } else if (arg0 == 2) {
            return new class307();
        } else if (arg0 == 3) {
            return new class604();
        } else if (arg0 == 4) {
            return new class543();
        } else if (arg0 == 5) {
            return new class614();
        } else if (arg0 == 6) {
            return new class42();
        } else if (arg0 == 7) {
            return new class323();
        } else if (arg0 == 8) {
            return new class18();
        } else if (arg0 == 9) {
            return new class148();
        } else if (arg0 == 10) {
            return new class565();
        } else if (arg0 == 11) {
            return new class103();
        } else if (arg0 == 12) {
            return new class681();
        } else if (arg0 == 13) {
            return new class32();
        } else if (arg0 == 14) {
            return new class476();
        } else if (arg0 == 15) {
            return new class299();
        } else if (arg0 == 16) {
            return new class108();
        } else if (arg0 == 17) {
            return new class164();
        } else if (arg0 == 18) {
            return new class635();
        } else if (arg0 == 19) {
            return new class276();
        } else if (arg0 == 20) {
            return new class466();
        } else if (arg0 == 21) {
            return new class762();
        } else if (arg0 == 22) {
            return new class687();
        } else if (arg0 == 23) {
            return new class202();
        } else if (arg0 == 24) {
            return new class594();
        } else if (arg0 == 25) {
            return new class773();
        } else if (arg0 == 26) {
            return new class471();
        } else if (arg0 == 27) {
            return new class8();
        } else if (arg0 == 28) {
            return new class493();
        } else if (arg0 == 29) {
            return new class597();
        } else if (arg0 == 30) {
            return new class271();
        } else if (arg0 == 31) {
            return new class306();
        } else if (arg0 == 32) {
            return new class427();
        } else if (arg0 == 33) {
            return new class181();
        } else if (arg0 == 34) {
            return new class128();
        } else if (arg0 == 35) {
            return new class735();
        } else if (arg0 == 36) {
            return new class596();
        } else if (arg0 == 37) {
            return new class592();
        } else if (arg0 == 38) {
            return new class395();
        } else if (arg0 == 39) {
            return new class449();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 353)
    public static void method51(byte arg0) {
        field77 = null;
        field88 = null;
        if (arg0 < 78) {
            method51((byte) -72);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIBZB)Lqga;", line = 364)
    public final class197 method52(int arg0, int arg1, byte arg2, boolean arg3, byte arg4) {
        field78++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class197 var8 = new class197();
        var8.field2556 = arg2;
        if (arg4 != -87) {
            this.method65(-106);
        }
        var8.field298 = arg3;
        var8.field8883 = var6;
        if (arg3) {
            if (this.method55((byte) 5) >= 20) {
                throw new RuntimeException();
            }
            this.field80.method150(arg4 ^ 0xFFFFFFA9, var8);
        } else if (this.method61(arg4 ^ 0xFFFFA039) < 20) {
            this.field96.method150(0, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 407)
    public static final void method53(boolean arg0) {
        if (arg0) {
            return;
        }
        class716.field9758 = new class360(8);
        field81++;
        class682.field9119 = 0;
        for (class150 var1 = (class150) class69.field954.method2189((byte) 93); var1 != null; var1 = (class150) class69.field954.method2192(0)) {
            var1.method1055();
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V", line = 428)
    private final void method54(byte arg0) {
        field82++;
        if (this.field100 == null) {
            return;
        }
        try {
            this.field99.field3725 = 0;
            this.field99.method1725(6, 120);
            this.field99.method1682(3, (byte) 122);
            int var2 = 2 / ((arg0 + 20) / 47);
            this.field100.method2649(false, 4, this.field99.field3789, 0);
        } catch (IOException var4) {
            try {
                this.field100.method2646(-1);
            } catch (Exception var3) {
            }
            this.field105 = -2;
            this.field100 = null;
            this.field103++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)I", line = 460)
    public final int method55(byte arg0) {
        field85++;
        if (arg0 != 5) {
            this.method57(45);
        }
        return this.field80.method151(arg0 ^ 0x1F1) + this.field83.method151(500);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z", line = 474)
    public final boolean method56(int arg0) {
        if (arg0 != 20) {
            this.field106 = null;
        }
        field79++;
        return this.method55((byte) 5) >= 20;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Z", line = 486)
    public final boolean method57(int arg0) {
        field87++;
        if (arg0 == -20) {
            return this.method61(24464) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z", line = 498)
    public final boolean method58(byte arg0) {
        field91++;
        if (this.field100 != null) {
            long var2 = class401.method2440(false);
            int var4 = (int) (var2 - this.field98);
            this.field98 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field101 += var4;
            if (this.field101 > 30000) {
                try {
                    this.field100.method2646(-1);
                } catch (Exception var27) {
                }
                this.field100 = null;
            }
        }
        if (this.field100 == null) {
            return this.method55((byte) 5) == 0 && this.method61(24464) == 0;
        }
        try {
            this.field100.method2643(false);
            for (class197 var5 = (class197) this.field80.method152((byte) -13); var5 != null; var5 = (class197) this.field80.method146((byte) 97)) {
                this.field99.field3725 = 0;
                this.field99.method1725(1, 122);
                this.field99.method1682((int) var5.field8883, (byte) -79);
                this.field100.method2649(false, 4, this.field99.field3789, 0);
                this.field83.method150(0, var5);
            }
            if (arg0 >= -30) {
                this.field105 = 18;
            }
            for (class197 var6 = (class197) this.field96.method152((byte) -13); var6 != null; var6 = (class197) this.field96.method146((byte) 97)) {
                this.field99.field3725 = 0;
                this.field99.method1725(0, 102);
                this.field99.method1682((int) var6.field8883, (byte) 64);
                this.field100.method2649(false, 4, this.field99.field3789, 0);
                this.field97.method150(0, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field100.method2645((byte) 98);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field101 = 0;
                byte var9 = 0;
                if (this.field106 == null) {
                    var9 = 8;
                } else if (this.field106.field2547 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field104.field3725;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field100.method2648(this.field104.field3725, this.field104.field3789, var10, false);
                    if (this.field102 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field104.field3789[this.field104.field3725 + var11] = (byte) class250.method1635(this.field104.field3789[this.field104.field3725 + var11], this.field102);
                        }
                    }
                    this.field104.field3725 += var10;
                    if (this.field104.field3725 >= var9) {
                        if (this.field106 == null) {
                            this.field104.field3725 = 0;
                            int var12 = this.field104.method1731((byte) 64);
                            int var13 = this.field104.method1728((byte) 96);
                            int var14 = this.field104.method1731((byte) 64);
                            int var15 = this.field104.method1672(-16516);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class197 var21;
                            if (var17) {
                                for (var21 = (class197) this.field97.method152((byte) -13); var21 != null && var21.field8883 != var18; var21 = (class197) this.field97.method146((byte) 97)) {
                                }
                            } else {
                                for (var21 = (class197) this.field83.method152((byte) -13); var21 != null && var21.field8883 != var18; var21 = (class197) this.field83.method146((byte) 97)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field106 = var21;
                            this.field106.field2551 = new class254(var15 + var22 + this.field106.field2556);
                            this.field106.field2551.method1725(var16, 101);
                            this.field106.field2551.method1686(44, var15);
                            this.field104.field3725 = 0;
                            this.field106.field2547 = 8;
                        } else if (this.field106.field2547 != 0) {
                            throw new IOException();
                        } else if (this.field104.field3789[0] == -1) {
                            this.field104.field3725 = 0;
                            this.field106.field2547 = 1;
                        } else {
                            this.field106 = null;
                        }
                    }
                } else {
                    int var23 = this.field106.field2551.field3789.length - this.field106.field2556;
                    int var24 = 512 - this.field106.field2547;
                    if (var24 > (var23 - this.field106.field2551.field3725)) {
                        var24 = var23 - this.field106.field2551.field3725;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field100.method2648(this.field106.field2551.field3725, this.field106.field2551.field3789, var24, false);
                    if (this.field102 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field106.field2551.field3789[this.field106.field2551.field3725 + var25] = (byte) class250.method1635(this.field106.field2551.field3789[this.field106.field2551.field3725 + var25], this.field102);
                        }
                    }
                    this.field106.field2551.field3725 += var24;
                    this.field106.field2547 += var24;
                    if (this.field106.field2551.field3725 == var23) {
                        this.field106.method3659(1);
                        this.field106.field295 = false;
                        this.field106 = null;
                    } else if (this.field106.field2547 == 512) {
                        this.field106.field2547 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field100.method2646(-1);
            } catch (Exception var26) {
            }
            this.field100 = null;
            this.field103++;
            this.field105 = -2;
            return this.method55((byte) 5) == 0 && this.method61(24464) == 0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V", line = 774)
    public final void method59(byte arg0) {
        if (arg0 < 52) {
            this.field98 = 59L;
        }
        if (this.field100 != null) {
            this.field100.method2647(-128);
        }
        field86++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)Z", line = 796)
    public static final boolean method60(byte arg0, int arg1, int arg2) {
        field84++;
        if (!class677.field9075) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = 82 / ((arg0 + 94) / 32);
        int var5 = arg1 & 0xFFFF;
        if (class419.field6032[var3] == null || class419.field6032[var3][var5] == null) {
            return false;
        }
        class347 var6 = class419.field6032[var3][var5];
        if (arg2 == -1 && var6.field4884 == 0) {
            for (class478 var7 = (class478) class645.field8695.method679((byte) -86); var7 != null; var7 = (class478) class645.field8695.method681(-43)) {
                if (var7.field6718 == 57 || var7.field6718 == 1002 || var7.field6718 == 17 || var7.field6718 == 19 || var7.field6718 == 16) {
                    for (class347 var8 = class445.method2655(var7.field6713, (byte) 122); var8 != null; var8 = class171.method1151(var8, (byte) -118)) {
                        if (var6.field5003 == var8.field5003) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class478 var9 = (class478) class645.field8695.method679((byte) -86); var9 != null; var9 = (class478) class645.field8695.method681(-79)) {
                if (var9.field6712 == arg2 && var6.field5003 == var9.field6713 && (var9.field6718 == 57 || var9.field6718 == 1002 || var9.field6718 == 17 || var9.field6718 == 19 || var9.field6718 == 16)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)I", line = 865)
    private final int method61(int arg0) {
        field89++;
        if (arg0 != 24464) {
            this.method54((byte) 49);
        }
        return this.field96.method151(arg0 - 23964) + this.field97.method151(arg0 - 23964);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lij;BZ)V", line = 876)
    public final void method62(class443 arg0, byte arg1, boolean arg2) {
        field92++;
        if (this.field100 != null) {
            try {
                this.field100.method2646(-1);
            } catch (Exception var9) {
            }
            this.field100 = null;
        }
        this.field100 = arg0;
        this.method54((byte) 86);
        this.method64(arg2, false);
        this.field106 = null;
        this.field104.field3725 = 0;
        int var4 = -109 / ((39 - arg1) / 37);
        while (true) {
            class197 var5 = (class197) this.field83.method155(102);
            if (var5 == null) {
                while (true) {
                    class197 var6 = (class197) this.field97.method155(115);
                    if (var6 == null) {
                        if (this.field102 != 0) {
                            try {
                                this.field99.field3725 = 0;
                                this.field99.method1725(4, 94);
                                this.field99.method1725(this.field102, 50);
                                this.field99.method1733(0, -32466);
                                this.field100.method2649(false, 4, this.field99.field3789, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field100.method2646(-1);
                                } catch (Exception var7) {
                                }
                                this.field100 = null;
                                this.field105 = -2;
                                this.field103++;
                            }
                        }
                        this.field101 = 0;
                        this.field98 = class401.method2440(false);
                        return;
                    }
                    this.field96.method150(0, var6);
                }
            }
            this.field80.method150(0, var5);
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)V", line = 946)
    public final void method63(byte arg0) {
        if (arg0 > -1) {
            this.method59((byte) 110);
        }
        if (this.field100 != null) {
            this.field100.method2646(-1);
        }
        field93++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZ)V", line = 962)
    public final void method64(boolean arg0, boolean arg1) {
        field94++;
        if (this.field100 == null) {
            return;
        }
        try {
            this.field99.field3725 = 0;
            this.field99.method1725(arg0 ? 2 : 3, 100);
            this.field99.method1682(0, (byte) -69);
            this.field100.method2649(arg1, 4, this.field99.field3789, 0);
        } catch (IOException var4) {
            try {
                this.field100.method2646(-1);
            } catch (Exception var3) {
            }
            this.field100 = null;
            this.field103++;
            this.field105 = -2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V", line = 993)
    public final void method65(int arg0) {
        field95++;
        try {
            this.field100.method2646(-1);
        } catch (Exception var2) {
        }
        this.field102 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field105 = -1;
        this.field103++;
        this.field100 = null;
        if (arg0 != 0) {
            this.field103 = -57;
        }
    }
}
