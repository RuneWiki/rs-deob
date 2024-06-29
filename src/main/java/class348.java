import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class348 {

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field4669 = 0;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "Lh;")
    public static class571 field4671 = new class571(8);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZBLbe;)V")
    public static final void method2095(boolean arg0, byte arg1, class33 arg2) {
        field4668++;
        class107 var3 = arg2.method349(true);
        if (arg2.field617 == 0) {
            class155.field2315 = -1;
            class152.field2303 = 0;
            arg2.field619 = 0;
            return;
        }
        if (arg2.field535 != -1 && arg2.field584 == 0) {
            class78 var4 = class331.field4418.method195(arg2.field535, (byte) 13);
            if (arg2.field621 > 0 && var4.field1275 == 0) {
                class152.field2303 = 0;
                arg2.field619++;
                class155.field2315 = -1;
                return;
            }
            if (arg2.field621 <= 0 && var4.field1288 == 0) {
                class152.field2303 = 0;
                arg2.field619++;
                class155.field2315 = -1;
                return;
            }
        }
        if (arg2.field556 != -1 && arg2.field576 <= class405.field5763) {
            class258 var5 = class78.field1263.method1564(arg2.field556, 5);
            if (var5.field3590 && var5.field3583 != -1) {
                class78 var6 = class331.field4418.method195(var5.field3583, (byte) 13);
                if (arg2.field621 > 0 && var6.field1275 == 0) {
                    class155.field2315 = -1;
                    class152.field2303 = 0;
                    arg2.field619++;
                    return;
                }
                if (arg2.field621 <= 0 && var6.field1288 == 0) {
                    arg2.field619++;
                    class152.field2303 = 0;
                    class155.field2315 = -1;
                    return;
                }
            }
        }
        if (arg2.field556 != -1 && class405.field5763 >= arg2.field576) {
            class258 var7 = class78.field1263.method1564(arg2.field556, 5);
            if (var7.field3590 && var7.field3583 != -1) {
                class78 var8 = class331.field4418.method195(var7.field3583, (byte) 13);
                if (arg2.field621 > 0 && var8.field1275 == 0) {
                    arg2.field619++;
                    class152.field2303 = 0;
                    class155.field2315 = -1;
                    return;
                }
                if (arg2.field621 <= 0 && var8.field1288 == 0) {
                    class155.field2315 = -1;
                    arg2.field619++;
                    class152.field2303 = 0;
                    return;
                }
            }
        }
        int var9 = arg2.field6037;
        int var10 = arg2.field6029;
        int var11 = arg2.field616[arg2.field617 - 1] * 128 + arg2.method337(0) * 64;
        if (arg1 > -11) {
            return;
        }
        int var12 = arg2.field618[arg2.field617 - 1] * 128 + arg2.method337(0) * 64;
        if (var9 >= var11) {
            if (var9 > var11) {
                if (var10 < var12) {
                    arg2.method348((byte) 28, 6144);
                } else if (var12 >= var10) {
                    arg2.method348((byte) 28, 4096);
                } else {
                    arg2.method348((byte) 28, 2048);
                }
            } else if (var10 < var12) {
                arg2.method348((byte) 28, 8192);
            } else if (var10 > var12) {
                arg2.method348((byte) 28, 0);
            }
        } else if (var12 > var10) {
            arg2.method348((byte) 28, 10240);
        } else if (var12 >= var10) {
            arg2.method348((byte) 28, 12288);
        } else {
            arg2.method348((byte) 28, 14336);
        }
        byte var13 = arg2.field620[arg2.field617 - 1];
        if (!arg0 && (var11 - var9 > 256 || var11 - var9 < -256 || (var12 - var10) > 256 || (var12 - var10) < -256)) {
            arg2.field6029 = var12;
            arg2.field6037 = var11;
            arg2.method341(false, arg2.field559, -96);
            arg2.field617--;
            class152.field2303 = 0;
            class155.field2315 = -1;
            if (arg2.field621 > 0) {
                arg2.field621--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg2 instanceof class109) {
            var15 = ((class109) arg2).field1669.field8582;
        }
        if (var15) {
            int var16 = arg2.field559 - arg2.field579.field2616;
            if (var16 != 0 && arg2.field532 == -1 && arg2.field610 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg2.field617 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg2.field617 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg2.field617 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg2.field617 > 2) {
                var14 = 8;
            }
        }
        if (arg2.field619 > 0 && arg2.field617 > 1) {
            var14 = 8;
            arg2.field619--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field1632 != -1) {
            int var17 = var14 << 7;
            if (arg2.field617 == 1) {
                int var18 = arg2.field614 * arg2.field614;
                int var19 = (var11 >= arg2.field6037 ? var11 - arg2.field6037 : -var11 + arg2.field6037) << 7;
                int var20 = (var12 < arg2.field6029 ? arg2.field6029 - var12 : -arg2.field6029 + var12) << 7;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field1632 * var21 * 2;
                if (var22 < var18) {
                    arg2.field614 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg2.field614 -= var3.field1632;
                    if (arg2.field614 < 0) {
                        arg2.field614 = 0;
                    }
                } else if (var17 > arg2.field614) {
                    arg2.field614 += var3.field1632;
                    if (var17 < arg2.field614) {
                        arg2.field614 = var17;
                    }
                }
            } else if (var17 > arg2.field614) {
                arg2.field614 += var3.field1632;
                if (arg2.field614 > var17) {
                    arg2.field614 = var17;
                }
            } else if (arg2.field614 > 0) {
                arg2.field614 -= var3.field1632;
                if (arg2.field614 < 0) {
                    arg2.field614 = 0;
                }
            }
            var14 = arg2.field614 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class152.field2303 = 0;
        if (var9 == var11 && var10 == var12) {
            class155.field2315 = -1;
        } else {
            if (var11 > var9) {
                class152.field2303 |= 0x4;
                arg2.field6037 += var14;
                if (var11 < arg2.field6037) {
                    arg2.field6037 = var11;
                }
            } else if (var11 < var9) {
                class152.field2303 |= 0x8;
                arg2.field6037 -= var14;
                if (arg2.field6037 < var11) {
                    arg2.field6037 = var11;
                }
            }
            if (var12 > var10) {
                class152.field2303 |= 0x1;
                arg2.field6029 += var14;
                if (var12 < arg2.field6029) {
                    arg2.field6029 = var12;
                }
            } else if (var12 < var10) {
                class152.field2303 |= 0x2;
                arg2.field6029 -= var14;
                if (var12 > arg2.field6029) {
                    arg2.field6029 = var12;
                }
            }
            if (var14 >= 8) {
                class155.field2315 = 2;
            } else {
                class155.field2315 = var13;
            }
        }
        if (arg2.field6037 != var11 || arg2.field6029 != var12) {
            return;
        }
        arg2.field617--;
        if (arg2.field621 > 0) {
            arg2.field621--;
            return;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIF[FBII)V")
    public static final void method2096(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float[] arg6, byte arg7, int arg8, int arg9) {
        int var10 = arg1 - arg4;
        int var11 = arg9 - arg8;
        int var12 = arg3 - arg2;
        field4670++;
        float var13 = arg6[2] * (float) var11 + arg6[1] * (float) var10 + arg6[0] * (float) var12;
        float var14 = arg6[5] * (float) var11 + arg6[3] * (float) var12 + arg6[4] * (float) var10;
        float var15 = arg6[8] * (float) var11 + arg6[7] * (float) var10 + arg6[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        if (arg7 != -40) {
            field4672 = 74;
        }
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg5 + 0.5F;
        if (arg0 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg0 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg0 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class95.field1457 = var17;
        class440.field6281 = var18;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static void method2097(byte arg0) {
        field4671 = null;
        int var1 = 65 % ((arg0 - 4) / 52);
    }
}
