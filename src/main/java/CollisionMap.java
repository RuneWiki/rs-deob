import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1073 = false;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1074 = -589;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1075 = -27210;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1076 = -39218;

    @OriginalMember(owner = "jc", name = "e", descriptor = "Z")
    private boolean field1077 = false;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1078 = 0;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1079 = 0;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[[I")
    public int[][] field1082;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(BII)V")
    public CollisionMap(byte arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            boolean var4 = false;
        } else {
            this.field1077 = !this.field1077;
        }
        this.field1080 = arg2;
        this.field1081 = arg1;
        this.field1082 = new int[this.field1080][this.field1081];
        this.method361(27237);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method361(int arg0) {
        for (int var2 = 0; var2 < this.field1080; var2++) {
            for (int var4 = 0; var4 < this.field1081; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1080 - 1 == var2 || this.field1081 - 1 == var4) {
                    this.field1082[var2][var4] = 16777215;
                } else {
                    this.field1082[var2][var4] = 0;
                }
            }
        }
        if (arg0 != 27237) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIBZ)V")
    public void method362(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        if (arg4 != -54) {
            this.field1077 = !this.field1077;
        }
        int var7 = arg2 - this.field1078;
        int var8 = arg3 - this.field1079;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method365(var7, var8, 128);
                this.method365(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method365(var7, var8, 2);
                this.method365(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method365(var7, var8, 8);
                this.method365(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method365(var7, var8, 32);
                this.method365(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method365(var7, var8, 1);
                this.method365(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method365(var7, var8, 4);
                this.method365(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method365(var7, var8, 16);
                this.method365(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method365(var7, var8, 64);
                this.method365(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method365(var7, var8, 130);
                this.method365(var7 - 1, var8, 8);
                this.method365(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method365(var7, var8, 10);
                this.method365(var7, var8 + 1, 32);
                this.method365(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method365(var7, var8, 40);
                this.method365(var7 + 1, var8, 128);
                this.method365(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method365(var7, var8, 160);
                this.method365(var7, var8 - 1, 2);
                this.method365(var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method365(var7, var8, 65536);
                this.method365(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method365(var7, var8, 1024);
                this.method365(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method365(var7, var8, 4096);
                this.method365(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method365(var7, var8, 16384);
                this.method365(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method365(var7, var8, 512);
                this.method365(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method365(var7, var8, 2048);
                this.method365(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method365(var7, var8, 8192);
                this.method365(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method365(var7, var8, 32768);
                this.method365(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method365(var7, var8, 66560);
            this.method365(var7 - 1, var8, 4096);
            this.method365(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method365(var7, var8, 5120);
            this.method365(var7, var8 + 1, 16384);
            this.method365(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method365(var7, var8, 20480);
            this.method365(var7 + 1, var8, 65536);
            this.method365(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method365(var7, var8, 81920);
            this.method365(var7, var8 - 1, 1024);
            this.method365(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIZ)V")
    public void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 != -27210) {
            return;
        }
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field1078;
        int var10 = arg3 - this.field1079;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg4;
            arg4 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1080) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1081) {
                        this.method365(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    public void method364(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1078;
        if (arg2 <= 0) {
            this.field1073 = !this.field1073;
        }
        int var5 = arg1 - this.field1079;
        this.field1082[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    private void method365(int arg0, int arg1, int arg2) {
        this.field1082[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZB)V")
    public void method366(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg2 - this.field1078;
        if (arg5 != 0) {
            return;
        }
        int var8 = arg1 - this.field1079;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method368(this.field1076, 128, var8, var7);
                this.method368(this.field1076, 8, var8, var7 - 1);
            }
            if (arg0 == 1) {
                this.method368(this.field1076, 2, var8, var7);
                this.method368(this.field1076, 32, var8 + 1, var7);
            }
            if (arg0 == 2) {
                this.method368(this.field1076, 8, var8, var7);
                this.method368(this.field1076, 128, var8, var7 + 1);
            }
            if (arg0 == 3) {
                this.method368(this.field1076, 32, var8, var7);
                this.method368(this.field1076, 2, var8 - 1, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method368(this.field1076, 1, var8, var7);
                this.method368(this.field1076, 16, var8 + 1, var7 - 1);
            }
            if (arg0 == 1) {
                this.method368(this.field1076, 4, var8, var7);
                this.method368(this.field1076, 64, var8 + 1, var7 + 1);
            }
            if (arg0 == 2) {
                this.method368(this.field1076, 16, var8, var7);
                this.method368(this.field1076, 1, var8 - 1, var7 + 1);
            }
            if (arg0 == 3) {
                this.method368(this.field1076, 64, var8, var7);
                this.method368(this.field1076, 4, var8 - 1, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method368(this.field1076, 130, var8, var7);
                this.method368(this.field1076, 8, var8, var7 - 1);
                this.method368(this.field1076, 32, var8 + 1, var7);
            }
            if (arg0 == 1) {
                this.method368(this.field1076, 10, var8, var7);
                this.method368(this.field1076, 32, var8 + 1, var7);
                this.method368(this.field1076, 128, var8, var7 + 1);
            }
            if (arg0 == 2) {
                this.method368(this.field1076, 40, var8, var7);
                this.method368(this.field1076, 128, var8, var7 + 1);
                this.method368(this.field1076, 2, var8 - 1, var7);
            }
            if (arg0 == 3) {
                this.method368(this.field1076, 160, var8, var7);
                this.method368(this.field1076, 2, var8 - 1, var7);
                this.method368(this.field1076, 8, var8, var7 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method368(this.field1076, 65536, var8, var7);
                this.method368(this.field1076, 4096, var8, var7 - 1);
            }
            if (arg0 == 1) {
                this.method368(this.field1076, 1024, var8, var7);
                this.method368(this.field1076, 16384, var8 + 1, var7);
            }
            if (arg0 == 2) {
                this.method368(this.field1076, 4096, var8, var7);
                this.method368(this.field1076, 65536, var8, var7 + 1);
            }
            if (arg0 == 3) {
                this.method368(this.field1076, 16384, var8, var7);
                this.method368(this.field1076, 1024, var8 - 1, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method368(this.field1076, 512, var8, var7);
                this.method368(this.field1076, 8192, var8 + 1, var7 - 1);
            }
            if (arg0 == 1) {
                this.method368(this.field1076, 2048, var8, var7);
                this.method368(this.field1076, 32768, var8 + 1, var7 + 1);
            }
            if (arg0 == 2) {
                this.method368(this.field1076, 8192, var8, var7);
                this.method368(this.field1076, 512, var8 - 1, var7 + 1);
            }
            if (arg0 == 3) {
                this.method368(this.field1076, 32768, var8, var7);
                this.method368(this.field1076, 2048, var8 - 1, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method368(this.field1076, 66560, var8, var7);
            this.method368(this.field1076, 4096, var8, var7 - 1);
            this.method368(this.field1076, 16384, var8 + 1, var7);
        }
        if (arg0 == 1) {
            this.method368(this.field1076, 5120, var8, var7);
            this.method368(this.field1076, 16384, var8 + 1, var7);
            this.method368(this.field1076, 65536, var8, var7 + 1);
        }
        if (arg0 == 2) {
            this.method368(this.field1076, 20480, var8, var7);
            this.method368(this.field1076, 65536, var8, var7 + 1);
            this.method368(this.field1076, 1024, var8 - 1, var7);
        }
        if (arg0 == 3) {
            this.method368(this.field1076, 81920, var8, var7);
            this.method368(this.field1076, 1024, var8 - 1, var7);
            this.method368(this.field1076, 4096, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIIII)V")
    public void method367(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1078;
        int var10 = arg5 - this.field1079;
        if (arg6 != 0) {
            this.field1074 = -439;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg2;
            arg2 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1080) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1081) {
                        this.method368(this.field1076, var8, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method368(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -39218) {
            this.field1074 = -467;
        }
        this.field1082[arg3][arg2] &= 16777215 - arg1;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZII)V")
    public void method369(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg2 - this.field1078;
        int var6 = arg1 - this.field1079;
        this.field1082[var5][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg3 && arg2 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field1078;
        while (arg4 >= 0) {
            this.field1075 = 137;
        }
        int var9 = arg5 - this.field1079;
        int var10 = arg3 - this.field1078;
        int var11 = arg2 - this.field1079;
        if (arg0 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg5 && arg3 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field1078;
        int var9 = arg4 - this.field1079;
        int var10 = arg2 - this.field1078;
        while (arg0 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var11 = arg3 - this.field1079;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1082[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1082[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1082[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg6 - 1;
        int var10 = arg1 + arg4 - 1;
        while (arg7 >= 0) {
            this.field1075 = -408;
        }
        if (arg3 >= arg6 && arg3 <= var9 && arg5 >= arg1 && arg5 <= var10) {
            return true;
        } else if (arg6 - 1 == arg3 && arg5 >= arg1 && arg5 <= var10 && (this.field1082[arg3 - this.field1078][arg5 - this.field1079] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg5 >= arg1 && arg5 <= var10 && (this.field1082[arg3 - this.field1078][arg5 - this.field1079] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg5 && arg3 >= arg6 && arg3 <= var9 && (this.field1082[arg3 - this.field1078][arg5 - this.field1079] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg3 >= arg6 && arg3 <= var9 && (this.field1082[arg3 - this.field1078][arg5 - this.field1079] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
