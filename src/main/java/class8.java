import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[I")
    private int[] field83 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Z")
    public boolean field90 = false;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public int field85 = -1;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field91 = "Loaded input handler";

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field94 = -1;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
    private int[] field93;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[Llf;")
    public static class94[] field81;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[S")
    private short[] field79;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[S")
    private short[] field84;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[S")
    private short[] field92;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "[S")
    private short[] field97;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static void method42(byte arg0) {
        field91 = null;
        if (arg0 <= 47) {
            method45((class248) null, (byte) -99);
        }
        field81 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I")
    public static final int method43(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)Z")
    public final boolean method44(byte arg0) {
        field87++;
        if (this.field93 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 < 90) {
            return false;
        }
        while (var3 < this.field93.length) {
            if (!class228.field3354.method1890(10, this.field93[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lke;B)V")
    public static final void method45(class248 arg0, byte arg1) {
        if (arg1 != -63) {
            method51((byte) 62, 8);
        }
        field88++;
        class294 var2 = arg0.method1708(arg1 + 63);
        arg0.field3752 = var2.field4703;
        if (arg0.field3710 == 0) {
            arg0.field3675 = 0;
            return;
        }
        if (arg0.field3741 != -1 && arg0.field3677 == 0) {
            class76 var3 = class232.method1609((byte) -32, arg0.field3741);
            if (arg0.field3695 > 0 && var3.field1212 == 0) {
                arg0.field3675++;
                return;
            }
            if (arg0.field3695 <= 0 && var3.field1204 == 0) {
                arg0.field3675++;
                return;
            }
        }
        if (arg0.field3718 != -1 && arg0.field3706 <= class199.field2930) {
            class120 var4 = class152.method1126(arg0.field3718, (byte) -1);
            if (var4.field1947 && var4.field1944 != -1) {
                class76 var5 = class232.method1609((byte) -32, var4.field1944);
                if (arg0.field3695 > 0 && var5.field1212 == 0) {
                    arg0.field3675++;
                    return;
                }
                if (arg0.field3695 <= 0 && var5.field1204 == 0) {
                    arg0.field3675++;
                    return;
                }
            }
        }
        int var6 = arg0.field3660;
        int var7 = arg0.field3753;
        int var8 = arg0.field3761[arg0.field3710 - 1] * 128 + arg0.method1467(0) * 64;
        int var9 = arg0.field3686[arg0.field3710 - 1] * 128 + arg0.method1467(arg1 + 63) * 64;
        if (var8 - var6 > 256 || (var8 - var6) < -256 || (var9 - var7) > 256 || (var9 - var7) < -256) {
            arg0.field3753 = var9;
            arg0.field3660 = var8;
            return;
        }
        if (var6 < var8) {
            if (var7 < var9) {
                arg0.field3712 = 1280;
            } else if (var7 > var9) {
                arg0.field3712 = 1792;
            } else {
                arg0.field3712 = 1536;
            }
        } else if (var8 < var6) {
            if (var7 < var9) {
                arg0.field3712 = 768;
            } else if (var7 > var9) {
                arg0.field3712 = 256;
            } else {
                arg0.field3712 = 512;
            }
        } else if (var9 > var7) {
            arg0.field3712 = 1024;
        } else if (var9 < var7) {
            arg0.field3712 = 0;
        }
        int var10 = arg0.field3712 - arg0.field3668 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        int var11 = 4;
        boolean var12 = true;
        int var13 = var2.field4704;
        byte var14 = 1;
        if (var10 >= -256 && var10 <= 256) {
            var13 = var2.field4693;
        } else if (var10 >= 256 && var10 < 768) {
            var13 = var2.field4676;
        } else if (var10 >= -768 && var10 <= -256) {
            var13 = var2.field4694;
        }
        if (var13 == -1) {
            var13 = var2.field4693;
        }
        arg0.field3752 = var13;
        if (arg0 instanceof class12) {
            var12 = ((class12) arg0).field137.field1778;
        }
        if (var12) {
            if (arg0.field3712 != arg0.field3668 && arg0.field3679 == -1 && arg0.field3724 != 0) {
                var11 = 2;
            }
            if (arg0.field3710 > 2) {
                var11 = 6;
            }
            if (arg0.field3710 > 3) {
                var11 = 8;
            }
            if (arg0.field3675 > 0 && arg0.field3710 > 1) {
                var11 = 8;
                arg0.field3675--;
            }
        } else {
            if (arg0.field3710 > 1) {
                var11 = 6;
            }
            if (arg0.field3710 > 2) {
                var11 = 8;
            }
            if (arg0.field3675 > 0 && arg0.field3710 > 1) {
                arg0.field3675--;
                var11 = 8;
            }
        }
        if (arg0.field3669[arg0.field3710 - 1] == 2) {
            var14 = 2;
            var11 <<= 0x1;
        } else if (arg0.field3669[arg0.field3710 - 1] == 0) {
            var11 >>= 0x1;
            var14 = 0;
        }
        if (var11 < 8 || var2.field4713 == -1) {
            if (var2.field4710 != -1 && var14 == 0) {
                if (arg0.field3752 == var2.field4704 && var2.field4674 != -1) {
                    arg0.field3752 = var2.field4674;
                } else if (arg0.field3752 == var2.field4694 && var2.field4679 != -1) {
                    arg0.field3752 = var2.field4679;
                } else if (arg0.field3752 == var2.field4676 && var2.field4706 != -1) {
                    arg0.field3752 = var2.field4706;
                } else {
                    arg0.field3752 = var2.field4710;
                }
            }
        } else if (arg0.field3752 == var2.field4704 && var2.field4680 != -1) {
            arg0.field3752 = var2.field4680;
        } else if (arg0.field3752 == var2.field4694 && var2.field4681 != -1) {
            arg0.field3752 = var2.field4681;
        } else if (arg0.field3752 == var2.field4676 && var2.field4689 != -1) {
            arg0.field3752 = var2.field4689;
        } else {
            arg0.field3752 = var2.field4713;
        }
        if (var2.field4702 != -1) {
            int var15 = var11 << 7;
            if (arg0.field3710 == 1) {
                int var16 = arg0.field3665 * arg0.field3665;
                int var17 = (arg0.field3660 <= var8 ? var8 - arg0.field3660 : -var8 + arg0.field3660) << 7;
                int var18 = (arg0.field3753 <= var9 ? var9 - arg0.field3753 : -var9 + arg0.field3753) << 7;
                int var19 = var17 > var18 ? var17 : var18;
                int var20 = var2.field4702 * 2 * var19;
                if (var16 > var20) {
                    arg0.field3665 /= 2;
                } else if (var19 < var16 / 2) {
                    arg0.field3665 -= var2.field4702;
                    if (arg0.field3665 < 0) {
                        arg0.field3665 = 0;
                    }
                } else if (var15 > arg0.field3665) {
                    arg0.field3665 += var2.field4702;
                    if (var15 < arg0.field3665) {
                        arg0.field3665 = var15;
                    }
                }
            } else if (arg0.field3665 < var15) {
                arg0.field3665 += var2.field4702;
                if (var15 < arg0.field3665) {
                    arg0.field3665 = var15;
                }
            } else if (arg0.field3665 > 0) {
                arg0.field3665 -= var2.field4702;
                if (arg0.field3665 < 0) {
                    arg0.field3665 = 0;
                }
            }
            var11 = arg0.field3665 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var9 > var7) {
            arg0.field3753 += var11;
            if (arg0.field3753 > var9) {
                arg0.field3753 = var9;
            }
        } else if (var9 < var7) {
            arg0.field3753 -= var11;
            if (var9 > arg0.field3753) {
                arg0.field3753 = var9;
            }
        }
        if (var6 < var8) {
            arg0.field3660 += var11;
            if (arg0.field3660 > var8) {
                arg0.field3660 = var8;
            }
        } else if (var8 < var6) {
            arg0.field3660 -= var11;
            if (var8 > arg0.field3660) {
                arg0.field3660 = var8;
            }
        }
        if (arg0.field3660 != var8 || arg0.field3753 != var9) {
            return;
        }
        arg0.field3710--;
        if (arg0.field3695 > 0) {
            arg0.field3695--;
            return;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILhc;I)V")
    private final void method46(int arg0, class53 arg1, int arg2) {
        field82++;
        int var4 = 19 % ((30 - arg0) / 53);
        if (arg2 == 1) {
            this.field85 = arg1.method366(-16505);
        } else if (arg2 == 2) {
            int var9 = arg1.method366(-16505);
            this.field93 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field93[var10] = arg1.method331(-39);
            }
        } else if (arg2 == 3) {
            this.field90 = true;
            return;
        } else if (arg2 == 40) {
            int var5 = arg1.method366(-16505);
            this.field79 = new short[var5];
            this.field92 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field79[var6] = (short) arg1.method331(-57);
                this.field92[var6] = (short) arg1.method331(-91);
            }
            return;
        } else if (arg2 == 41) {
            int var7 = arg1.method366(-16505);
            this.field84 = new short[var7];
            this.field97 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field97[var8] = (short) arg1.method331(-108);
                this.field84[var8] = (short) arg1.method331(-79);
            }
            return;
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field83[arg2 - 60] = arg1.method331(-110);
            return;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Lig;")
    public final class96 method47(int arg0) {
        field96++;
        int var2 = 0;
        class96[] var3 = new class96[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field83[var4] != -1) {
                var3[var2++] = class96.method760(class228.field3354, this.field83[var4], 0);
            }
        }
        if (arg0 < 41) {
            this.field85 = -58;
        }
        class96 var5 = new class96(var3, var2);
        if (this.field79 != null) {
            for (int var6 = 0; var6 < this.field79.length; var6++) {
                var5.method748(this.field79[var6], this.field92[var6]);
            }
        }
        if (this.field97 != null) {
            for (int var7 = 0; var7 < this.field97.length; var7++) {
                var5.method739(this.field97[var7], this.field84[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Z")
    public final boolean method48(int arg0) {
        if (arg0 <= 101) {
            field91 = null;
        }
        field95++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field83[var3] != -1 && !class228.field3354.method1890(10, this.field83[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLhc;)V")
    public final void method49(byte arg0, class53 arg1) {
        while (true) {
            int var3 = arg1.method366(-16505);
            if (var3 == 0) {
                field86++;
                int var4 = 20 / ((-arg0 - 38) / 59);
                return;
            }
            this.method46(92, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)Lig;")
    public final class96 method50(byte arg0) {
        field80++;
        if (this.field93 == null) {
            return null;
        }
        int var2 = 44 % ((arg0 - 7) / 50);
        class96[] var3 = new class96[this.field93.length];
        for (int var4 = 0; var4 < this.field93.length; var4++) {
            var3[var4] = class96.method760(class228.field3354, this.field93[var4], 0);
        }
        class96 var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new class96(var3, var3.length);
        }
        if (this.field79 != null) {
            for (int var6 = 0; var6 < this.field79.length; var6++) {
                var5.method748(this.field79[var6], this.field92[var6]);
            }
        }
        if (this.field97 != null) {
            for (int var7 = 0; var7 < this.field97.length; var7++) {
                var5.method739(this.field97[var7], this.field84[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
    public static final void method51(byte arg0, int arg1) {
        field78++;
        if (arg0 < 63) {
            method42((byte) -11);
        }
        class279 var2 = class111.method844(arg1, 5, -1780180960);
        var2.method1934((byte) -114);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
    public static final void method52(byte arg0) {
        class169.field2570.method1420((byte) -46);
        field89++;
        if (arg0 != -28) {
            field91 = null;
        }
        class33.field413.method1420((byte) 121);
    }
}
