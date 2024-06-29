import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VLOWRGUJ")
public class class61 {

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "I")
    private int field1546 = 95;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "b", descriptor = "Z")
    private boolean field1547 = true;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "c", descriptor = "Z")
    private boolean field1548 = true;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "d", descriptor = "I")
    private int field1549 = -12929;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "e", descriptor = "Z")
    private boolean field1550 = false;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "f", descriptor = "Z")
    private boolean field1551 = false;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "g", descriptor = "I")
    private int field1552 = -685;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "i", descriptor = "I")
    public int field1554 = 0;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "j", descriptor = "I")
    public int field1555 = 0;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "k", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "l", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "m", descriptor = "[[I")
    public int[][] field1558;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "h", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!VLOWRGUJ", name = "<init>", descriptor = "(III)V")
    public class61(int arg0, int arg1, int arg2) {
        this.field1556 = arg2;
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1557 = arg0;
        this.field1558 = new int[this.field1556][this.field1557];
        this.method552();
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "()V")
    public void method552() {
        for (int var1 = 0; var1 < this.field1556; var1++) {
            for (int var2 = 0; var2 < this.field1557; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1556 - 1 == var1 || this.field1557 - 1 == var2) {
                    this.field1558[var1][var2] = 16777215;
                } else {
                    this.field1558[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(BIIIIZ)V")
    public void method553(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1 - this.field1554;
        int var8 = arg4 - this.field1555;
        if (arg0 != -125) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method556(var7, var8, 128);
                this.method556(var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method556(var7, var8, 2);
                this.method556(var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method556(var7, var8, 8);
                this.method556(var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method556(var7, var8, 32);
                this.method556(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method556(var7, var8, 1);
                this.method556(var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method556(var7, var8, 4);
                this.method556(var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method556(var7, var8, 16);
                this.method556(var7 + 1, var8 - 1, 1);
            }
            if (arg3 == 3) {
                this.method556(var7, var8, 64);
                this.method556(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method556(var7, var8, 130);
                this.method556(var7 - 1, var8, 8);
                this.method556(var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method556(var7, var8, 10);
                this.method556(var7, var8 + 1, 32);
                this.method556(var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method556(var7, var8, 40);
                this.method556(var7 + 1, var8, 128);
                this.method556(var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method556(var7, var8, 160);
                this.method556(var7, var8 - 1, 2);
                this.method556(var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method556(var7, var8, 65536);
                this.method556(var7 - 1, var8, 4096);
            }
            if (arg3 == 1) {
                this.method556(var7, var8, 1024);
                this.method556(var7, var8 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method556(var7, var8, 4096);
                this.method556(var7 + 1, var8, 65536);
            }
            if (arg3 == 3) {
                this.method556(var7, var8, 16384);
                this.method556(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method556(var7, var8, 512);
                this.method556(var7 - 1, var8 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method556(var7, var8, 2048);
                this.method556(var7 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method556(var7, var8, 8192);
                this.method556(var7 + 1, var8 - 1, 512);
            }
            if (arg3 == 3) {
                this.method556(var7, var8, 32768);
                this.method556(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method556(var7, var8, 66560);
            this.method556(var7 - 1, var8, 4096);
            this.method556(var7, var8 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method556(var7, var8, 5120);
            this.method556(var7, var8 + 1, 16384);
            this.method556(var7 + 1, var8, 65536);
        }
        if (arg3 == 2) {
            this.method556(var7, var8, 20480);
            this.method556(var7 + 1, var8, 65536);
            this.method556(var7, var8 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method556(var7, var8, 81920);
            this.method556(var7, var8 - 1, 1024);
            this.method556(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIIIZ)V")
    public void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1554;
        if (arg5 != 0) {
            this.field1553 = 314;
        }
        int var10 = arg1 - this.field1555;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg0;
            arg0 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1556) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1557) {
                        this.method556(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(III)V")
    public void method555(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1554;
        int var5 = arg0 - this.field1555;
        if (arg2 < 0) {
            this.field1558[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "b", descriptor = "(III)V")
    private void method556(int arg0, int arg1, int arg2) {
        this.field1558[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IZIIZI)V")
    public void method557(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg5 - this.field1554;
        if (!arg4) {
            this.field1550 = !this.field1550;
        }
        int var8 = arg2 - this.field1555;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method559(var7, 128, 27126, var8);
                this.method559(var7 - 1, 8, 27126, var8);
            }
            if (arg3 == 1) {
                this.method559(var7, 2, 27126, var8);
                this.method559(var7, 32, 27126, var8 + 1);
            }
            if (arg3 == 2) {
                this.method559(var7, 8, 27126, var8);
                this.method559(var7 + 1, 128, 27126, var8);
            }
            if (arg3 == 3) {
                this.method559(var7, 32, 27126, var8);
                this.method559(var7, 2, 27126, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method559(var7, 1, 27126, var8);
                this.method559(var7 - 1, 16, 27126, var8 + 1);
            }
            if (arg3 == 1) {
                this.method559(var7, 4, 27126, var8);
                this.method559(var7 + 1, 64, 27126, var8 + 1);
            }
            if (arg3 == 2) {
                this.method559(var7, 16, 27126, var8);
                this.method559(var7 + 1, 1, 27126, var8 - 1);
            }
            if (arg3 == 3) {
                this.method559(var7, 64, 27126, var8);
                this.method559(var7 - 1, 4, 27126, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method559(var7, 130, 27126, var8);
                this.method559(var7 - 1, 8, 27126, var8);
                this.method559(var7, 32, 27126, var8 + 1);
            }
            if (arg3 == 1) {
                this.method559(var7, 10, 27126, var8);
                this.method559(var7, 32, 27126, var8 + 1);
                this.method559(var7 + 1, 128, 27126, var8);
            }
            if (arg3 == 2) {
                this.method559(var7, 40, 27126, var8);
                this.method559(var7 + 1, 128, 27126, var8);
                this.method559(var7, 2, 27126, var8 - 1);
            }
            if (arg3 == 3) {
                this.method559(var7, 160, 27126, var8);
                this.method559(var7, 2, 27126, var8 - 1);
                this.method559(var7 - 1, 8, 27126, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method559(var7, 65536, 27126, var8);
                this.method559(var7 - 1, 4096, 27126, var8);
            }
            if (arg3 == 1) {
                this.method559(var7, 1024, 27126, var8);
                this.method559(var7, 16384, 27126, var8 + 1);
            }
            if (arg3 == 2) {
                this.method559(var7, 4096, 27126, var8);
                this.method559(var7 + 1, 65536, 27126, var8);
            }
            if (arg3 == 3) {
                this.method559(var7, 16384, 27126, var8);
                this.method559(var7, 1024, 27126, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method559(var7, 512, 27126, var8);
                this.method559(var7 - 1, 8192, 27126, var8 + 1);
            }
            if (arg3 == 1) {
                this.method559(var7, 2048, 27126, var8);
                this.method559(var7 + 1, 32768, 27126, var8 + 1);
            }
            if (arg3 == 2) {
                this.method559(var7, 8192, 27126, var8);
                this.method559(var7 + 1, 512, 27126, var8 - 1);
            }
            if (arg3 == 3) {
                this.method559(var7, 32768, 27126, var8);
                this.method559(var7 - 1, 2048, 27126, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method559(var7, 66560, 27126, var8);
            this.method559(var7 - 1, 4096, 27126, var8);
            this.method559(var7, 16384, 27126, var8 + 1);
        }
        if (arg3 == 1) {
            this.method559(var7, 5120, 27126, var8);
            this.method559(var7, 16384, 27126, var8 + 1);
            this.method559(var7 + 1, 65536, 27126, var8);
        }
        if (arg3 == 2) {
            this.method559(var7, 20480, 27126, var8);
            this.method559(var7 + 1, 65536, 27126, var8);
            this.method559(var7, 1024, 27126, var8 - 1);
        }
        if (arg3 == 3) {
            this.method559(var7, 81920, 27126, var8);
            this.method559(var7, 1024, 27126, var8 - 1);
            this.method559(var7 - 1, 4096, 27126, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIZII)V")
    public void method558(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1554;
        if (arg0 != 4) {
            this.field1546 = 489;
        }
        int var10 = arg2 - this.field1555;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg6;
            arg6 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1556) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1557) {
                        this.method559(var12, var8, 27126, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIII)V")
    private void method559(int arg0, int arg1, int arg2, int arg3) {
        this.field1558[arg0][arg3] &= 16777215 - arg1;
        if (arg2 != 27126) {
            this.field1549 = -325;
        }
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIZ)V")
    public void method560(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field1552 = 365;
        }
        int var4 = arg1 - this.field1554;
        int var5 = arg0 - this.field1555;
        this.field1558[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg0 == arg2) {
            return true;
        }
        int var8 = arg1 - this.field1554;
        int var9 = arg0 - this.field1555;
        int var10 = arg6 - this.field1554;
        int var11 = arg2 - this.field1555;
        if (arg5 < 5 || arg5 > 5) {
            this.field1553 = 238;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(ZIIIIII)Z")
    public boolean method562(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg6 && arg3 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field1554;
        int var9 = arg5 - this.field1555;
        int var10 = arg6 - this.field1554;
        if (!arg0) {
            this.field1547 = !this.field1547;
        }
        int var11 = arg3 - this.field1555;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1558[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1558[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1558[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg4 - 1;
        int var10 = arg1 + arg3 - 1;
        if (arg5 != 1) {
            this.field1550 = !this.field1550;
        }
        if (arg2 >= arg0 && arg2 <= var9 && arg6 >= arg3 && arg6 <= var10) {
            return true;
        } else if (arg0 - 1 == arg2 && arg6 >= arg3 && arg6 <= var10 && (this.field1558[arg2 - this.field1554][arg6 - this.field1555] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg6 >= arg3 && arg6 <= var10 && (this.field1558[arg2 - this.field1554][arg6 - this.field1555] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg6 && arg2 >= arg0 && arg2 <= var9 && (this.field1558[arg2 - this.field1554][arg6 - this.field1555] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg2 >= arg0 && arg2 <= var9 && (this.field1558[arg2 - this.field1554][arg6 - this.field1555] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
