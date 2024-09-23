import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1100 = true;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1101 = -16342;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1102 = -510;

    @OriginalMember(owner = "jc", name = "d", descriptor = "Z")
    private boolean field1103 = true;

    @OriginalMember(owner = "jc", name = "e", descriptor = "B")
    private byte field1104 = 9;

    @OriginalMember(owner = "jc", name = "f", descriptor = "Z")
    private boolean field1105 = false;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    private int field1106 = 465;

    @OriginalMember(owner = "jc", name = "h", descriptor = "Z")
    private boolean field1107 = true;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1108 = 0;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1109 = 0;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "jc", name = "m", descriptor = "[[I")
    public int[][] field1112;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        this.field1110 = arg0;
        this.field1111 = arg2;
        this.field1112 = new int[this.field1110][this.field1111];
        this.method359(this.field1101);
        if (arg1 != -20259) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method359(int arg0) {
        if (arg0 != -16342) {
            this.field1100 = !this.field1100;
        }
        for (int var2 = 0; var2 < this.field1110; var2++) {
            for (int var3 = 0; var3 < this.field1111; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1110 - 1 == var2 || this.field1111 - 1 == var3) {
                    this.field1112[var2][var3] = 16777215;
                } else {
                    this.field1112[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZI)V")
    public void method360(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        while (arg1 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var7 = arg0 - this.field1108;
        int var8 = arg3 - this.field1109;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method363(var7, var8, 128);
                this.method363(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method363(var7, var8, 2);
                this.method363(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method363(var7, var8, 8);
                this.method363(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method363(var7, var8, 32);
                this.method363(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method363(var7, var8, 1);
                this.method363(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method363(var7, var8, 4);
                this.method363(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method363(var7, var8, 16);
                this.method363(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method363(var7, var8, 64);
                this.method363(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method363(var7, var8, 130);
                this.method363(var7 - 1, var8, 8);
                this.method363(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method363(var7, var8, 10);
                this.method363(var7, var8 + 1, 32);
                this.method363(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method363(var7, var8, 40);
                this.method363(var7 + 1, var8, 128);
                this.method363(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method363(var7, var8, 160);
                this.method363(var7, var8 - 1, 2);
                this.method363(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method363(var7, var8, 65536);
                this.method363(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method363(var7, var8, 1024);
                this.method363(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method363(var7, var8, 4096);
                this.method363(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method363(var7, var8, 16384);
                this.method363(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method363(var7, var8, 512);
                this.method363(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method363(var7, var8, 2048);
                this.method363(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method363(var7, var8, 8192);
                this.method363(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method363(var7, var8, 32768);
                this.method363(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method363(var7, var8, 66560);
            this.method363(var7 - 1, var8, 4096);
            this.method363(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method363(var7, var8, 5120);
            this.method363(var7, var8 + 1, 16384);
            this.method363(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method363(var7, var8, 20480);
            this.method363(var7 + 1, var8, 65536);
            this.method363(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method363(var7, var8, 81920);
            this.method363(var7, var8 - 1, 1024);
            this.method363(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIIII)V")
    public void method361(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg6 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg2) {
            var8 += 131072;
        }
        int var10 = arg4 - this.field1108;
        int var11 = arg3 - this.field1109;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg0;
            arg0 = arg1;
            arg1 = var12;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1110) {
                for (int var14 = var11; var14 < arg1 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1111) {
                        this.method363(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZ)V")
    public void method362(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field1108;
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = arg0 - this.field1109;
        this.field1112[var4][var6] |= 0x200000;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1112[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZZIII)V")
    public void method364(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1108;
        int var8 = arg4 - this.field1109;
        if (arg1) {
            this.field1103 = !this.field1103;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method366(128, false, var7, var8);
                this.method366(8, false, var7 - 1, var8);
            }
            if (arg5 == 1) {
                this.method366(2, false, var7, var8);
                this.method366(32, false, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method366(8, false, var7, var8);
                this.method366(128, false, var7 + 1, var8);
            }
            if (arg5 == 3) {
                this.method366(32, false, var7, var8);
                this.method366(2, false, var7, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method366(1, false, var7, var8);
                this.method366(16, false, var7 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method366(4, false, var7, var8);
                this.method366(64, false, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method366(16, false, var7, var8);
                this.method366(1, false, var7 + 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method366(64, false, var7, var8);
                this.method366(4, false, var7 - 1, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method366(130, false, var7, var8);
                this.method366(8, false, var7 - 1, var8);
                this.method366(32, false, var7, var8 + 1);
            }
            if (arg5 == 1) {
                this.method366(10, false, var7, var8);
                this.method366(32, false, var7, var8 + 1);
                this.method366(128, false, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method366(40, false, var7, var8);
                this.method366(128, false, var7 + 1, var8);
                this.method366(2, false, var7, var8 - 1);
            }
            if (arg5 == 3) {
                this.method366(160, false, var7, var8);
                this.method366(2, false, var7, var8 - 1);
                this.method366(8, false, var7 - 1, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method366(65536, false, var7, var8);
                this.method366(4096, false, var7 - 1, var8);
            }
            if (arg5 == 1) {
                this.method366(1024, false, var7, var8);
                this.method366(16384, false, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method366(4096, false, var7, var8);
                this.method366(65536, false, var7 + 1, var8);
            }
            if (arg5 == 3) {
                this.method366(16384, false, var7, var8);
                this.method366(1024, false, var7, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method366(512, false, var7, var8);
                this.method366(8192, false, var7 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method366(2048, false, var7, var8);
                this.method366(32768, false, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method366(8192, false, var7, var8);
                this.method366(512, false, var7 + 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method366(32768, false, var7, var8);
                this.method366(2048, false, var7 - 1, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method366(66560, false, var7, var8);
            this.method366(4096, false, var7 - 1, var8);
            this.method366(16384, false, var7, var8 + 1);
        }
        if (arg5 == 1) {
            this.method366(5120, false, var7, var8);
            this.method366(16384, false, var7, var8 + 1);
            this.method366(65536, false, var7 + 1, var8);
        }
        if (arg5 == 2) {
            this.method366(20480, false, var7, var8);
            this.method366(65536, false, var7 + 1, var8);
            this.method366(1024, false, var7, var8 - 1);
        }
        if (arg5 == 3) {
            this.method366(81920, false, var7, var8);
            this.method366(1024, false, var7, var8 - 1);
            this.method366(4096, false, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIIII)V")
    public void method365(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 5) {
            return;
        }
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field1108;
        int var10 = arg3 - this.field1109;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg6;
            arg6 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1110) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1111) {
                        this.method366(var8, false, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZII)V")
    private void method366(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field1112[arg2][arg3] &= 16777215 - arg0;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(IIZ)V")
    public void method367(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field1108;
        int var5 = arg0 - this.field1109;
        if (!arg2) {
            this.field1112[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg1 && arg2 == arg3) {
            return true;
        }
        int var8 = arg1 - this.field1108;
        int var9 = arg3 - this.field1109;
        if (arg4 != 7843) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg0 - this.field1108;
        int var12 = arg2 - this.field1109;
        if (arg5 == 0) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg5 && arg0 == arg3) {
            return true;
        }
        int var8 = arg5 - this.field1108;
        int var9 = arg3 - this.field1109;
        if (arg1 != 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg4 - this.field1108;
        int var12 = arg0 - this.field1109;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var11 && var12 + 1 == var9 && (this.field1112[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var9 && (this.field1112[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var12 && (this.field1112[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIZI)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (!arg6) {
            throw new NullPointerException();
        }
        int var9 = arg0 + arg3 - 1;
        int var10 = arg4 + arg5 - 1;
        if (arg7 >= arg0 && arg7 <= var9 && arg2 >= arg4 && arg2 <= var10) {
            return true;
        } else if (arg0 - 1 == arg7 && arg2 >= arg4 && arg2 <= var10 && (this.field1112[arg7 - this.field1108][arg2 - this.field1109] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg2 >= arg4 && arg2 <= var10 && (this.field1112[arg7 - this.field1108][arg2 - this.field1109] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg2 && arg7 >= arg0 && arg7 <= var9 && (this.field1112[arg7 - this.field1108][arg2 - this.field1109] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg7 >= arg0 && arg7 <= var9 && (this.field1112[arg7 - this.field1108][arg2 - this.field1109] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
