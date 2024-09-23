import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ic")
public class CollisionMap {

    @OriginalMember(owner = "ic", name = "a", descriptor = "Z")
    private boolean field1023 = false;

    @OriginalMember(owner = "ic", name = "b", descriptor = "I")
    private int field1024 = -31142;

    @OriginalMember(owner = "ic", name = "c", descriptor = "I")
    private int field1025 = 2;

    @OriginalMember(owner = "ic", name = "d", descriptor = "I")
    private int field1026 = 288;

    @OriginalMember(owner = "ic", name = "e", descriptor = "I")
    private int field1027 = 2;

    @OriginalMember(owner = "ic", name = "f", descriptor = "I")
    private int field1028 = 7;

    @OriginalMember(owner = "ic", name = "g", descriptor = "Z")
    private boolean field1029 = true;

    @OriginalMember(owner = "ic", name = "h", descriptor = "I")
    public int field1030 = 0;

    @OriginalMember(owner = "ic", name = "i", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "ic", name = "j", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "ic", name = "k", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "ic", name = "l", descriptor = "[[I")
    public int[][] field1034;

    @OriginalMember(owner = "ic", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        int var4 = 73 / arg0;
        this.field1031 = 0;
        this.field1032 = arg1;
        this.field1033 = arg2;
        this.field1034 = new int[this.field1032][this.field1033];
        this.method346((byte) 77);
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(B)V")
    public void method346(byte arg0) {
        for (int var2 = 0; var2 < this.field1032; var2++) {
            for (int var3 = 0; var3 < this.field1033; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1032 - 1 == var2 || this.field1033 - 1 == var3) {
                    this.field1034[var2][var3] = 16777215;
                } else {
                    this.field1034[var2][var3] = 0;
                }
            }
        }
        if (arg0 == 77) {
            ;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIZIII)V")
    public void method347(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= 0) {
            return;
        }
        int var7 = arg5 - this.field1030;
        int var8 = arg3 - this.field1031;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method350(var7, var8, 128);
                this.method350(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method350(var7, var8, 2);
                this.method350(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method350(var7, var8, 8);
                this.method350(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method350(var7, var8, 32);
                this.method350(var7, var8 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method350(var7, var8, 1);
                this.method350(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method350(var7, var8, 4);
                this.method350(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method350(var7, var8, 16);
                this.method350(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method350(var7, var8, 64);
                this.method350(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method350(var7, var8, 130);
                this.method350(var7 - 1, var8, 8);
                this.method350(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method350(var7, var8, 10);
                this.method350(var7, var8 + 1, 32);
                this.method350(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method350(var7, var8, 40);
                this.method350(var7 + 1, var8, 128);
                this.method350(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method350(var7, var8, 160);
                this.method350(var7, var8 - 1, 2);
                this.method350(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method350(var7, var8, 65536);
                this.method350(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method350(var7, var8, 1024);
                this.method350(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method350(var7, var8, 4096);
                this.method350(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method350(var7, var8, 16384);
                this.method350(var7, var8 - 1, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method350(var7, var8, 512);
                this.method350(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method350(var7, var8, 2048);
                this.method350(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method350(var7, var8, 8192);
                this.method350(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method350(var7, var8, 32768);
                this.method350(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method350(var7, var8, 66560);
            this.method350(var7 - 1, var8, 4096);
            this.method350(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method350(var7, var8, 5120);
            this.method350(var7, var8 + 1, 16384);
            this.method350(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method350(var7, var8, 20480);
            this.method350(var7 + 1, var8, 65536);
            this.method350(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method350(var7, var8, 81920);
            this.method350(var7, var8 - 1, 1024);
            this.method350(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZIIZIII)V")
    public void method348(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1030;
        int var10 = arg2 - this.field1031;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg6;
            arg6 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1032) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1033) {
                        this.method350(var12, var13, var8);
                    }
                }
            }
        }
        if (arg3) {
            this.field1029 = !this.field1029;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IBI)V")
    public void method349(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field1030;
        int var5 = arg0 - this.field1031;
        if (arg1 != -12) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1034[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(III)V")
    private void method350(int arg0, int arg1, int arg2) {
        this.field1034[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZIIZII)V")
    public void method351(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            this.field1024 = -36;
        }
        int var7 = arg4 - this.field1030;
        int var8 = arg5 - this.field1031;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method353(var8, 128, 288, var7);
                this.method353(var8, 8, 288, var7 - 1);
            }
            if (arg1 == 1) {
                this.method353(var8, 2, 288, var7);
                this.method353(var8 + 1, 32, 288, var7);
            }
            if (arg1 == 2) {
                this.method353(var8, 8, 288, var7);
                this.method353(var8, 128, 288, var7 + 1);
            }
            if (arg1 == 3) {
                this.method353(var8, 32, 288, var7);
                this.method353(var8 - 1, 2, 288, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method353(var8, 1, 288, var7);
                this.method353(var8 + 1, 16, 288, var7 - 1);
            }
            if (arg1 == 1) {
                this.method353(var8, 4, 288, var7);
                this.method353(var8 + 1, 64, 288, var7 + 1);
            }
            if (arg1 == 2) {
                this.method353(var8, 16, 288, var7);
                this.method353(var8 - 1, 1, 288, var7 + 1);
            }
            if (arg1 == 3) {
                this.method353(var8, 64, 288, var7);
                this.method353(var8 - 1, 4, 288, var7 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method353(var8, 130, 288, var7);
                this.method353(var8, 8, 288, var7 - 1);
                this.method353(var8 + 1, 32, 288, var7);
            }
            if (arg1 == 1) {
                this.method353(var8, 10, 288, var7);
                this.method353(var8 + 1, 32, 288, var7);
                this.method353(var8, 128, 288, var7 + 1);
            }
            if (arg1 == 2) {
                this.method353(var8, 40, 288, var7);
                this.method353(var8, 128, 288, var7 + 1);
                this.method353(var8 - 1, 2, 288, var7);
            }
            if (arg1 == 3) {
                this.method353(var8, 160, 288, var7);
                this.method353(var8 - 1, 2, 288, var7);
                this.method353(var8, 8, 288, var7 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method353(var8, 65536, 288, var7);
                this.method353(var8, 4096, 288, var7 - 1);
            }
            if (arg1 == 1) {
                this.method353(var8, 1024, 288, var7);
                this.method353(var8 + 1, 16384, 288, var7);
            }
            if (arg1 == 2) {
                this.method353(var8, 4096, 288, var7);
                this.method353(var8, 65536, 288, var7 + 1);
            }
            if (arg1 == 3) {
                this.method353(var8, 16384, 288, var7);
                this.method353(var8 - 1, 1024, 288, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method353(var8, 512, 288, var7);
                this.method353(var8 + 1, 8192, 288, var7 - 1);
            }
            if (arg1 == 1) {
                this.method353(var8, 2048, 288, var7);
                this.method353(var8 + 1, 32768, 288, var7 + 1);
            }
            if (arg1 == 2) {
                this.method353(var8, 8192, 288, var7);
                this.method353(var8 - 1, 512, 288, var7 + 1);
            }
            if (arg1 == 3) {
                this.method353(var8, 32768, 288, var7);
                this.method353(var8 - 1, 2048, 288, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method353(var8, 66560, 288, var7);
            this.method353(var8, 4096, 288, var7 - 1);
            this.method353(var8 + 1, 16384, 288, var7);
        }
        if (arg1 == 1) {
            this.method353(var8, 5120, 288, var7);
            this.method353(var8 + 1, 16384, 288, var7);
            this.method353(var8, 65536, 288, var7 + 1);
        }
        if (arg1 == 2) {
            this.method353(var8, 20480, 288, var7);
            this.method353(var8, 65536, 288, var7 + 1);
            this.method353(var8 - 1, 1024, 288, var7);
        }
        if (arg1 == 3) {
            this.method353(var8, 81920, 288, var7);
            this.method353(var8 - 1, 1024, 288, var7);
            this.method353(var8, 4096, 288, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZIIIIII)V")
    public void method352(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2 != 0) {
            return;
        }
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1030;
        int var10 = arg3 - this.field1031;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg4;
            arg4 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1032) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1033) {
                        this.method353(var13, var8, 288, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIII)V")
    private void method353(int arg0, int arg1, int arg2, int arg3) {
        this.field1034[arg3][arg0] &= 16777215 - arg1;
        int var5 = 21 / arg2;
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(III)V")
    public void method354(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1030;
        int var5 = 32 / arg2;
        int var6 = arg0 - this.field1031;
        this.field1034[var4][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg4 && arg2 == arg3) {
            return true;
        }
        int var8 = arg4 - this.field1030;
        if (arg6 < 0 || arg6 > 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg2 - this.field1031;
        int var11 = arg1 - this.field1030;
        int var12 = arg3 - this.field1031;
        if (arg0 == 0) {
            if (arg5 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1034[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1034[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1034[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1034[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1034[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1034[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1034[var8][var10] & 0x280120) == 0) {
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
                if (var8 == var11 && var12 + 1 == var10 && (this.field1034[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1034[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1034[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1034[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg4 && arg1 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field1030;
        int var9 = arg1 - this.field1031;
        if (arg2 < 5 || arg2 > 5) {
            throw new NullPointerException();
        }
        int var10 = arg3 - this.field1030;
        int var11 = arg5 - this.field1031;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1034[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1034[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1034[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1034[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1034[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1034[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1034[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1034[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1034[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1034[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1034[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1034[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 + arg4 - 1;
        int var10 = arg0 + arg1 - 1;
        if (this.field1027 != arg3) {
            this.field1023 = !this.field1023;
        }
        if (arg5 >= arg4 && arg5 <= var9 && arg7 >= arg1 && arg7 <= var10) {
            return true;
        } else if (arg4 - 1 == arg5 && arg7 >= arg1 && arg7 <= var10 && (this.field1034[arg5 - this.field1030][arg7 - this.field1031] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg7 >= arg1 && arg7 <= var10 && (this.field1034[arg5 - this.field1030][arg7 - this.field1031] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg7 && arg5 >= arg4 && arg5 <= var9 && (this.field1034[arg5 - this.field1030][arg7 - this.field1031] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg5 >= arg4 && arg5 <= var9 && (this.field1034[arg5 - this.field1030][arg7 - this.field1031] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
