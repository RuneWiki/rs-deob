import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TJMGSZMW")
public class class56 {

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "Z")
    private boolean field1474 = true;

    @OriginalMember(owner = "TJMGSZMW", name = "b", descriptor = "I")
    private int field1475 = -254;

    @OriginalMember(owner = "TJMGSZMW", name = "c", descriptor = "Z")
    private boolean field1476 = false;

    @OriginalMember(owner = "TJMGSZMW", name = "d", descriptor = "I")
    private int field1477 = 7;

    @OriginalMember(owner = "TJMGSZMW", name = "e", descriptor = "I")
    private int field1478 = 9;

    @OriginalMember(owner = "TJMGSZMW", name = "f", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "TJMGSZMW", name = "g", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "TJMGSZMW", name = "h", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "TJMGSZMW", name = "i", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "TJMGSZMW", name = "j", descriptor = "[[I")
    public int[][] field1483;

    @OriginalMember(owner = "TJMGSZMW", name = "<init>", descriptor = "(III)V")
    public class56(int arg0, int arg1, int arg2) {
        if (arg2 < 9 || arg2 > 9) {
            throw new NullPointerException();
        }
        this.field1479 = 0;
        this.field1480 = 0;
        this.field1481 = arg0;
        this.field1482 = arg1;
        this.field1483 = new int[this.field1481][this.field1482];
        this.method480();
        if (class27.field922) {
        }
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "()V")
    public void method480() {
        for (int var1 = 0; var1 < this.field1481; var1++) {
            for (int var2 = 0; var2 < this.field1482; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1481 - 1 == var1 || this.field1482 - 1 == var2) {
                    this.field1483[var1][var2] = 16777215;
                } else {
                    this.field1483[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(IZIZII)V")
    public void method481(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1479;
        int var8 = arg4 - this.field1480;
        if (!arg3) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method484(var7, var8, 128);
                this.method484(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method484(var7, var8, 2);
                this.method484(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method484(var7, var8, 8);
                this.method484(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method484(var7, var8, 32);
                this.method484(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method484(var7, var8, 1);
                this.method484(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method484(var7, var8, 4);
                this.method484(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method484(var7, var8, 16);
                this.method484(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method484(var7, var8, 64);
                this.method484(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method484(var7, var8, 130);
                this.method484(var7 - 1, var8, 8);
                this.method484(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method484(var7, var8, 10);
                this.method484(var7, var8 + 1, 32);
                this.method484(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method484(var7, var8, 40);
                this.method484(var7 + 1, var8, 128);
                this.method484(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method484(var7, var8, 160);
                this.method484(var7, var8 - 1, 2);
                this.method484(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method484(var7, var8, 65536);
                this.method484(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method484(var7, var8, 1024);
                this.method484(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method484(var7, var8, 4096);
                this.method484(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method484(var7, var8, 16384);
                this.method484(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method484(var7, var8, 512);
                this.method484(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method484(var7, var8, 2048);
                this.method484(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method484(var7, var8, 8192);
                this.method484(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method484(var7, var8, 32768);
                this.method484(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method484(var7, var8, 66560);
            this.method484(var7 - 1, var8, 4096);
            this.method484(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method484(var7, var8, 5120);
            this.method484(var7, var8 + 1, 16384);
            this.method484(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method484(var7, var8, 20480);
            this.method484(var7 + 1, var8, 65536);
            this.method484(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method484(var7, var8, 81920);
            this.method484(var7, var8 - 1, 1024);
            this.method484(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(IIIZIII)V")
    public void method482(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 33793) {
            this.field1478 = 359;
        }
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field1479;
        int var10 = arg1 - this.field1480;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg5;
            arg5 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1481) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1482) {
                        this.method484(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(III)V")
    public void method483(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1479;
        int var5 = arg1 - this.field1480;
        if (arg2 < 0) {
            this.field1483[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "TJMGSZMW", name = "b", descriptor = "(III)V")
    private void method484(int arg0, int arg1, int arg2) {
        this.field1483[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(IIZIII)V")
    public void method485(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field1479;
        int var8 = arg4 - this.field1480;
        if (arg0 != -29012) {
            this.field1476 = !this.field1476;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method487(128, var7, 6, var8);
                this.method487(8, var7 - 1, 6, var8);
            }
            if (arg5 == 1) {
                this.method487(2, var7, 6, var8);
                this.method487(32, var7, 6, var8 + 1);
            }
            if (arg5 == 2) {
                this.method487(8, var7, 6, var8);
                this.method487(128, var7 + 1, 6, var8);
            }
            if (arg5 == 3) {
                this.method487(32, var7, 6, var8);
                this.method487(2, var7, 6, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method487(1, var7, 6, var8);
                this.method487(16, var7 - 1, 6, var8 + 1);
            }
            if (arg5 == 1) {
                this.method487(4, var7, 6, var8);
                this.method487(64, var7 + 1, 6, var8 + 1);
            }
            if (arg5 == 2) {
                this.method487(16, var7, 6, var8);
                this.method487(1, var7 + 1, 6, var8 - 1);
            }
            if (arg5 == 3) {
                this.method487(64, var7, 6, var8);
                this.method487(4, var7 - 1, 6, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method487(130, var7, 6, var8);
                this.method487(8, var7 - 1, 6, var8);
                this.method487(32, var7, 6, var8 + 1);
            }
            if (arg5 == 1) {
                this.method487(10, var7, 6, var8);
                this.method487(32, var7, 6, var8 + 1);
                this.method487(128, var7 + 1, 6, var8);
            }
            if (arg5 == 2) {
                this.method487(40, var7, 6, var8);
                this.method487(128, var7 + 1, 6, var8);
                this.method487(2, var7, 6, var8 - 1);
            }
            if (arg5 == 3) {
                this.method487(160, var7, 6, var8);
                this.method487(2, var7, 6, var8 - 1);
                this.method487(8, var7 - 1, 6, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method487(65536, var7, 6, var8);
                this.method487(4096, var7 - 1, 6, var8);
            }
            if (arg5 == 1) {
                this.method487(1024, var7, 6, var8);
                this.method487(16384, var7, 6, var8 + 1);
            }
            if (arg5 == 2) {
                this.method487(4096, var7, 6, var8);
                this.method487(65536, var7 + 1, 6, var8);
            }
            if (arg5 == 3) {
                this.method487(16384, var7, 6, var8);
                this.method487(1024, var7, 6, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method487(512, var7, 6, var8);
                this.method487(8192, var7 - 1, 6, var8 + 1);
            }
            if (arg5 == 1) {
                this.method487(2048, var7, 6, var8);
                this.method487(32768, var7 + 1, 6, var8 + 1);
            }
            if (arg5 == 2) {
                this.method487(8192, var7, 6, var8);
                this.method487(512, var7 + 1, 6, var8 - 1);
            }
            if (arg5 == 3) {
                this.method487(32768, var7, 6, var8);
                this.method487(2048, var7 - 1, 6, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method487(66560, var7, 6, var8);
            this.method487(4096, var7 - 1, 6, var8);
            this.method487(16384, var7, 6, var8 + 1);
        }
        if (arg5 == 1) {
            this.method487(5120, var7, 6, var8);
            this.method487(16384, var7, 6, var8 + 1);
            this.method487(65536, var7 + 1, 6, var8);
        }
        if (arg5 == 2) {
            this.method487(20480, var7, 6, var8);
            this.method487(65536, var7 + 1, 6, var8);
            this.method487(1024, var7, 6, var8 - 1);
        }
        if (arg5 == 3) {
            this.method487(81920, var7, 6, var8);
            this.method487(1024, var7, 6, var8 - 1);
            this.method487(4096, var7 - 1, 6, var8);
            return;
        }
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(IZBIIII)V")
    public void method486(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2 == 4) {
            boolean var9 = false;
        } else {
            this.field1474 = !this.field1474;
        }
        if (arg1) {
            var8 += 131072;
        }
        int var10 = arg0 - this.field1479;
        int var11 = arg3 - this.field1480;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg4;
            arg4 = arg5;
            arg5 = var12;
        }
        for (int var13 = var10; var13 < arg4 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1481) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1482) {
                        this.method487(var8, var13, 6, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(IIII)V")
    private void method487(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 6) {
            this.field1474 = !this.field1474;
        }
        this.field1483[arg1][arg3] &= 16777215 - arg0;
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(BII)V")
    public void method488(byte arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            boolean var4 = false;
        } else {
            this.field1478 = -306;
        }
        int var5 = arg1 - this.field1479;
        int var6 = arg2 - this.field1480;
        this.field1483[var5][var6] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field1479;
        int var9 = arg5 - this.field1480;
        if (arg2 != 5) {
            this.field1474 = !this.field1474;
        }
        int var10 = arg3 - this.field1479;
        int var11 = arg4 - this.field1480;
        if (arg0 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "TJMGSZMW", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg4 && arg2 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field1479;
        if (arg6 < 4 || arg6 > 4) {
            this.field1478 = 318;
        }
        int var9 = arg2 - this.field1480;
        int var10 = arg4 - this.field1479;
        int var11 = arg5 - this.field1480;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1483[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1483[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1483[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "TJMGSZMW", name = "a", descriptor = "(IIIIBIII)Z")
    public boolean method491(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 + arg6 - 1;
        int var10 = arg1 + arg2 - 1;
        if (arg4 != 8) {
            throw new NullPointerException();
        } else if (arg7 >= arg5 && arg7 <= var9 && arg0 >= arg1 && arg0 <= var10) {
            return true;
        } else if (arg5 - 1 == arg7 && arg0 >= arg1 && arg0 <= var10 && (this.field1483[arg7 - this.field1479][arg0 - this.field1480] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg0 >= arg1 && arg0 <= var10 && (this.field1483[arg7 - this.field1479][arg0 - this.field1480] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg0 && arg7 >= arg5 && arg7 <= var9 && (this.field1483[arg7 - this.field1479][arg0 - this.field1480] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg7 >= arg5 && arg7 <= var9 && (this.field1483[arg7 - this.field1479][arg0 - this.field1480] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
