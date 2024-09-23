import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1097 = false;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private boolean field1098 = true;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1099 = 366;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1100 = 47044;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "jc", name = "i", descriptor = "[[I")
    public int[][] field1105;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        this.field1101 = 0;
        this.field1102 = 0;
        this.field1103 = arg2;
        this.field1104 = arg1;
        this.field1105 = new int[this.field1103][this.field1104];
        this.method359(false);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Z)V")
    public void method359(boolean arg0) {
        for (int var2 = 0; var2 < this.field1103; var2++) {
            for (int var4 = 0; var4 < this.field1104; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1103 - 1 == var2 || this.field1104 - 1 == var4) {
                    this.field1105[var2][var4] = 16777215;
                } else {
                    this.field1105[var2][var4] = 0;
                }
            }
        }
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZ)V")
    public void method360(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field1101;
        if (arg2 != 4139) {
            return;
        }
        int var8 = arg1 - this.field1102;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method363(var7, var8, 128);
                this.method363(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method363(var7, var8, 2);
                this.method363(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method363(var7, var8, 8);
                this.method363(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method363(var7, var8, 32);
                this.method363(var7, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method363(var7, var8, 1);
                this.method363(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method363(var7, var8, 4);
                this.method363(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method363(var7, var8, 16);
                this.method363(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method363(var7, var8, 64);
                this.method363(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method363(var7, var8, 130);
                this.method363(var7 - 1, var8, 8);
                this.method363(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method363(var7, var8, 10);
                this.method363(var7, var8 + 1, 32);
                this.method363(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method363(var7, var8, 40);
                this.method363(var7 + 1, var8, 128);
                this.method363(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method363(var7, var8, 160);
                this.method363(var7, var8 - 1, 2);
                this.method363(var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method363(var7, var8, 65536);
                this.method363(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method363(var7, var8, 1024);
                this.method363(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method363(var7, var8, 4096);
                this.method363(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method363(var7, var8, 16384);
                this.method363(var7, var8 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method363(var7, var8, 512);
                this.method363(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method363(var7, var8, 2048);
                this.method363(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method363(var7, var8, 8192);
                this.method363(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method363(var7, var8, 32768);
                this.method363(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method363(var7, var8, 66560);
            this.method363(var7 - 1, var8, 4096);
            this.method363(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method363(var7, var8, 5120);
            this.method363(var7, var8 + 1, 16384);
            this.method363(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method363(var7, var8, 20480);
            this.method363(var7 + 1, var8, 65536);
            this.method363(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method363(var7, var8, 81920);
            this.method363(var7, var8 - 1, 1024);
            this.method363(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIIII)V")
    public void method361(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1101;
        int var10 = arg3 - this.field1102;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg0;
            arg0 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1103) {
                for (int var14 = var10; var14 < arg1 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field1104) {
                        this.method363(var12, var14, var8);
                    }
                }
            }
        }
        if (arg4 != 6) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    public void method362(int arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            int var4 = arg0 - this.field1101;
            int var5 = arg2 - this.field1102;
            this.field1105[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1105[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZB)V")
    public void method364(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg0 - this.field1101;
        int var8 = arg1 - this.field1102;
        if (arg5 != 8) {
            return;
        }
        boolean var9 = false;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method366(128, var7, var8, 0);
                this.method366(8, var7 - 1, var8, 0);
            }
            if (arg3 == 1) {
                this.method366(2, var7, var8, 0);
                this.method366(32, var7, var8 + 1, 0);
            }
            if (arg3 == 2) {
                this.method366(8, var7, var8, 0);
                this.method366(128, var7 + 1, var8, 0);
            }
            if (arg3 == 3) {
                this.method366(32, var7, var8, 0);
                this.method366(2, var7, var8 - 1, 0);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method366(1, var7, var8, 0);
                this.method366(16, var7 - 1, var8 + 1, 0);
            }
            if (arg3 == 1) {
                this.method366(4, var7, var8, 0);
                this.method366(64, var7 + 1, var8 + 1, 0);
            }
            if (arg3 == 2) {
                this.method366(16, var7, var8, 0);
                this.method366(1, var7 + 1, var8 - 1, 0);
            }
            if (arg3 == 3) {
                this.method366(64, var7, var8, 0);
                this.method366(4, var7 - 1, var8 - 1, 0);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method366(130, var7, var8, 0);
                this.method366(8, var7 - 1, var8, 0);
                this.method366(32, var7, var8 + 1, 0);
            }
            if (arg3 == 1) {
                this.method366(10, var7, var8, 0);
                this.method366(32, var7, var8 + 1, 0);
                this.method366(128, var7 + 1, var8, 0);
            }
            if (arg3 == 2) {
                this.method366(40, var7, var8, 0);
                this.method366(128, var7 + 1, var8, 0);
                this.method366(2, var7, var8 - 1, 0);
            }
            if (arg3 == 3) {
                this.method366(160, var7, var8, 0);
                this.method366(2, var7, var8 - 1, 0);
                this.method366(8, var7 - 1, var8, 0);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method366(65536, var7, var8, 0);
                this.method366(4096, var7 - 1, var8, 0);
            }
            if (arg3 == 1) {
                this.method366(1024, var7, var8, 0);
                this.method366(16384, var7, var8 + 1, 0);
            }
            if (arg3 == 2) {
                this.method366(4096, var7, var8, 0);
                this.method366(65536, var7 + 1, var8, 0);
            }
            if (arg3 == 3) {
                this.method366(16384, var7, var8, 0);
                this.method366(1024, var7, var8 - 1, 0);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method366(512, var7, var8, 0);
                this.method366(8192, var7 - 1, var8 + 1, 0);
            }
            if (arg3 == 1) {
                this.method366(2048, var7, var8, 0);
                this.method366(32768, var7 + 1, var8 + 1, 0);
            }
            if (arg3 == 2) {
                this.method366(8192, var7, var8, 0);
                this.method366(512, var7 + 1, var8 - 1, 0);
            }
            if (arg3 == 3) {
                this.method366(32768, var7, var8, 0);
                this.method366(2048, var7 - 1, var8 - 1, 0);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method366(66560, var7, var8, 0);
            this.method366(4096, var7 - 1, var8, 0);
            this.method366(16384, var7, var8 + 1, 0);
        }
        if (arg3 == 1) {
            this.method366(5120, var7, var8, 0);
            this.method366(16384, var7, var8 + 1, 0);
            this.method366(65536, var7 + 1, var8, 0);
        }
        if (arg3 == 2) {
            this.method366(20480, var7, var8, 0);
            this.method366(65536, var7 + 1, var8, 0);
            this.method366(1024, var7, var8 - 1, 0);
        }
        if (arg3 == 3) {
            this.method366(81920, var7, var8, 0);
            this.method366(1024, var7, var8 - 1, 0);
            this.method366(4096, var7 - 1, var8, 0);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZI)V")
    public void method365(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1101;
        if (arg1 != -34457) {
            this.field1099 = 6;
        }
        int var10 = arg3 - this.field1102;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg0;
            arg0 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1103) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1104) {
                        this.method366(var8, var12, var13, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method366(int arg0, int arg1, int arg2, int arg3) {
        this.field1105[arg1][arg2] &= 16777215 - arg0;
        if (arg3 != 0) {
            this.field1097 = !this.field1097;
        }
    }

    @OriginalMember(owner = "jc", name = "c", descriptor = "(III)V")
    public void method367(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field1099 = 263;
        }
        int var4 = arg2 - this.field1101;
        int var5 = arg1 - this.field1102;
        this.field1105[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BIIIIII)Z")
    public boolean method368(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg5 && arg1 == arg2) {
            return true;
        }
        int var8 = arg3 - this.field1101;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        int var9 = arg2 - this.field1102;
        int var10 = arg5 - this.field1101;
        int var11 = arg1 - this.field1102;
        if (arg4 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280180) == 0) {
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
                if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg4 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field1101;
        int var9 = arg5 - this.field1102;
        if (this.field1100 != arg0) {
            throw new NullPointerException();
        }
        int var10 = arg6 - this.field1101;
        int var11 = arg4 - this.field1102;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1105[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1105[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1105[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIIIII)Z")
    public boolean method370(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4 + arg5 - 1;
        int var10 = arg2 + arg7 - 1;
        if (!arg0) {
            this.field1097 = !this.field1097;
        }
        if (arg3 >= arg4 && arg3 <= var9 && arg1 >= arg7 && arg1 <= var10) {
            return true;
        } else if (arg4 - 1 == arg3 && arg1 >= arg7 && arg1 <= var10 && (this.field1105[arg3 - this.field1101][arg1 - this.field1102] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg1 >= arg7 && arg1 <= var10 && (this.field1105[arg3 - this.field1101][arg1 - this.field1102] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg1 && arg3 >= arg4 && arg3 <= var9 && (this.field1105[arg3 - this.field1101][arg1 - this.field1102] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg3 >= arg4 && arg3 <= var9 && (this.field1105[arg3 - this.field1101][arg1 - this.field1102] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
