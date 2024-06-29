import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CAMRNFMB")
public class class6 {

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "Z")
    private boolean field129 = false;

    @OriginalMember(owner = "client!CAMRNFMB", name = "b", descriptor = "B")
    private byte field130 = 51;

    @OriginalMember(owner = "client!CAMRNFMB", name = "c", descriptor = "I")
    private int field131 = -245;

    @OriginalMember(owner = "client!CAMRNFMB", name = "d", descriptor = "Z")
    private boolean field132 = false;

    @OriginalMember(owner = "client!CAMRNFMB", name = "e", descriptor = "I")
    private int field133 = 16288;

    @OriginalMember(owner = "client!CAMRNFMB", name = "f", descriptor = "I")
    public int field134 = 0;

    @OriginalMember(owner = "client!CAMRNFMB", name = "g", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!CAMRNFMB", name = "h", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!CAMRNFMB", name = "i", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!CAMRNFMB", name = "j", descriptor = "[[I")
    public int[][] field138;

    @OriginalMember(owner = "client!CAMRNFMB", name = "<init>", descriptor = "(IBI)V")
    public class6(int arg0, byte arg1, int arg2) {
        if (this.field130 != arg1) {
            this.field132 = !this.field132;
        }
        this.field135 = 0;
        this.field136 = arg0;
        this.field137 = arg2;
        this.field138 = new int[this.field136][this.field137];
        this.method28();
        if (class34.field1027) {
        }
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "()V")
    public void method28() {
        for (int var1 = 0; var1 < this.field136; var1++) {
            for (int var2 = 0; var2 < this.field137; var2++) {
                if (var1 == 0 || var2 == 0 || this.field136 - 1 == var1 || this.field137 - 1 == var2) {
                    this.field138[var1][var2] = 16777215;
                } else {
                    this.field138[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIZI)V")
    public void method29(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg1 - this.field134;
        int var8 = arg2 - this.field135;
        if (arg0 >= 0) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method32(var7, var8, 128);
                this.method32(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method32(var7, var8, 2);
                this.method32(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method32(var7, var8, 8);
                this.method32(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method32(var7, var8, 32);
                this.method32(var7, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method32(var7, var8, 1);
                this.method32(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method32(var7, var8, 4);
                this.method32(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method32(var7, var8, 16);
                this.method32(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method32(var7, var8, 64);
                this.method32(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method32(var7, var8, 130);
                this.method32(var7 - 1, var8, 8);
                this.method32(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method32(var7, var8, 10);
                this.method32(var7, var8 + 1, 32);
                this.method32(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method32(var7, var8, 40);
                this.method32(var7 + 1, var8, 128);
                this.method32(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method32(var7, var8, 160);
                this.method32(var7, var8 - 1, 2);
                this.method32(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method32(var7, var8, 65536);
                this.method32(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method32(var7, var8, 1024);
                this.method32(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method32(var7, var8, 4096);
                this.method32(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method32(var7, var8, 16384);
                this.method32(var7, var8 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method32(var7, var8, 512);
                this.method32(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method32(var7, var8, 2048);
                this.method32(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method32(var7, var8, 8192);
                this.method32(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method32(var7, var8, 32768);
                this.method32(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method32(var7, var8, 66560);
            this.method32(var7 - 1, var8, 4096);
            this.method32(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method32(var7, var8, 5120);
            this.method32(var7, var8 + 1, 16384);
            this.method32(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method32(var7, var8, 20480);
            this.method32(var7 + 1, var8, 65536);
            this.method32(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method32(var7, var8, 81920);
            this.method32(var7, var8 - 1, 1024);
            this.method32(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IZIIIII)V")
    public void method30(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 5) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        int var10 = arg4 - this.field134;
        int var11 = arg3 - this.field135;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg5;
            arg5 = arg0;
            arg0 = var12;
        }
        for (int var13 = var10; var13 < arg5 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field136) {
                for (int var14 = var11; var14 < arg0 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field137) {
                        this.method32(var13, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(III)V")
    public void method31(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field134;
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = arg1 - this.field135;
        this.field138[var4][var6] |= 0x200000;
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "b", descriptor = "(III)V")
    private void method32(int arg0, int arg1, int arg2) {
        this.field138[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IZIIII)V")
    public void method33(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field134;
        if (arg2 >= 0) {
            return;
        }
        int var8 = arg3 - this.field135;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method35(128, var7, var8, -20900);
                this.method35(8, var7 - 1, var8, -20900);
            }
            if (arg5 == 1) {
                this.method35(2, var7, var8, -20900);
                this.method35(32, var7, var8 + 1, -20900);
            }
            if (arg5 == 2) {
                this.method35(8, var7, var8, -20900);
                this.method35(128, var7 + 1, var8, -20900);
            }
            if (arg5 == 3) {
                this.method35(32, var7, var8, -20900);
                this.method35(2, var7, var8 - 1, -20900);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method35(1, var7, var8, -20900);
                this.method35(16, var7 - 1, var8 + 1, -20900);
            }
            if (arg5 == 1) {
                this.method35(4, var7, var8, -20900);
                this.method35(64, var7 + 1, var8 + 1, -20900);
            }
            if (arg5 == 2) {
                this.method35(16, var7, var8, -20900);
                this.method35(1, var7 + 1, var8 - 1, -20900);
            }
            if (arg5 == 3) {
                this.method35(64, var7, var8, -20900);
                this.method35(4, var7 - 1, var8 - 1, -20900);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method35(130, var7, var8, -20900);
                this.method35(8, var7 - 1, var8, -20900);
                this.method35(32, var7, var8 + 1, -20900);
            }
            if (arg5 == 1) {
                this.method35(10, var7, var8, -20900);
                this.method35(32, var7, var8 + 1, -20900);
                this.method35(128, var7 + 1, var8, -20900);
            }
            if (arg5 == 2) {
                this.method35(40, var7, var8, -20900);
                this.method35(128, var7 + 1, var8, -20900);
                this.method35(2, var7, var8 - 1, -20900);
            }
            if (arg5 == 3) {
                this.method35(160, var7, var8, -20900);
                this.method35(2, var7, var8 - 1, -20900);
                this.method35(8, var7 - 1, var8, -20900);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method35(65536, var7, var8, -20900);
                this.method35(4096, var7 - 1, var8, -20900);
            }
            if (arg5 == 1) {
                this.method35(1024, var7, var8, -20900);
                this.method35(16384, var7, var8 + 1, -20900);
            }
            if (arg5 == 2) {
                this.method35(4096, var7, var8, -20900);
                this.method35(65536, var7 + 1, var8, -20900);
            }
            if (arg5 == 3) {
                this.method35(16384, var7, var8, -20900);
                this.method35(1024, var7, var8 - 1, -20900);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method35(512, var7, var8, -20900);
                this.method35(8192, var7 - 1, var8 + 1, -20900);
            }
            if (arg5 == 1) {
                this.method35(2048, var7, var8, -20900);
                this.method35(32768, var7 + 1, var8 + 1, -20900);
            }
            if (arg5 == 2) {
                this.method35(8192, var7, var8, -20900);
                this.method35(512, var7 + 1, var8 - 1, -20900);
            }
            if (arg5 == 3) {
                this.method35(32768, var7, var8, -20900);
                this.method35(2048, var7 - 1, var8 - 1, -20900);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method35(66560, var7, var8, -20900);
            this.method35(4096, var7 - 1, var8, -20900);
            this.method35(16384, var7, var8 + 1, -20900);
        }
        if (arg5 == 1) {
            this.method35(5120, var7, var8, -20900);
            this.method35(16384, var7, var8 + 1, -20900);
            this.method35(65536, var7 + 1, var8, -20900);
        }
        if (arg5 == 2) {
            this.method35(20480, var7, var8, -20900);
            this.method35(65536, var7 + 1, var8, -20900);
            this.method35(1024, var7, var8 - 1, -20900);
        }
        if (arg5 == 3) {
            this.method35(81920, var7, var8, -20900);
            this.method35(1024, var7, var8 - 1, -20900);
            this.method35(4096, var7 - 1, var8, -20900);
            return;
        }
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "b", descriptor = "(IZIIIII)V")
    public void method34(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field134;
        if (this.field133 != arg2) {
            return;
        }
        int var10 = arg6 - this.field135;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg4;
            arg4 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field136) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field137) {
                        this.method35(var8, var12, var13, -20900);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIII)V")
    private void method35(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -20900) {
            this.field129 = !this.field129;
        }
        this.field138[arg1][arg2] &= 16777215 - arg0;
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "c", descriptor = "(III)V")
    public void method36(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field134;
        int var5 = arg2 - this.field135;
        this.field138[var4][var5] &= 0xDFFFFF;
        int var6 = 70 / arg1;
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIBII)Z")
    public boolean method37(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var8 = arg2 - this.field134;
        if (arg4 != 5) {
            throw new NullPointerException();
        }
        boolean var9 = false;
        int var10 = arg1 - this.field135;
        int var11 = arg0 - this.field134;
        int var12 = arg3 - this.field135;
        if (arg6 == 0) {
            if (arg5 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field138[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field138[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field138[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field138[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field138[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field138[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field138[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field138[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field138[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field138[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field138[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg6 && arg3 == arg5) {
            return true;
        }
        int var8 = arg6 - this.field134;
        int var9 = arg5 - this.field135;
        while (arg0 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var10 = arg2 - this.field134;
        int var11 = arg3 - this.field135;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field138[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field138[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field138[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field138[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field138[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field138[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field138[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field138[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field138[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field138[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field138[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field138[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg5 - 1;
        int var10 = arg0 + arg2 - 1;
        if (arg1 != -15341) {
            this.field131 = 449;
        }
        if (arg7 >= arg5 && arg7 <= var9 && arg4 >= arg0 && arg4 <= var10) {
            return true;
        } else if (arg5 - 1 == arg7 && arg4 >= arg0 && arg4 <= var10 && (this.field138[arg7 - this.field134][arg4 - this.field135] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg4 >= arg0 && arg4 <= var10 && (this.field138[arg7 - this.field134][arg4 - this.field135] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg4 && arg7 >= arg5 && arg7 <= var9 && (this.field138[arg7 - this.field134][arg4 - this.field135] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg4 && arg7 >= arg5 && arg7 <= var9 && (this.field138[arg7 - this.field134][arg4 - this.field135] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
