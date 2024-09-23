import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EXLGBZBR")
public class class18 {

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "I")
    private int field708 = 8754;

    @OriginalMember(owner = "EXLGBZBR", name = "b", descriptor = "B")
    private byte field709 = 8;

    @OriginalMember(owner = "EXLGBZBR", name = "c", descriptor = "I")
    private int field710 = -586;

    @OriginalMember(owner = "EXLGBZBR", name = "d", descriptor = "I")
    private int field711 = 1;

    @OriginalMember(owner = "EXLGBZBR", name = "e", descriptor = "Z")
    private boolean field712 = true;

    @OriginalMember(owner = "EXLGBZBR", name = "f", descriptor = "I")
    public int field713 = 0;

    @OriginalMember(owner = "EXLGBZBR", name = "g", descriptor = "I")
    public int field714 = 0;

    @OriginalMember(owner = "EXLGBZBR", name = "h", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "EXLGBZBR", name = "i", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "EXLGBZBR", name = "j", descriptor = "[[I")
    public int[][] field717;

    @OriginalMember(owner = "EXLGBZBR", name = "<init>", descriptor = "(III)V")
    public class18(int arg0, int arg1, int arg2) {
        this.field715 = arg2;
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field716 = arg1;
        this.field717 = new int[this.field715][this.field716];
        this.method240();
        if (class6.field545) {
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "()V")
    public void method240() {
        for (int var1 = 0; var1 < this.field715; var1++) {
            for (int var2 = 0; var2 < this.field716; var2++) {
                if (var1 == 0 || var2 == 0 || this.field715 - 1 == var1 || this.field716 - 1 == var2) {
                    this.field717[var1][var2] = 16777215;
                } else {
                    this.field717[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(ZIIZII)V")
    public void method241(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field713;
        int var8 = arg1 - this.field714;
        if (arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method244(var7, var8, 128);
                this.method244(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method244(var7, var8, 2);
                this.method244(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method244(var7, var8, 8);
                this.method244(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method244(var7, var8, 32);
                this.method244(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method244(var7, var8, 1);
                this.method244(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method244(var7, var8, 4);
                this.method244(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method244(var7, var8, 16);
                this.method244(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method244(var7, var8, 64);
                this.method244(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method244(var7, var8, 130);
                this.method244(var7 - 1, var8, 8);
                this.method244(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method244(var7, var8, 10);
                this.method244(var7, var8 + 1, 32);
                this.method244(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method244(var7, var8, 40);
                this.method244(var7 + 1, var8, 128);
                this.method244(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method244(var7, var8, 160);
                this.method244(var7, var8 - 1, 2);
                this.method244(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method244(var7, var8, 65536);
                this.method244(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method244(var7, var8, 1024);
                this.method244(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method244(var7, var8, 4096);
                this.method244(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method244(var7, var8, 16384);
                this.method244(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method244(var7, var8, 512);
                this.method244(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method244(var7, var8, 2048);
                this.method244(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method244(var7, var8, 8192);
                this.method244(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method244(var7, var8, 32768);
                this.method244(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method244(var7, var8, 66560);
            this.method244(var7 - 1, var8, 4096);
            this.method244(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method244(var7, var8, 5120);
            this.method244(var7, var8 + 1, 16384);
            this.method244(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method244(var7, var8, 20480);
            this.method244(var7 + 1, var8, 65536);
            this.method244(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method244(var7, var8, 81920);
            this.method244(var7, var8 - 1, 1024);
            this.method244(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(IIIIIBZ)V")
    public void method242(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field713;
        if (arg5 != 7) {
            this.field712 = !this.field712;
        }
        int var10 = arg1 - this.field714;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg4;
            arg4 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field715) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field716) {
                        this.method244(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(IIB)V")
    public void method243(int arg0, int arg1, byte arg2) {
        if (arg2 != -28) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg0 - this.field713;
        int var6 = arg1 - this.field714;
        this.field717[var5][var6] |= 0x200000;
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(III)V")
    private void method244(int arg0, int arg1, int arg2) {
        this.field717[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(IIZIII)V")
    public void method245(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 5104) {
            return;
        }
        int var7 = arg3 - this.field713;
        int var8 = arg0 - this.field714;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method247(var8, 128, (byte) 8, var7);
                this.method247(var8, 8, (byte) 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method247(var8, 2, (byte) 8, var7);
                this.method247(var8 + 1, 32, (byte) 8, var7);
            }
            if (arg5 == 2) {
                this.method247(var8, 8, (byte) 8, var7);
                this.method247(var8, 128, (byte) 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method247(var8, 32, (byte) 8, var7);
                this.method247(var8 - 1, 2, (byte) 8, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method247(var8, 1, (byte) 8, var7);
                this.method247(var8 + 1, 16, (byte) 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method247(var8, 4, (byte) 8, var7);
                this.method247(var8 + 1, 64, (byte) 8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method247(var8, 16, (byte) 8, var7);
                this.method247(var8 - 1, 1, (byte) 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method247(var8, 64, (byte) 8, var7);
                this.method247(var8 - 1, 4, (byte) 8, var7 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method247(var8, 130, (byte) 8, var7);
                this.method247(var8, 8, (byte) 8, var7 - 1);
                this.method247(var8 + 1, 32, (byte) 8, var7);
            }
            if (arg5 == 1) {
                this.method247(var8, 10, (byte) 8, var7);
                this.method247(var8 + 1, 32, (byte) 8, var7);
                this.method247(var8, 128, (byte) 8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method247(var8, 40, (byte) 8, var7);
                this.method247(var8, 128, (byte) 8, var7 + 1);
                this.method247(var8 - 1, 2, (byte) 8, var7);
            }
            if (arg5 == 3) {
                this.method247(var8, 160, (byte) 8, var7);
                this.method247(var8 - 1, 2, (byte) 8, var7);
                this.method247(var8, 8, (byte) 8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method247(var8, 65536, (byte) 8, var7);
                this.method247(var8, 4096, (byte) 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method247(var8, 1024, (byte) 8, var7);
                this.method247(var8 + 1, 16384, (byte) 8, var7);
            }
            if (arg5 == 2) {
                this.method247(var8, 4096, (byte) 8, var7);
                this.method247(var8, 65536, (byte) 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method247(var8, 16384, (byte) 8, var7);
                this.method247(var8 - 1, 1024, (byte) 8, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method247(var8, 512, (byte) 8, var7);
                this.method247(var8 + 1, 8192, (byte) 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method247(var8, 2048, (byte) 8, var7);
                this.method247(var8 + 1, 32768, (byte) 8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method247(var8, 8192, (byte) 8, var7);
                this.method247(var8 - 1, 512, (byte) 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method247(var8, 32768, (byte) 8, var7);
                this.method247(var8 - 1, 2048, (byte) 8, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method247(var8, 66560, (byte) 8, var7);
            this.method247(var8, 4096, (byte) 8, var7 - 1);
            this.method247(var8 + 1, 16384, (byte) 8, var7);
        }
        if (arg5 == 1) {
            this.method247(var8, 5120, (byte) 8, var7);
            this.method247(var8 + 1, 16384, (byte) 8, var7);
            this.method247(var8, 65536, (byte) 8, var7 + 1);
        }
        if (arg5 == 2) {
            this.method247(var8, 20480, (byte) 8, var7);
            this.method247(var8, 65536, (byte) 8, var7 + 1);
            this.method247(var8 - 1, 1024, (byte) 8, var7);
        }
        if (arg5 == 3) {
            this.method247(var8, 81920, (byte) 8, var7);
            this.method247(var8 - 1, 1024, (byte) 8, var7);
            this.method247(var8, 4096, (byte) 8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(ZIIIIII)V")
    public void method246(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 0 || arg3 > 0) {
            return;
        }
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field713;
        int var10 = arg6 - this.field714;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg1;
            arg1 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field715) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field716) {
                        this.method247(var13, var8, (byte) 8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(IIBI)V")
    private void method247(int arg0, int arg1, byte arg2, int arg3) {
        this.field717[arg3][arg0] &= 16777215 - arg1;
        if (this.field709 != arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(IBI)V")
    public void method248(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field713;
        int var5 = arg0 - this.field714;
        this.field717[var4][var5] &= 0xDFFFFF;
        if (arg1 == 3) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg5 && arg1 == arg2) {
            return true;
        }
        int var8 = arg5 - this.field713;
        int var9 = arg1 - this.field714;
        if (arg0 <= 0) {
            this.field708 = -299;
        }
        int var10 = arg4 - this.field713;
        int var11 = arg2 - this.field714;
        if (arg3 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "EXLGBZBR", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg0 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field713;
        int var9 = arg3 - this.field714;
        if (arg5 >= 0) {
            throw new NullPointerException();
        }
        int var10 = arg4 - this.field713;
        int var11 = arg0 - this.field714;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field717[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field717[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field717[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "EXLGBZBR", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 75 / arg1;
        int var10 = arg2 + arg5 - 1;
        int var11 = arg0 + arg7 - 1;
        if (arg4 >= arg2 && arg4 <= var10 && arg6 >= arg7 && arg6 <= var11) {
            return true;
        } else if (arg2 - 1 == arg4 && arg6 >= arg7 && arg6 <= var11 && (this.field717[arg4 - this.field713][arg6 - this.field714] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg6 >= arg7 && arg6 <= var11 && (this.field717[arg4 - this.field713][arg6 - this.field714] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg6 && arg4 >= arg2 && arg4 <= var10 && (this.field717[arg4 - this.field713][arg6 - this.field714] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg4 >= arg2 && arg4 <= var10 && (this.field717[arg4 - this.field713][arg6 - this.field714] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
