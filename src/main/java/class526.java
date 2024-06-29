import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class526 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "B")
    public byte field7741 = 0;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    private int field7749 = 128;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field7752 = -1;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    private int field7744 = -1;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
    public boolean field7743 = false;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    private int field7750 = 0;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    private int field7751 = 0;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    private int field7739 = 0;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    private int field7762 = 128;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lnk;")
    public static class326 field7755 = new class326(67, -1);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field7742;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    private int field7753;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Ldt;")
    public class434 field7763;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[S")
    private short[] field7737;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[S")
    private short[] field7745;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "[S")
    private short[] field7756;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "[S")
    private short[] field7759;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "[[I")
    public static int[][] field7761;

    static {
        new class306(null, "geschickt werden.", null, null);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lia;I)V", line = 6)
    public final void method3114(class23 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method126((byte) -83);
            if (var3 == 0) {
                field7754++;
                if (arg1 >= -105) {
                    this.method3122((byte) -82, null, -111);
                    return;
                }
                return;
            }
            this.method3122((byte) 117, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILtl;Lza;III)Le;", line = 26)
    public final class530 method3115(int arg0, int arg1, class91 arg2, class491 arg3, int arg4, int arg5, int arg6) {
        field7746++;
        if (arg5 != -6415) {
            method3117(null, (byte) 24);
        }
        return this.method3119(arg0, null, arg4, 0, arg1, false, -14949, arg2, (byte) 2, 0, null, arg6, 0, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 45)
    public static void method3116(byte arg0) {
        field7761 = null;
        if (arg0 >= 2) {
            field7755 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BB)[B", line = 56)
    public static final byte[] method3117(byte[] arg0, byte arg1) {
        if (arg1 > -108) {
            field7761 = null;
        }
        field7764++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class85.method613(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILza;IIILtl;I)Le;", line = 74)
    public final class530 method3118(int arg0, class491 arg1, int arg2, int arg3, int arg4, class91 arg5, int arg6) {
        if (arg2 > -34) {
            this.field7737 = null;
        }
        field7740++;
        return this.method3119(arg6, null, arg3, 0, arg4, false, -14949, arg5, (byte) 5, 0, null, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILya;IIIZILtl;BILya;IILza;)Le;", line = 93)
    private final class530 method3119(int arg0, class220 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class91 arg7, byte arg8, int arg9, class220 arg10, int arg11, int arg12, class491 arg13) {
        field7747++;
        int var15 = arg0;
        class145 var16 = this.field7752 == -1 || arg4 == -1 ? null : arg7.method634(-1271654143, this.field7752);
        boolean var17 = arg5 & this.field7741 != 0;
        if (var16 != null) {
            var15 = arg0 | var16.method1053(1024, false, arg11, arg4);
        }
        if (var17) {
            var15 |= this.field7741 == 3 ? 7 : 2;
        }
        if (this.field7749 != 128) {
            var15 |= 0x2;
        }
        if (this.field7762 != 128 || this.field7739 != 0) {
            var15 |= 0x5;
        }
        class231 var18 = this.field7763.field6484;
        class530 var19;
        synchronized (this.field7763.field6484) {
            var19 = (class530) this.field7763.field6484.method1593((byte) 110, (long) (this.field7742 |= arg13.field7164 << 29));
        }
        if (var19 == null || arg13.method902(var19.method741(), var15) != 0) {
            if (var19 != null) {
                var15 = arg13.method878(var15, var19.method741());
            }
            int var20 = var15;
            if (this.field7756 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field7737 != null) {
                var20 |= 0x8000;
            }
            class227 var21 = class280.method1839(arg6 ^ 0xFFFFC599, 0, this.field7763.field6482, this.field7753);
            if (var21 == null) {
                return null;
            }
            if (var21.field3936 < 13) {
                var21.method1571(arg6 ^ 0x22F3, 0);
            }
            var19 = arg13.method875(var21, var20, this.field7763.field6485, this.field7751 + 64, this.field7750 + 850);
            if (this.field7756 != null) {
                for (int var22 = 0; var22 < this.field7756.length; var22++) {
                    var19.method728(this.field7756[var22], this.field7759[var22]);
                }
            }
            if (this.field7737 != null) {
                for (int var23 = 0; var23 < this.field7737.length; var23++) {
                    var19.method765(this.field7737[var23], this.field7745[var23]);
                }
            }
            var19.method762(var15);
            class231 var24 = this.field7763.field6484;
            synchronized (this.field7763.field6484) {
                this.field7763.field6484.method1595(var19, (long) (this.field7742 |= arg13.field7164 << 29), (byte) 92);
            }
        }
        if (arg6 != -14949) {
            return null;
        }
        class530 var25 = var16 == null ? var19.method739(arg8, var15, true) : var16.method1058(var19, arg11, arg4, 0, arg2, (byte) 65, arg8, var15);
        if (this.field7762 != 128 || this.field7749 != 128) {
            var25.method768(this.field7762, this.field7749, this.field7762);
        }
        if (this.field7739 != 0) {
            if (this.field7739 == 90) {
                var25.method756(4096);
            }
            if (this.field7739 == 180) {
                var25.method756(8192);
            }
            if (this.field7739 == 270) {
                var25.method756(12288);
            }
        }
        if (var17) {
            var25.method767(this.field7741, this.field7744, arg10, arg1, arg9, arg3, arg12);
        }
        var25.method762(arg0);
        return var25;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V", line = 219)
    public static final void method3120(int arg0, int arg1) {
        field7758++;
        class266 var2 = class308.method1961(true, arg0, arg1);
        var2.method1778(17991);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 229)
    public static final void method3121(byte arg0) {
        if (class177.field2811 != null) {
            class177.field2811.method536(arg0 - 96);
        }
        field7738++;
        if (arg0 != -5) {
            field7755 = null;
        }
        if (class429.field6435 != null) {
            class429.field6435.method536(-50);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLia;I)V", line = 249)
    private final void method3122(byte arg0, class23 arg1, int arg2) {
        if (arg0 <= 81) {
            return;
        }
        if (arg2 == 1) {
            this.field7753 = arg1.method132(118);
        } else if (arg2 == 2) {
            this.field7752 = arg1.method132(67);
        } else if (arg2 == 4) {
            this.field7762 = arg1.method132(79);
        } else if (arg2 == 5) {
            this.field7749 = arg1.method132(44);
        } else if (arg2 == 6) {
            this.field7739 = arg1.method132(54);
        } else if (arg2 == 7) {
            this.field7751 = arg1.method126((byte) -80);
        } else if (arg2 == 8) {
            this.field7750 = arg1.method126((byte) -97);
        } else if (arg2 == 9) {
            this.field7741 = 3;
            this.field7744 = 8224;
        } else if (arg2 == 10) {
            this.field7743 = true;
        } else if (arg2 == 11) {
            this.field7741 = 1;
        } else if (arg2 == 12) {
            this.field7741 = 4;
        } else if (arg2 == 13) {
            this.field7741 = 5;
        } else if (arg2 == 14) {
            this.field7741 = 2;
            this.field7744 = arg1.method126((byte) -110) * 256;
        } else if (arg2 == 15) {
            this.field7741 = 3;
            this.field7744 = arg1.method132(101);
        } else if (arg2 == 16) {
            this.field7741 = 3;
            this.field7744 = arg1.method143(-3230);
        } else if (arg2 == 40) {
            int var4 = arg1.method126((byte) -122);
            this.field7756 = new short[var4];
            this.field7759 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7756[var5] = (short) arg1.method132(125);
                this.field7759[var5] = (short) arg1.method132(122);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method126((byte) -87);
            this.field7737 = new short[var6];
            this.field7745 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7737[var7] = (short) arg1.method132(81);
                this.field7745[var7] = (short) arg1.method132(114);
            }
        }
        field7748++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lya;ZIIILya;IIILza;IILtl;)Le;", line = 371)
    public final class530 method3123(class220 arg0, boolean arg1, int arg2, int arg3, int arg4, class220 arg5, int arg6, int arg7, int arg8, class491 arg9, int arg10, int arg11, class91 arg12) {
        field7757++;
        return arg2 == -21661 ? this.method3119(arg4, arg0, arg6, arg8, arg7, arg1, -14949, arg12, (byte) 2, arg11, arg5, arg3, arg10, arg9) : null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)I", line = 411)
    public static final int method3124(int arg0, int arg1, byte arg2) {
        field7760++;
        int var3 = 9 % ((-arg2 - 30) / 40);
        return arg1 == 1 || arg1 == 3 ? class52.field847[arg0 & 0x3] : class444.field6610[arg0 & 0x3];
    }
}
