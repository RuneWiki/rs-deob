import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class215 {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    private int field3903;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[[I")
    public int[][] field3908;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3902 = 0;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lih;")
    public static class95 field3909 = new class95(260);

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Ldj;")
    public static class44 field3918 = class89.method650(255, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3916 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Ldj;")
    private static class44 field3920 = class89.method650(255, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "Ldj;")
    public static class44 field3923 = field3920;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3919 = 0;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Ldj;")
    public static class44 field3922 = class89.method650(255, "<col=ff7000>");

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "J")
    public static long field3921;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method1396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3904++;
        if (arg3 != 1) {
            this.method1401(123, 123, true, 115, (byte) -117, -34);
        }
        if (arg1 == arg4 && arg2 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field3895;
        int var9 = arg5 - this.field3917;
        int var10 = arg2 - this.field3917;
        int var11 = arg4 - this.field3895;
        if (arg0 == 0) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3908[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3908[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3908[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3908[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3908[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field3908[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3908[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field3908[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field3908[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field3908[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var10 && (this.field3908[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public final void method1397(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3917;
        field3897++;
        int var5 = arg1 - this.field3895;
        if (arg0 != 2964) {
            this.method1409(true, -77, -120);
        }
        this.field3908[var5][var4] = class29.method202(this.field3908[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIZIII)V")
    public final void method1398(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3901++;
        int var7 = arg1 - this.field3917;
        int var8 = arg5 - this.field3895;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1399(var7, 128, var8, (byte) -55);
                this.method1399(var7, 8, var8 - 1, (byte) 84);
            }
            if (arg4 == 1) {
                this.method1399(var7, 2, var8, (byte) 64);
                this.method1399(var7 + 1, 32, var8, (byte) -71);
            }
            if (arg4 == 2) {
                this.method1399(var7, 8, var8, (byte) 52);
                this.method1399(var7, 128, var8 + 1, (byte) 123);
            }
            if (arg4 == 3) {
                this.method1399(var7, 32, var8, (byte) 101);
                this.method1399(var7 - 1, 2, var8, (byte) 87);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1399(var7, 1, var8, (byte) -54);
                this.method1399(var7 + 1, 16, var8 - 1, (byte) -99);
            }
            if (arg4 == 1) {
                this.method1399(var7, 4, var8, (byte) -52);
                this.method1399(var7 + 1, 64, var8 + 1, (byte) -126);
            }
            if (arg4 == 2) {
                this.method1399(var7, 16, var8, (byte) 69);
                this.method1399(var7 - 1, 1, var8 + 1, (byte) -61);
            }
            if (arg4 == 3) {
                this.method1399(var7, 64, var8, (byte) 79);
                this.method1399(var7 - 1, 4, var8 - 1, (byte) -43);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method1399(var7, 130, var8, (byte) -48);
                this.method1399(var7, 8, var8 - 1, (byte) 74);
                this.method1399(var7 + 1, 32, var8, (byte) 72);
            }
            if (arg4 == 1) {
                this.method1399(var7, 10, var8, (byte) 59);
                this.method1399(var7 + 1, 32, var8, (byte) -81);
                this.method1399(var7, 128, var8 + 1, (byte) 63);
            }
            if (arg4 == 2) {
                this.method1399(var7, 40, var8, (byte) 99);
                this.method1399(var7, 128, var8 + 1, (byte) 46);
                this.method1399(var7 - 1, 2, var8, (byte) 115);
            }
            if (arg4 == 3) {
                this.method1399(var7, 160, var8, (byte) -28);
                this.method1399(var7 - 1, 2, var8, (byte) 105);
                this.method1399(var7, 8, var8 - 1, (byte) 63);
            }
        }
        if (arg0 != -53) {
            field3918 = null;
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1399(var7, 65536, var8, (byte) -91);
                this.method1399(var7, 4096, var8 - 1, (byte) -98);
            }
            if (arg4 == 1) {
                this.method1399(var7, 1024, var8, (byte) -77);
                this.method1399(var7 + 1, 16384, var8, (byte) 93);
            }
            if (arg4 == 2) {
                this.method1399(var7, 4096, var8, (byte) -68);
                this.method1399(var7, 65536, var8 + 1, (byte) 117);
            }
            if (arg4 == 3) {
                this.method1399(var7, 16384, var8, (byte) 78);
                this.method1399(var7 - 1, 1024, var8, (byte) -92);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1399(var7, 512, var8, (byte) 61);
                this.method1399(var7 + 1, 8192, var8 - 1, (byte) -106);
            }
            if (arg4 == 1) {
                this.method1399(var7, 2048, var8, (byte) 64);
                this.method1399(var7 + 1, 32768, var8 + 1, (byte) -45);
            }
            if (arg4 == 2) {
                this.method1399(var7, 8192, var8, (byte) -79);
                this.method1399(var7 - 1, 512, var8 + 1, (byte) 99);
            }
            if (arg4 == 3) {
                this.method1399(var7, 32768, var8, (byte) -38);
                this.method1399(var7 - 1, 2048, var8 - 1, (byte) -116);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1399(var7, 66560, var8, (byte) -115);
            this.method1399(var7, 4096, var8 - 1, (byte) 103);
            this.method1399(var7 + 1, 16384, var8, (byte) -64);
        }
        if (arg4 == 1) {
            this.method1399(var7, 5120, var8, (byte) 89);
            this.method1399(var7 + 1, 16384, var8, (byte) -35);
            this.method1399(var7, 65536, var8 + 1, (byte) 60);
        }
        if (arg4 == 2) {
            this.method1399(var7, 20480, var8, (byte) -55);
            this.method1399(var7, 65536, var8 + 1, (byte) 127);
            this.method1399(var7 - 1, 1024, var8, (byte) 51);
        }
        if (arg4 == 3) {
            this.method1399(var7, 81920, var8, (byte) -28);
            this.method1399(var7 - 1, 1024, var8, (byte) -81);
            this.method1399(var7, 4096, var8 - 1, (byte) -29);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIB)V")
    private final void method1399(int arg0, int arg1, int arg2, byte arg3) {
        this.field3908[arg2][arg0] = class238.method1545(this.field3908[arg2][arg0], arg1);
        int var5 = 44 % ((arg3 - 9) / 34);
        field3899++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBIIIII)Z")
    public final boolean method1400(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3914++;
        if (arg0 == arg4 && arg2 == arg3) {
            return true;
        }
        int var8 = arg3 - this.field3917;
        int var9 = arg4 - this.field3895;
        int var10 = arg2 - this.field3917;
        int var11 = arg0 - this.field3895;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field3908[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field3908[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field3908[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field3908[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 - 1 == var11 && var8 == var10 && (this.field3908[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field3908[var11][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 + 1 == var11 && var8 == var10 && (this.field3908[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 + 1 == var8 && (this.field3908[var11][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var9 == var11 && var10 + 1 == var8 && (this.field3908[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var10 - 1 == var8 && (this.field3908[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var11 && var8 == var10 && (this.field3908[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var11 && var8 == var10 && (this.field3908[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        int var12 = 60 / ((-arg1 - 67) / 52);
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIBI)V")
    public final void method1401(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg5 - this.field3895;
        int var8 = arg3 - this.field3917;
        if (arg4 < 83) {
            this.method1396(-70, 50, -23, 51, 117, -4, 78);
        }
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        field3898++;
        for (int var10 = var7; var10 < arg1 + var7; var10++) {
            if (var10 >= 0 && this.field3913 > var10) {
                for (int var11 = var8; var11 < var8 + arg0; var11++) {
                    if (var11 >= 0 && var11 < this.field3903) {
                        this.method1399(var11, var9, var10, (byte) -84);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg1 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg4;
            arg4 = var8;
        }
        field3910++;
        if (var7 == 0) {
            return arg5;
        }
        int var9 = -59 % ((10 - arg6) / 40);
        if (var7 == 1) {
            return 1 + 7 - arg0 - arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg4;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBII)V")
    private final void method1403(int arg0, byte arg1, int arg2, int arg3) {
        field3912++;
        this.field3908[arg0][arg2] = class29.method202(this.field3908[arg0][arg2], ~arg3);
        int var5 = -100 % ((71 - arg1) / 40);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIIBI)V")
    public final void method1404(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = arg6 - this.field3895;
        if (arg5 != 93) {
            this.field3913 = 96;
        }
        field3906++;
        int var9 = arg0 - this.field3917;
        int var10 = 256;
        if (arg2) {
            var10 += 131072;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg1;
            arg1 = arg4;
            arg4 = var11;
        }
        for (int var12 = var8; var12 < arg1 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field3913) {
                for (int var13 = var9; var13 < var9 + arg4; var13++) {
                    if (var13 >= 0 && var13 < this.field3903) {
                        this.method1403(var12, (byte) -119, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final void method1405(int arg0) {
        field3905++;
        if (arg0 != -5) {
            field3902 = -28;
        }
        for (int var2 = 0; var2 < this.field3913; var2++) {
            for (int var3 = 0; var3 < this.field3903; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3913 - 5 || this.field3903 - 5 <= var3) {
                    this.field3908[var2][var3] = 16777215;
                } else {
                    this.field3908[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method1406(byte arg0) {
        field3894++;
        try {
            if (class101.field1851 == 1) {
                int var1 = class119.field2125.method1205((byte) 113);
                if (var1 > 0 && class119.field2125.method1216((byte) 100)) {
                    int var2 = var1 - class115.field2065;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class119.field2125.method1213(-68, var2);
                    return;
                }
                class119.field2125.method1229(arg0 - 88);
                class119.field2125.method1221(1);
                class200.field3537 = null;
                if (class134.field2399 == null) {
                    class101.field1851 = 0;
                } else {
                    class101.field1851 = 2;
                }
                class187.field3223 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class119.field2125.method1229(1);
            class187.field3223 = null;
            class134.field2399 = null;
            class200.field3537 = null;
            class101.field1851 = 0;
        }
        if (arg0 != 89) {
            field3923 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3922 = null;
        field3923 = null;
        field3909 = null;
        field3920 = null;
        field3916 = null;
        field3918 = null;
        if (arg0 != 1280) {
            method1402(61, 15, 1, 28, -64, 116, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBIIZ)V")
    public final void method1408(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1 - this.field3917;
        field3907++;
        int var8 = arg0 - this.field3895;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1403(var8, (byte) -124, var7, 128);
                this.method1403(var8 - 1, (byte) -15, var7, 8);
            }
            if (arg4 == 1) {
                this.method1403(var8, (byte) 125, var7, 2);
                this.method1403(var8, (byte) 119, var7 + 1, 32);
            }
            if (arg4 == 2) {
                this.method1403(var8, (byte) -77, var7, 8);
                this.method1403(var8 + 1, (byte) 113, var7, 128);
            }
            if (arg4 == 3) {
                this.method1403(var8, (byte) 114, var7, 32);
                this.method1403(var8, (byte) 24, var7 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1403(var8, (byte) 112, var7, 1);
                this.method1403(var8 - 1, (byte) 126, var7 + 1, 16);
            }
            if (arg4 == 1) {
                this.method1403(var8, (byte) 113, var7, 4);
                this.method1403(var8 + 1, (byte) -62, var7 + 1, 64);
            }
            if (arg4 == 2) {
                this.method1403(var8, (byte) -54, var7, 16);
                this.method1403(var8 + 1, (byte) 119, var7 - 1, 1);
            }
            if (arg4 == 3) {
                this.method1403(var8, (byte) -47, var7, 64);
                this.method1403(var8 - 1, (byte) 117, var7 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method1403(var8, (byte) 126, var7, 130);
                this.method1403(var8 - 1, (byte) 123, var7, 8);
                this.method1403(var8, (byte) -103, var7 + 1, 32);
            }
            if (arg4 == 1) {
                this.method1403(var8, (byte) -104, var7, 10);
                this.method1403(var8, (byte) -13, var7 + 1, 32);
                this.method1403(var8 + 1, (byte) 111, var7, 128);
            }
            if (arg4 == 2) {
                this.method1403(var8, (byte) -77, var7, 40);
                this.method1403(var8 + 1, (byte) -31, var7, 128);
                this.method1403(var8, (byte) -38, var7 - 1, 2);
            }
            if (arg4 == 3) {
                this.method1403(var8, (byte) 114, var7, 160);
                this.method1403(var8, (byte) 114, var7 - 1, 2);
                this.method1403(var8 - 1, (byte) 122, var7, 8);
            }
        }
        int var9 = 51 / (arg2 / 55);
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1403(var8, (byte) 115, var7, 65536);
                this.method1403(var8 - 1, (byte) 0, var7, 4096);
            }
            if (arg4 == 1) {
                this.method1403(var8, (byte) -15, var7, 1024);
                this.method1403(var8, (byte) -21, var7 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method1403(var8, (byte) 115, var7, 4096);
                this.method1403(var8 + 1, (byte) 123, var7, 65536);
            }
            if (arg4 == 3) {
                this.method1403(var8, (byte) -108, var7, 16384);
                this.method1403(var8, (byte) 19, var7 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1403(var8, (byte) 118, var7, 512);
                this.method1403(var8 - 1, (byte) 117, var7 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method1403(var8, (byte) 111, var7, 2048);
                this.method1403(var8 + 1, (byte) -125, var7 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method1403(var8, (byte) -124, var7, 8192);
                this.method1403(var8 + 1, (byte) 112, var7 - 1, 512);
            }
            if (arg4 == 3) {
                this.method1403(var8, (byte) -11, var7, 32768);
                this.method1403(var8 - 1, (byte) 118, var7 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1403(var8, (byte) -13, var7, 66560);
            this.method1403(var8 - 1, (byte) -99, var7, 4096);
            this.method1403(var8, (byte) -70, var7 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method1403(var8, (byte) 0, var7, 5120);
            this.method1403(var8, (byte) 119, var7 + 1, 16384);
            this.method1403(var8 + 1, (byte) 113, var7, 65536);
        }
        if (arg4 == 2) {
            this.method1403(var8, (byte) 120, var7, 20480);
            this.method1403(var8 + 1, (byte) -46, var7, 65536);
            this.method1403(var8, (byte) -100, var7 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method1403(var8, (byte) 125, var7, 81920);
            this.method1403(var8, (byte) 118, var7 - 1, 1024);
            this.method1403(var8 - 1, (byte) -104, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)V")
    public final void method1409(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3895;
        if (arg0) {
            method1406((byte) -117);
        }
        field3915++;
        int var5 = arg1 - this.field3917;
        this.field3908[var4][var5] = class238.method1545(this.field3908[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3911++;
        int var9 = 46 % ((-arg0 - 13) / 49);
        int var10 = arg6 + arg1 - 1;
        int var11 = arg7 + arg2 - 1;
        if (arg7 <= arg3 && var11 >= arg3 && arg6 <= arg5 && arg5 <= var10) {
            return true;
        } else if (arg7 - 1 == arg3 && arg6 <= arg5 && var10 >= arg5 && (this.field3908[arg3 - this.field3895][arg5 - this.field3917] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg3 && arg5 >= arg6 && arg5 <= var10 && (this.field3908[arg3 - this.field3895][arg5 - this.field3917] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg5 && arg3 >= arg7 && arg3 <= var11 && (this.field3908[arg3 - this.field3895][arg5 - this.field3917] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg7 <= arg3 && var11 >= arg3 && (this.field3908[arg3 - this.field3895][arg5 - this.field3917] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
    public final void method1411(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3917;
        int var5 = arg0 - this.field3895;
        field3896++;
        this.field3908[var5][var4] = class238.method1545(this.field3908[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V")
    public class215(int arg0, int arg1) {
        this.field3903 = arg1;
        this.field3895 = 0;
        this.field3917 = 0;
        this.field3913 = arg0;
        this.field3908 = new int[this.field3913][this.field3903];
        this.method1405(-5);
    }
}
