import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AOKWRKNA")
public class class1 {

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "Z")
    private boolean field1 = true;

    @OriginalMember(owner = "client!AOKWRKNA", name = "b", descriptor = "Z")
    private boolean field2 = true;

    @OriginalMember(owner = "client!AOKWRKNA", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!AOKWRKNA", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!AOKWRKNA", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!AOKWRKNA", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!AOKWRKNA", name = "g", descriptor = "[[I")
    public int[][] field7;

    @OriginalMember(owner = "client!AOKWRKNA", name = "<init>", descriptor = "(III)V")
    public class1(int arg0, int arg1, int arg2) {
        int var4 = 24 / arg0;
        this.field3 = 0;
        this.field4 = 0;
        this.field5 = arg1;
        this.field6 = arg2;
        this.field7 = new int[this.field5][this.field6];
        this.method1();
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "()V")
    public void method1() {
        for (int var1 = 0; var1 < this.field5; var1++) {
            for (int var2 = 0; var2 < this.field6; var2++) {
                if (var1 == 0 || var2 == 0 || this.field5 - 1 == var1 || this.field6 - 1 == var2) {
                    this.field7[var1][var2] = 16777215;
                } else {
                    this.field7[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(BIIZII)V")
    public void method2(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field3;
        int var8 = arg1 - this.field4;
        if (arg0 != 61) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method5(var7, var8, 128);
                this.method5(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method5(var7, var8, 2);
                this.method5(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method5(var7, var8, 8);
                this.method5(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method5(var7, var8, 32);
                this.method5(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method5(var7, var8, 1);
                this.method5(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method5(var7, var8, 4);
                this.method5(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method5(var7, var8, 16);
                this.method5(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method5(var7, var8, 64);
                this.method5(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method5(var7, var8, 130);
                this.method5(var7 - 1, var8, 8);
                this.method5(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method5(var7, var8, 10);
                this.method5(var7, var8 + 1, 32);
                this.method5(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method5(var7, var8, 40);
                this.method5(var7 + 1, var8, 128);
                this.method5(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method5(var7, var8, 160);
                this.method5(var7, var8 - 1, 2);
                this.method5(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method5(var7, var8, 65536);
                this.method5(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method5(var7, var8, 1024);
                this.method5(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method5(var7, var8, 4096);
                this.method5(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method5(var7, var8, 16384);
                this.method5(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method5(var7, var8, 512);
                this.method5(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method5(var7, var8, 2048);
                this.method5(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method5(var7, var8, 8192);
                this.method5(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method5(var7, var8, 32768);
                this.method5(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method5(var7, var8, 66560);
            this.method5(var7 - 1, var8, 4096);
            this.method5(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method5(var7, var8, 5120);
            this.method5(var7, var8 + 1, 16384);
            this.method5(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method5(var7, var8, 20480);
            this.method5(var7 + 1, var8, 65536);
            this.method5(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method5(var7, var8, 81920);
            this.method5(var7, var8 - 1, 1024);
            this.method5(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIIIZII)V")
    public void method3(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field3;
        int var10 = arg1 - this.field4;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg0;
            arg0 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field5) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field6) {
                        this.method5(var12, var13, var8);
                    }
                }
            }
        }
        if (arg5 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(III)V")
    public void method4(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3;
        if (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = arg0 - this.field4;
        this.field7[var4][var6] |= 0x200000;
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "b", descriptor = "(III)V")
    private void method5(int arg0, int arg1, int arg2) {
        this.field7[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IZIIII)V")
    public void method6(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field3;
        if (arg3 != 0) {
            return;
        }
        int var8 = arg5 - this.field4;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method8(var8, var7, 798, 128);
                this.method8(var8, var7 - 1, 798, 8);
            }
            if (arg2 == 1) {
                this.method8(var8, var7, 798, 2);
                this.method8(var8 + 1, var7, 798, 32);
            }
            if (arg2 == 2) {
                this.method8(var8, var7, 798, 8);
                this.method8(var8, var7 + 1, 798, 128);
            }
            if (arg2 == 3) {
                this.method8(var8, var7, 798, 32);
                this.method8(var8 - 1, var7, 798, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method8(var8, var7, 798, 1);
                this.method8(var8 + 1, var7 - 1, 798, 16);
            }
            if (arg2 == 1) {
                this.method8(var8, var7, 798, 4);
                this.method8(var8 + 1, var7 + 1, 798, 64);
            }
            if (arg2 == 2) {
                this.method8(var8, var7, 798, 16);
                this.method8(var8 - 1, var7 + 1, 798, 1);
            }
            if (arg2 == 3) {
                this.method8(var8, var7, 798, 64);
                this.method8(var8 - 1, var7 - 1, 798, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method8(var8, var7, 798, 130);
                this.method8(var8, var7 - 1, 798, 8);
                this.method8(var8 + 1, var7, 798, 32);
            }
            if (arg2 == 1) {
                this.method8(var8, var7, 798, 10);
                this.method8(var8 + 1, var7, 798, 32);
                this.method8(var8, var7 + 1, 798, 128);
            }
            if (arg2 == 2) {
                this.method8(var8, var7, 798, 40);
                this.method8(var8, var7 + 1, 798, 128);
                this.method8(var8 - 1, var7, 798, 2);
            }
            if (arg2 == 3) {
                this.method8(var8, var7, 798, 160);
                this.method8(var8 - 1, var7, 798, 2);
                this.method8(var8, var7 - 1, 798, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method8(var8, var7, 798, 65536);
                this.method8(var8, var7 - 1, 798, 4096);
            }
            if (arg2 == 1) {
                this.method8(var8, var7, 798, 1024);
                this.method8(var8 + 1, var7, 798, 16384);
            }
            if (arg2 == 2) {
                this.method8(var8, var7, 798, 4096);
                this.method8(var8, var7 + 1, 798, 65536);
            }
            if (arg2 == 3) {
                this.method8(var8, var7, 798, 16384);
                this.method8(var8 - 1, var7, 798, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method8(var8, var7, 798, 512);
                this.method8(var8 + 1, var7 - 1, 798, 8192);
            }
            if (arg2 == 1) {
                this.method8(var8, var7, 798, 2048);
                this.method8(var8 + 1, var7 + 1, 798, 32768);
            }
            if (arg2 == 2) {
                this.method8(var8, var7, 798, 8192);
                this.method8(var8 - 1, var7 + 1, 798, 512);
            }
            if (arg2 == 3) {
                this.method8(var8, var7, 798, 32768);
                this.method8(var8 - 1, var7 - 1, 798, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method8(var8, var7, 798, 66560);
            this.method8(var8, var7 - 1, 798, 4096);
            this.method8(var8 + 1, var7, 798, 16384);
        }
        if (arg2 == 1) {
            this.method8(var8, var7, 798, 5120);
            this.method8(var8 + 1, var7, 798, 16384);
            this.method8(var8, var7 + 1, 798, 65536);
        }
        if (arg2 == 2) {
            this.method8(var8, var7, 798, 20480);
            this.method8(var8, var7 + 1, 798, 65536);
            this.method8(var8 - 1, var7, 798, 1024);
        }
        if (arg2 == 3) {
            this.method8(var8, var7, 798, 81920);
            this.method8(var8 - 1, var7, 798, 1024);
            this.method8(var8, var7 - 1, 798, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(ZIIIIII)V")
    public void method7(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field3;
        int var10 = arg3 - this.field4;
        if (arg4 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg6;
            arg6 = arg1;
            arg1 = var12;
        }
        for (int var13 = var9; var13 < arg6 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field5) {
                for (int var14 = var10; var14 < arg1 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field6) {
                        this.method8(var14, var13, 798, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIII)V")
    private void method8(int arg0, int arg1, int arg2, int arg3) {
        this.field7[arg1][arg0] &= 16777215 - arg3;
        int var5 = 28 / arg2;
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(BII)V")
    public void method9(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3;
        int var5 = arg2 - this.field4;
        if (arg0 == 0) {
            this.field7[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            this.field1 = !this.field1;
        }
        if (arg4 == arg5 && arg0 == arg1) {
            return true;
        }
        int var8 = arg4 - this.field3;
        int var9 = arg0 - this.field4;
        int var10 = arg5 - this.field3;
        int var11 = arg1 - this.field4;
        if (arg3 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg2 && arg1 == arg4) {
            return true;
        }
        int var8 = arg2 - this.field3;
        if (arg6 < 6 || arg6 > 6) {
            throw new NullPointerException();
        }
        int var9 = arg1 - this.field4;
        int var10 = arg0 - this.field3;
        int var11 = arg4 - this.field4;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field7[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field7[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field7[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIBIIIII)Z")
    public boolean method12(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg0 + arg6 - 1;
        int var10 = arg1 + arg4 - 1;
        if (arg2 == 9) {
            boolean var11 = false;
        } else {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg7 >= arg6 && arg7 <= var9 && arg5 >= arg1 && arg5 <= var10) {
            return true;
        } else if (arg6 - 1 == arg7 && arg5 >= arg1 && arg5 <= var10 && (this.field7[arg7 - this.field3][arg5 - this.field4] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg5 >= arg1 && arg5 <= var10 && (this.field7[arg7 - this.field3][arg5 - this.field4] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg5 && arg7 >= arg6 && arg7 <= var9 && (this.field7[arg7 - this.field3][arg5 - this.field4] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg7 >= arg6 && arg7 <= var9 && (this.field7[arg7 - this.field3][arg5 - this.field4] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
