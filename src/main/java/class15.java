import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EOSBSGLH")
public class class15 {

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "I")
    private int field748 = 7;

    @OriginalMember(owner = "client!EOSBSGLH", name = "b", descriptor = "Z")
    private boolean field749 = true;

    @OriginalMember(owner = "client!EOSBSGLH", name = "c", descriptor = "Z")
    private boolean field750 = false;

    @OriginalMember(owner = "client!EOSBSGLH", name = "d", descriptor = "I")
    private int field751 = -877;

    @OriginalMember(owner = "client!EOSBSGLH", name = "e", descriptor = "B")
    private byte field752 = 6;

    @OriginalMember(owner = "client!EOSBSGLH", name = "f", descriptor = "I")
    private int field753 = 188;

    @OriginalMember(owner = "client!EOSBSGLH", name = "g", descriptor = "Z")
    private boolean field754 = true;

    @OriginalMember(owner = "client!EOSBSGLH", name = "h", descriptor = "I")
    private int field755 = 15536;

    @OriginalMember(owner = "client!EOSBSGLH", name = "i", descriptor = "I")
    public int field756 = 0;

    @OriginalMember(owner = "client!EOSBSGLH", name = "j", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!EOSBSGLH", name = "k", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!EOSBSGLH", name = "l", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!EOSBSGLH", name = "m", descriptor = "[[I")
    public int[][] field760;

    @OriginalMember(owner = "client!EOSBSGLH", name = "<init>", descriptor = "(IIB)V")
    public class15(int arg0, int arg1, byte arg2) {
        if (this.field752 != arg2) {
            this.field749 = !this.field749;
        }
        this.field757 = 0;
        this.field758 = arg0;
        this.field759 = arg1;
        this.field760 = new int[this.field758][this.field759];
        this.method202();
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "()V")
    public void method202() {
        for (int var1 = 0; var1 < this.field758; var1++) {
            for (int var2 = 0; var2 < this.field759; var2++) {
                if (var1 == 0 || var2 == 0 || this.field758 - 1 == var1 || this.field759 - 1 == var2) {
                    this.field760[var1][var2] = 16777215;
                } else {
                    this.field760[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(ZIIIIZ)V")
    public void method203(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1 - this.field756;
        int var8 = arg3 - this.field757;
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method206(var7, var8, 128);
                this.method206(var7 - 1, var8, 8);
            }
            if (arg2 == 1) {
                this.method206(var7, var8, 2);
                this.method206(var7, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method206(var7, var8, 8);
                this.method206(var7 + 1, var8, 128);
            }
            if (arg2 == 3) {
                this.method206(var7, var8, 32);
                this.method206(var7, var8 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method206(var7, var8, 1);
                this.method206(var7 - 1, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method206(var7, var8, 4);
                this.method206(var7 + 1, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method206(var7, var8, 16);
                this.method206(var7 + 1, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method206(var7, var8, 64);
                this.method206(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method206(var7, var8, 130);
                this.method206(var7 - 1, var8, 8);
                this.method206(var7, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method206(var7, var8, 10);
                this.method206(var7, var8 + 1, 32);
                this.method206(var7 + 1, var8, 128);
            }
            if (arg2 == 2) {
                this.method206(var7, var8, 40);
                this.method206(var7 + 1, var8, 128);
                this.method206(var7, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method206(var7, var8, 160);
                this.method206(var7, var8 - 1, 2);
                this.method206(var7 - 1, var8, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method206(var7, var8, 65536);
                this.method206(var7 - 1, var8, 4096);
            }
            if (arg2 == 1) {
                this.method206(var7, var8, 1024);
                this.method206(var7, var8 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method206(var7, var8, 4096);
                this.method206(var7 + 1, var8, 65536);
            }
            if (arg2 == 3) {
                this.method206(var7, var8, 16384);
                this.method206(var7, var8 - 1, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method206(var7, var8, 512);
                this.method206(var7 - 1, var8 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method206(var7, var8, 2048);
                this.method206(var7 + 1, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method206(var7, var8, 8192);
                this.method206(var7 + 1, var8 - 1, 512);
            }
            if (arg2 == 3) {
                this.method206(var7, var8, 32768);
                this.method206(var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method206(var7, var8, 66560);
            this.method206(var7 - 1, var8, 4096);
            this.method206(var7, var8 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method206(var7, var8, 5120);
            this.method206(var7, var8 + 1, 16384);
            this.method206(var7 + 1, var8, 65536);
        }
        if (arg2 == 2) {
            this.method206(var7, var8, 20480);
            this.method206(var7 + 1, var8, 65536);
            this.method206(var7, var8 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method206(var7, var8, 81920);
            this.method206(var7, var8 - 1, 1024);
            this.method206(var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIZI)V")
    public void method204(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field756;
        int var10 = arg1 - this.field757;
        if (arg3 != -7465) {
            return;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg0;
            arg0 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field758) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field759) {
                        this.method206(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(III)V")
    public void method205(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field756;
        int var5 = arg1 - this.field757;
        this.field760[var4][var5] |= 0x200000;
        if (arg2 != 0) {
            this.field751 = 92;
        }
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "b", descriptor = "(III)V")
    private void method206(int arg0, int arg1, int arg2) {
        this.field760[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIZIII)V")
    public void method207(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field756;
        if (arg4 <= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg0 - this.field757;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method209(128, var7, (byte) -119, var9);
                this.method209(8, var7 - 1, (byte) -119, var9);
            }
            if (arg5 == 1) {
                this.method209(2, var7, (byte) -119, var9);
                this.method209(32, var7, (byte) -119, var9 + 1);
            }
            if (arg5 == 2) {
                this.method209(8, var7, (byte) -119, var9);
                this.method209(128, var7 + 1, (byte) -119, var9);
            }
            if (arg5 == 3) {
                this.method209(32, var7, (byte) -119, var9);
                this.method209(2, var7, (byte) -119, var9 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method209(1, var7, (byte) -119, var9);
                this.method209(16, var7 - 1, (byte) -119, var9 + 1);
            }
            if (arg5 == 1) {
                this.method209(4, var7, (byte) -119, var9);
                this.method209(64, var7 + 1, (byte) -119, var9 + 1);
            }
            if (arg5 == 2) {
                this.method209(16, var7, (byte) -119, var9);
                this.method209(1, var7 + 1, (byte) -119, var9 - 1);
            }
            if (arg5 == 3) {
                this.method209(64, var7, (byte) -119, var9);
                this.method209(4, var7 - 1, (byte) -119, var9 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method209(130, var7, (byte) -119, var9);
                this.method209(8, var7 - 1, (byte) -119, var9);
                this.method209(32, var7, (byte) -119, var9 + 1);
            }
            if (arg5 == 1) {
                this.method209(10, var7, (byte) -119, var9);
                this.method209(32, var7, (byte) -119, var9 + 1);
                this.method209(128, var7 + 1, (byte) -119, var9);
            }
            if (arg5 == 2) {
                this.method209(40, var7, (byte) -119, var9);
                this.method209(128, var7 + 1, (byte) -119, var9);
                this.method209(2, var7, (byte) -119, var9 - 1);
            }
            if (arg5 == 3) {
                this.method209(160, var7, (byte) -119, var9);
                this.method209(2, var7, (byte) -119, var9 - 1);
                this.method209(8, var7 - 1, (byte) -119, var9);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method209(65536, var7, (byte) -119, var9);
                this.method209(4096, var7 - 1, (byte) -119, var9);
            }
            if (arg5 == 1) {
                this.method209(1024, var7, (byte) -119, var9);
                this.method209(16384, var7, (byte) -119, var9 + 1);
            }
            if (arg5 == 2) {
                this.method209(4096, var7, (byte) -119, var9);
                this.method209(65536, var7 + 1, (byte) -119, var9);
            }
            if (arg5 == 3) {
                this.method209(16384, var7, (byte) -119, var9);
                this.method209(1024, var7, (byte) -119, var9 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method209(512, var7, (byte) -119, var9);
                this.method209(8192, var7 - 1, (byte) -119, var9 + 1);
            }
            if (arg5 == 1) {
                this.method209(2048, var7, (byte) -119, var9);
                this.method209(32768, var7 + 1, (byte) -119, var9 + 1);
            }
            if (arg5 == 2) {
                this.method209(8192, var7, (byte) -119, var9);
                this.method209(512, var7 + 1, (byte) -119, var9 - 1);
            }
            if (arg5 == 3) {
                this.method209(32768, var7, (byte) -119, var9);
                this.method209(2048, var7 - 1, (byte) -119, var9 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method209(66560, var7, (byte) -119, var9);
            this.method209(4096, var7 - 1, (byte) -119, var9);
            this.method209(16384, var7, (byte) -119, var9 + 1);
        }
        if (arg5 == 1) {
            this.method209(5120, var7, (byte) -119, var9);
            this.method209(16384, var7, (byte) -119, var9 + 1);
            this.method209(65536, var7 + 1, (byte) -119, var9);
        }
        if (arg5 == 2) {
            this.method209(20480, var7, (byte) -119, var9);
            this.method209(65536, var7 + 1, (byte) -119, var9);
            this.method209(1024, var7, (byte) -119, var9 - 1);
        }
        if (arg5 == 3) {
            this.method209(81920, var7, (byte) -119, var9);
            this.method209(1024, var7, (byte) -119, var9 - 1);
            this.method209(4096, var7 - 1, (byte) -119, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIIZ)V")
    public void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field756;
        int var10 = arg3 - this.field757;
        if (arg1 <= 0) {
            this.field753 = -358;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg0;
            arg0 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field758) {
                for (int var13 = var10; var13 < arg2 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field759) {
                        this.method209(var8, var12, (byte) -119, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIBI)V")
    private void method209(int arg0, int arg1, byte arg2, int arg3) {
        this.field760[arg1][arg3] &= 16777215 - arg0;
        if (arg2 != -119) {
            this.field755 = 139;
        }
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IBI)V")
    public void method210(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field756;
        if (arg1 != 64) {
            this.field753 = -490;
        }
        int var5 = arg2 - this.field757;
        this.field760[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(BIIIIII)Z")
    public boolean method211(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == 8) {
            boolean var8 = false;
        } else {
            this.field750 = !this.field750;
        }
        if (arg2 == arg4 && arg1 == arg3) {
            return true;
        }
        int var9 = arg2 - this.field756;
        int var10 = arg3 - this.field757;
        int var11 = arg4 - this.field756;
        int var12 = arg1 - this.field757;
        if (arg5 == 0) {
            if (arg6 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field760[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field760[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field760[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field760[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field760[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field760[var9][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field760[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 - 1 == var9 && var10 == var12) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var10 && (this.field760[var9][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var9 == var11 && var12 + 1 == var10 && (this.field760[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var10 && (this.field760[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var9 && var10 == var12 && (this.field760[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg4 && arg3 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field756;
        int var9 = arg5 - this.field757;
        int var10 = arg2 - this.field756;
        if (arg1 != 4) {
            this.field750 = !this.field750;
        }
        int var11 = arg3 - this.field757;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field760[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field760[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field760[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field760[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field760[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field760[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field760[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field760[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field760[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field760[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field760[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field760[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1 + arg6 - 1;
        int var10 = arg0 + arg5 - 1;
        if (arg2 != 0) {
            this.field751 = -201;
        }
        if (arg3 >= arg6 && arg3 <= var9 && arg7 >= arg0 && arg7 <= var10) {
            return true;
        } else if (arg6 - 1 == arg3 && arg7 >= arg0 && arg7 <= var10 && (this.field760[arg3 - this.field756][arg7 - this.field757] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg7 >= arg0 && arg7 <= var10 && (this.field760[arg3 - this.field756][arg7 - this.field757] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg7 && arg3 >= arg6 && arg3 <= var9 && (this.field760[arg3 - this.field756][arg7 - this.field757] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg3 >= arg6 && arg3 <= var9 && (this.field760[arg3 - this.field756][arg7 - this.field757] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }
}
