import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private int field1098 = 1;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1099 = 5100;

    @OriginalMember(owner = "jc", name = "c", descriptor = "Z")
    private boolean field1100 = true;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1101 = 8;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1102 = 475;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    private int field1103 = 7;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    private int field1104 = 591;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    private int field1105 = 616;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1106 = 0;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "jc", name = "m", descriptor = "[[I")
    public int[][] field1110;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(IZI)V")
    public CollisionMap(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            throw new NullPointerException();
        }
        this.field1107 = 0;
        this.field1108 = arg2;
        this.field1109 = arg0;
        this.field1110 = new int[this.field1108][this.field1109];
        this.method361(this.field1101);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method361(int arg0) {
        if (arg0 < this.field1101 || arg0 > this.field1101) {
            this.field1099 = 379;
        }
        for (int var2 = 0; var2 < this.field1108; var2++) {
            for (int var3 = 0; var3 < this.field1109; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1108 - 1 == var2 || this.field1109 - 1 == var3) {
                    this.field1110[var2][var3] = 16777215;
                } else {
                    this.field1110[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIII)V")
    public void method362(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field1106;
        int var8 = arg0 - this.field1107;
        if (arg4 <= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method365(var7, var8, 128);
                this.method365(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method365(var7, var8, 2);
                this.method365(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method365(var7, var8, 8);
                this.method365(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method365(var7, var8, 32);
                this.method365(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method365(var7, var8, 1);
                this.method365(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method365(var7, var8, 4);
                this.method365(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method365(var7, var8, 16);
                this.method365(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method365(var7, var8, 64);
                this.method365(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method365(var7, var8, 130);
                this.method365(var7 - 1, var8, 8);
                this.method365(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method365(var7, var8, 10);
                this.method365(var7, var8 + 1, 32);
                this.method365(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method365(var7, var8, 40);
                this.method365(var7 + 1, var8, 128);
                this.method365(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method365(var7, var8, 160);
                this.method365(var7, var8 - 1, 2);
                this.method365(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method365(var7, var8, 65536);
                this.method365(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method365(var7, var8, 1024);
                this.method365(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method365(var7, var8, 4096);
                this.method365(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method365(var7, var8, 16384);
                this.method365(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method365(var7, var8, 512);
                this.method365(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method365(var7, var8, 2048);
                this.method365(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method365(var7, var8, 8192);
                this.method365(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method365(var7, var8, 32768);
                this.method365(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method365(var7, var8, 66560);
            this.method365(var7 - 1, var8, 4096);
            this.method365(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method365(var7, var8, 5120);
            this.method365(var7, var8 + 1, 16384);
            this.method365(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method365(var7, var8, 20480);
            this.method365(var7 + 1, var8, 65536);
            this.method365(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method365(var7, var8, 81920);
            this.method365(var7, var8 - 1, 1024);
            this.method365(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZI)V")
    public void method363(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg1 != 0) {
            this.field1100 = !this.field1100;
        }
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1106;
        int var10 = arg2 - this.field1107;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg4;
            arg4 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1108) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1109) {
                        this.method365(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    public void method364(int arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            this.field1102 = -217;
        }
        int var4 = arg1 - this.field1106;
        int var5 = arg0 - this.field1107;
        this.field1110[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    private void method365(int arg0, int arg1, int arg2) {
        this.field1110[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IBIIZI)V")
    public void method366(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field1106;
        int var8 = arg2 - this.field1107;
        if (arg1 != 119) {
            this.field1100 = !this.field1100;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method368(var8, this.field1105, 128, var7);
                this.method368(var8, this.field1105, 8, var7 - 1);
            }
            if (arg3 == 1) {
                this.method368(var8, this.field1105, 2, var7);
                this.method368(var8 + 1, this.field1105, 32, var7);
            }
            if (arg3 == 2) {
                this.method368(var8, this.field1105, 8, var7);
                this.method368(var8, this.field1105, 128, var7 + 1);
            }
            if (arg3 == 3) {
                this.method368(var8, this.field1105, 32, var7);
                this.method368(var8 - 1, this.field1105, 2, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method368(var8, this.field1105, 1, var7);
                this.method368(var8 + 1, this.field1105, 16, var7 - 1);
            }
            if (arg3 == 1) {
                this.method368(var8, this.field1105, 4, var7);
                this.method368(var8 + 1, this.field1105, 64, var7 + 1);
            }
            if (arg3 == 2) {
                this.method368(var8, this.field1105, 16, var7);
                this.method368(var8 - 1, this.field1105, 1, var7 + 1);
            }
            if (arg3 == 3) {
                this.method368(var8, this.field1105, 64, var7);
                this.method368(var8 - 1, this.field1105, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method368(var8, this.field1105, 130, var7);
                this.method368(var8, this.field1105, 8, var7 - 1);
                this.method368(var8 + 1, this.field1105, 32, var7);
            }
            if (arg3 == 1) {
                this.method368(var8, this.field1105, 10, var7);
                this.method368(var8 + 1, this.field1105, 32, var7);
                this.method368(var8, this.field1105, 128, var7 + 1);
            }
            if (arg3 == 2) {
                this.method368(var8, this.field1105, 40, var7);
                this.method368(var8, this.field1105, 128, var7 + 1);
                this.method368(var8 - 1, this.field1105, 2, var7);
            }
            if (arg3 == 3) {
                this.method368(var8, this.field1105, 160, var7);
                this.method368(var8 - 1, this.field1105, 2, var7);
                this.method368(var8, this.field1105, 8, var7 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method368(var8, this.field1105, 65536, var7);
                this.method368(var8, this.field1105, 4096, var7 - 1);
            }
            if (arg3 == 1) {
                this.method368(var8, this.field1105, 1024, var7);
                this.method368(var8 + 1, this.field1105, 16384, var7);
            }
            if (arg3 == 2) {
                this.method368(var8, this.field1105, 4096, var7);
                this.method368(var8, this.field1105, 65536, var7 + 1);
            }
            if (arg3 == 3) {
                this.method368(var8, this.field1105, 16384, var7);
                this.method368(var8 - 1, this.field1105, 1024, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method368(var8, this.field1105, 512, var7);
                this.method368(var8 + 1, this.field1105, 8192, var7 - 1);
            }
            if (arg3 == 1) {
                this.method368(var8, this.field1105, 2048, var7);
                this.method368(var8 + 1, this.field1105, 32768, var7 + 1);
            }
            if (arg3 == 2) {
                this.method368(var8, this.field1105, 8192, var7);
                this.method368(var8 - 1, this.field1105, 512, var7 + 1);
            }
            if (arg3 == 3) {
                this.method368(var8, this.field1105, 32768, var7);
                this.method368(var8 - 1, this.field1105, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method368(var8, this.field1105, 66560, var7);
            this.method368(var8, this.field1105, 4096, var7 - 1);
            this.method368(var8 + 1, this.field1105, 16384, var7);
        }
        if (arg3 == 1) {
            this.method368(var8, this.field1105, 5120, var7);
            this.method368(var8 + 1, this.field1105, 16384, var7);
            this.method368(var8, this.field1105, 65536, var7 + 1);
        }
        if (arg3 == 2) {
            this.method368(var8, this.field1105, 20480, var7);
            this.method368(var8, this.field1105, 65536, var7 + 1);
            this.method368(var8 - 1, this.field1105, 1024, var7);
        }
        if (arg3 == 3) {
            this.method368(var8, this.field1105, 81920, var7);
            this.method368(var8 - 1, this.field1105, 1024, var7);
            this.method368(var8, this.field1105, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIIII)V")
    public void method367(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 85 / arg3;
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        int var10 = arg2 - this.field1106;
        int var11 = arg4 - this.field1107;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg0;
            arg0 = arg6;
            arg6 = var12;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1108) {
                for (int var14 = var11; var14 < arg6 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1109) {
                        this.method368(var14, this.field1105, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method368(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 10 / arg1;
        this.field1110[arg3][arg0] &= 16777215 - arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIB)V")
    public void method369(int arg0, int arg1, byte arg2) {
        if (arg2 != -51) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1 - this.field1106;
        int var6 = arg0 - this.field1107;
        this.field1110[var5][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIBIII)Z")
    public boolean method370(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field1106;
        if (arg3 != 1) {
            this.field1102 = 176;
        }
        int var9 = arg4 - this.field1107;
        int var10 = arg1 - this.field1106;
        int var11 = arg2 - this.field1107;
        if (arg0 == 0) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg5 && arg3 == arg6) {
            return true;
        }
        int var8 = arg5 - this.field1106;
        int var9 = arg3 - this.field1107;
        int var10 = arg0 - this.field1106;
        int var11 = arg6 - this.field1107;
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1110[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1110[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1110[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZII)Z")
    public boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            throw new NullPointerException();
        }
        int var9 = arg1 + arg2 - 1;
        int var10 = arg0 + arg3 - 1;
        if (arg7 >= arg1 && arg7 <= var9 && arg4 >= arg3 && arg4 <= var10) {
            return true;
        } else if (arg1 - 1 == arg7 && arg4 >= arg3 && arg4 <= var10 && (this.field1110[arg7 - this.field1106][arg4 - this.field1107] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg4 >= arg3 && arg4 <= var10 && (this.field1110[arg7 - this.field1106][arg4 - this.field1107] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg4 && arg7 >= arg1 && arg7 <= var9 && (this.field1110[arg7 - this.field1106][arg4 - this.field1107] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg4 && arg7 >= arg1 && arg7 <= var9 && (this.field1110[arg7 - this.field1106][arg4 - this.field1107] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
