import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class610 {

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
    public int field8793;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "Z")
    public boolean field8777;

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "Z")
    public boolean field8778;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "[S")
    public short[] field8792;

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
    private int field8783;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
    public int field8784;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8795 = new String[] { method4454(method4453("/q\u0010\u00019l")), method4454(method4453("/q\u0010\u0001:l")), method4454(method4453("/q\u0010\u0001=l")), method4454(method4453("/q\u0010\u0001G-w\u0018[El")), method4454(method4453("?7_\u0001\u0006")), method4454(method4453("*l\u001dC")), method4454(method4453("/q\u0010\u0001?l")), method4454(method4453("/q\u0010\u0001>l")), method4454(method4453("/q\u0010\u00018l")) };

    @OriginalMember(owner = "client!kha", name = "p", descriptor = "I")
    public static int field8776 = 1400;

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "I")
    private int field8779;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "I")
    private int field8781;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
    private int field8786;

    @OriginalMember(owner = "client!kha", name = "q", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    private int field8789;

    @OriginalMember(owner = "client!kha", name = "s", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!kha", name = "r", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!kha", name = "o", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "Lih;")
    public class731 field8782;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V", line = 10)
    public static final void method4447(int arg0) {
        try {
            if (arg0 != -18418) {
                method4449(null, 100, 43, -85, -38, null, null, 46);
            }
            field8780++;
            short var1 = 1024;
            short var2 = 3072;
            if (class200.field3163) {
                if (class708.field10188) {
                    var1 = 2048;
                }
                var2 = 4096;
            }
            if ((float) var1 > class418.field6612) {
                class418.field6612 = var1;
            }
            while (class29.field293 >= 16384.0F) {
                class29.field293 -= 16384.0F;
            }
            if (class418.field6612 > (float) var2) {
                class418.field6612 = var2;
            }
            while (class29.field293 < 0.0F) {
                class29.field293 += 16384.0F;
            }
            int var3 = class524.field7735 >> 9;
            int var4 = class147.field2059 >> 9;
            int var5 = class207.method1873(class524.field7735, -10, class673.field9554, class147.field2059);
            int var6 = 0;
            if (var3 > 3 && var4 > 3 && var3 < class126.field1823 - 4 && (class169.field2725 - 4) > var4) {
                for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                        int var9 = class673.field9554;
                        if (var9 < 3 && class541.method4028(var8, var7, (byte) 113)) {
                            var9++;
                        }
                        int var10 = 0;
                        if (class60.field778.field10739 != null && class60.field778.field10739[var9] != null) {
                            var10 = (class60.field778.field10739[var9][var7][var8] & 0xFF) * 8 << 2;
                        }
                        if (class740.field10902 != null && class740.field10902[var9] != null) {
                            int var11 = var5 + var10 - class740.field10902[var9].method2495(var8, 1, var7);
                            if (var6 < var11) {
                                var6 = var11;
                            }
                        }
                    }
                }
            }
            int var12 = (var6 >> 2) * 1536;
            if (var12 > 786432) {
                var12 = 786432;
            }
            if (var12 < 262144) {
                var12 = 262144;
            }
            if (var12 > class585.field8485) {
                class585.field8485 += (var12 - class585.field8485) / 24;
            } else if (class585.field8485 > var12) {
                class585.field8485 += (var12 - class585.field8485) / 80;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field8795[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILha;IIII)V", line = 124)
    private final void method4448(int arg0, int arg1, class63 arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field8787++;
            this.field8782 = arg2.method195(arg4, arg0, arg6, arg1, arg3, 1.0F);
            if (arg5 != -23733) {
                this.field8782 = null;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field8795[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8795[5] : field8795[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lhk;IIIILaa;Lmj;I)V", line = 139)
    public static final void method4449(class107 arg0, int arg1, int arg2, int arg3, int arg4, class514 arg5, class683 arg6, int arg7) {
        try {
            field8791++;
            if (arg0 != null) {
                int var8;
                if (class401.field6334 == 4) {
                    var8 = (int) class29.field293 & 0x3FFF;
                } else {
                    var8 = (int) class29.field293 + class126.field1819 & 0x3FFF;
                }
                int var9 = Math.max(arg6.field9797 / 2, arg6.field9777 / 2) + 10;
                int var10 = arg7 * arg7 + (arg1 * arg1);
                if (var10 <= (var9 * var9)) {
                    int var11 = class763.field11199[var8];
                    int var12 = class763.field11200[var8];
                    if (class401.field6334 != arg4) {
                        var11 = var11 * 256 / (class85.field1275 + 256);
                        var12 = var12 * 256 / (class85.field1275 + 256);
                    }
                    int var13 = arg1 * var11 + arg7 * var12 >> 14;
                    int var14 = arg1 * var12 - (arg7 * var11) >> 14;
                    arg0.method9(arg6.field9797 / 2 + (arg2 + var13) - arg0.method26() / 2, arg6.field9777 / 2 + arg3 + -var14 - arg0.method12() / 2, arg5, arg2, arg3);
                }
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field8795[8] + (arg0 == null ? field8795[5] : field8795[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field8795[5] : field8795[4]) + ',' + (arg6 == null ? field8795[5] : field8795[4]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIIII)V", line = 181)
    public final void method4450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field8786 = arg2;
            this.field8781 = arg0;
            this.field8779 = arg4;
            if (arg1 != 10) {
                this.method4452((byte) -14, true, -44);
            }
            field8785++;
            this.field8789 = arg3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8795[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 196)
    private final void method4451(int arg0) {
        try {
            if (arg0 != 23810) {
                this.field8783 = 93;
            }
            int var2 = this.field8784;
            if (var2 == 2) {
                this.field8786 = 0;
                this.field8779 = 1;
                this.field8789 = 2048;
                this.field8781 = 2048;
            } else if (var2 == 3) {
                this.field8781 = 4096;
                this.field8779 = 1;
                this.field8789 = 2048;
                this.field8786 = 0;
            } else if (var2 == 4) {
                this.field8779 = 4;
                this.field8781 = 2048;
                this.field8789 = 2048;
                this.field8786 = 0;
            } else if (var2 == 5) {
                this.field8779 = 4;
                this.field8786 = 0;
                this.field8789 = 2048;
                this.field8781 = 8192;
            } else if (var2 == 12) {
                this.field8781 = 2048;
                this.field8786 = 0;
                this.field8779 = 2;
                this.field8789 = 2048;
            } else if (var2 == 13) {
                this.field8786 = 0;
                this.field8779 = 2;
                this.field8789 = 2048;
                this.field8781 = 8192;
            } else if (var2 == 10) {
                this.field8781 = 2048;
                this.field8779 = 3;
                this.field8786 = 1536;
                this.field8789 = 512;
            } else if (var2 == 11) {
                this.field8781 = 4096;
                this.field8789 = 512;
                this.field8786 = 1536;
                this.field8779 = 3;
            } else if (var2 == 6) {
                this.field8779 = 3;
                this.field8781 = 2048;
                this.field8786 = 1280;
                this.field8789 = 768;
            } else if (var2 == 7) {
                this.field8781 = 4096;
                this.field8789 = 768;
                this.field8786 = 1280;
                this.field8779 = 3;
            } else if (var2 == 8) {
                this.field8786 = 1024;
                this.field8779 = 3;
                this.field8789 = 1024;
                this.field8781 = 2048;
            } else if (var2 == 9) {
                this.field8779 = 3;
                this.field8781 = 4096;
                this.field8789 = 1024;
                this.field8786 = 1024;
            } else if (var2 == 14) {
                this.field8781 = 2048;
                this.field8779 = 1;
                this.field8789 = 768;
                this.field8786 = 1280;
            } else if (var2 == 15) {
                this.field8781 = 4096;
                this.field8786 = 1536;
                this.field8779 = 1;
                this.field8789 = 512;
            } else if (var2 == 16) {
                this.field8786 = 1792;
                this.field8781 = 8192;
                this.field8779 = 1;
                this.field8789 = 256;
            } else {
                this.field8779 = 0;
                this.field8789 = 2048;
                this.field8781 = 2048;
                this.field8786 = 0;
            }
            field8790++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8795[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "()V", line = 394)
    protected class610() {
        try {
            if (class213.field3359 == null) {
                class746.method5424(true);
            }
            this.method4451(23810);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8795[3] + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(BZI)V", line = 405)
    public final void method4452(byte arg0, boolean arg1, int arg2) {
        try {
            if (arg0 != 89) {
                this.field8786 = -126;
            }
            field8788++;
            int var6;
            if (arg1) {
                var6 = 2048;
            } else {
                int var4 = this.field8781 * arg2 / 50 + this.field8783 & 0x7FF;
                int var5 = this.field8779;
                if (var5 == 1) {
                    var6 = (class763.field11199[var4 << 3] >> 4) + 1024;
                } else if (var5 == 3) {
                    var6 = class213.field3359[var4] >> 1;
                } else if (var5 == 4) {
                    var6 = var4 >> 10 << 11;
                } else if (var5 == 2) {
                    var6 = var4;
                } else if (var5 == 5) {
                    var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
                } else {
                    var6 = 2048;
                }
            }
            this.field8782.method1257((byte) 86, (float) ((this.field8789 * var6 >> 11) + this.field8786) / 2048.0F);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8795[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lha;Lwq;I)V", line = 478)
    public class610(class63 arg0, class176 arg1, int arg2) {
        try {
            if (class213.field3359 == null) {
                class746.method5424(true);
            }
            this.field8793 = arg1.method1645((byte) -74);
            this.field8777 = (this.field8793 & 0x10) != 0;
            this.field8778 = (this.field8793 & 0x8) != 0;
            this.field8793 &= 0x7;
            int var4 = arg1.method1687((byte) -39) << arg2;
            int var5 = arg1.method1687((byte) -53) << arg2;
            int var6 = arg1.method1687((byte) -123) << arg2;
            int var7 = arg1.method1645((byte) -108);
            int var8 = var7 * 2 + 1;
            this.field8792 = new short[var8];
            for (int var9 = 0; var9 < this.field8792.length; var9++) {
                short var10 = (short) arg1.method1687((byte) -99);
                int var11 = var10 >>> 8;
                int var12 = var10 & 0xFF;
                if (var8 <= var11) {
                    var11 = var8 - 1;
                }
                if ((var8 - var11) < var12) {
                    var12 = var8 - var11;
                }
                this.field8792[var9] = (short) class553.method4099(var11 << 8, var12);
            }
            int var13 = (var7 << class165.field2688) + class316.field5139;
            int var14 = class613.field8810 == null ? class200.field3161[class545.method4049(arg1.method1687((byte) -112), 113) & 0xFFFF] : class613.field8810[arg1.method1687((byte) -53)];
            int var15 = arg1.method1645((byte) -126);
            this.field8783 = var15 & 0xE0 << 3;
            this.field8784 = var15 & 0x1F;
            if (this.field8784 != 31) {
                this.method4451(23810);
            }
            this.method4448(var6, var13, arg0, var14, var4, -23733, var5);
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field8795[3] + (arg0 == null ? field8795[5] : field8795[4]) + ',' + (arg1 == null ? field8795[5] : field8795[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4453(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4454(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
