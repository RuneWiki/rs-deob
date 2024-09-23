import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private int field1094 = -550;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1097 = 8;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1098 = 70;

    @OriginalMember(owner = "jc", name = "f", descriptor = "B")
    private byte field1099 = 99;

    @OriginalMember(owner = "jc", name = "g", descriptor = "Z")
    private boolean field1100 = true;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    private int field1101 = 1;

    @OriginalMember(owner = "jc", name = "i", descriptor = "Z")
    private boolean field1102 = true;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1103 = 0;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1104 = 0;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "jc", name = "n", descriptor = "[[I")
    public int[][] field1107;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        this.field1105 = arg2;
        this.field1106 = arg1;
        this.field1107 = new int[this.field1105][this.field1106];
        int var4 = 13 / arg0;
        this.method355(3);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method355(int arg0) {
        for (int var2 = 0; var2 < this.field1105; var2++) {
            for (int var3 = 0; var3 < this.field1106; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1105 - 1 == var2 || this.field1106 - 1 == var3) {
                    this.field1107[var2][var3] = 16777215;
                } else {
                    this.field1107[var2][var3] = 0;
                }
            }
        }
        if (arg0 < 3 || arg0 > 3) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIZIII)V")
    public void method356(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1103;
        int var8 = arg5 - this.field1104;
        if (!arg0) {
            this.field1098 = -69;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method359(var7, var8, 128);
                this.method359(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method359(var7, var8, 2);
                this.method359(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method359(var7, var8, 8);
                this.method359(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method359(var7, var8, 32);
                this.method359(var7, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method359(var7, var8, 1);
                this.method359(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method359(var7, var8, 4);
                this.method359(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method359(var7, var8, 16);
                this.method359(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method359(var7, var8, 64);
                this.method359(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method359(var7, var8, 130);
                this.method359(var7 - 1, var8, 8);
                this.method359(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method359(var7, var8, 10);
                this.method359(var7, var8 + 1, 32);
                this.method359(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method359(var7, var8, 40);
                this.method359(var7 + 1, var8, 128);
                this.method359(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method359(var7, var8, 160);
                this.method359(var7, var8 - 1, 2);
                this.method359(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method359(var7, var8, 65536);
                this.method359(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method359(var7, var8, 1024);
                this.method359(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method359(var7, var8, 4096);
                this.method359(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method359(var7, var8, 16384);
                this.method359(var7, var8 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method359(var7, var8, 512);
                this.method359(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method359(var7, var8, 2048);
                this.method359(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method359(var7, var8, 8192);
                this.method359(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method359(var7, var8, 32768);
                this.method359(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method359(var7, var8, 66560);
            this.method359(var7 - 1, var8, 4096);
            this.method359(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method359(var7, var8, 5120);
            this.method359(var7, var8 + 1, 16384);
            this.method359(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method359(var7, var8, 20480);
            this.method359(var7 + 1, var8, 65536);
            this.method359(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method359(var7, var8, 81920);
            this.method359(var7, var8 - 1, 1024);
            this.method359(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIIII)V")
    public void method357(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1103;
        int var10 = arg0 - this.field1104;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg1;
            arg1 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1105) {
                for (int var14 = var10; var14 < arg5 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field1106) {
                        this.method359(var12, var14, var8);
                    }
                }
            }
        }
        if (arg3 != -24520) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IBI)V")
    public void method358(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field1103;
        if (arg1 == 0) {
            int var5 = arg2 - this.field1104;
            this.field1107[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method359(int arg0, int arg1, int arg2) {
        this.field1107[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZB)V")
    public void method360(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg3 - this.field1103;
        if (arg5 != 3) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg2 - this.field1104;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method362(var7, var9, 0, 128);
                this.method362(var7 - 1, var9, 0, 8);
            }
            if (arg0 == 1) {
                this.method362(var7, var9, 0, 2);
                this.method362(var7, var9 + 1, 0, 32);
            }
            if (arg0 == 2) {
                this.method362(var7, var9, 0, 8);
                this.method362(var7 + 1, var9, 0, 128);
            }
            if (arg0 == 3) {
                this.method362(var7, var9, 0, 32);
                this.method362(var7, var9 - 1, 0, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method362(var7, var9, 0, 1);
                this.method362(var7 - 1, var9 + 1, 0, 16);
            }
            if (arg0 == 1) {
                this.method362(var7, var9, 0, 4);
                this.method362(var7 + 1, var9 + 1, 0, 64);
            }
            if (arg0 == 2) {
                this.method362(var7, var9, 0, 16);
                this.method362(var7 + 1, var9 - 1, 0, 1);
            }
            if (arg0 == 3) {
                this.method362(var7, var9, 0, 64);
                this.method362(var7 - 1, var9 - 1, 0, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method362(var7, var9, 0, 130);
                this.method362(var7 - 1, var9, 0, 8);
                this.method362(var7, var9 + 1, 0, 32);
            }
            if (arg0 == 1) {
                this.method362(var7, var9, 0, 10);
                this.method362(var7, var9 + 1, 0, 32);
                this.method362(var7 + 1, var9, 0, 128);
            }
            if (arg0 == 2) {
                this.method362(var7, var9, 0, 40);
                this.method362(var7 + 1, var9, 0, 128);
                this.method362(var7, var9 - 1, 0, 2);
            }
            if (arg0 == 3) {
                this.method362(var7, var9, 0, 160);
                this.method362(var7, var9 - 1, 0, 2);
                this.method362(var7 - 1, var9, 0, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method362(var7, var9, 0, 65536);
                this.method362(var7 - 1, var9, 0, 4096);
            }
            if (arg0 == 1) {
                this.method362(var7, var9, 0, 1024);
                this.method362(var7, var9 + 1, 0, 16384);
            }
            if (arg0 == 2) {
                this.method362(var7, var9, 0, 4096);
                this.method362(var7 + 1, var9, 0, 65536);
            }
            if (arg0 == 3) {
                this.method362(var7, var9, 0, 16384);
                this.method362(var7, var9 - 1, 0, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method362(var7, var9, 0, 512);
                this.method362(var7 - 1, var9 + 1, 0, 8192);
            }
            if (arg0 == 1) {
                this.method362(var7, var9, 0, 2048);
                this.method362(var7 + 1, var9 + 1, 0, 32768);
            }
            if (arg0 == 2) {
                this.method362(var7, var9, 0, 8192);
                this.method362(var7 + 1, var9 - 1, 0, 512);
            }
            if (arg0 == 3) {
                this.method362(var7, var9, 0, 32768);
                this.method362(var7 - 1, var9 - 1, 0, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method362(var7, var9, 0, 66560);
            this.method362(var7 - 1, var9, 0, 4096);
            this.method362(var7, var9 + 1, 0, 16384);
        }
        if (arg0 == 1) {
            this.method362(var7, var9, 0, 5120);
            this.method362(var7, var9 + 1, 0, 16384);
            this.method362(var7 + 1, var9, 0, 65536);
        }
        if (arg0 == 2) {
            this.method362(var7, var9, 0, 20480);
            this.method362(var7 + 1, var9, 0, 65536);
            this.method362(var7, var9 - 1, 0, 1024);
        }
        if (arg0 == 3) {
            this.method362(var7, var9, 0, 81920);
            this.method362(var7, var9 - 1, 0, 1024);
            this.method362(var7 - 1, var9, 0, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIZIII)V")
    public void method361(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field1103;
        int var10 = arg1 - this.field1104;
        if (arg4 != 8) {
            return;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg6;
            arg6 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1105) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1106) {
                        this.method362(var12, var13, 0, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method362(int arg0, int arg1, int arg2, int arg3) {
        this.field1107[arg0][arg1] &= 16777215 - arg3;
        if (arg2 != 0) {
            this.field1095 = !this.field1095;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZI)V")
    public void method363(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            int var4 = arg2 - this.field1103;
            int var5 = arg0 - this.field1104;
            this.field1107[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg5 && arg0 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field1103;
        int var9 = arg4 - this.field1104;
        int var10 = arg3 - this.field1103;
        int var11 = arg0 - this.field1104;
        if (arg6 >= 0) {
            this.field1095 = !this.field1095;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BIIIIII)Z")
    public boolean method365(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg2 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field1103;
        if (arg0 != -58) {
            this.field1097 = 54;
        }
        int var9 = arg2 - this.field1104;
        int var10 = arg1 - this.field1103;
        int var11 = arg3 - this.field1104;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1107[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1107[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1107[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg7 - 1;
        int var10 = arg1 + arg4 - 1;
        if (arg3 < this.field1101 || arg3 > this.field1101) {
            this.field1096 = 337;
        }
        if (arg5 >= arg7 && arg5 <= var9 && arg2 >= arg1 && arg2 <= var10) {
            return true;
        } else if (arg7 - 1 == arg5 && arg2 >= arg1 && arg2 <= var10 && (this.field1107[arg5 - this.field1103][arg2 - this.field1104] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg2 >= arg1 && arg2 <= var10 && (this.field1107[arg5 - this.field1103][arg2 - this.field1104] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg2 && arg5 >= arg7 && arg5 <= var9 && (this.field1107[arg5 - this.field1103][arg2 - this.field1104] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg5 >= arg7 && arg5 <= var9 && (this.field1107[arg5 - this.field1103][arg2 - this.field1104] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
