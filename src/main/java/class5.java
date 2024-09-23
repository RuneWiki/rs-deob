import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DFJABDHX")
public class class5 {

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "Z")
    private boolean field621 = false;

    @OriginalMember(owner = "DFJABDHX", name = "b", descriptor = "Z")
    private boolean field622 = true;

    @OriginalMember(owner = "DFJABDHX", name = "c", descriptor = "Z")
    private boolean field623 = false;

    @OriginalMember(owner = "DFJABDHX", name = "e", descriptor = "Z")
    private boolean field625 = false;

    @OriginalMember(owner = "DFJABDHX", name = "f", descriptor = "I")
    private int field626 = 564;

    @OriginalMember(owner = "DFJABDHX", name = "g", descriptor = "B")
    private byte field627 = 82;

    @OriginalMember(owner = "DFJABDHX", name = "h", descriptor = "I")
    private int field628 = 581;

    @OriginalMember(owner = "DFJABDHX", name = "i", descriptor = "Z")
    private boolean field629 = false;

    @OriginalMember(owner = "DFJABDHX", name = "j", descriptor = "Z")
    private boolean field630 = false;

    @OriginalMember(owner = "DFJABDHX", name = "l", descriptor = "I")
    public int field632 = 0;

    @OriginalMember(owner = "DFJABDHX", name = "m", descriptor = "I")
    public int field633 = 0;

    @OriginalMember(owner = "DFJABDHX", name = "n", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "DFJABDHX", name = "o", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "DFJABDHX", name = "p", descriptor = "[[I")
    public int[][] field636;

    @OriginalMember(owner = "DFJABDHX", name = "d", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "DFJABDHX", name = "k", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "DFJABDHX", name = "<init>", descriptor = "(III)V")
    public class5(int arg0, int arg1, int arg2) {
        this.field634 = arg2;
        this.field635 = arg0;
        this.field636 = new int[this.field634][this.field635];
        this.method208();
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "()V")
    public void method208() {
        for (int var1 = 0; var1 < this.field634; var1++) {
            for (int var2 = 0; var2 < this.field635; var2++) {
                if (var1 == 0 || var2 == 0 || this.field634 - 1 == var1 || this.field635 - 1 == var2) {
                    this.field636[var1][var2] = 16777215;
                } else {
                    this.field636[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(IZIZII)V")
    public void method209(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field632;
        if (arg3) {
            this.field624 = 454;
        }
        int var8 = arg4 - this.field633;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method212(var7, var8, 128);
                this.method212(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method212(var7, var8, 2);
                this.method212(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method212(var7, var8, 8);
                this.method212(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method212(var7, var8, 32);
                this.method212(var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method212(var7, var8, 1);
                this.method212(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method212(var7, var8, 4);
                this.method212(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method212(var7, var8, 16);
                this.method212(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method212(var7, var8, 64);
                this.method212(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method212(var7, var8, 130);
                this.method212(var7 - 1, var8, 8);
                this.method212(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method212(var7, var8, 10);
                this.method212(var7, var8 + 1, 32);
                this.method212(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method212(var7, var8, 40);
                this.method212(var7 + 1, var8, 128);
                this.method212(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method212(var7, var8, 160);
                this.method212(var7, var8 - 1, 2);
                this.method212(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method212(var7, var8, 65536);
                this.method212(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method212(var7, var8, 1024);
                this.method212(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method212(var7, var8, 4096);
                this.method212(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method212(var7, var8, 16384);
                this.method212(var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method212(var7, var8, 512);
                this.method212(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method212(var7, var8, 2048);
                this.method212(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method212(var7, var8, 8192);
                this.method212(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method212(var7, var8, 32768);
                this.method212(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method212(var7, var8, 66560);
            this.method212(var7 - 1, var8, 4096);
            this.method212(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method212(var7, var8, 5120);
            this.method212(var7, var8 + 1, 16384);
            this.method212(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method212(var7, var8, 20480);
            this.method212(var7 + 1, var8, 65536);
            this.method212(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method212(var7, var8, 81920);
            this.method212(var7, var8 - 1, 1024);
            this.method212(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(IZIIIII)V")
    public void method210(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field632;
        int var10 = arg0 - this.field633;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg5;
            arg5 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field634) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field635) {
                        this.method212(var12, var13, var8);
                    }
                }
            }
        }
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(BII)V")
    public void method211(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field632;
        int var5 = arg2 - this.field633;
        this.field636[var4][var5] |= 0x200000;
        if (arg0 != 41) {
            this.field624 = -141;
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(III)V")
    private void method212(int arg0, int arg1, int arg2) {
        this.field636[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(ZIIIZI)V")
    public void method213(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg2 - this.field632;
        int var8 = arg1 - this.field633;
        if (arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method215(var7, 128, var8, false);
                this.method215(var7 - 1, 8, var8, false);
            }
            if (arg3 == 1) {
                this.method215(var7, 2, var8, false);
                this.method215(var7, 32, var8 + 1, false);
            }
            if (arg3 == 2) {
                this.method215(var7, 8, var8, false);
                this.method215(var7 + 1, 128, var8, false);
            }
            if (arg3 == 3) {
                this.method215(var7, 32, var8, false);
                this.method215(var7, 2, var8 - 1, false);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method215(var7, 1, var8, false);
                this.method215(var7 - 1, 16, var8 + 1, false);
            }
            if (arg3 == 1) {
                this.method215(var7, 4, var8, false);
                this.method215(var7 + 1, 64, var8 + 1, false);
            }
            if (arg3 == 2) {
                this.method215(var7, 16, var8, false);
                this.method215(var7 + 1, 1, var8 - 1, false);
            }
            if (arg3 == 3) {
                this.method215(var7, 64, var8, false);
                this.method215(var7 - 1, 4, var8 - 1, false);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method215(var7, 130, var8, false);
                this.method215(var7 - 1, 8, var8, false);
                this.method215(var7, 32, var8 + 1, false);
            }
            if (arg3 == 1) {
                this.method215(var7, 10, var8, false);
                this.method215(var7, 32, var8 + 1, false);
                this.method215(var7 + 1, 128, var8, false);
            }
            if (arg3 == 2) {
                this.method215(var7, 40, var8, false);
                this.method215(var7 + 1, 128, var8, false);
                this.method215(var7, 2, var8 - 1, false);
            }
            if (arg3 == 3) {
                this.method215(var7, 160, var8, false);
                this.method215(var7, 2, var8 - 1, false);
                this.method215(var7 - 1, 8, var8, false);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method215(var7, 65536, var8, false);
                this.method215(var7 - 1, 4096, var8, false);
            }
            if (arg3 == 1) {
                this.method215(var7, 1024, var8, false);
                this.method215(var7, 16384, var8 + 1, false);
            }
            if (arg3 == 2) {
                this.method215(var7, 4096, var8, false);
                this.method215(var7 + 1, 65536, var8, false);
            }
            if (arg3 == 3) {
                this.method215(var7, 16384, var8, false);
                this.method215(var7, 1024, var8 - 1, false);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method215(var7, 512, var8, false);
                this.method215(var7 - 1, 8192, var8 + 1, false);
            }
            if (arg3 == 1) {
                this.method215(var7, 2048, var8, false);
                this.method215(var7 + 1, 32768, var8 + 1, false);
            }
            if (arg3 == 2) {
                this.method215(var7, 8192, var8, false);
                this.method215(var7 + 1, 512, var8 - 1, false);
            }
            if (arg3 == 3) {
                this.method215(var7, 32768, var8, false);
                this.method215(var7 - 1, 2048, var8 - 1, false);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method215(var7, 66560, var8, false);
            this.method215(var7 - 1, 4096, var8, false);
            this.method215(var7, 16384, var8 + 1, false);
        }
        if (arg3 == 1) {
            this.method215(var7, 5120, var8, false);
            this.method215(var7, 16384, var8 + 1, false);
            this.method215(var7 + 1, 65536, var8, false);
        }
        if (arg3 == 2) {
            this.method215(var7, 20480, var8, false);
            this.method215(var7 + 1, 65536, var8, false);
            this.method215(var7, 1024, var8 - 1, false);
        }
        if (arg3 == 3) {
            this.method215(var7, 81920, var8, false);
            this.method215(var7, 1024, var8 - 1, false);
            this.method215(var7 - 1, 4096, var8, false);
            return;
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "b", descriptor = "(IZIIIII)V")
    public void method214(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg6 <= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg1) {
            var8 += 131072;
        }
        int var10 = arg4 - this.field632;
        int var11 = arg3 - this.field633;
        if (arg2 == 1 || arg2 == 3) {
            int var12 = arg0;
            arg0 = arg5;
            arg5 = var12;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field634) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field635) {
                        this.method215(var13, var8, var14, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(IIIZ)V")
    private void method215(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field621 = !this.field621;
        }
        this.field636[arg0][arg2] &= 16777215 - arg1;
    }

    @OriginalMember(owner = "DFJABDHX", name = "b", descriptor = "(III)V")
    public void method216(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field632;
        if (arg2 >= 9 && arg2 <= 9) {
            int var5 = arg0 - this.field633;
            this.field636[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(IBIIIII)Z")
    public boolean method217(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg6 && arg3 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field632;
        int var9 = arg3 - this.field633;
        int var10 = arg2 - this.field632;
        int var11 = arg4 - this.field633;
        if (this.field627 != arg1) {
            this.field631 = -399;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(IIIIIIB)Z")
    public boolean method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg2 == arg3 && arg1 == arg4) {
            return true;
        }
        int var8 = arg3 - this.field632;
        int var9 = arg1 - this.field633;
        int var10 = arg2 - this.field632;
        int var11 = arg4 - this.field633;
        if (arg6 != -118) {
            throw new NullPointerException();
        }
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field636[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field636[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field636[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "DFJABDHX", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 < 4 || arg7 > 4) {
            this.field622 = !this.field622;
        }
        int var9 = arg4 + arg5 - 1;
        int var10 = arg1 + arg6 - 1;
        if (arg3 >= arg5 && arg3 <= var9 && arg2 >= arg6 && arg2 <= var10) {
            return true;
        } else if (arg5 - 1 == arg3 && arg2 >= arg6 && arg2 <= var10 && (this.field636[arg3 - this.field632][arg2 - this.field633] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg2 >= arg6 && arg2 <= var10 && (this.field636[arg3 - this.field632][arg2 - this.field633] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg2 && arg3 >= arg5 && arg3 <= var9 && (this.field636[arg3 - this.field632][arg2 - this.field633] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg3 >= arg5 && arg3 <= var9 && (this.field636[arg3 - this.field632][arg2 - this.field633] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
