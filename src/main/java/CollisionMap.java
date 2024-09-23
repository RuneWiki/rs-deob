import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class CollisionMap {

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private int field1081 = -883;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private int field1083 = -21590;

    @OriginalMember(owner = "jc", name = "d", descriptor = "Z")
    private boolean field1084 = false;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    private int field1085 = 5;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[[I")
    public int[][] field1090;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "jc", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1086 = 0;
        this.field1087 = 0;
        this.field1088 = arg2;
        this.field1089 = arg0;
        this.field1090 = new int[this.field1088][this.field1089];
        this.method352(true);
        if (Linkable.field360) {
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Z)V")
    public void method352(boolean arg0) {
        if (!arg0) {
            this.field1081 = -202;
        }
        for (int var2 = 0; var2 < this.field1088; var2++) {
            for (int var3 = 0; var3 < this.field1089; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1088 - 1 == var2 || this.field1089 - 1 == var3) {
                    this.field1090[var2][var3] = 16777215;
                } else {
                    this.field1090[var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIII)V")
    public void method353(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg4 - this.field1086;
        int var9 = arg3 - this.field1087;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method356(var8, var9, 128);
                this.method356(var8 - 1, var9, 8);
            }
            if (arg1 == 1) {
                this.method356(var8, var9, 2);
                this.method356(var8, var9 + 1, 32);
            }
            if (arg1 == 2) {
                this.method356(var8, var9, 8);
                this.method356(var8 + 1, var9, 128);
            }
            if (arg1 == 3) {
                this.method356(var8, var9, 32);
                this.method356(var8, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method356(var8, var9, 1);
                this.method356(var8 - 1, var9 + 1, 16);
            }
            if (arg1 == 1) {
                this.method356(var8, var9, 4);
                this.method356(var8 + 1, var9 + 1, 64);
            }
            if (arg1 == 2) {
                this.method356(var8, var9, 16);
                this.method356(var8 + 1, var9 - 1, 1);
            }
            if (arg1 == 3) {
                this.method356(var8, var9, 64);
                this.method356(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method356(var8, var9, 130);
                this.method356(var8 - 1, var9, 8);
                this.method356(var8, var9 + 1, 32);
            }
            if (arg1 == 1) {
                this.method356(var8, var9, 10);
                this.method356(var8, var9 + 1, 32);
                this.method356(var8 + 1, var9, 128);
            }
            if (arg1 == 2) {
                this.method356(var8, var9, 40);
                this.method356(var8 + 1, var9, 128);
                this.method356(var8, var9 - 1, 2);
            }
            if (arg1 == 3) {
                this.method356(var8, var9, 160);
                this.method356(var8, var9 - 1, 2);
                this.method356(var8 - 1, var9, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method356(var8, var9, 65536);
                this.method356(var8 - 1, var9, 4096);
            }
            if (arg1 == 1) {
                this.method356(var8, var9, 1024);
                this.method356(var8, var9 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method356(var8, var9, 4096);
                this.method356(var8 + 1, var9, 65536);
            }
            if (arg1 == 3) {
                this.method356(var8, var9, 16384);
                this.method356(var8, var9 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method356(var8, var9, 512);
                this.method356(var8 - 1, var9 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method356(var8, var9, 2048);
                this.method356(var8 + 1, var9 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method356(var8, var9, 8192);
                this.method356(var8 + 1, var9 - 1, 512);
            }
            if (arg1 == 3) {
                this.method356(var8, var9, 32768);
                this.method356(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method356(var8, var9, 66560);
            this.method356(var8 - 1, var9, 4096);
            this.method356(var8, var9 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method356(var8, var9, 5120);
            this.method356(var8, var9 + 1, 16384);
            this.method356(var8 + 1, var9, 65536);
        }
        if (arg1 == 2) {
            this.method356(var8, var9, 20480);
            this.method356(var8 + 1, var9, 65536);
            this.method356(var8, var9 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method356(var8, var9, 81920);
            this.method356(var8, var9 - 1, 1024);
            this.method356(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIZIIII)V")
    public void method354(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field1086;
        if (arg5 != 0) {
            this.field1082 = -461;
        }
        int var10 = arg1 - this.field1087;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1088) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1089) {
                        this.method356(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IBI)V")
    public void method355(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field1086;
        int var5 = arg2 - this.field1087;
        if (arg1 == 79) {
            this.field1090[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(III)V")
    private void method356(int arg0, int arg1, int arg2) {
        this.field1090[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIZ)V")
    public void method357(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1 - this.field1086;
        int var8 = arg3 - this.field1087;
        if (arg4 != 0) {
            this.field1084 = !this.field1084;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method359(var8, 128, var7, -24643);
                this.method359(var8, 8, var7 - 1, -24643);
            }
            if (arg2 == 1) {
                this.method359(var8, 2, var7, -24643);
                this.method359(var8 + 1, 32, var7, -24643);
            }
            if (arg2 == 2) {
                this.method359(var8, 8, var7, -24643);
                this.method359(var8, 128, var7 + 1, -24643);
            }
            if (arg2 == 3) {
                this.method359(var8, 32, var7, -24643);
                this.method359(var8 - 1, 2, var7, -24643);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method359(var8, 1, var7, -24643);
                this.method359(var8 + 1, 16, var7 - 1, -24643);
            }
            if (arg2 == 1) {
                this.method359(var8, 4, var7, -24643);
                this.method359(var8 + 1, 64, var7 + 1, -24643);
            }
            if (arg2 == 2) {
                this.method359(var8, 16, var7, -24643);
                this.method359(var8 - 1, 1, var7 + 1, -24643);
            }
            if (arg2 == 3) {
                this.method359(var8, 64, var7, -24643);
                this.method359(var8 - 1, 4, var7 - 1, -24643);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method359(var8, 130, var7, -24643);
                this.method359(var8, 8, var7 - 1, -24643);
                this.method359(var8 + 1, 32, var7, -24643);
            }
            if (arg2 == 1) {
                this.method359(var8, 10, var7, -24643);
                this.method359(var8 + 1, 32, var7, -24643);
                this.method359(var8, 128, var7 + 1, -24643);
            }
            if (arg2 == 2) {
                this.method359(var8, 40, var7, -24643);
                this.method359(var8, 128, var7 + 1, -24643);
                this.method359(var8 - 1, 2, var7, -24643);
            }
            if (arg2 == 3) {
                this.method359(var8, 160, var7, -24643);
                this.method359(var8 - 1, 2, var7, -24643);
                this.method359(var8, 8, var7 - 1, -24643);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method359(var8, 65536, var7, -24643);
                this.method359(var8, 4096, var7 - 1, -24643);
            }
            if (arg2 == 1) {
                this.method359(var8, 1024, var7, -24643);
                this.method359(var8 + 1, 16384, var7, -24643);
            }
            if (arg2 == 2) {
                this.method359(var8, 4096, var7, -24643);
                this.method359(var8, 65536, var7 + 1, -24643);
            }
            if (arg2 == 3) {
                this.method359(var8, 16384, var7, -24643);
                this.method359(var8 - 1, 1024, var7, -24643);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method359(var8, 512, var7, -24643);
                this.method359(var8 + 1, 8192, var7 - 1, -24643);
            }
            if (arg2 == 1) {
                this.method359(var8, 2048, var7, -24643);
                this.method359(var8 + 1, 32768, var7 + 1, -24643);
            }
            if (arg2 == 2) {
                this.method359(var8, 8192, var7, -24643);
                this.method359(var8 - 1, 512, var7 + 1, -24643);
            }
            if (arg2 == 3) {
                this.method359(var8, 32768, var7, -24643);
                this.method359(var8 - 1, 2048, var7 - 1, -24643);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method359(var8, 66560, var7, -24643);
            this.method359(var8, 4096, var7 - 1, -24643);
            this.method359(var8 + 1, 16384, var7, -24643);
        }
        if (arg2 == 1) {
            this.method359(var8, 5120, var7, -24643);
            this.method359(var8 + 1, 16384, var7, -24643);
            this.method359(var8, 65536, var7 + 1, -24643);
        }
        if (arg2 == 2) {
            this.method359(var8, 20480, var7, -24643);
            this.method359(var8, 65536, var7 + 1, -24643);
            this.method359(var8 - 1, 1024, var7, -24643);
        }
        if (arg2 == 3) {
            this.method359(var8, 81920, var7, -24643);
            this.method359(var8 - 1, 1024, var7, -24643);
            this.method359(var8, 4096, var7 - 1, -24643);
            return;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZIIIIZI)V")
    public void method358(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1086;
        if (arg0) {
            this.field1085 = -270;
        }
        int var10 = arg1 - this.field1087;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg6;
            arg6 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1088) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1089) {
                        this.method359(var13, var8, var12, -24643);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIII)V")
    private void method359(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -24643) {
            this.field1082 = 406;
        }
        this.field1090[arg2][arg0] &= 16777215 - arg1;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(III)V")
    public void method360(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1086;
        if (arg2 < 7 || arg2 > 7) {
            this.field1084 = !this.field1084;
        }
        int var5 = arg0 - this.field1087;
        this.field1090[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg1 && arg5 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field1086;
        int var9 = arg5 - this.field1087;
        int var10 = arg1 - this.field1086;
        int var11 = arg6 - this.field1087;
        if (arg3 < 2 || arg3 > 2) {
            this.field1082 = 257;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method362(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg0 - this.field1086;
        int var9 = arg1 - this.field1087;
        if (arg4) {
            throw new NullPointerException();
        }
        int var10 = arg6 - this.field1086;
        int var11 = arg3 - this.field1087;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1090[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1090[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1090[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg4 - 1;
        int var10 = arg3 + arg7 - 1;
        while (arg2 >= 0) {
            this.field1085 = -159;
        }
        if (arg6 >= arg4 && arg6 <= var9 && arg1 >= arg3 && arg1 <= var10) {
            return true;
        } else if (arg4 - 1 == arg6 && arg1 >= arg3 && arg1 <= var10 && (this.field1090[arg6 - this.field1086][arg1 - this.field1087] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg1 >= arg3 && arg1 <= var10 && (this.field1090[arg6 - this.field1086][arg1 - this.field1087] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg1 && arg6 >= arg4 && arg6 <= var9 && (this.field1090[arg6 - this.field1086][arg1 - this.field1087] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg6 >= arg4 && arg6 <= var9 && (this.field1090[arg6 - this.field1086][arg1 - this.field1087] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }
}
