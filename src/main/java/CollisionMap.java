import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class CollisionMap {

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field919 = 363;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field920 = false;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field921 = -937;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field922 = -189;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private int field923 = 2;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private int field924 = 4;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    public int field925 = 0;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    public int field926 = 0;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[[I")
    public int[][] field929;

    @OriginalMember(owner = "ec", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        this.field927 = arg1;
        this.field928 = arg0;
        this.field929 = new int[this.field927][this.field928];
        if (arg2 != 8) {
            this.field919 = 156;
        }
        this.method295(true);
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)V")
    public void method295(boolean arg0) {
        for (int var2 = 0; var2 < this.field927; var2++) {
            for (int var3 = 0; var3 < this.field928; var3++) {
                if (var2 == 0 || var3 == 0 || this.field927 - 1 == var2 || this.field928 - 1 == var3) {
                    this.field929[var2][var3] = 16777215;
                } else {
                    this.field929[var2][var3] = 0;
                }
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIIIII)V")
    public void method296(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field925;
        int var8 = arg4 - this.field926;
        if (arg1 != 8) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method299(var7, var8, 128);
                this.method299(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method299(var7, var8, 2);
                this.method299(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method299(var7, var8, 8);
                this.method299(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method299(var7, var8, 32);
                this.method299(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method299(var7, var8, 1);
                this.method299(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method299(var7, var8, 4);
                this.method299(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method299(var7, var8, 16);
                this.method299(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method299(var7, var8, 64);
                this.method299(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method299(var7, var8, 130);
                this.method299(var7 - 1, var8, 8);
                this.method299(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method299(var7, var8, 10);
                this.method299(var7, var8 + 1, 32);
                this.method299(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method299(var7, var8, 40);
                this.method299(var7 + 1, var8, 128);
                this.method299(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method299(var7, var8, 160);
                this.method299(var7, var8 - 1, 2);
                this.method299(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method299(var7, var8, 65536);
                this.method299(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method299(var7, var8, 1024);
                this.method299(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method299(var7, var8, 4096);
                this.method299(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method299(var7, var8, 16384);
                this.method299(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method299(var7, var8, 512);
                this.method299(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method299(var7, var8, 2048);
                this.method299(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method299(var7, var8, 8192);
                this.method299(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method299(var7, var8, 32768);
                this.method299(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method299(var7, var8, 66560);
            this.method299(var7 - 1, var8, 4096);
            this.method299(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method299(var7, var8, 5120);
            this.method299(var7, var8 + 1, 16384);
            this.method299(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method299(var7, var8, 20480);
            this.method299(var7 + 1, var8, 65536);
            this.method299(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method299(var7, var8, 81920);
            this.method299(var7, var8 - 1, 1024);
            this.method299(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIZI)V")
    public void method297(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg1 < 3 || arg1 > 3) {
            this.field924 = -240;
        }
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field925;
        int var10 = arg6 - this.field926;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field927) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field928) {
                        this.method299(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(III)V")
    public void method298(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field925;
        if (arg2 == 4) {
            int var5 = arg0 - this.field926;
            this.field929[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(III)V")
    private void method299(int arg0, int arg1, int arg2) {
        this.field929[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIZ)V")
    public void method300(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field925;
        int var8 = arg1 - this.field926;
        if (arg2 >= 0) {
            this.field920 = !this.field920;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method302(var8, 484, var7, 128);
                this.method302(var8, 484, var7 - 1, 8);
            }
            if (arg0 == 1) {
                this.method302(var8, 484, var7, 2);
                this.method302(var8 + 1, 484, var7, 32);
            }
            if (arg0 == 2) {
                this.method302(var8, 484, var7, 8);
                this.method302(var8, 484, var7 + 1, 128);
            }
            if (arg0 == 3) {
                this.method302(var8, 484, var7, 32);
                this.method302(var8 - 1, 484, var7, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method302(var8, 484, var7, 1);
                this.method302(var8 + 1, 484, var7 - 1, 16);
            }
            if (arg0 == 1) {
                this.method302(var8, 484, var7, 4);
                this.method302(var8 + 1, 484, var7 + 1, 64);
            }
            if (arg0 == 2) {
                this.method302(var8, 484, var7, 16);
                this.method302(var8 - 1, 484, var7 + 1, 1);
            }
            if (arg0 == 3) {
                this.method302(var8, 484, var7, 64);
                this.method302(var8 - 1, 484, var7 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method302(var8, 484, var7, 130);
                this.method302(var8, 484, var7 - 1, 8);
                this.method302(var8 + 1, 484, var7, 32);
            }
            if (arg0 == 1) {
                this.method302(var8, 484, var7, 10);
                this.method302(var8 + 1, 484, var7, 32);
                this.method302(var8, 484, var7 + 1, 128);
            }
            if (arg0 == 2) {
                this.method302(var8, 484, var7, 40);
                this.method302(var8, 484, var7 + 1, 128);
                this.method302(var8 - 1, 484, var7, 2);
            }
            if (arg0 == 3) {
                this.method302(var8, 484, var7, 160);
                this.method302(var8 - 1, 484, var7, 2);
                this.method302(var8, 484, var7 - 1, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method302(var8, 484, var7, 65536);
                this.method302(var8, 484, var7 - 1, 4096);
            }
            if (arg0 == 1) {
                this.method302(var8, 484, var7, 1024);
                this.method302(var8 + 1, 484, var7, 16384);
            }
            if (arg0 == 2) {
                this.method302(var8, 484, var7, 4096);
                this.method302(var8, 484, var7 + 1, 65536);
            }
            if (arg0 == 3) {
                this.method302(var8, 484, var7, 16384);
                this.method302(var8 - 1, 484, var7, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method302(var8, 484, var7, 512);
                this.method302(var8 + 1, 484, var7 - 1, 8192);
            }
            if (arg0 == 1) {
                this.method302(var8, 484, var7, 2048);
                this.method302(var8 + 1, 484, var7 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method302(var8, 484, var7, 8192);
                this.method302(var8 - 1, 484, var7 + 1, 512);
            }
            if (arg0 == 3) {
                this.method302(var8, 484, var7, 32768);
                this.method302(var8 - 1, 484, var7 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method302(var8, 484, var7, 66560);
            this.method302(var8, 484, var7 - 1, 4096);
            this.method302(var8 + 1, 484, var7, 16384);
        }
        if (arg0 == 1) {
            this.method302(var8, 484, var7, 5120);
            this.method302(var8 + 1, 484, var7, 16384);
            this.method302(var8, 484, var7 + 1, 65536);
        }
        if (arg0 == 2) {
            this.method302(var8, 484, var7, 20480);
            this.method302(var8, 484, var7 + 1, 65536);
            this.method302(var8 - 1, 484, var7, 1024);
        }
        if (arg0 == 3) {
            this.method302(var8, 484, var7, 81920);
            this.method302(var8 - 1, 484, var7, 1024);
            this.method302(var8, 484, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIZIII)V")
    public void method301(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field925;
        int var10 = arg0 - this.field926;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg1;
            arg1 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field927) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field928) {
                        this.method302(var13, 484, var12, var8);
                    }
                }
            }
        }
        if (arg5 >= 0) {
            this.field924 = -243;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)V")
    private void method302(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 97 / arg1;
        this.field929[arg2][arg0] &= 16777215 - arg3;
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(III)V")
    public void method303(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field925;
        int var5 = arg1 - this.field926;
        this.field929[var4][var5] &= 0xDFFFFF;
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIBIIII)Z")
    public boolean method304(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 7) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg1 == arg3 && arg0 == arg6) {
            return true;
        }
        int var9 = arg1 - this.field925;
        int var10 = arg6 - this.field926;
        int var11 = arg3 - this.field925;
        int var12 = arg0 - this.field926;
        if (arg5 == 0) {
            if (arg4 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field929[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field929[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field929[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field929[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field929[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field929[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field929[var9][var10] & 0x280120) == 0) {
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
                if (var9 == var11 && var12 + 1 == var10 && (this.field929[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field929[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field929[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field929[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg1 && arg4 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field925;
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        int var9 = arg5 - this.field926;
        int var10 = arg0 - this.field925;
        int var11 = arg4 - this.field926;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field929[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field929[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field929[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field929[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field929[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field929[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field929[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field929[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field929[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field929[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field929[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field929[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 <= 0) {
            throw new NullPointerException();
        }
        int var9 = arg0 + arg1 - 1;
        int var10 = arg2 + arg3 - 1;
        if (arg5 >= arg1 && arg5 <= var9 && arg4 >= arg3 && arg4 <= var10) {
            return true;
        } else if (arg1 - 1 == arg5 && arg4 >= arg3 && arg4 <= var10 && (this.field929[arg5 - this.field925][arg4 - this.field926] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg4 >= arg3 && arg4 <= var10 && (this.field929[arg5 - this.field925][arg4 - this.field926] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg4 && arg5 >= arg1 && arg5 <= var9 && (this.field929[arg5 - this.field925][arg4 - this.field926] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg4 && arg5 >= arg1 && arg5 <= var9 && (this.field929[arg5 - this.field925][arg4 - this.field926] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
