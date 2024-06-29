import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ASFXKKJM")
public class class3 {

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "I")
    private int field10 = 523;

    @OriginalMember(owner = "client!ASFXKKJM", name = "b", descriptor = "I")
    private int field11 = 3;

    @OriginalMember(owner = "client!ASFXKKJM", name = "c", descriptor = "Z")
    private boolean field12 = false;

    @OriginalMember(owner = "client!ASFXKKJM", name = "d", descriptor = "Z")
    private boolean field13 = true;

    @OriginalMember(owner = "client!ASFXKKJM", name = "e", descriptor = "Z")
    private boolean field14 = false;

    @OriginalMember(owner = "client!ASFXKKJM", name = "f", descriptor = "B")
    private byte field15 = 7;

    @OriginalMember(owner = "client!ASFXKKJM", name = "g", descriptor = "Z")
    private boolean field16 = true;

    @OriginalMember(owner = "client!ASFXKKJM", name = "h", descriptor = "I")
    public int field17 = 0;

    @OriginalMember(owner = "client!ASFXKKJM", name = "i", descriptor = "I")
    public int field18 = 0;

    @OriginalMember(owner = "client!ASFXKKJM", name = "j", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!ASFXKKJM", name = "k", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!ASFXKKJM", name = "l", descriptor = "[[I")
    public int[][] field21;

    @OriginalMember(owner = "client!ASFXKKJM", name = "<init>", descriptor = "(III)V")
    public class3(int arg0, int arg1, int arg2) {
        this.field19 = arg1;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field20 = arg2;
        this.field21 = new int[this.field19][this.field20];
        this.method5();
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "()V")
    public void method5() {
        for (int var1 = 0; var1 < this.field19; var1++) {
            for (int var2 = 0; var2 < this.field20; var2++) {
                if (var1 == 0 || var2 == 0 || this.field19 - 1 == var1 || this.field20 - 1 == var2) {
                    this.field21[var1][var2] = 16777215;
                } else {
                    this.field21[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZIII)V")
    public void method6(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (this.field11 != arg0) {
            return;
        }
        int var7 = arg4 - this.field17;
        int var8 = arg1 - this.field18;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method9(var7, var8, 128);
                this.method9(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method9(var7, var8, 2);
                this.method9(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method9(var7, var8, 8);
                this.method9(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method9(var7, var8, 32);
                this.method9(var7, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method9(var7, var8, 1);
                this.method9(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method9(var7, var8, 4);
                this.method9(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method9(var7, var8, 16);
                this.method9(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method9(var7, var8, 64);
                this.method9(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method9(var7, var8, 130);
                this.method9(var7 - 1, var8, 8);
                this.method9(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method9(var7, var8, 10);
                this.method9(var7, var8 + 1, 32);
                this.method9(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method9(var7, var8, 40);
                this.method9(var7 + 1, var8, 128);
                this.method9(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method9(var7, var8, 160);
                this.method9(var7, var8 - 1, 2);
                this.method9(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method9(var7, var8, 65536);
                this.method9(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method9(var7, var8, 1024);
                this.method9(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method9(var7, var8, 4096);
                this.method9(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method9(var7, var8, 16384);
                this.method9(var7, var8 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method9(var7, var8, 512);
                this.method9(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method9(var7, var8, 2048);
                this.method9(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method9(var7, var8, 8192);
                this.method9(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method9(var7, var8, 32768);
                this.method9(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method9(var7, var8, 66560);
            this.method9(var7 - 1, var8, 4096);
            this.method9(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method9(var7, var8, 5120);
            this.method9(var7, var8 + 1, 16384);
            this.method9(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method9(var7, var8, 20480);
            this.method9(var7 + 1, var8, 65536);
            this.method9(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method9(var7, var8, 81920);
            this.method9(var7, var8 - 1, 1024);
            this.method9(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIBZII)V")
    public void method7(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field17;
        int var10 = arg0 - this.field18;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg6;
            arg6 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field19) {
                for (int var14 = var10; var14 < arg5 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field20) {
                        this.method9(var12, var14, var8);
                    }
                }
            }
        }
        if (arg3 != 2) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZ)V")
    public void method8(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field17;
        int var5 = arg1 - this.field18;
        this.field21[var4][var5] |= 0x200000;
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(III)V")
    private void method9(int arg0, int arg1, int arg2) {
        this.field21[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZIZI)V")
    public void method10(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field17;
        if (!arg4) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg0 - this.field18;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method12(var7, var9, this.field13, 128);
                this.method12(var7 - 1, var9, this.field13, 8);
            }
            if (arg5 == 1) {
                this.method12(var7, var9, this.field13, 2);
                this.method12(var7, var9 + 1, this.field13, 32);
            }
            if (arg5 == 2) {
                this.method12(var7, var9, this.field13, 8);
                this.method12(var7 + 1, var9, this.field13, 128);
            }
            if (arg5 == 3) {
                this.method12(var7, var9, this.field13, 32);
                this.method12(var7, var9 - 1, this.field13, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method12(var7, var9, this.field13, 1);
                this.method12(var7 - 1, var9 + 1, this.field13, 16);
            }
            if (arg5 == 1) {
                this.method12(var7, var9, this.field13, 4);
                this.method12(var7 + 1, var9 + 1, this.field13, 64);
            }
            if (arg5 == 2) {
                this.method12(var7, var9, this.field13, 16);
                this.method12(var7 + 1, var9 - 1, this.field13, 1);
            }
            if (arg5 == 3) {
                this.method12(var7, var9, this.field13, 64);
                this.method12(var7 - 1, var9 - 1, this.field13, 4);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method12(var7, var9, this.field13, 130);
                this.method12(var7 - 1, var9, this.field13, 8);
                this.method12(var7, var9 + 1, this.field13, 32);
            }
            if (arg5 == 1) {
                this.method12(var7, var9, this.field13, 10);
                this.method12(var7, var9 + 1, this.field13, 32);
                this.method12(var7 + 1, var9, this.field13, 128);
            }
            if (arg5 == 2) {
                this.method12(var7, var9, this.field13, 40);
                this.method12(var7 + 1, var9, this.field13, 128);
                this.method12(var7, var9 - 1, this.field13, 2);
            }
            if (arg5 == 3) {
                this.method12(var7, var9, this.field13, 160);
                this.method12(var7, var9 - 1, this.field13, 2);
                this.method12(var7 - 1, var9, this.field13, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method12(var7, var9, this.field13, 65536);
                this.method12(var7 - 1, var9, this.field13, 4096);
            }
            if (arg5 == 1) {
                this.method12(var7, var9, this.field13, 1024);
                this.method12(var7, var9 + 1, this.field13, 16384);
            }
            if (arg5 == 2) {
                this.method12(var7, var9, this.field13, 4096);
                this.method12(var7 + 1, var9, this.field13, 65536);
            }
            if (arg5 == 3) {
                this.method12(var7, var9, this.field13, 16384);
                this.method12(var7, var9 - 1, this.field13, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method12(var7, var9, this.field13, 512);
                this.method12(var7 - 1, var9 + 1, this.field13, 8192);
            }
            if (arg5 == 1) {
                this.method12(var7, var9, this.field13, 2048);
                this.method12(var7 + 1, var9 + 1, this.field13, 32768);
            }
            if (arg5 == 2) {
                this.method12(var7, var9, this.field13, 8192);
                this.method12(var7 + 1, var9 - 1, this.field13, 512);
            }
            if (arg5 == 3) {
                this.method12(var7, var9, this.field13, 32768);
                this.method12(var7 - 1, var9 - 1, this.field13, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method12(var7, var9, this.field13, 66560);
            this.method12(var7 - 1, var9, this.field13, 4096);
            this.method12(var7, var9 + 1, this.field13, 16384);
        }
        if (arg5 == 1) {
            this.method12(var7, var9, this.field13, 5120);
            this.method12(var7, var9 + 1, this.field13, 16384);
            this.method12(var7 + 1, var9, this.field13, 65536);
        }
        if (arg5 == 2) {
            this.method12(var7, var9, this.field13, 20480);
            this.method12(var7 + 1, var9, this.field13, 65536);
            this.method12(var7, var9 - 1, this.field13, 1024);
        }
        if (arg5 == 3) {
            this.method12(var7, var9, this.field13, 81920);
            this.method12(var7, var9 - 1, this.field13, 1024);
            this.method12(var7 - 1, var9, this.field13, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIIBZI)V")
    public void method11(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field17;
        if (arg4 != 3) {
            this.field10 = -416;
        }
        int var10 = arg3 - this.field18;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg0;
            arg0 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field19) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field20) {
                        this.method12(var12, var13, this.field13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZI)V")
    private void method12(int arg0, int arg1, boolean arg2, int arg3) {
        this.field21[arg0][arg1] &= 16777215 - arg3;
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "b", descriptor = "(III)V")
    public void method13(int arg0, int arg1, int arg2) {
        if (arg2 != -44679) {
            this.field12 = !this.field12;
        }
        int var4 = arg1 - this.field17;
        int var5 = arg0 - this.field18;
        this.field21[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg0 == arg2) {
            return true;
        }
        int var8 = arg4 - this.field17;
        int var9 = arg2 - this.field18;
        int var10 = 61 / arg5;
        int var11 = arg6 - this.field17;
        int var12 = arg0 - this.field18;
        if (arg3 == 0) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field21[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field21[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field21[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field21[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field21[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field21[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field21[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field21[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var11 && var12 + 1 == var9 && (this.field21[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var9 && (this.field21[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var12 && (this.field21[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg5 && arg0 == arg1) {
            return true;
        }
        int var8 = arg5 - this.field17;
        if (arg3 != 36084) {
            throw new NullPointerException();
        }
        int var9 = arg0 - this.field18;
        int var10 = arg4 - this.field17;
        int var11 = arg1 - this.field18;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field21[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field21[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field21[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field21[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field21[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field21[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field21[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field21[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field21[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field21[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field21[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field21[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 <= 0) {
            throw new NullPointerException();
        }
        int var9 = arg3 + arg7 - 1;
        int var10 = arg1 + arg4 - 1;
        if (arg6 >= arg7 && arg6 <= var9 && arg0 >= arg4 && arg0 <= var10) {
            return true;
        } else if (arg7 - 1 == arg6 && arg0 >= arg4 && arg0 <= var10 && (this.field21[arg6 - this.field17][arg0 - this.field18] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg0 >= arg4 && arg0 <= var10 && (this.field21[arg6 - this.field17][arg0 - this.field18] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg0 && arg6 >= arg7 && arg6 <= var9 && (this.field21[arg6 - this.field17][arg0 - this.field18] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg6 >= arg7 && arg6 <= var9 && (this.field21[arg6 - this.field17][arg0 - this.field18] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
