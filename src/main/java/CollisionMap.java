import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class CollisionMap {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field921 = false;

    @OriginalMember(owner = "ec", name = "c", descriptor = "B")
    private byte field923 = 12;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field924 = 27808;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Z")
    private boolean field925 = true;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[[I")
    public int[][] field930;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "ec", name = "<init>", descriptor = "(III)V")
    public CollisionMap(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.field925 = !this.field925;
        }
        this.field926 = 0;
        this.field927 = 0;
        this.field928 = arg0;
        this.field929 = arg2;
        this.field930 = new int[this.field928][this.field929];
        this.method302((byte) 74);
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public void method302(byte arg0) {
        for (int var2 = 0; var2 < this.field928; var2++) {
            for (int var4 = 0; var4 < this.field929; var4++) {
                if (var2 == 0 || var4 == 0 || this.field928 - 1 == var2 || this.field929 - 1 == var4) {
                    this.field930[var2][var4] = 16777215;
                } else {
                    this.field930[var2][var4] = 0;
                }
            }
        }
        if (arg0 != 74) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIIIZI)V")
    public void method303(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field926;
        if (!arg0) {
            this.field921 = !this.field921;
        }
        int var8 = arg2 - this.field927;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method306(var7, var8, 128);
                this.method306(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method306(var7, var8, 2);
                this.method306(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method306(var7, var8, 8);
                this.method306(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method306(var7, var8, 32);
                this.method306(var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method306(var7, var8, 1);
                this.method306(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method306(var7, var8, 4);
                this.method306(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method306(var7, var8, 16);
                this.method306(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method306(var7, var8, 64);
                this.method306(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method306(var7, var8, 130);
                this.method306(var7 - 1, var8, 8);
                this.method306(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method306(var7, var8, 10);
                this.method306(var7, var8 + 1, 32);
                this.method306(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method306(var7, var8, 40);
                this.method306(var7 + 1, var8, 128);
                this.method306(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method306(var7, var8, 160);
                this.method306(var7, var8 - 1, 2);
                this.method306(var7 - 1, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method306(var7, var8, 65536);
                this.method306(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method306(var7, var8, 1024);
                this.method306(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method306(var7, var8, 4096);
                this.method306(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method306(var7, var8, 16384);
                this.method306(var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method306(var7, var8, 512);
                this.method306(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method306(var7, var8, 2048);
                this.method306(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method306(var7, var8, 8192);
                this.method306(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method306(var7, var8, 32768);
                this.method306(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method306(var7, var8, 66560);
            this.method306(var7 - 1, var8, 4096);
            this.method306(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method306(var7, var8, 5120);
            this.method306(var7, var8 + 1, 16384);
            this.method306(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method306(var7, var8, 20480);
            this.method306(var7 + 1, var8, 65536);
            this.method306(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method306(var7, var8, 81920);
            this.method306(var7, var8 - 1, 1024);
            this.method306(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIIZ)V")
    public void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field926;
        int var10 = arg5 - this.field927;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg2;
            arg2 = arg1;
            arg1 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field928) {
                for (int var14 = var10; var14 < arg1 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field929) {
                        this.method306(var12, var14, var8);
                    }
                }
            }
        }
        if (arg4 != 9) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BII)V")
    public void method305(byte arg0, int arg1, int arg2) {
        if (this.field923 == arg0) {
            int var4 = arg2 - this.field926;
            int var5 = arg1 - this.field927;
            this.field930[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(III)V")
    private void method306(int arg0, int arg1, int arg2) {
        this.field930[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIIIII)V")
    public void method307(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 9 / arg4;
        int var8 = arg2 - this.field926;
        int var9 = arg3 - this.field927;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method309(var9, (byte) -9, var8, 128);
                this.method309(var9, (byte) -9, var8 - 1, 8);
            }
            if (arg1 == 1) {
                this.method309(var9, (byte) -9, var8, 2);
                this.method309(var9 + 1, (byte) -9, var8, 32);
            }
            if (arg1 == 2) {
                this.method309(var9, (byte) -9, var8, 8);
                this.method309(var9, (byte) -9, var8 + 1, 128);
            }
            if (arg1 == 3) {
                this.method309(var9, (byte) -9, var8, 32);
                this.method309(var9 - 1, (byte) -9, var8, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method309(var9, (byte) -9, var8, 1);
                this.method309(var9 + 1, (byte) -9, var8 - 1, 16);
            }
            if (arg1 == 1) {
                this.method309(var9, (byte) -9, var8, 4);
                this.method309(var9 + 1, (byte) -9, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method309(var9, (byte) -9, var8, 16);
                this.method309(var9 - 1, (byte) -9, var8 + 1, 1);
            }
            if (arg1 == 3) {
                this.method309(var9, (byte) -9, var8, 64);
                this.method309(var9 - 1, (byte) -9, var8 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method309(var9, (byte) -9, var8, 130);
                this.method309(var9, (byte) -9, var8 - 1, 8);
                this.method309(var9 + 1, (byte) -9, var8, 32);
            }
            if (arg1 == 1) {
                this.method309(var9, (byte) -9, var8, 10);
                this.method309(var9 + 1, (byte) -9, var8, 32);
                this.method309(var9, (byte) -9, var8 + 1, 128);
            }
            if (arg1 == 2) {
                this.method309(var9, (byte) -9, var8, 40);
                this.method309(var9, (byte) -9, var8 + 1, 128);
                this.method309(var9 - 1, (byte) -9, var8, 2);
            }
            if (arg1 == 3) {
                this.method309(var9, (byte) -9, var8, 160);
                this.method309(var9 - 1, (byte) -9, var8, 2);
                this.method309(var9, (byte) -9, var8 - 1, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method309(var9, (byte) -9, var8, 65536);
                this.method309(var9, (byte) -9, var8 - 1, 4096);
            }
            if (arg1 == 1) {
                this.method309(var9, (byte) -9, var8, 1024);
                this.method309(var9 + 1, (byte) -9, var8, 16384);
            }
            if (arg1 == 2) {
                this.method309(var9, (byte) -9, var8, 4096);
                this.method309(var9, (byte) -9, var8 + 1, 65536);
            }
            if (arg1 == 3) {
                this.method309(var9, (byte) -9, var8, 16384);
                this.method309(var9 - 1, (byte) -9, var8, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method309(var9, (byte) -9, var8, 512);
                this.method309(var9 + 1, (byte) -9, var8 - 1, 8192);
            }
            if (arg1 == 1) {
                this.method309(var9, (byte) -9, var8, 2048);
                this.method309(var9 + 1, (byte) -9, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method309(var9, (byte) -9, var8, 8192);
                this.method309(var9 - 1, (byte) -9, var8 + 1, 512);
            }
            if (arg1 == 3) {
                this.method309(var9, (byte) -9, var8, 32768);
                this.method309(var9 - 1, (byte) -9, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method309(var9, (byte) -9, var8, 66560);
            this.method309(var9, (byte) -9, var8 - 1, 4096);
            this.method309(var9 + 1, (byte) -9, var8, 16384);
        }
        if (arg1 == 1) {
            this.method309(var9, (byte) -9, var8, 5120);
            this.method309(var9 + 1, (byte) -9, var8, 16384);
            this.method309(var9, (byte) -9, var8 + 1, 65536);
        }
        if (arg1 == 2) {
            this.method309(var9, (byte) -9, var8, 20480);
            this.method309(var9, (byte) -9, var8 + 1, 65536);
            this.method309(var9 - 1, (byte) -9, var8, 1024);
        }
        if (arg1 == 3) {
            this.method309(var9, (byte) -9, var8, 81920);
            this.method309(var9 - 1, (byte) -9, var8, 1024);
            this.method309(var9, (byte) -9, var8 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIZZI)V")
    public void method308(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field926;
        int var10 = arg0 - this.field927;
        if (!arg4) {
            this.field922 = 67;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field928) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field929) {
                        this.method309(var13, (byte) -9, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IBII)V")
    private void method309(int arg0, byte arg1, int arg2, int arg3) {
        this.field930[arg2][arg0] &= 16777215 - arg3;
        if (arg1 == -9) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(III)V")
    public void method310(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg1 - this.field926;
            int var5 = arg0 - this.field927;
            this.field930[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field926;
        int var9 = arg4 - this.field927;
        if (arg0 != -7517) {
            throw new NullPointerException();
        }
        int var10 = arg5 - this.field926;
        int var11 = arg2 - this.field927;
        if (arg3 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field924 != arg2) {
            this.field922 = -218;
        }
        if (arg3 == arg4 && arg5 == arg6) {
            return true;
        }
        int var8 = arg3 - this.field926;
        int var9 = arg5 - this.field927;
        int var10 = arg4 - this.field926;
        int var11 = arg6 - this.field927;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field930[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field930[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field930[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg6 - 1;
        int var10 = arg1 + arg5 - 1;
        int var11 = 17 / arg7;
        if (arg2 >= arg3 && arg2 <= var9 && arg0 >= arg5 && arg0 <= var10) {
            return true;
        } else if (arg3 - 1 == arg2 && arg0 >= arg5 && arg0 <= var10 && (this.field930[arg2 - this.field926][arg0 - this.field927] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg0 >= arg5 && arg0 <= var10 && (this.field930[arg2 - this.field926][arg0 - this.field927] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg0 && arg2 >= arg3 && arg2 <= var9 && (this.field930[arg2 - this.field926][arg0 - this.field927] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg2 >= arg3 && arg2 <= var9 && (this.field930[arg2 - this.field926][arg0 - this.field927] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }
}
