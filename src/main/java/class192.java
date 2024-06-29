import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class192 {

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Z")
    public static boolean field3039 = false;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lul;")
    public static class201 field3042 = new class201(5000);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lec;")
    public static class25 field3045 = new class25(64);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Lea;")
    public final class38 method1328(boolean arg0) {
        if (arg0) {
            this.method1330((class202) null, (byte) 81, -89);
        }
        field3034++;
        class38 var2 = (class38) class98.field1463.method149((byte) -116, (long) this.field3043);
        if (var2 != null) {
            return var2;
        }
        class38 var3 = class149.method989(class161.field2532, (byte) -25, 0, this.field3043);
        if (var3 != null) {
            class98.field1463.method152(var3, (long) this.field3043, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILma;)V")
    private final void method1329(int arg0, int arg1, int arg2, class202 arg3) {
        field3037++;
        if (arg2 != 1023) {
            field3032 = 96;
        }
        if (arg1 == 1) {
            this.field3043 = arg3.method1419(94);
        } else if (arg1 == 2) {
            this.field3031 = arg3.method1420((byte) 0);
            this.field3044 = arg3.method1420((byte) 0);
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lma;BI)V")
    public final void method1330(class202 arg0, byte arg1, int arg2) {
        if (arg1 != 52) {
            method1336((byte) -102);
        }
        while (true) {
            int var4 = arg0.method1420((byte) 0);
            if (var4 == 0) {
                field3035++;
                return;
            }
            this.method1329(arg2, var4, arg1 ^ 0x3CB, arg0);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLfa;)Lea;")
    public static final class38 method1331(int arg0, boolean arg1, class273 arg2) {
        field3041++;
        if (arg1) {
            return class124.method823(2, arg2, arg0) ? class295.method2058(104) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILfa;)V")
    public static final void method1332(int arg0, class273 arg1) {
        class74.field1140 = arg1;
        field3038++;
        if (arg0 != -64) {
            field3032 = -44;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;JLjava/lang/String;SIII)V")
    public static final void method1333(int arg0, String arg1, long arg2, String arg3, short arg4, int arg5, int arg6, int arg7) {
        field3036++;
        if (arg7 != 9910 || class220.field3525 || class18.field251 >= 500) {
            return;
        }
        class178.field2773[class18.field251] = arg1;
        class156.field2472[class18.field251] = arg3;
        class214.field3420[class18.field251] = arg6 == -1 ? class276.field4574 : arg6;
        class70.field1016[class18.field251] = arg4;
        class280.field4637[class18.field251] = arg2;
        class283.field4737[class18.field251] = arg5;
        class175.field2739[class18.field251] = arg0;
        class18.field251++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Led;")
    public static final class195 method1334(boolean arg0, int arg1) {
        field3033++;
        class195 var2 = (class195) class109.field1671.method149((byte) -119, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field604.method1877(arg1, 36, (byte) 73);
        if (arg0) {
            return null;
        }
        class195 var4 = new class195();
        var4.field3096 = arg1;
        if (var3 != null) {
            var4.method1350(new class202(var3), (byte) -74);
        }
        class109.field1671.method152(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method1335(int arg0) {
        field3040++;
        int var1 = class178.field2767 * 128 + 64;
        int var2 = class165.field2603 * 128 + 64;
        int var3 = class12.method66(var2, class165.field2600, var1, 0) - class117.field1788;
        if (class138.field2131 >= 100) {
            class174.field2724 = class178.field2767 * 128 + 64;
            class53.field715 = class165.field2603 * 128 + 64;
            class262.field4326 = class12.method66(class53.field715, class165.field2600, class174.field2724, 0) - class117.field1788;
        } else {
            if (class262.field4326 < var3) {
                class262.field4326 += (var3 - class262.field4326) * class138.field2131 / 1000 + class68.field993;
                if (var3 < class262.field4326) {
                    class262.field4326 = var3;
                }
            }
            if (var1 > class174.field2724) {
                class174.field2724 += (var1 - class174.field2724) * class138.field2131 / 1000 + class68.field993;
                if (var1 < class174.field2724) {
                    class174.field2724 = var1;
                }
            }
            if (var3 < class262.field4326) {
                class262.field4326 -= class68.field993 + ((class262.field4326 - var3) * class138.field2131 / 1000);
                if (var3 > class262.field4326) {
                    class262.field4326 = var3;
                }
            }
            if (class53.field715 < var2) {
                class53.field715 += class68.field993 + ((var2 - class53.field715) * class138.field2131 / 1000);
                if (class53.field715 > var2) {
                    class53.field715 = var2;
                }
            }
            if (class53.field715 > var2) {
                class53.field715 -= (class53.field715 - var2) * class138.field2131 / 1000 + class68.field993;
                if (class53.field715 < var2) {
                    class53.field715 = var2;
                }
            }
            if (var1 < class174.field2724) {
                class174.field2724 -= (class174.field2724 - var1) * class138.field2131 / 1000 + class68.field993;
                if (var1 > class174.field2724) {
                    class174.field2724 = var1;
                }
            }
        }
        int var4 = class114.field1716 * 128 + 64;
        if (arg0 != 5000) {
            field3032 = 76;
        }
        int var5 = class139.field2146 * 128 + 64;
        int var6 = class12.method66(var5, class165.field2600, var4, 0) - class196.field3120;
        int var7 = var5 - class53.field715;
        int var8 = var6 - class262.field4326;
        int var9 = var4 - class174.field2724;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class132.field2037) {
            class132.field2037 += class163.field2566 + ((var11 - class132.field2037) * class286.field4767 / 1000);
            if (class132.field2037 > var11) {
                class132.field2037 = var11;
            }
        }
        if (class132.field2037 > var11) {
            class132.field2037 -= (class132.field2037 - var11) * class286.field4767 / 1000 + class163.field2566;
            if (var11 > class132.field2037) {
                class132.field2037 = var11;
            }
        }
        int var13 = var12 - class100.field1514;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class100.field1514 += class286.field4767 * var13 / 1000 + class163.field2566;
            class100.field1514 &= 0x7FF;
        }
        if (var13 < 0) {
            class100.field1514 -= -var13 * class286.field4767 / 1000 + class163.field2566;
            class100.field1514 &= 0x7FF;
        }
        int var14 = var12 - class100.field1514;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class100.field1514 = var12;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method1336(byte arg0) {
        field3042 = null;
        if (arg0 > -9) {
            method1335(10);
        }
        field3045 = null;
    }
}
