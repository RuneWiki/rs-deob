import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EMCOJCFH")
public class class14 {

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "Z")
    private boolean field739 = false;

    @OriginalMember(owner = "EMCOJCFH", name = "b", descriptor = "I")
    private int field740 = -870;

    @OriginalMember(owner = "EMCOJCFH", name = "c", descriptor = "Z")
    private boolean field741 = false;

    @OriginalMember(owner = "EMCOJCFH", name = "d", descriptor = "I")
    private int field742 = -454;

    @OriginalMember(owner = "EMCOJCFH", name = "e", descriptor = "I")
    private int field743 = 348;

    @OriginalMember(owner = "EMCOJCFH", name = "f", descriptor = "Z")
    private boolean field744 = false;

    @OriginalMember(owner = "EMCOJCFH", name = "g", descriptor = "I")
    public int field745 = 0;

    @OriginalMember(owner = "EMCOJCFH", name = "h", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "EMCOJCFH", name = "i", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "EMCOJCFH", name = "j", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "EMCOJCFH", name = "k", descriptor = "[[I")
    public int[][] field749;

    @OriginalMember(owner = "EMCOJCFH", name = "<init>", descriptor = "(III)V")
    public class14(int arg0, int arg1, int arg2) {
        int var4 = 41 / arg0;
        this.field746 = 0;
        this.field747 = arg1;
        this.field748 = arg2;
        this.field749 = new int[this.field747][this.field748];
        this.method205();
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "()V")
    public void method205() {
        for (int var1 = 0; var1 < this.field747; var1++) {
            for (int var2 = 0; var2 < this.field748; var2++) {
                if (var1 == 0 || var2 == 0 || this.field747 - 1 == var1 || this.field748 - 1 == var2) {
                    this.field749[var1][var2] = 16777215;
                } else {
                    this.field749[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(IIIZII)V")
    public void method206(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = 35 / arg5;
        int var8 = arg2 - this.field745;
        int var9 = arg1 - this.field746;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method209(var8, var9, 128);
                this.method209(var8 - 1, var9, 8);
            }
            if (arg4 == 1) {
                this.method209(var8, var9, 2);
                this.method209(var8, var9 + 1, 32);
            }
            if (arg4 == 2) {
                this.method209(var8, var9, 8);
                this.method209(var8 + 1, var9, 128);
            }
            if (arg4 == 3) {
                this.method209(var8, var9, 32);
                this.method209(var8, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method209(var8, var9, 1);
                this.method209(var8 - 1, var9 + 1, 16);
            }
            if (arg4 == 1) {
                this.method209(var8, var9, 4);
                this.method209(var8 + 1, var9 + 1, 64);
            }
            if (arg4 == 2) {
                this.method209(var8, var9, 16);
                this.method209(var8 + 1, var9 - 1, 1);
            }
            if (arg4 == 3) {
                this.method209(var8, var9, 64);
                this.method209(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method209(var8, var9, 130);
                this.method209(var8 - 1, var9, 8);
                this.method209(var8, var9 + 1, 32);
            }
            if (arg4 == 1) {
                this.method209(var8, var9, 10);
                this.method209(var8, var9 + 1, 32);
                this.method209(var8 + 1, var9, 128);
            }
            if (arg4 == 2) {
                this.method209(var8, var9, 40);
                this.method209(var8 + 1, var9, 128);
                this.method209(var8, var9 - 1, 2);
            }
            if (arg4 == 3) {
                this.method209(var8, var9, 160);
                this.method209(var8, var9 - 1, 2);
                this.method209(var8 - 1, var9, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method209(var8, var9, 65536);
                this.method209(var8 - 1, var9, 4096);
            }
            if (arg4 == 1) {
                this.method209(var8, var9, 1024);
                this.method209(var8, var9 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method209(var8, var9, 4096);
                this.method209(var8 + 1, var9, 65536);
            }
            if (arg4 == 3) {
                this.method209(var8, var9, 16384);
                this.method209(var8, var9 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method209(var8, var9, 512);
                this.method209(var8 - 1, var9 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method209(var8, var9, 2048);
                this.method209(var8 + 1, var9 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method209(var8, var9, 8192);
                this.method209(var8 + 1, var9 - 1, 512);
            }
            if (arg4 == 3) {
                this.method209(var8, var9, 32768);
                this.method209(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method209(var8, var9, 66560);
            this.method209(var8 - 1, var9, 4096);
            this.method209(var8, var9 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method209(var8, var9, 5120);
            this.method209(var8, var9 + 1, 16384);
            this.method209(var8 + 1, var9, 65536);
        }
        if (arg4 == 2) {
            this.method209(var8, var9, 20480);
            this.method209(var8 + 1, var9, 65536);
            this.method209(var8, var9 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method209(var8, var9, 81920);
            this.method209(var8, var9 - 1, 1024);
            this.method209(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(ZIIIZII)V")
    public void method207(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0) {
            this.field740 = 35;
        }
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field745;
        int var10 = arg3 - this.field746;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg2;
            arg2 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field747) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field748) {
                        this.method209(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(BII)V")
    public void method208(byte arg0, int arg1, int arg2) {
        if (arg0 != -105) {
            this.field744 = !this.field744;
        }
        int var4 = arg2 - this.field745;
        int var5 = arg1 - this.field746;
        this.field749[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(III)V")
    private void method209(int arg0, int arg1, int arg2) {
        this.field749[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(IIZIZI)V")
    public void method210(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            return;
        }
        int var7 = arg0 - this.field745;
        int var8 = arg3 - this.field746;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method212(var7, false, var8, 128);
                this.method212(var7 - 1, false, var8, 8);
            }
            if (arg1 == 1) {
                this.method212(var7, false, var8, 2);
                this.method212(var7, false, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method212(var7, false, var8, 8);
                this.method212(var7 + 1, false, var8, 128);
            }
            if (arg1 == 3) {
                this.method212(var7, false, var8, 32);
                this.method212(var7, false, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method212(var7, false, var8, 1);
                this.method212(var7 - 1, false, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method212(var7, false, var8, 4);
                this.method212(var7 + 1, false, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method212(var7, false, var8, 16);
                this.method212(var7 + 1, false, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method212(var7, false, var8, 64);
                this.method212(var7 - 1, false, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method212(var7, false, var8, 130);
                this.method212(var7 - 1, false, var8, 8);
                this.method212(var7, false, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method212(var7, false, var8, 10);
                this.method212(var7, false, var8 + 1, 32);
                this.method212(var7 + 1, false, var8, 128);
            }
            if (arg1 == 2) {
                this.method212(var7, false, var8, 40);
                this.method212(var7 + 1, false, var8, 128);
                this.method212(var7, false, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method212(var7, false, var8, 160);
                this.method212(var7, false, var8 - 1, 2);
                this.method212(var7 - 1, false, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method212(var7, false, var8, 65536);
                this.method212(var7 - 1, false, var8, 4096);
            }
            if (arg1 == 1) {
                this.method212(var7, false, var8, 1024);
                this.method212(var7, false, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method212(var7, false, var8, 4096);
                this.method212(var7 + 1, false, var8, 65536);
            }
            if (arg1 == 3) {
                this.method212(var7, false, var8, 16384);
                this.method212(var7, false, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method212(var7, false, var8, 512);
                this.method212(var7 - 1, false, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method212(var7, false, var8, 2048);
                this.method212(var7 + 1, false, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method212(var7, false, var8, 8192);
                this.method212(var7 + 1, false, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method212(var7, false, var8, 32768);
                this.method212(var7 - 1, false, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method212(var7, false, var8, 66560);
            this.method212(var7 - 1, false, var8, 4096);
            this.method212(var7, false, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method212(var7, false, var8, 5120);
            this.method212(var7, false, var8 + 1, 16384);
            this.method212(var7 + 1, false, var8, 65536);
        }
        if (arg1 == 2) {
            this.method212(var7, false, var8, 20480);
            this.method212(var7 + 1, false, var8, 65536);
            this.method212(var7, false, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method212(var7, false, var8, 81920);
            this.method212(var7, false, var8 - 1, 1024);
            this.method212(var7 - 1, false, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(IIIZIII)V")
    public void method211(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field745;
        int var10 = arg6 - this.field746;
        while (arg1 >= 0) {
            this.field740 = 13;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg5;
            arg5 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field747) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field748) {
                        this.method212(var12, false, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(IZII)V")
    private void method212(int arg0, boolean arg1, int arg2, int arg3) {
        this.field749[arg0][arg2] &= 16777215 - arg3;
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(IZI)V")
    public void method213(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field739 = !this.field739;
        }
        int var4 = arg0 - this.field745;
        int var5 = arg2 - this.field746;
        this.field749[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg3 && arg0 == arg1) {
            return true;
        }
        int var8 = arg2 - this.field745;
        int var9 = arg1 - this.field746;
        int var10 = arg3 - this.field745;
        int var11 = arg0 - this.field746;
        if (arg6 != 38743) {
            throw new NullPointerException();
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field749[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field749[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field749[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field749[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field749[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field749[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field749[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field749[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field749[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field749[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field749[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "EMCOJCFH", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg2 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field745;
        int var9 = arg2 - this.field746;
        int var10 = arg0 - this.field745;
        int var11 = 48 / arg1;
        int var12 = arg6 - this.field746;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field749[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field749[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field749[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field749[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field749[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field749[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field749[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field749[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field749[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field749[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field749[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field749[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "EMCOJCFH", name = "a", descriptor = "(ZIIIIIII)Z")
    public boolean method216(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg5 + arg7 - 1;
        int var10 = arg1 + arg3 - 1;
        if (!arg0) {
            this.field743 = 27;
        }
        if (arg4 >= arg7 && arg4 <= var9 && arg6 >= arg1 && arg6 <= var10) {
            return true;
        } else if (arg7 - 1 == arg4 && arg6 >= arg1 && arg6 <= var10 && (this.field749[arg4 - this.field745][arg6 - this.field746] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg6 >= arg1 && arg6 <= var10 && (this.field749[arg4 - this.field745][arg6 - this.field746] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg6 && arg4 >= arg7 && arg4 <= var9 && (this.field749[arg4 - this.field745][arg6 - this.field746] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg4 >= arg7 && arg4 <= var9 && (this.field749[arg4 - this.field745][arg6 - this.field746] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }
}
