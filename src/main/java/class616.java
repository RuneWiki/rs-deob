import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class616 extends class420 {

    @OriginalMember(owner = "client!ut", name = "rb", descriptor = "Z")
    public boolean field8796 = false;

    @OriginalMember(owner = "client!ut", name = "tb", descriptor = "Z")
    public boolean field8798 = false;

    @OriginalMember(owner = "client!ut", name = "Eb", descriptor = "Z")
    public boolean field8809 = false;

    @OriginalMember(owner = "client!ut", name = "xb", descriptor = "Z")
    public boolean field8802 = false;

    @OriginalMember(owner = "client!ut", name = "Ib", descriptor = "Z")
    public boolean field8813 = false;

    @OriginalMember(owner = "client!ut", name = "Db", descriptor = "Ljava/lang/String;")
    public static String field8808 = "";

    @OriginalMember(owner = "client!ut", name = "lb", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!ut", name = "mb", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!ut", name = "nb", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!ut", name = "ob", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!ut", name = "pb", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!ut", name = "qb", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!ut", name = "sb", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!ut", name = "ub", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!ut", name = "vb", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!ut", name = "wb", descriptor = "I")
    public int field8801;

    @OriginalMember(owner = "client!ut", name = "yb", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!ut", name = "zb", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!ut", name = "Ab", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!ut", name = "Bb", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!ut", name = "Cb", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!ut", name = "Fb", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!ut", name = "Gb", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!ut", name = "Hb", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!ut", name = "Jb", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!ut", name = "Kb", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!ut", name = "Lb", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 3)
    public static void method3469(int arg0) {
        if (arg0 != -7968) {
            method3485(24, 54, -92, (byte[]) null, -34, -120, (byte[]) null, -109, 7);
        }
        field8808 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V", line = 15)
    public final void method3470(byte arg0) {
        ++field8805;
        if (arg0 != -102) {
            this.method3487(-70);
        }
        this.method3474(true, 3);
        super.field5998 = 1;
        super.field5979 = true;
        super.field5978 = super.field5999 = 2;
        super.field6001 = true;
        super.field5986 = true;
        super.field5981 = true;
        super.field5994 = super.field5969 = 0;
        super.field5980 = true;
        super.field5996 = true;
        super.field5972 = true;
        super.field5982 = true;
        super.field5968 = true;
        super.field5987 = true;
        super.field5962 = true;
        if (class246.field3583 <= 95) {
            class557.method3262(12816, 0);
        } else {
            class557.method3262(12816, 2);
        }
        super.field5988 = 0;
        super.field5964 = false;
        super.field5967 = true;
        this.method3472(101);
        this.method3480((byte) 86, 0);
        super.field6002 = 4;
        class69.method566((byte) 35);
        class403.method2433(-57);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IZ)Z", line = 55)
    public final boolean method3471(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            ++field8799;
            return arg0 == 0 && !this.field8809 ? super.field5992 : true;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V", line = 71)
    private final void method3472(int arg0) {
        if (class144.field2488 <= 1) {
            super.field6006 = 2;
        } else {
            super.field6006 = 4;
        }
        ++field8816;
        if (arg0 <= 59) {
            this.method3472(-7);
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)I", line = 94)
    public final int method3473(int arg0, int arg1) {
        ++field8790;
        if (arg1 != -19799) {
            this.method3471(-62, true);
        }
        if (this.field8796) {
            return 0;
        } else if (!this.method3471(arg0, false)) {
            return 1;
        } else {
            return super.field5968 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V", line = 116)
    public final void method3474(boolean arg0, int arg1) {
        super.field5992 = arg0;
        if (arg1 != 3) {
            this.method3475(115);
        }
        ++field8811;
        if (class14.field224 != null) {
            class14.field224.method2829((byte) -120, !this.method3471(class76.field1182, false));
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)I", line = 132)
    private final int method3475(int arg0) {
        ++field8794;
        int var2 = 122 % ((-36 - arg0) / 35);
        byte var4;
        if (~class246.field3583 <= -97) {
            int var3 = class547.method3210((byte) -47);
            if (~var3 < -101) {
                if (var3 > 500) {
                    if (~var3 >= -1001) {
                        var4 = 2;
                        this.method3483(true);
                    } else {
                        this.method3486(1, true);
                        var4 = 1;
                    }
                } else {
                    var4 = 3;
                    this.method3487(-76);
                }
            } else {
                this.method3470((byte) -102);
                var4 = 4;
            }
        } else {
            var4 = 1;
            this.method3486(1, true);
        }
        if (~class76.field1182 != -1) {
            super.field6000 = 0;
            class251.method1604(32, 0);
        }
        this.method3481(true, class653.field9220);
        return var4;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([Lf;B)V", line = 193)
    public static final void method3476(class257[] arg0, byte arg1) {
        if (arg1 != 117) {
            method3485(113, 123, -44, (byte[]) null, 65, 116, (byte[]) null, 85, -88);
        }
        class8.field100 = arg0.length;
        ++field8804;
        class252.field3646 = new class257[class8.field100 - -10];
        class106.field1755 = new int[class8.field100 + 10];
        class553.method3243(arg0, 0, class252.field3646, 0, class8.field100);
        for (int var2 = 0; ~var2 > ~class8.field100; ++var2) {
            class106.field1755[var2] = class252.field3646[var2].method9();
        }
        for (int var3 = class8.field100; ~class252.field3646.length < ~var3; ++var3) {
            class106.field1755[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILek;)V", line = 223)
    private final void method3477(int arg0, class465 arg1) {
        ++field8800;
        if (arg1.field6719.length + -arg1.field6710 >= 1) {
            int var3 = arg1.method2705(-24);
            if (~var3 <= -1 && ~var3 >= -23) {
                byte var4;
                if (var3 == 22) {
                    var4 = 45;
                } else if (~var3 != -22) {
                    if (var3 != 20) {
                        if (~var3 != -20) {
                            if (~var3 != -19) {
                                if (var3 != 17) {
                                    if (var3 == 16) {
                                        var4 = 38;
                                    } else if (~var3 != -16) {
                                        if (var3 == 14) {
                                            var4 = 36;
                                        } else if (var3 == 13) {
                                            var4 = 35;
                                        } else if (var3 != 12) {
                                            if (var3 == 11) {
                                                var4 = 33;
                                            } else if (var3 != 10) {
                                                if (~var3 == -10) {
                                                    var4 = 31;
                                                } else if (var3 != 8) {
                                                    if (var3 == 7) {
                                                        var4 = 29;
                                                    } else if (var3 != 6) {
                                                        if (var3 != 5) {
                                                            if (~var3 != -5) {
                                                                if (~var3 != -4) {
                                                                    if (var3 == 2) {
                                                                        var4 = 22;
                                                                    } else if (~var3 == -2) {
                                                                        var4 = 23;
                                                                    } else {
                                                                        var4 = 19;
                                                                    }
                                                                } else {
                                                                    var4 = 23;
                                                                }
                                                            } else {
                                                                var4 = 24;
                                                            }
                                                        } else {
                                                            var4 = 28;
                                                        }
                                                    } else {
                                                        var4 = 28;
                                                    }
                                                } else {
                                                    var4 = 30;
                                                }
                                            } else {
                                                var4 = 32;
                                            }
                                        } else {
                                            var4 = 34;
                                        }
                                    } else {
                                        var4 = 37;
                                    }
                                } else {
                                    var4 = 40;
                                }
                            } else {
                                var4 = 41;
                            }
                        } else {
                            var4 = 42;
                        }
                    } else {
                        var4 = 43;
                    }
                } else {
                    var4 = 44;
                }
                if (arg1.field6719.length + -arg1.field6710 >= var4) {
                    super.field5966 = arg1.method2705(-126);
                    if (~super.field5966 <= -2) {
                        if (super.field5966 > 4) {
                            super.field5966 = 4;
                        }
                    } else {
                        super.field5966 = 1;
                    }
                    this.method3474(arg1.method2705(-110) == 1, 3);
                    super.field5968 = arg1.method2705(-49) == 1;
                    super.field5962 = arg1.method2705(-127) == 1;
                    super.field5980 = ~arg1.method2705(-118) == -2;
                    super.field5998 = arg1.method2705(-53) != 1 ? 0 : 1;
                    super.field5996 = arg1.method2705(-88) == 1;
                    super.field5986 = arg1.method2705(arg0 + -22) == 1;
                    super.field6001 = arg1.method2705(-84) == 1;
                    super.field5978 = arg1.method2705(-64);
                    if (super.field5978 > 2) {
                        super.field5978 = 2;
                    }
                    if (var3 >= 17) {
                        super.field5999 = arg1.method2705(-32);
                    }
                    if (var3 >= 2) {
                        super.field5987 = ~arg1.method2705(-87) == -2;
                        if (~var3 <= -18) {
                            super.field5982 = arg1.method2705(-109) == 1;
                        }
                    } else {
                        super.field5987 = ~arg1.method2705(arg0 ^ -80) == -2;
                        arg1.method2705(arg0 ^ -125);
                    }
                    super.field5981 = arg1.method2705(-78) == 1;
                    super.field5972 = ~arg1.method2705(arg0 ^ -105) == -2;
                    super.field5994 = arg1.method2705(arg0 + -78);
                    if (super.field5994 > 2) {
                        super.field5994 = 2;
                    }
                    super.field5969 = super.field5994;
                    super.field5963 = ~arg1.method2705(-125) == -2;
                    super.field5973 = arg1.method2705(-25);
                    if (~super.field5973 < -128) {
                        super.field5973 = 127;
                    }
                    if (var3 < 20) {
                        super.field5997 = super.field5973;
                    } else {
                        super.field5997 = arg1.method2705(-45);
                        if (super.field5997 > 127) {
                            super.field5997 = 127;
                        }
                    }
                    super.field5991 = arg1.method2705(-71);
                    super.field5995 = arg1.method2705(arg0 ^ -61);
                    if (super.field5995 > 127) {
                        super.field5995 = 127;
                    }
                    if (~var3 <= -22) {
                        super.field5993 = arg1.method2705(-85);
                        if (~super.field5993 < -128) {
                            super.field5993 = 127;
                        }
                    } else {
                        super.field5993 = super.field5991;
                    }
                    if (~var3 <= -2) {
                        super.field5976 = arg1.method2755((byte) -77);
                        super.field5965 = arg1.method2755((byte) -64);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg1.method2705(-94);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg1.method2705(-43);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class246.field3583 > -97) {
                            var5 = 0;
                        }
                        class557.method3262(arg0 ^ 12816, var5);
                    }
                    if (~var3 <= -6) {
                        super.field5971 = arg1.method2691((byte) -67);
                    }
                    int var6 = arg0;
                    if (var3 >= 6) {
                        super.field5974 = var6 = arg1.method2705(-126);
                    }
                    if (~super.field5974 != -2 && super.field5974 != 2) {
                        super.field5974 = 2;
                    }
                    if (var3 >= 7) {
                        super.field5970 = arg1.method2705(arg0 + -68) == 1;
                    }
                    if (var3 >= 8) {
                        super.field5977 = ~arg1.method2705(-77) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field5988 = arg1.method2705(-121);
                    }
                    if (super.field5988 < 0 || super.field5988 > class99.method827(class246.field3583, false)) {
                        super.field5988 = 0;
                    }
                    if (var3 >= 10) {
                        super.field5964 = ~arg1.method2705(arg0 ^ -88) != -1;
                    }
                    if (var3 >= 11) {
                        super.field5983 = ~arg1.method2705(-41) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field5998 = arg1.method2705(arg0 ^ -19);
                    }
                    if (~super.field5998 > -1 || super.field5998 > 2) {
                        super.field5998 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field5967 = arg1.method2705(-113) == 1;
                    }
                    if (~var3 > -15) {
                        if (~var6 != -1) {
                            super.field6000 = 1;
                        } else {
                            super.field6000 = 2;
                        }
                    } else {
                        super.field6000 = arg1.method2705(-51);
                    }
                    if (super.field6000 < 0 || super.field6000 > 5) {
                        super.field6000 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field6006 = arg1.method2705(-25);
                        if (~super.field6006 > -1 || ~super.field6006 < -5) {
                            super.field6006 = ~class144.field2488 != -2 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field5979 = arg1.method2705(arg0 + -75) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field5979 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && ~super.field6000 == -1) {
                        super.field6000 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field6002 = arg1.method2705(-90);
                        if (super.field6002 < 0 || super.field6002 > 4) {
                            super.field6002 = 0;
                        }
                    }
                    if (~var3 > -20) {
                        if (super.field6002 != 1 && super.field6002 != 2) {
                            if (~super.field6002 != -4) {
                                super.field6003 = 0;
                            } else {
                                super.field6003 = 1;
                            }
                        } else {
                            super.field6003 = 2;
                        }
                    } else {
                        super.field6003 = arg1.method2705(-128);
                    }
                    if (var3 >= 22) {
                        super.field5975 = arg1.method2705(-75);
                    }
                    if (super.field6000 == 0 && class246.field3583 < 96 && super.field6002 != 1 && ~super.field6002 != -1) {
                        this.method3486(1, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)I", line = 568)
    private final int method3478(int arg0, int arg1) {
        ++field8797;
        byte var3;
        if (~arg1 < -12001) {
            this.method3470((byte) -102);
            var3 = 4;
        } else if (arg1 <= 5000) {
            if (arg1 <= 2000) {
                this.method3486(1, true);
                var3 = 1;
            } else {
                var3 = 2;
                this.method3483(true);
            }
        } else {
            this.method3487(-78);
            var3 = 3;
        }
        if (class76.field1182 != 2) {
            super.field6000 = 2;
            class251.method1604(93, 2);
        }
        this.method3481(true, class653.field9220);
        int var4 = 73 % ((arg0 - 31) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(II)Z", line = 622)
    public final boolean method3479(int arg0, int arg1) {
        if (arg1 != 3691) {
            this.method3481(false, (class705) null);
        }
        ++field8815;
        return ~arg0 != -1 ? true : super.field5992;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lwv;)V", line = 1105)
    public class616(class705 arg0) {
        super.field5966 = 3;
        super.field6002 = 3;
        this.method3474(true, 3);
        super.field5976 = 0;
        super.field5994 = 0;
        super.field5978 = 2;
        super.field5991 = 127;
        super.field5993 = 127;
        super.field5980 = true;
        super.field5962 = true;
        super.field5981 = true;
        super.field5982 = false;
        super.field5986 = true;
        super.field5969 = 0;
        super.field5997 = 127;
        super.field5973 = 127;
        super.field5972 = true;
        super.field5996 = true;
        super.field5965 = 0;
        super.field5995 = 127;
        super.field5968 = true;
        super.field5999 = 0;
        super.field5998 = 1;
        super.field5963 = true;
        super.field5987 = true;
        super.field6001 = true;
        if (~class246.field3583 > -97) {
            class557.method3262(12816, 0);
        } else {
            class557.method3262(12816, 2);
        }
        super.field5988 = 0;
        super.field6003 = 0;
        super.field6006 = class144.field2488 == 1 ? 2 : 4;
        super.field5967 = true;
        super.field5983 = true;
        super.field5974 = 2;
        super.field5977 = false;
        super.field6000 = 2;
        super.field5964 = false;
        super.field5970 = false;
        super.field5971 = 0;
        class355 var2 = null;
        try {
            class614 var3 = arg0.method3949("", 0, true);
            while (~var3.field8787 == -1) {
                class564.method3300((byte) 96, 1L);
            }
            if (~var3.field8787 == -2) {
                var2 = (class355) var3.field8785;
                byte[] var4 = new byte[(int) var2.method2144(-54)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method2146(var4.length - var5, -1, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method3477(0, new class465(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2152(false);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(BI)V", line = 641)
    public final void method3480(byte arg0, int arg1) {
        ++field8812;
        class438.field6302 = true;
        int var3 = -55 / ((arg0 - 22) / 48);
        super.field6003 = arg1;
        class332.field4625 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLwv;)V", line = 657)
    public final void method3481(boolean arg0, class705 arg1) {
        ++field8793;
        class355 var3 = null;
        try {
            class614 var4 = arg1.method3949("", 0, arg0);
            while (~var4.field8787 == -1) {
                class564.method3300((byte) 96, 1L);
            }
            if (~var4.field8787 == -2) {
                var3 = (class355) var4.field8785;
                class465 var5 = new class465(class695.method3916(13));
                this.method2482(var5, -75);
                var3.method2149(var5.field6719, var5.field6710, 0, 1);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2152(!arg0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(II)I", line = 698)
    public final int method3482(int arg0, int arg1) {
        ++field8807;
        if (arg0 != 0) {
            field8808 = null;
        }
        if (class113.method915(arg1, -54) && !class482.method2819((byte) -47, class515.field7636)) {
            return class246.field3583 < 96 && class65.method539((byte) -127, arg1) && super.field6003 == 0 ? 1 : super.field6003;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V", line = 722)
    public final void method3483(boolean arg0) {
        this.method3474(true, 3);
        ++field8810;
        super.field5998 = 0;
        super.field6001 = false;
        super.field5972 = false;
        super.field5980 = false;
        super.field5979 = false;
        super.field5978 = super.field5999 = 0;
        super.field5981 = false;
        super.field5962 = arg0;
        super.field5994 = super.field5969 = 0;
        super.field5996 = false;
        super.field5986 = false;
        super.field5987 = false;
        super.field5968 = false;
        super.field5982 = false;
        class557.method3262(12816, 0);
        super.field5988 = 0;
        super.field5967 = true;
        super.field5964 = false;
        this.method3472(110);
        this.method3480((byte) 70, 2);
        super.field6002 = 2;
        class69.method566((byte) -10);
        class403.method2433(-89);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(III)I", line = 755)
    private final int method3484(int arg0, int arg1, int arg2) {
        ++field8806;
        if (arg1 < 90) {
            field8808 = null;
        }
        byte var4;
        if (~arg0 >= -20001) {
            if (arg0 <= 10000) {
                if (arg0 > 5000) {
                    this.method3483(true);
                    var4 = 2;
                } else {
                    this.method3486(1, true);
                    var4 = 1;
                }
            } else {
                var4 = 3;
                this.method3487(-124);
            }
        } else {
            this.method3470((byte) -102);
            var4 = 4;
        }
        if (~class76.field1182 != ~arg2) {
            super.field6000 = arg2;
            class251.method1604(69, arg2);
        }
        this.method3481(true, class653.field9220);
        return var4;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(III[BII[BII)V", line = 806)
    public static final void method3485(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8792;
        int var9 = -(arg2 >> 2);
        int var10 = -(3 & arg2);
        for (int var11 = -arg8; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg3[arg4++]);
                int var14 = arg7++;
                arg6[var14] = (byte) (arg6[var14] + -arg3[arg4++]);
                int var15 = arg7++;
                arg6[var15] = (byte) (arg6[var15] + -arg3[arg4++]);
                int var16 = arg7++;
                arg6[var16] = (byte) (arg6[var16] + -arg3[arg4++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg3[arg4++]);
            }
            arg7 += arg5;
            arg4 += arg0;
        }
        if (arg1 != 16) {
            field8808 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(IZ)V", line = 850)
    public final void method3486(int arg0, boolean arg1) {
        this.method3474(false, 3);
        ++field8803;
        super.field5968 = false;
        super.field5962 = !class486.field6942.equals(class470.field6783);
        super.field5987 = false;
        super.field5994 = super.field5969 = 0;
        super.field5979 = false;
        super.field6001 = false;
        super.field5978 = super.field5999 = 0;
        super.field5982 = false;
        super.field5980 = false;
        super.field5972 = false;
        super.field5981 = false;
        super.field5986 = false;
        super.field5996 = false;
        super.field5998 = 0;
        class557.method3262(12816, 0);
        super.field5988 = 0;
        super.field5967 = false;
        super.field5964 = false;
        this.method3472(101);
        this.method3480((byte) -78, 2);
        super.field6002 = arg0;
        if (arg1) {
            class69.method566((byte) 86);
        }
        class403.method2433(-12);
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)V", line = 887)
    public final void method3487(int arg0) {
        this.method3474(true, 3);
        ++field8795;
        super.field5998 = 1;
        super.field5987 = true;
        super.field5981 = false;
        super.field5968 = true;
        super.field5962 = true;
        super.field5980 = true;
        super.field5994 = super.field5969 = 0;
        super.field5979 = true;
        super.field5982 = false;
        super.field5972 = true;
        super.field6001 = true;
        super.field5986 = true;
        super.field5996 = true;
        super.field5978 = super.field5999 = 1;
        if (class246.field3583 <= 95) {
            class557.method3262(12816, 0);
        } else {
            class557.method3262(12816, 1);
        }
        if (arg0 > -74) {
            field8814 = -9;
        }
        super.field5964 = false;
        super.field5967 = true;
        super.field5988 = 0;
        this.method3472(70);
        this.method3480((byte) -46, 1);
        super.field6002 = 3;
        class69.method566((byte) 96);
        class403.method2433(-92);
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)I", line = 929)
    public final int method3488(byte arg0) {
        ++field8791;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class653.field9220.field9983 && !class653.field9220.field9985) {
            if (class705.field9971.startsWith("win")) {
                if (!class705.field9986.startsWith("amd64") && !class705.field9986.startsWith("x86_64")) {
                    var2 = true;
                }
                var3 = true;
                var4 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field8802) {
            var3 = false;
        }
        if (this.field8813) {
            var4 = false;
        }
        if (this.field8798) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method3475(127);
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class673.method3808(true, 1000, 2);
                } catch (Exception var16) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class673.method3808(true, 1000, 3);
                    if (~class76.field1182 == -4) {
                        class568 var8 = class637.field9048.method77();
                        long var9 = 281474976710655L & var8.field8304;
                        int var11 = var8.field8312;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= var9 >= 64425238954L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class673.method3808(true, 1000, 1);
                } catch (Exception var14) {
                }
            }
            if (~var5 == 0 && ~var6 == 0 && var7 == -1) {
                return this.method3475(arg0 + 179);
            } else {
                int var12 = (int) ((float) var6 * 1.1F);
                if (arg0 != -96) {
                    return -51;
                } else {
                    int var13 = (int) ((float) var7 * 1.1F);
                    if (var13 < var5 && var5 > var12) {
                        return this.method3478(-29, var5);
                    } else {
                        return ~var13 < ~var12 ? this.method3484(var13, 114, 3) : this.method3484(var12, 117, 1);
                    }
                }
            }
        }
    }
}
