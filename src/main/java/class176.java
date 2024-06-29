import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class176 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lce;")
    public static class126 field3099 = class206.method1445(-7923, "Continuer");

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lce;")
    public static class126 field3112 = class206.method1445(-7923, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lce;")
    private static class126 field3109 = class206.method1445(-7923, "white:");

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lce;")
    public static class126 field3106 = field3109;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lce;")
    public static class126 field3115 = class206.method1445(-7923, "::pcachesize");

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lce;")
    public static class126 field3100 = field3109;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1273(byte arg0) {
        field3116++;
        class217.field3654.method2071(224);
        int var1 = 50 / ((arg0 - 40) / 48);
        class100.field1608 = null;
        class33.field477 = 1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILbb;)V", line = 36)
    public static final void method1274(int arg0, class134 arg1) {
        field3104++;
        if (arg0 < 22) {
            field3106 = (class126) null;
        }
        while (true) {
            while (arg1.field2282.length > arg1.field2299) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method948(-127) == 1) {
                    var3 = true;
                    var2 = arg1.method948(-127);
                    var4 = arg1.method948(-122);
                }
                int var5 = arg1.method948(-123);
                int var6 = arg1.method948(-124);
                int var7 = var5 * 64 - class220.field3702;
                int var8 = class306.field5140 + class143.field2602 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class36.field521 && class143.field2602 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= var2 * 8 && (var2 * 8 + 8) > var11 && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                int var13 = arg1.method948(-123);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method948(-123);
                                        if (class1.field10[var9][var10] == null) {
                                            class1.field10[var9][var10] = new byte[4096];
                                        }
                                        class1.field10[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method942(true);
                                        if (class13.field183[var9][var10] == null) {
                                            class13.field183[var9][var10] = new short[4096];
                                        }
                                        class13.field183[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method948(-124) & 0xFF) << 16) + (arg1.method948(-125) & 0xFF << 8) + (arg1.method948(-125) & 0xFF);
                                        if (class283.field4710[var9][var10] == null) {
                                            class283.field4710[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class265 var17 = class185.method1338(var16, -7153);
                                        if (var17.field4435 != null) {
                                            var17 = var17.method1788(-1);
                                            if (var17 == null || var17.field4476 == -1) {
                                                continue;
                                            }
                                        }
                                        class283.field4710[var9][var10][(63 - var12 << 6) + var11] = var17.field4481 + 1;
                                        class231 var18 = new class231();
                                        var18.field3878 = var8;
                                        var18.field3883 = var7;
                                        var18.field3880 = var17.field4476;
                                        class7.field84.method899(var18, -28);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg1.method948(-126);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field2299++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field2299 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field2299 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILwd;III)V", line = 183)
    public static final void method1275(int arg0, class112 arg1, int arg2, int arg3, int arg4) {
        int var5 = -29 % ((arg4 + 32) / 55);
        if (class56.field846) {
            class101.method687(arg2, arg3, arg2 + arg1.field1766, arg1.field1753 + arg3);
        }
        if (class182.field3175 < 3) {
            if (class56.field846) {
                ((class198) class209.field3582).method1402(arg2, arg3, arg1.field1766, arg1.field1753, class209.field3582.field4595 / 2, class209.field3582.field4601 / 2, class144.field2618, 256, (class198) arg1.method740(false, (byte) -23));
            } else {
                ((class184) class209.field3582).method1334(arg2, arg3, arg1.field1766, arg1.field1753, class209.field3582.field4595 / 2, class209.field3582.field4601 / 2, class144.field2618, 256, arg1.field1796, arg1.field1772);
            }
        } else if (class56.field846) {
            class273 var6 = arg1.method740(false, (byte) -23);
            if (var6 != null) {
                var6.method1333(arg2, arg3);
            }
        } else {
            class276.method1852(arg2, arg3, 0, arg1.field1796, arg1.field1772);
        }
        field3114++;
        class250.field4186[arg0] = true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lbb;I)V", line = 223)
    public final void method1276(class134 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method948(-128);
            if (var3 == 0) {
                field3107++;
                if (arg1 != -1) {
                    field3099 = (class126) null;
                }
                return;
            }
            this.method1280(var3, (byte) 84, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[I[Ljava/lang/Object;)V", line = 245)
    public static final void method1277(int arg0, int arg1, int arg2, int[] arg3, Object[] arg4) {
        if (arg0 > arg2) {
            int var5 = (arg2 + arg0) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if ((var9 & 0x1) + var7 > arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method1277(var6 - 1, -26519, arg2, arg3, arg4);
            method1277(arg0, -26519, var6 + 1, arg3, arg4);
        }
        if (arg1 != -26519) {
            field3112 = (class126) null;
        }
        field3110++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)Z", line = 305)
    public static final boolean method1278(int arg0, boolean arg1) {
        field3113++;
        if (arg1) {
            method1278(103, true);
        }
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lbb;B)Lp;", line = 316)
    public static final class85 method1279(class134 arg0, byte arg1) {
        field3117++;
        class85 var2 = new class85();
        var2.field1348 = arg0.method942(true);
        if (arg1 == -42) {
            var2.field1346 = class241.method1665(var2.field1348, (byte) -53);
            return var2;
        } else {
            return (class85) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBLbb;)V", line = 347)
    private final void method1280(int arg0, byte arg1, class134 arg2) {
        field3111++;
        if (arg1 < 67) {
            method1282(-23, 65);
        }
        if (arg0 == 1) {
            this.field3105 = arg2.method942(true);
            this.field3108 = arg2.method948(-126);
            this.field3102 = arg2.method948(-122);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 367)
    public static void method1281(int arg0) {
        field3115 = null;
        int var1 = 23 % ((18 - arg0) / 40);
        field3109 = null;
        field3112 = null;
        field3100 = null;
        field3106 = null;
        field3099 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 385)
    public static final void method1282(int arg0, int arg1) {
        field3103++;
        if (arg0 == -1 || !class136.field2363[arg0]) {
            return;
        }
        class127.field2196.method2177(-4511, arg0);
        if (class291.field4825[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != 4) {
            method1274(44, (class134) null);
        }
        for (int var3 = 0; var3 < class291.field4825[arg0].length; var3++) {
            if (class291.field4825[arg0][var3] != null) {
                if (class291.field4825[arg0][var3].field1780 == 2) {
                    var2 = false;
                } else {
                    class291.field4825[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class291.field4825[arg0] = null;
        }
        class136.field2363[arg0] = false;
    }
}
