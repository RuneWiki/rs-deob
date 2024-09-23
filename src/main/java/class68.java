import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YMCKWFGH")
public class class68 {

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "Z")
    private boolean field1633 = false;

    @OriginalMember(owner = "YMCKWFGH", name = "b", descriptor = "Z")
    private boolean field1634 = true;

    @OriginalMember(owner = "YMCKWFGH", name = "d", descriptor = "B")
    private byte field1636 = -53;

    @OriginalMember(owner = "YMCKWFGH", name = "e", descriptor = "I")
    private int field1637 = -479;

    @OriginalMember(owner = "YMCKWFGH", name = "f", descriptor = "B")
    private byte field1638 = 71;

    @OriginalMember(owner = "YMCKWFGH", name = "g", descriptor = "Z")
    private boolean field1639 = false;

    @OriginalMember(owner = "YMCKWFGH", name = "h", descriptor = "I")
    public int field1640 = 0;

    @OriginalMember(owner = "YMCKWFGH", name = "i", descriptor = "I")
    public int field1641 = 0;

    @OriginalMember(owner = "YMCKWFGH", name = "j", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "YMCKWFGH", name = "k", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "YMCKWFGH", name = "l", descriptor = "[[I")
    public int[][] field1644;

    @OriginalMember(owner = "YMCKWFGH", name = "c", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "YMCKWFGH", name = "<init>", descriptor = "(III)V")
    public class68(int arg0, int arg1, int arg2) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        this.field1642 = arg1;
        this.field1643 = arg2;
        this.field1644 = new int[this.field1642][this.field1643];
        this.method569();
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "()V")
    public void method569() {
        for (int var1 = 0; var1 < this.field1642; var1++) {
            for (int var2 = 0; var2 < this.field1643; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1642 - 1 == var1 || this.field1643 - 1 == var2) {
                    this.field1644[var1][var2] = 16777215;
                } else {
                    this.field1644[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(IIZIII)V")
    public void method570(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field1640;
        int var8 = 3 / arg5;
        int var9 = arg0 - this.field1641;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method573(var7, var9, 128);
                this.method573(var7 - 1, var9, 8);
            }
            if (arg4 == 1) {
                this.method573(var7, var9, 2);
                this.method573(var7, var9 + 1, 32);
            }
            if (arg4 == 2) {
                this.method573(var7, var9, 8);
                this.method573(var7 + 1, var9, 128);
            }
            if (arg4 == 3) {
                this.method573(var7, var9, 32);
                this.method573(var7, var9 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method573(var7, var9, 1);
                this.method573(var7 - 1, var9 + 1, 16);
            }
            if (arg4 == 1) {
                this.method573(var7, var9, 4);
                this.method573(var7 + 1, var9 + 1, 64);
            }
            if (arg4 == 2) {
                this.method573(var7, var9, 16);
                this.method573(var7 + 1, var9 - 1, 1);
            }
            if (arg4 == 3) {
                this.method573(var7, var9, 64);
                this.method573(var7 - 1, var9 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method573(var7, var9, 130);
                this.method573(var7 - 1, var9, 8);
                this.method573(var7, var9 + 1, 32);
            }
            if (arg4 == 1) {
                this.method573(var7, var9, 10);
                this.method573(var7, var9 + 1, 32);
                this.method573(var7 + 1, var9, 128);
            }
            if (arg4 == 2) {
                this.method573(var7, var9, 40);
                this.method573(var7 + 1, var9, 128);
                this.method573(var7, var9 - 1, 2);
            }
            if (arg4 == 3) {
                this.method573(var7, var9, 160);
                this.method573(var7, var9 - 1, 2);
                this.method573(var7 - 1, var9, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method573(var7, var9, 65536);
                this.method573(var7 - 1, var9, 4096);
            }
            if (arg4 == 1) {
                this.method573(var7, var9, 1024);
                this.method573(var7, var9 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method573(var7, var9, 4096);
                this.method573(var7 + 1, var9, 65536);
            }
            if (arg4 == 3) {
                this.method573(var7, var9, 16384);
                this.method573(var7, var9 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method573(var7, var9, 512);
                this.method573(var7 - 1, var9 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method573(var7, var9, 2048);
                this.method573(var7 + 1, var9 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method573(var7, var9, 8192);
                this.method573(var7 + 1, var9 - 1, 512);
            }
            if (arg4 == 3) {
                this.method573(var7, var9, 32768);
                this.method573(var7 - 1, var9 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method573(var7, var9, 66560);
            this.method573(var7 - 1, var9, 4096);
            this.method573(var7, var9 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method573(var7, var9, 5120);
            this.method573(var7, var9 + 1, 16384);
            this.method573(var7 + 1, var9, 65536);
        }
        if (arg4 == 2) {
            this.method573(var7, var9, 20480);
            this.method573(var7 + 1, var9, 65536);
            this.method573(var7, var9 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method573(var7, var9, 81920);
            this.method573(var7, var9 - 1, 1024);
            this.method573(var7 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(IZIIIII)V")
    public void method571(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1640;
        int var10 = arg3 - this.field1641;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1642) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1643) {
                        this.method573(var12, var13, var8);
                    }
                }
            }
        }
        if (arg0 != 15914) {
            this.field1633 = !this.field1633;
        }
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(III)V")
    public void method572(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1640;
        if (this.field1635 != arg0) {
            this.field1633 = !this.field1633;
        }
        int var5 = arg2 - this.field1641;
        this.field1644[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "YMCKWFGH", name = "b", descriptor = "(III)V")
    private void method573(int arg0, int arg1, int arg2) {
        this.field1644[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(ZIIIIB)V")
    public void method574(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = arg3 - this.field1640;
        if (this.field1638 != arg5) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg1 - this.field1641;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method576(false, 128, var7, var9);
                this.method576(false, 8, var7 - 1, var9);
            }
            if (arg2 == 1) {
                this.method576(false, 2, var7, var9);
                this.method576(false, 32, var7, var9 + 1);
            }
            if (arg2 == 2) {
                this.method576(false, 8, var7, var9);
                this.method576(false, 128, var7 + 1, var9);
            }
            if (arg2 == 3) {
                this.method576(false, 32, var7, var9);
                this.method576(false, 2, var7, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method576(false, 1, var7, var9);
                this.method576(false, 16, var7 - 1, var9 + 1);
            }
            if (arg2 == 1) {
                this.method576(false, 4, var7, var9);
                this.method576(false, 64, var7 + 1, var9 + 1);
            }
            if (arg2 == 2) {
                this.method576(false, 16, var7, var9);
                this.method576(false, 1, var7 + 1, var9 - 1);
            }
            if (arg2 == 3) {
                this.method576(false, 64, var7, var9);
                this.method576(false, 4, var7 - 1, var9 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method576(false, 130, var7, var9);
                this.method576(false, 8, var7 - 1, var9);
                this.method576(false, 32, var7, var9 + 1);
            }
            if (arg2 == 1) {
                this.method576(false, 10, var7, var9);
                this.method576(false, 32, var7, var9 + 1);
                this.method576(false, 128, var7 + 1, var9);
            }
            if (arg2 == 2) {
                this.method576(false, 40, var7, var9);
                this.method576(false, 128, var7 + 1, var9);
                this.method576(false, 2, var7, var9 - 1);
            }
            if (arg2 == 3) {
                this.method576(false, 160, var7, var9);
                this.method576(false, 2, var7, var9 - 1);
                this.method576(false, 8, var7 - 1, var9);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method576(false, 65536, var7, var9);
                this.method576(false, 4096, var7 - 1, var9);
            }
            if (arg2 == 1) {
                this.method576(false, 1024, var7, var9);
                this.method576(false, 16384, var7, var9 + 1);
            }
            if (arg2 == 2) {
                this.method576(false, 4096, var7, var9);
                this.method576(false, 65536, var7 + 1, var9);
            }
            if (arg2 == 3) {
                this.method576(false, 16384, var7, var9);
                this.method576(false, 1024, var7, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method576(false, 512, var7, var9);
                this.method576(false, 8192, var7 - 1, var9 + 1);
            }
            if (arg2 == 1) {
                this.method576(false, 2048, var7, var9);
                this.method576(false, 32768, var7 + 1, var9 + 1);
            }
            if (arg2 == 2) {
                this.method576(false, 8192, var7, var9);
                this.method576(false, 512, var7 + 1, var9 - 1);
            }
            if (arg2 == 3) {
                this.method576(false, 32768, var7, var9);
                this.method576(false, 2048, var7 - 1, var9 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method576(false, 66560, var7, var9);
            this.method576(false, 4096, var7 - 1, var9);
            this.method576(false, 16384, var7, var9 + 1);
        }
        if (arg2 == 1) {
            this.method576(false, 5120, var7, var9);
            this.method576(false, 16384, var7, var9 + 1);
            this.method576(false, 65536, var7 + 1, var9);
        }
        if (arg2 == 2) {
            this.method576(false, 20480, var7, var9);
            this.method576(false, 65536, var7 + 1, var9);
            this.method576(false, 1024, var7, var9 - 1);
        }
        if (arg2 == 3) {
            this.method576(false, 81920, var7, var9);
            this.method576(false, 1024, var7, var9 - 1);
            this.method576(false, 4096, var7 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(IIIZIII)V")
    public void method575(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1640;
        int var10 = 0 / arg1;
        int var11 = arg2 - this.field1641;
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg5;
            arg5 = arg4;
            arg4 = var12;
        }
        for (int var13 = var9; var13 < arg5 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1642) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1643) {
                        this.method576(false, var8, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(ZIII)V")
    private void method576(boolean arg0, int arg1, int arg2, int arg3) {
        this.field1644[arg2][arg3] &= 16777215 - arg1;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "YMCKWFGH", name = "c", descriptor = "(III)V")
    public void method577(int arg0, int arg1, int arg2) {
        if (arg0 > 0) {
            int var4 = arg2 - this.field1640;
            int var5 = arg1 - this.field1641;
            this.field1644[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg1 == arg5) {
            return true;
        }
        int var8 = arg0 - this.field1640;
        int var9 = arg1 - this.field1641;
        int var10 = arg3 - this.field1640;
        if (arg6 != 25096) {
            throw new NullPointerException();
        }
        int var11 = arg5 - this.field1641;
        if (arg2 == 0) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1644[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1644[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1644[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1644[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1644[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1644[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1644[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1644[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1644[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1644[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1644[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "YMCKWFGH", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field1640;
        int var9 = 83 / arg3;
        int var10 = arg4 - this.field1641;
        int var11 = arg1 - this.field1640;
        int var12 = arg2 - this.field1641;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1644[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1644[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1644[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field1644[var8][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field1644[var8][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1644[var8][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var11 + 1 == var8 && var10 == var12 && (this.field1644[var8][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field1644[var8][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field1644[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field1644[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field1644[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field1644[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "YMCKWFGH", name = "a", descriptor = "(IIIIBIII)Z")
    public boolean method580(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 + arg6 - 1;
        int var10 = arg0 + arg1 - 1;
        if (arg4 != -93) {
            this.field1634 = !this.field1634;
        }
        if (arg3 >= arg6 && arg3 <= var9 && arg2 >= arg1 && arg2 <= var10) {
            return true;
        } else if (arg6 - 1 == arg3 && arg2 >= arg1 && arg2 <= var10 && (this.field1644[arg3 - this.field1640][arg2 - this.field1641] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg2 >= arg1 && arg2 <= var10 && (this.field1644[arg3 - this.field1640][arg2 - this.field1641] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg2 && arg3 >= arg6 && arg3 <= var9 && (this.field1644[arg3 - this.field1640][arg2 - this.field1641] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg3 >= arg6 && arg3 <= var9 && (this.field1644[arg3 - this.field1640][arg2 - this.field1641] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
