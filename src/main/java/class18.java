import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class18 extends class182 {

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Ljava/lang/String;")
    public static String field493 = "Starting 3d Library";

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "Ljava/lang/String;")
    public static String field491 = "Loaded input handler";

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field495 = 0;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field499 = new String[200];

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "Lek;")
    public static class206 field494;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 3)
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)Lcm;", line = 14)
    public static final class215 method174(int arg0, int arg1) {
        if (arg1 != 2) {
            return (class215) null;
        }
        field489++;
        class215 var2 = (class215) class338.field5355.method893((long) arg0, 124);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class325.field5249.method1404(33, arg0, (byte) -107);
        class215 var4 = new class215();
        if (var3 != null) {
            var4.method1495(new class146(var3), (byte) -122, arg0);
        }
        class338.field5355.method888((long) arg0, var4, 86);
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLek;Lek;)V", line = 43)
    public static final void method175(byte arg0, class206 arg1, class206 arg2) {
        int var3 = 126 / ((18 - arg0) / 39);
        class195.field3272 = arg2;
        field497++;
        class325.field5247 = arg1;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        class195.field3272.method1417(true, 34);
        int var6 = (int) (Math.random() * 41.0D) - 20;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        class192.field3246 = var5 + var6;
        class119.field2127 = var7 + var6;
        class220.field3645 = var4 + var6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILqc;)V", line = 76)
    public static final void method176(int arg0, class6 arg1) {
        field490++;
        if (arg0 != -1) {
            field500 = 112;
        }
        class5 var2 = arg1.method60(true);
        arg1.field206 = var2.field106;
        if (arg1.field179 == 0) {
            arg1.field121 = 0;
            return;
        }
        if (arg1.field166 != -1 && arg1.field180 == 0) {
            class300 var3 = class258.method1807(arg1.field166, 71);
            if (arg1.field212 > 0 && var3.field4870 == 0) {
                arg1.field121++;
                return;
            }
            if (arg1.field212 <= 0 && var3.field4876 == 0) {
                arg1.field121++;
                return;
            }
        }
        if (arg1.field127 != -1 && class267.field4371 >= arg1.field209) {
            class198 var4 = class134.method944(1, arg1.field127);
            if (var4.field3316 && var4.field3322 != -1) {
                class300 var5 = class258.method1807(var4.field3322, 97);
                if (arg1.field212 > 0 && var5.field4870 == 0) {
                    arg1.field121++;
                    return;
                }
                if (arg1.field212 <= 0 && var5.field4876 == 0) {
                    arg1.field121++;
                    return;
                }
            }
        }
        int var6 = arg1.field199;
        int var7 = arg1.field213;
        int var8 = arg1.field139[arg1.field179 - 1] * 128 + (arg1.method49((byte) 50) * 64);
        int var9 = arg1.field170[arg1.field179 - 1] * 128 + (arg1.method49((byte) 57) * 64);
        if (var8 - var6 > 256 || var8 - var6 < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg1.field199 = var8;
            arg1.field213 = var9;
            return;
        }
        if (var6 >= var8) {
            if (var6 <= var8) {
                if (var7 < var9) {
                    arg1.field144 = 1024;
                } else if (var9 < var7) {
                    arg1.field144 = 0;
                }
            } else if (var7 < var9) {
                arg1.field144 = 768;
            } else if (var9 >= var7) {
                arg1.field144 = 512;
            } else {
                arg1.field144 = 256;
            }
        } else if (var9 > var7) {
            arg1.field144 = 1280;
        } else if (var7 <= var9) {
            arg1.field144 = 1536;
        } else {
            arg1.field144 = 1792;
        }
        int var10 = var2.field98;
        int var11 = arg1.field144 - arg1.field216 & 0x7FF;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        int var12 = 4;
        if (var11 >= -256 && var11 <= 256) {
            var10 = var2.field90;
        } else if (var11 >= 256 && var11 < 768) {
            var10 = var2.field114;
        } else if (var11 >= -768 && var11 <= -256) {
            var10 = var2.field89;
        }
        if (var10 == -1) {
            var10 = var2.field90;
        }
        arg1.field206 = var10;
        byte var13 = 1;
        boolean var14 = true;
        if (arg1 instanceof class314) {
            var14 = ((class314) arg1).field5107.field1530;
        }
        if (var14) {
            if (arg1.field216 != arg1.field144 && arg1.field190 == -1 && arg1.field135 != 0) {
                var12 = 2;
            }
            if (arg1.field179 > 2) {
                var12 = 6;
            }
            if (arg1.field179 > 3) {
                var12 = 8;
            }
            if (arg1.field121 > 0 && arg1.field179 > 1) {
                arg1.field121--;
                var12 = 8;
            }
        } else {
            if (arg1.field179 > 1) {
                var12 = 6;
            }
            if (arg1.field179 > 2) {
                var12 = 8;
            }
            if (arg1.field121 > 0 && arg1.field179 > 1) {
                arg1.field121--;
                var12 = 8;
            }
        }
        if (arg1.field118[arg1.field179 - 1] == 2) {
            var12 <<= 0x1;
            var13 = 2;
        } else if (arg1.field118[arg1.field179 - 1] == 0) {
            var12 >>= 0x1;
            var13 = 0;
        }
        if (var12 < 8 || var2.field80 == -1) {
            if (var2.field82 != -1 && var13 == 0) {
                if (arg1.field206 == var2.field98 && var2.field103 != -1) {
                    arg1.field206 = var2.field103;
                } else if (arg1.field206 == var2.field89 && var2.field113 != -1) {
                    arg1.field206 = var2.field113;
                } else if (arg1.field206 == var2.field114 && var2.field99 != -1) {
                    arg1.field206 = var2.field99;
                } else {
                    arg1.field206 = var2.field82;
                }
            }
        } else if (arg1.field206 == var2.field98 && var2.field110 != -1) {
            arg1.field206 = var2.field110;
        } else if (arg1.field206 == var2.field89 && var2.field94 != -1) {
            arg1.field206 = var2.field94;
        } else if (arg1.field206 == var2.field114 && var2.field91 != -1) {
            arg1.field206 = var2.field91;
        } else {
            arg1.field206 = var2.field80;
        }
        if (var2.field102 != -1) {
            int var15 = var12 << 7;
            if (arg1.field179 == 1) {
                int var16 = arg1.field184 * arg1.field184;
                int var17 = (var8 >= arg1.field199 ? var8 - arg1.field199 : -var8 + arg1.field199) << 7;
                int var18 = (var9 < arg1.field213 ? arg1.field213 - var9 : -arg1.field213 + var9) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var2.field102 * 2 * var19;
                if (var16 > var20) {
                    arg1.field184 /= 2;
                } else if ((var16 / 2) > var19) {
                    arg1.field184 -= var2.field102;
                    if (arg1.field184 < 0) {
                        arg1.field184 = 0;
                    }
                } else if (var15 > arg1.field184) {
                    arg1.field184 += var2.field102;
                    if (arg1.field184 > var15) {
                        arg1.field184 = var15;
                    }
                }
            } else if (arg1.field184 < var15) {
                arg1.field184 += var2.field102;
                if (var15 < arg1.field184) {
                    arg1.field184 = var15;
                }
            } else if (arg1.field184 > 0) {
                arg1.field184 -= var2.field102;
                if (arg1.field184 < 0) {
                    arg1.field184 = 0;
                }
            }
            var12 = arg1.field184 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var9 > var7) {
            arg1.field213 += var12;
            if (var9 < arg1.field213) {
                arg1.field213 = var9;
            }
        } else if (var7 > var9) {
            arg1.field213 -= var12;
            if (arg1.field213 < var9) {
                arg1.field213 = var9;
            }
        }
        if (var8 > var6) {
            arg1.field199 += var12;
            if (var8 < arg1.field199) {
                arg1.field199 = var8;
            }
        } else if (var8 < var6) {
            arg1.field199 -= var12;
            if (var8 > arg1.field199) {
                arg1.field199 = var8;
            }
        }
        if (arg1.field199 == var8 && arg1.field213 == var9) {
            if (arg1.field212 > 0) {
                arg1.field212--;
            }
            arg1.field179--;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[I", line = 426)
    public final int[] method125(int arg0, int arg1) {
        field498++;
        if (arg0 != 2) {
            method177(-96);
        }
        return class21.field539;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V", line = 439)
    public static void method177(int arg0) {
        field491 = null;
        field494 = null;
        if (arg0 != 200) {
            method176(-11, (class6) null);
        }
        field499 = null;
        field493 = null;
    }
}
