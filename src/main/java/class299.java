import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class299 extends class27 {

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field4476 = 0;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    private int field4463 = 1;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    private int field4474 = 0;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Z")
    public static boolean field4468 = false;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[Z")
    public static boolean[] field4472 = new boolean[8];

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "S")
    public static short field4470 = 32767;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field4473 = -1;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "Z")
    public static boolean field4475 = true;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "[Lsb;")
    public static class190[] field4478 = new class190[2048];

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(III)V", line = 4)
    public static final void method2120(int arg0, int arg1, int arg2) {
        field4467++;
        if (arg1 == 256) {
            class73.field1073 = class73.field1070[arg2][arg0].field90;
            class261.field3940 = class73.field1070[arg2][arg0].field81;
            class203.field2995 = class73.field1070[arg2][arg0].field74;
            class222.method1625((float) class73.field1073, (float) class261.field3940, (float) class203.field2995);
        }
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V", line = 18)
    public static final void method2121(int arg0) {
        field4480++;
        for (int var1 = arg0; var1 < class166.field2384; var1++) {
            int var2 = class215.field3158[var1];
            class181 var3 = class300.field4495[var2];
            if (var3 != null) {
                class122.method908(-30927, var3, var3.field2609.field3083);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V", line = 45)
    public static final void method2122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4465++;
        int var6 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg1);
        if (arg2 != 26384) {
            return;
        }
        int var7 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg4);
        int var8 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg5);
        int var9 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg3);
        for (int var10 = var6; var10 <= var7; var10++) {
            class329.method2285(var8, class274.field4158[var10], (byte) -81, var9, arg0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 72)
    public final void method22(int arg0) {
        class172.method1206(28820);
        field4466++;
        if (arg0 > -63) {
            field4473 = 111;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 83)
    public static final void method2123(boolean arg0, byte arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field4464++;
        int var4 = 0;
        short[] var5 = new short[16];
        if (arg1 != 61) {
            field4468 = false;
        }
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class321.field4837 : class122.field1732) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class308 var9 = class192.method1385(arg1 - 45, var8);
            if (var9.field4614 && var9.method2162((byte) 69).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class334.field5205 = -1;
                    class262.field3981 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var8;
            }
        }
        class130.field1882 = 0;
        class262.field3981 = var5;
        class334.field5205 = var4;
        String[] var12 = new String[class334.field5205];
        for (int var13 = 0; var13 < class334.field5205; var13++) {
            var12[var13] = class192.method1385(69, var5[var13]).method2162((byte) 114);
        }
        class37.method274((byte) 82, class262.field3981, var12);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[I", line = 157)
    public final int[] method18(int arg0, byte arg1) {
        field4477++;
        int[] var3 = this.field375.method2087(arg1 ^ 0x5, arg0);
        if (this.field375.field4382) {
            int var4 = class215.field3175[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class209.field3053; var6++) {
                int var7 = class251.field3721[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field4476 == 0) {
                    var11 = (var7 - var4) * this.field4463;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field4463 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field4474 == 0) {
                    var12 = class16.field270[(var12 & 0xFFF) >> 4] + 4096 >> 1;
                } else if (this.field4474 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1 != -62) {
            this.field4474 = 87;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 232)
    public class299() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V", line = 242)
    public static void method2124(int arg0) {
        if (arg0 != -1760) {
            field4478 = (class190[]) null;
        }
        field4478 = null;
        field4472 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZB)V", line = 253)
    public static final void method2125(boolean arg0, byte arg1) {
        if (arg1 != -93) {
            return;
        }
        field4469++;
        byte[][] var2;
        byte var3;
        if (class141.field2031 && arg0) {
            var2 = class219.field3275;
            var3 = 1;
        } else {
            var2 = class333.field5155;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class32.method228(arg1 + 93);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class255.field3815[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3355FAB) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0x3FFE) >> 3;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class85.field1201.length; var13++) {
                                if (class85.field1201[var13] == var12 && var2[var13] != null) {
                                    class307.method2160(var9, arg0, var5 * 8, var8, (var11 & 0x7) * 8, (var10 & 0x7) * 8, var2[var13], var6 * 8, var4, class92.field1269, arg1 ^ 0xFFFFFFAB);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILnf;IILjava/awt/Component;)Ltl;", line = 366)
    public static final class64 method2126(int arg0, class61 arg1, int arg2, int arg3, Component arg4) {
        field4471++;
        if (class56.field812 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class64 var5 = (class64) Class.forName("kl").getDeclaredConstructor().newInstance();
                var5.field946 = arg0;
                var5.field931 = new int[(class193.field2808 ? 2 : 1) * 256];
                var5.method520(arg4);
                var5.field952 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field952 > 16384) {
                    var5.field952 = 16384;
                }
                var5.method528(var5.field952);
                if (class240.field3575 > 0 && class148.field2129 == null) {
                    class148.field2129 = new class147();
                    class148.field2129.field2118 = arg1;
                    arg1.method490(2, class240.field3575, class148.field2129);
                }
                if (class148.field2129 != null) {
                    if (class148.field2129.field2113[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class148.field2129.field2113[arg3] = var5;
                }
                return var5;
            } catch (Throwable var11) {
                try {
                    class339 var7 = new class339(arg1, arg3);
                    var7.field931 = new int[(class193.field2808 ? 2 : 1) * 256];
                    var7.field946 = arg0;
                    int var8 = -110 % ((-arg2 - 61) / 51);
                    var7.method520(arg4);
                    var7.field952 = 16384;
                    var7.method528(var7.field952);
                    if (class240.field3575 > 0 && class148.field2129 == null) {
                        class148.field2129 = new class147();
                        class148.field2129.field2118 = arg1;
                        arg1.method490(2, class240.field3575, class148.field2129);
                    }
                    if (class148.field2129 != null) {
                        if (class148.field2129.field2113[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class148.field2129.field2113[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var10) {
                    return new class64();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILsb;I)V", line = 446)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field4479++;
        if (arg0 != -5836) {
            field4472 = (boolean[]) null;
        }
        if (arg2 == 0) {
            this.field4476 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field4474 = arg1.method1319(255);
        } else if (arg2 == 3) {
            this.field4463 = arg1.method1319(arg0 + 6091);
        }
    }
}
