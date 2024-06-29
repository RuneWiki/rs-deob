import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class443 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field6884 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[F")
    public static float[] field6881 = new float[4];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lkj;ZB)V")
    public static final void method2804(class55 arg0, boolean arg1, byte arg2) {
        field6885++;
        class289 var3 = arg0.method418((byte) -41);
        if (arg0.field898 == 0) {
            class438.field6804 = 0;
            arg0.field900 = 0;
            class540.field7894 = -1;
            return;
        }
        if (arg0.field840 != -1 && arg0.field836 == 0) {
            class363 var4 = class388.field5915.method1703(arg0.field840, -12536);
            if (arg0.field893 > 0 && var4.field5622 == 0) {
                class540.field7894 = -1;
                class438.field6804 = 0;
                arg0.field900++;
                return;
            }
            if (arg0.field893 <= 0 && var4.field5624 == 0) {
                class540.field7894 = -1;
                class438.field6804 = 0;
                arg0.field900++;
                return;
            }
        }
        if (arg0.field844 != -1 && arg0.field813 <= class88.field1278) {
            class279 var5 = class85.field1242.method1972((byte) -58, arg0.field844);
            if (var5.field4419 && var5.field4398 != -1) {
                class363 var6 = class388.field5915.method1703(var5.field4398, -12536);
                if (arg0.field893 > 0 && var6.field5622 == 0) {
                    class438.field6804 = 0;
                    arg0.field900++;
                    class540.field7894 = -1;
                    return;
                }
                if (arg0.field893 <= 0 && var6.field5624 == 0) {
                    arg0.field900++;
                    class540.field7894 = -1;
                    class438.field6804 = 0;
                    return;
                }
            }
        }
        if (arg0.field844 != -1 && arg0.field813 <= class88.field1278) {
            class279 var7 = class85.field1242.method1972((byte) -58, arg0.field844);
            if (var7.field4419 && var7.field4398 != -1) {
                class363 var8 = class388.field5915.method1703(var7.field4398, -12536);
                if (arg0.field893 > 0 && var8.field5622 == 0) {
                    class540.field7894 = -1;
                    class438.field6804 = 0;
                    arg0.field900++;
                    return;
                }
                if (arg0.field893 <= 0 && var8.field5624 == 0) {
                    class540.field7894 = -1;
                    class438.field6804 = 0;
                    arg0.field900++;
                    return;
                }
            }
        }
        int var9 = arg0.field6417;
        int var10 = arg0.field6410;
        int var11 = arg0.field894[arg0.field898 - 1] * 128 + (arg0.method415(-4) * 64);
        int var12 = arg0.field899[arg0.field898 - 1] * 128 + (arg0.method415(arg2 ^ 0xFFFFFF85) * 64);
        if (var9 < var11) {
            if (var10 < var12) {
                arg0.method428(10240, (byte) -126);
            } else if (var10 > var12) {
                arg0.method428(14336, (byte) 86);
            } else {
                arg0.method428(12288, (byte) 2);
            }
        } else if (var11 < var9) {
            if (var12 > var10) {
                arg0.method428(6144, (byte) -119);
            } else if (var10 <= var12) {
                arg0.method428(4096, (byte) 118);
            } else {
                arg0.method428(2048, (byte) -10);
            }
        } else if (var10 < var12) {
            arg0.method428(8192, (byte) -15);
        } else if (var10 > var12) {
            arg0.method428(0, (byte) 94);
        }
        byte var13 = arg0.field895[arg0.field898 - 1];
        if (!arg1 && (var11 - var9) > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || var12 - var10 < -256) {
            arg0.field6417 = var11;
            arg0.field6410 = var12;
            arg0.method426(false, arg0.field849, (byte) -111);
            class540.field7894 = -1;
            if (arg0.field893 > 0) {
                arg0.field893--;
            }
            class438.field6804 = 0;
            arg0.field898--;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class378) {
            var15 = ((class378) arg0).field5809.field2793;
        }
        if (var15) {
            int var16 = arg0.field849 - arg0.field887.field7375;
            if (var16 != 0 && arg0.field829 == -1 && arg0.field850 != 0) {
                var14 = 2;
            }
            if (!arg1 && arg0.field898 > 2) {
                var14 = 6;
            }
            if (!arg1 && arg0.field898 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg1 && arg0.field898 > 1) {
                var14 = 6;
            }
            if (!arg1 && arg0.field898 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field900 > 0 && arg0.field898 > 1) {
            arg0.field900--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class438.field6804 = 0;
        if (var3.field4525 != -1) {
            int var17 = var14 << 7;
            if (arg0.field898 == 1) {
                int var18 = arg0.field897 * arg0.field897;
                int var19 = (arg0.field6417 <= var11 ? var11 - arg0.field6417 : -var11 + arg0.field6417) << 7;
                int var20 = (var12 < arg0.field6410 ? arg0.field6410 - var12 : -arg0.field6410 + var12) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field4525 * 2 * var21;
                if (var22 < var18) {
                    arg0.field897 /= 2;
                } else if ((var18 / 2) > var21) {
                    arg0.field897 -= var3.field4525;
                    if (arg0.field897 < 0) {
                        arg0.field897 = 0;
                    }
                } else if (arg0.field897 < var17) {
                    arg0.field897 += var3.field4525;
                    if (arg0.field897 > var17) {
                        arg0.field897 = var17;
                    }
                }
            } else if (arg0.field897 < var17) {
                arg0.field897 += var3.field4525;
                if (var17 < arg0.field897) {
                    arg0.field897 = var17;
                }
            } else if (arg0.field897 > 0) {
                arg0.field897 -= var3.field4525;
                if (arg0.field897 < 0) {
                    arg0.field897 = 0;
                }
            }
            var14 = arg0.field897 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (arg2 != 121) {
            method2804(null, false, (byte) 23);
        }
        if (var9 == var11 && var10 == var12) {
            class540.field7894 = -1;
        } else {
            if (var9 < var11) {
                class438.field6804 |= 0x4;
                arg0.field6417 += var14;
                if (arg0.field6417 > var11) {
                    arg0.field6417 = var11;
                }
            } else if (var11 < var9) {
                arg0.field6417 -= var14;
                class438.field6804 |= 0x8;
                if (arg0.field6417 < var11) {
                    arg0.field6417 = var11;
                }
            }
            if (var10 < var12) {
                arg0.field6410 += var14;
                class438.field6804 |= 0x1;
                if (arg0.field6410 > var12) {
                    arg0.field6410 = var12;
                }
            } else if (var10 > var12) {
                arg0.field6410 -= var14;
                class438.field6804 |= 0x2;
                if (var12 > arg0.field6410) {
                    arg0.field6410 = var12;
                }
            }
            if (var14 < 8) {
                class540.field7894 = var13;
            } else {
                class540.field7894 = 2;
            }
        }
        if (arg0.field6417 == var11 && arg0.field6410 == var12) {
            if (arg0.field893 > 0) {
                arg0.field893--;
            }
            arg0.field898--;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method2805(byte arg0) {
        if (arg0 != -4) {
            method2804(null, true, (byte) -117);
        }
        field6881 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILmn;)V")
    public static final void method2806(int arg0, class162 arg1) {
        class426.field6447 = arg1.method1014(true, "titlebg");
        field6883++;
        if (arg0 < 23) {
            field6884 = 66;
        }
        class349.field5405 = arg1.method1014(true, "logo");
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(CI)Z")
    public static final boolean method2807(char arg0, int arg1) {
        if (arg1 == -1719) {
            field6882++;
            return arg0 >= '0' && arg0 <= '9';
        } else {
            return true;
        }
    }
}
