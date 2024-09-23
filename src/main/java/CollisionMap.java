import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1101 = false;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1102 = 362;

    @OriginalMember(owner = "jc", name = "c", descriptor = "Z")
    private boolean field1103 = false;

    @OriginalMember(owner = "jc", name = "d", descriptor = "B")
    private byte field1104 = 97;

    @OriginalMember(owner = "jc", name = "e", descriptor = "B")
    private byte field1105 = 6;

    @OriginalMember(owner = "jc", name = "f", descriptor = "B")
    private byte field1106 = 2;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    private int field1107 = 997;

    @OriginalMember(owner = "jc", name = "h", descriptor = "Z")
    private boolean field1108 = true;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    private int field1109 = 636;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    private int field1110 = -484;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1111 = 0;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1112 = 0;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "jc", name = "o", descriptor = "[[I")
    public int[][] field1115;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        this.field1113 = arg0;
        this.field1114 = arg2;
        this.field1115 = new int[this.field1113][this.field1114];
        if (arg1 != 0) {
            this.field1102 = -91;
        }
        this.method359((byte) 97);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(B)V")
    public void method359(byte arg0) {
        for (int var2 = 0; var2 < this.field1113; var2++) {
            for (int var4 = 0; var4 < this.field1114; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1113 - 1 == var2 || this.field1114 - 1 == var4) {
                    this.field1115[var2][var4] = 16777215;
                } else {
                    this.field1115[var2][var4] = 0;
                }
            }
        }
        if (this.field1104 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIIZ)V")
    public void method360(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field1111;
        if (arg5) {
            this.field1102 = -42;
        }
        int var8 = arg4 - this.field1112;
        if (arg3 == 0) {
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
        if (arg3 == 1 || arg3 == 3) {
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
        if (arg3 == 2) {
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
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
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
        if (arg3 == 1 || arg3 == 3) {
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
        if (arg3 != 2) {
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

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZBIII)V")
    public void method361(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1111;
        if (this.field1105 == arg3) {
            boolean var10 = false;
        } else {
            this.field1110 = -360;
        }
        int var11 = arg0 - this.field1112;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg1;
            arg1 = arg4;
            arg4 = var12;
        }
        for (int var13 = var9; var13 < arg1 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1113) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1114) {
                        this.method363(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    public void method362(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1111;
        if (arg2 == 5) {
            int var5 = arg0 - this.field1112;
            this.field1115[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1115[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BIIZII)V")
    public void method364(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 == 0) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg1 - this.field1111;
        int var10 = arg2 - this.field1112;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method366(128, var9, var10, 0);
                this.method366(8, var9 - 1, var10, 0);
            }
            if (arg4 == 1) {
                this.method366(2, var9, var10, 0);
                this.method366(32, var9, var10 + 1, 0);
            }
            if (arg4 == 2) {
                this.method366(8, var9, var10, 0);
                this.method366(128, var9 + 1, var10, 0);
            }
            if (arg4 == 3) {
                this.method366(32, var9, var10, 0);
                this.method366(2, var9, var10 - 1, 0);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method366(1, var9, var10, 0);
                this.method366(16, var9 - 1, var10 + 1, 0);
            }
            if (arg4 == 1) {
                this.method366(4, var9, var10, 0);
                this.method366(64, var9 + 1, var10 + 1, 0);
            }
            if (arg4 == 2) {
                this.method366(16, var9, var10, 0);
                this.method366(1, var9 + 1, var10 - 1, 0);
            }
            if (arg4 == 3) {
                this.method366(64, var9, var10, 0);
                this.method366(4, var9 - 1, var10 - 1, 0);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method366(130, var9, var10, 0);
                this.method366(8, var9 - 1, var10, 0);
                this.method366(32, var9, var10 + 1, 0);
            }
            if (arg4 == 1) {
                this.method366(10, var9, var10, 0);
                this.method366(32, var9, var10 + 1, 0);
                this.method366(128, var9 + 1, var10, 0);
            }
            if (arg4 == 2) {
                this.method366(40, var9, var10, 0);
                this.method366(128, var9 + 1, var10, 0);
                this.method366(2, var9, var10 - 1, 0);
            }
            if (arg4 == 3) {
                this.method366(160, var9, var10, 0);
                this.method366(2, var9, var10 - 1, 0);
                this.method366(8, var9 - 1, var10, 0);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method366(65536, var9, var10, 0);
                this.method366(4096, var9 - 1, var10, 0);
            }
            if (arg4 == 1) {
                this.method366(1024, var9, var10, 0);
                this.method366(16384, var9, var10 + 1, 0);
            }
            if (arg4 == 2) {
                this.method366(4096, var9, var10, 0);
                this.method366(65536, var9 + 1, var10, 0);
            }
            if (arg4 == 3) {
                this.method366(16384, var9, var10, 0);
                this.method366(1024, var9, var10 - 1, 0);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method366(512, var9, var10, 0);
                this.method366(8192, var9 - 1, var10 + 1, 0);
            }
            if (arg4 == 1) {
                this.method366(2048, var9, var10, 0);
                this.method366(32768, var9 + 1, var10 + 1, 0);
            }
            if (arg4 == 2) {
                this.method366(8192, var9, var10, 0);
                this.method366(512, var9 + 1, var10 - 1, 0);
            }
            if (arg4 == 3) {
                this.method366(32768, var9, var10, 0);
                this.method366(2048, var9 - 1, var10 - 1, 0);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method366(66560, var9, var10, 0);
            this.method366(4096, var9 - 1, var10, 0);
            this.method366(16384, var9, var10 + 1, 0);
        }
        if (arg4 == 1) {
            this.method366(5120, var9, var10, 0);
            this.method366(16384, var9, var10 + 1, 0);
            this.method366(65536, var9 + 1, var10, 0);
        }
        if (arg4 == 2) {
            this.method366(20480, var9, var10, 0);
            this.method366(65536, var9 + 1, var10, 0);
            this.method366(1024, var9, var10 - 1, 0);
        }
        if (arg4 == 3) {
            this.method366(81920, var9, var10, 0);
            this.method366(1024, var9, var10 - 1, 0);
            this.method366(4096, var9 - 1, var10, 0);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIIII)V")
    public void method365(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1111;
        int var10 = arg4 - this.field1112;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1113) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1114) {
                        this.method366(var8, var12, var13, 0);
                    }
                }
            }
        }
        if (arg6 <= 0) {
            this.field1103 = !this.field1103;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method366(int arg0, int arg1, int arg2, int arg3) {
        this.field1115[arg1][arg2] &= 16777215 - arg0;
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "c", descriptor = "(III)V")
    public void method367(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1111;
        int var5 = arg1 - this.field1112;
        this.field1115[var4][var5] &= 0xDFFFFF;
        if (arg2 < 2 || arg2 > 2) {
            this.field1110 = -92;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field1111;
        if (arg5 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg2 - this.field1112;
        int var11 = arg6 - this.field1111;
        int var12 = arg4 - this.field1112;
        if (arg3 == 0) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1115[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1115[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1115[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1115[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1115[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1115[var8][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1115[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1115[var8][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1115[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1115[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1115[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method369(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == arg6 && arg2 == arg3) {
            return true;
        }
        int var8 = arg0 - this.field1111;
        if (arg4) {
            throw new NullPointerException();
        }
        int var9 = arg2 - this.field1112;
        int var10 = arg6 - this.field1111;
        int var11 = arg3 - this.field1112;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1115[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1115[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1115[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1115[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1115[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1115[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1115[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1115[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1115[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1115[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1115[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1115[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg6 - 1;
        int var10 = arg4 + arg5 - 1;
        int var11 = 95 / arg0;
        if (arg1 >= arg3 && arg1 <= var9 && arg7 >= arg4 && arg7 <= var10) {
            return true;
        } else if (arg3 - 1 == arg1 && arg7 >= arg4 && arg7 <= var10 && (this.field1115[arg1 - this.field1111][arg7 - this.field1112] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg1 && arg7 >= arg4 && arg7 <= var10 && (this.field1115[arg1 - this.field1111][arg7 - this.field1112] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg7 && arg1 >= arg3 && arg1 <= var9 && (this.field1115[arg1 - this.field1111][arg7 - this.field1112] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg1 >= arg3 && arg1 <= var9 && (this.field1115[arg1 - this.field1111][arg7 - this.field1112] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
