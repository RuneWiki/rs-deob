import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class489 extends class639 {

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    private int field6835 = 0;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lbaa;")
    private class130 field6820 = new class130(16);

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
    private int field6855 = 0;

    @OriginalMember(owner = "client!rt", name = "Q", descriptor = "Lmba;")
    private class646 field6856 = new class646();

    @OriginalMember(owner = "client!rt", name = "T", descriptor = "J")
    private long field6859 = 0L;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "Lkv;")
    private class684 field6844;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    private int field6829;

    @OriginalMember(owner = "client!rt", name = "N", descriptor = "Z")
    private boolean field6853;

    @OriginalMember(owner = "client!rt", name = "R", descriptor = "Lmba;")
    private class646 field6857;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    private int field6845;

    @OriginalMember(owner = "client!rt", name = "S", descriptor = "Z")
    private boolean field6858;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    private int field6827;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "[B")
    private byte[] field6842;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Lqw;")
    private class387 field6822;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "Lkv;")
    private class684 field6831;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "Lth;")
    private class290 field6828;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "Lgf;")
    private class666 field6849;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    public static int field6846 = 0;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Lst;")
    public static class335 field6823 = new class335(75, -1);

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
    public static int field6850 = 0;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "Lvh;")
    private class629 field6852;

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "Z")
    private boolean field6854;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "[B")
    private byte[] field6841;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)I")
    public final int method2960(byte arg0) {
        field6847++;
        int var2 = -116 / ((-arg0 - 83) / 41);
        return this.field6852 == null ? 0 : this.field6852.field8448;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)I")
    public final int method2961(int arg0) {
        field6825++;
        if (arg0 != 0) {
            return -90;
        } else if (this.method2974(true) == null) {
            return this.field6849 == null ? 0 : this.field6849.method212(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
    public final void method2962(int arg0, int arg1) {
        field6824++;
        if (this.field6844 == null) {
            return;
        }
        if (arg0 != -2) {
            this.field6829 = 101;
        }
        for (class71 var3 = this.field6856.method3618(arg0 ^ 0x7A); var3 != null; var3 = this.field6856.method3619(0)) {
            if (((long) arg1) == var3.field1079) {
                return;
            }
        }
        class71 var4 = new class71();
        var4.field1079 = arg1;
        this.field6856.method3610(9289, var4);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method2963(String arg0, byte arg1) {
        field6830++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != 99) {
            method2965((byte) -24, null, 100, 36, null);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
    public final void method2964(int arg0) {
        field6832++;
        if (this.field6844 != null) {
            this.field6854 = true;
            if (arg0 == 8220 && this.field6857 == null) {
                this.field6857 = new class646();
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLjava/awt/Component;IILrp;)Lefa;")
    public static final class531 method2965(byte arg0, Component arg1, int arg2, int arg3, class135 arg4) {
        field6836++;
        if (class718.field9998 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class531 var5 = (class531) Class.forName("fb").getDeclaredConstructor().newInstance();
                var5.field7360 = new int[(class644.field8627 ? 2 : 1) * 256];
                var5.field7374 = arg3;
                var5.method197(arg1);
                var5.field7383 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field7383 > 16384) {
                    var5.field7383 = 16384;
                }
                var5.method195(var5.field7383);
                if (class364.field5186 > 0 && class115.field1532 == null) {
                    class115.field1532 = new class315();
                    class115.field1532.field4363 = arg4;
                    arg4.method872(class364.field5186, (byte) -127, class115.field1532);
                }
                if (class115.field1532 != null) {
                    if (class115.field1532.field4359[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class115.field1532.field4359[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class36 var6 = new class36(arg4, arg2);
                    if (arg0 < 87) {
                        method2970(false, -15, -56);
                    }
                    var6.field7374 = arg3;
                    var6.field7360 = new int[(class644.field8627 ? 2 : 1) * 256];
                    var6.method197(arg1);
                    var6.field7383 = 16384;
                    var6.method195(var6.field7383);
                    if (class364.field5186 > 0 && class115.field1532 == null) {
                        class115.field1532 = new class315();
                        class115.field1532.field4363 = arg4;
                        arg4.method872(class364.field5186, (byte) -127, class115.field1532);
                    }
                    if (class115.field1532 != null) {
                        if (class115.field1532.field4359[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class115.field1532.field4359[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class531();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)[B")
    public final byte[] method2966(int arg0, byte arg1) {
        if (arg1 != -100) {
            this.method2960((byte) 61);
        }
        field6840++;
        class666 var3 = this.method2975(0, -19102, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method214((byte) -108);
            var3.method549(arg1 ^ 0xFFFFE696);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V")
    public final void method2967(int arg0) {
        field6848++;
        if (this.field6857 != null) {
            if (this.method2974(true) == null) {
                return;
            }
            if (this.field6853) {
                boolean var6 = true;
                for (class71 var7 = this.field6857.method3618(93); var7 != null; var7 = this.field6857.method3619(~arg0)) {
                    int var9 = (int) var7.field1079;
                    if (this.field6841[var9] == 0) {
                        this.method2975(1, -19102, var9);
                    }
                    if (this.field6841[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method549(6410);
                    }
                }
                while (this.field6852.field8457.length > this.field6855) {
                    if (this.field6852.field8457[this.field6855] == 0) {
                        this.field6855++;
                    } else {
                        if (this.field6822.field5573 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field6841[this.field6855] == 0) {
                            this.method2975(1, arg0 ^ 0x4A9D, this.field6855);
                        }
                        if (this.field6841[this.field6855] == 0) {
                            class71 var8 = new class71();
                            var8.field1079 = this.field6855;
                            var6 = false;
                            this.field6857.method3610(9289, var8);
                        }
                        this.field6855++;
                    }
                }
                if (var6) {
                    this.field6855 = 0;
                    this.field6853 = false;
                }
            } else if (this.field6854) {
                boolean var2 = true;
                for (class71 var3 = this.field6857.method3618(-116); var3 != null; var3 = this.field6857.method3619(0)) {
                    int var5 = (int) var3.field1079;
                    if (this.field6841[var5] != 1) {
                        this.method2975(2, -19102, var5);
                    }
                    if (this.field6841[var5] == 1) {
                        var3.method549(6410);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field6855 < this.field6852.field8457.length) {
                    if (this.field6852.field8457[this.field6855] == 0) {
                        this.field6855++;
                    } else {
                        if (this.field6828.method1922(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field6841[this.field6855] != 1) {
                            this.method2975(2, -19102, this.field6855);
                        }
                        if (this.field6841[this.field6855] != 1) {
                            class71 var4 = new class71();
                            var4.field1079 = this.field6855;
                            var2 = false;
                            this.field6857.method3610(9289, var4);
                        }
                        this.field6855++;
                    }
                }
                if (var2) {
                    this.field6855 = 0;
                    this.field6854 = false;
                }
            } else {
                this.field6857 = null;
            }
        }
        if (arg0 != -1) {
            field6850 = -8;
        }
        if (!this.field6858 || this.field6859 > class97.method664((byte) -50)) {
            return;
        }
        for (class666 var10 = (class666) this.field6820.method821((byte) 120); var10 != null; var10 = (class666) this.field6820.method818(arg0 + 87)) {
            if (!var10.field9191) {
                if (var10.field9190) {
                    if (!var10.field9192) {
                        throw new RuntimeException();
                    }
                    var10.method549(6410);
                } else {
                    var10.field9190 = true;
                }
            }
        }
        this.field6859 = class97.method664((byte) -50) + 1000L;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BI)I")
    public final int method2968(byte arg0, int arg1) {
        field6834++;
        class666 var3 = (class666) this.field6820.method812(120, (long) arg1);
        if (var3 == null) {
            if (arg0 > -82) {
                method2970(true, -104, -89);
            }
            return 0;
        } else {
            return var3.method212(100);
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)V")
    public final void method2969(int arg0) {
        field6839++;
        if (this.field6857 == null) {
            return;
        }
        if (arg0 < 89) {
            this.field6828 = null;
        }
        if (this.method2974(true) == null) {
            return;
        }
        for (class71 var2 = this.field6856.method3618(-86); var2 != null; var2 = this.field6856.method3619(0)) {
            int var3 = (int) var2.field1079;
            if (var3 < 0 || this.field6852.field8461 <= var3 || this.field6852.field8457[var3] == 0) {
                var2.method549(6410);
            } else {
                if (this.field6841[var3] == 0) {
                    this.method2975(1, -19102, var3);
                }
                if (this.field6841[var3] == -1) {
                    this.method2975(2, -19102, var3);
                }
                if (this.field6841[var3] == 1) {
                    var2.method549(6410);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2970(boolean arg0, int arg1, int arg2) {
        field6821++;
        if (!class324.method2077(-1, arg2, arg1)) {
            return false;
        } else if (class523.method3112(arg2, -1, arg1) | (arg1 & 0xB000) != 0 | class343.method2197(82, arg2, arg1)) {
            return true;
        } else {
            if (!arg0) {
                method2971(20);
            }
            return (arg2 & 0x37) == 0 & (class670.method3782(arg2, 544, arg1) | class157.method984(arg1, arg2, -991));
        }
    }

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "(I)V")
    public static void method2971(int arg0) {
        if (arg0 != 2) {
            method2963(null, (byte) -109);
        }
        field6823 = null;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)I")
    public final int method2972(boolean arg0) {
        field6833++;
        if (!arg0) {
            this.field6820 = null;
        }
        return this.field6835;
    }

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)I")
    public final int method2973(int arg0) {
        field6826++;
        if (this.field6852 == null) {
            return 0;
        } else if (!this.field6853) {
            return this.field6852.field8448;
        } else if (arg0 == 0) {
            class71 var2 = this.field6857.method3618(arg0 - 63);
            return var2 == null ? 0 : (int) var2.field1079;
        } else {
            return -86;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)Lvh;")
    public final class629 method2974(boolean arg0) {
        if (!arg0) {
            method2963(null, (byte) 85);
        }
        field6843++;
        if (this.field6852 != null) {
            return this.field6852;
        }
        if (this.field6849 == null) {
            if (this.field6828.method1929(13585)) {
                return null;
            }
            this.field6849 = this.field6828.method1924(this.field6829, true, 255, (byte) 0, (byte) -99);
        }
        if (this.field6849.field9191) {
            return null;
        }
        byte[] var2 = this.field6849.method214((byte) -103);
        if (this.field6849 instanceof class147) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6852 = new class629(var2, this.field6827, this.field6842);
                if (this.field6852.field8450 != this.field6845) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6852 = null;
                if (this.field6828.method1929(13585)) {
                    this.field6849 = null;
                } else {
                    this.field6849 = this.field6828.method1924(this.field6829, true, 255, (byte) 0, (byte) -84);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6852 = new class629(var2, this.field6827, this.field6842);
            } catch (RuntimeException var4) {
                this.field6828.method1913((byte) 103);
                this.field6852 = null;
                if (this.field6828.method1929(13585)) {
                    this.field6849 = null;
                } else {
                    this.field6849 = this.field6828.method1924(this.field6829, true, 255, (byte) 0, (byte) -50);
                }
                return null;
            }
            if (this.field6831 != null) {
                this.field6822.method2435(var2, this.field6831, this.field6829, 107);
            }
        }
        this.field6849 = null;
        if (this.field6844 != null) {
            this.field6835 = 0;
            this.field6841 = new byte[this.field6852.field8461];
        }
        return this.field6852;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Lgf;")
    private final class666 method2975(int arg0, int arg1, int arg2) {
        field6838++;
        class666 var4 = (class666) this.field6820.method812(103, (long) arg2);
        if (arg1 != -19102) {
            return null;
        }
        if (var4 != null && arg0 == 0 && !var4.field9192 && var4.field9191) {
            var4.method549(6410);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field6844 == null || this.field6841[arg2] == -1) {
                    if (this.field6828.method1929(13585)) {
                        return null;
                    }
                    var4 = this.field6828.method1924(arg2, true, this.field6829, (byte) 2, (byte) -36);
                } else {
                    var4 = this.field6822.method2433(arg2, this.field6844, (byte) 68);
                }
            } else if (arg0 == 1) {
                if (this.field6844 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6822.method2430(arg1 ^ 0x1864, arg2, this.field6844);
            } else if (arg0 == 2) {
                if (this.field6844 == null) {
                    throw new RuntimeException();
                }
                if (this.field6841[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6828.method1922(true)) {
                    return null;
                }
                var4 = this.field6828.method1924(arg2, false, this.field6829, (byte) 2, (byte) -44);
            } else {
                throw new RuntimeException();
            }
            this.field6820.method820((long) arg2, (byte) -42, var4);
        }
        if (var4.field9191) {
            return null;
        }
        byte[] var5 = var4.method214((byte) -97);
        if (!var4 instanceof class147) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class452.field6259.reset();
                        class452.field6259.update(var5, 0, var5.length - 2);
                        int var12 = (int) class452.field6259.getValue();
                        if (this.field6852.field8456[arg2] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field6852.field8459 == null || this.field6852.field8459[arg2] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field6852.field8459[arg2];
                        byte[] var14 = class383.method2407((byte) -122, 0, var5, var5.length - 2);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field6828.field4173 = 0;
                this.field6828.field4174 = 0;
            } catch (RuntimeException var18) {
                this.field6828.method1913((byte) 103);
                var4.method549(arg1 ^ 0xFFFFAC68);
                if (var4.field9192 && !this.field6828.method1929(13585)) {
                    class39 var16 = this.field6828.method1924(arg2, true, this.field6829, (byte) 2, (byte) -37);
                    this.field6820.method820((long) arg2, (byte) -42, var16);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6852.field8453[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field6852.field8453[arg2];
            if (this.field6844 != null) {
                this.field6822.method2435(var5, this.field6844, arg2, 71);
                if (this.field6841[arg2] != 1) {
                    this.field6835++;
                    this.field6841[arg2] = 1;
                }
            }
            if (!var4.field9192) {
                var4.method549(arg1 + 25512);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class452.field6259.reset();
            class452.field6259.update(var5, 0, var5.length - 2);
            int var6 = (int) class452.field6259.getValue();
            if (this.field6852.field8456[arg2] != var6) {
                throw new RuntimeException();
            }
            if (this.field6852.field8459 != null && this.field6852.field8459[arg2] != null) {
                byte[] var7 = this.field6852.field8459[arg2];
                byte[] var8 = class383.method2407((byte) -120, 0, var5, var5.length - 2);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6852.field8453[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field6841[arg2] != 1) {
                this.field6835++;
                this.field6841[arg2] = 1;
            }
            if (!var4.field9192) {
                var4.method549(6410);
            }
            return var4;
        } catch (Exception var17) {
            this.field6841[arg2] = -1;
            var4.method549(arg1 ^ 0xFFFFAC68);
            if (var4.field9192 && !this.field6828.method1929(13585)) {
                class39 var11 = this.field6828.method1924(arg2, true, this.field6829, (byte) 2, (byte) -68);
                this.field6820.method820((long) arg2, (byte) -42, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILkv;Lkv;Lth;Lqw;I[BIZ)V")
    public class489(int arg0, class684 arg1, class684 arg2, class290 arg3, class387 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field6844 = arg1;
        this.field6829 = arg0;
        if (this.field6844 == null) {
            this.field6853 = false;
        } else {
            this.field6853 = true;
            this.field6857 = new class646();
        }
        this.field6845 = arg7;
        this.field6858 = arg8;
        this.field6827 = arg5;
        this.field6842 = arg6;
        this.field6822 = arg4;
        this.field6831 = arg2;
        this.field6828 = arg3;
        if (this.field6831 != null) {
            this.field6849 = this.field6822.method2433(this.field6829, this.field6831, (byte) 68);
        }
    }
}
