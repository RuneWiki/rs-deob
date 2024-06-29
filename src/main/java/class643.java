import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class643 {

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
    public int field9330;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "Z")
    public boolean field9320;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "Z")
    public boolean field9317;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "[S")
    public short[] field9327;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public int field9329;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    private int field9322;

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9332 = new String[] { method4715(method4714("l^6P@dQ>\nB%")), method4715(method4714("cJ;\u0012")), method4715(method4714("v\u0011yP\u0001")), method4715(method4714("l^6P8%")), method4715(method4714("l^6P9%")), method4715(method4714("l^6P=%")), method4715(method4714("l^6P>%")), method4715(method4714("l^6P?%")) };

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "Lli;")
    public static class451 field9328 = new class451();

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    private int field9314;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
    private int field9323;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    private int field9324;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    private int field9326;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "Luf;")
    public class471 field9313;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lbd;")
    public static class68 field9316;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "Lhg;")
    public static class718 field9315;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field9331;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZBI)V")
    public final void method4708(boolean arg0, byte arg1, int arg2) {
        try {
            field9325++;
            int var4;
            if (arg0) {
                var4 = 2048;
            } else {
                int var5 = this.field9326 * arg2 / 50 + this.field9322 & 0x7FF;
                int var6 = this.field9323;
                if (var6 == 1) {
                    var4 = (class298.field4704[var5 << 3] >> 4) + 1024;
                } else if (var6 == 3) {
                    var4 = class656.field9486[var5] >> 1;
                } else if (var6 == 4) {
                    var4 = var5 >> 10 << 11;
                } else if (var6 == 2) {
                    var4 = var5;
                } else if (var6 == 5) {
                    var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
                } else {
                    var4 = 2048;
                }
            }
            int var7 = 8 % ((-arg1 - 6) / 54);
            this.field9313.method1835((float) ((this.field9324 * var4 >> 11) + this.field9314) / 2048.0F, (byte) -20);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9332[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lha;IIIIII)V")
    private final void method4709(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg1 <= 38) {
                this.field9320 = false;
            }
            field9321++;
            this.field9313 = arg0.method521(arg3, arg4, arg6, arg2, arg5, 1.0F);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9332[7] + (arg0 == null ? field9332[1] : field9332[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZIIII)V")
    public final void method4710(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field9326 = arg2;
            if (!arg0) {
                this.field9322 = -65;
            }
            this.field9314 = arg1;
            this.field9324 = arg3;
            field9318++;
            this.field9323 = arg4;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9332[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V")
    private final void method4711(boolean arg0) {
        try {
            if (arg0) {
                int var2 = this.field9329;
                if (var2 == 2) {
                    this.field9326 = 2048;
                    this.field9324 = 2048;
                    this.field9323 = 1;
                    this.field9314 = 0;
                } else if (var2 == 3) {
                    this.field9326 = 4096;
                    this.field9314 = 0;
                    this.field9323 = 1;
                    this.field9324 = 2048;
                } else if (var2 == 4) {
                    this.field9323 = 4;
                    this.field9314 = 0;
                    this.field9326 = 2048;
                    this.field9324 = 2048;
                } else if (var2 == 5) {
                    this.field9314 = 0;
                    this.field9323 = 4;
                    this.field9326 = 8192;
                    this.field9324 = 2048;
                } else if (var2 == 12) {
                    this.field9323 = 2;
                    this.field9326 = 2048;
                    this.field9314 = 0;
                    this.field9324 = 2048;
                } else if (var2 == 13) {
                    this.field9314 = 0;
                    this.field9323 = 2;
                    this.field9324 = 2048;
                    this.field9326 = 8192;
                } else if (var2 == 10) {
                    this.field9324 = 512;
                    this.field9326 = 2048;
                    this.field9323 = 3;
                    this.field9314 = 1536;
                } else if (var2 == 11) {
                    this.field9324 = 512;
                    this.field9323 = 3;
                    this.field9314 = 1536;
                    this.field9326 = 4096;
                } else if (var2 == 6) {
                    this.field9323 = 3;
                    this.field9314 = 1280;
                    this.field9324 = 768;
                    this.field9326 = 2048;
                } else if (var2 == 7) {
                    this.field9324 = 768;
                    this.field9326 = 4096;
                    this.field9323 = 3;
                    this.field9314 = 1280;
                } else if (var2 == 8) {
                    this.field9324 = 1024;
                    this.field9326 = 2048;
                    this.field9323 = 3;
                    this.field9314 = 1024;
                } else if (var2 == 9) {
                    this.field9324 = 1024;
                    this.field9326 = 4096;
                    this.field9323 = 3;
                    this.field9314 = 1024;
                } else if (var2 == 14) {
                    this.field9324 = 768;
                    this.field9314 = 1280;
                    this.field9323 = 1;
                    this.field9326 = 2048;
                } else if (var2 == 15) {
                    this.field9314 = 1536;
                    this.field9323 = 1;
                    this.field9324 = 512;
                    this.field9326 = 4096;
                } else if (var2 == 16) {
                    this.field9324 = 256;
                    this.field9323 = 1;
                    this.field9326 = 8192;
                    this.field9314 = 1792;
                } else {
                    this.field9324 = 2048;
                    this.field9314 = 0;
                    this.field9326 = 2048;
                    this.field9323 = 0;
                }
                field9319++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9332[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
    public static final void method4712(int arg0) {
        class156.field1944 = arg0;
        for (int var1 = 0; var1 < class132.field1543; var1++) {
            for (int var2 = 0; var2 < class216.field3296; var2++) {
                if (class734.field10683[arg0][var1][var2] == null) {
                    class734.field10683[arg0][var1][var2] = new class96(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
    protected class643() {
        try {
            if (class656.field9486 == null) {
                class448.method3454(-27366);
            }
            this.method4711(true);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9332[0] + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public static void method4713(int arg0) {
        try {
            field9328 = null;
            field9315 = null;
            field9316 = null;
            field9331 = null;
            if (arg0 > -23) {
                method4713(111);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9332[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lha;Lib;I)V")
    public class643(class66 arg0, class163 arg1, int arg2) {
        try {
            if (class656.field9486 == null) {
                class448.method3454(-27366);
            }
            this.field9330 = arg1.method1455((byte) 62);
            this.field9320 = (this.field9330 & 0x10) != 0;
            this.field9317 = (this.field9330 & 0x8) != 0;
            this.field9330 &= 0x7;
            int var4 = arg1.method1445((byte) 117) << arg2;
            int var5 = arg1.method1445((byte) 102) << arg2;
            int var6 = arg1.method1445((byte) 112) << arg2;
            int var7 = arg1.method1455((byte) 62);
            int var8 = var7 * 2 + 1;
            this.field9327 = new short[var8];
            for (int var9 = 0; var9 < this.field9327.length; var9++) {
                short var10 = (short) arg1.method1445((byte) 113);
                int var11 = var10 >>> 8;
                if (var8 <= var11) {
                    var11 = var8 - 1;
                }
                int var12 = var10 & 0xFF;
                if (var12 > var8 - var11) {
                    var12 = var8 - var11;
                }
                this.field9327[var9] = (short) class544.method4107(var11 << 8, var12);
            }
            int var13 = (var7 << class602.field8828) + class578.field8582;
            int var14 = class172.field2403 == null ? class151.field1862[class750.method5454(arg1.method1445((byte) 106), 13020) & 0xFFFF] : class172.field2403[arg1.method1445((byte) 115)];
            int var15 = arg1.method1455((byte) 62);
            this.field9329 = var15 & 0x1F;
            this.field9322 = var15 & 0xE0 << 3;
            if (this.field9329 != 31) {
                this.method4711(true);
            }
            this.method4709(arg0, 107, var13, var4, var6, var14, var5);
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field9332[0] + (arg0 == null ? field9332[1] : field9332[2]) + ',' + (arg1 == null ? field9332[1] : field9332[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4714(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4715(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
