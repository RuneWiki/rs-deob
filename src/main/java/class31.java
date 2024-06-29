import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LQLHEUAQ")
public class class31 {

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "B")
    private byte field1013 = -72;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "b", descriptor = "I")
    private int field1014 = 650;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "c", descriptor = "B")
    private byte field1015 = -82;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "d", descriptor = "Z")
    private boolean field1016 = false;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "e", descriptor = "I")
    private int field1017 = 366;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "f", descriptor = "Z")
    private boolean field1018 = true;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "g", descriptor = "Z")
    private boolean field1019 = false;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "h", descriptor = "I")
    public int field1020 = 0;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "i", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "j", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "k", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "l", descriptor = "[[I")
    public int[][] field1024;

    @OriginalMember(owner = "client!LQLHEUAQ", name = "<init>", descriptor = "(BII)V")
    public class31(byte arg0, int arg1, int arg2) {
        if (arg0 != -99) {
            throw new NullPointerException();
        }
        this.field1021 = 0;
        this.field1022 = arg2;
        this.field1023 = arg1;
        this.field1024 = new int[this.field1022][this.field1023];
        this.method323();
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "()V")
    public void method323() {
        for (int var1 = 0; var1 < this.field1022; var1++) {
            for (int var2 = 0; var2 < this.field1023; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1022 - 1 == var1 || this.field1023 - 1 == var2) {
                    this.field1024[var1][var2] = 16777215;
                } else {
                    this.field1024[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(ZIIIIZ)V")
    public void method324(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1 - this.field1020;
        if (!arg5) {
            this.field1018 = !this.field1018;
        }
        int var8 = arg4 - this.field1021;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method327(var7, var8, 128);
                this.method327(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method327(var7, var8, 2);
                this.method327(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method327(var7, var8, 8);
                this.method327(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method327(var7, var8, 32);
                this.method327(var7, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method327(var7, var8, 1);
                this.method327(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method327(var7, var8, 4);
                this.method327(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method327(var7, var8, 16);
                this.method327(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method327(var7, var8, 64);
                this.method327(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method327(var7, var8, 130);
                this.method327(var7 - 1, var8, 8);
                this.method327(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method327(var7, var8, 10);
                this.method327(var7, var8 + 1, 32);
                this.method327(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method327(var7, var8, 40);
                this.method327(var7 + 1, var8, 128);
                this.method327(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method327(var7, var8, 160);
                this.method327(var7, var8 - 1, 2);
                this.method327(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method327(var7, var8, 65536);
                this.method327(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method327(var7, var8, 1024);
                this.method327(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method327(var7, var8, 4096);
                this.method327(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method327(var7, var8, 16384);
                this.method327(var7, var8 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method327(var7, var8, 512);
                this.method327(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method327(var7, var8, 2048);
                this.method327(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method327(var7, var8, 8192);
                this.method327(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method327(var7, var8, 32768);
                this.method327(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method327(var7, var8, 66560);
            this.method327(var7 - 1, var8, 4096);
            this.method327(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method327(var7, var8, 5120);
            this.method327(var7, var8 + 1, 16384);
            this.method327(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method327(var7, var8, 20480);
            this.method327(var7 + 1, var8, 65536);
            this.method327(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method327(var7, var8, 81920);
            this.method327(var7, var8 - 1, 1024);
            this.method327(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIZIIII)V")
    public void method325(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1020;
        int var10 = arg1 - this.field1021;
        if (arg0 != -47563) {
            return;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1022) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1023) {
                        this.method327(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(III)V")
    public void method326(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1020;
        int var5 = arg1 - this.field1021;
        if (arg2 == 0) {
            this.field1024[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "b", descriptor = "(III)V")
    private void method327(int arg0, int arg1, int arg2) {
        this.field1024[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(ZIBIII)V")
    public void method328(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field1020;
        int var8 = arg4 - this.field1021;
        if (arg2 != 2) {
            return;
        }
        boolean var9 = false;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method330(927, var7, 128, var8);
                this.method330(927, var7 - 1, 8, var8);
            }
            if (arg5 == 1) {
                this.method330(927, var7, 2, var8);
                this.method330(927, var7, 32, var8 + 1);
            }
            if (arg5 == 2) {
                this.method330(927, var7, 8, var8);
                this.method330(927, var7 + 1, 128, var8);
            }
            if (arg5 == 3) {
                this.method330(927, var7, 32, var8);
                this.method330(927, var7, 2, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method330(927, var7, 1, var8);
                this.method330(927, var7 - 1, 16, var8 + 1);
            }
            if (arg5 == 1) {
                this.method330(927, var7, 4, var8);
                this.method330(927, var7 + 1, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method330(927, var7, 16, var8);
                this.method330(927, var7 + 1, 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method330(927, var7, 64, var8);
                this.method330(927, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method330(927, var7, 130, var8);
                this.method330(927, var7 - 1, 8, var8);
                this.method330(927, var7, 32, var8 + 1);
            }
            if (arg5 == 1) {
                this.method330(927, var7, 10, var8);
                this.method330(927, var7, 32, var8 + 1);
                this.method330(927, var7 + 1, 128, var8);
            }
            if (arg5 == 2) {
                this.method330(927, var7, 40, var8);
                this.method330(927, var7 + 1, 128, var8);
                this.method330(927, var7, 2, var8 - 1);
            }
            if (arg5 == 3) {
                this.method330(927, var7, 160, var8);
                this.method330(927, var7, 2, var8 - 1);
                this.method330(927, var7 - 1, 8, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method330(927, var7, 65536, var8);
                this.method330(927, var7 - 1, 4096, var8);
            }
            if (arg5 == 1) {
                this.method330(927, var7, 1024, var8);
                this.method330(927, var7, 16384, var8 + 1);
            }
            if (arg5 == 2) {
                this.method330(927, var7, 4096, var8);
                this.method330(927, var7 + 1, 65536, var8);
            }
            if (arg5 == 3) {
                this.method330(927, var7, 16384, var8);
                this.method330(927, var7, 1024, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method330(927, var7, 512, var8);
                this.method330(927, var7 - 1, 8192, var8 + 1);
            }
            if (arg5 == 1) {
                this.method330(927, var7, 2048, var8);
                this.method330(927, var7 + 1, 32768, var8 + 1);
            }
            if (arg5 == 2) {
                this.method330(927, var7, 8192, var8);
                this.method330(927, var7 + 1, 512, var8 - 1);
            }
            if (arg5 == 3) {
                this.method330(927, var7, 32768, var8);
                this.method330(927, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method330(927, var7, 66560, var8);
            this.method330(927, var7 - 1, 4096, var8);
            this.method330(927, var7, 16384, var8 + 1);
        }
        if (arg5 == 1) {
            this.method330(927, var7, 5120, var8);
            this.method330(927, var7, 16384, var8 + 1);
            this.method330(927, var7 + 1, 65536, var8);
        }
        if (arg5 == 2) {
            this.method330(927, var7, 20480, var8);
            this.method330(927, var7 + 1, 65536, var8);
            this.method330(927, var7, 1024, var8 - 1);
        }
        if (arg5 == 3) {
            this.method330(927, var7, 81920, var8);
            this.method330(927, var7, 1024, var8 - 1);
            this.method330(927, var7 - 1, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIIZ)V")
    public void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 <= 0) {
            return;
        }
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1020;
        int var10 = arg2 - this.field1021;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg3;
            arg3 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1022) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1023) {
                        this.method330(927, var12, var8, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIII)V")
    private void method330(int arg0, int arg1, int arg2, int arg3) {
        this.field1024[arg1][arg3] &= 16777215 - arg2;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(BII)V")
    public void method331(byte arg0, int arg1, int arg2) {
        if (this.field1015 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg2 - this.field1020;
        int var6 = arg1 - this.field1021;
        this.field1024[var5][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIBI)Z")
    public boolean method332(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg3 == arg4 && arg0 == arg1) {
            return true;
        }
        int var8 = arg4 - this.field1020;
        if (arg5 == 9) {
            boolean var9 = false;
        } else {
            this.field1014 = 307;
        }
        int var10 = arg1 - this.field1021;
        int var11 = arg3 - this.field1020;
        int var12 = arg0 - this.field1021;
        if (arg2 == 0) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1024[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1024[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1024[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1024[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1024[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1024[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1024[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1024[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1024[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1024[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1024[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 39 / arg4;
        if (arg0 == arg2 && arg1 == arg6) {
            return true;
        }
        int var9 = arg2 - this.field1020;
        int var10 = arg1 - this.field1021;
        int var11 = arg0 - this.field1020;
        int var12 = arg6 - this.field1021;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field1024[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1024[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1024[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1024[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1024[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1024[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field1024[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1024[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field1024[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field1024[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field1024[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field1024[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIZII)Z")
    public boolean method334(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg0 + arg1 - 1;
        int var11 = arg2 + arg4 - 1;
        if (arg7 >= arg0 && arg7 <= var10 && arg3 >= arg4 && arg3 <= var11) {
            return true;
        } else if (arg0 - 1 == arg7 && arg3 >= arg4 && arg3 <= var11 && (this.field1024[arg7 - this.field1020][arg3 - this.field1021] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg7 && arg3 >= arg4 && arg3 <= var11 && (this.field1024[arg7 - this.field1020][arg3 - this.field1021] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg3 && arg7 >= arg0 && arg7 <= var10 && (this.field1024[arg7 - this.field1020][arg3 - this.field1021] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg7 >= arg0 && arg7 <= var10 && (this.field1024[arg7 - this.field1020][arg3 - this.field1021] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
