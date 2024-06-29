import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class491 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field6695 = -1;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Z")
    public boolean field6690 = false;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    private int field6688 = 0;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    private int field6691 = 128;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    private int field6704 = -1;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    private int field6709 = 128;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    private int field6707 = 0;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    private int field6697 = 0;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "B")
    public byte field6713 = 0;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Lbo;")
    public static class761 field6706 = new class761();

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "[Lcp;")
    public static class755[] field6712 = new class755[1024];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field6689;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    private int field6694;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lsaa;")
    public class347 field6708;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[S")
    private short[] field6693;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[S")
    private short[] field6702;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[S")
    private short[] field6705;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[S")
    private short[] field6710;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2814(boolean arg0) {
        field6706 = null;
        field6712 = null;
        if (!arg0) {
            field6699 = -72;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILfca;)V")
    public final void method2815(int arg0, class93 arg1) {
        if (arg0 != 0) {
            this.field6710 = null;
        }
        while (true) {
            int var3 = arg1.method793((byte) 7);
            if (var3 == 0) {
                field6711++;
                return;
            }
            this.method2821((byte) 5, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2816(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = -41 % ((-arg1 - 47) / 52);
        field6692++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var7 = arg3 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (class584.field8263 - class195.field2982) * var7 / 100 + class195.field2982;
        if (class443.field6015 > var8) {
            var8 = class443.field6015;
        } else if (class304.field4180 < var8) {
            var8 = class304.field4180;
        }
        int var9 = arg3 * var8 * 512 / (arg2 * 334);
        if (class97.field1569 > var9) {
            short var13 = class97.field1569;
            var8 = arg2 * 334 * var13 / (arg3 * 512);
            if (var8 > class304.field4180) {
                var8 = class304.field4180;
                int var14 = var8 * 512 * arg3 / (var13 * 334);
                int var15 = (arg2 - var14) / 2;
                if (arg4) {
                    class95.field1472.method575();
                    class95.field1472.method472(25692, arg3, arg0, var15, -16777216, arg5);
                    class95.field1472.method472(25692, arg3, arg2 + arg0 - var15, var15, -16777216, arg5);
                }
                arg2 -= var15 * 2;
                arg0 += var15;
            }
        } else if (var9 > class199.field3012) {
            short var10 = class199.field3012;
            var8 = arg2 * var10 * 334 / (arg3 * 512);
            if (var8 < class443.field6015) {
                var8 = class443.field6015;
                int var11 = arg2 * var10 * 334 / (var8 * 512);
                int var12 = (arg3 - var11) / 2;
                if (arg4) {
                    class95.field1472.method575();
                    class95.field1472.method472(25692, var12, arg0, arg2, -16777216, arg5);
                    class95.field1472.method472(25692, var12, arg0, arg2, -16777216, arg3 + arg5 - var12);
                }
                arg5 += var12;
                arg3 -= var12 * 2;
            }
        }
        class535.field7248 = arg3 * var8 / 334;
        class341.field4604 = (short) arg3;
        class713.field9817 = arg5;
        class6.field110 = arg0;
        class552.field7815 = (short) arg2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lvf;IIILha;BI)Lka;")
    public final class499 method2817(class163 arg0, int arg1, int arg2, int arg3, class66 arg4, byte arg5, int arg6) {
        if (arg5 == 2) {
            field6698++;
            return this.method2819(null, 0, arg3, arg6, arg0, arg4, (byte) 2, (byte) 58, arg2, 0, null, arg1, 0, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILs;IILs;ZBIIILha;Lvf;I)Lka;")
    public final class499 method2818(int arg0, class296 arg1, int arg2, int arg3, class296 arg4, boolean arg5, byte arg6, int arg7, int arg8, int arg9, class66 arg10, class163 arg11, int arg12) {
        if (arg6 == 2) {
            field6696++;
            return this.method2819(arg1, arg12, arg9, arg8, arg11, arg10, (byte) 2, (byte) 85, arg3, arg0, arg4, arg7, arg2, arg5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ls;IIILvf;Lha;BBIILs;IIZ)Lka;")
    private final class499 method2819(class296 arg0, int arg1, int arg2, int arg3, class163 arg4, class66 arg5, byte arg6, byte arg7, int arg8, int arg9, class296 arg10, int arg11, int arg12, boolean arg13) {
        field6700++;
        int var15 = arg2;
        class200 var16 = this.field6695 == -1 || arg11 == -1 ? null : arg4.method1279((byte) 92, this.field6695);
        boolean var17 = arg13 & this.field6713 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method1440((byte) 56, arg11, arg3, false);
        }
        if (var17) {
            var15 |= this.field6713 == 3 ? 7 : 2;
        }
        if (arg7 <= 55) {
            return null;
        }
        if (this.field6709 != 128) {
            var15 |= 0x2;
        }
        if (this.field6691 != 128 || this.field6688 != 0) {
            var15 |= 0x5;
        }
        class43 var18 = this.field6708.field4690;
        class499 var19;
        synchronized (this.field6708.field4690) {
            var19 = (class499) this.field6708.field4690.method266((byte) -128, (long) (this.field6689 |= arg5.field952 << 29));
        }
        if (var19 == null || arg5.method482(var19.method300(), var15) != 0) {
            if (var19 != null) {
                var15 = arg5.method593(var15, var19.method300());
            }
            int var20 = var15;
            if (this.field6710 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field6693 != null) {
                var20 |= 0x8000;
            }
            class5 var21 = class245.method1636(this.field6694, this.field6708.field4676, 0, 2);
            if (var21 == null) {
                return null;
            }
            if (var21.field101 < 13) {
                var21.method35((byte) -123, 2);
            }
            var19 = arg5.method505(var21, var20, this.field6708.field4691, this.field6697 + 64, this.field6707 + 850);
            if (this.field6710 != null) {
                for (int var22 = 0; var22 < this.field6710.length; var22++) {
                    var19.method308(this.field6710[var22], this.field6705[var22]);
                }
            }
            if (this.field6693 != null) {
                for (int var23 = 0; var23 < this.field6693.length; var23++) {
                    var19.method307(this.field6693[var23], this.field6702[var23]);
                }
            }
            var19.method303(var15);
            class43 var24 = this.field6708.field4690;
            synchronized (this.field6708.field4690) {
                this.field6708.field4690.method270(var19, (long) (this.field6689 |= arg5.field952 << 29), -125);
            }
        }
        class499 var25 = var16 == null ? var19.method324(arg6, var15, true) : var16.method1438(arg11, arg8, 0, arg3, (byte) 59, var15, arg6, var19);
        if (this.field6691 != 128 || this.field6709 != 128) {
            var25.method282(this.field6691, this.field6709, this.field6691);
        }
        if (this.field6688 != 0) {
            if (this.field6688 == 90) {
                var25.method320(4096);
            }
            if (this.field6688 == 180) {
                var25.method320(8192);
            }
            if (this.field6688 == 270) {
                var25.method320(12288);
            }
        }
        if (var17) {
            var25.method280(this.field6713, this.field6704, arg0, arg10, arg1, arg9, arg12);
        }
        var25.method303(arg2);
        return var25;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIBLvf;Lha;)Lka;")
    public final class499 method2820(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class163 arg6, class66 arg7) {
        field6701++;
        if (arg1 >= -55) {
            method2814(false);
        }
        return this.method2819(null, 0, arg2, arg3, arg6, arg7, arg5, (byte) 73, arg4, 0, null, arg0, 0, false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILfca;)V")
    private final void method2821(byte arg0, int arg1, class93 arg2) {
        if (arg0 != 5) {
            this.field6689 = -32;
        }
        if (arg1 == 1) {
            this.field6694 = arg2.method763(100);
        } else if (arg1 == 2) {
            this.field6695 = arg2.method763(-98);
        } else if (arg1 == 4) {
            this.field6691 = arg2.method763(arg0 - 75);
        } else if (arg1 == 5) {
            this.field6709 = arg2.method763(118);
        } else if (arg1 == 6) {
            this.field6688 = arg2.method763(125);
        } else if (arg1 == 7) {
            this.field6697 = arg2.method793((byte) 123);
        } else if (arg1 == 8) {
            this.field6707 = arg2.method793((byte) 117);
        } else if (arg1 == 9) {
            this.field6704 = 8224;
            this.field6713 = 3;
        } else if (arg1 == 10) {
            this.field6690 = true;
        } else if (arg1 == 11) {
            this.field6713 = 1;
        } else if (arg1 == 12) {
            this.field6713 = 4;
        } else if (arg1 == 13) {
            this.field6713 = 5;
        } else if (arg1 == 14) {
            this.field6713 = 2;
            this.field6704 = arg2.method793((byte) 115) * 256;
        } else if (arg1 == 15) {
            this.field6713 = 3;
            this.field6704 = arg2.method763(-111);
        } else if (arg1 == 16) {
            this.field6713 = 3;
            this.field6704 = arg2.method773(3);
        } else if (arg1 == 40) {
            int var6 = arg2.method793((byte) 124);
            this.field6710 = new short[var6];
            this.field6705 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6710[var7] = (short) arg2.method763(-116);
                this.field6705[var7] = (short) arg2.method763(115);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method793((byte) 56);
            this.field6702 = new short[var4];
            this.field6693 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6693[var5] = (short) arg2.method763(class18.method125(arg0, 123));
                this.field6702[var5] = (short) arg2.method763(87);
            }
        }
        field6703++;
    }
}
