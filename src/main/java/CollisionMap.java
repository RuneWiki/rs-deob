import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class CollisionMap {

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private int field1086 = 32;

    @OriginalMember(owner = "kc", name = "b", descriptor = "Z")
    private boolean field1087 = false;

    @OriginalMember(owner = "kc", name = "c", descriptor = "I")
    private int field1088 = -44203;

    @OriginalMember(owner = "kc", name = "d", descriptor = "B")
    private byte field1089 = 6;

    @OriginalMember(owner = "kc", name = "e", descriptor = "Z")
    private boolean field1090 = false;

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1091 = 0;

    @OriginalMember(owner = "kc", name = "g", descriptor = "I")
    public int field1092 = 0;

    @OriginalMember(owner = "kc", name = "h", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "kc", name = "i", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "kc", name = "j", descriptor = "[[I")
    public int[][] field1095;

    @OriginalMember(owner = "kc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field1087 = !this.field1087;
        }
        this.field1093 = arg2;
        this.field1094 = arg1;
        this.field1095 = new int[this.field1093][this.field1094];
        this.method356(3);
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(I)V")
    public void method356(int arg0) {
        for (int var2 = 0; var2 < this.field1093; var2++) {
            for (int var4 = 0; var4 < this.field1094; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1093 - 1 == var2 || this.field1094 - 1 == var4) {
                    this.field1095[var2][var4] = 16777215;
                } else {
                    this.field1095[var2][var4] = 0;
                }
            }
        }
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZIIIII)V")
    public void method357(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1091;
        if (arg3 != 0) {
            return;
        }
        int var8 = arg1 - this.field1092;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method360(var7, var8, 128);
                this.method360(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method360(var7, var8, 2);
                this.method360(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method360(var7, var8, 8);
                this.method360(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method360(var7, var8, 32);
                this.method360(var7, var8 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method360(var7, var8, 1);
                this.method360(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method360(var7, var8, 4);
                this.method360(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method360(var7, var8, 16);
                this.method360(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method360(var7, var8, 64);
                this.method360(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method360(var7, var8, 130);
                this.method360(var7 - 1, var8, 8);
                this.method360(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method360(var7, var8, 10);
                this.method360(var7, var8 + 1, 32);
                this.method360(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method360(var7, var8, 40);
                this.method360(var7 + 1, var8, 128);
                this.method360(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method360(var7, var8, 160);
                this.method360(var7, var8 - 1, 2);
                this.method360(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method360(var7, var8, 65536);
                this.method360(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method360(var7, var8, 1024);
                this.method360(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method360(var7, var8, 4096);
                this.method360(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method360(var7, var8, 16384);
                this.method360(var7, var8 - 1, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method360(var7, var8, 512);
                this.method360(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method360(var7, var8, 2048);
                this.method360(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method360(var7, var8, 8192);
                this.method360(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method360(var7, var8, 32768);
                this.method360(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method360(var7, var8, 66560);
            this.method360(var7 - 1, var8, 4096);
            this.method360(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method360(var7, var8, 5120);
            this.method360(var7, var8 + 1, 16384);
            this.method360(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method360(var7, var8, 20480);
            this.method360(var7 + 1, var8, 65536);
            this.method360(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method360(var7, var8, 81920);
            this.method360(var7, var8 - 1, 1024);
            this.method360(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IIIIZII)V")
    public void method358(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3 != -29036) {
            return;
        }
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1091;
        int var10 = arg5 - this.field1092;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1093) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1094) {
                        this.method360(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(III)V")
    public void method359(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1091;
        int var5 = arg0 - this.field1092;
        this.field1095[var4][var5] |= 0x200000;
        if (this.field1088 != arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "kc", name = "b", descriptor = "(III)V")
    private void method360(int arg0, int arg1, int arg2) {
        this.field1095[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IIIZII)V")
    public void method361(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field1091;
        int var8 = arg5 - this.field1092;
        if (arg4 >= 0) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method363(var8, this.field1089, 128, var7);
                this.method363(var8, this.field1089, 8, var7 - 1);
            }
            if (arg1 == 1) {
                this.method363(var8, this.field1089, 2, var7);
                this.method363(var8 + 1, this.field1089, 32, var7);
            }
            if (arg1 == 2) {
                this.method363(var8, this.field1089, 8, var7);
                this.method363(var8, this.field1089, 128, var7 + 1);
            }
            if (arg1 == 3) {
                this.method363(var8, this.field1089, 32, var7);
                this.method363(var8 - 1, this.field1089, 2, var7);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method363(var8, this.field1089, 1, var7);
                this.method363(var8 + 1, this.field1089, 16, var7 - 1);
            }
            if (arg1 == 1) {
                this.method363(var8, this.field1089, 4, var7);
                this.method363(var8 + 1, this.field1089, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method363(var8, this.field1089, 16, var7);
                this.method363(var8 - 1, this.field1089, 1, var7 + 1);
            }
            if (arg1 == 3) {
                this.method363(var8, this.field1089, 64, var7);
                this.method363(var8 - 1, this.field1089, 4, var7 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method363(var8, this.field1089, 130, var7);
                this.method363(var8, this.field1089, 8, var7 - 1);
                this.method363(var8 + 1, this.field1089, 32, var7);
            }
            if (arg1 == 1) {
                this.method363(var8, this.field1089, 10, var7);
                this.method363(var8 + 1, this.field1089, 32, var7);
                this.method363(var8, this.field1089, 128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method363(var8, this.field1089, 40, var7);
                this.method363(var8, this.field1089, 128, var7 + 1);
                this.method363(var8 - 1, this.field1089, 2, var7);
            }
            if (arg1 == 3) {
                this.method363(var8, this.field1089, 160, var7);
                this.method363(var8 - 1, this.field1089, 2, var7);
                this.method363(var8, this.field1089, 8, var7 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method363(var8, this.field1089, 65536, var7);
                this.method363(var8, this.field1089, 4096, var7 - 1);
            }
            if (arg1 == 1) {
                this.method363(var8, this.field1089, 1024, var7);
                this.method363(var8 + 1, this.field1089, 16384, var7);
            }
            if (arg1 == 2) {
                this.method363(var8, this.field1089, 4096, var7);
                this.method363(var8, this.field1089, 65536, var7 + 1);
            }
            if (arg1 == 3) {
                this.method363(var8, this.field1089, 16384, var7);
                this.method363(var8 - 1, this.field1089, 1024, var7);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method363(var8, this.field1089, 512, var7);
                this.method363(var8 + 1, this.field1089, 8192, var7 - 1);
            }
            if (arg1 == 1) {
                this.method363(var8, this.field1089, 2048, var7);
                this.method363(var8 + 1, this.field1089, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method363(var8, this.field1089, 8192, var7);
                this.method363(var8 - 1, this.field1089, 512, var7 + 1);
            }
            if (arg1 == 3) {
                this.method363(var8, this.field1089, 32768, var7);
                this.method363(var8 - 1, this.field1089, 2048, var7 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method363(var8, this.field1089, 66560, var7);
            this.method363(var8, this.field1089, 4096, var7 - 1);
            this.method363(var8 + 1, this.field1089, 16384, var7);
        }
        if (arg1 == 1) {
            this.method363(var8, this.field1089, 5120, var7);
            this.method363(var8 + 1, this.field1089, 16384, var7);
            this.method363(var8, this.field1089, 65536, var7 + 1);
        }
        if (arg1 == 2) {
            this.method363(var8, this.field1089, 20480, var7);
            this.method363(var8, this.field1089, 65536, var7 + 1);
            this.method363(var8 - 1, this.field1089, 1024, var7);
        }
        if (arg1 == 3) {
            this.method363(var8, this.field1089, 81920, var7);
            this.method363(var8 - 1, this.field1089, 1024, var7);
            this.method363(var8, this.field1089, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IIBZIII)V")
    public void method362(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2 != 73) {
            return;
        }
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1091;
        int var10 = arg0 - this.field1092;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg5;
            arg5 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1093) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1094) {
                        this.method363(var13, this.field1089, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IBII)V")
    private void method363(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 6) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1095[arg3][arg0] &= 16777215 - arg2;
    }

    @OriginalMember(owner = "kc", name = "c", descriptor = "(III)V")
    public void method364(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1088 = 421;
        }
        int var4 = arg0 - this.field1091;
        int var5 = arg2 - this.field1092;
        this.field1095[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IIIIIZI)Z")
    public boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg2 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field1091;
        int var9 = arg1 - this.field1092;
        int var10 = arg2 - this.field1091;
        int var11 = arg3 - this.field1092;
        if (!arg5) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280180) == 0) {
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
                if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IBIIIII)Z")
    public boolean method366(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg2 && arg3 == arg4) {
            return true;
        }
        int var8 = arg2 - this.field1091;
        if (arg1 != -96) {
            this.field1086 = -359;
        }
        int var9 = arg3 - this.field1092;
        int var10 = arg0 - this.field1091;
        int var11 = arg4 - this.field1092;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1095[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1095[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1095[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 + arg5 - 1;
        int var10 = arg3 + arg4 - 1;
        if (arg6 >= 0) {
            throw new NullPointerException();
        } else if (arg1 >= arg2 && arg1 <= var9 && arg7 >= arg3 && arg7 <= var10) {
            return true;
        } else if (arg2 - 1 == arg1 && arg7 >= arg3 && arg7 <= var10 && (this.field1095[arg1 - this.field1091][arg7 - this.field1092] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg1 && arg7 >= arg3 && arg7 <= var10 && (this.field1095[arg1 - this.field1091][arg7 - this.field1092] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg7 && arg1 >= arg2 && arg1 <= var9 && (this.field1095[arg1 - this.field1091][arg7 - this.field1092] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg1 >= arg2 && arg1 <= var9 && (this.field1095[arg1 - this.field1091][arg7 - this.field1092] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
