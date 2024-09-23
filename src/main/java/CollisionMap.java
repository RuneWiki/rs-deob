import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1098 = false;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private boolean field1099 = false;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1100 = 707;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1101 = 1727;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1102 = -30133;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    private int field1103 = -47208;

    @OriginalMember(owner = "jc", name = "g", descriptor = "Z")
    private boolean field1104 = true;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1105 = 0;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1106 = 0;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "jc", name = "l", descriptor = "[[I")
    public int[][] field1109;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(ZII)V")
    public CollisionMap(boolean arg0, int arg1, int arg2) {
        this.field1107 = arg1;
        this.field1108 = arg2;
        this.field1109 = new int[this.field1107][this.field1108];
        this.method359(3);
        if (!arg0) {
            this.field1100 = 97;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method359(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field1099 = !this.field1099;
        }
        for (int var2 = 0; var2 < this.field1107; var2++) {
            for (int var3 = 0; var3 < this.field1108; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1107 - 1 == var2 || this.field1108 - 1 == var3) {
                    this.field1109[var2][var3] = 16777215;
                } else {
                    this.field1109[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIII)V")
    public void method360(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field1105;
        if (this.field1101 != arg0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg5 - this.field1106;
        if (arg4 == 0) {
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
        if (arg4 == 1 || arg4 == 3) {
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
        if (arg4 == 2) {
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
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
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
        if (arg4 == 1 || arg4 == 3) {
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
        if (arg4 != 2) {
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

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIZII)V")
    public void method361(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field1105;
        int var10 = arg1 - this.field1106;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg5;
            arg5 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1107) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1108) {
                        this.method363(var12, var13, var8);
                    }
                }
            }
        }
        if (arg4) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    public void method362(int arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            int var4 = arg0 - this.field1105;
            int var5 = arg1 - this.field1106;
            this.field1109[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1109[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZI)V")
    public void method364(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg5 - this.field1105;
        int var8 = arg3 - this.field1106;
        if (arg1 <= 0) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method366(var7, var8, -30133, 128);
                this.method366(var7 - 1, var8, -30133, 8);
            }
            if (arg2 == 1) {
                this.method366(var7, var8, -30133, 2);
                this.method366(var7, var8 + 1, -30133, 32);
            }
            if (arg2 == 2) {
                this.method366(var7, var8, -30133, 8);
                this.method366(var7 + 1, var8, -30133, 128);
            }
            if (arg2 == 3) {
                this.method366(var7, var8, -30133, 32);
                this.method366(var7, var8 - 1, -30133, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method366(var7, var8, -30133, 1);
                this.method366(var7 - 1, var8 + 1, -30133, 16);
            }
            if (arg2 == 1) {
                this.method366(var7, var8, -30133, 4);
                this.method366(var7 + 1, var8 + 1, -30133, 64);
            }
            if (arg2 == 2) {
                this.method366(var7, var8, -30133, 16);
                this.method366(var7 + 1, var8 - 1, -30133, 1);
            }
            if (arg2 == 3) {
                this.method366(var7, var8, -30133, 64);
                this.method366(var7 - 1, var8 - 1, -30133, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method366(var7, var8, -30133, 130);
                this.method366(var7 - 1, var8, -30133, 8);
                this.method366(var7, var8 + 1, -30133, 32);
            }
            if (arg2 == 1) {
                this.method366(var7, var8, -30133, 10);
                this.method366(var7, var8 + 1, -30133, 32);
                this.method366(var7 + 1, var8, -30133, 128);
            }
            if (arg2 == 2) {
                this.method366(var7, var8, -30133, 40);
                this.method366(var7 + 1, var8, -30133, 128);
                this.method366(var7, var8 - 1, -30133, 2);
            }
            if (arg2 == 3) {
                this.method366(var7, var8, -30133, 160);
                this.method366(var7, var8 - 1, -30133, 2);
                this.method366(var7 - 1, var8, -30133, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method366(var7, var8, -30133, 65536);
                this.method366(var7 - 1, var8, -30133, 4096);
            }
            if (arg2 == 1) {
                this.method366(var7, var8, -30133, 1024);
                this.method366(var7, var8 + 1, -30133, 16384);
            }
            if (arg2 == 2) {
                this.method366(var7, var8, -30133, 4096);
                this.method366(var7 + 1, var8, -30133, 65536);
            }
            if (arg2 == 3) {
                this.method366(var7, var8, -30133, 16384);
                this.method366(var7, var8 - 1, -30133, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method366(var7, var8, -30133, 512);
                this.method366(var7 - 1, var8 + 1, -30133, 8192);
            }
            if (arg2 == 1) {
                this.method366(var7, var8, -30133, 2048);
                this.method366(var7 + 1, var8 + 1, -30133, 32768);
            }
            if (arg2 == 2) {
                this.method366(var7, var8, -30133, 8192);
                this.method366(var7 + 1, var8 - 1, -30133, 512);
            }
            if (arg2 == 3) {
                this.method366(var7, var8, -30133, 32768);
                this.method366(var7 - 1, var8 - 1, -30133, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method366(var7, var8, -30133, 66560);
            this.method366(var7 - 1, var8, -30133, 4096);
            this.method366(var7, var8 + 1, -30133, 16384);
        }
        if (arg2 == 1) {
            this.method366(var7, var8, -30133, 5120);
            this.method366(var7, var8 + 1, -30133, 16384);
            this.method366(var7 + 1, var8, -30133, 65536);
        }
        if (arg2 == 2) {
            this.method366(var7, var8, -30133, 20480);
            this.method366(var7 + 1, var8, -30133, 65536);
            this.method366(var7, var8 - 1, -30133, 1024);
        }
        if (arg2 == 3) {
            this.method366(var7, var8, -30133, 81920);
            this.method366(var7, var8 - 1, -30133, 1024);
            this.method366(var7 - 1, var8, -30133, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZBIIII)V")
    public void method365(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2 == 4) {
            boolean var9 = false;
        } else {
            this.field1099 = !this.field1099;
        }
        if (arg1) {
            var8 += 131072;
        }
        int var10 = arg4 - this.field1105;
        int var11 = arg5 - this.field1106;
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg0;
            arg0 = arg6;
            arg6 = var12;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1107) {
                for (int var14 = var11; var14 < arg6 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1108) {
                        this.method366(var13, var14, -30133, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method366(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1102 == arg2) {
            this.field1109[arg0][arg1] &= 16777215 - arg3;
        }
    }

    @OriginalMember(owner = "jc", name = "c", descriptor = "(III)V")
    public void method367(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1105;
        int var5 = arg2 - this.field1106;
        if (arg1 != -5814) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1109[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg4 && arg1 == arg5) {
            return true;
        }
        int var8 = arg2 - this.field1105;
        int var9 = arg1 - this.field1106;
        if (this.field1103 != arg0) {
            throw new NullPointerException();
        }
        int var10 = arg4 - this.field1105;
        int var11 = arg5 - this.field1106;
        if (arg6 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg1 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field1105;
        int var9 = arg4 - this.field1106;
        int var10 = arg3 - this.field1105;
        int var11 = arg1 - this.field1106;
        if (arg6 != 0) {
            this.field1098 = !this.field1098;
        }
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1109[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1109[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1109[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg2 + arg7 - 1;
        int var11 = arg0 + arg3 - 1;
        if (arg5 >= arg7 && arg5 <= var10 && arg4 >= arg0 && arg4 <= var11) {
            return true;
        } else if (arg7 - 1 == arg5 && arg4 >= arg0 && arg4 <= var11 && (this.field1109[arg5 - this.field1105][arg4 - this.field1106] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg4 >= arg0 && arg4 <= var11 && (this.field1109[arg5 - this.field1105][arg4 - this.field1106] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg4 && arg5 >= arg7 && arg5 <= var10 && (this.field1109[arg5 - this.field1105][arg4 - this.field1106] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg5 >= arg7 && arg5 <= var10 && (this.field1109[arg5 - this.field1105][arg4 - this.field1106] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
