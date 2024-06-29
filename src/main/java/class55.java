import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UDXVXGJJ")
public class class55 {

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "I")
    private int field1471 = -142;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "b", descriptor = "Z")
    private boolean field1472 = false;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "c", descriptor = "I")
    private int field1473 = -967;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "d", descriptor = "Z")
    private boolean field1474 = false;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "e", descriptor = "Z")
    private boolean field1475 = false;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "f", descriptor = "I")
    public int field1476 = 0;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "g", descriptor = "I")
    public int field1477 = 0;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "h", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "i", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "j", descriptor = "[[I")
    public int[][] field1480;

    @OriginalMember(owner = "client!UDXVXGJJ", name = "<init>", descriptor = "(III)V")
    public class55(int arg0, int arg1, int arg2) {
        this.field1478 = arg2;
        this.field1479 = arg1;
        this.field1480 = new int[this.field1478][this.field1479];
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.method515();
        if (class27.field954) {
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "()V")
    public void method515() {
        for (int var1 = 0; var1 < this.field1478; var1++) {
            for (int var2 = 0; var2 < this.field1479; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1478 - 1 == var1 || this.field1479 - 1 == var2) {
                    this.field1480[var1][var2] = 16777215;
                } else {
                    this.field1480[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(ZIIZII)V")
    public void method516(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1476;
        if (arg3) {
            return;
        }
        int var8 = arg5 - this.field1477;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method519(var7, var8, 128);
                this.method519(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method519(var7, var8, 2);
                this.method519(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method519(var7, var8, 8);
                this.method519(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method519(var7, var8, 32);
                this.method519(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method519(var7, var8, 1);
                this.method519(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method519(var7, var8, 4);
                this.method519(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method519(var7, var8, 16);
                this.method519(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method519(var7, var8, 64);
                this.method519(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method519(var7, var8, 130);
                this.method519(var7 - 1, var8, 8);
                this.method519(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method519(var7, var8, 10);
                this.method519(var7, var8 + 1, 32);
                this.method519(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method519(var7, var8, 40);
                this.method519(var7 + 1, var8, 128);
                this.method519(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method519(var7, var8, 160);
                this.method519(var7, var8 - 1, 2);
                this.method519(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method519(var7, var8, 65536);
                this.method519(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method519(var7, var8, 1024);
                this.method519(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method519(var7, var8, 4096);
                this.method519(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method519(var7, var8, 16384);
                this.method519(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method519(var7, var8, 512);
                this.method519(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method519(var7, var8, 2048);
                this.method519(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method519(var7, var8, 8192);
                this.method519(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method519(var7, var8, 32768);
                this.method519(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method519(var7, var8, 66560);
            this.method519(var7 - 1, var8, 4096);
            this.method519(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method519(var7, var8, 5120);
            this.method519(var7, var8 + 1, 16384);
            this.method519(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method519(var7, var8, 20480);
            this.method519(var7 + 1, var8, 65536);
            this.method519(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method519(var7, var8, 81920);
            this.method519(var7, var8 - 1, 1024);
            this.method519(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(IIIIZII)V")
    public void method517(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg5 < 8 || arg5 > 8) {
            return;
        }
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1476;
        int var10 = arg0 - this.field1477;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1478) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1479) {
                        this.method519(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(III)V")
    public void method518(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1476;
        int var5 = arg0 - this.field1477;
        this.field1480[var4][var5] |= 0x200000;
        if (arg2 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "b", descriptor = "(III)V")
    private void method519(int arg0, int arg1, int arg2) {
        this.field1480[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(ZIIIII)V")
    public void method520(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field1476;
        while (arg4 >= 0) {
            this.field1475 = !this.field1475;
        }
        int var8 = arg3 - this.field1477;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method522((byte) 90, var8, 128, var7);
                this.method522((byte) 90, var8, 8, var7 - 1);
            }
            if (arg1 == 1) {
                this.method522((byte) 90, var8, 2, var7);
                this.method522((byte) 90, var8 + 1, 32, var7);
            }
            if (arg1 == 2) {
                this.method522((byte) 90, var8, 8, var7);
                this.method522((byte) 90, var8, 128, var7 + 1);
            }
            if (arg1 == 3) {
                this.method522((byte) 90, var8, 32, var7);
                this.method522((byte) 90, var8 - 1, 2, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method522((byte) 90, var8, 1, var7);
                this.method522((byte) 90, var8 + 1, 16, var7 - 1);
            }
            if (arg1 == 1) {
                this.method522((byte) 90, var8, 4, var7);
                this.method522((byte) 90, var8 + 1, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method522((byte) 90, var8, 16, var7);
                this.method522((byte) 90, var8 - 1, 1, var7 + 1);
            }
            if (arg1 == 3) {
                this.method522((byte) 90, var8, 64, var7);
                this.method522((byte) 90, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method522((byte) 90, var8, 130, var7);
                this.method522((byte) 90, var8, 8, var7 - 1);
                this.method522((byte) 90, var8 + 1, 32, var7);
            }
            if (arg1 == 1) {
                this.method522((byte) 90, var8, 10, var7);
                this.method522((byte) 90, var8 + 1, 32, var7);
                this.method522((byte) 90, var8, 128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method522((byte) 90, var8, 40, var7);
                this.method522((byte) 90, var8, 128, var7 + 1);
                this.method522((byte) 90, var8 - 1, 2, var7);
            }
            if (arg1 == 3) {
                this.method522((byte) 90, var8, 160, var7);
                this.method522((byte) 90, var8 - 1, 2, var7);
                this.method522((byte) 90, var8, 8, var7 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method522((byte) 90, var8, 65536, var7);
                this.method522((byte) 90, var8, 4096, var7 - 1);
            }
            if (arg1 == 1) {
                this.method522((byte) 90, var8, 1024, var7);
                this.method522((byte) 90, var8 + 1, 16384, var7);
            }
            if (arg1 == 2) {
                this.method522((byte) 90, var8, 4096, var7);
                this.method522((byte) 90, var8, 65536, var7 + 1);
            }
            if (arg1 == 3) {
                this.method522((byte) 90, var8, 16384, var7);
                this.method522((byte) 90, var8 - 1, 1024, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method522((byte) 90, var8, 512, var7);
                this.method522((byte) 90, var8 + 1, 8192, var7 - 1);
            }
            if (arg1 == 1) {
                this.method522((byte) 90, var8, 2048, var7);
                this.method522((byte) 90, var8 + 1, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method522((byte) 90, var8, 8192, var7);
                this.method522((byte) 90, var8 - 1, 512, var7 + 1);
            }
            if (arg1 == 3) {
                this.method522((byte) 90, var8, 32768, var7);
                this.method522((byte) 90, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method522((byte) 90, var8, 66560, var7);
            this.method522((byte) 90, var8, 4096, var7 - 1);
            this.method522((byte) 90, var8 + 1, 16384, var7);
        }
        if (arg1 == 1) {
            this.method522((byte) 90, var8, 5120, var7);
            this.method522((byte) 90, var8 + 1, 16384, var7);
            this.method522((byte) 90, var8, 65536, var7 + 1);
        }
        if (arg1 == 2) {
            this.method522((byte) 90, var8, 20480, var7);
            this.method522((byte) 90, var8, 65536, var7 + 1);
            this.method522((byte) 90, var8 - 1, 1024, var7);
        }
        if (arg1 == 3) {
            this.method522((byte) 90, var8, 81920, var7);
            this.method522((byte) 90, var8 - 1, 1024, var7);
            this.method522((byte) 90, var8, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(IIZIIII)V")
    public void method521(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1476;
        int var10 = arg0 - this.field1477;
        if (arg3 != 1) {
            this.field1473 = 121;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg1;
            arg1 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1478) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1479) {
                        this.method522((byte) 90, var13, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(BIII)V")
    private void method522(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 90) {
            this.field1480[arg3][arg1] &= 16777215 - arg2;
        }
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(ZII)V")
    public void method523(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1476;
        if (!arg0) {
            this.field1472 = !this.field1472;
        }
        int var5 = arg1 - this.field1477;
        this.field1480[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(BIIIIII)Z")
    public boolean method524(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -83) {
            this.field1473 = 326;
        }
        if (arg1 == arg2 && arg4 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field1476;
        int var9 = arg4 - this.field1477;
        int var10 = arg2 - this.field1476;
        int var11 = arg6 - this.field1477;
        if (arg5 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1480[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1480[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1480[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1480[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1480[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1480[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1480[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1480[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1480[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1480[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1480[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 11 / arg5;
        if (arg4 == arg6 && arg1 == arg3) {
            return true;
        }
        int var9 = arg6 - this.field1476;
        int var10 = arg1 - this.field1477;
        int var11 = arg4 - this.field1476;
        int var12 = arg3 - this.field1477;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field1480[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1480[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1480[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1480[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field1480[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1480[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field1480[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field1480[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field1480[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field1480[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field1480[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field1480[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(BIIIIIII)Z")
    public boolean method526(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 1) {
            this.field1473 = 194;
        }
        int var9 = arg3 + arg6 - 1;
        int var10 = arg2 + arg7 - 1;
        if (arg4 >= arg6 && arg4 <= var9 && arg5 >= arg7 && arg5 <= var10) {
            return true;
        } else if (arg6 - 1 == arg4 && arg5 >= arg7 && arg5 <= var10 && (this.field1480[arg4 - this.field1476][arg5 - this.field1477] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg5 >= arg7 && arg5 <= var10 && (this.field1480[arg4 - this.field1476][arg5 - this.field1477] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg5 && arg4 >= arg6 && arg4 <= var9 && (this.field1480[arg4 - this.field1476][arg5 - this.field1477] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg4 >= arg6 && arg4 <= var9 && (this.field1480[arg4 - this.field1476][arg5 - this.field1477] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
