import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HUQCCBIO")
public class class21 {

    @OriginalMember(owner = "HUQCCBIO", name = "b", descriptor = "I")
    private int field854 = 5;

    @OriginalMember(owner = "HUQCCBIO", name = "c", descriptor = "I")
    private int field855 = 910;

    @OriginalMember(owner = "HUQCCBIO", name = "d", descriptor = "I")
    private int field856 = 2;

    @OriginalMember(owner = "HUQCCBIO", name = "e", descriptor = "Z")
    private boolean field857 = true;

    @OriginalMember(owner = "HUQCCBIO", name = "f", descriptor = "I")
    private int field858 = 8;

    @OriginalMember(owner = "HUQCCBIO", name = "g", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "HUQCCBIO", name = "h", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "HUQCCBIO", name = "i", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "HUQCCBIO", name = "j", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "HUQCCBIO", name = "k", descriptor = "[[I")
    public int[][] field863;

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "HUQCCBIO", name = "<init>", descriptor = "(IZI)V")
    public class21(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field857 = !this.field857;
        }
        this.field859 = 0;
        this.field860 = 0;
        this.field861 = arg0;
        this.field862 = arg2;
        this.field863 = new int[this.field861][this.field862];
        this.method299((byte) 71);
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(B)V")
    public void method299(byte arg0) {
        for (int var2 = 0; var2 < this.field861; var2++) {
            for (int var3 = 0; var3 < this.field862; var3++) {
                if (var2 == 0 || var3 == 0 || this.field861 - 1 == var2 || this.field862 - 1 == var3) {
                    this.field863[var2][var3] = 16777215;
                } else {
                    this.field863[var2][var3] = 0;
                }
            }
        }
        if (arg0 != 71) {
            this.field853 = 288;
        }
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IIIZII)V")
    public void method300(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field859;
        if (arg2 != 4215) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg0 - this.field860;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method303(var7, var9, 128);
                this.method303(var7 - 1, var9, 8);
            }
            if (arg4 == 1) {
                this.method303(var7, var9, 2);
                this.method303(var7, var9 + 1, 32);
            }
            if (arg4 == 2) {
                this.method303(var7, var9, 8);
                this.method303(var7 + 1, var9, 128);
            }
            if (arg4 == 3) {
                this.method303(var7, var9, 32);
                this.method303(var7, var9 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method303(var7, var9, 1);
                this.method303(var7 - 1, var9 + 1, 16);
            }
            if (arg4 == 1) {
                this.method303(var7, var9, 4);
                this.method303(var7 + 1, var9 + 1, 64);
            }
            if (arg4 == 2) {
                this.method303(var7, var9, 16);
                this.method303(var7 + 1, var9 - 1, 1);
            }
            if (arg4 == 3) {
                this.method303(var7, var9, 64);
                this.method303(var7 - 1, var9 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method303(var7, var9, 130);
                this.method303(var7 - 1, var9, 8);
                this.method303(var7, var9 + 1, 32);
            }
            if (arg4 == 1) {
                this.method303(var7, var9, 10);
                this.method303(var7, var9 + 1, 32);
                this.method303(var7 + 1, var9, 128);
            }
            if (arg4 == 2) {
                this.method303(var7, var9, 40);
                this.method303(var7 + 1, var9, 128);
                this.method303(var7, var9 - 1, 2);
            }
            if (arg4 == 3) {
                this.method303(var7, var9, 160);
                this.method303(var7, var9 - 1, 2);
                this.method303(var7 - 1, var9, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method303(var7, var9, 65536);
                this.method303(var7 - 1, var9, 4096);
            }
            if (arg4 == 1) {
                this.method303(var7, var9, 1024);
                this.method303(var7, var9 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method303(var7, var9, 4096);
                this.method303(var7 + 1, var9, 65536);
            }
            if (arg4 == 3) {
                this.method303(var7, var9, 16384);
                this.method303(var7, var9 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method303(var7, var9, 512);
                this.method303(var7 - 1, var9 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method303(var7, var9, 2048);
                this.method303(var7 + 1, var9 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method303(var7, var9, 8192);
                this.method303(var7 + 1, var9 - 1, 512);
            }
            if (arg4 == 3) {
                this.method303(var7, var9, 32768);
                this.method303(var7 - 1, var9 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method303(var7, var9, 66560);
            this.method303(var7 - 1, var9, 4096);
            this.method303(var7, var9 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method303(var7, var9, 5120);
            this.method303(var7, var9 + 1, 16384);
            this.method303(var7 + 1, var9, 65536);
        }
        if (arg4 == 2) {
            this.method303(var7, var9, 20480);
            this.method303(var7 + 1, var9, 65536);
            this.method303(var7, var9 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method303(var7, var9, 81920);
            this.method303(var7, var9 - 1, 1024);
            this.method303(var7 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(ZIIIZII)V")
    public void method301(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg4) {
            var8 += 131072;
        }
        int var10 = arg6 - this.field859;
        int var11 = arg1 - this.field860;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg2;
            arg2 = arg3;
            arg3 = var12;
        }
        for (int var13 = var10; var13 < arg2 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field861) {
                for (int var14 = var11; var14 < arg3 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field862) {
                        this.method303(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IBI)V")
    public void method302(int arg0, byte arg1, int arg2) {
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.field853 = 47;
        }
        int var5 = arg0 - this.field859;
        int var6 = arg2 - this.field860;
        this.field863[var5][var6] |= 0x200000;
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(III)V")
    private void method303(int arg0, int arg1, int arg2) {
        this.field863[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IZIIII)V")
    public void method304(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -30817) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg0 - this.field859;
        int var9 = arg2 - this.field860;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method306(128, var9, 910, var8);
                this.method306(8, var9, 910, var8 - 1);
            }
            if (arg3 == 1) {
                this.method306(2, var9, 910, var8);
                this.method306(32, var9 + 1, 910, var8);
            }
            if (arg3 == 2) {
                this.method306(8, var9, 910, var8);
                this.method306(128, var9, 910, var8 + 1);
            }
            if (arg3 == 3) {
                this.method306(32, var9, 910, var8);
                this.method306(2, var9 - 1, 910, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method306(1, var9, 910, var8);
                this.method306(16, var9 + 1, 910, var8 - 1);
            }
            if (arg3 == 1) {
                this.method306(4, var9, 910, var8);
                this.method306(64, var9 + 1, 910, var8 + 1);
            }
            if (arg3 == 2) {
                this.method306(16, var9, 910, var8);
                this.method306(1, var9 - 1, 910, var8 + 1);
            }
            if (arg3 == 3) {
                this.method306(64, var9, 910, var8);
                this.method306(4, var9 - 1, 910, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method306(130, var9, 910, var8);
                this.method306(8, var9, 910, var8 - 1);
                this.method306(32, var9 + 1, 910, var8);
            }
            if (arg3 == 1) {
                this.method306(10, var9, 910, var8);
                this.method306(32, var9 + 1, 910, var8);
                this.method306(128, var9, 910, var8 + 1);
            }
            if (arg3 == 2) {
                this.method306(40, var9, 910, var8);
                this.method306(128, var9, 910, var8 + 1);
                this.method306(2, var9 - 1, 910, var8);
            }
            if (arg3 == 3) {
                this.method306(160, var9, 910, var8);
                this.method306(2, var9 - 1, 910, var8);
                this.method306(8, var9, 910, var8 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method306(65536, var9, 910, var8);
                this.method306(4096, var9, 910, var8 - 1);
            }
            if (arg3 == 1) {
                this.method306(1024, var9, 910, var8);
                this.method306(16384, var9 + 1, 910, var8);
            }
            if (arg3 == 2) {
                this.method306(4096, var9, 910, var8);
                this.method306(65536, var9, 910, var8 + 1);
            }
            if (arg3 == 3) {
                this.method306(16384, var9, 910, var8);
                this.method306(1024, var9 - 1, 910, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method306(512, var9, 910, var8);
                this.method306(8192, var9 + 1, 910, var8 - 1);
            }
            if (arg3 == 1) {
                this.method306(2048, var9, 910, var8);
                this.method306(32768, var9 + 1, 910, var8 + 1);
            }
            if (arg3 == 2) {
                this.method306(8192, var9, 910, var8);
                this.method306(512, var9 - 1, 910, var8 + 1);
            }
            if (arg3 == 3) {
                this.method306(32768, var9, 910, var8);
                this.method306(2048, var9 - 1, 910, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method306(66560, var9, 910, var8);
            this.method306(4096, var9, 910, var8 - 1);
            this.method306(16384, var9 + 1, 910, var8);
        }
        if (arg3 == 1) {
            this.method306(5120, var9, 910, var8);
            this.method306(16384, var9 + 1, 910, var8);
            this.method306(65536, var9, 910, var8 + 1);
        }
        if (arg3 == 2) {
            this.method306(20480, var9, 910, var8);
            this.method306(65536, var9, 910, var8 + 1);
            this.method306(1024, var9 - 1, 910, var8);
        }
        if (arg3 == 3) {
            this.method306(81920, var9, 910, var8);
            this.method306(1024, var9 - 1, 910, var8);
            this.method306(4096, var9, 910, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IIIIIIZ)V")
    public void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field859;
        int var10 = arg4 - this.field860;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field861) {
                for (int var14 = var10; var14 < arg2 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field862) {
                        this.method306(var8, var14, 910, var12);
                    }
                }
            }
        }
        if (this.field854 != arg1) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IIII)V")
    private void method306(int arg0, int arg1, int arg2, int arg3) {
        this.field863[arg3][arg1] &= 16777215 - arg0;
        int var5 = 60 / arg2;
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IZI)V")
    public void method307(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field859;
        int var5 = arg2 - this.field860;
        this.field863[var4][var5] &= 0xDFFFFF;
        if (!arg1) {
            this.field858 = -452;
        }
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IIIIIIB)Z")
    public boolean method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg2 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg2 - this.field859;
        if (arg6 != 7) {
            this.field858 = -494;
        }
        int var9 = arg4 - this.field860;
        int var10 = arg3 - this.field859;
        int var11 = arg5 - this.field860;
        if (arg0 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field863[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field863[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field863[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field863[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280180) == 0) {
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
                if (var10 + 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field863[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field863[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field863[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field863[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field863[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field863[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field863[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IIIZIII)Z")
    public boolean method309(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg2 == arg5) {
            return true;
        }
        int var8 = arg6 - this.field859;
        int var9 = arg2 - this.field860;
        int var10 = arg4 - this.field859;
        if (arg3) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg5 - this.field860;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field863[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field863[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field863[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field863[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field863[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field863[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field863[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field863[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field863[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field863[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field863[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field863[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "HUQCCBIO", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 < 1 || arg6 > 1) {
            throw new NullPointerException();
        }
        int var9 = arg0 + arg5 - 1;
        int var10 = arg4 + arg7 - 1;
        if (arg1 >= arg5 && arg1 <= var9 && arg3 >= arg4 && arg3 <= var10) {
            return true;
        } else if (arg5 - 1 == arg1 && arg3 >= arg4 && arg3 <= var10 && (this.field863[arg1 - this.field859][arg3 - this.field860] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg1 && arg3 >= arg4 && arg3 <= var10 && (this.field863[arg1 - this.field859][arg3 - this.field860] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg3 && arg1 >= arg5 && arg1 <= var9 && (this.field863[arg1 - this.field859][arg3 - this.field860] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg1 >= arg5 && arg1 <= var9 && (this.field863[arg1 - this.field859][arg3 - this.field860] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
