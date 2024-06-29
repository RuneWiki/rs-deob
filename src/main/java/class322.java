import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class322 extends class306 {

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    private int field5018 = 0;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "Lru;")
    private class177 field5007 = new class177(16);

    @OriginalMember(owner = "client!rt", name = "N", descriptor = "I")
    private int field5020 = 0;

    @OriginalMember(owner = "client!rt", name = "S", descriptor = "Lnj;")
    private class317 field5025 = new class317();

    @OriginalMember(owner = "client!rt", name = "Z", descriptor = "J")
    private long field5032 = 0L;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    private int field5001;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "Lbh;")
    private class307 field5006;

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "Z")
    private boolean field5021;

    @OriginalMember(owner = "client!rt", name = "W", descriptor = "Lnj;")
    private class317 field5029;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "Ldp;")
    private class342 field5004;

    @OriginalMember(owner = "client!rt", name = "ab", descriptor = "Z")
    private boolean field5033;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    private int field5005;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Lbh;")
    private class307 field4989;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lun;")
    private class204 field4993;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "Lvb;")
    private class275 field5010;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "Lnj;")
    public static class317 field5019;

    @OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!rt", name = "R", descriptor = "[I")
    public static int[] field5024;

    @OriginalMember(owner = "client!rt", name = "T", descriptor = "Lnj;")
    public static class317 field5026;

    @OriginalMember(owner = "client!rt", name = "V", descriptor = "[S")
    public static short[] field5028;

    @OriginalMember(owner = "client!rt", name = "X", descriptor = "J")
    public static long field5030;

    @OriginalMember(owner = "client!rt", name = "Y", descriptor = "Lgi;")
    public static class437 field5031;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "Lne;")
    private class132 field5000;

    @OriginalMember(owner = "client!rt", name = "U", descriptor = "Lwe;")
    public static class86 field5027;

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "Z")
    private boolean field5022;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "[B")
    private byte[] field5013;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lqg;Lza;Lho;Z)V")
    public static final void method2148(class210 arg0, class497 arg1, class224 arg2, boolean arg3) {
        field5003++;
        class139 var4 = arg0.method1491(arg1, !arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method626();
        if (var5 < var4.method622()) {
            var5 = var4.method622();
        }
        byte var6 = 10;
        int var7 = arg2.field3765;
        int var8 = arg2.field3761;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field3249 != null) {
            var9 = class240.field3905.method2260(arg0.field3249, 215, null, class159.field2171, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class159.field2171[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class350.field5418.method191(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class350.field5418.method189() + class350.field5418.method195() / 2;
        }
        int var15 = var5 / 2 + arg2.field3765;
        int var16 = arg2.field3761;
        if ((class194.field2903 + var5) > var7) {
            var15 = var10 / 2 + var6 + var5 / 2 + class194.field2903 + 5;
            var7 = class194.field2903;
        } else if (class194.field2889 - var5 < var7) {
            var15 = class194.field2889 - var6 - (var5 / 2) - (var10 / 2) - 5;
            var7 = class194.field2889 - var5;
        }
        if ((class194.field2897 + var5) > var8) {
            var16 = class194.field2897 - (-var6 - var5 / 2);
            var8 = class194.field2897;
        } else if ((class194.field2888 - var5) < var8) {
            var8 = class194.field2888 - var5;
            var16 = class194.field2888 - (var5 / 2) - var6 - var11;
        }
        if (arg3) {
            return;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg2.field3765), (double) (var8 - arg2.field3761)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method846((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field3249 != null) {
            var18 = var15 - var10 / 2 - 5;
            var19 = var16;
            var20 = var18 + var10 + 10;
            var21 = class350.field5418.method189() * var9 + var16 + 3;
            if (arg0.field3250 != 0) {
                arg1.method3042(var21 - var16, (byte) -99, var16, arg0.field3250, var18, var20 - var18);
            }
            if (arg0.field3252 != 0) {
                arg1.method3040(arg0.field3252, true, var21 - var16, var16, var18, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class159.field2171[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class350.field5418.method190(arg1, var23, var15, var16, arg0.field3257, true);
                var16 += class350.field5418.method189();
            }
        }
        if (arg0.field3254 == -1 && arg0.field3249 == null) {
            return;
        }
        class39 var24 = new class39(arg2);
        int var25 = var5 >> 1;
        var24.field387 = var19;
        var24.field389 = var21;
        var24.field397 = var18;
        var24.field395 = var20;
        var24.field396 = var8 - var25;
        var24.field384 = var8 + var25;
        var24.field392 = var7 - var25;
        var24.field391 = var7 + var25;
        class541.field7908.method2124(var24, (byte) 99);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILgi;I)V")
    public static final void method2149(int arg0, int arg1, class437 arg2, int arg3) {
        field5015++;
        class453 var4 = arg2.method2761(class19.field198, (byte) 92);
        if (var4 == null) {
            return;
        }
        class19.field198.method1307(arg0, arg1, arg2.field6615 + arg0, arg1 - -arg2.field6730);
        if (arg3 > -46) {
            return;
        }
        if (class148.field1999 < 3) {
            class457.field7052.method849((float) arg2.field6615 / 2.0F + (float) arg0, (float) arg2.field6730 / 2.0F + (float) arg1, 4096, ((int) (-class388.field5918) & 0x3FFF) << 2, var4, arg0, arg1);
        } else {
            class19.field198.method1323(-16777216, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Lne;")
    public final class132 method2060(int arg0) {
        field5002++;
        if (arg0 != 24342) {
            this.method2150(true);
        }
        if (this.field5000 != null) {
            return this.field5000;
        }
        if (this.field5010 == null) {
            if (this.field4993.method1397(27573)) {
                return null;
            }
            this.field5010 = this.field4993.method1398(true, -49, 255, this.field5001, (byte) 0);
        }
        if (this.field5010.field4368) {
            return null;
        }
        byte[] var2 = this.field5010.method539(88);
        if (this.field5010 instanceof class74) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5000 = new class132(var2, this.field5005);
                if (this.field5000.field1798 != this.field4999) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5000 = null;
                if (this.field4993.method1397(arg0 ^ 0x34A3)) {
                    this.field5010 = null;
                } else {
                    this.field5010 = this.field4993.method1398(true, -27, 255, this.field5001, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5000 = new class132(var2, this.field5005);
            } catch (RuntimeException var4) {
                this.field4993.method1395(-10887);
                this.field5000 = null;
                if (this.field4993.method1397(27573)) {
                    this.field5010 = null;
                } else {
                    this.field5010 = this.field4993.method1398(true, -122, 255, this.field5001, (byte) 0);
                }
                return null;
            }
            if (this.field4989 != null) {
                this.field5004.method2271(this.field4989, this.field5001, -74, var2);
            }
        }
        this.field5010 = null;
        if (this.field5006 != null) {
            this.field5018 = 0;
            this.field5013 = new byte[this.field5000.field1796];
        }
        return this.field5000;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
    public final int method2150(boolean arg0) {
        field5009++;
        if (this.method2060(24342) == null) {
            return this.field5010 == null ? 0 : this.field5010.method540(-71);
        } else {
            if (arg0) {
                this.field5006 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)[B")
    public final byte[] method2061(int arg0, int arg1) {
        field4996++;
        class275 var3 = this.method2158(arg0, 65535, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method539(58);
            var3.method3149(arg1 ^ 0x62);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
    public final void method2057(int arg0, int arg1) {
        field4991++;
        if (this.field5006 == null) {
            return;
        }
        for (class529 var3 = this.field5025.method2123(-114); var3 != null; var3 = this.field5025.method2126((byte) 61)) {
            if (((long) arg0) == var3.field7780) {
                return;
            }
        }
        if (arg1 >= -12) {
            this.method2159((byte) -7);
        }
        class529 var4 = new class529();
        var4.field7780 = arg0;
        this.field5025.method2124(var4, (byte) 109);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)I")
    public final int method2151(int arg0) {
        field4994++;
        if (this.field5000 == null) {
            return 0;
        } else if (this.field5021) {
            if (arg0 != 0) {
                this.field5000 = null;
            }
            class529 var2 = this.field5029.method2123(-105);
            return var2 == null ? 0 : (int) var2.field7780;
        } else {
            return this.field5000.field1787;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lgi;B)Lgi;")
    public static final class437 method2152(class437 arg0, byte arg1) {
        field4998++;
        if (arg1 >= -99) {
            return null;
        }
        class437 var2 = client.method500(arg0);
        if (var2 == null) {
            var2 = arg0.field6637;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
    public static void method2153(int arg0) {
        field5031 = null;
        field5027 = null;
        field5024 = null;
        field5028 = null;
        field5019 = null;
        field5026 = null;
        if (arg0 != -1) {
            method2152(null, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
    public final void method2154(byte arg0) {
        field5012++;
        int var2 = 29 / ((arg0 + 24) / 33);
        if (this.field5029 != null) {
            if (this.method2060(24342) == null) {
                return;
            }
            if (this.field5021) {
                boolean var3 = true;
                for (class529 var4 = this.field5029.method2123(95); var4 != null; var4 = this.field5029.method2126((byte) 61)) {
                    int var6 = (int) var4.field7780;
                    if (this.field5013[var6] == 0) {
                        this.method2158(var6, 65535, 1);
                    }
                    if (this.field5013[var6] == 0) {
                        var3 = false;
                    } else {
                        var4.method3149(84);
                    }
                }
                while (this.field5000.field1792.length > this.field5020) {
                    if (this.field5000.field1792[this.field5020] == 0) {
                        this.field5020++;
                    } else {
                        if (this.field5004.field5341 >= 250) {
                            var3 = false;
                            break;
                        }
                        if (this.field5013[this.field5020] == 0) {
                            this.method2158(this.field5020, 65535, 1);
                        }
                        if (this.field5013[this.field5020] == 0) {
                            class529 var5 = new class529();
                            var5.field7780 = this.field5020;
                            this.field5029.method2124(var5, (byte) -107);
                            var3 = false;
                        }
                        this.field5020++;
                    }
                }
                if (var3) {
                    this.field5020 = 0;
                    this.field5021 = false;
                }
            } else if (this.field5022) {
                boolean var7 = true;
                for (class529 var8 = this.field5029.method2123(-106); var8 != null; var8 = this.field5029.method2126((byte) 61)) {
                    int var10 = (int) var8.field7780;
                    if (this.field5013[var10] != 1) {
                        this.method2158(var10, 65535, 2);
                    }
                    if (this.field5013[var10] == 1) {
                        var8.method3149(123);
                    } else {
                        var7 = false;
                    }
                }
                while (this.field5000.field1792.length > this.field5020) {
                    if (this.field5000.field1792[this.field5020] == 0) {
                        this.field5020++;
                    } else {
                        if (this.field4993.method1396(20)) {
                            var7 = false;
                            break;
                        }
                        if (this.field5013[this.field5020] != 1) {
                            this.method2158(this.field5020, 65535, 2);
                        }
                        if (this.field5013[this.field5020] != 1) {
                            class529 var9 = new class529();
                            var9.field7780 = this.field5020;
                            this.field5029.method2124(var9, (byte) -59);
                            var7 = false;
                        }
                        this.field5020++;
                    }
                }
                if (var7) {
                    this.field5022 = false;
                    this.field5020 = 0;
                }
            } else {
                this.field5029 = null;
            }
        }
        if (!this.field5033 || this.field5032 > class246.method1705((byte) 28)) {
            return;
        }
        for (class275 var11 = (class275) this.field5007.method1119(false); var11 != null; var11 = (class275) this.field5007.method1121((byte) 33)) {
            if (!var11.field4368) {
                if (var11.field4370) {
                    if (!var11.field4369) {
                        throw new RuntimeException();
                    }
                    var11.method3149(78);
                } else {
                    var11.field4370 = true;
                }
            }
        }
        this.field5032 = class246.method1705((byte) 28) + 1000L;
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V")
    public final void method2155(int arg0) {
        field4990++;
        if (arg0 != 2) {
            this.field5001 = -6;
        }
        if (this.field5006 != null) {
            this.field5022 = true;
            if (this.field5029 == null) {
                this.field5029 = new class317();
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)I")
    public final int method2156(int arg0) {
        field5011++;
        if (arg0 != 757) {
            this.method2061(104, 9);
        }
        return this.field5018;
    }

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "(I)I")
    public final int method2157(int arg0) {
        field5014++;
        if (this.field5000 == null) {
            return 0;
        } else {
            int var2 = 12 / ((arg0 + 53) / 32);
            return this.field5000.field1787;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Lvb;")
    private final class275 method2158(int arg0, int arg1, int arg2) {
        field4992++;
        class275 var4 = (class275) this.field5007.method1122((byte) 59, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field4369 && var4.field4368) {
            var4.method3149(arg1 ^ 0xFF9C);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5006 == null || this.field5013[arg0] == -1) {
                    if (this.field4993.method1397(27573)) {
                        return null;
                    }
                    var4 = this.field4993.method1398(true, -102, this.field5001, arg0, (byte) 2);
                } else {
                    var4 = this.field5004.method2267(arg0, (byte) 107, this.field5006);
                }
            } else if (arg2 == 1) {
                if (this.field5006 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5004.method2272((byte) 111, arg0, this.field5006);
            } else if (arg2 == 2) {
                if (this.field5006 == null) {
                    throw new RuntimeException();
                }
                if (this.field5013[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4993.method1396(20)) {
                    return null;
                }
                var4 = this.field4993.method1398(false, -117, this.field5001, arg0, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field5007.method1127(var4, (byte) 93, (long) arg0);
        }
        if (var4.field4368) {
            return null;
        }
        byte[] var5 = var4.method539(112);
        if (arg1 != 65535) {
            return null;
        } else if (var4 instanceof class74) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class244.field3961.reset();
                class244.field3961.update(var5, 0, var5.length - 2);
                int var6 = (int) class244.field3961.getValue();
                if (this.field5000.field1793[arg0] != var6) {
                    throw new RuntimeException();
                }
                int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field5000.field1785[arg0] & 0xFFFF) != var7) {
                    throw new RuntimeException();
                }
                if (this.field5013[arg0] != 1) {
                    this.field5018++;
                    this.field5013[arg0] = 1;
                }
                if (!var4.field4369) {
                    var4.method3149(arg1 ^ 0xFF8A);
                }
                return var4;
            } catch (Exception var11) {
                this.field5013[arg0] = -1;
                var4.method3149(111);
                if (var4.field4369 && !this.field4993.method1397(27573)) {
                    class87 var8 = this.field4993.method1398(true, -128, this.field5001, arg0, (byte) 2);
                    this.field5007.method1127(var8, (byte) 64, (long) arg0);
                }
                return null;
            }
        } else {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class244.field3961.reset();
                class244.field3961.update(var5, 0, var5.length - 2);
                int var9 = (int) class244.field3961.getValue();
                if (this.field5000.field1793[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field4993.field3132 = 0;
                this.field4993.field3130 = 0;
            } catch (RuntimeException var12) {
                this.field4993.method1395(-10887);
                var4.method3149(arg1 - 65458);
                if (var4.field4369 && !this.field4993.method1397(arg1 - 37962)) {
                    class87 var10 = this.field4993.method1398(true, arg1 - 65552, this.field5001, arg0, (byte) 2);
                    this.field5007.method1127(var10, (byte) 77, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5000.field1785[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field5000.field1785[arg0];
            if (this.field5006 != null) {
                this.field5004.method2271(this.field5006, arg0, -114, var5);
                if (this.field5013[arg0] != 1) {
                    this.field5018++;
                    this.field5013[arg0] = 1;
                }
            }
            if (!var4.field4369) {
                var4.method3149(arg1 - 65413);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)V")
    public final void method2159(byte arg0) {
        field4995++;
        if (this.field5029 == null || this.method2060(24342) == null) {
            return;
        }
        for (class529 var2 = this.field5025.method2123(76); var2 != null; var2 = this.field5025.method2126((byte) 61)) {
            int var4 = (int) var2.field7780;
            if (var4 < 0 || this.field5000.field1796 <= var4 || this.field5000.field1792[var4] == 0) {
                var2.method3149(116);
            } else {
                if (this.field5013[var4] == 0) {
                    this.method2158(var4, 65535, 1);
                }
                if (this.field5013[var4] == -1) {
                    this.method2158(var4, 65535, 2);
                }
                if (this.field5013[var4] == 1) {
                    var2.method3149(65);
                }
            }
        }
        int var3 = -34 / ((44 - arg0) / 57);
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(II)I")
    public final int method2064(int arg0, int arg1) {
        field4997++;
        if (arg0 < 49) {
            return 73;
        } else {
            class275 var3 = (class275) this.field5007.method1122((byte) 59, (long) arg1);
            return var3 == null ? 0 : var3.method540(-54);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZII)V")
    public static final void method2160(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field5026 = null;
        }
        int var4 = class141.field1911.field6112 * arg3 >> 8;
        field5017++;
        if (arg0 == -1 && !class5.field55) {
            class355.method2340(true);
        } else if (arg0 != -1 && (class236.field3874 != arg0 || !class285.method1928((byte) 113)) && var4 != 0 && !class5.field55) {
            class204.method1403(1, false, arg2, 0, var4, class305.field4799, arg0);
        }
        class236.field3874 = arg0;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILbh;Lbh;Lun;Ldp;IIZ)V")
    public class322(int arg0, class307 arg1, class307 arg2, class204 arg3, class342 arg4, int arg5, int arg6, boolean arg7) {
        this.field5001 = arg0;
        this.field5006 = arg1;
        if (this.field5006 == null) {
            this.field5021 = false;
        } else {
            this.field5021 = true;
            this.field5029 = new class317();
        }
        this.field5004 = arg4;
        this.field5033 = arg7;
        this.field5005 = arg5;
        this.field4989 = arg2;
        this.field4993 = arg3;
        this.field4999 = arg6;
        if (this.field4989 != null) {
            this.field5010 = this.field5004.method2267(this.field5001, (byte) 107, this.field4989);
        }
    }

    static {
        new class213("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field5019 = new class317();
        field5023 = 0;
        field5024 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
        field5026 = new class317();
        field5028 = new short[] { 6798, 8741, 25238, 4626, 4550 };
        field5030 = -1L;
        field5031 = null;
    }
}
