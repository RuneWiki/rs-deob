import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VDSFJUIR")
public class class62 {

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "I")
    private int field1620 = -639;

    @OriginalMember(owner = "client!VDSFJUIR", name = "b", descriptor = "Z")
    private boolean field1621 = false;

    @OriginalMember(owner = "client!VDSFJUIR", name = "c", descriptor = "Z")
    private boolean field1622 = true;

    @OriginalMember(owner = "client!VDSFJUIR", name = "d", descriptor = "I")
    private int field1623 = 5755;

    @OriginalMember(owner = "client!VDSFJUIR", name = "e", descriptor = "Z")
    private boolean field1624 = false;

    @OriginalMember(owner = "client!VDSFJUIR", name = "f", descriptor = "I")
    private int field1625 = -906;

    @OriginalMember(owner = "client!VDSFJUIR", name = "g", descriptor = "I")
    public int field1626 = 0;

    @OriginalMember(owner = "client!VDSFJUIR", name = "h", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!VDSFJUIR", name = "i", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!VDSFJUIR", name = "j", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!VDSFJUIR", name = "k", descriptor = "[[I")
    public int[][] field1630;

    @OriginalMember(owner = "client!VDSFJUIR", name = "<init>", descriptor = "(III)V")
    public class62(int arg0, int arg1, int arg2) {
        if (arg1 != -39368) {
            throw new NullPointerException();
        }
        this.field1627 = 0;
        this.field1628 = arg0;
        this.field1629 = arg2;
        this.field1630 = new int[this.field1628][this.field1629];
        this.method570();
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "()V")
    public void method570() {
        for (int var1 = 0; var1 < this.field1628; var1++) {
            for (int var2 = 0; var2 < this.field1629; var2++) {
                if (var1 == 0 || var2 == 0 || this.field1628 - 1 == var1 || this.field1629 - 1 == var2) {
                    this.field1630[var1][var2] = 16777215;
                } else {
                    this.field1630[var1][var2] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIZI)V")
    public void method571(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg1 - this.field1626;
        if (arg2 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg5 - this.field1627;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method574(var7, var9, 128);
                this.method574(var7 - 1, var9, 8);
            }
            if (arg3 == 1) {
                this.method574(var7, var9, 2);
                this.method574(var7, var9 + 1, 32);
            }
            if (arg3 == 2) {
                this.method574(var7, var9, 8);
                this.method574(var7 + 1, var9, 128);
            }
            if (arg3 == 3) {
                this.method574(var7, var9, 32);
                this.method574(var7, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method574(var7, var9, 1);
                this.method574(var7 - 1, var9 + 1, 16);
            }
            if (arg3 == 1) {
                this.method574(var7, var9, 4);
                this.method574(var7 + 1, var9 + 1, 64);
            }
            if (arg3 == 2) {
                this.method574(var7, var9, 16);
                this.method574(var7 + 1, var9 - 1, 1);
            }
            if (arg3 == 3) {
                this.method574(var7, var9, 64);
                this.method574(var7 - 1, var9 - 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method574(var7, var9, 130);
                this.method574(var7 - 1, var9, 8);
                this.method574(var7, var9 + 1, 32);
            }
            if (arg3 == 1) {
                this.method574(var7, var9, 10);
                this.method574(var7, var9 + 1, 32);
                this.method574(var7 + 1, var9, 128);
            }
            if (arg3 == 2) {
                this.method574(var7, var9, 40);
                this.method574(var7 + 1, var9, 128);
                this.method574(var7, var9 - 1, 2);
            }
            if (arg3 == 3) {
                this.method574(var7, var9, 160);
                this.method574(var7, var9 - 1, 2);
                this.method574(var7 - 1, var9, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method574(var7, var9, 65536);
                this.method574(var7 - 1, var9, 4096);
            }
            if (arg3 == 1) {
                this.method574(var7, var9, 1024);
                this.method574(var7, var9 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method574(var7, var9, 4096);
                this.method574(var7 + 1, var9, 65536);
            }
            if (arg3 == 3) {
                this.method574(var7, var9, 16384);
                this.method574(var7, var9 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method574(var7, var9, 512);
                this.method574(var7 - 1, var9 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method574(var7, var9, 2048);
                this.method574(var7 + 1, var9 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method574(var7, var9, 8192);
                this.method574(var7 + 1, var9 - 1, 512);
            }
            if (arg3 == 3) {
                this.method574(var7, var9, 32768);
                this.method574(var7 - 1, var9 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method574(var7, var9, 66560);
            this.method574(var7 - 1, var9, 4096);
            this.method574(var7, var9 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method574(var7, var9, 5120);
            this.method574(var7, var9 + 1, 16384);
            this.method574(var7 + 1, var9, 65536);
        }
        if (arg3 == 2) {
            this.method574(var7, var9, 20480);
            this.method574(var7 + 1, var9, 65536);
            this.method574(var7, var9 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method574(var7, var9, 81920);
            this.method574(var7, var9 - 1, 1024);
            this.method574(var7 - 1, var9, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIZIII)V")
    public void method572(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            return;
        }
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field1626;
        int var10 = arg4 - this.field1627;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg0;
            arg0 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1628) {
                for (int var13 = var10; var13 < arg6 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1629) {
                        this.method574(var12, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(III)V")
    public void method573(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            this.field1620 = 391;
        }
        int var4 = arg1 - this.field1626;
        int var5 = arg2 - this.field1627;
        this.field1630[var4][var5] |= 0x200000;
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "b", descriptor = "(III)V")
    private void method574(int arg0, int arg1, int arg2) {
        this.field1630[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIZ)V")
    public void method575(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field1626;
        int var8 = arg0 - this.field1627;
        if (arg1 >= 0) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method577(128, -31320, var8, var7);
                this.method577(8, -31320, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method577(2, -31320, var8, var7);
                this.method577(32, -31320, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method577(8, -31320, var8, var7);
                this.method577(128, -31320, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method577(32, -31320, var8, var7);
                this.method577(2, -31320, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method577(1, -31320, var8, var7);
                this.method577(16, -31320, var8 + 1, var7 - 1);
            }
            if (arg4 == 1) {
                this.method577(4, -31320, var8, var7);
                this.method577(64, -31320, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method577(16, -31320, var8, var7);
                this.method577(1, -31320, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method577(64, -31320, var8, var7);
                this.method577(4, -31320, var8 - 1, var7 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method577(130, -31320, var8, var7);
                this.method577(8, -31320, var8, var7 - 1);
                this.method577(32, -31320, var8 + 1, var7);
            }
            if (arg4 == 1) {
                this.method577(10, -31320, var8, var7);
                this.method577(32, -31320, var8 + 1, var7);
                this.method577(128, -31320, var8, var7 + 1);
            }
            if (arg4 == 2) {
                this.method577(40, -31320, var8, var7);
                this.method577(128, -31320, var8, var7 + 1);
                this.method577(2, -31320, var8 - 1, var7);
            }
            if (arg4 == 3) {
                this.method577(160, -31320, var8, var7);
                this.method577(2, -31320, var8 - 1, var7);
                this.method577(8, -31320, var8, var7 - 1);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method577(65536, -31320, var8, var7);
                this.method577(4096, -31320, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method577(1024, -31320, var8, var7);
                this.method577(16384, -31320, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method577(4096, -31320, var8, var7);
                this.method577(65536, -31320, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method577(16384, -31320, var8, var7);
                this.method577(1024, -31320, var8 - 1, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method577(512, -31320, var8, var7);
                this.method577(8192, -31320, var8 + 1, var7 - 1);
            }
            if (arg4 == 1) {
                this.method577(2048, -31320, var8, var7);
                this.method577(32768, -31320, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method577(8192, -31320, var8, var7);
                this.method577(512, -31320, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method577(32768, -31320, var8, var7);
                this.method577(2048, -31320, var8 - 1, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method577(66560, -31320, var8, var7);
            this.method577(4096, -31320, var8, var7 - 1);
            this.method577(16384, -31320, var8 + 1, var7);
        }
        if (arg4 == 1) {
            this.method577(5120, -31320, var8, var7);
            this.method577(16384, -31320, var8 + 1, var7);
            this.method577(65536, -31320, var8, var7 + 1);
        }
        if (arg4 == 2) {
            this.method577(20480, -31320, var8, var7);
            this.method577(65536, -31320, var8, var7 + 1);
            this.method577(1024, -31320, var8 - 1, var7);
        }
        if (arg4 == 3) {
            this.method577(81920, -31320, var8, var7);
            this.method577(1024, -31320, var8 - 1, var7);
            this.method577(4096, -31320, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIZB)V")
    public void method576(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg1 - this.field1626;
        int var10 = arg4 - this.field1627;
        if (arg6 != 45) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1628) {
                for (int var13 = var10; var13 < arg0 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field1629) {
                        this.method577(var8, -31320, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIII)V")
    private void method577(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -31320) {
            this.field1623 = -34;
        }
        this.field1630[arg3][arg2] &= 16777215 - arg0;
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IZI)V")
    public void method578(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field1626;
        int var5 = arg0 - this.field1627;
        if (!arg1) {
            this.field1621 = !this.field1621;
        }
        this.field1630[var4][var5] &= 0xDFFFFF;
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIZI)Z")
    public boolean method579(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            this.field1622 = !this.field1622;
        }
        if (arg1 == arg3 && arg0 == arg4) {
            return true;
        }
        int var8 = arg3 - this.field1626;
        int var9 = arg4 - this.field1627;
        int var10 = arg1 - this.field1626;
        int var11 = arg0 - this.field1627;
        if (arg6 == 0) {
            if (arg2 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280180) == 0) {
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
                if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x1280120) == 0) {
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
                if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == arg5 && arg1 == arg3) {
            return true;
        }
        int var8 = arg2 - this.field1626;
        int var9 = arg3 - this.field1627;
        int var10 = arg5 - this.field1626;
        int var11 = arg1 - this.field1627;
        if (arg0 != 6) {
            this.field1621 = !this.field1621;
        }
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1630[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1630[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1630[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 86 / arg3;
        int var10 = arg5 + arg6 - 1;
        int var11 = arg2 + arg7 - 1;
        if (arg4 >= arg5 && arg4 <= var10 && arg1 >= arg7 && arg1 <= var11) {
            return true;
        } else if (arg5 - 1 == arg4 && arg1 >= arg7 && arg1 <= var11 && (this.field1630[arg4 - this.field1626][arg1 - this.field1627] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg1 >= arg7 && arg1 <= var11 && (this.field1630[arg4 - this.field1626][arg1 - this.field1627] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg1 && arg4 >= arg5 && arg4 <= var10 && (this.field1630[arg4 - this.field1626][arg1 - this.field1627] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg1 && arg4 >= arg5 && arg4 <= var10 && (this.field1630[arg4 - this.field1626][arg1 - this.field1627] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
