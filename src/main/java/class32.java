import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MPYOQJPZ")
public class class32 {

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "Z")
    private boolean field918 = false;

    @OriginalMember(owner = "MPYOQJPZ", name = "c", descriptor = "I")
    private int field920 = -929;

    @OriginalMember(owner = "MPYOQJPZ", name = "d", descriptor = "Z")
    private boolean field921 = false;

    @OriginalMember(owner = "MPYOQJPZ", name = "e", descriptor = "I")
    public int field922 = 0;

    @OriginalMember(owner = "MPYOQJPZ", name = "f", descriptor = "I")
    public int field923 = 0;

    @OriginalMember(owner = "MPYOQJPZ", name = "g", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "MPYOQJPZ", name = "h", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "MPYOQJPZ", name = "i", descriptor = "[[I")
    public int[][] field926;

    @OriginalMember(owner = "MPYOQJPZ", name = "b", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "MPYOQJPZ", name = "<init>", descriptor = "(III)V")
    public class32(int arg0, int arg1, int arg2) {
        this.field924 = arg0;
        this.field925 = arg1;
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        this.field926 = new int[this.field924][this.field925];
        this.method301();
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "()V")
    public void method301() {
        for (int var1 = 0; var1 < this.field924; var1++) {
            for (int var2 = 0; var2 < this.field925; var2++) {
                if (var1 == 0 || var2 == 0 || this.field924 - 1 == var1 || this.field925 - 1 == var2) {
                    this.field926[var1][var2] = 16777215;
                } else {
                    this.field926[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(ZIIZII)V")
    public void method302(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg0) {
            return;
        }
        int var7 = arg4 - this.field922;
        int var8 = arg2 - this.field923;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method305(var7, var8, 128);
                this.method305(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method305(var7, var8, 2);
                this.method305(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method305(var7, var8, 8);
                this.method305(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method305(var7, var8, 32);
                this.method305(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method305(var7, var8, 1);
                this.method305(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method305(var7, var8, 4);
                this.method305(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method305(var7, var8, 16);
                this.method305(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method305(var7, var8, 64);
                this.method305(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method305(var7, var8, 130);
                this.method305(var7 - 1, var8, 8);
                this.method305(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method305(var7, var8, 10);
                this.method305(var7, var8 + 1, 32);
                this.method305(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method305(var7, var8, 40);
                this.method305(var7 + 1, var8, 128);
                this.method305(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method305(var7, var8, 160);
                this.method305(var7, var8 - 1, 2);
                this.method305(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method305(var7, var8, 65536);
                this.method305(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method305(var7, var8, 1024);
                this.method305(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method305(var7, var8, 4096);
                this.method305(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method305(var7, var8, 16384);
                this.method305(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method305(var7, var8, 512);
                this.method305(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method305(var7, var8, 2048);
                this.method305(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method305(var7, var8, 8192);
                this.method305(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method305(var7, var8, 32768);
                this.method305(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method305(var7, var8, 66560);
            this.method305(var7 - 1, var8, 4096);
            this.method305(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method305(var7, var8, 5120);
            this.method305(var7, var8 + 1, 16384);
            this.method305(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method305(var7, var8, 20480);
            this.method305(var7 + 1, var8, 65536);
            this.method305(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method305(var7, var8, 81920);
            this.method305(var7, var8 - 1, 1024);
            this.method305(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(IIIIZII)V")
    public void method303(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field922;
        if (arg1 != 3) {
            return;
        }
        int var10 = arg5 - this.field923;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg6;
            arg6 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field924) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field925) {
                        this.method305(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(IIB)V")
    public void method304(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field922;
        int var5 = arg1 - this.field923;
        if (arg2 != 3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field926[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(III)V")
    private void method305(int arg0, int arg1, int arg2) {
        this.field926[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(ZIIIII)V")
    public void method306(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field922;
        while (arg2 >= 0) {
            this.field920 = 468;
        }
        int var8 = arg3 - this.field923;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method308(var8, var7, this.field919, 128);
                this.method308(var8, var7 - 1, this.field919, 8);
            }
            if (arg5 == 1) {
                this.method308(var8, var7, this.field919, 2);
                this.method308(var8 + 1, var7, this.field919, 32);
            }
            if (arg5 == 2) {
                this.method308(var8, var7, this.field919, 8);
                this.method308(var8, var7 + 1, this.field919, 128);
            }
            if (arg5 == 3) {
                this.method308(var8, var7, this.field919, 32);
                this.method308(var8 - 1, var7, this.field919, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method308(var8, var7, this.field919, 1);
                this.method308(var8 + 1, var7 - 1, this.field919, 16);
            }
            if (arg5 == 1) {
                this.method308(var8, var7, this.field919, 4);
                this.method308(var8 + 1, var7 + 1, this.field919, 64);
            }
            if (arg5 == 2) {
                this.method308(var8, var7, this.field919, 16);
                this.method308(var8 - 1, var7 + 1, this.field919, 1);
            }
            if (arg5 == 3) {
                this.method308(var8, var7, this.field919, 64);
                this.method308(var8 - 1, var7 - 1, this.field919, 4);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method308(var8, var7, this.field919, 130);
                this.method308(var8, var7 - 1, this.field919, 8);
                this.method308(var8 + 1, var7, this.field919, 32);
            }
            if (arg5 == 1) {
                this.method308(var8, var7, this.field919, 10);
                this.method308(var8 + 1, var7, this.field919, 32);
                this.method308(var8, var7 + 1, this.field919, 128);
            }
            if (arg5 == 2) {
                this.method308(var8, var7, this.field919, 40);
                this.method308(var8, var7 + 1, this.field919, 128);
                this.method308(var8 - 1, var7, this.field919, 2);
            }
            if (arg5 == 3) {
                this.method308(var8, var7, this.field919, 160);
                this.method308(var8 - 1, var7, this.field919, 2);
                this.method308(var8, var7 - 1, this.field919, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method308(var8, var7, this.field919, 65536);
                this.method308(var8, var7 - 1, this.field919, 4096);
            }
            if (arg5 == 1) {
                this.method308(var8, var7, this.field919, 1024);
                this.method308(var8 + 1, var7, this.field919, 16384);
            }
            if (arg5 == 2) {
                this.method308(var8, var7, this.field919, 4096);
                this.method308(var8, var7 + 1, this.field919, 65536);
            }
            if (arg5 == 3) {
                this.method308(var8, var7, this.field919, 16384);
                this.method308(var8 - 1, var7, this.field919, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method308(var8, var7, this.field919, 512);
                this.method308(var8 + 1, var7 - 1, this.field919, 8192);
            }
            if (arg5 == 1) {
                this.method308(var8, var7, this.field919, 2048);
                this.method308(var8 + 1, var7 + 1, this.field919, 32768);
            }
            if (arg5 == 2) {
                this.method308(var8, var7, this.field919, 8192);
                this.method308(var8 - 1, var7 + 1, this.field919, 512);
            }
            if (arg5 == 3) {
                this.method308(var8, var7, this.field919, 32768);
                this.method308(var8 - 1, var7 - 1, this.field919, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method308(var8, var7, this.field919, 66560);
            this.method308(var8, var7 - 1, this.field919, 4096);
            this.method308(var8 + 1, var7, this.field919, 16384);
        }
        if (arg5 == 1) {
            this.method308(var8, var7, this.field919, 5120);
            this.method308(var8 + 1, var7, this.field919, 16384);
            this.method308(var8, var7 + 1, this.field919, 65536);
        }
        if (arg5 == 2) {
            this.method308(var8, var7, this.field919, 20480);
            this.method308(var8, var7 + 1, this.field919, 65536);
            this.method308(var8 - 1, var7, this.field919, 1024);
        }
        if (arg5 == 3) {
            this.method308(var8, var7, this.field919, 81920);
            this.method308(var8 - 1, var7, this.field919, 1024);
            this.method308(var8, var7 - 1, this.field919, 4096);
            return;
        }
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(IZIIZII)V")
    public void method307(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg1) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg4) {
            var8 += 131072;
        }
        int var10 = arg5 - this.field922;
        int var11 = arg2 - this.field923;
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg6;
            arg6 = arg3;
            arg3 = var12;
        }
        for (int var13 = var10; var13 < arg6 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field924) {
                for (int var14 = var11; var14 < arg3 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field925) {
                        this.method308(var14, var13, this.field919, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(IIII)V")
    private void method308(int arg0, int arg1, int arg2, int arg3) {
        this.field926[arg1][arg0] &= 16777215 - arg3;
        if (arg2 != 0) {
            this.field919 = -66;
        }
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "b", descriptor = "(III)V")
    public void method309(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field922;
        if (arg2 != 46905) {
            this.field919 = 93;
        }
        int var5 = arg0 - this.field923;
        this.field926[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(IBIIIII)Z")
    public boolean method310(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field922;
        int var9 = arg5 - this.field923;
        int var10 = arg0 - this.field922;
        int var11 = arg4 - this.field923;
        if (arg1 == 7) {
            boolean var12 = false;
        } else {
            this.field919 = -429;
        }
        if (arg6 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg4 && arg3 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field922;
        int var9 = arg3 - this.field923;
        int var10 = arg4 - this.field922;
        int var11 = arg6 - this.field923;
        if (arg5 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field926[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field926[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field926[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "MPYOQJPZ", name = "a", descriptor = "(BIIIIIII)Z")
    public boolean method312(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 + arg6 - 1;
        int var10 = arg4 + arg7 - 1;
        if (arg0 == 8) {
            boolean var11 = false;
        } else {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg2 >= arg5 && arg2 <= var9 && arg1 >= arg7 && arg1 <= var10) {
            return true;
        } else if (arg5 - 1 == arg2 && arg1 >= arg7 && arg1 <= var10 && (this.field926[arg2 - this.field922][arg1 - this.field923] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg1 >= arg7 && arg1 <= var10 && (this.field926[arg2 - this.field922][arg1 - this.field923] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg1 && arg2 >= arg5 && arg2 <= var9 && (this.field926[arg2 - this.field922][arg1 - this.field923] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg2 >= arg5 && arg2 <= var9 && (this.field926[arg2 - this.field922][arg1 - this.field923] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
