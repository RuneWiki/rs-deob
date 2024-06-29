import jaggl.OpenGL;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class734 extends class539 {

    @OriginalMember(owner = "client!jka", name = "x", descriptor = "I")
    private int field10117 = -1;

    @OriginalMember(owner = "client!jka", name = "A", descriptor = "I")
    private int field10120 = -1;

    @OriginalMember(owner = "client!jka", name = "y", descriptor = "I")
    public int field10118;

    @OriginalMember(owner = "client!jka", name = "B", descriptor = "Loja;")
    public static class124 field10121 = new class124();

    @OriginalMember(owner = "client!jka", name = "J", descriptor = "[B")
    public static byte[] field10129 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!jka", name = "C", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!jka", name = "D", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!jka", name = "E", descriptor = "I")
    public static int field10124;

    @OriginalMember(owner = "client!jka", name = "F", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!jka", name = "I", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!jka", name = "G", descriptor = "Lud;")
    public static class99 field10126;

    @OriginalMember(owner = "client!jka", name = "H", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field10127;

    @OriginalMember(owner = "client!jka", name = "K", descriptor = "[I")
    public static int[] field10130;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "([BB)V", line = 3)
    public static final void method4075(byte[] arg0, byte arg1) {
        ++field10124;
        class511 var2 = new class511(arg0);
        while (true) {
            while (true) {
                int var3 = var2.method3013(6);
                if (~var3 == -1) {
                    if (arg1 != 93) {
                        method4078((byte) 102);
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class551.field7656 = new int[6];
                    var4[0] = var2.method3002(-1);
                    var4[1] = var2.method3002(-1);
                    var4[2] = var2.method3002(-1);
                    var4[3] = var2.method3002(-1);
                    var4[4] = var2.method3002(-1);
                    var4[5] = var2.method3002(-1);
                } else if (~var3 == -5) {
                    int var5 = var2.method3013(78);
                    class454.field6325 = new int[var5];
                    for (int var6 = 0; var5 > var6; ++var6) {
                        class454.field6325[var6] = var2.method3002(class475.method2835(arg1, -94));
                        if (~class454.field6325[var6] == -65536) {
                            class454.field6325[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method3013(-128);
                    class472.field6534 = new int[var7];
                    for (int var8 = 0; ~var8 > ~var7; ++var8) {
                        class472.field6534[var8] = var2.method3002(-1);
                        if (class472.field6534[var8] == 65535) {
                            class472.field6534[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIIII)V", line = 78)
    public static final void method4076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field10125;
        int var6 = arg1 - arg2;
        int var7 = -arg3 + arg4;
        if (var7 != 0) {
            if (var6 == 0) {
                class345.method2178(arg3, arg2, (byte) -80, arg4, arg5);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                boolean var8 = ~var7 > ~var6;
                if (var8) {
                    int var9 = arg3;
                    arg3 = arg2;
                    int var10 = arg4;
                    arg2 = var9;
                    arg4 = arg1;
                    arg1 = var10;
                }
                if (arg4 < arg3) {
                    int var11 = arg3;
                    arg3 = arg4;
                    int var12 = arg2;
                    arg4 = var11;
                    arg2 = arg1;
                    arg1 = var12;
                }
                int var13 = arg2;
                int var14 = -arg3 + arg4;
                if (arg0 != 26387) {
                    field10130 = null;
                }
                int var15 = -arg2 + arg1;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = ~arg1 >= ~arg2 ? -1 : 1;
                if (var8) {
                    for (int var18 = arg3; ~arg4 <= ~var18; ++var18) {
                        class705.field9804[var18][var13] = arg5;
                        var16 += var15;
                        if (~var16 < -1) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg3; ~arg4 <= ~var19; ++var19) {
                        class705.field9804[var13][var19] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class378.method2366(arg2, 39, arg1, arg5, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZILjava/lang/String;Ljava/lang/String;BZ)V", line = 198)
    public static final void method4077(int arg0, boolean arg1, int arg2, String arg3, String arg4, byte arg5, boolean arg6) {
        class75.field841.field4076 = 1;
        ++field10119;
        String var7 = arg4.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (~arg0 != 0) {
            class771 var11 = field10126.method709((byte) 104, arg0);
            if (var11 == null || !var11.method4253((byte) -110) != !arg1) {
                return;
            }
            if (var11.method4253((byte) -69)) {
                var10 = var11.field10604;
            } else {
                var9 = var11.field10602;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class35.field367.field7024; ++var13) {
            class581 var17 = class35.field367.method3051((byte) -20, var13);
            if ((!arg6 || var17.field8200) && var17.field8215 == -1 && var17.field8167 == -1 && var17.field8214 == -1 && var17.field8158 == 0 && var17.field8230.toLowerCase().indexOf(var7) != -1) {
                if (arg0 != -1) {
                    if (arg1) {
                        if (!arg3.equals(var17.method3406(arg0, -93, var10))) {
                            continue;
                        }
                    } else if (var17.method3412(var9, arg0, 1000) != arg2) {
                        continue;
                    }
                }
                if (~var12 <= -251) {
                    class133.field1706 = null;
                    class22.field205 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var18 = new short[var8.length * 2];
                    for (int var19 = 0; ~var19 > ~var12; ++var19) {
                        var18[var19] = var8[var19];
                    }
                    var8 = var18;
                }
                var8[var12++] = (short) var13;
            }
        }
        class133.field1706 = var8;
        class263.field3848 = 0;
        class22.field205 = var12;
        String[] var14 = new String[class22.field205];
        for (int var15 = 0; ~var15 > ~class22.field205; ++var15) {
            var14[var15] = class35.field367.method3051((byte) -20, var8[var15]).field8230;
        }
        int var16 = -26 % ((arg5 - -45) / 42);
        class779.method4293(class133.field1706, var14, Integer.MIN_VALUE);
        class75.field841.method1844((byte) 112);
        class75.field841.field4076 = 2;
    }

    @OriginalMember(owner = "client!jka", name = "c", descriptor = "(B)V", line = 311)
    public static void method4078(byte arg0) {
        field10129 = null;
        field10127 = null;
        if (arg0 >= 20) {
            field10130 = null;
            field10126 = null;
            field10121 = null;
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(I)V", line = 326)
    public final void method1737(int arg0) {
        ++field10122;
        OpenGL.glFramebufferTexture2DEXT(this.field10117, this.field10120, 3553, 0, arg0);
        this.field10117 = -1;
        this.field10120 = -1;
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lpq;IIZ[[I)V", line = 336)
    public class734(class194 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field10118 = arg2;
        super.field7457.method1219((byte) 72, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field7461, arg2, arg2, 0, 32993, super.field7457.field2728, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class68.method525(32993, arg2, arg4[var7], super.field7461, arg2, 34069 - -var7, 0, super.field7457.field2728);
            }
        }
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lpq;II)V", line = 371)
    public class734(class194 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field10118 = arg2;
        super.field7457.method1219((byte) 105, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field7461, arg2, arg2, 0, class648.method3717(super.field7461, false), 5121, (byte[]) null, 0);
        }
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lpq;IIZ[[BI)V", line = 388)
    public class734(class194 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field10118 = arg2;
        super.field7457.method1219((byte) 80, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field7461, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIBII)V", line = 417)
    public final void method4079(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg1, arg3, arg0, super.field7456, arg4);
        ++field10123;
        if (arg2 != 0) {
            method4078((byte) -26);
        }
        this.field10120 = arg3;
        this.field10117 = arg1;
    }
}
