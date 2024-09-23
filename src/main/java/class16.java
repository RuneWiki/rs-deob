import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DYTTVJNT")
public class class16 {

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "Z")
    private boolean field748 = false;

    @OriginalMember(owner = "DYTTVJNT", name = "b", descriptor = "I")
    private int field749 = 334;

    @OriginalMember(owner = "DYTTVJNT", name = "c", descriptor = "Z")
    private boolean field750 = true;

    @OriginalMember(owner = "DYTTVJNT", name = "d", descriptor = "I")
    private int field751 = 27473;

    @OriginalMember(owner = "DYTTVJNT", name = "e", descriptor = "Z")
    private boolean field752 = false;

    @OriginalMember(owner = "DYTTVJNT", name = "f", descriptor = "B")
    private byte field753 = 2;

    @OriginalMember(owner = "DYTTVJNT", name = "g", descriptor = "I")
    private int field754 = 4;

    @OriginalMember(owner = "DYTTVJNT", name = "h", descriptor = "Z")
    private boolean field755 = true;

    @OriginalMember(owner = "DYTTVJNT", name = "i", descriptor = "I")
    private int field756 = 1;

    @OriginalMember(owner = "DYTTVJNT", name = "j", descriptor = "I")
    public int field757 = 0;

    @OriginalMember(owner = "DYTTVJNT", name = "k", descriptor = "I")
    public int field758 = 0;

    @OriginalMember(owner = "DYTTVJNT", name = "l", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "DYTTVJNT", name = "m", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "DYTTVJNT", name = "n", descriptor = "[[I")
    public int[][] field761;

    @OriginalMember(owner = "DYTTVJNT", name = "<init>", descriptor = "(BII)V")
    public class16(byte arg0, int arg1, int arg2) {
        this.field759 = arg1;
        this.field760 = arg2;
        this.field761 = new int[this.field759][this.field760];
        if (arg0 != 6) {
            this.field756 = 431;
        }
        this.method200();
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "()V")
    public void method200() {
        for (int var1 = 0; var1 < this.field759; var1++) {
            for (int var2 = 0; var2 < this.field760; var2++) {
                if (var1 == 0 || var2 == 0 || this.field759 - 1 == var1 || this.field760 - 1 == var2) {
                    this.field761[var1][var2] = 16777215;
                } else {
                    this.field761[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(ZIIZII)V")
    public void method201(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field757;
        if (arg0) {
            this.field748 = !this.field748;
        }
        int var8 = arg5 - this.field758;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method204(var7, var8, 128);
                this.method204(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method204(var7, var8, 2);
                this.method204(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method204(var7, var8, 8);
                this.method204(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method204(var7, var8, 32);
                this.method204(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method204(var7, var8, 1);
                this.method204(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method204(var7, var8, 4);
                this.method204(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method204(var7, var8, 16);
                this.method204(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method204(var7, var8, 64);
                this.method204(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method204(var7, var8, 130);
                this.method204(var7 - 1, var8, 8);
                this.method204(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method204(var7, var8, 10);
                this.method204(var7, var8 + 1, 32);
                this.method204(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method204(var7, var8, 40);
                this.method204(var7 + 1, var8, 128);
                this.method204(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method204(var7, var8, 160);
                this.method204(var7, var8 - 1, 2);
                this.method204(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method204(var7, var8, 65536);
                this.method204(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method204(var7, var8, 1024);
                this.method204(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method204(var7, var8, 4096);
                this.method204(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method204(var7, var8, 16384);
                this.method204(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method204(var7, var8, 512);
                this.method204(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method204(var7, var8, 2048);
                this.method204(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method204(var7, var8, 8192);
                this.method204(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method204(var7, var8, 32768);
                this.method204(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method204(var7, var8, 66560);
            this.method204(var7 - 1, var8, 4096);
            this.method204(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method204(var7, var8, 5120);
            this.method204(var7, var8 + 1, 16384);
            this.method204(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method204(var7, var8, 20480);
            this.method204(var7 + 1, var8, 65536);
            this.method204(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method204(var7, var8, 81920);
            this.method204(var7, var8 - 1, 1024);
            this.method204(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(IIZZIII)V")
    public void method202(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field757;
        int var10 = arg6 - this.field758;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg0;
            arg0 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field759) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field760) {
                        this.method204(var12, var13, var8);
                    }
                }
            }
        }
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(III)V")
    public void method203(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field757;
        int var5 = arg2 - this.field758;
        this.field761[var4][var5] |= 0x200000;
        if (arg0 <= 0) {
            this.field756 = -189;
        }
    }

    @OriginalMember(owner = "DYTTVJNT", name = "b", descriptor = "(III)V")
    private void method204(int arg0, int arg1, int arg2) {
        this.field761[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(IIZIII)V")
    public void method205(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field757;
        int var8 = arg5 - this.field758;
        if (arg3 != 4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method207(128, false, var7, var8);
                this.method207(8, false, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method207(2, false, var7, var8);
                this.method207(32, false, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method207(8, false, var7, var8);
                this.method207(128, false, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method207(32, false, var7, var8);
                this.method207(2, false, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method207(1, false, var7, var8);
                this.method207(16, false, var7 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method207(4, false, var7, var8);
                this.method207(64, false, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method207(16, false, var7, var8);
                this.method207(1, false, var7 + 1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method207(64, false, var7, var8);
                this.method207(4, false, var7 - 1, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method207(130, false, var7, var8);
                this.method207(8, false, var7 - 1, var8);
                this.method207(32, false, var7, var8 + 1);
            }
            if (arg4 == 1) {
                this.method207(10, false, var7, var8);
                this.method207(32, false, var7, var8 + 1);
                this.method207(128, false, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method207(40, false, var7, var8);
                this.method207(128, false, var7 + 1, var8);
                this.method207(2, false, var7, var8 - 1);
            }
            if (arg4 == 3) {
                this.method207(160, false, var7, var8);
                this.method207(2, false, var7, var8 - 1);
                this.method207(8, false, var7 - 1, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method207(65536, false, var7, var8);
                this.method207(4096, false, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method207(1024, false, var7, var8);
                this.method207(16384, false, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method207(4096, false, var7, var8);
                this.method207(65536, false, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method207(16384, false, var7, var8);
                this.method207(1024, false, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method207(512, false, var7, var8);
                this.method207(8192, false, var7 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method207(2048, false, var7, var8);
                this.method207(32768, false, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method207(8192, false, var7, var8);
                this.method207(512, false, var7 + 1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method207(32768, false, var7, var8);
                this.method207(2048, false, var7 - 1, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method207(66560, false, var7, var8);
            this.method207(4096, false, var7 - 1, var8);
            this.method207(16384, false, var7, var8 + 1);
        }
        if (arg4 == 1) {
            this.method207(5120, false, var7, var8);
            this.method207(16384, false, var7, var8 + 1);
            this.method207(65536, false, var7 + 1, var8);
        }
        if (arg4 == 2) {
            this.method207(20480, false, var7, var8);
            this.method207(65536, false, var7 + 1, var8);
            this.method207(1024, false, var7, var8 - 1);
        }
        if (arg4 == 3) {
            this.method207(81920, false, var7, var8);
            this.method207(1024, false, var7, var8 - 1);
            this.method207(4096, false, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(IIIIIIZ)V")
    public void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 != 0) {
            this.field749 = -441;
        }
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field757;
        int var10 = arg0 - this.field758;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field759) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field760) {
                        this.method207(var8, false, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(IZII)V")
    private void method207(int arg0, boolean arg1, int arg2, int arg3) {
        this.field761[arg2][arg3] &= 16777215 - arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(IZI)V")
    public void method208(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field757;
        int var5 = arg2 - this.field758;
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field761[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(IIIZIII)Z")
    public boolean method209(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            this.field755 = !this.field755;
        }
        if (arg0 == arg1 && arg4 == arg5) {
            return true;
        }
        int var8 = arg0 - this.field757;
        int var9 = arg5 - this.field758;
        int var10 = arg1 - this.field757;
        int var11 = arg4 - this.field758;
        if (arg2 == 0) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg6 && arg1 == arg5) {
            return true;
        }
        int var8 = arg6 - this.field757;
        if (this.field751 != arg4) {
            this.field756 = -393;
        }
        int var9 = arg5 - this.field758;
        int var10 = arg3 - this.field757;
        int var11 = arg1 - this.field758;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field761[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field761[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field761[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "DYTTVJNT", name = "a", descriptor = "(ZIIIIIII)Z")
    public boolean method211(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1 + arg4 - 1;
        int var10 = arg3 + arg6 - 1;
        if (arg0) {
            throw new NullPointerException();
        } else if (arg5 >= arg1 && arg5 <= var9 && arg2 >= arg3 && arg2 <= var10) {
            return true;
        } else if (arg1 - 1 == arg5 && arg2 >= arg3 && arg2 <= var10 && (this.field761[arg5 - this.field757][arg2 - this.field758] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg2 >= arg3 && arg2 <= var10 && (this.field761[arg5 - this.field757][arg2 - this.field758] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg2 && arg5 >= arg1 && arg5 <= var9 && (this.field761[arg5 - this.field757][arg2 - this.field758] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg5 >= arg1 && arg5 <= var9 && (this.field761[arg5 - this.field757][arg2 - this.field758] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
