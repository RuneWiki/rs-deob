import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1060 = false;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private boolean field1061 = false;

    @OriginalMember(owner = "jc", name = "d", descriptor = "Z")
    private boolean field1063 = false;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1064 = 7;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1065 = 0;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[[I")
    public int[][] field1069;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(IIZ)V")
    public CollisionMap(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            throw new NullPointerException();
        }
        this.field1066 = 0;
        this.field1067 = arg0;
        this.field1068 = arg1;
        this.field1069 = new int[this.field1067][this.field1068];
        this.method361(6);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method361(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            return;
        }
        for (int var2 = 0; var2 < this.field1067; var2++) {
            for (int var3 = 0; var3 < this.field1068; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1067 - 1 == var2 || this.field1068 - 1 == var3) {
                    this.field1069[var2][var3] = 16777215;
                } else {
                    this.field1069[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIZI)V")
    public void method362(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field1065;
        if (arg0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg1 - this.field1066;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method365(var7, var9, 128);
                this.method365(var7 - 1, var9, 8);
            }
            if (arg5 == 1) {
                this.method365(var7, var9, 2);
                this.method365(var7, var9 + 1, 32);
            }
            if (arg5 == 2) {
                this.method365(var7, var9, 8);
                this.method365(var7 + 1, var9, 128);
            }
            if (arg5 == 3) {
                this.method365(var7, var9, 32);
                this.method365(var7, var9 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method365(var7, var9, 1);
                this.method365(var7 - 1, var9 + 1, 16);
            }
            if (arg5 == 1) {
                this.method365(var7, var9, 4);
                this.method365(var7 + 1, var9 + 1, 64);
            }
            if (arg5 == 2) {
                this.method365(var7, var9, 16);
                this.method365(var7 + 1, var9 - 1, 1);
            }
            if (arg5 == 3) {
                this.method365(var7, var9, 64);
                this.method365(var7 - 1, var9 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method365(var7, var9, 130);
                this.method365(var7 - 1, var9, 8);
                this.method365(var7, var9 + 1, 32);
            }
            if (arg5 == 1) {
                this.method365(var7, var9, 10);
                this.method365(var7, var9 + 1, 32);
                this.method365(var7 + 1, var9, 128);
            }
            if (arg5 == 2) {
                this.method365(var7, var9, 40);
                this.method365(var7 + 1, var9, 128);
                this.method365(var7, var9 - 1, 2);
            }
            if (arg5 == 3) {
                this.method365(var7, var9, 160);
                this.method365(var7, var9 - 1, 2);
                this.method365(var7 - 1, var9, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method365(var7, var9, 65536);
                this.method365(var7 - 1, var9, 4096);
            }
            if (arg5 == 1) {
                this.method365(var7, var9, 1024);
                this.method365(var7, var9 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method365(var7, var9, 4096);
                this.method365(var7 + 1, var9, 65536);
            }
            if (arg5 == 3) {
                this.method365(var7, var9, 16384);
                this.method365(var7, var9 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method365(var7, var9, 512);
                this.method365(var7 - 1, var9 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method365(var7, var9, 2048);
                this.method365(var7 + 1, var9 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method365(var7, var9, 8192);
                this.method365(var7 + 1, var9 - 1, 512);
            }
            if (arg5 == 3) {
                this.method365(var7, var9, 32768);
                this.method365(var7 - 1, var9 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method365(var7, var9, 66560);
            this.method365(var7 - 1, var9, 4096);
            this.method365(var7, var9 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method365(var7, var9, 5120);
            this.method365(var7, var9 + 1, 16384);
            this.method365(var7 + 1, var9, 65536);
        }
        if (arg5 == 2) {
            this.method365(var7, var9, 20480);
            this.method365(var7 + 1, var9, 65536);
            this.method365(var7, var9 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method365(var7, var9, 81920);
            this.method365(var7, var9 - 1, 1024);
            this.method365(var7 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZII)V")
    public void method363(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1065;
        int var10 = arg2 - this.field1066;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg5;
            arg5 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1067) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1068) {
                        this.method365(var12, var13, var8);
                    }
                }
            }
        }
        if (arg6 != 0) {
            this.field1061 = !this.field1061;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZII)V")
    public void method364(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1065;
        int var5 = arg1 - this.field1066;
        if (arg0) {
            this.field1060 = !this.field1060;
        }
        this.field1069[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method365(int arg0, int arg1, int arg2) {
        this.field1069[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZI)V")
    public void method366(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != 29274) {
            return;
        }
        int var7 = arg1 - this.field1065;
        int var8 = arg2 - this.field1066;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method368(var8, var7, (byte) 9, 128);
                this.method368(var8, var7 - 1, (byte) 9, 8);
            }
            if (arg5 == 1) {
                this.method368(var8, var7, (byte) 9, 2);
                this.method368(var8 + 1, var7, (byte) 9, 32);
            }
            if (arg5 == 2) {
                this.method368(var8, var7, (byte) 9, 8);
                this.method368(var8, var7 + 1, (byte) 9, 128);
            }
            if (arg5 == 3) {
                this.method368(var8, var7, (byte) 9, 32);
                this.method368(var8 - 1, var7, (byte) 9, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method368(var8, var7, (byte) 9, 1);
                this.method368(var8 + 1, var7 - 1, (byte) 9, 16);
            }
            if (arg5 == 1) {
                this.method368(var8, var7, (byte) 9, 4);
                this.method368(var8 + 1, var7 + 1, (byte) 9, 64);
            }
            if (arg5 == 2) {
                this.method368(var8, var7, (byte) 9, 16);
                this.method368(var8 - 1, var7 + 1, (byte) 9, 1);
            }
            if (arg5 == 3) {
                this.method368(var8, var7, (byte) 9, 64);
                this.method368(var8 - 1, var7 - 1, (byte) 9, 4);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method368(var8, var7, (byte) 9, 130);
                this.method368(var8, var7 - 1, (byte) 9, 8);
                this.method368(var8 + 1, var7, (byte) 9, 32);
            }
            if (arg5 == 1) {
                this.method368(var8, var7, (byte) 9, 10);
                this.method368(var8 + 1, var7, (byte) 9, 32);
                this.method368(var8, var7 + 1, (byte) 9, 128);
            }
            if (arg5 == 2) {
                this.method368(var8, var7, (byte) 9, 40);
                this.method368(var8, var7 + 1, (byte) 9, 128);
                this.method368(var8 - 1, var7, (byte) 9, 2);
            }
            if (arg5 == 3) {
                this.method368(var8, var7, (byte) 9, 160);
                this.method368(var8 - 1, var7, (byte) 9, 2);
                this.method368(var8, var7 - 1, (byte) 9, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method368(var8, var7, (byte) 9, 65536);
                this.method368(var8, var7 - 1, (byte) 9, 4096);
            }
            if (arg5 == 1) {
                this.method368(var8, var7, (byte) 9, 1024);
                this.method368(var8 + 1, var7, (byte) 9, 16384);
            }
            if (arg5 == 2) {
                this.method368(var8, var7, (byte) 9, 4096);
                this.method368(var8, var7 + 1, (byte) 9, 65536);
            }
            if (arg5 == 3) {
                this.method368(var8, var7, (byte) 9, 16384);
                this.method368(var8 - 1, var7, (byte) 9, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method368(var8, var7, (byte) 9, 512);
                this.method368(var8 + 1, var7 - 1, (byte) 9, 8192);
            }
            if (arg5 == 1) {
                this.method368(var8, var7, (byte) 9, 2048);
                this.method368(var8 + 1, var7 + 1, (byte) 9, 32768);
            }
            if (arg5 == 2) {
                this.method368(var8, var7, (byte) 9, 8192);
                this.method368(var8 - 1, var7 + 1, (byte) 9, 512);
            }
            if (arg5 == 3) {
                this.method368(var8, var7, (byte) 9, 32768);
                this.method368(var8 - 1, var7 - 1, (byte) 9, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method368(var8, var7, (byte) 9, 66560);
            this.method368(var8, var7 - 1, (byte) 9, 4096);
            this.method368(var8 + 1, var7, (byte) 9, 16384);
        }
        if (arg5 == 1) {
            this.method368(var8, var7, (byte) 9, 5120);
            this.method368(var8 + 1, var7, (byte) 9, 16384);
            this.method368(var8, var7 + 1, (byte) 9, 65536);
        }
        if (arg5 == 2) {
            this.method368(var8, var7, (byte) 9, 20480);
            this.method368(var8, var7 + 1, (byte) 9, 65536);
            this.method368(var8 - 1, var7, (byte) 9, 1024);
        }
        if (arg5 == 3) {
            this.method368(var8, var7, (byte) 9, 81920);
            this.method368(var8 - 1, var7, (byte) 9, 1024);
            this.method368(var8, var7 - 1, (byte) 9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIZ)V")
    public void method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field1065;
        int var10 = arg1 - this.field1066;
        if (arg0 != 18910) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg2;
            arg2 = arg4;
            arg4 = var12;
        }
        for (int var13 = var9; var13 < arg2 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1067) {
                for (int var14 = var10; var14 < arg4 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field1068) {
                        this.method368(var14, var13, (byte) 9, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIBI)V")
    private void method368(int arg0, int arg1, byte arg2, int arg3) {
        this.field1069[arg1][arg0] &= 16777215 - arg3;
        if (arg2 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    public void method369(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1065;
        int var5 = arg2 - this.field1066;
        this.field1069[var4][var5] &= 0xDFFFFF;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIB)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 == 7) {
            boolean var8 = false;
        } else {
            this.field1062 = 199;
        }
        if (arg0 == arg1 && arg4 == arg5) {
            return true;
        }
        int var9 = arg1 - this.field1065;
        int var10 = arg5 - this.field1066;
        int var11 = arg0 - this.field1065;
        int var12 = arg4 - this.field1066;
        if (arg2 == 0) {
            if (arg3 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1069[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1069[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1069[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1069[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1069[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1069[var9][var10] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1069[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1069[var9][var10] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field1069[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field1069[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field1069[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg1 && arg2 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field1065;
        int var9 = arg5 - this.field1066;
        int var10 = arg0 - this.field1065;
        if (arg6 <= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg2 - this.field1066;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field1069[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1069[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1069[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1069[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1069[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1069[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field1069[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1069[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field1069[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field1069[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field1069[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field1069[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 12 / arg5;
        int var10 = arg6 + arg7 - 1;
        int var11 = arg0 + arg2 - 1;
        if (arg4 >= arg7 && arg4 <= var10 && arg3 >= arg0 && arg3 <= var11) {
            return true;
        } else if (arg7 - 1 == arg4 && arg3 >= arg0 && arg3 <= var11 && (this.field1069[arg4 - this.field1065][arg3 - this.field1066] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg3 >= arg0 && arg3 <= var11 && (this.field1069[arg4 - this.field1065][arg3 - this.field1066] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg3 && arg4 >= arg7 && arg4 <= var10 && (this.field1069[arg4 - this.field1065][arg3 - this.field1066] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg4 >= arg7 && arg4 <= var10 && (this.field1069[arg4 - this.field1065][arg3 - this.field1066] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
