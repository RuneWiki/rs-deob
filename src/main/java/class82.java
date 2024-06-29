import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class82 {

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[[I")
    private int[][] field1496;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Llc;")
    public static class143 field1494 = class66.method374("Benutzeroberfl-=che geladen)3", -1);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "D")
    public static double field1487 = -1.0D;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "[[B")
    public static byte[][] field1493;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method468(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1497++;
        if (class47.method289((byte) 45, arg1)) {
            client.method1517(class223.field4045[arg1], -1, arg6, arg3, arg5, arg0, arg4, arg7);
            int var8 = 42 / ((arg2 + 22) / 61);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BB)[B")
    public final byte[] method469(byte[] arg0, byte arg1) {
        if (arg1 > -24) {
            method470((Component) null, -59);
        }
        if (this.field1496 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg0.length * (long) this.field1500 / (long) this.field1495) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1496[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1500 + var4;
                int var14 = var13 / this.field1495;
                var4 = var13 - this.field1495 * var14;
                var3 += var14;
            }
            arg0 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field1489++;
        return arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method470(Component arg0, int arg1) {
        field1491++;
        arg0.removeKeyListener(class229.field4189);
        if (arg1 != -2) {
            field1494 = null;
        }
        arg0.removeFocusListener(class229.field4189);
        class134.field2353 = -1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    public final int method471(int arg0, int arg1) {
        if (arg1 != 14) {
            this.method473(63, -28);
        }
        if (this.field1496 != null) {
            arg0 = (int) ((long) this.field1500 * (long) arg0 / (long) this.field1495);
        }
        field1492++;
        return arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method472(int arg0) {
        field1488++;
        if (class107.field1893 == 0) {
            return;
        }
        if (arg0 != -1) {
            method470((Component) null, -100);
        }
        try {
            if ((++class184.field3344) > 1500) {
                if (class17.field298 != null) {
                    class17.field298.method1682(1);
                    class17.field298 = null;
                }
                if (class289.field5068 >= 1) {
                    class105.field1857 = -5;
                    class107.field1893 = 0;
                    return;
                }
                if (class80.field1455 == class49.field945) {
                    class49.field945 = class57.field1108;
                } else {
                    class49.field945 = class80.field1455;
                }
                class107.field1893 = 1;
                class289.field5068++;
                class184.field3344 = 0;
            }
            if (class107.field1893 == 1) {
                class126.field2233 = class4.field62.method461(class164.field2940, class49.field945, (byte) -46);
                class107.field1893 = 2;
            }
            if (class107.field1893 == 2) {
                if (class126.field2233.field3241 == 2) {
                    throw new IOException();
                }
                if (class126.field2233.field3241 != 1) {
                    return;
                }
                class17.field298 = new class255((Socket) class126.field2233.field3239, class4.field62);
                class126.field2233 = null;
                class17.field298.method1685(class285.field5010.field3465, class285.field5010.field3487, false, 0);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(0);
                }
                int var1 = class17.field298.method1679(false);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(0);
                }
                if (var1 != 101) {
                    class105.field1857 = var1;
                    class107.field1893 = 0;
                    class17.field298.method1682(1);
                    class17.field298 = null;
                    return;
                }
                class107.field1893 = 3;
            }
            if (class107.field1893 == 3 && class17.field298.method1681((byte) -123) >= 2) {
                int var2 = class17.field298.method1679(false) << 8 | class17.field298.method1679(false);
                class225.method1545(100, var2);
                if (class23.field380 == -1) {
                    class105.field1857 = 6;
                    class107.field1893 = 0;
                    class17.field298.method1682(arg0 + 2);
                    class17.field298 = null;
                } else {
                    class107.field1893 = 0;
                    class17.field298.method1682(1);
                    class17.field298 = null;
                    class146.method944(false);
                }
            }
        } catch (IOException var3) {
            if (class17.field298 != null) {
                class17.field298.method1682(arg0 + 2);
                class17.field298 = null;
            }
            if (class289.field5068 >= 1) {
                class107.field1893 = 0;
                class105.field1857 = -4;
            } else {
                class184.field3344 = 0;
                class107.field1893 = 1;
                if (class80.field1455 == class49.field945) {
                    class49.field945 = class57.field1108;
                } else {
                    class49.field945 = class80.field1455;
                }
                class289.field5068++;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)I")
    public final int method473(int arg0, int arg1) {
        if (this.field1496 != null) {
            arg0 = (int) ((long) this.field1500 * (long) arg0 / (long) this.field1495) + 6;
        }
        if (arg1 != 6) {
            method474((class7) null, (byte) -111);
        }
        field1498++;
        return arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lgf;B)Z")
    public static final boolean method474(class7 arg0, byte arg1) {
        field1499++;
        if (arg1 != -80) {
            method468(45, 39, (byte) 26, -10, -84, -6, -41, -10);
        }
        return arg0.method40(class49.field959, 124);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static void method475(int arg0) {
        if (arg0 != -2) {
            field1494 = null;
        }
        field1493 = null;
        field1494 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(II)V")
    public class82(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class153.method1014(arg1, false, arg0);
            int var4 = arg0 / var3;
            this.field1495 = var4;
            this.field1496 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field1500 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field1496[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
