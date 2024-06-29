import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RUPQNTVM")
public class class47 {

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "I")
    private int field1325 = 37;

    @OriginalMember(owner = "client!RUPQNTVM", name = "b", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "client!RUPQNTVM", name = "c", descriptor = "Z")
    private boolean field1327 = true;

    @OriginalMember(owner = "client!RUPQNTVM", name = "d", descriptor = "B")
    private byte field1328 = 8;

    @OriginalMember(owner = "client!RUPQNTVM", name = "e", descriptor = "I")
    private int field1329 = 4;

    @OriginalMember(owner = "client!RUPQNTVM", name = "f", descriptor = "Z")
    private boolean field1330 = false;

    @OriginalMember(owner = "client!RUPQNTVM", name = "g", descriptor = "I")
    private int field1331 = -163;

    @OriginalMember(owner = "client!RUPQNTVM", name = "h", descriptor = "I")
    public int field1332 = 0;

    @OriginalMember(owner = "client!RUPQNTVM", name = "i", descriptor = "I")
    public int field1333 = 0;

    @OriginalMember(owner = "client!RUPQNTVM", name = "j", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!RUPQNTVM", name = "k", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!RUPQNTVM", name = "l", descriptor = "[[I")
    public int[][] field1336;

    @OriginalMember(owner = "client!RUPQNTVM", name = "<init>", descriptor = "(BII)V")
    public class47(byte arg0, int arg1, int arg2) {
        this.field1334 = arg2;
        this.field1335 = arg1;
        this.field1336 = new int[this.field1334][this.field1335];
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.method483();
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "()V")
    public void method483() {
        for (int var1 = 0; var1 < this.field1334; var1++) {
            for (int var2 = 0; var2 < this.field1335; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1334 - 1 == var1 || this.field1335 - 1 == var2) {
                    this.field1336[var1][var2] = 16777215;
                } else {
                    this.field1336[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIZZII)V")
    public void method484(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field1332;
        int var8 = arg5 - this.field1333;
        if (arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method487(var7, var8, 128);
                this.method487(var7 - 1, var8, 8);
            }
            if (arg1 == 1) {
                this.method487(var7, var8, 2);
                this.method487(var7, var8 + 1, 32);
            }
            if (arg1 == 2) {
                this.method487(var7, var8, 8);
                this.method487(var7 + 1, var8, 128);
            }
            if (arg1 == 3) {
                this.method487(var7, var8, 32);
                this.method487(var7, var8 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method487(var7, var8, 1);
                this.method487(var7 - 1, var8 + 1, 16);
            }
            if (arg1 == 1) {
                this.method487(var7, var8, 4);
                this.method487(var7 + 1, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method487(var7, var8, 16);
                this.method487(var7 + 1, var8 - 1, 1);
            }
            if (arg1 == 3) {
                this.method487(var7, var8, 64);
                this.method487(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method487(var7, var8, 130);
                this.method487(var7 - 1, var8, 8);
                this.method487(var7, var8 + 1, 32);
            }
            if (arg1 == 1) {
                this.method487(var7, var8, 10);
                this.method487(var7, var8 + 1, 32);
                this.method487(var7 + 1, var8, 128);
            }
            if (arg1 == 2) {
                this.method487(var7, var8, 40);
                this.method487(var7 + 1, var8, 128);
                this.method487(var7, var8 - 1, 2);
            }
            if (arg1 == 3) {
                this.method487(var7, var8, 160);
                this.method487(var7, var8 - 1, 2);
                this.method487(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method487(var7, var8, 65536);
                this.method487(var7 - 1, var8, 4096);
            }
            if (arg1 == 1) {
                this.method487(var7, var8, 1024);
                this.method487(var7, var8 + 1, 16384);
            }
            if (arg1 == 2) {
                this.method487(var7, var8, 4096);
                this.method487(var7 + 1, var8, 65536);
            }
            if (arg1 == 3) {
                this.method487(var7, var8, 16384);
                this.method487(var7, var8 - 1, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method487(var7, var8, 512);
                this.method487(var7 - 1, var8 + 1, 8192);
            }
            if (arg1 == 1) {
                this.method487(var7, var8, 2048);
                this.method487(var7 + 1, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method487(var7, var8, 8192);
                this.method487(var7 + 1, var8 - 1, 512);
            }
            if (arg1 == 3) {
                this.method487(var7, var8, 32768);
                this.method487(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method487(var7, var8, 66560);
            this.method487(var7 - 1, var8, 4096);
            this.method487(var7, var8 + 1, 16384);
        }
        if (arg1 == 1) {
            this.method487(var7, var8, 5120);
            this.method487(var7, var8 + 1, 16384);
            this.method487(var7 + 1, var8, 65536);
        }
        if (arg1 == 2) {
            this.method487(var7, var8, 20480);
            this.method487(var7 + 1, var8, 65536);
            this.method487(var7, var8 - 1, 1024);
        }
        if (arg1 == 3) {
            this.method487(var7, var8, 81920);
            this.method487(var7, var8 - 1, 1024);
            this.method487(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIZIIII)V")
    public void method485(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field1332;
        int var10 = arg5 - this.field1333;
        if (arg6 != 0) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg1;
            arg1 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1334) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1335) {
                        this.method487(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IZI)V")
    public void method486(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field1332;
        int var5 = arg2 - this.field1333;
        if (!arg1) {
            this.field1336[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(III)V")
    private void method487(int arg0, int arg1, int arg2) {
        this.field1336[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIIZII)V")
    public void method488(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 != 0) {
            return;
        }
        int var7 = arg1 - this.field1332;
        int var8 = arg2 - this.field1333;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method490(0, var7, var8, 128);
                this.method490(0, var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method490(0, var7, var8, 2);
                this.method490(0, var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method490(0, var7, var8, 8);
                this.method490(0, var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method490(0, var7, var8, 32);
                this.method490(0, var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method490(0, var7, var8, 1);
                this.method490(0, var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method490(0, var7, var8, 4);
                this.method490(0, var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method490(0, var7, var8, 16);
                this.method490(0, var7 + 1, var8 - 1, 1);
            }
            if (arg5 == 3) {
                this.method490(0, var7, var8, 64);
                this.method490(0, var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method490(0, var7, var8, 130);
                this.method490(0, var7 - 1, var8, 8);
                this.method490(0, var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method490(0, var7, var8, 10);
                this.method490(0, var7, var8 + 1, 32);
                this.method490(0, var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method490(0, var7, var8, 40);
                this.method490(0, var7 + 1, var8, 128);
                this.method490(0, var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method490(0, var7, var8, 160);
                this.method490(0, var7, var8 - 1, 2);
                this.method490(0, var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method490(0, var7, var8, 65536);
                this.method490(0, var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method490(0, var7, var8, 1024);
                this.method490(0, var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method490(0, var7, var8, 4096);
                this.method490(0, var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method490(0, var7, var8, 16384);
                this.method490(0, var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method490(0, var7, var8, 512);
                this.method490(0, var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method490(0, var7, var8, 2048);
                this.method490(0, var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method490(0, var7, var8, 8192);
                this.method490(0, var7 + 1, var8 - 1, 512);
            }
            if (arg5 == 3) {
                this.method490(0, var7, var8, 32768);
                this.method490(0, var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method490(0, var7, var8, 66560);
            this.method490(0, var7 - 1, var8, 4096);
            this.method490(0, var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method490(0, var7, var8, 5120);
            this.method490(0, var7, var8 + 1, 16384);
            this.method490(0, var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method490(0, var7, var8, 20480);
            this.method490(0, var7 + 1, var8, 65536);
            this.method490(0, var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method490(0, var7, var8, 81920);
            this.method490(0, var7, var8 - 1, 1024);
            this.method490(0, var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIBIIIZ)V")
    public void method489(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg5 - this.field1332;
        int var10 = arg4 - this.field1333;
        if (arg2 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg1;
            arg1 = arg0;
            arg0 = var12;
        }
        for (int var13 = var9; var13 < arg1 + var9; var13++) {
            if (var13 >= 0 && var13 < this.field1334) {
                for (int var14 = var10; var14 < arg0 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field1335) {
                        this.method490(0, var13, var14, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIII)V")
    private void method490(int arg0, int arg1, int arg2, int arg3) {
        this.field1336[arg1][arg2] &= 16777215 - arg3;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "b", descriptor = "(IZI)V")
    public void method491(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field1332;
        int var5 = arg2 - this.field1333;
        this.field1336[var4][var5] &= 0xDFFFFF;
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIIIIIZ)Z")
    public boolean method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 == arg5 && arg3 == arg4) {
            return true;
        }
        int var8 = arg5 - this.field1332;
        int var9 = arg4 - this.field1333;
        int var10 = arg0 - this.field1332;
        if (arg6) {
            throw new NullPointerException();
        }
        int var11 = arg3 - this.field1333;
        if (arg2 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1336[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1336[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1336[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1336[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1336[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1336[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1336[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1336[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1336[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1336[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1336[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(ZIIIIII)Z")
    public boolean method493(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg4 && arg3 == arg6) {
            return true;
        }
        int var8 = arg4 - this.field1332;
        int var9 = arg6 - this.field1333;
        int var10 = arg2 - this.field1332;
        if (arg0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg3 - this.field1333;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field1336[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1336[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1336[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 - 1 == var9 && (this.field1336[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var12 && (this.field1336[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1336[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 + 1 == var8 && var9 == var12 && (this.field1336[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var12 + 1 == var9 && (this.field1336[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var8 == var10 && var12 + 1 == var9 && (this.field1336[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var12 - 1 == var9 && (this.field1336[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var12 && (this.field1336[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var12 && (this.field1336[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        int var9 = arg3 + arg6 - 1;
        int var10 = arg0 + arg5 - 1;
        if (arg4 >= arg6 && arg4 <= var9 && arg2 >= arg5 && arg2 <= var10) {
            return true;
        } else if (arg6 - 1 == arg4 && arg2 >= arg5 && arg2 <= var10 && (this.field1336[arg4 - this.field1332][arg2 - this.field1333] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg2 >= arg5 && arg2 <= var10 && (this.field1336[arg4 - this.field1332][arg2 - this.field1333] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg2 && arg4 >= arg6 && arg4 <= var9 && (this.field1336[arg4 - this.field1332][arg2 - this.field1333] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg4 >= arg6 && arg4 <= var9 && (this.field1336[arg4 - this.field1332][arg2 - this.field1333] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }
}
