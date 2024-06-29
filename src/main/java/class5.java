import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CRVZDSLK")
public class class5 {

    @OriginalMember(owner = "client!CRVZDSLK", name = "b", descriptor = "I")
    private int field562 = 8;

    @OriginalMember(owner = "client!CRVZDSLK", name = "c", descriptor = "I")
    private int field563 = 4;

    @OriginalMember(owner = "client!CRVZDSLK", name = "d", descriptor = "Z")
    private boolean field564 = false;

    @OriginalMember(owner = "client!CRVZDSLK", name = "e", descriptor = "I")
    private int field565 = -610;

    @OriginalMember(owner = "client!CRVZDSLK", name = "f", descriptor = "I")
    private int field566 = -205;

    @OriginalMember(owner = "client!CRVZDSLK", name = "g", descriptor = "Z")
    private boolean field567 = false;

    @OriginalMember(owner = "client!CRVZDSLK", name = "h", descriptor = "I")
    private int field568 = 964;

    @OriginalMember(owner = "client!CRVZDSLK", name = "i", descriptor = "Z")
    private boolean field569 = false;

    @OriginalMember(owner = "client!CRVZDSLK", name = "j", descriptor = "Z")
    private boolean field570 = true;

    @OriginalMember(owner = "client!CRVZDSLK", name = "k", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!CRVZDSLK", name = "l", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!CRVZDSLK", name = "m", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!CRVZDSLK", name = "n", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!CRVZDSLK", name = "o", descriptor = "[[I")
    public int[][] field575;

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!CRVZDSLK", name = "<init>", descriptor = "(ZII)V")
    public class5(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.field571 = 0;
        this.field572 = 0;
        this.field573 = arg2;
        this.field574 = arg1;
        this.field575 = new int[this.field573][this.field574];
        this.method157();
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "()V")
    public void method157() {
        for (int var1 = 0; var1 < this.field573; var1++) {
            for (int var2 = 0; var2 < this.field574; var2++) {
                if (var1 == 0 || var2 == 0 || this.field573 - 1 == var1 || this.field574 - 1 == var2) {
                    this.field575[var1][var2] = 16777215;
                } else {
                    this.field575[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IZBIII)V")
    public void method158(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 41) {
            this.field568 = 361;
        }
        int var7 = arg5 - this.field571;
        int var8 = arg3 - this.field572;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method161(var7, var8, 128);
                this.method161(var7 - 1, var8, 8);
            }
            if (arg0 == 1) {
                this.method161(var7, var8, 2);
                this.method161(var7, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method161(var7, var8, 8);
                this.method161(var7 + 1, var8, 128);
            }
            if (arg0 == 3) {
                this.method161(var7, var8, 32);
                this.method161(var7, var8 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method161(var7, var8, 1);
                this.method161(var7 - 1, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method161(var7, var8, 4);
                this.method161(var7 + 1, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method161(var7, var8, 16);
                this.method161(var7 + 1, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method161(var7, var8, 64);
                this.method161(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method161(var7, var8, 130);
                this.method161(var7 - 1, var8, 8);
                this.method161(var7, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method161(var7, var8, 10);
                this.method161(var7, var8 + 1, 32);
                this.method161(var7 + 1, var8, 128);
            }
            if (arg0 == 2) {
                this.method161(var7, var8, 40);
                this.method161(var7 + 1, var8, 128);
                this.method161(var7, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method161(var7, var8, 160);
                this.method161(var7, var8 - 1, 2);
                this.method161(var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method161(var7, var8, 65536);
                this.method161(var7 - 1, var8, 4096);
            }
            if (arg0 == 1) {
                this.method161(var7, var8, 1024);
                this.method161(var7, var8 + 1, 16384);
            }
            if (arg0 == 2) {
                this.method161(var7, var8, 4096);
                this.method161(var7 + 1, var8, 65536);
            }
            if (arg0 == 3) {
                this.method161(var7, var8, 16384);
                this.method161(var7, var8 - 1, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method161(var7, var8, 512);
                this.method161(var7 - 1, var8 + 1, 8192);
            }
            if (arg0 == 1) {
                this.method161(var7, var8, 2048);
                this.method161(var7 + 1, var8 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method161(var7, var8, 8192);
                this.method161(var7 + 1, var8 - 1, 512);
            }
            if (arg0 == 3) {
                this.method161(var7, var8, 32768);
                this.method161(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method161(var7, var8, 66560);
            this.method161(var7 - 1, var8, 4096);
            this.method161(var7, var8 + 1, 16384);
        }
        if (arg0 == 1) {
            this.method161(var7, var8, 5120);
            this.method161(var7, var8 + 1, 16384);
            this.method161(var7 + 1, var8, 65536);
        }
        if (arg0 == 2) {
            this.method161(var7, var8, 20480);
            this.method161(var7 + 1, var8, 65536);
            this.method161(var7, var8 - 1, 1024);
        }
        if (arg0 == 3) {
            this.method161(var7, var8, 81920);
            this.method161(var7, var8 - 1, 1024);
            this.method161(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIIIIZI)V")
    public void method159(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field571;
        int var10 = arg6 - this.field572;
        if (arg3 != 0) {
            this.field569 = !this.field569;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg2;
            arg2 = arg4;
            arg4 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field573) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field574) {
                        this.method161(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(III)V")
    public void method160(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field571;
        int var5 = arg2 - this.field572;
        if (arg1 >= this.field563 && arg1 <= this.field563) {
            this.field575[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "b", descriptor = "(III)V")
    private void method161(int arg0, int arg1, int arg2) {
        this.field575[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(ZIZIII)V")
    public void method162(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field571;
        if (arg2) {
            this.field570 = !this.field570;
        }
        int var8 = arg1 - this.field572;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method164(var7, 128, this.field564, var8);
                this.method164(var7 - 1, 8, this.field564, var8);
            }
            if (arg3 == 1) {
                this.method164(var7, 2, this.field564, var8);
                this.method164(var7, 32, this.field564, var8 + 1);
            }
            if (arg3 == 2) {
                this.method164(var7, 8, this.field564, var8);
                this.method164(var7 + 1, 128, this.field564, var8);
            }
            if (arg3 == 3) {
                this.method164(var7, 32, this.field564, var8);
                this.method164(var7, 2, this.field564, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method164(var7, 1, this.field564, var8);
                this.method164(var7 - 1, 16, this.field564, var8 + 1);
            }
            if (arg3 == 1) {
                this.method164(var7, 4, this.field564, var8);
                this.method164(var7 + 1, 64, this.field564, var8 + 1);
            }
            if (arg3 == 2) {
                this.method164(var7, 16, this.field564, var8);
                this.method164(var7 + 1, 1, this.field564, var8 - 1);
            }
            if (arg3 == 3) {
                this.method164(var7, 64, this.field564, var8);
                this.method164(var7 - 1, 4, this.field564, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method164(var7, 130, this.field564, var8);
                this.method164(var7 - 1, 8, this.field564, var8);
                this.method164(var7, 32, this.field564, var8 + 1);
            }
            if (arg3 == 1) {
                this.method164(var7, 10, this.field564, var8);
                this.method164(var7, 32, this.field564, var8 + 1);
                this.method164(var7 + 1, 128, this.field564, var8);
            }
            if (arg3 == 2) {
                this.method164(var7, 40, this.field564, var8);
                this.method164(var7 + 1, 128, this.field564, var8);
                this.method164(var7, 2, this.field564, var8 - 1);
            }
            if (arg3 == 3) {
                this.method164(var7, 160, this.field564, var8);
                this.method164(var7, 2, this.field564, var8 - 1);
                this.method164(var7 - 1, 8, this.field564, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method164(var7, 65536, this.field564, var8);
                this.method164(var7 - 1, 4096, this.field564, var8);
            }
            if (arg3 == 1) {
                this.method164(var7, 1024, this.field564, var8);
                this.method164(var7, 16384, this.field564, var8 + 1);
            }
            if (arg3 == 2) {
                this.method164(var7, 4096, this.field564, var8);
                this.method164(var7 + 1, 65536, this.field564, var8);
            }
            if (arg3 == 3) {
                this.method164(var7, 16384, this.field564, var8);
                this.method164(var7, 1024, this.field564, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method164(var7, 512, this.field564, var8);
                this.method164(var7 - 1, 8192, this.field564, var8 + 1);
            }
            if (arg3 == 1) {
                this.method164(var7, 2048, this.field564, var8);
                this.method164(var7 + 1, 32768, this.field564, var8 + 1);
            }
            if (arg3 == 2) {
                this.method164(var7, 8192, this.field564, var8);
                this.method164(var7 + 1, 512, this.field564, var8 - 1);
            }
            if (arg3 == 3) {
                this.method164(var7, 32768, this.field564, var8);
                this.method164(var7 - 1, 2048, this.field564, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method164(var7, 66560, this.field564, var8);
            this.method164(var7 - 1, 4096, this.field564, var8);
            this.method164(var7, 16384, this.field564, var8 + 1);
        }
        if (arg3 == 1) {
            this.method164(var7, 5120, this.field564, var8);
            this.method164(var7, 16384, this.field564, var8 + 1);
            this.method164(var7 + 1, 65536, this.field564, var8);
        }
        if (arg3 == 2) {
            this.method164(var7, 20480, this.field564, var8);
            this.method164(var7 + 1, 65536, this.field564, var8);
            this.method164(var7, 1024, this.field564, var8 - 1);
        }
        if (arg3 == 3) {
            this.method164(var7, 81920, this.field564, var8);
            this.method164(var7, 1024, this.field564, var8 - 1);
            this.method164(var7 - 1, 4096, this.field564, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IZIIIII)V")
    public void method163(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            this.field562 = 65;
        }
        int var8 = 256;
        if (arg1) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field571;
        int var10 = arg0 - this.field572;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg5;
            arg5 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg5 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field573) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field574) {
                        this.method164(var12, var8, this.field564, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIZI)V")
    private void method164(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field570 = !this.field570;
        }
        this.field575[arg0][arg3] &= 16777215 - arg1;
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "c", descriptor = "(III)V")
    public void method165(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field571;
        int var5 = arg0 - this.field572;
        this.field575[var4][var5] &= 0xDFFFFF;
        if (arg1 >= 0) {
            this.field561 = -345;
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= 0) {
            throw new NullPointerException();
        } else if (arg2 == arg5 && arg0 == arg4) {
            return true;
        } else {
            int var8 = arg2 - this.field571;
            int var9 = arg4 - this.field572;
            int var10 = arg5 - this.field571;
            int var11 = arg0 - this.field572;
            if (arg6 == 0) {
                if (arg1 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x1280120) == 0) {
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
                    if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            throw new NullPointerException();
        } else if (arg0 == arg4 && arg2 == arg5) {
            return true;
        } else {
            int var8 = arg0 - this.field571;
            int var9 = arg5 - this.field572;
            int var10 = arg4 - this.field571;
            int var11 = arg2 - this.field572;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field575[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field575[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field575[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIIIBIII)Z")
    public boolean method168(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg6 - 1;
        int var10 = arg2 + arg7 - 1;
        if (arg4 != 1) {
            this.field563 = -135;
        }
        if (arg1 >= arg3 && arg1 <= var9 && arg0 >= arg2 && arg0 <= var10) {
            return true;
        } else if (arg3 - 1 == arg1 && arg0 >= arg2 && arg0 <= var10 && (this.field575[arg1 - this.field571][arg0 - this.field572] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg1 && arg0 >= arg2 && arg0 <= var10 && (this.field575[arg1 - this.field571][arg0 - this.field572] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field575[arg1 - this.field571][arg0 - this.field572] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field575[arg1 - this.field571][arg0 - this.field572] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }
}
