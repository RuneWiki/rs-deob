import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class295 extends class144 implements class21 {

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Lvr;")
    public class92 field4323;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Z")
    private boolean field4319;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field4330 = -1;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "Ltn;")
    public static class60 field4336 = new class60(2, 6);

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILza;)V", line = 3)
    public final void method111(int arg0, class290 arg1) {
        ++field4320;
        if (arg0 == -38) {
            this.field4323.method657(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Z", line = 14)
    public final boolean method113(int arg0) {
        ++field4326;
        if (arg0 != 31692) {
            this.field4319 = false;
        }
        return this.field4323.method654((byte) 105);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I", line = 29)
    public final int method110(byte arg0) {
        ++field4324;
        if (arg0 <= 100) {
            this.field4319 = false;
        }
        return this.field4323.field1174;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILdj;Ldj;)V", line = 42)
    public static final void method1814(int arg0, int arg1, int arg2, class232 arg3, class232 arg4) {
        class239 var5 = class104.method713(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3487 = arg3;
            var5.field3473 = arg4;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V", line = 52)
    public final void method115(int arg0) {
        if (arg0 == 16372) {
            ++field4317;
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I", line = 62)
    public final int method114(int arg0) {
        ++field4318;
        return arg0 != -9772 ? 122 : this.field4323.field1154;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Z", line = 74)
    public final boolean method118(byte arg0) {
        ++field4331;
        if (arg0 != 102) {
            this.field4323 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V", line = 85)
    public static void method1815(int arg0) {
        int var1 = -127 % ((12 - arg0) / 56);
        field4336 = null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lza;B)Lkf;", line = 96)
    public final class170 method126(class290 arg0, byte arg1) {
        ++field4321;
        class377 var3 = this.field4323.method662(super.field1899, false, (byte) 125, true, super.field1896, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = arg0.method368();
            var4.method825(super.field1896, super.field1912, super.field1899);
            if (arg1 >= -86) {
                field4330 = -42;
            }
            class170 var5 = null;
            if (this.field4319) {
                var5 = class423.method2509(0, 1);
            }
            if (this.field4323.field1157 != null) {
                class324 var6 = this.field4323.field1157.method2084();
                arg0.method345(var3, var6, var4, var5 != null ? var5.field2475[0] : null, 0);
            } else {
                var3.method1566(var4, var5 != null ? var5.field2475[0] : null, 0);
            }
            this.field4323.method664(var3, true, super.field1898, arg0, true, super.field1911, super.field1907, super.field1902);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILza;I)Z", line = 135)
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field4332;
        class377 var5 = this.field4323.method662(super.field1899, false, (byte) 89, false, super.field1896, arg2, 131072);
        if (var5 == null) {
            return false;
        } else if (arg0 != 3) {
            return false;
        } else {
            class125 var6 = arg2.method368();
            var6.method825(super.field1896, super.field1912, super.field1899);
            return var5.method1586(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 157)
    public static final String method1816(int arg0, int arg1, int arg2, String[] arg3) {
        if (arg0 >= -1) {
            return null;
        } else {
            ++field4339;
            if (arg2 == 0) {
                return "";
            } else if (arg2 == 1) {
                String var4 = arg3[arg1];
                return var4 == null ? "null" : var4.toString();
            } else {
                int var5 = arg1 + arg2;
                int var6 = 0;
                for (int var7 = arg1; var7 < var5; ++var7) {
                    String var11 = arg3[var7];
                    if (var11 == null) {
                        var6 += 4;
                    } else {
                        var6 += var11.length();
                    }
                }
                StringBuffer var8 = new StringBuffer(var6);
                for (int var9 = arg1; ~var9 > ~var5; ++var9) {
                    String var10 = arg3[var9];
                    if (var10 == null) {
                        var8.append("null");
                    } else {
                        var8.append(var10);
                    }
                }
                return var8.toString();
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lza;Lfu;IIIIIZIIIIIII)V", line = 218)
    public class295(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3954 == 1, class132.method842(arg13, (byte) 93, arg12));
        this.field4323 = new class92(arg0, arg1, arg12, arg13, super.field1904, arg3, arg4, arg6, arg7, arg14);
        this.field4319 = arg1.field3957 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILoq;)V", line = 227)
    public static final void method1817(int arg0, class244 arg1) {
        if (arg0 != 16522) {
            field4336 = null;
        }
        ++field4316;
        class256.field3814 = arg1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lza;I)V", line = 239)
    public final void method130(class290 arg0, int arg1) {
        ++field4328;
        class377 var3 = this.field4323.method662(super.field1899, true, (byte) 101, true, super.field1896, arg0, 262144);
        if (var3 != null) {
            this.field4323.method664(var3, false, super.field1898, arg0, true, super.field1911, super.field1907, super.field1902);
        }
        if (arg1 != 0) {
            this.method127((byte) -100);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lza;B)V", line = 256)
    public final void method117(class290 arg0, byte arg1) {
        this.field4323.method653(arg0, -1);
        if (arg1 == -38) {
            ++field4329;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V", line = 267)
    public static final void method1818(int arg0, boolean arg1) {
        if (arg0 != -10942) {
            field4330 = 67;
        }
        ++class505.field7474;
        class61.method498(class43.field491, arg0 + 10943);
        ++field4334;
        for (class489 var2 = (class489) class255.field3763.method2414((byte) -128); var2 != null; var2 = (class489) class255.field3763.method2410((byte) 119)) {
            if (!var2.method2894(arg0 ^ -10942)) {
                var2 = (class489) class255.field3763.method2414((byte) -128);
                if (var2 == null) {
                    break;
                }
            }
            if (~var2.field6835 == -1) {
                class309.method1870(var2, -26349, true, arg1);
            }
        }
        if (class411.field5809 != null) {
            class187.method1190(class411.field5809, 117);
            class411.field5809 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILza;ILge;IZI)V", line = 306)
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 > -71) {
            this.method112(23);
        }
        ++field4322;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I", line = 319)
    public final int method112(int arg0) {
        ++field4325;
        int var2 = -61 / ((-5 - arg0) / 55);
        return this.field4323.field1177;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILjp;)V", line = 329)
    public static final void method1819(int arg0, int arg1, class241 arg2) {
        ++field4335;
        class532.field7804 = false;
        class8.field131 = 0;
        if (arg0 <= 79) {
            field4336 = null;
        }
        class100.method700(arg2, (byte) 121);
        class507.method3026(arg2, (byte) 125);
        if (class532.field7804) {
            System.out.println("---endgpp---");
        }
        if (~arg2.field5665 != ~arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field5665 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZB)V", line = 357)
    public static final void method1820(boolean arg0, byte arg1) {
        ++field4327;
        class322.method1949(14);
        if (class271.method1714(class488.field6832, 10)) {
            ++class119.field1644;
            if (arg1 != 27) {
                method1817(119, (class244) null);
            }
            if (~class119.field1644 <= -51 || arg0) {
                class119.field1644 = 0;
                if (!class498.field7050 && class50.field608 != null) {
                    class61.method498(class23.field301, 1);
                    ++class29.field353;
                    try {
                        class50.field608.method1357(class30.field357.field5663, (byte) 40, class30.field357.field5665, 0);
                        class30.field357.field5665 = 0;
                    } catch (IOException var2) {
                        class498.field7050 = true;
                    }
                }
                class322.method1949(arg1 + -13);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V", line = 391)
    public final void method120(int arg0) {
        if (arg0 != 0) {
            this.method110((byte) -60);
        }
        ++field4338;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)I", line = 410)
    public final int method127(byte arg0) {
        if (arg0 != 86) {
            this.method113(9);
        }
        ++field4337;
        return this.field4323.method656((byte) -66);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILza;I)Le;", line = 423)
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        if (arg0 != 13439) {
            return null;
        } else {
            ++field4333;
            return this.field4323.method662(0, false, (byte) 102, false, 0, arg1, arg2);
        }
    }
}
