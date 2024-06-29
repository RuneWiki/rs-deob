import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class240 extends class71 implements class241 {

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "C")
    public char field3598;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!aga", name = "v", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "J")
    public long field3583;

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "Luu;")
    public static class237 field3595;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "[I")
    public static int[] field3582;

    @OriginalMember(owner = "client!aga", name = "u", descriptor = "[I")
    public static int[] field3592;

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3594;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 9)
    public static final void method1615(int arg0, int arg1, int arg2, Class arg3) {
        class262 var4 = class137.field1948[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class638 var5 = var4.field3846; var5 != null; var5 = var5.field8564) {
            class395 var6 = var5.field8567;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5680 == arg1 && var6.field5673 == arg2) {
                class192.method1185(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(Z)V", line = 36)
    public static void method1616(boolean arg0) {
        if (!arg0) {
            field3582 = null;
            field3594 = null;
            field3595 = null;
            field3592 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILmfa;)V", line = 53)
    public static final void method1617(int arg0, class409 arg1) {
        field3587++;
        arg1.method2563((byte) 33);
        int var2 = 0;
        for (int var3 = 0; var3 < class209.field2736; var3++) {
            int var15 = class344.field4898[var3];
            if ((class104.field1430[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class104.field1430[var15] = (byte) class678.method3817(class104.field1430[var15], 2);
                } else {
                    int var16 = arg1.method2560(-48, 1);
                    if (var16 == 0) {
                        var2 = class376.method2356(arg1, (byte) -127);
                        class104.field1430[var15] = (byte) class678.method3817(class104.field1430[var15], 2);
                    } else {
                        class697.method3930(var15, arg1, 31);
                    }
                }
            }
        }
        arg1.method2567(0);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2563((byte) 33);
        for (int var4 = 0; var4 < class209.field2736; var4++) {
            int var13 = class344.field4898[var4];
            if ((class104.field1430[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class104.field1430[var13] = (byte) class678.method3817(class104.field1430[var13], 2);
                } else {
                    int var14 = arg1.method2560(-32, 1);
                    if (var14 == 0) {
                        var2 = class376.method2356(arg1, (byte) -99);
                        class104.field1430[var13] = (byte) class678.method3817(class104.field1430[var13], 2);
                    } else {
                        class697.method3930(var13, arg1, 31);
                    }
                }
            }
        }
        arg1.method2567(0);
        if (~var2 != arg0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2563((byte) 33);
        for (int var5 = 0; var5 < class85.field1204; var5++) {
            int var11 = class172.field2388[var5];
            if ((class104.field1430[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class104.field1430[var11] = (byte) class678.method3817(class104.field1430[var11], 2);
                } else {
                    int var12 = arg1.method2560(-117, 1);
                    if (var12 == 0) {
                        var2 = class376.method2356(arg1, (byte) -122);
                        class104.field1430[var11] = (byte) class678.method3817(class104.field1430[var11], 2);
                    } else if (class525.method3120(arg1, var11, 0)) {
                        class104.field1430[var11] = (byte) class678.method3817(class104.field1430[var11], 2);
                    }
                }
            }
        }
        arg1.method2567(0);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2563((byte) 33);
        for (int var6 = 0; var6 < class85.field1204; var6++) {
            int var9 = class172.field2388[var6];
            if ((class104.field1430[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class104.field1430[var9] = (byte) class678.method3817(class104.field1430[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method2560(-57, 1);
                    if (var10 == 0) {
                        var2 = class376.method2356(arg1, (byte) -89);
                        class104.field1430[var9] = (byte) class678.method3817(class104.field1430[var9], 2);
                    } else if (class525.method3120(arg1, var9, 0)) {
                        class104.field1430[var9] = (byte) class678.method3817(class104.field1430[var9], 2);
                    }
                }
            }
        }
        arg1.method2567(0);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class209.field2736 = 0;
        class85.field1204 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class104.field1430[var7] = (byte) (class104.field1430[var7] >> 1);
            class96 var8 = class251.field3675[var7];
            if (var8 == null) {
                class172.field2388[class85.field1204++] = var7;
            } else {
                class344.field4898[class209.field2736++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)I", line = 254)
    public final int method1618(boolean arg0) {
        field3590++;
        if (!arg0) {
            this.field3596 = -16;
        }
        return this.field3588;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIBIIII)V", line = 267)
    public static final void method1619(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 20 % ((63 - arg2) / 63);
        field3584++;
        if ((arg5 - arg6) >= class607.field8185 && arg5 + arg6 <= class726.field10064 && class291.field4181 <= (arg4 - arg6) && class262.field3848 >= (arg4 + arg6)) {
            class621.method3505(arg0, arg4, arg5, arg6, arg1, (byte) -93, arg3);
        } else {
            class532.method3161(0, arg1, arg0, arg6, arg4, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)C", line = 283)
    public final char method1620(int arg0) {
        field3597++;
        return arg0 == -2815 ? this.field3598 : '\u0005';
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZLjava/lang/String;Z)V", line = 294)
    public static final void method1621(int arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1621(-70, true, null, false);
        }
        field3593++;
        class425.method2644(-5911);
        class434.method2678(11954);
        class482.method2935(27995);
        class542.method3209(arg3, arg0, (byte) -96, arg2);
        class54.method403(0);
        class169.method1083(21595, class129.field1802);
        class114.method731(-29269, class129.field1802);
        class686.method3863(class671.field9318, class129.field1802, (byte) 80);
        class625.method3522(77);
        class726.method4056((byte) 97, class113.field1513);
        class235.method1566(16349);
        class211.method1261(18388);
        if (class102.field1401 == 3) {
            class647.method3624(4, arg1);
        } else if (class102.field1401 == 7) {
            class647.method3624(8, arg1);
        } else if (class102.field1401 == 10) {
            class647.method3624(11, arg1);
        } else if (class102.field1401 == 1 || class102.field1401 == 2) {
            class521.method3103((byte) -74);
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)I", line = 331)
    public final int method1622(int arg0) {
        if (arg0 != 15078) {
            this.field3598 = (char) 65527;
        }
        field3581++;
        return this.field3586;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V", line = 342)
    public static final void method1623(int arg0, int arg1) {
        if (arg1 <= -89) {
            class432.field6030.method3896(1, arg0);
            field3585++;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)J", line = 355)
    public final long method1624(int arg0) {
        field3591++;
        return arg0 == -1575 ? this.field3583 : -88L;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)I", line = 369)
    public final int method1625(int arg0) {
        field3589++;
        if (arg0 != -333) {
            this.method1618(false);
        }
        return this.field3596;
    }
}
