import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class105 {

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[I")
    private int[] field1473;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field1469 = 0;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1476 = 0;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1472 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1475;

    // $FF: synthetic field
    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1477;

    // $FF: synthetic method
    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method799(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 3)
    public static void method794(int arg0) {
        if (arg0 <= -83) {
            field1472 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)V", line = 14)
    public static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1468++;
        int var6 = arg2 - arg4;
        int var7 = arg3 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class53.method350(arg5, arg3, (byte) 88, arg1, arg4);
            }
        } else if (var7 == 0) {
            class344.method2251(arg1, arg4, (byte) 100, arg5, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            if (arg0 != 2239) {
                field1469 = 107;
            }
            int var9 = arg5 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class406.field6033 > arg4) {
                var11 = class406.field6033;
                var10 = var9 + (class406.field6033 * var8 >> 12);
            } else if (class185.field3005 >= arg4) {
                var10 = arg5;
                var11 = arg4;
            } else {
                var11 = class185.field3005;
                var10 = var9 + (class185.field3005 * var8 >> 12);
            }
            int var12;
            int var13;
            if (class406.field6033 > arg2) {
                var12 = class406.field6033;
                var13 = (class406.field6033 * var8 >> 12) + var9;
            } else if (class185.field3005 >= arg2) {
                var12 = arg2;
                var13 = arg3;
            } else {
                var13 = var9 + (class185.field3005 * var8 >> 12);
                var12 = class185.field3005;
            }
            if (class99.field1378 > var13) {
                var13 = class99.field1378;
                var12 = (class99.field1378 - var9 << 12) / var8;
            } else if (class396.field5925 < var13) {
                var13 = class396.field5925;
                var12 = (class396.field5925 - var9 << 12) / var8;
            }
            if (class99.field1378 > var10) {
                var11 = (class99.field1378 - var9 << 12) / var8;
                var10 = class99.field1378;
            } else if (class396.field5925 < var10) {
                var11 = (class396.field5925 - var9 << 12) / var8;
                var10 = class396.field5925;
            }
            class57.method379(var13, (byte) 15, var12, arg1, var10, var11);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 123)
    public final int method796(int arg0, int arg1) {
        if (arg1 != 1797367457) {
            field1476 = 112;
        }
        field1470++;
        int var3 = (this.field1473.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field1473[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1473[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 152)
    public static final int method797(Random arg0, int arg1, int arg2) {
        field1475++;
        if (arg1 > -16) {
            method795(122, -19, -102, 36, -15, 87);
        }
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class326.method2169(-1, arg2)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class142.method1033(var4, true, arg2);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([I)V", line = 183)
    public class105(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1473 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1473[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1473[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field1473[var5 + var5] = arg0[var4];
            this.field1473[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIILe;II)V", line = 219)
    public static final void method798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class312 arg6, int arg7, int arg8) {
        field1471++;
        class149 var9 = (class149) class139.method1016(arg0, arg2, arg1);
        if (var9 != null) {
            class127 var10 = class137.method1003(var9.method197(true), -30796);
            int var11 = var9.method183((byte) -28) & 0x3;
            int var12 = var9.method195(3076);
            if (var10.field2011 == -1) {
                int var13 = arg7;
                if (var10.field2021 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg6.method2085(arg3, (byte) 112, 4, arg4, var13);
                    } else if (var11 == 1) {
                        arg6.method2087(var13, true, arg4, arg3, 4);
                    } else if (var11 == 2) {
                        arg6.method2085(arg3 + 3, (byte) 114, 4, arg4, var13);
                    } else if (var11 == 3) {
                        arg6.method2087(var13, true, arg4 + 3, arg3, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg6.method2086(1, arg3, 1, var13, -765, arg4);
                    } else if (var11 == 1) {
                        arg6.method2086(1, arg3 + 3, 1, var13, -765, arg4);
                    } else if (var11 == 2) {
                        arg6.method2086(1, arg3 + 3, 1, var13, -765, arg4 + 3);
                    } else if (var11 == 3) {
                        arg6.method2086(1, arg3, 1, var13, -765, arg4 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg6.method2087(var13, true, arg4, arg3, 4);
                    } else if (var11 == 1) {
                        arg6.method2085(arg3 + 3, (byte) 118, 4, arg4, var13);
                    } else if (var11 == 2) {
                        arg6.method2087(var13, true, arg4 + 3, arg3, 4);
                    } else if (var11 == 3) {
                        arg6.method2085(arg3, (byte) -127, 4, arg4, var13);
                    }
                }
            } else {
                class316.method2105(arg3, var11, true, arg6, arg4, var10);
            }
        }
        class149 var14 = (class149) class12.method117(arg0, arg2, arg1, field1477 == null ? (field1477 = method799("up")) : field1477);
        if (var14 != null) {
            class127 var15 = class137.method1003(var14.method197(true), -30796);
            int var16 = var14.method183((byte) 107) & 0x3;
            int var17 = var14.method195(3076);
            if (var15.field2011 != -1) {
                class316.method2105(arg3, var16, true, arg6, arg4, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field2021 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg6.method2090(0, arg3 + 3, arg4 + 3, arg3, arg4, var18);
                } else {
                    arg6.method2090(0, arg3 + 3, arg4, arg3, arg4 + 3, var18);
                }
            }
        }
        class149 var19 = (class149) class316.method2107(arg0, arg2, arg1);
        if (var19 != null) {
            class127 var20 = class137.method1003(var19.method197(true), -30796);
            int var21 = var19.method183((byte) 104) & 0x3;
            if (var20.field2011 != -1) {
                class316.method2105(arg3, var21, true, arg6, arg4, var20);
            }
        }
        if (arg8 != 0) {
            method797((Random) null, -104, -115);
        }
    }
}
