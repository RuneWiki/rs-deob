import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 extends class111 {

    @OriginalMember(owner = "client!ja", name = "tb", descriptor = "Z")
    private boolean field933 = false;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    private int field922 = -1;

    @OriginalMember(owner = "client!ja", name = "vb", descriptor = "Z")
    private volatile boolean field935 = false;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "Lbf;")
    private class188 field921;

    @OriginalMember(owner = "client!ja", name = "sb", descriptor = "Lbf;")
    private class188 field932;

    @OriginalMember(owner = "client!ja", name = "ub", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "Lvh;")
    public static class252 field924 = new class252();

    @OriginalMember(owner = "client!ja", name = "zb", descriptor = "Ldf;")
    private static class51 field939 = class46.method233("RuneScape is loading )2 please wait)3)3)3", 100);

    @OriginalMember(owner = "client!ja", name = "yb", descriptor = "Ldf;")
    public static class51 field938 = class46.method233("sl_arrows", 100);

    @OriginalMember(owner = "client!ja", name = "wb", descriptor = "Ldf;")
    public static class51 field936 = field939;

    @OriginalMember(owner = "client!ja", name = "Ab", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ja", name = "xb", descriptor = "Lu;")
    public static class111 field937;

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "[Z")
    private volatile boolean[] field930;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IB)I")
    public final int method348(int arg0, byte arg1) {
        ++field925;
        if (!this.method814(arg0, (byte) 13)) {
            return 0;
        } else if (super.field1915[arg0] != null) {
            return 100;
        } else if (this.field930[arg0]) {
            return 100;
        } else {
            if (arg1 != -74) {
                this.field917 = 32;
            }
            return class109.method795(arg0, 539392550, this.field934);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lbf;I[BZI)V")
    public final void method349(class188 arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field920;
        if (arg4 > -75) {
            this.field934 = 59;
        }
        if (this.field932 == arg0) {
            if (this.field935) {
                throw new RuntimeException();
            } else if (arg2 == null) {
                class140.method1017(this.field917, true, 38, this, this.field934, 255, (byte) 0);
            } else {
                class246.field4260.reset();
                class246.field4260.update(arg2, 0, arg2.length);
                int var6 = (int) class246.field4260.getValue();
                if (this.field917 != var6) {
                    class140.method1017(this.field917, true, 31, this, this.field934, 255, (byte) 0);
                } else {
                    class121 var7;
                    try {
                        var7 = new class121(class218.method1497(70, arg2));
                    } catch (RuntimeException var12) {
                        class140.method1017(this.field917, true, 22, this, this.field934, 255, (byte) 0);
                        return;
                    }
                    int var8 = var7.method897(-43);
                    if (~var8 != -6 && var8 != 6) {
                        class140.method1017(this.field917, true, 122, this, this.field934, 255, (byte) 0);
                    } else {
                        int var9 = 0;
                        if (var8 >= 6) {
                            var9 = var7.method865((byte) 8);
                        }
                        if (~this.field923 != ~var9) {
                            class140.method1017(this.field917, true, 99, this, this.field934, 255, (byte) 0);
                        } else {
                            this.method817(-89, arg2);
                            this.method352(0);
                        }
                    }
                }
            }
        } else {
            if (!arg3 && this.field922 == arg1) {
                this.field935 = true;
            }
            if (arg2 != null && arg2.length > 2) {
                class246.field4260.reset();
                class246.field4260.update(arg2, 0, arg2.length + -2);
                int var10 = (int) class246.field4260.getValue();
                int var11 = ((255 & arg2[arg2.length - 2]) << 8) + (255 & arg2[arg2.length + -1]);
                if (super.field1869[arg1] == var10 && super.field1907[arg1] == var11) {
                    this.field930[arg1] = true;
                    if (arg3) {
                        super.field1915[arg1] = class72.method502(arg2, (byte) -106, false);
                    }
                } else {
                    this.field930[arg1] = false;
                    if (this.field933 || arg3) {
                        class140.method1017(super.field1869[arg1], arg3, 29, this, arg1, this.field934, (byte) 2);
                    }
                }
            } else {
                this.field930[arg1] = false;
                if (this.field933 || arg3) {
                    class140.method1017(super.field1869[arg1], arg3, 69, this, arg1, this.field934, (byte) 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)Z")
    public static final boolean method350(int arg0, int arg1, int arg2, int arg3) {
        if (!class177.method1238(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class172.field2820[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class124.field2105) {
                        if (!class218.method1500(var4, var6, var5)) {
                            return false;
                        }
                        if (!class218.method1500(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class218.method1500(var4, var7, var5)) {
                            return false;
                        }
                        if (!class218.method1500(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class218.method1500(var4, var8, var5)) {
                        return false;
                    }
                    if (!class218.method1500(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class123.field2083) {
                        if (!class218.method1500(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class218.method1500(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class218.method1500(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class218.method1500(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class218.method1500(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class218.method1500(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class124.field2105) {
                        if (!class218.method1500(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class218.method1500(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class218.method1500(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class218.method1500(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class218.method1500(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class218.method1500(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class123.field2083) {
                        if (!class218.method1500(var4, var6, var5)) {
                            return false;
                        }
                        if (!class218.method1500(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class218.method1500(var4, var7, var5)) {
                            return false;
                        }
                        if (!class218.method1500(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class218.method1500(var4, var8, var5)) {
                        return false;
                    }
                    if (!class218.method1500(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class218.method1500(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class218.method1500(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class218.method1500(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class218.method1500(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class218.method1500(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
    public final void method351(int arg0, boolean arg1) {
        if (arg1) {
            method356((class33) null);
        }
        ++field928;
        if (this.method814(arg0, (byte) -13)) {
            if (this.field921 != null && this.field930 != null && this.field930[arg0]) {
                class53.method341(107, this, this.field921, arg0);
            } else {
                class140.method1017(super.field1869[arg0], true, 55, this, arg0, this.field934, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    private final void method352(int arg0) {
        this.field930 = new boolean[super.field1915.length];
        for (int var2 = 0; ~this.field930.length < ~var2; ++var2) {
            this.field930[var2] = false;
        }
        ++field929;
        if (this.field921 == null) {
            this.field935 = true;
        } else {
            this.field922 = -1;
            for (int var3 = arg0; ~this.field930.length < ~var3; ++var3) {
                if (~super.field1917[var3] < -1) {
                    class95.method713((byte) -118, this.field921, this, var3);
                    this.field922 = var3;
                }
            }
            if (~this.field922 == 0) {
                this.field935 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IB)V")
    public static final void method353(int arg0, byte arg1) {
        class227.field3974 = false;
        ++field926;
        class134.field2225 = null;
        class144.field2402 = 0;
        class82.field1382 = -1;
        if (arg1 <= 52) {
            method356((class33) null);
        }
        class128.field2152 = arg0;
        class52.field876 = 1;
        class204.field3419 = -1;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static void method354(byte arg0) {
        field924 = null;
        field937 = null;
        if (arg0 <= 32) {
            method350(41, -13, 120, 117);
        }
        field936 = null;
        field939 = null;
        field938 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IZ)V")
    public final void method355(int arg0, boolean arg1) {
        if (!arg1) {
            ++field931;
            if (this.method814(arg0, (byte) 126)) {
                class119.method860(-28600, arg0, this.field934);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lva;)V")
    public static final void method356(class33 arg0) {
        for (int var1 = arg0.field492; var1 <= arg0.field495; ++var1) {
            for (int var2 = arg0.field491; var2 <= arg0.field478; ++var2) {
                class97 var3 = class27.field395[arg0.field482][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1620; ++var4) {
                        if (var3.field1632[var4] == arg0) {
                            --var3.field1620;
                            for (int var5 = var4; var5 < var3.field1620; ++var5) {
                                var3.field1632[var5] = var3.field1632[var5 + 1];
                                var3.field1609[var5] = var3.field1609[var5 + 1];
                            }
                            var3.field1632[var3.field1620] = null;
                            break;
                        }
                    }
                    var3.field1624 = 0;
                    for (int var6 = 0; var6 < var3.field1620; ++var6) {
                        var3.field1624 |= var3.field1609[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lbf;Lbf;IZZZ)V")
    public class55(class188 arg0, class188 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field921 = arg0;
        this.field932 = arg1;
        this.field933 = arg5;
        this.field934 = arg2;
        class215.method1478(this.field934, this, 256);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z[BZII)V")
    public final void method357(boolean arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        ++field919;
        if (arg4 != -1) {
            method350(104, 107, -78, 54);
        }
        if (!arg0) {
            arg1[arg1.length + -2] = (byte) (super.field1907[arg3] >> 8);
            arg1[arg1.length + -1] = (byte) super.field1907[arg3];
            if (this.field921 != null) {
                class45.method228(-64, arg3, arg1, this.field921);
                this.field930[arg3] = true;
            }
            if (arg2) {
                super.field1915[arg3] = class72.method502(arg1, (byte) -101, false);
                return;
            }
        } else {
            if (this.field935) {
                throw new RuntimeException();
            }
            if (this.field932 != null) {
                class45.method228(121, this.field934, arg1, this.field932);
            }
            this.method817(arg4 + -68, arg1);
            this.method352(~arg4);
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)I")
    public final int method358(int arg0) {
        if (arg0 != 99) {
            return 97;
        } else {
            ++field918;
            if (this.field935) {
                return 100;
            } else if (super.field1915 != null) {
                return 99;
            } else {
                int var2 = class109.method795(this.field934, arg0 ^ 539392581, 255);
                if (~var2 <= -101) {
                    var2 = 99;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(III)V")
    public final void method359(int arg0, int arg1, int arg2) {
        ++field927;
        this.field917 = arg1;
        this.field923 = arg2;
        if (arg0 != -1751) {
            this.field922 = -12;
        }
        if (this.field932 == null) {
            class140.method1017(this.field917, true, 88, this, this.field934, 255, (byte) 0);
        } else {
            class53.method341(111, this, this.field932, this.field934);
        }
    }
}
