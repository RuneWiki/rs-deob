import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OPAHDXQS")
public class class43 {

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "I")
    private int field1151 = -884;

    @OriginalMember(owner = "OPAHDXQS", name = "b", descriptor = "Z")
    private boolean field1152 = false;

    @OriginalMember(owner = "OPAHDXQS", name = "c", descriptor = "Z")
    private boolean field1153 = false;

    @OriginalMember(owner = "OPAHDXQS", name = "e", descriptor = "B")
    private byte field1155 = 8;

    @OriginalMember(owner = "OPAHDXQS", name = "f", descriptor = "B")
    private byte field1156 = 6;

    @OriginalMember(owner = "OPAHDXQS", name = "g", descriptor = "I")
    private int field1157 = 397;

    @OriginalMember(owner = "OPAHDXQS", name = "h", descriptor = "I")
    private int field1158 = -53;

    @OriginalMember(owner = "OPAHDXQS", name = "i", descriptor = "I")
    public int field1159 = 0;

    @OriginalMember(owner = "OPAHDXQS", name = "j", descriptor = "I")
    public int field1160 = 0;

    @OriginalMember(owner = "OPAHDXQS", name = "k", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "OPAHDXQS", name = "l", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "OPAHDXQS", name = "m", descriptor = "[[I")
    public int[][] field1163;

    @OriginalMember(owner = "OPAHDXQS", name = "d", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "OPAHDXQS", name = "<init>", descriptor = "(IBI)V")
    public class43(int arg0, byte arg1, int arg2) {
        this.field1161 = arg2;
        this.field1162 = arg0;
        if (arg1 != 4) {
            this.field1152 = !this.field1152;
        }
        this.field1163 = new int[this.field1161][this.field1162];
        this.method371();
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "()V")
    public void method371() {
        for (int var1 = 0; var1 < this.field1161; var1++) {
            for (int var2 = 0; var2 < this.field1162; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1161 - 1 == var1 || this.field1162 - 1 == var2) {
                    this.field1163[var1][var2] = 16777215;
                } else {
                    this.field1163[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "(IIZIII)V")
    public void method372(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field1159;
        if (arg0 >= 0) {
            this.field1151 = -205;
        }
        int var8 = arg4 - this.field1160;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method375(var7, var8, 128);
                this.method375(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method375(var7, var8, 2);
                this.method375(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method375(var7, var8, 8);
                this.method375(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method375(var7, var8, 32);
                this.method375(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method375(var7, var8, 1);
                this.method375(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method375(var7, var8, 4);
                this.method375(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method375(var7, var8, 16);
                this.method375(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method375(var7, var8, 64);
                this.method375(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method375(var7, var8, 130);
                this.method375(var7 - 1, var8, 8);
                this.method375(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method375(var7, var8, 10);
                this.method375(var7, var8 + 1, 32);
                this.method375(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method375(var7, var8, 40);
                this.method375(var7 + 1, var8, 128);
                this.method375(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method375(var7, var8, 160);
                this.method375(var7, var8 - 1, 2);
                this.method375(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method375(var7, var8, 65536);
                this.method375(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method375(var7, var8, 1024);
                this.method375(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method375(var7, var8, 4096);
                this.method375(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method375(var7, var8, 16384);
                this.method375(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method375(var7, var8, 512);
                this.method375(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method375(var7, var8, 2048);
                this.method375(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method375(var7, var8, 8192);
                this.method375(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method375(var7, var8, 32768);
                this.method375(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method375(var7, var8, 66560);
            this.method375(var7 - 1, var8, 4096);
            this.method375(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method375(var7, var8, 5120);
            this.method375(var7, var8 + 1, 16384);
            this.method375(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method375(var7, var8, 20480);
            this.method375(var7 + 1, var8, 65536);
            this.method375(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method375(var7, var8, 81920);
            this.method375(var7, var8 - 1, 1024);
            this.method375(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "(IZIBIII)V")
    public void method373(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (this.field1155 == arg3) {
            boolean var9 = false;
        } else {
            this.field1154 = 73;
        }
        if (arg1) {
            var8 += 131072;
        }
        int var10 = arg6 - this.field1159;
        int var11 = arg0 - this.field1160;
        if (arg2 == 1 || arg2 == 3) {
            int var12 = arg5;
            arg5 = arg4;
            arg4 = var12;
        }
        for (int var13 = var10; var13 < arg5 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1161) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1162) {
                        this.method375(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "(III)V")
    public void method374(int arg0, int arg1, int arg2) {
        if (arg0 == 2) {
            int var4 = arg1 - this.field1159;
            int var5 = arg2 - this.field1160;
            this.field1163[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "OPAHDXQS", name = "b", descriptor = "(III)V")
    private void method375(int arg0, int arg1, int arg2) {
        this.field1163[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "OPAHDXQS", name = "b", descriptor = "(IIZIII)V")
    public void method376(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1159;
        if (arg1 != -19182) {
            return;
        }
        int var8 = arg0 - this.field1160;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method378(128, 32275, var7, var8);
                this.method378(8, 32275, var7 - 1, var8);
            }
            if (arg5 == 1) {
                this.method378(2, 32275, var7, var8);
                this.method378(32, 32275, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method378(8, 32275, var7, var8);
                this.method378(128, 32275, var7 + 1, var8);
            }
            if (arg5 == 3) {
                this.method378(32, 32275, var7, var8);
                this.method378(2, 32275, var7, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method378(1, 32275, var7, var8);
                this.method378(16, 32275, var7 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method378(4, 32275, var7, var8);
                this.method378(64, 32275, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method378(16, 32275, var7, var8);
                this.method378(1, 32275, var7 + 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method378(64, 32275, var7, var8);
                this.method378(4, 32275, var7 - 1, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method378(130, 32275, var7, var8);
                this.method378(8, 32275, var7 - 1, var8);
                this.method378(32, 32275, var7, var8 + 1);
            }
            if (arg5 == 1) {
                this.method378(10, 32275, var7, var8);
                this.method378(32, 32275, var7, var8 + 1);
                this.method378(128, 32275, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method378(40, 32275, var7, var8);
                this.method378(128, 32275, var7 + 1, var8);
                this.method378(2, 32275, var7, var8 - 1);
            }
            if (arg5 == 3) {
                this.method378(160, 32275, var7, var8);
                this.method378(2, 32275, var7, var8 - 1);
                this.method378(8, 32275, var7 - 1, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method378(65536, 32275, var7, var8);
                this.method378(4096, 32275, var7 - 1, var8);
            }
            if (arg5 == 1) {
                this.method378(1024, 32275, var7, var8);
                this.method378(16384, 32275, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method378(4096, 32275, var7, var8);
                this.method378(65536, 32275, var7 + 1, var8);
            }
            if (arg5 == 3) {
                this.method378(16384, 32275, var7, var8);
                this.method378(1024, 32275, var7, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method378(512, 32275, var7, var8);
                this.method378(8192, 32275, var7 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method378(2048, 32275, var7, var8);
                this.method378(32768, 32275, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method378(8192, 32275, var7, var8);
                this.method378(512, 32275, var7 + 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method378(32768, 32275, var7, var8);
                this.method378(2048, 32275, var7 - 1, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method378(66560, 32275, var7, var8);
            this.method378(4096, 32275, var7 - 1, var8);
            this.method378(16384, 32275, var7, var8 + 1);
        }
        if (arg5 == 1) {
            this.method378(5120, 32275, var7, var8);
            this.method378(16384, 32275, var7, var8 + 1);
            this.method378(65536, 32275, var7 + 1, var8);
        }
        if (arg5 == 2) {
            this.method378(20480, 32275, var7, var8);
            this.method378(65536, 32275, var7 + 1, var8);
            this.method378(1024, 32275, var7, var8 - 1);
        }
        if (arg5 == 3) {
            this.method378(81920, 32275, var7, var8);
            this.method378(1024, 32275, var7, var8 - 1);
            this.method378(4096, 32275, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "(ZIBIIII)V")
    public void method377(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (this.field1156 != arg2) {
            this.field1152 = !this.field1152;
        }
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1159;
        int var10 = arg6 - this.field1160;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg3;
            arg3 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1161) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1162) {
                        this.method378(var8, 32275, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "(IIII)V")
    private void method378(int arg0, int arg1, int arg2, int arg3) {
        this.field1163[arg2][arg3] &= 16777215 - arg0;
        if (arg1 == 32275) {
            ;
        }
    }

    @OriginalMember(owner = "OPAHDXQS", name = "c", descriptor = "(III)V")
    public void method379(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1159;
        int var5 = arg2 - this.field1160;
        int var6 = 66 / arg1;
        this.field1163[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg4 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field1159;
        int var9 = arg4 - this.field1160;
        int var10 = arg3 - this.field1159;
        int var11 = arg6 - this.field1160;
        if (arg2 >= 0) {
            throw new NullPointerException();
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1163[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1163[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1163[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1163[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1163[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1163[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1163[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1163[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1163[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1163[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1163[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "OPAHDXQS", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg4 == arg6 && arg3 == arg5) {
            return true;
        }
        int var9 = arg4 - this.field1159;
        int var10 = arg5 - this.field1160;
        int var11 = arg6 - this.field1159;
        int var12 = arg3 - this.field1160;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field1163[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1163[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1163[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1163[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1163[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1163[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field1163[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1163[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field1163[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field1163[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field1163[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field1163[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "OPAHDXQS", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg7 - 1;
        int var10 = arg1 + arg5 - 1;
        if (arg2 >= 0) {
            throw new NullPointerException();
        } else if (arg6 >= arg7 && arg6 <= var9 && arg3 >= arg1 && arg3 <= var10) {
            return true;
        } else if (arg7 - 1 == arg6 && arg3 >= arg1 && arg3 <= var10 && (this.field1163[arg6 - this.field1159][arg3 - this.field1160] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg3 >= arg1 && arg3 <= var10 && (this.field1163[arg6 - this.field1159][arg3 - this.field1160] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg3 && arg6 >= arg7 && arg6 <= var9 && (this.field1163[arg6 - this.field1159][arg3 - this.field1160] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg6 >= arg7 && arg6 <= var9 && (this.field1163[arg6 - this.field1159][arg3 - this.field1160] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }
}
