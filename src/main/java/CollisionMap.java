import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class CollisionMap {

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field897 = -9381;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field898 = true;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private boolean field899 = false;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field900 = 8;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private int field901 = -31746;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private int field902 = 34304;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    public int field903 = 0;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    public int field904 = 0;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[[I")
    public int[][] field907;

    @OriginalMember(owner = "ec", name = "<init>", descriptor = "(IIZ)V")
    public CollisionMap(int arg0, int arg1, boolean arg2) {
        this.field905 = arg1;
        this.field906 = arg0;
        this.field907 = new int[this.field905][this.field906];
        this.method295(true);
        if (!arg2) {
            this.field899 = !this.field899;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)V")
    public void method295(boolean arg0) {
        for (int var2 = 0; var2 < this.field905; var2++) {
            for (int var3 = 0; var3 < this.field906; var3++) {
                if (var2 == 0 || var3 == 0 || this.field905 - 1 == var2 || this.field906 - 1 == var3) {
                    this.field907[var2][var3] = 16777215;
                } else {
                    this.field907[var2][var3] = 0;
                }
            }
        }
        if (!arg0) {
            this.field901 = 125;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIZIBI)V")
    public void method296(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 3) {
            return;
        }
        int var7 = arg0 - this.field903;
        int var8 = arg3 - this.field904;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method299(var7, var8, 128);
                this.method299(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 2);
                this.method299(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 8);
                this.method299(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 32);
                this.method299(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method299(var7, var8, 1);
                this.method299(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 4);
                this.method299(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 16);
                this.method299(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 64);
                this.method299(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method299(var7, var8, 130);
                this.method299(var7 - 1, var8, 8);
                this.method299(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 10);
                this.method299(var7, var8 + 1, 32);
                this.method299(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 40);
                this.method299(var7 + 1, var8, 128);
                this.method299(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 160);
                this.method299(var7, var8 - 1, 2);
                this.method299(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method299(var7, var8, 65536);
                this.method299(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 1024);
                this.method299(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 4096);
                this.method299(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 16384);
                this.method299(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method299(var7, var8, 512);
                this.method299(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method299(var7, var8, 2048);
                this.method299(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method299(var7, var8, 8192);
                this.method299(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method299(var7, var8, 32768);
                this.method299(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method299(var7, var8, 66560);
            this.method299(var7 - 1, var8, 4096);
            this.method299(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method299(var7, var8, 5120);
            this.method299(var7, var8 + 1, 16384);
            this.method299(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method299(var7, var8, 20480);
            this.method299(var7 + 1, var8, 65536);
            this.method299(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method299(var7, var8, 81920);
            this.method299(var7, var8 - 1, 1024);
            this.method299(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZIIIII)V")
    public void method297(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        int var9 = 84 / arg6;
        if (arg1) {
            var8 += 131072;
        }
        int var10 = arg2 - this.field903;
        int var11 = arg4 - this.field904;
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg0;
            arg0 = arg5;
            arg5 = var12;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field905) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field906) {
                        this.method299(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(III)V")
    public void method298(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field903;
        int var5 = arg2 - this.field904;
        if (arg1 != -31617) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field907[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(III)V")
    private void method299(int arg0, int arg1, int arg2) {
        this.field907[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIZI)V")
    public void method300(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg2 - this.field903;
        int var8 = arg0 - this.field904;
        if (arg5 != 16629) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method302(128, var7, -909, var8);
                this.method302(8, var7 - 1, -909, var8);
            }
            if (arg1 == 1) {
                this.method302(2, var7, -909, var8);
                this.method302(32, var7, -909, var8 + 1);
            }
            if (arg1 == 2) {
                this.method302(8, var7, -909, var8);
                this.method302(128, var7 + 1, -909, var8);
            }
            if (arg1 == 3) {
                this.method302(32, var7, -909, var8);
                this.method302(2, var7, -909, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method302(1, var7, -909, var8);
                this.method302(16, var7 - 1, -909, var8 + 1);
            }
            if (arg1 == 1) {
                this.method302(4, var7, -909, var8);
                this.method302(64, var7 + 1, -909, var8 + 1);
            }
            if (arg1 == 2) {
                this.method302(16, var7, -909, var8);
                this.method302(1, var7 + 1, -909, var8 - 1);
            }
            if (arg1 == 3) {
                this.method302(64, var7, -909, var8);
                this.method302(4, var7 - 1, -909, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method302(130, var7, -909, var8);
                this.method302(8, var7 - 1, -909, var8);
                this.method302(32, var7, -909, var8 + 1);
            }
            if (arg1 == 1) {
                this.method302(10, var7, -909, var8);
                this.method302(32, var7, -909, var8 + 1);
                this.method302(128, var7 + 1, -909, var8);
            }
            if (arg1 == 2) {
                this.method302(40, var7, -909, var8);
                this.method302(128, var7 + 1, -909, var8);
                this.method302(2, var7, -909, var8 - 1);
            }
            if (arg1 == 3) {
                this.method302(160, var7, -909, var8);
                this.method302(2, var7, -909, var8 - 1);
                this.method302(8, var7 - 1, -909, var8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method302(65536, var7, -909, var8);
                this.method302(4096, var7 - 1, -909, var8);
            }
            if (arg1 == 1) {
                this.method302(1024, var7, -909, var8);
                this.method302(16384, var7, -909, var8 + 1);
            }
            if (arg1 == 2) {
                this.method302(4096, var7, -909, var8);
                this.method302(65536, var7 + 1, -909, var8);
            }
            if (arg1 == 3) {
                this.method302(16384, var7, -909, var8);
                this.method302(1024, var7, -909, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method302(512, var7, -909, var8);
                this.method302(8192, var7 - 1, -909, var8 + 1);
            }
            if (arg1 == 1) {
                this.method302(2048, var7, -909, var8);
                this.method302(32768, var7 + 1, -909, var8 + 1);
            }
            if (arg1 == 2) {
                this.method302(8192, var7, -909, var8);
                this.method302(512, var7 + 1, -909, var8 - 1);
            }
            if (arg1 == 3) {
                this.method302(32768, var7, -909, var8);
                this.method302(2048, var7 - 1, -909, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method302(66560, var7, -909, var8);
            this.method302(4096, var7 - 1, -909, var8);
            this.method302(16384, var7, -909, var8 + 1);
        }
        if (arg1 == 1) {
            this.method302(5120, var7, -909, var8);
            this.method302(16384, var7, -909, var8 + 1);
            this.method302(65536, var7 + 1, -909, var8);
        }
        if (arg1 == 2) {
            this.method302(20480, var7, -909, var8);
            this.method302(65536, var7 + 1, -909, var8);
            this.method302(1024, var7, -909, var8 - 1);
        }
        if (arg1 == 3) {
            this.method302(81920, var7, -909, var8);
            this.method302(1024, var7, -909, var8 - 1);
            this.method302(4096, var7 - 1, -909, var8);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIZII)V")
    public void method301(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field903;
        int var10 = arg3 - this.field904;
        if (arg6 < 5 || arg6 > 5) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg5;
            arg5 = arg2;
            arg2 = var12;
        }
        for (int var13 = var9; var13 < arg5 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field905) {
                for (int var14 = var10; var14 < arg2 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field906) {
                        this.method302(var8, var13, -909, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)V")
    private void method302(int arg0, int arg1, int arg2, int arg3) {
        this.field907[arg1][arg3] &= 16777215 - arg0;
        if (arg2 >= 0) {
            this.field902 = -460;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BII)V")
    public void method303(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field903;
        if (arg0 == 5) {
            boolean var5 = false;
        } else {
            this.field899 = !this.field899;
        }
        int var6 = arg1 - this.field904;
        this.field907[var4][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIZI)Z")
    public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 == arg6 && arg2 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field903;
        if (!arg5) {
            throw new NullPointerException();
        }
        int var9 = arg3 - this.field904;
        int var10 = arg1 - this.field903;
        int var11 = arg2 - this.field904;
        if (arg0 == 0) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIIIIII)Z")
    public boolean method305(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg1 == arg2) {
            return true;
        }
        int var8 = arg6 - this.field903;
        int var9 = arg2 - this.field904;
        if (arg0) {
            throw new NullPointerException();
        }
        int var10 = arg4 - this.field903;
        int var11 = arg1 - this.field904;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field907[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field907[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field907[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIZII)Z")
    public boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            throw new NullPointerException();
        }
        int var9 = arg1 + arg7 - 1;
        int var10 = arg0 + arg6 - 1;
        if (arg4 >= arg1 && arg4 <= var9 && arg2 >= arg0 && arg2 <= var10) {
            return true;
        } else if (arg1 - 1 == arg4 && arg2 >= arg0 && arg2 <= var10 && (this.field907[arg4 - this.field903][arg2 - this.field904] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg2 >= arg0 && arg2 <= var10 && (this.field907[arg4 - this.field903][arg2 - this.field904] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg2 && arg4 >= arg1 && arg4 <= var9 && (this.field907[arg4 - this.field903][arg2 - this.field904] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg4 >= arg1 && arg4 <= var9 && (this.field907[arg4 - this.field903][arg2 - this.field904] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
