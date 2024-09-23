import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BBRQYCNY")
public class class2 {

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "I")
    private int field18 = -357;

    @OriginalMember(owner = "BBRQYCNY", name = "b", descriptor = "B")
    private byte field19 = 91;

    @OriginalMember(owner = "BBRQYCNY", name = "c", descriptor = "Z")
    private boolean field20 = false;

    @OriginalMember(owner = "BBRQYCNY", name = "d", descriptor = "Z")
    private boolean field21 = true;

    @OriginalMember(owner = "BBRQYCNY", name = "e", descriptor = "I")
    public int field22 = 0;

    @OriginalMember(owner = "BBRQYCNY", name = "f", descriptor = "I")
    public int field23 = 0;

    @OriginalMember(owner = "BBRQYCNY", name = "g", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "BBRQYCNY", name = "h", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "BBRQYCNY", name = "i", descriptor = "[[I")
    public int[][] field26;

    @OriginalMember(owner = "BBRQYCNY", name = "<init>", descriptor = "(IZI)V")
    public class2(int arg0, boolean arg1, int arg2) {
        this.field24 = arg0;
        if (arg1) {
            throw new NullPointerException();
        }
        this.field25 = arg2;
        this.field26 = new int[this.field24][this.field25];
        this.method39();
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "()V")
    public void method39() {
        for (int var1 = 0; var1 < this.field24; var1++) {
            for (int var2 = 0; var2 < this.field25; var2++) {
                if (var1 == 0 || var2 == 0 || this.field24 - 1 == var1 || this.field25 - 1 == var2) {
                    this.field26[var1][var2] = 16777215;
                } else {
                    this.field26[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(IIIIZI)V")
    public void method40(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg5 - this.field22;
        if (arg3 >= 0) {
            return;
        }
        int var8 = arg1 - this.field23;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method43(var7, var8, 128);
                this.method43(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method43(var7, var8, 2);
                this.method43(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method43(var7, var8, 8);
                this.method43(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method43(var7, var8, 32);
                this.method43(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method43(var7, var8, 1);
                this.method43(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method43(var7, var8, 4);
                this.method43(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method43(var7, var8, 16);
                this.method43(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method43(var7, var8, 64);
                this.method43(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method43(var7, var8, 130);
                this.method43(var7 - 1, var8, 8);
                this.method43(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method43(var7, var8, 10);
                this.method43(var7, var8 + 1, 32);
                this.method43(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method43(var7, var8, 40);
                this.method43(var7 + 1, var8, 128);
                this.method43(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method43(var7, var8, 160);
                this.method43(var7, var8 - 1, 2);
                this.method43(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method43(var7, var8, 65536);
                this.method43(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method43(var7, var8, 1024);
                this.method43(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method43(var7, var8, 4096);
                this.method43(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method43(var7, var8, 16384);
                this.method43(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method43(var7, var8, 512);
                this.method43(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method43(var7, var8, 2048);
                this.method43(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method43(var7, var8, 8192);
                this.method43(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method43(var7, var8, 32768);
                this.method43(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method43(var7, var8, 66560);
            this.method43(var7 - 1, var8, 4096);
            this.method43(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method43(var7, var8, 5120);
            this.method43(var7, var8 + 1, 16384);
            this.method43(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method43(var7, var8, 20480);
            this.method43(var7 + 1, var8, 65536);
            this.method43(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method43(var7, var8, 81920);
            this.method43(var7, var8 - 1, 1024);
            this.method43(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(IIIIIZI)V")
    public void method41(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field22;
        int var10 = arg1 - this.field23;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field24) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field25) {
                        this.method43(var12, var13, var8);
                    }
                }
            }
        }
        if (arg4 == -47207) {
            ;
        }
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(III)V")
    public void method42(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field22;
        int var5 = arg1 - this.field23;
        if (arg0 < 5 || arg0 > 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field26[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "BBRQYCNY", name = "b", descriptor = "(III)V")
    private void method43(int arg0, int arg1, int arg2) {
        this.field26[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(ZIIIIZ)V")
    public void method44(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg2 - this.field22;
        int var8 = arg3 - this.field23;
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method46(128, var7, false, var8);
                this.method46(8, var7 - 1, false, var8);
            }
            if (arg4 == 1) {
                this.method46(2, var7, false, var8);
                this.method46(32, var7, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method46(8, var7, false, var8);
                this.method46(128, var7 + 1, false, var8);
            }
            if (arg4 == 3) {
                this.method46(32, var7, false, var8);
                this.method46(2, var7, false, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method46(1, var7, false, var8);
                this.method46(16, var7 - 1, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method46(4, var7, false, var8);
                this.method46(64, var7 + 1, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method46(16, var7, false, var8);
                this.method46(1, var7 + 1, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method46(64, var7, false, var8);
                this.method46(4, var7 - 1, false, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method46(130, var7, false, var8);
                this.method46(8, var7 - 1, false, var8);
                this.method46(32, var7, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method46(10, var7, false, var8);
                this.method46(32, var7, false, var8 + 1);
                this.method46(128, var7 + 1, false, var8);
            }
            if (arg4 == 2) {
                this.method46(40, var7, false, var8);
                this.method46(128, var7 + 1, false, var8);
                this.method46(2, var7, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method46(160, var7, false, var8);
                this.method46(2, var7, false, var8 - 1);
                this.method46(8, var7 - 1, false, var8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method46(65536, var7, false, var8);
                this.method46(4096, var7 - 1, false, var8);
            }
            if (arg4 == 1) {
                this.method46(1024, var7, false, var8);
                this.method46(16384, var7, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method46(4096, var7, false, var8);
                this.method46(65536, var7 + 1, false, var8);
            }
            if (arg4 == 3) {
                this.method46(16384, var7, false, var8);
                this.method46(1024, var7, false, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method46(512, var7, false, var8);
                this.method46(8192, var7 - 1, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method46(2048, var7, false, var8);
                this.method46(32768, var7 + 1, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method46(8192, var7, false, var8);
                this.method46(512, var7 + 1, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method46(32768, var7, false, var8);
                this.method46(2048, var7 - 1, false, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method46(66560, var7, false, var8);
            this.method46(4096, var7 - 1, false, var8);
            this.method46(16384, var7, false, var8 + 1);
        }
        if (arg4 == 1) {
            this.method46(5120, var7, false, var8);
            this.method46(16384, var7, false, var8 + 1);
            this.method46(65536, var7 + 1, false, var8);
        }
        if (arg4 == 2) {
            this.method46(20480, var7, false, var8);
            this.method46(65536, var7 + 1, false, var8);
            this.method46(1024, var7, false, var8 - 1);
        }
        if (arg4 == 3) {
            this.method46(81920, var7, false, var8);
            this.method46(1024, var7, false, var8 - 1);
            this.method46(4096, var7 - 1, false, var8);
            return;
        }
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(ZIIIIII)V")
    public void method45(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field22;
        int var10 = 39 / arg6;
        int var11 = arg1 - this.field23;
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg2;
            arg2 = arg5;
            arg5 = var12;
        }
        for (int var13 = var9; var13 < arg2 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field24) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field25) {
                        this.method46(var8, var13, false, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(IIZI)V")
    private void method46(int arg0, int arg1, boolean arg2, int arg3) {
        this.field26[arg1][arg3] &= 16777215 - arg0;
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "BBRQYCNY", name = "c", descriptor = "(III)V")
    public void method47(int arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            this.field18 = -249;
        }
        int var4 = arg0 - this.field22;
        int var5 = arg2 - this.field23;
        this.field26[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg2 && arg3 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field22;
        int var9 = arg4 - this.field23;
        int var10 = arg2 - this.field22;
        int var11 = arg3 - this.field23;
        if (arg5 != 9) {
            this.field21 = !this.field21;
        }
        if (arg6 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field26[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field26[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field26[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field26[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field26[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field26[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field26[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field26[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field26[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field26[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field26[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(IIIIIIZ)Z")
    public boolean method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 == arg3 && arg1 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field22;
        int var9 = arg4 - this.field23;
        int var10 = arg3 - this.field22;
        if (!arg6) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg1 - this.field23;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field26[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field26[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field26[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field26[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field26[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field26[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field26[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field26[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field26[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field26[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field26[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field26[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "BBRQYCNY", name = "a", descriptor = "(IBIIIIII)Z")
    public boolean method50(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 + arg7 - 1;
        int var10 = arg3 + arg5 - 1;
        if (arg1 != 90) {
            throw new NullPointerException();
        } else if (arg6 >= arg2 && arg6 <= var9 && arg4 >= arg5 && arg4 <= var10) {
            return true;
        } else if (arg2 - 1 == arg6 && arg4 >= arg5 && arg4 <= var10 && (this.field26[arg6 - this.field22][arg4 - this.field23] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg4 >= arg5 && arg4 <= var10 && (this.field26[arg6 - this.field22][arg4 - this.field23] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg4 && arg6 >= arg2 && arg6 <= var9 && (this.field26[arg6 - this.field22][arg4 - this.field23] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg4 && arg6 >= arg2 && arg6 <= var9 && (this.field26[arg6 - this.field22][arg4 - this.field23] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
