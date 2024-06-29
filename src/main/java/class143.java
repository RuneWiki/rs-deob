import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class143 extends class412 {

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[B")
    public byte[] field1853;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field1861 = new String[] { method1242(method1241("n]]a\u0004")), method1242(method1241("n]]l\u0004")), method1242(method1241("n]]b\u0004")), method1242(method1241("n]]c\u0004")), method1242(method1241("n]]o\u0004")), method1242(method1241("sK\u001fI")), method1242(method1241("n]]f\u0004")), method1242(method1241("f\u0010]\u000bQ")), method1242(method1241("n]]m\u0004")), method1242(method1241("n]]`\u0004")), method1242(method1241("n]]\u0019EsW\u0007\u001b\u0004")), method1242(method1241("n]]g\u0004")) };

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field1857 = 1406;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[I")
    public static int[] field1851 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "F")
    public static float field1860;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIII)V")
    public final void method1232(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            this.field1852 = arg2 - arg4;
            this.field1850 = arg4;
            this.field1848 = arg3 - arg0;
            this.field1859 = arg0;
            if (arg1 != 5) {
                this.method1236((byte) -102);
            }
            field1855++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1861[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Ldm;")
    public static final class274 method1233(int arg0, int arg1, int arg2, int arg3) {
        try {
            field1854++;
            class274 var4 = null;
            if (arg3 == 0) {
                var4 = class375.method2969((byte) 1, class222.field3215, class60.field916.field11100);
                class669.field9429++;
            }
            if (arg1 == arg3) {
                class792.field11519++;
                var4 = class375.method2969((byte) 1, class234.field3373, class60.field916.field11100);
            }
            var4.field3885.method5082(-128, class537.field7895 + arg2);
            var4.field3885.method5135(class496.field7286.method2604(82, true) ? 1 : 0, (byte) -113);
            var4.field3885.method5143(-15, arg0 + class655.field9286);
            class346.field5032 = arg0;
            class369.field5344 = false;
            class477.field7028 = arg2;
            class236.method1957(12936);
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1861[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[BLjava/io/File;Z)V")
    public static final void method1234(int arg0, byte[] arg1, File arg2, boolean arg3) throws IOException {
        try {
            field1849++;
            DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
            try {
                if (!arg3) {
                    field1860 = -1.1244507F;
                }
                var4.readFully(arg1, 0, arg0);
            } catch (EOFException var6) {
            }
            var4.close();
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1861[6] + arg0 + ',' + (arg1 == null ? field1861[5] : field1861[7]) + ',' + (arg2 == null ? field1861[5] : field1861[7]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)V")
    public final void method1235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field1847++;
            int var8 = 0;
            if (arg3 != arg5) {
                var8 = (arg4 - arg0 << 16) / (arg3 - arg5);
            }
            int var9 = 0;
            if (arg3 != arg6) {
                var9 = (arg1 - arg4 << 16) / (arg6 - arg3);
            }
            int var10 = 0;
            if (arg5 != arg6) {
                var10 = (arg0 - arg1 << 16) / (arg5 - arg6);
            }
            if (arg2 != 1895170224) {
                this.field1850 = -119;
            }
            if (arg5 <= arg3 && arg6 >= arg5) {
                if (arg3 < arg6) {
                    arg1 = arg0 <<= 0x10;
                    if (arg5 < 0) {
                        arg0 -= arg5 * var8;
                        arg1 -= arg5 * var10;
                        arg5 = 0;
                    }
                    arg4 <<= 0x10;
                    if (arg3 < 0) {
                        arg4 -= arg3 * var9;
                        arg3 = 0;
                    }
                    if (arg3 != arg5 && var10 < var8 || arg3 == arg5 && var10 > var9) {
                        arg6 -= arg3;
                        arg3 -= arg5;
                        arg5 = this.field1848 * arg5;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg6--;
                                    if (arg6 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -62, arg5, 0, this.field1853, arg4 >> 16, arg1 >> 16);
                                    arg5 += this.field1848;
                                    arg1 += var10;
                                    arg4 += var9;
                                }
                            }
                            class109.method1033((byte) -67, arg5, 0, this.field1853, arg0 >> 16, arg1 >> 16);
                            arg0 += var8;
                            arg1 += var10;
                            arg5 += this.field1848;
                        }
                    } else {
                        arg6 -= arg3;
                        arg3 -= arg5;
                        arg5 = this.field1848 * arg5;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg6--;
                                    if (arg6 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -121, arg5, 0, this.field1853, arg1 >> 16, arg4 >> 16);
                                    arg5 += this.field1848;
                                    arg4 += var9;
                                    arg1 += var10;
                                }
                            }
                            class109.method1033((byte) -59, arg5, 0, this.field1853, arg1 >> 16, arg0 >> 16);
                            arg5 += this.field1848;
                            arg0 += var8;
                            arg1 += var10;
                        }
                    }
                } else {
                    arg4 = arg0 <<= 0x10;
                    arg1 <<= 0x10;
                    if (arg5 < 0) {
                        arg4 -= arg5 * var10;
                        arg0 -= arg5 * var8;
                        arg5 = 0;
                    }
                    if (arg6 < 0) {
                        arg1 -= arg6 * var9;
                        arg6 = 0;
                    }
                    if (arg5 != arg6 && var10 < var8 || arg5 == arg6 && var8 < var9) {
                        arg3 -= arg6;
                        arg6 -= arg5;
                        arg5 = this.field1848 * arg5;
                        while (true) {
                            arg6--;
                            if (arg6 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -102, arg5, 0, this.field1853, arg0 >> 16, arg1 >> 16);
                                    arg1 += var9;
                                    arg0 += var8;
                                    arg5 += this.field1848;
                                }
                            }
                            class109.method1033((byte) -55, arg5, 0, this.field1853, arg0 >> 16, arg4 >> 16);
                            arg4 += var10;
                            arg0 += var8;
                            arg5 += this.field1848;
                        }
                    } else {
                        arg3 -= arg6;
                        arg6 -= arg5;
                        arg5 = this.field1848 * arg5;
                        while (true) {
                            arg6--;
                            if (arg6 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -99, arg5, 0, this.field1853, arg1 >> 16, arg0 >> 16);
                                    arg5 += this.field1848;
                                    arg0 += var8;
                                    arg1 += var9;
                                }
                            }
                            class109.method1033((byte) -113, arg5, 0, this.field1853, arg4 >> 16, arg0 >> 16);
                            arg4 += var10;
                            arg5 += this.field1848;
                            arg0 += var8;
                        }
                    }
                }
            } else if (arg3 > arg6) {
                if (arg5 >= arg3) {
                    arg0 = arg1 <<= 0x10;
                    if (arg6 < 0) {
                        arg1 -= arg6 * var10;
                        arg0 -= arg6 * var9;
                        arg6 = 0;
                    }
                    arg4 <<= 0x10;
                    if (arg3 < 0) {
                        arg4 -= arg3 * var8;
                        arg3 = 0;
                    }
                    if (var10 <= var9) {
                        arg5 -= arg3;
                        arg3 -= arg6;
                        arg6 = this.field1848 * arg6;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg5--;
                                    if (arg5 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -122, arg6, 0, this.field1853, arg4 >> 16, arg1 >> 16);
                                    arg6 += this.field1848;
                                    arg1 += var10;
                                    arg4 += var8;
                                }
                            }
                            class109.method1033((byte) -64, arg6, 0, this.field1853, arg0 >> 16, arg1 >> 16);
                            arg1 += var10;
                            arg6 += this.field1848;
                            arg0 += var9;
                        }
                    } else {
                        arg5 -= arg3;
                        arg3 -= arg6;
                        arg6 = this.field1848 * arg6;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg5--;
                                    if (arg5 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -118, arg6, 0, this.field1853, arg1 >> 16, arg4 >> 16);
                                    arg4 += var8;
                                    arg6 += this.field1848;
                                    arg1 += var10;
                                }
                            }
                            class109.method1033((byte) -60, arg6, 0, this.field1853, arg1 >> 16, arg0 >> 16);
                            arg6 += this.field1848;
                            arg1 += var10;
                            arg0 += var9;
                        }
                    }
                } else {
                    arg4 = arg1 <<= 0x10;
                    arg0 <<= 0x10;
                    if (arg6 < 0) {
                        arg1 -= arg6 * var10;
                        arg4 -= arg6 * var9;
                        arg6 = 0;
                    }
                    if (arg5 < 0) {
                        arg0 -= arg5 * var8;
                        arg5 = 0;
                    }
                    if (var9 >= var10) {
                        arg3 -= arg5;
                        arg5 -= arg6;
                        arg6 = this.field1848 * arg6;
                        while (true) {
                            arg5--;
                            if (arg5 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -125, arg6, 0, this.field1853, arg4 >> 16, arg0 >> 16);
                                    arg4 += var9;
                                    arg0 += var8;
                                    arg6 += this.field1848;
                                }
                            }
                            class109.method1033((byte) -90, arg6, 0, this.field1853, arg4 >> 16, arg1 >> 16);
                            arg6 += this.field1848;
                            arg4 += var9;
                            arg1 += var10;
                        }
                    } else {
                        arg3 -= arg5;
                        arg5 -= arg6;
                        arg6 = this.field1848 * arg6;
                        while (true) {
                            arg5--;
                            if (arg5 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class109.method1033((byte) -98, arg6, 0, this.field1853, arg0 >> 16, arg4 >> 16);
                                    arg6 += this.field1848;
                                    arg4 += var9;
                                    arg0 += var8;
                                }
                            }
                            class109.method1033((byte) -107, arg6, 0, this.field1853, arg1 >> 16, arg4 >> 16);
                            arg4 += var9;
                            arg6 += this.field1848;
                            arg1 += var10;
                        }
                    }
                }
            } else if (arg5 > arg6) {
                arg0 = arg4 <<= 0x10;
                if (arg3 < 0) {
                    arg4 -= arg3 * var9;
                    arg0 -= arg3 * var8;
                    arg3 = 0;
                }
                arg1 <<= 0x10;
                if (arg6 < 0) {
                    arg1 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var8 < var9 || arg3 == arg6 && var8 > var10) {
                    arg5 -= arg6;
                    arg6 -= arg3;
                    arg3 = this.field1848 * arg3;
                    while (true) {
                        arg6--;
                        if (arg6 < 0) {
                            while (true) {
                                arg5--;
                                if (arg5 < 0) {
                                    return;
                                }
                                class109.method1033((byte) -118, arg3, 0, this.field1853, arg1 >> 16, arg0 >> 16);
                                arg0 += var8;
                                arg1 += var10;
                                arg3 += this.field1848;
                            }
                        }
                        class109.method1033((byte) -89, arg3, 0, this.field1853, arg4 >> 16, arg0 >> 16);
                        arg3 += this.field1848;
                        arg0 += var8;
                        arg4 += var9;
                    }
                } else {
                    arg5 -= arg6;
                    arg6 -= arg3;
                    arg3 = this.field1848 * arg3;
                    while (true) {
                        arg6--;
                        if (arg6 < 0) {
                            while (true) {
                                arg5--;
                                if (arg5 < 0) {
                                    return;
                                }
                                class109.method1033((byte) -76, arg3, 0, this.field1853, arg0 >> 16, arg1 >> 16);
                                arg1 += var10;
                                arg0 += var8;
                                arg3 += this.field1848;
                            }
                        }
                        class109.method1033((byte) -73, arg3, 0, this.field1853, arg0 >> 16, arg4 >> 16);
                        arg0 += var8;
                        arg4 += var9;
                        arg3 += this.field1848;
                    }
                }
            } else {
                arg1 = arg4 <<= 0x10;
                arg0 <<= 0x10;
                if (arg3 < 0) {
                    arg1 -= arg3 * var8;
                    arg4 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg5 < 0) {
                    arg0 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var9 <= var8) {
                    arg6 -= arg5;
                    arg5 -= arg3;
                    arg3 = this.field1848 * arg3;
                    while (true) {
                        arg5--;
                        if (arg5 < 0) {
                            while (true) {
                                arg6--;
                                if (arg6 < 0) {
                                    return;
                                }
                                class109.method1033((byte) -48, arg3, 0, this.field1853, arg0 >> 16, arg4 >> 16);
                                arg0 += var10;
                                arg3 += this.field1848;
                                arg4 += var9;
                            }
                        }
                        class109.method1033((byte) -86, arg3, 0, this.field1853, arg1 >> 16, arg4 >> 16);
                        arg4 += var9;
                        arg3 += this.field1848;
                        arg1 += var8;
                    }
                } else {
                    arg6 -= arg5;
                    arg5 -= arg3;
                    arg3 = this.field1848 * arg3;
                    while (true) {
                        arg5--;
                        if (arg5 < 0) {
                            while (true) {
                                arg6--;
                                if (arg6 < 0) {
                                    return;
                                }
                                class109.method1033((byte) -97, arg3, 0, this.field1853, arg4 >> 16, arg0 >> 16);
                                arg3 += this.field1848;
                                arg0 += var10;
                                arg4 += var9;
                            }
                        }
                        class109.method1033((byte) -126, arg3, 0, this.field1853, arg4 >> 16, arg1 >> 16);
                        arg1 += var8;
                        arg4 += var9;
                        arg3 += this.field1848;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1861[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public final void method1236(byte arg0) {
        try {
            field1845++;
            if (arg0 > -60) {
                method1237((byte) 60, 15);
            }
            int var2 = -1;
            int var3 = this.field1853.length - 8;
            while (var3 > var2) {
                var2++;
                this.field1853[var2] = 0;
                var2++;
                this.field1853[var2] = 0;
                var2++;
                this.field1853[var2] = 0;
                var2++;
                this.field1853[var2] = 0;
                var2++;
                this.field1853[var2] = 0;
                var2++;
                this.field1853[var2] = 0;
                var2++;
                this.field1853[var2] = 0;
                var2++;
                this.field1853[var2] = 0;
            }
            while (this.field1853.length - 1 > var2) {
                var2++;
                this.field1853[var2] = 0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1861[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
    public static final void method1237(byte arg0, int arg1) {
        try {
            class631.field8965 = new int[arg1];
            class774.field11044 = new int[arg1];
            class99.field1344 = new int[arg1];
            field1846++;
            if (arg0 != 127) {
                field1851 = null;
            }
            class742.field10546 = new int[arg1];
            class250.field3575 = new int[arg1];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1861[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)Z")
    public final boolean method1238(int arg0, int arg1, byte arg2) {
        try {
            field1856++;
            if (arg2 != 27) {
                this.field1853 = null;
            }
            return arg0 * arg1 <= this.field1853.length;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1861[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method1239(byte arg0) {
        try {
            field1851 = null;
            if (arg0 != -41) {
                method1239((byte) 4);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1861[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)V")
    public static final void method1240(int arg0, int arg1, int arg2, int arg3) {
        try {
            field1858++;
            if (arg0 != -1) {
                method1233(92, 31, 120, 36);
            }
            class76.field1089 = new byte[arg2][arg1][arg3];
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1861[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lml;II)V")
    public class143(class194 arg0, int arg1, int arg2) {
        try {
            this.field1853 = new byte[arg1 * arg2];
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1861[10] + (arg0 == null ? field1861[5] : field1861[7]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1241(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1242(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
