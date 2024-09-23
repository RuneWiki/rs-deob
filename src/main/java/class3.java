import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BXNXROZD")
public class class3 {

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "I")
    private int field52 = 2;

    @OriginalMember(owner = "BXNXROZD", name = "c", descriptor = "Z")
    private boolean field54 = false;

    @OriginalMember(owner = "BXNXROZD", name = "d", descriptor = "I")
    private int field55 = 5;

    @OriginalMember(owner = "BXNXROZD", name = "e", descriptor = "Z")
    private boolean field56 = true;

    @OriginalMember(owner = "BXNXROZD", name = "f", descriptor = "I")
    public int field57 = 0;

    @OriginalMember(owner = "BXNXROZD", name = "g", descriptor = "I")
    public int field58 = 0;

    @OriginalMember(owner = "BXNXROZD", name = "h", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "BXNXROZD", name = "i", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "BXNXROZD", name = "j", descriptor = "[[I")
    public int[][] field61;

    @OriginalMember(owner = "BXNXROZD", name = "b", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "BXNXROZD", name = "<init>", descriptor = "(III)V")
    public class3(int arg0, int arg1, int arg2) {
        this.field59 = arg1;
        int var4 = 6 / arg2;
        this.field60 = arg0;
        this.field61 = new int[this.field59][this.field60];
        this.method12();
        if (class33.field1009) {
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "()V")
    public void method12() {
        for (int var1 = 0; var1 < this.field59; var1++) {
            for (int var2 = 0; var2 < this.field60; var2++) {
                if (var1 == 0 || var2 == 0 || this.field59 - 1 == var1 || this.field60 - 1 == var2) {
                    this.field61[var1][var2] = 16777215;
                } else {
                    this.field61[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IIIZII)V")
    public void method13(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field57;
        int var8 = arg5 - this.field58;
        if (arg0 != -4390) {
            this.field53 = -426;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method16(var7, var8, 128);
                this.method16(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method16(var7, var8, 2);
                this.method16(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method16(var7, var8, 8);
                this.method16(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method16(var7, var8, 32);
                this.method16(var7, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method16(var7, var8, 1);
                this.method16(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method16(var7, var8, 4);
                this.method16(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method16(var7, var8, 16);
                this.method16(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method16(var7, var8, 64);
                this.method16(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method16(var7, var8, 130);
                this.method16(var7 - 1, var8, 8);
                this.method16(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method16(var7, var8, 10);
                this.method16(var7, var8 + 1, 32);
                this.method16(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method16(var7, var8, 40);
                this.method16(var7 + 1, var8, 128);
                this.method16(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method16(var7, var8, 160);
                this.method16(var7, var8 - 1, 2);
                this.method16(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method16(var7, var8, 65536);
                this.method16(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method16(var7, var8, 1024);
                this.method16(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method16(var7, var8, 4096);
                this.method16(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method16(var7, var8, 16384);
                this.method16(var7, var8 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method16(var7, var8, 512);
                this.method16(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method16(var7, var8, 2048);
                this.method16(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method16(var7, var8, 8192);
                this.method16(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method16(var7, var8, 32768);
                this.method16(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method16(var7, var8, 66560);
            this.method16(var7 - 1, var8, 4096);
            this.method16(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method16(var7, var8, 5120);
            this.method16(var7, var8 + 1, 16384);
            this.method16(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method16(var7, var8, 20480);
            this.method16(var7 + 1, var8, 65536);
            this.method16(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method16(var7, var8, 81920);
            this.method16(var7, var8 - 1, 1024);
            this.method16(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IIIIZZI)V")
    public void method14(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg5) {
            var8 += 131072;
        }
        int var10 = arg3 - this.field57;
        int var11 = arg2 - this.field58;
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg1;
            arg1 = arg6;
            arg6 = var12;
        }
        for (int var13 = var10; var13 < arg1 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field59) {
                for (int var14 = var11; var14 < arg6 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field60) {
                        this.method16(var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(III)V")
    public void method15(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field57;
        if (arg0 >= 8 && arg0 <= 8) {
            int var5 = arg2 - this.field58;
            this.field61[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "b", descriptor = "(III)V")
    private void method16(int arg0, int arg1, int arg2) {
        this.field61[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IIIIZI)V")
    public void method17(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field57;
        if (arg0 <= 0) {
            return;
        }
        int var8 = arg2 - this.field58;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method19(var7, 128, var8, 7);
                this.method19(var7 - 1, 8, var8, 7);
            }
            if (arg5 == 1) {
                this.method19(var7, 2, var8, 7);
                this.method19(var7, 32, var8 + 1, 7);
            }
            if (arg5 == 2) {
                this.method19(var7, 8, var8, 7);
                this.method19(var7 + 1, 128, var8, 7);
            }
            if (arg5 == 3) {
                this.method19(var7, 32, var8, 7);
                this.method19(var7, 2, var8 - 1, 7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method19(var7, 1, var8, 7);
                this.method19(var7 - 1, 16, var8 + 1, 7);
            }
            if (arg5 == 1) {
                this.method19(var7, 4, var8, 7);
                this.method19(var7 + 1, 64, var8 + 1, 7);
            }
            if (arg5 == 2) {
                this.method19(var7, 16, var8, 7);
                this.method19(var7 + 1, 1, var8 - 1, 7);
            }
            if (arg5 == 3) {
                this.method19(var7, 64, var8, 7);
                this.method19(var7 - 1, 4, var8 - 1, 7);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method19(var7, 130, var8, 7);
                this.method19(var7 - 1, 8, var8, 7);
                this.method19(var7, 32, var8 + 1, 7);
            }
            if (arg5 == 1) {
                this.method19(var7, 10, var8, 7);
                this.method19(var7, 32, var8 + 1, 7);
                this.method19(var7 + 1, 128, var8, 7);
            }
            if (arg5 == 2) {
                this.method19(var7, 40, var8, 7);
                this.method19(var7 + 1, 128, var8, 7);
                this.method19(var7, 2, var8 - 1, 7);
            }
            if (arg5 == 3) {
                this.method19(var7, 160, var8, 7);
                this.method19(var7, 2, var8 - 1, 7);
                this.method19(var7 - 1, 8, var8, 7);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method19(var7, 65536, var8, 7);
                this.method19(var7 - 1, 4096, var8, 7);
            }
            if (arg5 == 1) {
                this.method19(var7, 1024, var8, 7);
                this.method19(var7, 16384, var8 + 1, 7);
            }
            if (arg5 == 2) {
                this.method19(var7, 4096, var8, 7);
                this.method19(var7 + 1, 65536, var8, 7);
            }
            if (arg5 == 3) {
                this.method19(var7, 16384, var8, 7);
                this.method19(var7, 1024, var8 - 1, 7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method19(var7, 512, var8, 7);
                this.method19(var7 - 1, 8192, var8 + 1, 7);
            }
            if (arg5 == 1) {
                this.method19(var7, 2048, var8, 7);
                this.method19(var7 + 1, 32768, var8 + 1, 7);
            }
            if (arg5 == 2) {
                this.method19(var7, 8192, var8, 7);
                this.method19(var7 + 1, 512, var8 - 1, 7);
            }
            if (arg5 == 3) {
                this.method19(var7, 32768, var8, 7);
                this.method19(var7 - 1, 2048, var8 - 1, 7);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method19(var7, 66560, var8, 7);
            this.method19(var7 - 1, 4096, var8, 7);
            this.method19(var7, 16384, var8 + 1, 7);
        }
        if (arg5 == 1) {
            this.method19(var7, 5120, var8, 7);
            this.method19(var7, 16384, var8 + 1, 7);
            this.method19(var7 + 1, 65536, var8, 7);
        }
        if (arg5 == 2) {
            this.method19(var7, 20480, var8, 7);
            this.method19(var7 + 1, 65536, var8, 7);
            this.method19(var7, 1024, var8 - 1, 7);
        }
        if (arg5 == 3) {
            this.method19(var7, 81920, var8, 7);
            this.method19(var7, 1024, var8 - 1, 7);
            this.method19(var7 - 1, 4096, var8, 7);
            return;
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IZIIZII)V")
    public void method18(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field57;
        if (!arg4) {
            this.field56 = !this.field56;
        }
        int var10 = arg5 - this.field58;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg3;
            arg3 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field59) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field60) {
                        this.method19(var12, var8, var13, 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IIII)V")
    private void method19(int arg0, int arg1, int arg2, int arg3) {
        this.field61[arg0][arg2] &= 16777215 - arg1;
        if (arg3 < 7 || arg3 > 7) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IIB)V")
    public void method20(int arg0, int arg1, byte arg2) {
        if (arg2 == -58) {
            int var4 = arg0 - this.field57;
            int var5 = arg1 - this.field58;
            this.field61[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method21(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == arg2 && arg0 == arg6) {
            return true;
        }
        int var8 = arg2 - this.field57;
        int var9 = arg6 - this.field58;
        if (arg4) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = arg1 - this.field57;
        int var12 = arg0 - this.field58;
        if (arg5 == 0) {
            if (arg3 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field61[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field61[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field61[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field61[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field61[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9 && (this.field61[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field61[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 - 1 == var8 && var9 == var12) {
                    return true;
                }
                if (var8 == var11 && var12 + 1 == var9 && (this.field61[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var11 && var12 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var11 && var12 + 1 == var9 && (this.field61[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var12 - 1 == var9 && (this.field61[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var12 && (this.field61[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "BXNXROZD", name = "b", descriptor = "(IIIIZII)Z")
    public boolean method22(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == arg6 && arg3 == arg5) {
            return true;
        }
        int var8 = arg0 - this.field57;
        int var9 = arg5 - this.field58;
        int var10 = arg6 - this.field57;
        int var11 = arg3 - this.field58;
        if (arg4) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field61[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field61[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field61[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field61[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field61[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field61[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field61[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field61[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field61[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field61[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field61[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field61[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "BXNXROZD", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= 0) {
            this.field52 = -8;
        }
        int var9 = arg1 + arg3 - 1;
        int var10 = arg0 + arg4 - 1;
        if (arg6 >= arg3 && arg6 <= var9 && arg7 >= arg4 && arg7 <= var10) {
            return true;
        } else if (arg3 - 1 == arg6 && arg7 >= arg4 && arg7 <= var10 && (this.field61[arg6 - this.field57][arg7 - this.field58] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg7 >= arg4 && arg7 <= var10 && (this.field61[arg6 - this.field57][arg7 - this.field58] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg7 && arg6 >= arg3 && arg6 <= var9 && (this.field61[arg6 - this.field57][arg7 - this.field58] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg6 >= arg3 && arg6 <= var9 && (this.field61[arg6 - this.field57][arg7 - this.field58] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }
}
