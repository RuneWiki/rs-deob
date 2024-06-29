import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class64 extends class667 {

    @OriginalMember(owner = "client!naa", name = "wb", descriptor = "Z")
    public boolean field771 = false;

    @OriginalMember(owner = "client!naa", name = "Ab", descriptor = "Z")
    public boolean field775 = false;

    @OriginalMember(owner = "client!naa", name = "zb", descriptor = "Z")
    public boolean field774 = false;

    @OriginalMember(owner = "client!naa", name = "pb", descriptor = "Z")
    public boolean field764 = false;

    @OriginalMember(owner = "client!naa", name = "qb", descriptor = "Z")
    public boolean field765 = false;

    @OriginalMember(owner = "client!naa", name = "gb", descriptor = "Llh;")
    public static class487 field755 = new class487(5, 3);

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!naa", name = "S", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!naa", name = "fb", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!naa", name = "hb", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!naa", name = "ib", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!naa", name = "jb", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!naa", name = "kb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!naa", name = "lb", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!naa", name = "mb", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!naa", name = "nb", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!naa", name = "ob", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!naa", name = "rb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!naa", name = "sb", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!naa", name = "tb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!naa", name = "ub", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!naa", name = "vb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!naa", name = "xb", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!naa", name = "yb", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!naa", name = "Bb", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!naa", name = "Cb", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!naa", name = "Eb", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!naa", name = "Fb", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!naa", name = "Db", descriptor = "[I")
    public static int[] field778;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)I", line = 3)
    public final int method533(int arg0) {
        ++field770;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class543.field7374.field1456 && !class543.field7374.field1460) {
            if (!class105.field1466.startsWith("win")) {
                var3 = true;
            } else {
                var4 = true;
                var3 = true;
                if (!class105.field1455.startsWith("amd64") && !class105.field1455.startsWith("x86_64")) {
                    var2 = true;
                }
            }
        }
        if (this.field775) {
            var4 = false;
        }
        if (this.field774) {
            var3 = false;
        }
        if (this.field765) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method535((byte) 117);
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class659.method3699(1000, 500, 2);
                } catch (Exception var17) {
                }
            }
            int var7 = -16 / ((arg0 - 62) / 37);
            int var8 = -1;
            if (var4) {
                try {
                    var8 = class659.method3699(1000, 500, 3);
                    if (~class503.field6917 == -4) {
                        class134 var9 = class334.field4506.method151();
                        long var10 = var9.field1909 & 281474976710655L;
                        int var12 = var9.field1906;
                        if (~var12 != -4319) {
                            if (~var12 == -4099) {
                                var3 &= var10 >= 60129613779L;
                            }
                        } else {
                            var3 &= ~var10 <= -64425238955L;
                        }
                    }
                } catch (Exception var16) {
                }
            }
            if (var3) {
                try {
                    var6 = class659.method3699(1000, 500, 1);
                } catch (Exception var15) {
                }
            }
            if (~var5 == 0 && var6 == -1 && ~var8 == 0) {
                return this.method535((byte) 102);
            } else {
                int var13 = (int) ((float) var6 * 1.1F);
                int var14 = (int) ((float) var8 * 1.1F);
                if (var14 < var5 && var5 > var13) {
                    return this.method542((byte) -69, var5);
                } else {
                    return ~var13 > ~var14 ? this.method546(3, var14, 26744) : this.method546(1, var13, 26744);
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)I", line = 175)
    public final int method534(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field771 = false;
        }
        ++field763;
        if (class300.method1817(arg1, true) && !class182.method1254(class285.field3921, arg0 ^ -20104)) {
            return ~class651.field9037 > -97 && class539.method3047(arg1, true) && ~super.field9341 == -1 ? 1 : super.field9341;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)I", line = 196)
    private final int method535(byte arg0) {
        int var2 = 5 % ((arg0 - 45) / 38);
        ++field753;
        byte var3;
        if (~class651.field9037 > -97) {
            var3 = 1;
            this.method551(true, (byte) 20);
        } else {
            int var4 = class563.method3153(3439);
            if (var4 > 100) {
                if (var4 > 500) {
                    if (~var4 < -1001) {
                        var3 = 1;
                        this.method551(true, (byte) 20);
                    } else {
                        var3 = 2;
                        this.method538(0);
                    }
                } else {
                    var3 = 3;
                    this.method536(-24170);
                }
            } else {
                this.method552((byte) -52);
                var3 = 4;
            }
        }
        if (~class503.field6917 != -1) {
            super.field9372 = 0;
            class203.method1327((byte) 63, 0);
        }
        this.method543(class543.field7374, (byte) 123);
        return var3;
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)V", line = 260)
    public final void method536(int arg0) {
        ++field759;
        this.method544(-114, true);
        super.field9375 = true;
        super.field9371 = true;
        super.field9365 = true;
        super.field9366 = true;
        super.field9369 = super.field9358 = 1;
        super.field9337 = false;
        super.field9360 = 1;
        super.field9351 = true;
        super.field9353 = false;
        super.field9348 = true;
        super.field9373 = true;
        super.field9344 = true;
        super.field9339 = true;
        super.field9377 = super.field9347 = 0;
        if (class651.field9037 > 95) {
            class562.method3143(1, arg0 ^ -31055);
        } else {
            class562.method3143(0, 10023);
        }
        super.field9356 = true;
        super.field9368 = 0;
        super.field9340 = false;
        this.method539(2);
        this.method550(1, -102);
        super.field9363 = 3;
        if (arg0 != -24170) {
            this.field764 = true;
        }
        class628.method3511((byte) -108);
        class127.method906(4096);
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Z", line = 301)
    public final boolean method537(int arg0, int arg1) {
        ++field773;
        return arg0 == arg1 && !this.field764 ? super.field9376 : true;
    }

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "(I)V", line = 313)
    public final void method538(int arg0) {
        this.method544(arg0 + -98, true);
        ++field756;
        super.field9351 = false;
        super.field9365 = false;
        super.field9353 = false;
        super.field9337 = false;
        super.field9348 = false;
        super.field9339 = false;
        super.field9369 = super.field9358 = 0;
        super.field9344 = false;
        super.field9360 = arg0;
        super.field9375 = false;
        super.field9377 = super.field9347 = 0;
        super.field9371 = false;
        super.field9373 = true;
        super.field9366 = false;
        class562.method3143(0, 10023);
        super.field9356 = true;
        super.field9368 = 0;
        super.field9340 = false;
        this.method539(2);
        this.method550(2, -110);
        super.field9363 = 2;
        class628.method3511((byte) -108);
        class127.method906(4096);
    }

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)V", line = 349)
    private final void method539(int arg0) {
        if (arg0 == 2) {
            ++field758;
            if (~class463.field6380 < -2) {
                super.field9380 = 4;
            } else {
                super.field9380 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(IB)Z", line = 380)
    public final boolean method540(int arg0, byte arg1) {
        if (arg1 >= -74) {
            field755 = null;
        }
        ++field779;
        return arg0 != 0 ? true : super.field9376;
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(II)I", line = 395)
    public final int method541(int arg0, int arg1) {
        ++field760;
        if (this.field771) {
            return 0;
        } else if (!this.method537(arg0, arg1 ^ arg1)) {
            return 1;
        } else {
            return !super.field9365 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)I", line = 411)
    private final int method542(byte arg0, int arg1) {
        if (arg0 != -69) {
            this.method536(14);
        }
        ++field776;
        byte var3;
        if (~arg1 >= -12001) {
            if (~arg1 < -5001) {
                this.method536(arg0 + -24101);
                var3 = 3;
            } else if (~arg1 >= -2001) {
                this.method551(true, (byte) 20);
                var3 = 1;
            } else {
                this.method538(0);
                var3 = 2;
            }
        } else {
            var3 = 4;
            this.method552((byte) -65);
        }
        if (class503.field6917 != 2) {
            super.field9372 = 2;
            class203.method1327((byte) 63, 2);
        }
        this.method543(class543.field7374, (byte) 92);
        return var3;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Llaa;B)V", line = 457)
    public final void method543(class105 arg0, byte arg1) {
        ++field757;
        if (arg1 >= 30) {
            class181 var3 = null;
            try {
                class70 var4 = arg0.method763(true, (byte) 127, "");
                while (~var4.field948 == -1) {
                    class519.method2960(-57, 1L);
                }
                if (~var4.field948 == -2) {
                    var3 = (class181) var4.field946;
                    class501 var5 = new class501(class159.method1126(103));
                    this.method3768((byte) 75, var5);
                    var3.method1242(-94, var5.field6855, var5.field6892, 0);
                }
            } catch (Exception var7) {
            }
            try {
                if (var3 != null) {
                    var3.method1248(0);
                }
            } catch (Exception var6) {
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(IZ)V", line = 498)
    public final void method544(int arg0, boolean arg1) {
        if (arg0 < -76) {
            super.field9376 = arg1;
            ++field754;
            if (class475.field6543 != null) {
                class475.field6543.method2683(50, !this.method537(class503.field6917, 0));
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V", line = 513)
    public static final void method545(byte arg0) {
        ++field766;
        if (arg0 == 93) {
            if (class543.field7374.field1456 && class696.field9895.field2475 != -1) {
                class587.method3337(class696.field9895.field2472, arg0 ^ 49933, class696.field9895.field2475);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)I", line = 528)
    private final int method546(int arg0, int arg1, int arg2) {
        if (arg2 != 26744) {
            return -103;
        } else {
            ++field769;
            byte var4;
            if (arg1 > 20000) {
                var4 = 4;
                this.method552((byte) -127);
            } else if (~arg1 < -10001) {
                this.method536(-24170);
                var4 = 3;
            } else if (~arg1 < -5001) {
                this.method538(arg2 ^ 26744);
                var4 = 2;
            } else {
                var4 = 1;
                this.method551(true, (byte) 20);
            }
            if (~class503.field6917 != ~arg0) {
                super.field9372 = arg0;
                class203.method1327((byte) 63, arg0);
            }
            this.method543(class543.field7374, (byte) 47);
            return var4;
        }
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(B)V", line = 576)
    public static final void method547(byte arg0) {
        if (arg0 != -1) {
            field755 = null;
        }
        class558.field7522 = null;
        ++field767;
    }

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "(B)V", line = 588)
    public static void method548(byte arg0) {
        if (arg0 < 79) {
            field755 = null;
        }
        field755 = null;
        field778 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lac;I)V", line = 603)
    private final void method549(class501 arg0, int arg1) {
        ++field762;
        if (~(arg0.field6855.length + -arg0.field6892) <= -2) {
            int var3 = arg0.method2874((byte) -75);
            if (~var3 <= -1 && ~var3 >= -23) {
                byte var4;
                if (~var3 == -23) {
                    var4 = 45;
                } else if (~var3 != -22) {
                    if (var3 == 20) {
                        var4 = 43;
                    } else if (~var3 == -20) {
                        var4 = 42;
                    } else if (var3 == 18) {
                        var4 = 41;
                    } else if (var3 == 17) {
                        var4 = 40;
                    } else if (var3 != 16) {
                        if (var3 != 15) {
                            if (var3 == 14) {
                                var4 = 36;
                            } else if (~var3 != -14) {
                                if (var3 == 12) {
                                    var4 = 34;
                                } else if (var3 == 11) {
                                    var4 = 33;
                                } else if (~var3 != -11) {
                                    if (~var3 == -10) {
                                        var4 = 31;
                                    } else if (~var3 == -9) {
                                        var4 = 30;
                                    } else if (var3 == 7) {
                                        var4 = 29;
                                    } else if (~var3 == -7) {
                                        var4 = 28;
                                    } else if (var3 == 5) {
                                        var4 = 28;
                                    } else if (~var3 != -5) {
                                        if (var3 == 3) {
                                            var4 = 23;
                                        } else if (~var3 == -3) {
                                            var4 = 22;
                                        } else if (var3 != 1) {
                                            var4 = 19;
                                        } else {
                                            var4 = 23;
                                        }
                                    } else {
                                        var4 = 24;
                                    }
                                } else {
                                    var4 = 32;
                                }
                            } else {
                                var4 = 35;
                            }
                        } else {
                            var4 = 37;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 44;
                }
                if (arg0.field6855.length + -arg0.field6892 >= var4) {
                    super.field9345 = arg0.method2874((byte) -75);
                    if (~super.field9345 > -2) {
                        super.field9345 = 1;
                    } else if (~super.field9345 < -5) {
                        super.field9345 = 4;
                    }
                    this.method544(-101, arg0.method2874((byte) -75) == 1);
                    super.field9365 = arg0.method2874((byte) -75) == 1;
                    super.field9373 = arg0.method2874((byte) -75) == 1;
                    super.field9371 = ~arg0.method2874((byte) -75) == -2;
                    super.field9360 = ~arg0.method2874((byte) -75) != -2 ? 0 : 1;
                    super.field9375 = arg0.method2874((byte) -75) == 1;
                    super.field9366 = arg0.method2874((byte) -75) == 1;
                    super.field9351 = arg0.method2874((byte) -75) == 1;
                    super.field9369 = arg0.method2874((byte) -75);
                    if (~super.field9369 < -3) {
                        super.field9369 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field9358 = arg0.method2874((byte) -75);
                    }
                    if (var3 >= 2) {
                        super.field9339 = arg0.method2874((byte) -75) == 1;
                        if (var3 >= 17) {
                            super.field9337 = ~arg0.method2874((byte) -75) == -2;
                        }
                    } else {
                        super.field9339 = arg0.method2874((byte) -75) == 1;
                        arg0.method2874((byte) -75);
                    }
                    super.field9353 = ~arg0.method2874((byte) -75) == -2;
                    super.field9348 = ~arg0.method2874((byte) -75) == -2;
                    super.field9377 = arg0.method2874((byte) -75);
                    if (super.field9377 > 2) {
                        super.field9377 = 2;
                    }
                    super.field9347 = super.field9377;
                    super.field9354 = arg0.method2874((byte) -75) == 1;
                    super.field9346 = arg0.method2874((byte) -75);
                    if (~super.field9346 < -128) {
                        super.field9346 = 127;
                    }
                    if (var3 >= 20) {
                        super.field9381 = arg0.method2874((byte) -75);
                        if (~super.field9381 < -128) {
                            super.field9381 = 127;
                        }
                    } else {
                        super.field9381 = super.field9346;
                    }
                    super.field9352 = arg0.method2874((byte) -75);
                    super.field9364 = arg0.method2874((byte) -75);
                    if (~super.field9364 < -128) {
                        super.field9364 = 127;
                    }
                    if (var3 < 21) {
                        super.field9359 = super.field9352;
                    } else {
                        super.field9359 = arg0.method2874((byte) -75);
                        if (~super.field9359 < -128) {
                            super.field9359 = 127;
                        }
                    }
                    if (~var3 <= -2) {
                        super.field9355 = arg0.method2845(-1);
                        super.field9374 = arg0.method2845(-1);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method2874((byte) -75);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method2874((byte) -75);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class651.field9037 > -97) {
                            var5 = 0;
                        }
                        class562.method3143(var5, 10023);
                    }
                    if (~var3 <= -6) {
                        super.field9361 = arg0.method2840(false);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field9370 = var6 = arg0.method2874((byte) -75);
                    }
                    if (super.field9370 != 1 && super.field9370 != 2) {
                        super.field9370 = 2;
                    }
                    if (arg1 == 8966) {
                        if (var3 >= 7) {
                            super.field9362 = ~arg0.method2874((byte) -75) == -2;
                        }
                        if (var3 >= 8) {
                            super.field9367 = ~arg0.method2874((byte) -75) == -2;
                        }
                        if (var3 >= 9) {
                            super.field9368 = arg0.method2874((byte) -75);
                        }
                        if (~super.field9368 > -1 || super.field9368 > class27.method262(-97, class651.field9037)) {
                            super.field9368 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field9340 = arg0.method2874((byte) -75) != 0;
                        }
                        if (~var3 <= -12) {
                            super.field9357 = ~arg0.method2874((byte) -75) != -1;
                        }
                        if (~var3 <= -13) {
                            super.field9360 = arg0.method2874((byte) -75);
                        }
                        if (super.field9360 < 0 || ~super.field9360 < -3) {
                            super.field9360 = 1;
                        }
                        if (var3 >= 13) {
                            super.field9356 = arg0.method2874((byte) -75) == 1;
                        }
                        if (var3 >= 14) {
                            super.field9372 = arg0.method2874((byte) -75);
                        } else if (var6 != 0) {
                            super.field9372 = 1;
                        } else {
                            super.field9372 = 2;
                        }
                        if (~super.field9372 > -1 || super.field9372 > 5) {
                            super.field9372 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field9380 = arg0.method2874((byte) -75);
                            if (~super.field9380 > -1 || ~super.field9380 < -5) {
                                super.field9380 = ~class463.field6380 == -2 ? 2 : 4;
                            }
                        }
                        if (~var3 <= -17) {
                            super.field9344 = arg0.method2874((byte) -75) == 1;
                            try {
                                if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                    super.field9344 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (var3 < 17 && super.field9372 == 0) {
                            super.field9372 = 2;
                        }
                        if (var3 >= 18) {
                            super.field9363 = arg0.method2874((byte) -75);
                            if (~super.field9363 > -1 || super.field9363 > 4) {
                                super.field9363 = 0;
                            }
                        }
                        if (~var3 <= -20) {
                            super.field9341 = arg0.method2874((byte) -75);
                        } else if (super.field9363 != 1 && super.field9363 != 2) {
                            if (~super.field9363 != -4) {
                                super.field9341 = 0;
                            } else {
                                super.field9341 = 1;
                            }
                        } else {
                            super.field9341 = 2;
                        }
                        if (var3 >= 22) {
                            super.field9336 = arg0.method2874((byte) -75);
                        }
                        if (~super.field9372 == -1 && class651.field9037 < 96 && ~super.field9363 != -2 && super.field9363 != 0) {
                            this.method551(false, (byte) 20);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Llaa;)V", line = 1058)
    public class64(class105 arg0) {
        super.field9345 = 3;
        super.field9363 = 3;
        this.method544(-108, true);
        super.field9369 = 2;
        super.field9354 = true;
        super.field9360 = 1;
        super.field9364 = 127;
        super.field9371 = true;
        super.field9337 = false;
        super.field9366 = true;
        super.field9352 = 127;
        super.field9339 = true;
        super.field9359 = 127;
        super.field9351 = true;
        super.field9348 = true;
        super.field9373 = true;
        super.field9353 = true;
        super.field9377 = 0;
        super.field9381 = 127;
        super.field9347 = 0;
        super.field9358 = 0;
        super.field9374 = 0;
        super.field9355 = 0;
        super.field9346 = 127;
        super.field9375 = true;
        super.field9365 = true;
        if (~class651.field9037 <= -97) {
            class562.method3143(2, 10023);
        } else {
            class562.method3143(0, 10023);
        }
        super.field9370 = 2;
        super.field9380 = ~class463.field6380 != -2 ? 4 : 2;
        super.field9368 = 0;
        super.field9356 = true;
        super.field9362 = false;
        super.field9372 = 2;
        super.field9367 = false;
        super.field9341 = 0;
        super.field9340 = false;
        super.field9357 = true;
        super.field9361 = 0;
        class181 var2 = null;
        try {
            class70 var3 = arg0.method763(true, (byte) 124, "");
            while (var3.field948 == 0) {
                class519.method2960(-35, 1L);
            }
            if (~var3.field948 == -2) {
                var2 = (class181) var3.field946;
                byte[] var4 = new byte[(int) var2.method1244(0)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1245(102, var4, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method549(new class501(var4), 8966);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1248(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "(II)V", line = 951)
    public final void method550(int arg0, int arg1) {
        super.field9341 = arg0;
        class399.field5604 = true;
        ++field772;
        int var3 = 64 / (-arg1 / 63);
        class339.field4546 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZB)V", line = 969)
    public final void method551(boolean arg0, byte arg1) {
        this.method544(-91, false);
        ++field777;
        super.field9365 = false;
        super.field9373 = !class219.field3065.equals(class454.field6305);
        super.field9369 = super.field9358 = 0;
        super.field9371 = false;
        super.field9360 = 0;
        super.field9353 = false;
        super.field9348 = false;
        super.field9339 = false;
        super.field9377 = super.field9347 = 0;
        super.field9344 = false;
        super.field9375 = false;
        super.field9366 = false;
        super.field9337 = false;
        if (arg1 == 20) {
            super.field9351 = false;
            class562.method3143(0, arg1 + 10003);
            super.field9368 = 0;
            super.field9340 = false;
            super.field9356 = false;
            this.method539(2);
            this.method550(2, -75);
            super.field9363 = 1;
            if (arg0) {
                class628.method3511((byte) -108);
            }
            class127.method906(arg1 ^ 4116);
        }
    }

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "(B)V", line = 1009)
    public final void method552(byte arg0) {
        ++field780;
        this.method544(-120, true);
        super.field9344 = true;
        super.field9377 = super.field9347 = 0;
        super.field9353 = true;
        super.field9339 = true;
        super.field9360 = 1;
        super.field9366 = true;
        super.field9371 = true;
        super.field9365 = true;
        super.field9337 = true;
        super.field9351 = true;
        super.field9369 = super.field9358 = 2;
        super.field9375 = true;
        super.field9348 = true;
        super.field9373 = true;
        if (~class651.field9037 >= -96) {
            class562.method3143(0, 10023);
        } else {
            class562.method3143(2, 10023);
        }
        super.field9356 = true;
        super.field9340 = false;
        super.field9368 = 0;
        this.method539(2);
        this.method550(0, -118);
        super.field9363 = 4;
        class628.method3511((byte) -108);
        class127.method906(4096);
        if (arg0 > -40) {
            this.field771 = false;
        }
    }
}
