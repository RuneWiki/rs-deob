import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class CollisionMap {

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private int field841 = -40161;

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field842 = false;

    @OriginalMember(owner = "bc", name = "c", descriptor = "Z")
    private boolean field843 = true;

    @OriginalMember(owner = "bc", name = "d", descriptor = "I")
    private int field844 = 647;

    @OriginalMember(owner = "bc", name = "e", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "bc", name = "i", descriptor = "[[I")
    public int[][] field849;

    @OriginalMember(owner = "bc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        int var4 = 97 / arg1;
        this.field845 = 0;
        this.field846 = 0;
        this.field847 = arg0;
        this.field848 = arg2;
        this.field849 = new int[this.field847][this.field848];
        this.method272((byte) 5);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(B)V")
    public void method272(byte arg0) {
        for (int var2 = 0; var2 < this.field847; var2++) {
            for (int var4 = 0; var4 < this.field848; var4++) {
                if (var2 == 0 || var4 == 0 || this.field847 - 1 == var2 || this.field848 - 1 == var4) {
                    this.field849[var2][var4] = 16777215;
                } else {
                    this.field849[var2][var4] = 0;
                }
            }
        }
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIIIZ)V")
    public void method273(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 51 / arg4;
        int var8 = arg3 - this.field845;
        int var9 = arg1 - this.field846;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method276(var8, var9, 128);
                this.method276(var8 - 1, var9, 8);
            }
            if (arg2 == 1) {
                this.method276(var8, var9, 2);
                this.method276(var8, var9 + 1, 32);
            }
            if (arg2 == 2) {
                this.method276(var8, var9, 8);
                this.method276(var8 + 1, var9, 128);
            }
            if (arg2 == 3) {
                this.method276(var8, var9, 32);
                this.method276(var8, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method276(var8, var9, 1);
                this.method276(var8 - 1, var9 + 1, 16);
            }
            if (arg2 == 1) {
                this.method276(var8, var9, 4);
                this.method276(var8 + 1, var9 + 1, 64);
            }
            if (arg2 == 2) {
                this.method276(var8, var9, 16);
                this.method276(var8 + 1, var9 - 1, 1);
            }
            if (arg2 == 3) {
                this.method276(var8, var9, 64);
                this.method276(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method276(var8, var9, 130);
                this.method276(var8 - 1, var9, 8);
                this.method276(var8, var9 + 1, 32);
            }
            if (arg2 == 1) {
                this.method276(var8, var9, 10);
                this.method276(var8, var9 + 1, 32);
                this.method276(var8 + 1, var9, 128);
            }
            if (arg2 == 2) {
                this.method276(var8, var9, 40);
                this.method276(var8 + 1, var9, 128);
                this.method276(var8, var9 - 1, 2);
            }
            if (arg2 == 3) {
                this.method276(var8, var9, 160);
                this.method276(var8, var9 - 1, 2);
                this.method276(var8 - 1, var9, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method276(var8, var9, 65536);
                this.method276(var8 - 1, var9, 4096);
            }
            if (arg2 == 1) {
                this.method276(var8, var9, 1024);
                this.method276(var8, var9 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method276(var8, var9, 4096);
                this.method276(var8 + 1, var9, 65536);
            }
            if (arg2 == 3) {
                this.method276(var8, var9, 16384);
                this.method276(var8, var9 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method276(var8, var9, 512);
                this.method276(var8 - 1, var9 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method276(var8, var9, 2048);
                this.method276(var8 + 1, var9 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method276(var8, var9, 8192);
                this.method276(var8 + 1, var9 - 1, 512);
            }
            if (arg2 == 3) {
                this.method276(var8, var9, 32768);
                this.method276(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method276(var8, var9, 66560);
            this.method276(var8 - 1, var9, 4096);
            this.method276(var8, var9 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method276(var8, var9, 5120);
            this.method276(var8, var9 + 1, 16384);
            this.method276(var8 + 1, var9, 65536);
        }
        if (arg2 == 2) {
            this.method276(var8, var9, 20480);
            this.method276(var8 + 1, var9, 65536);
            this.method276(var8, var9 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method276(var8, var9, 81920);
            this.method276(var8, var9 - 1, 1024);
            this.method276(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIZIIII)V")
    public void method274(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field845;
        int var10 = arg5 - this.field846;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg3;
            arg3 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field847) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field848) {
                        this.method276(var12, var13, var8);
                    }
                }
            }
        }
        while (arg4 >= 0) {
            this.field841 = 118;
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(III)V")
    public void method275(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field845;
        int var5 = arg1 - this.field846;
        this.field849[var4][var5] |= 0x200000;
        if (arg0 < 2 || arg0 > 2) {
            ;
        }
    }

    @OriginalMember(owner = "bc", name = "b", descriptor = "(III)V")
    private void method276(int arg0, int arg1, int arg2) {
        this.field849[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIZII)V")
    public void method277(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 <= 0) {
            return;
        }
        int var7 = arg1 - this.field845;
        int var8 = arg4 - this.field846;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method279(var7, (byte) 3, var8, 128);
                this.method279(var7 - 1, (byte) 3, var8, 8);
            }
            if (arg2 == 1) {
                this.method279(var7, (byte) 3, var8, 2);
                this.method279(var7, (byte) 3, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method279(var7, (byte) 3, var8, 8);
                this.method279(var7 + 1, (byte) 3, var8, 128);
            }
            if (arg2 == 3) {
                this.method279(var7, (byte) 3, var8, 32);
                this.method279(var7, (byte) 3, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method279(var7, (byte) 3, var8, 1);
                this.method279(var7 - 1, (byte) 3, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method279(var7, (byte) 3, var8, 4);
                this.method279(var7 + 1, (byte) 3, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method279(var7, (byte) 3, var8, 16);
                this.method279(var7 + 1, (byte) 3, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method279(var7, (byte) 3, var8, 64);
                this.method279(var7 - 1, (byte) 3, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method279(var7, (byte) 3, var8, 130);
                this.method279(var7 - 1, (byte) 3, var8, 8);
                this.method279(var7, (byte) 3, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method279(var7, (byte) 3, var8, 10);
                this.method279(var7, (byte) 3, var8 + 1, 32);
                this.method279(var7 + 1, (byte) 3, var8, 128);
            }
            if (arg2 == 2) {
                this.method279(var7, (byte) 3, var8, 40);
                this.method279(var7 + 1, (byte) 3, var8, 128);
                this.method279(var7, (byte) 3, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method279(var7, (byte) 3, var8, 160);
                this.method279(var7, (byte) 3, var8 - 1, 2);
                this.method279(var7 - 1, (byte) 3, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method279(var7, (byte) 3, var8, 65536);
                this.method279(var7 - 1, (byte) 3, var8, 4096);
            }
            if (arg2 == 1) {
                this.method279(var7, (byte) 3, var8, 1024);
                this.method279(var7, (byte) 3, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method279(var7, (byte) 3, var8, 4096);
                this.method279(var7 + 1, (byte) 3, var8, 65536);
            }
            if (arg2 == 3) {
                this.method279(var7, (byte) 3, var8, 16384);
                this.method279(var7, (byte) 3, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method279(var7, (byte) 3, var8, 512);
                this.method279(var7 - 1, (byte) 3, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method279(var7, (byte) 3, var8, 2048);
                this.method279(var7 + 1, (byte) 3, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method279(var7, (byte) 3, var8, 8192);
                this.method279(var7 + 1, (byte) 3, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method279(var7, (byte) 3, var8, 32768);
                this.method279(var7 - 1, (byte) 3, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method279(var7, (byte) 3, var8, 66560);
            this.method279(var7 - 1, (byte) 3, var8, 4096);
            this.method279(var7, (byte) 3, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method279(var7, (byte) 3, var8, 5120);
            this.method279(var7, (byte) 3, var8 + 1, 16384);
            this.method279(var7 + 1, (byte) 3, var8, 65536);
        }
        if (arg2 == 2) {
            this.method279(var7, (byte) 3, var8, 20480);
            this.method279(var7 + 1, (byte) 3, var8, 65536);
            this.method279(var7, (byte) 3, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method279(var7, (byte) 3, var8, 81920);
            this.method279(var7, (byte) 3, var8 - 1, 1024);
            this.method279(var7 - 1, (byte) 3, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIZIIIZ)V")
    public void method278(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field845;
        if (arg6) {
            this.field843 = !this.field843;
        }
        int var10 = arg0 - this.field846;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field847) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field848) {
                        this.method279(var12, (byte) 3, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IBII)V")
    private void method279(int arg0, byte arg1, int arg2, int arg3) {
        this.field849[arg0][arg2] &= 16777215 - arg3;
        if (arg1 != 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "bc", name = "c", descriptor = "(III)V")
    public void method280(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field845;
        if (arg0 > 0) {
            int var5 = arg2 - this.field846;
            this.field849[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg0 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field845;
        if (arg5 != 7) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg0 - this.field846;
        int var11 = arg4 - this.field845;
        int var12 = arg3 - this.field846;
        if (arg1 == 0) {
            if (arg2 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field849[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field849[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field849[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field849[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field849[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field849[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field849[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field849[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field849[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field849[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field849[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIBIIII)Z")
    public boolean method282(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg1 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field845;
        if (arg2 != -14) {
            throw new NullPointerException();
        }
        int var9 = arg1 - this.field846;
        int var10 = arg0 - this.field845;
        int var11 = arg5 - this.field846;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field849[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field849[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field849[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field849[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field849[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field849[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field849[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field849[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field849[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field849[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field849[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field849[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 + arg5 - 1;
        int var10 = arg3 + arg4 - 1;
        int var11 = 43 / arg1;
        if (arg6 >= arg5 && arg6 <= var9 && arg7 >= arg3 && arg7 <= var10) {
            return true;
        } else if (arg5 - 1 == arg6 && arg7 >= arg3 && arg7 <= var10 && (this.field849[arg6 - this.field845][arg7 - this.field846] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg7 >= arg3 && arg7 <= var10 && (this.field849[arg6 - this.field845][arg7 - this.field846] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg7 && arg6 >= arg5 && arg6 <= var9 && (this.field849[arg6 - this.field845][arg7 - this.field846] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg6 >= arg5 && arg6 <= var9 && (this.field849[arg6 - this.field845][arg7 - this.field846] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
