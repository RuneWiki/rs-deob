import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class182 {

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "[Lwp;")
    private class191[] field2514 = null;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "Loea;")
    public class623 field2516 = null;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "[Lwp;")
    public class191[] field2520 = null;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Loea;")
    public class623 field2523 = null;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "Lkd;")
    private class296 field2519;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "Z")
    public boolean field2518;

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2524 = new String[] { method1596(method1595("`zn\u001f|")), method1596(method1595("x0!\u001f=r:)E?3")), method1596(method1595("u!,]")), method1596(method1595("x0!\u001fB3")), method1596(method1595("x0!\u001fC3")), method1596(method1595("x0!\u001f@3")), method1596(method1595("l#7\u001cvo%!")), method1596(method1595("l#7\u001cvo&#")), method1596(method1595("l#7\u001cvo#)A")), method1596(method1595("45}")), method1596(method1595("l#7")), method1596(method1595("x0!\u001fD3")), method1596(method1595("57/\\.wi")), method1596(method1595("s 4A;4{")), method1596(method1595("4$}")), method1596(method1595("x0!\u001fE3")), method1596(method1595("x0!\u001fG3")) };

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Lel;")
    public static class573 field2512 = new class573(84, 1);

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "J")
    public static long field2521;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 5)
    public static final void method1589(int arg0, byte arg1, String arg2) {
        try {
            field2515++;
            if (arg1 != -68) {
                field2517 = 33;
            }
            class313 var3 = class196.method1670((long) arg0, 2, 78);
            var3.method2636((byte) -111);
            var3.field4956 = arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2524[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2524[2] : field2524[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[BLjava/io/File;I)V", line = 19)
    public static final void method1590(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        try {
            field2511++;
            DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
            try {
                var4.readFully(arg1, 0, arg0);
            } catch (EOFException var6) {
            }
            if (arg3 != 16) {
                method1591(28);
            }
            var4.close();
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field2524[15] + arg0 + ',' + (arg1 == null ? field2524[2] : field2524[0]) + ',' + (arg2 == null ? field2524[2] : field2524[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V", line = 41)
    public static void method1591(int arg0) {
        try {
            if (arg0 != -22733) {
                method1592(53);
            }
            field2512 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2524[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lkd;)V", line = 195)
    public class182(class296 arg0) {
        try {
            this.field2519 = arg0;
            this.field2518 = this.field2519.field4592;
            if (this.field2518 && !this.field2519.method861(class172.field2400, (byte) 91, class157.field1952)) {
                this.field2518 = false;
            }
            if (this.field2518 || this.field2519.method855(class157.field1952, class172.field2400, -331365768)) {
                class356.method2915(16);
                if (this.field2518) {
                    byte[] var6 = class14.method102(false, class98.field1101, -1);
                    this.field2516 = this.field2519.method867(6, 16, var6, 128, 128, class172.field2400);
                    byte[] var7 = class14.method102(false, class389.field5872, -1);
                    this.field2519.method867(6, 16, var7, 128, 128, class172.field2400);
                } else {
                    this.field2520 = new class191[16];
                    for (int var2 = 0; var2 < 16; var2++) {
                        byte[] var3 = class786.method5693(var2 * 128 * 128 * 2, 32768, 5, class98.field1101);
                        this.field2520[var2] = this.field2519.method2448(true, true, class172.field2400, 128, var3, 128);
                    }
                    this.field2514 = new class191[16];
                    for (int var4 = 0; var4 < 16; var4++) {
                        byte[] var5 = class786.method5693(var4 * 128 * 2 * 128, 32768, 5, class389.field5872);
                        this.field2514[var4] = this.field2519.method2448(true, true, class172.field2400, 128, var5, 128);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2524[1] + (arg0 == null ? field2524[2] : field2524[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Ljava/lang/String;", line = 71)
    public static final String method1592(int arg0) {
        try {
            field2513++;
            if (arg0 != 16) {
                method1589(80, (byte) -86, null);
            }
            String var1 = field2524[10];
            if (class64.field667 == class338.field5264) {
                var1 = field2524[7];
            } else if (class779.field11332 == class64.field667) {
                var1 = field2524[6];
            } else if (class64.field667 == class524.field7652) {
                var1 = field2524[8];
            }
            String var2 = "";
            if (class335.field5229 != null) {
                var2 = field2524[14] + class335.field5229;
            }
            return field2524[13] + var1 + "." + class447.field6576.field87 + field2524[12] + class167.field2300 + field2524[9] + class676.field9805 + var2 + "/";
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2524[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)Z", line = 102)
    public final boolean method1593(int arg0) {
        try {
            if (this.field2523 == null) {
                if (class318.field5035 == null) {
                    byte[] var2 = class117.method1031(4.0F, 0, 0.5F, 16, 16.0F, 4.0F, 8, 0.6F, 128, new class722(419684), 128);
                    class318.field5035 = class94.method801(var2, false, 136);
                }
                byte[] var3 = class14.method102(false, class318.field5035, -1);
                byte[] var4 = new byte[var3.length * 4];
                int var5 = 0;
                for (int var6 = 0; var6 < 16; var6++) {
                    int var7 = var6 * 128 * 128;
                    int var8 = var7;
                    for (int var9 = 0; var9 < 128; var9++) {
                        int var10 = var8 + (var9 * 128);
                        int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                        int var12 = var8 + ((var9 + 1 & 0x7F) * 128);
                        for (int var13 = 0; var13 < 128; var13++) {
                            float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                            float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                            float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                            var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                            var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                            var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                            var4[var5++] = var3[var7++];
                        }
                    }
                }
                this.field2523 = this.field2519.method867(6, 16, var4, 128, 128, class215.field3276);
            }
            if (arg0 < 89) {
                field2512 = null;
            }
            field2510++;
            return this.field2523 != null;
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field2524[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)Z", line = 181)
    public final boolean method1594(int arg0) {
        try {
            if (arg0 >= -104) {
                return false;
            }
            field2522++;
            if (this.field2518) {
                return this.field2516 != null;
            } else {
                return this.field2520 != null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2524[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1595(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1596(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
