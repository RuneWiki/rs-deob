import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class350 extends class172 {

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static volatile int field5548 = 0;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field5549 = -1;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Ljava/lang/String;")
    public static String field5562 = "Checking for updates - ";

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Z")
    public static boolean field5564 = false;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public static int field5565 = 0;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Ljava/lang/String;")
    public static String field5559 = "yellow:";

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "[I")
    public static int[] field5569 = new int[14];

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field5570 = "Loading sprites - ";

    @OriginalMember(owner = "client!i", name = "L", descriptor = "C")
    private char field5550;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public int field5554;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "Ljava/lang/String;")
    public String field5568;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "[I")
    public static int[] field5566;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILqm;B)V", line = 5)
    private final void method2458(int arg0, class227 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field5550 = class240.method1832(arg1.method1733(0), arg2 ^ 0x3B26);
        } else if (arg0 == 2) {
            this.field5554 = arg1.method1715((byte) -92);
        } else if (arg0 == 5) {
            this.field5568 = arg1.method1758((byte) 60);
        }
        if (arg2 != 84) {
            field5551 = 26;
        }
        field5557++;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 30)
    public static final void method2459(int arg0) {
        field5561++;
        int var1 = class32.field457 * 128 + 64;
        int var2 = class296.field4767 * 128 + 64;
        int var3 = class271.method2034(arg0 - 2048, var2, var1, class186.field2991) - class49.field784;
        if (class336.field5309 >= 100) {
            class229.field3807 = class296.field4767 * 128 + 64;
            class281.field4617 = class32.field457 * 128 + 64;
            class206.field3250 = class271.method2034(-1, class229.field3807, class281.field4617, class186.field2991) - class49.field784;
        } else {
            if (var3 > class206.field3250) {
                class206.field3250 += (var3 - class206.field3250) * class336.field5309 / 1000 + class258.field4347;
                if (var3 < class206.field3250) {
                    class206.field3250 = var3;
                }
            }
            if (var2 > class229.field3807) {
                class229.field3807 += (var2 - class229.field3807) * class336.field5309 / 1000 + class258.field4347;
                if (class229.field3807 > var2) {
                    class229.field3807 = var2;
                }
            }
            if (class281.field4617 < var1) {
                class281.field4617 += class258.field4347 + ((var1 - class281.field4617) * class336.field5309 / 1000);
                if (var1 < class281.field4617) {
                    class281.field4617 = var1;
                }
            }
            if (var1 < class281.field4617) {
                class281.field4617 -= (class281.field4617 - var1) * class336.field5309 / 1000 + class258.field4347;
                if (var1 > class281.field4617) {
                    class281.field4617 = var1;
                }
            }
            if (class206.field3250 > var3) {
                class206.field3250 -= (class206.field3250 - var3) * class336.field5309 / 1000 + class258.field4347;
                if (class206.field3250 < var3) {
                    class206.field3250 = var3;
                }
            }
            if (class229.field3807 > var2) {
                class229.field3807 -= (class229.field3807 - var2) * class336.field5309 / 1000 + class258.field4347;
                if (var2 > class229.field3807) {
                    class229.field3807 = var2;
                }
            }
        }
        int var4 = class27.field328 * 128 + 64;
        int var5 = class234.field3883 * 128 + 64;
        int var6 = class271.method2034(-1, var4, var5, class186.field2991) - class330.field5249;
        int var7 = var4 - class229.field3807;
        int var8 = var6 - class206.field3250;
        int var9 = var5 - class281.field4617;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = arg0 & (int) (-325.949D * Math.atan2((double) var9, (double) var7));
        int var13 = var12 - class176.field2818;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class194.field3095 < var11) {
            class194.field3095 += (var11 - class194.field3095) * class353.field5590 / 1000 + class255.field4299;
            if (var11 < class194.field3095) {
                class194.field3095 = var11;
            }
        }
        if (var11 < class194.field3095) {
            class194.field3095 -= (class194.field3095 - var11) * class353.field5590 / 1000 + class255.field4299;
            if (class194.field3095 < var11) {
                class194.field3095 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class176.field2818 += class353.field5590 * var13 / 1000 + class255.field4299;
            class176.field2818 &= 0x7FF;
        }
        if (var13 < 0) {
            class176.field2818 -= -var13 * class353.field5590 / 1000 + class255.field4299;
            class176.field2818 &= 0x7FF;
        }
        int var14 = var12 - class176.field2818;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class176.field2818 = var12;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)Z", line = 181)
    public final boolean method2460(byte arg0) {
        field5555++;
        if (arg0 != -9) {
            this.field5554 = 92;
        }
        return this.field5550 == 's';
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 202)
    public static final void method2461(int arg0) {
        class36.field520.method2228(148, 16547);
        field5567++;
        if (arg0 < -68) {
            class76.field1295++;
            class36.field520.method1729(class215.field3442, 206);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLqm;)V", line = 218)
    public final void method2462(byte arg0, class227 arg1) {
        while (true) {
            int var3 = arg1.method1720((byte) -110);
            if (var3 == 0) {
                if (arg0 != 15) {
                    return;
                }
                field5558++;
                return;
            }
            this.method2458(var3, arg1, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)V", line = 235)
    public static final void method2463(int arg0, int arg1, int arg2) {
        class2.field7 = arg0 - class174.field2772;
        class198.field3162 = class174.field2773 + class174.field2780 - arg1 - arg2;
        field5553++;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V", line = 247)
    public static final void method2464(byte arg0) {
        class166.field2625.method2326(-4);
        field5556++;
        if (arg0 < 88) {
            field5559 = (String) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBI)V", line = 259)
    public static final void method2465(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class354 var5 = (class354) class329.field5229.method1268(-117, (long) arg4);
        if (var5 == null) {
            var5 = new class354();
            class329.field5229.method1273(1, (long) arg4, var5);
        }
        if (arg3 < 57) {
            method2463(-99, 5, 36);
        }
        if (arg0 >= var5.field5617.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field5617.length; var8++) {
                var7[var8] = var5.field5617[var8];
                var6[var8] = var5.field5622[var8];
            }
            for (int var9 = var5.field5617.length; var9 < arg0; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field5622 = var6;
            var5.field5617 = var7;
        }
        field5552++;
        var5.field5617[arg0] = arg1;
        var5.field5622[arg0] = arg2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V", line = 325)
    public static final void method2466(byte arg0, int arg1) {
        if (arg0 != 83) {
            method2461(-29);
        }
        class321 var2 = class46.method370(4, (byte) -106, arg1);
        field5563++;
        var2.method2261(-129);
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V", line = 344)
    public static void method2467(int arg0) {
        field5569 = null;
        field5562 = null;
        field5570 = null;
        field5559 = null;
        if (arg0 != 1000) {
            field5549 = 4;
        }
        field5566 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)Z", line = 358)
    public static final boolean method2468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5560++;
        long var8 = class252.method1955(arg1, arg0 + arg4, arg5 + arg7);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x3DF2C0) >> 20;
            int var11 = ((int) var8 & 0x7DD40) >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class29 var13 = class166.method1292(0, var12);
            if (var13.field363 == -1) {
                int var14 = arg6;
                if (var8 > 0L) {
                    var14 = arg2;
                }
                int[] var15 = class246.field4036;
                int var16 = (arg4 * 4) + ((-arg7 + 103) * 512 * 4) + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else if (!class226.method1704(arg7, false, arg4, var10, var13, arg5, arg0)) {
                return false;
            }
        }
        if (arg3 != 2047) {
            field5569 = (int[]) null;
        }
        long var17 = class1.method1(arg1, arg0 + arg4, arg7 - -arg5);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = ((int) var17 & 0x7E43B) >> 14;
            class29 var22 = class166.method1292(arg3 ^ 0x7FF, var20);
            if (var22.field363 == -1) {
                if (var21 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class246.field4036;
                    int var25 = 24624 - (-((103 - arg7) * 4 * 512) - (arg4 * 4));
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 513] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class226.method1704(arg7, false, arg4, var19, var22, arg5, arg0)) {
                return false;
            }
        }
        long var26 = class117.method922(arg1, arg4 + arg0, arg5 + arg7);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class29 var30 = class166.method1292(arg3 - 2047, var29);
            if (var30.field363 != -1 && !class226.method1704(arg7, false, arg4, var28, var30, arg5, arg0)) {
                return false;
            }
        }
        return true;
    }
}
