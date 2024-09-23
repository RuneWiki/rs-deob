import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private int field1083 = -243;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private boolean field1084 = true;

    @OriginalMember(owner = "jc", name = "c", descriptor = "Z")
    private boolean field1085 = false;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1086 = 9;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    public int field1087 = 0;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1088 = 0;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "jc", name = "i", descriptor = "[[I")
    public int[][] field1091;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        this.field1089 = arg1;
        this.field1090 = arg2;
        this.field1091 = new int[this.field1089][this.field1090];
        this.method359(true);
        int var4 = 54 / arg0;
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Z)V")
    public void method359(boolean arg0) {
        if (!arg0) {
            this.field1083 = 106;
        }
        for (int var2 = 0; var2 < this.field1089; var2++) {
            for (int var3 = 0; var3 < this.field1090; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1089 - 1 == var2 || this.field1090 - 1 == var3) {
                    this.field1091[var2][var3] = 16777215;
                } else {
                    this.field1091[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZIIII)V")
    public void method360(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1087;
        int var8 = arg3 - this.field1088;
        if (arg5 != 0) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method363(var7, var8, 128);
                this.method363(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method363(var7, var8, 2);
                this.method363(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method363(var7, var8, 8);
                this.method363(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method363(var7, var8, 32);
                this.method363(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method363(var7, var8, 1);
                this.method363(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method363(var7, var8, 4);
                this.method363(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method363(var7, var8, 16);
                this.method363(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method363(var7, var8, 64);
                this.method363(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method363(var7, var8, 130);
                this.method363(var7 - 1, var8, 8);
                this.method363(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method363(var7, var8, 10);
                this.method363(var7, var8 + 1, 32);
                this.method363(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method363(var7, var8, 40);
                this.method363(var7 + 1, var8, 128);
                this.method363(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method363(var7, var8, 160);
                this.method363(var7, var8 - 1, 2);
                this.method363(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method363(var7, var8, 65536);
                this.method363(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method363(var7, var8, 1024);
                this.method363(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method363(var7, var8, 4096);
                this.method363(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method363(var7, var8, 16384);
                this.method363(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method363(var7, var8, 512);
                this.method363(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method363(var7, var8, 2048);
                this.method363(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method363(var7, var8, 8192);
                this.method363(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method363(var7, var8, 32768);
                this.method363(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method363(var7, var8, 66560);
            this.method363(var7 - 1, var8, 4096);
            this.method363(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method363(var7, var8, 5120);
            this.method363(var7, var8 + 1, 16384);
            this.method363(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method363(var7, var8, 20480);
            this.method363(var7 + 1, var8, 65536);
            this.method363(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method363(var7, var8, 81920);
            this.method363(var7, var8 - 1, 1024);
            this.method363(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZZIII)V")
    public void method361(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1087;
        int var10 = arg0 - this.field1088;
        if (arg3) {
            this.field1085 = !this.field1085;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg6;
            arg6 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1089) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1090) {
                        this.method363(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IBI)V")
    public void method362(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field1087;
        int var5 = arg0 - this.field1088;
        if (arg1 == 7) {
            boolean var6 = false;
        } else {
            this.field1083 = -42;
        }
        this.field1091[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method363(int arg0, int arg1, int arg2) {
        this.field1091[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIBII)V")
    public void method364(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1087;
        int var8 = arg2 - this.field1088;
        if (arg3 != 9) {
            return;
        }
        boolean var9 = false;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method366(var8, 17480, 128, var7);
                this.method366(var8, 17480, 8, var7 - 1);
            }
            if (arg1 == 1) {
                this.method366(var8, 17480, 2, var7);
                this.method366(var8 + 1, 17480, 32, var7);
            }
            if (arg1 == 2) {
                this.method366(var8, 17480, 8, var7);
                this.method366(var8, 17480, 128, var7 + 1);
            }
            if (arg1 == 3) {
                this.method366(var8, 17480, 32, var7);
                this.method366(var8 - 1, 17480, 2, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method366(var8, 17480, 1, var7);
                this.method366(var8 + 1, 17480, 16, var7 - 1);
            }
            if (arg1 == 1) {
                this.method366(var8, 17480, 4, var7);
                this.method366(var8 + 1, 17480, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method366(var8, 17480, 16, var7);
                this.method366(var8 - 1, 17480, 1, var7 + 1);
            }
            if (arg1 == 3) {
                this.method366(var8, 17480, 64, var7);
                this.method366(var8 - 1, 17480, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method366(var8, 17480, 130, var7);
                this.method366(var8, 17480, 8, var7 - 1);
                this.method366(var8 + 1, 17480, 32, var7);
            }
            if (arg1 == 1) {
                this.method366(var8, 17480, 10, var7);
                this.method366(var8 + 1, 17480, 32, var7);
                this.method366(var8, 17480, 128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method366(var8, 17480, 40, var7);
                this.method366(var8, 17480, 128, var7 + 1);
                this.method366(var8 - 1, 17480, 2, var7);
            }
            if (arg1 == 3) {
                this.method366(var8, 17480, 160, var7);
                this.method366(var8 - 1, 17480, 2, var7);
                this.method366(var8, 17480, 8, var7 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method366(var8, 17480, 65536, var7);
                this.method366(var8, 17480, 4096, var7 - 1);
            }
            if (arg1 == 1) {
                this.method366(var8, 17480, 1024, var7);
                this.method366(var8 + 1, 17480, 16384, var7);
            }
            if (arg1 == 2) {
                this.method366(var8, 17480, 4096, var7);
                this.method366(var8, 17480, 65536, var7 + 1);
            }
            if (arg1 == 3) {
                this.method366(var8, 17480, 16384, var7);
                this.method366(var8 - 1, 17480, 1024, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method366(var8, 17480, 512, var7);
                this.method366(var8 + 1, 17480, 8192, var7 - 1);
            }
            if (arg1 == 1) {
                this.method366(var8, 17480, 2048, var7);
                this.method366(var8 + 1, 17480, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method366(var8, 17480, 8192, var7);
                this.method366(var8 - 1, 17480, 512, var7 + 1);
            }
            if (arg1 == 3) {
                this.method366(var8, 17480, 32768, var7);
                this.method366(var8 - 1, 17480, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method366(var8, 17480, 66560, var7);
            this.method366(var8, 17480, 4096, var7 - 1);
            this.method366(var8 + 1, 17480, 16384, var7);
        }
        if (arg1 == 1) {
            this.method366(var8, 17480, 5120, var7);
            this.method366(var8 + 1, 17480, 16384, var7);
            this.method366(var8, 17480, 65536, var7 + 1);
        }
        if (arg1 == 2) {
            this.method366(var8, 17480, 20480, var7);
            this.method366(var8, 17480, 65536, var7 + 1);
            this.method366(var8 - 1, 17480, 1024, var7);
        }
        if (arg1 == 3) {
            this.method366(var8, 17480, 81920, var7);
            this.method366(var8 - 1, 17480, 1024, var7);
            this.method366(var8, 17480, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIIII)V")
    public void method365(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg6 != 9) {
            return;
        }
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1087;
        int var10 = arg5 - this.field1088;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1089) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1090) {
                        this.method366(var13, 17480, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method366(int arg0, int arg1, int arg2, int arg3) {
        this.field1091[arg3][arg0] &= 16777215 - arg2;
        if (arg1 != 17480) {
            this.field1084 = !this.field1084;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    public void method367(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1087;
        int var5 = arg0 - this.field1088;
        this.field1091[var4][var5] &= 0xDFFFFF;
        if (arg2 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZI)Z")
    public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 == arg4 && arg2 == arg3) {
            return true;
        }
        int var8 = arg1 - this.field1087;
        if (arg5) {
            throw new NullPointerException();
        }
        int var9 = arg3 - this.field1088;
        int var10 = arg4 - this.field1087;
        int var11 = arg2 - this.field1088;
        if (arg6 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg2 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field1087;
        int var9 = arg2 - this.field1088;
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        int var10 = arg4 - this.field1087;
        int var11 = arg3 - this.field1088;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1091[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1091[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1091[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIIZ)Z")
    public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = arg0 + arg1 - 1;
        int var10 = arg3 + arg5 - 1;
        if (arg7) {
            throw new NullPointerException();
        } else if (arg6 >= arg1 && arg6 <= var9 && arg2 >= arg5 && arg2 <= var10) {
            return true;
        } else if (arg1 - 1 == arg6 && arg2 >= arg5 && arg2 <= var10 && (this.field1091[arg6 - this.field1087][arg2 - this.field1088] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg2 >= arg5 && arg2 <= var10 && (this.field1091[arg6 - this.field1087][arg2 - this.field1088] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg2 && arg6 >= arg1 && arg6 <= var9 && (this.field1091[arg6 - this.field1087][arg2 - this.field1088] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg6 >= arg1 && arg6 <= var9 && (this.field1091[arg6 - this.field1087][arg2 - this.field1088] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }
}
