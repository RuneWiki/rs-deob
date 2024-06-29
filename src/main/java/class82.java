import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class82 extends class68 {

    @OriginalMember(owner = "client!m", name = "Kb", descriptor = "I")
    private int field2020;

    @OriginalMember(owner = "client!m", name = "Ib", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!m", name = "yb", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!m", name = "Bb", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!m", name = "Cb", descriptor = "I")
    private int field2012;

    @OriginalMember(owner = "client!m", name = "tb", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!m", name = "ub", descriptor = "I")
    private int field2004;

    @OriginalMember(owner = "client!m", name = "vb", descriptor = "Lka;")
    private class70 field2005;

    @OriginalMember(owner = "client!m", name = "xb", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!m", name = "wb", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!m", name = "zb", descriptor = "Lmb;")
    public static class84 field2009 = class79.method672(true, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!m", name = "Jb", descriptor = "I")
    public static int field2019 = 1;

    @OriginalMember(owner = "client!m", name = "Gb", descriptor = "Lmb;")
    public static class84 field2016 = class79.method672(true, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!m", name = "Db", descriptor = "Lmb;")
    private static class84 field2013 = class79.method672(true, "Checking for updates )2 ");

    @OriginalMember(owner = "client!m", name = "Eb", descriptor = "Lmb;")
    public static class84 field2014 = field2013;

    @OriginalMember(owner = "client!m", name = "sb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!m", name = "Hb", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!m", name = "Lb", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!m", name = "Mb", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!m", name = "Ab", descriptor = "Lge;")
    public static class47 field2010;

    @OriginalMember(owner = "client!m", name = "Fb", descriptor = "[I")
    public static int[] field2015;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lia;I)Z")
    public static final boolean method689(class57 arg0, int arg1) {
        field2022++;
        int var2 = arg0.field1382;
        if (class77.field1933 == 2) {
            if (var2 == 201) {
                class92.field2289 = 0;
                class95.field2350 = class52.field1187;
                class65.field1615 = true;
                class95.field2367 = class95.field2361;
                class11.field179 = 1;
                class111.field2683 = true;
            }
            if (var2 == 202) {
                class95.field2367 = class95.field2361;
                class65.field1615 = true;
                class92.field2289 = 0;
                class95.field2350 = class24.field562;
                class11.field179 = 2;
                class111.field2683 = true;
            }
        }
        if (var2 == 205) {
            class95.field2363 = 250;
            return true;
        }
        if (var2 == 501) {
            class111.field2683 = true;
            class11.field179 = 4;
            class65.field1615 = true;
            class92.field2289 = 0;
            class95.field2367 = class95.field2361;
            class95.field2350 = class27.field648;
        }
        if (var2 == 502) {
            class95.field2350 = class83.field2023;
            class95.field2367 = class95.field2361;
            class11.field179 = 5;
            class111.field2683 = true;
            class92.field2289 = 0;
            class65.field1615 = true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class44.field966.method424(var3, (byte) 108, var4 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class44.field966.method431((byte) -7, var6 == 1, var5);
        }
        if (var2 == 324) {
            class44.field966.method428((byte) 90, false);
        }
        int var7 = -104 / ((arg1 + 43) / 60);
        if (var2 == 325) {
            class44.field966.method428((byte) 104, true);
        }
        if (var2 == 326) {
            class74.field1820++;
            class80.field1978.method769((byte) -94, 66);
            class44.field966.method425(true, class80.field1978);
            return true;
        }
        if (var2 == 620) {
            class20.field411 = !class20.field411;
        }
        if (var2 >= 601 && var2 <= 613) {
            class133.method1069(-1);
            if (class95.field2345.method718(95) > 0) {
                class53.field1199++;
                class80.field1978.method769((byte) 84, 243);
                class80.field1978.method419(false, class95.field2345.method700((byte) 25));
                class80.field1978.method393(var2 - 601, -17343);
                class80.field1978.method393(class20.field411 ? 1 : 0, -17343);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static void method690(byte arg0) {
        field2016 = null;
        field2015 = null;
        field2014 = null;
        field2010 = null;
        field2013 = null;
        if (arg0 >= -62) {
            method690((byte) 110);
        }
        field2009 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lsd;Lsd;ZB)V")
    public static final void method691(class122 arg0, class122 arg1, boolean arg2, byte arg3) {
        class38.field833 = arg2;
        class123.field2973 = arg0;
        int var4 = -40 % ((arg3 - 54) / 63);
        class87.field2159 = arg1;
        field2002++;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)Ldd;")
    public final class26 method89(int arg0) {
        field2021++;
        if (this.field2005 != null) {
            int var2 = class5.field100 - this.field2007;
            if (var2 > 100 && this.field2005.field1724 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field2005.field1716[this.field2006] >= var2) {
                            break label42;
                        }
                        var2 -= this.field2005.field1716[this.field2006];
                        this.field2006++;
                    } while (this.field2006 < this.field2005.field1706.length);
                    this.field2006 -= this.field2005.field1724;
                } while (this.field2006 >= 0 && this.field2006 < this.field2005.field1706.length);
                this.field2005 = null;
            }
            this.field2007 = class5.field100 - var2;
        }
        class36 var3 = class77.method661(this.field2004, -104);
        if (var3.field802 != null) {
            var3 = var3.method269(-1);
        }
        if (arg0 != -6767) {
            this.method89(-94);
        }
        return var3 == null ? null : var3.method264(this.field2005, -41, this.field2011, this.field2012, this.field2018, this.field2020, this.field2006, this.field2003, this.field2008);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIIZLjf;)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class68 arg9) {
        this.field2020 = arg4;
        this.field2018 = arg1;
        this.field2008 = arg5;
        this.field2011 = arg3;
        this.field2012 = arg2;
        this.field2003 = arg6;
        this.field2004 = arg0;
        if (arg7 != -1) {
            this.field2005 = class79.method673(arg7, false);
            this.field2007 = class5.field100 - 1;
            this.field2006 = 0;
            if (this.field2005.field1710 == 0 && arg9 != null && arg9 instanceof class82) {
                class82 var11 = (class82) arg9;
                if (this.field2005 == var11.field2005) {
                    this.field2006 = var11.field2006;
                    this.field2007 = var11.field2007;
                    return;
                }
            }
            if (arg8 && this.field2005.field1724 != -1) {
                this.field2006 = (int) ((double) this.field2005.field1706.length * Math.random());
                this.field2007 -= (int) (Math.random() * (double) this.field2005.field1716[this.field2006]);
                return;
            }
        }
    }
}
