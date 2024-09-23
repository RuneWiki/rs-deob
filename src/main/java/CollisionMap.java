import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class CollisionMap {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field916 = true;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field917 = false;

    @OriginalMember(owner = "ec", name = "c", descriptor = "B")
    private byte field918 = 45;

    @OriginalMember(owner = "ec", name = "d", descriptor = "Z")
    private boolean field919 = true;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private int field920 = 9;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    public int field921 = 0;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    public int field922 = 0;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[[I")
    public int[][] field925;

    @OriginalMember(owner = "ec", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        this.field923 = arg0;
        this.field924 = arg1;
        if (arg2 != 4) {
            throw new NullPointerException();
        }
        this.field925 = new int[this.field923][this.field924];
        this.method302(930);
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public void method302(int arg0) {
        for (int var2 = 0; var2 < this.field923; var2++) {
            for (int var3 = 0; var3 < this.field924; var3++) {
                if (var2 == 0 || var3 == 0 || this.field923 - 1 == var2 || this.field924 - 1 == var3) {
                    this.field925[var2][var3] = 16777215;
                } else {
                    this.field925[var2][var3] = 0;
                }
            }
        }
        if (arg0 <= 0) {
            this.field916 = !this.field916;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIZZ)V")
    public void method303(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        if (arg5) {
            this.field917 = !this.field917;
        }
        int var7 = arg1 - this.field921;
        int var8 = arg0 - this.field922;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method306(var7, var8, 128);
                this.method306(var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method306(var7, var8, 2);
                this.method306(var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method306(var7, var8, 8);
                this.method306(var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method306(var7, var8, 32);
                this.method306(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method306(var7, var8, 1);
                this.method306(var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method306(var7, var8, 4);
                this.method306(var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method306(var7, var8, 16);
                this.method306(var7 + 1, var8 - 1, 1);
            }
            if (arg3 == 3) {
                this.method306(var7, var8, 64);
                this.method306(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method306(var7, var8, 130);
                this.method306(var7 - 1, var8, 8);
                this.method306(var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method306(var7, var8, 10);
                this.method306(var7, var8 + 1, 32);
                this.method306(var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method306(var7, var8, 40);
                this.method306(var7 + 1, var8, 128);
                this.method306(var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method306(var7, var8, 160);
                this.method306(var7, var8 - 1, 2);
                this.method306(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method306(var7, var8, 65536);
                this.method306(var7 - 1, var8, 4096);
            }
            if (arg3 == 1) {
                this.method306(var7, var8, 1024);
                this.method306(var7, var8 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method306(var7, var8, 4096);
                this.method306(var7 + 1, var8, 65536);
            }
            if (arg3 == 3) {
                this.method306(var7, var8, 16384);
                this.method306(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method306(var7, var8, 512);
                this.method306(var7 - 1, var8 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method306(var7, var8, 2048);
                this.method306(var7 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method306(var7, var8, 8192);
                this.method306(var7 + 1, var8 - 1, 512);
            }
            if (arg3 == 3) {
                this.method306(var7, var8, 32768);
                this.method306(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method306(var7, var8, 66560);
            this.method306(var7 - 1, var8, 4096);
            this.method306(var7, var8 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method306(var7, var8, 5120);
            this.method306(var7, var8 + 1, 16384);
            this.method306(var7 + 1, var8, 65536);
        }
        if (arg3 == 2) {
            this.method306(var7, var8, 20480);
            this.method306(var7 + 1, var8, 65536);
            this.method306(var7, var8 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method306(var7, var8, 81920);
            this.method306(var7, var8 - 1, 1024);
            this.method306(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIZIIZ)V")
    public void method304(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            this.field920 = 249;
        }
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field921;
        int var10 = arg2 - this.field922;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg0;
            arg0 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field923) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field924) {
                        this.method306(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(III)V")
    public void method305(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field921;
        int var5 = arg0 - this.field922;
        this.field925[var4][var5] |= 0x200000;
        if (arg1 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(III)V")
    private void method306(int arg0, int arg1, int arg2) {
        this.field925[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIZI)V")
    public void method307(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field921;
        if (arg2 != 0) {
            this.field917 = !this.field917;
        }
        int var8 = arg3 - this.field922;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method309(var7, false, 128, var8);
                this.method309(var7 - 1, false, 8, var8);
            }
            if (arg5 == 1) {
                this.method309(var7, false, 2, var8);
                this.method309(var7, false, 32, var8 + 1);
            }
            if (arg5 == 2) {
                this.method309(var7, false, 8, var8);
                this.method309(var7 + 1, false, 128, var8);
            }
            if (arg5 == 3) {
                this.method309(var7, false, 32, var8);
                this.method309(var7, false, 2, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method309(var7, false, 1, var8);
                this.method309(var7 - 1, false, 16, var8 + 1);
            }
            if (arg5 == 1) {
                this.method309(var7, false, 4, var8);
                this.method309(var7 + 1, false, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method309(var7, false, 16, var8);
                this.method309(var7 + 1, false, 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method309(var7, false, 64, var8);
                this.method309(var7 - 1, false, 4, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method309(var7, false, 130, var8);
                this.method309(var7 - 1, false, 8, var8);
                this.method309(var7, false, 32, var8 + 1);
            }
            if (arg5 == 1) {
                this.method309(var7, false, 10, var8);
                this.method309(var7, false, 32, var8 + 1);
                this.method309(var7 + 1, false, 128, var8);
            }
            if (arg5 == 2) {
                this.method309(var7, false, 40, var8);
                this.method309(var7 + 1, false, 128, var8);
                this.method309(var7, false, 2, var8 - 1);
            }
            if (arg5 == 3) {
                this.method309(var7, false, 160, var8);
                this.method309(var7, false, 2, var8 - 1);
                this.method309(var7 - 1, false, 8, var8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method309(var7, false, 65536, var8);
                this.method309(var7 - 1, false, 4096, var8);
            }
            if (arg5 == 1) {
                this.method309(var7, false, 1024, var8);
                this.method309(var7, false, 16384, var8 + 1);
            }
            if (arg5 == 2) {
                this.method309(var7, false, 4096, var8);
                this.method309(var7 + 1, false, 65536, var8);
            }
            if (arg5 == 3) {
                this.method309(var7, false, 16384, var8);
                this.method309(var7, false, 1024, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method309(var7, false, 512, var8);
                this.method309(var7 - 1, false, 8192, var8 + 1);
            }
            if (arg5 == 1) {
                this.method309(var7, false, 2048, var8);
                this.method309(var7 + 1, false, 32768, var8 + 1);
            }
            if (arg5 == 2) {
                this.method309(var7, false, 8192, var8);
                this.method309(var7 + 1, false, 512, var8 - 1);
            }
            if (arg5 == 3) {
                this.method309(var7, false, 32768, var8);
                this.method309(var7 - 1, false, 2048, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method309(var7, false, 66560, var8);
            this.method309(var7 - 1, false, 4096, var8);
            this.method309(var7, false, 16384, var8 + 1);
        }
        if (arg5 == 1) {
            this.method309(var7, false, 5120, var8);
            this.method309(var7, false, 16384, var8 + 1);
            this.method309(var7 + 1, false, 65536, var8);
        }
        if (arg5 == 2) {
            this.method309(var7, false, 20480, var8);
            this.method309(var7 + 1, false, 65536, var8);
            this.method309(var7, false, 1024, var8 - 1);
        }
        if (arg5 == 3) {
            this.method309(var7, false, 81920, var8);
            this.method309(var7, false, 1024, var8 - 1);
            this.method309(var7 - 1, false, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZIBIII)V")
    public void method308(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (this.field918 != arg3) {
            return;
        }
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field921;
        int var10 = arg4 - this.field922;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg5;
            arg5 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field923) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field924) {
                        this.method309(var12, false, var8, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZII)V")
    private void method309(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field925[arg0][arg3] &= 16777215 - arg2;
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(III)V")
    public void method310(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field921;
        if (arg2 == -5686) {
            int var5 = arg0 - this.field922;
            this.field925[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIZI)Z")
    public boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg4 == arg6 && arg0 == arg2) {
            return true;
        }
        int var8 = arg6 - this.field921;
        int var9 = arg2 - this.field922;
        int var10 = arg4 - this.field921;
        if (!arg5) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg0 - this.field922;
        if (arg1 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field925[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field925[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field925[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field925[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field925[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field925[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field925[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field925[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field925[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field925[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field925[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIBIIII)Z")
    public boolean method312(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg3 && arg0 == arg4) {
            return true;
        }
        int var8 = arg3 - this.field921;
        int var9 = arg0 - this.field922;
        int var10 = arg1 - this.field921;
        if (arg2 != -89) {
            throw new NullPointerException();
        }
        int var11 = arg4 - this.field922;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field925[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field925[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field925[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field925[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field925[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field925[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field925[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field925[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field925[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field925[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field925[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field925[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIZII)Z")
    public boolean method313(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var9 = arg1 + arg3 - 1;
        int var10 = arg2 + arg4 - 1;
        if (!arg5) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg0 >= arg3 && arg0 <= var9 && arg7 >= arg2 && arg7 <= var10) {
            return true;
        } else if (arg3 - 1 == arg0 && arg7 >= arg2 && arg7 <= var10 && (this.field925[arg0 - this.field921][arg7 - this.field922] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg7 >= arg2 && arg7 <= var10 && (this.field925[arg0 - this.field921][arg7 - this.field922] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg7 && arg0 >= arg3 && arg0 <= var9 && (this.field925[arg0 - this.field921][arg7 - this.field922] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg0 >= arg3 && arg0 <= var9 && (this.field925[arg0 - this.field921][arg7 - this.field922] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
