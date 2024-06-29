import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class82 extends class115 {

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field1263 = -1;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "[I")
    public static int[] field1264 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "[Lth;")
    public static class72[] field1268 = new class72[32768];

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lvi;I)V")
    public static final void method545(class5 arg0, int arg1) {
        field1266++;
        class35 var2 = arg0.method73((byte) -44);
        arg0.field112 = var2.field531;
        int var3 = -100 % ((arg1 - 22) / 50);
        if (arg0.field84 == 0) {
            arg0.field124 = 0;
            return;
        }
        if (arg0.field98 != -1 && arg0.field88 == 0) {
            class196 var4 = class70.method478(arg0.field98, false);
            if (arg0.field103 > 0 && var4.field2821 == 0) {
                arg0.field124++;
                return;
            }
            if (arg0.field103 <= 0 && var4.field2826 == 0) {
                arg0.field124++;
                return;
            }
        }
        int var5 = arg0.field45;
        int var6 = arg0.field94;
        int var7 = arg0.field119[arg0.field84 - 1] * 128 + (arg0.method57(0) * 64);
        int var8 = arg0.field50[arg0.field84 - 1] * 128 + (arg0.method57(0) * 64);
        if ((var7 - var5) > 256 || (var7 - var5) < -256 || var8 - var6 > 256 || (var8 - var6) < -256) {
            arg0.field45 = var7;
            arg0.field94 = var8;
            return;
        }
        if (var7 > var5) {
            if (var6 < var8) {
                arg0.field127 = 1280;
            } else if (var8 < var6) {
                arg0.field127 = 1792;
            } else {
                arg0.field127 = 1536;
            }
        } else if (var5 <= var7) {
            if (var6 < var8) {
                arg0.field127 = 1024;
            } else if (var8 < var6) {
                arg0.field127 = 0;
            }
        } else if (var6 < var8) {
            arg0.field127 = 768;
        } else if (var8 >= var6) {
            arg0.field127 = 512;
        } else {
            arg0.field127 = 256;
        }
        int var9 = arg0.field127 - arg0.field104 & 0x7FF;
        int var10 = var2.field518;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        int var11 = 4;
        if (var9 >= -256 && var9 <= 256) {
            var10 = var2.field519;
        } else if (var9 >= 256 && var9 < 768) {
            var10 = var2.field530;
        } else if (var9 >= -768 && var9 <= -256) {
            var10 = var2.field521;
        }
        boolean var12 = true;
        if (var10 == -1) {
            var10 = var2.field519;
        }
        byte var13 = 1;
        arg0.field112 = var10;
        if (arg0 instanceof class72) {
            var12 = ((class72) arg0).field1119.field4275;
        }
        if (var12) {
            if (arg0.field127 != arg0.field104 && arg0.field97 == -1 && arg0.field66 != 0) {
                var11 = 2;
            }
            if (arg0.field84 > 2) {
                var11 = 6;
            }
            if (arg0.field84 > 3) {
                var11 = 8;
            }
            if (arg0.field124 > 0 && arg0.field84 > 1) {
                arg0.field124--;
                var11 = 8;
            }
        } else {
            if (arg0.field84 > 1) {
                var11 = 6;
            }
            if (arg0.field84 > 2) {
                var11 = 8;
            }
            if (arg0.field124 > 0 && arg0.field84 > 1) {
                var11 = 8;
                arg0.field124--;
            }
        }
        if (arg0.field91[arg0.field84 - 1] == 2) {
            var13 = 2;
            var11 <<= 0x1;
        } else if (arg0.field91[arg0.field84 - 1] == 0) {
            var11 >>= 0x1;
            var13 = 0;
        }
        if (var11 < 8 || var2.field526 == -1) {
            if (var2.field509 != -1 && var13 == 0) {
                if (arg0.field112 == var2.field518 && var2.field515 != -1) {
                    arg0.field112 = var2.field515;
                } else if (arg0.field112 == var2.field521 && var2.field523 != -1) {
                    arg0.field112 = var2.field523;
                } else if (arg0.field112 == var2.field530 && var2.field506 != -1) {
                    arg0.field112 = var2.field506;
                } else {
                    arg0.field112 = var2.field509;
                }
            }
        } else if (arg0.field112 == var2.field518 && var2.field524 != -1) {
            arg0.field112 = var2.field524;
        } else if (arg0.field112 == var2.field521 && var2.field505 != -1) {
            arg0.field112 = var2.field505;
        } else if (arg0.field112 == var2.field530 && var2.field529 != -1) {
            arg0.field112 = var2.field529;
        } else {
            arg0.field112 = var2.field526;
        }
        if (var2.field508 != -1) {
            int var14 = var11 << 7;
            if (arg0.field84 == 1) {
                int var15 = arg0.field105 * arg0.field105;
                int var16 = (arg0.field94 <= var8 ? var8 - arg0.field94 : arg0.field94 - var8) << 7;
                int var17 = (arg0.field45 <= var7 ? var7 - arg0.field45 : -var7 + arg0.field45) << 7;
                int var18 = var17 <= var16 ? var16 : var17;
                int var19 = var2.field508 * 2 * var18;
                if (var15 > var19) {
                    arg0.field105 /= 2;
                } else if (var18 < var15 / 2) {
                    arg0.field105 -= var2.field508;
                    if (arg0.field105 < 0) {
                        arg0.field105 = 0;
                    }
                } else if (var14 > arg0.field105) {
                    arg0.field105 += var2.field508;
                    if (arg0.field105 > var14) {
                        arg0.field105 = var14;
                    }
                }
            } else if (var14 > arg0.field105) {
                arg0.field105 += var2.field508;
                if (var14 < arg0.field105) {
                    arg0.field105 = var14;
                }
            } else if (arg0.field105 > 0) {
                arg0.field105 -= var2.field508;
                if (arg0.field105 < 0) {
                    arg0.field105 = 0;
                }
            }
            var11 = arg0.field105 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var8 > var6) {
            arg0.field94 += var11;
            if (arg0.field94 > var8) {
                arg0.field94 = var8;
            }
        } else if (var8 < var6) {
            arg0.field94 -= var11;
            if (arg0.field94 < var8) {
                arg0.field94 = var8;
            }
        }
        if (var7 > var5) {
            arg0.field45 += var11;
            if (arg0.field45 > var7) {
                arg0.field45 = var7;
            }
        } else if (var7 < var5) {
            arg0.field45 -= var11;
            if (var7 > arg0.field45) {
                arg0.field45 = var7;
            }
        }
        if (arg0.field45 != var7 || arg0.field94 != var8) {
            return;
        }
        arg0.field84--;
        if (arg0.field103 > 0) {
            arg0.field103--;
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BILve;I)Llk;")
    public static final class244 method546(byte arg0, int arg1, class233 arg2, int arg3) {
        field1262++;
        if (arg0 == -20) {
            return class110.method718(arg2, (byte) -117, arg3, arg1) ? class277.method1865(true) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
    public static void method547(int arg0) {
        field1264 = null;
        if (arg0 < -3) {
            field1268 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            method546((byte) -18, -68, (class233) null, 77);
        }
        field1261++;
        return class169.field2444;
    }
}
