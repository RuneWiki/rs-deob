import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class417 extends class397 implements class500 {

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    private int field5553;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "[I")
    public static int[] field5550 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "Z")
    public static boolean field5549 = false;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "F")
    public static float field5555;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
    public final int method350(byte arg0) {
        if (arg0 != -42) {
            this.method349(68);
        }
        ++field5556;
        return 0;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lgk;ILjaggl/memory/NativeBuffer;)V")
    public class417(class463 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field5553 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lwt;II)V")
    public static final void method2452(class16 arg0, int arg1, int arg2) {
        ++field5552;
        boolean var3 = arg0.method100((byte) 35, 1) == 1;
        if (var3) {
            class290.field3718[class415.field5519++] = arg1;
        }
        int var4 = arg0.method100((byte) -98, 2);
        class518 var5 = class76.field952[arg1];
        if (~var4 == -1) {
            if (var3) {
                var5.field7651 = false;
            } else if (~class166.field2149 == ~arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class117 var6 = class351.field4491[arg1] = new class117();
                var6.field1635 = (var5.field5251[0] + class336.field4299 >> 6) + (var5.field5246[0] + class35.field545 >> 6 << 14) + (var5.field6220 << 28);
                if (var5.field7668 == -1) {
                    var6.field1640 = var5.field5209.method336(false);
                } else {
                    var6.field1640 = var5.field7668;
                }
                var6.field1642 = var5.field7649;
                var6.field1634 = var5.field5202;
                if (~var5.field7662 < -1) {
                    class264.method1647((byte) -49, var5);
                }
                class76.field952[arg1] = null;
                if (arg0.method100((byte) -95, 1) != 0) {
                    class25.method170(arg1, arg0, false);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method100((byte) 12, 3);
            int var8 = var5.field5246[0];
            int var9 = var5.field5251[0];
            if (var7 != 0) {
                if (var7 != 1) {
                    if (var7 == 2) {
                        --var9;
                        ++var8;
                    } else if (var7 == 3) {
                        --var8;
                    } else if (~var7 == -5) {
                        ++var8;
                    } else if (~var7 == -6) {
                        --var8;
                        ++var9;
                    } else if (var7 == 6) {
                        ++var9;
                    } else if (var7 == 7) {
                        ++var9;
                        ++var8;
                    }
                } else {
                    --var9;
                }
            } else {
                --var8;
                --var9;
            }
            if (!var3) {
                var5.method3077(class332.field4257[arg1], var9, var8, -120);
            } else {
                var5.field7651 = true;
                var5.field7656 = var8;
                var5.field7637 = var9;
            }
        } else if (var4 == 2) {
            int var10 = arg0.method100((byte) -99, 4);
            int var11 = var5.field5246[0];
            int var12 = var5.field5251[0];
            if (~var10 != -1) {
                if (var10 == 1) {
                    var12 -= 2;
                    --var11;
                } else if (~var10 == -3) {
                    var12 -= 2;
                } else if (var10 != 3) {
                    if (~var10 == -5) {
                        var12 -= 2;
                        var11 += 2;
                    } else if (~var10 == -6) {
                        --var12;
                        var11 -= 2;
                    } else if (var10 != 6) {
                        if (~var10 != -8) {
                            if (var10 == 8) {
                                var11 += 2;
                            } else if (var10 == 9) {
                                ++var12;
                                var11 -= 2;
                            } else if (~var10 == -11) {
                                ++var12;
                                var11 += 2;
                            } else if (~var10 != -12) {
                                if (var10 != 12) {
                                    if (var10 == 13) {
                                        var12 += 2;
                                    } else if (~var10 == -15) {
                                        ++var11;
                                        var12 += 2;
                                    } else if (var10 == 15) {
                                        var12 += 2;
                                        var11 += 2;
                                    }
                                } else {
                                    var12 += 2;
                                    --var11;
                                }
                            } else {
                                var11 -= 2;
                                var12 += 2;
                            }
                        } else {
                            var11 -= 2;
                        }
                    } else {
                        var11 += 2;
                        --var12;
                    }
                } else {
                    var12 -= 2;
                    ++var11;
                }
            } else {
                var11 -= 2;
                var12 -= 2;
            }
            if (var3) {
                var5.field7656 = var11;
                var5.field7651 = true;
                var5.field7637 = var12;
            } else {
                var5.method3077(class332.field4257[arg1], var12, var11, -123);
            }
        } else {
            int var13 = arg0.method100((byte) -82, 1);
            if (~var13 == -1) {
                int var14 = arg0.method100((byte) 86, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 31;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = 31 & var14;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field5246[0] + var16;
                int var19 = var5.field5251[0] + var17;
                if (!var3) {
                    var5.method3077(class332.field4257[arg1], var19, var18, -123);
                } else {
                    var5.field7656 = var18;
                    var5.field7651 = true;
                    var5.field7637 = var19;
                }
                var5.field6220 = (byte) (3 & var5.field6220 + var15);
                if (class166.field2149 == arg1) {
                    class366.field4715 = var5.field6220;
                }
            } else {
                int var20 = arg0.method100((byte) -98, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 16383;
                int var23 = 16383 & var20;
                if (arg2 == -600073092) {
                    int var24 = (var5.field5246[0] + var22 + class35.field545 & 16383) + -class35.field545;
                    int var25 = (class336.field4299 + var23 + var5.field5251[0] & 16383) - class336.field4299;
                    if (var3) {
                        var5.field7637 = var25;
                        var5.field7656 = var24;
                        var5.field7651 = true;
                    } else {
                        var5.method3077(class332.field4257[arg1], var25, var24, -128);
                    }
                    var5.field6220 = (byte) (var5.field6220 + var21 & 3);
                    if (~class166.field2149 == ~arg1) {
                        class366.field4715 = var5.field6220;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lps;I)V")
    public static final void method2453(class344 arg0, int arg1) {
        arg0.field4379 = null;
        ++field5557;
        if (arg1 != 0) {
            method2453((class344) null, 82);
        }
        if (class338.field4315 < 20) {
            class16.field273.method2124(arg0, 101);
            ++class338.field4315;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)J")
    public final long method349(int arg0) {
        ++field5548;
        if (arg0 < 5) {
            method2452((class16) null, -92, -66);
        }
        return super.field5288.method2840();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(CI)Z")
    public static final boolean method2454(char arg0, int arg1) {
        if (arg1 != -96) {
            field5555 = 1.3036542F;
        }
        ++field5551;
        return arg0 == 160 || arg0 == ' ' || ~arg0 == -96 || ~arg0 == -46;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lgk;I[BI)V")
    public class417(class463 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5553 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public static void method2455(int arg0) {
        field5550 = null;
        if (arg0 != 2) {
            method2453((class344) null, 103);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[BII)V")
    public final void method343(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method2366(arg1, arg2);
        ++field5554;
        if (arg3 == 3238) {
            this.field5553 = arg0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 != -18156) {
            this.method349(123);
        }
        ++field5546;
        return this.field5553;
    }
}
