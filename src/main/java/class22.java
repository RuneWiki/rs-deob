import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GDVKBIIV")
public class class22 {

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "I")
    private int field800 = 637;

    @OriginalMember(owner = "GDVKBIIV", name = "b", descriptor = "I")
    private int field801 = -489;

    @OriginalMember(owner = "GDVKBIIV", name = "c", descriptor = "B")
    private byte field802 = 5;

    @OriginalMember(owner = "GDVKBIIV", name = "d", descriptor = "B")
    private byte field803 = 5;

    @OriginalMember(owner = "GDVKBIIV", name = "e", descriptor = "Z")
    private boolean field804 = false;

    @OriginalMember(owner = "GDVKBIIV", name = "g", descriptor = "Z")
    private boolean field806 = true;

    @OriginalMember(owner = "GDVKBIIV", name = "h", descriptor = "Z")
    private boolean field807 = false;

    @OriginalMember(owner = "GDVKBIIV", name = "i", descriptor = "I")
    private int field808 = -131;

    @OriginalMember(owner = "GDVKBIIV", name = "j", descriptor = "I")
    public int field809 = 0;

    @OriginalMember(owner = "GDVKBIIV", name = "k", descriptor = "I")
    public int field810 = 0;

    @OriginalMember(owner = "GDVKBIIV", name = "l", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "GDVKBIIV", name = "m", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "GDVKBIIV", name = "n", descriptor = "[[I")
    public int[][] field813;

    @OriginalMember(owner = "GDVKBIIV", name = "f", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "GDVKBIIV", name = "<init>", descriptor = "(IIB)V")
    public class22(int arg0, int arg1, byte arg2) {
        this.field811 = arg0;
        this.field812 = arg1;
        this.field813 = new int[this.field811][this.field812];
        this.method215();
        if (this.field803 != arg2) {
            throw new NullPointerException();
        }
        boolean var4 = false;
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "()V")
    public void method215() {
        for (int var1 = 0; var1 < this.field811; var1++) {
            for (int var2 = 0; var2 < this.field812; var2++) {
                if (var1 == 0 || var2 == 0 || this.field811 - 1 == var1 || this.field812 - 1 == var2) {
                    this.field813[var1][var2] = 16777215;
                } else {
                    this.field813[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(ZIZIII)V")
    public void method216(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            return;
        }
        int var7 = arg5 - this.field809;
        int var8 = arg1 - this.field810;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method219(var7, var8, 128);
                this.method219(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method219(var7, var8, 2);
                this.method219(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method219(var7, var8, 8);
                this.method219(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method219(var7, var8, 32);
                this.method219(var7, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method219(var7, var8, 1);
                this.method219(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method219(var7, var8, 4);
                this.method219(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method219(var7, var8, 16);
                this.method219(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method219(var7, var8, 64);
                this.method219(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method219(var7, var8, 130);
                this.method219(var7 - 1, var8, 8);
                this.method219(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method219(var7, var8, 10);
                this.method219(var7, var8 + 1, 32);
                this.method219(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method219(var7, var8, 40);
                this.method219(var7 + 1, var8, 128);
                this.method219(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method219(var7, var8, 160);
                this.method219(var7, var8 - 1, 2);
                this.method219(var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method219(var7, var8, 65536);
                this.method219(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method219(var7, var8, 1024);
                this.method219(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method219(var7, var8, 4096);
                this.method219(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method219(var7, var8, 16384);
                this.method219(var7, var8 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method219(var7, var8, 512);
                this.method219(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method219(var7, var8, 2048);
                this.method219(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method219(var7, var8, 8192);
                this.method219(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method219(var7, var8, 32768);
                this.method219(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method219(var7, var8, 66560);
            this.method219(var7 - 1, var8, 4096);
            this.method219(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method219(var7, var8, 5120);
            this.method219(var7, var8 + 1, 16384);
            this.method219(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method219(var7, var8, 20480);
            this.method219(var7 + 1, var8, 65536);
            this.method219(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method219(var7, var8, 81920);
            this.method219(var7, var8 - 1, 1024);
            this.method219(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIIIIIZ)V")
    public void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field809;
        int var10 = arg2 - this.field810;
        if (arg5 != 0) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg3;
            arg3 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field811) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field812) {
                        this.method219(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIB)V")
    public void method218(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field809;
        if (arg2 != -97) {
            this.field805 = 58;
        }
        int var5 = arg0 - this.field810;
        this.field813[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(III)V")
    private void method219(int arg0, int arg1, int arg2) {
        this.field813[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIZIIZ)V")
    public void method220(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field809;
        if (!arg5) {
            return;
        }
        int var8 = arg4 - this.field810;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method222(var8, 128, var7, 36387);
                this.method222(var8, 8, var7 - 1, 36387);
            }
            if (arg1 == 1) {
                this.method222(var8, 2, var7, 36387);
                this.method222(var8 + 1, 32, var7, 36387);
            }
            if (arg1 == 2) {
                this.method222(var8, 8, var7, 36387);
                this.method222(var8, 128, var7 + 1, 36387);
            }
            if (arg1 == 3) {
                this.method222(var8, 32, var7, 36387);
                this.method222(var8 - 1, 2, var7, 36387);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method222(var8, 1, var7, 36387);
                this.method222(var8 + 1, 16, var7 - 1, 36387);
            }
            if (arg1 == 1) {
                this.method222(var8, 4, var7, 36387);
                this.method222(var8 + 1, 64, var7 + 1, 36387);
            }
            if (arg1 == 2) {
                this.method222(var8, 16, var7, 36387);
                this.method222(var8 - 1, 1, var7 + 1, 36387);
            }
            if (arg1 == 3) {
                this.method222(var8, 64, var7, 36387);
                this.method222(var8 - 1, 4, var7 - 1, 36387);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method222(var8, 130, var7, 36387);
                this.method222(var8, 8, var7 - 1, 36387);
                this.method222(var8 + 1, 32, var7, 36387);
            }
            if (arg1 == 1) {
                this.method222(var8, 10, var7, 36387);
                this.method222(var8 + 1, 32, var7, 36387);
                this.method222(var8, 128, var7 + 1, 36387);
            }
            if (arg1 == 2) {
                this.method222(var8, 40, var7, 36387);
                this.method222(var8, 128, var7 + 1, 36387);
                this.method222(var8 - 1, 2, var7, 36387);
            }
            if (arg1 == 3) {
                this.method222(var8, 160, var7, 36387);
                this.method222(var8 - 1, 2, var7, 36387);
                this.method222(var8, 8, var7 - 1, 36387);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method222(var8, 65536, var7, 36387);
                this.method222(var8, 4096, var7 - 1, 36387);
            }
            if (arg1 == 1) {
                this.method222(var8, 1024, var7, 36387);
                this.method222(var8 + 1, 16384, var7, 36387);
            }
            if (arg1 == 2) {
                this.method222(var8, 4096, var7, 36387);
                this.method222(var8, 65536, var7 + 1, 36387);
            }
            if (arg1 == 3) {
                this.method222(var8, 16384, var7, 36387);
                this.method222(var8 - 1, 1024, var7, 36387);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method222(var8, 512, var7, 36387);
                this.method222(var8 + 1, 8192, var7 - 1, 36387);
            }
            if (arg1 == 1) {
                this.method222(var8, 2048, var7, 36387);
                this.method222(var8 + 1, 32768, var7 + 1, 36387);
            }
            if (arg1 == 2) {
                this.method222(var8, 8192, var7, 36387);
                this.method222(var8 - 1, 512, var7 + 1, 36387);
            }
            if (arg1 == 3) {
                this.method222(var8, 32768, var7, 36387);
                this.method222(var8 - 1, 2048, var7 - 1, 36387);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method222(var8, 66560, var7, 36387);
            this.method222(var8, 4096, var7 - 1, 36387);
            this.method222(var8 + 1, 16384, var7, 36387);
        }
        if (arg1 == 1) {
            this.method222(var8, 5120, var7, 36387);
            this.method222(var8 + 1, 16384, var7, 36387);
            this.method222(var8, 65536, var7 + 1, 36387);
        }
        if (arg1 == 2) {
            this.method222(var8, 20480, var7, 36387);
            this.method222(var8, 65536, var7 + 1, 36387);
            this.method222(var8 - 1, 1024, var7, 36387);
        }
        if (arg1 == 3) {
            this.method222(var8, 81920, var7, 36387);
            this.method222(var8 - 1, 1024, var7, 36387);
            this.method222(var8, 4096, var7 - 1, 36387);
            return;
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIIIIZZ)V")
    public void method221(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = 256;
        if (arg5) {
            this.field800 = 392;
        }
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field809;
        int var10 = arg3 - this.field810;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg0;
            arg0 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field811) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field812) {
                        this.method222(var13, var8, var12, 36387);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIII)V")
    private void method222(int arg0, int arg1, int arg2, int arg3) {
        this.field813[arg2][arg0] &= 16777215 - arg1;
        if (arg3 == 36387) {
            ;
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "b", descriptor = "(IIB)V")
    public void method223(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field809;
        int var5 = arg0 - this.field810;
        if (arg2 == 112) {
            this.field813[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIIIBII)Z")
    public boolean method224(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg3 == arg6 && arg1 == arg2) {
            return true;
        }
        int var8 = arg6 - this.field809;
        if (arg4 != 8) {
            throw new NullPointerException();
        }
        boolean var9 = false;
        int var10 = arg2 - this.field810;
        int var11 = arg3 - this.field809;
        int var12 = arg1 - this.field810;
        if (arg5 == 0) {
            if (arg0 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field813[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field813[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field813[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field813[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field813[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10 && (this.field813[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field813[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 - 1 == var8 && var10 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var10 && (this.field813[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var11 && var12 + 1 == var10 && (this.field813[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var10 && (this.field813[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var10 == var12 && (this.field813[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 40519) {
            throw new NullPointerException();
        } else if (arg0 == arg6 && arg1 == arg3) {
            return true;
        } else {
            int var8 = arg6 - this.field809;
            int var9 = arg3 - this.field810;
            int var10 = arg0 - this.field809;
            int var11 = arg1 - this.field810;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field813[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field813[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field813[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field813[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field813[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field813[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field813[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field813[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field813[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field813[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field813[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field813[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "GDVKBIIV", name = "a", descriptor = "(IIIIIBII)Z")
    public boolean method226(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 == 6) {
            boolean var9 = false;
        } else {
            this.field800 = -389;
        }
        int var10 = arg2 + arg3 - 1;
        int var11 = arg6 + arg7 - 1;
        if (arg0 >= arg2 && arg0 <= var10 && arg4 >= arg6 && arg4 <= var11) {
            return true;
        } else if (arg2 - 1 == arg0 && arg4 >= arg6 && arg4 <= var11 && (this.field813[arg0 - this.field809][arg4 - this.field810] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg0 && arg4 >= arg6 && arg4 <= var11 && (this.field813[arg0 - this.field809][arg4 - this.field810] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg4 && arg0 >= arg2 && arg0 <= var10 && (this.field813[arg0 - this.field809][arg4 - this.field810] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg0 >= arg2 && arg0 <= var10 && (this.field813[arg0 - this.field809][arg4 - this.field810] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
