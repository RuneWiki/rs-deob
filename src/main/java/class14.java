import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EOLCIJGV")
public class class14 {

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "I")
    private int field665 = 736;

    @OriginalMember(owner = "client!EOLCIJGV", name = "b", descriptor = "I")
    private int field666 = 866;

    @OriginalMember(owner = "client!EOLCIJGV", name = "c", descriptor = "I")
    private int field667 = 438;

    @OriginalMember(owner = "client!EOLCIJGV", name = "d", descriptor = "I")
    private int field668 = 7838;

    @OriginalMember(owner = "client!EOLCIJGV", name = "e", descriptor = "Z")
    private boolean field669 = false;

    @OriginalMember(owner = "client!EOLCIJGV", name = "f", descriptor = "Z")
    private boolean field670 = false;

    @OriginalMember(owner = "client!EOLCIJGV", name = "g", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!EOLCIJGV", name = "h", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!EOLCIJGV", name = "i", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!EOLCIJGV", name = "j", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!EOLCIJGV", name = "k", descriptor = "[[I")
    public int[][] field675;

    @OriginalMember(owner = "client!EOLCIJGV", name = "<init>", descriptor = "(III)V")
    public class14(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        this.field671 = 0;
        this.field672 = 0;
        this.field673 = arg1;
        this.field674 = arg2;
        this.field675 = new int[this.field673][this.field674];
        this.method285();
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "()V")
    public void method285() {
        for (int var1 = 0; var1 < this.field673; var1++) {
            for (int var2 = 0; var2 < this.field674; var2++) {
                if (var1 == 0 || var2 == 0 || this.field673 - 1 == var1 || this.field674 - 1 == var2) {
                    this.field675[var1][var2] = 16777215;
                } else {
                    this.field675[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIZ)V")
    public void method286(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field671;
        if (arg3 != 2) {
            return;
        }
        int var8 = arg1 - this.field672;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method289(var7, var8, 128);
                this.method289(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method289(var7, var8, 2);
                this.method289(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method289(var7, var8, 8);
                this.method289(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method289(var7, var8, 32);
                this.method289(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method289(var7, var8, 1);
                this.method289(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method289(var7, var8, 4);
                this.method289(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method289(var7, var8, 16);
                this.method289(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method289(var7, var8, 64);
                this.method289(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method289(var7, var8, 130);
                this.method289(var7 - 1, var8, 8);
                this.method289(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method289(var7, var8, 10);
                this.method289(var7, var8 + 1, 32);
                this.method289(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method289(var7, var8, 40);
                this.method289(var7 + 1, var8, 128);
                this.method289(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method289(var7, var8, 160);
                this.method289(var7, var8 - 1, 2);
                this.method289(var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method289(var7, var8, 65536);
                this.method289(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method289(var7, var8, 1024);
                this.method289(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method289(var7, var8, 4096);
                this.method289(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method289(var7, var8, 16384);
                this.method289(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method289(var7, var8, 512);
                this.method289(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method289(var7, var8, 2048);
                this.method289(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method289(var7, var8, 8192);
                this.method289(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method289(var7, var8, 32768);
                this.method289(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method289(var7, var8, 66560);
            this.method289(var7 - 1, var8, 4096);
            this.method289(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method289(var7, var8, 5120);
            this.method289(var7, var8 + 1, 16384);
            this.method289(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method289(var7, var8, 20480);
            this.method289(var7 + 1, var8, 65536);
            this.method289(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method289(var7, var8, 81920);
            this.method289(var7, var8 - 1, 1024);
            this.method289(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IZZIIII)V")
    public void method287(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (!arg1) {
            return;
        }
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field671;
        int var10 = arg0 - this.field672;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg3;
            arg3 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field673) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field674) {
                        this.method289(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IZI)V")
    public void method288(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field671;
        if (!arg1) {
            int var5 = arg0 - this.field672;
            this.field675[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(III)V")
    private void method289(int arg0, int arg1, int arg2) {
        this.field675[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIZIIZ)V")
    public void method290(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            return;
        }
        int var7 = arg3 - this.field671;
        int var8 = arg1 - this.field672;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method292(128, var8, var7, this.field666);
                this.method292(8, var8, var7 - 1, this.field666);
            }
            if (arg0 == 1) {
                this.method292(2, var8, var7, this.field666);
                this.method292(32, var8 + 1, var7, this.field666);
            }
            if (arg0 == 2) {
                this.method292(8, var8, var7, this.field666);
                this.method292(128, var8, var7 + 1, this.field666);
            }
            if (arg0 == 3) {
                this.method292(32, var8, var7, this.field666);
                this.method292(2, var8 - 1, var7, this.field666);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method292(1, var8, var7, this.field666);
                this.method292(16, var8 + 1, var7 - 1, this.field666);
            }
            if (arg0 == 1) {
                this.method292(4, var8, var7, this.field666);
                this.method292(64, var8 + 1, var7 + 1, this.field666);
            }
            if (arg0 == 2) {
                this.method292(16, var8, var7, this.field666);
                this.method292(1, var8 - 1, var7 + 1, this.field666);
            }
            if (arg0 == 3) {
                this.method292(64, var8, var7, this.field666);
                this.method292(4, var8 - 1, var7 - 1, this.field666);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method292(130, var8, var7, this.field666);
                this.method292(8, var8, var7 - 1, this.field666);
                this.method292(32, var8 + 1, var7, this.field666);
            }
            if (arg0 == 1) {
                this.method292(10, var8, var7, this.field666);
                this.method292(32, var8 + 1, var7, this.field666);
                this.method292(128, var8, var7 + 1, this.field666);
            }
            if (arg0 == 2) {
                this.method292(40, var8, var7, this.field666);
                this.method292(128, var8, var7 + 1, this.field666);
                this.method292(2, var8 - 1, var7, this.field666);
            }
            if (arg0 == 3) {
                this.method292(160, var8, var7, this.field666);
                this.method292(2, var8 - 1, var7, this.field666);
                this.method292(8, var8, var7 - 1, this.field666);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method292(65536, var8, var7, this.field666);
                this.method292(4096, var8, var7 - 1, this.field666);
            }
            if (arg0 == 1) {
                this.method292(1024, var8, var7, this.field666);
                this.method292(16384, var8 + 1, var7, this.field666);
            }
            if (arg0 == 2) {
                this.method292(4096, var8, var7, this.field666);
                this.method292(65536, var8, var7 + 1, this.field666);
            }
            if (arg0 == 3) {
                this.method292(16384, var8, var7, this.field666);
                this.method292(1024, var8 - 1, var7, this.field666);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method292(512, var8, var7, this.field666);
                this.method292(8192, var8 + 1, var7 - 1, this.field666);
            }
            if (arg0 == 1) {
                this.method292(2048, var8, var7, this.field666);
                this.method292(32768, var8 + 1, var7 + 1, this.field666);
            }
            if (arg0 == 2) {
                this.method292(8192, var8, var7, this.field666);
                this.method292(512, var8 - 1, var7 + 1, this.field666);
            }
            if (arg0 == 3) {
                this.method292(32768, var8, var7, this.field666);
                this.method292(2048, var8 - 1, var7 - 1, this.field666);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method292(66560, var8, var7, this.field666);
            this.method292(4096, var8, var7 - 1, this.field666);
            this.method292(16384, var8 + 1, var7, this.field666);
        }
        if (arg0 == 1) {
            this.method292(5120, var8, var7, this.field666);
            this.method292(16384, var8 + 1, var7, this.field666);
            this.method292(65536, var8, var7 + 1, this.field666);
        }
        if (arg0 == 2) {
            this.method292(20480, var8, var7, this.field666);
            this.method292(65536, var8, var7 + 1, this.field666);
            this.method292(1024, var8 - 1, var7, this.field666);
        }
        if (arg0 == 3) {
            this.method292(81920, var8, var7, this.field666);
            this.method292(1024, var8 - 1, var7, this.field666);
            this.method292(4096, var8, var7 - 1, this.field666);
            return;
        }
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IZIIIII)V")
    public void method291(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2 != -45320) {
            this.field665 = -343;
        }
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field671;
        int var10 = arg6 - this.field672;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg5;
            arg5 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field673) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field674) {
                        this.method292(var8, var13, var12, this.field666);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIII)V")
    private void method292(int arg0, int arg1, int arg2, int arg3) {
        this.field675[arg2][arg1] &= 16777215 - arg0;
        int var5 = 13 / arg3;
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "b", descriptor = "(III)V")
    public void method293(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field671;
        int var5 = arg2 - this.field672;
        this.field675[var4][var5] &= 0xDFFFFF;
        if (arg0 >= 0) {
            this.field670 = !this.field670;
        }
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIIZ)Z")
    public boolean method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 == arg5 && arg0 == arg1) {
            return true;
        }
        int var8 = arg3 - this.field671;
        int var9 = arg1 - this.field672;
        if (arg6) {
            this.field669 = !this.field669;
        }
        int var10 = arg5 - this.field671;
        int var11 = arg0 - this.field672;
        if (arg4 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg5 && arg2 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field671;
        int var9 = arg2 - this.field672;
        int var10 = arg3 - this.field671;
        int var11 = arg4 - this.field672;
        if (arg1 != -39934) {
            throw new NullPointerException();
        }
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field675[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field675[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field675[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1 + arg4 - 1;
        int var10 = arg5 + arg7 - 1;
        int var11 = 22 / arg0;
        if (arg6 >= arg4 && arg6 <= var9 && arg3 >= arg7 && arg3 <= var10) {
            return true;
        } else if (arg4 - 1 == arg6 && arg3 >= arg7 && arg3 <= var10 && (this.field675[arg6 - this.field671][arg3 - this.field672] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg3 >= arg7 && arg3 <= var10 && (this.field675[arg6 - this.field671][arg3 - this.field672] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg3 && arg6 >= arg4 && arg6 <= var9 && (this.field675[arg6 - this.field671][arg3 - this.field672] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg6 >= arg4 && arg6 <= var9 && (this.field675[arg6 - this.field671][arg3 - this.field672] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
