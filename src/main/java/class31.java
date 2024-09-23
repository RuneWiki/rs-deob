import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MNHXSMWL")
public class class31 {

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "Z")
    private boolean field907 = true;

    @OriginalMember(owner = "MNHXSMWL", name = "b", descriptor = "I")
    private int field908 = -46309;

    @OriginalMember(owner = "MNHXSMWL", name = "c", descriptor = "I")
    private int field909 = 726;

    @OriginalMember(owner = "MNHXSMWL", name = "d", descriptor = "I")
    private int field910 = 49110;

    @OriginalMember(owner = "MNHXSMWL", name = "e", descriptor = "I")
    private int field911 = 49110;

    @OriginalMember(owner = "MNHXSMWL", name = "f", descriptor = "Z")
    private boolean field912 = true;

    @OriginalMember(owner = "MNHXSMWL", name = "g", descriptor = "Z")
    private boolean field913 = false;

    @OriginalMember(owner = "MNHXSMWL", name = "h", descriptor = "I")
    private int field914 = -868;

    @OriginalMember(owner = "MNHXSMWL", name = "i", descriptor = "I")
    public int field915 = 0;

    @OriginalMember(owner = "MNHXSMWL", name = "j", descriptor = "I")
    public int field916 = 0;

    @OriginalMember(owner = "MNHXSMWL", name = "k", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "MNHXSMWL", name = "l", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "MNHXSMWL", name = "m", descriptor = "[[I")
    public int[][] field919;

    @OriginalMember(owner = "MNHXSMWL", name = "<init>", descriptor = "(IZI)V")
    public class31(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field917 = arg2;
        this.field918 = arg0;
        this.field919 = new int[this.field917][this.field918];
        this.method268();
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "()V")
    public void method268() {
        for (int var1 = 0; var1 < this.field917; var1++) {
            for (int var2 = 0; var2 < this.field918; var2++) {
                if (var1 == 0 || var2 == 0 || this.field917 - 1 == var1 || this.field918 - 1 == var2) {
                    this.field919[var1][var2] = 16777215;
                } else {
                    this.field919[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(IIIIIZ)V")
    public void method269(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field915;
        int var8 = arg0 - this.field916;
        if (arg4 != 8) {
            this.field908 = 494;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method272(var7, var8, 128);
                this.method272(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method272(var7, var8, 2);
                this.method272(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method272(var7, var8, 8);
                this.method272(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method272(var7, var8, 32);
                this.method272(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method272(var7, var8, 1);
                this.method272(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method272(var7, var8, 4);
                this.method272(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method272(var7, var8, 16);
                this.method272(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method272(var7, var8, 64);
                this.method272(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method272(var7, var8, 130);
                this.method272(var7 - 1, var8, 8);
                this.method272(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method272(var7, var8, 10);
                this.method272(var7, var8 + 1, 32);
                this.method272(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method272(var7, var8, 40);
                this.method272(var7 + 1, var8, 128);
                this.method272(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method272(var7, var8, 160);
                this.method272(var7, var8 - 1, 2);
                this.method272(var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method272(var7, var8, 65536);
                this.method272(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method272(var7, var8, 1024);
                this.method272(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method272(var7, var8, 4096);
                this.method272(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method272(var7, var8, 16384);
                this.method272(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method272(var7, var8, 512);
                this.method272(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method272(var7, var8, 2048);
                this.method272(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method272(var7, var8, 8192);
                this.method272(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method272(var7, var8, 32768);
                this.method272(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method272(var7, var8, 66560);
            this.method272(var7 - 1, var8, 4096);
            this.method272(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method272(var7, var8, 5120);
            this.method272(var7, var8 + 1, 16384);
            this.method272(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method272(var7, var8, 20480);
            this.method272(var7 + 1, var8, 65536);
            this.method272(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method272(var7, var8, 81920);
            this.method272(var7, var8 - 1, 1024);
            this.method272(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(IIIZIII)V")
    public void method270(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field915;
        int var10 = arg1 - this.field916;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg0;
            arg0 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field917) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field918) {
                        this.method272(var12, var13, var8);
                    }
                }
            }
        }
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(III)V")
    public void method271(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field915;
        int var5 = arg0 - this.field916;
        this.field919[var4][var5] |= 0x200000;
        if (arg1 != 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "MNHXSMWL", name = "b", descriptor = "(III)V")
    private void method272(int arg0, int arg1, int arg2) {
        this.field919[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(ZIIIIZ)V")
    public void method273(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg2 - this.field915;
        int var9 = arg3 - this.field916;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method275(var8, false, 128, var9);
                this.method275(var8 - 1, false, 8, var9);
            }
            if (arg1 == 1) {
                this.method275(var8, false, 2, var9);
                this.method275(var8, false, 32, var9 + 1);
            }
            if (arg1 == 2) {
                this.method275(var8, false, 8, var9);
                this.method275(var8 + 1, false, 128, var9);
            }
            if (arg1 == 3) {
                this.method275(var8, false, 32, var9);
                this.method275(var8, false, 2, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method275(var8, false, 1, var9);
                this.method275(var8 - 1, false, 16, var9 + 1);
            }
            if (arg1 == 1) {
                this.method275(var8, false, 4, var9);
                this.method275(var8 + 1, false, 64, var9 + 1);
            }
            if (arg1 == 2) {
                this.method275(var8, false, 16, var9);
                this.method275(var8 + 1, false, 1, var9 - 1);
            }
            if (arg1 == 3) {
                this.method275(var8, false, 64, var9);
                this.method275(var8 - 1, false, 4, var9 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method275(var8, false, 130, var9);
                this.method275(var8 - 1, false, 8, var9);
                this.method275(var8, false, 32, var9 + 1);
            }
            if (arg1 == 1) {
                this.method275(var8, false, 10, var9);
                this.method275(var8, false, 32, var9 + 1);
                this.method275(var8 + 1, false, 128, var9);
            }
            if (arg1 == 2) {
                this.method275(var8, false, 40, var9);
                this.method275(var8 + 1, false, 128, var9);
                this.method275(var8, false, 2, var9 - 1);
            }
            if (arg1 == 3) {
                this.method275(var8, false, 160, var9);
                this.method275(var8, false, 2, var9 - 1);
                this.method275(var8 - 1, false, 8, var9);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method275(var8, false, 65536, var9);
                this.method275(var8 - 1, false, 4096, var9);
            }
            if (arg1 == 1) {
                this.method275(var8, false, 1024, var9);
                this.method275(var8, false, 16384, var9 + 1);
            }
            if (arg1 == 2) {
                this.method275(var8, false, 4096, var9);
                this.method275(var8 + 1, false, 65536, var9);
            }
            if (arg1 == 3) {
                this.method275(var8, false, 16384, var9);
                this.method275(var8, false, 1024, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method275(var8, false, 512, var9);
                this.method275(var8 - 1, false, 8192, var9 + 1);
            }
            if (arg1 == 1) {
                this.method275(var8, false, 2048, var9);
                this.method275(var8 + 1, false, 32768, var9 + 1);
            }
            if (arg1 == 2) {
                this.method275(var8, false, 8192, var9);
                this.method275(var8 + 1, false, 512, var9 - 1);
            }
            if (arg1 == 3) {
                this.method275(var8, false, 32768, var9);
                this.method275(var8 - 1, false, 2048, var9 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method275(var8, false, 66560, var9);
            this.method275(var8 - 1, false, 4096, var9);
            this.method275(var8, false, 16384, var9 + 1);
        }
        if (arg1 == 1) {
            this.method275(var8, false, 5120, var9);
            this.method275(var8, false, 16384, var9 + 1);
            this.method275(var8 + 1, false, 65536, var9);
        }
        if (arg1 == 2) {
            this.method275(var8, false, 20480, var9);
            this.method275(var8 + 1, false, 65536, var9);
            this.method275(var8, false, 1024, var9 - 1);
        }
        if (arg1 == 3) {
            this.method275(var8, false, 81920, var9);
            this.method275(var8, false, 1024, var9 - 1);
            this.method275(var8 - 1, false, 4096, var9);
            return;
        }
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(ZIIIIBI)V")
    public void method274(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field915;
        int var10 = arg2 - this.field916;
        if (arg5 != -78) {
            this.field914 = -299;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field917) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field918) {
                        this.method275(var12, false, var8, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(IZII)V")
    private void method275(int arg0, boolean arg1, int arg2, int arg3) {
        this.field919[arg0][arg3] &= 16777215 - arg2;
        if (arg1) {
            this.field913 = !this.field913;
        }
    }

    @OriginalMember(owner = "MNHXSMWL", name = "c", descriptor = "(III)V")
    public void method276(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field915;
        if (arg2 < 0 || arg2 > 0) {
            this.field907 = !this.field907;
        }
        int var5 = arg1 - this.field916;
        this.field919[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(BIIIIII)Z")
    public boolean method277(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg5 && arg2 == arg3) {
            return true;
        }
        int var8 = arg5 - this.field915;
        if (arg0 != 7) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg3 - this.field916;
        int var11 = arg1 - this.field915;
        int var12 = arg2 - this.field916;
        if (arg6 == 0) {
            if (arg4 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field919[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field919[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field919[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field919[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg4 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field919[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field919[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field919[var8][var10] & 0x1280120) == 0) {
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
                if (var8 == var11 && var12 + 1 == var10 && (this.field919[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field919[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field919[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field919[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(IIIIIZI)Z")
    public boolean method278(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 == arg2 && arg4 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field915;
        if (arg5) {
            throw new NullPointerException();
        }
        int var9 = arg6 - this.field916;
        int var10 = arg2 - this.field915;
        int var11 = arg4 - this.field916;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field919[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field919[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field919[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field919[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field919[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field919[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field919[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field919[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field919[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field919[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field919[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field919[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "MNHXSMWL", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4 + arg5 - 1;
        int var10 = arg1 + arg6 - 1;
        if (arg7 != 7) {
            this.field913 = !this.field913;
        }
        if (arg2 >= arg4 && arg2 <= var9 && arg3 >= arg1 && arg3 <= var10) {
            return true;
        } else if (arg4 - 1 == arg2 && arg3 >= arg1 && arg3 <= var10 && (this.field919[arg2 - this.field915][arg3 - this.field916] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg3 >= arg1 && arg3 <= var10 && (this.field919[arg2 - this.field915][arg3 - this.field916] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg3 && arg2 >= arg4 && arg2 <= var9 && (this.field919[arg2 - this.field915][arg3 - this.field916] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg2 >= arg4 && arg2 <= var9 && (this.field919[arg2 - this.field915][arg3 - this.field916] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
