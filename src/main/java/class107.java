import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class107 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    private int field1865 = 65000;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lbj;")
    private class55 field1866 = null;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Lbj;")
    private class55 field1873 = null;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1867 = 50;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lni;")
    public static class24 field1868 = new class24(64);

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1879 = 0;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[Z")
    public static boolean[] field1883 = new boolean[100];

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Ljf;")
    public static class229 field1886 = class212.method1457((byte) 117, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Lek;")
    public static class185 field1880;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lwj;")
    public static class219 field1884;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[B")
    public static byte[] field1882;

    @OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field1876++;
        return "Cache:" + this.field1869;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI[BZI)Z", line = 17)
    private final boolean method728(byte arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field1874++;
        class55 var6 = this.field1873;
        synchronized (this.field1873) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if ((long) (arg4 * 6 + 6) > this.field1866.method437(arg0 ^ 0xFFFFAD4B)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1866.method438((long) (arg4 * 6), arg0 - 3);
                    this.field1866.method439(0, class34.field656, 6, false);
                    var7 = (class34.field656[4] & 0xFF << 8) + (((class34.field656[3] & 0xFF) << 16) + (class34.field656[5] & 0xFF));
                    if (var7 <= 0 || this.field1873.method437(21191) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1873.method437(arg0 ^ 0xFFFFAD4B) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                if (arg0 != -116) {
                    method730(41);
                }
                class34.field656[5] = (byte) var7;
                class34.field656[2] = (byte) arg1;
                class34.field656[0] = (byte) (arg1 >> 16);
                class34.field656[4] = (byte) (var7 >> 8);
                class34.field656[3] = (byte) (var7 >> 16);
                int var8 = 0;
                class34.field656[1] = (byte) (arg1 >> 8);
                int var9 = 0;
                this.field1866.method438((long) (arg4 * 6), -98);
                this.field1866.method436(6, arg0 + 115, class34.field656, 0);
                while (true) {
                    if (var8 < arg1) {
                        label138: {
                            int var10 = 0;
                            if (arg3) {
                                this.field1873.method438((long) (var7 * 520), -96);
                                try {
                                    this.field1873.method439(0, class34.field656, 8, false);
                                } catch (EOFException var18) {
                                    break label138;
                                }
                                var10 = (class34.field656[4] & 0xFF << 16) + (class34.field656[5] & 0xFF << 8) + (class34.field656[6] & 0xFF);
                                int var12 = ((class34.field656[2] & 0xFF) << 8) + (class34.field656[3] & 0xFF);
                                int var13 = ((class34.field656[0] & 0xFF) << 8) + (class34.field656[1] & 0xFF);
                                int var14 = class34.field656[7] & 0xFF;
                                if (arg4 != var13 || var9 != var12 || this.field1869 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field1873.method437(21191) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field1873.method437(21191) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg3 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class34.field656[7] = (byte) this.field1869;
                            if (arg1 - var8 <= 512) {
                                var10 = 0;
                            }
                            class34.field656[6] = (byte) var10;
                            class34.field656[2] = (byte) (var9 >> 8);
                            class34.field656[3] = (byte) var9;
                            class34.field656[0] = (byte) (arg4 >> 8);
                            class34.field656[5] = (byte) (var10 >> 8);
                            class34.field656[4] = (byte) (var10 >> 16);
                            var9++;
                            class34.field656[1] = (byte) arg4;
                            this.field1873.method438((long) (var7 * 520), -99);
                            int var15 = arg1 - var8;
                            this.field1873.method436(8, -1, class34.field656, 0);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var7 = var10;
                            this.field1873.method436(var15, arg0 ^ 0x73, arg2, var8);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Ljf;", line = 152)
    public static final class229 method729(int arg0, int arg1) {
        field1877++;
        class229 var2 = class84.method607(arg0 + 82, arg1);
        for (int var3 = var2.method1626(-80) - 3; var3 > 0; var3 -= 3) {
            var2 = class142.method989(new class229[] { var2.method1639((byte) -20, var3, 0), class22.field387, var2.method1625(true, var3) }, -74);
        }
        if (var2.method1626(-115) > 9) {
            return class142.method989(new class229[] { class169.field2938, var2.method1639((byte) -20, var2.method1626(21) - 8, 0), class312.field5252, class89.field1631, var2, class330.field5620 }, arg0 ^ 0xFFFFFF9E);
        } else if (var2.method1626(arg0 + 19) <= arg0) {
            return class142.method989(new class229[] { class158.field2702, var2, class10.field122 }, -125);
        } else {
            return class142.method989(new class229[] { class261.field4528, var2.method1639((byte) -20, var2.method1626(arg0 + 97) - 4, 0), class229.field3937, class89.field1631, var2, class330.field5620 }, -100);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 178)
    public static final void method730(int arg0) {
        field1871++;
        if (arg0 != -463529689 || class312.field5253 == 0) {
            return;
        }
        try {
            if ((++class123.field2171) > 1500) {
                if (class160.field2720 != null) {
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                }
                if (class213.field3652 >= 1) {
                    class312.field5253 = 0;
                    class4.field27 = -5;
                    return;
                }
                class312.field5253 = 1;
                if (class70.field1336 == class315.field5342) {
                    class315.field5342 = class168.field2876;
                } else {
                    class315.field5342 = class70.field1336;
                }
                class213.field3652++;
                class123.field2171 = 0;
            }
            if (class312.field5253 == 1) {
                class193.field3354 = class215.field3689.method1376(class151.field2616, 0, class315.field5342);
                class312.field5253 = 2;
            }
            if (class312.field5253 == 2) {
                if (class193.field3354.field4011 == 2) {
                    throw new IOException();
                }
                if (class193.field3354.field4011 != 1) {
                    return;
                }
                class160.field2720 = new class205((Socket) class193.field3354.field4009, class215.field3689);
                class193.field3354 = null;
                class160.field2720.method1428(22974, class84.field1608.field195, class84.field1608.field174, 0);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                int var1 = class160.field2720.method1435(0);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                if (var1 != 101) {
                    class312.field5253 = 0;
                    class4.field27 = var1;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    return;
                }
                class312.field5253 = 3;
            }
            if (class312.field5253 == 3) {
                if (class160.field2720.method1436(-3616) >= 2) {
                    int var2 = class160.field2720.method1435(0) << 8 | class160.field2720.method1435(0);
                    class323.method2173(arg0 ^ 0x1BA0E6D8, var2);
                    if (class3.field14 == -1) {
                        class312.field5253 = 0;
                        class4.field27 = 6;
                        class160.field2720.method1433((byte) -115);
                        class160.field2720 = null;
                        return;
                    }
                    class312.field5253 = 0;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    class327.method2198(arg0 + 463529686);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class160.field2720 != null) {
                class160.field2720.method1433((byte) -115);
                class160.field2720 = null;
            }
            if (class213.field3652 < 1) {
                if (class70.field1336 == class315.field5342) {
                    class315.field5342 = class168.field2876;
                } else {
                    class315.field5342 = class70.field1336;
                }
                class213.field3652++;
                class312.field5253 = 1;
                class123.field2171 = 0;
            } else {
                class312.field5253 = 0;
                class4.field27 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILbj;Lbj;I)V", line = 508)
    public class107(int arg0, class55 arg1, class55 arg2, int arg3) {
        this.field1865 = arg3;
        this.field1869 = arg0;
        this.field1866 = arg2;
        this.field1873 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 346)
    public static void method731(boolean arg0) {
        field1884 = null;
        field1886 = null;
        field1883 = null;
        field1882 = null;
        field1868 = null;
        field1880 = null;
        if (arg0) {
            field1879 = 84;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[[IZIII)I", line = 368)
    public static final int method732(int arg0, int[][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1875++;
        if (arg2) {
            field1867 = 81;
        }
        int var6 = (128 - arg4) * arg1[arg5][arg0] + arg1[arg5 + 1][arg0] * arg4 >> 7;
        int var7 = (128 - arg4) * arg1[arg5][arg0 + 1] + (arg1[arg5 + 1][arg0 + 1] * arg4) >> 7;
        return (128 - arg3) * var6 + arg3 * var7 >> 7;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[BBI)Z", line = 386)
    public final boolean method733(int arg0, byte[] arg1, byte arg2, int arg3) {
        field1878++;
        class55 var5 = this.field1873;
        synchronized (this.field1873) {
            if (arg2 != -25) {
                return false;
            } else if (arg0 >= 0 && this.field1865 >= arg0) {
                boolean var6 = this.method728((byte) -116, arg0, arg1, true, arg3);
                if (!var6) {
                    var6 = this.method728((byte) -116, arg0, arg1, false, arg3);
                }
                return var6;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)[B", line = 426)
    public final byte[] method734(int arg0, int arg1) {
        field1870++;
        class55 var3 = this.field1873;
        synchronized (this.field1873) {
            try {
                Object var10000;
                if (this.field1866.method437(21191) < (long) (arg1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (arg0 <= 5) {
                    field1880 = (class185) null;
                }
                this.field1866.method438((long) (arg1 * 6), -89);
                this.field1866.method439(0, class34.field656, 6, false);
                int var4 = (class34.field656[5] & 0xFF) + ((class34.field656[3] & 0xFF) << 16) + (class34.field656[4] & 0xFF << 8);
                int var5 = (class34.field656[2] & 0xFF) + ((class34.field656[1] & 0xFF) << 8) + (class34.field656[0] & 0xFF << 16);
                if (var5 < 0 || this.field1865 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 > 0 && this.field1873.method437(21191) / 520L >= (long) var4) {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var8) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1873.method438((long) (var4 * 520), -94);
                        int var9 = var5 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1873.method439(0, class34.field656, var9 + 8, false);
                        int var10 = ((class34.field656[0] & 0xFF) << 8) + (class34.field656[1] & 0xFF);
                        int var11 = (class34.field656[6] & 0xFF) + (class34.field656[4] & 0xFF << 16) + (class34.field656[5] & 0xFF << 8);
                        int var12 = class34.field656[7] & 0xFF;
                        int var13 = (class34.field656[2] & 0xFF << 8) + (class34.field656[3] & 0xFF);
                        if (arg1 != var10 || var7 != var13 || this.field1869 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1873.method437(21191) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var7++;
                        var4 = var11;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var8++] = class34.field656[var14 + 8];
                        }
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }
}
