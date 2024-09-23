import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CGGBZSOS")
public class class5 {

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "I")
    private int field90 = 3;

    @OriginalMember(owner = "CGGBZSOS", name = "b", descriptor = "Z")
    private boolean field91 = false;

    @OriginalMember(owner = "CGGBZSOS", name = "c", descriptor = "Z")
    private boolean field92 = true;

    @OriginalMember(owner = "CGGBZSOS", name = "d", descriptor = "Z")
    private boolean field93 = true;

    @OriginalMember(owner = "CGGBZSOS", name = "f", descriptor = "B")
    private byte field95 = -69;

    @OriginalMember(owner = "CGGBZSOS", name = "g", descriptor = "B")
    private byte field96 = 6;

    @OriginalMember(owner = "CGGBZSOS", name = "h", descriptor = "I")
    private int field97 = -66;

    @OriginalMember(owner = "CGGBZSOS", name = "i", descriptor = "I")
    public int field98 = 0;

    @OriginalMember(owner = "CGGBZSOS", name = "j", descriptor = "I")
    public int field99 = 0;

    @OriginalMember(owner = "CGGBZSOS", name = "k", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "CGGBZSOS", name = "l", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "CGGBZSOS", name = "m", descriptor = "[[I")
    public int[][] field102;

    @OriginalMember(owner = "CGGBZSOS", name = "e", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "CGGBZSOS", name = "<init>", descriptor = "(IIB)V")
    public class5(int arg0, int arg1, byte arg2) {
        this.field100 = arg1;
        if (arg2 != 4) {
            this.field92 = !this.field92;
        }
        this.field101 = arg0;
        this.field102 = new int[this.field100][this.field101];
        this.method25();
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "()V")
    public void method25() {
        for (int var1 = 0; var1 < this.field100; var1++) {
            for (int var2 = 0; var2 < this.field101; var2++) {
                if (var1 == 0 || var2 == 0 || this.field100 - 1 == var1 || this.field101 - 1 == var2) {
                    this.field102[var1][var2] = 16777215;
                } else {
                    this.field102[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(BIIZII)V")
    public void method26(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 != 86) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg4 - this.field98;
        int var9 = arg1 - this.field99;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method29(var8, var9, 128);
                this.method29(var8 - 1, var9, 8);
            }
            if (arg5 == 1) {
                this.method29(var8, var9, 2);
                this.method29(var8, var9 + 1, 32);
            }
            if (arg5 == 2) {
                this.method29(var8, var9, 8);
                this.method29(var8 + 1, var9, 128);
            }
            if (arg5 == 3) {
                this.method29(var8, var9, 32);
                this.method29(var8, var9 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method29(var8, var9, 1);
                this.method29(var8 - 1, var9 + 1, 16);
            }
            if (arg5 == 1) {
                this.method29(var8, var9, 4);
                this.method29(var8 + 1, var9 + 1, 64);
            }
            if (arg5 == 2) {
                this.method29(var8, var9, 16);
                this.method29(var8 + 1, var9 - 1, 1);
            }
            if (arg5 == 3) {
                this.method29(var8, var9, 64);
                this.method29(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method29(var8, var9, 130);
                this.method29(var8 - 1, var9, 8);
                this.method29(var8, var9 + 1, 32);
            }
            if (arg5 == 1) {
                this.method29(var8, var9, 10);
                this.method29(var8, var9 + 1, 32);
                this.method29(var8 + 1, var9, 128);
            }
            if (arg5 == 2) {
                this.method29(var8, var9, 40);
                this.method29(var8 + 1, var9, 128);
                this.method29(var8, var9 - 1, 2);
            }
            if (arg5 == 3) {
                this.method29(var8, var9, 160);
                this.method29(var8, var9 - 1, 2);
                this.method29(var8 - 1, var9, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method29(var8, var9, 65536);
                this.method29(var8 - 1, var9, 4096);
            }
            if (arg5 == 1) {
                this.method29(var8, var9, 1024);
                this.method29(var8, var9 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method29(var8, var9, 4096);
                this.method29(var8 + 1, var9, 65536);
            }
            if (arg5 == 3) {
                this.method29(var8, var9, 16384);
                this.method29(var8, var9 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method29(var8, var9, 512);
                this.method29(var8 - 1, var9 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method29(var8, var9, 2048);
                this.method29(var8 + 1, var9 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method29(var8, var9, 8192);
                this.method29(var8 + 1, var9 - 1, 512);
            }
            if (arg5 == 3) {
                this.method29(var8, var9, 32768);
                this.method29(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method29(var8, var9, 66560);
            this.method29(var8 - 1, var9, 4096);
            this.method29(var8, var9 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method29(var8, var9, 5120);
            this.method29(var8, var9 + 1, 16384);
            this.method29(var8 + 1, var9, 65536);
        }
        if (arg5 == 2) {
            this.method29(var8, var9, 20480);
            this.method29(var8 + 1, var9, 65536);
            this.method29(var8, var9 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method29(var8, var9, 81920);
            this.method29(var8, var9 - 1, 1024);
            this.method29(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(IIIZZII)V")
    public void method27(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field98;
        int var10 = arg0 - this.field99;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg5;
            arg5 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field100) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field101) {
                        this.method29(var12, var13, var8);
                    }
                }
            }
        }
        if (arg3) {
            this.field97 = -111;
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(III)V")
    public void method28(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field98;
        if (arg1 == 43364) {
            int var5 = arg2 - this.field99;
            this.field102[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "b", descriptor = "(III)V")
    private void method29(int arg0, int arg1, int arg2) {
        this.field102[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(IZZIII)V")
    public void method30(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            this.field92 = !this.field92;
        }
        int var7 = arg5 - this.field98;
        int var8 = arg0 - this.field99;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method32(var7, 128, (byte) 2, var8);
                this.method32(var7 - 1, 8, (byte) 2, var8);
            }
            if (arg4 == 1) {
                this.method32(var7, 2, (byte) 2, var8);
                this.method32(var7, 32, (byte) 2, var8 + 1);
            }
            if (arg4 == 2) {
                this.method32(var7, 8, (byte) 2, var8);
                this.method32(var7 + 1, 128, (byte) 2, var8);
            }
            if (arg4 == 3) {
                this.method32(var7, 32, (byte) 2, var8);
                this.method32(var7, 2, (byte) 2, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method32(var7, 1, (byte) 2, var8);
                this.method32(var7 - 1, 16, (byte) 2, var8 + 1);
            }
            if (arg4 == 1) {
                this.method32(var7, 4, (byte) 2, var8);
                this.method32(var7 + 1, 64, (byte) 2, var8 + 1);
            }
            if (arg4 == 2) {
                this.method32(var7, 16, (byte) 2, var8);
                this.method32(var7 + 1, 1, (byte) 2, var8 - 1);
            }
            if (arg4 == 3) {
                this.method32(var7, 64, (byte) 2, var8);
                this.method32(var7 - 1, 4, (byte) 2, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method32(var7, 130, (byte) 2, var8);
                this.method32(var7 - 1, 8, (byte) 2, var8);
                this.method32(var7, 32, (byte) 2, var8 + 1);
            }
            if (arg4 == 1) {
                this.method32(var7, 10, (byte) 2, var8);
                this.method32(var7, 32, (byte) 2, var8 + 1);
                this.method32(var7 + 1, 128, (byte) 2, var8);
            }
            if (arg4 == 2) {
                this.method32(var7, 40, (byte) 2, var8);
                this.method32(var7 + 1, 128, (byte) 2, var8);
                this.method32(var7, 2, (byte) 2, var8 - 1);
            }
            if (arg4 == 3) {
                this.method32(var7, 160, (byte) 2, var8);
                this.method32(var7, 2, (byte) 2, var8 - 1);
                this.method32(var7 - 1, 8, (byte) 2, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method32(var7, 65536, (byte) 2, var8);
                this.method32(var7 - 1, 4096, (byte) 2, var8);
            }
            if (arg4 == 1) {
                this.method32(var7, 1024, (byte) 2, var8);
                this.method32(var7, 16384, (byte) 2, var8 + 1);
            }
            if (arg4 == 2) {
                this.method32(var7, 4096, (byte) 2, var8);
                this.method32(var7 + 1, 65536, (byte) 2, var8);
            }
            if (arg4 == 3) {
                this.method32(var7, 16384, (byte) 2, var8);
                this.method32(var7, 1024, (byte) 2, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method32(var7, 512, (byte) 2, var8);
                this.method32(var7 - 1, 8192, (byte) 2, var8 + 1);
            }
            if (arg4 == 1) {
                this.method32(var7, 2048, (byte) 2, var8);
                this.method32(var7 + 1, 32768, (byte) 2, var8 + 1);
            }
            if (arg4 == 2) {
                this.method32(var7, 8192, (byte) 2, var8);
                this.method32(var7 + 1, 512, (byte) 2, var8 - 1);
            }
            if (arg4 == 3) {
                this.method32(var7, 32768, (byte) 2, var8);
                this.method32(var7 - 1, 2048, (byte) 2, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method32(var7, 66560, (byte) 2, var8);
            this.method32(var7 - 1, 4096, (byte) 2, var8);
            this.method32(var7, 16384, (byte) 2, var8 + 1);
        }
        if (arg4 == 1) {
            this.method32(var7, 5120, (byte) 2, var8);
            this.method32(var7, 16384, (byte) 2, var8 + 1);
            this.method32(var7 + 1, 65536, (byte) 2, var8);
        }
        if (arg4 == 2) {
            this.method32(var7, 20480, (byte) 2, var8);
            this.method32(var7 + 1, 65536, (byte) 2, var8);
            this.method32(var7, 1024, (byte) 2, var8 - 1);
        }
        if (arg4 == 3) {
            this.method32(var7, 81920, (byte) 2, var8);
            this.method32(var7, 1024, (byte) 2, var8 - 1);
            this.method32(var7 - 1, 4096, (byte) 2, var8);
            return;
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(ZIIZIII)V")
    public void method31(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field98;
        int var10 = arg5 - this.field99;
        if (arg3) {
            this.field92 = !this.field92;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg6;
            arg6 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field100) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field101) {
                        this.method32(var12, var8, (byte) 2, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(IIBI)V")
    private void method32(int arg0, int arg1, byte arg2, int arg3) {
        this.field102[arg0][arg3] &= 16777215 - arg1;
        if (arg2 == 2) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "c", descriptor = "(III)V")
    public void method33(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field98;
        int var5 = arg0 - this.field99;
        this.field102[var4][var5] &= 0xDFFFFF;
        if (arg1 >= 0) {
            this.field94 = -283;
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= 0) {
            throw new NullPointerException();
        } else if (arg1 == arg5 && arg0 == arg2) {
            return true;
        } else {
            int var8 = arg1 - this.field98;
            int var9 = arg0 - this.field99;
            int var10 = arg5 - this.field98;
            int var11 = arg2 - this.field99;
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "CGGBZSOS", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg3 && arg1 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field98;
        if (arg4 != 1) {
            throw new NullPointerException();
        }
        int var9 = arg1 - this.field99;
        int var10 = arg2 - this.field98;
        int var11 = arg6 - this.field99;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field102[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field102[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field102[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "CGGBZSOS", name = "a", descriptor = "(BIIIIIII)Z")
    public boolean method36(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg4 - 1;
        int var10 = arg1 + arg7 - 1;
        if (arg0 != 9) {
            this.field92 = !this.field92;
        }
        if (arg5 >= arg3 && arg5 <= var9 && arg6 >= arg7 && arg6 <= var10) {
            return true;
        } else if (arg3 - 1 == arg5 && arg6 >= arg7 && arg6 <= var10 && (this.field102[arg5 - this.field98][arg6 - this.field99] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg6 >= arg7 && arg6 <= var10 && (this.field102[arg5 - this.field98][arg6 - this.field99] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg6 && arg5 >= arg3 && arg5 <= var9 && (this.field102[arg5 - this.field98][arg6 - this.field99] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg5 >= arg3 && arg5 <= var9 && (this.field102[arg5 - this.field98][arg6 - this.field99] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
