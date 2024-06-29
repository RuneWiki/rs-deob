import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZSRJFSKK")
public class class70 {

    @OriginalMember(owner = "client!ZSRJFSKK", name = "b", descriptor = "I")
    private int field1708 = 36728;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "c", descriptor = "Z")
    private boolean field1709 = true;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "d", descriptor = "I")
    private int field1710 = 581;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "e", descriptor = "Z")
    private boolean field1711 = false;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "f", descriptor = "I")
    public int field1712 = 0;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "g", descriptor = "I")
    public int field1713 = 0;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "h", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "i", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "j", descriptor = "[[I")
    public int[][] field1716;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "client!ZSRJFSKK", name = "<init>", descriptor = "(III)V")
    public class70(int arg0, int arg1, int arg2) {
        if (arg0 != -14416) {
            throw new NullPointerException();
        }
        this.field1714 = arg2;
        this.field1715 = arg1;
        this.field1716 = new int[this.field1714][this.field1715];
        this.method576();
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "()V")
    public void method576() {
        for (int var1 = 0; var1 < this.field1714; var1++) {
            for (int var2 = 0; var2 < this.field1715; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1714 - 1 == var1 || this.field1715 - 1 == var2) {
                    this.field1716[var1][var2] = 16777215;
                } else {
                    this.field1716[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IZIIII)V")
    public void method577(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field1712;
        int var8 = arg3 - this.field1713;
        if (arg0 != 0) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method580(var7, var8, 128);
                this.method580(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method580(var7, var8, 2);
                this.method580(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method580(var7, var8, 8);
                this.method580(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method580(var7, var8, 32);
                this.method580(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method580(var7, var8, 1);
                this.method580(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method580(var7, var8, 4);
                this.method580(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method580(var7, var8, 16);
                this.method580(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method580(var7, var8, 64);
                this.method580(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method580(var7, var8, 130);
                this.method580(var7 - 1, var8, 8);
                this.method580(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method580(var7, var8, 10);
                this.method580(var7, var8 + 1, 32);
                this.method580(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method580(var7, var8, 40);
                this.method580(var7 + 1, var8, 128);
                this.method580(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method580(var7, var8, 160);
                this.method580(var7, var8 - 1, 2);
                this.method580(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method580(var7, var8, 65536);
                this.method580(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method580(var7, var8, 1024);
                this.method580(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method580(var7, var8, 4096);
                this.method580(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method580(var7, var8, 16384);
                this.method580(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method580(var7, var8, 512);
                this.method580(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method580(var7, var8, 2048);
                this.method580(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method580(var7, var8, 8192);
                this.method580(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method580(var7, var8, 32768);
                this.method580(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method580(var7, var8, 66560);
            this.method580(var7 - 1, var8, 4096);
            this.method580(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method580(var7, var8, 5120);
            this.method580(var7, var8 + 1, 16384);
            this.method580(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method580(var7, var8, 20480);
            this.method580(var7 + 1, var8, 65536);
            this.method580(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method580(var7, var8, 81920);
            this.method580(var7, var8 - 1, 1024);
            this.method580(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIBZII)V")
    public void method578(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3 != 9) {
            return;
        }
        boolean var9 = false;
        if (arg4) {
            var8 += 131072;
        }
        int var10 = arg1 - this.field1712;
        int var11 = arg2 - this.field1713;
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg6;
            arg6 = arg0;
            arg0 = var12;
        }
        for (int var13 = var10; var13 < arg6 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1714) {
                for (int var14 = var11; var14 < arg0 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1715) {
                        this.method580(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IBI)V")
    public void method579(int arg0, byte arg1, int arg2) {
        if (arg1 == 8) {
            boolean var4 = false;
            int var5 = arg0 - this.field1712;
            int var6 = arg2 - this.field1713;
            this.field1716[var5][var6] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(III)V")
    private void method580(int arg0, int arg1, int arg2) {
        this.field1716[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IZIZII)V")
    public void method581(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1712;
        if (!arg1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg0 - this.field1713;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method583(128, (byte) 3, var7, var9);
                this.method583(8, (byte) 3, var7 - 1, var9);
            }
            if (arg2 == 1) {
                this.method583(2, (byte) 3, var7, var9);
                this.method583(32, (byte) 3, var7, var9 + 1);
            }
            if (arg2 == 2) {
                this.method583(8, (byte) 3, var7, var9);
                this.method583(128, (byte) 3, var7 + 1, var9);
            }
            if (arg2 == 3) {
                this.method583(32, (byte) 3, var7, var9);
                this.method583(2, (byte) 3, var7, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method583(1, (byte) 3, var7, var9);
                this.method583(16, (byte) 3, var7 - 1, var9 + 1);
            }
            if (arg2 == 1) {
                this.method583(4, (byte) 3, var7, var9);
                this.method583(64, (byte) 3, var7 + 1, var9 + 1);
            }
            if (arg2 == 2) {
                this.method583(16, (byte) 3, var7, var9);
                this.method583(1, (byte) 3, var7 + 1, var9 - 1);
            }
            if (arg2 == 3) {
                this.method583(64, (byte) 3, var7, var9);
                this.method583(4, (byte) 3, var7 - 1, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method583(130, (byte) 3, var7, var9);
                this.method583(8, (byte) 3, var7 - 1, var9);
                this.method583(32, (byte) 3, var7, var9 + 1);
            }
            if (arg2 == 1) {
                this.method583(10, (byte) 3, var7, var9);
                this.method583(32, (byte) 3, var7, var9 + 1);
                this.method583(128, (byte) 3, var7 + 1, var9);
            }
            if (arg2 == 2) {
                this.method583(40, (byte) 3, var7, var9);
                this.method583(128, (byte) 3, var7 + 1, var9);
                this.method583(2, (byte) 3, var7, var9 - 1);
            }
            if (arg2 == 3) {
                this.method583(160, (byte) 3, var7, var9);
                this.method583(2, (byte) 3, var7, var9 - 1);
                this.method583(8, (byte) 3, var7 - 1, var9);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method583(65536, (byte) 3, var7, var9);
                this.method583(4096, (byte) 3, var7 - 1, var9);
            }
            if (arg2 == 1) {
                this.method583(1024, (byte) 3, var7, var9);
                this.method583(16384, (byte) 3, var7, var9 + 1);
            }
            if (arg2 == 2) {
                this.method583(4096, (byte) 3, var7, var9);
                this.method583(65536, (byte) 3, var7 + 1, var9);
            }
            if (arg2 == 3) {
                this.method583(16384, (byte) 3, var7, var9);
                this.method583(1024, (byte) 3, var7, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method583(512, (byte) 3, var7, var9);
                this.method583(8192, (byte) 3, var7 - 1, var9 + 1);
            }
            if (arg2 == 1) {
                this.method583(2048, (byte) 3, var7, var9);
                this.method583(32768, (byte) 3, var7 + 1, var9 + 1);
            }
            if (arg2 == 2) {
                this.method583(8192, (byte) 3, var7, var9);
                this.method583(512, (byte) 3, var7 + 1, var9 - 1);
            }
            if (arg2 == 3) {
                this.method583(32768, (byte) 3, var7, var9);
                this.method583(2048, (byte) 3, var7 - 1, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method583(66560, (byte) 3, var7, var9);
            this.method583(4096, (byte) 3, var7 - 1, var9);
            this.method583(16384, (byte) 3, var7, var9 + 1);
        }
        if (arg2 == 1) {
            this.method583(5120, (byte) 3, var7, var9);
            this.method583(16384, (byte) 3, var7, var9 + 1);
            this.method583(65536, (byte) 3, var7 + 1, var9);
        }
        if (arg2 == 2) {
            this.method583(20480, (byte) 3, var7, var9);
            this.method583(65536, (byte) 3, var7 + 1, var9);
            this.method583(1024, (byte) 3, var7, var9 - 1);
        }
        if (arg2 == 3) {
            this.method583(81920, (byte) 3, var7, var9);
            this.method583(1024, (byte) 3, var7, var9 - 1);
            this.method583(4096, (byte) 3, var7 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IZIIIII)V")
    public void method582(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= 0) {
            return;
        }
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field1712;
        int var10 = arg4 - this.field1713;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg5;
            arg5 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1714) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1715) {
                        this.method583(var8, (byte) 3, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IBII)V")
    private void method583(int arg0, byte arg1, int arg2, int arg3) {
        this.field1716[arg2][arg3] &= 16777215 - arg0;
        if (arg1 == 3) {
            boolean var5 = false;
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "b", descriptor = "(III)V")
    public void method584(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1712;
        int var5 = arg0 - this.field1713;
        this.field1716[var4][var5] &= 0xDFFFFF;
        if (arg1 != 0) {
            this.field1711 = !this.field1711;
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIZIII)Z")
    public boolean method585(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            throw new NullPointerException();
        } else if (arg5 == arg6 && arg0 == arg4) {
            return true;
        } else {
            int var8 = arg6 - this.field1712;
            int var9 = arg4 - this.field1713;
            int var10 = arg5 - this.field1712;
            int var11 = arg0 - this.field1713;
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -37555) {
            this.field1709 = !this.field1709;
        }
        if (arg5 == arg6 && arg1 == arg2) {
            return true;
        }
        int var8 = arg5 - this.field1712;
        int var9 = arg2 - this.field1713;
        int var10 = arg6 - this.field1712;
        int var11 = arg1 - this.field1713;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1716[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1716[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1716[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= 0) {
            this.field1707 = 94;
        }
        int var9 = arg5 + arg6 - 1;
        int var10 = arg2 + arg4 - 1;
        if (arg1 >= arg5 && arg1 <= var9 && arg0 >= arg4 && arg0 <= var10) {
            return true;
        } else if (arg5 - 1 == arg1 && arg0 >= arg4 && arg0 <= var10 && (this.field1716[arg1 - this.field1712][arg0 - this.field1713] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg1 && arg0 >= arg4 && arg0 <= var10 && (this.field1716[arg1 - this.field1712][arg0 - this.field1713] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg0 && arg1 >= arg5 && arg1 <= var9 && (this.field1716[arg1 - this.field1712][arg0 - this.field1713] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg1 >= arg5 && arg1 <= var9 && (this.field1716[arg1 - this.field1712][arg0 - this.field1713] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
