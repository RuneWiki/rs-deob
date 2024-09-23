import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1089 = false;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1090 = 4;

    @OriginalMember(owner = "jc", name = "c", descriptor = "Z")
    private boolean field1091 = false;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1092 = 25762;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1093 = 4;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1094 = 0;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1095 = 0;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[[I")
    public int[][] field1098;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            this.field1090 = -421;
        }
        this.field1096 = arg1;
        this.field1097 = arg2;
        this.field1098 = new int[this.field1096][this.field1097];
        this.method359(25762);
        if (Linkable.field364) {
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method359(int arg0) {
        for (int var2 = 0; var2 < this.field1096; var2++) {
            for (int var3 = 0; var3 < this.field1097; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1096 - 1 == var2 || this.field1097 - 1 == var3) {
                    this.field1098[var2][var3] = 16777215;
                } else {
                    this.field1098[var2][var3] = 0;
                }
            }
        }
        if (this.field1092 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIII)V")
    public void method360(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1094;
        if (arg2 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg4 - this.field1095;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method363(var7, var9, 128);
                this.method363(var7 - 1, var9, 8);
            }
            if (arg5 == 1) {
                this.method363(var7, var9, 2);
                this.method363(var7, var9 + 1, 32);
            }
            if (arg5 == 2) {
                this.method363(var7, var9, 8);
                this.method363(var7 + 1, var9, 128);
            }
            if (arg5 == 3) {
                this.method363(var7, var9, 32);
                this.method363(var7, var9 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method363(var7, var9, 1);
                this.method363(var7 - 1, var9 + 1, 16);
            }
            if (arg5 == 1) {
                this.method363(var7, var9, 4);
                this.method363(var7 + 1, var9 + 1, 64);
            }
            if (arg5 == 2) {
                this.method363(var7, var9, 16);
                this.method363(var7 + 1, var9 - 1, 1);
            }
            if (arg5 == 3) {
                this.method363(var7, var9, 64);
                this.method363(var7 - 1, var9 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method363(var7, var9, 130);
                this.method363(var7 - 1, var9, 8);
                this.method363(var7, var9 + 1, 32);
            }
            if (arg5 == 1) {
                this.method363(var7, var9, 10);
                this.method363(var7, var9 + 1, 32);
                this.method363(var7 + 1, var9, 128);
            }
            if (arg5 == 2) {
                this.method363(var7, var9, 40);
                this.method363(var7 + 1, var9, 128);
                this.method363(var7, var9 - 1, 2);
            }
            if (arg5 == 3) {
                this.method363(var7, var9, 160);
                this.method363(var7, var9 - 1, 2);
                this.method363(var7 - 1, var9, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method363(var7, var9, 65536);
                this.method363(var7 - 1, var9, 4096);
            }
            if (arg5 == 1) {
                this.method363(var7, var9, 1024);
                this.method363(var7, var9 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method363(var7, var9, 4096);
                this.method363(var7 + 1, var9, 65536);
            }
            if (arg5 == 3) {
                this.method363(var7, var9, 16384);
                this.method363(var7, var9 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method363(var7, var9, 512);
                this.method363(var7 - 1, var9 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method363(var7, var9, 2048);
                this.method363(var7 + 1, var9 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method363(var7, var9, 8192);
                this.method363(var7 + 1, var9 - 1, 512);
            }
            if (arg5 == 3) {
                this.method363(var7, var9, 32768);
                this.method363(var7 - 1, var9 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method363(var7, var9, 66560);
            this.method363(var7 - 1, var9, 4096);
            this.method363(var7, var9 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method363(var7, var9, 5120);
            this.method363(var7, var9 + 1, 16384);
            this.method363(var7 + 1, var9, 65536);
        }
        if (arg5 == 2) {
            this.method363(var7, var9, 20480);
            this.method363(var7 + 1, var9, 65536);
            this.method363(var7, var9 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method363(var7, var9, 81920);
            this.method363(var7, var9 - 1, 1024);
            this.method363(var7 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIIII)V")
    public void method361(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1094;
        int var10 = arg3 - this.field1095;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg4;
            arg4 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1096) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1097) {
                        this.method363(var12, var13, var8);
                    }
                }
            }
        }
        if (arg5 != 6) {
            this.field1089 = !this.field1089;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    public void method362(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1094;
        int var5 = arg0 - this.field1095;
        this.field1098[var4][var5] |= 0x200000;
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1098[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIZIII)V")
    public void method364(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return;
        }
        int var7 = arg5 - this.field1094;
        int var8 = arg3 - this.field1095;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method366(920, var8, var7, 128);
                this.method366(920, var8, var7 - 1, 8);
            }
            if (arg1 == 1) {
                this.method366(920, var8, var7, 2);
                this.method366(920, var8 + 1, var7, 32);
            }
            if (arg1 == 2) {
                this.method366(920, var8, var7, 8);
                this.method366(920, var8, var7 + 1, 128);
            }
            if (arg1 == 3) {
                this.method366(920, var8, var7, 32);
                this.method366(920, var8 - 1, var7, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method366(920, var8, var7, 1);
                this.method366(920, var8 + 1, var7 - 1, 16);
            }
            if (arg1 == 1) {
                this.method366(920, var8, var7, 4);
                this.method366(920, var8 + 1, var7 + 1, 64);
            }
            if (arg1 == 2) {
                this.method366(920, var8, var7, 16);
                this.method366(920, var8 - 1, var7 + 1, 1);
            }
            if (arg1 == 3) {
                this.method366(920, var8, var7, 64);
                this.method366(920, var8 - 1, var7 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method366(920, var8, var7, 130);
                this.method366(920, var8, var7 - 1, 8);
                this.method366(920, var8 + 1, var7, 32);
            }
            if (arg1 == 1) {
                this.method366(920, var8, var7, 10);
                this.method366(920, var8 + 1, var7, 32);
                this.method366(920, var8, var7 + 1, 128);
            }
            if (arg1 == 2) {
                this.method366(920, var8, var7, 40);
                this.method366(920, var8, var7 + 1, 128);
                this.method366(920, var8 - 1, var7, 2);
            }
            if (arg1 == 3) {
                this.method366(920, var8, var7, 160);
                this.method366(920, var8 - 1, var7, 2);
                this.method366(920, var8, var7 - 1, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method366(920, var8, var7, 65536);
                this.method366(920, var8, var7 - 1, 4096);
            }
            if (arg1 == 1) {
                this.method366(920, var8, var7, 1024);
                this.method366(920, var8 + 1, var7, 16384);
            }
            if (arg1 == 2) {
                this.method366(920, var8, var7, 4096);
                this.method366(920, var8, var7 + 1, 65536);
            }
            if (arg1 == 3) {
                this.method366(920, var8, var7, 16384);
                this.method366(920, var8 - 1, var7, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method366(920, var8, var7, 512);
                this.method366(920, var8 + 1, var7 - 1, 8192);
            }
            if (arg1 == 1) {
                this.method366(920, var8, var7, 2048);
                this.method366(920, var8 + 1, var7 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method366(920, var8, var7, 8192);
                this.method366(920, var8 - 1, var7 + 1, 512);
            }
            if (arg1 == 3) {
                this.method366(920, var8, var7, 32768);
                this.method366(920, var8 - 1, var7 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method366(920, var8, var7, 66560);
            this.method366(920, var8, var7 - 1, 4096);
            this.method366(920, var8 + 1, var7, 16384);
        }
        if (arg1 == 1) {
            this.method366(920, var8, var7, 5120);
            this.method366(920, var8 + 1, var7, 16384);
            this.method366(920, var8, var7 + 1, 65536);
        }
        if (arg1 == 2) {
            this.method366(920, var8, var7, 20480);
            this.method366(920, var8, var7 + 1, 65536);
            this.method366(920, var8 - 1, var7, 1024);
        }
        if (arg1 == 3) {
            this.method366(920, var8, var7, 81920);
            this.method366(920, var8 - 1, var7, 1024);
            this.method366(920, var8, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIIII)V")
    public void method365(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3 != 0) {
            return;
        }
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1094;
        int var10 = arg5 - this.field1095;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1096) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1097) {
                        this.method366(920, var13, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method366(int arg0, int arg1, int arg2, int arg3) {
        this.field1098[arg2][arg1] &= 16777215 - arg3;
        if (arg0 <= 0) {
            this.field1090 = -199;
        }
    }

    @OriginalMember(owner = "jc", name = "c", descriptor = "(III)V")
    public void method367(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1094;
        int var5 = arg2 - this.field1095;
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1098[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIBIII)Z")
    public boolean method368(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -84) {
            throw new NullPointerException();
        } else if (arg2 == arg6 && arg1 == arg5) {
            return true;
        } else {
            int var8 = arg6 - this.field1094;
            int var9 = arg5 - this.field1095;
            int var10 = arg2 - this.field1094;
            int var11 = arg1 - this.field1095;
            if (arg4 == 0) {
                if (arg0 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 >= 0) {
            throw new NullPointerException();
        } else if (arg3 == arg5 && arg1 == arg2) {
            return true;
        } else {
            int var8 = arg5 - this.field1094;
            int var9 = arg1 - this.field1095;
            int var10 = arg3 - this.field1094;
            int var11 = arg2 - this.field1095;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field1098[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1098[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1098[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIBIIIII)Z")
    public boolean method370(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -30) {
            throw new NullPointerException();
        }
        int var9 = arg1 + arg7 - 1;
        int var10 = arg0 + arg4 - 1;
        if (arg5 >= arg1 && arg5 <= var9 && arg6 >= arg4 && arg6 <= var10) {
            return true;
        } else if (arg1 - 1 == arg5 && arg6 >= arg4 && arg6 <= var10 && (this.field1098[arg5 - this.field1094][arg6 - this.field1095] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg6 >= arg4 && arg6 <= var10 && (this.field1098[arg5 - this.field1094][arg6 - this.field1095] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg6 && arg5 >= arg1 && arg5 <= var9 && (this.field1098[arg5 - this.field1094][arg6 - this.field1095] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg5 >= arg1 && arg5 <= var9 && (this.field1098[arg5 - this.field1094][arg6 - this.field1095] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
