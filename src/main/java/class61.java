import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("URWDWMOD")
public class class61 {

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "Z")
    private boolean field1514 = false;

    @OriginalMember(owner = "URWDWMOD", name = "b", descriptor = "Z")
    private boolean field1515 = false;

    @OriginalMember(owner = "URWDWMOD", name = "c", descriptor = "I")
    private int field1516 = -660;

    @OriginalMember(owner = "URWDWMOD", name = "d", descriptor = "I")
    private int field1517 = 9;

    @OriginalMember(owner = "URWDWMOD", name = "e", descriptor = "Z")
    private boolean field1518 = true;

    @OriginalMember(owner = "URWDWMOD", name = "f", descriptor = "I")
    public int field1519 = 0;

    @OriginalMember(owner = "URWDWMOD", name = "g", descriptor = "I")
    public int field1520 = 0;

    @OriginalMember(owner = "URWDWMOD", name = "h", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "URWDWMOD", name = "i", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "URWDWMOD", name = "j", descriptor = "[[I")
    public int[][] field1523;

    @OriginalMember(owner = "URWDWMOD", name = "<init>", descriptor = "(ZII)V")
    public class61(boolean arg0, int arg1, int arg2) {
        this.field1521 = arg1;
        this.field1522 = arg2;
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field1523 = new int[this.field1521][this.field1522];
        this.method500();
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "()V")
    public void method500() {
        for (int var1 = 0; var1 < this.field1521; var1++) {
            for (int var2 = 0; var2 < this.field1522; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1521 - 1 == var1 || this.field1522 - 1 == var2) {
                    this.field1523[var1][var2] = 16777215;
                } else {
                    this.field1523[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(ZIIIIB)V")
    public void method501(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = arg3 - this.field1519;
        int var8 = arg4 - this.field1520;
        if (arg5 != -100) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method504(var7, var8, 128);
                this.method504(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method504(var7, var8, 2);
                this.method504(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method504(var7, var8, 8);
                this.method504(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method504(var7, var8, 32);
                this.method504(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method504(var7, var8, 1);
                this.method504(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method504(var7, var8, 4);
                this.method504(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method504(var7, var8, 16);
                this.method504(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method504(var7, var8, 64);
                this.method504(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method504(var7, var8, 130);
                this.method504(var7 - 1, var8, 8);
                this.method504(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method504(var7, var8, 10);
                this.method504(var7, var8 + 1, 32);
                this.method504(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method504(var7, var8, 40);
                this.method504(var7 + 1, var8, 128);
                this.method504(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method504(var7, var8, 160);
                this.method504(var7, var8 - 1, 2);
                this.method504(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method504(var7, var8, 65536);
                this.method504(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method504(var7, var8, 1024);
                this.method504(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method504(var7, var8, 4096);
                this.method504(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method504(var7, var8, 16384);
                this.method504(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method504(var7, var8, 512);
                this.method504(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method504(var7, var8, 2048);
                this.method504(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method504(var7, var8, 8192);
                this.method504(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method504(var7, var8, 32768);
                this.method504(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method504(var7, var8, 66560);
            this.method504(var7 - 1, var8, 4096);
            this.method504(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method504(var7, var8, 5120);
            this.method504(var7, var8 + 1, 16384);
            this.method504(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method504(var7, var8, 20480);
            this.method504(var7 + 1, var8, 65536);
            this.method504(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method504(var7, var8, 81920);
            this.method504(var7, var8 - 1, 1024);
            this.method504(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(IIIIZII)V")
    public void method502(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1519;
        if (arg1 != 0) {
            this.field1514 = !this.field1514;
        }
        int var10 = arg5 - this.field1520;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1521) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1522) {
                        this.method504(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(IBI)V")
    public void method503(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field1519;
        int var5 = arg0 - this.field1520;
        if (arg1 != -102) {
            this.field1517 = -375;
        }
        this.field1523[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(III)V")
    private void method504(int arg0, int arg1, int arg2) {
        this.field1523[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(ZIZIII)V")
    public void method505(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field1519;
        if (arg2) {
            this.field1514 = !this.field1514;
        }
        int var8 = arg1 - this.field1520;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method507(var7, 128, false, var8);
                this.method507(var7 - 1, 8, false, var8);
            }
            if (arg4 == 1) {
                this.method507(var7, 2, false, var8);
                this.method507(var7, 32, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method507(var7, 8, false, var8);
                this.method507(var7 + 1, 128, false, var8);
            }
            if (arg4 == 3) {
                this.method507(var7, 32, false, var8);
                this.method507(var7, 2, false, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method507(var7, 1, false, var8);
                this.method507(var7 - 1, 16, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method507(var7, 4, false, var8);
                this.method507(var7 + 1, 64, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method507(var7, 16, false, var8);
                this.method507(var7 + 1, 1, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method507(var7, 64, false, var8);
                this.method507(var7 - 1, 4, false, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method507(var7, 130, false, var8);
                this.method507(var7 - 1, 8, false, var8);
                this.method507(var7, 32, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method507(var7, 10, false, var8);
                this.method507(var7, 32, false, var8 + 1);
                this.method507(var7 + 1, 128, false, var8);
            }
            if (arg4 == 2) {
                this.method507(var7, 40, false, var8);
                this.method507(var7 + 1, 128, false, var8);
                this.method507(var7, 2, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method507(var7, 160, false, var8);
                this.method507(var7, 2, false, var8 - 1);
                this.method507(var7 - 1, 8, false, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method507(var7, 65536, false, var8);
                this.method507(var7 - 1, 4096, false, var8);
            }
            if (arg4 == 1) {
                this.method507(var7, 1024, false, var8);
                this.method507(var7, 16384, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method507(var7, 4096, false, var8);
                this.method507(var7 + 1, 65536, false, var8);
            }
            if (arg4 == 3) {
                this.method507(var7, 16384, false, var8);
                this.method507(var7, 1024, false, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method507(var7, 512, false, var8);
                this.method507(var7 - 1, 8192, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method507(var7, 2048, false, var8);
                this.method507(var7 + 1, 32768, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method507(var7, 8192, false, var8);
                this.method507(var7 + 1, 512, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method507(var7, 32768, false, var8);
                this.method507(var7 - 1, 2048, false, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method507(var7, 66560, false, var8);
            this.method507(var7 - 1, 4096, false, var8);
            this.method507(var7, 16384, false, var8 + 1);
        }
        if (arg4 == 1) {
            this.method507(var7, 5120, false, var8);
            this.method507(var7, 16384, false, var8 + 1);
            this.method507(var7 + 1, 65536, false, var8);
        }
        if (arg4 == 2) {
            this.method507(var7, 20480, false, var8);
            this.method507(var7 + 1, 65536, false, var8);
            this.method507(var7, 1024, false, var8 - 1);
        }
        if (arg4 == 3) {
            this.method507(var7, 81920, false, var8);
            this.method507(var7, 1024, false, var8 - 1);
            this.method507(var7 - 1, 4096, false, var8);
            return;
        }
    }

    @OriginalMember(owner = "URWDWMOD", name = "b", descriptor = "(IIIIZII)V")
    public void method506(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1519;
        int var10 = 28 / arg1;
        int var11 = arg2 - this.field1520;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg0;
            arg0 = arg3;
            arg3 = var12;
        }
        for (int var13 = var9; var13 < arg0 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1521) {
                for (int var14 = var11; var14 < arg3 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1522) {
                        this.method507(var13, var8, false, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(IIZI)V")
    private void method507(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1523[arg0][arg3] &= 16777215 - arg1;
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(ZII)V")
    public void method508(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1519;
        int var5 = arg2 - this.field1520;
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1523[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg4 && arg2 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field1519;
        int var9 = 96 / arg1;
        int var10 = arg2 - this.field1520;
        int var11 = arg3 - this.field1519;
        int var12 = arg5 - this.field1520;
        if (arg0 == 0) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1523[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1523[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1523[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1523[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1523[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1523[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1523[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1523[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1523[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1523[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1523[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "URWDWMOD", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg2 && arg3 == arg6) {
            return true;
        }
        int var8 = arg2 - this.field1519;
        while (arg5 >= 0) {
            this.field1514 = !this.field1514;
        }
        int var9 = arg3 - this.field1520;
        int var10 = arg1 - this.field1519;
        int var11 = arg6 - this.field1520;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1523[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1523[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1523[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1523[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1523[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1523[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1523[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1523[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1523[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1523[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1523[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1523[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "URWDWMOD", name = "a", descriptor = "(IBIIIIII)Z")
    public boolean method511(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4 + arg6 - 1;
        int var10 = arg5 + arg7 - 1;
        if (arg1 != 66) {
            throw new NullPointerException();
        } else if (arg0 >= arg4 && arg0 <= var9 && arg3 >= arg5 && arg3 <= var10) {
            return true;
        } else if (arg4 - 1 == arg0 && arg3 >= arg5 && arg3 <= var10 && (this.field1523[arg0 - this.field1519][arg3 - this.field1520] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg3 >= arg5 && arg3 <= var10 && (this.field1523[arg0 - this.field1519][arg3 - this.field1520] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg3 && arg0 >= arg4 && arg0 <= var9 && (this.field1523[arg0 - this.field1519][arg3 - this.field1520] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg0 >= arg4 && arg0 <= var9 && (this.field1523[arg0 - this.field1519][arg3 - this.field1520] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
