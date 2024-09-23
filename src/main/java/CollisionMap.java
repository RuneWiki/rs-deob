import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private int field1094 = 9;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "jc", name = "c", descriptor = "Z")
    private boolean field1096 = true;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1097 = 722;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1098 = 9;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1099 = 0;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1100 = 0;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[[I")
    public int[][] field1103;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(IBI)V")
    public CollisionMap(int arg0, byte arg1, int arg2) {
        this.field1101 = arg2;
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        this.field1102 = arg0;
        this.field1103 = new int[this.field1101][this.field1102];
        this.method359(214);
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method359(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        for (int var2 = 0; var2 < this.field1101; var2++) {
            for (int var3 = 0; var3 < this.field1102; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1101 - 1 == var2 || this.field1102 - 1 == var3) {
                    this.field1103[var2][var3] = 16777215;
                } else {
                    this.field1103[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIBZ)V")
    public void method360(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        int var7 = arg2 - this.field1099;
        if (arg4 == 1) {
            boolean var8 = false;
        } else {
            this.field1095 = !this.field1095;
        }
        int var9 = arg1 - this.field1100;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method363(var7, var9, 128);
                this.method363(var7 - 1, var9, 8);
            }
            if (arg3 == 1) {
                this.method363(var7, var9, 2);
                this.method363(var7, var9 + 1, 32);
            }
            if (arg3 == 2) {
                this.method363(var7, var9, 8);
                this.method363(var7 + 1, var9, 128);
            }
            if (arg3 == 3) {
                this.method363(var7, var9, 32);
                this.method363(var7, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method363(var7, var9, 1);
                this.method363(var7 - 1, var9 + 1, 16);
            }
            if (arg3 == 1) {
                this.method363(var7, var9, 4);
                this.method363(var7 + 1, var9 + 1, 64);
            }
            if (arg3 == 2) {
                this.method363(var7, var9, 16);
                this.method363(var7 + 1, var9 - 1, 1);
            }
            if (arg3 == 3) {
                this.method363(var7, var9, 64);
                this.method363(var7 - 1, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method363(var7, var9, 130);
                this.method363(var7 - 1, var9, 8);
                this.method363(var7, var9 + 1, 32);
            }
            if (arg3 == 1) {
                this.method363(var7, var9, 10);
                this.method363(var7, var9 + 1, 32);
                this.method363(var7 + 1, var9, 128);
            }
            if (arg3 == 2) {
                this.method363(var7, var9, 40);
                this.method363(var7 + 1, var9, 128);
                this.method363(var7, var9 - 1, 2);
            }
            if (arg3 == 3) {
                this.method363(var7, var9, 160);
                this.method363(var7, var9 - 1, 2);
                this.method363(var7 - 1, var9, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method363(var7, var9, 65536);
                this.method363(var7 - 1, var9, 4096);
            }
            if (arg3 == 1) {
                this.method363(var7, var9, 1024);
                this.method363(var7, var9 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method363(var7, var9, 4096);
                this.method363(var7 + 1, var9, 65536);
            }
            if (arg3 == 3) {
                this.method363(var7, var9, 16384);
                this.method363(var7, var9 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method363(var7, var9, 512);
                this.method363(var7 - 1, var9 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method363(var7, var9, 2048);
                this.method363(var7 + 1, var9 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method363(var7, var9, 8192);
                this.method363(var7 + 1, var9 - 1, 512);
            }
            if (arg3 == 3) {
                this.method363(var7, var9, 32768);
                this.method363(var7 - 1, var9 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method363(var7, var9, 66560);
            this.method363(var7 - 1, var9, 4096);
            this.method363(var7, var9 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method363(var7, var9, 5120);
            this.method363(var7, var9 + 1, 16384);
            this.method363(var7 + 1, var9, 65536);
        }
        if (arg3 == 2) {
            this.method363(var7, var9, 20480);
            this.method363(var7 + 1, var9, 65536);
            this.method363(var7, var9 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method363(var7, var9, 81920);
            this.method363(var7, var9 - 1, 1024);
            this.method363(var7 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIZIZI)V")
    public void method361(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1099;
        int var10 = arg1 - this.field1100;
        if (arg5) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg0;
            arg0 = arg2;
            arg2 = var12;
        }
        for (int var13 = var9; var13 < arg0 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1101) {
                for (int var14 = var10; var14 < arg2 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field1102) {
                        this.method363(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZI)V")
    public void method362(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field1099;
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = arg2 - this.field1100;
        this.field1103[var4][var6] |= 0x200000;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1103[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIII)V")
    public void method364(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field1099;
        int var8 = arg0 - this.field1100;
        if (arg3 <= 0) {
            this.field1095 = !this.field1095;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method366(128, 722, var8, var7);
                this.method366(8, 722, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method366(2, 722, var8, var7);
                this.method366(32, 722, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method366(8, 722, var8, var7);
                this.method366(128, 722, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method366(32, 722, var8, var7);
                this.method366(2, 722, var8 - 1, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method366(1, 722, var8, var7);
                this.method366(16, 722, var8 + 1, var7 - 1);
            }
            if (arg4 == 1) {
                this.method366(4, 722, var8, var7);
                this.method366(64, 722, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method366(16, 722, var8, var7);
                this.method366(1, 722, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method366(64, 722, var8, var7);
                this.method366(4, 722, var8 - 1, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method366(130, 722, var8, var7);
                this.method366(8, 722, var8, var7 - 1);
                this.method366(32, 722, var8 + 1, var7);
            }
            if (arg4 == 1) {
                this.method366(10, 722, var8, var7);
                this.method366(32, 722, var8 + 1, var7);
                this.method366(128, 722, var8, var7 + 1);
            }
            if (arg4 == 2) {
                this.method366(40, 722, var8, var7);
                this.method366(128, 722, var8, var7 + 1);
                this.method366(2, 722, var8 - 1, var7);
            }
            if (arg4 == 3) {
                this.method366(160, 722, var8, var7);
                this.method366(2, 722, var8 - 1, var7);
                this.method366(8, 722, var8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method366(65536, 722, var8, var7);
                this.method366(4096, 722, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method366(1024, 722, var8, var7);
                this.method366(16384, 722, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method366(4096, 722, var8, var7);
                this.method366(65536, 722, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method366(16384, 722, var8, var7);
                this.method366(1024, 722, var8 - 1, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method366(512, 722, var8, var7);
                this.method366(8192, 722, var8 + 1, var7 - 1);
            }
            if (arg4 == 1) {
                this.method366(2048, 722, var8, var7);
                this.method366(32768, 722, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method366(8192, 722, var8, var7);
                this.method366(512, 722, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method366(32768, 722, var8, var7);
                this.method366(2048, 722, var8 - 1, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method366(66560, 722, var8, var7);
            this.method366(4096, 722, var8, var7 - 1);
            this.method366(16384, 722, var8 + 1, var7);
        }
        if (arg4 == 1) {
            this.method366(5120, 722, var8, var7);
            this.method366(16384, 722, var8 + 1, var7);
            this.method366(65536, 722, var8, var7 + 1);
        }
        if (arg4 == 2) {
            this.method366(20480, 722, var8, var7);
            this.method366(65536, 722, var8, var7 + 1);
            this.method366(1024, 722, var8 - 1, var7);
        }
        if (arg4 == 3) {
            this.method366(81920, 722, var8, var7);
            this.method366(1024, 722, var8 - 1, var7);
            this.method366(4096, 722, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZI)V")
    public void method365(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg2 != -49110) {
            return;
        }
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1099;
        int var10 = arg6 - this.field1100;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg3;
            arg3 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1101) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1102) {
                        this.method366(var8, 722, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method366(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 46 / arg1;
        this.field1103[arg3][arg2] &= 16777215 - arg0;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    public void method367(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1099;
        if (arg0 > 0) {
            int var5 = arg1 - this.field1100;
            this.field1103[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 6) {
            this.field1096 = !this.field1096;
        }
        if (arg3 == arg6 && arg1 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field1099;
        int var9 = arg1 - this.field1100;
        int var10 = arg6 - this.field1099;
        int var11 = arg5 - this.field1100;
        if (arg2 == 0) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIBIIII)Z")
    public boolean method369(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg6 && arg0 == arg5) {
            return true;
        }
        int var8 = arg6 - this.field1099;
        int var9 = arg0 - this.field1100;
        int var10 = arg3 - this.field1099;
        if (arg2 != -94) {
            throw new NullPointerException();
        }
        int var11 = arg5 - this.field1100;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1103[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1103[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1103[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 + arg6 - 1;
        int var10 = arg3 + arg5 - 1;
        int var11 = 92 / arg1;
        if (arg4 >= arg2 && arg4 <= var9 && arg7 >= arg3 && arg7 <= var10) {
            return true;
        } else if (arg2 - 1 == arg4 && arg7 >= arg3 && arg7 <= var10 && (this.field1103[arg4 - this.field1099][arg7 - this.field1100] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg7 >= arg3 && arg7 <= var10 && (this.field1103[arg4 - this.field1099][arg7 - this.field1100] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg7 && arg4 >= arg2 && arg4 <= var9 && (this.field1103[arg4 - this.field1099][arg7 - this.field1100] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg4 >= arg2 && arg4 <= var9 && (this.field1103[arg4 - this.field1099][arg7 - this.field1100] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
