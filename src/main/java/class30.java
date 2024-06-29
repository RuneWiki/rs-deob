import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KQTHKTBC")
public class class30 {

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "Z")
    private boolean field912 = false;

    @OriginalMember(owner = "client!KQTHKTBC", name = "b", descriptor = "B")
    private byte field913 = 32;

    @OriginalMember(owner = "client!KQTHKTBC", name = "c", descriptor = "Z")
    private boolean field914 = false;

    @OriginalMember(owner = "client!KQTHKTBC", name = "d", descriptor = "I")
    private int field915 = 7;

    @OriginalMember(owner = "client!KQTHKTBC", name = "e", descriptor = "I")
    private int field916 = 31743;

    @OriginalMember(owner = "client!KQTHKTBC", name = "f", descriptor = "I")
    public int field917 = 0;

    @OriginalMember(owner = "client!KQTHKTBC", name = "g", descriptor = "I")
    public int field918 = 0;

    @OriginalMember(owner = "client!KQTHKTBC", name = "h", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!KQTHKTBC", name = "i", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!KQTHKTBC", name = "j", descriptor = "[[I")
    public int[][] field921;

    @OriginalMember(owner = "client!KQTHKTBC", name = "<init>", descriptor = "(IIZ)V")
    public class30(int arg0, int arg1, boolean arg2) {
        this.field919 = arg1;
        this.field920 = arg0;
        this.field921 = new int[this.field919][this.field920];
        this.method283();
        if (!arg2) {
            this.field912 = !this.field912;
        } else if (class8.field113) {
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "()V")
    public void method283() {
        for (int var1 = 0; var1 < this.field919; var1++) {
            for (int var2 = 0; var2 < this.field920; var2++) {
                if (var1 == 0 || var2 == 0 || this.field919 - 1 == var1 || this.field920 - 1 == var2) {
                    this.field921[var1][var2] = 16777215;
                } else {
                    this.field921[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IBIZII)V")
    public void method284(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field917;
        int var8 = arg4 - this.field918;
        if (arg1 != 78) {
            this.field912 = !this.field912;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method287(var7, var8, 128);
                this.method287(var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method287(var7, var8, 2);
                this.method287(var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method287(var7, var8, 8);
                this.method287(var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method287(var7, var8, 32);
                this.method287(var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method287(var7, var8, 1);
                this.method287(var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method287(var7, var8, 4);
                this.method287(var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method287(var7, var8, 16);
                this.method287(var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method287(var7, var8, 64);
                this.method287(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method287(var7, var8, 130);
                this.method287(var7 - 1, var8, 8);
                this.method287(var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method287(var7, var8, 10);
                this.method287(var7, var8 + 1, 32);
                this.method287(var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method287(var7, var8, 40);
                this.method287(var7 + 1, var8, 128);
                this.method287(var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method287(var7, var8, 160);
                this.method287(var7, var8 - 1, 2);
                this.method287(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method287(var7, var8, 65536);
                this.method287(var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method287(var7, var8, 1024);
                this.method287(var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method287(var7, var8, 4096);
                this.method287(var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method287(var7, var8, 16384);
                this.method287(var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method287(var7, var8, 512);
                this.method287(var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method287(var7, var8, 2048);
                this.method287(var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method287(var7, var8, 8192);
                this.method287(var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method287(var7, var8, 32768);
                this.method287(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method287(var7, var8, 66560);
            this.method287(var7 - 1, var8, 4096);
            this.method287(var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method287(var7, var8, 5120);
            this.method287(var7, var8 + 1, 16384);
            this.method287(var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method287(var7, var8, 20480);
            this.method287(var7 + 1, var8, 65536);
            this.method287(var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method287(var7, var8, 81920);
            this.method287(var7, var8 - 1, 1024);
            this.method287(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIZIII)V")
    public void method285(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg5 >= 0) {
            this.field914 = !this.field914;
        }
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field917;
        int var10 = arg0 - this.field918;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg6;
            arg6 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field919) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field920) {
                        this.method287(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(III)V")
    public void method286(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field917;
        if (arg0 < 0) {
            int var5 = arg1 - this.field918;
            this.field921[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "b", descriptor = "(III)V")
    private void method287(int arg0, int arg1, int arg2) {
        this.field921[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IZIIII)V")
    public void method288(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field917;
        int var8 = 24 / arg2;
        int var9 = arg3 - this.field918;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method290(var7, 128, var9, (byte) 108);
                this.method290(var7 - 1, 8, var9, (byte) 108);
            }
            if (arg5 == 1) {
                this.method290(var7, 2, var9, (byte) 108);
                this.method290(var7, 32, var9 + 1, (byte) 108);
            }
            if (arg5 == 2) {
                this.method290(var7, 8, var9, (byte) 108);
                this.method290(var7 + 1, 128, var9, (byte) 108);
            }
            if (arg5 == 3) {
                this.method290(var7, 32, var9, (byte) 108);
                this.method290(var7, 2, var9 - 1, (byte) 108);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method290(var7, 1, var9, (byte) 108);
                this.method290(var7 - 1, 16, var9 + 1, (byte) 108);
            }
            if (arg5 == 1) {
                this.method290(var7, 4, var9, (byte) 108);
                this.method290(var7 + 1, 64, var9 + 1, (byte) 108);
            }
            if (arg5 == 2) {
                this.method290(var7, 16, var9, (byte) 108);
                this.method290(var7 + 1, 1, var9 - 1, (byte) 108);
            }
            if (arg5 == 3) {
                this.method290(var7, 64, var9, (byte) 108);
                this.method290(var7 - 1, 4, var9 - 1, (byte) 108);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method290(var7, 130, var9, (byte) 108);
                this.method290(var7 - 1, 8, var9, (byte) 108);
                this.method290(var7, 32, var9 + 1, (byte) 108);
            }
            if (arg5 == 1) {
                this.method290(var7, 10, var9, (byte) 108);
                this.method290(var7, 32, var9 + 1, (byte) 108);
                this.method290(var7 + 1, 128, var9, (byte) 108);
            }
            if (arg5 == 2) {
                this.method290(var7, 40, var9, (byte) 108);
                this.method290(var7 + 1, 128, var9, (byte) 108);
                this.method290(var7, 2, var9 - 1, (byte) 108);
            }
            if (arg5 == 3) {
                this.method290(var7, 160, var9, (byte) 108);
                this.method290(var7, 2, var9 - 1, (byte) 108);
                this.method290(var7 - 1, 8, var9, (byte) 108);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method290(var7, 65536, var9, (byte) 108);
                this.method290(var7 - 1, 4096, var9, (byte) 108);
            }
            if (arg5 == 1) {
                this.method290(var7, 1024, var9, (byte) 108);
                this.method290(var7, 16384, var9 + 1, (byte) 108);
            }
            if (arg5 == 2) {
                this.method290(var7, 4096, var9, (byte) 108);
                this.method290(var7 + 1, 65536, var9, (byte) 108);
            }
            if (arg5 == 3) {
                this.method290(var7, 16384, var9, (byte) 108);
                this.method290(var7, 1024, var9 - 1, (byte) 108);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method290(var7, 512, var9, (byte) 108);
                this.method290(var7 - 1, 8192, var9 + 1, (byte) 108);
            }
            if (arg5 == 1) {
                this.method290(var7, 2048, var9, (byte) 108);
                this.method290(var7 + 1, 32768, var9 + 1, (byte) 108);
            }
            if (arg5 == 2) {
                this.method290(var7, 8192, var9, (byte) 108);
                this.method290(var7 + 1, 512, var9 - 1, (byte) 108);
            }
            if (arg5 == 3) {
                this.method290(var7, 32768, var9, (byte) 108);
                this.method290(var7 - 1, 2048, var9 - 1, (byte) 108);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method290(var7, 66560, var9, (byte) 108);
            this.method290(var7 - 1, 4096, var9, (byte) 108);
            this.method290(var7, 16384, var9 + 1, (byte) 108);
        }
        if (arg5 == 1) {
            this.method290(var7, 5120, var9, (byte) 108);
            this.method290(var7, 16384, var9 + 1, (byte) 108);
            this.method290(var7 + 1, 65536, var9, (byte) 108);
        }
        if (arg5 == 2) {
            this.method290(var7, 20480, var9, (byte) 108);
            this.method290(var7 + 1, 65536, var9, (byte) 108);
            this.method290(var7, 1024, var9 - 1, (byte) 108);
        }
        if (arg5 == 3) {
            this.method290(var7, 81920, var9, (byte) 108);
            this.method290(var7, 1024, var9 - 1, (byte) 108);
            this.method290(var7 - 1, 4096, var9, (byte) 108);
            return;
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(ZIIIIIZ)V")
    public void method289(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            return;
        }
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field917;
        int var10 = arg3 - this.field918;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg5;
            arg5 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field919) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field920) {
                        this.method290(var12, var8, var13, (byte) 108);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIB)V")
    private void method290(int arg0, int arg1, int arg2, byte arg3) {
        this.field921[arg0][arg2] &= 16777215 - arg1;
        if (arg3 == 108) {
            ;
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IZI)V")
    public void method291(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field917;
        int var5 = arg0 - this.field918;
        this.field921[var4][var5] &= 0xDFFFFF;
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIIZII)Z")
    public boolean method292(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == arg2 && arg3 == arg6) {
            return true;
        }
        int var8 = arg2 - this.field917;
        int var9 = arg6 - this.field918;
        int var10 = arg1 - this.field917;
        int var11 = arg3 - this.field918;
        if (!arg4) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg1 && arg2 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field917;
        int var9 = arg6 - this.field918;
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        int var10 = arg0 - this.field917;
        int var11 = arg2 - this.field918;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field921[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field921[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field921[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IZIIIIII)Z")
    public boolean method294(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg7 - 1;
        int var10 = arg0 + arg4 - 1;
        if (!arg1) {
            this.field914 = !this.field914;
        }
        if (arg2 >= arg7 && arg2 <= var9 && arg5 >= arg0 && arg5 <= var10) {
            return true;
        } else if (arg7 - 1 == arg2 && arg5 >= arg0 && arg5 <= var10 && (this.field921[arg2 - this.field917][arg5 - this.field918] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg5 >= arg0 && arg5 <= var10 && (this.field921[arg2 - this.field917][arg5 - this.field918] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg5 && arg2 >= arg7 && arg2 <= var9 && (this.field921[arg2 - this.field917][arg5 - this.field918] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg2 >= arg7 && arg2 <= var9 && (this.field921[arg2 - this.field917][arg5 - this.field918] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
