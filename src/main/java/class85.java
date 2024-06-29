import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class85 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "[Lca;")
    public static class54[] field1302 = new class54[2048];

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[S")
    public static short[] field1303 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ldb;")
    public static class39 field1297 = new class39(16);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILkc;)V")
    public static final void method651(int arg0, class25 arg1) {
        field1296++;
        class110 var2 = arg1.method165((byte) 65);
        arg1.field399 = var2.field1651;
        if (arg1.field441 == 0) {
            arg1.field478 = 0;
        } else {
            if (arg1.field483 != -1 && arg1.field475 == 0) {
                class220 var3 = class108.method781(arg1.field483, -1);
                if (arg1.field426 > 0 && var3.field3402 == 0) {
                    arg1.field478++;
                    return;
                }
                if (arg1.field426 <= 0 && var3.field3426 == 0) {
                    arg1.field478++;
                    return;
                }
            }
            if (arg1.field491 != -1 && class120.field1794 >= arg1.field418) {
                class104 var4 = class296.method1957(arg1.field491, true);
                if (var4.field1515 && var4.field1516 != -1) {
                    class220 var5 = class108.method781(var4.field1516, -1);
                    if (arg1.field426 > 0 && var5.field3402 == 0) {
                        arg1.field478++;
                        return;
                    }
                    if (arg1.field426 <= 0 && var5.field3426 == 0) {
                        arg1.field478++;
                        return;
                    }
                }
            }
            int var6 = arg1.field425;
            int var7 = arg1.field455;
            int var8 = arg1.field449[arg1.field441 - 1] * 128 + arg1.method168(-81) * 64;
            int var9 = arg1.field493[arg1.field441 - 1] * 128 + (arg1.method168(-89) * 64);
            if ((var8 - var6) > 256 || var8 - var6 < -256 || var9 - var7 > 256 || var9 - var7 < -256) {
                arg1.field455 = var9;
                arg1.field425 = var8;
                return;
            }
            int var10 = 4;
            int var11 = var2.field1630;
            if (var6 >= var8) {
                if (var6 > var8) {
                    if (var7 < var9) {
                        arg1.field484 = 768;
                    } else if (var9 < var7) {
                        arg1.field484 = 256;
                    } else {
                        arg1.field484 = 512;
                    }
                } else if (var7 < var9) {
                    arg1.field484 = 1024;
                } else if (var7 > var9) {
                    arg1.field484 = 0;
                }
            } else if (var7 < var9) {
                arg1.field484 = 1280;
            } else if (var7 > var9) {
                arg1.field484 = 1792;
            } else {
                arg1.field484 = 1536;
            }
            int var12 = arg1.field484 - arg1.field471 & 0x7FF;
            boolean var13 = true;
            if (var12 > 1024) {
                var12 -= 2048;
            }
            if (var12 >= -256 && var12 <= 256) {
                var11 = var2.field1631;
            } else if (var12 >= 256 && var12 < 768) {
                var11 = var2.field1653;
            } else if (var12 >= -768 && var12 <= -256) {
                var11 = var2.field1660;
            }
            if (var11 == -1) {
                var11 = var2.field1631;
            }
            arg1.field399 = var11;
            byte var14 = 1;
            if (arg1 instanceof class87) {
                var13 = ((class87) arg1).field1323.field2874;
            }
            if (var13) {
                if (arg1.field484 != arg1.field471 && arg1.field430 == -1 && arg1.field432 != 0) {
                    var10 = 2;
                }
                if (arg1.field441 > 2) {
                    var10 = 6;
                }
                if (arg1.field441 > 3) {
                    var10 = 8;
                }
                if (arg1.field478 > 0 && arg1.field441 > 1) {
                    var10 = 8;
                    arg1.field478--;
                }
            } else {
                if (arg1.field441 > 1) {
                    var10 = 6;
                }
                if (arg1.field441 > 2) {
                    var10 = 8;
                }
                if (arg1.field478 > 0 && arg1.field441 > 1) {
                    arg1.field478--;
                    var10 = 8;
                }
            }
            if (arg1.field400[arg1.field441 - 1] == 2) {
                var10 <<= 0x1;
                var14 = 2;
            } else if (arg1.field400[arg1.field441 - 1] == 0) {
                var10 >>= 0x1;
                var14 = 0;
            }
            if (var10 < 8 || var2.field1636 == -1) {
                if (var2.field1650 != -1 && var14 == 0) {
                    if (arg1.field399 == var2.field1630 && var2.field1658 != -1) {
                        arg1.field399 = var2.field1658;
                    } else if (arg1.field399 == var2.field1660 && var2.field1652 != -1) {
                        arg1.field399 = var2.field1652;
                    } else if (arg1.field399 == var2.field1653 && var2.field1670 != -1) {
                        arg1.field399 = var2.field1670;
                    } else {
                        arg1.field399 = var2.field1650;
                    }
                }
            } else if (arg1.field399 == var2.field1630 && var2.field1634 != -1) {
                arg1.field399 = var2.field1634;
            } else if (arg1.field399 == var2.field1660 && var2.field1646 != -1) {
                arg1.field399 = var2.field1646;
            } else if (arg1.field399 == var2.field1653 && var2.field1642 != -1) {
                arg1.field399 = var2.field1642;
            } else {
                arg1.field399 = var2.field1636;
            }
            if (var2.field1637 != -1) {
                int var15 = var10 << 7;
                if (arg1.field441 == 1) {
                    int var16 = (var8 >= arg1.field425 ? var8 - arg1.field425 : arg1.field425 - var8) << 7;
                    int var17 = arg1.field465 * arg1.field465;
                    int var18 = (arg1.field455 > var9 ? arg1.field455 - var9 : -arg1.field455 + var9) << 7;
                    int var19 = var18 < var16 ? var16 : var18;
                    int var20 = var2.field1637 * 2 * var19;
                    if (var17 > var20) {
                        arg1.field465 /= 2;
                    } else if (var17 / 2 > var19) {
                        arg1.field465 -= var2.field1637;
                        if (arg1.field465 < 0) {
                            arg1.field465 = 0;
                        }
                    } else if (arg1.field465 < var15) {
                        arg1.field465 += var2.field1637;
                        if (var15 < arg1.field465) {
                            arg1.field465 = var15;
                        }
                    }
                } else if (var15 > arg1.field465) {
                    arg1.field465 += var2.field1637;
                    if (arg1.field465 > var15) {
                        arg1.field465 = var15;
                    }
                } else if (arg1.field465 > 0) {
                    arg1.field465 -= var2.field1637;
                    if (arg1.field465 < 0) {
                        arg1.field465 = 0;
                    }
                }
                var10 = arg1.field465 >> 7;
                if (var10 < 1) {
                    var10 = 1;
                }
            }
            if (var8 > var6) {
                arg1.field425 += var10;
                if (var8 < arg1.field425) {
                    arg1.field425 = var8;
                }
            } else if (var6 > var8) {
                arg1.field425 -= var10;
                if (var8 > arg1.field425) {
                    arg1.field425 = var8;
                }
            }
            if (var9 > var7) {
                arg1.field455 += var10;
                if (arg1.field455 > var9) {
                    arg1.field455 = var9;
                }
            } else if (var9 < var7) {
                arg1.field455 -= var10;
                if (arg1.field455 < var9) {
                    arg1.field455 = var9;
                }
            }
            if (arg1.field425 == var8 && arg1.field455 == var9) {
                if (arg1.field426 > 0) {
                    arg1.field426--;
                }
                arg1.field441--;
            }
        }
        if (arg0 != -1) {
            method655(-93, -95);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZZ)V")
    public static final void method652(int arg0, int arg1, boolean arg2, boolean arg3) {
        field1300++;
        if (arg3) {
            field1305 = -22;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class174.field2547 = arg1;
        class133.field1955 = arg2;
        class75.field1195 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method653(boolean arg0) {
        field1303 = null;
        field1302 = null;
        if (!arg0) {
            field1297 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lfe;")
    public static final class134 method654(byte arg0, int arg1) {
        field1301++;
        class134 var2 = (class134) class69.field1141.method675(31558, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 35) {
            byte[] var3 = class23.field384.method1605(-125, arg1, 26);
            class134 var4 = new class134();
            if (var3 != null) {
                var4.method924(new class54(var3), 0);
            }
            class69.field1141.method677((byte) -38, (long) arg1, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public static final void method655(int arg0, int arg1) {
        field1299++;
        if (arg0 != -7263) {
            method651(23, (class25) null);
        }
        class157.field2302.method938(arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
    public static final int method656(int arg0, byte arg1) {
        int var2 = -12 % ((arg1 - 73) / 50);
        field1295++;
        return arg0 >>> 8;
    }
}
