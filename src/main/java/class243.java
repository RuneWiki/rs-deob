import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class243 {

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Lnb;")
    private class330 field3865 = new class330();

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "Lnb;")
    private class330 field3869 = new class330();

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "Lnb;")
    private class330 field3870 = new class330();

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Lnb;")
    private class330 field3871 = new class330();

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Lim;")
    private class192 field3875 = new class192(4);

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public volatile int field3877 = 0;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "B")
    private byte field3876 = 0;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public volatile int field3878 = 0;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Lim;")
    private class192 field3879 = new class192(8);

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Z")
    public static boolean field3859 = true;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    private int field3873;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "J")
    private long field3874;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "Lfl;")
    private class239 field3880;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Ldm;")
    private class300 field3872;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIBIB)Lfl;", line = 5)
    public final class239 method1715(boolean arg0, int arg1, byte arg2, int arg3, byte arg4) {
        field3854++;
        long var6 = (long) ((arg3 << 16) + arg1);
        class239 var8 = new class239();
        if (arg2 != 101) {
            this.field3874 = 89L;
        }
        var8.field416 = var6;
        var8.field3788 = arg4;
        var8.field626 = arg0;
        if (arg0) {
            if (this.method1728(4) >= 20) {
                throw new RuntimeException();
            }
            this.field3865.method2279(var8, (byte) -80);
        } else if (this.method1720((byte) -90) < 20) {
            this.field3870.method2279(var8, (byte) -76);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)V", line = 50)
    public final void method1716(int arg0, boolean arg1) {
        field3855++;
        if (this.field3872 == null) {
            return;
        }
        try {
            int var3 = 61 % ((-arg0 - 21) / 51);
            this.field3875.field3129 = 0;
            this.field3875.method1365(-32769, arg1 ? 2 : 3);
            this.field3875.method1372(0, (byte) -126);
            this.field3872.method2101(this.field3875.field3128, (byte) 18, 0, 4);
        } catch (IOException var7) {
            try {
                this.field3872.method2095(8737);
            } catch (Exception var6) {
            }
            this.field3878 = -2;
            this.field3872 = null;
            this.field3877++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V", line = 77)
    public static final void method1717(int arg0, int arg1) {
        class226.field3589.method1625(arg0, (byte) 123);
        field3861++;
        if (arg1 != 0) {
            method1717(51, 114);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 94)
    public final void method1718(int arg0) {
        field3860++;
        if (this.field3872 == null) {
            return;
        }
        try {
            this.field3875.field3129 = 0;
            this.field3875.method1365(arg0 ^ 0xB09D, 7);
            this.field3875.method1372(0, (byte) -103);
            if (arg0 != -12446) {
                return;
            }
            this.field3872.method2101(this.field3875.field3128, (byte) 18, 0, 4);
        } catch (IOException var5) {
            try {
                this.field3872.method2095(8737);
            } catch (Exception var4) {
            }
            this.field3872 = null;
            this.field3877++;
            this.field3878 = -2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z", line = 122)
    public final boolean method1719(byte arg0) {
        if (this.field3872 != null) {
            long var2 = class304.method2128((byte) -76);
            int var4 = (int) (var2 - this.field3874);
            this.field3874 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3873 += var4;
            if (this.field3873 > 30000) {
                try {
                    this.field3872.method2095(8737);
                } catch (Exception var30) {
                }
                this.field3872 = null;
            }
        }
        field3858++;
        if (this.field3872 == null) {
            return this.method1728(4) == 0 && this.method1720((byte) -88) == 0;
        }
        try {
            if (arg0 >= -22) {
                this.method1722((byte) 27);
            }
            this.field3872.method2096((byte) -30);
            for (class239 var6 = (class239) this.field3865.method2286(-31893); var6 != null; var6 = (class239) this.field3865.method2285(false)) {
                this.field3875.field3129 = 0;
                this.field3875.method1365(-32769, 1);
                this.field3875.method1372((int) var6.field416, (byte) -112);
                this.field3872.method2101(this.field3875.field3128, (byte) 18, 0, 4);
                this.field3869.method2279(var6, (byte) -74);
            }
            for (class239 var7 = (class239) this.field3870.method2286(-31893); var7 != null; var7 = (class239) this.field3870.method2285(false)) {
                this.field3875.field3129 = 0;
                this.field3875.method1365(-32769, 0);
                this.field3875.method1372((int) var7.field416, (byte) -97);
                this.field3872.method2101(this.field3875.field3128, (byte) 18, 0, 4);
                this.field3871.method2279(var7, (byte) -72);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3872.method2100(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3873 = 0;
                byte var10 = 0;
                if (this.field3880 == null) {
                    var10 = 8;
                } else if (this.field3880.field3772 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field3879.field3129;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field3872.method2092(var11, 15167, this.field3879.field3128, this.field3879.field3129);
                    if (this.field3876 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3879.field3128[this.field3879.field3129 + var12] = (byte) class35.method228(this.field3879.field3128[this.field3879.field3129 + var12], this.field3876);
                        }
                    }
                    this.field3879.field3129 += var11;
                    if (var10 <= this.field3879.field3129) {
                        if (this.field3880 == null) {
                            this.field3879.field3129 = 0;
                            int var13 = this.field3879.method1399(-1172389784);
                            int var14 = this.field3879.method1396(-77);
                            int var15 = this.field3879.method1399(-1172389784);
                            long var16 = (long) ((var13 << 16) + var14);
                            Object var18 = null;
                            int var19 = this.field3879.method1354((byte) -125);
                            int var20 = var15 & 0x7F;
                            boolean var21 = (var15 & 0x80) != 0;
                            class239 var22;
                            if (var21) {
                                for (var22 = (class239) this.field3871.method2286(-31893); var22 != null && var22.field416 != var16; var22 = (class239) this.field3871.method2285(false)) {
                                }
                            } else {
                                for (var22 = (class239) this.field3869.method2286(-31893); var22 != null && var22.field416 != var16; var22 = (class239) this.field3869.method2285(false)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field3880 = var22;
                            int var23 = var20 == 0 ? 5 : 9;
                            this.field3880.field3774 = new class192(var19 + var23 + this.field3880.field3788);
                            this.field3880.field3774.method1365(-32769, var20);
                            this.field3880.field3774.method1350(var19, -61);
                            this.field3879.field3129 = 0;
                            this.field3880.field3772 = 8;
                        } else if (this.field3880.field3772 != 0) {
                            throw new IOException();
                        } else if (this.field3879.field3128[0] == -1) {
                            this.field3879.field3129 = 0;
                            this.field3880.field3772 = 1;
                        } else {
                            this.field3880 = null;
                        }
                    }
                } else {
                    int var24 = 512 - this.field3880.field3772;
                    int var25 = this.field3880.field3774.field3128.length - this.field3880.field3788;
                    if (var25 - this.field3880.field3774.field3129 < var24) {
                        var24 = var25 - this.field3880.field3774.field3129;
                    }
                    if (var24 > var9) {
                        var24 = var9;
                    }
                    this.field3872.method2092(var24, 15167, this.field3880.field3774.field3128, this.field3880.field3774.field3129);
                    if (this.field3876 != 0) {
                        for (int var26 = 0; var26 < var24; var26++) {
                            this.field3880.field3774.field3128[this.field3880.field3774.field3129 + var26] = (byte) class35.method228(this.field3880.field3774.field3128[this.field3880.field3774.field3129 + var26], this.field3876);
                        }
                    }
                    this.field3880.field3772 += var24;
                    this.field3880.field3774.field3129 += var24;
                    if (this.field3880.field3774.field3129 == var25) {
                        this.field3880.method189(0);
                        this.field3880.field624 = false;
                        this.field3880 = null;
                    } else if (this.field3880.field3772 == 512) {
                        this.field3880.field3772 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3872.method2095(8737);
            } catch (Exception var29) {
            }
            this.field3872 = null;
            this.field3877++;
            this.field3878 = -2;
            return this.method1728(4) == 0 && this.method1720((byte) -112) == 0;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I", line = 402)
    private final int method1720(byte arg0) {
        if (arg0 > -73) {
            return 5;
        } else {
            field3853++;
            return this.field3870.method2284(5916) + this.field3871.method2284(5916);
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)Z", line = 413)
    public final boolean method1721(byte arg0) {
        field3857++;
        if (arg0 != 65) {
            this.field3877 = -128;
        }
        return this.method1728(arg0 - 61) >= 20;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z", line = 429)
    public final boolean method1722(byte arg0) {
        if (arg0 != -66) {
            this.field3878 = 61;
        }
        field3867++;
        return this.method1720((byte) -119) >= 20;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ldm;ZZ)V", line = 443)
    public final void method1723(class300 arg0, boolean arg1, boolean arg2) {
        field3866++;
        if (this.field3872 != null) {
            try {
                this.field3872.method2095(8737);
            } catch (Exception var11) {
            }
            this.field3872 = null;
        }
        this.field3872 = arg0;
        this.method1729(0);
        this.method1716(-95, arg2);
        this.field3879.field3129 = 0;
        this.field3880 = null;
        while (true) {
            class239 var5 = (class239) this.field3869.method2283(33);
            if (var5 == null) {
                while (true) {
                    class239 var6 = (class239) this.field3871.method2283(33);
                    if (var6 == null) {
                        if (this.field3876 != 0) {
                            try {
                                this.field3875.field3129 = 0;
                                this.field3875.method1365(-32769, 4);
                                this.field3875.method1365(-32769, this.field3876);
                                this.field3875.method1368(0, 4796);
                                this.field3872.method2101(this.field3875.field3128, (byte) 18, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field3872.method2095(8737);
                                } catch (Exception var9) {
                                }
                                this.field3878 = -2;
                                this.field3872 = null;
                                this.field3877++;
                            }
                        }
                        this.field3873 = 0;
                        if (arg1) {
                            return;
                        } else {
                            this.field3874 = class304.method2128((byte) -93);
                            return;
                        }
                    }
                    this.field3870.method2279(var6, (byte) -110);
                }
            }
            this.field3865.method2279(var5, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Ljava/lang/String;", line = 510)
    public static final String method1724(int arg0, int arg1, int arg2) {
        field3850++;
        if (arg2 > -116) {
            method1717(60, -98);
        }
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 <= 3) {
            return var3 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
        } else {
            return "<col=80ff00>";
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V", line = 554)
    public final void method1725(byte arg0) {
        if (this.field3872 != null) {
            this.field3872.method2095(8737);
        }
        field3851++;
        if (arg0 > -46) {
            this.method1727(103);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 568)
    public final void method1726(int arg0) {
        field3856++;
        try {
            this.field3872.method2095(8737);
        } catch (Exception var4) {
        }
        this.field3878 = -1;
        this.field3877++;
        int var3 = -111 % ((47 - arg0) / 53);
        this.field3872 = null;
        this.field3876 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V", line = 585)
    public final void method1727(int arg0) {
        if (this.field3872 != null) {
            this.field3872.method2102(114);
        }
        if (arg0 != -7933) {
            this.method1726(7);
        }
        field3862++;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)I", line = 603)
    public final int method1728(int arg0) {
        field3868++;
        if (arg0 != 4) {
            this.field3870 = (class330) null;
        }
        return this.field3865.method2284(5916) + this.field3869.method2284(5916);
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V", line = 618)
    private final void method1729(int arg0) {
        field3852++;
        if (this.field3872 == null) {
            return;
        }
        try {
            this.field3875.field3129 = 0;
            this.field3875.method1365(-32769, 6);
            this.field3875.method1372(3, (byte) -117);
            this.field3872.method2101(this.field3875.field3128, (byte) 18, arg0, 4);
        } catch (IOException var5) {
            try {
                this.field3872.method2095(8737);
            } catch (Exception var4) {
            }
            this.field3872 = null;
            this.field3878 = -2;
            this.field3877++;
        }
    }
}
