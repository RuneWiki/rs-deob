import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EAREBDMK")
public class class8 {

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "Z")
    private boolean field682 = true;

    @OriginalMember(owner = "EAREBDMK", name = "b", descriptor = "Z")
    private boolean field683 = false;

    @OriginalMember(owner = "EAREBDMK", name = "c", descriptor = "Z")
    private boolean field684 = false;

    @OriginalMember(owner = "EAREBDMK", name = "d", descriptor = "Z")
    private boolean field685 = true;

    @OriginalMember(owner = "EAREBDMK", name = "e", descriptor = "I")
    private int field686 = 6;

    @OriginalMember(owner = "EAREBDMK", name = "f", descriptor = "I")
    public int field687 = 0;

    @OriginalMember(owner = "EAREBDMK", name = "g", descriptor = "I")
    public int field688 = 0;

    @OriginalMember(owner = "EAREBDMK", name = "h", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "EAREBDMK", name = "i", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "EAREBDMK", name = "j", descriptor = "[[I")
    public int[][] field691;

    @OriginalMember(owner = "EAREBDMK", name = "<init>", descriptor = "(IBI)V")
    public class8(int arg0, byte arg1, int arg2) {
        this.field689 = arg0;
        this.field690 = arg2;
        this.field691 = new int[this.field689][this.field690];
        if (arg1 != 9) {
            throw new NullPointerException();
        }
        this.method188();
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "()V")
    public void method188() {
        for (int var1 = 0; var1 < this.field689; var1++) {
            for (int var2 = 0; var2 < this.field690; var2++) {
                if (var1 == 0 || var2 == 0 || this.field689 - 1 == var1 || this.field690 - 1 == var2) {
                    this.field691[var1][var2] = 16777215;
                } else {
                    this.field691[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(IIIIZI)V")
    public void method189(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field687;
        int var8 = arg1 - this.field688;
        if (arg2 != 47214) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method192(var7, var8, 128);
                this.method192(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method192(var7, var8, 2);
                this.method192(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method192(var7, var8, 8);
                this.method192(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method192(var7, var8, 32);
                this.method192(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method192(var7, var8, 1);
                this.method192(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method192(var7, var8, 4);
                this.method192(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method192(var7, var8, 16);
                this.method192(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method192(var7, var8, 64);
                this.method192(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method192(var7, var8, 130);
                this.method192(var7 - 1, var8, 8);
                this.method192(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method192(var7, var8, 10);
                this.method192(var7, var8 + 1, 32);
                this.method192(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method192(var7, var8, 40);
                this.method192(var7 + 1, var8, 128);
                this.method192(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method192(var7, var8, 160);
                this.method192(var7, var8 - 1, 2);
                this.method192(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method192(var7, var8, 65536);
                this.method192(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method192(var7, var8, 1024);
                this.method192(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method192(var7, var8, 4096);
                this.method192(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method192(var7, var8, 16384);
                this.method192(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method192(var7, var8, 512);
                this.method192(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method192(var7, var8, 2048);
                this.method192(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method192(var7, var8, 8192);
                this.method192(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method192(var7, var8, 32768);
                this.method192(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method192(var7, var8, 66560);
            this.method192(var7 - 1, var8, 4096);
            this.method192(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method192(var7, var8, 5120);
            this.method192(var7, var8 + 1, 16384);
            this.method192(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method192(var7, var8, 20480);
            this.method192(var7 + 1, var8, 65536);
            this.method192(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method192(var7, var8, 81920);
            this.method192(var7, var8 - 1, 1024);
            this.method192(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(IIIIIIZ)V")
    public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 <= 0) {
            this.field683 = !this.field683;
        }
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field687;
        int var10 = arg0 - this.field688;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg1;
            arg1 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field689) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field690) {
                        this.method192(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(III)V")
    public void method191(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field687;
        int var5 = arg2 - this.field688;
        this.field691[var4][var5] |= 0x200000;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "EAREBDMK", name = "b", descriptor = "(III)V")
    private void method192(int arg0, int arg1, int arg2) {
        this.field691[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(ZZIIII)V")
    public void method193(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field687;
        if (!arg0) {
            return;
        }
        int var8 = arg5 - this.field688;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method195(var7, 128, 267, var8);
                this.method195(var7 - 1, 8, 267, var8);
            }
            if (arg2 == 1) {
                this.method195(var7, 2, 267, var8);
                this.method195(var7, 32, 267, var8 + 1);
            }
            if (arg2 == 2) {
                this.method195(var7, 8, 267, var8);
                this.method195(var7 + 1, 128, 267, var8);
            }
            if (arg2 == 3) {
                this.method195(var7, 32, 267, var8);
                this.method195(var7, 2, 267, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method195(var7, 1, 267, var8);
                this.method195(var7 - 1, 16, 267, var8 + 1);
            }
            if (arg2 == 1) {
                this.method195(var7, 4, 267, var8);
                this.method195(var7 + 1, 64, 267, var8 + 1);
            }
            if (arg2 == 2) {
                this.method195(var7, 16, 267, var8);
                this.method195(var7 + 1, 1, 267, var8 - 1);
            }
            if (arg2 == 3) {
                this.method195(var7, 64, 267, var8);
                this.method195(var7 - 1, 4, 267, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method195(var7, 130, 267, var8);
                this.method195(var7 - 1, 8, 267, var8);
                this.method195(var7, 32, 267, var8 + 1);
            }
            if (arg2 == 1) {
                this.method195(var7, 10, 267, var8);
                this.method195(var7, 32, 267, var8 + 1);
                this.method195(var7 + 1, 128, 267, var8);
            }
            if (arg2 == 2) {
                this.method195(var7, 40, 267, var8);
                this.method195(var7 + 1, 128, 267, var8);
                this.method195(var7, 2, 267, var8 - 1);
            }
            if (arg2 == 3) {
                this.method195(var7, 160, 267, var8);
                this.method195(var7, 2, 267, var8 - 1);
                this.method195(var7 - 1, 8, 267, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method195(var7, 65536, 267, var8);
                this.method195(var7 - 1, 4096, 267, var8);
            }
            if (arg2 == 1) {
                this.method195(var7, 1024, 267, var8);
                this.method195(var7, 16384, 267, var8 + 1);
            }
            if (arg2 == 2) {
                this.method195(var7, 4096, 267, var8);
                this.method195(var7 + 1, 65536, 267, var8);
            }
            if (arg2 == 3) {
                this.method195(var7, 16384, 267, var8);
                this.method195(var7, 1024, 267, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method195(var7, 512, 267, var8);
                this.method195(var7 - 1, 8192, 267, var8 + 1);
            }
            if (arg2 == 1) {
                this.method195(var7, 2048, 267, var8);
                this.method195(var7 + 1, 32768, 267, var8 + 1);
            }
            if (arg2 == 2) {
                this.method195(var7, 8192, 267, var8);
                this.method195(var7 + 1, 512, 267, var8 - 1);
            }
            if (arg2 == 3) {
                this.method195(var7, 32768, 267, var8);
                this.method195(var7 - 1, 2048, 267, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method195(var7, 66560, 267, var8);
            this.method195(var7 - 1, 4096, 267, var8);
            this.method195(var7, 16384, 267, var8 + 1);
        }
        if (arg2 == 1) {
            this.method195(var7, 5120, 267, var8);
            this.method195(var7, 16384, 267, var8 + 1);
            this.method195(var7 + 1, 65536, 267, var8);
        }
        if (arg2 == 2) {
            this.method195(var7, 20480, 267, var8);
            this.method195(var7 + 1, 65536, 267, var8);
            this.method195(var7, 1024, 267, var8 - 1);
        }
        if (arg2 == 3) {
            this.method195(var7, 81920, 267, var8);
            this.method195(var7, 1024, 267, var8 - 1);
            this.method195(var7 - 1, 4096, 267, var8);
            return;
        }
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(IIIZIII)V")
    public void method194(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg5 != 0) {
            this.field682 = !this.field682;
        }
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field687;
        int var10 = arg6 - this.field688;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg2;
            arg2 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field689) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field690) {
                        this.method195(var12, var8, 267, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(IIII)V")
    private void method195(int arg0, int arg1, int arg2, int arg3) {
        this.field691[arg0][arg3] &= 16777215 - arg1;
        if (arg2 <= 0) {
            this.field686 = -104;
        }
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(BII)V")
    public void method196(byte arg0, int arg1, int arg2) {
        if (arg0 != 9) {
            this.field686 = -454;
        }
        int var4 = arg2 - this.field687;
        int var5 = arg1 - this.field688;
        this.field691[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method197(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg3 == arg6 && arg0 == arg2) {
            return true;
        }
        int var8 = arg3 - this.field687;
        if (arg4) {
            throw new NullPointerException();
        }
        int var9 = arg0 - this.field688;
        int var10 = arg6 - this.field687;
        int var11 = arg2 - this.field688;
        if (arg1 == 0) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg3 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field687;
        int var9 = arg3 - this.field688;
        int var10 = arg1 - this.field687;
        if (arg5 != 0) {
            throw new NullPointerException();
        }
        int var11 = arg4 - this.field688;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field691[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field691[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field691[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "EAREBDMK", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -30038) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg1 + arg3 - 1;
        int var11 = arg6 + arg7 - 1;
        if (arg4 >= arg1 && arg4 <= var10 && arg5 >= arg6 && arg5 <= var11) {
            return true;
        } else if (arg1 - 1 == arg4 && arg5 >= arg6 && arg5 <= var11 && (this.field691[arg4 - this.field687][arg5 - this.field688] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg5 >= arg6 && arg5 <= var11 && (this.field691[arg4 - this.field687][arg5 - this.field688] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg5 && arg4 >= arg1 && arg4 <= var10 && (this.field691[arg4 - this.field687][arg5 - this.field688] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg4 >= arg1 && arg4 <= var10 && (this.field691[arg4 - this.field687][arg5 - this.field688] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
