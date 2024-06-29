import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class283 {

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "Z")
    private boolean field3883 = false;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    private int field3896 = -1;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
    private int field3895 = -1;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    private int field3898 = -32768;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "Z")
    private boolean field3894 = false;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "B")
    private byte field3901;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "B")
    private byte field3899;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "Z")
    private boolean field3893;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field3875 = 0;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    private int field3870;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    private int field3879;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    private int field3882;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "Lvf;")
    private class104 field3890;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Lbq;")
    public class190 field3874;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "Lba;")
    private class263 field3881;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "Lt;")
    private class471 field3892;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "[Z")
    private boolean[] field3873;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public final void method1678(int arg0, int arg1) {
        field3871++;
        int var3 = 91 / ((arg0 - 69) / 56);
        this.field3883 = true;
        this.method1683(-71, arg1);
    }

    @OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3874 != null) {
            this.field3874.method1197();
        }
        field3868++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLya;)V")
    public final void method1679(byte arg0, class38 arg1) {
        if (arg0 > -104) {
            this.field3880 = 32;
        }
        field3888++;
        this.method1687((byte) 56, true, true, this.field3885, this.field3897, arg1, 262144);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Z")
    public final boolean method1680(int arg0) {
        field3900++;
        if (arg0 != -1) {
            this.field3898 = 27;
        }
        return this.field3893;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZILya;IIILt;B)V")
    public final void method1681(boolean arg0, int arg1, class38 arg2, int arg3, int arg4, int arg5, class471 arg6, byte arg7) {
        field3877++;
        if (arg7 != 72) {
            this.method1682(17, 113, 48);
        }
        class521[] var9 = arg6.method406();
        class169[] var10 = arg6.method374();
        if ((this.field3874 == null || this.field3874.field2732) && (var9 != null || var10 != null)) {
            class220 var11 = class78.field1141.method2103(this.field3887, true);
            if (var11.field3080 != null) {
                var11 = var11.method1362(true, class421.field6166);
            }
            if (var11 != null) {
                this.field3874 = new class190(class441.field6516);
            }
        }
        if (this.field3874 == null) {
            return;
        }
        if (arg0) {
            this.field3874.method1188(arg2, (long) class441.field6516, var9, var10, false);
        } else {
            this.field3874.method1194((long) class441.field6516);
        }
        this.field3874.method1190(this.field3899, arg4, arg3, arg5, arg1);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
    private final void method1682(int arg0, int arg1, int arg2) {
        if (arg0 >= -71) {
            this.method1683(-76, -91);
        }
        field3876++;
        label92: while (true) {
            if (this.field3890 == null) {
                if (this.field3883) {
                    return;
                }
                this.method1683(-105, -1);
                if (this.field3890 == null) {
                    return;
                }
            }
            int var4 = class441.field6516 - this.field3879;
            if (var4 > 100 && this.field3890.field1567 > 0) {
                int var5 = this.field3890.field1551.length - this.field3890.field1567;
                while (var5 > this.field3882 && var4 > this.field3890.field1575[this.field3882]) {
                    var4 -= this.field3890.field1575[this.field3882];
                    this.field3882++;
                }
                if (var5 <= this.field3882) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3890.field1551.length; var7++) {
                        var6 += this.field3890.field1575[var7];
                    }
                    var4 %= var6;
                }
                this.field3870 = this.field3882 + 1;
                if (this.field3890.field1551.length <= this.field3870) {
                    this.field3870 -= this.field3890.field1567;
                    if (this.field3870 < 0 || this.field3890.field1551.length <= this.field3870) {
                        this.field3870 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3890.field1575[this.field3882] >= var4) {
                            this.field3880 = var4;
                            this.field3879 = class441.field6516 - var4;
                            return;
                        }
                        class441.method2618(arg1, arg2, this.field3899, false, this.field3890, this.field3882, 119);
                        var4 -= this.field3890.field1575[this.field3882];
                        this.field3882++;
                        if (this.field3882 >= this.field3890.field1551.length) {
                            this.field3882 -= this.field3890.field1567;
                            if (this.field3882 < 0 || this.field3890.field1551.length <= this.field3882) {
                                this.field3890 = null;
                                continue label92;
                            }
                        }
                        this.field3870 = this.field3882 + 1;
                    } while (this.field3870 < this.field3890.field1551.length);
                    this.field3870 -= this.field3890.field1567;
                } while (this.field3870 >= 0 && this.field3870 < this.field3890.field1551.length);
                this.field3870 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
    private final void method1683(int arg0, int arg1) {
        field3867++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class220 var5 = class78.field1141.method2103(this.field3887, true);
            class220 var6 = var5;
            if (var5.field3080 != null) {
                var5 = var5.method1362(true, class421.field6166);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3061 != null) {
                if (this.field3890 != null && var5.method1363(this.field3890.field1553, false)) {
                    return;
                }
                var3 = var5.method1374(-126);
                if (this.field3896 != var5.field3110) {
                    var4 = var5.field3075;
                }
            } else if (var5.field3133 == -1) {
                if (var6 != null && var6.field3061 != null) {
                    if (this.field3890 != null && var6.method1363(this.field3890.field1553, false)) {
                        return;
                    }
                    var3 = var6.method1374(-114);
                    if (this.field3896 != var6.field3110) {
                        var4 = var6.field3075;
                    }
                } else if (var6 != null && var6.field3133 != -1 && this.field3896 != var6.field3110) {
                    var4 = var6.field3075;
                    var3 = var6.field3133;
                }
            } else if (this.field3896 != var5.field3110) {
                var3 = var5.field3133;
                var4 = var5.field3075;
            }
        }
        if (var3 == -1) {
            this.field3890 = null;
            return;
        }
        this.field3892 = null;
        if (this.field3890 == null || this.field3890.field1553 != var3) {
            this.field3890 = class222.field3168.method126(-77, var3);
        } else if (this.field3890.field1566 == 0) {
            return;
        }
        if (this.field3890.field1551 == null) {
            this.field3890 = null;
            return;
        }
        if (arg0 >= -68) {
            method1685(79);
        }
        if (var4) {
            this.field3882 = (int) (Math.random() * (double) this.field3890.field1551.length);
            this.field3880 = (int) ((double) this.field3890.field1575[this.field3882] * Math.random()) + 1;
        } else {
            this.field3880 = 1;
            this.field3882 = 0;
        }
        this.field3870 = this.field3882 + 1;
        if (this.field3870 < 0 || this.field3870 >= this.field3890.field1551.length) {
            this.field3870 = -1;
        }
        this.field3879 = class441.field6516 - this.field3880;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)I")
    public final int method1684(int arg0) {
        field3869++;
        if (arg0 != 4) {
            this.method1680(-38);
        }
        return this.field3898;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)Z")
    public static final boolean method1685(int arg0) {
        field3889++;
        if (arg0 != -11182) {
            field3875 = -126;
        }
        return class404.field5937 != class373.field5469 || class68.field929 >= 2;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)Lhc;")
    public static final class94 method1686(byte arg0, int arg1) {
        if (arg0 >= -98) {
            return null;
        }
        field3884++;
        class94 var2 = (class94) class433.field6357.method1073((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field611.method727(arg1, 0, 72);
        class94 var4 = new class94();
        if (var3 != null) {
            var4.method695(new class391(var3), 121);
        }
        var4.method698((byte) -103);
        class433.field6357.method1072((long) arg1, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZZIILya;I)Lt;")
    public final class471 method1687(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4, class38 arg5, int arg6) {
        field3886++;
        class220 var8 = class78.field1141.method2103(this.field3887, true);
        if (var8.field3080 != null) {
            var8 = var8.method1362(true, class421.field6166);
        }
        if (var8 == null) {
            this.method1688((byte) -127, arg5);
            this.field3896 = -1;
            this.field3895 = this.field3882;
            return null;
        }
        if (!this.field3883 && this.field3896 != var8.field3110) {
            this.field3892 = null;
            this.method1683(arg0 - 171, -1);
        }
        this.method1682(-127, arg3, arg4);
        boolean var9 = arg1 & this.field3893 & class20.field269.method3085(class152.field2332, (byte) 118) != 0;
        boolean var10 = var9 & (this.field3896 != var8.field3110 || (this.field3895 != this.field3882 || this.field3890 != null && (this.field3890.field1565 || class299.field4102) && this.field3882 != this.field3870) && class20.field269.method3085(class152.field2332, (byte) -41) >= 2);
        if (arg2 && !var10) {
            this.field3896 = var8.field3110;
            this.field3895 = this.field3882;
            return null;
        }
        if (var10) {
            class365.method2203(this.field3881, this.field3901, this.field3885, this.field3897, this.field3873);
        }
        class142 var11 = class211.field2950[this.field3901];
        class142 var12;
        if (this.field3894) {
            var12 = class385.field5608[0];
        } else {
            var12 = this.field3901 < 3 ? class211.field2950[this.field3901 + 1] : null;
        }
        class471 var13 = null;
        if (this.field3890 != null) {
            if (var10) {
                arg6 |= 0x40000;
            }
            var13 = var8.method1368(this.field3872 == 11 ? 10 : this.field3872, var11.method361(this.field3885, this.field3897), this.field3882, var12, this.field3897, this.field3872 == 11 ? this.field3891 + 4 : this.field3891, arg5, arg6, this.field3880, this.field3890, this.field3885, this.field3870, -68, var11);
            if (var13 == null) {
                this.field3881 = null;
                this.field3873 = null;
                this.field3898 = 0;
            } else {
                if (var10) {
                    if (this.field3873 == null) {
                        this.field3873 = new boolean[4];
                    }
                    this.field3881 = var13.method369(this.field3881);
                    class195.method1212(this.field3881, this.field3901, arg3, arg4, this.field3873);
                }
                this.field3898 = var13.method380();
            }
            this.field3892 = null;
        } else if (this.field3892 != null && arg6 == (this.field3892.method372() & arg6) && this.field3896 == var8.field3110) {
            var13 = this.field3892;
        } else {
            if (this.field3892 != null) {
                arg6 |= this.field3892.method372();
            }
            class329 var14 = var8.method1377(arg5, var11, this.field3872 == 11 ? this.field3891 + 4 : this.field3891, -4735, this.field3885, var10, var12, var11.method361(this.field3885, this.field3897), this.field3897, arg6, this.field3872 == 11 ? 10 : this.field3872);
            if (var14 == null) {
                this.field3898 = 0;
                this.field3892 = null;
                this.field3873 = null;
                this.field3881 = null;
            } else {
                var13 = var14.field4492;
                this.field3892 = var14.field4492;
                if (var10) {
                    this.field3873 = null;
                    this.field3881 = var14.field4490;
                    class195.method1212(this.field3881, this.field3901, arg3, arg4, null);
                }
                this.field3898 = var13.method380();
            }
        }
        if (arg0 != 56) {
            this.field3872 = -103;
        }
        this.field3897 = arg4;
        this.field3896 = var8.field3110;
        this.field3895 = this.field3882;
        this.field3885 = arg3;
        return var13;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(BLya;)V")
    public final void method1688(byte arg0, class38 arg1) {
        if (this.field3881 != null) {
            class365.method2203(this.field3881, this.field3901, this.field3885, this.field3897, this.field3873);
            this.field3873 = null;
            this.field3881 = null;
        }
        if (arg0 > -120) {
            field3875 = -70;
        }
        field3878++;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lya;Ljo;IIIIIIZI)V")
    public class283(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3885 = arg6;
        this.field3872 = arg2;
        this.field3891 = arg3;
        this.field3897 = arg7;
        this.field3901 = (byte) arg5;
        this.field3894 = arg8;
        this.field3899 = (byte) arg4;
        this.field3887 = arg1.field3110;
        this.field3893 = arg0.method314() && arg1.field3073 && !this.field3894;
        if (arg9 != -1) {
            this.field3883 = true;
        }
        this.method1683(-119, arg9);
    }
}
