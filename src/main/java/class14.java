import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EKHWFCYP")
public class class14 {

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "I")
    private int field653 = -179;

    @OriginalMember(owner = "client!EKHWFCYP", name = "b", descriptor = "I")
    private int field654 = 757;

    @OriginalMember(owner = "client!EKHWFCYP", name = "c", descriptor = "I")
    private int field655 = -23585;

    @OriginalMember(owner = "client!EKHWFCYP", name = "d", descriptor = "Z")
    private boolean field656 = false;

    @OriginalMember(owner = "client!EKHWFCYP", name = "e", descriptor = "I")
    private int field657 = -16571;

    @OriginalMember(owner = "client!EKHWFCYP", name = "f", descriptor = "Z")
    private boolean field658 = false;

    @OriginalMember(owner = "client!EKHWFCYP", name = "g", descriptor = "I")
    public int field659 = 0;

    @OriginalMember(owner = "client!EKHWFCYP", name = "h", descriptor = "I")
    public int field660 = 0;

    @OriginalMember(owner = "client!EKHWFCYP", name = "i", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!EKHWFCYP", name = "j", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!EKHWFCYP", name = "k", descriptor = "[[I")
    public int[][] field663;

    @OriginalMember(owner = "client!EKHWFCYP", name = "<init>", descriptor = "(III)V")
    public class14(int arg0, int arg1, int arg2) {
        this.field661 = arg0;
        if (arg2 != -18093) {
            throw new NullPointerException();
        }
        this.field662 = arg1;
        this.field663 = new int[this.field661][this.field662];
        this.method191();
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "()V")
    public void method191() {
        for (int var1 = 0; var1 < this.field661; var1++) {
            for (int var2 = 0; var2 < this.field662; var2++) {
                if (var1 == 0 || var2 == 0 || this.field661 - 1 == var1 || this.field662 - 1 == var2) {
                    this.field663[var1][var2] = 16777215;
                } else {
                    this.field663[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIZIII)V")
    public void method192(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field659;
        if (arg4 <= 0) {
            return;
        }
        int var8 = arg3 - this.field660;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method195(var7, var8, 128);
                this.method195(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method195(var7, var8, 2);
                this.method195(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method195(var7, var8, 8);
                this.method195(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method195(var7, var8, 32);
                this.method195(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method195(var7, var8, 1);
                this.method195(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method195(var7, var8, 4);
                this.method195(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method195(var7, var8, 16);
                this.method195(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method195(var7, var8, 64);
                this.method195(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method195(var7, var8, 130);
                this.method195(var7 - 1, var8, 8);
                this.method195(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method195(var7, var8, 10);
                this.method195(var7, var8 + 1, 32);
                this.method195(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method195(var7, var8, 40);
                this.method195(var7 + 1, var8, 128);
                this.method195(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method195(var7, var8, 160);
                this.method195(var7, var8 - 1, 2);
                this.method195(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method195(var7, var8, 65536);
                this.method195(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method195(var7, var8, 1024);
                this.method195(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method195(var7, var8, 4096);
                this.method195(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method195(var7, var8, 16384);
                this.method195(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method195(var7, var8, 512);
                this.method195(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method195(var7, var8, 2048);
                this.method195(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method195(var7, var8, 8192);
                this.method195(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method195(var7, var8, 32768);
                this.method195(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method195(var7, var8, 66560);
            this.method195(var7 - 1, var8, 4096);
            this.method195(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method195(var7, var8, 5120);
            this.method195(var7, var8 + 1, 16384);
            this.method195(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method195(var7, var8, 20480);
            this.method195(var7 + 1, var8, 65536);
            this.method195(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method195(var7, var8, 81920);
            this.method195(var7, var8 - 1, 1024);
            this.method195(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIZI)V")
    public void method193(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg3 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg5) {
            var8 += 131072;
        }
        int var10 = arg0 - this.field659;
        int var11 = arg4 - this.field660;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg1;
            arg1 = arg2;
            arg2 = var12;
        }
        for (int var13 = var10; var13 < arg1 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field661) {
                for (int var14 = var11; var14 < arg2 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field662) {
                        this.method195(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(III)V")
    public void method194(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field659;
        int var5 = arg0 - this.field660;
        if (arg2 != 32151) {
            this.field657 = -94;
        }
        this.field663[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "b", descriptor = "(III)V")
    private void method195(int arg0, int arg1, int arg2) {
        this.field663[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIBIIZ)V")
    public void method196(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field659;
        int var8 = arg4 - this.field660;
        if (arg2 != 77) {
            this.field657 = -183;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method198(var8, 128, -233, var7);
                this.method198(var8, 8, -233, var7 - 1);
            }
            if (arg3 == 1) {
                this.method198(var8, 2, -233, var7);
                this.method198(var8 + 1, 32, -233, var7);
            }
            if (arg3 == 2) {
                this.method198(var8, 8, -233, var7);
                this.method198(var8, 128, -233, var7 + 1);
            }
            if (arg3 == 3) {
                this.method198(var8, 32, -233, var7);
                this.method198(var8 - 1, 2, -233, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method198(var8, 1, -233, var7);
                this.method198(var8 + 1, 16, -233, var7 - 1);
            }
            if (arg3 == 1) {
                this.method198(var8, 4, -233, var7);
                this.method198(var8 + 1, 64, -233, var7 + 1);
            }
            if (arg3 == 2) {
                this.method198(var8, 16, -233, var7);
                this.method198(var8 - 1, 1, -233, var7 + 1);
            }
            if (arg3 == 3) {
                this.method198(var8, 64, -233, var7);
                this.method198(var8 - 1, 4, -233, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method198(var8, 130, -233, var7);
                this.method198(var8, 8, -233, var7 - 1);
                this.method198(var8 + 1, 32, -233, var7);
            }
            if (arg3 == 1) {
                this.method198(var8, 10, -233, var7);
                this.method198(var8 + 1, 32, -233, var7);
                this.method198(var8, 128, -233, var7 + 1);
            }
            if (arg3 == 2) {
                this.method198(var8, 40, -233, var7);
                this.method198(var8, 128, -233, var7 + 1);
                this.method198(var8 - 1, 2, -233, var7);
            }
            if (arg3 == 3) {
                this.method198(var8, 160, -233, var7);
                this.method198(var8 - 1, 2, -233, var7);
                this.method198(var8, 8, -233, var7 - 1);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method198(var8, 65536, -233, var7);
                this.method198(var8, 4096, -233, var7 - 1);
            }
            if (arg3 == 1) {
                this.method198(var8, 1024, -233, var7);
                this.method198(var8 + 1, 16384, -233, var7);
            }
            if (arg3 == 2) {
                this.method198(var8, 4096, -233, var7);
                this.method198(var8, 65536, -233, var7 + 1);
            }
            if (arg3 == 3) {
                this.method198(var8, 16384, -233, var7);
                this.method198(var8 - 1, 1024, -233, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method198(var8, 512, -233, var7);
                this.method198(var8 + 1, 8192, -233, var7 - 1);
            }
            if (arg3 == 1) {
                this.method198(var8, 2048, -233, var7);
                this.method198(var8 + 1, 32768, -233, var7 + 1);
            }
            if (arg3 == 2) {
                this.method198(var8, 8192, -233, var7);
                this.method198(var8 - 1, 512, -233, var7 + 1);
            }
            if (arg3 == 3) {
                this.method198(var8, 32768, -233, var7);
                this.method198(var8 - 1, 2048, -233, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method198(var8, 66560, -233, var7);
            this.method198(var8, 4096, -233, var7 - 1);
            this.method198(var8 + 1, 16384, -233, var7);
        }
        if (arg3 == 1) {
            this.method198(var8, 5120, -233, var7);
            this.method198(var8 + 1, 16384, -233, var7);
            this.method198(var8, 65536, -233, var7 + 1);
        }
        if (arg3 == 2) {
            this.method198(var8, 20480, -233, var7);
            this.method198(var8, 65536, -233, var7 + 1);
            this.method198(var8 - 1, 1024, -233, var7);
        }
        if (arg3 == 3) {
            this.method198(var8, 81920, -233, var7);
            this.method198(var8 - 1, 1024, -233, var7);
            this.method198(var8, 4096, -233, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIIZ)V")
    public void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field659;
        int var10 = arg4 - this.field660;
        int var11 = 15 / arg1;
        if (arg2 == 1 || arg2 == 3) {
            int var12 = arg3;
            arg3 = arg5;
            arg5 = var12;
        }
        for (int var13 = var9; var13 < arg3 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field661) {
                for (int var14 = var10; var14 < arg5 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field662) {
                        this.method198(var14, var8, -233, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIII)V")
    private void method198(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field663[arg3][arg0] &= 16777215 - arg1;
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "c", descriptor = "(III)V")
    public void method199(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field659;
        int var5 = arg1 - this.field660;
        this.field663[var4][var5] &= 0xDFFFFF;
        if (arg0 != 0) {
            this.field654 = -191;
        }
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg6 && arg4 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field659;
        int var9 = arg5 - this.field660;
        int var10 = arg6 - this.field659;
        if (arg2 != 6) {
            this.field657 = -190;
        }
        int var11 = arg4 - this.field660;
        if (arg0 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg5 && arg0 == arg6) {
            return true;
        }
        int var8 = arg5 - this.field659;
        int var9 = arg6 - this.field660;
        int var10 = arg4 - this.field659;
        int var11 = arg0 - this.field660;
        if (arg1 != 20484) {
            this.field656 = !this.field656;
        }
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field663[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field663[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field663[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIIZI)Z")
    public boolean method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg6) {
            throw new NullPointerException();
        }
        int var9 = arg3 + arg4 - 1;
        int var10 = arg0 + arg5 - 1;
        if (arg2 >= arg3 && arg2 <= var9 && arg1 >= arg5 && arg1 <= var10) {
            return true;
        } else if (arg3 - 1 == arg2 && arg1 >= arg5 && arg1 <= var10 && (this.field663[arg2 - this.field659][arg1 - this.field660] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg1 >= arg5 && arg1 <= var10 && (this.field663[arg2 - this.field659][arg1 - this.field660] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg1 && arg2 >= arg3 && arg2 <= var9 && (this.field663[arg2 - this.field659][arg1 - this.field660] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg2 >= arg3 && arg2 <= var9 && (this.field663[arg2 - this.field659][arg1 - this.field660] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
