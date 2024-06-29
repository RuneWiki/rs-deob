import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class267 {

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "Lgf;")
    public class253 field4346 = new class253();

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "[C")
    public static char[] field4351 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "Lgf;")
    private class253 field4352;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "Lf;")
    public static class702 field4350;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field4340;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)Lgf;")
    public final class253 method1889(int arg0) {
        field4347++;
        if (arg0 != 16705) {
            field4351 = null;
        }
        class253 var2 = this.field4346.field4042;
        if (this.field4346 == var2) {
            this.field4352 = null;
            return null;
        } else {
            this.field4352 = var2.field4042;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1890(int arg0, int arg1, byte arg2) {
        int var3 = -54 / ((-arg2 - 25) / 52);
        field4349++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lgf;")
    public final class253 method1891(byte arg0) {
        field4345++;
        class253 var2 = this.field4352;
        if (this.field4346 == var2) {
            this.field4352 = null;
            return null;
        } else {
            this.field4352 = var2.field4042;
            return arg0 >= -8 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1892(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= -69) {
            return;
        }
        if (arg4 >= class576.field8218 && class340.field5510 >= arg3 && arg7 >= class545.field7931 && arg5 <= class585.field8331) {
            class37.method488(arg0, arg7, arg3, arg5, arg6, arg1, 0, arg4);
        } else {
            class473.method2940(arg3, arg1, arg0, arg4, arg5, true, arg7, arg6);
        }
        field4344++;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BZLol;)V")
    public static final void method1893(byte arg0, boolean arg1, class260 arg2) {
        field4342++;
        int var3 = 59 % ((-arg0 - 91) / 32);
        class642 var4 = arg2.method1856(1208);
        if (arg2.field4267 == 0) {
            class575.field8199 = 0;
            class167.field2808 = -1;
            arg2.field4262 = 0;
            return;
        }
        if (arg2.field4215 != -1 && arg2.field4150 == 0) {
            class428 var5 = class636.field8942.method2872((byte) 11, arg2.field4215);
            if (arg2.field4259 > 0 && var5.field6511 == 0) {
                class167.field2808 = -1;
                class575.field8199 = 0;
                arg2.field4262++;
                return;
            }
            if (arg2.field4259 <= 0 && var5.field6528 == 0) {
                class575.field8199 = 0;
                arg2.field4262++;
                class167.field2808 = -1;
                return;
            }
        }
        if (arg2.field4220 != -1 && class562.field8084 >= arg2.field4193) {
            class578 var6 = class65.field826.method3686(false, arg2.field4220);
            if (var6.field8230 && var6.field8241 != -1) {
                class428 var7 = class636.field8942.method2872((byte) 11, var6.field8241);
                if (arg2.field4259 > 0 && var7.field6511 == 0) {
                    class167.field2808 = -1;
                    class575.field8199 = 0;
                    arg2.field4262++;
                    return;
                }
                if (arg2.field4259 <= 0 && var7.field6528 == 0) {
                    arg2.field4262++;
                    class167.field2808 = -1;
                    class575.field8199 = 0;
                    return;
                }
            }
        }
        if (arg2.field4220 != -1 && class562.field8084 >= arg2.field4193) {
            class578 var8 = class65.field826.method3686(false, arg2.field4220);
            if (var8.field8230 && var8.field8241 != -1) {
                class428 var9 = class636.field8942.method2872((byte) 11, var8.field8241);
                if (arg2.field4259 > 0 && var9.field6511 == 0) {
                    class167.field2808 = -1;
                    class575.field8199 = 0;
                    arg2.field4262++;
                    return;
                }
                if (arg2.field4259 <= 0 && var9.field6528 == 0) {
                    class575.field8199 = 0;
                    arg2.field4262++;
                    class167.field2808 = -1;
                    return;
                }
            }
        }
        int var10 = arg2.field9696;
        int var11 = arg2.field9705;
        int var12 = arg2.field4264[arg2.field4267 - 1] * 512 + arg2.method1841(20744) * 256;
        int var13 = arg2.field4265[arg2.field4267 - 1] * 512 + arg2.method1841(20744) * 256;
        if (var12 <= var10) {
            if (var10 > var12) {
                if (var13 > var11) {
                    arg2.method1835(6144, 0);
                } else if (var13 < var11) {
                    arg2.method1835(2048, 0);
                } else {
                    arg2.method1835(4096, 0);
                }
            } else if (var11 < var13) {
                arg2.method1835(8192, 0);
            } else if (var13 < var11) {
                arg2.method1835(0, 0);
            }
        } else if (var13 > var11) {
            arg2.method1835(10240, 0);
        } else if (var11 <= var13) {
            arg2.method1835(12288, 0);
        } else {
            arg2.method1835(14336, 0);
        }
        byte var14 = arg2.field4263[arg2.field4267 - 1];
        if (!arg1 && (var12 - var10) > 1024 || var12 - var10 < -1024 || var13 - var11 > 1024 || var13 - var11 < -1024) {
            arg2.field9705 = var13;
            arg2.field9696 = var12;
            arg2.method1845(false, 0, arg2.field4159);
            class575.field8199 = 0;
            class167.field2808 = -1;
            if (arg2.field4259 > 0) {
                arg2.field4259--;
            }
            arg2.field4267--;
            return;
        }
        int var15 = 16;
        boolean var16 = true;
        if (arg2 instanceof class589) {
            var16 = ((class589) arg2).field8354.field9917;
        }
        if (var16) {
            int var17 = arg2.field4159 - arg2.field4244.field3748;
            if (var17 != 0 && arg2.field4206 == -1 && arg2.field4168 != 0) {
                var15 = 8;
            }
            if (!arg1 && arg2.field4267 > 2) {
                var15 = 24;
            }
            if (!arg1 && arg2.field4267 > 3) {
                var15 = 32;
            }
        } else {
            if (!arg1 && arg2.field4267 > 1) {
                var15 = 24;
            }
            if (!arg1 && arg2.field4267 > 2) {
                var15 = 32;
            }
        }
        if (arg2.field4262 > 0 && arg2.field4267 > 1) {
            var15 = 32;
            arg2.field4262--;
        }
        if (var14 == 2) {
            var15 <<= 0x1;
        } else if (var14 == 0) {
            var15 >>= 0x1;
        }
        class575.field8199 = 0;
        if (var4.field9009 != -1) {
            int var18 = var15 << 9;
            if (arg2.field4267 == 1) {
                int var19 = arg2.field4257 * arg2.field4257;
                int var20 = (arg2.field9696 > var12 ? arg2.field9696 - var12 : -arg2.field9696 + var12) << 9;
                int var21 = (arg2.field9705 <= var13 ? var13 - arg2.field9705 : arg2.field9705 - var13) << 9;
                int var22 = var21 >= var20 ? var21 : var20;
                int var23 = var22 * 2 * var4.field9009;
                if (var23 < var19) {
                    arg2.field4257 /= 2;
                } else if (var22 < (var19 / 2)) {
                    arg2.field4257 -= var4.field9009;
                    if (arg2.field4257 < 0) {
                        arg2.field4257 = 0;
                    }
                } else if (var18 > arg2.field4257) {
                    arg2.field4257 += var4.field9009;
                    if (arg2.field4257 > var18) {
                        arg2.field4257 = var18;
                    }
                }
            } else if (var18 > arg2.field4257) {
                arg2.field4257 += var4.field9009;
                if (var18 < arg2.field4257) {
                    arg2.field4257 = var18;
                }
            } else if (arg2.field4257 > 0) {
                arg2.field4257 -= var4.field9009;
                if (arg2.field4257 < 0) {
                    arg2.field4257 = 0;
                }
            }
            var15 = arg2.field4257 >> 9;
            if (var15 < 1) {
                var15 = 1;
            }
        }
        if (var10 == var12 && var11 == var13) {
            class167.field2808 = -1;
        } else {
            if (var12 > var10) {
                class575.field8199 |= 0x4;
                arg2.field9696 += var15;
                if (arg2.field9696 > var12) {
                    arg2.field9696 = var12;
                }
            } else if (var12 < var10) {
                class575.field8199 |= 0x8;
                arg2.field9696 -= var15;
                if (var12 > arg2.field9696) {
                    arg2.field9696 = var12;
                }
            }
            if (var11 < var13) {
                arg2.field9705 += var15;
                class575.field8199 |= 0x1;
                if (var13 < arg2.field9705) {
                    arg2.field9705 = var13;
                }
            } else if (var11 > var13) {
                arg2.field9705 -= var15;
                class575.field8199 |= 0x2;
                if (var13 > arg2.field9705) {
                    arg2.field9705 = var13;
                }
            }
            if (var15 < 32) {
                class167.field2808 = var14;
            } else {
                class167.field2808 = 2;
            }
        }
        if (arg2.field9696 == var12 && arg2.field9705 == var13) {
            if (arg2.field4259 > 0) {
                arg2.field4259--;
            }
            arg2.field4267--;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V")
    public static void method1894(int arg0) {
        field4350 = null;
        field4340 = null;
        field4351 = null;
        if (arg0 != -1024) {
            method1893((byte) -101, true, null);
        }
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)V")
    public final void method1895(int arg0) {
        while (true) {
            class253 var2 = this.field4346.field4042;
            if (this.field4346 == var2) {
                field4343++;
                if (arg0 != 112) {
                    this.method1889(95);
                }
                this.field4352 = null;
                return;
            }
            var2.method1797(false);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lgf;B)V")
    public final void method1896(class253 arg0, byte arg1) {
        if (arg0.field4041 != null) {
            arg0.method1797(false);
        }
        if (arg1 >= -69) {
            this.field4346 = null;
        }
        field4341++;
        arg0.field4041 = this.field4346.field4041;
        arg0.field4042 = this.field4346;
        arg0.field4041.field4042 = arg0;
        arg0.field4042.field4041 = arg0;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method1897(int arg0, int arg1, byte[] arg2, int arg3) {
        field4339++;
        char[] var4 = new char[arg0];
        int var5 = arg1;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class43.field600[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)I")
    public final int method1898(byte arg0) {
        field4348++;
        int var2 = 0;
        if (arg0 <= 110) {
            field4350 = null;
        }
        class253 var3 = this.field4346.field4042;
        while (this.field4346 != var3) {
            var3 = var3.field4042;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V")
    public class267() {
        this.field4346.field4042 = this.field4346;
        this.field4346.field4041 = this.field4346;
    }
}
