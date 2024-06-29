import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FUVVWALN")
public class class13 {

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "I")
    private int field745 = 4;

    @OriginalMember(owner = "client!FUVVWALN", name = "b", descriptor = "Z")
    private boolean field746 = true;

    @OriginalMember(owner = "client!FUVVWALN", name = "c", descriptor = "Z")
    private boolean field747 = false;

    @OriginalMember(owner = "client!FUVVWALN", name = "d", descriptor = "Z")
    private boolean field748 = false;

    @OriginalMember(owner = "client!FUVVWALN", name = "e", descriptor = "I")
    private int field749 = -23862;

    @OriginalMember(owner = "client!FUVVWALN", name = "f", descriptor = "I")
    private int field750 = -36;

    @OriginalMember(owner = "client!FUVVWALN", name = "g", descriptor = "I")
    public int field751 = 0;

    @OriginalMember(owner = "client!FUVVWALN", name = "h", descriptor = "I")
    public int field752 = 0;

    @OriginalMember(owner = "client!FUVVWALN", name = "i", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!FUVVWALN", name = "j", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!FUVVWALN", name = "k", descriptor = "[[I")
    public int[][] field755;

    @OriginalMember(owner = "client!FUVVWALN", name = "<init>", descriptor = "(III)V")
    public class13(int arg0, int arg1, int arg2) {
        this.field753 = arg0;
        int var4 = 23 / arg1;
        this.field754 = arg2;
        this.field755 = new int[this.field753][this.field754];
        this.method228();
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "()V")
    public void method228() {
        for (int var1 = 0; var1 < this.field753; var1++) {
            for (int var2 = 0; var2 < this.field754; var2++) {
                if (var1 == 0 || var2 == 0 || this.field753 - 1 == var1 || this.field754 - 1 == var2) {
                    this.field755[var1][var2] = 16777215;
                } else {
                    this.field755[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IZIBII)V")
    public void method229(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field751;
        if (arg3 != -50) {
            return;
        }
        int var8 = arg5 - this.field752;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method232(var7, var8, 128);
                this.method232(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method232(var7, var8, 2);
                this.method232(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method232(var7, var8, 8);
                this.method232(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method232(var7, var8, 32);
                this.method232(var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method232(var7, var8, 1);
                this.method232(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method232(var7, var8, 4);
                this.method232(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method232(var7, var8, 16);
                this.method232(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method232(var7, var8, 64);
                this.method232(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method232(var7, var8, 130);
                this.method232(var7 - 1, var8, 8);
                this.method232(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method232(var7, var8, 10);
                this.method232(var7, var8 + 1, 32);
                this.method232(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method232(var7, var8, 40);
                this.method232(var7 + 1, var8, 128);
                this.method232(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method232(var7, var8, 160);
                this.method232(var7, var8 - 1, 2);
                this.method232(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method232(var7, var8, 65536);
                this.method232(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method232(var7, var8, 1024);
                this.method232(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method232(var7, var8, 4096);
                this.method232(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method232(var7, var8, 16384);
                this.method232(var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method232(var7, var8, 512);
                this.method232(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method232(var7, var8, 2048);
                this.method232(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method232(var7, var8, 8192);
                this.method232(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method232(var7, var8, 32768);
                this.method232(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method232(var7, var8, 66560);
            this.method232(var7 - 1, var8, 4096);
            this.method232(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method232(var7, var8, 5120);
            this.method232(var7, var8 + 1, 16384);
            this.method232(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method232(var7, var8, 20480);
            this.method232(var7 + 1, var8, 65536);
            this.method232(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method232(var7, var8, 81920);
            this.method232(var7, var8 - 1, 1024);
            this.method232(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIZIII)V")
    public void method230(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field751;
        int var10 = arg6 - this.field752;
        if (arg4 >= 0) {
            return;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg5;
            arg5 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field753) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field754) {
                        this.method232(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIZ)V")
    public void method231(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field751;
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = arg1 - this.field752;
        this.field755[var4][var6] |= 0x200000;
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(III)V")
    private void method232(int arg0, int arg1, int arg2) {
        this.field755[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIIZI)V")
    public void method233(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != 1) {
            return;
        }
        int var7 = arg2 - this.field751;
        int var8 = arg3 - this.field752;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method235(this.field749, var7, var8, 128);
                this.method235(this.field749, var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method235(this.field749, var7, var8, 2);
                this.method235(this.field749, var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method235(this.field749, var7, var8, 8);
                this.method235(this.field749, var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method235(this.field749, var7, var8, 32);
                this.method235(this.field749, var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method235(this.field749, var7, var8, 1);
                this.method235(this.field749, var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method235(this.field749, var7, var8, 4);
                this.method235(this.field749, var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method235(this.field749, var7, var8, 16);
                this.method235(this.field749, var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method235(this.field749, var7, var8, 64);
                this.method235(this.field749, var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method235(this.field749, var7, var8, 130);
                this.method235(this.field749, var7 - 1, var8, 8);
                this.method235(this.field749, var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method235(this.field749, var7, var8, 10);
                this.method235(this.field749, var7, var8 + 1, 32);
                this.method235(this.field749, var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method235(this.field749, var7, var8, 40);
                this.method235(this.field749, var7 + 1, var8, 128);
                this.method235(this.field749, var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method235(this.field749, var7, var8, 160);
                this.method235(this.field749, var7, var8 - 1, 2);
                this.method235(this.field749, var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method235(this.field749, var7, var8, 65536);
                this.method235(this.field749, var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method235(this.field749, var7, var8, 1024);
                this.method235(this.field749, var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method235(this.field749, var7, var8, 4096);
                this.method235(this.field749, var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method235(this.field749, var7, var8, 16384);
                this.method235(this.field749, var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method235(this.field749, var7, var8, 512);
                this.method235(this.field749, var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method235(this.field749, var7, var8, 2048);
                this.method235(this.field749, var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method235(this.field749, var7, var8, 8192);
                this.method235(this.field749, var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method235(this.field749, var7, var8, 32768);
                this.method235(this.field749, var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method235(this.field749, var7, var8, 66560);
            this.method235(this.field749, var7 - 1, var8, 4096);
            this.method235(this.field749, var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method235(this.field749, var7, var8, 5120);
            this.method235(this.field749, var7, var8 + 1, 16384);
            this.method235(this.field749, var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method235(this.field749, var7, var8, 20480);
            this.method235(this.field749, var7 + 1, var8, 65536);
            this.method235(this.field749, var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method235(this.field749, var7, var8, 81920);
            this.method235(this.field749, var7, var8 - 1, 1024);
            this.method235(this.field749, var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IZIIZII)V")
    public void method234(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            return;
        }
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field751;
        int var10 = arg5 - this.field752;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field753) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field754) {
                        this.method235(this.field749, var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIII)V")
    private void method235(int arg0, int arg1, int arg2, int arg3) {
        this.field755[arg1][arg2] &= 16777215 - arg3;
        if (arg0 == -23862) {
            ;
        }
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "b", descriptor = "(III)V")
    public void method236(int arg0, int arg1, int arg2) {
        if (arg0 != -1868) {
            this.field748 = !this.field748;
        }
        int var4 = arg2 - this.field751;
        int var5 = arg1 - this.field752;
        this.field755[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == arg4 && arg0 == arg1) {
            return true;
        }
        int var8 = arg4 - this.field751;
        int var9 = arg0 - this.field752;
        int var10 = arg3 - this.field751;
        if (arg6 != 0) {
            this.field745 = 18;
        }
        int var11 = arg1 - this.field752;
        if (arg5 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIBIIII)Z")
    public boolean method238(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 2) {
            throw new NullPointerException();
        } else if (arg5 == arg6 && arg0 == arg1) {
            return true;
        } else {
            int var8 = arg6 - this.field751;
            int var9 = arg1 - this.field752;
            int var10 = arg5 - this.field751;
            int var11 = arg0 - this.field752;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field755[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field755[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field755[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1 + arg3 - 1;
        int var10 = arg0 + arg2 - 1;
        if (arg4 <= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg6 >= arg1 && arg6 <= var9 && arg7 >= arg0 && arg7 <= var10) {
            return true;
        } else if (arg1 - 1 == arg6 && arg7 >= arg0 && arg7 <= var10 && (this.field755[arg6 - this.field751][arg7 - this.field752] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg7 >= arg0 && arg7 <= var10 && (this.field755[arg6 - this.field751][arg7 - this.field752] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg7 && arg6 >= arg1 && arg6 <= var9 && (this.field755[arg6 - this.field751][arg7 - this.field752] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg6 >= arg1 && arg6 <= var9 && (this.field755[arg6 - this.field751][arg7 - this.field752] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }
}
