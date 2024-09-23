import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private boolean field1076 = true;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1077 = -49006;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    private int field1079 = 936;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1080 = 26912;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1081 = 0;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1082 = 0;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[[I")
    public int[][] field1085;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(BII)V")
    public CollisionMap(byte arg0, int arg1, int arg2) {
        this.field1083 = arg1;
        if (arg0 != -97) {
            throw new NullPointerException();
        }
        this.field1084 = arg2;
        this.field1085 = new int[this.field1083][this.field1084];
        this.method353(-49006);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I)V")
    public void method353(int arg0) {
        if (this.field1077 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < this.field1083; var3++) {
            for (int var4 = 0; var4 < this.field1084; var4++) {
                if (var3 == 0 || var4 == 0 || this.field1083 - 1 == var3 || this.field1084 - 1 == var4) {
                    this.field1085[var3][var4] = 16777215;
                } else {
                    this.field1085[var3][var4] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZ)V")
    public void method354(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 49 / arg1;
        int var8 = arg3 - this.field1081;
        int var9 = arg0 - this.field1082;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method357(var8, var9, 128);
                this.method357(var8 - 1, var9, 8);
            }
            if (arg2 == 1) {
                this.method357(var8, var9, 2);
                this.method357(var8, var9 + 1, 32);
            }
            if (arg2 == 2) {
                this.method357(var8, var9, 8);
                this.method357(var8 + 1, var9, 128);
            }
            if (arg2 == 3) {
                this.method357(var8, var9, 32);
                this.method357(var8, var9 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method357(var8, var9, 1);
                this.method357(var8 - 1, var9 + 1, 16);
            }
            if (arg2 == 1) {
                this.method357(var8, var9, 4);
                this.method357(var8 + 1, var9 + 1, 64);
            }
            if (arg2 == 2) {
                this.method357(var8, var9, 16);
                this.method357(var8 + 1, var9 - 1, 1);
            }
            if (arg2 == 3) {
                this.method357(var8, var9, 64);
                this.method357(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method357(var8, var9, 130);
                this.method357(var8 - 1, var9, 8);
                this.method357(var8, var9 + 1, 32);
            }
            if (arg2 == 1) {
                this.method357(var8, var9, 10);
                this.method357(var8, var9 + 1, 32);
                this.method357(var8 + 1, var9, 128);
            }
            if (arg2 == 2) {
                this.method357(var8, var9, 40);
                this.method357(var8 + 1, var9, 128);
                this.method357(var8, var9 - 1, 2);
            }
            if (arg2 == 3) {
                this.method357(var8, var9, 160);
                this.method357(var8, var9 - 1, 2);
                this.method357(var8 - 1, var9, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method357(var8, var9, 65536);
                this.method357(var8 - 1, var9, 4096);
            }
            if (arg2 == 1) {
                this.method357(var8, var9, 1024);
                this.method357(var8, var9 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method357(var8, var9, 4096);
                this.method357(var8 + 1, var9, 65536);
            }
            if (arg2 == 3) {
                this.method357(var8, var9, 16384);
                this.method357(var8, var9 - 1, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method357(var8, var9, 512);
                this.method357(var8 - 1, var9 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method357(var8, var9, 2048);
                this.method357(var8 + 1, var9 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method357(var8, var9, 8192);
                this.method357(var8 + 1, var9 - 1, 512);
            }
            if (arg2 == 3) {
                this.method357(var8, var9, 32768);
                this.method357(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method357(var8, var9, 66560);
            this.method357(var8 - 1, var9, 4096);
            this.method357(var8, var9 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method357(var8, var9, 5120);
            this.method357(var8, var9 + 1, 16384);
            this.method357(var8 + 1, var9, 65536);
        }
        if (arg2 == 2) {
            this.method357(var8, var9, 20480);
            this.method357(var8 + 1, var9, 65536);
            this.method357(var8, var9 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method357(var8, var9, 81920);
            this.method357(var8, var9 - 1, 1024);
            this.method357(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZBI)V")
    public void method355(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        if (arg5 != 5) {
            return;
        }
        boolean var8 = false;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        int var10 = arg3 - this.field1081;
        int var11 = arg0 - this.field1082;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg2;
            arg2 = arg1;
            arg1 = var12;
        }
        for (int var13 = var10; var13 < arg2 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1083) {
                for (int var14 = var11; var14 < arg1 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1084) {
                        this.method357(var13, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IZI)V")
    public void method356(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            int var4 = arg0 - this.field1081;
            int var5 = arg2 - this.field1082;
            this.field1085[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method357(int arg0, int arg1, int arg2) {
        this.field1085[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(IIIIIZ)V")
    public void method358(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg2 - this.field1081;
        if (arg0 != 0) {
            this.field1076 = !this.field1076;
        }
        int var8 = arg1 - this.field1082;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method360(128, var8, 921, var7);
                this.method360(8, var8, 921, var7 - 1);
            }
            if (arg3 == 1) {
                this.method360(2, var8, 921, var7);
                this.method360(32, var8 + 1, 921, var7);
            }
            if (arg3 == 2) {
                this.method360(8, var8, 921, var7);
                this.method360(128, var8, 921, var7 + 1);
            }
            if (arg3 == 3) {
                this.method360(32, var8, 921, var7);
                this.method360(2, var8 - 1, 921, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method360(1, var8, 921, var7);
                this.method360(16, var8 + 1, 921, var7 - 1);
            }
            if (arg3 == 1) {
                this.method360(4, var8, 921, var7);
                this.method360(64, var8 + 1, 921, var7 + 1);
            }
            if (arg3 == 2) {
                this.method360(16, var8, 921, var7);
                this.method360(1, var8 - 1, 921, var7 + 1);
            }
            if (arg3 == 3) {
                this.method360(64, var8, 921, var7);
                this.method360(4, var8 - 1, 921, var7 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method360(130, var8, 921, var7);
                this.method360(8, var8, 921, var7 - 1);
                this.method360(32, var8 + 1, 921, var7);
            }
            if (arg3 == 1) {
                this.method360(10, var8, 921, var7);
                this.method360(32, var8 + 1, 921, var7);
                this.method360(128, var8, 921, var7 + 1);
            }
            if (arg3 == 2) {
                this.method360(40, var8, 921, var7);
                this.method360(128, var8, 921, var7 + 1);
                this.method360(2, var8 - 1, 921, var7);
            }
            if (arg3 == 3) {
                this.method360(160, var8, 921, var7);
                this.method360(2, var8 - 1, 921, var7);
                this.method360(8, var8, 921, var7 - 1);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method360(65536, var8, 921, var7);
                this.method360(4096, var8, 921, var7 - 1);
            }
            if (arg3 == 1) {
                this.method360(1024, var8, 921, var7);
                this.method360(16384, var8 + 1, 921, var7);
            }
            if (arg3 == 2) {
                this.method360(4096, var8, 921, var7);
                this.method360(65536, var8, 921, var7 + 1);
            }
            if (arg3 == 3) {
                this.method360(16384, var8, 921, var7);
                this.method360(1024, var8 - 1, 921, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method360(512, var8, 921, var7);
                this.method360(8192, var8 + 1, 921, var7 - 1);
            }
            if (arg3 == 1) {
                this.method360(2048, var8, 921, var7);
                this.method360(32768, var8 + 1, 921, var7 + 1);
            }
            if (arg3 == 2) {
                this.method360(8192, var8, 921, var7);
                this.method360(512, var8 - 1, 921, var7 + 1);
            }
            if (arg3 == 3) {
                this.method360(32768, var8, 921, var7);
                this.method360(2048, var8 - 1, 921, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method360(66560, var8, 921, var7);
            this.method360(4096, var8, 921, var7 - 1);
            this.method360(16384, var8 + 1, 921, var7);
        }
        if (arg3 == 1) {
            this.method360(5120, var8, 921, var7);
            this.method360(16384, var8 + 1, 921, var7);
            this.method360(65536, var8, 921, var7 + 1);
        }
        if (arg3 == 2) {
            this.method360(20480, var8, 921, var7);
            this.method360(65536, var8, 921, var7 + 1);
            this.method360(1024, var8 - 1, 921, var7);
        }
        if (arg3 == 3) {
            this.method360(81920, var8, 921, var7);
            this.method360(1024, var8 - 1, 921, var7);
            this.method360(4096, var8, 921, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIZ)V")
    public void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 >= 0) {
            this.field1076 = !this.field1076;
        }
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1081;
        int var10 = arg1 - this.field1082;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1083) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1084) {
                        this.method360(var8, var13, 921, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method360(int arg0, int arg1, int arg2, int arg3) {
        this.field1085[arg3][arg1] &= 16777215 - arg0;
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IBI)V")
    public void method361(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field1081;
        if (arg1 != -21) {
            this.field1078 = 394;
        }
        int var5 = arg2 - this.field1082;
        this.field1085[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIZIII)Z")
    public boolean method362(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            this.field1078 = -102;
        }
        if (arg4 == arg5 && arg0 == arg2) {
            return true;
        }
        int var8 = arg4 - this.field1081;
        int var9 = arg0 - this.field1082;
        int var10 = arg5 - this.field1081;
        int var11 = arg2 - this.field1082;
        if (arg6 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg4 && arg1 == arg3) {
            return true;
        }
        int var8 = arg0 - this.field1081;
        int var9 = arg1 - this.field1082;
        if (arg6 >= 0) {
            this.field1078 = -472;
        }
        int var10 = arg4 - this.field1081;
        int var11 = arg3 - this.field1082;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1085[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1085[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1085[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg3 - 1;
        int var10 = arg2 + arg7 - 1;
        int var11 = 17 / arg4;
        if (arg1 >= arg0 && arg1 <= var9 && arg5 >= arg2 && arg5 <= var10) {
            return true;
        } else if (arg0 - 1 == arg1 && arg5 >= arg2 && arg5 <= var10 && (this.field1085[arg1 - this.field1081][arg5 - this.field1082] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg1 && arg5 >= arg2 && arg5 <= var10 && (this.field1085[arg1 - this.field1081][arg5 - this.field1082] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg5 && arg1 >= arg0 && arg1 <= var9 && (this.field1085[arg1 - this.field1081][arg5 - this.field1082] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg1 >= arg0 && arg1 <= var9 && (this.field1085[arg1 - this.field1081][arg5 - this.field1082] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
