import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XBMRDXRN")
public class class63 {

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "Z")
    private boolean field1616 = false;

    @OriginalMember(owner = "XBMRDXRN", name = "b", descriptor = "I")
    private int field1617 = 18376;

    @OriginalMember(owner = "XBMRDXRN", name = "c", descriptor = "Z")
    private boolean field1618 = true;

    @OriginalMember(owner = "XBMRDXRN", name = "d", descriptor = "Z")
    private boolean field1619 = false;

    @OriginalMember(owner = "XBMRDXRN", name = "e", descriptor = "B")
    private byte field1620 = 3;

    @OriginalMember(owner = "XBMRDXRN", name = "f", descriptor = "I")
    public int field1621 = 0;

    @OriginalMember(owner = "XBMRDXRN", name = "g", descriptor = "I")
    public int field1622 = 0;

    @OriginalMember(owner = "XBMRDXRN", name = "h", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "XBMRDXRN", name = "i", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "XBMRDXRN", name = "j", descriptor = "[[I")
    public int[][] field1625;

    @OriginalMember(owner = "XBMRDXRN", name = "<init>", descriptor = "(III)V")
    public class63(int arg0, int arg1, int arg2) {
        this.field1623 = arg1;
        this.field1624 = arg0;
        if (arg2 != 32443) {
            throw new NullPointerException();
        }
        this.field1625 = new int[this.field1623][this.field1624];
        this.method537();
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "()V")
    public void method537() {
        for (int var1 = 0; var1 < this.field1623; var1++) {
            for (int var2 = 0; var2 < this.field1624; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1623 - 1 == var1 || this.field1624 - 1 == var2) {
                    this.field1625[var1][var2] = 16777215;
                } else {
                    this.field1625[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IZIIII)V")
    public void method538(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1621;
        if (arg5 != 0) {
            return;
        }
        int var8 = arg3 - this.field1622;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method541(var7, var8, 128);
                this.method541(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method541(var7, var8, 2);
                this.method541(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method541(var7, var8, 8);
                this.method541(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method541(var7, var8, 32);
                this.method541(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method541(var7, var8, 1);
                this.method541(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method541(var7, var8, 4);
                this.method541(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method541(var7, var8, 16);
                this.method541(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method541(var7, var8, 64);
                this.method541(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method541(var7, var8, 130);
                this.method541(var7 - 1, var8, 8);
                this.method541(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method541(var7, var8, 10);
                this.method541(var7, var8 + 1, 32);
                this.method541(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method541(var7, var8, 40);
                this.method541(var7 + 1, var8, 128);
                this.method541(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method541(var7, var8, 160);
                this.method541(var7, var8 - 1, 2);
                this.method541(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method541(var7, var8, 65536);
                this.method541(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method541(var7, var8, 1024);
                this.method541(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method541(var7, var8, 4096);
                this.method541(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method541(var7, var8, 16384);
                this.method541(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method541(var7, var8, 512);
                this.method541(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method541(var7, var8, 2048);
                this.method541(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method541(var7, var8, 8192);
                this.method541(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method541(var7, var8, 32768);
                this.method541(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method541(var7, var8, 66560);
            this.method541(var7 - 1, var8, 4096);
            this.method541(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method541(var7, var8, 5120);
            this.method541(var7, var8 + 1, 16384);
            this.method541(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method541(var7, var8, 20480);
            this.method541(var7 + 1, var8, 65536);
            this.method541(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method541(var7, var8, 81920);
            this.method541(var7, var8 - 1, 1024);
            this.method541(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IIIBIZI)V")
    public void method539(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg3 != 83) {
            return;
        }
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1621;
        int var10 = arg2 - this.field1622;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg4;
            arg4 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1623) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1624) {
                        this.method541(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(III)V")
    public void method540(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            int var4 = arg1 - this.field1621;
            int var5 = arg2 - this.field1622;
            this.field1625[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "XBMRDXRN", name = "b", descriptor = "(III)V")
    private void method541(int arg0, int arg1, int arg2) {
        this.field1625[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IIIIIZ)V")
    public void method542(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field1621;
        while (arg4 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var8 = arg0 - this.field1622;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method544(128, var7, var8, -55);
                this.method544(8, var7 - 1, var8, -55);
            }
            if (arg2 == 1) {
                this.method544(2, var7, var8, -55);
                this.method544(32, var7, var8 + 1, -55);
            }
            if (arg2 == 2) {
                this.method544(8, var7, var8, -55);
                this.method544(128, var7 + 1, var8, -55);
            }
            if (arg2 == 3) {
                this.method544(32, var7, var8, -55);
                this.method544(2, var7, var8 - 1, -55);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method544(1, var7, var8, -55);
                this.method544(16, var7 - 1, var8 + 1, -55);
            }
            if (arg2 == 1) {
                this.method544(4, var7, var8, -55);
                this.method544(64, var7 + 1, var8 + 1, -55);
            }
            if (arg2 == 2) {
                this.method544(16, var7, var8, -55);
                this.method544(1, var7 + 1, var8 - 1, -55);
            }
            if (arg2 == 3) {
                this.method544(64, var7, var8, -55);
                this.method544(4, var7 - 1, var8 - 1, -55);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method544(130, var7, var8, -55);
                this.method544(8, var7 - 1, var8, -55);
                this.method544(32, var7, var8 + 1, -55);
            }
            if (arg2 == 1) {
                this.method544(10, var7, var8, -55);
                this.method544(32, var7, var8 + 1, -55);
                this.method544(128, var7 + 1, var8, -55);
            }
            if (arg2 == 2) {
                this.method544(40, var7, var8, -55);
                this.method544(128, var7 + 1, var8, -55);
                this.method544(2, var7, var8 - 1, -55);
            }
            if (arg2 == 3) {
                this.method544(160, var7, var8, -55);
                this.method544(2, var7, var8 - 1, -55);
                this.method544(8, var7 - 1, var8, -55);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method544(65536, var7, var8, -55);
                this.method544(4096, var7 - 1, var8, -55);
            }
            if (arg2 == 1) {
                this.method544(1024, var7, var8, -55);
                this.method544(16384, var7, var8 + 1, -55);
            }
            if (arg2 == 2) {
                this.method544(4096, var7, var8, -55);
                this.method544(65536, var7 + 1, var8, -55);
            }
            if (arg2 == 3) {
                this.method544(16384, var7, var8, -55);
                this.method544(1024, var7, var8 - 1, -55);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method544(512, var7, var8, -55);
                this.method544(8192, var7 - 1, var8 + 1, -55);
            }
            if (arg2 == 1) {
                this.method544(2048, var7, var8, -55);
                this.method544(32768, var7 + 1, var8 + 1, -55);
            }
            if (arg2 == 2) {
                this.method544(8192, var7, var8, -55);
                this.method544(512, var7 + 1, var8 - 1, -55);
            }
            if (arg2 == 3) {
                this.method544(32768, var7, var8, -55);
                this.method544(2048, var7 - 1, var8 - 1, -55);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method544(66560, var7, var8, -55);
            this.method544(4096, var7 - 1, var8, -55);
            this.method544(16384, var7, var8 + 1, -55);
        }
        if (arg2 == 1) {
            this.method544(5120, var7, var8, -55);
            this.method544(16384, var7, var8 + 1, -55);
            this.method544(65536, var7 + 1, var8, -55);
        }
        if (arg2 == 2) {
            this.method544(20480, var7, var8, -55);
            this.method544(65536, var7 + 1, var8, -55);
            this.method544(1024, var7, var8 - 1, -55);
        }
        if (arg2 == 3) {
            this.method544(81920, var7, var8, -55);
            this.method544(1024, var7, var8 - 1, -55);
            this.method544(4096, var7 - 1, var8, -55);
            return;
        }
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IIIZIZI)V")
    public void method543(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field1621;
        if (arg5) {
            return;
        }
        int var10 = arg1 - this.field1622;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg6;
            arg6 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1623) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1624) {
                        this.method544(var8, var12, var13, -55);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IIII)V")
    private void method544(int arg0, int arg1, int arg2, int arg3) {
        this.field1625[arg1][arg2] &= 16777215 - arg0;
        if (arg3 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "XBMRDXRN", name = "c", descriptor = "(III)V")
    public void method545(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1621;
        int var5 = arg0 - this.field1622;
        if (arg2 != 49740) {
            this.field1617 = 382;
        }
        this.field1625[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method546(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == arg5 && arg3 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field1621;
        int var9 = arg6 - this.field1622;
        if (!arg4) {
            throw new NullPointerException();
        }
        int var10 = arg5 - this.field1621;
        int var11 = arg3 - this.field1622;
        if (arg0 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1625[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1625[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1625[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1625[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1625[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1625[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1625[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1625[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1625[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1625[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1625[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg6 && arg2 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field1621;
        int var9 = arg5 - this.field1622;
        int var10 = arg6 - this.field1621;
        if (arg0 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg2 - this.field1622;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field1625[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1625[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1625[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1625[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1625[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1625[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field1625[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1625[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field1625[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field1625[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field1625[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field1625[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "XBMRDXRN", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg7 - 1;
        int var10 = arg2 + arg3 - 1;
        if (arg4 < 3 || arg4 > 3) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg6 >= arg7 && arg6 <= var9 && arg5 >= arg3 && arg5 <= var10) {
            return true;
        } else if (arg7 - 1 == arg6 && arg5 >= arg3 && arg5 <= var10 && (this.field1625[arg6 - this.field1621][arg5 - this.field1622] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg5 >= arg3 && arg5 <= var10 && (this.field1625[arg6 - this.field1621][arg5 - this.field1622] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg5 && arg6 >= arg7 && arg6 <= var9 && (this.field1625[arg6 - this.field1621][arg5 - this.field1622] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg6 >= arg7 && arg6 <= var9 && (this.field1625[arg6 - this.field1621][arg5 - this.field1622] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
