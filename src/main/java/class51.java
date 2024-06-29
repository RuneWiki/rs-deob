import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class51 extends class52 {

    @OriginalMember(owner = "client!f", name = "Ib", descriptor = "Lrf;")
    public static class163 field1009 = class53.method392(-64, " loggt sich ein)3");

    @OriginalMember(owner = "client!f", name = "Wb", descriptor = "I")
    public static int field1023 = 0;

    @OriginalMember(owner = "client!f", name = "Ub", descriptor = "Lad;")
    public static class5 field1021 = new class5();

    @OriginalMember(owner = "client!f", name = "Yb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1025 = Calendar.getInstance();

    @OriginalMember(owner = "client!f", name = "Jb", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!f", name = "Kb", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!f", name = "Lb", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!f", name = "Mb", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!f", name = "Nb", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!f", name = "Ob", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!f", name = "Pb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!f", name = "Qb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!f", name = "Rb", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!f", name = "Sb", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!f", name = "Tb", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!f", name = "Vb", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!f", name = "Xb", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!f", name = "Zb", descriptor = "Lwc;")
    private class205 field1026;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILrf;II)V")
    public static final void method325(int arg0, int arg1, class163 arg2, int arg3, int arg4) {
        ++field1011;
        class84 var5 = class48.method298(arg1, arg4, 0);
        if (var5 != null) {
            if (var5.field1792 != null) {
                class118 var6 = new class118();
                var6.field2500 = var5;
                var6.field2499 = arg3;
                var6.field2502 = var5.field1792;
                var6.field2506 = arg2;
                class64.method458((byte) -102, var6);
            }
            boolean var7 = true;
            if (~var5.field1830 < -1) {
                var7 = class97.method673(2, var5);
            }
            if (arg0 == 112) {
                if (var7) {
                    if (class38.method240(65535, arg3 - 1, class21.method130(var5, (byte) 77))) {
                        if (arg3 == 1) {
                            class141.field2896.method326(104, 136);
                            class141.field2896.method369(arg1, (byte) -115);
                            ++class107.field2214;
                            class141.field2896.method346(0, arg4);
                        }
                        if (arg3 == 2) {
                            ++class147.field3014;
                            class141.field2896.method326(104, 106);
                            class141.field2896.method369(arg1, (byte) -126);
                            class141.field2896.method346(arg0 + -112, arg4);
                        }
                        if (~arg3 == -4) {
                            class141.field2896.method326(arg0 ^ 24, 102);
                            class141.field2896.method369(arg1, (byte) -125);
                            ++class138.field2845;
                            class141.field2896.method346(0, arg4);
                        }
                        if (~arg3 == -5) {
                            ++class34.field658;
                            class141.field2896.method326(104, 32);
                            class141.field2896.method369(arg1, (byte) -112);
                            class141.field2896.method346(arg0 + -112, arg4);
                        }
                        if (~arg3 == -6) {
                            ++class113.field2388;
                            class141.field2896.method326(arg0 ^ 24, 112);
                            class141.field2896.method369(arg1, (byte) -125);
                            class141.field2896.method346(0, arg4);
                        }
                        if (arg3 == 6) {
                            ++class17.field290;
                            class141.field2896.method326(arg0 ^ 24, 115);
                            class141.field2896.method369(arg1, (byte) -111);
                            class141.field2896.method346(arg0 + -112, arg4);
                        }
                        if (arg3 == 7) {
                            class141.field2896.method326(104, 31);
                            class141.field2896.method369(arg1, (byte) -121);
                            class141.field2896.method346(0, arg4);
                            ++class206.field4033;
                        }
                        if (arg3 == 8) {
                            ++class121.field2538;
                            class141.field2896.method326(104, 35);
                            class141.field2896.method369(arg1, (byte) -110);
                            class141.field2896.method346(arg0 + -112, arg4);
                        }
                        if (~arg3 == -10) {
                            class141.field2896.method326(104, 113);
                            class141.field2896.method369(arg1, (byte) -120);
                            ++class10.field196;
                            class141.field2896.method346(0, arg4);
                        }
                        if (arg3 == 10) {
                            ++class146.field2979;
                            class141.field2896.method326(104, 218);
                            class141.field2896.method369(arg1, (byte) -121);
                            class141.field2896.method346(0, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(II)V")
    public final void method326(int arg0, int arg1) {
        super.field1054[super.field1033++] = (byte) (this.field1026.method1343(2) + arg1);
        if (arg0 != 104) {
            field1025 = null;
        }
        ++field1017;
    }

    @OriginalMember(owner = "client!f", name = "l", descriptor = "(B)V")
    public static void method327(byte arg0) {
        if (arg0 != -65) {
            method329((byte) -32);
        }
        field1025 = null;
        field1021 = null;
        field1009 = null;
    }

    @OriginalMember(owner = "client!f", name = "q", descriptor = "(I)V")
    public final void method328(int arg0) {
        if (arg0 <= -86) {
            ++field1010;
            this.field1022 = super.field1033 * 8;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V")
    public class51(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!f", name = "m", descriptor = "(B)I")
    public static final int method329(byte arg0) {
        ++field1018;
        if (arg0 != -92) {
            method325(48, 78, (class163) null, -79, -105);
        }
        return 6;
    }

    @OriginalMember(owner = "client!f", name = "n", descriptor = "(B)V")
    public static final void method330(byte arg0) {
        class103.field2168 = new int[104];
        class102.field2138 = new byte[4][104][104];
        class36.field701 = new int[104];
        ++field1013;
        class144.field2959 = new int[104];
        class26.field488 = new byte[4][104][104];
        if (arg0 < 79) {
            method325(-78, -109, (class163) null, 82, 123);
        }
        class38.field783 = new int[104];
        class64.field1362 = new byte[4][104][104];
        class40.field829 = new int[4][105][105];
        class43.field884 = new byte[4][104][104];
        class70.field1473 = new byte[4][105][105];
        class53.field1098 = new int[104];
        class132.field2751 = 99;
    }

    @OriginalMember(owner = "client!f", name = "i", descriptor = "(II)I")
    public final int method331(int arg0, int arg1) {
        ++field1020;
        int var3 = this.field1022 >> 3;
        int var4 = 0;
        int var5 = -(7 & this.field1022) + 8;
        if (arg1 != -2055311549) {
            this.method333(-92, (int[]) null);
        }
        this.field1022 += arg0;
        while (var5 < arg0) {
            var4 += (class77.field1590[var5] & super.field1054[var3++]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg0 == ~var5) {
            var6 = (super.field1054[var3] & class77.field1590[var5]) + var4;
        } else {
            var6 = (super.field1054[var3] >> -arg0 + var5 & class77.field1590[arg0]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!f", name = "j", descriptor = "(II)I")
    public final int method332(int arg0, int arg1) {
        ++field1019;
        return arg1 <= 122 ? -38 : arg0 * 8 - this.field1022;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[I)V")
    public final void method333(int arg0, int[] arg1) {
        this.field1026 = new class205(arg1);
        if (arg0 != 104) {
            this.field1022 = 93;
        }
        ++field1012;
    }

    @OriginalMember(owner = "client!f", name = "r", descriptor = "(I)V")
    public final void method334(int arg0) {
        super.field1033 = (this.field1022 - arg0) / 8;
        ++field1015;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(Z)I")
    public final int method335(boolean arg0) {
        if (!arg0) {
            this.field1022 = -45;
        }
        ++field1016;
        return 255 & super.field1054[super.field1033++] + -this.field1026.method1343(2);
    }
}
