import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class115 extends class190 {

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "Z")
    public boolean field1879;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "[Lbc;")
    public class115[] field1871;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[I")
    public static int[] field1868 = new int[2048];

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field1880 = -2;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Lhe;")
    public static class47 field1881 = new class47();

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field1888 = 0;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "Ljc;")
    public class191 field1882;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lbi;")
    public class27 field1872;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IBI)[[I")
    public final int[][] method789(int arg0, byte arg1, int arg2) {
        if (arg1 != -124) {
            field1880 = -77;
        }
        field1869++;
        if (this.field1871[arg0].field1879) {
            int[] var4 = this.field1871[arg0].method5(arg2, (byte) 122);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1871[arg0].method1(arg2, arg1 + 141);
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public static void method790(int arg0) {
        field1868 = null;
        if (arg0 >= 123) {
            field1881 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
    public final void method791(int arg0, int arg1, int arg2) {
        if (arg0 <= 54) {
            this.field1871 = null;
        }
        int var4 = this.field1874 == 255 ? arg2 : this.field1874;
        if (this.field1879) {
            this.field1872 = new class27(var4, arg2, arg1);
        } else {
            this.field1882 = new class191(var4, arg2, arg1);
        }
        field1873++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)[I")
    public final int[] method792(int arg0, int arg1, int arg2) {
        field1870++;
        if (arg0 != 0) {
            this.field1874 = -3;
        }
        return this.field1871[arg1].field1879 ? this.field1871[arg1].method5(arg2, (byte) 121) : this.field1871[arg1].method1(arg2, 120)[0];
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method793(int arg0, int arg1, int arg2, long arg3) {
        field1883++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        int var7 = (int) arg3 >> 20 & 0x3;
        if (arg2 != 8371) {
            return true;
        }
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class70 var8 = class190.method1232(var6, 13090);
            int var9 = var8.field1029;
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field1059;
                var11 = var8.field1048;
            } else {
                var10 = var8.field1048;
                var11 = var8.field1059;
            }
            if (var7 != 0) {
                var9 = (var9 << var7 & 0xF) + (var9 >> 4 - var7);
            }
            class88.method585(2, var9, arg0, 0, 0, var10, class7.field85.field206[0], true, class7.field85.field219[0], arg1, (byte) 26, var11);
        } else {
            class88.method585(2, 0, arg0, var7, var5 + 1, 0, class7.field85.field206[0], true, class7.field85.field219[0], arg1, (byte) 26, 0);
        }
        class214.field3703 = class9.field97;
        class147.field2555 = 0;
        class163.field2792 = 2;
        class57.field782 = class198.field3422;
        return true;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLnh;I)V")
    public void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 != 107) {
            this.field1872 = null;
        }
        field1878++;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public void method170(int arg0) {
        field1886++;
        if (arg0 != 395462996) {
            this.method207(117);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
    public static final void method794(int arg0, int arg1, int arg2) {
        class187.field3292 = true;
        class243.field4227 = arg0;
        class85.field1334 = arg1;
        class155.field2702 = arg2;
        class4.field43 = -1;
        class255.field4430 = -1;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)[[I")
    public int[][] method1(int arg0, int arg1) {
        if (arg1 < 11) {
            this.field1871 = null;
        }
        field1875++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[I")
    public int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            this.method791(-55, 32, 70);
        }
        field1887++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I")
    public int method207(int arg0) {
        field1884++;
        if (arg0 != -1) {
            this.method208(-18);
        }
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static final void method795(byte arg0) {
        field1876++;
        if (class142.field2505 == 0) {
            return;
        }
        try {
            if (class142.field2505 == 1) {
                if (class13.field118.field57 == 2) {
                    throw new IOException();
                }
                if (class13.field118.field57 != 1) {
                    return;
                }
                class169.field2953 = new class251((Socket) class13.field118.field59, class205.field3559);
                class13.field118 = null;
                class169.field2953.method1650(12398, 0, class87.field1348.field1780, class87.field1348.field1821);
                class112.field1815.field1821 = 0;
                class142.field2505 = 2;
            }
            if (class142.field2505 == 2) {
                if (class179.field3156 != null) {
                    class179.field3156.method1148(255);
                }
                if (class45.field587 != null) {
                    class45.field587.method1148(255);
                }
                int var1 = class169.field2953.method1657(5000);
                if (class179.field3156 != null) {
                    class179.field3156.method1148(255);
                }
                if (class45.field587 != null) {
                    class45.field587.method1148(arg0 + 190);
                }
                if (var1 < 0) {
                    return;
                }
                if (class2.field20 == 1) {
                    if (var1 == 0) {
                        class117.field1909 = 3;
                    } else {
                        class117.field1909 = var1;
                    }
                }
                if (class2.field20 == 2) {
                    if (var1 == 0) {
                        class189.field3297 = 3;
                    } else if (var1 == 21) {
                        class142.field2505 = 3;
                        return;
                    } else {
                        class189.field3297 = var1;
                    }
                }
                if (class2.field20 == 3) {
                    if (var1 == 0) {
                        class223.field3835 = 3;
                    } else {
                        class223.field3835 = var1;
                    }
                }
                class142.field2505 = 0;
                class2.field20 = 0;
                if (class169.field2953 != null) {
                    class169.field2953.method1653(113);
                }
                class169.field2953 = null;
            }
            if (class142.field2505 == 3) {
                int var2 = class169.field2953.method1648(-123);
                if (var2 > 0) {
                    class153.field2655 = new class168[class169.field2953.method1657(5000)];
                    class142.field2505 = 4;
                }
            }
            if (arg0 == 65 && class142.field2505 == 4) {
                int var3 = class169.field2953.method1648(arg0 - 183);
                if (class153.field2655.length * 8 <= var3) {
                    class112.field1815.field1821 = 0;
                    class169.field2953.method1652(-1, class153.field2655.length * 8, class112.field1815.field1780, 0);
                    for (int var4 = 0; var4 < class153.field2655.length; var4++) {
                        class153.field2655[var4] = class80.method532(class112.field1815.method759(52), (byte) 65);
                    }
                    class189.field3297 = 21;
                    class142.field2505 = 0;
                    class2.field20 = 0;
                    if (class169.field2953 != null) {
                        class169.field2953.method1653(-48);
                    }
                    class169.field2953 = null;
                    return;
                }
            }
        } catch (IOException var5) {
            class2.field20 = 0;
            class117.field1909 = 3;
            class223.field3835 = 3;
            class189.field3297 = 3;
            class142.field2505 = 0;
            if (class169.field2953 != null) {
                class169.field2953.method1653(arg0 ^ 0xFFFFFFD8);
            }
            class169.field2953 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public void method208(int arg0) {
        field1877++;
        if (arg0 != 12801) {
            return;
        }
        if (this.field1879) {
            this.field1872.method183((byte) 124);
            this.field1872 = null;
        } else {
            this.field1882.method1235((byte) 108);
            this.field1882 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)I")
    public int method387(int arg0) {
        if (arg0 != -28800) {
            this.method170(-39);
        }
        field1885++;
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IZ)V")
    public class115(int arg0, boolean arg1) {
        this.field1879 = arg1;
        this.field1871 = new class115[arg0];
    }
}
