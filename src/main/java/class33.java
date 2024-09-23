import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KFLNJHKB")
public class class33 {

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "Z")
    private boolean field932 = false;

    @OriginalMember(owner = "KFLNJHKB", name = "b", descriptor = "I")
    private int field933 = -874;

    @OriginalMember(owner = "KFLNJHKB", name = "d", descriptor = "I")
    private int field935 = -374;

    @OriginalMember(owner = "KFLNJHKB", name = "e", descriptor = "Z")
    private boolean field936 = true;

    @OriginalMember(owner = "KFLNJHKB", name = "f", descriptor = "Z")
    private boolean field937 = false;

    @OriginalMember(owner = "KFLNJHKB", name = "g", descriptor = "I")
    public int field938 = 0;

    @OriginalMember(owner = "KFLNJHKB", name = "h", descriptor = "I")
    public int field939 = 0;

    @OriginalMember(owner = "KFLNJHKB", name = "i", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "KFLNJHKB", name = "j", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "KFLNJHKB", name = "k", descriptor = "[[I")
    public int[][] field942;

    @OriginalMember(owner = "KFLNJHKB", name = "c", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "KFLNJHKB", name = "<init>", descriptor = "(BII)V")
    public class33(byte arg0, int arg1, int arg2) {
        this.field940 = arg1;
        if (arg0 != -72) {
            throw new NullPointerException();
        }
        this.field941 = arg2;
        this.field942 = new int[this.field940][this.field941];
        this.method344();
        if (class29.field878) {
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "()V")
    public void method344() {
        for (int var1 = 0; var1 < this.field940; var1++) {
            for (int var2 = 0; var2 < this.field941; var2++) {
                if (var1 == 0 || var2 == 0 || this.field940 - 1 == var1 || this.field941 - 1 == var2) {
                    this.field942[var1][var2] = 16777215;
                } else {
                    this.field942[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IIZIII)V")
    public void method345(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = 38 / arg5;
        int var8 = arg4 - this.field938;
        int var9 = arg3 - this.field939;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method348(var8, var9, 128);
                this.method348(var8 - 1, var9, 8);
            }
            if (arg1 == 1) {
                this.method348(var8, var9, 2);
                this.method348(var8, var9 + 1, 32);
            }
            if (arg1 == 2) {
                this.method348(var8, var9, 8);
                this.method348(var8 + 1, var9, 128);
            }
            if (arg1 == 3) {
                this.method348(var8, var9, 32);
                this.method348(var8, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method348(var8, var9, 1);
                this.method348(var8 - 1, var9 + 1, 16);
            }
            if (arg1 == 1) {
                this.method348(var8, var9, 4);
                this.method348(var8 + 1, var9 + 1, 64);
            }
            if (arg1 == 2) {
                this.method348(var8, var9, 16);
                this.method348(var8 + 1, var9 - 1, 1);
            }
            if (arg1 == 3) {
                this.method348(var8, var9, 64);
                this.method348(var8 - 1, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method348(var8, var9, 130);
                this.method348(var8 - 1, var9, 8);
                this.method348(var8, var9 + 1, 32);
            }
            if (arg1 == 1) {
                this.method348(var8, var9, 10);
                this.method348(var8, var9 + 1, 32);
                this.method348(var8 + 1, var9, 128);
            }
            if (arg1 == 2) {
                this.method348(var8, var9, 40);
                this.method348(var8 + 1, var9, 128);
                this.method348(var8, var9 - 1, 2);
            }
            if (arg1 == 3) {
                this.method348(var8, var9, 160);
                this.method348(var8, var9 - 1, 2);
                this.method348(var8 - 1, var9, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method348(var8, var9, 65536);
                this.method348(var8 - 1, var9, 4096);
            }
            if (arg1 == 1) {
                this.method348(var8, var9, 1024);
                this.method348(var8, var9 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method348(var8, var9, 4096);
                this.method348(var8 + 1, var9, 65536);
            }
            if (arg1 == 3) {
                this.method348(var8, var9, 16384);
                this.method348(var8, var9 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method348(var8, var9, 512);
                this.method348(var8 - 1, var9 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method348(var8, var9, 2048);
                this.method348(var8 + 1, var9 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method348(var8, var9, 8192);
                this.method348(var8 + 1, var9 - 1, 512);
            }
            if (arg1 == 3) {
                this.method348(var8, var9, 32768);
                this.method348(var8 - 1, var9 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method348(var8, var9, 66560);
            this.method348(var8 - 1, var9, 4096);
            this.method348(var8, var9 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method348(var8, var9, 5120);
            this.method348(var8, var9 + 1, 16384);
            this.method348(var8 + 1, var9, 65536);
        }
        if (arg1 == 2) {
            this.method348(var8, var9, 20480);
            this.method348(var8 + 1, var9, 65536);
            this.method348(var8, var9 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method348(var8, var9, 81920);
            this.method348(var8, var9 - 1, 1024);
            this.method348(var8 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(ZIIIIIB)V")
    public void method346(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field938;
        int var10 = arg1 - this.field939;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field940) {
                for (int var14 = var10; var14 < arg2 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field941) {
                        this.method348(var12, var14, var8);
                    }
                }
            }
        }
        if (arg6 == 7) {
            boolean var13 = false;
        } else {
            this.field934 = 386;
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(III)V")
    public void method347(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field938;
        int var5 = arg2 - this.field939;
        if (arg0 != 0) {
            this.field937 = !this.field937;
        }
        this.field942[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "KFLNJHKB", name = "b", descriptor = "(III)V")
    private void method348(int arg0, int arg1, int arg2) {
        this.field942[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IIIZII)V")
    public void method349(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field938;
        if (arg4 <= 0) {
            return;
        }
        int var8 = arg0 - this.field939;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method351(var7, var8, (byte) -34, 128);
                this.method351(var7 - 1, var8, (byte) -34, 8);
            }
            if (arg2 == 1) {
                this.method351(var7, var8, (byte) -34, 2);
                this.method351(var7, var8 + 1, (byte) -34, 32);
            }
            if (arg2 == 2) {
                this.method351(var7, var8, (byte) -34, 8);
                this.method351(var7 + 1, var8, (byte) -34, 128);
            }
            if (arg2 == 3) {
                this.method351(var7, var8, (byte) -34, 32);
                this.method351(var7, var8 - 1, (byte) -34, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method351(var7, var8, (byte) -34, 1);
                this.method351(var7 - 1, var8 + 1, (byte) -34, 16);
            }
            if (arg2 == 1) {
                this.method351(var7, var8, (byte) -34, 4);
                this.method351(var7 + 1, var8 + 1, (byte) -34, 64);
            }
            if (arg2 == 2) {
                this.method351(var7, var8, (byte) -34, 16);
                this.method351(var7 + 1, var8 - 1, (byte) -34, 1);
            }
            if (arg2 == 3) {
                this.method351(var7, var8, (byte) -34, 64);
                this.method351(var7 - 1, var8 - 1, (byte) -34, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method351(var7, var8, (byte) -34, 130);
                this.method351(var7 - 1, var8, (byte) -34, 8);
                this.method351(var7, var8 + 1, (byte) -34, 32);
            }
            if (arg2 == 1) {
                this.method351(var7, var8, (byte) -34, 10);
                this.method351(var7, var8 + 1, (byte) -34, 32);
                this.method351(var7 + 1, var8, (byte) -34, 128);
            }
            if (arg2 == 2) {
                this.method351(var7, var8, (byte) -34, 40);
                this.method351(var7 + 1, var8, (byte) -34, 128);
                this.method351(var7, var8 - 1, (byte) -34, 2);
            }
            if (arg2 == 3) {
                this.method351(var7, var8, (byte) -34, 160);
                this.method351(var7, var8 - 1, (byte) -34, 2);
                this.method351(var7 - 1, var8, (byte) -34, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method351(var7, var8, (byte) -34, 65536);
                this.method351(var7 - 1, var8, (byte) -34, 4096);
            }
            if (arg2 == 1) {
                this.method351(var7, var8, (byte) -34, 1024);
                this.method351(var7, var8 + 1, (byte) -34, 16384);
            }
            if (arg2 == 2) {
                this.method351(var7, var8, (byte) -34, 4096);
                this.method351(var7 + 1, var8, (byte) -34, 65536);
            }
            if (arg2 == 3) {
                this.method351(var7, var8, (byte) -34, 16384);
                this.method351(var7, var8 - 1, (byte) -34, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method351(var7, var8, (byte) -34, 512);
                this.method351(var7 - 1, var8 + 1, (byte) -34, 8192);
            }
            if (arg2 == 1) {
                this.method351(var7, var8, (byte) -34, 2048);
                this.method351(var7 + 1, var8 + 1, (byte) -34, 32768);
            }
            if (arg2 == 2) {
                this.method351(var7, var8, (byte) -34, 8192);
                this.method351(var7 + 1, var8 - 1, (byte) -34, 512);
            }
            if (arg2 == 3) {
                this.method351(var7, var8, (byte) -34, 32768);
                this.method351(var7 - 1, var8 - 1, (byte) -34, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method351(var7, var8, (byte) -34, 66560);
            this.method351(var7 - 1, var8, (byte) -34, 4096);
            this.method351(var7, var8 + 1, (byte) -34, 16384);
        }
        if (arg2 == 1) {
            this.method351(var7, var8, (byte) -34, 5120);
            this.method351(var7, var8 + 1, (byte) -34, 16384);
            this.method351(var7 + 1, var8, (byte) -34, 65536);
        }
        if (arg2 == 2) {
            this.method351(var7, var8, (byte) -34, 20480);
            this.method351(var7 + 1, var8, (byte) -34, 65536);
            this.method351(var7, var8 - 1, (byte) -34, 1024);
        }
        if (arg2 == 3) {
            this.method351(var7, var8, (byte) -34, 81920);
            this.method351(var7, var8 - 1, (byte) -34, 1024);
            this.method351(var7 - 1, var8, (byte) -34, 4096);
            return;
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IIIIZBI)V")
    public void method350(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field938;
        int var10 = arg1 - this.field939;
        if (arg5 != 20) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg0;
            arg0 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field940) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field941) {
                        this.method351(var12, var13, (byte) -34, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IIBI)V")
    private void method351(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -34) {
            this.field942[arg0][arg1] &= 16777215 - arg3;
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IBI)V")
    public void method352(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field938;
        if (arg1 == 58) {
            int var5 = arg2 - this.field939;
            this.field942[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IZIIIII)Z")
    public boolean method353(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            this.field932 = !this.field932;
        }
        if (arg0 == arg5 && arg4 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field938;
        int var9 = arg4 - this.field939;
        int var10 = arg5 - this.field938;
        int var11 = arg6 - this.field939;
        if (arg2 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IIZIIII)Z")
    public boolean method354(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg1 && arg4 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field938;
        int var9 = arg4 - this.field939;
        int var10 = arg0 - this.field938;
        if (!arg2) {
            this.field936 = !this.field936;
        }
        int var11 = arg5 - this.field939;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field942[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field942[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field942[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "KFLNJHKB", name = "a", descriptor = "(IIIIIIIB)Z")
    public boolean method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != -30) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg2 + arg3 - 1;
        int var11 = arg1 + arg6 - 1;
        if (arg5 >= arg2 && arg5 <= var10 && arg4 >= arg6 && arg4 <= var11) {
            return true;
        } else if (arg2 - 1 == arg5 && arg4 >= arg6 && arg4 <= var11 && (this.field942[arg5 - this.field938][arg4 - this.field939] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg4 >= arg6 && arg4 <= var11 && (this.field942[arg5 - this.field938][arg4 - this.field939] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg4 && arg5 >= arg2 && arg5 <= var10 && (this.field942[arg5 - this.field938][arg4 - this.field939] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg5 >= arg2 && arg5 <= var10 && (this.field942[arg5 - this.field938][arg4 - this.field939] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
