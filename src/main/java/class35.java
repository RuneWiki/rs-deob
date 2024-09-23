import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NXLHMSCV")
public class class35 {

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "Z")
    private boolean field1172 = false;

    @OriginalMember(owner = "NXLHMSCV", name = "d", descriptor = "I")
    private int field1175 = 732;

    @OriginalMember(owner = "NXLHMSCV", name = "e", descriptor = "B")
    private byte field1176 = -31;

    @OriginalMember(owner = "NXLHMSCV", name = "f", descriptor = "Z")
    private boolean field1177 = true;

    @OriginalMember(owner = "NXLHMSCV", name = "g", descriptor = "I")
    public int field1178 = 0;

    @OriginalMember(owner = "NXLHMSCV", name = "h", descriptor = "I")
    public int field1179 = 0;

    @OriginalMember(owner = "NXLHMSCV", name = "i", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "NXLHMSCV", name = "j", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "NXLHMSCV", name = "k", descriptor = "[[I")
    public int[][] field1182;

    @OriginalMember(owner = "NXLHMSCV", name = "b", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "NXLHMSCV", name = "c", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "NXLHMSCV", name = "<init>", descriptor = "(III)V")
    public class35(int arg0, int arg1, int arg2) {
        this.field1180 = arg1;
        if (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1181 = arg0;
        this.field1182 = new int[this.field1180][this.field1181];
        this.method354();
        if (class72.field1737) {
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "()V")
    public void method354() {
        for (int var1 = 0; var1 < this.field1180; var1++) {
            for (int var2 = 0; var2 < this.field1181; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1180 - 1 == var1 || this.field1181 - 1 == var2) {
                    this.field1182[var1][var2] = 16777215;
                } else {
                    this.field1182[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IIIIZI)V")
    public void method355(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg1 - this.field1178;
        int var8 = arg2 - this.field1179;
        if (arg5 != 2) {
            this.field1174 = -128;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method358(var7, var8, 128);
                this.method358(var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method358(var7, var8, 2);
                this.method358(var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method358(var7, var8, 8);
                this.method358(var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method358(var7, var8, 32);
                this.method358(var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method358(var7, var8, 1);
                this.method358(var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method358(var7, var8, 4);
                this.method358(var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method358(var7, var8, 16);
                this.method358(var7 + 1, var8 - 1, 1);
            }
            if (arg3 == 3) {
                this.method358(var7, var8, 64);
                this.method358(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method358(var7, var8, 130);
                this.method358(var7 - 1, var8, 8);
                this.method358(var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method358(var7, var8, 10);
                this.method358(var7, var8 + 1, 32);
                this.method358(var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method358(var7, var8, 40);
                this.method358(var7 + 1, var8, 128);
                this.method358(var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method358(var7, var8, 160);
                this.method358(var7, var8 - 1, 2);
                this.method358(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method358(var7, var8, 65536);
                this.method358(var7 - 1, var8, 4096);
            }
            if (arg3 == 1) {
                this.method358(var7, var8, 1024);
                this.method358(var7, var8 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method358(var7, var8, 4096);
                this.method358(var7 + 1, var8, 65536);
            }
            if (arg3 == 3) {
                this.method358(var7, var8, 16384);
                this.method358(var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method358(var7, var8, 512);
                this.method358(var7 - 1, var8 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method358(var7, var8, 2048);
                this.method358(var7 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method358(var7, var8, 8192);
                this.method358(var7 + 1, var8 - 1, 512);
            }
            if (arg3 == 3) {
                this.method358(var7, var8, 32768);
                this.method358(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method358(var7, var8, 66560);
            this.method358(var7 - 1, var8, 4096);
            this.method358(var7, var8 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method358(var7, var8, 5120);
            this.method358(var7, var8 + 1, 16384);
            this.method358(var7 + 1, var8, 65536);
        }
        if (arg3 == 2) {
            this.method358(var7, var8, 20480);
            this.method358(var7 + 1, var8, 65536);
            this.method358(var7, var8 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method358(var7, var8, 81920);
            this.method358(var7, var8 - 1, 1024);
            this.method358(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IIIIIIZ)V")
    public void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1178;
        if (arg3 < 8 || arg3 > 8) {
            return;
        }
        int var10 = arg4 - this.field1179;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1180) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1181) {
                        this.method358(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(III)V")
    public void method357(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1178;
        int var5 = arg2 - this.field1179;
        this.field1182[var4][var5] |= 0x200000;
        if (arg1 != -19527) {
            this.field1175 = -348;
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "b", descriptor = "(III)V")
    private void method358(int arg0, int arg1, int arg2) {
        this.field1182[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IZIZII)V")
    public void method359(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field1178;
        if (!arg1) {
            return;
        }
        int var8 = arg5 - this.field1179;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method361(var8, 0, var7, 128);
                this.method361(var8, 0, var7 - 1, 8);
            }
            if (arg4 == 1) {
                this.method361(var8, 0, var7, 2);
                this.method361(var8 + 1, 0, var7, 32);
            }
            if (arg4 == 2) {
                this.method361(var8, 0, var7, 8);
                this.method361(var8, 0, var7 + 1, 128);
            }
            if (arg4 == 3) {
                this.method361(var8, 0, var7, 32);
                this.method361(var8 - 1, 0, var7, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method361(var8, 0, var7, 1);
                this.method361(var8 + 1, 0, var7 - 1, 16);
            }
            if (arg4 == 1) {
                this.method361(var8, 0, var7, 4);
                this.method361(var8 + 1, 0, var7 + 1, 64);
            }
            if (arg4 == 2) {
                this.method361(var8, 0, var7, 16);
                this.method361(var8 - 1, 0, var7 + 1, 1);
            }
            if (arg4 == 3) {
                this.method361(var8, 0, var7, 64);
                this.method361(var8 - 1, 0, var7 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method361(var8, 0, var7, 130);
                this.method361(var8, 0, var7 - 1, 8);
                this.method361(var8 + 1, 0, var7, 32);
            }
            if (arg4 == 1) {
                this.method361(var8, 0, var7, 10);
                this.method361(var8 + 1, 0, var7, 32);
                this.method361(var8, 0, var7 + 1, 128);
            }
            if (arg4 == 2) {
                this.method361(var8, 0, var7, 40);
                this.method361(var8, 0, var7 + 1, 128);
                this.method361(var8 - 1, 0, var7, 2);
            }
            if (arg4 == 3) {
                this.method361(var8, 0, var7, 160);
                this.method361(var8 - 1, 0, var7, 2);
                this.method361(var8, 0, var7 - 1, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method361(var8, 0, var7, 65536);
                this.method361(var8, 0, var7 - 1, 4096);
            }
            if (arg4 == 1) {
                this.method361(var8, 0, var7, 1024);
                this.method361(var8 + 1, 0, var7, 16384);
            }
            if (arg4 == 2) {
                this.method361(var8, 0, var7, 4096);
                this.method361(var8, 0, var7 + 1, 65536);
            }
            if (arg4 == 3) {
                this.method361(var8, 0, var7, 16384);
                this.method361(var8 - 1, 0, var7, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method361(var8, 0, var7, 512);
                this.method361(var8 + 1, 0, var7 - 1, 8192);
            }
            if (arg4 == 1) {
                this.method361(var8, 0, var7, 2048);
                this.method361(var8 + 1, 0, var7 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method361(var8, 0, var7, 8192);
                this.method361(var8 - 1, 0, var7 + 1, 512);
            }
            if (arg4 == 3) {
                this.method361(var8, 0, var7, 32768);
                this.method361(var8 - 1, 0, var7 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method361(var8, 0, var7, 66560);
            this.method361(var8, 0, var7 - 1, 4096);
            this.method361(var8 + 1, 0, var7, 16384);
        }
        if (arg4 == 1) {
            this.method361(var8, 0, var7, 5120);
            this.method361(var8 + 1, 0, var7, 16384);
            this.method361(var8, 0, var7 + 1, 65536);
        }
        if (arg4 == 2) {
            this.method361(var8, 0, var7, 20480);
            this.method361(var8, 0, var7 + 1, 65536);
            this.method361(var8 - 1, 0, var7, 1024);
        }
        if (arg4 == 3) {
            this.method361(var8, 0, var7, 81920);
            this.method361(var8 - 1, 0, var7, 1024);
            this.method361(var8, 0, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IIIZIII)V")
    public void method360(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1178;
        if (arg1 < 1 || arg1 > 1) {
            this.field1173 = -428;
        }
        int var10 = arg2 - this.field1179;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg5;
            arg5 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1180) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1181) {
                        this.method361(var13, 0, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IIII)V")
    private void method361(int arg0, int arg1, int arg2, int arg3) {
        this.field1182[arg2][arg0] &= 16777215 - arg3;
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IZI)V")
    public void method362(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field1178;
        int var5 = arg0 - this.field1179;
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1182[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg5 && arg3 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field1178;
        int var9 = arg4 - this.field1179;
        if (arg1 != 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg5 - this.field1178;
        int var12 = arg3 - this.field1179;
        if (arg2 == 0) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1182[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1182[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1182[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1182[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1182[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field1182[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1182[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field1182[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var11 && var12 + 1 == var9 && (this.field1182[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var9 && (this.field1182[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var12 && (this.field1182[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "NXLHMSCV", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg1 - this.field1178;
        if (arg3 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg2 - this.field1179;
        int var11 = arg6 - this.field1178;
        int var12 = arg4 - this.field1179;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1182[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1182[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1182[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1182[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1182[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1182[var8][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1182[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1182[var8][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1182[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1182[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1182[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1182[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "NXLHMSCV", name = "a", descriptor = "(IIIIIZII)Z")
    public boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            this.field1173 = 44;
        }
        int var9 = arg0 + arg2 - 1;
        int var10 = arg1 + arg7 - 1;
        if (arg6 >= arg0 && arg6 <= var9 && arg4 >= arg1 && arg4 <= var10) {
            return true;
        } else if (arg0 - 1 == arg6 && arg4 >= arg1 && arg4 <= var10 && (this.field1182[arg6 - this.field1178][arg4 - this.field1179] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg4 >= arg1 && arg4 <= var10 && (this.field1182[arg6 - this.field1178][arg4 - this.field1179] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg4 && arg6 >= arg0 && arg6 <= var9 && (this.field1182[arg6 - this.field1178][arg4 - this.field1179] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg4 && arg6 >= arg0 && arg6 <= var9 && (this.field1182[arg6 - this.field1178][arg4 - this.field1179] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
