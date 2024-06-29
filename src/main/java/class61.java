import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class61 extends class146 {

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    private int field1006 = 0;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "Ldb;")
    private class39 field1011 = new class39(16);

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    private int field1025 = 0;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lpj;")
    private class284 field1021 = new class284();

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "J")
    private long field1027 = 0L;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lrg;")
    private class222 field994;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Z")
    private boolean field1020;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lpj;")
    private class284 field1023;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Z")
    private boolean field1026;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lrg;")
    private class222 field1018;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Lol;")
    private class164 field1017;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lbj;")
    private class173 field1010;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Lmd;")
    private class107 field1014;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "[I")
    public static int[] field1002 = new int[256];

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lhl;")
    public static class139 field989 = new class139(64);

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "[J")
    public static long[] field1028 = new long[32];

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lch;")
    private class97 field995;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "Z")
    private boolean field1022;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[B")
    private byte[] field1003;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lch;")
    public final class97 method494(byte arg0) {
        field999++;
        if (this.field995 != null) {
            return this.field995;
        } else if (arg0 == 0) {
            if (this.field1014 == null) {
                if (this.field1017.method1113(-30921)) {
                    return null;
                }
                this.field1014 = this.field1017.method1115(-64, this.field1013, (byte) 0, true, 255);
            }
            if (this.field1014.field1572) {
                return null;
            }
            byte[] var2 = this.field1014.method669(120);
            if (this.field1014 instanceof class88) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field995 = new class97(var2, this.field993);
                    if (this.field995.field1435 != this.field997) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field995 = null;
                    if (this.field1017.method1113(-30921)) {
                        this.field1014 = null;
                    } else {
                        this.field1014 = this.field1017.method1115(-127, this.field1013, (byte) 0, true, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field995 = new class97(var2, this.field993);
                } catch (RuntimeException var4) {
                    this.field1017.method1111(92);
                    this.field995 = null;
                    if (this.field1017.method1113(-30921)) {
                        this.field1014 = null;
                    } else {
                        this.field1014 = this.field1017.method1115(-117, this.field1013, (byte) 0, true, 255);
                    }
                    return null;
                }
                if (this.field1018 != null) {
                    this.field1010.method1153(this.field1013, -119, this.field1018, var2);
                }
            }
            this.field1014 = null;
            if (this.field994 != null) {
                this.field1003 = new byte[this.field995.field1429];
                this.field1006 = 0;
            }
            return this.field995;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)I")
    public final int method495(int arg0, boolean arg1) {
        field1019++;
        class107 var3 = (class107) this.field1011.method306((long) arg0, 16216);
        if (arg1) {
            this.method501((byte) 33);
        }
        return var3 == null ? 0 : var3.method667(100);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[B")
    public final byte[] method496(int arg0, int arg1) {
        field996++;
        class107 var3 = this.method500(arg0, 4527, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method669(123);
            var3.method1193(arg1 ^ 0x71);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I")
    public final int method497(int arg0) {
        field1015++;
        if (arg0 != 0) {
            this.field997 = 64;
        }
        if (this.method494((byte) 0) == null) {
            return this.field1014 == null ? 0 : this.field1014.method667(arg0 ^ 0x64);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method498(int arg0) {
        field1004++;
        if ((class78.field1243 < class44.field777)) {
            class78.field1243 = (float) ((double) class78.field1243 / 30.0D + (double) class78.field1243);
            if (class44.field777 < class78.field1243) {
                class78.field1243 = class44.field777;
            }
            class160.method1083(30661);
        } else if (class44.field777 < class78.field1243) {
            class78.field1243 = (float) ((double) class78.field1243 - (double) class78.field1243 / 30.0D);
            if (class78.field1243 < class44.field777) {
                class78.field1243 = class44.field777;
            }
            class160.method1083(30661);
        }
        if (~class66.field1087 == arg0 || class244.field3784 == -1) {
            return;
        }
        int var1 = class66.field1087 - class220.field3433;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class220.field3433 += var1;
        int var2 = class244.field3784 - class12.field171;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class12.field171 -= -var2;
        if (var1 == 0 && var2 == 0) {
            class66.field1087 = -1;
            class244.field3784 = -1;
        }
        class160.method1083(30661);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)I")
    public final int method499(int arg0) {
        field1012++;
        if (arg0 > -80) {
            this.field1021 = null;
        }
        return this.field995 == null ? 0 : this.field995.field1444;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Lmd;")
    private final class107 method500(int arg0, int arg1, int arg2) {
        class107 var4 = (class107) this.field1011.method306((long) arg0, 16216);
        field991++;
        if (var4 != null && arg2 == 0 && !var4.field1578 && var4.field1572) {
            var4.method1193(117);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field994 == null || this.field1003[arg0] == -1) {
                    if (this.field1017.method1113(-30921)) {
                        return null;
                    }
                    var4 = this.field1017.method1115(-120, arg0, (byte) 2, true, this.field1013);
                } else {
                    var4 = this.field1010.method1152(arg0, this.field994, -19177);
                }
            } else if (arg2 == 1) {
                if (this.field994 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1010.method1150(true, this.field994, arg0);
            } else if (arg2 == 2) {
                if (this.field994 == null) {
                    throw new RuntimeException();
                }
                if (this.field1003[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1017.method1118((byte) -102)) {
                    return null;
                }
                var4 = this.field1017.method1115(-105, arg0, (byte) 2, false, this.field1013);
            } else {
                throw new RuntimeException();
            }
            this.field1011.method309((byte) -8, var4, (long) arg0);
        }
        if (var4.field1572) {
            return null;
        }
        if (arg1 != 4527) {
            field1024 = -111;
        }
        byte[] var5 = var4.method669(116);
        if (!var4 instanceof class88) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class157.field2299.reset();
                class157.field2299.update(var5, 0, var5.length - 2);
                int var9 = (int) class157.field2299.getValue();
                if (this.field995.field1434[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field1017.field2416 = 0;
                this.field1017.field2415 = 0;
            } catch (RuntimeException var12) {
                this.field1017.method1111(122);
                var4.method1193(122);
                if (var4.field1578 && !this.field1017.method1113(-30921)) {
                    class172 var10 = this.field1017.method1115(-91, arg0, (byte) 2, true, this.field1013);
                    this.field1011.method309((byte) -8, var10, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field995.field1436[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field995.field1436[arg0];
            if (this.field994 != null) {
                this.field1010.method1153(arg0, arg1 ^ 0x11E3, this.field994, var5);
                if (this.field1003[arg0] != 1) {
                    this.field1006++;
                    this.field1003[arg0] = 1;
                }
            }
            if (!var4.field1578) {
                var4.method1193(arg1 - 4402);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class157.field2299.reset();
            class157.field2299.update(var5, 0, var5.length - 2);
            int var6 = (int) class157.field2299.getValue();
            if (this.field995.field1434[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field995.field1436[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field1003[arg0] != 1) {
                this.field1006++;
                this.field1003[arg0] = 1;
            }
            if (!var4.field1578) {
                var4.method1193(125);
            }
            return var4;
        } catch (Exception var11) {
            this.field1003[arg0] = -1;
            var4.method1193(122);
            if (var4.field1578 && !this.field1017.method1113(-30921)) {
                class172 var8 = this.field1017.method1115(-88, arg0, (byte) 2, true, this.field1013);
                this.field1011.method309((byte) -8, var8, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)I")
    public final int method501(byte arg0) {
        field1000++;
        if (arg0 != 11) {
            method506(16);
        }
        return this.field1006;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)I")
    public final int method502(int arg0) {
        int var2 = -61 / ((arg0 - 63) / 39);
        field1008++;
        if (this.field995 == null) {
            return 0;
        } else if (this.field1020) {
            class181 var3 = this.field1023.method1894((byte) -90);
            return var3 == null ? 0 : (int) var3.field2628;
        } else {
            return this.field995.field1444;
        }
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public final void method503(int arg0) {
        field1009++;
        if (this.field1023 == null || arg0 != 383 || this.method494((byte) 0) == null) {
            return;
        }
        for (class181 var2 = this.field1021.method1894((byte) -90); var2 != null; var2 = this.field1021.method1886(-58)) {
            int var3 = (int) var2.field2628;
            if (var3 < 0 || var3 >= this.field995.field1429 || this.field995.field1431[var3] == 0) {
                var2.method1193(124);
            } else {
                if (this.field1003[var3] == 0) {
                    this.method500(var3, arg0 + 4144, 1);
                }
                if (this.field1003[var3] == -1) {
                    this.method500(var3, 4527, 2);
                }
                if (this.field1003[var3] == 1) {
                    var2.method1193(125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class19.field339 = arg1;
        field992++;
        class139.field2006 = arg3;
        class210.field3135 = arg5;
        if (arg4 >= -24) {
            return;
        }
        class123.field1821 = arg0;
        class127.field1866 = arg2;
        if (class127.field1866 >= 100) {
            int var6 = class210.field3135 * 128 + 64;
            int var7 = class139.field2006 * 128 + 64;
            int var8 = class268.method1810(class260.field3986, var6, (byte) 118, var7) - class19.field339;
            int var9 = var6 - class90.field1377;
            int var10 = var7 - class209.field3127;
            int var11 = var8 - class157.field2292;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class254.field3919 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class205.field3074 = (int) (Math.atan2((double) var9, (double) var10) * -325.949D) & 0x7FF;
            if (class254.field3919 < 128) {
                class254.field3919 = 128;
            }
            if (class254.field3919 > 383) {
                class254.field3919 = 383;
            }
        }
        class133.field1954 = 2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    public final void method505(int arg0, byte arg1) {
        field998++;
        if (this.field994 == null) {
            return;
        }
        for (class181 var3 = this.field1021.method1894((byte) -90); var3 != null; var3 = this.field1021.method1886(-70)) {
            if (((long) arg0) == var3.field2628) {
                return;
            }
        }
        if (arg1 != 14) {
            this.field994 = null;
        }
        class181 var4 = new class181();
        var4.field2628 = (long) arg0;
        this.field1021.method1881(var4, (byte) -56);
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public static void method506(int arg0) {
        field989 = null;
        if (arg0 != 10432) {
            method506(29);
        }
        field1028 = null;
        field1002 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)I")
    public static final int method507(int arg0, int arg1, int arg2, int arg3) {
        field1001++;
        int var4 = arg2 / arg0;
        int var5 = arg0 - 1 & arg2;
        if (arg1 < 32) {
            return -117;
        }
        int var6 = arg3 & arg0 - 1;
        int var7 = arg3 / arg0;
        int var8 = class275.method1841(var7, 34, var4);
        int var9 = class275.method1841(var7, 16, var4 + 1);
        int var10 = class275.method1841(var7 + 1, 66, var4);
        int var11 = class275.method1841(var7 + 1, 117, var4 + 1);
        int var12 = class145.method992(var5, arg0, -48, var9, var8);
        int var13 = class145.method992(var5, arg0, -52, var11, var10);
        return class145.method992(var6, arg0, -128, var13, var12);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
    public final void method508(boolean arg0) {
        field1016++;
        if (arg0) {
            this.field1006 = 123;
        }
        if (this.field1023 != null) {
            if (this.method494((byte) 0) == null) {
                return;
            }
            if (this.field1020) {
                boolean var6 = true;
                for (class181 var7 = this.field1023.method1894((byte) -90); var7 != null; var7 = this.field1023.method1886(-90)) {
                    int var9 = (int) var7.field2628;
                    if (this.field1003[var9] == 0) {
                        this.method500(var9, 4527, 1);
                    }
                    if (this.field1003[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1193(114);
                    }
                }
                while (this.field1025 < this.field995.field1431.length) {
                    if (this.field995.field1431[this.field1025] == 0) {
                        this.field1025++;
                    } else {
                        if (this.field1010.field2541 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1003[this.field1025] == 0) {
                            this.method500(this.field1025, 4527, 1);
                        }
                        if (this.field1003[this.field1025] == 0) {
                            class181 var8 = new class181();
                            var8.field2628 = (long) this.field1025;
                            this.field1023.method1881(var8, (byte) -56);
                            var6 = false;
                        }
                        this.field1025++;
                    }
                }
                if (var6) {
                    this.field1020 = false;
                    this.field1025 = 0;
                }
            } else if (this.field1022) {
                boolean var2 = true;
                for (class181 var3 = this.field1023.method1894((byte) -90); var3 != null; var3 = this.field1023.method1886(-61)) {
                    int var5 = (int) var3.field2628;
                    if (this.field1003[var5] != 1) {
                        this.method500(var5, 4527, 2);
                    }
                    if (this.field1003[var5] == 1) {
                        var3.method1193(127);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field995.field1431.length > this.field1025) {
                    if (this.field995.field1431[this.field1025] == 0) {
                        this.field1025++;
                    } else {
                        if (this.field1017.method1118((byte) -102)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1003[this.field1025] != 1) {
                            this.method500(this.field1025, 4527, 2);
                        }
                        if (this.field1003[this.field1025] != 1) {
                            var2 = false;
                            class181 var4 = new class181();
                            var4.field2628 = (long) this.field1025;
                            this.field1023.method1881(var4, (byte) -56);
                        }
                        this.field1025++;
                    }
                }
                if (var2) {
                    this.field1022 = false;
                    this.field1025 = 0;
                }
            } else {
                this.field1023 = null;
            }
        }
        if (!this.field1026 || this.field1027 > class257.method1736(14361)) {
            return;
        }
        for (class107 var10 = (class107) this.field1011.method315((byte) 118); var10 != null; var10 = (class107) this.field1011.method310(-47)) {
            if (!var10.field1572) {
                if (var10.field1577) {
                    if (!var10.field1578) {
                        throw new RuntimeException();
                    }
                    var10.method1193(115);
                } else {
                    var10.field1577 = true;
                }
            }
        }
        this.field1027 = class257.method1736(14361) + 1000L;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public final void method509(int arg0) {
        field990++;
        if (this.field994 == null) {
            return;
        }
        if (arg0 != -1760) {
            this.field1014 = null;
        }
        this.field1022 = true;
        if (this.field1023 == null) {
            this.field1023 = new class284();
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILrg;Lrg;Lol;Lbj;IIZ)V")
    public class61(int arg0, class222 arg1, class222 arg2, class164 arg3, class173 arg4, int arg5, int arg6, boolean arg7) {
        this.field994 = arg1;
        this.field1013 = arg0;
        if (this.field994 == null) {
            this.field1020 = false;
        } else {
            this.field1020 = true;
            this.field1023 = new class284();
        }
        this.field997 = arg6;
        this.field1026 = arg7;
        this.field1018 = arg2;
        this.field993 = arg5;
        this.field1017 = arg3;
        this.field1010 = arg4;
        if (this.field1018 != null) {
            this.field1014 = this.field1010.method1152(this.field1013, this.field1018, -19177);
        }
    }
}
