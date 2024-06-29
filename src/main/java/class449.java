import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class449 extends class529 {

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lhk;")
    private class102 field6955;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public int field6964;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public int field6963;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "Lna;")
    private class211 field6962;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "F")
    public float field6966;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public int field6950;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "[I")
    private int[] field6954;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public int field6959;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Lvo;")
    private class264 field6956;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field6965 = new String[100];

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Ldb;")
    private class67 field6953;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6970;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field6968;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBII)V")
    public final void method2824(int arg0, byte arg1, int arg2, int arg3) {
        field6949++;
        this.field6954[this.field6955.field3755 * arg3 + arg2] = class410.method2621(this.field6954[this.field6955.field3755 * arg3 + arg2], 0x1 << arg0);
        if (arg1 != 97) {
            this.method2831(-15, 123);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IFIIZ)V")
    public final void method2825(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
        field6967++;
        if (this.field6964 != -1) {
            class476 var6 = this.field6962.field7480.method1366(this.field6964, (byte) -127);
            int var7 = var6.field7284 & 0xFF;
            if (var7 != 0 && var6.field7282 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7273 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var12 << 8 & 0xFF00EA) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg1 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF43) >> 8;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            int var20 = (int) ((float) var17 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var18 << 16 | var19 << 8;
        }
        this.field6968.method117(arg0 * 4);
        if (arg4) {
            this.method2829((byte) 64, 0, null);
        }
        this.field6968.method119((byte) (arg2 >> 16));
        this.field6968.method119((byte) (arg2 >> 8));
        this.field6968.method119((byte) arg2);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method2826(byte arg0) {
        field6965 = null;
        if (arg0 != -99) {
            field6965 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IB)V")
    public final void method2827(int arg0, byte arg1) {
        this.field6968.method115();
        if (arg1 < 65) {
            return;
        }
        field6957++;
        class383 var3 = this.field6962.method1502(arg0 * 4, false, this.field6970, 4, -3875);
        this.field6953 = new class67(var3, 5121, 4, 0);
        this.field6968 = null;
        this.field6970 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6952++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg0 - arg4;
        int var12 = arg2 - arg4;
        int var13 = arg0 * arg0;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        if (arg3 != 11417) {
            field6965 = null;
        }
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class103.field1521[arg1];
        class280.method1888(arg7 - arg0, arg7 - var11, (byte) 82, var39, arg6);
        class280.method1888(arg7 - var11, arg7 + var11, (byte) 82, var39, arg5);
        class280.method1888(arg7 + var11, arg0 + arg7, (byte) 82, var39, arg6);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg1 - var9;
            int var42 = arg1 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class280.method1888(var44, var46, (byte) 82, class103.field1521[var41], arg6);
                class280.method1888(var46, var45, (byte) 82, class103.field1521[var41], arg5);
                class280.method1888(var45, var43, (byte) 82, class103.field1521[var41], arg6);
                class280.method1888(var44, var46, (byte) 82, class103.field1521[var42], arg6);
                class280.method1888(var46, var45, (byte) 82, class103.field1521[var42], arg5);
                class280.method1888(var45, var43, (byte) 82, class103.field1521[var42], arg6);
            } else {
                class280.method1888(var44, var43, (byte) 82, class103.field1521[var41], arg6);
                class280.method1888(var44, var43, (byte) 82, class103.field1521[var42], arg6);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI[I)V")
    public final void method2829(byte arg0, int arg1, int[] arg2) {
        field6961++;
        int var4 = 0;
        int var5 = -2 / ((31 - arg0) / 44);
        class302 var6 = this.field6962.field3617;
        var6.field3162 = 0;
        if (this.field6962.field3560) {
            for (int var13 = 0; var13 < arg1; var13++) {
                int var14 = arg2[var13];
                short[] var15 = this.field6955.field1461[var14];
                int var16 = this.field6954[var14];
                if (var16 != 0 && var15 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var15.length > var18) {
                        if ((var16 & 0x1 << var17++) == 0) {
                            var18 += 3;
                        } else {
                            var6.method1437(var15[var18++] & 0xFFFF, 0);
                            var4++;
                            var4++;
                            var6.method1437(var15[var18++] & 0xFFFF, 0);
                            var4++;
                            var6.method1437(var15[var18++] & 0xFFFF, 0);
                        }
                    }
                }
            }
        } else {
            for (int var7 = 0; var7 < arg1; var7++) {
                int var8 = arg2[var7];
                short[] var9 = this.field6955.field1461[var8];
                int var10 = this.field6954[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var12 < var9.length) {
                        if ((var10 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var6.method1467((byte) 23, var9[var12++] & 0xFFFF);
                            var4++;
                            var4++;
                            var6.method1467((byte) 23, var9[var12++] & 0xFFFF);
                            var4++;
                            var6.method1467((byte) 23, var9[var12++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field6956.method747(24519, var6.field3162, var6.field3193, 5123);
        this.field6962.method1548(this.field6953, this.field6955.field1500, this.field6955.field1496, 32886, this.field6955.field1497);
        this.field6962.method1519((this.field6955.field1468 & 0x8) != 0, this.field6964, (this.field6955.field1468 & 0x7) != 0, 26649);
        if (this.field6962.field3574) {
            this.field6962.method1321(Integer.MAX_VALUE, this.field6959, this.field6963, this.field6950);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field6966, 1.0F / this.field6966, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field6962.method1548(this.field6953, this.field6955.field1500, this.field6955.field1496, 32886, this.field6955.field1497);
        this.field6962.method1537(this.field6956, 0, 0, var4, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z")
    public static final boolean method2830(int arg0, int arg1, int arg2) {
        field6951++;
        if (class136.method834((byte) -54, arg2, arg1)) {
            return ~(arg2 & 0xB000) != arg0 | class271.method1834(arg1, arg2, true) | class220.method1607(50, arg2, arg1) ? true : (class542.method3196(arg1, -15252, arg2) | class444.method2811(7971, arg2, arg1)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lhk;IIIII)V")
    public class449(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6955 = arg0;
        this.field6964 = arg1;
        this.field6963 = arg4;
        this.field6962 = this.field6955.field1470;
        this.field6966 = arg2;
        this.field6950 = arg5;
        this.field6954 = new int[this.field6955.field3755 * this.field6955.field3752];
        this.field6959 = arg3;
        this.field6956 = new class264(this.field6962, 5123, null, 1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
    public final void method2831(int arg0, int arg1) {
        if (arg1 <= 47) {
            this.field6959 = -123;
        }
        this.field6970 = this.field6962.field3480.method121(arg0 * 4);
        field6969++;
        this.field6968 = new NativeStream(this.field6970);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
    public final void method2832(int arg0, int arg1) {
        field6971++;
        this.field6968.method117(arg0 * 4 + 3);
        if (arg1 < 56) {
            method2828(-43, 104, -68, 106, -72, 11, -35, 13);
        }
        this.field6968.method119(-1);
    }
}
