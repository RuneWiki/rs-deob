import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OTPPFNKL")
public class class36 {

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "I")
    private int field1203 = 560;

    @OriginalMember(owner = "OTPPFNKL", name = "b", descriptor = "Z")
    private boolean field1204 = true;

    @OriginalMember(owner = "OTPPFNKL", name = "c", descriptor = "Z")
    private boolean field1205 = false;

    @OriginalMember(owner = "OTPPFNKL", name = "d", descriptor = "B")
    private byte field1206 = 0;

    @OriginalMember(owner = "OTPPFNKL", name = "e", descriptor = "I")
    private int field1207 = 628;

    @OriginalMember(owner = "OTPPFNKL", name = "g", descriptor = "I")
    public int field1209 = 0;

    @OriginalMember(owner = "OTPPFNKL", name = "h", descriptor = "I")
    public int field1210 = 0;

    @OriginalMember(owner = "OTPPFNKL", name = "i", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "OTPPFNKL", name = "j", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "OTPPFNKL", name = "k", descriptor = "[[I")
    public int[][] field1213;

    @OriginalMember(owner = "OTPPFNKL", name = "f", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "OTPPFNKL", name = "<init>", descriptor = "(IZI)V")
    public class36(int arg0, boolean arg1, int arg2) {
        this.field1211 = arg0;
        this.field1212 = arg2;
        this.field1213 = new int[this.field1211][this.field1212];
        this.method353();
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        } else if (class38.field1221) {
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "()V")
    public void method353() {
        for (int var1 = 0; var1 < this.field1211; var1++) {
            for (int var2 = 0; var2 < this.field1212; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1211 - 1 == var1 || this.field1212 - 1 == var2) {
                    this.field1213[var1][var2] = 16777215;
                } else {
                    this.field1213[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(ZIIIII)V")
    public void method354(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1209;
        while (arg3 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var8 = arg2 - this.field1210;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method357(var7, var8, 128);
                this.method357(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method357(var7, var8, 2);
                this.method357(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method357(var7, var8, 8);
                this.method357(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method357(var7, var8, 32);
                this.method357(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method357(var7, var8, 1);
                this.method357(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method357(var7, var8, 4);
                this.method357(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method357(var7, var8, 16);
                this.method357(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method357(var7, var8, 64);
                this.method357(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method357(var7, var8, 130);
                this.method357(var7 - 1, var8, 8);
                this.method357(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method357(var7, var8, 10);
                this.method357(var7, var8 + 1, 32);
                this.method357(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method357(var7, var8, 40);
                this.method357(var7 + 1, var8, 128);
                this.method357(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method357(var7, var8, 160);
                this.method357(var7, var8 - 1, 2);
                this.method357(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method357(var7, var8, 65536);
                this.method357(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method357(var7, var8, 1024);
                this.method357(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method357(var7, var8, 4096);
                this.method357(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method357(var7, var8, 16384);
                this.method357(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method357(var7, var8, 512);
                this.method357(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method357(var7, var8, 2048);
                this.method357(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method357(var7, var8, 8192);
                this.method357(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method357(var7, var8, 32768);
                this.method357(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method357(var7, var8, 66560);
            this.method357(var7 - 1, var8, 4096);
            this.method357(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method357(var7, var8, 5120);
            this.method357(var7, var8 + 1, 16384);
            this.method357(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method357(var7, var8, 20480);
            this.method357(var7 + 1, var8, 65536);
            this.method357(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method357(var7, var8, 81920);
            this.method357(var7, var8 - 1, 1024);
            this.method357(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(ZIIBIII)V")
    public void method355(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1209;
        int var10 = arg2 - this.field1210;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg4;
            arg4 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1211) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1212) {
                        this.method357(var12, var13, var8);
                    }
                }
            }
        }
        if (arg3 != 108) {
            this.field1204 = !this.field1204;
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(III)V")
    public void method356(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1209;
        int var5 = arg0 - this.field1210;
        this.field1213[var4][var5] |= 0x200000;
        if (arg1 <= 0) {
            this.field1203 = -381;
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "b", descriptor = "(III)V")
    private void method357(int arg0, int arg1, int arg2) {
        this.field1213[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(IIZIII)V")
    public void method358(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1209;
        if (arg3 != 0) {
            this.field1203 = 4;
        }
        int var8 = arg1 - this.field1210;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method360(0, var8, var7, 128);
                this.method360(0, var8, var7 - 1, 8);
            }
            if (arg4 == 1) {
                this.method360(0, var8, var7, 2);
                this.method360(0, var8 + 1, var7, 32);
            }
            if (arg4 == 2) {
                this.method360(0, var8, var7, 8);
                this.method360(0, var8, var7 + 1, 128);
            }
            if (arg4 == 3) {
                this.method360(0, var8, var7, 32);
                this.method360(0, var8 - 1, var7, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method360(0, var8, var7, 1);
                this.method360(0, var8 + 1, var7 - 1, 16);
            }
            if (arg4 == 1) {
                this.method360(0, var8, var7, 4);
                this.method360(0, var8 + 1, var7 + 1, 64);
            }
            if (arg4 == 2) {
                this.method360(0, var8, var7, 16);
                this.method360(0, var8 - 1, var7 + 1, 1);
            }
            if (arg4 == 3) {
                this.method360(0, var8, var7, 64);
                this.method360(0, var8 - 1, var7 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method360(0, var8, var7, 130);
                this.method360(0, var8, var7 - 1, 8);
                this.method360(0, var8 + 1, var7, 32);
            }
            if (arg4 == 1) {
                this.method360(0, var8, var7, 10);
                this.method360(0, var8 + 1, var7, 32);
                this.method360(0, var8, var7 + 1, 128);
            }
            if (arg4 == 2) {
                this.method360(0, var8, var7, 40);
                this.method360(0, var8, var7 + 1, 128);
                this.method360(0, var8 - 1, var7, 2);
            }
            if (arg4 == 3) {
                this.method360(0, var8, var7, 160);
                this.method360(0, var8 - 1, var7, 2);
                this.method360(0, var8, var7 - 1, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method360(0, var8, var7, 65536);
                this.method360(0, var8, var7 - 1, 4096);
            }
            if (arg4 == 1) {
                this.method360(0, var8, var7, 1024);
                this.method360(0, var8 + 1, var7, 16384);
            }
            if (arg4 == 2) {
                this.method360(0, var8, var7, 4096);
                this.method360(0, var8, var7 + 1, 65536);
            }
            if (arg4 == 3) {
                this.method360(0, var8, var7, 16384);
                this.method360(0, var8 - 1, var7, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method360(0, var8, var7, 512);
                this.method360(0, var8 + 1, var7 - 1, 8192);
            }
            if (arg4 == 1) {
                this.method360(0, var8, var7, 2048);
                this.method360(0, var8 + 1, var7 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method360(0, var8, var7, 8192);
                this.method360(0, var8 - 1, var7 + 1, 512);
            }
            if (arg4 == 3) {
                this.method360(0, var8, var7, 32768);
                this.method360(0, var8 - 1, var7 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method360(0, var8, var7, 66560);
            this.method360(0, var8, var7 - 1, 4096);
            this.method360(0, var8 + 1, var7, 16384);
        }
        if (arg4 == 1) {
            this.method360(0, var8, var7, 5120);
            this.method360(0, var8 + 1, var7, 16384);
            this.method360(0, var8, var7 + 1, 65536);
        }
        if (arg4 == 2) {
            this.method360(0, var8, var7, 20480);
            this.method360(0, var8, var7 + 1, 65536);
            this.method360(0, var8 - 1, var7, 1024);
        }
        if (arg4 == 3) {
            this.method360(0, var8, var7, 81920);
            this.method360(0, var8 - 1, var7, 1024);
            this.method360(0, var8, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(IIIIIZI)V")
    public void method359(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1209;
        if (arg3 >= 0) {
            return;
        }
        int var10 = arg6 - this.field1210;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg0;
            arg0 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1211) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1212) {
                        this.method360(0, var13, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(IIII)V")
    private void method360(int arg0, int arg1, int arg2, int arg3) {
        this.field1213[arg2][arg1] &= 16777215 - arg3;
        if (arg0 != 0) {
            this.field1205 = !this.field1205;
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "c", descriptor = "(III)V")
    public void method361(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1209;
        int var5 = arg2 - this.field1210;
        this.field1213[var4][var5] &= 0xDFFFFF;
        if (arg1 >= 0) {
            this.field1204 = !this.field1204;
        }
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method362(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg2 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field1209;
        int var9 = arg3 - this.field1210;
        int var10 = arg2 - this.field1209;
        if (!arg4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg1 - this.field1210;
        if (arg5 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1213[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1213[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1213[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1213[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1213[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1213[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1213[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1213[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field1213[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field1213[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field1213[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(IIIIIIZ)Z")
    public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 == arg4 && arg2 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field1209;
        int var9 = arg5 - this.field1210;
        int var10 = arg0 - this.field1209;
        if (!arg6) {
            this.field1208 = 334;
        }
        int var11 = arg2 - this.field1210;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1213[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1213[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1213[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1213[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1213[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1213[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1213[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1213[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1213[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1213[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1213[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1213[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "OTPPFNKL", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 <= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg4 + arg5 - 1;
        int var11 = arg0 + arg6 - 1;
        if (arg3 >= arg4 && arg3 <= var10 && arg2 >= arg6 && arg2 <= var11) {
            return true;
        } else if (arg4 - 1 == arg3 && arg2 >= arg6 && arg2 <= var11 && (this.field1213[arg3 - this.field1209][arg2 - this.field1210] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg2 >= arg6 && arg2 <= var11 && (this.field1213[arg3 - this.field1209][arg2 - this.field1210] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg2 && arg3 >= arg4 && arg3 <= var10 && (this.field1213[arg3 - this.field1209][arg2 - this.field1210] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg2 && arg3 >= arg4 && arg3 <= var10 && (this.field1213[arg3 - this.field1209][arg2 - this.field1210] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
