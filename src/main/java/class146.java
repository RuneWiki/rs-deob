import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class146 extends class290 {

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    private int field2017;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    private int field2020;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    private int field2010;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    private int field2021;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lnj;")
    public static class223 field2007;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[B")
    private byte[] field2014;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 11)
    public final void method1049(byte arg0) {
        if (arg0 != -25) {
            method1053(false);
        }
        this.field2018 = 0;
        field2015++;
        this.field2021 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 31)
    public final void method1050(int arg0) {
        field2013++;
        this.field2020 = this.field2011;
        this.field2021 >>= 0x4;
        if (this.field2021 < 0) {
            this.field2021 = 0;
        } else if (this.field2021 > 255) {
            this.field2021 = 255;
        }
        this.method1052(this.field2018++, (byte) this.field2021);
        this.field2021 = 0;
        if (arg0 < 120) {
            this.method1049((byte) 48);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)V", line = 53)
    public final void method1051(byte arg0, int arg1, int arg2) {
        if (arg0 != -125) {
            this.field2021 = -102;
        }
        field2019++;
        if (arg2 == 0) {
            this.field2010 = this.field2017 - (arg1 >= 0 ? arg1 : -arg1);
            this.field2010 = this.field2010 * this.field2010 >> 12;
            this.field2008 = 4096;
            this.field2021 = this.field2010;
            return;
        }
        this.field2008 = this.field2022 * this.field2010 >> 12;
        if (this.field2008 < 0) {
            this.field2008 = 0;
        } else if (this.field2008 > 4096) {
            this.field2008 = 4096;
        }
        this.field2010 = this.field2017 - (arg1 >= 0 ? arg1 : -arg1);
        this.field2010 = this.field2010 * this.field2010 >> 12;
        this.field2010 = this.field2010 * this.field2008 >> 12;
        this.field2021 += this.field2020 * this.field2010 >> 12;
        this.field2020 = this.field2020 * this.field2011 >> 12;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V", line = 88)
    public void method1052(int arg0, byte arg1) {
        this.field2014[arg0] = arg1;
        field2012++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V", line = 96)
    public static void method1053(boolean arg0) {
        field2007 = null;
        if (!arg0) {
            method1054(72, 23, -89, -97);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 107)
    public static final int method1054(int arg0, int arg1, int arg2, int arg3) {
        field2016++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == arg2) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIFFF)V", line = 131)
    public class146(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2022 = (int) (arg7 * 4096.0F);
        this.field2017 = (int) (arg6 * 4096.0F);
        this.field2020 = this.field2011 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
