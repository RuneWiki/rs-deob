import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class103 {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public int field1826 = -1;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public int field1831 = 512;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field1832 = 0;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
    public boolean field1829 = true;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Z")
    public boolean field1837 = true;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lmu;")
    public static class303 field1825 = new class303(65, -1);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lcea;I)V")
    public final void method945(class215 arg0, int arg1) {
        if (arg1 != -1) {
            this.field1827 = 25;
        }
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                field1824++;
                return;
            }
            this.method946(var3, -4, arg0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILcea;)V")
    private final void method946(int arg0, int arg1, class215 arg2) {
        if (arg0 == 1) {
            this.field1832 = arg2.method1499(-1);
            this.method947(this.field1832, (byte) 117);
        } else if (arg0 == 2) {
            this.field1826 = arg2.method1478(arg1 + 842397948);
            if (this.field1826 == 65535) {
                this.field1826 = -1;
            }
        } else if (arg0 == 3) {
            this.field1831 = arg2.method1478(842397944) << 2;
        } else if (arg0 == 4) {
            this.field1837 = false;
        } else if (arg0 == 5) {
            this.field1829 = false;
        }
        if (arg1 != -4) {
            this.method945(null, 12);
        }
        field1828++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
    private final void method947(int arg0, byte arg1) {
        field1835++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF2B) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1827 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field1830 = (int) (var17 * 256.0D);
        if (this.field1827 < 0) {
            this.field1827 = 0;
        } else if (this.field1827 > 255) {
            this.field1827 = 255;
        }
        if (var17 > 0.5D) {
            this.field1838 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1838 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1830 < 0) {
            this.field1830 = 0;
        } else if (this.field1830 > 255) {
            this.field1830 = 255;
        }
        if (this.field1838 < 1) {
            this.field1838 = 1;
        }
        int var21 = 39 % ((arg1 - 61) / 55);
        this.field1836 = (int) ((double) this.field1838 * var19);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method948(byte arg0) {
        field1825 = null;
        if (arg0 >= -40) {
            method950(-6, -74, -119, null, -35, null, 125, 67, -102);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lha;I)V")
    public static final void method949(class59 arg0, int arg1) {
        field1823++;
        if (class729.field9868.method1272(arg1) == 0) {
            return;
        }
        if (class693.field9368.field4468.method1099(-32350) == 0) {
            for (class54 var2 = (class54) class729.field9868.method1269(4); var2 != null; var2 = (class54) class729.field9868.method1264((byte) 31)) {
                class721.field9801.method154(arg0, var2.field1106, var2.field1107, class214.field3046, var2.field1109 ? class58.field1147.field8181 : null, var2.field1101, false, (byte) 83, arg0, var2.field1108, false, var2.field1104);
                var2.method2314((byte) 29);
            }
            class299.method1955(arg1 - 113);
            return;
        }
        if (class38.field937 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class38.field937 = class416.method2569(true, 0, class528.field7303, 0, var3, class419.field6065);
            class566.field7802 = class38.field937.method216(class650.method3679(class120.field2056, 0, -44, class416.field6026), class267.method1778(class569.field7819, class120.field2056, 0), true);
        }
        for (class54 var4 = (class54) class729.field9868.method1269(arg1 + 4); var4 != null; var4 = (class54) class729.field9868.method1264((byte) 118)) {
            class721.field9801.method154(class38.field937, var4.field1106, var4.field1107, class566.field7802, var4.field1109 ? class58.field1147.field8181 : null, var4.field1101, false, (byte) 83, arg0, var4.field1108, false, var4.field1104);
            var4.method2314((byte) 21);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III[BI[BIII)V")
    public static final void method950(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field1833++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        if (arg2 != 256) {
            field1834 = -63;
        }
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg5[var10001] += arg3[arg1++];
                int var14 = arg7++;
                arg5[var14] += arg3[arg1++];
                int var15 = arg7++;
                arg5[var15] += arg3[arg1++];
                int var16 = arg7++;
                arg5[var16] += arg3[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg5[var10001] += arg3[arg1++];
            }
            arg7 += arg8;
            arg1 += arg0;
        }
    }
}
