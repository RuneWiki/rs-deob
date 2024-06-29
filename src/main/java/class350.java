import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class350 extends class469 implements class202 {

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    private int field4787;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Lgf;")
    public static class256 field4792 = new class256();

    @OriginalMember(owner = "client!at", name = "o", descriptor = "[[I")
    public static int[][] field4799 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lfg;")
    public static class117 field4794;

    // $FF: synthetic field
    @OriginalMember(owner = "client!at", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field4800;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "[Lbj;")
    public static class225[] field4791;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)J")
    public final long method1324(int arg0) {
        if (arg0 != 29632) {
            return 52L;
        } else {
            ++field4795;
            return super.field6284.getAddress();
        }
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V")
    public static final void method2084(int arg0) {
        if (class688.field9669.field6915 && class649.field8721.field2955 != -1) {
            class649.method3558(class649.field8721.field2957, class649.field8721.field2955, (byte) 92);
        }
        ++field4790;
        if (arg0 != -30699) {
            field4799 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLcea;I)V")
    public static final void method2085(byte arg0, class201 arg1, int arg2) {
        class220.field3113 = 0;
        class449.field6161 = false;
        if (arg0 != -128) {
            field4792 = null;
        }
        ++field4789;
        class375.method2201(104, arg1);
        class275.method1665(arg1, arg0 + 22);
        if (class449.field6161) {
            System.out.println("---endgpp---");
        }
        if (~arg1.field4619 != ~arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field4619 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)I")
    public final int method1323(int arg0) {
        ++field4788;
        return arg0 != -28332 ? -29 : 0;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lno;I[BI)V")
    public class350(class658 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4787 = arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([BIII)V")
    public final void method1322(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method2644(arg0, arg2);
        ++field4793;
        if (arg3 != 9043) {
            field4797 = 24;
        }
        this.field4787 = arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(CI)B")
    public static final byte method2086(char arg0, int arg1) {
        ++field4796;
        byte var2;
        if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || ~arg0 < -256)) {
            if (arg0 != 8364) {
                if (~arg0 == -8219) {
                    var2 = -126;
                } else if (arg0 != 402) {
                    if (~arg0 != -8223) {
                        if (arg0 != 8230) {
                            if (~arg0 != -8225) {
                                if (~arg0 != -8226) {
                                    if (~arg0 == -711) {
                                        var2 = -120;
                                    } else if (arg0 != 8240) {
                                        if (arg0 == 352) {
                                            var2 = -118;
                                        } else if (arg0 != 8249) {
                                            if (arg0 != 338) {
                                                if (~arg0 != -382) {
                                                    if (~arg0 != -8217) {
                                                        if (arg0 == 8217) {
                                                            var2 = -110;
                                                        } else if (~arg0 != -8221) {
                                                            if (arg0 != 8221) {
                                                                if (~arg0 == -8227) {
                                                                    var2 = -107;
                                                                } else if (~arg0 == -8212) {
                                                                    var2 = -106;
                                                                } else if (~arg0 == -8213) {
                                                                    var2 = -105;
                                                                } else if (~arg0 != -733) {
                                                                    if (arg0 == 8482) {
                                                                        var2 = -103;
                                                                    } else if (~arg0 == -354) {
                                                                        var2 = -102;
                                                                    } else if (arg0 != 8250) {
                                                                        if (~arg0 != -340) {
                                                                            if (~arg0 != -383) {
                                                                                if (arg0 != 376) {
                                                                                    var2 = 63;
                                                                                } else {
                                                                                    var2 = -97;
                                                                                }
                                                                            } else {
                                                                                var2 = -98;
                                                                            }
                                                                        } else {
                                                                            var2 = -100;
                                                                        }
                                                                    } else {
                                                                        var2 = -101;
                                                                    }
                                                                } else {
                                                                    var2 = -104;
                                                                }
                                                            } else {
                                                                var2 = -108;
                                                            }
                                                        } else {
                                                            var2 = -109;
                                                        }
                                                    } else {
                                                        var2 = -111;
                                                    }
                                                } else {
                                                    var2 = -114;
                                                }
                                            } else {
                                                var2 = -116;
                                            }
                                        } else {
                                            var2 = -117;
                                        }
                                    } else {
                                        var2 = -119;
                                    }
                                } else {
                                    var2 = -121;
                                }
                            } else {
                                var2 = -122;
                            }
                        } else {
                            var2 = -123;
                        }
                    } else {
                        var2 = -124;
                    }
                } else {
                    var2 = -125;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg0;
        }
        if (arg1 != 3) {
            method2085((byte) -101, (class201) null, 112);
        }
        return var2;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lno;ILjaclib/memory/Buffer;)V")
    public class350(class658 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field4787 = arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public static void method2087(byte arg0) {
        field4794 = null;
        field4791 = null;
        field4792 = null;
        if (arg0 <= -40) {
            field4799 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "()V")
    public static final void method2088() {
        for (int var0 = 0; var0 < class697.field9777; ++var0) {
            if (!class583.field7742[var0]) {
                class225 var1 = field4791[var0];
                class65 var2 = var1.field3173;
                int var3 = var1.field3170;
                int var4 = var2.method522(126) - class16.field256;
                int var5 = (var4 * 2 >> class348.field4782) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method515((byte) 114) - var4 >> class348.field4782;
                int var9 = var2.method518((byte) -122) - var4 >> class348.field4782;
                int var10 = var2.method518((byte) -13) + var4 >> class348.field4782;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class227.field3196) {
                    var10 = class227.field3196 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field3169[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class657.field8966) {
                        var16 = class657.field8966 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class641 var19 = class503.method2793(var3, var17, var11, field4800 != null ? field4800 : (field4800 = method2089("ag")));
                        if (var19 != null && var19.field8614 != 0) {
                            if (var19.field8614 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field3169[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field3169[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field3169[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field3169[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class583.field7742[var0] = true;
                class218.field3099[var3].method206(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I")
    public final int method1325(int arg0) {
        ++field4798;
        if (arg0 != 32559) {
            field4797 = 82;
        }
        return this.field4787;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2089(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
