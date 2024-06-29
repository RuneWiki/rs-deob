import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class234 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
    public boolean field3644 = false;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
    public boolean field3642 = false;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field3647 = -1;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    private int field3650 = 128;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    private int field3649 = 0;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    private int field3654 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    private int field3651 = 128;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    private int field3661 = 0;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3641 = 64;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lma;")
    public static class5 field3657 = new class5();

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[J")
    public static long[] field3660 = new long[500];

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3663 = "Loaded world list data";

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    private int field3656;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[S")
    private short[] field3645;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[S")
    private short[] field3655;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "[S")
    private short[] field3658;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "[S")
    private short[] field3659;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lvl;BI)V", line = 7)
    private final void method1679(class6 arg0, byte arg1, int arg2) {
        field3646++;
        if (arg1 > -110) {
            this.method1682((class6) null, (byte) 116);
        }
        if (arg2 == 1) {
            this.field3656 = arg0.method39((byte) 78);
        } else if (arg2 == 2) {
            this.field3647 = arg0.method39((byte) 122);
        } else if (arg2 == 4) {
            this.field3650 = arg0.method39((byte) 39);
        } else if (arg2 == 5) {
            this.field3651 = arg0.method39((byte) 76);
        } else if (arg2 == 6) {
            this.field3649 = arg0.method39((byte) 34);
        } else if (arg2 == 7) {
            this.field3654 = arg0.method58(-288140008);
        } else if (arg2 == 8) {
            this.field3661 = arg0.method58(-288140008);
        } else if (arg2 == 9) {
            this.field3642 = true;
        } else if (arg2 == 10) {
            this.field3644 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method58(-288140008);
            this.field3645 = new short[var4];
            this.field3658 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3645[var5] = (short) arg0.method39((byte) 76);
                this.field3658[var5] = (short) arg0.method39((byte) 107);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method58(-288140008);
            this.field3659 = new short[var6];
            this.field3655 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3659[var7] = (short) arg0.method39((byte) 109);
                this.field3655[var7] = (short) arg0.method39((byte) 27);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 113)
    public static void method1680(int arg0) {
        field3663 = null;
        if (arg0 != 0) {
            field3641 = -32;
        }
        field3660 = null;
        field3657 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBII)V", line = 127)
    public static final void method1681(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class144.field2277 != 0 && arg3 != 0 && class43.field600 < 50 && arg1 != -1) {
            class237.field3725[class43.field600] = arg1;
            class334.field5207[class43.field600] = arg3;
            class86.field1161[class43.field600] = arg4;
            class121.field1715[class43.field600] = null;
            class22.field347[class43.field600] = 0;
            class161.field2556[class43.field600] = arg0;
            class43.field600++;
        }
        field3653++;
        if (arg2 != 39) {
            field3660 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lvl;B)V", line = 165)
    public final void method1682(class6 arg0, byte arg1) {
        field3648++;
        if (arg1 <= 89) {
            method1680(-57);
        }
        while (true) {
            int var3 = arg0.method58(-288140008);
            if (var3 == 0) {
                return;
            }
            this.method1679(arg0, (byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)Ljf;", line = 207)
    public final class89 method1683(int arg0, int arg1, int arg2, int arg3) {
        field3652++;
        class89 var5 = (class89) class26.field385.method1351((long) this.field3640, 63);
        if (arg0 != 19687) {
            return (class89) null;
        }
        if (var5 == null) {
            class165 var6 = class165.method1235(class158.field2456, this.field3656, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3645 != null) {
                for (int var7 = 0; var7 < this.field3645.length; var7++) {
                    var6.method1229(this.field3645[var7], this.field3658[var7]);
                }
            }
            if (this.field3659 != null) {
                for (int var8 = 0; var8 < this.field3659.length; var8++) {
                    var6.method1224(this.field3659[var8], this.field3655[var8]);
                }
            }
            var5 = var6.method1226(this.field3654 + 64, this.field3661 + 850, -30, -50, -30);
            class26.field385.method1347(var5, (long) this.field3640, (byte) -119);
        }
        class89 var9;
        if (this.field3647 == -1 || arg3 == -1) {
            var9 = var5.method381(true, true, true);
        } else {
            var9 = class295.method2064(0, this.field3647).method1990(var5, arg3, arg2, 120, arg1);
        }
        if (this.field3650 != 128 || this.field3651 != 128) {
            var9.method398(this.field3650, this.field3651, this.field3650);
        }
        if (this.field3649 != 0) {
            if (this.field3649 == 90) {
                var9.method419();
            }
            if (this.field3649 == 180) {
                var9.method406();
            }
            if (this.field3649 == 270) {
                var9.method412();
            }
        }
        return var9;
    }
}
