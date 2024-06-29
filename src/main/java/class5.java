import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BBOYCGQQ")
public class class5 {

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "I")
    private int field126 = -817;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "b", descriptor = "Z")
    private boolean field127 = false;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "c", descriptor = "I")
    private int field128 = 394;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "d", descriptor = "Z")
    private boolean field129 = true;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "e", descriptor = "I")
    public int field130 = 0;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "f", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "g", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "h", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "i", descriptor = "[[I")
    public int[][] field134;

    @OriginalMember(owner = "client!BBOYCGQQ", name = "<init>", descriptor = "(IIB)V")
    public class5(int arg0, int arg1, byte arg2) {
        if (arg2 != 8) {
            this.field126 = 387;
        }
        this.field131 = 0;
        this.field132 = arg1;
        this.field133 = arg0;
        this.field134 = new int[this.field132][this.field133];
        this.method27();
        if (class7.field142) {
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "()V")
    public void method27() {
        for (int var1 = 0; var1 < this.field132; var1++) {
            for (int var2 = 0; var2 < this.field133; var2++) {
                if (var1 == 0 || var2 == 0 || this.field132 - 1 == var1 || this.field133 - 1 == var2) {
                    this.field134[var1][var2] = 16777215;
                } else {
                    this.field134[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(BIIIZI)V")
    public void method28(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != 126) {
            this.field129 = !this.field129;
        }
        int var7 = arg5 - this.field130;
        int var8 = arg1 - this.field131;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method31(var7, var8, 128);
                this.method31(var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method31(var7, var8, 2);
                this.method31(var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method31(var7, var8, 8);
                this.method31(var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method31(var7, var8, 32);
                this.method31(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method31(var7, var8, 1);
                this.method31(var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method31(var7, var8, 4);
                this.method31(var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method31(var7, var8, 16);
                this.method31(var7 + 1, var8 - 1, 1);
            }
            if (arg3 == 3) {
                this.method31(var7, var8, 64);
                this.method31(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method31(var7, var8, 130);
                this.method31(var7 - 1, var8, 8);
                this.method31(var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method31(var7, var8, 10);
                this.method31(var7, var8 + 1, 32);
                this.method31(var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method31(var7, var8, 40);
                this.method31(var7 + 1, var8, 128);
                this.method31(var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method31(var7, var8, 160);
                this.method31(var7, var8 - 1, 2);
                this.method31(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method31(var7, var8, 65536);
                this.method31(var7 - 1, var8, 4096);
            }
            if (arg3 == 1) {
                this.method31(var7, var8, 1024);
                this.method31(var7, var8 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method31(var7, var8, 4096);
                this.method31(var7 + 1, var8, 65536);
            }
            if (arg3 == 3) {
                this.method31(var7, var8, 16384);
                this.method31(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method31(var7, var8, 512);
                this.method31(var7 - 1, var8 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method31(var7, var8, 2048);
                this.method31(var7 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method31(var7, var8, 8192);
                this.method31(var7 + 1, var8 - 1, 512);
            }
            if (arg3 == 3) {
                this.method31(var7, var8, 32768);
                this.method31(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method31(var7, var8, 66560);
            this.method31(var7 - 1, var8, 4096);
            this.method31(var7, var8 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method31(var7, var8, 5120);
            this.method31(var7, var8 + 1, 16384);
            this.method31(var7 + 1, var8, 65536);
        }
        if (arg3 == 2) {
            this.method31(var7, var8, 20480);
            this.method31(var7 + 1, var8, 65536);
            this.method31(var7, var8 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method31(var7, var8, 81920);
            this.method31(var7, var8 - 1, 1024);
            this.method31(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIZI)V")
    public void method29(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg3 != 0) {
            return;
        }
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field130;
        int var10 = arg0 - this.field131;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg4;
            arg4 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field132) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field133) {
                        this.method31(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIZ)V")
    public void method30(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field130;
        int var5 = arg0 - this.field131;
        this.field134[var4][var5] |= 0x200000;
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(III)V")
    private void method31(int arg0, int arg1, int arg2) {
        this.field134[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIZ)V")
    public void method32(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field130;
        int var8 = arg2 - this.field131;
        while (arg3 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method34(var7, var8, this.field127, 128);
                this.method34(var7 - 1, var8, this.field127, 8);
            }
            if (arg4 == 1) {
                this.method34(var7, var8, this.field127, 2);
                this.method34(var7, var8 + 1, this.field127, 32);
            }
            if (arg4 == 2) {
                this.method34(var7, var8, this.field127, 8);
                this.method34(var7 + 1, var8, this.field127, 128);
            }
            if (arg4 == 3) {
                this.method34(var7, var8, this.field127, 32);
                this.method34(var7, var8 - 1, this.field127, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method34(var7, var8, this.field127, 1);
                this.method34(var7 - 1, var8 + 1, this.field127, 16);
            }
            if (arg4 == 1) {
                this.method34(var7, var8, this.field127, 4);
                this.method34(var7 + 1, var8 + 1, this.field127, 64);
            }
            if (arg4 == 2) {
                this.method34(var7, var8, this.field127, 16);
                this.method34(var7 + 1, var8 - 1, this.field127, 1);
            }
            if (arg4 == 3) {
                this.method34(var7, var8, this.field127, 64);
                this.method34(var7 - 1, var8 - 1, this.field127, 4);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method34(var7, var8, this.field127, 130);
                this.method34(var7 - 1, var8, this.field127, 8);
                this.method34(var7, var8 + 1, this.field127, 32);
            }
            if (arg4 == 1) {
                this.method34(var7, var8, this.field127, 10);
                this.method34(var7, var8 + 1, this.field127, 32);
                this.method34(var7 + 1, var8, this.field127, 128);
            }
            if (arg4 == 2) {
                this.method34(var7, var8, this.field127, 40);
                this.method34(var7 + 1, var8, this.field127, 128);
                this.method34(var7, var8 - 1, this.field127, 2);
            }
            if (arg4 == 3) {
                this.method34(var7, var8, this.field127, 160);
                this.method34(var7, var8 - 1, this.field127, 2);
                this.method34(var7 - 1, var8, this.field127, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method34(var7, var8, this.field127, 65536);
                this.method34(var7 - 1, var8, this.field127, 4096);
            }
            if (arg4 == 1) {
                this.method34(var7, var8, this.field127, 1024);
                this.method34(var7, var8 + 1, this.field127, 16384);
            }
            if (arg4 == 2) {
                this.method34(var7, var8, this.field127, 4096);
                this.method34(var7 + 1, var8, this.field127, 65536);
            }
            if (arg4 == 3) {
                this.method34(var7, var8, this.field127, 16384);
                this.method34(var7, var8 - 1, this.field127, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method34(var7, var8, this.field127, 512);
                this.method34(var7 - 1, var8 + 1, this.field127, 8192);
            }
            if (arg4 == 1) {
                this.method34(var7, var8, this.field127, 2048);
                this.method34(var7 + 1, var8 + 1, this.field127, 32768);
            }
            if (arg4 == 2) {
                this.method34(var7, var8, this.field127, 8192);
                this.method34(var7 + 1, var8 - 1, this.field127, 512);
            }
            if (arg4 == 3) {
                this.method34(var7, var8, this.field127, 32768);
                this.method34(var7 - 1, var8 - 1, this.field127, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method34(var7, var8, this.field127, 66560);
            this.method34(var7 - 1, var8, this.field127, 4096);
            this.method34(var7, var8 + 1, this.field127, 16384);
        }
        if (arg4 == 1) {
            this.method34(var7, var8, this.field127, 5120);
            this.method34(var7, var8 + 1, this.field127, 16384);
            this.method34(var7 + 1, var8, this.field127, 65536);
        }
        if (arg4 == 2) {
            this.method34(var7, var8, this.field127, 20480);
            this.method34(var7 + 1, var8, this.field127, 65536);
            this.method34(var7, var8 - 1, this.field127, 1024);
        }
        if (arg4 == 3) {
            this.method34(var7, var8, this.field127, 81920);
            this.method34(var7, var8 - 1, this.field127, 1024);
            this.method34(var7 - 1, var8, this.field127, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(ZBIIIII)V")
    public void method33(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field130;
        if (arg1 != 56) {
            return;
        }
        int var10 = arg6 - this.field131;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field132) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field133) {
                        this.method34(var12, var13, this.field127, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIZI)V")
    private void method34(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field129 = !this.field129;
        }
        this.field134[arg0][arg1] &= 16777215 - arg3;
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(BII)V")
    public void method35(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field130;
        int var5 = arg1 - this.field131;
        if (arg0 != 19) {
            this.field126 = 306;
        }
        this.field134[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            throw new NullPointerException();
        } else if (arg0 == arg4 && arg1 == arg5) {
            return true;
        } else {
            int var8 = arg4 - this.field130;
            int var9 = arg5 - this.field131;
            int var10 = arg0 - this.field130;
            int var11 = arg1 - this.field131;
            if (arg3 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x1280120) == 0) {
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
                    if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg3 && arg5 == arg6) {
            return true;
        }
        int var8 = arg2 - this.field130;
        int var9 = arg6 - this.field131;
        if (arg4 <= 0) {
            throw new NullPointerException();
        }
        int var10 = arg3 - this.field130;
        int var11 = arg5 - this.field131;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field134[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field134[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field134[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 + arg5 - 1;
        int var10 = arg4 + arg7 - 1;
        if (arg3 <= 0) {
            this.field126 = 43;
        }
        if (arg6 >= arg2 && arg6 <= var9 && arg1 >= arg7 && arg1 <= var10) {
            return true;
        } else if (arg2 - 1 == arg6 && arg1 >= arg7 && arg1 <= var10 && (this.field134[arg6 - this.field130][arg1 - this.field131] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg1 >= arg7 && arg1 <= var10 && (this.field134[arg6 - this.field130][arg1 - this.field131] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg1 && arg6 >= arg2 && arg6 <= var9 && (this.field134[arg6 - this.field130][arg1 - this.field131] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg6 >= arg2 && arg6 <= var9 && (this.field134[arg6 - this.field130][arg1 - this.field131] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
