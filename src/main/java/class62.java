import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UTWNPFGW")
public class class62 {

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "Z")
    private boolean field1493 = true;

    @OriginalMember(owner = "UTWNPFGW", name = "b", descriptor = "I")
    private int field1494 = 8;

    @OriginalMember(owner = "UTWNPFGW", name = "c", descriptor = "I")
    private int field1495 = 1;

    @OriginalMember(owner = "UTWNPFGW", name = "d", descriptor = "Z")
    private boolean field1496 = true;

    @OriginalMember(owner = "UTWNPFGW", name = "e", descriptor = "I")
    private int field1497 = -43804;

    @OriginalMember(owner = "UTWNPFGW", name = "f", descriptor = "Z")
    private boolean field1498 = false;

    @OriginalMember(owner = "UTWNPFGW", name = "g", descriptor = "I")
    public int field1499 = 0;

    @OriginalMember(owner = "UTWNPFGW", name = "h", descriptor = "I")
    public int field1500 = 0;

    @OriginalMember(owner = "UTWNPFGW", name = "i", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "UTWNPFGW", name = "j", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "UTWNPFGW", name = "k", descriptor = "[[I")
    public int[][] field1503;

    @OriginalMember(owner = "UTWNPFGW", name = "<init>", descriptor = "(III)V")
    public class62(int arg0, int arg1, int arg2) {
        this.field1501 = arg0;
        this.field1502 = arg1;
        this.field1503 = new int[this.field1501][this.field1502];
        if (arg2 != 18219) {
            throw new NullPointerException();
        }
        this.method484(39110);
        if (class13.field723) {
        }
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(I)V")
    public void method484(int arg0) {
        for (int var2 = 0; var2 < this.field1501; var2++) {
            for (int var3 = 0; var3 < this.field1502; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1501 - 1 == var2 || this.field1502 - 1 == var3) {
                    this.field1503[var2][var3] = 16777215;
                } else {
                    this.field1503[var2][var3] = 0;
                }
            }
        }
        if (arg0 != 39110) {
            this.field1498 = !this.field1498;
        }
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(ZIIBII)V")
    public void method485(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 96) {
            this.field1493 = !this.field1493;
        }
        int var7 = arg2 - this.field1499;
        int var8 = arg4 - this.field1500;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method488(var7, var8, 128);
                this.method488(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method488(var7, var8, 2);
                this.method488(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method488(var7, var8, 8);
                this.method488(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method488(var7, var8, 32);
                this.method488(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method488(var7, var8, 1);
                this.method488(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method488(var7, var8, 4);
                this.method488(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method488(var7, var8, 16);
                this.method488(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method488(var7, var8, 64);
                this.method488(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method488(var7, var8, 130);
                this.method488(var7 - 1, var8, 8);
                this.method488(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method488(var7, var8, 10);
                this.method488(var7, var8 + 1, 32);
                this.method488(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method488(var7, var8, 40);
                this.method488(var7 + 1, var8, 128);
                this.method488(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method488(var7, var8, 160);
                this.method488(var7, var8 - 1, 2);
                this.method488(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method488(var7, var8, 65536);
                this.method488(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method488(var7, var8, 1024);
                this.method488(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method488(var7, var8, 4096);
                this.method488(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method488(var7, var8, 16384);
                this.method488(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method488(var7, var8, 512);
                this.method488(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method488(var7, var8, 2048);
                this.method488(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method488(var7, var8, 8192);
                this.method488(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method488(var7, var8, 32768);
                this.method488(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method488(var7, var8, 66560);
            this.method488(var7 - 1, var8, 4096);
            this.method488(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method488(var7, var8, 5120);
            this.method488(var7, var8 + 1, 16384);
            this.method488(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method488(var7, var8, 20480);
            this.method488(var7 + 1, var8, 65536);
            this.method488(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method488(var7, var8, 81920);
            this.method488(var7, var8 - 1, 1024);
            this.method488(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(IIIIIZI)V")
    public void method486(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1499;
        int var10 = arg6 - this.field1500;
        if (arg2 != 1) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg3;
            arg3 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1501) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1502) {
                        this.method488(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(III)V")
    public void method487(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1499;
        int var5 = arg1 - this.field1500;
        if (arg2 != 9) {
            this.field1494 = -173;
        }
        this.field1503[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "UTWNPFGW", name = "b", descriptor = "(III)V")
    private void method488(int arg0, int arg1, int arg2) {
        this.field1503[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(ZIZIII)V")
    public void method489(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            return;
        }
        int var7 = arg3 - this.field1499;
        int var8 = arg4 - this.field1500;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method491(530, var8, 128, var7);
                this.method491(530, var8, 8, var7 - 1);
            }
            if (arg1 == 1) {
                this.method491(530, var8, 2, var7);
                this.method491(530, var8 + 1, 32, var7);
            }
            if (arg1 == 2) {
                this.method491(530, var8, 8, var7);
                this.method491(530, var8, 128, var7 + 1);
            }
            if (arg1 == 3) {
                this.method491(530, var8, 32, var7);
                this.method491(530, var8 - 1, 2, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method491(530, var8, 1, var7);
                this.method491(530, var8 + 1, 16, var7 - 1);
            }
            if (arg1 == 1) {
                this.method491(530, var8, 4, var7);
                this.method491(530, var8 + 1, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method491(530, var8, 16, var7);
                this.method491(530, var8 - 1, 1, var7 + 1);
            }
            if (arg1 == 3) {
                this.method491(530, var8, 64, var7);
                this.method491(530, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method491(530, var8, 130, var7);
                this.method491(530, var8, 8, var7 - 1);
                this.method491(530, var8 + 1, 32, var7);
            }
            if (arg1 == 1) {
                this.method491(530, var8, 10, var7);
                this.method491(530, var8 + 1, 32, var7);
                this.method491(530, var8, 128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method491(530, var8, 40, var7);
                this.method491(530, var8, 128, var7 + 1);
                this.method491(530, var8 - 1, 2, var7);
            }
            if (arg1 == 3) {
                this.method491(530, var8, 160, var7);
                this.method491(530, var8 - 1, 2, var7);
                this.method491(530, var8, 8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method491(530, var8, 65536, var7);
                this.method491(530, var8, 4096, var7 - 1);
            }
            if (arg1 == 1) {
                this.method491(530, var8, 1024, var7);
                this.method491(530, var8 + 1, 16384, var7);
            }
            if (arg1 == 2) {
                this.method491(530, var8, 4096, var7);
                this.method491(530, var8, 65536, var7 + 1);
            }
            if (arg1 == 3) {
                this.method491(530, var8, 16384, var7);
                this.method491(530, var8 - 1, 1024, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method491(530, var8, 512, var7);
                this.method491(530, var8 + 1, 8192, var7 - 1);
            }
            if (arg1 == 1) {
                this.method491(530, var8, 2048, var7);
                this.method491(530, var8 + 1, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method491(530, var8, 8192, var7);
                this.method491(530, var8 - 1, 512, var7 + 1);
            }
            if (arg1 == 3) {
                this.method491(530, var8, 32768, var7);
                this.method491(530, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method491(530, var8, 66560, var7);
            this.method491(530, var8, 4096, var7 - 1);
            this.method491(530, var8 + 1, 16384, var7);
        }
        if (arg1 == 1) {
            this.method491(530, var8, 5120, var7);
            this.method491(530, var8 + 1, 16384, var7);
            this.method491(530, var8, 65536, var7 + 1);
        }
        if (arg1 == 2) {
            this.method491(530, var8, 20480, var7);
            this.method491(530, var8, 65536, var7 + 1);
            this.method491(530, var8 - 1, 1024, var7);
        }
        if (arg1 == 3) {
            this.method491(530, var8, 81920, var7);
            this.method491(530, var8 - 1, 1024, var7);
            this.method491(530, var8, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "UTWNPFGW", name = "b", descriptor = "(IIIIIZI)V")
    public void method490(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1499;
        if (arg4 != 0) {
            this.field1495 = -105;
        }
        int var10 = arg6 - this.field1500;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1501) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1502) {
                        this.method491(530, var13, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(IIII)V")
    private void method491(int arg0, int arg1, int arg2, int arg3) {
        this.field1503[arg3][arg1] &= 16777215 - arg2;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(ZII)V")
    public void method492(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg2 - this.field1499;
        int var6 = arg1 - this.field1500;
        this.field1503[var5][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg5 && arg0 == arg1) {
            return true;
        }
        int var8 = arg3 - this.field1499;
        int var9 = arg1 - this.field1500;
        int var10 = arg5 - this.field1499;
        int var11 = arg0 - this.field1500;
        if (arg2 <= 0) {
            throw new NullPointerException();
        }
        if (arg4 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280180) == 0) {
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
                if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "UTWNPFGW", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg1 == arg2) {
            return true;
        }
        int var8 = arg4 - this.field1499;
        int var9 = arg1 - this.field1500;
        int var10 = arg6 - this.field1499;
        if (arg3 != 0) {
            this.field1494 = 452;
        }
        int var11 = arg2 - this.field1500;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1503[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1503[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1503[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "UTWNPFGW", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 12 / arg0;
        int var10 = arg3 + arg5 - 1;
        int var11 = arg4 + arg6 - 1;
        if (arg2 >= arg3 && arg2 <= var10 && arg1 >= arg4 && arg1 <= var11) {
            return true;
        } else if (arg3 - 1 == arg2 && arg1 >= arg4 && arg1 <= var11 && (this.field1503[arg2 - this.field1499][arg1 - this.field1500] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg1 >= arg4 && arg1 <= var11 && (this.field1503[arg2 - this.field1499][arg1 - this.field1500] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg1 && arg2 >= arg3 && arg2 <= var10 && (this.field1503[arg2 - this.field1499][arg1 - this.field1500] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg1 && arg2 >= arg3 && arg2 <= var10 && (this.field1503[arg2 - this.field1499][arg1 - this.field1500] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
