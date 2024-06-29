import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class114 extends class283 {

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    private int field1792 = 0;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    private int field1797 = 0;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    private int field1796 = 1;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "Lna;")
    public static class26 field1800 = class69.method505("0", (byte) -125);

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "Li;")
    public static class214 field1789 = new class214(5000);

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "Lna;")
    public static class26 field1801 = class69.method505("<col=40ff00>", (byte) -127);

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "[Lcl;")
    public static class132[] field1802 = new class132[14];

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V", line = 5)
    public static final void method792(int arg0) {
        if (class320.field5503 != null) {
            class22 var1 = class320.field5503;
            synchronized (class320.field5503) {
                class320.field5503 = null;
            }
        }
        field1790++;
        if (arg0 != 0) {
            method796(119, -44, -76, -104, 29, -65, 34, 18, 104);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 21)
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V", line = 26)
    public static void method793(int arg0) {
        field1801 = null;
        if (arg0 != -1771542303) {
            field1802 = (class132[]) null;
        }
        field1802 = null;
        field1800 = null;
        field1789 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I", line = 42)
    public final int[] method8(int arg0, byte arg1) {
        field1795++;
        int[] var3 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var4 = class59.field955[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                int var7 = class13.field184[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field1797 == 0) {
                    var11 = (var7 - var4) * this.field1796;
                } else {
                    int var9 = var8 * var8 + (var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1796 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field1792 == 0) {
                    var12 = class74.field1143[(var12 & 0xFF5) >> 4] + 4096 >> 1;
                } else if (this.field1792 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        int var13 = -64 / ((30 - arg1) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(I)V", line = 113)
    public static final void method794(int arg0) {
        class223.method1490();
        if (arg0 != 22230) {
            method792(124);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class218.field3479[var1].method1531(arg0 - 22230);
        }
        System.gc();
        field1799++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 140)
    public static final Class method795(int arg0, String arg1) throws ClassNotFoundException {
        field1794++;
        if (arg0 != 6092) {
            field1802 = (class132[]) null;
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V", line = 183)
    public final void method130(int arg0) {
        field1798++;
        class321.method2237((byte) -9);
        if (arg0 != 16251) {
            method796(106, -38, 106, 7, -28, -61, 30, -77, -47);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIII)V", line = 218)
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != -101) {
            method792(-46);
        }
        field1791++;
        if (class71.method509(arg1, 104)) {
            class5.method31(arg2, arg8, arg4, class86.field1416[arg1], arg3, -1, arg7, arg6, (byte) 119, arg5);
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class2.field21[var9] = true;
            }
        } else {
            class2.field21[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILwa;Z)V", line = 248)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            this.method130(10);
        }
        field1793++;
        if (arg0 == 0) {
            this.field1797 = arg1.method642((byte) -70);
        } else if (arg0 == 1) {
            this.field1792 = arg1.method642((byte) -119);
        } else if (arg0 == 3) {
            this.field1796 = arg1.method642((byte) -113);
        }
    }
}
