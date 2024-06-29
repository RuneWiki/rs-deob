import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YCMSDYIA")
public class class67 {

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "I")
    private int field1667 = 135;

    @OriginalMember(owner = "client!YCMSDYIA", name = "c", descriptor = "Z")
    private boolean field1669 = false;

    @OriginalMember(owner = "client!YCMSDYIA", name = "d", descriptor = "Z")
    private boolean field1670 = false;

    @OriginalMember(owner = "client!YCMSDYIA", name = "e", descriptor = "Z")
    private boolean field1671 = true;

    @OriginalMember(owner = "client!YCMSDYIA", name = "f", descriptor = "I")
    public int field1672 = 0;

    @OriginalMember(owner = "client!YCMSDYIA", name = "g", descriptor = "I")
    public int field1673 = 0;

    @OriginalMember(owner = "client!YCMSDYIA", name = "b", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client!YCMSDYIA", name = "h", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!YCMSDYIA", name = "i", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!YCMSDYIA", name = "j", descriptor = "[[I")
    public int[][] field1676;

    @OriginalMember(owner = "client!YCMSDYIA", name = "<init>", descriptor = "(IZI)V")
    public class67(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field1668 = 338;
        }
        this.field1674 = arg0;
        this.field1675 = arg2;
        this.field1676 = new int[this.field1674][this.field1675];
        this.method561();
        if (class35.field1047) {
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "()V")
    public void method561() {
        for (int var1 = 0; var1 < this.field1674; var1++) {
            for (int var2 = 0; var2 < this.field1675; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1674 - 1 == var1 || this.field1675 - 1 == var2) {
                    this.field1676[var1][var2] = 16777215;
                } else {
                    this.field1676[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(ZIIIII)V")
    public void method562(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        while (arg2 >= 0) {
            this.field1668 = -187;
        }
        int var7 = arg5 - this.field1672;
        int var8 = arg3 - this.field1673;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method565(var7, var8, 128);
                this.method565(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method565(var7, var8, 2);
                this.method565(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method565(var7, var8, 8);
                this.method565(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method565(var7, var8, 32);
                this.method565(var7, var8 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method565(var7, var8, 1);
                this.method565(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method565(var7, var8, 4);
                this.method565(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method565(var7, var8, 16);
                this.method565(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method565(var7, var8, 64);
                this.method565(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method565(var7, var8, 130);
                this.method565(var7 - 1, var8, 8);
                this.method565(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method565(var7, var8, 10);
                this.method565(var7, var8 + 1, 32);
                this.method565(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method565(var7, var8, 40);
                this.method565(var7 + 1, var8, 128);
                this.method565(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method565(var7, var8, 160);
                this.method565(var7, var8 - 1, 2);
                this.method565(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method565(var7, var8, 65536);
                this.method565(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method565(var7, var8, 1024);
                this.method565(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method565(var7, var8, 4096);
                this.method565(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method565(var7, var8, 16384);
                this.method565(var7, var8 - 1, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method565(var7, var8, 512);
                this.method565(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method565(var7, var8, 2048);
                this.method565(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method565(var7, var8, 8192);
                this.method565(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method565(var7, var8, 32768);
                this.method565(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method565(var7, var8, 66560);
            this.method565(var7 - 1, var8, 4096);
            this.method565(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method565(var7, var8, 5120);
            this.method565(var7, var8 + 1, 16384);
            this.method565(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method565(var7, var8, 20480);
            this.method565(var7 + 1, var8, 65536);
            this.method565(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method565(var7, var8, 81920);
            this.method565(var7, var8 - 1, 1024);
            this.method565(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(ZIIIIII)V")
    public void method563(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1672;
        if (arg5 <= 0) {
            return;
        }
        int var10 = arg4 - this.field1673;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1674) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1675) {
                        this.method565(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IZI)V")
    public void method564(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field1672;
        int var5 = arg2 - this.field1673;
        this.field1676[var4][var5] |= 0x200000;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(III)V")
    private void method565(int arg0, int arg1, int arg2) {
        this.field1676[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "b", descriptor = "(ZIIIII)V")
    public void method566(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1672;
        if (arg5 <= 0) {
            return;
        }
        int var8 = arg2 - this.field1673;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method568(var7, (byte) 10, 128, var8);
                this.method568(var7 - 1, (byte) 10, 8, var8);
            }
            if (arg1 == 1) {
                this.method568(var7, (byte) 10, 2, var8);
                this.method568(var7, (byte) 10, 32, var8 + 1);
            }
            if (arg1 == 2) {
                this.method568(var7, (byte) 10, 8, var8);
                this.method568(var7 + 1, (byte) 10, 128, var8);
            }
            if (arg1 == 3) {
                this.method568(var7, (byte) 10, 32, var8);
                this.method568(var7, (byte) 10, 2, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method568(var7, (byte) 10, 1, var8);
                this.method568(var7 - 1, (byte) 10, 16, var8 + 1);
            }
            if (arg1 == 1) {
                this.method568(var7, (byte) 10, 4, var8);
                this.method568(var7 + 1, (byte) 10, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method568(var7, (byte) 10, 16, var8);
                this.method568(var7 + 1, (byte) 10, 1, var8 - 1);
            }
            if (arg1 == 3) {
                this.method568(var7, (byte) 10, 64, var8);
                this.method568(var7 - 1, (byte) 10, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method568(var7, (byte) 10, 130, var8);
                this.method568(var7 - 1, (byte) 10, 8, var8);
                this.method568(var7, (byte) 10, 32, var8 + 1);
            }
            if (arg1 == 1) {
                this.method568(var7, (byte) 10, 10, var8);
                this.method568(var7, (byte) 10, 32, var8 + 1);
                this.method568(var7 + 1, (byte) 10, 128, var8);
            }
            if (arg1 == 2) {
                this.method568(var7, (byte) 10, 40, var8);
                this.method568(var7 + 1, (byte) 10, 128, var8);
                this.method568(var7, (byte) 10, 2, var8 - 1);
            }
            if (arg1 == 3) {
                this.method568(var7, (byte) 10, 160, var8);
                this.method568(var7, (byte) 10, 2, var8 - 1);
                this.method568(var7 - 1, (byte) 10, 8, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method568(var7, (byte) 10, 65536, var8);
                this.method568(var7 - 1, (byte) 10, 4096, var8);
            }
            if (arg1 == 1) {
                this.method568(var7, (byte) 10, 1024, var8);
                this.method568(var7, (byte) 10, 16384, var8 + 1);
            }
            if (arg1 == 2) {
                this.method568(var7, (byte) 10, 4096, var8);
                this.method568(var7 + 1, (byte) 10, 65536, var8);
            }
            if (arg1 == 3) {
                this.method568(var7, (byte) 10, 16384, var8);
                this.method568(var7, (byte) 10, 1024, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method568(var7, (byte) 10, 512, var8);
                this.method568(var7 - 1, (byte) 10, 8192, var8 + 1);
            }
            if (arg1 == 1) {
                this.method568(var7, (byte) 10, 2048, var8);
                this.method568(var7 + 1, (byte) 10, 32768, var8 + 1);
            }
            if (arg1 == 2) {
                this.method568(var7, (byte) 10, 8192, var8);
                this.method568(var7 + 1, (byte) 10, 512, var8 - 1);
            }
            if (arg1 == 3) {
                this.method568(var7, (byte) 10, 32768, var8);
                this.method568(var7 - 1, (byte) 10, 2048, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method568(var7, (byte) 10, 66560, var8);
            this.method568(var7 - 1, (byte) 10, 4096, var8);
            this.method568(var7, (byte) 10, 16384, var8 + 1);
        }
        if (arg1 == 1) {
            this.method568(var7, (byte) 10, 5120, var8);
            this.method568(var7, (byte) 10, 16384, var8 + 1);
            this.method568(var7 + 1, (byte) 10, 65536, var8);
        }
        if (arg1 == 2) {
            this.method568(var7, (byte) 10, 20480, var8);
            this.method568(var7 + 1, (byte) 10, 65536, var8);
            this.method568(var7, (byte) 10, 1024, var8 - 1);
        }
        if (arg1 == 3) {
            this.method568(var7, (byte) 10, 81920, var8);
            this.method568(var7, (byte) 10, 1024, var8 - 1);
            this.method568(var7 - 1, (byte) 10, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IZIIIIZ)V")
    public void method567(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        int var10 = arg2 - this.field1672;
        int var11 = arg5 - this.field1673;
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg0;
            arg0 = arg4;
            arg4 = var12;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1674) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1675) {
                        this.method568(var13, (byte) 10, var9, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IBII)V")
    private void method568(int arg0, byte arg1, int arg2, int arg3) {
        this.field1676[arg0][arg3] &= 16777215 - arg2;
        if (arg1 != 10) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "b", descriptor = "(III)V")
    public void method569(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1672;
        if (arg1 != 47403) {
            this.field1671 = !this.field1671;
        }
        int var5 = arg0 - this.field1673;
        this.field1676[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IIIZIII)Z")
    public boolean method570(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg4 == arg5 && arg0 == arg2) {
            return true;
        }
        int var8 = arg4 - this.field1672;
        int var9 = arg0 - this.field1673;
        int var10 = arg5 - this.field1672;
        int var11 = arg2 - this.field1673;
        if (!arg3) {
            throw new NullPointerException();
        }
        if (arg1 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            this.field1669 = !this.field1669;
        }
        if (arg1 == arg3 && arg4 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field1672;
        int var9 = arg6 - this.field1673;
        int var10 = arg3 - this.field1672;
        int var11 = arg4 - this.field1673;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1676[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1676[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1676[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IIZIIIII)Z")
    public boolean method572(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            throw new NullPointerException();
        }
        int var9 = arg0 + arg3 - 1;
        int var10 = arg4 + arg7 - 1;
        if (arg5 >= arg3 && arg5 <= var9 && arg1 >= arg7 && arg1 <= var10) {
            return true;
        } else if (arg3 - 1 == arg5 && arg1 >= arg7 && arg1 <= var10 && (this.field1676[arg5 - this.field1672][arg1 - this.field1673] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg1 >= arg7 && arg1 <= var10 && (this.field1676[arg5 - this.field1672][arg1 - this.field1673] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg1 && arg5 >= arg3 && arg5 <= var9 && (this.field1676[arg5 - this.field1672][arg1 - this.field1673] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg5 >= arg3 && arg5 <= var9 && (this.field1676[arg5 - this.field1672][arg1 - this.field1673] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
