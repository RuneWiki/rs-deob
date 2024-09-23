import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1076 = false;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private boolean field1077 = false;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1078 = 31154;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1079 = 5;

    @OriginalMember(owner = "jc", name = "e", descriptor = "B")
    private byte field1080 = 2;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1082 = 0;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1083 = 0;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "jc", name = "k", descriptor = "[[I")
    public int[][] field1086;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            this.field1076 = !this.field1076;
        }
        this.field1084 = arg1;
        this.field1085 = arg0;
        this.field1086 = new int[this.field1084][this.field1085];
        this.method359(0);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method359(int arg0) {
        for (int var2 = 0; var2 < this.field1084; var2++) {
            for (int var3 = 0; var3 < this.field1085; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1084 - 1 == var2 || this.field1085 - 1 == var3) {
                    this.field1086[var2][var3] = 16777215;
                } else {
                    this.field1086[var2][var3] = 0;
                }
            }
        }
        if (arg0 != 0) {
            this.field1081 = -466;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIZIZ)V")
    public void method360(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg4 - this.field1082;
        int var9 = arg2 - this.field1083;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method363(var8, var9, 128);
                this.method363(var8 - 1, var9, 8);
            }
            if (arg1 == 1) {
                this.method363(var8, var9, 2);
                this.method363(var8, var9 + 1, 32);
            }
            if (arg1 == 2) {
                this.method363(var8, var9, 8);
                this.method363(var8 + 1, var9, 128);
            }
            if (arg1 == 3) {
                this.method363(var8, var9, 32);
                this.method363(var8, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method363(var8, var9, 1);
                this.method363(var8 - 1, var9 + 1, 16);
            }
            if (arg1 == 1) {
                this.method363(var8, var9, 4);
                this.method363(var8 + 1, var9 + 1, 64);
            }
            if (arg1 == 2) {
                this.method363(var8, var9, 16);
                this.method363(var8 + 1, var9 - 1, 1);
            }
            if (arg1 == 3) {
                this.method363(var8, var9, 64);
                this.method363(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method363(var8, var9, 130);
                this.method363(var8 - 1, var9, 8);
                this.method363(var8, var9 + 1, 32);
            }
            if (arg1 == 1) {
                this.method363(var8, var9, 10);
                this.method363(var8, var9 + 1, 32);
                this.method363(var8 + 1, var9, 128);
            }
            if (arg1 == 2) {
                this.method363(var8, var9, 40);
                this.method363(var8 + 1, var9, 128);
                this.method363(var8, var9 - 1, 2);
            }
            if (arg1 == 3) {
                this.method363(var8, var9, 160);
                this.method363(var8, var9 - 1, 2);
                this.method363(var8 - 1, var9, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method363(var8, var9, 65536);
                this.method363(var8 - 1, var9, 4096);
            }
            if (arg1 == 1) {
                this.method363(var8, var9, 1024);
                this.method363(var8, var9 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method363(var8, var9, 4096);
                this.method363(var8 + 1, var9, 65536);
            }
            if (arg1 == 3) {
                this.method363(var8, var9, 16384);
                this.method363(var8, var9 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method363(var8, var9, 512);
                this.method363(var8 - 1, var9 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method363(var8, var9, 2048);
                this.method363(var8 + 1, var9 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method363(var8, var9, 8192);
                this.method363(var8 + 1, var9 - 1, 512);
            }
            if (arg1 == 3) {
                this.method363(var8, var9, 32768);
                this.method363(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method363(var8, var9, 66560);
            this.method363(var8 - 1, var9, 4096);
            this.method363(var8, var9 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method363(var8, var9, 5120);
            this.method363(var8, var9 + 1, 16384);
            this.method363(var8 + 1, var9, 65536);
        }
        if (arg1 == 2) {
            this.method363(var8, var9, 20480);
            this.method363(var8 + 1, var9, 65536);
            this.method363(var8, var9 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method363(var8, var9, 81920);
            this.method363(var8, var9 - 1, 1024);
            this.method363(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZIZ)V")
    public void method361(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1082;
        int var10 = arg0 - this.field1083;
        if (arg6) {
            return;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg2;
            arg2 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1084) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1085) {
                        this.method363(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    public void method362(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1082;
        if (arg2 <= 0) {
            this.field1081 = 192;
        }
        int var5 = arg1 - this.field1083;
        this.field1086[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1086[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZ)V")
    public void method364(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg2 - this.field1082;
        int var8 = arg0 - this.field1083;
        if (arg3 < 3 || arg3 > 3) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method366(var7, 128, var8, (byte) 2);
                this.method366(var7 - 1, 8, var8, (byte) 2);
            }
            if (arg1 == 1) {
                this.method366(var7, 2, var8, (byte) 2);
                this.method366(var7, 32, var8 + 1, (byte) 2);
            }
            if (arg1 == 2) {
                this.method366(var7, 8, var8, (byte) 2);
                this.method366(var7 + 1, 128, var8, (byte) 2);
            }
            if (arg1 == 3) {
                this.method366(var7, 32, var8, (byte) 2);
                this.method366(var7, 2, var8 - 1, (byte) 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method366(var7, 1, var8, (byte) 2);
                this.method366(var7 - 1, 16, var8 + 1, (byte) 2);
            }
            if (arg1 == 1) {
                this.method366(var7, 4, var8, (byte) 2);
                this.method366(var7 + 1, 64, var8 + 1, (byte) 2);
            }
            if (arg1 == 2) {
                this.method366(var7, 16, var8, (byte) 2);
                this.method366(var7 + 1, 1, var8 - 1, (byte) 2);
            }
            if (arg1 == 3) {
                this.method366(var7, 64, var8, (byte) 2);
                this.method366(var7 - 1, 4, var8 - 1, (byte) 2);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method366(var7, 130, var8, (byte) 2);
                this.method366(var7 - 1, 8, var8, (byte) 2);
                this.method366(var7, 32, var8 + 1, (byte) 2);
            }
            if (arg1 == 1) {
                this.method366(var7, 10, var8, (byte) 2);
                this.method366(var7, 32, var8 + 1, (byte) 2);
                this.method366(var7 + 1, 128, var8, (byte) 2);
            }
            if (arg1 == 2) {
                this.method366(var7, 40, var8, (byte) 2);
                this.method366(var7 + 1, 128, var8, (byte) 2);
                this.method366(var7, 2, var8 - 1, (byte) 2);
            }
            if (arg1 == 3) {
                this.method366(var7, 160, var8, (byte) 2);
                this.method366(var7, 2, var8 - 1, (byte) 2);
                this.method366(var7 - 1, 8, var8, (byte) 2);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method366(var7, 65536, var8, (byte) 2);
                this.method366(var7 - 1, 4096, var8, (byte) 2);
            }
            if (arg1 == 1) {
                this.method366(var7, 1024, var8, (byte) 2);
                this.method366(var7, 16384, var8 + 1, (byte) 2);
            }
            if (arg1 == 2) {
                this.method366(var7, 4096, var8, (byte) 2);
                this.method366(var7 + 1, 65536, var8, (byte) 2);
            }
            if (arg1 == 3) {
                this.method366(var7, 16384, var8, (byte) 2);
                this.method366(var7, 1024, var8 - 1, (byte) 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method366(var7, 512, var8, (byte) 2);
                this.method366(var7 - 1, 8192, var8 + 1, (byte) 2);
            }
            if (arg1 == 1) {
                this.method366(var7, 2048, var8, (byte) 2);
                this.method366(var7 + 1, 32768, var8 + 1, (byte) 2);
            }
            if (arg1 == 2) {
                this.method366(var7, 8192, var8, (byte) 2);
                this.method366(var7 + 1, 512, var8 - 1, (byte) 2);
            }
            if (arg1 == 3) {
                this.method366(var7, 32768, var8, (byte) 2);
                this.method366(var7 - 1, 2048, var8 - 1, (byte) 2);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method366(var7, 66560, var8, (byte) 2);
            this.method366(var7 - 1, 4096, var8, (byte) 2);
            this.method366(var7, 16384, var8 + 1, (byte) 2);
        }
        if (arg1 == 1) {
            this.method366(var7, 5120, var8, (byte) 2);
            this.method366(var7, 16384, var8 + 1, (byte) 2);
            this.method366(var7 + 1, 65536, var8, (byte) 2);
        }
        if (arg1 == 2) {
            this.method366(var7, 20480, var8, (byte) 2);
            this.method366(var7 + 1, 65536, var8, (byte) 2);
            this.method366(var7, 1024, var8 - 1, (byte) 2);
        }
        if (arg1 == 3) {
            this.method366(var7, 81920, var8, (byte) 2);
            this.method366(var7, 1024, var8 - 1, (byte) 2);
            this.method366(var7 - 1, 4096, var8, (byte) 2);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZII)V")
    public void method365(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (this.field1079 != arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg4) {
            var8 += 131072;
        }
        int var10 = arg1 - this.field1082;
        int var11 = arg3 - this.field1083;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg2;
            arg2 = arg6;
            arg6 = var12;
        }
        for (int var13 = var10; var13 < arg2 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1084) {
                for (int var14 = var11; var14 < arg6 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1085) {
                        this.method366(var13, var8, var14, (byte) 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIB)V")
    private void method366(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field1080 == arg3) {
            boolean var5 = false;
            this.field1086[arg0][arg2] &= 16777215 - arg1;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IBI)V")
    public void method367(int arg0, byte arg1, int arg2) {
        if (arg1 == 1) {
            int var4 = arg2 - this.field1082;
            int var5 = arg0 - this.field1083;
            this.field1086[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIB)Z")
    public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg1 == arg2 && arg4 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field1082;
        int var9 = arg4 - this.field1083;
        int var10 = arg2 - this.field1082;
        if (arg6 != -61) {
            throw new NullPointerException();
        }
        int var11 = arg5 - this.field1083;
        if (arg0 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIIII)Z")
    public boolean method369(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg5 && arg2 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field1082;
        if (arg1) {
            throw new NullPointerException();
        }
        int var9 = arg2 - this.field1083;
        int var10 = arg5 - this.field1082;
        int var11 = arg6 - this.field1083;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1086[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1086[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1086[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 57 / arg1;
        int var10 = arg5 + arg7 - 1;
        int var11 = arg0 + arg4 - 1;
        if (arg6 >= arg7 && arg6 <= var10 && arg3 >= arg4 && arg3 <= var11) {
            return true;
        } else if (arg7 - 1 == arg6 && arg3 >= arg4 && arg3 <= var11 && (this.field1086[arg6 - this.field1082][arg3 - this.field1083] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg3 >= arg4 && arg3 <= var11 && (this.field1086[arg6 - this.field1082][arg3 - this.field1083] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg3 && arg6 >= arg7 && arg6 <= var10 && (this.field1086[arg6 - this.field1082][arg3 - this.field1083] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg6 >= arg7 && arg6 <= var10 && (this.field1086[arg6 - this.field1082][arg3 - this.field1083] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
