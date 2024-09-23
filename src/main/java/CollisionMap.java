import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class CollisionMap {

    @OriginalMember(owner = "ac", name = "a", descriptor = "Z")
    private boolean field825 = false;

    @OriginalMember(owner = "ac", name = "c", descriptor = "Z")
    private boolean field827 = false;

    @OriginalMember(owner = "ac", name = "d", descriptor = "Z")
    private boolean field828 = false;

    @OriginalMember(owner = "ac", name = "e", descriptor = "I")
    private int field829 = 90;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    private int field830 = -497;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field831 = 0;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    public int field832 = 0;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "ac", name = "k", descriptor = "[[I")
    public int[][] field835;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field826;

    @OriginalMember(owner = "ac", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        this.field833 = arg2;
        this.field834 = arg0;
        this.field835 = new int[this.field833][this.field834];
        this.method256(573);
        while (arg1 >= 0) {
            this.field826 = -264;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)V")
    public void method256(int arg0) {
        for (int var2 = 0; var2 < this.field833; var2++) {
            for (int var4 = 0; var4 < this.field834; var4++) {
                if (var2 == 0 || var4 == 0 || this.field833 - 1 == var2 || this.field834 - 1 == var4) {
                    this.field835[var2][var4] = 16777215;
                } else {
                    this.field835[var2][var4] = 0;
                }
            }
        }
        int var3 = 61 / arg0;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IZIIII)V")
    public void method257(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field831;
        if (arg4 != -34301) {
            return;
        }
        int var8 = arg3 - this.field832;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method260(var7, var8, 128);
                this.method260(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method260(var7, var8, 2);
                this.method260(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method260(var7, var8, 8);
                this.method260(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method260(var7, var8, 32);
                this.method260(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method260(var7, var8, 1);
                this.method260(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method260(var7, var8, 4);
                this.method260(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method260(var7, var8, 16);
                this.method260(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method260(var7, var8, 64);
                this.method260(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method260(var7, var8, 130);
                this.method260(var7 - 1, var8, 8);
                this.method260(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method260(var7, var8, 10);
                this.method260(var7, var8 + 1, 32);
                this.method260(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method260(var7, var8, 40);
                this.method260(var7 + 1, var8, 128);
                this.method260(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method260(var7, var8, 160);
                this.method260(var7, var8 - 1, 2);
                this.method260(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method260(var7, var8, 65536);
                this.method260(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method260(var7, var8, 1024);
                this.method260(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method260(var7, var8, 4096);
                this.method260(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method260(var7, var8, 16384);
                this.method260(var7, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method260(var7, var8, 512);
                this.method260(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method260(var7, var8, 2048);
                this.method260(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method260(var7, var8, 8192);
                this.method260(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method260(var7, var8, 32768);
                this.method260(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method260(var7, var8, 66560);
            this.method260(var7 - 1, var8, 4096);
            this.method260(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method260(var7, var8, 5120);
            this.method260(var7, var8 + 1, 16384);
            this.method260(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method260(var7, var8, 20480);
            this.method260(var7 + 1, var8, 65536);
            this.method260(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method260(var7, var8, 81920);
            this.method260(var7, var8 - 1, 1024);
            this.method260(var7 - 1, var8, 4096);
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZIIIZII)V")
    public void method258(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg0) {
            this.field826 = 65;
        }
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field831;
        int var10 = arg3 - this.field832;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg1;
            arg1 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field833) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field834) {
                        this.method260(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(BII)V")
    public void method259(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field831;
        int var5 = arg1 - this.field832;
        this.field835[var4][var5] |= 0x200000;
        if (arg0 != 0) {
            this.field825 = !this.field825;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(III)V")
    private void method260(int arg0, int arg1, int arg2) {
        this.field835[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZIIIII)V")
    public void method261(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field831;
        if (arg3 != 2) {
            this.field826 = -18;
        }
        int var8 = arg5 - this.field832;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method263(this.field828, var8, var7, 128);
                this.method263(this.field828, var8, var7 - 1, 8);
            }
            if (arg1 == 1) {
                this.method263(this.field828, var8, var7, 2);
                this.method263(this.field828, var8 + 1, var7, 32);
            }
            if (arg1 == 2) {
                this.method263(this.field828, var8, var7, 8);
                this.method263(this.field828, var8, var7 + 1, 128);
            }
            if (arg1 == 3) {
                this.method263(this.field828, var8, var7, 32);
                this.method263(this.field828, var8 - 1, var7, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method263(this.field828, var8, var7, 1);
                this.method263(this.field828, var8 + 1, var7 - 1, 16);
            }
            if (arg1 == 1) {
                this.method263(this.field828, var8, var7, 4);
                this.method263(this.field828, var8 + 1, var7 + 1, 64);
            }
            if (arg1 == 2) {
                this.method263(this.field828, var8, var7, 16);
                this.method263(this.field828, var8 - 1, var7 + 1, 1);
            }
            if (arg1 == 3) {
                this.method263(this.field828, var8, var7, 64);
                this.method263(this.field828, var8 - 1, var7 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method263(this.field828, var8, var7, 130);
                this.method263(this.field828, var8, var7 - 1, 8);
                this.method263(this.field828, var8 + 1, var7, 32);
            }
            if (arg1 == 1) {
                this.method263(this.field828, var8, var7, 10);
                this.method263(this.field828, var8 + 1, var7, 32);
                this.method263(this.field828, var8, var7 + 1, 128);
            }
            if (arg1 == 2) {
                this.method263(this.field828, var8, var7, 40);
                this.method263(this.field828, var8, var7 + 1, 128);
                this.method263(this.field828, var8 - 1, var7, 2);
            }
            if (arg1 == 3) {
                this.method263(this.field828, var8, var7, 160);
                this.method263(this.field828, var8 - 1, var7, 2);
                this.method263(this.field828, var8, var7 - 1, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method263(this.field828, var8, var7, 65536);
                this.method263(this.field828, var8, var7 - 1, 4096);
            }
            if (arg1 == 1) {
                this.method263(this.field828, var8, var7, 1024);
                this.method263(this.field828, var8 + 1, var7, 16384);
            }
            if (arg1 == 2) {
                this.method263(this.field828, var8, var7, 4096);
                this.method263(this.field828, var8, var7 + 1, 65536);
            }
            if (arg1 == 3) {
                this.method263(this.field828, var8, var7, 16384);
                this.method263(this.field828, var8 - 1, var7, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method263(this.field828, var8, var7, 512);
                this.method263(this.field828, var8 + 1, var7 - 1, 8192);
            }
            if (arg1 == 1) {
                this.method263(this.field828, var8, var7, 2048);
                this.method263(this.field828, var8 + 1, var7 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method263(this.field828, var8, var7, 8192);
                this.method263(this.field828, var8 - 1, var7 + 1, 512);
            }
            if (arg1 == 3) {
                this.method263(this.field828, var8, var7, 32768);
                this.method263(this.field828, var8 - 1, var7 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method263(this.field828, var8, var7, 66560);
            this.method263(this.field828, var8, var7 - 1, 4096);
            this.method263(this.field828, var8 + 1, var7, 16384);
        }
        if (arg1 == 1) {
            this.method263(this.field828, var8, var7, 5120);
            this.method263(this.field828, var8 + 1, var7, 16384);
            this.method263(this.field828, var8, var7 + 1, 65536);
        }
        if (arg1 == 2) {
            this.method263(this.field828, var8, var7, 20480);
            this.method263(this.field828, var8, var7 + 1, 65536);
            this.method263(this.field828, var8 - 1, var7, 1024);
        }
        if (arg1 == 3) {
            this.method263(this.field828, var8, var7, 81920);
            this.method263(this.field828, var8 - 1, var7, 1024);
            this.method263(this.field828, var8, var7 - 1, 4096);
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IZZIIII)V")
    public void method262(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            return;
        }
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field831;
        int var10 = arg6 - this.field832;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg3;
            arg3 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field833) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field834) {
                        this.method263(this.field828, var13, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZIII)V")
    private void method263(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field835[arg2][arg1] &= 16777215 - arg3;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZII)V")
    public void method264(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field831;
        int var5 = arg1 - this.field832;
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field835[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIZIIII)Z")
    public boolean method265(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg6 && arg3 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field831;
        int var9 = arg3 - this.field832;
        if (arg2) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg6 - this.field831;
        int var12 = arg4 - this.field832;
        if (arg5 == 0) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field835[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field835[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field835[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field835[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field835[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field835[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field835[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field835[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var11 && var12 + 1 == var9 && (this.field835[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var9 && (this.field835[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var12 && (this.field835[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg4 == arg5 && arg0 == arg1) {
            return true;
        }
        int var9 = arg5 - this.field831;
        int var10 = arg1 - this.field832;
        int var11 = arg4 - this.field831;
        int var12 = arg0 - this.field832;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field835[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field835[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field835[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field835[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field835[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field835[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 + 1 == var9 && var10 == var12 && (this.field835[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field835[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field835[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field835[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field835[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field835[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 <= 0) {
            throw new NullPointerException();
        }
        int var9 = arg5 + arg6 - 1;
        int var10 = arg0 + arg7 - 1;
        if (arg4 >= arg5 && arg4 <= var9 && arg1 >= arg7 && arg1 <= var10) {
            return true;
        } else if (arg5 - 1 == arg4 && arg1 >= arg7 && arg1 <= var10 && (this.field835[arg4 - this.field831][arg1 - this.field832] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg1 >= arg7 && arg1 <= var10 && (this.field835[arg4 - this.field831][arg1 - this.field832] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg1 && arg4 >= arg5 && arg4 <= var9 && (this.field835[arg4 - this.field831][arg1 - this.field832] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg4 >= arg5 && arg4 <= var9 && (this.field835[arg4 - this.field831][arg1 - this.field832] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
