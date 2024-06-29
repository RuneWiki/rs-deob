import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class310 extends class635 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    private int field5073 = 0;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lqr;")
    private class69 field5075 = new class69(16);

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    private int field5099 = 0;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lat;")
    private class398 field5097 = new class398();

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "J")
    private long field5103 = 0L;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    private int field5070;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "Ldca;")
    private class186 field5084;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
    private boolean field5100;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Lat;")
    private class398 field5101;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Lmo;")
    private class783 field5091;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Lqh;")
    private class72 field5082;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    private int field5093;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Z")
    private boolean field5102;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Ldca;")
    private class186 field5079;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "[B")
    private byte[] field5074;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Lfm;")
    private class768 field5072;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field5104 = new String[] { method2672(method2671("\u001bbf\u0017\u0010")), method2672(method2671("\u001bbf\u001c\u0010")), method2672(method2671("\u001bbf\u0018\u0010")), method2672(method2671("\u001bbf\u0012\u0010")), method2672(method2671("\u001bbf\u0016\u0010")), method2672(method2671("\u001bbf\u0015\u0010")), method2672(method2671("\u001bbf\u0011\u0010")), method2672(method2671("\u001bbf\u0013\u0010")), method2672(method2671("\u0001q$8")), method2672(method2671("\u0014*fzE")), method2672(method2671("\u001bbf\u001b\u0010")), method2672(method2671("\u001bbf\u001d\u0010")), method2672(method2671("\u001bbf\u001a\u0010")), method2672(method2671("\u001bbf\u0019\u0010")), method2672(method2671("\u001bbf\u001e\u0010")), method2672(method2671("\u001bbf\u0010\u0010")), method2672(method2671("\u001bbfhQ\u0001m<j\u0010")), method2672(method2671("\u001bbf\u001f\u0010")) };

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "Lko;")
    public static class532 field5080 = new class532("", 18);

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field5088 = 0;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field5094 = 1403;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Lia;")
    private class616 field5066;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Ltga;")
    public static class61 field5090;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
    private boolean field5098;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[B")
    private byte[] field5076;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I")
    public final int method2656(byte arg0) {
        try {
            if (arg0 < 109) {
                this.method2670(-39);
            }
            field5068++;
            return this.field5073;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5104[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBI)Lfm;")
    private final class768 method2657(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 > -18) {
                method2663(null, null, null, (byte) -128, null, null);
            }
            field5069++;
            class768 var4 = (class768) this.field5075.method737((byte) -39, (long) arg2);
            if (var4 != null && arg0 == 0 && !var4.field11244 && var4.field11246) {
                var4.method4173(-1);
                var4 = null;
            }
            if (var4 == null) {
                if (arg0 == 0) {
                    if (this.field5084 == null || this.field5076[arg2] == -1) {
                        if (this.field5091.method5630(-29571)) {
                            return null;
                        }
                        var4 = this.field5091.method5623(this.field5070, 6, (byte) 2, arg2, true);
                    } else {
                        var4 = this.field5082.method758(arg2, 1, this.field5084);
                    }
                } else if (arg0 == 1) {
                    if (this.field5084 == null) {
                        throw new RuntimeException();
                    }
                    var4 = this.field5082.method756(arg2, 31009, this.field5084);
                } else if (arg0 == 2) {
                    if (this.field5084 == null) {
                        throw new RuntimeException();
                    }
                    if (this.field5076[arg2] != -1) {
                        throw new RuntimeException();
                    }
                    if (this.field5091.method5631(16072)) {
                        return null;
                    }
                    var4 = this.field5091.method5623(this.field5070, 6, (byte) 2, arg2, false);
                } else {
                    throw new RuntimeException();
                }
                this.field5075.method738(var4, (long) arg2, -12002);
            }
            if (var4.field11246) {
                return null;
            }
            byte[] var5 = var4.method4228(true);
            if (!(var4 instanceof class576)) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class752.field11082.reset();
                    class752.field11082.update(var5, 0, var5.length - 2);
                    int var6 = (int) class752.field11082.getValue();
                    if (this.field5066.field8891[arg2] != var6) {
                        throw new RuntimeException();
                    }
                    if (this.field5066.field8896 != null && this.field5066.field8896[arg2] != null) {
                        byte[] var7 = this.field5066.field8896[arg2];
                        byte[] var8 = class198.method1816((byte) -62, var5.length - 2, var5, 0);
                        for (int var9 = 0; var9 < 64; var9++) {
                            if (var7[var9] != var8[var9]) {
                                throw new RuntimeException();
                            }
                        }
                    }
                    this.field5091.field11447 = 0;
                    this.field5091.field11446 = 0;
                } catch (RuntimeException var18) {
                    this.field5091.method5634(255);
                    var4.method4173(-1);
                    if (var4.field11244 && !this.field5091.method5630(-29571)) {
                        class689 var10 = this.field5091.method5623(this.field5070, 6, (byte) 2, arg2, true);
                        this.field5075.method738(var10, (long) arg2, -12002);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field5066.field8894[arg2] >>> 8);
                var5[var5.length - 1] = (byte) this.field5066.field8894[arg2];
                if (this.field5084 != null) {
                    this.field5082.method754((byte) -4, var5, this.field5084, arg2);
                    if (this.field5076[arg2] != 1) {
                        this.field5073++;
                        this.field5076[arg2] = 1;
                    }
                }
                if (!var4.field11244) {
                    var4.method4173(-1);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class752.field11082.reset();
                class752.field11082.update(var5, 0, var5.length - 2);
                int var11 = (int) class752.field11082.getValue();
                if (this.field5066.field8891[arg2] != var11) {
                    throw new RuntimeException();
                }
                if (this.field5066.field8896 != null && this.field5066.field8896[arg2] != null) {
                    byte[] var12 = this.field5066.field8896[arg2];
                    byte[] var13 = class198.method1816((byte) -57, var5.length - 2, var5, 0);
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (var12[var14] != var13[var14]) {
                            throw new RuntimeException();
                        }
                    }
                }
                int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field5066.field8894[arg2] & 0xFFFF) != var15) {
                    throw new RuntimeException();
                }
                if (this.field5076[arg2] != 1) {
                    this.field5073++;
                    this.field5076[arg2] = 1;
                }
                if (!var4.field11244) {
                    var4.method4173(-1);
                }
                return var4;
            } catch (Exception var19) {
                this.field5076[arg2] = -1;
                var4.method4173(-1);
                if (var4.field11244 && !this.field5091.method5630(-29571)) {
                    class689 var16 = this.field5091.method5623(this.field5070, 6, (byte) 2, arg2, true);
                    this.field5075.method738(var16, (long) arg2, -12002);
                }
                return null;
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field5104[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)V")
    public static void method2658(byte arg0) {
        try {
            field5080 = null;
            field5090 = null;
            if (arg0 <= 22) {
                method2658((byte) -111);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5104[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(JB)V")
    public static final void method2659(long arg0, byte arg1) {
        try {
            class679.field9664.setTime(new Date(arg0));
            field5078++;
            if (arg1 <= 71) {
                method2658((byte) -21);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5104[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
    public final void method2660(int arg0) {
        try {
            field5067++;
            if (this.field5101 != null) {
                if (this.method2666(127) == null) {
                    return;
                }
                if (this.field5100) {
                    boolean var6 = true;
                    for (class568 var7 = this.field5101.method3228(11); var7 != null; var7 = this.field5101.method3216(true)) {
                        int var8 = (int) var7.field8252;
                        if (this.field5076[var8] == 0) {
                            this.method2657(1, (byte) -33, var8);
                        }
                        if (this.field5076[var8] == 0) {
                            var6 = false;
                        } else {
                            var7.method4173(-1);
                        }
                    }
                    while (this.field5099 < this.field5066.field8886.length) {
                        if (this.field5066.field8886[this.field5099] == 0) {
                            this.field5099++;
                        } else {
                            if (this.field5082.field1014 >= 250) {
                                var6 = false;
                                break;
                            }
                            if (this.field5076[this.field5099] == 0) {
                                this.method2657(1, (byte) -96, this.field5099);
                            }
                            if (this.field5076[this.field5099] == 0) {
                                class568 var9 = new class568();
                                var9.field8252 = this.field5099;
                                var6 = false;
                                this.field5101.method3220(var9, 0);
                            }
                            this.field5099++;
                        }
                    }
                    if (var6) {
                        this.field5099 = 0;
                        this.field5100 = false;
                    }
                } else if (this.field5098) {
                    boolean var2 = true;
                    for (class568 var3 = this.field5101.method3228(11); var3 != null; var3 = this.field5101.method3216(true)) {
                        int var4 = (int) var3.field8252;
                        if (this.field5076[var4] != 1) {
                            this.method2657(2, (byte) -115, var4);
                        }
                        if (this.field5076[var4] == 1) {
                            var3.method4173(-1);
                        } else {
                            var2 = false;
                        }
                    }
                    while (this.field5099 < this.field5066.field8886.length) {
                        if (this.field5066.field8886[this.field5099] == 0) {
                            this.field5099++;
                        } else {
                            if (this.field5091.method5631(16072)) {
                                var2 = false;
                                break;
                            }
                            if (this.field5076[this.field5099] != 1) {
                                this.method2657(2, (byte) -58, this.field5099);
                            }
                            if (this.field5076[this.field5099] != 1) {
                                class568 var5 = new class568();
                                var5.field8252 = this.field5099;
                                var2 = false;
                                this.field5101.method3220(var5, 0);
                            }
                            this.field5099++;
                        }
                    }
                    if (var2) {
                        this.field5099 = 0;
                        this.field5098 = false;
                    }
                } else {
                    this.field5101 = null;
                }
            }
            if (this.field5102 && class712.method5167(-2334) >= this.field5103) {
                for (class768 var10 = (class768) this.field5075.method735(0); var10 != null; var10 = (class768) this.field5075.method734((byte) -50)) {
                    if (!var10.field11246) {
                        if (var10.field11241) {
                            if (!var10.field11244) {
                                throw new RuntimeException();
                            }
                            var10.method4173(-1);
                        } else {
                            var10.field11241 = true;
                        }
                    }
                }
                this.field5103 = class712.method5167(-2334) + 1000L;
            }
            if (arg0 > -44) {
                this.field5079 = null;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field5104[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
    public final int method2661(byte arg0) {
        try {
            field5085++;
            if (this.field5066 == null) {
                return 0;
            } else if (this.field5100) {
                class568 var2 = this.field5101.method3228(11);
                if (var2 == null) {
                    return 0;
                } else if (arg0 == 21) {
                    return (int) var2.field8252;
                } else {
                    return -49;
                }
            } else {
                return this.field5066.field8879;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5104[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[B")
    public final byte[] method2662(int arg0, boolean arg1) {
        try {
            field5071++;
            class768 var3 = this.method2657(0, (byte) -86, arg0);
            if (var3 == null) {
                return null;
            } else {
                byte[] var4 = var3.method4228(arg1);
                var3.method4173(-1);
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5104[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Leg;Lgda;Lgda;BLgda;Leca;)Z")
    public static final boolean method2663(class114 arg0, class58 arg1, class58 arg2, byte arg3, class58 arg4, class793 arg5) {
        try {
            class350.field5661 = arg0;
            field5087++;
            class58.field732 = arg4;
            class447.field6942 = arg5;
            class459.field7078 = new int[16];
            class660.field9427 = arg2;
            class303.field4882 = arg1;
            for (int var6 = 0; var6 < 16; var6++) {
                class459.field7078[var6] = 255;
            }
            if (arg3 <= 17) {
                field5094 = 93;
            }
            return true;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5104[10] + (arg0 == null ? field5104[8] : field5104[9]) + ',' + (arg1 == null ? field5104[8] : field5104[9]) + ',' + (arg2 == null ? field5104[8] : field5104[9]) + ',' + arg3 + ',' + (arg4 == null ? field5104[8] : field5104[9]) + ',' + (arg5 == null ? field5104[8] : field5104[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
    public final void method2664(boolean arg0) {
        try {
            field5081++;
            if (!arg0 && this.field5101 != null && this.method2666(127) != null) {
                for (class568 var2 = this.field5097.method3228(11); var2 != null; var2 = this.field5097.method3216(true)) {
                    int var3 = (int) var2.field8252;
                    if (var3 < 0 || var3 >= this.field5066.field8883 || this.field5066.field8886[var3] == 0) {
                        var2.method4173(-1);
                    } else {
                        if (this.field5076[var3] == 0) {
                            this.method2657(1, (byte) -27, var3);
                        }
                        if (this.field5076[var3] == -1) {
                            this.method2657(2, (byte) -20, var3);
                        }
                        if (this.field5076[var3] == 1) {
                            var2.method4173(-1);
                        }
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5104[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
    public final void method2665(int arg0, byte arg1) {
        try {
            field5092++;
            if (this.field5084 != null) {
                for (class568 var3 = this.field5097.method3228(11); var3 != null; var3 = this.field5097.method3216(true)) {
                    if (var3.field8252 == ((long) arg0)) {
                        return;
                    }
                }
                class568 var4 = new class568();
                var4.field8252 = arg0;
                this.field5097.method3220(var4, 0);
                if (arg1 < 73) {
                    this.method2669((byte) 14);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5104[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lia;")
    public final class616 method2666(int arg0) {
        try {
            field5089++;
            if (this.field5066 != null) {
                return this.field5066;
            }
            if (this.field5072 == null) {
                if (this.field5091.method5630(-29571)) {
                    return null;
                }
                this.field5072 = this.field5091.method5623(255, 6, (byte) 0, this.field5070, true);
            }
            if (this.field5072.field11246) {
                return null;
            }
            if (arg0 <= 126) {
                this.method2664(true);
            }
            byte[] var2 = this.field5072.method4228(true);
            if (this.field5072 instanceof class576) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field5066 = new class616(var2, this.field5093, this.field5074);
                    if (this.field5066.field8880 != this.field5096) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var4) {
                    this.field5066 = null;
                    if (this.field5091.method5630(-29571)) {
                        this.field5072 = null;
                    } else {
                        this.field5072 = this.field5091.method5623(255, 6, (byte) 0, this.field5070, true);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field5066 = new class616(var2, this.field5093, this.field5074);
                } catch (RuntimeException var5) {
                    this.field5091.method5634(255);
                    this.field5066 = null;
                    if (this.field5091.method5630(-29571)) {
                        this.field5072 = null;
                    } else {
                        this.field5072 = this.field5091.method5623(255, 6, (byte) 0, this.field5070, true);
                    }
                    return null;
                }
                if (this.field5079 != null) {
                    this.field5082.method754((byte) -4, var2, this.field5079, this.field5070);
                }
            }
            if (this.field5084 != null) {
                this.field5076 = new byte[this.field5066.field8883];
                this.field5073 = 0;
            }
            this.field5072 = null;
            return this.field5066;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5104[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)I")
    public final int method2667(int arg0, int arg1) {
        try {
            if (arg0 <= 34) {
                this.field5102 = false;
            }
            field5086++;
            class768 var3 = (class768) this.field5075.method737((byte) -39, (long) arg1);
            return var3 == null ? 0 : var3.method4226(true);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5104[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public final void method2668(int arg0) {
        try {
            field5083++;
            if (this.field5084 != null) {
                this.field5098 = true;
                if (arg0 != -1) {
                    this.field5098 = true;
                }
                if (this.field5101 == null) {
                    this.field5101 = new class398();
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5104[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
    public final int method2669(byte arg0) {
        try {
            field5077++;
            if (this.method2666(127) == null) {
                return this.field5072 == null ? 0 : this.field5072.method4226(true);
            } else {
                int var2 = 69 / ((-arg0 - 53) / 32);
                return 100;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5104[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
    public final int method2670(int arg0) {
        try {
            field5095++;
            if (this.field5066 == null) {
                return 0;
            } else {
                if (arg0 < 74) {
                    this.method2668(31);
                }
                return this.field5066.field8879;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5104[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILdca;Ldca;Lmo;Lqh;I[BIZ)V")
    public class310(int arg0, class186 arg1, class186 arg2, class783 arg3, class72 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        try {
            this.field5070 = arg0;
            this.field5084 = arg1;
            if (this.field5084 == null) {
                this.field5100 = false;
            } else {
                this.field5100 = true;
                this.field5101 = new class398();
            }
            this.field5091 = arg3;
            this.field5082 = arg4;
            this.field5093 = arg5;
            this.field5096 = arg7;
            this.field5102 = arg8;
            this.field5079 = arg2;
            this.field5074 = arg6;
            if (this.field5079 != null) {
                this.field5072 = this.field5082.method758(this.field5070, 1, this.field5079);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5104[16] + arg0 + ',' + (arg1 == null ? field5104[8] : field5104[9]) + ',' + (arg2 == null ? field5104[8] : field5104[9]) + ',' + (arg3 == null ? field5104[8] : field5104[9]) + ',' + (arg4 == null ? field5104[8] : field5104[9]) + ',' + arg5 + ',' + (arg6 == null ? field5104[8] : field5104[9]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2671(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2672(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
