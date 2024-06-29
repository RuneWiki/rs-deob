import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class698 {

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Loea;")
    private class594 field9813;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "J")
    public long field9812;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Z")
    public static boolean field9814 = false;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lsd;")
    public static class93 field9806;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9817;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "[Lkr;")
    public static class743[] field9810;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3924(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z[[[Lmf;IIII)Z", line = 5)
    public static final boolean method3918(boolean arg0, class416[][][] arg1, int arg2, int arg3, int arg4, int arg5) {
        field9807++;
        byte var6 = arg0 ? 1 : (byte) (class258.field3741 & 0xFF);
        if (class10.field141[class312.field4409][arg3][arg2] == var6) {
            return false;
        } else if ((class435.field6078[class312.field4409][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            if (arg4 != 13882) {
                field9810 = null;
            }
            byte var7 = 0;
            class581.field8213[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class559.field7954[var7] = arg2;
            class10.field141[class312.field4409][arg3][arg2] = var6;
            while (var35 != var8) {
                int var9 = class581.field8213[var8] & 0xFFFF;
                int var10 = class581.field8213[var8] >> 16 & 0xFF;
                int var11 = class581.field8213[var8] >> 24 & 0xFF;
                int var12 = class559.field7954[var8] & 0xFFFF;
                int var13 = class559.field7954[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class435.field6078[class312.field4409][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class312.field4409 + 1; var16 <= 3; var16++) {
                    if ((class435.field6078[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field5838 != null) {
                                int var20 = class190.method1337(var10, arg4 - 20817);
                                if (arg1[var16][var9][var12].field5838.field6584 == var20 || arg1[var16][var9][var12].field5840 != null && arg1[var16][var9][var12].field5840.field6584 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class190.method1337(var11, arg4 - 20817);
                                    if (arg1[var16][var9][var12].field5838.field6584 == var21 || arg1[var16][var9][var12].field5840 != null && arg1[var16][var9][var12].field5840.field6584 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class190.method1337(var13, arg4 ^ 0xFFFFD2D3);
                                    if (arg1[var16][var9][var12].field5838.field6584 == var22 || arg1[var16][var9][var12].field5840 != null && arg1[var16][var9][var12].field5840.field6584 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class416 var23 = arg1[var16][var9][var12];
                            if (var23.field5844 != null) {
                                for (class217 var24 = var23.field5844; var24 != null; var24 = var24.field3091) {
                                    class113 var25 = var24.field3090;
                                    if (var25 instanceof class141) {
                                        class141 var26 = (class141) var25;
                                        int var27 = var26.method1112((byte) 93);
                                        int var28 = var26.method1111(false);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class416 var30 = arg1[var16][var9][var12];
                        if (var30 != null && var30.field5844 != null) {
                            for (class217 var31 = var30.field5844; var31 != null; var31 = var31.field3091) {
                                class113 var32 = var31.field3090;
                                if (var32.field1818 != var32.field1814 || var32.field1820 != var32.field1810) {
                                    for (int var33 = var32.field1814; var33 <= var32.field1818; var33++) {
                                        for (int var34 = var32.field1820; var34 <= var32.field1810; var34++) {
                                            class10.field141[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class10.field141[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class138.field2153[class312.field4409 + 1].method1825(var12, -128, var9);
                    if (var17 > class182.field2601[arg5]) {
                        class182.field2601[arg5] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (class57.field1058[arg5] > var18) {
                        class57.field1058[arg5] = var18;
                    } else if (class361.field5063[arg5] < var18) {
                        class361.field5063[arg5] = var18;
                    }
                    if (class548.field7724[arg5] > var19) {
                        class548.field7724[arg5] = var19;
                    } else if (class135.field2113[arg5] < var19) {
                        class135.field2113[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class10.field141[class312.field4409][var9 - 1][var12] != var6) {
                        class581.field8213[var35] = class164.method1221(-754974720, class164.method1221(var9 - 1, 1179648));
                        class559.field7954[var35] = class164.method1221(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class10.field141[class312.field4409][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class716.field9999;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class10.field141[class312.field4409][var9 - 1][var12] != var6 && (class435.field6078[class312.field4409][var9][var12] & 0x4) == 0 && (class435.field6078[class312.field4409][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class581.field8213[var35] = class164.method1221(1375731712, class164.method1221(var9 - 1, 1179648));
                            class559.field7954[var35] = class164.method1221(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class10.field141[class312.field4409][var9 - 1][var12] = var6;
                        }
                        if (class10.field141[class312.field4409][var9][var12] != var6) {
                            class581.field8213[var35] = class164.method1221(318767104, class164.method1221(var9, 5373952));
                            class559.field7954[var35] = class164.method1221(5439488, var12);
                            class10.field141[class312.field4409][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class174.field2540 > (var9 + 1) && class10.field141[class312.field4409][var9 + 1][var12] != var6 && (class435.field6078[class312.field4409][var9][var12] & 0x4) == 0 && (class435.field6078[class312.field4409][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class581.field8213[var35] = class164.method1221(-1845493760, class164.method1221(5373952, var9 + 1));
                            class559.field7954[var35] = class164.method1221(5439488, var12);
                            class10.field141[class312.field4409][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class174.field2540 && class10.field141[class312.field4409][var9 + 1][var12] != var6) {
                        class581.field8213[var35] = class164.method1221(class164.method1221(var9 + 1, 9568256), 1392508928);
                        class559.field7954[var35] = class164.method1221(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class10.field141[class312.field4409][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class10.field141[class312.field4409][var9 - 1][var12] != var6 && (class435.field6078[class312.field4409][var9][var12] & 0x4) == 0 && (class435.field6078[class312.field4409][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class581.field8213[var35] = class164.method1221(301989888, class164.method1221(13762560, var9 - 1));
                            class559.field7954[var35] = class164.method1221(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class10.field141[class312.field4409][var9 - 1][var12] = var6;
                        }
                        if (class10.field141[class312.field4409][var9][var12] != var6) {
                            class581.field8213[var35] = class164.method1221(class164.method1221(13762560, var9), -1828716544);
                            class559.field7954[var35] = class164.method1221(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class10.field141[class312.field4409][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class174.field2540 && class10.field141[class312.field4409][var9 + 1][var12] != var6 && (class435.field6078[class312.field4409][var9][var12] & 0x4) == 0 && (class435.field6078[class312.field4409][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class581.field8213[var35] = class164.method1221(class164.method1221(9568256, var9 + 1), -771751936);
                            class559.field7954[var35] = class164.method1221(var12, 9633792);
                            class10.field141[class312.field4409][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class182.field2601[arg5] != -1000000) {
                class182.field2601[arg5] += 40;
                class57.field1058[arg5] -= 512;
                class361.field5063[arg5] += 512;
                class135.field2113[arg5] += 512;
                class548.field7724[arg5] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 324)
    public static final void method3919(byte arg0) {
        try {
            Method var1 = (field9817 == null ? (field9817 = method3924("java.lang.Runtime")) : field9817).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class641.field9124 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != -62) {
            method3919((byte) -116);
        }
        field9809++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILud;)Lge;", line = 353)
    public static final class706 method3920(int arg0, class35 arg1) {
        field9808++;
        int var2 = arg1.method273(arg0 ^ 0xFFFFA7EE);
        class338 var3 = class405.method2488(true)[arg1.method273(255)];
        class692 var4 = class701.method3940(1)[arg1.method273(arg0 ^ 0xFFFFA7EE)];
        int var5 = arg1.method225((byte) 119);
        int var6 = arg1.method225((byte) 106);
        int var7 = arg1.method253(arg0 ^ 0x6EA5);
        int var8 = arg1.method253(arg0 + 8867);
        int var9 = arg1.method234((byte) -104);
        if (arg0 != -22767) {
            field9810 = null;
        }
        int var10 = arg1.method234((byte) -103);
        int var11 = arg1.method234((byte) -120);
        boolean var12 = arg1.method273(255) == 1;
        return new class706(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Loea;JI)V", line = 388)
    public class698(class594 arg0, long arg1, int arg2) {
        this.field9813 = arg0;
        this.field9812 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIB)V", line = 403)
    public static final void method3921(int arg0, int arg1, int arg2, byte arg3) {
        field9816++;
        String var4 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg3 <= -72) {
            System.out.println(var4);
            class217.method1512(false, true, -19797, var4);
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 417)
    public static void method3922(byte arg0) {
        field9806 = null;
        int var1 = -43 % ((6 - arg0) / 37);
        field9810 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lud;B)Lrv;", line = 428)
    public static final class109 method3923(class35 arg0, byte arg1) {
        field9815++;
        int var2 = 52 % ((-arg1 - 14) / 35);
        int var3 = arg0.method253(-13900);
        class338 var4 = class405.method2488(true)[arg0.method273(255)];
        class692 var5 = class701.method3940(1)[arg0.method273(255)];
        int var6 = arg0.method225((byte) 127);
        int var7 = arg0.method225((byte) 61);
        return new class109(var3, var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!gn", name = "finalize", descriptor = "()V", line = 449)
    protected final void finalize() throws Throwable {
        this.field9813.method3431(this.field9812, (byte) -11);
        field9811++;
        super.finalize();
    }
}
