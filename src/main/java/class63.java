import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XSQWUDHM")
public class class63 {

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "Z")
    private boolean field1555 = false;

    @OriginalMember(owner = "XSQWUDHM", name = "b", descriptor = "I")
    private int field1556 = 1;

    @OriginalMember(owner = "XSQWUDHM", name = "c", descriptor = "I")
    private int field1557 = 496;

    @OriginalMember(owner = "XSQWUDHM", name = "d", descriptor = "I")
    private int field1558 = 34;

    @OriginalMember(owner = "XSQWUDHM", name = "e", descriptor = "Z")
    private boolean field1559 = true;

    @OriginalMember(owner = "XSQWUDHM", name = "f", descriptor = "Z")
    private boolean field1560 = false;

    @OriginalMember(owner = "XSQWUDHM", name = "g", descriptor = "Z")
    private boolean field1561 = false;

    @OriginalMember(owner = "XSQWUDHM", name = "h", descriptor = "Z")
    private boolean field1562 = true;

    @OriginalMember(owner = "XSQWUDHM", name = "i", descriptor = "I")
    public int field1563 = 0;

    @OriginalMember(owner = "XSQWUDHM", name = "j", descriptor = "I")
    public int field1564 = 0;

    @OriginalMember(owner = "XSQWUDHM", name = "k", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "XSQWUDHM", name = "l", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "XSQWUDHM", name = "m", descriptor = "[[I")
    public int[][] field1567;

    @OriginalMember(owner = "XSQWUDHM", name = "<init>", descriptor = "(BII)V")
    public class63(byte arg0, int arg1, int arg2) {
        this.field1565 = arg2;
        this.field1566 = arg1;
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        this.field1567 = new int[this.field1565][this.field1566];
        this.method514();
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "()V")
    public void method514() {
        for (int var1 = 0; var1 < this.field1565; var1++) {
            for (int var2 = 0; var2 < this.field1566; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1565 - 1 == var1 || this.field1566 - 1 == var2) {
                    this.field1567[var1][var2] = 16777215;
                } else {
                    this.field1567[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(IIZIII)V")
    public void method515(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= 0) {
            this.field1558 = 243;
        }
        int var7 = arg3 - this.field1563;
        int var8 = arg5 - this.field1564;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method518(var7, var8, 128);
                this.method518(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method518(var7, var8, 2);
                this.method518(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method518(var7, var8, 8);
                this.method518(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method518(var7, var8, 32);
                this.method518(var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method518(var7, var8, 1);
                this.method518(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method518(var7, var8, 4);
                this.method518(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method518(var7, var8, 16);
                this.method518(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method518(var7, var8, 64);
                this.method518(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method518(var7, var8, 130);
                this.method518(var7 - 1, var8, 8);
                this.method518(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method518(var7, var8, 10);
                this.method518(var7, var8 + 1, 32);
                this.method518(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method518(var7, var8, 40);
                this.method518(var7 + 1, var8, 128);
                this.method518(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method518(var7, var8, 160);
                this.method518(var7, var8 - 1, 2);
                this.method518(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method518(var7, var8, 65536);
                this.method518(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method518(var7, var8, 1024);
                this.method518(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method518(var7, var8, 4096);
                this.method518(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method518(var7, var8, 16384);
                this.method518(var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method518(var7, var8, 512);
                this.method518(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method518(var7, var8, 2048);
                this.method518(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method518(var7, var8, 8192);
                this.method518(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method518(var7, var8, 32768);
                this.method518(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method518(var7, var8, 66560);
            this.method518(var7 - 1, var8, 4096);
            this.method518(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method518(var7, var8, 5120);
            this.method518(var7, var8 + 1, 16384);
            this.method518(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method518(var7, var8, 20480);
            this.method518(var7 + 1, var8, 65536);
            this.method518(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method518(var7, var8, 81920);
            this.method518(var7, var8 - 1, 1024);
            this.method518(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(IIIIIZI)V")
    public void method516(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        int var9 = 43 / arg3;
        if (arg5) {
            var8 += 131072;
        }
        int var10 = arg2 - this.field1563;
        int var11 = arg1 - this.field1564;
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg6;
            arg6 = arg4;
            arg4 = var12;
        }
        for (int var13 = var10; var13 < arg6 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1565) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1566) {
                        this.method518(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(III)V")
    public void method517(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1563;
        if (arg1 != 4) {
            this.field1562 = !this.field1562;
        }
        int var5 = arg2 - this.field1564;
        this.field1567[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "XSQWUDHM", name = "b", descriptor = "(III)V")
    private void method518(int arg0, int arg1, int arg2) {
        this.field1567[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(IIIIZI)V")
    public void method519(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg2 - this.field1563;
        if (arg3 != 0) {
            return;
        }
        int var8 = arg0 - this.field1564;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method521(-680, var7, 128, var8);
                this.method521(-680, var7 - 1, 8, var8);
            }
            if (arg5 == 1) {
                this.method521(-680, var7, 2, var8);
                this.method521(-680, var7, 32, var8 + 1);
            }
            if (arg5 == 2) {
                this.method521(-680, var7, 8, var8);
                this.method521(-680, var7 + 1, 128, var8);
            }
            if (arg5 == 3) {
                this.method521(-680, var7, 32, var8);
                this.method521(-680, var7, 2, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method521(-680, var7, 1, var8);
                this.method521(-680, var7 - 1, 16, var8 + 1);
            }
            if (arg5 == 1) {
                this.method521(-680, var7, 4, var8);
                this.method521(-680, var7 + 1, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method521(-680, var7, 16, var8);
                this.method521(-680, var7 + 1, 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method521(-680, var7, 64, var8);
                this.method521(-680, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method521(-680, var7, 130, var8);
                this.method521(-680, var7 - 1, 8, var8);
                this.method521(-680, var7, 32, var8 + 1);
            }
            if (arg5 == 1) {
                this.method521(-680, var7, 10, var8);
                this.method521(-680, var7, 32, var8 + 1);
                this.method521(-680, var7 + 1, 128, var8);
            }
            if (arg5 == 2) {
                this.method521(-680, var7, 40, var8);
                this.method521(-680, var7 + 1, 128, var8);
                this.method521(-680, var7, 2, var8 - 1);
            }
            if (arg5 == 3) {
                this.method521(-680, var7, 160, var8);
                this.method521(-680, var7, 2, var8 - 1);
                this.method521(-680, var7 - 1, 8, var8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method521(-680, var7, 65536, var8);
                this.method521(-680, var7 - 1, 4096, var8);
            }
            if (arg5 == 1) {
                this.method521(-680, var7, 1024, var8);
                this.method521(-680, var7, 16384, var8 + 1);
            }
            if (arg5 == 2) {
                this.method521(-680, var7, 4096, var8);
                this.method521(-680, var7 + 1, 65536, var8);
            }
            if (arg5 == 3) {
                this.method521(-680, var7, 16384, var8);
                this.method521(-680, var7, 1024, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method521(-680, var7, 512, var8);
                this.method521(-680, var7 - 1, 8192, var8 + 1);
            }
            if (arg5 == 1) {
                this.method521(-680, var7, 2048, var8);
                this.method521(-680, var7 + 1, 32768, var8 + 1);
            }
            if (arg5 == 2) {
                this.method521(-680, var7, 8192, var8);
                this.method521(-680, var7 + 1, 512, var8 - 1);
            }
            if (arg5 == 3) {
                this.method521(-680, var7, 32768, var8);
                this.method521(-680, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method521(-680, var7, 66560, var8);
            this.method521(-680, var7 - 1, 4096, var8);
            this.method521(-680, var7, 16384, var8 + 1);
        }
        if (arg5 == 1) {
            this.method521(-680, var7, 5120, var8);
            this.method521(-680, var7, 16384, var8 + 1);
            this.method521(-680, var7 + 1, 65536, var8);
        }
        if (arg5 == 2) {
            this.method521(-680, var7, 20480, var8);
            this.method521(-680, var7 + 1, 65536, var8);
            this.method521(-680, var7, 1024, var8 - 1);
        }
        if (arg5 == 3) {
            this.method521(-680, var7, 81920, var8);
            this.method521(-680, var7, 1024, var8 - 1);
            this.method521(-680, var7 - 1, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(IIIIIIZ)V")
    public void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1563;
        if (arg2 != 6) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg3 - this.field1564;
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg0;
            arg0 = arg5;
            arg5 = var12;
        }
        for (int var13 = var9; var13 < arg0 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1565) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1566) {
                        this.method521(-680, var13, var8, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(IIII)V")
    private void method521(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            this.field1567[arg1][arg3] &= 16777215 - arg2;
        }
    }

    @OriginalMember(owner = "XSQWUDHM", name = "c", descriptor = "(III)V")
    public void method522(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1563;
        int var5 = arg1 - this.field1564;
        int var6 = 50 / arg2;
        this.field1567[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg5 && arg3 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field1563;
        int var9 = arg3 - this.field1564;
        int var10 = arg2 - this.field1563;
        int var11 = 6 / arg1;
        int var12 = arg4 - this.field1564;
        if (arg0 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1567[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1567[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1567[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1567[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1567[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1567[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1567[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1567[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field1567[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field1567[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field1567[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "XSQWUDHM", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg1 && arg5 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field1563;
        int var9 = 40 / arg4;
        int var10 = arg5 - this.field1564;
        int var11 = arg1 - this.field1563;
        int var12 = arg6 - this.field1564;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1567[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1567[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1567[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1567[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1567[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1567[var8][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1567[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1567[var8][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1567[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1567[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1567[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1567[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "XSQWUDHM", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var9 = arg3 + arg6 - 1;
        int var10 = arg1 + arg7 - 1;
        if (arg4 >= arg3 && arg4 <= var9 && arg5 >= arg1 && arg5 <= var10) {
            return true;
        } else if (arg3 - 1 == arg4 && arg5 >= arg1 && arg5 <= var10 && (this.field1567[arg4 - this.field1563][arg5 - this.field1564] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg5 >= arg1 && arg5 <= var10 && (this.field1567[arg4 - this.field1563][arg5 - this.field1564] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (this.field1567[arg4 - this.field1563][arg5 - this.field1564] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (this.field1567[arg4 - this.field1563][arg5 - this.field1564] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
