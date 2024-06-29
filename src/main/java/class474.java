import java.awt.Rectangle;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public abstract class class474 extends class401 {

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "Llj;")
    public class565 field6531;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "[I")
    public static int[] field6522 = new int[13];

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public static int field6526 = 999999;

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "I")
    public static int field6530 = 4;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
    public static int field6529 = 0;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "Lf;")
    public static class702 field6516;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "Lf;")
    public static class702 field6524;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "Z")
    public boolean field6518;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
    public abstract void method1883(int arg0);

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IB)V")
    public static final void method2667(int arg0, byte arg1) {
        field6514++;
        class99.field1386 = 1000000000L / (long) arg0;
        if (arg1 > -45) {
            field6516 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)Z")
    public final boolean method2668(int arg0) {
        if (arg0 == 32512) {
            field6523++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)Z")
    public final boolean method2669(byte arg0) {
        field6527++;
        int var2 = 3 % ((arg0 - 55) / 55);
        return this.field6518;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)Z")
    public abstract boolean method1885(int arg0);

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBIII)V")
    public static final void method2670(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6513++;
        int var5 = 0;
        int var6 = 27 % ((-arg1 - 58) / 45);
        while (class84.field1247 > var5) {
            Rectangle var7 = class596.field8331[var5];
            if ((var7.x + var7.width) > arg4 && var7.x < arg4 + arg0 && (var7.y + var7.height) > arg3 && (arg2 + arg3) > var7.y) {
                class325.field4428[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)V")
    public static void method2671(byte arg0) {
        field6516 = null;
        field6524 = null;
        field6522 = null;
        if (arg0 != -37) {
            method2670(62, (byte) -43, 65, -35, 13);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method2672(boolean arg0, String arg1) {
        field6520++;
        if (arg0) {
            method2672(true, null);
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + (class631.method3536(arg1.charAt(var4), true) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)I")
    public int method1884(byte arg0) {
        if (arg0 >= -109) {
            return -104;
        } else {
            field6528++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lcw;IILcw;)V")
    public abstract void method1881(class164 arg0, int arg1, int arg2, class164 arg3);

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLin;)Lin;")
    public static final class78 method2673(byte arg0, class78 arg1) {
        field6517++;
        if (arg1.field1178 != -1) {
            return class582.method3319((byte) -85, arg1.field1178);
        }
        int var2 = arg1.field1129 >>> 16;
        if (arg0 > -53) {
            return null;
        }
        class325 var3 = new class325(class4.field26);
        for (class685 var4 = (class685) var3.method1950(0); var4 != null; var4 = (class685) var3.method1947((byte) 67)) {
            if (var4.field9776 == var2) {
                return class582.method3319((byte) -101, (int) var4.field5623);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILks;IIIIILda;Lr;III)Lda;")
    public static final class55 method2674(int arg0, int arg1, int arg2, class403 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class55 arg9, class166 arg10, int arg11, int arg12, int arg13) {
        field6525++;
        if (arg9 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg3 != null) {
            int var15 = var14 | arg3.method2353(arg8, -1, false, 65);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = (long) ((arg6 << 24) + (arg11 << 16) + arg2) + ((long) arg5 << 32) + ((long) arg7 << 48);
        class663 var18 = class120.field1658;
        class55 var19;
        synchronized (class120.field1658) {
            var19 = (class55) class120.field1658.method3747((byte) -66, var16);
        }
        if (var19 == null || arg10.method134(var19.method422(), var14) != 0) {
            if (var19 != null) {
                var14 = arg10.method114(var14, var19.method422());
            }
            byte var20;
            if (arg2 == 1) {
                var20 = 9;
            } else if (arg2 == 2) {
                var20 = 12;
            } else if (arg2 == 3) {
                var20 = 15;
            } else if (arg2 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class270 var23 = new class270(var20 * var21 + 1, var21 * 2 * var20 + -var20, 0);
            int var24 = var23.method1640(0, 0, -11602, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class597.field8342[var30] * var27 >> 14;
                    int var32 = class597.field8344[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method1640(var32, 0, arg4 - 24477, var31);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg6 * var34 + arg11 * var35 >> 8);
                short var37 = (short) (((arg5 & 0x380) * var35 + (arg7 & 0x380) * var34 & 0x38000) + ((arg5 & 0x7F) * var35 + (arg7 & 0x7F) * var34 & 0x7F00) + ((arg5 & 0xFC00) * var35 + (arg7 & 0xFC00) * var34 & 0xFC0000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method1643(var24, var25[0][(var38 + 1) % var20], (byte) 1, var37, -13, (byte) -1, var25[0][var38], (short) -1, var36);
                    } else {
                        var23.method1643(var25[var33 - 1][var38], var25[var33 - 1][(var38 + 1) % var20], (byte) 1, var37, -91, (byte) -1, var25[var33][(var38 + 1) % var20], (short) -1, var36);
                        var23.method1643(var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20], (byte) 1, var37, -11, (byte) -1, var25[var33][var38], (short) -1, var36);
                    }
                }
            }
            var19 = arg10.method106(var23, var14, class136.field1928, 64, 768);
            class663 var39 = class120.field1658;
            synchronized (class120.field1658) {
                class120.field1658.method3748(var16, var19, 12537);
            }
        }
        int var40 = arg9.method424();
        int var41 = arg9.method415();
        int var42 = arg9.method420();
        int var43 = arg9.method466();
        class109 var44 = null;
        if (arg3 != null) {
            int var45 = arg3.field5667[arg8];
            var44 = class192.field2727.method3085(0, var45 >> 16);
            arg8 = var45 & 0xFFFF;
        }
        if (arg4 != 12875) {
            return null;
        }
        class55 var46;
        if (var44 == null) {
            var46 = var19.method462((byte) 3, var14, true);
            var46.method425(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method446(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method462((byte) 3, var14, true);
            var46.method425(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method446(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method461(false, var44, arg8);
        }
        if (arg0 != 0) {
            var46.method416(arg0);
        }
        if (arg13 != 0) {
            var46.method445(arg13);
        }
        if (arg1 != 0) {
            var46.method446(0, arg1, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
    public abstract void method1886(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1888(boolean arg0);

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(B)I")
    public final int method2675(byte arg0) {
        field6521++;
        int var2 = 62 % ((46 - arg0) / 47);
        return 1;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)V")
    public static final void method2676(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        if (var3 != null) {
            class706.method3954(var3.field5524);
            if (var3.field5524 != null) {
                var3.field5524 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)V")
    public abstract void method1882(int arg0, int arg1);

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Llj;)V")
    public class474(class565 arg0) {
        this.field6531 = arg0;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBLjava/io/File;[B)V")
    public static final void method2677(int arg0, byte arg1, File arg2, byte[] arg3) throws IOException {
        field6515++;
        if (arg1 != -92) {
            field6516 = null;
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg3, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
