import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class48 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "F")
    public static float field641;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lrn;")
    public static class161 field644;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)[B")
    public abstract byte[] method341(byte arg0);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BZ)V")
    public abstract void method342(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lmr;BZ)V")
    public static final void method343(class86 arg0, byte arg1, boolean arg2) {
        field646++;
        class280 var3 = arg0.method549(-106);
        if (arg0.field1203 == 0) {
            arg0.field1196 = 0;
            class95.field1401 = 0;
            class199.field2695 = -1;
            return;
        }
        if (arg0.field1137 != -1 && arg0.field1130 == 0) {
            class181 var4 = class395.field5477.method266(16107, arg0.field1137);
            if (arg0.field1202 > 0 && var4.field2476 == 0) {
                class95.field1401 = 0;
                class199.field2695 = -1;
                arg0.field1196++;
                return;
            }
            if (arg0.field1202 <= 0 && var4.field2478 == 0) {
                class199.field2695 = -1;
                class95.field1401 = 0;
                arg0.field1196++;
                return;
            }
        }
        if (arg0.field1134 != -1 && arg0.field1135 <= class70.field968) {
            class248 var5 = class302.field4030.method1394(arg0.field1134, -7290);
            if (var5.field3305 && var5.field3310 != -1) {
                class181 var6 = class395.field5477.method266(16107, var5.field3310);
                if (arg0.field1202 > 0 && var6.field2476 == 0) {
                    class95.field1401 = 0;
                    arg0.field1196++;
                    class199.field2695 = -1;
                    return;
                }
                if (arg0.field1202 <= 0 && var6.field2478 == 0) {
                    arg0.field1196++;
                    class199.field2695 = -1;
                    class95.field1401 = 0;
                    return;
                }
            }
        }
        int var7 = arg0.field6501;
        int var8 = arg0.field6507;
        int var9 = arg0.field1193[arg0.field1203 - 1] * 128 + (arg0.method545(false) * 64);
        int var10 = arg0.field1197[arg0.field1203 - 1] * 128 + (arg0.method545(false) * 64);
        if (var9 > var7) {
            if (var8 < var10) {
                arg0.method542(10240, 34);
            } else if (var10 >= var8) {
                arg0.method542(12288, -113);
            } else {
                arg0.method542(14336, 60);
            }
        } else if (var7 > var9) {
            if (var10 > var8) {
                arg0.method542(6144, arg1 - 118);
            } else if (var8 > var10) {
                arg0.method542(2048, arg1 - 115);
            } else {
                arg0.method542(4096, -125);
            }
        } else if (var10 > var8) {
            arg0.method542(8192, -111);
        } else if (var10 < var8) {
            arg0.method542(0, arg1 - 119);
        }
        if (arg1 != -1) {
            method346((class32) null, -120);
        }
        byte var11 = arg0.field1195[arg0.field1203 - 1];
        if (!arg2 && ((var9 - var7) > 256 || (var9 - var7) < -256 || var10 - var8 > 256 || var10 - var8 < -256)) {
            arg0.field6507 = var10;
            arg0.field6501 = var9;
            arg0.method547(arg0.field1159, 124);
            arg0.field1203--;
            class199.field2695 = -1;
            if (arg0.field1202 > 0) {
                arg0.field1202--;
            }
            class95.field1401 = 0;
            return;
        }
        int var12 = 4;
        boolean var13 = true;
        if (arg0 instanceof class121) {
            var13 = ((class121) arg0).field1780.field5809;
        }
        if (var13) {
            int var14 = arg0.field1159 - arg0.field1143.field6472;
            if (var14 != 0 && arg0.field1154 == -1 && arg0.field1147 != 0) {
                var12 = 2;
            }
            if (!arg2 && arg0.field1203 > 2) {
                var12 = 6;
            }
            if (!arg2 && arg0.field1203 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg2 && arg0.field1203 > 1) {
                var12 = 6;
            }
            if (!arg2 && arg0.field1203 > 2) {
                var12 = 8;
            }
        }
        if (arg0.field1196 > 0 && arg0.field1203 > 1) {
            arg0.field1196--;
            var12 = 8;
        }
        if (var11 == 2) {
            var12 <<= 0x1;
        } else if (var11 == 0) {
            var12 >>= 0x1;
        }
        class95.field1401 = 0;
        if (var3.field3729 != -1) {
            int var15 = var12 << 7;
            if (arg0.field1203 == 1) {
                int var16 = arg0.field1194 * arg0.field1194;
                int var17 = (var9 >= arg0.field6501 ? var9 - arg0.field6501 : -var9 + arg0.field6501) << 7;
                int var18 = (arg0.field6507 <= var10 ? var10 - arg0.field6507 : -var10 + arg0.field6507) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var3.field3729 * var19 * 2;
                if (var16 > var20) {
                    arg0.field1194 /= 2;
                } else if (var19 < var16 / 2) {
                    arg0.field1194 -= var3.field3729;
                    if (arg0.field1194 < 0) {
                        arg0.field1194 = 0;
                    }
                } else if (var15 > arg0.field1194) {
                    arg0.field1194 += var3.field3729;
                    if (var15 < arg0.field1194) {
                        arg0.field1194 = var15;
                    }
                }
            } else if (var15 > arg0.field1194) {
                arg0.field1194 += var3.field3729;
                if (var15 < arg0.field1194) {
                    arg0.field1194 = var15;
                }
            } else if (arg0.field1194 > 0) {
                arg0.field1194 -= var3.field3729;
                if (arg0.field1194 < 0) {
                    arg0.field1194 = 0;
                }
            }
            var12 = arg0.field1194 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var7 < var9) {
            class95.field1401 |= 0x4;
            arg0.field6501 += var12;
            if (var9 < arg0.field6501) {
                arg0.field6501 = var9;
            }
        } else if (var9 < var7) {
            class95.field1401 |= 0x8;
            arg0.field6501 -= var12;
            if (var9 > arg0.field6501) {
                arg0.field6501 = var9;
            }
        }
        if (var8 < var10) {
            arg0.field6507 += var12;
            class95.field1401 |= 0x1;
            if (var10 < arg0.field6507) {
                arg0.field6507 = var10;
            }
        } else if (var8 > var10) {
            class95.field1401 |= 0x2;
            arg0.field6507 -= var12;
            if (var10 > arg0.field6507) {
                arg0.field6507 = var10;
            }
        }
        if (var12 < 8) {
            class199.field2695 = var11;
        } else {
            class199.field2695 = 2;
        }
        if (arg0.field6501 != var9 || arg0.field6507 != var10) {
            return;
        }
        arg0.field1203--;
        if (arg0.field1202 > 0) {
            arg0.field1202--;
            return;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V")
    public static final void method344(byte arg0, int arg1) {
        int var2 = -46 % ((57 - arg0) / 35);
        field643++;
        class487.field6779 = arg1;
        class76 var3 = class26.field324;
        synchronized (class26.field324) {
            class26.field324.method495(-77);
        }
        class76 var4 = class142.field2052;
        synchronized (class142.field2052) {
            class142.field2052.method495(-75);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method345(int arg0) {
        if (arg0 == 17685) {
            field644 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lbt;I)V")
    public static final void method346(class32 arg0, int arg1) {
        field642++;
        int var2 = arg0.method203((byte) -77);
        int var3 = -73 / ((38 - arg1) / 58);
        class94.field1399 = new class13[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class94.field1399[var4] = new class13();
            class94.field1399[var4].field178 = arg0.method203((byte) -113);
            class94.field1399[var4].field177 = arg0.method242(77);
        }
        class385.field5320 = arg0.method203((byte) -108);
        class124.field1816 = arg0.method203((byte) -87);
        class52.field688 = arg0.method203((byte) -81);
        class110.field1680 = new class348[class124.field1816 + 1 - class385.field5320];
        for (int var5 = 0; var5 < class52.field688; var5++) {
            int var6 = arg0.method203((byte) -120);
            class348 var7 = class110.field1680[var6] = new class348();
            var7.field672 = arg0.method201((byte) -118);
            var7.field670 = arg0.method222(1024);
            var7.field4786 = var6 + class385.field5320;
            var7.field4788 = arg0.method242(76);
            var7.field4791 = arg0.method242(101);
        }
        class190.field2582 = arg0.method222(1024);
        class341.field4562 = true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lr;Ljava/lang/String;ZI)Lih;")
    public static final class455 method347(class110 arg0, String arg1, boolean arg2, int arg3) {
        field645++;
        int var4 = arg0.method688((byte) 87, arg1);
        if (var4 == -1) {
            return new class455(0);
        }
        if (arg3 != -2) {
            field644 = null;
        }
        int[] var5 = arg0.method690(var4, true);
        class455 var6 = new class455(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field6168) {
                class32 var9 = new class32(arg0.method702((byte) 85, var5[var8++], var4));
                int var10 = var9.method222(arg3 ^ 0xFFFFFBFE);
                int var11 = var9.method215((byte) 115);
                int var12 = var9.method201((byte) -128);
                if (!arg2 && var12 == 1) {
                    var6.field6168--;
                } else {
                    var6.field6167[var7] = var10;
                    var6.field6169[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }
}
