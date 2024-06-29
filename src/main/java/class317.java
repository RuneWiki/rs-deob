import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class317 extends class9 {

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "Ljava/lang/Object;")
    private Object field5452;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field5447 = 0;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "[I")
    public static int[] field5449 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "I")
    public static int field5455 = 0;

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "[Lsf;")
    public static class108[] field5454 = new class108[500];

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "Lhe;")
    public static class94 field5451 = new class94(64);

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    public static int field5456 = 0;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Z", line = 6)
    public final boolean method50(int arg0) {
        field5448++;
        if (arg0 != -61) {
            this.method50(63);
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)I", line = 19)
    public static final int method2202(byte arg0, int arg1, int arg2) {
        if (arg0 != 63) {
            field5449 = (int[]) null;
        }
        field5446++;
        int var3 = arg2 >> 31 & arg1 - 1;
        return (arg2 + (arg2 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILqj;)V", line = 40)
    public static final void method2203(int arg0, class256 arg1) {
        arg1.field4472 = arg1.field4455;
        field5445++;
        if (arg1.field4487 == 0) {
            arg1.field4515 = 0;
            return;
        }
        if (arg1.field4492 != -1 && arg1.field4521 == 0) {
            class272 var2 = class149.method1063(arg1.field4492, -18767);
            if (arg1.field4447 > 0 && var2.field4749 == 0) {
                arg1.field4515++;
                return;
            }
            if (arg1.field4447 <= 0 && var2.field4748 == 0) {
                arg1.field4515++;
                return;
            }
        }
        int var3 = arg1.field4452;
        int var4 = arg1.field4457;
        int var5 = arg1.field4498[arg1.field4487 - 1] * 128 + arg1.method363((byte) -53) * 64;
        int var6 = arg1.field4482[arg1.field4487 - 1] * 128 + arg1.method363((byte) 124) * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field4452 = var5;
            arg1.field4457 = var6;
            return;
        }
        if (var3 < var5) {
            if (var4 < var6) {
                arg1.field4486 = 1280;
            } else if (var4 <= var6) {
                arg1.field4486 = 1536;
            } else {
                arg1.field4486 = 1792;
            }
        } else if (var5 >= var3) {
            if (var6 > var4) {
                arg1.field4486 = 1024;
            } else if (var4 > var6) {
                arg1.field4486 = 0;
            }
        } else if (var4 < var6) {
            arg1.field4486 = 768;
        } else if (var6 >= var4) {
            arg1.field4486 = 512;
        } else {
            arg1.field4486 = 256;
        }
        int var7 = 4 / ((arg0 + 62) / 48);
        int var8 = arg1.field4486 - arg1.field4518 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = arg1.field4470;
        int var10 = 4;
        if (var8 >= -256 && var8 <= 256) {
            var9 = arg1.field4449;
        } else if (var8 >= 256 && var8 < 768) {
            var9 = arg1.field4497;
        } else if (var8 >= -768 && var8 <= -256) {
            var9 = arg1.field4490;
        }
        if (var9 == -1) {
            var9 = arg1.field4449;
        }
        arg1.field4472 = var9;
        boolean var11 = true;
        if (arg1 instanceof class45) {
            var11 = ((class45) arg1).field646.field2387;
        }
        if (var11) {
            if (arg1.field4518 != arg1.field4486 && arg1.field4522 == -1 && arg1.field4510 != 0) {
                var10 = 2;
            }
            if (arg1.field4487 > 2) {
                var10 = 6;
            }
            if (arg1.field4487 > 3) {
                var10 = 8;
            }
            if (arg1.field4515 > 0 && arg1.field4487 > 1) {
                var10 = 8;
                arg1.field4515--;
            }
        } else {
            if (arg1.field4487 > 1) {
                var10 = 6;
            }
            if (arg1.field4487 > 2) {
                var10 = 8;
            }
            if (arg1.field4515 > 0 && arg1.field4487 > 1) {
                var10 = 8;
                arg1.field4515--;
            }
        }
        if (arg1.field4445[arg1.field4487 - 1]) {
            var10 <<= 0x1;
        }
        if (var5 > var3) {
            arg1.field4452 += var10;
            if (arg1.field4452 > var5) {
                arg1.field4452 = var5;
            }
        } else if (var3 > var5) {
            arg1.field4452 -= var10;
            if (var5 > arg1.field4452) {
                arg1.field4452 = var5;
            }
        }
        if (var10 >= 8 && arg1.field4472 == arg1.field4449 && arg1.field4483 != -1) {
            arg1.field4472 = arg1.field4483;
        }
        if (var6 > var4) {
            arg1.field4457 += var10;
            if (arg1.field4457 > var6) {
                arg1.field4457 = var6;
            }
        } else if (var6 < var4) {
            arg1.field4457 -= var10;
            if (arg1.field4457 < var6) {
                arg1.field4457 = var6;
            }
        }
        if (arg1.field4452 == var5 && arg1.field4457 == var6) {
            if (arg1.field4447 > 0) {
                arg1.field4447--;
            }
            arg1.field4487--;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)V", line = 248)
    public static final void method2204(boolean arg0, int arg1) {
        field5453++;
        byte[][] var2;
        byte var3;
        if (class231.field4051 && arg0) {
            var2 = class251.field4376;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class322.field5513;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class212.method1460((byte) -16);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class134.field2325[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = (var7 & 0x3B744AA) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var7 & 0x3FFF) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class57.field838.length; var14++) {
                                if (class57.field838[var14] == var13 && var2[var14] != null) {
                                    class143.method992(arg0, var5 * 8, var2[var14], var4, var9, class330.field5644, (var11 & 0x7) * 8, var10, (var12 & 0x7) * 8, var6 * 8, arg1 ^ 0x33715B1E);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class122.method855(8, 1, var6 * 8, var4, 8, var5 * 8);
                    }
                }
            }
        }
        if (arg1 != -863066984) {
            field5447 = 76;
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 346)
    public final Object method52(int arg0) {
        field5450++;
        return arg0 == 5736 ? this.field5452 : (Object) null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 364)
    public class317(Object arg0) {
        this.field5452 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V", line = 374)
    public static void method2205(int arg0) {
        field5451 = null;
        field5449 = null;
        if (arg0 != -1) {
            method2202((byte) 116, -43, 49);
        }
        field5454 = null;
    }
}
