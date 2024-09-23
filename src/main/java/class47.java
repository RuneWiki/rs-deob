import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ONADPAJP")
public class class47 {

    @OriginalMember(owner = "ONADPAJP", name = "b", descriptor = "I")
    private int field1276 = -30411;

    @OriginalMember(owner = "ONADPAJP", name = "c", descriptor = "Z")
    private boolean field1277 = true;

    @OriginalMember(owner = "ONADPAJP", name = "d", descriptor = "Z")
    private boolean field1278 = true;

    @OriginalMember(owner = "ONADPAJP", name = "e", descriptor = "B")
    private byte field1279 = 4;

    @OriginalMember(owner = "ONADPAJP", name = "f", descriptor = "Z")
    private boolean field1280 = true;

    @OriginalMember(owner = "ONADPAJP", name = "g", descriptor = "I")
    private int field1281 = 4;

    @OriginalMember(owner = "ONADPAJP", name = "h", descriptor = "I")
    public int field1282 = 0;

    @OriginalMember(owner = "ONADPAJP", name = "i", descriptor = "I")
    public int field1283 = 0;

    @OriginalMember(owner = "ONADPAJP", name = "j", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "ONADPAJP", name = "k", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "ONADPAJP", name = "l", descriptor = "[[I")
    public int[][] field1286;

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "ONADPAJP", name = "<init>", descriptor = "(III)V")
    public class47(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            this.field1276 = -311;
        }
        this.field1284 = arg0;
        this.field1285 = arg1;
        this.field1286 = new int[this.field1284][this.field1285];
        this.method451();
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "()V")
    public void method451() {
        for (int var1 = 0; var1 < this.field1284; var1++) {
            for (int var2 = 0; var2 < this.field1285; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1284 - 1 == var1 || this.field1285 - 1 == var2) {
                    this.field1286[var1][var2] = 16777215;
                } else {
                    this.field1286[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(IZIIII)V")
    public void method452(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1282;
        if (arg3 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg2 - this.field1283;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method455(var7, var9, 128);
                this.method455(var7 - 1, var9, 8);
            }
            if (arg4 == 1) {
                this.method455(var7, var9, 2);
                this.method455(var7, var9 + 1, 32);
            }
            if (arg4 == 2) {
                this.method455(var7, var9, 8);
                this.method455(var7 + 1, var9, 128);
            }
            if (arg4 == 3) {
                this.method455(var7, var9, 32);
                this.method455(var7, var9 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method455(var7, var9, 1);
                this.method455(var7 - 1, var9 + 1, 16);
            }
            if (arg4 == 1) {
                this.method455(var7, var9, 4);
                this.method455(var7 + 1, var9 + 1, 64);
            }
            if (arg4 == 2) {
                this.method455(var7, var9, 16);
                this.method455(var7 + 1, var9 - 1, 1);
            }
            if (arg4 == 3) {
                this.method455(var7, var9, 64);
                this.method455(var7 - 1, var9 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method455(var7, var9, 130);
                this.method455(var7 - 1, var9, 8);
                this.method455(var7, var9 + 1, 32);
            }
            if (arg4 == 1) {
                this.method455(var7, var9, 10);
                this.method455(var7, var9 + 1, 32);
                this.method455(var7 + 1, var9, 128);
            }
            if (arg4 == 2) {
                this.method455(var7, var9, 40);
                this.method455(var7 + 1, var9, 128);
                this.method455(var7, var9 - 1, 2);
            }
            if (arg4 == 3) {
                this.method455(var7, var9, 160);
                this.method455(var7, var9 - 1, 2);
                this.method455(var7 - 1, var9, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method455(var7, var9, 65536);
                this.method455(var7 - 1, var9, 4096);
            }
            if (arg4 == 1) {
                this.method455(var7, var9, 1024);
                this.method455(var7, var9 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method455(var7, var9, 4096);
                this.method455(var7 + 1, var9, 65536);
            }
            if (arg4 == 3) {
                this.method455(var7, var9, 16384);
                this.method455(var7, var9 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method455(var7, var9, 512);
                this.method455(var7 - 1, var9 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method455(var7, var9, 2048);
                this.method455(var7 + 1, var9 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method455(var7, var9, 8192);
                this.method455(var7 + 1, var9 - 1, 512);
            }
            if (arg4 == 3) {
                this.method455(var7, var9, 32768);
                this.method455(var7 - 1, var9 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method455(var7, var9, 66560);
            this.method455(var7 - 1, var9, 4096);
            this.method455(var7, var9 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method455(var7, var9, 5120);
            this.method455(var7, var9 + 1, 16384);
            this.method455(var7 + 1, var9, 65536);
        }
        if (arg4 == 2) {
            this.method455(var7, var9, 20480);
            this.method455(var7 + 1, var9, 65536);
            this.method455(var7, var9 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method455(var7, var9, 81920);
            this.method455(var7, var9 - 1, 1024);
            this.method455(var7 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(IIZIIII)V")
    public void method453(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= 0) {
            this.field1276 = 233;
        }
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1282;
        int var10 = arg5 - this.field1283;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg0;
            arg0 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1284) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1285) {
                        this.method455(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(IBI)V")
    public void method454(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field1282;
        int var5 = arg2 - this.field1283;
        if (this.field1279 != arg1) {
            this.field1275 = -246;
        }
        this.field1286[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(III)V")
    private void method455(int arg0, int arg1, int arg2) {
        this.field1286[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(IIIIZZ)V")
    public void method456(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        int var7 = arg2 - this.field1282;
        int var8 = arg3 - this.field1283;
        if (!arg5) {
            this.field1277 = !this.field1277;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method458(var7, var8, 9, 128);
                this.method458(var7 - 1, var8, 9, 8);
            }
            if (arg0 == 1) {
                this.method458(var7, var8, 9, 2);
                this.method458(var7, var8 + 1, 9, 32);
            }
            if (arg0 == 2) {
                this.method458(var7, var8, 9, 8);
                this.method458(var7 + 1, var8, 9, 128);
            }
            if (arg0 == 3) {
                this.method458(var7, var8, 9, 32);
                this.method458(var7, var8 - 1, 9, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method458(var7, var8, 9, 1);
                this.method458(var7 - 1, var8 + 1, 9, 16);
            }
            if (arg0 == 1) {
                this.method458(var7, var8, 9, 4);
                this.method458(var7 + 1, var8 + 1, 9, 64);
            }
            if (arg0 == 2) {
                this.method458(var7, var8, 9, 16);
                this.method458(var7 + 1, var8 - 1, 9, 1);
            }
            if (arg0 == 3) {
                this.method458(var7, var8, 9, 64);
                this.method458(var7 - 1, var8 - 1, 9, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method458(var7, var8, 9, 130);
                this.method458(var7 - 1, var8, 9, 8);
                this.method458(var7, var8 + 1, 9, 32);
            }
            if (arg0 == 1) {
                this.method458(var7, var8, 9, 10);
                this.method458(var7, var8 + 1, 9, 32);
                this.method458(var7 + 1, var8, 9, 128);
            }
            if (arg0 == 2) {
                this.method458(var7, var8, 9, 40);
                this.method458(var7 + 1, var8, 9, 128);
                this.method458(var7, var8 - 1, 9, 2);
            }
            if (arg0 == 3) {
                this.method458(var7, var8, 9, 160);
                this.method458(var7, var8 - 1, 9, 2);
                this.method458(var7 - 1, var8, 9, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method458(var7, var8, 9, 65536);
                this.method458(var7 - 1, var8, 9, 4096);
            }
            if (arg0 == 1) {
                this.method458(var7, var8, 9, 1024);
                this.method458(var7, var8 + 1, 9, 16384);
            }
            if (arg0 == 2) {
                this.method458(var7, var8, 9, 4096);
                this.method458(var7 + 1, var8, 9, 65536);
            }
            if (arg0 == 3) {
                this.method458(var7, var8, 9, 16384);
                this.method458(var7, var8 - 1, 9, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method458(var7, var8, 9, 512);
                this.method458(var7 - 1, var8 + 1, 9, 8192);
            }
            if (arg0 == 1) {
                this.method458(var7, var8, 9, 2048);
                this.method458(var7 + 1, var8 + 1, 9, 32768);
            }
            if (arg0 == 2) {
                this.method458(var7, var8, 9, 8192);
                this.method458(var7 + 1, var8 - 1, 9, 512);
            }
            if (arg0 == 3) {
                this.method458(var7, var8, 9, 32768);
                this.method458(var7 - 1, var8 - 1, 9, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method458(var7, var8, 9, 66560);
            this.method458(var7 - 1, var8, 9, 4096);
            this.method458(var7, var8 + 1, 9, 16384);
        }
        if (arg0 == 1) {
            this.method458(var7, var8, 9, 5120);
            this.method458(var7, var8 + 1, 9, 16384);
            this.method458(var7 + 1, var8, 9, 65536);
        }
        if (arg0 == 2) {
            this.method458(var7, var8, 9, 20480);
            this.method458(var7 + 1, var8, 9, 65536);
            this.method458(var7, var8 - 1, 9, 1024);
        }
        if (arg0 == 3) {
            this.method458(var7, var8, 9, 81920);
            this.method458(var7, var8 - 1, 9, 1024);
            this.method458(var7 - 1, var8, 9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(ZIIIIII)V")
    public void method457(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1282;
        int var10 = 86 / arg1;
        int var11 = arg2 - this.field1283;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg3;
            arg3 = arg4;
            arg4 = var12;
        }
        for (int var13 = var9; var13 < arg3 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1284) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1285) {
                        this.method458(var13, var14, 9, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(IIII)V")
    private void method458(int arg0, int arg1, int arg2, int arg3) {
        this.field1286[arg0][arg1] &= 16777215 - arg3;
        if (arg2 < 9 || arg2 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "ONADPAJP", name = "b", descriptor = "(III)V")
    public void method459(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1282;
        int var5 = arg0 - this.field1283;
        this.field1286[var4][var5] &= 0xDFFFFF;
        if (arg2 <= 0) {
            this.field1280 = !this.field1280;
        }
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg5 && arg1 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field1282;
        int var9 = arg1 - this.field1283;
        int var10 = arg5 - this.field1282;
        int var11 = arg4 - this.field1283;
        int var12 = 28 / arg3;
        if (arg6 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ONADPAJP", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg2 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field1282;
        int var9 = arg6 - this.field1283;
        int var10 = arg0 - this.field1282;
        int var11 = arg2 - this.field1283;
        if (arg5 != 0) {
            this.field1280 = !this.field1280;
        }
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1286[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1286[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1286[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ONADPAJP", name = "a", descriptor = "(ZIIIIIII)Z")
    public boolean method462(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg6 + arg7 - 1;
        int var11 = arg2 + arg4 - 1;
        if (arg3 >= arg6 && arg3 <= var10 && arg5 >= arg2 && arg5 <= var11) {
            return true;
        } else if (arg6 - 1 == arg3 && arg5 >= arg2 && arg5 <= var11 && (this.field1286[arg3 - this.field1282][arg5 - this.field1283] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg5 >= arg2 && arg5 <= var11 && (this.field1286[arg3 - this.field1282][arg5 - this.field1283] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg5 && arg3 >= arg6 && arg3 <= var10 && (this.field1286[arg3 - this.field1282][arg5 - this.field1283] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg3 >= arg6 && arg3 <= var10 && (this.field1286[arg3 - this.field1282][arg5 - this.field1283] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
