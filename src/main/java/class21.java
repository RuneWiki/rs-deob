import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GQSCEHQI")
public class class21 {

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "Z")
    private boolean field820 = true;

    @OriginalMember(owner = "GQSCEHQI", name = "b", descriptor = "I")
    private int field821 = 6;

    @OriginalMember(owner = "GQSCEHQI", name = "c", descriptor = "Z")
    private boolean field822 = true;

    @OriginalMember(owner = "GQSCEHQI", name = "d", descriptor = "I")
    private int field823 = -207;

    @OriginalMember(owner = "GQSCEHQI", name = "e", descriptor = "I")
    public int field824 = 0;

    @OriginalMember(owner = "GQSCEHQI", name = "f", descriptor = "I")
    public int field825 = 0;

    @OriginalMember(owner = "GQSCEHQI", name = "g", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "GQSCEHQI", name = "h", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "GQSCEHQI", name = "i", descriptor = "[[I")
    public int[][] field828;

    @OriginalMember(owner = "GQSCEHQI", name = "<init>", descriptor = "(III)V")
    public class21(int arg0, int arg1, int arg2) {
        this.field826 = arg1;
        this.field827 = arg0;
        this.field828 = new int[this.field826][this.field827];
        this.method213();
        if (arg2 != -44659) {
            throw new NullPointerException();
        } else if (class54.field1301) {
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "()V")
    public void method213() {
        for (int var1 = 0; var1 < this.field826; var1++) {
            for (int var2 = 0; var2 < this.field827; var2++) {
                if (var1 == 0 || var2 == 0 || this.field826 - 1 == var1 || this.field827 - 1 == var2) {
                    this.field828[var1][var2] = 16777215;
                } else {
                    this.field828[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(IBIIZI)V")
    public void method214(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 != 6) {
            return;
        }
        boolean var7 = false;
        int var8 = arg3 - this.field824;
        int var9 = arg0 - this.field825;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method217(var8, var9, 128);
                this.method217(var8 - 1, var9, 8);
            }
            if (arg2 == 1) {
                this.method217(var8, var9, 2);
                this.method217(var8, var9 + 1, 32);
            }
            if (arg2 == 2) {
                this.method217(var8, var9, 8);
                this.method217(var8 + 1, var9, 128);
            }
            if (arg2 == 3) {
                this.method217(var8, var9, 32);
                this.method217(var8, var9 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method217(var8, var9, 1);
                this.method217(var8 - 1, var9 + 1, 16);
            }
            if (arg2 == 1) {
                this.method217(var8, var9, 4);
                this.method217(var8 + 1, var9 + 1, 64);
            }
            if (arg2 == 2) {
                this.method217(var8, var9, 16);
                this.method217(var8 + 1, var9 - 1, 1);
            }
            if (arg2 == 3) {
                this.method217(var8, var9, 64);
                this.method217(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method217(var8, var9, 130);
                this.method217(var8 - 1, var9, 8);
                this.method217(var8, var9 + 1, 32);
            }
            if (arg2 == 1) {
                this.method217(var8, var9, 10);
                this.method217(var8, var9 + 1, 32);
                this.method217(var8 + 1, var9, 128);
            }
            if (arg2 == 2) {
                this.method217(var8, var9, 40);
                this.method217(var8 + 1, var9, 128);
                this.method217(var8, var9 - 1, 2);
            }
            if (arg2 == 3) {
                this.method217(var8, var9, 160);
                this.method217(var8, var9 - 1, 2);
                this.method217(var8 - 1, var9, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method217(var8, var9, 65536);
                this.method217(var8 - 1, var9, 4096);
            }
            if (arg2 == 1) {
                this.method217(var8, var9, 1024);
                this.method217(var8, var9 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method217(var8, var9, 4096);
                this.method217(var8 + 1, var9, 65536);
            }
            if (arg2 == 3) {
                this.method217(var8, var9, 16384);
                this.method217(var8, var9 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method217(var8, var9, 512);
                this.method217(var8 - 1, var9 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method217(var8, var9, 2048);
                this.method217(var8 + 1, var9 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method217(var8, var9, 8192);
                this.method217(var8 + 1, var9 - 1, 512);
            }
            if (arg2 == 3) {
                this.method217(var8, var9, 32768);
                this.method217(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method217(var8, var9, 66560);
            this.method217(var8 - 1, var9, 4096);
            this.method217(var8, var9 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method217(var8, var9, 5120);
            this.method217(var8, var9 + 1, 16384);
            this.method217(var8 + 1, var9, 65536);
        }
        if (arg2 == 2) {
            this.method217(var8, var9, 20480);
            this.method217(var8 + 1, var9, 65536);
            this.method217(var8, var9 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method217(var8, var9, 81920);
            this.method217(var8, var9 - 1, 1024);
            this.method217(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(IIBIIIZ)V")
    public void method215(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg2 != 8) {
            return;
        }
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field824;
        int var10 = arg3 - this.field825;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg0;
            arg0 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field826) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field827) {
                        this.method217(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(III)V")
    public void method216(int arg0, int arg1, int arg2) {
        int var4 = 28 / arg2;
        int var5 = arg0 - this.field824;
        int var6 = arg1 - this.field825;
        this.field828[var5][var6] |= 0x200000;
    }

    @OriginalMember(owner = "GQSCEHQI", name = "b", descriptor = "(III)V")
    private void method217(int arg0, int arg1, int arg2) {
        this.field828[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(IIIZII)V")
    public void method218(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field824;
        if (this.field821 != arg1) {
            return;
        }
        int var8 = arg2 - this.field825;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method220(46401, var8, 128, var7);
                this.method220(46401, var8, 8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method220(46401, var8, 2, var7);
                this.method220(46401, var8 + 1, 32, var7);
            }
            if (arg4 == 2) {
                this.method220(46401, var8, 8, var7);
                this.method220(46401, var8, 128, var7 + 1);
            }
            if (arg4 == 3) {
                this.method220(46401, var8, 32, var7);
                this.method220(46401, var8 - 1, 2, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method220(46401, var8, 1, var7);
                this.method220(46401, var8 + 1, 16, var7 - 1);
            }
            if (arg4 == 1) {
                this.method220(46401, var8, 4, var7);
                this.method220(46401, var8 + 1, 64, var7 + 1);
            }
            if (arg4 == 2) {
                this.method220(46401, var8, 16, var7);
                this.method220(46401, var8 - 1, 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method220(46401, var8, 64, var7);
                this.method220(46401, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method220(46401, var8, 130, var7);
                this.method220(46401, var8, 8, var7 - 1);
                this.method220(46401, var8 + 1, 32, var7);
            }
            if (arg4 == 1) {
                this.method220(46401, var8, 10, var7);
                this.method220(46401, var8 + 1, 32, var7);
                this.method220(46401, var8, 128, var7 + 1);
            }
            if (arg4 == 2) {
                this.method220(46401, var8, 40, var7);
                this.method220(46401, var8, 128, var7 + 1);
                this.method220(46401, var8 - 1, 2, var7);
            }
            if (arg4 == 3) {
                this.method220(46401, var8, 160, var7);
                this.method220(46401, var8 - 1, 2, var7);
                this.method220(46401, var8, 8, var7 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method220(46401, var8, 65536, var7);
                this.method220(46401, var8, 4096, var7 - 1);
            }
            if (arg4 == 1) {
                this.method220(46401, var8, 1024, var7);
                this.method220(46401, var8 + 1, 16384, var7);
            }
            if (arg4 == 2) {
                this.method220(46401, var8, 4096, var7);
                this.method220(46401, var8, 65536, var7 + 1);
            }
            if (arg4 == 3) {
                this.method220(46401, var8, 16384, var7);
                this.method220(46401, var8 - 1, 1024, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method220(46401, var8, 512, var7);
                this.method220(46401, var8 + 1, 8192, var7 - 1);
            }
            if (arg4 == 1) {
                this.method220(46401, var8, 2048, var7);
                this.method220(46401, var8 + 1, 32768, var7 + 1);
            }
            if (arg4 == 2) {
                this.method220(46401, var8, 8192, var7);
                this.method220(46401, var8 - 1, 512, var7 + 1);
            }
            if (arg4 == 3) {
                this.method220(46401, var8, 32768, var7);
                this.method220(46401, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method220(46401, var8, 66560, var7);
            this.method220(46401, var8, 4096, var7 - 1);
            this.method220(46401, var8 + 1, 16384, var7);
        }
        if (arg4 == 1) {
            this.method220(46401, var8, 5120, var7);
            this.method220(46401, var8 + 1, 16384, var7);
            this.method220(46401, var8, 65536, var7 + 1);
        }
        if (arg4 == 2) {
            this.method220(46401, var8, 20480, var7);
            this.method220(46401, var8, 65536, var7 + 1);
            this.method220(46401, var8 - 1, 1024, var7);
        }
        if (arg4 == 3) {
            this.method220(46401, var8, 81920, var7);
            this.method220(46401, var8 - 1, 1024, var7);
            this.method220(46401, var8, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(IIIIZIZ)V")
    public void method219(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field824;
        if (arg6) {
            return;
        }
        int var10 = arg0 - this.field825;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg5;
            arg5 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field826) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field827) {
                        this.method220(46401, var13, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(IIII)V")
    private void method220(int arg0, int arg1, int arg2, int arg3) {
        this.field828[arg3][arg1] &= 16777215 - arg2;
        if (arg0 != 46401) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "c", descriptor = "(III)V")
    public void method221(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1 - this.field824;
        int var6 = arg2 - this.field825;
        this.field828[var5][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg2 && arg1 == arg6) {
            return true;
        }
        int var8 = arg2 - this.field824;
        if (arg3 != 40655) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg6 - this.field825;
        int var11 = arg0 - this.field824;
        int var12 = arg1 - this.field825;
        if (arg5 == 0) {
            if (arg4 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field828[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field828[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field828[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field828[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field828[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field828[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field828[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field828[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field828[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field828[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field828[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "GQSCEHQI", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= 0) {
            throw new NullPointerException();
        } else if (arg3 == arg6 && arg0 == arg4) {
            return true;
        } else {
            int var8 = arg3 - this.field824;
            int var9 = arg0 - this.field825;
            int var10 = arg6 - this.field824;
            int var11 = arg4 - this.field825;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field828[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field828[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field828[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field828[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field828[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field828[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field828[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field828[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field828[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field828[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field828[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field828[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "GQSCEHQI", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 + arg6 - 1;
        int var10 = arg2 + arg4 - 1;
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (arg7 >= arg5 && arg7 <= var9 && arg0 >= arg4 && arg0 <= var10) {
            return true;
        } else if (arg5 - 1 == arg7 && arg0 >= arg4 && arg0 <= var10 && (this.field828[arg7 - this.field824][arg0 - this.field825] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg0 >= arg4 && arg0 <= var10 && (this.field828[arg7 - this.field824][arg0 - this.field825] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg0 && arg7 >= arg5 && arg7 <= var9 && (this.field828[arg7 - this.field824][arg0 - this.field825] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg7 >= arg5 && arg7 <= var9 && (this.field828[arg7 - this.field824][arg0 - this.field825] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
