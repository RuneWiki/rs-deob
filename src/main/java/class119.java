import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class119 extends class177 {

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    private int field1876 = 0;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    private int field1883 = 4096;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "[S")
    public static short[] field1879 = new short[256];

    @OriginalMember(owner = "client!da", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field1874 = new String[200];

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 3)
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I", line = 13)
    public final int[][] method99(int arg0, int arg1) {
        field1884++;
        if (arg1 != -23387) {
            this.method95(-90, 81);
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, arg0, 27847);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class287.field4415; var11++) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (this.field1876 > var12) {
                    var8[var11] = this.field1876;
                } else if (this.field1883 < var12) {
                    var8[var11] = this.field1883;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field1876) {
                    var10[var11] = this.field1876;
                } else if (var13 > this.field1883) {
                    var10[var11] = this.field1883;
                } else {
                    var10[var11] = var13;
                }
                if (var14 < this.field1876) {
                    var9[var11] = this.field1876;
                } else if (this.field1883 < var14) {
                    var9[var11] = this.field1883;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lhb;II)V", line = 91)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            return;
        }
        field1875++;
        if (arg2 == 0) {
            this.field1876 = arg0.method300(arg1 ^ 0x5319EB83);
        } else if (arg2 == 1) {
            this.field1883 = arg0.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field2649 = arg0.method273(65280) == 1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 135)
    public static final void method922(byte arg0, Component arg1) {
        field1873++;
        arg1.removeMouseListener(class252.field3767);
        arg1.removeMouseMotionListener(class252.field3767);
        arg1.removeFocusListener(class252.field3767);
        if (arg0 == 86) {
            class262.field3882 = 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B[Ljava/lang/String;II[S)V", line = 160)
    public static final void method923(byte arg0, String[] arg1, int arg2, int arg3, short[] arg4) {
        field1881++;
        if (arg0 != 117) {
            method922((byte) -64, (Component) null);
        }
        if (arg2 >= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg2;
        String var7 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var7;
        short var8 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var8;
        for (int var9 = arg2; var9 < arg3; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg1[arg3] = arg1[var6];
        arg1[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var8;
        method923((byte) 117, arg1, arg2, var6 - 1, arg4);
        method923((byte) 117, arg1, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V", line = 217)
    public static void method924(byte arg0) {
        if (arg0 == 41) {
            field1874 = null;
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[I", line = 230)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 >= -52) {
            field1874 = (String[]) null;
        }
        field1878++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -47);
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 0, false);
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                int var6 = var4[var5];
                if (this.field1876 > var6) {
                    var3[var5] = this.field1876;
                } else if (this.field1883 < var6) {
                    var3[var5] = this.field1883;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 272)
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1880++;
        class97 var13 = new class97();
        var13.field1433 = arg10;
        var13.field1435 = arg5;
        var13.field1447 = arg0;
        var13.field1449 = arg3;
        var13.field1439 = arg1;
        var13.field1436 = arg6;
        var13.field1441 = arg4;
        var13.field1434 = arg9;
        var13.field1438 = arg11;
        var13.field1445 = arg12;
        var13.field1443 = arg7;
        if (arg8 < 96) {
            method924((byte) -36);
        }
        var13.field1432 = arg2;
        class294.field4621.method977(4, var13);
    }
}
