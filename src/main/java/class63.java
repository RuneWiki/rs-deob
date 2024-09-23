import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WWMUUFBO")
public class class63 {

    @OriginalMember(owner = "WWMUUFBO", name = "b", descriptor = "Z")
    private boolean field1578 = true;

    @OriginalMember(owner = "WWMUUFBO", name = "d", descriptor = "B")
    private byte field1580 = 4;

    @OriginalMember(owner = "WWMUUFBO", name = "e", descriptor = "Z")
    private boolean field1581 = false;

    @OriginalMember(owner = "WWMUUFBO", name = "f", descriptor = "I")
    public int field1582 = 0;

    @OriginalMember(owner = "WWMUUFBO", name = "g", descriptor = "I")
    public int field1583 = 0;

    @OriginalMember(owner = "WWMUUFBO", name = "h", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "WWMUUFBO", name = "i", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "WWMUUFBO", name = "j", descriptor = "[[I")
    public int[][] field1586;

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "WWMUUFBO", name = "c", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "WWMUUFBO", name = "<init>", descriptor = "(III)V")
    public class63(int arg0, int arg1, int arg2) {
        this.field1584 = arg0;
        this.field1585 = arg2;
        this.field1586 = new int[this.field1584][this.field1585];
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.method528();
        if (class64.field1590) {
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "()V")
    public void method528() {
        for (int var1 = 0; var1 < this.field1584; var1++) {
            for (int var2 = 0; var2 < this.field1585; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1584 - 1 == var1 || this.field1585 - 1 == var2) {
                    this.field1586[var1][var2] = 16777215;
                } else {
                    this.field1586[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(IIIIIZ)V")
    public void method529(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field1582;
        if (arg1 < 5 || arg1 > 5) {
            this.field1579 = 38;
        }
        int var8 = arg4 - this.field1583;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method532(var7, var8, 128);
                this.method532(var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method532(var7, var8, 2);
                this.method532(var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method532(var7, var8, 8);
                this.method532(var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method532(var7, var8, 32);
                this.method532(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method532(var7, var8, 1);
                this.method532(var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method532(var7, var8, 4);
                this.method532(var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method532(var7, var8, 16);
                this.method532(var7 + 1, var8 - 1, 1);
            }
            if (arg3 == 3) {
                this.method532(var7, var8, 64);
                this.method532(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method532(var7, var8, 130);
                this.method532(var7 - 1, var8, 8);
                this.method532(var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method532(var7, var8, 10);
                this.method532(var7, var8 + 1, 32);
                this.method532(var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method532(var7, var8, 40);
                this.method532(var7 + 1, var8, 128);
                this.method532(var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method532(var7, var8, 160);
                this.method532(var7, var8 - 1, 2);
                this.method532(var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method532(var7, var8, 65536);
                this.method532(var7 - 1, var8, 4096);
            }
            if (arg3 == 1) {
                this.method532(var7, var8, 1024);
                this.method532(var7, var8 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method532(var7, var8, 4096);
                this.method532(var7 + 1, var8, 65536);
            }
            if (arg3 == 3) {
                this.method532(var7, var8, 16384);
                this.method532(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method532(var7, var8, 512);
                this.method532(var7 - 1, var8 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method532(var7, var8, 2048);
                this.method532(var7 + 1, var8 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method532(var7, var8, 8192);
                this.method532(var7 + 1, var8 - 1, 512);
            }
            if (arg3 == 3) {
                this.method532(var7, var8, 32768);
                this.method532(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method532(var7, var8, 66560);
            this.method532(var7 - 1, var8, 4096);
            this.method532(var7, var8 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method532(var7, var8, 5120);
            this.method532(var7, var8 + 1, 16384);
            this.method532(var7 + 1, var8, 65536);
        }
        if (arg3 == 2) {
            this.method532(var7, var8, 20480);
            this.method532(var7 + 1, var8, 65536);
            this.method532(var7, var8 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method532(var7, var8, 81920);
            this.method532(var7, var8 - 1, 1024);
            this.method532(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(IIIIIZI)V")
    public void method530(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field1582;
        if (arg2 < 4 || arg2 > 4) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg6 - this.field1583;
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg1;
            arg1 = arg4;
            arg4 = var12;
        }
        for (int var13 = var9; var13 < arg1 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1584) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1585) {
                        this.method532(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(IIB)V")
    public void method531(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field1582;
        int var5 = arg0 - this.field1583;
        this.field1586[var4][var5] |= 0x200000;
        if (arg2 == -95) {
            ;
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(III)V")
    private void method532(int arg0, int arg1, int arg2) {
        this.field1586[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(ZIZIII)V")
    public void method533(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            this.field1577 = -391;
        }
        int var7 = arg3 - this.field1582;
        int var8 = arg5 - this.field1583;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method535(var8, var7, 128, false);
                this.method535(var8, var7 - 1, 8, false);
            }
            if (arg1 == 1) {
                this.method535(var8, var7, 2, false);
                this.method535(var8 + 1, var7, 32, false);
            }
            if (arg1 == 2) {
                this.method535(var8, var7, 8, false);
                this.method535(var8, var7 + 1, 128, false);
            }
            if (arg1 == 3) {
                this.method535(var8, var7, 32, false);
                this.method535(var8 - 1, var7, 2, false);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method535(var8, var7, 1, false);
                this.method535(var8 + 1, var7 - 1, 16, false);
            }
            if (arg1 == 1) {
                this.method535(var8, var7, 4, false);
                this.method535(var8 + 1, var7 + 1, 64, false);
            }
            if (arg1 == 2) {
                this.method535(var8, var7, 16, false);
                this.method535(var8 - 1, var7 + 1, 1, false);
            }
            if (arg1 == 3) {
                this.method535(var8, var7, 64, false);
                this.method535(var8 - 1, var7 - 1, 4, false);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method535(var8, var7, 130, false);
                this.method535(var8, var7 - 1, 8, false);
                this.method535(var8 + 1, var7, 32, false);
            }
            if (arg1 == 1) {
                this.method535(var8, var7, 10, false);
                this.method535(var8 + 1, var7, 32, false);
                this.method535(var8, var7 + 1, 128, false);
            }
            if (arg1 == 2) {
                this.method535(var8, var7, 40, false);
                this.method535(var8, var7 + 1, 128, false);
                this.method535(var8 - 1, var7, 2, false);
            }
            if (arg1 == 3) {
                this.method535(var8, var7, 160, false);
                this.method535(var8 - 1, var7, 2, false);
                this.method535(var8, var7 - 1, 8, false);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method535(var8, var7, 65536, false);
                this.method535(var8, var7 - 1, 4096, false);
            }
            if (arg1 == 1) {
                this.method535(var8, var7, 1024, false);
                this.method535(var8 + 1, var7, 16384, false);
            }
            if (arg1 == 2) {
                this.method535(var8, var7, 4096, false);
                this.method535(var8, var7 + 1, 65536, false);
            }
            if (arg1 == 3) {
                this.method535(var8, var7, 16384, false);
                this.method535(var8 - 1, var7, 1024, false);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method535(var8, var7, 512, false);
                this.method535(var8 + 1, var7 - 1, 8192, false);
            }
            if (arg1 == 1) {
                this.method535(var8, var7, 2048, false);
                this.method535(var8 + 1, var7 + 1, 32768, false);
            }
            if (arg1 == 2) {
                this.method535(var8, var7, 8192, false);
                this.method535(var8 - 1, var7 + 1, 512, false);
            }
            if (arg1 == 3) {
                this.method535(var8, var7, 32768, false);
                this.method535(var8 - 1, var7 - 1, 2048, false);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method535(var8, var7, 66560, false);
            this.method535(var8, var7 - 1, 4096, false);
            this.method535(var8 + 1, var7, 16384, false);
        }
        if (arg1 == 1) {
            this.method535(var8, var7, 5120, false);
            this.method535(var8 + 1, var7, 16384, false);
            this.method535(var8, var7 + 1, 65536, false);
        }
        if (arg1 == 2) {
            this.method535(var8, var7, 20480, false);
            this.method535(var8, var7 + 1, 65536, false);
            this.method535(var8 - 1, var7, 1024, false);
        }
        if (arg1 == 3) {
            this.method535(var8, var7, 81920, false);
            this.method535(var8 - 1, var7, 1024, false);
            this.method535(var8, var7 - 1, 4096, false);
            return;
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(BIIIIIZ)V")
    public void method534(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1582;
        int var10 = arg3 - this.field1583;
        if (this.field1580 != arg0) {
            return;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg5;
            arg5 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1584) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1585) {
                        this.method535(var13, var12, var8, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(IIIZ)V")
    private void method535(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1586[arg1][arg0] &= 16777215 - arg2;
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(IZI)V")
    public void method536(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field1582;
        int var5 = arg0 - this.field1583;
        this.field1586[var4][var5] &= 0xDFFFFF;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg4 && arg3 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field1582;
        int var9 = arg3 - this.field1583;
        int var10 = arg0 - this.field1582;
        if (arg6 != 32747) {
            throw new NullPointerException();
        }
        int var11 = arg5 - this.field1583;
        if (arg1 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1586[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1586[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1586[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1586[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1586[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1586[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1586[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1586[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1586[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1586[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1586[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "WWMUUFBO", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field1582;
        if (arg5 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg4 - this.field1583;
        int var11 = arg1 - this.field1582;
        int var12 = arg2 - this.field1583;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1586[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1586[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1586[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1586[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1586[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1586[var8][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1586[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1586[var8][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1586[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1586[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1586[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1586[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "WWMUUFBO", name = "a", descriptor = "(BIIIIIII)Z")
    public boolean method539(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg4 - 1;
        int var10 = arg1 + arg6 - 1;
        if (arg0 != 53) {
            throw new NullPointerException();
        } else if (arg7 >= arg4 && arg7 <= var9 && arg5 >= arg6 && arg5 <= var10) {
            return true;
        } else if (arg4 - 1 == arg7 && arg5 >= arg6 && arg5 <= var10 && (this.field1586[arg7 - this.field1582][arg5 - this.field1583] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg5 >= arg6 && arg5 <= var10 && (this.field1586[arg7 - this.field1582][arg5 - this.field1583] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg5 && arg7 >= arg4 && arg7 <= var9 && (this.field1586[arg7 - this.field1582][arg5 - this.field1583] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg7 >= arg4 && arg7 <= var9 && (this.field1586[arg7 - this.field1582][arg5 - this.field1583] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
