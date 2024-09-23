import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class CollisionMap {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field920 = false;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field921 = true;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    public int field923 = 0;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    public int field924 = 0;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "ec", name = "h", descriptor = "[[I")
    public int[][] field927;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "ec", name = "<init>", descriptor = "(IBI)V")
    public CollisionMap(int arg0, byte arg1, int arg2) {
        this.field925 = arg2;
        this.field926 = arg0;
        this.field927 = new int[this.field925][this.field926];
        this.method294(652);
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        boolean var4 = false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public void method294(int arg0) {
        for (int var2 = 0; var2 < this.field925; var2++) {
            for (int var4 = 0; var4 < this.field926; var4++) {
                if (var2 == 0 || var4 == 0 || this.field925 - 1 == var2 || this.field926 - 1 == var4) {
                    this.field927[var2][var4] = 16777215;
                } else {
                    this.field927[var2][var4] = 0;
                }
            }
        }
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIZI)V")
    public void method295(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field923;
        if (arg1 < 2 || arg1 > 2) {
            this.field920 = !this.field920;
        }
        int var8 = arg2 - this.field924;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method298(var7, var8, 128);
                this.method298(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method298(var7, var8, 2);
                this.method298(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method298(var7, var8, 8);
                this.method298(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method298(var7, var8, 32);
                this.method298(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method298(var7, var8, 1);
                this.method298(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method298(var7, var8, 4);
                this.method298(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method298(var7, var8, 16);
                this.method298(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method298(var7, var8, 64);
                this.method298(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method298(var7, var8, 130);
                this.method298(var7 - 1, var8, 8);
                this.method298(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method298(var7, var8, 10);
                this.method298(var7, var8 + 1, 32);
                this.method298(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method298(var7, var8, 40);
                this.method298(var7 + 1, var8, 128);
                this.method298(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method298(var7, var8, 160);
                this.method298(var7, var8 - 1, 2);
                this.method298(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method298(var7, var8, 65536);
                this.method298(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method298(var7, var8, 1024);
                this.method298(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method298(var7, var8, 4096);
                this.method298(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method298(var7, var8, 16384);
                this.method298(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method298(var7, var8, 512);
                this.method298(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method298(var7, var8, 2048);
                this.method298(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method298(var7, var8, 8192);
                this.method298(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method298(var7, var8, 32768);
                this.method298(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method298(var7, var8, 66560);
            this.method298(var7 - 1, var8, 4096);
            this.method298(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method298(var7, var8, 5120);
            this.method298(var7, var8 + 1, 16384);
            this.method298(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method298(var7, var8, 20480);
            this.method298(var7 + 1, var8, 65536);
            this.method298(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method298(var7, var8, 81920);
            this.method298(var7, var8 - 1, 1024);
            this.method298(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIZIZII)V")
    public void method296(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (!arg4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg2) {
            var8 += 131072;
        }
        int var10 = arg3 - this.field923;
        int var11 = arg0 - this.field924;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg1;
            arg1 = arg5;
            arg5 = var12;
        }
        for (int var13 = var10; var13 < arg1 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field925) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field926) {
                        this.method298(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZI)V")
    public void method297(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field923;
        if (arg1) {
            int var5 = arg0 - this.field924;
            this.field927[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(III)V")
    private void method298(int arg0, int arg1, int arg2) {
        this.field927[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZIIZI)V")
    public void method299(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field923;
        if (!arg4) {
            this.field920 = !this.field920;
        }
        int var8 = arg0 - this.field924;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method301(128, var7, var8, 965);
                this.method301(8, var7 - 1, var8, 965);
            }
            if (arg5 == 1) {
                this.method301(2, var7, var8, 965);
                this.method301(32, var7, var8 + 1, 965);
            }
            if (arg5 == 2) {
                this.method301(8, var7, var8, 965);
                this.method301(128, var7 + 1, var8, 965);
            }
            if (arg5 == 3) {
                this.method301(32, var7, var8, 965);
                this.method301(2, var7, var8 - 1, 965);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method301(1, var7, var8, 965);
                this.method301(16, var7 - 1, var8 + 1, 965);
            }
            if (arg5 == 1) {
                this.method301(4, var7, var8, 965);
                this.method301(64, var7 + 1, var8 + 1, 965);
            }
            if (arg5 == 2) {
                this.method301(16, var7, var8, 965);
                this.method301(1, var7 + 1, var8 - 1, 965);
            }
            if (arg5 == 3) {
                this.method301(64, var7, var8, 965);
                this.method301(4, var7 - 1, var8 - 1, 965);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method301(130, var7, var8, 965);
                this.method301(8, var7 - 1, var8, 965);
                this.method301(32, var7, var8 + 1, 965);
            }
            if (arg5 == 1) {
                this.method301(10, var7, var8, 965);
                this.method301(32, var7, var8 + 1, 965);
                this.method301(128, var7 + 1, var8, 965);
            }
            if (arg5 == 2) {
                this.method301(40, var7, var8, 965);
                this.method301(128, var7 + 1, var8, 965);
                this.method301(2, var7, var8 - 1, 965);
            }
            if (arg5 == 3) {
                this.method301(160, var7, var8, 965);
                this.method301(2, var7, var8 - 1, 965);
                this.method301(8, var7 - 1, var8, 965);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method301(65536, var7, var8, 965);
                this.method301(4096, var7 - 1, var8, 965);
            }
            if (arg5 == 1) {
                this.method301(1024, var7, var8, 965);
                this.method301(16384, var7, var8 + 1, 965);
            }
            if (arg5 == 2) {
                this.method301(4096, var7, var8, 965);
                this.method301(65536, var7 + 1, var8, 965);
            }
            if (arg5 == 3) {
                this.method301(16384, var7, var8, 965);
                this.method301(1024, var7, var8 - 1, 965);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method301(512, var7, var8, 965);
                this.method301(8192, var7 - 1, var8 + 1, 965);
            }
            if (arg5 == 1) {
                this.method301(2048, var7, var8, 965);
                this.method301(32768, var7 + 1, var8 + 1, 965);
            }
            if (arg5 == 2) {
                this.method301(8192, var7, var8, 965);
                this.method301(512, var7 + 1, var8 - 1, 965);
            }
            if (arg5 == 3) {
                this.method301(32768, var7, var8, 965);
                this.method301(2048, var7 - 1, var8 - 1, 965);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method301(66560, var7, var8, 965);
            this.method301(4096, var7 - 1, var8, 965);
            this.method301(16384, var7, var8 + 1, 965);
        }
        if (arg5 == 1) {
            this.method301(5120, var7, var8, 965);
            this.method301(16384, var7, var8 + 1, 965);
            this.method301(65536, var7 + 1, var8, 965);
        }
        if (arg5 == 2) {
            this.method301(20480, var7, var8, 965);
            this.method301(65536, var7 + 1, var8, 965);
            this.method301(1024, var7, var8 - 1, 965);
        }
        if (arg5 == 3) {
            this.method301(81920, var7, var8, 965);
            this.method301(1024, var7, var8 - 1, 965);
            this.method301(4096, var7 - 1, var8, 965);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIZIII)V")
    public void method300(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 9 || arg1 > 9) {
            return;
        }
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field923;
        int var10 = arg6 - this.field924;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg4;
            arg4 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field925) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field926) {
                        this.method301(var8, var12, var13, 965);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)V")
    private void method301(int arg0, int arg1, int arg2, int arg3) {
        this.field927[arg1][arg2] &= 16777215 - arg0;
        if (arg3 <= 0) {
            this.field920 = !this.field920;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(III)V")
    public void method302(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field923;
        int var5 = arg0 - this.field924;
        this.field927[var4][var5] &= 0xDFFFFF;
        if (arg2 != 1) {
            this.field921 = !this.field921;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            this.field921 = !this.field921;
        }
        if (arg1 == arg3 && arg4 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field923;
        int var9 = arg4 - this.field924;
        int var10 = arg3 - this.field923;
        int var11 = arg6 - this.field924;
        if (arg5 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 <= 0) {
            throw new NullPointerException();
        } else if (arg3 == arg4 && arg1 == arg6) {
            return true;
        } else {
            int var8 = arg3 - this.field923;
            int var9 = arg6 - this.field924;
            int var10 = arg4 - this.field923;
            int var11 = arg1 - this.field924;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field927[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field927[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field927[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= 0) {
            this.field922 = -423;
        }
        int var9 = arg0 + arg7 - 1;
        int var10 = arg1 + arg5 - 1;
        if (arg4 >= arg0 && arg4 <= var9 && arg3 >= arg1 && arg3 <= var10) {
            return true;
        } else if (arg0 - 1 == arg4 && arg3 >= arg1 && arg3 <= var10 && (this.field927[arg4 - this.field923][arg3 - this.field924] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg3 >= arg1 && arg3 <= var10 && (this.field927[arg4 - this.field923][arg3 - this.field924] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg3 && arg4 >= arg0 && arg4 <= var9 && (this.field927[arg4 - this.field923][arg3 - this.field924] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg4 >= arg0 && arg4 <= var9 && (this.field927[arg4 - this.field923][arg3 - this.field924] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
