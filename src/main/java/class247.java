import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class247 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lwg;")
    private class277 field3866 = new class277();

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Lwg;")
    private class277 field3882 = new class277();

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Lwg;")
    private class277 field3888 = new class277();

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Lwg;")
    private class277 field3889 = new class277();

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Lgn;")
    private class303 field3890 = new class303(4);

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "B")
    private byte field3897 = 0;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public volatile int field3896 = 0;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public volatile int field3894 = 0;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "Lgn;")
    private class303 field3895 = new class303(8);

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljf;")
    public static class227 field3868 = new class227(32);

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[I")
    public static int[] field3883 = new int[2];

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "[I")
    public static int[] field3884 = new int[100];

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field3886 = 0;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3885 = "Checking for updates - ";

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "J")
    private long field3892;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Lmk;")
    private class329 field3898;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Lra;")
    private class88 field3891;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lum;Z)I", line = 5)
    public static final int method1667(class82 arg0, boolean arg1) {
        field3881++;
        if (arg1) {
            return -59;
        }
        int var2 = arg0.field1241;
        class309 var3 = arg0.method280(-79);
        if (arg0.field474 == var3.field4876) {
            var2 = arg0.field1240;
        } else if (arg0.field474 == var3.field4872 || arg0.field474 == var3.field4864 || arg0.field474 == var3.field4867 || arg0.field474 == var3.field4858) {
            var2 = arg0.field1209;
        } else if (arg0.field474 == var3.field4855 || arg0.field474 == var3.field4862 || arg0.field474 == var3.field4890 || arg0.field474 == var3.field4882) {
            var2 = arg0.field1231;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V", line = 31)
    public final void method1668(int arg0, boolean arg1) {
        field3865++;
        if (this.field3891 == null) {
            return;
        }
        try {
            if (arg0 < 112) {
                return;
            }
            this.field3890.field4679 = 0;
            this.field3890.method2034(-34, arg1 ? 2 : 3);
            this.field3890.method2041(-160778480, 0);
            this.field3891.method598(0, 4, 1, this.field3890.field4716);
        } catch (IOException var6) {
            try {
                this.field3891.method596(false);
            } catch (Exception var5) {
            }
            this.field3896++;
            this.field3891 = null;
            this.field3894 = -2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIBIB)Lmk;", line = 60)
    public final class329 method1669(boolean arg0, int arg1, byte arg2, int arg3, byte arg4) {
        field3887++;
        long var6 = (long) ((arg3 << 16) + arg1);
        class329 var8 = new class329();
        var8.field4938 = var6;
        var8.field2523 = arg0;
        if (arg2 <= 55) {
            this.method1672(-70);
        }
        var8.field5090 = arg4;
        if (arg0) {
            if (this.method1670(76) >= 20) {
                throw new RuntimeException();
            }
            this.field3866.method1824(var8, (byte) -127);
        } else if (this.method1672(0) < 20) {
            this.field3888.method1824(var8, (byte) 120);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I", line = 104)
    public final int method1670(int arg0) {
        if (arg0 < 26) {
            this.method1680(68);
        }
        field3873++;
        return this.field3866.method1818((byte) 22) + this.field3882.method1818((byte) 22);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIZZI)Lwf;", line = 117)
    public static final class306 method1671(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg1 != -18434) {
            field3868 = (class227) null;
        }
        field3871++;
        class33 var5 = null;
        if (class184.field2816 != null) {
            var5 = new class33(arg4, class184.field2816, class262.field4049[arg4], 1000000);
        }
        class226.field3617[arg4] = class253.field3956.method2328(false, arg4, var5, class264.field4073);
        if (arg0) {
            class226.field3617[arg4].method1703(-2);
        }
        return new class306(class226.field3617[arg4], arg3, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I", line = 138)
    private final int method1672(int arg0) {
        if (arg0 != 0) {
            this.field3892 = 37L;
        }
        field3878++;
        return this.field3888.method1818((byte) 22) + this.field3889.method1818((byte) 22);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 149)
    public static void method1673(byte arg0) {
        field3885 = null;
        field3868 = null;
        field3884 = null;
        field3883 = null;
        if (arg0 < 39) {
            field3886 = -84;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lra;IZ)V", line = 163)
    public final void method1674(class88 arg0, int arg1, boolean arg2) {
        if (this.field3891 != null) {
            try {
                this.field3891.method596(false);
            } catch (Exception var11) {
            }
            this.field3891 = null;
        }
        field3872++;
        this.field3891 = arg0;
        if (arg1 >= -112) {
            field3886 = 108;
        }
        this.method1678((byte) -123);
        this.method1668(115, arg2);
        this.field3895.field4679 = 0;
        this.field3898 = null;
        while (true) {
            class329 var5 = (class329) this.field3882.method1825((byte) -114);
            if (var5 == null) {
                while (true) {
                    class329 var6 = (class329) this.field3889.method1825((byte) 118);
                    if (var6 == null) {
                        if (this.field3897 != 0) {
                            try {
                                this.field3890.field4679 = 0;
                                this.field3890.method2034(-53, 4);
                                this.field3890.method2034(-52, this.field3897);
                                this.field3890.method2044(1247686728, 0);
                                this.field3891.method598(0, 4, 1, this.field3890.field4716);
                            } catch (IOException var10) {
                                try {
                                    this.field3891.method596(false);
                                } catch (Exception var9) {
                                }
                                this.field3896++;
                                this.field3891 = null;
                                this.field3894 = -2;
                            }
                        }
                        this.field3893 = 0;
                        this.field3892 = class195.method1322(126);
                        return;
                    }
                    this.field3888.method1824(var6, (byte) -110);
                }
            }
            this.field3866.method1824(var5, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 233)
    public final void method1675(int arg0) {
        field3870++;
        if (this.field3891 == null) {
            return;
        }
        if (arg0 != -2) {
            this.field3882 = (class277) null;
        }
        try {
            this.field3890.field4679 = 0;
            this.field3890.method2034(-123, 7);
            this.field3890.method2041(arg0 - 160778478, 0);
            this.field3891.method598(0, 4, 1, this.field3890.field4716);
        } catch (IOException var5) {
            try {
                this.field3891.method596(false);
            } catch (Exception var4) {
            }
            this.field3894 = -2;
            this.field3891 = null;
            this.field3896++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 269)
    public final void method1676(boolean arg0) {
        if (!arg0) {
            if (this.field3891 != null) {
                this.field3891.method597((byte) 111);
            }
            field3867++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 283)
    public final void method1677(int arg0) {
        int var2 = 46 % ((arg0 - 33) / 37);
        field3877++;
        try {
            this.field3891.method596(false);
        } catch (Exception var4) {
        }
        this.field3896++;
        this.field3897 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3894 = -1;
        this.field3891 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 301)
    private final void method1678(byte arg0) {
        field3869++;
        if (this.field3891 == null) {
            return;
        }
        try {
            this.field3890.field4679 = 0;
            this.field3890.method2034(-127, 6);
            this.field3890.method2041(-160778480, 3);
            this.field3891.method598(0, 4, 1, this.field3890.field4716);
        } catch (IOException var5) {
            try {
                this.field3891.method596(false);
            } catch (Exception var4) {
            }
            this.field3891 = null;
            this.field3894 = -2;
            this.field3896++;
        }
        if (arg0 >= -30) {
            this.method1677(9);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V", line = 328)
    public final void method1679(byte arg0) {
        field3876++;
        int var2 = 116 % ((19 - arg0) / 58);
        if (this.field3891 != null) {
            this.field3891.method596(false);
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)Z", line = 343)
    public final boolean method1680(int arg0) {
        field3874++;
        if (this.field3891 != null) {
            long var2 = class195.method1322(122);
            int var4 = (int) (var2 - this.field3892);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3892 = var2;
            this.field3893 += var4;
            if (this.field3893 > 30000) {
                try {
                    this.field3891.method596(false);
                } catch (Exception var30) {
                }
                this.field3891 = null;
            }
        }
        if (this.field3891 == null) {
            return this.method1670(38) == 0 && this.method1672(0) == 0;
        }
        try {
            this.field3891.method608(7);
            for (class329 var6 = (class329) this.field3866.method1826(-116); var6 != null; var6 = (class329) this.field3866.method1823((byte) -128)) {
                this.field3890.field4679 = 0;
                this.field3890.method2034(-84, 1);
                this.field3890.method2041(-160778480, (int) var6.field4938);
                this.field3891.method598(0, 4, 1, this.field3890.field4716);
                this.field3882.method1824(var6, (byte) -104);
            }
            for (class329 var7 = (class329) this.field3888.method1826(-116); var7 != null; var7 = (class329) this.field3888.method1823((byte) -128)) {
                this.field3890.field4679 = 0;
                this.field3890.method2034(-15, 0);
                this.field3890.method2041(-160778480, (int) var7.field4938);
                this.field3891.method598(0, 4, 1, this.field3890.field4716);
                this.field3889.method1824(var7, (byte) -113);
            }
            int var8 = 0;
            if (arg0 >= -72) {
                return true;
            }
            while (var8 < 100) {
                int var9 = this.field3891.method607(-125);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3893 = 0;
                byte var10 = 0;
                if (this.field3898 == null) {
                    var10 = 8;
                } else if (this.field3898.field5096 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field3898.field5095.field4716.length - this.field3898.field5090;
                    int var12 = 512 - this.field3898.field5096;
                    if (var11 - this.field3898.field5095.field4679 < var12) {
                        var12 = var11 - this.field3898.field5095.field4679;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field3891.method604(89, var12, this.field3898.field5095.field4679, this.field3898.field5095.field4716);
                    if (this.field3897 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field3898.field5095.field4716[this.field3898.field5095.field4679 + var13] = (byte) class146.method1012(this.field3898.field5095.field4716[this.field3898.field5095.field4679 + var13], this.field3897);
                        }
                    }
                    this.field3898.field5096 += var12;
                    this.field3898.field5095.field4679 += var12;
                    if (this.field3898.field5095.field4679 == var11) {
                        this.field3898.method2143((byte) 125);
                        this.field3898.field2528 = false;
                        this.field3898 = null;
                    } else if (this.field3898.field5096 == 512) {
                        this.field3898.field5096 = 0;
                    }
                } else {
                    int var14 = var10 - this.field3895.field4679;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field3891.method604(23, var14, this.field3895.field4679, this.field3895.field4716);
                    if (this.field3897 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field3895.field4716[this.field3895.field4679 + var15] = (byte) class146.method1012(this.field3895.field4716[this.field3895.field4679 + var15], this.field3897);
                        }
                    }
                    this.field3895.field4679 += var14;
                    if (this.field3895.field4679 >= var10) {
                        if (this.field3898 == null) {
                            this.field3895.field4679 = 0;
                            int var16 = this.field3895.method2043((byte) -119);
                            int var17 = this.field3895.method1994(false);
                            long var18 = (long) ((var16 << 16) + var17);
                            int var20 = this.field3895.method2043((byte) -120);
                            boolean var21 = (var20 & 0x80) != 0;
                            int var22 = var20 & 0x7F;
                            int var23 = this.field3895.method1996(83);
                            Object var24 = null;
                            class329 var25;
                            if (var21) {
                                for (var25 = (class329) this.field3889.method1826(119); var25 != null && var25.field4938 != var18; var25 = (class329) this.field3889.method1823((byte) -128)) {
                                }
                            } else {
                                for (var25 = (class329) this.field3882.method1826(-114); var25 != null && var25.field4938 != var18; var25 = (class329) this.field3882.method1823((byte) -128)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var22 == 0 ? 5 : 9;
                            this.field3898 = var25;
                            this.field3898.field5095 = new class303(var23 + var26 + this.field3898.field5090);
                            this.field3898.field5095.method2034(-122, var22);
                            this.field3898.field5095.method2013(var23, -95);
                            this.field3895.field4679 = 0;
                            this.field3898.field5096 = 8;
                        } else if (this.field3898.field5096 != 0) {
                            throw new IOException();
                        } else if (this.field3895.field4716[0] == -1) {
                            this.field3898.field5096 = 1;
                            this.field3895.field4679 = 0;
                        } else {
                            this.field3898 = null;
                        }
                    }
                }
                var8++;
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3891.method596(false);
            } catch (Exception var29) {
            }
            this.field3894 = -2;
            this.field3891 = null;
            this.field3896++;
            return this.method1670(127) == 0 && this.method1672(0) == 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Lhh;", line = 617)
    public static final class213 method1681(int arg0, byte arg1) {
        field3875++;
        class213 var2 = (class213) class291.field4450.method355((long) arg0, 6487);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class175.field2679.method2103(0, 0, arg0);
        } else {
            var3 = class64.field978.method2103(0, 0, arg0 & 0x7FFF);
        }
        class213 var4 = new class213();
        if (var3 != null) {
            var4.method1425(new class303(var3), (byte) -6);
        }
        if (arg0 >= 32768) {
            var4.method1426(0);
        }
        class291.field4450.method350((long) arg0, var4, true);
        return arg1 == -50 ? var4 : (class213) null;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)Z", line = 668)
    public final boolean method1682(int arg0) {
        if (arg0 < 121) {
            method1667((class82) null, false);
        }
        field3879++;
        return this.method1670(83) >= 20;
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)Z", line = 679)
    public final boolean method1683(int arg0) {
        field3880++;
        if (arg0 != 20) {
            method1681(31, (byte) 80);
        }
        return this.method1672(0) >= 20;
    }
}
