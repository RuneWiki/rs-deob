import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OXMJPDWD")
public class class41 {

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "I")
    private int field1180 = 8;

    @OriginalMember(owner = "client!OXMJPDWD", name = "b", descriptor = "Z")
    private boolean field1181 = true;

    @OriginalMember(owner = "client!OXMJPDWD", name = "c", descriptor = "I")
    private int field1182 = -653;

    @OriginalMember(owner = "client!OXMJPDWD", name = "d", descriptor = "Z")
    private boolean field1183 = true;

    @OriginalMember(owner = "client!OXMJPDWD", name = "e", descriptor = "Z")
    private boolean field1184 = true;

    @OriginalMember(owner = "client!OXMJPDWD", name = "f", descriptor = "Z")
    private boolean field1185 = false;

    @OriginalMember(owner = "client!OXMJPDWD", name = "g", descriptor = "I")
    private int field1186 = 2;

    @OriginalMember(owner = "client!OXMJPDWD", name = "h", descriptor = "Z")
    private boolean field1187 = true;

    @OriginalMember(owner = "client!OXMJPDWD", name = "i", descriptor = "B")
    private byte field1188 = 0;

    @OriginalMember(owner = "client!OXMJPDWD", name = "j", descriptor = "I")
    public int field1189 = 0;

    @OriginalMember(owner = "client!OXMJPDWD", name = "k", descriptor = "I")
    public int field1190 = 0;

    @OriginalMember(owner = "client!OXMJPDWD", name = "l", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!OXMJPDWD", name = "m", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!OXMJPDWD", name = "n", descriptor = "[[I")
    public int[][] field1193;

    @OriginalMember(owner = "client!OXMJPDWD", name = "<init>", descriptor = "(III)V")
    public class41(int arg0, int arg1, int arg2) {
        this.field1191 = arg2;
        int var4 = 4 / arg0;
        this.field1192 = arg1;
        this.field1193 = new int[this.field1191][this.field1192];
        this.method380();
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "()V")
    public void method380() {
        for (int var1 = 0; var1 < this.field1191; var1++) {
            for (int var2 = 0; var2 < this.field1192; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1191 - 1 == var1 || this.field1192 - 1 == var2) {
                    this.field1193[var1][var2] = 16777215;
                } else {
                    this.field1193[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIIZII)V")
    public void method381(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1189;
        if (arg1 <= 0) {
            return;
        }
        int var8 = arg2 - this.field1190;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method384(var7, var8, 128);
                this.method384(var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method384(var7, var8, 2);
                this.method384(var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method384(var7, var8, 8);
                this.method384(var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method384(var7, var8, 32);
                this.method384(var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method384(var7, var8, 1);
                this.method384(var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method384(var7, var8, 4);
                this.method384(var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method384(var7, var8, 16);
                this.method384(var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method384(var7, var8, 64);
                this.method384(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method384(var7, var8, 130);
                this.method384(var7 - 1, var8, 8);
                this.method384(var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method384(var7, var8, 10);
                this.method384(var7, var8 + 1, 32);
                this.method384(var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method384(var7, var8, 40);
                this.method384(var7 + 1, var8, 128);
                this.method384(var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method384(var7, var8, 160);
                this.method384(var7, var8 - 1, 2);
                this.method384(var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method384(var7, var8, 65536);
                this.method384(var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method384(var7, var8, 1024);
                this.method384(var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method384(var7, var8, 4096);
                this.method384(var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method384(var7, var8, 16384);
                this.method384(var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method384(var7, var8, 512);
                this.method384(var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method384(var7, var8, 2048);
                this.method384(var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method384(var7, var8, 8192);
                this.method384(var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method384(var7, var8, 32768);
                this.method384(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method384(var7, var8, 66560);
            this.method384(var7 - 1, var8, 4096);
            this.method384(var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method384(var7, var8, 5120);
            this.method384(var7, var8 + 1, 16384);
            this.method384(var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method384(var7, var8, 20480);
            this.method384(var7 + 1, var8, 65536);
            this.method384(var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method384(var7, var8, 81920);
            this.method384(var7, var8 - 1, 1024);
            this.method384(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIIIIZI)V")
    public void method382(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg6 - this.field1189;
        if (arg1 != 6) {
            this.field1182 = 9;
        }
        int var10 = arg0 - this.field1190;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1191) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1192) {
                        this.method384(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(III)V")
    public void method383(int arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            int var4 = arg1 - this.field1189;
            int var5 = arg0 - this.field1190;
            this.field1193[var4][var5] |= 0x200000;
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "b", descriptor = "(III)V")
    private void method384(int arg0, int arg1, int arg2) {
        this.field1193[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IZIIIZ)V")
    public void method385(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field1189;
        int var8 = arg2 - this.field1190;
        if (arg5) {
            this.field1185 = !this.field1185;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method387(true, var8, var7, 128);
                this.method387(true, var8, var7 - 1, 8);
            }
            if (arg0 == 1) {
                this.method387(true, var8, var7, 2);
                this.method387(true, var8 + 1, var7, 32);
            }
            if (arg0 == 2) {
                this.method387(true, var8, var7, 8);
                this.method387(true, var8, var7 + 1, 128);
            }
            if (arg0 == 3) {
                this.method387(true, var8, var7, 32);
                this.method387(true, var8 - 1, var7, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method387(true, var8, var7, 1);
                this.method387(true, var8 + 1, var7 - 1, 16);
            }
            if (arg0 == 1) {
                this.method387(true, var8, var7, 4);
                this.method387(true, var8 + 1, var7 + 1, 64);
            }
            if (arg0 == 2) {
                this.method387(true, var8, var7, 16);
                this.method387(true, var8 - 1, var7 + 1, 1);
            }
            if (arg0 == 3) {
                this.method387(true, var8, var7, 64);
                this.method387(true, var8 - 1, var7 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method387(true, var8, var7, 130);
                this.method387(true, var8, var7 - 1, 8);
                this.method387(true, var8 + 1, var7, 32);
            }
            if (arg0 == 1) {
                this.method387(true, var8, var7, 10);
                this.method387(true, var8 + 1, var7, 32);
                this.method387(true, var8, var7 + 1, 128);
            }
            if (arg0 == 2) {
                this.method387(true, var8, var7, 40);
                this.method387(true, var8, var7 + 1, 128);
                this.method387(true, var8 - 1, var7, 2);
            }
            if (arg0 == 3) {
                this.method387(true, var8, var7, 160);
                this.method387(true, var8 - 1, var7, 2);
                this.method387(true, var8, var7 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method387(true, var8, var7, 65536);
                this.method387(true, var8, var7 - 1, 4096);
            }
            if (arg0 == 1) {
                this.method387(true, var8, var7, 1024);
                this.method387(true, var8 + 1, var7, 16384);
            }
            if (arg0 == 2) {
                this.method387(true, var8, var7, 4096);
                this.method387(true, var8, var7 + 1, 65536);
            }
            if (arg0 == 3) {
                this.method387(true, var8, var7, 16384);
                this.method387(true, var8 - 1, var7, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method387(true, var8, var7, 512);
                this.method387(true, var8 + 1, var7 - 1, 8192);
            }
            if (arg0 == 1) {
                this.method387(true, var8, var7, 2048);
                this.method387(true, var8 + 1, var7 + 1, 32768);
            }
            if (arg0 == 2) {
                this.method387(true, var8, var7, 8192);
                this.method387(true, var8 - 1, var7 + 1, 512);
            }
            if (arg0 == 3) {
                this.method387(true, var8, var7, 32768);
                this.method387(true, var8 - 1, var7 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method387(true, var8, var7, 66560);
            this.method387(true, var8, var7 - 1, 4096);
            this.method387(true, var8 + 1, var7, 16384);
        }
        if (arg0 == 1) {
            this.method387(true, var8, var7, 5120);
            this.method387(true, var8 + 1, var7, 16384);
            this.method387(true, var8, var7 + 1, 65536);
        }
        if (arg0 == 2) {
            this.method387(true, var8, var7, 20480);
            this.method387(true, var8, var7 + 1, 65536);
            this.method387(true, var8 - 1, var7, 1024);
        }
        if (arg0 == 3) {
            this.method387(true, var8, var7, 81920);
            this.method387(true, var8 - 1, var7, 1024);
            this.method387(true, var8, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIZIIIZ)V")
    public void method386(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1189;
        int var10 = arg3 - this.field1190;
        if (arg6) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg4;
            arg4 = arg5;
            arg5 = var11;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1191) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1192) {
                        this.method387(true, var13, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(ZIII)V")
    private void method387(boolean arg0, int arg1, int arg2, int arg3) {
        this.field1193[arg2][arg1] &= 16777215 - arg3;
        if (!arg0) {
            this.field1185 = !this.field1185;
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(ZII)V")
    public void method388(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1189;
        int var5 = arg2 - this.field1190;
        if (arg0) {
            this.field1193[var4][var5] &= 0xDFFFFF;
        }
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == arg3 && arg1 == arg4) {
            return true;
        }
        int var8 = arg0 - this.field1189;
        int var9 = arg4 - this.field1190;
        int var10 = arg3 - this.field1189;
        int var11 = arg1 - this.field1190;
        if (arg5 != 45022) {
            this.field1185 = !this.field1185;
        }
        if (arg6 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field1189;
        int var9 = arg3 - this.field1190;
        int var10 = arg2 - this.field1189;
        while (arg5 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var11 = arg1 - this.field1190;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1193[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1193[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1193[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIZIIIII)Z")
    public boolean method391(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            this.field1180 = 288;
        }
        int var9 = arg0 + arg4 - 1;
        int var10 = arg3 + arg6 - 1;
        if (arg7 >= arg0 && arg7 <= var9 && arg5 >= arg3 && arg5 <= var10) {
            return true;
        } else if (arg0 - 1 == arg7 && arg5 >= arg3 && arg5 <= var10 && (this.field1193[arg7 - this.field1189][arg5 - this.field1190] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg5 >= arg3 && arg5 <= var10 && (this.field1193[arg7 - this.field1189][arg5 - this.field1190] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg5 && arg7 >= arg0 && arg7 <= var9 && (this.field1193[arg7 - this.field1189][arg5 - this.field1190] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg5 && arg7 >= arg0 && arg7 <= var9 && (this.field1193[arg7 - this.field1189][arg5 - this.field1190] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }
}
