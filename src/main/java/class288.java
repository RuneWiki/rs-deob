import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class288 {

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field4084 = -1;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Z")
    public boolean field4086 = false;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public int field4082 = -1;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public int field4083 = -1;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public int field4098 = 5;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "Z")
    public boolean field4101 = false;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Z")
    public boolean field4091 = false;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public int field4100 = 99;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public int field4111 = -1;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public int field4094 = 2;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "Z")
    public boolean field4109 = false;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public int field4110 = -1;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "[I")
    public static int[] field4085 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4088 = 0;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "Lwg;")
    public class427 field4107;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "Lve;")
    public static class505 field4108;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    public int[] field4081;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "[I")
    public int[] field4087;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "[I")
    public int[] field4092;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "[I")
    public int[] field4093;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "[I")
    private int[] field4104;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "[I")
    public int[] field4105;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "[Z")
    public boolean[] field4106;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "[[I")
    public int[][] field4090;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILrg;)V", line = 9)
    private final void method1832(int arg0, int arg1, class645 arg2) {
        int var4 = -107 / ((-arg0 - 32) / 46);
        if (arg1 == 1) {
            int var17 = arg2.method3712((byte) 86);
            this.field4087 = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                this.field4087[var18] = arg2.method3712((byte) -128);
            }
            this.field4081 = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                this.field4081[var19] = arg2.method3712((byte) 100);
            }
            for (int var20 = 0; var20 < var17; var20++) {
                this.field4081[var20] = (arg2.method3712((byte) 92) << 16) + this.field4081[var20];
            }
        } else if (arg1 == 2) {
            this.field4082 = arg2.method3712((byte) -125);
        } else if (arg1 == 3) {
            this.field4106 = new boolean[256];
            int var15 = arg2.method3745(-6314);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4106[arg2.method3745(-6314)] = true;
            }
        } else if (arg1 == 5) {
            this.field4098 = arg2.method3745(-6314);
        } else if (arg1 == 6) {
            this.field4110 = arg2.method3712((byte) -107);
        } else if (arg1 == 7) {
            this.field4084 = arg2.method3712((byte) 68);
        } else if (arg1 == 8) {
            this.field4100 = arg2.method3745(-6314);
        } else if (arg1 == 9) {
            this.field4083 = arg2.method3745(-6314);
        } else if (arg1 == 10) {
            this.field4111 = arg2.method3745(-6314);
        } else if (arg1 == 11) {
            this.field4094 = arg2.method3745(-6314);
        } else if (arg1 == 12) {
            int var5 = arg2.method3745(-6314);
            this.field4104 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4104[var6] = arg2.method3712((byte) -117);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                this.field4104[var7] += arg2.method3712((byte) 82) << 16;
            }
        } else if (arg1 == 13) {
            int var8 = arg2.method3712((byte) -125);
            this.field4090 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3745(-6314);
                if (var10 > 0) {
                    this.field4090[var9] = new int[var10];
                    this.field4090[var9][0] = arg2.method3747((byte) -74);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field4090[var9][var11] = arg2.method3712((byte) 67);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4101 = true;
        } else if (arg1 == 15) {
            this.field4109 = true;
        } else if (arg1 == 16) {
            this.field4086 = true;
        } else if (arg1 == 18) {
            this.field4091 = true;
        } else if (arg1 == 19) {
            if (this.field4105 == null) {
                this.field4105 = new int[this.field4090.length];
                for (int var14 = 0; var14 < this.field4090.length; var14++) {
                    this.field4105[var14] = 255;
                }
            }
            this.field4105[arg2.method3745(-6314)] = arg2.method3745(-6314);
        } else if (arg1 == 20) {
            if (this.field4092 == null || this.field4093 == null) {
                this.field4092 = new int[this.field4090.length];
                this.field4093 = new int[this.field4090.length];
                for (int var12 = 0; var12 < this.field4090.length; var12++) {
                    this.field4092[var12] = 256;
                    this.field4093[var12] = 256;
                }
            }
            int var13 = arg2.method3745(-6314);
            this.field4092[var13] = arg2.method3712((byte) -113);
            this.field4093[var13] = arg2.method3712((byte) -120);
        }
        field4097++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILrg;)V", line = 211)
    public final void method1833(int arg0, class645 arg1) {
        if (arg0 < 9) {
            return;
        }
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                field4103++;
                return;
            }
            this.method1832(124, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 242)
    public final void method1834(boolean arg0) {
        if (arg0) {
            return;
        }
        field4089++;
        if (this.field4083 == -1) {
            if (this.field4106 == null) {
                this.field4083 = 0;
            } else {
                this.field4083 = 2;
            }
        }
        if (this.field4111 != -1) {
            return;
        }
        if (this.field4106 == null) {
            this.field4111 = 0;
        } else {
            this.field4111 = 2;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lka;IIIBI)Lka;", line = 272)
    public final class473 method1835(class473 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4095++;
        int var7 = this.field4087[arg5];
        int var8 = this.field4081[arg5];
        class253 var9 = this.field4107.method2666(true, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method251((byte) 1, arg3, true);
        }
        class253 var11 = null;
        if ((this.field4109 || class358.field5202) && arg2 != -1 && arg2 < this.field4081.length) {
            int var12 = this.field4081[arg2];
            var11 = this.field4107.method2666(true, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class253 var13 = null;
        class253 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4104 != null) {
            if (this.field4104.length > arg5) {
                var15 = this.field4104[arg5];
                if (var15 != 65535) {
                    var13 = this.field4107.method2666(true, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4109 || class358.field5202) && arg2 != -1 && arg2 < this.field4104.length) {
                var16 = this.field4104[arg2];
                if (var16 != 65535) {
                    var14 = this.field4107.method2666(true, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field4101) {
            arg3 |= 0x200;
        }
        if (var9.method1668(var10, 21665)) {
            arg3 |= 0x80;
        }
        if (var9.method1666(var10, arg4 ^ 0x2AB7)) {
            arg3 |= 0x100;
        }
        if (var9.method1667(var10, false)) {
            arg3 |= 0x400;
        }
        if (arg4 != 100) {
            this.field4084 = -37;
        }
        if (var13 != null) {
            if (var13.method1668(var15, 21665)) {
                arg3 |= 0x80;
            }
            if (var13.method1666(var15, 10963)) {
                arg3 |= 0x100;
            }
            if (var13.method1667(var15, false)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1668(arg2, 21665)) {
                arg3 |= 0x80;
            }
            if (var11.method1666(arg2, 10963)) {
                arg3 |= 0x100;
            }
            if (var11.method1667(arg2, false)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1668(var16, 21665)) {
                arg3 |= 0x80;
            }
            if (var14.method1666(var16, arg4 + 10863)) {
                arg3 |= 0x100;
            }
            if (var14.method1667(var16, false)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        class473 var18 = arg0.method251((byte) 1, var17, true);
        var18.method2854(arg2, var11, var10, arg4 - 100, var7, var9, this.field4101, arg1 - 1, 0);
        if (var13 != null) {
            var18.method2854(var16, var14, var15, arg4 - 100, var7, var13, this.field4101, arg1 - 1, 0);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIIILka;II)Lka;", line = 407)
    public final class473 method1836(int arg0, byte arg1, int arg2, int arg3, int arg4, class473 arg5, int arg6, int arg7) {
        field4096++;
        int var9 = this.field4087[arg6];
        int var10 = this.field4081[arg6];
        class253 var11 = this.field4107.method2666(true, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method251(arg1, arg4, true);
        }
        class253 var13 = null;
        if ((this.field4109 || class358.field5202) && arg0 != -1 && arg0 < this.field4081.length) {
            int var14 = this.field4081[arg0];
            var13 = this.field4107.method2666(true, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field4101) {
            arg4 |= 0x200;
        }
        if (var11.method1668(var12, arg3 + 21633)) {
            arg4 |= 0x80;
        }
        if (var11.method1666(var12, 10963)) {
            arg4 |= 0x100;
        }
        if (var11.method1667(var12, false)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1668(arg0, arg3 + 21633)) {
                arg4 |= 0x80;
            }
            if (var13.method1666(arg0, 10963)) {
                arg4 |= 0x100;
            }
            if (var13.method1667(arg0, false)) {
                arg4 |= 0x400;
            }
        }
        int var15 = arg4 | arg3;
        class473 var16 = arg5.method251(arg1, var15, true);
        var16.method2854(arg0, var13, var12, 0, var9, var11, this.field4101, arg2 - 1, arg7);
        return var16;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 478)
    public static void method1837(byte arg0) {
        field4108 = null;
        field4085 = null;
        if (arg0 >= -49) {
            method1837((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZI)I", line = 532)
    public final int method1838(int arg0, int arg1, boolean arg2, int arg3) {
        field4099++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field4081[arg1];
        class253 var8 = null;
        class253 var9 = this.field4107.method2666(true, var7 >> 16);
        int var10 = var7 & arg0;
        if (var9 == null) {
            return var5;
        }
        if ((this.field4109 || class358.field5202) && arg3 != -1 && this.field4081.length > arg3) {
            int var11 = this.field4081[arg3];
            var8 = this.field4107.method2666(true, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field4101) {
            var5 |= 0x200;
        }
        if (var9.method1668(var10, arg0 - 43870)) {
            var5 |= 0x80;
        }
        if (var9.method1666(var10, 10963)) {
            var5 |= 0x100;
        }
        if (var9.method1667(var10, false)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1668(var6, 21665)) {
                var5 |= 0x80;
            }
            if (var8.method1666(var6, 10963)) {
                var5 |= 0x100;
            }
            if (var8.method1667(var6, false)) {
                var5 |= 0x400;
            }
        }
        if (this.field4104 != null && arg2) {
            if (this.field4104.length > arg1) {
                int var12 = this.field4104[arg1];
                if (var12 != 65535) {
                    class253 var13 = this.field4107.method2666(true, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1668(var14, arg0 ^ 0xAB5E)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1666(var14, 10963)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1667(var14, false)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field4109 || class358.field5202) && arg3 != -1 && this.field4104.length > arg3) {
                int var15 = this.field4104[arg3];
                if (var15 != 65535) {
                    class253 var16 = this.field4107.method2666(true, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1668(var17, 21665)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1666(var17, 10963)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1667(var17, false)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
