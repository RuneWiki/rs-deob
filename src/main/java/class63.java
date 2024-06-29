import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class63 extends class259 {

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Lud;")
    public class312 field758;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "[I")
    public static int[] field761 = new int[4096];

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Ljava/lang/String;")
    public static String field756 = " has logged out.";

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "Lkn;")
    public static class220 field764;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V", line = 13)
    public final void method388(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 36 / ((11 - arg2) / 34);
        field755++;
        this.field759 = arg3;
        this.field753 = arg1;
        this.field757 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V", line = 27)
    public static void method389(int arg0) {
        field756 = null;
        field761 = null;
        field764 = null;
        if (arg0 != 17340) {
            method389(-79);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lgi;B)V", line = 57)
    public static final void method390(class242 arg0, byte arg1) {
        int var2 = -82 / ((arg1 + 6) / 39);
        class282 var3 = arg0.method1719(-1);
        field762++;
        arg0.field3778 = var3.field4486;
        if (arg0.field3789 == 0) {
            arg0.field3713 = 0;
            return;
        }
        if (arg0.field3807 != -1 && arg0.field3796 == 0) {
            class111 var4 = class289.method2067((byte) -127, arg0.field3807);
            if (arg0.field3802 > 0 && var4.field1550 == 0) {
                arg0.field3713++;
                return;
            }
            if (arg0.field3802 <= 0 && var4.field1551 == 0) {
                arg0.field3713++;
                return;
            }
        }
        if (arg0.field3703 != -1 && class102.field1381 >= arg0.field3736) {
            class314 var5 = class255.method1803(arg0.field3703, (byte) -51);
            if (var5.field4934 && var5.field4919 != -1) {
                class111 var6 = class289.method2067((byte) -119, var5.field4919);
                if (arg0.field3802 > 0 && var6.field1550 == 0) {
                    arg0.field3713++;
                    return;
                }
                if (arg0.field3802 <= 0 && var6.field1551 == 0) {
                    arg0.field3713++;
                    return;
                }
            }
        }
        int var7 = arg0.field3767;
        int var8 = arg0.field3763;
        int var9 = arg0.field3747[arg0.field3789 - 1] * 128 + arg0.method412((byte) 87) * 64;
        int var10 = arg0.field3786[arg0.field3789 - 1] * 128 + arg0.method412((byte) 87) * 64;
        if (var9 - var7 > 256 || (var9 - var7) < -256 || var10 - var8 > 256 || var10 - var8 < -256) {
            arg0.field3763 = var10;
            arg0.field3767 = var9;
            return;
        }
        if (var9 > var7) {
            if (var10 > var8) {
                arg0.field3806 = 1280;
            } else if (var10 >= var8) {
                arg0.field3806 = 1536;
            } else {
                arg0.field3806 = 1792;
            }
        } else if (var9 >= var7) {
            if (var10 > var8) {
                arg0.field3806 = 1024;
            } else if (var10 < var8) {
                arg0.field3806 = 0;
            }
        } else if (var8 < var10) {
            arg0.field3806 = 768;
        } else if (var8 <= var10) {
            arg0.field3806 = 512;
        } else {
            arg0.field3806 = 256;
        }
        int var11 = arg0.field3806 - arg0.field3760 & 0x7FF;
        int var12 = 4;
        byte var13 = 1;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        boolean var14 = true;
        int var15 = var3.field4487;
        if (var11 >= -256 && var11 <= 256) {
            var15 = var3.field4478;
        } else if (var11 >= 256 && var11 < 768) {
            var15 = var3.field4465;
        } else if (var11 >= -768 && var11 <= -256) {
            var15 = var3.field4490;
        }
        if (var15 == -1) {
            var15 = var3.field4478;
        }
        arg0.field3778 = var15;
        if (arg0 instanceof class231) {
            var14 = ((class231) arg0).field3503.field2092;
        }
        if (var14) {
            if (arg0.field3806 != arg0.field3760 && arg0.field3792 == -1 && arg0.field3729 != 0) {
                var12 = 2;
            }
            if (arg0.field3789 > 2) {
                var12 = 6;
            }
            if (arg0.field3789 > 3) {
                var12 = 8;
            }
            if (arg0.field3713 > 0 && arg0.field3789 > 1) {
                var12 = 8;
                arg0.field3713--;
            }
        } else {
            if (arg0.field3789 > 1) {
                var12 = 6;
            }
            if (arg0.field3789 > 2) {
                var12 = 8;
            }
            if (arg0.field3713 > 0 && arg0.field3789 > 1) {
                arg0.field3713--;
                var12 = 8;
            }
        }
        if (arg0.field3720[arg0.field3789 - 1] == 2) {
            var12 <<= 0x1;
            var13 = 2;
        } else if (arg0.field3720[arg0.field3789 - 1] == 0) {
            var13 = 0;
            var12 >>= 0x1;
        }
        if (var12 < 8 || var3.field4464 == -1) {
            if (var3.field4468 != -1 && var13 == 0) {
                if (arg0.field3778 == var3.field4487 && var3.field4475 != -1) {
                    arg0.field3778 = var3.field4475;
                } else if (arg0.field3778 == var3.field4490 && var3.field4470 != -1) {
                    arg0.field3778 = var3.field4470;
                } else if (arg0.field3778 == var3.field4465 && var3.field4458 != -1) {
                    arg0.field3778 = var3.field4458;
                } else {
                    arg0.field3778 = var3.field4468;
                }
            }
        } else if (arg0.field3778 == var3.field4487 && var3.field4471 != -1) {
            arg0.field3778 = var3.field4471;
        } else if (arg0.field3778 == var3.field4490 && var3.field4469 != -1) {
            arg0.field3778 = var3.field4469;
        } else if (arg0.field3778 == var3.field4465 && var3.field4492 != -1) {
            arg0.field3778 = var3.field4492;
        } else {
            arg0.field3778 = var3.field4464;
        }
        if (var3.field4474 != -1) {
            int var16 = var12 << 7;
            if (arg0.field3789 == 1) {
                int var17 = arg0.field3721 * arg0.field3721;
                int var18 = (var9 >= arg0.field3767 ? var9 - arg0.field3767 : -var9 + arg0.field3767) << 7;
                int var19 = (var10 < arg0.field3763 ? arg0.field3763 - var10 : var10 - arg0.field3763) << 7;
                int var20 = var18 <= var19 ? var19 : var18;
                int var21 = var3.field4474 * 2 * var20;
                if (var17 > var21) {
                    arg0.field3721 /= 2;
                } else if (var20 < var17 / 2) {
                    arg0.field3721 -= var3.field4474;
                    if (arg0.field3721 < 0) {
                        arg0.field3721 = 0;
                    }
                } else if (arg0.field3721 < var16) {
                    arg0.field3721 += var3.field4474;
                    if (var16 < arg0.field3721) {
                        arg0.field3721 = var16;
                    }
                }
            } else if (arg0.field3721 < var16) {
                arg0.field3721 += var3.field4474;
                if (arg0.field3721 > var16) {
                    arg0.field3721 = var16;
                }
            } else if (arg0.field3721 > 0) {
                arg0.field3721 -= var3.field4474;
                if (arg0.field3721 < 0) {
                    arg0.field3721 = 0;
                }
            }
            var12 = arg0.field3721 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var8 < var10) {
            arg0.field3763 += var12;
            if (var10 < arg0.field3763) {
                arg0.field3763 = var10;
            }
        } else if (var10 < var8) {
            arg0.field3763 -= var12;
            if (var10 > arg0.field3763) {
                arg0.field3763 = var10;
            }
        }
        if (var7 < var9) {
            arg0.field3767 += var12;
            if (arg0.field3767 > var9) {
                arg0.field3767 = var9;
            }
        } else if (var9 < var7) {
            arg0.field3767 -= var12;
            if (var9 > arg0.field3767) {
                arg0.field3767 = var9;
            }
        }
        if (arg0.field3767 == var9 && arg0.field3763 == var10) {
            if (arg0.field3802 > 0) {
                arg0.field3802--;
            }
            arg0.field3789--;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lud;Llg;)V", line = 398)
    public class63(class312 arg0, class141 arg1) {
        this.field758 = arg0;
    }
}
