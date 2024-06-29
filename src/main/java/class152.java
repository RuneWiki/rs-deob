import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class152 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Z")
    public boolean field2663 = true;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public int field2664 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field2662 = -1;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field2669 = -1;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2665 = 0;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Loa;")
    public static class99 field2668 = class221.method1463(2844, "ul");

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Z")
    public static boolean field2671 = true;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2677 = 0;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Z")
    public static volatile boolean field2666 = true;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static volatile int field2670 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lwb;")
    public static class26 field2667;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILik;IZ)V")
    private final void method1008(int arg0, class261 arg1, int arg2, boolean arg3) {
        field2672++;
        if (arg2 == 1) {
            this.field2664 = class102.method715((byte) 87, arg1.method1747(arg3));
        } else if (arg2 == 2) {
            this.field2669 = arg1.method1693((byte) 90);
        } else if (arg2 == 3) {
            this.field2669 = arg1.method1740((byte) 82);
            if (this.field2669 == 65535) {
                this.field2669 = -1;
            }
        } else if (arg2 == 5) {
            this.field2663 = false;
        } else if (arg2 == 7) {
            this.field2662 = class102.method715((byte) 119, arg1.method1747(false));
        } else if (arg2 == 8) {
            class58.field976 = arg0;
        } else if (arg2 == 9) {
            arg1.method1740((byte) 118);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg1.method1693((byte) -106);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    arg1.method1747(false);
                } else if (arg2 == 14) {
                    arg1.method1693((byte) 34);
                }
            }
        }
        if (arg3) {
            method1012(true, (byte) -70, false, -69, -106);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static void method1009(boolean arg0) {
        if (arg0) {
            method1010(0, 8, (byte) -26);
        }
        field2667 = null;
        field2668 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)Le;")
    public static final class65 method1010(int arg0, int arg1, byte arg2) {
        field2676++;
        class65 var3 = (class65) class142.field2499.method1550(true, (long) arg1 << 32 | (long) arg0);
        if (arg2 > -5) {
            return null;
        }
        if (var3 == null) {
            var3 = new class65(arg1, arg0);
            class142.field2499.method1544((byte) 92, var3.field2187, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ltf;B)Ltf;")
    public static final class107 method1011(class107 arg0, byte arg1) {
        if (arg1 <= 6) {
            method1009(false);
        }
        class107 var2 = client.method1052(arg0);
        field2660++;
        if (var2 == null) {
            var2 = arg0.field1810;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZBZII)V")
    public static final void method1012(boolean arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field2675++;
        class270.method1788(arg4, 0, class106.field1776.length - 1, -118, arg3, arg2, arg0);
        int var5 = 36 % ((53 - arg1) / 62);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V")
    public static final void method1013(int arg0, byte arg1, int arg2) {
        field2674++;
        if (arg1 != -15) {
            return;
        }
        for (int var3 = 0; var3 < class128.field2229; var3++) {
            class152 var4 = class17.method102(4, var3);
            if (var4 != null) {
                int var5 = var4.field2669;
                if (var5 >= 0 && !class134.field2338.method835(32401, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2662 >= 0) {
                    int var10 = var4.field2662;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + ((arg0 + var10 & 0xFC00) + var11);
                    var9 = class134.field2349[class223.method1474(96, -1, var12)];
                } else if (var5 >= 0) {
                    var9 = class134.field2349[class223.method1474(96, arg1 + 14, class134.field2338.method836(var5, 11775))];
                } else if (var4.field2664 == -1) {
                    var9 = -1;
                } else {
                    int var6 = var4.field2664;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class134.field2349[class223.method1474(96, -1, var8)];
                }
                class139.field2471[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII[B[Lob;IIBZI)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class131[] arg5, int arg6, int arg7, byte arg8, boolean arg9, int arg10) {
        if (arg8 > -113) {
            return;
        }
        int var11 = -1;
        class261 var12 = new class261(arg4);
        field2661++;
        while (true) {
            int var13 = var12.method1721(false);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1742(-957401312);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = (var14 & 0xFFA) >> 6;
                int var18 = var12.method1693((byte) 31);
                int var19 = var14 & 0x3F;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg7 == var16 && arg2 <= var17 && arg2 + 8 > var17 && arg0 <= var19 && var19 < arg0 + 8) {
                    class153 var22 = class247.method1601(26012, var11);
                    int var23 = class78.method548(-4918, var21, var22.field2717, var22.field2704, arg10, var17 & 0x7, var19 & 0x7) + arg6;
                    int var24 = class100.method710((byte) 116, var22.field2704, arg10, var21, var17 & 0x7, var22.field2717, var19 & 0x7) + arg3;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class131 var25 = null;
                        if (!arg9) {
                            int var26 = arg1;
                            if ((class230.field3973[1][var23][var24] & 0x2) == 2) {
                                var26 = arg1 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class183.method1255(var24, var20, var23, arg10 + var21 & 0x3, var11, var25, !arg9, arg9, arg1, 119, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lik;IZ)V")
    public final void method1015(class261 arg0, int arg1, boolean arg2) {
        field2673++;
        while (true) {
            int var4 = arg0.method1693((byte) 39);
            if (var4 == 0) {
                if (arg2) {
                    field2668 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1008(arg1, arg0, var4, false);
        }
    }
}
