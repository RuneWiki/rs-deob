import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class34 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[F")
    public static float[] field491 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
    public static int[] field490 = new int[14];

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field495 = -1;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Ljava/lang/String;")
    public static String field500 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field497 = 0;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lrj;")
    public static class269 field499;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lth;III)V", line = 5)
    public static final void method263(class270 arg0, int arg1, int arg2, int arg3) {
        if ((arg2 & 0x1) != 0) {
            arg0.field4740 = class204.field3136.method1770(-1909516320);
            arg0.field4718 = class204.field3136.method1728((byte) 50);
        }
        field496++;
        if ((arg2 & 0x400) != 0) {
            int var4 = class204.field3136.method1730(false);
            int var5 = class204.field3136.method1760(-1);
            arg0.method2093(var5, var4, (byte) 112, class233.field3542);
        }
        if ((arg2 & 0x100) != 0) {
            int var6 = class204.field3136.method1749((byte) 92);
            if (var6 == 65535) {
                var6 = -1;
            }
            boolean var7 = true;
            int var8 = class204.field3136.method1727(6216);
            if (var6 != -1 && arg0.field4750 != -1 && client.method1010(class265.method1866(var6, 11273).field547, (byte) 127).field314 < client.method1010(class265.method1866(arg0.field4750, 11273).field547, (byte) 106).field314) {
                var7 = false;
            }
            if (var7) {
                arg0.field4769 = 1;
                arg0.field4759 = var8 >> 16;
                arg0.field4692 = 0;
                arg0.field4734 = class233.field3542 + (var8 & 0xFFFF);
                arg0.field4754 = 0;
                arg0.field4750 = var6;
                if (class233.field3542 < arg0.field4734) {
                    arg0.field4754 = -1;
                }
                if (arg0.field4750 != -1 && class233.field3542 == arg0.field4734) {
                    int var9 = class265.method1866(arg0.field4750, 11273).field547;
                    if (var9 != -1) {
                        class28 var10 = client.method1010(var9, (byte) 111);
                        if (var10 != null && var10.field312 != null) {
                            class146.method1105(0, class39.field575 == arg0, 6924, arg0.field4731, var10, arg0.field4713);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x20) != 0) {
            arg0.field4671 = class204.field3136.method1770(-1909516320);
            if (arg0.field4671 == 65535) {
                arg0.field4671 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var11 = class204.field3136.method1770(-1909516320);
            int var12 = class204.field3136.method1774((byte) 81);
            int var13 = class204.field3136.method1760(-1);
            int var14 = class204.field3136.field3866;
            boolean var15 = (var11 & 0x8000) != 0;
            if (arg0.field4218 != null && arg0.field4199 != null) {
                long var16 = class49.method374(arg0.field4218, -1);
                boolean var18 = false;
                if (var12 <= 1) {
                    if (var15 || (!class2.field29 || class161.field2454) && !class90.field1308) {
                        for (int var19 = 0; var19 < class153.field2321; var19++) {
                            if (class162.field2626[var19] == var16) {
                                var18 = true;
                                break;
                            }
                        }
                    } else {
                        var18 = true;
                    }
                }
                if (!var18 && class63.field847 == 0) {
                    class273.field4260.field3866 = 0;
                    int var20 = -1;
                    class204.field3136.method1756(-22522, var13, class273.field4260.field3840, 0);
                    class273.field4260.field3866 = 0;
                    String var22;
                    if (var15) {
                        class336 var21 = class43.method338(-31, class273.field4260);
                        var20 = var21.field5224;
                        var22 = var21.field5233.method1594((byte) 33, class273.field4260);
                        var11 &= 0x7FFF;
                    } else {
                        var22 = class326.method2263(class202.method1462(class188.method1389(class273.field4260, -120), 24));
                    }
                    arg0.field4762 = var22.trim();
                    arg0.field4766 = var11 >> 8;
                    arg0.field4776 = var11 & 0xFF;
                    arg0.field4678 = 150;
                    if (var12 == 2) {
                        class131.method1018(-78, var22, var20, var15 ? 17 : 1, (String) null, "<img=1>" + arg0.method1895(1958408711));
                    } else if (var12 == 1) {
                        class131.method1018(-99, var22, var20, var15 ? 17 : 1, (String) null, "<img=0>" + arg0.method1895(1958408711));
                    } else {
                        class131.method1018(-126, var22, var20, var15 ? 17 : 2, (String) null, arg0.method1895(1958408711));
                    }
                }
            }
            class204.field3136.field3866 = var14 + var13;
        }
        if ((arg2 & 0x800) != 0) {
            int var23 = class204.field3136.method1760(-1);
            int[] var24 = new int[var23];
            int[] var25 = new int[var23];
            int[] var26 = new int[var23];
            for (int var27 = 0; var27 < var23; var27++) {
                int var28 = class204.field3136.method1770(-1909516320);
                if (var28 == 65535) {
                    var28 = -1;
                }
                var26[var27] = var28;
                var24[var27] = class204.field3136.method1746((byte) -71);
                var25[var27] = class204.field3136.method1728((byte) 50);
            }
            class313.method2142(var26, -85, arg0, var24, var25);
        }
        if ((arg2 & 0x2) != 0) {
            int var29 = class204.field3136.method1728((byte) 50);
            if (var29 == 65535) {
                var29 = -1;
            }
            int var30 = class204.field3136.method1787(102);
            class291.method2007(var29, var30, -58, arg0);
        }
        if ((arg2 & 0x200) != 0) {
            arg0.field4771 = class204.field3136.method1746((byte) -73);
            arg0.field4725 = class204.field3136.method1774((byte) -110);
            arg0.field4688 = class204.field3136.method1760(-1);
            arg0.field4749 = class204.field3136.method1760(-1);
            arg0.field4746 = class204.field3136.method1749((byte) 83) + class233.field3542;
            arg0.field4748 = class204.field3136.method1755(false) + class233.field3542;
            arg0.field4756 = class204.field3136.method1774((byte) 74);
            arg0.field4694 = 0;
            arg0.field4716 = 1;
        }
        if ((arg2 & 0x4) != 0) {
            int var31 = class204.field3136.method1730(false);
            int var32 = class204.field3136.method1760(-1);
            arg0.method2093(var32, var31, (byte) 120, class233.field3542);
            arg0.field4677 = class233.field3542 + 300;
            arg0.field4761 = class204.field3136.method1760(-1);
        }
        if ((arg2 & 0x10) != 0) {
            arg0.field4762 = class204.field3136.method1778(1258);
            if (arg0.field4762.charAt(0) == '~') {
                arg0.field4762 = arg0.field4762.substring(1);
                class262.method1840(arg0.method1895(1958408711), arg0.field4762, 2, -57);
            } else if (class39.field575 == arg0) {
                class262.method1840(arg0.method1895(1958408711), arg0.field4762, 2, -30);
            }
            arg0.field4678 = 150;
            arg0.field4766 = 0;
            arg0.field4776 = 0;
        }
        if (arg3 >= -91) {
            method263((class270) null, 51, 109, -29);
        }
        if ((arg2 & 0x8) == 0) {
            return;
        }
        int var33 = class204.field3136.method1787(-120);
        byte[] var34 = new byte[var33];
        class254 var35 = new class254(var34);
        class204.field3136.method1756(-22522, var33, var34, 0);
        class210.field3219[arg1] = var35;
        arg0.method1890((byte) 113, var35);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 282)
    public static void method264(int arg0) {
        field491 = null;
        if (arg0 != -7059) {
            field495 = -39;
        }
        field500 = null;
        field490 = null;
        field499 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 296)
    public static final int method265(String arg0, byte arg1) {
        field494++;
        if (class228.field3489 == null || arg0.length() == 0) {
            return -1;
        }
        if (arg1 <= 57) {
            method266(17, (class161) null);
        }
        for (int var2 = 0; var2 < class228.field3489.field291; var2++) {
            if (class225.method1602(class228.field3489.field283[var2], 0, " ", "<br>").equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILmn;)Z", line = 342)
    public static final boolean method266(int arg0, class161 arg1) {
        field493++;
        if (arg0 != 1) {
            method266(-4, (class161) null);
        }
        if (arg1.field2598 == 205) {
            class219.field3350 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 362)
    public static final void method267(int arg0, int arg1, int arg2) {
        if (~class268.field4168 == arg2) {
            class193.field3015 = arg1;
            class200.field3047 = arg0;
        }
        class307.field4786 = (float) arg1;
        class243.field3695 = (float) arg0;
        field501++;
        class295.method2042(8);
        class16.field207 = true;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 390)
    public static final void method268(int arg0) {
        field498++;
        if (arg0 != 29620) {
            field500 = (String) null;
        }
        if (class258.field3966 == null) {
            return;
        }
        class61 var1 = new class61();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class258.field3966[var2][var3] = var1;
            }
        }
    }
}
