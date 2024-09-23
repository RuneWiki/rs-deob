import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class CollisionMap {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field933 = true;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field934 = -3154;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private boolean field935 = false;

    @OriginalMember(owner = "ec", name = "d", descriptor = "B")
    private byte field936 = 77;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private int field937 = 43166;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    public int field938 = 0;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[[I")
    public int[][] field942;

    @OriginalMember(owner = "ec", name = "<init>", descriptor = "(IIZ)V")
    public CollisionMap(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field933 = !this.field933;
        }
        this.field939 = 0;
        this.field940 = arg1;
        this.field941 = arg0;
        this.field942 = new int[this.field940][this.field941];
        this.method295(-999);
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public void method295(int arg0) {
        while (arg0 >= 0) {
            this.field935 = !this.field935;
        }
        for (int var2 = 0; var2 < this.field940; var2++) {
            for (int var3 = 0; var3 < this.field941; var3++) {
                if (var2 == 0 || var3 == 0 || this.field940 - 1 == var2 || this.field941 - 1 == var3) {
                    this.field942[var2][var3] = 16777215;
                } else {
                    this.field942[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIIZII)V")
    public void method296(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field938;
        if (arg3) {
            this.field937 = -481;
        }
        int var8 = arg2 - this.field939;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method299(var7, var8, 128);
                this.method299(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 2);
                this.method299(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 8);
                this.method299(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 32);
                this.method299(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method299(var7, var8, 1);
                this.method299(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 4);
                this.method299(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 16);
                this.method299(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 64);
                this.method299(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method299(var7, var8, 130);
                this.method299(var7 - 1, var8, 8);
                this.method299(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 10);
                this.method299(var7, var8 + 1, 32);
                this.method299(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 40);
                this.method299(var7 + 1, var8, 128);
                this.method299(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 160);
                this.method299(var7, var8 - 1, 2);
                this.method299(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method299(var7, var8, 65536);
                this.method299(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 1024);
                this.method299(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 4096);
                this.method299(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 16384);
                this.method299(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method299(var7, var8, 512);
                this.method299(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 2048);
                this.method299(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 8192);
                this.method299(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 32768);
                this.method299(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method299(var7, var8, 66560);
            this.method299(var7 - 1, var8, 4096);
            this.method299(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method299(var7, var8, 5120);
            this.method299(var7, var8 + 1, 16384);
            this.method299(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method299(var7, var8, 20480);
            this.method299(var7 + 1, var8, 65536);
            this.method299(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method299(var7, var8, 81920);
            this.method299(var7, var8 - 1, 1024);
            this.method299(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIIIIII)V")
    public void method297(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 <= 0) {
            this.field935 = !this.field935;
        }
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field938;
        int var10 = arg6 - this.field939;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field940) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field941) {
                        this.method299(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(III)V")
    public void method298(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field938;
        int var5 = arg0 - this.field939;
        if (arg2 < 0) {
            this.field942[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(III)V")
    private void method299(int arg0, int arg1, int arg2) {
        this.field942[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIIIII)V")
    public void method300(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field938;
        int var8 = arg2 - this.field939;
        if (arg1 <= 0) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method302(var7, 128, -44894, var8);
                this.method302(var7 - 1, 8, -44894, var8);
            }
            if (arg5 == 1) {
                this.method302(var7, 2, -44894, var8);
                this.method302(var7, 32, -44894, var8 + 1);
            }
            if (arg5 == 2) {
                this.method302(var7, 8, -44894, var8);
                this.method302(var7 + 1, 128, -44894, var8);
            }
            if (arg5 == 3) {
                this.method302(var7, 32, -44894, var8);
                this.method302(var7, 2, -44894, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method302(var7, 1, -44894, var8);
                this.method302(var7 - 1, 16, -44894, var8 + 1);
            }
            if (arg5 == 1) {
                this.method302(var7, 4, -44894, var8);
                this.method302(var7 + 1, 64, -44894, var8 + 1);
            }
            if (arg5 == 2) {
                this.method302(var7, 16, -44894, var8);
                this.method302(var7 + 1, 1, -44894, var8 - 1);
            }
            if (arg5 == 3) {
                this.method302(var7, 64, -44894, var8);
                this.method302(var7 - 1, 4, -44894, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method302(var7, 130, -44894, var8);
                this.method302(var7 - 1, 8, -44894, var8);
                this.method302(var7, 32, -44894, var8 + 1);
            }
            if (arg5 == 1) {
                this.method302(var7, 10, -44894, var8);
                this.method302(var7, 32, -44894, var8 + 1);
                this.method302(var7 + 1, 128, -44894, var8);
            }
            if (arg5 == 2) {
                this.method302(var7, 40, -44894, var8);
                this.method302(var7 + 1, 128, -44894, var8);
                this.method302(var7, 2, -44894, var8 - 1);
            }
            if (arg5 == 3) {
                this.method302(var7, 160, -44894, var8);
                this.method302(var7, 2, -44894, var8 - 1);
                this.method302(var7 - 1, 8, -44894, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method302(var7, 65536, -44894, var8);
                this.method302(var7 - 1, 4096, -44894, var8);
            }
            if (arg5 == 1) {
                this.method302(var7, 1024, -44894, var8);
                this.method302(var7, 16384, -44894, var8 + 1);
            }
            if (arg5 == 2) {
                this.method302(var7, 4096, -44894, var8);
                this.method302(var7 + 1, 65536, -44894, var8);
            }
            if (arg5 == 3) {
                this.method302(var7, 16384, -44894, var8);
                this.method302(var7, 1024, -44894, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method302(var7, 512, -44894, var8);
                this.method302(var7 - 1, 8192, -44894, var8 + 1);
            }
            if (arg5 == 1) {
                this.method302(var7, 2048, -44894, var8);
                this.method302(var7 + 1, 32768, -44894, var8 + 1);
            }
            if (arg5 == 2) {
                this.method302(var7, 8192, -44894, var8);
                this.method302(var7 + 1, 512, -44894, var8 - 1);
            }
            if (arg5 == 3) {
                this.method302(var7, 32768, -44894, var8);
                this.method302(var7 - 1, 2048, -44894, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method302(var7, 66560, -44894, var8);
            this.method302(var7 - 1, 4096, -44894, var8);
            this.method302(var7, 16384, -44894, var8 + 1);
        }
        if (arg5 == 1) {
            this.method302(var7, 5120, -44894, var8);
            this.method302(var7, 16384, -44894, var8 + 1);
            this.method302(var7 + 1, 65536, -44894, var8);
        }
        if (arg5 == 2) {
            this.method302(var7, 20480, -44894, var8);
            this.method302(var7 + 1, 65536, -44894, var8);
            this.method302(var7, 1024, -44894, var8 - 1);
        }
        if (arg5 == 3) {
            this.method302(var7, 81920, -44894, var8);
            this.method302(var7, 1024, -44894, var8 - 1);
            this.method302(var7 - 1, 4096, -44894, var8);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIZI)V")
    public void method301(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        int var10 = arg3 - this.field938;
        int var11 = arg4 - this.field939;
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg2;
            arg2 = arg6;
            arg6 = var12;
        }
        for (int var13 = var10; var13 < arg2 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field940) {
                for (int var14 = var11; var14 < arg6 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field941) {
                        this.method302(var13, var9, -44894, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)V")
    private void method302(int arg0, int arg1, int arg2, int arg3) {
        this.field942[arg0][arg3] &= 16777215 - arg1;
        if (arg2 == -44894) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(III)V")
    public void method303(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field938;
        int var5 = arg1 - this.field939;
        if (arg0 != 3) {
            this.field933 = !this.field933;
        }
        this.field942[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 37 / arg3;
        if (arg1 == arg5 && arg0 == arg2) {
            return true;
        }
        int var9 = arg5 - this.field938;
        int var10 = arg2 - this.field939;
        int var11 = arg1 - this.field938;
        int var12 = arg0 - this.field939;
        if (arg6 == 0) {
            if (arg4 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field942[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field942[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field942[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field942[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg4 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field942[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field942[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field942[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field942[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field942[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field942[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field942[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIBIIII)Z")
    public boolean method305(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg5 && arg1 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field938;
        if (arg2 != 4) {
            throw new NullPointerException();
        }
        int var9 = arg1 - this.field939;
        int var10 = arg0 - this.field938;
        int var11 = arg4 - this.field939;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4 + arg7 - 1;
        int var10 = arg2 + arg6 - 1;
        if (arg3 < 5 || arg3 > 5) {
            this.field937 = -448;
        }
        if (arg0 >= arg4 && arg0 <= var9 && arg1 >= arg2 && arg1 <= var10) {
            return true;
        } else if (arg4 - 1 == arg0 && arg1 >= arg2 && arg1 <= var10 && (this.field942[arg0 - this.field938][arg1 - this.field939] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg1 >= arg2 && arg1 <= var10 && (this.field942[arg0 - this.field938][arg1 - this.field939] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg1 && arg0 >= arg4 && arg0 <= var9 && (this.field942[arg0 - this.field938][arg1 - this.field939] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg0 >= arg4 && arg0 <= var9 && (this.field942[arg0 - this.field938][arg1 - this.field939] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }
}
