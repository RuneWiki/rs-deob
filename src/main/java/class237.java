import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class237 extends class7 {

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    private int field3906 = 0;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Lfe;")
    private class97 field3921 = new class97(16);

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    private int field3927 = 0;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Lo;")
    private class227 field3925 = new class227();

    @OriginalMember(owner = "client!h", name = "U", descriptor = "J")
    private long field3929 = 0L;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "Lkh;")
    private class250 field3911;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    private int field3920;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "Z")
    private boolean field3926;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Lo;")
    private class227 field3928;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Llj;")
    private class26 field3907;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Ldi;")
    private class111 field3900;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    private int field3898;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Z")
    private boolean field3930;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    private int field3904;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lkh;")
    private class250 field3901;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Lum;")
    private class51 field3923;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lph;")
    public static class229 field3903 = class266.method1858("Lade Wordpack )2 ", 0);

    @OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
    public static int[] field3894 = new int[2000];

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Lph;")
    public static class229 field3922 = class266.method1858("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Loa;")
    private class107 field3895;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Lmf;")
    public static class31 field3905;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "Z")
    private boolean field3924;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "[B")
    private byte[] field3902;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)I", line = 4)
    public final int method1669(byte arg0) {
        field3899++;
        if (this.field3895 == null) {
            return 0;
        }
        if (arg0 != -1) {
            method1676(34, -23, false, -17);
        }
        if (this.field3926) {
            class80 var2 = this.field3928.method1580((byte) -39);
            return var2 == null ? 0 : (int) var2.field1325;
        } else {
            return this.field3895.field1801;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(BI)[B", line = 33)
    public final byte[] method44(byte arg0, int arg1) {
        class51 var3 = this.method1680(85, 0, arg1);
        field3916++;
        if (var3 == null) {
            return null;
        } else if (arg0 == -46) {
            byte[] var4 = var3.method323(16777215);
            var3.method598(arg0 ^ 0xFFFFFFB6);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIILrk;IJZ)Z", line = 51)
    public static final boolean method1670(int arg0, int arg1, int arg2, int arg3, int arg4, class216 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class139.method1005(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V", line = 86)
    public final void method47(int arg0, byte arg1) {
        field3919++;
        if (this.field3911 == null) {
            return;
        }
        for (class80 var3 = this.field3925.method1580((byte) -39); var3 != null; var3 = this.field3925.method1579((byte) 28)) {
            if ((long) arg0 == var3.field1325) {
                return;
            }
        }
        if (arg1 > -12) {
            field3922 = (class229) null;
        }
        class80 var4 = new class80();
        var4.field1325 = (long) arg0;
        this.field3925.method1582(var4, 4);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I", line = 116)
    public final int method1671(int arg0) {
        field3908++;
        return arg0 == 0 ? this.field3906 : -80;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Loa;", line = 136)
    public final class107 method50(int arg0) {
        field3913++;
        if (this.field3895 != null) {
            return this.field3895;
        }
        if (this.field3923 == null) {
            if (this.field3907.method167((byte) 126)) {
                return null;
            }
            this.field3923 = this.field3907.method166(true, this.field3920, 20, (byte) 0, 255);
        }
        if (this.field3923.field725) {
            return null;
        }
        byte[] var2 = this.field3923.method323(16777215);
        if (arg0 <= 117) {
            this.field3928 = (class227) null;
        }
        if (this.field3923 instanceof class43) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3895 = new class107(var2, this.field3904);
                if (this.field3895.field1805 != this.field3898) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3895 = null;
                if (this.field3907.method167((byte) 109)) {
                    this.field3923 = null;
                } else {
                    this.field3923 = this.field3907.method166(true, this.field3920, 20, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3895 = new class107(var2, this.field3904);
            } catch (RuntimeException var6) {
                this.field3907.method165(125);
                this.field3895 = null;
                if (this.field3907.method167((byte) 127)) {
                    this.field3923 = null;
                } else {
                    this.field3923 = this.field3907.method166(true, this.field3920, 20, (byte) 0, 255);
                }
                return null;
            }
            if (this.field3901 != null) {
                this.field3900.method846(var2, this.field3920, this.field3901, 0);
            }
        }
        this.field3923 = null;
        if (this.field3911 != null) {
            this.field3906 = 0;
            this.field3902 = new byte[this.field3895.field1792];
        }
        return this.field3895;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)I", line = 238)
    public final int method43(byte arg0, int arg1) {
        field3910++;
        class51 var3 = (class51) this.field3921.method713(3365, (long) arg1);
        int var4 = -88 % ((-arg0 - 64) / 61);
        return var3 == null ? 0 : var3.method322(98);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V", line = 265)
    public final void method1672(byte arg0) {
        field3918++;
        if (this.field3911 == null) {
            return;
        }
        this.field3924 = true;
        if (this.field3928 == null) {
            this.field3928 = new class227();
        }
        if (arg0 >= -68) {
            this.field3907 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)I", line = 284)
    public final int method1673(boolean arg0) {
        if (arg0) {
            return 68;
        }
        field3893++;
        if (this.method50(119) == null) {
            return this.field3923 == null ? 0 : this.field3923.method322(-114);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBIII)V", line = 309)
    public static final void method1674(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3917++;
        int var7 = -103 / ((-arg3 - 2) / 63);
        if (arg5 >= class192.field3172 && class77.field1289 >= arg4 && class206.field3398 <= arg0 && class214.field3533 >= arg6) {
            if (arg2 == 1) {
                class263.method1830(arg4, arg5, arg1, arg0, arg6, 124);
            } else {
                class205.method1435(arg1, arg6, 4542, arg5, arg2, arg4, arg0);
            }
        } else if (arg2 == 1) {
            class98.method726(arg1, (byte) 69, arg5, arg0, arg6, arg4);
        } else {
            class187.method1313(arg5, arg4, arg1, arg0, arg2, true, arg6);
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V", line = 340)
    public static final void method1675(byte arg0) {
        field3914++;
        for (int var1 = -1; var1 < class139.field2248; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class166.field2708[var1];
            }
            class209 var3 = class114.field1931[var2];
            if (var3 != null) {
                class88.method657(-71, var3, var3.method1457(0));
            }
        }
        int var4 = 5 / ((arg0 + 1) / 45);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZI)I", line = 376)
    public static final int method1676(int arg0, int arg1, boolean arg2, int arg3) {
        field3909++;
        int var4 = class310.field5203[class246.method1724(arg0, arg1)];
        if (arg3 > 0) {
            int var5 = class310.field5207.method108(arg3 & 0xFFFF, (byte) -122);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg1 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var7 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class310.field5207.method95(arg3 & 0xFFFF, (byte) 33);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 & 0xFF) * var9;
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var12 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var12 & 0x8500FF00) << 8) + (var10 >> 8) + (var11 & 0xFF00);
            }
        }
        if (!arg2) {
            field3903 = (class229) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILkh;Lkh;Llj;Ldi;IIZ)V", line = 941)
    public class237(int arg0, class250 arg1, class250 arg2, class26 arg3, class111 arg4, int arg5, int arg6, boolean arg7) {
        this.field3911 = arg1;
        this.field3920 = arg0;
        if (this.field3911 == null) {
            this.field3926 = false;
        } else {
            this.field3926 = true;
            this.field3928 = new class227();
        }
        this.field3907 = arg3;
        this.field3900 = arg4;
        this.field3898 = arg6;
        this.field3930 = arg7;
        this.field3904 = arg5;
        this.field3901 = arg2;
        if (this.field3901 != null) {
            this.field3923 = this.field3900.method843(this.field3920, 103, this.field3901);
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 450)
    public final void method1677(int arg0) {
        if (arg0 > -19) {
            this.field3924 = false;
        }
        field3896++;
        if (this.field3928 != null) {
            if (this.method50(119) == null) {
                return;
            }
            if (this.field3926) {
                boolean var2 = true;
                for (class80 var3 = this.field3928.method1580((byte) -39); var3 != null; var3 = this.field3928.method1579((byte) 28)) {
                    int var4 = (int) var3.field1325;
                    if (this.field3902[var4] == 0) {
                        this.method1680(122, 1, var4);
                    }
                    if (this.field3902[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method598(101);
                    }
                }
                while (this.field3927 < this.field3895.field1795.length) {
                    if (this.field3895.field1795[this.field3927] == 0) {
                        this.field3927++;
                    } else {
                        if (this.field3900.field1893 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3902[this.field3927] == 0) {
                            this.method1680(70, 1, this.field3927);
                        }
                        if (this.field3902[this.field3927] == 0) {
                            var2 = false;
                            class80 var5 = new class80();
                            var5.field1325 = (long) this.field3927;
                            this.field3928.method1582(var5, 4);
                        }
                        this.field3927++;
                    }
                }
                if (var2) {
                    this.field3926 = false;
                    this.field3927 = 0;
                }
            } else if (this.field3924) {
                boolean var6 = true;
                for (class80 var7 = this.field3928.method1580((byte) -39); var7 != null; var7 = this.field3928.method1579((byte) 28)) {
                    int var8 = (int) var7.field1325;
                    if (this.field3902[var8] != 1) {
                        this.method1680(73, 2, var8);
                    }
                    if (this.field3902[var8] == 1) {
                        var7.method598(56);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3895.field1795.length > this.field3927) {
                    if (this.field3895.field1795[this.field3927] == 0) {
                        this.field3927++;
                    } else {
                        if (this.field3907.method175(14617)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3902[this.field3927] != 1) {
                            this.method1680(33, 2, this.field3927);
                        }
                        if (this.field3902[this.field3927] != 1) {
                            var6 = false;
                            class80 var9 = new class80();
                            var9.field1325 = (long) this.field3927;
                            this.field3928.method1582(var9, 4);
                        }
                        this.field3927++;
                    }
                }
                if (var6) {
                    this.field3927 = 0;
                    this.field3924 = false;
                }
            } else {
                this.field3928 = null;
            }
        }
        if (!this.field3930 || class130.method935(false) < this.field3929) {
            return;
        }
        for (class51 var10 = (class51) this.field3921.method711(0); var10 != null; var10 = (class51) this.field3921.method718(27263)) {
            if (!var10.field725) {
                if (var10.field729) {
                    if (!var10.field727) {
                        throw new RuntimeException();
                    }
                    var10.method598(40);
                } else {
                    var10.field729 = true;
                }
            }
        }
        this.field3929 = class130.method935(false) + 1000L;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 625)
    public static void method1678(boolean arg0) {
        field3894 = null;
        field3903 = null;
        if (!arg0) {
            field3903 = (class229) null;
        }
        field3905 = null;
        field3922 = null;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)I", line = 639)
    public final int method1679(byte arg0) {
        field3912++;
        if (arg0 != 1) {
            this.method43((byte) 21, 35);
        }
        return this.field3895 == null ? 0 : this.field3895.field1801;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lum;", line = 664)
    private final class51 method1680(int arg0, int arg1, int arg2) {
        if (arg0 <= 23) {
            return (class51) null;
        }
        class51 var4 = (class51) this.field3921.method713(3365, (long) arg2);
        field3915++;
        if (var4 != null && arg1 == 0 && !var4.field727 && var4.field725) {
            var4.method598(65);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3911 == null || this.field3902[arg2] == -1) {
                    if (this.field3907.method167((byte) 108)) {
                        return null;
                    }
                    var4 = this.field3907.method166(true, arg2, 20, (byte) 2, this.field3920);
                } else {
                    var4 = this.field3900.method843(arg2, 53, this.field3911);
                }
            } else if (arg1 == 1) {
                if (this.field3911 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3900.method851(arg2, (byte) 110, this.field3911);
            } else if (arg1 == 2) {
                if (this.field3911 == null) {
                    throw new RuntimeException();
                }
                if (this.field3902[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3907.method175(14617)) {
                    return null;
                }
                var4 = this.field3907.method166(false, arg2, 20, (byte) 2, this.field3920);
            } else {
                throw new RuntimeException();
            }
            this.field3921.method710(var4, (byte) -40, (long) arg2);
        }
        if (var4.field725) {
            return null;
        }
        byte[] var5 = var4.method323(16777215);
        if (!var4 instanceof class43) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class245.field4039.reset();
                class245.field4039.update(var5, 0, var5.length - 2);
                int var10 = (int) class245.field4039.getValue();
                if (this.field3895.field1807[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field3907.field368 = 0;
                this.field3907.field369 = 0;
            } catch (RuntimeException var14) {
                this.field3907.method165(31);
                var4.method598(100);
                if (var4.field727 && !this.field3907.method167((byte) 109)) {
                    class243 var12 = this.field3907.method166(true, arg2, 20, (byte) 2, this.field3920);
                    this.field3921.method710(var12, (byte) -28, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3895.field1800[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3895.field1800[arg2];
            if (this.field3911 != null) {
                this.field3900.method846(var5, arg2, this.field3911, 0);
                if (this.field3902[arg2] != 1) {
                    this.field3906++;
                    this.field3902[arg2] = 1;
                }
            }
            if (!var4.field727) {
                var4.method598(110);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class245.field4039.reset();
            class245.field4039.update(var5, 0, var5.length - 2);
            int var6 = (int) class245.field4039.getValue();
            if (this.field3895.field1807[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3895.field1800[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3902[arg2] != 1) {
                if (this.field3902[arg2] == 0) {
                }
                this.field3906++;
                this.field3902[arg2] = 1;
            }
            if (!var4.field727) {
                var4.method598(26);
            }
            return var4;
        } catch (Exception var13) {
            this.field3902[arg2] = -1;
            var4.method598(57);
            if (var4.field727 && !this.field3907.method167((byte) 109)) {
                class243 var9 = this.field3907.method166(true, arg2, 20, (byte) 2, this.field3920);
                this.field3921.method710(var9, (byte) -117, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 875)
    public final void method1681(boolean arg0) {
        field3897++;
        if (this.field3928 == null || this.method50(121) == null) {
            return;
        }
        class80 var2 = this.field3925.method1580((byte) -39);
        if (arg0) {
            this.method1681(true);
        }
        while (var2 != null) {
            int var3 = (int) var2.field1325;
            if (var3 < 0 || var3 >= this.field3895.field1792 || this.field3895.field1795[var3] == 0) {
                var2.method598(101);
            } else {
                if (this.field3902[var3] == 0) {
                    this.method1680(89, 1, var3);
                }
                if (this.field3902[var3] == -1) {
                    this.method1680(66, 2, var3);
                }
                if (this.field3902[var3] == 1) {
                    var2.method598(85);
                }
            }
            var2 = this.field3925.method1579((byte) 28);
        }
    }
}
