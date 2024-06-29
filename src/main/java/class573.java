import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class573 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Z")
    public boolean field7801 = false;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    private int field7807 = 128;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "B")
    public byte field7797 = 0;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    private int field7811 = 0;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public int field7819 = -1;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    private int field7812 = 0;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    private int field7821 = 128;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    private int field7822 = -1;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    private int field7810 = 0;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[I")
    public static int[] field7813 = new int[32];

    @OriginalMember(owner = "client!el", name = "t", descriptor = "F")
    public static float field7816 = 0.25F;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[I")
    public static int[] field7823 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    private int field7802;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field7803;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Ljj;")
    public class129 field7805;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[S")
    private short[] field7798;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[S")
    private short[] field7806;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[S")
    private short[] field7809;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[S")
    private short[] field7818;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 7)
    public static void method3252(int arg0) {
        field7823 = null;
        if (arg0 == -9408) {
            field7813 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 25)
    public static final void method3253(int arg0, int arg1, int arg2) {
        field7808++;
        if (arg1 != -3) {
            method3253(125, -61, 77);
        }
        class778 var3 = class389.method2406(arg1 + 64, (long) arg0, 6);
        var3.method4274(arg1 + 118);
        var3.field10690 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ldt;Z)V", line = 39)
    public final void method3254(class254 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                if (!arg1) {
                    return;
                }
                field7804++;
                return;
            }
            this.method3260(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLll;ILha;Ls;Ls;IIBIIZII)Lka;", line = 73)
    private final class497 method3255(byte arg0, class384 arg1, int arg2, class66 arg3, class295 arg4, class295 arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13) {
        field7799++;
        int var15 = arg13;
        class317 var16 = this.field7819 == -1 || arg6 == -1 ? null : arg1.method2388(this.field7819, 0);
        boolean var17 = arg11 & this.field7797 != 0;
        if (var16 != null) {
            var15 = arg13 | var16.method2024(65535, false, arg2, arg6);
        }
        if (var17) {
            var15 |= this.field7797 == 3 ? 7 : 2;
        }
        if (arg8 >= -54) {
            return null;
        }
        if (this.field7821 != 128) {
            var15 |= 0x2;
        }
        if (this.field7807 != 128 || this.field7811 != 0) {
            var15 |= 0x5;
        }
        class535 var18 = this.field7805.field1779;
        class497 var19;
        synchronized (this.field7805.field1779) {
            var19 = (class497) this.field7805.field1779.method3109((byte) 99, (long) (this.field7803 |= arg3.field906 << 29));
        }
        if (var19 == null || arg3.method520(var19.method260(), var15) != 0) {
            if (var19 != null) {
                var15 = arg3.method473(var15, var19.method260());
            }
            int var20 = var15;
            if (this.field7818 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field7806 != null) {
                var20 |= 0x8000;
            }
            class625 var21 = class180.method1226(this.field7802, this.field7805.field1772, 0, true);
            if (var21 == null) {
                return null;
            }
            if (var21.field8456 < 13) {
                var21.method3460(2, -112);
            }
            var19 = arg3.method484(var21, var20, this.field7805.field1782, this.field7810 + 64, this.field7812 + 850);
            if (this.field7818 != null) {
                for (int var22 = 0; var22 < this.field7818.length; var22++) {
                    var19.method295(this.field7818[var22], this.field7798[var22]);
                }
            }
            if (this.field7806 != null) {
                for (int var23 = 0; var23 < this.field7806.length; var23++) {
                    var19.method278(this.field7806[var23], this.field7809[var23]);
                }
            }
            var19.method270(var15);
            class535 var24 = this.field7805.field1779;
            synchronized (this.field7805.field1779) {
                this.field7805.field1779.method3108((long) (this.field7803 |= arg3.field906 << 29), 16337, var19);
            }
        }
        class497 var25 = var16 == null ? var19.method271(arg0, var15, true) : var16.method2021(arg6, var19, arg10, (byte) -84, var15, arg0, arg2, 0);
        if (this.field7807 != 128 || this.field7821 != 128) {
            var25.method294(this.field7807, this.field7821, this.field7807);
        }
        if (this.field7811 != 0) {
            if (this.field7811 == 90) {
                var25.method256(4096);
            }
            if (this.field7811 == 180) {
                var25.method256(8192);
            }
            if (this.field7811 == 270) {
                var25.method256(12288);
            }
        }
        if (var17) {
            var25.method281(this.field7797, this.field7822, arg4, arg5, arg9, arg12, arg7);
        }
        var25.method270(arg13);
        return var25;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BIIIBILll;Lha;)Lka;", line = 186)
    public final class497 method3256(byte arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class384 arg6, class66 arg7) {
        field7814++;
        int var9 = 104 % ((arg0 + 78) / 36);
        return this.method3255(arg4, arg6, arg2, arg7, null, null, arg1, 0, (byte) -76, 0, arg3, false, 0, arg5);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([S[Ljava/lang/String;I)V", line = 203)
    public static final void method3257(short[] arg0, String[] arg1, int arg2) {
        field7815++;
        class34.method186(0, arg0, 2, arg1, arg1.length - 1);
        if (arg2 != 15) {
            field7816 = 1.066413F;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lha;IILll;IIIIZILs;Ls;I)Lka;", line = 231)
    public final class497 method3258(class66 arg0, int arg1, int arg2, class384 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, class295 arg10, class295 arg11, int arg12) {
        if (arg2 == -19124) {
            field7820++;
            return this.method3255((byte) 2, arg3, arg12, arg0, arg10, arg11, arg9, arg7, (byte) -103, arg4, arg6, arg8, arg1, arg5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BIILll;IILha;)Lka;", line = 242)
    public final class497 method3259(byte arg0, int arg1, int arg2, class384 arg3, int arg4, int arg5, class66 arg6) {
        int var8 = -26 % ((arg0 + 67) / 38);
        field7817++;
        return this.method3255((byte) 2, arg3, arg1, arg6, null, null, arg5, 0, (byte) -127, 0, arg4, false, 0, arg2);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ldt;ZI)V", line = 262)
    private final void method3260(class254 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field7802 = arg0.method1728((byte) 89);
        } else if (arg2 == 2) {
            this.field7819 = arg0.method1728((byte) 50);
        } else if (arg2 == 4) {
            this.field7807 = arg0.method1728((byte) 51);
        } else if (arg2 == 5) {
            this.field7821 = arg0.method1728((byte) 14);
        } else if (arg2 == 6) {
            this.field7811 = arg0.method1728((byte) 28);
        } else if (arg2 == 7) {
            this.field7810 = arg0.method1731((byte) 64);
        } else if (arg2 == 8) {
            this.field7812 = arg0.method1731((byte) 64);
        } else if (arg2 == 9) {
            this.field7822 = 8224;
            this.field7797 = 3;
        } else if (arg2 == 10) {
            this.field7801 = true;
        } else if (arg2 == 11) {
            this.field7797 = 1;
        } else if (arg2 == 12) {
            this.field7797 = 4;
        } else if (arg2 == 13) {
            this.field7797 = 5;
        } else if (arg2 == 14) {
            this.field7797 = 2;
            this.field7822 = arg0.method1731((byte) 64) * 256;
        } else if (arg2 == 15) {
            this.field7797 = 3;
            this.field7822 = arg0.method1728((byte) 46);
        } else if (arg2 == 16) {
            this.field7797 = 3;
            this.field7822 = arg0.method1672(-16516);
        } else if (arg2 == 40) {
            int var4 = arg0.method1731((byte) 64);
            this.field7818 = new short[var4];
            this.field7798 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7818[var5] = (short) arg0.method1728((byte) 112);
                this.field7798[var5] = (short) arg0.method1728((byte) 46);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1731((byte) 64);
            this.field7809 = new short[var6];
            this.field7806 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7806[var7] = (short) arg0.method1728((byte) 18);
                this.field7809[var7] = (short) arg0.method1728((byte) 50);
            }
        }
        field7800++;
        if (!arg1) {
            this.method3260(null, false, 78);
        }
    }
}
