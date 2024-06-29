import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class65 extends class476 {

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "Z")
    private boolean field900 = false;

    @OriginalMember(owner = "client!rba", name = "H", descriptor = "I")
    private int field919 = 0;

    @OriginalMember(owner = "client!rba", name = "P", descriptor = "Z")
    public boolean field926 = false;

    @OriginalMember(owner = "client!rba", name = "O", descriptor = "Lon;")
    public class595 field925;

    @OriginalMember(owner = "client!rba", name = "K", descriptor = "J")
    private long field922;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "Lqp;")
    public class585 field904;

    @OriginalMember(owner = "client!rba", name = "I", descriptor = "Leg;")
    public class48 field920;

    @OriginalMember(owner = "client!rba", name = "B", descriptor = "Led;")
    public class115 field913;

    @OriginalMember(owner = "client!rba", name = "L", descriptor = "Liu;")
    public static class517 field923 = new class517(81, 4);

    @OriginalMember(owner = "client!rba", name = "R", descriptor = "Lbv;")
    public static class567 field928 = new class567("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
    private int field909;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!rba", name = "C", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "client!rba", name = "D", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!rba", name = "E", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!rba", name = "F", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!rba", name = "G", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!rba", name = "J", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!rba", name = "N", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!rba", name = "Q", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public final void method508(byte arg0) {
        this.field914 = this.field925.field8461;
        this.field905 = this.field925.field8460;
        this.field898 = this.field925.field8477;
        this.field917 = this.field925.field8478;
        this.field897 = this.field925.field8462;
        this.field916 = this.field925.field8472;
        this.field907 = this.field925.field8470;
        if (arg0 <= 36) {
            this.method508((byte) 20);
        }
        this.field908 = this.field925.field8479;
        field924++;
        this.field901 = this.field925.field8475;
        if (this.field917 == this.field905 && this.field917 == this.field898 && this.field908 == this.field901 && this.field916 == this.field908 && this.field914 == this.field907 && this.field914 == this.field897) {
            this.field900 = true;
            return;
        }
        this.field900 = false;
        int var2 = (this.field917 + this.field905 + this.field898) / 3;
        int var3 = (this.field908 + this.field901 + this.field916) / 3;
        int var4 = (this.field907 - (-this.field914 - this.field897)) / 3;
        if (this.field896 == var2 && this.field927 == var3 && this.field906 == var4) {
            return;
        }
        this.field906 = var4;
        this.field927 = var3;
        this.field896 = var2;
        int var5 = this.field917 - this.field905;
        int var6 = this.field908 - this.field901;
        int var7 = this.field914 - this.field907;
        int var8 = this.field898 - this.field905;
        int var9 = this.field916 - this.field901;
        int var10 = this.field897 - this.field907;
        this.field899 = var6 * var10 - (var7 * var9);
        this.field910 = var7 * var8 - (var5 * var10);
        this.field911 = var5 * var9 - (var6 * var8);
        while (this.field899 > 32767 || this.field910 > 32767 || this.field911 > 32767 || this.field899 < -32767 || this.field910 < -32767 || this.field911 < -32767) {
            this.field910 >>= 0x1;
            this.field911 >>= 0x1;
            this.field899 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field911 * this.field911 + this.field910 * this.field910 + this.field899 * this.field899));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field899 = this.field899 * 32767 / var11;
        this.field911 = this.field911 * 32767 / var11;
        this.field910 = this.field910 * 32767 / var11;
        if (this.field920.field713 <= 0 && this.field920.field714 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field911, (double) this.field899) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field910, Math.sqrt((double) (this.field911 * this.field911 + this.field899 * this.field899))) * 2607.5945876176133D);
        this.field912 = this.field920.field713 - this.field920.field727;
        this.field909 = var12 - ((this.field912 >> 1) - this.field920.field727);
        this.field903 = this.field920.field714 - this.field920.field682;
        this.field895 = this.field920.field682 + var13 - (this.field903 >> 1);
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)V")
    public static void method509(int arg0) {
        field923 = null;
        field928 = null;
        if (arg0 != 1) {
            method509(-44);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(BLqa;JZI)V")
    public final void method510(byte arg0, class167 arg1, long arg2, boolean arg3, int arg4) {
        field921++;
        if (this.field926) {
            arg3 = false;
        } else if (this.field920.field706 > class507.field7055) {
            arg3 = false;
        } else if (class143.field2223[class507.field7055] < class600.field8521) {
            arg3 = false;
        } else if (this.field900) {
            arg3 = false;
        } else if (this.field920.field699 != -1) {
            int var7 = (int) (arg2 - this.field922);
            if (this.field920.field693 || var7 <= this.field920.field699) {
                var7 %= this.field920.field699;
            } else {
                arg3 = false;
            }
            if (!this.field920.field708 && this.field920.field712 > var7) {
                arg3 = false;
            }
            if (this.field920.field708 && this.field920.field712 <= var7) {
                arg3 = false;
            }
        }
        if (arg3) {
            this.field919 += (int) (((double) this.field920.field695 + Math.random() * (double) (this.field920.field705 - this.field920.field695)) * (double) arg4);
            if (this.field919 > 63) {
                int var8 = this.field919 >> 6;
                this.field919 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field920.field713 <= 0 && this.field920.field714 <= 0) {
                        var10 = this.field899;
                        var11 = this.field911;
                        var12 = this.field910;
                    } else {
                        int var13 = this.field909 + (int) (Math.random() * (double) this.field912);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class285.field4154[var14];
                        int var16 = class285.field4152[var14];
                        int var17 = this.field895 + (int) (Math.random() * (double) this.field903);
                        int var18 = var17 & 0x1FFF;
                        int var19 = class285.field4154[var18];
                        int var20 = class285.field4152[var18];
                        byte var21 = 15;
                        var10 = var16 * var19 >> var21;
                        var12 = (var20 << 0) * -1;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field898 * (long) var24 + (long) this.field917 * (long) var23 + (long) this.field905 * (long) var22 >> 16);
                    int var26 = (int) ((long) this.field908 * (long) var23 + (long) this.field901 * (long) var22 + ((long) this.field916 * (long) var24) >> 16);
                    int var27 = (int) ((long) this.field914 * (long) var23 + (long) this.field907 * (long) var22 + (long) this.field897 * (long) var24 >> 16);
                    int var28 = (int) ((double) (this.field920.field694 - this.field920.field734) * Math.random()) + this.field920.field734;
                    int var29 = (int) (Math.random() * (double) (this.field920.field717 - this.field920.field677)) + this.field920.field677;
                    int var30 = (int) ((double) (this.field920.field731 - this.field920.field678) * Math.random()) + this.field920.field678;
                    int var33;
                    if (this.field920.field668) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field920.field728 * var31 + (double) this.field920.field679) << 16 | (int) ((double) this.field920.field669 * var31 + (double) this.field920.field692) << 8 | (int) ((double) this.field920.field730 * var31 + (double) this.field920.field676) | (int) ((double) this.field920.field711 + (double) this.field920.field718 * Math.random()) << 24;
                    } else {
                        var33 = (int) ((double) this.field920.field676 + Math.random() * (double) this.field920.field730) | (int) ((double) this.field920.field728 * Math.random() + (double) this.field920.field679) << 16 | (int) (Math.random() * (double) this.field920.field669 + (double) this.field920.field692) << 8 | (int) (Math.random() * (double) this.field920.field718 + (double) this.field920.field711) << 24;
                    }
                    int var34 = this.field920.field724;
                    if (!arg1.method524() && !this.field920.field720) {
                        var34 = -1;
                    }
                    if (client.field8783 == class645.field9382) {
                        new class22(this, var25, var26, var27, var10, var12, var11, var28, var29, var33, var30, var34, this.field920.field672, this.field920.field689);
                    } else {
                        class22 var35 = class358.field5088[client.field8783];
                        client.field8783 = client.field8783 + 1 & 0x3FF;
                        var35.method233(this, var25, var26, var27, var10, var12, var11, var28, var29, var33, var30, var34, this.field920.field672, this.field920.field689);
                    }
                }
            }
        }
        this.field915 = 0;
        if (arg0 != -28) {
            return;
        }
        for (class22 var37 = (class22) this.field913.method944(arg0 ^ 0x61); var37 != null; var37 = (class22) this.field913.method947((byte) 121)) {
            var37.method235(arg2, arg4);
            this.field915++;
        }
        class150.field2268 += this.field915;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(JLqa;B)V")
    public final void method511(long arg0, class167 arg1, byte arg2) {
        for (class22 var5 = (class22) this.field913.method944(-126); var5 != null; var5 = (class22) this.field913.method947((byte) -28)) {
            var5.method232(arg1, arg0);
        }
        field918++;
        if (arg2 != 106) {
            this.method511(-81L, null, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lqa;Lon;Lqp;J)V")
    public class65(class167 arg0, class595 arg1, class585 arg2, long arg3) {
        this.field925 = arg1;
        this.field922 = arg3;
        this.field904 = arg2;
        this.field920 = this.field925.method3400(30847);
        if (!arg0.method524() && this.field920.field702 != -1) {
            this.field920 = class111.method922(this.field920.field702, (byte) -85);
        }
        this.field913 = new class115();
        this.field919 = (int) ((double) this.field919 + Math.random() * 64.0D);
        this.method508((byte) 94);
    }
}
