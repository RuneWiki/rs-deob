import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HQFIXEZL")
public class class28 {

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "Z")
    private boolean field788 = true;

    @OriginalMember(owner = "HQFIXEZL", name = "b", descriptor = "I")
    private int field789 = 16042;

    @OriginalMember(owner = "HQFIXEZL", name = "c", descriptor = "I")
    private int field790 = 484;

    @OriginalMember(owner = "HQFIXEZL", name = "d", descriptor = "Z")
    private boolean field791 = false;

    @OriginalMember(owner = "HQFIXEZL", name = "e", descriptor = "Z")
    private boolean field792 = true;

    @OriginalMember(owner = "HQFIXEZL", name = "f", descriptor = "I")
    public int field793 = 0;

    @OriginalMember(owner = "HQFIXEZL", name = "g", descriptor = "I")
    public int field794 = 0;

    @OriginalMember(owner = "HQFIXEZL", name = "h", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "HQFIXEZL", name = "i", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "HQFIXEZL", name = "j", descriptor = "[[I")
    public int[][] field797;

    @OriginalMember(owner = "HQFIXEZL", name = "<init>", descriptor = "(IIZ)V")
    public class28(int arg0, int arg1, boolean arg2) {
        this.field795 = arg1;
        if (!arg2) {
            throw new NullPointerException();
        }
        this.field796 = arg0;
        this.field797 = new int[this.field795][this.field796];
        this.method300();
        if (class67.field1668) {
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "()V")
    public void method300() {
        for (int var1 = 0; var1 < this.field795; var1++) {
            for (int var2 = 0; var2 < this.field796; var2++) {
                if (var1 == 0 || var2 == 0 || this.field795 - 1 == var1 || this.field796 - 1 == var2) {
                    this.field797[var1][var2] = 16777215;
                } else {
                    this.field797[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(IIZZII)V")
    public void method301(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field793;
        int var8 = arg5 - this.field794;
        if (arg2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method304(var7, var8, 128);
                this.method304(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method304(var7, var8, 2);
                this.method304(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method304(var7, var8, 8);
                this.method304(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method304(var7, var8, 32);
                this.method304(var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method304(var7, var8, 1);
                this.method304(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method304(var7, var8, 4);
                this.method304(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method304(var7, var8, 16);
                this.method304(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method304(var7, var8, 64);
                this.method304(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method304(var7, var8, 130);
                this.method304(var7 - 1, var8, 8);
                this.method304(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method304(var7, var8, 10);
                this.method304(var7, var8 + 1, 32);
                this.method304(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method304(var7, var8, 40);
                this.method304(var7 + 1, var8, 128);
                this.method304(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method304(var7, var8, 160);
                this.method304(var7, var8 - 1, 2);
                this.method304(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method304(var7, var8, 65536);
                this.method304(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method304(var7, var8, 1024);
                this.method304(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method304(var7, var8, 4096);
                this.method304(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method304(var7, var8, 16384);
                this.method304(var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method304(var7, var8, 512);
                this.method304(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method304(var7, var8, 2048);
                this.method304(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method304(var7, var8, 8192);
                this.method304(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method304(var7, var8, 32768);
                this.method304(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method304(var7, var8, 66560);
            this.method304(var7 - 1, var8, 4096);
            this.method304(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method304(var7, var8, 5120);
            this.method304(var7, var8 + 1, 16384);
            this.method304(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method304(var7, var8, 20480);
            this.method304(var7 + 1, var8, 65536);
            this.method304(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method304(var7, var8, 81920);
            this.method304(var7, var8 - 1, 1024);
            this.method304(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(IIIIIIZ)V")
    public void method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg0 != 9) {
            this.field791 = !this.field791;
        }
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field793;
        int var10 = arg1 - this.field794;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field795) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field796) {
                        this.method304(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(III)V")
    public void method303(int arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var4 = arg0 - this.field793;
        int var5 = arg1 - this.field794;
        this.field797[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "HQFIXEZL", name = "b", descriptor = "(III)V")
    private void method304(int arg0, int arg1, int arg2) {
        this.field797[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(ZBIIII)V")
    public void method305(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field793;
        int var8 = arg5 - this.field794;
        if (arg1 != 2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method307(0, var8, var7, 128);
                this.method307(0, var8, var7 - 1, 8);
            }
            if (arg3 == 1) {
                this.method307(0, var8, var7, 2);
                this.method307(0, var8 + 1, var7, 32);
            }
            if (arg3 == 2) {
                this.method307(0, var8, var7, 8);
                this.method307(0, var8, var7 + 1, 128);
            }
            if (arg3 == 3) {
                this.method307(0, var8, var7, 32);
                this.method307(0, var8 - 1, var7, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method307(0, var8, var7, 1);
                this.method307(0, var8 + 1, var7 - 1, 16);
            }
            if (arg3 == 1) {
                this.method307(0, var8, var7, 4);
                this.method307(0, var8 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method307(0, var8, var7, 16);
                this.method307(0, var8 - 1, var7 + 1, 1);
            }
            if (arg3 == 3) {
                this.method307(0, var8, var7, 64);
                this.method307(0, var8 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method307(0, var8, var7, 130);
                this.method307(0, var8, var7 - 1, 8);
                this.method307(0, var8 + 1, var7, 32);
            }
            if (arg3 == 1) {
                this.method307(0, var8, var7, 10);
                this.method307(0, var8 + 1, var7, 32);
                this.method307(0, var8, var7 + 1, 128);
            }
            if (arg3 == 2) {
                this.method307(0, var8, var7, 40);
                this.method307(0, var8, var7 + 1, 128);
                this.method307(0, var8 - 1, var7, 2);
            }
            if (arg3 == 3) {
                this.method307(0, var8, var7, 160);
                this.method307(0, var8 - 1, var7, 2);
                this.method307(0, var8, var7 - 1, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method307(0, var8, var7, 65536);
                this.method307(0, var8, var7 - 1, 4096);
            }
            if (arg3 == 1) {
                this.method307(0, var8, var7, 1024);
                this.method307(0, var8 + 1, var7, 16384);
            }
            if (arg3 == 2) {
                this.method307(0, var8, var7, 4096);
                this.method307(0, var8, var7 + 1, 65536);
            }
            if (arg3 == 3) {
                this.method307(0, var8, var7, 16384);
                this.method307(0, var8 - 1, var7, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method307(0, var8, var7, 512);
                this.method307(0, var8 + 1, var7 - 1, 8192);
            }
            if (arg3 == 1) {
                this.method307(0, var8, var7, 2048);
                this.method307(0, var8 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method307(0, var8, var7, 8192);
                this.method307(0, var8 - 1, var7 + 1, 512);
            }
            if (arg3 == 3) {
                this.method307(0, var8, var7, 32768);
                this.method307(0, var8 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method307(0, var8, var7, 66560);
            this.method307(0, var8, var7 - 1, 4096);
            this.method307(0, var8 + 1, var7, 16384);
        }
        if (arg3 == 1) {
            this.method307(0, var8, var7, 5120);
            this.method307(0, var8 + 1, var7, 16384);
            this.method307(0, var8, var7 + 1, 65536);
        }
        if (arg3 == 2) {
            this.method307(0, var8, var7, 20480);
            this.method307(0, var8, var7 + 1, 65536);
            this.method307(0, var8 - 1, var7, 1024);
        }
        if (arg3 == 3) {
            this.method307(0, var8, var7, 81920);
            this.method307(0, var8 - 1, var7, 1024);
            this.method307(0, var8, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(BIZIIII)V")
    public void method306(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field793;
        int var10 = arg5 - this.field794;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg1;
            arg1 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field795) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field796) {
                        this.method307(0, var13, var12, var8);
                    }
                }
            }
        }
        if (arg0 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(IIII)V")
    private void method307(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field797[arg2][arg1] &= 16777215 - arg3;
    }

    @OriginalMember(owner = "HQFIXEZL", name = "c", descriptor = "(III)V")
    public void method308(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field793;
        int var5 = arg2 - this.field794;
        this.field797[var4][var5] &= 0xDFFFFF;
        if (arg1 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -41150) {
            throw new NullPointerException();
        } else if (arg1 == arg4 && arg3 == arg6) {
            return true;
        } else {
            int var8 = arg1 - this.field793;
            int var9 = arg6 - this.field794;
            int var10 = arg4 - this.field793;
            int var11 = arg3 - this.field794;
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x1280120) == 0) {
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
                    if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "HQFIXEZL", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg2 && arg4 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field793;
        int var9 = arg4 - this.field794;
        int var10 = arg2 - this.field793;
        int var11 = arg6 - this.field794;
        if (arg1 != 0) {
            this.field792 = !this.field792;
        }
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field797[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field797[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field797[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "HQFIXEZL", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        int var9 = arg4 + arg7 - 1;
        int var10 = arg0 + arg1 - 1;
        if (arg6 >= arg7 && arg6 <= var9 && arg5 >= arg0 && arg5 <= var10) {
            return true;
        } else if (arg7 - 1 == arg6 && arg5 >= arg0 && arg5 <= var10 && (this.field797[arg6 - this.field793][arg5 - this.field794] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg5 >= arg0 && arg5 <= var10 && (this.field797[arg6 - this.field793][arg5 - this.field794] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg5 && arg6 >= arg7 && arg6 <= var9 && (this.field797[arg6 - this.field793][arg5 - this.field794] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg6 >= arg7 && arg6 <= var9 && (this.field797[arg6 - this.field793][arg5 - this.field794] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }
}
