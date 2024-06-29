import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class356 {

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "Lkn;")
    private class233 field5519 = new class233();

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "Lkn;")
    private class233 field5523 = new class233();

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "Lkn;")
    private class233 field5524 = new class233();

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "Lkn;")
    private class233 field5525 = new class233();

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "Ltl;")
    private class91 field5528 = new class91(4);

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "I")
    public volatile int field5532 = 0;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "B")
    private byte field5533 = 0;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "I")
    public volatile int field5530 = 0;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "Ltl;")
    private class91 field5531 = new class91(8);

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "I")
    private int field5527;

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "J")
    private long field5529;

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "Lbi;")
    private class103 field5534;

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "Lad;")
    private class501 field5526;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public final void method2241(int arg0) {
        if (arg0 != -24623) {
            this.method2242(true);
        }
        field5503++;
        if (this.field5526 != null) {
            this.field5526.method2994(-1);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
    public final void method2242(boolean arg0) {
        field5507++;
        try {
            this.field5526.method2994(-1);
        } catch (Exception var2) {
        }
        this.field5532++;
        this.field5533 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0) {
            field5518 = -92;
        }
        this.field5526 = null;
        this.field5530 = -1;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)Z")
    public final boolean method2243(int arg0) {
        field5522++;
        if (arg0 == -6078) {
            return this.method2248((byte) 116) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
    public final void method2244(int arg0) {
        field5502++;
        if (this.field5526 == null || arg0 != 29967) {
            return;
        }
        try {
            this.field5528.field1292 = 0;
            this.field5528.method625(7, false);
            this.field5528.method584(-637577941, 0);
            this.field5526.method2999(this.field5528.field1277, 4, 1, 0);
        } catch (IOException var3) {
            try {
                this.field5526.method2994(arg0 - 29968);
            } catch (Exception var2) {
            }
            this.field5530 = -2;
            this.field5532++;
            this.field5526 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)V")
    public final void method2245(boolean arg0) {
        field5506++;
        if (arg0 && this.field5526 != null) {
            this.field5526.method2990((byte) -74);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2246(String arg0, String arg1, int arg2, String arg3) {
        if (arg2 != -1) {
            field5518 = -59;
        }
        field5512++;
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, arg1.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(var4 + arg3.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZB)V")
    public final void method2247(boolean arg0, byte arg1) {
        field5514++;
        if (this.field5526 == null) {
            return;
        }
        try {
            this.field5528.field1292 = 0;
            this.field5528.method625(arg0 ? 2 : 3, false);
            if (arg1 != 127) {
                method2246(null, null, 99, null);
            }
            this.field5528.method584(arg1 ^ 0xD9FF5554, 0);
            this.field5526.method2999(this.field5528.field1277, 4, 1, 0);
        } catch (IOException var4) {
            try {
                this.field5526.method2994(arg1 ^ 0xFFFFFF80);
            } catch (Exception var3) {
            }
            this.field5530 = -2;
            this.field5532++;
            this.field5526 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)I")
    private final int method2248(byte arg0) {
        if (arg0 <= 113) {
            this.field5527 = -15;
        }
        field5508++;
        return this.field5524.method1584(-9679) + this.field5525.method1584(-9679);
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(Z)V")
    private final void method2249(boolean arg0) {
        field5505++;
        if (this.field5526 == null) {
            return;
        }
        try {
            this.field5528.field1292 = 0;
            this.field5528.method625(6, false);
            if (!arg0) {
                this.method2241(109);
            }
            this.field5528.method584(-637577941, 3);
            this.field5526.method2999(this.field5528.field1277, 4, 1, 0);
        } catch (IOException var3) {
            try {
                this.field5526.method2994(-1);
            } catch (Exception var2) {
            }
            this.field5530 = -2;
            this.field5532++;
            this.field5526 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V")
    public static final void method2250(byte arg0) {
        for (class119 var1 = (class119) class73.field987.method1970(64); var1 != null; var1 = (class119) class73.field987.method1960(24)) {
            if (var1.field1672) {
                var1.method768(-30867);
            }
        }
        field5509++;
        if (arg0 < 4) {
            field5518 = 28;
        }
        for (class119 var2 = (class119) class55.field747.method1970(64); var2 != null; var2 = (class119) class55.field747.method1960(24)) {
            if (var2.field1672) {
                var2.method768(-30867);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZBIBI)Lbi;")
    public final class103 method2251(boolean arg0, byte arg1, int arg2, byte arg3, int arg4) {
        field5511++;
        if (arg1 > -121) {
            this.field5519 = null;
        }
        long var6 = (long) ((arg2 << 16) + arg4);
        class103 var8 = new class103();
        var8.field1468 = arg3;
        var8.field5539 = arg0;
        var8.field1173 = var6;
        if (arg0) {
            if (this.method2257(82) >= 20) {
                throw new RuntimeException();
            }
            this.field5519.method1582(var8, -1);
        } else if (this.method2248((byte) 121) < 20) {
            this.field5524.method1582(var8, -1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)Z")
    public final boolean method2252(int arg0) {
        if (arg0 != 20) {
            this.method2254(false, null, 13);
        }
        field5516++;
        return this.method2257(76) >= 20;
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)Z")
    public final boolean method2253(int arg0) {
        field5520++;
        if (this.field5526 != null) {
            long var2 = class264.method1698(true);
            int var4 = (int) (var2 - this.field5529);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5529 = var2;
            this.field5527 += var4;
            if (this.field5527 > 30000) {
                try {
                    this.field5526.method2994(-1);
                } catch (Exception var27) {
                }
                this.field5526 = null;
            }
        }
        if (this.field5526 == null) {
            return this.method2257(81) == 0 && this.method2248((byte) 119) == 0;
        }
        try {
            this.field5526.method2998(0);
            for (class103 var5 = (class103) this.field5519.method1581((byte) 53); var5 != null; var5 = (class103) this.field5519.method1585(-1)) {
                this.field5528.field1292 = 0;
                this.field5528.method625(1, false);
                this.field5528.method584(-637577941, (int) var5.field1173);
                this.field5526.method2999(this.field5528.field1277, 4, 1, 0);
                this.field5523.method1582(var5, -1);
            }
            if (arg0 < 92) {
                this.field5529 = 126L;
            }
            for (class103 var6 = (class103) this.field5524.method1581((byte) 53); var6 != null; var6 = (class103) this.field5524.method1585(-1)) {
                this.field5528.field1292 = 0;
                this.field5528.method625(0, false);
                this.field5528.method584(-637577941, (int) var6.field1173);
                this.field5526.method2999(this.field5528.field1277, 4, 1, 0);
                this.field5525.method1582(var6, -1);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5526.method2995((byte) 27);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5527 = 0;
                byte var9 = 0;
                if (this.field5534 == null) {
                    var9 = 8;
                } else if (this.field5534.field1469 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5531.field1292;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field5526.method2997(this.field5531.field1277, var10, (byte) 98, this.field5531.field1292);
                    if (this.field5533 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5531.field1277[this.field5531.field1292 + var11] = (byte) class41.method323(this.field5531.field1277[this.field5531.field1292 + var11], this.field5533);
                        }
                    }
                    this.field5531.field1292 += var10;
                    if (var9 <= this.field5531.field1292) {
                        if (this.field5534 == null) {
                            this.field5531.field1292 = 0;
                            int var12 = this.field5531.method618((byte) 100);
                            int var13 = this.field5531.method631(10494);
                            int var14 = this.field5531.method618((byte) 100);
                            int var15 = this.field5531.method626((byte) 100);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class103 var21;
                            if (var17) {
                                for (var21 = (class103) this.field5525.method1581((byte) 53); var21 != null && var21.field1173 != var18; var21 = (class103) this.field5525.method1585(-1)) {
                                }
                            } else {
                                for (var21 = (class103) this.field5523.method1581((byte) 53); var21 != null && var21.field1173 != var18; var21 = (class103) this.field5523.method1585(-1)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field5534 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5534.field1466 = new class91(this.field5534.field1468 + var22 + var15);
                            this.field5534.field1466.method625(var16, false);
                            this.field5534.field1466.method615(28010, var15);
                            this.field5534.field1469 = 8;
                            this.field5531.field1292 = 0;
                        } else if (this.field5534.field1469 != 0) {
                            throw new IOException();
                        } else if (this.field5531.field1277[0] == -1) {
                            this.field5531.field1292 = 0;
                            this.field5534.field1469 = 1;
                        } else {
                            this.field5534 = null;
                        }
                    }
                } else {
                    int var23 = this.field5534.field1466.field1277.length - this.field5534.field1468;
                    int var24 = 512 - this.field5534.field1469;
                    if (var24 > var23 - this.field5534.field1466.field1292) {
                        var24 = var23 - this.field5534.field1466.field1292;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field5526.method2997(this.field5534.field1466.field1277, var24, (byte) 98, this.field5534.field1466.field1292);
                    if (this.field5533 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5534.field1466.field1277[this.field5534.field1466.field1292 + var25] = (byte) class41.method323(this.field5534.field1466.field1277[this.field5534.field1466.field1292 + var25], this.field5533);
                        }
                    }
                    this.field5534.field1469 += var24;
                    this.field5534.field1466.field1292 += var24;
                    if (this.field5534.field1466.field1292 == var23) {
                        this.field5534.method560((byte) 95);
                        this.field5534.field5535 = false;
                        this.field5534 = null;
                    } else if (this.field5534.field1469 == 512) {
                        this.field5534.field1469 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5526.method2994(-1);
            } catch (Exception var26) {
            }
            this.field5530 = -2;
            this.field5526 = null;
            this.field5532++;
            return this.method2257(42) == 0 && this.method2248((byte) 122) == 0;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZLad;I)V")
    public final void method2254(boolean arg0, class501 arg1, int arg2) {
        field5504++;
        if (this.field5526 != null) {
            try {
                this.field5526.method2994(-1);
            } catch (Exception var8) {
            }
            this.field5526 = null;
        }
        this.field5526 = arg1;
        this.method2249(true);
        this.method2247(arg0, (byte) 127);
        this.field5531.field1292 = 0;
        this.field5534 = null;
        while (true) {
            class103 var4 = (class103) this.field5523.method1583(81);
            if (var4 == null) {
                while (true) {
                    class103 var5 = (class103) this.field5525.method1583(120);
                    if (var5 == null) {
                        if (this.field5533 != 0) {
                            try {
                                this.field5528.field1292 = 0;
                                this.field5528.method625(4, false);
                                this.field5528.method625(this.field5533, false);
                                this.field5528.method600(0, -12891);
                                this.field5526.method2999(this.field5528.field1277, 4, 1, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field5526.method2994(-1);
                                } catch (Exception var6) {
                                }
                                this.field5532++;
                                this.field5526 = null;
                                this.field5530 = -2;
                            }
                        }
                        if (arg2 == 128) {
                            this.field5527 = 0;
                            this.field5529 = class264.method1698(true);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.field5524.method1582(var5, -1);
                }
            }
            this.field5519.method1582(var4, arg2 - 129);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
    public static final void method2255(int arg0, int arg1) {
        field5510++;
        class377 var2 = class99.method672(arg1, false, 3);
        if (arg0 <= -97) {
            var2.method2339(-11688);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ[B)[B")
    public static final byte[] method2256(int arg0, boolean arg1, byte[] arg2) {
        field5513++;
        byte[] var3 = new byte[arg0];
        if (arg1) {
            return null;
        } else {
            class361.method2281(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)I")
    public final int method2257(int arg0) {
        field5517++;
        if (arg0 < 31) {
            this.method2244(-39);
        }
        return this.field5519.method1584(-9679) + this.field5523.method1584(-9679);
    }

    static {
        new class375("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field5521 = 0;
    }
}
