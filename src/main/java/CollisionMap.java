import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ic")
public class CollisionMap {

    @OriginalMember(owner = "ic", name = "a", descriptor = "Z")
    private boolean field1035 = false;

    @OriginalMember(owner = "ic", name = "c", descriptor = "I")
    private int field1037 = -584;

    @OriginalMember(owner = "ic", name = "d", descriptor = "B")
    private byte field1038 = 84;

    @OriginalMember(owner = "ic", name = "e", descriptor = "Z")
    private boolean field1039 = false;

    @OriginalMember(owner = "ic", name = "f", descriptor = "I")
    public int field1040 = 0;

    @OriginalMember(owner = "ic", name = "g", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "ic", name = "h", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "ic", name = "i", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "ic", name = "j", descriptor = "[[I")
    public int[][] field1044;

    @OriginalMember(owner = "ic", name = "b", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "ic", name = "<init>", descriptor = "(ZII)V")
    public CollisionMap(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1041 = 0;
        this.field1042 = arg2;
        this.field1043 = arg1;
        this.field1044 = new int[this.field1042][this.field1043];
        this.method350(this.field1036);
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(I)V")
    public void method350(int arg0) {
        for (int var2 = 0; var2 < this.field1042; var2++) {
            for (int var3 = 0; var3 < this.field1043; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1042 - 1 == var2 || this.field1043 - 1 == var3) {
                    this.field1044[var2][var3] = 16777215;
                } else {
                    this.field1044[var2][var3] = 0;
                }
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIIIIZ)V")
    public void method351(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 >= 0) {
            return;
        }
        int var7 = arg4 - this.field1040;
        int var8 = arg2 - this.field1041;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method354(var7, var8, 128);
                this.method354(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method354(var7, var8, 2);
                this.method354(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method354(var7, var8, 8);
                this.method354(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method354(var7, var8, 32);
                this.method354(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method354(var7, var8, 1);
                this.method354(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method354(var7, var8, 4);
                this.method354(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method354(var7, var8, 16);
                this.method354(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method354(var7, var8, 64);
                this.method354(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method354(var7, var8, 130);
                this.method354(var7 - 1, var8, 8);
                this.method354(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method354(var7, var8, 10);
                this.method354(var7, var8 + 1, 32);
                this.method354(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method354(var7, var8, 40);
                this.method354(var7 + 1, var8, 128);
                this.method354(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method354(var7, var8, 160);
                this.method354(var7, var8 - 1, 2);
                this.method354(var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method354(var7, var8, 65536);
                this.method354(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method354(var7, var8, 1024);
                this.method354(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method354(var7, var8, 4096);
                this.method354(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method354(var7, var8, 16384);
                this.method354(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method354(var7, var8, 512);
                this.method354(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method354(var7, var8, 2048);
                this.method354(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method354(var7, var8, 8192);
                this.method354(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method354(var7, var8, 32768);
                this.method354(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method354(var7, var8, 66560);
            this.method354(var7 - 1, var8, 4096);
            this.method354(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method354(var7, var8, 5120);
            this.method354(var7, var8 + 1, 16384);
            this.method354(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method354(var7, var8, 20480);
            this.method354(var7 + 1, var8, 65536);
            this.method354(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method354(var7, var8, 81920);
            this.method354(var7, var8 - 1, 1024);
            this.method354(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIZIIII)V")
    public void method352(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field1040;
        int var10 = arg6 - this.field1041;
        if (arg5 >= 0) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg1;
            arg1 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1042) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1043) {
                        this.method354(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IZI)V")
    public void method353(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg0 - this.field1040;
        int var6 = arg2 - this.field1041;
        this.field1044[var5][var6] |= 0x200000;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(III)V")
    private void method354(int arg0, int arg1, int arg2) {
        this.field1044[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZIIIII)V")
    public void method355(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 7 || arg1 > 7) {
            this.field1037 = 438;
        }
        int var7 = arg4 - this.field1040;
        int var8 = arg5 - this.field1041;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method357(var8, var7, 128, -195);
                this.method357(var8, var7 - 1, 8, -195);
            }
            if (arg3 == 1) {
                this.method357(var8, var7, 2, -195);
                this.method357(var8 + 1, var7, 32, -195);
            }
            if (arg3 == 2) {
                this.method357(var8, var7, 8, -195);
                this.method357(var8, var7 + 1, 128, -195);
            }
            if (arg3 == 3) {
                this.method357(var8, var7, 32, -195);
                this.method357(var8 - 1, var7, 2, -195);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method357(var8, var7, 1, -195);
                this.method357(var8 + 1, var7 - 1, 16, -195);
            }
            if (arg3 == 1) {
                this.method357(var8, var7, 4, -195);
                this.method357(var8 + 1, var7 + 1, 64, -195);
            }
            if (arg3 == 2) {
                this.method357(var8, var7, 16, -195);
                this.method357(var8 - 1, var7 + 1, 1, -195);
            }
            if (arg3 == 3) {
                this.method357(var8, var7, 64, -195);
                this.method357(var8 - 1, var7 - 1, 4, -195);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method357(var8, var7, 130, -195);
                this.method357(var8, var7 - 1, 8, -195);
                this.method357(var8 + 1, var7, 32, -195);
            }
            if (arg3 == 1) {
                this.method357(var8, var7, 10, -195);
                this.method357(var8 + 1, var7, 32, -195);
                this.method357(var8, var7 + 1, 128, -195);
            }
            if (arg3 == 2) {
                this.method357(var8, var7, 40, -195);
                this.method357(var8, var7 + 1, 128, -195);
                this.method357(var8 - 1, var7, 2, -195);
            }
            if (arg3 == 3) {
                this.method357(var8, var7, 160, -195);
                this.method357(var8 - 1, var7, 2, -195);
                this.method357(var8, var7 - 1, 8, -195);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method357(var8, var7, 65536, -195);
                this.method357(var8, var7 - 1, 4096, -195);
            }
            if (arg3 == 1) {
                this.method357(var8, var7, 1024, -195);
                this.method357(var8 + 1, var7, 16384, -195);
            }
            if (arg3 == 2) {
                this.method357(var8, var7, 4096, -195);
                this.method357(var8, var7 + 1, 65536, -195);
            }
            if (arg3 == 3) {
                this.method357(var8, var7, 16384, -195);
                this.method357(var8 - 1, var7, 1024, -195);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method357(var8, var7, 512, -195);
                this.method357(var8 + 1, var7 - 1, 8192, -195);
            }
            if (arg3 == 1) {
                this.method357(var8, var7, 2048, -195);
                this.method357(var8 + 1, var7 + 1, 32768, -195);
            }
            if (arg3 == 2) {
                this.method357(var8, var7, 8192, -195);
                this.method357(var8 - 1, var7 + 1, 512, -195);
            }
            if (arg3 == 3) {
                this.method357(var8, var7, 32768, -195);
                this.method357(var8 - 1, var7 - 1, 2048, -195);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method357(var8, var7, 66560, -195);
            this.method357(var8, var7 - 1, 4096, -195);
            this.method357(var8 + 1, var7, 16384, -195);
        }
        if (arg3 == 1) {
            this.method357(var8, var7, 5120, -195);
            this.method357(var8 + 1, var7, 16384, -195);
            this.method357(var8, var7 + 1, 65536, -195);
        }
        if (arg3 == 2) {
            this.method357(var8, var7, 20480, -195);
            this.method357(var8, var7 + 1, 65536, -195);
            this.method357(var8 - 1, var7, 1024, -195);
        }
        if (arg3 == 3) {
            this.method357(var8, var7, 81920, -195);
            this.method357(var8 - 1, var7, 1024, -195);
            this.method357(var8, var7 - 1, 4096, -195);
            return;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IBIZIII)V")
    public void method356(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1040;
        int var10 = arg6 - this.field1041;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg0;
            arg0 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1042) {
                for (int var15 = var10; var15 < arg5 + var10; var15++) {
                    if (var15 >= 0 && var15 < this.field1043) {
                        this.method357(var15, var12, var8, -195);
                    }
                }
            }
        }
        if (arg1 == 7) {
            boolean var13 = false;
        } else {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIII)V")
    private void method357(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            this.field1036 = -453;
        }
        this.field1044[arg1][arg0] &= 16777215 - arg2;
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(III)V")
    public void method358(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1040;
        int var5 = arg1 - this.field1041;
        this.field1044[var4][var5] &= 0xDFFFFF;
        if (arg0 != 0) {
            this.field1035 = !this.field1035;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 == arg6 && arg1 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field1040;
        int var9 = arg4 - this.field1041;
        int var10 = arg6 - this.field1040;
        while (arg0 >= 0) {
            this.field1037 = 477;
        }
        int var11 = arg1 - this.field1041;
        if (arg2 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method360(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg3 == arg6 && arg0 == arg1) {
            return true;
        }
        int var8 = arg6 - this.field1040;
        int var9 = arg0 - this.field1041;
        int var10 = arg3 - this.field1040;
        if (!arg4) {
            this.field1037 = 376;
        }
        int var11 = arg1 - this.field1041;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1044[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1044[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1044[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIIIIBII)Z")
    public boolean method361(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != -14) {
            this.field1039 = !this.field1039;
        }
        int var9 = arg2 + arg6 - 1;
        int var10 = arg3 + arg7 - 1;
        if (arg0 >= arg2 && arg0 <= var9 && arg4 >= arg3 && arg4 <= var10) {
            return true;
        } else if (arg2 - 1 == arg0 && arg4 >= arg3 && arg4 <= var10 && (this.field1044[arg0 - this.field1040][arg4 - this.field1041] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg4 >= arg3 && arg4 <= var10 && (this.field1044[arg0 - this.field1040][arg4 - this.field1041] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg4 && arg0 >= arg2 && arg0 <= var9 && (this.field1044[arg0 - this.field1040][arg4 - this.field1041] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg4 && arg0 >= arg2 && arg0 <= var9 && (this.field1044[arg0 - this.field1040][arg4 - this.field1041] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
