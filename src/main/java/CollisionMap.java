import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private int field1083 = 701;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1084 = 1;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1085 = 1;

    @OriginalMember(owner = "jc", name = "d", descriptor = "Z")
    private boolean field1086 = false;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1087 = 1;

    @OriginalMember(owner = "jc", name = "f", descriptor = "Z")
    private boolean field1088 = false;

    @OriginalMember(owner = "jc", name = "g", descriptor = "Z")
    private boolean field1089 = false;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "jc", name = "l", descriptor = "[[I")
    public int[][] field1094;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(IIZ)V")
    public CollisionMap(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            throw new NullPointerException();
        }
        this.field1090 = 0;
        this.field1091 = 0;
        this.field1092 = arg1;
        this.field1093 = arg0;
        this.field1094 = new int[this.field1092][this.field1093];
        this.method352((byte) 5);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(B)V")
    public void method352(byte arg0) {
        for (int var2 = 0; var2 < this.field1092; var2++) {
            for (int var5 = 0; var5 < this.field1093; var5++) {
                if (var2 == 0 || var5 == 0 || this.field1092 - 1 == var2 || this.field1093 - 1 == var5) {
                    this.field1094[var2][var5] = 16777215;
                } else {
                    this.field1094[var2][var5] = 0;
                }
            }
        }
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIBI)V")
    public void method353(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg5 - this.field1090;
        int var8 = arg3 - this.field1091;
        if (arg4 != 25) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method356(var7, var8, 128);
                this.method356(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method356(var7, var8, 2);
                this.method356(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method356(var7, var8, 8);
                this.method356(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method356(var7, var8, 32);
                this.method356(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method356(var7, var8, 1);
                this.method356(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method356(var7, var8, 4);
                this.method356(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method356(var7, var8, 16);
                this.method356(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method356(var7, var8, 64);
                this.method356(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method356(var7, var8, 130);
                this.method356(var7 - 1, var8, 8);
                this.method356(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method356(var7, var8, 10);
                this.method356(var7, var8 + 1, 32);
                this.method356(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method356(var7, var8, 40);
                this.method356(var7 + 1, var8, 128);
                this.method356(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method356(var7, var8, 160);
                this.method356(var7, var8 - 1, 2);
                this.method356(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method356(var7, var8, 65536);
                this.method356(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method356(var7, var8, 1024);
                this.method356(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method356(var7, var8, 4096);
                this.method356(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method356(var7, var8, 16384);
                this.method356(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method356(var7, var8, 512);
                this.method356(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method356(var7, var8, 2048);
                this.method356(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method356(var7, var8, 8192);
                this.method356(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method356(var7, var8, 32768);
                this.method356(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method356(var7, var8, 66560);
            this.method356(var7 - 1, var8, 4096);
            this.method356(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method356(var7, var8, 5120);
            this.method356(var7, var8 + 1, 16384);
            this.method356(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method356(var7, var8, 20480);
            this.method356(var7 + 1, var8, 65536);
            this.method356(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method356(var7, var8, 81920);
            this.method356(var7, var8 - 1, 1024);
            this.method356(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZI)V")
    public void method354(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1090;
        if (arg6 < 9 || arg6 > 9) {
            this.field1083 = -131;
        }
        int var10 = arg3 - this.field1091;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg0;
            arg0 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1092) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1093) {
                        this.method356(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZII)V")
    public void method355(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1090;
        if (arg0) {
            int var5 = arg2 - this.field1091;
            this.field1094[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method356(int arg0, int arg1, int arg2) {
        this.field1094[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BIZIII)V")
    public void method357(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1090;
        int var8 = arg4 - this.field1091;
        if (arg0 != 3) {
            this.field1089 = !this.field1089;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method359(var8, this.field1084, 128, var7);
                this.method359(var8, this.field1084, 8, var7 - 1);
            }
            if (arg3 == 1) {
                this.method359(var8, this.field1084, 2, var7);
                this.method359(var8 + 1, this.field1084, 32, var7);
            }
            if (arg3 == 2) {
                this.method359(var8, this.field1084, 8, var7);
                this.method359(var8, this.field1084, 128, var7 + 1);
            }
            if (arg3 == 3) {
                this.method359(var8, this.field1084, 32, var7);
                this.method359(var8 - 1, this.field1084, 2, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method359(var8, this.field1084, 1, var7);
                this.method359(var8 + 1, this.field1084, 16, var7 - 1);
            }
            if (arg3 == 1) {
                this.method359(var8, this.field1084, 4, var7);
                this.method359(var8 + 1, this.field1084, 64, var7 + 1);
            }
            if (arg3 == 2) {
                this.method359(var8, this.field1084, 16, var7);
                this.method359(var8 - 1, this.field1084, 1, var7 + 1);
            }
            if (arg3 == 3) {
                this.method359(var8, this.field1084, 64, var7);
                this.method359(var8 - 1, this.field1084, 4, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method359(var8, this.field1084, 130, var7);
                this.method359(var8, this.field1084, 8, var7 - 1);
                this.method359(var8 + 1, this.field1084, 32, var7);
            }
            if (arg3 == 1) {
                this.method359(var8, this.field1084, 10, var7);
                this.method359(var8 + 1, this.field1084, 32, var7);
                this.method359(var8, this.field1084, 128, var7 + 1);
            }
            if (arg3 == 2) {
                this.method359(var8, this.field1084, 40, var7);
                this.method359(var8, this.field1084, 128, var7 + 1);
                this.method359(var8 - 1, this.field1084, 2, var7);
            }
            if (arg3 == 3) {
                this.method359(var8, this.field1084, 160, var7);
                this.method359(var8 - 1, this.field1084, 2, var7);
                this.method359(var8, this.field1084, 8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method359(var8, this.field1084, 65536, var7);
                this.method359(var8, this.field1084, 4096, var7 - 1);
            }
            if (arg3 == 1) {
                this.method359(var8, this.field1084, 1024, var7);
                this.method359(var8 + 1, this.field1084, 16384, var7);
            }
            if (arg3 == 2) {
                this.method359(var8, this.field1084, 4096, var7);
                this.method359(var8, this.field1084, 65536, var7 + 1);
            }
            if (arg3 == 3) {
                this.method359(var8, this.field1084, 16384, var7);
                this.method359(var8 - 1, this.field1084, 1024, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method359(var8, this.field1084, 512, var7);
                this.method359(var8 + 1, this.field1084, 8192, var7 - 1);
            }
            if (arg3 == 1) {
                this.method359(var8, this.field1084, 2048, var7);
                this.method359(var8 + 1, this.field1084, 32768, var7 + 1);
            }
            if (arg3 == 2) {
                this.method359(var8, this.field1084, 8192, var7);
                this.method359(var8 - 1, this.field1084, 512, var7 + 1);
            }
            if (arg3 == 3) {
                this.method359(var8, this.field1084, 32768, var7);
                this.method359(var8 - 1, this.field1084, 2048, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method359(var8, this.field1084, 66560, var7);
            this.method359(var8, this.field1084, 4096, var7 - 1);
            this.method359(var8 + 1, this.field1084, 16384, var7);
        }
        if (arg3 == 1) {
            this.method359(var8, this.field1084, 5120, var7);
            this.method359(var8 + 1, this.field1084, 16384, var7);
            this.method359(var8, this.field1084, 65536, var7 + 1);
        }
        if (arg3 == 2) {
            this.method359(var8, this.field1084, 20480, var7);
            this.method359(var8, this.field1084, 65536, var7 + 1);
            this.method359(var8 - 1, this.field1084, 1024, var7);
        }
        if (arg3 == 3) {
            this.method359(var8, this.field1084, 81920, var7);
            this.method359(var8 - 1, this.field1084, 1024, var7);
            this.method359(var8, this.field1084, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(IIIIIZI)V")
    public void method358(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg0 >= 0) {
            return;
        }
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field1090;
        int var10 = arg3 - this.field1091;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg1;
            arg1 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1092) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1093) {
                        this.method359(var13, this.field1084, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method359(int arg0, int arg1, int arg2, int arg3) {
        this.field1094[arg3][arg0] &= 16777215 - arg2;
        if (arg1 < this.field1085 || arg1 > this.field1085) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    public void method360(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1090;
        int var5 = arg2 - this.field1091;
        if (arg1 != 0) {
            this.field1088 = !this.field1088;
        }
        this.field1094[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIIII)Z")
    public boolean method361(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg3 && arg4 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field1090;
        int var9 = arg6 - this.field1091;
        int var10 = arg3 - this.field1090;
        if (arg0) {
            throw new NullPointerException();
        }
        int var11 = arg4 - this.field1091;
        if (arg5 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg2 && arg1 == arg5) {
            return true;
        }
        int var8 = arg2 - this.field1090;
        int var9 = arg5 - this.field1091;
        if (arg6 != 6) {
            this.field1084 = -116;
        }
        int var10 = arg0 - this.field1090;
        int var11 = arg1 - this.field1091;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1094[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1094[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1094[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field1087 != arg3) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg0 + arg1 - 1;
        int var11 = arg4 + arg7 - 1;
        if (arg6 >= arg0 && arg6 <= var10 && arg5 >= arg4 && arg5 <= var11) {
            return true;
        } else if (arg0 - 1 == arg6 && arg5 >= arg4 && arg5 <= var11 && (this.field1094[arg6 - this.field1090][arg5 - this.field1091] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg5 >= arg4 && arg5 <= var11 && (this.field1094[arg6 - this.field1090][arg5 - this.field1091] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg5 && arg6 >= arg0 && arg6 <= var10 && (this.field1094[arg6 - this.field1090][arg5 - this.field1091] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg6 >= arg0 && arg6 <= var10 && (this.field1094[arg6 - this.field1090][arg5 - this.field1091] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
