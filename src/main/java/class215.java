import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class215 {

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Loe;")
    private class65 field3635 = new class65();

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Loe;")
    private class65 field3638 = new class65();

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Loe;")
    private class65 field3639 = new class65();

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Loe;")
    private class65 field3640 = new class65();

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Lab;")
    private class249 field3642 = new class249(4);

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "B")
    private byte field3645 = 0;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public volatile int field3648 = 0;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public volatile int field3647 = 0;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "Lab;")
    private class249 field3646 = new class249(8);

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3627 = "yellow:";

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field3631 = 0;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lbb;")
    public static class49 field3619 = new class49();

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    private int field3641;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "J")
    private long field3644;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Lra;")
    private class122 field3649;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "Lka;")
    private class144 field3643;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "[[[Lmc;")
    public static class174[][][] field3637;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z")
    public final boolean method1520(int arg0) {
        if (arg0 != -21) {
            this.method1533(77, -31, true, (byte) 71, 78);
        }
        field3626++;
        return this.method1523(107) >= 20;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BZ)V")
    public final void method1521(byte arg0, boolean arg1) {
        if (arg0 != 4) {
            this.field3640 = null;
        }
        field3632++;
        if (this.field3643 == null) {
            return;
        }
        try {
            this.field3642.field4160 = 0;
            this.field3642.method1780(arg1 ? 2 : 3, 118);
            this.field3642.method1793((byte) -24, 0);
            this.field3643.method1066(this.field3642.field4182, -76, 4, 0);
        } catch (IOException var4) {
            try {
                this.field3643.method1070(119);
            } catch (Exception var3) {
            }
            this.field3647 = -2;
            this.field3648++;
            this.field3643 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method1522(boolean arg0) {
        if (!arg0) {
            field3619 = null;
        }
        field3627 = null;
        field3619 = null;
        field3637 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I")
    private final int method1523(int arg0) {
        field3624++;
        return arg0 < 82 ? -48 : this.field3639.method450(-120) + this.field3640.method450(-127);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public final void method1524(byte arg0) {
        if (arg0 > -1) {
            this.method1525(true, (class144) null, 119);
        }
        field3629++;
        if (this.field3643 != null) {
            this.field3643.method1067((byte) -121);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLka;I)V")
    public final void method1525(boolean arg0, class144 arg1, int arg2) {
        field3628++;
        if (this.field3643 != null) {
            try {
                this.field3643.method1070(116);
            } catch (Exception var8) {
            }
            this.field3643 = null;
        }
        this.field3643 = arg1;
        this.method1530(21056);
        this.method1521((byte) 4, arg0);
        this.field3649 = null;
        this.field3646.field4160 = 0;
        while (true) {
            class122 var4 = (class122) this.field3638.method451(-92);
            if (var4 == null) {
                if (arg2 != 2934) {
                    this.method1538(-79);
                }
                while (true) {
                    class122 var5 = (class122) this.field3640.method451(87);
                    if (var5 == null) {
                        if (this.field3645 != 0) {
                            try {
                                this.field3642.field4160 = 0;
                                this.field3642.method1780(4, arg2 ^ 0xB02);
                                this.field3642.method1780(this.field3645, arg2 ^ 0xB2E);
                                this.field3642.method1771(0, (byte) 30);
                                this.field3643.method1066(this.field3642.field4182, -83, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field3643.method1070(arg2 ^ 0xB41);
                                } catch (Exception var6) {
                                }
                                this.field3643 = null;
                                this.field3648++;
                                this.field3647 = -2;
                            }
                        }
                        this.field3641 = 0;
                        this.field3644 = class188.method1355(124);
                        return;
                    }
                    this.field3639.method449((byte) -64, var5);
                }
            }
            this.field3635.method449((byte) -64, var4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Z")
    public final boolean method1526(byte arg0) {
        if (arg0 != 16) {
            return true;
        }
        field3621++;
        if (this.field3643 != null) {
            long var2 = class188.method1355(-61);
            int var4 = (int) (var2 - this.field3644);
            this.field3644 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3641 += var4;
            if (this.field3641 > 30000) {
                try {
                    this.field3643.method1070(-112);
                } catch (Exception var27) {
                }
                this.field3643 = null;
            }
        }
        if (this.field3643 == null) {
            return this.method1535(20) == 0 && this.method1523(103) == 0;
        }
        try {
            this.field3643.method1062(arg0 ^ 0x4D);
            for (class122 var5 = (class122) this.field3635.method452(arg0 ^ 0x638); var5 != null; var5 = (class122) this.field3635.method448(631244930)) {
                this.field3642.field4160 = 0;
                this.field3642.method1780(1, arg0 + 90);
                this.field3642.method1793((byte) -24, (int) var5.field2570);
                this.field3643.method1066(this.field3642.field4182, -14, 4, 0);
                this.field3638.method449((byte) -64, var5);
            }
            for (class122 var6 = (class122) this.field3639.method452(1576); var6 != null; var6 = (class122) this.field3639.method448(631244930)) {
                this.field3642.field4160 = 0;
                this.field3642.method1780(0, arg0 + 40);
                this.field3642.method1793((byte) -24, (int) var6.field2570);
                this.field3643.method1066(this.field3642.field4182, arg0 ^ 0xFFFFFFBD, 4, 0);
                this.field3640.method449((byte) -64, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3643.method1065(-114);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3641 = 0;
                byte var9 = 0;
                if (this.field3649 == null) {
                    var9 = 8;
                } else if (this.field3649.field2035 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3649.field2038.field4182.length - this.field3649.field2039;
                    int var11 = 512 - this.field3649.field2035;
                    if ((var10 - this.field3649.field2038.field4160) < var11) {
                        var11 = var10 - this.field3649.field2038.field4160;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field3643.method1069(var11, this.field3649.field2038.field4182, this.field3649.field2038.field4160, arg0 + 6040);
                    if (this.field3645 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3649.field2038.field4182[this.field3649.field2038.field4160 + var12] = (byte) class284.method1990(this.field3649.field2038.field4182[this.field3649.field2038.field4160 + var12], this.field3645);
                        }
                    }
                    this.field3649.field2038.field4160 += var11;
                    this.field3649.field2035 += var11;
                    if (this.field3649.field2038.field4160 == var10) {
                        this.field3649.method1174(-25741);
                        this.field3649.field1114 = false;
                        this.field3649 = null;
                    } else if (this.field3649.field2035 == 512) {
                        this.field3649.field2035 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3646.field4160;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field3643.method1069(var13, this.field3646.field4182, this.field3646.field4160, arg0 ^ 0x17B8);
                    if (this.field3645 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3646.field4182[this.field3646.field4160 + var14] = (byte) class284.method1990(this.field3646.field4182[this.field3646.field4160 + var14], this.field3645);
                        }
                    }
                    this.field3646.field4160 += var13;
                    if (var9 <= this.field3646.field4160) {
                        if (this.field3649 == null) {
                            this.field3646.field4160 = 0;
                            int var15 = this.field3646.method1802((byte) 74);
                            int var16 = this.field3646.method1821((byte) 51);
                            int var17 = this.field3646.method1802((byte) 53);
                            int var18 = this.field3646.method1800(arg0 - 112);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class122 var24;
                            if (var20) {
                                for (var24 = (class122) this.field3640.method452(arg0 + 1560); var24 != null && var24.field2570 != var21; var24 = (class122) this.field3640.method448(631244930)) {
                                }
                            } else {
                                for (var24 = (class122) this.field3638.method452(arg0 ^ 0x638); var24 != null && var24.field2570 != var21; var24 = (class122) this.field3638.method448(631244930)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3649 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3649.field2038 = new class249(var18 + var25 + this.field3649.field2039);
                            this.field3649.field2038.method1780(var19, 80);
                            this.field3649.field2038.method1811(var18, (byte) 51);
                            this.field3649.field2035 = 8;
                            this.field3646.field4160 = 0;
                        } else if (this.field3649.field2035 != 0) {
                            throw new IOException();
                        } else if (this.field3646.field4182[0] == -1) {
                            this.field3646.field4160 = 0;
                            this.field3649.field2035 = 1;
                        } else {
                            this.field3649 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3643.method1070(-123);
            } catch (Exception var26) {
            }
            this.field3648++;
            this.field3647 = -2;
            this.field3643 = null;
            return this.method1535(20) == 0 && this.method1523(99) == 0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)Z")
    public final boolean method1527(int arg0) {
        field3625++;
        int var2 = -51 % ((13 - arg0) / 59);
        return this.method1535(20) >= 20;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public final void method1528(byte arg0) {
        field3622++;
        if (this.field3643 == null) {
            return;
        }
        try {
            this.field3642.field4160 = 0;
            this.field3642.method1780(7, 124);
            if (arg0 != 42) {
                this.method1533(106, -7, false, (byte) -9, 127);
            }
            this.field3642.method1793((byte) -24, 0);
            this.field3643.method1066(this.field3642.field4182, arg0 ^ 0xFFFFFFFE, 4, 0);
        } catch (IOException var3) {
            try {
                this.field3643.method1070(arg0 ^ 0x4C);
            } catch (Exception var2) {
            }
            this.field3647 = -2;
            this.field3648++;
            this.field3643 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
    public static final void method1529(int arg0, int arg1) {
        class287.field4747--;
        field3615++;
        if (class287.field4747 == arg0) {
            return;
        }
        class75.method536(class63.field1065, arg0 + 1, class63.field1065, arg0, class287.field4747 - arg0);
        class75.method536(class184.field2932, arg0 + 1, class184.field2932, arg0, class287.field4747 - arg0);
        class75.method532(class100.field1588, arg0 + arg1, class100.field1588, arg0, class287.field4747 - arg0);
        class75.method531(class195.field3154, arg0 + 1, class195.field3154, arg0, class287.field4747 - arg0);
        class75.method534(class68.field1149, arg0 + 1, class68.field1149, arg0, class287.field4747 - arg0);
        class75.method532(class197.field3204, arg0 + 1, class197.field3204, arg0, class287.field4747 - arg0);
        class75.method532(class67.field1125, arg0 + 1, class67.field1125, arg0, class287.field4747 - arg0);
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    private final void method1530(int arg0) {
        field3633++;
        if (this.field3643 == null) {
            return;
        }
        try {
            this.field3642.field4160 = 0;
            if (arg0 != 21056) {
                this.method1521((byte) 79, false);
            }
            this.field3642.method1780(6, 118);
            this.field3642.method1793((byte) -24, 3);
            this.field3643.method1066(this.field3642.field4182, -38, 4, 0);
        } catch (IOException var3) {
            try {
                this.field3643.method1070(61);
            } catch (Exception var2) {
            }
            this.field3647 = -2;
            this.field3643 = null;
            this.field3648++;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)J")
    public static final long method1531(int arg0) {
        field3618++;
        return arg0 >= -20 ? 52L : class137.field2255.method417(0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Laj;III)Lkm;")
    public static final class230 method1532(class151 arg0, int arg1, int arg2, int arg3) {
        field3623++;
        if (arg1 != 0) {
            method1529(-1, 5);
        }
        return class167.method1242(arg0, arg3, arg2, 64) ? class55.method348(-32766) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIZBI)Lra;")
    public final class122 method1533(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field3620++;
        long var6 = (long) ((arg4 << 16) + arg0);
        if (arg1 != 1220901488) {
            this.method1521((byte) -98, true);
        }
        class122 var8 = new class122();
        var8.field2039 = arg3;
        var8.field2570 = var6;
        var8.field1106 = arg2;
        if (arg2) {
            if (this.method1535(arg1 - 1220901468) >= 20) {
                throw new RuntimeException();
            }
            this.field3635.method449((byte) -64, var8);
        } else if (this.method1523(arg1 ^ 0x48C57A23) < 20) {
            this.field3639.method449((byte) -64, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V")
    public static final void method1534(byte arg0) {
        int var1 = -54 / ((13 - arg0) / 34);
        class9.field171.method97(101);
        field3617++;
        class171.field2761.method97(82);
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)I")
    public final int method1535(int arg0) {
        field3636++;
        if (arg0 != 20) {
            this.field3647 = 102;
        }
        return this.field3635.method450(arg0 - 143) + this.field3638.method450(arg0 - 146);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
    public static final void method1536(int arg0, boolean arg1) {
        if (arg0 != 28942) {
            method1536(107, false);
        }
        class271.method1912(arg1, class182.field2901, 2, class243.field4082, class155.field2567);
        field3634++;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)V")
    public final void method1537(byte arg0) {
        if (arg0 != 32) {
            this.field3646 = null;
        }
        if (this.field3643 != null) {
            this.field3643.method1070(-125);
        }
        field3616++;
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
    public final void method1538(int arg0) {
        try {
            this.field3643.method1070(arg0 ^ 0x10);
        } catch (Exception var2) {
        }
        if (arg0 != 9) {
            method1522(true);
        }
        field3630++;
        this.field3643 = null;
        this.field3647 = -1;
        this.field3645 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3648++;
    }
}
